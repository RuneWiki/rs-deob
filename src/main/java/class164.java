import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class164 extends class629 {
   @OriginalMember(
      owner = "client!g",
      name = "K",
      descriptor = "I"
   )
   private int field2598 = 4096;
   @OriginalMember(
      owner = "client!g",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2604 = new String[]{method1500(method1499("]b%q")), method1500(method1499("]b9q")), method1500(method1499("T9\u00185")), method1500(method1499("]b&q")), method1500(method1499("AbZwd")), method1500(method1499("]b1q")), method1500(method1499("]b$q")), method1500(method1499("]b>q")), method1500(method1499("]b;q")), method1500(method1499("]b:q"))};
   @OriginalMember(
      owner = "client!g",
      name = "J",
      descriptor = "Lgh;"
   )
   public static class572 field2602 = new class572(125, 12);
   @OriginalMember(
      owner = "client!g",
      name = "G",
      descriptor = "D"
   )
   public static double field2596;
   @OriginalMember(
      owner = "client!g",
      name = "H",
      descriptor = "I"
   )
   public static int field2593;
   @OriginalMember(
      owner = "client!g",
      name = "D",
      descriptor = "I"
   )
   public static int field2594;
   @OriginalMember(
      owner = "client!g",
      name = "E",
      descriptor = "I"
   )
   public static int field2595;
   @OriginalMember(
      owner = "client!g",
      name = "F",
      descriptor = "I"
   )
   public static int field2597;
   @OriginalMember(
      owner = "client!g",
      name = "L",
      descriptor = "I"
   )
   public static int field2599;
   @OriginalMember(
      owner = "client!g",
      name = "N",
      descriptor = "I"
   )
   public static int field2600;
   @OriginalMember(
      owner = "client!g",
      name = "M",
      descriptor = "I"
   )
   public static int field2601;
   @OriginalMember(
      owner = "client!g",
      name = "I",
      descriptor = "I"
   )
   public static int field2603;

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2597;
         if (arg3 != -16291) {
            method1495(-99, 91, -90);
         }

         class536 var5 = class108.method1038((long)arg0 << 32 | (long)arg2, 67, 18);
         var5.method4017(24076);
         var5.field7800 = arg1;
         var5.field7798 = arg4;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2604[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method1494(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         if (arg5 < 1) {
            arg5 = 1;
         }

         if (~arg4 > -2) {
            arg4 = 1;
         }

         int var7;
         label64: {
            ++field2599;
            var7 = arg5 + -334;
            if (var7 >= 0) {
               if (~var7 >= -101) {
                  break label64;
               }

               var7 = 100;
               if (!var6) {
                  break label64;
               }
            }

            var7 = 0;
         }

         int var8;
         label57: {
            var8 = (class778.field11393 - class211.field3154) * var7 / 100 + class211.field3154;
            if (~class310.field4477 < ~var8) {
               var8 = class310.field4477;
               if (!var6) {
                  break label57;
               }
            }

            if (~var8 < ~class590.field8515) {
               var8 = class590.field8515;
            }
         }

         label52: {
            int var9 = arg5 * var8 * 512 / (arg4 * 334);
            if (~class185.field2807 < ~var9) {
               var9 = class185.field2807;
               var8 = var9 * 334 * arg4 / (arg5 * 512);
               if (var8 <= class590.field8515) {
                  break label52;
               }

               var8 = class590.field8515;
               int var10 = arg5 * 512 * var8 / (var9 * 334);
               int var11 = (-var10 + arg4) / 2;
               if (arg1) {
                  class444.field6473.method349();
                  class444.field6473.method693(arg3 ^ -17243, -16777216, var11, arg5, arg0, arg2);
                  class444.field6473.method693(arg3 ^ -17243, -16777216, var11, arg5, arg0, -var11 + arg4 + arg2);
               }

               arg4 -= var11 * 2;
               arg2 += var11;
               if (!var6) {
                  break label52;
               }
            }

            if (~class445.field6494 > ~var9) {
               short var12 = class445.field6494;
               var8 = arg4 * 334 * var12 / (arg5 * 512);
               if (~var8 > ~class310.field4477) {
                  var8 = class310.field4477;
                  int var13 = arg4 * 334 * var12 / (var8 * 512);
                  int var14 = (-var13 + arg5) / 2;
                  if (arg1) {
                     class444.field6473.method349();
                     class444.field6473.method693(10240, -16777216, arg4, var14, arg0, arg2);
                     class444.field6473.method693(10240, -16777216, arg4, var14, -var14 + arg0 + arg5, arg2);
                  }

                  arg5 -= var14 * 2;
                  arg0 += var14;
               }
            }
         }

         if (arg3 == -27483) {
            class395.field5805 = arg0;
            class284.field3966 = arg2;
            class296.field4154 = arg5 * var8 / 334;
            class108.field1781 = (short)arg5;
            class668.field9702 = (short)arg4;
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field2604[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         if (~arg2 == -1) {
            this.field2598 = arg0.method3565(true);
         }

         if (arg1 == 0) {
            ++field2594;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2604[5] + (arg0 != null ? field2604[4] : field2604[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "c",
      descriptor = "(III)I"
   )
   public static final int method1495(int arg0, int arg1, int arg2) {
      try {
         ++field2600;
         int var3 = class740.method5333(arg0 + -1, false, arg1 - 1) - -class740.method5333(arg0 + -1, false, arg1 - -1) - (-class740.method5333(arg0 + 1, false, arg1 + -1) - class740.method5333(arg0 - -1, false, arg1 + 1));
         int var4 = class740.method5333(arg0, false, arg1 + -1) + class740.method5333(arg0, false, arg1 - -1) - (-class740.method5333(arg0 - 1, false, arg1) - class740.method5333(arg0 + 1, false, arg1));
         if (arg2 != 10260) {
            return -33;
         } else {
            int var5 = class740.method5333(arg0, false, arg1);
            return var5 / 4 + var3 / 16 + var4 / 8;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2604[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method1496(int arg0, long arg1) {
      try {
         if (arg0 != 30401) {
            field2596 = 0.4983114318245213D;
         }

         class62.field1158.setTime(new Date(arg1));
         ++field2601;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2604[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1497(int arg0) {
      try {
         field2602 = null;
         if (arg0 > -126) {
            method1496(88, 63L);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2604[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IIIIIILha;I)V"
   )
   public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class65 arg6, int arg7) {
      try {
         ++field2595;
         class393.field5787 = arg6;
         class718.field10369 = class393.field5787.method432();
         class88.field1436 = class393.field5787.method432();
         class56.field1115 = class393.field5787.method432();
         class75.field1330 = null;
         int var8 = 122 % ((arg7 - 41) / 32);
         class504.field7338 = 0;
         class402.field5939 = 1;
         class663.field9648 = 0;
         class692.field10142 = arg2;
         field2603 = arg5;
         class335.field4788 = arg4;
         class438.field6324 = arg1;
         class213.method1813(arg0, arg3, 32493);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2604[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2604[4] : field2604[2]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "<init>",
      descriptor = "()V"
   )
   public class164() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2593;
         if (arg1 != 2048) {
            return null;
         } else {
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int[] var5 = this.method4622((byte)116, 0, class37.field902 & arg0 - 1);
               int[] var6 = this.method4622((byte)122, 0, arg0);
               int[] var7 = this.method4622((byte)116, 0, class37.field902 & arg0 + 1);
               int var8 = 0;
               if (var3 || ~class66.field1214 < ~var8) {
                  do {
                     int var9 = (var7[var8] + -var5[var8]) * this.field2598;
                     int var10 = (var6[var8 + 1 & class704.field10259] + -var6[class704.field10259 & var8 + -1]) * this.field2598;
                     int var11 = var10 >> 12;
                     int var12 = var9 >> 12;
                     int var13 = var11 * var11 >> 12;
                     int var14 = var12 * var12 >> 12;
                     int var15 = (int)(4096.0D * Math.sqrt((double)((float)(var13 - -var14 + 4096) / 4096.0F)));
                     int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                     var4[var8] = 4096 - var16;
                     ++var8;
                  } while(~class66.field1214 < ~var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field2604[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
