import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class377 {
   @OriginalMember(
      owner = "client!eh",
      name = "i",
      descriptor = "Lvca;"
   )
   public class294 field5600;
   @OriginalMember(
      owner = "client!eh",
      name = "l",
      descriptor = "I"
   )
   public int field5593;
   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "I"
   )
   public int field5611;
   @OriginalMember(
      owner = "client!eh",
      name = "m",
      descriptor = "I"
   )
   public int field5598;
   @OriginalMember(
      owner = "client!eh",
      name = "e",
      descriptor = "I"
   )
   public int field5602;
   @OriginalMember(
      owner = "client!eh",
      name = "c",
      descriptor = "I"
   )
   public int field5601;
   @OriginalMember(
      owner = "client!eh",
      name = "t",
      descriptor = "B"
   )
   public byte field5610;
   @OriginalMember(
      owner = "client!eh",
      name = "j",
      descriptor = "I"
   )
   public int field5608;
   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5613 = new String[]{method2950(method2949("<l%6j")), method2950(method2949("\"*%\\?")), method2950(method2949("7qg\u001e")), method2950(method2949("<l%4j")), method2950(method2949("<l%N+7m\u007fLj")), method2950(method2949("<l%0j")), method2950(method2949("<l%5j")), method2950(method2949("<l%1j")), method2950(method2949("<l%3j")), method2950(method2949("<l%7j"))};
   @OriginalMember(
      owner = "client!eh",
      name = "s",
      descriptor = "I"
   )
   public static int field5604 = 1;
   @OriginalMember(
      owner = "client!eh",
      name = "v",
      descriptor = "[[I"
   )
   public static int[][] field5605 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!eh",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field5609 = new int[120];
   @OriginalMember(
      owner = "client!eh",
      name = "o",
      descriptor = "I"
   )
   public static int field5594;
   @OriginalMember(
      owner = "client!eh",
      name = "h",
      descriptor = "I"
   )
   public static int field5596;
   @OriginalMember(
      owner = "client!eh",
      name = "p",
      descriptor = "I"
   )
   public static int field5603;
   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "I"
   )
   public static int field5606;
   @OriginalMember(
      owner = "client!eh",
      name = "q",
      descriptor = "I"
   )
   public static int field5607;
   @OriginalMember(
      owner = "client!eh",
      name = "u",
      descriptor = "I"
   )
   public static int field5612;
   @OriginalMember(
      owner = "client!eh",
      name = "r",
      descriptor = "Lri;"
   )
   public class122 field5591;
   @OriginalMember(
      owner = "client!eh",
      name = "g",
      descriptor = "Lsa;"
   )
   public class214 field5592;
   @OriginalMember(
      owner = "client!eh",
      name = "n",
      descriptor = "Lui;"
   )
   public class239 field5599;
   @OriginalMember(
      owner = "client!eh",
      name = "k",
      descriptor = "Ltd;"
   )
   public static class476 field5597;
   @OriginalMember(
      owner = "client!eh",
      name = "f",
      descriptor = "Lnea;"
   )
   public class742 field5595;

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "([BIIIIII)V"
   )
   public static final void method2942(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         ++field5596;
         if (arg3 > 0 && !class756.method5476((byte)-63, arg3)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class756.method5476((byte)-63, arg2)) {
            throw new IllegalArgumentException("");
         } else if (arg1 > 116) {
            int var8 = class332.method2587(arg5, (byte)-93);
            int var9 = 0;
            int var10 = ~arg3 > ~arg2 ? arg3 : arg2;
            int var11 = arg3 >> 1;
            int var12 = arg2 >> 1;
            byte[] var13 = arg0;
            byte[] var14 = new byte[var8 * var12 * var11];

            while(true) {
               OpenGL.glTexImage2Dub(arg6, var9, arg4, arg3, arg2, 0, arg5, 5121, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label101: {
                  int var15 = arg3 * var8;
                  int var16 = 0;
                  byte[] var28;
                  if (var7) {
                     var10000 = var16;
                  } else if (~var16 <= ~var8) {
                     var28 = var14;
                     var14 = var13;
                     var13 = var28;
                     arg2 = var12;
                     arg3 = var11;
                     var11 >>= 1;
                     var10 >>= 1;
                     ++var9;
                     var10000 = var12 >> 1;
                     if (!var7) {
                        break label101;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var16 - -var15;
                     int var20 = 0;
                     if (var7 || var12 > var20) {
                        do {
                           label95: {
                              int var21 = 0;
                              if (var7) {
                                 var10000 = var13[var18];
                              } else if (var21 >= var11) {
                                 var18 += var15;
                                 var10000 = var15 + var19;
                                 if (!var7) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var13[var18];
                              }

                              while(true) {
                                 int var22 = var10000;
                                 int var23 = var8 + var18;
                                 int var24 = var13[var23] + var22;
                                 var18 = var8 + var23;
                                 int var25 = var13[var19] + var24;
                                 int var26 = var8 + var19;
                                 int var27 = var13[var26] + var25;
                                 var14[var17] = (byte)(var27 >> 2);
                                 var19 = var8 + var26;
                                 var17 += var8;
                                 ++var21;
                                 if (var21 >= var11) {
                                    var18 += var15;
                                    var10000 = var15 + var19;
                                    if (!var7) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var13[var18];
                                 }
                              }
                           }

                           var19 = var10000;
                           ++var20;
                        } while(var12 > var20);
                     }

                     ++var16;
                     if (~var16 <= ~var8) {
                        var28 = var14;
                        var14 = var13;
                        var13 = var28;
                        arg2 = var12;
                        arg3 = var11;
                        var11 >>= 1;
                        var10 >>= 1;
                        ++var9;
                        var10000 = var12 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var12 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field5613[3] + (arg0 != null ? field5613[1] : field5613[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2943(byte arg0) {
      try {
         if (arg0 != 3) {
            method2946((class200)null, 99);
         }

         ++field5594;
         return this.field5610 == 2 || this.field5610 == 3;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5613[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method2944(byte arg0, int arg1) {
      try {
         ++field5603;
         int var2 = -5 % ((arg0 - 51) / 54);
         return arg1 == 0 || ~arg1 == -2 || arg1 == 2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5613[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method2945(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         byte var4;
         label42: {
            ++field5607;
            if (~arg2 < -20001) {
               var4 = 4;
               class618.method4528(1);
               if (!var3) {
                  break label42;
               }
            }

            if (~arg2 < -10001) {
               var4 = 3;
               class281.method2196(2);
               if (!var3) {
                  break label42;
               }
            }

            if (arg2 > 5000) {
               var4 = 2;
               class452.method3408(1);
               if (!var3) {
                  break label42;
               }
            }

            var4 = 1;
            class461.method3459(true, (byte)-99);
         }

         if (arg1 != class510.field7454.field11145.method2098(false)) {
            class510.field7454.method5552(arg1, -103, class510.field7454.field11171);
            class363.method2847((byte)34, false, arg1);
         }

         if (arg0 != 5000) {
            method2948((byte)-6);
         }

         class14.method99(-100);
         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5613[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Lkk;I)V"
   )
   public static final void method2946(class200 arg0, int arg1) {
      try {
         arg0.method3540(class304.field4397.method1345(0), 898075920);
         ++field5606;
         arg0.method3540(class5.field55.method1345(0), arg1 + 898053854);
         arg0.method3540(class333.field4762.method1345(0), arg1 + 898053854);
         arg0.method3540(class244.field3512.method1345(0), 898075920);
         arg0.method3540(class421.field6129.method1345(0), 898075920);
         arg0.method3540(class515.field7506.method1345(arg1 + -22066), 898075920);
         arg0.method3540(class534.field7784.method1345(0), 898075920);
         arg0.method3540(class549.field7925.method1345(arg1 + -22066), 898075920);
         arg0.method3540(class392.field5782.method1345(arg1 ^ 22066), 898075920);
         arg0.method3540(class347.field4940.method1345(0), 898075920);
         arg0.method3540(class96.field1538.method1345(0), 898075920);
         arg0.method3540(class463.field6769.method1345(0), 898075920);
         arg0.method3540(class647.field9406.method1345(0), arg1 ^ 898095906);
         arg0.method3540(class329.field4702.method1345(arg1 ^ 22066), 898075920);
         arg0.method3540(class650.field9426.method1345(0), 898075920);
         arg0.method3540(class273.field3866.method1345(0), arg1 + 898053854);
         arg0.method3540(class311.field4482.method1345(arg1 + -22066), 898075920);
         arg0.method3540(class433.field6258.method1345(arg1 ^ arg1), 898075920);
         arg0.method3540(class115.field1859.method1345(0), arg1 ^ 898095906);
         arg0.method3540(class273.field3860.method1345(0), 898075920);
         arg0.method3540(class422.field6148.method1345(0), 898075920);
         arg0.method3540(class628.field9155.method1345(0), 898075920);
         arg0.method3540(class7.field73.method1345(0), 898075920);
         arg0.method3540(class392.field5783.method1345(0), 898075920);
         arg0.method3540(class729.field10490.method1345(0), 898075920);
         arg0.method3540(class684.field10069.method1345(0), arg1 + 898053854);
         arg0.method3540(class783.field11464.method1345(0), 898075920);
         arg0.method3540(class688.field10106.method1345(0), 898075920);
         arg0.method3540(class65.field1191.method1345(arg1 ^ 22066), 898075920);
         arg0.method3540(class513.field7480.method1345(0), 898075920);
         arg0.method3540(class63.field1166.method1345(0), 898075920);
         arg0.method3540(class169.field2640.method1345(0), 898075920);
         arg0.method3540(class15.method104(arg1 + -21965), arg1 + 898053854);
         arg0.method3540(class381.method2969(-111), 898075920);
         arg0.method3540(class347.field4944.method1345(0), arg1 + 898053854);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5613[8] + (arg0 != null ? field5613[1] : field5613[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2947(int arg0) {
      try {
         if (arg0 != -10001) {
            field5597 = null;
         }

         field5597 = null;
         field5605 = null;
         field5609 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5613[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2948(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field5612;
         class201.field3017.method3972(false);
         class193.field2905.method4683(arg0 ^ 24008);
         class604.field8696.method1143((byte)-127);
         class634.field9256.method2557(-21257);
         class373.field5547.method2064(12);
         class408.field5993.method841((byte)-92);
         class588.field8496.method3779((byte)-34);
         class760.field11030.method3420((byte)107);
         class440.field6431.method2071(-256);
         class516.field7514.method5500(16);
         class252.field3601.method1511(arg0 + 220);
         class424.field6167.method1732(128);
         class126.field2114.method5065((byte)75);
         class542.field7856.method3209(true);
         class681.field9992.method3918(false);
         class559.field8143.method3266(2);
         class300.field4199.method4155((byte)-125);
         class29.field455.method5156(false);
         class543.field7876.method3653(false);
         class549.field7930.method1854(122);
         class354.field4998.method194((byte)-73);
         class307.field4434.method5044((byte)94);
         class313.method2429((byte)102);
         class295.method2309(false);
         class673.method4921(121);
         class230.method1909(16);
         if (class628.field9136 != class409.field6010) {
            int var2 = 0;
            if (var1) {
               class376.field5586[var2] = null;
               ++var2;
            }

            while(true) {
               while(class376.field5586.length > var2) {
                  class376.field5586[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class468.field6821 = 0;
                  break;
               }

               ++var2;
            }
         }

         class314.method2436(false);
         class527.method3949((byte)-80);
         class741.method5342((byte)-117);
         class114.method1084(22443);
         class510.method3864(-14219);
         class161.field2557.method1589((byte)63);
         class444.field6473.method433();
         class302.method2354(-77);
         class237.method1943(arg0 ^ -102);
         class304.field4397.method1319(-88);
         class5.field55.method1319(arg0 + 10);
         class333.field4762.method1319(-99);
         class244.field3512.method1319(arg0 + 221);
         class421.field6129.method1319(108);
         class515.field7506.method1319(-101);
         class534.field7784.method1319(117);
         class549.field7925.method1319(-83);
         class392.field5782.method1319(-7);
         class347.field4940.method1319(arg0 + 216);
         class96.field1538.method1319(-73);
         class463.field6769.method1319(-58);
         class647.field9406.method1319(114);
         class329.field4702.method1319(108);
         class650.field9426.method1319(120);
         class273.field3866.method1319(arg0 ^ 103);
         class311.field4482.method1319(118);
         class433.field6258.method1319(-67);
         class115.field1859.method1319(124);
         class273.field3860.method1319(arg0 + 227);
         class422.field6148.method1319(arg0 ^ 97);
         class628.field9155.method1319(109);
         class7.field73.method1319(124);
         class392.field5783.method1319(arg0 + -12);
         class729.field10490.method1319(106);
         class684.field10069.method1319(114);
         class783.field11464.method1319(-95);
         class688.field10106.method1319(126);
         class65.field1191.method1319(-101);
         class513.field7480.method1319(-42);
         class63.field1166.method1319(arg0 ^ -20);
         class169.field2640.method1319(126);
         class347.field4944.method1319(arg0 ^ -27);
         if (arg0 != -102) {
            method2942((byte[])null, -15, 21, -74, 38, 48, -1);
         }

         class375.field5580.method1589((byte)46);
         class11.field112.method1589((byte)73);
         class530.field7713.method1589((byte)114);
         class217.field3287.method1589((byte)61);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5613[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "<init>",
      descriptor = "(BIIIIIILvca;)V"
   )
   public class377(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class294 arg7) {
      try {
         this.field5600 = arg7;
         this.field5593 = arg3;
         this.field5611 = arg4;
         this.field5598 = arg1;
         this.field5602 = arg6;
         this.field5601 = arg5;
         this.field5610 = arg0;
         this.field5608 = arg2;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5613[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5613[1] : field5613[2]) + ')');
      }
   }

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 120; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)(300.0D * Math.pow(2.0D, (double)var2 / 7.0D) + (double)var2);
         var0 += var3;
         field5609[var1] = var0 / 4;
      }

   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
