import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class351 extends class465 {
   @OriginalMember(
      owner = "client!oi",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5357 = new String[]{method2827(method2826("\u000b%4\f\u0015")), method2827(method2826("\u000b%4\r\u0015")), method2827(method2826("\u000b%4\u0003\u0015")), method2827(method2826("\u000b%4\u000f\u0015"))};
   @OriginalMember(
      owner = "client!oi",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field5351 = false;
   @OriginalMember(
      owner = "client!oi",
      name = "H",
      descriptor = "Z"
   )
   public static volatile boolean field5353 = true;
   @OriginalMember(
      owner = "client!oi",
      name = "I",
      descriptor = "I"
   )
   public static int field5350;
   @OriginalMember(
      owner = "client!oi",
      name = "J",
      descriptor = "I"
   )
   public static int field5352;
   @OriginalMember(
      owner = "client!oi",
      name = "G",
      descriptor = "I"
   )
   public static int field5354;
   @OriginalMember(
      owner = "client!oi",
      name = "F",
      descriptor = "I"
   )
   public static int field5355;
   @OriginalMember(
      owner = "client!oi",
      name = "E",
      descriptor = "Lha;"
   )
   public static class610 field5356;

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 3
   )
   public final void method2822(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field5350;
         int var6 = super.field7067.method2106();
         if (arg3 < 110) {
            this.method2822(34, -8, 52, (byte)-1, -110);
         }

         int var7 = ((class594)super.field485).field8741 * class302.method2528(-1) / 10 % var6;
         super.field7067.method4949(arg2 - -var7 + -var6, arg4, arg1 + var6 + -var7, arg0);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5357[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Luba;)V",
      line = 22
   )
   public class351(class678 arg0, class678 arg1, class594 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!oi",
      name = "e",
      descriptor = "(B)V",
      line = 25
   )
   public static final void method2823(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field5355;
         if (arg0 == 118) {
            if (field5356 != null) {
               if (class281.field4472) {
                  class799.method5764(false);
               }

               class154.field2298.method2090(0);
               class367.method3010();
               class140.method1284((byte)57);
               class5.method20((byte)-68);
               class453.method3552((byte)52);
               class85.method827(-2);
               class203.method1772(false);
               class600.method4442(-27112);
               class305.method2559(107);
               class426.method3378(false);
               class1.method1(arg0 ^ 26129, false);
               int var2 = 0;
               if (var1 || ~var2 > -2049) {
                  do {
                     class9 var3 = class484.field7370[var2];
                     if (var3 == null) {
                        ++var2;
                     } else {
                        int var4 = 0;
                        if (var1) {
                           var3.field1689[var4] = null;
                           ++var4;
                        }

                        while(~var3.field1689.length < ~var4) {
                           var3.field1689[var4] = null;
                           ++var4;
                        }

                        ++var2;
                     }
                  } while(~var2 > -2049);
               }

               int var5 = 0;
               if (!var1 && class522.field7961 <= var5) {
                  class187.field2925 = null;
                  class717.field10754 = null;
                  field5356.method4495(true);
                  field5356 = null;
               } else {
                  do {
                     class466 var6 = class204.field3112[var5].field11592;
                     if (var6 == null) {
                        ++var5;
                     } else {
                        int var7 = 0;
                        if (var1) {
                           var6.field1689[var7] = null;
                           ++var7;
                        }

                        while(~var6.field1689.length < ~var7) {
                           var6.field1689[var7] = null;
                           ++var7;
                        }

                        ++var5;
                     }
                  } while(class522.field7961 > var5);

                  class187.field2925 = null;
                  class717.field10754 = null;
                  field5356.method4495(true);
                  field5356 = null;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5357[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(I)V",
      line = 108
   )
   public static final void method2824(int arg0) {
      try {
         ++class467.field7103;
         ++field5354;
         class577 var1 = class218.method1888(class718.field10767, 99, class510.field7801.field361);
         var1.field8531.method2864(-26110, class187.method1682((byte)-30));
         var1.field8531.method2873(class316.field4878, (byte)121);
         if (arg0 <= -18) {
            var1.field8531.method2873(class692.field10301, (byte)104);
            var1.field8531.method2864(-26110, class687.field10213.field533.method1746(480102311));
            class510.field7801.method211(var1, 126);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5357[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "(I)V",
      line = 127
   )
   public static void method2825(int arg0) {
      try {
         int var1 = -111 % (arg0 / 33);
         field5356 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5357[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2826(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2827(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
