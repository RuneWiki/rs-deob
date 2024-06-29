import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class136 {
   @OriginalMember(
      owner = "client!di",
      name = "n",
      descriptor = "I"
   )
   public int field1766 = -1;
   @OriginalMember(
      owner = "client!di",
      name = "h",
      descriptor = "Z"
   )
   public boolean field1768 = true;
   @OriginalMember(
      owner = "client!di",
      name = "q",
      descriptor = "Z"
   )
   public boolean field1762 = false;
   @OriginalMember(
      owner = "client!di",
      name = "k",
      descriptor = "I"
   )
   public int field1764 = 1190717;
   @OriginalMember(
      owner = "client!di",
      name = "l",
      descriptor = "Z"
   )
   public boolean field1772 = true;
   @OriginalMember(
      owner = "client!di",
      name = "i",
      descriptor = "I"
   )
   public int field1774 = 0;
   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "I"
   )
   public int field1767 = 127;
   @OriginalMember(
      owner = "client!di",
      name = "g",
      descriptor = "I"
   )
   public int field1769 = 512;
   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "I"
   )
   public int field1776 = 64;
   @OriginalMember(
      owner = "client!di",
      name = "m",
      descriptor = "I"
   )
   public int field1778 = 8;
   @OriginalMember(
      owner = "client!di",
      name = "o",
      descriptor = "I"
   )
   public int field1775 = -1;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1779 = new String[]{method1144(method1143("\u0003\u0019 }")), method1144(method1143("\t\u0005bSA")), method1144(method1143("\u0016Bb?\u0014")), method1144(method1143("\t\u0005bRA")), method1144(method1143("\t\u0005bPA")), method1144(method1143("\t\u0005bTA"))};
   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "[Laha;"
   )
   public static class404[] field1773 = new class404[2048];
   @OriginalMember(
      owner = "client!di",
      name = "p",
      descriptor = "I"
   )
   public int field1763;
   @OriginalMember(
      owner = "client!di",
      name = "j",
      descriptor = "I"
   )
   public static int field1770;
   @OriginalMember(
      owner = "client!di",
      name = "d",
      descriptor = "I"
   )
   public static int field1771;
   @OriginalMember(
      owner = "client!di",
      name = "e",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!di",
      name = "f",
      descriptor = "Lgk;"
   )
   public class504 field1765;

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V"
   )
   public static final void method1138(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class480.field6633 = true;
      class518.field7112 = class292.field3851.method500() > 0;
      class476.field6583 = arg15;
      class367.field5174 = arg1 >> class76.field965;
      class406.field5720 = arg3 >> class76.field965;
      class273.field3647 = arg1;
      class228.field2852 = arg3;
      class476.field6588 = arg2;
      class173.field2157 = class367.field5174 - class224.field2812;
      if (class173.field2157 < 0) {
         class665.field9466 = -class173.field2157;
         class173.field2157 = 0;
      } else {
         class665.field9466 = 0;
      }

      class377.field5286 = class406.field5720 - class224.field2812;
      if (class377.field5286 < 0) {
         class259.field3322 = -class377.field5286;
         class377.field5286 = 0;
      } else {
         class259.field3322 = 0;
      }

      class456.field6251 = class367.field5174 + class224.field2812;
      if (class456.field6251 > class635.field8973) {
         class456.field6251 = class635.field8973;
      }

      class607.field8522 = class406.field5720 + class224.field2812;
      if (class607.field8522 > class304.field4042) {
         class607.field8522 = class304.field4042;
      }

      boolean[][] var19 = class426.field5961;
      boolean[][] var20 = class370.field5212;
      if (class476.field6583) {
         for(int var21 = 0; var21 < class224.field2812 + class224.field2812 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class224.field2812 + class224.field2812 + 2; ++var24) {
               if (var24 > 1) {
                  class305.field4052[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class367.field5174 - class224.field2812 + var21;
               int var26 = class406.field5720 - class224.field2812 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class635.field8973 && var26 < class304.field4042) {
                  int var27 = var25 << class76.field965;
                  int var28 = var26 << class76.field965;
                  int var29 = class144.field1906[class144.field1906.length - 1].method2221(false, var26, var25) - (1000 << class76.field965 - 7);
                  int var30 = class73.field900 != null ? class73.field900[0].method2221(false, var26, var25) + class212.field2635 : class144.field1906[0].method2221(false, var26, var25) + class212.field2635;
                  var23 = arg16 >= 0 ? class292.field3851.method595(var27, var29, var28, var27, var30, var28, arg16) : class292.field3851.method522(var27, var29, var28, var27, var30, var28);
                  class370.field5212[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class370.field5212[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class305.field4052[var24 - 1] & class305.field4052[var24] & var22 & var23;
                  class426.field5961[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class305.field4052[class224.field2812 + class224.field2812] = var22;
            class305.field4052[class224.field2812 + class224.field2812 + 1] = var23;
         }

         if (arg16 >= 0) {
            class480.field6633 = false;
         } else {
            class242.field3024 = arg5;
            class321.field4282 = arg6;
            class454.field6247 = arg7;
            class157.field2011 = arg8;
            class66.field751 = arg9;
            class503.method3631(class292.field3851, arg10, -30);
         }
      } else {
         if (class504.field6906 == null) {
            class504.field6906 = new boolean[class635.field8973 + class635.field8973 + 1][class635.field8973 + class304.field4042 + 1];
         }

         for(int var32 = 0; var32 < class504.field6906.length; ++var32) {
            for(int var42 = 0; var42 < class504.field6906[0].length; ++var42) {
               class504.field6906[var32][var42] = true;
            }
         }

         class370.field5212 = class504.field6906;
         class426.field5961 = class504.field6906;
         class173.field2157 = 0;
         class377.field5286 = 0;
         class456.field6251 = class635.field8973;
         class607.field8522 = class304.field4042;
         class480.field6633 = false;
      }

      class603.method4398((byte)126, class292.field3851);
      if (!class46.field528.field383) {
         class411 var33 = class46.field528.field381;

         for(class794 var34 = (class794)var33.method3110(-124); var34 != null; var34 = (class794)var33.method3114(2)) {
            var34.method5512((byte)-101);
            class42.method315(var34, false);
         }
      }

      if (class518.field7112) {
         for(int var35 = 0; var35 < class494.field6789; ++var35) {
            class166.field2104[var35].method5304(arg14, 2048, arg0);
         }
      }

      if (class100.field1284) {
         class600.field8378 = class292.field3851.method599();
         class292.field3851.method582(class473.field6565);
         int var36 = (class473.field6565[2] - class473.field6565[0]) / class756.field10968;

         for(int var37 = 0; var37 < class756.field10968 - 1; ++var37) {
            class245.field3064[var37] = (var37 + 1) * var36 + class530.field7271[var37];
         }

         for(int var38 = 0; var38 < class247.field3099.length; ++var38) {
            class247.field3099[var38].method3341();
         }
      }

      if (class194.field2364 != null) {
         if (class100.field1284) {
            class100.method910(0);
         }

         class530.method3827(true);
         class292.field3851.method501(-1, 1583160, 40, 127);
         class567.method4060(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class100.field1284) {
            class102.method921();
         }

         class292.field3851.method528();
         class530.method3827(false);
      }

      class567.method4060(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class100.field1284) {
         for(int var39 = 0; var39 < class398.field5594; ++var39) {
            class413.field5817[var39] = class505.field6922[var39];
         }

         class100.method910(0);

         for(int var40 = 0; var40 < class247.field3099.length; ++var40) {
            class247.field3099[var40].method3341();
         }
      }

      if (class100.field1284) {
         class102.method921();

         for(int var41 = 0; var41 < class398.field5594; ++var41) {
            class505.field6922[var41] = class413.field5817[var41];
         }

         if (class46.field533 == 2) {
            int var10002;
            if (class711.field10435[0] < class711.field10435[1]) {
               if (class530.field7271[0] + class245.field3064[0] > class473.field6565[0]) {
                  var10002 = class530.field7271[0]++;
               }
            } else if (class711.field10435[0] > class711.field10435[1] && class530.field7271[0] + class245.field3064[0] < class473.field6565[2]) {
               var10002 = class530.field7271[0]--;
            }
         }
      }

      if (!class476.field6583) {
         class426.field5961 = var19;
         class370.field5212 = var20;
      }

      class67.method636();
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1139(int arg0) {
      try {
         if (arg0 != 4355) {
            field1773 = null;
         }

         field1773 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1779[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1140(byte arg0) {
      try {
         ++field1777;
         this.field1778 = this.field1763 | this.field1778 << 8;
         int var2 = -78 % ((arg0 - 15) / 41);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1779[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method1141(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1771;

         while(true) {
            int var4 = arg0.method4288((byte)97);
            if (~var4 != -1) {
               this.method1142(arg0, var4, (byte)61);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = 101 % ((50 - arg1) / 60);
            break;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1779[1] + (arg0 != null ? field1779[2] : field1779[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Lwm;IB)V"
   )
   private final void method1142(class594 arg0, int arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         label114: {
            if (~arg1 == -2) {
               this.field1774 = class648.method4667(true, arg0.method4293(65));
               if (!var4) {
                  break label114;
               }
            }

            if (arg1 == 2) {
               this.field1775 = arg0.method4288((byte)115);
               if (!var4) {
                  break label114;
               }
            }

            if (~arg1 != -4) {
               if (arg1 == 5) {
                  this.field1772 = false;
                  if (!var4) {
                     break label114;
                  }
               }

               if (arg1 == 7) {
                  this.field1766 = class648.method4667(true, arg0.method4293(63));
                  if (!var4) {
                     break label114;
                  }
               }

               if (~arg1 != -9) {
                  if (arg1 != 9) {
                     if (arg1 != 10) {
                        if (~arg1 != -12) {
                           if (~arg1 == -13) {
                              this.field1762 = true;
                              if (!var4) {
                                 break label114;
                              }
                           }

                           if (~arg1 != -14) {
                              if (arg1 == 14) {
                                 this.field1776 = arg0.method4288((byte)102) << 2;
                                 if (!var4) {
                                    break label114;
                                 }
                              }

                              if (arg1 != 16) {
                                 break label114;
                              }

                              this.field1767 = arg0.method4288((byte)99);
                              if (!var4) {
                                 break label114;
                              }
                           }

                           this.field1764 = arg0.method4293(66);
                           if (!var4) {
                              break label114;
                           }
                        }

                        this.field1778 = arg0.method4288((byte)95);
                        if (!var4) {
                           break label114;
                        }
                     }

                     this.field1768 = false;
                     if (!var4) {
                        break label114;
                     }
                  }

                  this.field1769 = arg0.method4280(-19104) << 2;
                  if (!var4) {
                     break label114;
                  }
               }

               this.field1765.field6911 = this.field1763;
               if (!var4) {
                  break label114;
               }
            }

            this.field1775 = arg0.method4280(-19104);
            if (this.field1775 == 65535) {
               this.field1775 = -1;
            }
         }

         ++field1770;
         int var5 = -49 % ((-2 - arg2) / 48);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1779[4] + (arg0 != null ? field1779[2] : field1779[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1143(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1144(char[] arg0) {
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
            var10005 = 108;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
