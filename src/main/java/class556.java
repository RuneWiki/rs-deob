import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class556 {
   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7645 = new String[]{method4013(method4012("YAO\u0011\u0017")), method4013(method4012("[\\\r?")), method4013(method4012("YAO\u0017\u0017")), method4013(method4012("N\u0007O}B")), method4013(method4012("YAO\u0016\u0017")), method4013(method4012("YAO\u0012\u0017")), method4013(method4012("YAO\u0010\u0017"))};
   @OriginalMember(
      owner = "client!lh",
      name = "c",
      descriptor = "Lnw;"
   )
   public static class616 field7637 = new class616(6, 4);
   @OriginalMember(
      owner = "client!lh",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class378 field7641 = new class378(90, 4);
   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field7642 = false;
   @OriginalMember(
      owner = "client!lh",
      name = "i",
      descriptor = "[B"
   )
   public static byte[] field7643 = new byte[2048];
   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "I"
   )
   public static int field7635;
   @OriginalMember(
      owner = "client!lh",
      name = "g",
      descriptor = "I"
   )
   public static int field7636;
   @OriginalMember(
      owner = "client!lh",
      name = "f",
      descriptor = "I"
   )
   public static int field7638;
   @OriginalMember(
      owner = "client!lh",
      name = "j",
      descriptor = "I"
   )
   public static int field7639;
   @OriginalMember(
      owner = "client!lh",
      name = "e",
      descriptor = "I"
   )
   public static int field7640;
   @OriginalMember(
      owner = "client!lh",
      name = "h",
      descriptor = "I"
   )
   public static int field7644;

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "([BI)V"
   )
   public static final synchronized void method4007(byte[] param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4008(int arg0) {
      try {
         ++field7635;
         if (arg0 != 2048) {
            method4007((byte[])null, 84);
         }

         if (!class383.field5359) {
            class383.field5359 = true;
            class424.field5950 = true;
            class157.field2018 += (-24.0F - class157.field2018) / 2.0F;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7645[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(I[[BLrq;)V"
   )
   public static final void method4009(int arg0, byte[][] arg1, class372 arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7640;
         int[] var4 = new int[]{-1, 0, 0, 0, 0};
         int var5 = arg1.length;
         if (arg0 <= 48) {
            field7641 = null;
         }

         int var6 = 0;
         if (var3 || var6 < var5) {
            do {
               byte[] var7 = arg1[var6];
               if (var7 != null) {
                  class594 var8 = new class594(var7);
                  int var9 = class794.field11597[var6] >> 8;
                  int var10 = class794.field11597[var6] & 255;
                  int var11 = var9 * 64 + -class752.field10921;
                  int var12 = var10 * 64 + -class17.field237;
                  class736.method5336((byte)96);
                  arg2.method5046(class752.field10921, class331.field4738, class17.field237, (byte)-128, var11, var8, var12);
                  arg2.method2878(var11, var4, var8, class338.field4832, (byte)-48, var12);
                  if (!arg2.field10154 && ~(class446.field6176 / 8) == ~var9 && ~(class270.field3503 / 8) == ~var10 && ~var4[0] != 0) {
                     class256.field3271 = class371.field5238.method1971(var4[2], var4[1], var4[3], var4[0], class212.field2634, -527);
                     class593.field8192 = var4[4];
                  }
               }

               ++var6;
            } while(var6 < var5);
         }

         int var13 = 0;
         if (var3 || var13 < var5) {
            do {
               int var14 = (class794.field11597[var13] >> 8) * 64 + -class752.field10921;
               int var15 = (255 & class794.field11597[var13]) * 64 + -class17.field237;
               byte[] var16 = arg1[var13];
               if (var16 == null && class270.field3503 < 800) {
                  class736.method5336((byte)96);
                  arg2.method5052(var14, var15, 64, (byte)110, 64);
               }

               ++var13;
            } while(var13 < var5);

         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field7645[2] + arg0 + ',' + (arg1 != null ? field7645[3] : field7645[1]) + ',' + (arg2 != null ? field7645[3] : field7645[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(II)[B"
   )
   public static final synchronized byte[] method4010(int arg0, int arg1) {
      try {
         ++field7639;
         if (~arg1 == -101 && ~class67.field771 < -1) {
            byte[] var2 = class728.field10670[--class67.field771];
            class728.field10670[class67.field771] = null;
            return var2;
         } else if (arg1 == 5000 && class692.field10105 > 0) {
            byte[] var3 = class110.field1391[--class692.field10105];
            class110.field1391[class692.field10105] = null;
            return var3;
         } else if (arg1 == 30000 && ~class90.field1156 < -1) {
            byte[] var4 = class168.field2114[--class90.field1156];
            class168.field2114[class90.field1156] = null;
            return var4;
         } else {
            int var5 = 90 % ((-91 - arg0) / 34);
            if (class386.field5407 != null) {
               for(int var6 = 0; class750.field10916.length > var6; ++var6) {
                  if (~class750.field10916[var6] == ~arg1 && class82.field1056[var6] > 0) {
                     byte[] var7 = class386.field5407[var6][--class82.field1056[var6]];
                     class386.field5407[var6][class82.field1056[var6]] = null;
                     return var7;
                  }
               }
            }

            return new byte[arg1];
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7645[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4011(byte arg0) {
      try {
         field7637 = null;
         if (arg0 != 36) {
            field7642 = false;
         }

         field7643 = null;
         field7641 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7645[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
