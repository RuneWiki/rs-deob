import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class56 {
   @OriginalMember(
      owner = "client!uda",
      name = "b",
      descriptor = "Lmd;"
   )
   public class274 field749;
   @OriginalMember(
      owner = "client!uda",
      name = "h",
      descriptor = "[Lkk;"
   )
   public class266[] field747;
   @OriginalMember(
      owner = "client!uda",
      name = "g",
      descriptor = "Lmd;"
   )
   public class274 field748;
   @OriginalMember(
      owner = "client!uda",
      name = "d",
      descriptor = "[Lkk;"
   )
   public class266[] field751;
   @OriginalMember(
      owner = "client!uda",
      name = "c",
      descriptor = "Lmd;"
   )
   public class274 field754;
   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "Z"
   )
   public boolean field752;
   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field755 = new String[]{method531(method530("\f4\u0011~~\u0010>\u0019$|Q")), method531(method530("\u0002~^~?")), method531(method530("\u0017%\u001c<"))};
   @OriginalMember(
      owner = "client!uda",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field750 = false;
   @OriginalMember(
      owner = "client!uda",
      name = "e",
      descriptor = "I"
   )
   public static int field753;

   @OriginalMember(
      owner = "client!uda",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class56(class530 arg0) {
      boolean var2 = client.field1481;
      super();
      this.field749 = null;
      this.field747 = null;
      this.field748 = null;
      this.field751 = null;
      this.field754 = null;

      try {
         this.field752 = arg0.field7741;
         class17.method134((byte)90, arg0);
         if (!this.field752) {
            short var10000;
            label52: {
               this.field751 = new class266[16];
               int var3 = 0;
               if (var2) {
                  var10000 = -25820;
               } else if (var3 >= 16) {
                  this.field747 = new class266[16];
                  var10000 = 0;
                  if (!var2) {
                     break label52;
                  }
               } else {
                  var10000 = -25820;
               }

               while(true) {
                  byte[] var4 = class168.method1458(var10000, var3 * 256 * 128, 32768, class75.field991);
                  this.field751[var3] = new class266(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
                  ++var3;
                  if (var3 >= 16) {
                     this.field747 = new class266[16];
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = -25820;
                  }
               }
            }

            int var5 = var10000;
            if (var2 || ~var5 > -17) {
               do {
                  byte[] var6 = class168.method1458(-25820, var5 * 128 * 2 * 128, 32768, class550.field8110);
                  this.field747[var5] = new class266(arg0, 3553, 6410, 128, 128, true, var6, 6410, false);
                  ++var5;
               } while(~var5 > -17);

            }
         } else {
            byte[] var7 = class752.method5440(false, class75.field991, true);
            this.field748 = new class274(arg0, 6410, 128, 128, 16, var7, 6410);
            byte[] var8 = class752.method5440(false, class550.field8110, true);
            this.field749 = new class274(arg0, 6410, 128, 128, 16, var8, 6410);
            class740 var9 = arg0.field7642;
            if (var9.method5371(35632)) {
               class274 var11;
               label68: {
                  byte[] var10 = class752.method5440(false, class398.field5478, true);
                  this.field754 = new class274(arg0, 6408, 128, 128, 16);
                  var11 = new class274(arg0, 6409, 128, 128, 16, var10, 6409);
                  if (!var9.method5370(var11, 2.0F, (byte)16, this.field754)) {
                     this.field754.method4158((byte)-102);
                     this.field754 = null;
                     if (!var2) {
                        break label68;
                     }
                  }

                  this.field754.method4153(1);
               }

               var11.method4158((byte)-68);
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field755[0] + (arg0 != null ? field755[1] : field755[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method530(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method531(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
