import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class678 {
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10208 = new String[]{method4954(method4953("-&Z@\u0004")), method4954(method4953("1 \u0018i")), method4954(method4953("${Z+Q")), method4954(method4953("-&ZD\u0004")), method4954(method4953("-&ZG\u0004")), method4954(method4953("-&ZF\u0004")), method4954(method4953("-&ZA\u0004"))};
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "I"
   )
   public static int field10203 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10205 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public static int field10198;
   @OriginalMember(
      owner = "client!rs",
      name = "j",
      descriptor = "I"
   )
   public static int field10199;
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public int field10200;
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "I"
   )
   public int field10201;
   @OriginalMember(
      owner = "client!rs",
      name = "i",
      descriptor = "I"
   )
   public static int field10202;
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "I"
   )
   public int field10204;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public static int field10206;
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "I"
   )
   public static int field10207;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Liaa;B)I",
      line = 9
   )
   public static final int method4948(class520 arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field10207;
         if (arg1 < 53) {
            field10205 = null;
         }

         int var3 = arg0.method3829(-118, 2);
         int var4;
         if (~var3 != -1) {
            if (~var3 == -2) {
               var4 = arg0.method3829(-74, 5);
               if (var2 == 0) {
                  return var4;
               }
            }

            if (var3 != 2) {
               var4 = arg0.method3829(-42, 11);
               if (var2 == 0) {
                  return var4;
               }
            }

            var4 = arg0.method3829(-99, 8);
            if (var2 == 0) {
               return var4;
            }
         }

         var4 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10208[0] + (arg0 != null ? field10208[2] : field10208[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V",
      line = 36
   )
   public static final void method4949(int arg0) {
      try {
         if (arg0 == 2) {
            ++field10202;
            class503.field7469.method5451(80);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10208[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Ljj;B)V",
      line = 51
   )
   public final void method4950(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field10199;
         int var4 = 44 / ((10 - arg1) / 50);

         do {
            int var5 = arg0.method1104(255);
            if (~var5 == -1) {
               break;
            }

            this.method4952(var5, arg0, (byte)-88);
         } while(var3 == 0);

      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10208[6] + (arg0 != null ? field10208[2] : field10208[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Z)V",
      line = 71
   )
   public static void method4951(boolean arg0) {
      try {
         if (!arg0) {
            field10205 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10208[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ILjj;B)V",
      line = 96
   )
   private final void method4952(int arg0, class128 arg1, byte arg2) {
      try {
         if (~arg0 == -2) {
            this.field10204 = arg1.method1038((byte)-126);
            this.field10200 = arg1.method1104(255);
            this.field10201 = arg1.method1104(255);
         }

         ++field10198;
         int var4 = 81 / ((46 - arg2) / 60);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10208[3] + arg0 + ',' + (arg1 != null ? field10208[2] : field10208[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4953(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4954(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
