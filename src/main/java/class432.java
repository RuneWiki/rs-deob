import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class432 {
   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "Lhha;"
   )
   private class549 field6027;
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6035 = new String[]{method3238(method3237("\u001av\u0000\u0011\rF")), method3238(method3237("\u001av\u0000\u0011\fF")), method3238(method3237("\u001av\u0000\u0011\tF")), method3238(method3237("\u001av\u0000\u0011\u000bF")), method3238(method3237("\u001av\u0000\u0011\nF")), method3238(method3237("\u0000b\rS")), method3238(method3237("\u00159O\u00115")), method3238(method3237("\u001av\u0000\u0011t\u0007y\bKvF"))};
   @OriginalMember(
      owner = "client!taa",
      name = "d",
      descriptor = "J"
   )
   public static long field6028 = 0L;
   @OriginalMember(
      owner = "client!taa",
      name = "g",
      descriptor = "I"
   )
   public static int field6026 = 0;
   @OriginalMember(
      owner = "client!taa",
      name = "i",
      descriptor = "I"
   )
   public static int field6025;
   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "I"
   )
   public static int field6029;
   @OriginalMember(
      owner = "client!taa",
      name = "h",
      descriptor = "I"
   )
   public static int field6031;
   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "I"
   )
   public static int field6033;
   @OriginalMember(
      owner = "client!taa",
      name = "j",
      descriptor = "Ldn;"
   )
   private class546 field6032;
   @OriginalMember(
      owner = "client!taa",
      name = "e",
      descriptor = "Leb;"
   )
   public static class657 field6030;
   @OriginalMember(
      owner = "client!taa",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field6034;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(Z)Ldn;"
   )
   public final class546 method3232(boolean arg0) {
      try {
         ++field6025;
         class546 var2 = this.field6027.field7496.field7453;
         if (arg0) {
            method3236(105);
         }

         if (this.field6027.field7496 == var2) {
            this.field6032 = null;
            return null;
         } else {
            this.field6032 = var2.field7453;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6035[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3233(int arg0, int arg1, int arg2) {
      try {
         ++field6031;
         class446 var3 = class635.method4607(120, (long)arg0 << 32 | (long)arg1, arg2);
         var3.method3312(arg2 ^ -112);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6035[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(I)Ldn;"
   )
   public final class546 method3234(int arg0) {
      try {
         ++field6029;
         class546 var2 = this.field6032;
         int var3 = 62 / ((arg0 - -70) / 48);
         if (this.field6027.field7496 == var2) {
            this.field6032 = null;
            return null;
         } else {
            this.field6032 = var2.field7453;
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6035[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(IIIIIIZIII)Z"
   )
   public static final boolean method3235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
      try {
         ++field6033;
         if (!class355.method2789(1, arg9, arg0, arg7)) {
            return false;
         } else {
            int var20 = class543.field7414[1];
            int var12 = class543.field7414[2];
            int var18 = class543.field7414[0];
            if (!class355.method2789(1, arg2, arg4, arg8)) {
               return false;
            } else {
               int var19 = class543.field7414[0];
               int var16 = class543.field7414[2];
               int var14 = class543.field7414[1];
               if (!class355.method2789(1, arg5, arg1, arg3)) {
                  return false;
               } else {
                  int var17 = class543.field7414[1];
                  if (!arg6) {
                     return false;
                  } else {
                     int var13 = class543.field7414[2];
                     int var15 = class543.field7414[0];
                     return class533.method3838(var18, var15, var13, var17, var19, var12, var14, var16, var20, 0);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field6035[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "()V"
   )
   public class432() {
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(Lhha;)V"
   )
   public class432(class549 arg0) {
      try {
         this.field6027 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6035[7] + (arg0 != null ? field6035[6] : field6035[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3236(int arg0) {
      try {
         if (arg0 != 0) {
            field6030 = null;
         }

         field6030 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6035[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3237(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3238(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
