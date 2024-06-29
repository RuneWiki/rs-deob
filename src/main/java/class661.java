import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class661 extends class213 {
   @OriginalMember(
      owner = "client!mh",
      name = "S",
      descriptor = "I"
   )
   private int field9427 = 2048;
   @OriginalMember(
      owner = "client!mh",
      name = "R",
      descriptor = "I"
   )
   private int field9426 = 1024;
   @OriginalMember(
      owner = "client!mh",
      name = "M",
      descriptor = "I"
   )
   private int field9421 = 3072;
   @OriginalMember(
      owner = "client!mh",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9436 = new String[]{method4799(method4798("\u0000v4h}")), method4799(method4798("\u0000v4j}")), method4799(method4798("\u0000v4b}")), method4799(method4798("\u001604\u0007(")), method4799(method4798("\u0003kvE")), method4799(method4798("\u0000v4n}")), method4799(method4798("\u0000v4k}")), method4799(method4798("\u0000v4c}")), method4799(method4798("\u0000v4m}"))};
   @OriginalMember(
      owner = "client!mh",
      name = "I",
      descriptor = "I"
   )
   public static int field9423 = 0;
   @OriginalMember(
      owner = "client!mh",
      name = "F",
      descriptor = "Lnw;"
   )
   public static class616 field9432 = new class616(79, 1);
   @OriginalMember(
      owner = "client!mh",
      name = "E",
      descriptor = "Ldia;"
   )
   public static class245 field9434 = new class245(16);
   @OriginalMember(
      owner = "client!mh",
      name = "L",
      descriptor = "Ltv;"
   )
   public static class590 field9435 = new class590(8);
   @OriginalMember(
      owner = "client!mh",
      name = "J",
      descriptor = "I"
   )
   public static int field9424;
   @OriginalMember(
      owner = "client!mh",
      name = "Q",
      descriptor = "I"
   )
   public static int field9425;
   @OriginalMember(
      owner = "client!mh",
      name = "K",
      descriptor = "I"
   )
   public static int field9428;
   @OriginalMember(
      owner = "client!mh",
      name = "T",
      descriptor = "I"
   )
   public static int field9429;
   @OriginalMember(
      owner = "client!mh",
      name = "H",
      descriptor = "I"
   )
   public static int field9430;
   @OriginalMember(
      owner = "client!mh",
      name = "P",
      descriptor = "I"
   )
   public static int field9431;
   @OriginalMember(
      owner = "client!mh",
      name = "G",
      descriptor = "Lqh;"
   )
   public static class74 field9433;
   @OriginalMember(
      owner = "client!mh",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field9422;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method4795(int arg0, byte arg1, int arg2) {
      try {
         ++field9425;
         if (arg1 != -6) {
            field9432 = null;
         }

         class446 var3 = class635.method4607(121, (long)arg2 | (long)arg0 << 32, 18);
         var3.method3312(-117);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9436[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9424;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 < 26) {
            this.field9427 = -123;
         }

         if (super.field2644.field6719) {
            int[][] var5 = this.method1615(true, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class576.field7916) {
               do {
                  var9[var12] = (var6[var12] * this.field9427 >> 12) + this.field9426;
                  var10[var12] = (var7[var12] * this.field9427 >> 12) + this.field9426;
                  var11[var12] = this.field9426 - -(var8[var12] * this.field9427 >> 12);
                  ++var12;
               } while(var12 < class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9436[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "<init>",
      descriptor = "()V"
   )
   public class661() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label52: {
            label47: {
               label46: {
                  if (arg2 != 0) {
                     if (arg2 == 1) {
                        break label46;
                     }

                     if (~arg2 != -3) {
                        break label52;
                     }

                     if (!var4) {
                        break label47;
                     }
                  }

                  this.field9426 = arg0.method4280(-19104);
                  if (!var4) {
                     break label52;
                  }
               }

               this.field9421 = arg0.method4280(-19104);
               if (!var4) {
                  break label52;
               }
            }

            super.field2645 = arg0.method4288((byte)105) == 1;
         }

         int var6 = -111 % ((68 - arg1) / 48);
         ++field9430;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9436[5] + (arg0 != null ? field9436[3] : field9436[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4796(int arg0) {
      try {
         field9432 = null;
         field9422 = null;
         field9435 = null;
         field9434 = null;
         if (arg0 == -11911) {
            field9433 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9436[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         ++field9428;
         if (arg0 != 28274) {
            this.field9426 = 120;
         }

         this.field9427 = -this.field9426 + this.field9421;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9436[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9431;
         if (arg1 != 2064866508) {
            field9433 = null;
         }

         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)73, arg0, 0);
            int var6 = 0;
            if (var3 || ~class576.field7916 < ~var6) {
               do {
                  var4[var6] = (var5[var6] * this.field9427 >> 12) + this.field9426;
                  ++var6;
               } while(~class576.field7916 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9436[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method4797(byte arg0) {
      try {
         ++field9429;
         if (arg0 <= 2) {
            field9435 = null;
         }

         return class366.field5166;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9436[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4798(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4799(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
