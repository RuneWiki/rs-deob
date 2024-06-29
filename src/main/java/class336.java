import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class336 {
   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "Ljava/awt/GraphicsDevice;"
   )
   private GraphicsDevice field4606;
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4607 = new String[]{method2663(method2662("S(tD\u007f")), method2663(method2662("V<v\u0003zR=6zrKz*jiD9pDxV\r}[rF,")), method2663(method2662("a |\ruJ=8_~Q<jC;Q&8NtW;}No\u0005;}^tI<lDtKh"))};
   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "Ljava/awt/DisplayMode;"
   )
   private DisplayMode field4605;

   @OriginalMember(
      owner = "client!pi",
      name = "exit",
      descriptor = "()V"
   )
   public final void exit() {
      if (this.field4605 != null) {
         this.field4606.setDisplayMode(this.field4605);
         if (!this.field4606.getDisplayMode().equals(this.field4605)) {
            throw new RuntimeException(field4607[2]);
         }

         this.field4605 = null;
      }

      this.method2661((Frame)null, -1);
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)V"
   )
   private final void method2661(Frame arg0, int arg1) {
      if (arg1 != -1) {
         this.listmodes();
      }

      boolean var3 = false;

      try {
         Field var4 = Class.forName(field4607[1]).getDeclaredField(field4607[0]);
         var4.setAccessible(true);
         boolean var5 = (Boolean)var4.get(this.field4606);
         if (var5) {
            var4.set(this.field4606, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var17) {
      }

      try {
         this.field4606.setFullScreenWindow(arg0);
      } finally {
         if (var3) {
            try {
               Field var10 = Class.forName(field4607[1]).getDeclaredField(field4607[0]);
               var10.set(this.field4606, Boolean.TRUE);
            } catch (Throwable var16) {
            }
         }

      }

   }

   @OriginalMember(
      owner = "client!pi",
      name = "enter",
      descriptor = "(Ljava/awt/Frame;IIII)V"
   )
   public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field4605 = this.field4606.getDisplayMode();
      if (this.field4605 == null) {
         throw new NullPointerException();
      } else {
         arg0.setUndecorated(true);
         arg0.enableInputMethods(false);
         this.method2661(arg0, -1);
         if (arg4 == 0) {
            int var6 = this.field4605.getRefreshRate();
            DisplayMode[] var7 = this.field4606.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                     var8 = true;
                     arg4 = var10;
                  }
               }
            }

            if (!var8) {
               arg4 = var6;
            }
         }

         this.field4606.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "listmodes",
      descriptor = "()[I"
   )
   public final int[] listmodes() {
      DisplayMode[] var1 = this.field4606.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; var1.length > var3; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) - -1] = var1[var3].getHeight();
         var2[(var3 << 2) - -2] = var1[var3].getBitDepth();
         var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "<init>",
      descriptor = "()V"
   )
   public class336() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field4606 = var1.getDefaultScreenDevice();
      if (!this.field4606.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; ~var3.length < ~var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this.field4606 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2662(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2663(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
