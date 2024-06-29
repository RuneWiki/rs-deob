import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class463 {
   @OriginalMember(
      owner = "client!jc",
      name = "b",
      descriptor = "Ljava/awt/GraphicsDevice;"
   )
   private GraphicsDevice field6969;
   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6970 = new String[]{method3464(method3463(":GfUE\u0011Z\"\u0007N\n[p\u001b\u000b\nA\"\u0016D\f\\g\u0016_^\\g\u0006D\u0012[v\u001cD\u0010\u000f")), method3464(method3463("\bOn\u001cO")), method3464(method3463("\r[l[J\tZ,\"B\u0010\u001d02Y\u001f^j\u001cH\rjg\u0003B\u001dK"))};
   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "Ljava/awt/DisplayMode;"
   )
   private DisplayMode field6968;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(ZLjava/awt/Frame;)V",
      line = 10
   )
   private final void method3462(boolean arg0, Frame arg1) {
      boolean var3 = false;

      try {
         Field var4 = Class.forName(field6970[2]).getDeclaredField(field6970[1]);
         var4.setAccessible(arg0);
         boolean var5 = (Boolean)var4.get(this.field6969);
         if (var5) {
            var4.set(this.field6969, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var17) {
      }

      try {
         this.field6969.setFullScreenWindow(arg1);
      } finally {
         if (var3) {
            try {
               Field var10 = Class.forName(field6970[2]).getDeclaredField(field6970[1]);
               var10.set(this.field6969, Boolean.TRUE);
            } catch (Throwable var16) {
            }
         }

      }

   }

   @OriginalMember(
      owner = "client!jc",
      name = "enter",
      descriptor = "(Ljava/awt/Frame;IIII)V",
      line = 51
   )
   public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field6968 = this.field6969.getDisplayMode();
      if (this.field6968 == null) {
         throw new NullPointerException();
      } else {
         arg0.setUndecorated(true);
         arg0.enableInputMethods(false);
         this.method3462(true, arg0);
         if (~arg4 == -1) {
            int var6 = this.field6968.getRefreshRate();
            DisplayMode[] var7 = this.field6969.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && var7[var9].getBitDepth() == arg3) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || Math.abs(-var6 + var10) < Math.abs(arg4 - var6)) {
                     arg4 = var10;
                     var8 = true;
                  }
               }
            }

            if (!var8) {
               arg4 = var6;
            }
         }

         this.field6969.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "exit",
      descriptor = "()V",
      line = 113
   )
   public final void exit() {
      if (this.field6968 != null) {
         this.field6969.setDisplayMode(this.field6968);
         if (!this.field6969.getDisplayMode().equals(this.field6968)) {
            throw new RuntimeException(field6970[0]);
         }

         this.field6968 = null;
      }

      this.method3462(true, (Frame)null);
   }

   @OriginalMember(
      owner = "client!jc",
      name = "listmodes",
      descriptor = "()[I",
      line = 136
   )
   public final int[] listmodes() {
      DisplayMode[] var1 = this.field6969.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; ~var3 > ~var1.length; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) + 1] = var1[var3].getHeight();
         var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
         var2[(var3 << 2) - -3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "<init>",
      descriptor = "()V",
      line = 155
   )
   public class463() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field6969 = var1.getDefaultScreenDevice();
      if (!this.field6969.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; ~var3.length < ~var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this.field6969 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
