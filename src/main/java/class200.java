import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class200 implements class272 {
   @OriginalMember(
      owner = "client!ob",
      name = "g",
      descriptor = "Lno;"
   )
   private class696 field3075;
   @OriginalMember(
      owner = "client!ob",
      name = "i",
      descriptor = "Lfia;"
   )
   private class529 field3073;
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3076 = new String[]{method1761(method1760("Lz\u0003\u000fpMqY\r1")), method1761(method1760("X6\u0003\u001dd")), method1761(method1760("MmA_")), method1761(method1760("Lz\u0003p1")), method1761(method1760("Lz\u0003w1")), method1761(method1760("Lz\u0003u1")), method1761(method1760("Lz\u0003v1")), method1761(method1760("Lz\u0003q1")), method1761(method1760("Lz\u0003r1"))};
   @OriginalMember(
      owner = "client!ob",
      name = "d",
      descriptor = "I"
   )
   public static int field3072 = -1;
   @OriginalMember(
      owner = "client!ob",
      name = "f",
      descriptor = "I"
   )
   public static int field3065;
   @OriginalMember(
      owner = "client!ob",
      name = "e",
      descriptor = "I"
   )
   public static int field3066;
   @OriginalMember(
      owner = "client!ob",
      name = "k",
      descriptor = "I"
   )
   public static int field3067;
   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "I"
   )
   public static int field3068;
   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "I"
   )
   public static int field3069;
   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "I"
   )
   public static int field3070;
   @OriginalMember(
      owner = "client!ob",
      name = "h",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!ob",
      name = "j",
      descriptor = "I"
   )
   public static int field3074;

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public final void method282(byte arg0) {
      try {
         ++field3065;
         if (arg0 <= 98) {
            method1757(-118);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3076[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static final void method1757(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(ZZ)V",
      line = 63
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         ++field3074;
         class79 var3 = this.field3073.method4065(-1, this.field3075.field10338);
         if (!arg0) {
            if (var3 != null) {
               int var4 = this.field3075.field10333.method5105(120, class154.field2293, this.field3075.field10330) - -this.field3075.field10328;
               int var5 = this.field3075.field10331.method5508(118, class445.field6835, this.field3075.field10327) - -this.field3075.field10337;
               if (this.field3075.field10341) {
                  class351.field5356.method602(var4, var5, this.field3075.field10330, this.field3075.field10327, this.field3075.field10329, 0);
               }

               int var6 = var5 + this.method1758(var3.field1051, var5, class156.field2324, var4, false, 5) * 12;
               int var11 = var6 + 8;
               if (this.field3075.field10341) {
                  class351.field5356.method695(var4, var11, this.field3075.field10330 + var4 - 1, var11, this.field3075.field10329, 0);
               }

               var6 = var11 + 1;
               int var7 = var6 + this.method1758(var3.field1057, var6, class156.field2324, var4, false, 5) * 12;
               int var12 = var7 + 5;
               int var10000 = var12 + 12 * this.method1758(var3.field1052, var12, class156.field2324, var4, false, 5);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3076[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Ljava/lang/String;ILda;IZI)I",
      line = 97
   )
   private final int method1758(String arg0, int arg1, class288 arg2, int arg3, boolean arg4, int arg5) {
      try {
         if (arg4) {
            return 89;
         } else {
            ++field3070;
            return arg2.method2408(this.field3075.field10334, this.field3075.field10330 - arg5 * 2, arg1 + arg5, (int[])null, 0, arg3 + arg5, 0, (class96)null, this.field3075.field10340, arg0, -(arg5 * 2) + this.field3075.field10327, 0, 0, -27121, 0, (class672[])null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3076[5] + (arg0 != null ? field3076[1] : field3076[2]) + ',' + arg1 + ',' + (arg2 != null ? field3076[1] : field3076[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(B)Z",
      line = 111
   )
   public final boolean method285(byte arg0) {
      try {
         ++field3069;
         return arg0 != 8 ? false : this.field3073.method4064(-107);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3076[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "<init>",
      descriptor = "(Lfia;Lno;)V",
      line = 122
   )
   public class200(class529 arg0, class696 arg1) {
      try {
         this.field3075 = arg1;
         this.field3073 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3076[0] + (arg0 != null ? field3076[1] : field3076[2]) + ',' + (arg1 != null ? field3076[1] : field3076[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(III)I",
      line = 134
   )
   public static final int method1759(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field3068;
         if (arg0 >= -103) {
            field3072 = 58;
         }

         byte var4;
         label34: {
            if (~arg2 >= -20001) {
               if (~arg2 < -10001) {
                  var4 = 3;
                  class143.method1299(1);
                  if (!var3) {
                     break label34;
                  }
               }

               if (~arg2 >= -5001) {
                  class491.method3804(true, true);
                  var4 = 1;
                  if (!var3) {
                     break label34;
                  }
               }

               class713.method5285((byte)-92);
               var4 = 2;
               if (!var3) {
                  break label34;
               }
            }

            class238.method2032(false);
            var4 = 4;
         }

         if (~arg1 != ~class687.field10213.field507.method3440(480102311)) {
            class687.field10213.method299(-17, arg1, class687.field10213.field494);
            class473.method3678(2744, arg1, false);
         }

         class388.method3135(0);
         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3076[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1760(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1761(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
