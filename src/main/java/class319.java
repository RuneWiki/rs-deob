import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class319 extends class604 {
   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4567 = new String[]{method2425(method2424(")p\u000f ")), method2425(method2424("<+Mb\u0010")), method2425(method2424("1rM\rE")), method2425(method2424("1rM\u000fE")), method2425(method2424("1rM\u000eE")), method2425(method2424("1rM\bE"))};
   @OriginalMember(
      owner = "client!vw",
      name = "q",
      descriptor = "I"
   )
   public static int field4564 = 0;
   @OriginalMember(
      owner = "client!vw",
      name = "j",
      descriptor = "I"
   )
   public static int field4558;
   @OriginalMember(
      owner = "client!vw",
      name = "p",
      descriptor = "I"
   )
   public static int field4559;
   @OriginalMember(
      owner = "client!vw",
      name = "k",
      descriptor = "I"
   )
   public static int field4561;
   @OriginalMember(
      owner = "client!vw",
      name = "n",
      descriptor = "I"
   )
   public static int field4562;
   @OriginalMember(
      owner = "client!vw",
      name = "l",
      descriptor = "I"
   )
   public static int field4563;
   @OriginalMember(
      owner = "client!vw",
      name = "o",
      descriptor = "Lvs;"
   )
   public class616 field4565;
   @OriginalMember(
      owner = "client!vw",
      name = "i",
      descriptor = "Z"
   )
   public boolean field4566;
   @OriginalMember(
      owner = "client!vw",
      name = "m",
      descriptor = "[Lpda;"
   )
   public class655[] field4560;

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2420(int arg0) {
      try {
         ++field4559;
         if (arg0 >= -101) {
            method2421(true);
         }

         return ~class4.field85 == -2 ? class680.field10222 : class92.field1176;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4567[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method2421(boolean arg0) {
      try {
         if (!arg0) {
            field4564 = 59;
         }

         ++field4563;
         return ~class4.field85 == -2 ? class538.field7870 : 0;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4567[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IBLha;I)Z"
   )
   public final boolean method2422(int arg0, byte arg1, class66 arg2, int arg3) {
      int var5 = client.field4530;

      try {
         ++field4562;
         int var6 = this.field4565.method1282((byte)5);
         if (this.field4560 != null) {
            int var7 = 0;
            if (var5 != 0 || var7 < this.field4560.length) {
               do {
                  this.field4560[var7].field9520 <<= var6;
                  if (this.field4560[var7].method4714(arg0, arg3) && this.field4565.method20(arg3, 131072, arg2, arg0)) {
                     this.field4560[var7].field9520 >>= var6;
                     return true;
                  }

                  this.field4560[var7].field9520 >>= var6;
                  ++var7;
               } while(var7 < this.field4560.length);
            }
         }

         return arg1 <= 31 ? false : false;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4567[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4567[1] : field4567[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method2423(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg0 & arg3;
         ++field4558;
         if (var6 == 0) {
            return arg1;
         } else if (~var6 == -2) {
            return arg2;
         } else {
            return var6 == 2 ? -arg1 + 4095 : -arg2 + 4095;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4567[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2424(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2425(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
