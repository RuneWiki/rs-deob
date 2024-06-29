import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class611 {
   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "Ljava/awt/GraphicsDevice;"
   )
   private GraphicsDevice field8698;
   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8700 = new String[]{method4502(method4501("32\u001fj<73_\u00134.tC\u0003/!7\u0019->3\u0003\u001424#\"")), method4502(method4501("6&\u001d-9")), method4502(method4501("\u0004.\u0015d3/3Q6842\u0003*}4(Q'225\u0014')`5\u001472,2\u0005-2.f"))};
   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "Ljava/awt/DisplayMode;"
   )
   private DisplayMode field8699;

   @OriginalMember(
      owner = "client!tca",
      name = "listmodes",
      descriptor = "()[I"
   )
   public final int[] listmodes() {
      DisplayMode[] var1 = this.field8698.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; ~var1.length < ~var3; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) + 1] = var1[var3].getHeight();
         var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
         var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "enter",
      descriptor = "(Ljava/awt/Frame;IIII)V"
   )
   public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field8699 = this.field8698.getDisplayMode();
      if (this.field8699 == null) {
         throw new NullPointerException();
      } else {
         arg0.setUndecorated(true);
         arg0.enableInputMethods(false);
         this.method4500(arg0, (byte)60);
         if (~arg4 == -1) {
            int var6 = this.field8699.getRefreshRate();
            DisplayMode[] var7 = this.field8698.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var7.length > var9; ++var9) {
               if (var7[var9].getWidth() == arg1 && var7[var9].getHeight() == arg2 && var7[var9].getBitDepth() == arg3) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || Math.abs(-var6 + var10) < Math.abs(-var6 + arg4)) {
                     var8 = true;
                     arg4 = var10;
                  }
               }
            }

            if (!var8) {
               arg4 = var6;
            }
         }

         this.field8698.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "exit",
      descriptor = "()V"
   )
   public final void exit() {
      if (this.field8699 != null) {
         this.field8698.setDisplayMode(this.field8699);
         if (!this.field8698.getDisplayMode().equals(this.field8699)) {
            throw new RuntimeException(field8700[2]);
         }

         this.field8699 = null;
      }

      this.method4500((Frame)null, (byte)89);
   }

   @OriginalMember(
      owner = "client!tca",
      name = "<init>",
      descriptor = "()V"
   )
   public class611() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field8698 = var1.getDefaultScreenDevice();
      if (!this.field8698.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; ~var3.length < ~var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this.field8698 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Ljava/awt/Frame;B)V"
   )
   private final void method4500(Frame arg0, byte arg1) {
      boolean var3 = false;
      if (arg1 <= 50) {
         this.field8698 = (GraphicsDevice)null;
      }

      try {
         Field var4 = Class.forName(field8700[0]).getDeclaredField(field8700[1]);
         var4.setAccessible(true);
         boolean var5 = (Boolean)var4.get(this.field8698);
         if (var5) {
            var4.set(this.field8698, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var17) {
      }

      try {
         this.field8698.setFullScreenWindow(arg0);
      } finally {
         if (var3) {
            try {
               Field var10 = Class.forName(field8700[0]).getDeclaredField(field8700[1]);
               var10.set(this.field8698, Boolean.TRUE);
            } catch (Throwable var16) {
            }
         }

      }

   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4501(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4502(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
