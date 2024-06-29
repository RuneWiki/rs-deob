import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class371 {
   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "Ljava/awt/GraphicsDevice;"
   )
   private GraphicsDevice field5518;
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5519 = new String[]{method2906(method2905("\u007f'1zPT:u([O;'4\u001eO!u9QI<09J\u001b<0)QW;!3QUo")), method2906(method2905("H;;t_L:{\rWU}g\u001dLZ>=3]H\n0,WX+")), method2906(method2905("M/93Z"))};
   @OriginalMember(
      owner = "client!km",
      name = "b",
      descriptor = "Ljava/awt/DisplayMode;"
   )
   private DisplayMode field5517;

   @OriginalMember(
      owner = "client!km",
      name = "enter",
      descriptor = "(Ljava/awt/Frame;IIII)V"
   )
   public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field5517 = this.field5518.getDisplayMode();
      if (this.field5517 == null) {
         throw new NullPointerException();
      } else {
         arg0.setUndecorated(true);
         arg0.enableInputMethods(false);
         this.method2904(0, arg0);
         if (arg4 == 0) {
            int var6 = this.field5517.getRefreshRate();
            DisplayMode[] var7 = this.field5518.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var7.length > var9; ++var9) {
               if (arg1 == var7[var9].getWidth() && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || ~Math.abs(-var6 + var10) > ~Math.abs(-var6 + arg4)) {
                     arg4 = var10;
                     var8 = true;
                  }
               }
            }

            if (!var8) {
               arg4 = var6;
            }
         }

         this.field5518.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "listmodes",
      descriptor = "()[I"
   )
   public final int[] listmodes() {
      DisplayMode[] var1 = this.field5518.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; ~var1.length < ~var3; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) - -1] = var1[var3].getHeight();
         var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
         var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!km",
      name = "exit",
      descriptor = "()V"
   )
   public final void exit() {
      if (this.field5517 != null) {
         this.field5518.setDisplayMode(this.field5517);
         if (!this.field5518.getDisplayMode().equals(this.field5517)) {
            throw new RuntimeException(field5519[0]);
         }

         this.field5517 = null;
      }

      this.method2904(0, (Frame)null);
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)V"
   )
   private final void method2904(int arg0, Frame arg1) {
      boolean var3 = false;
      if (arg0 != 0) {
         this.field5517 = (DisplayMode)null;
      }

      try {
         Field var4 = Class.forName(field5519[1]).getDeclaredField(field5519[2]);
         var4.setAccessible(true);
         boolean var5 = (Boolean)var4.get(this.field5518);
         if (var5) {
            var4.set(this.field5518, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var17) {
      }

      try {
         this.field5518.setFullScreenWindow(arg1);
      } finally {
         if (var3) {
            try {
               Field var10 = Class.forName(field5519[1]).getDeclaredField(field5519[2]);
               var10.set(this.field5518, Boolean.TRUE);
            } catch (Throwable var16) {
            }
         }

      }

   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "()V"
   )
   public class371() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field5518 = var1.getDefaultScreenDevice();
      if (!this.field5518.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; ~var3.length < ~var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this.field5518 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
