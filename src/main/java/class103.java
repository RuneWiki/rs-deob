import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class103 {
   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "Ljava/awt/GraphicsDevice;"
   )
   private GraphicsDevice field1318;
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1319 = new String[]{method927(method926("&\u0018^l1")), method927(method926("#\f\\+4'\r\u001cR<>J\u0000B'1\tZl6#=Ws<3\u001c")), method927(method926("\u0014\u0010V%;?\r\u0012w0$\f@ku$\u0016\u0012f:\"\u000bWf!p\u000bWv:<\fFl:>X"))};
   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "Ljava/awt/DisplayMode;"
   )
   private DisplayMode field1317;

   @OriginalMember(
      owner = "client!pia",
      name = "enter",
      descriptor = "(Ljava/awt/Frame;IIII)V"
   )
   public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field1317 = this.field1318.getDisplayMode();
      if (this.field1317 == null) {
         throw new NullPointerException();
      } else {
         arg0.setUndecorated(true);
         arg0.enableInputMethods(false);
         this.method925(114, arg0);
         if (arg4 == 0) {
            int var6 = this.field1317.getRefreshRate();
            DisplayMode[] var7 = this.field1318.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               if (var7[var9].getWidth() == arg1 && var7[var9].getHeight() == arg2 && arg3 == var7[var9].getBitDepth()) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || Math.abs(-var6 + var10) < Math.abs(-var6 + arg4)) {
                     arg4 = var10;
                     var8 = true;
                  }
               }
            }

            if (!var8) {
               arg4 = var6;
            }
         }

         this.field1318.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "listmodes",
      descriptor = "()[I"
   )
   public final int[] listmodes() {
      DisplayMode[] var1 = this.field1318.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) - -1] = var1[var3].getHeight();
         var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
         var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)V"
   )
   private final void method925(int arg0, Frame arg1) {
      boolean var3 = false;
      if (arg0 > 82) {
         try {
            Field var4 = Class.forName(field1319[1]).getDeclaredField(field1319[0]);
            var4.setAccessible(true);
            boolean var5 = (Boolean)var4.get(this.field1318);
            if (var5) {
               var4.set(this.field1318, Boolean.FALSE);
               var3 = true;
            }
         } catch (Throwable var17) {
         }

         try {
            this.field1318.setFullScreenWindow(arg1);
         } finally {
            if (var3) {
               try {
                  Field var10 = Class.forName(field1319[1]).getDeclaredField(field1319[0]);
                  var10.set(this.field1318, Boolean.TRUE);
               } catch (Throwable var16) {
               }
            }

         }

      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "<init>",
      descriptor = "()V"
   )
   public class103() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field1318 = var1.getDefaultScreenDevice();
      if (!this.field1318.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this.field1318 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "exit",
      descriptor = "()V"
   )
   public final void exit() {
      if (this.field1317 != null) {
         this.field1318.setDisplayMode(this.field1317);
         if (!this.field1318.getDisplayMode().equals(this.field1317)) {
            throw new RuntimeException(field1319[2]);
         }

         this.field1317 = null;
      }

      this.method925(97, (Frame)null);
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method926(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method927(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
