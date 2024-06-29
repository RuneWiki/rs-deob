import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class382 extends class76 {
   @OriginalMember(
      owner = "client!eh",
      name = "I",
      descriptor = "Lvga;"
   )
   public class94 field5508;
   @OriginalMember(
      owner = "client!eh",
      name = "L",
      descriptor = "Ldu;"
   )
   public class377 field5498;
   @OriginalMember(
      owner = "client!eh",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5509 = new String[]{method2891(method2890("xWJJG")), method2891(method2890("Z^\tnU=v\n1")), method2891(method2890("=s\u00051O")), method2891(method2890("!\u0010\u0007d\u0003#\u001f\u001c")), method2891(method2890("PZ\t1")), method2891(method2890("_\u0010\u0017+ hK^")), method2891(method2890("J~6E&Sx^+\"xR\u000by\u0016=J\u0017j\bx\u001f\u000b}\no\u001fR?\"_\u001eD[\u0003x^\u0017nOtQ\u0002d\u001dp\u001f\u0013c\u0000xI\u0001yOtLDy\nnO\u000be\u001ct]\bnO{P\u0016+\u001buZDh\u0000sK\u0001e\u001b2^\u0016n\u000e=F\u000b~O|M\u0001+\u001anV\nl@tQJ")), method2891(method2890("8\u0016")), method2891(method2890("QL^+")), method2891(method2890("sJ\bg")), method2891(method2890("=q4HU=")), method2891(method2890("[O\u00171")), method2891(method2890("xWJHG")), method2891(method2890("f\u0011J%\u0012")), method2891(method2890("=o\b1O")), method2891(method2890("QP\u0006i\u0016'\u001f-eU")), method2891(method2890("MP\br\u001c'\u001f")), method2891(method2890("=r\u000bo\nqL^+")), method2891(method2890("8\u001fL")), method2891(method2890("^^\u0007c\n'")), method2891(method2890("M^\u0016\u007f\u0006~S\u0001xU=")), method2891(method2890("=\u0010D")), method2891(method2890("!\\\u000bgR{Y];[-\u0001")), method2891(method2890("_\u0010\u0017")), method2891(method2890("RY\u0002c\n|O^")), method2891(method2890("xWJNG")), method2891(method2890("xWJIG")), method2891(method2890("xWJOG")), method2891(method2890("xWJ7\u0006sV\u00105G")), method2891(method2890("xWJMG"))};
   @OriginalMember(
      owner = "client!eh",
      name = "C",
      descriptor = "I"
   )
   public int field5495;
   @OriginalMember(
      owner = "client!eh",
      name = "N",
      descriptor = "I"
   )
   public int field5496;
   @OriginalMember(
      owner = "client!eh",
      name = "O",
      descriptor = "I"
   )
   public static int field5497;
   @OriginalMember(
      owner = "client!eh",
      name = "D",
      descriptor = "I"
   )
   public static int field5499;
   @OriginalMember(
      owner = "client!eh",
      name = "A",
      descriptor = "I"
   )
   public static int field5501;
   @OriginalMember(
      owner = "client!eh",
      name = "B",
      descriptor = "I"
   )
   public int field5502;
   @OriginalMember(
      owner = "client!eh",
      name = "G",
      descriptor = "I"
   )
   public static int field5503;
   @OriginalMember(
      owner = "client!eh",
      name = "E",
      descriptor = "I"
   )
   public static int field5504;
   @OriginalMember(
      owner = "client!eh",
      name = "F",
      descriptor = "I"
   )
   public static int field5505;
   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "I"
   )
   public int field5506;
   @OriginalMember(
      owner = "client!eh",
      name = "M",
      descriptor = "I"
   )
   public int field5507;
   @OriginalMember(
      owner = "client!eh",
      name = "K",
      descriptor = "Lbg;"
   )
   public static class492 field5500;

   @OriginalMember(
      owner = "client!eh",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2884(byte arg0) {
      try {
         this.field5495 = this.field5508.field1218;
         ++field5503;
         this.field5506 = this.field5508.field1212;
         this.field5502 = this.field5508.field1211;
         if (this.field5508.field1213 != null) {
            this.field5508.field1213.method1222(this.field5498.field5451, this.field5498.field5436, this.field5498.field5444, class529.field7558);
         }

         this.field5507 = class529.field7558[0];
         if (arg0 >= 94) {
            this.field5496 = class529.field7558[2];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5509[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2885(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field5499;
         if (~class83.field1078 != 0 && class69.field853 != -1) {
            label71: {
               int var2 = ((class517.field7460 - class541.field7760) * class76.field953 >> 16) + class541.field7760;
               class76.field953 += var2;
               if (class76.field953 >= 65535) {
                  label68: {
                     class76.field953 = 65535;
                     if (class676.field9794) {
                        class299.field4094 = false;
                        if (!var1) {
                           break label68;
                        }
                     }

                     class299.field4094 = true;
                  }

                  class676.field9794 = true;
                  if (!var1) {
                     break label71;
                  }
               }

               class299.field4094 = false;
               class676.field9794 = false;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label49: {
               var3 = (float)class76.field953 / 65535.0F;
               var4 = new float[3];
               var5 = class175.field2410 * 2;
               int var6 = arg0;
               if (var1) {
                  var10000 = class397.field5734[class83.field1078][var5][arg0] * 3;
               } else if (arg0 >= 3) {
                  class224.field3188 = (int)var4[0] + -(class672.field9740 * 512);
                  class421.field6021 = (int)var4[1] * -1;
                  class782.field11465 = (int)var4[2] + -(class533.field7595 * 512);
                  var14 = new float[3];
                  var15 = class124.field1616 * 2;
                  var10000 = 0;
                  if (!var1) {
                     break label49;
                  }
               } else {
                  var10000 = class397.field5734[class83.field1078][var5][arg0] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class397.field5734[class83.field1078][var5 + 1][var6] * 3;
                  int var9 = (class397.field5734[class83.field1078][var5 + 2][var6] + -class397.field5734[class83.field1078][var5 + 3][var6] + class397.field5734[class83.field1078][var5 + 2][var6]) * 3;
                  int var10 = class397.field5734[class83.field1078][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = -(var8 * 2) + var7 + var9;
                  int var13 = -var9 + var8 + class397.field5734[class83.field1078][var5 + 2][var6] - var10;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (var6 >= 3) {
                     class224.field3188 = (int)var4[0] + -(class672.field9740 * 512);
                     class421.field6021 = (int)var4[1] * -1;
                     class782.field11465 = (int)var4[2] + -(class533.field7595 * 512);
                     var14 = new float[3];
                     var15 = class124.field1616 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var10000 = class397.field5734[class83.field1078][var5][var6] * 3;
                  }
               }
            }

            int var16 = var10000;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (var1) {
               var17 = class397.field5734[class69.field853][var15][var16] * 3;
               var18 = class397.field5734[class69.field853][var15 + 1][var16] * 3;
               var19 = (-class397.field5734[class69.field853][var15 + 3][var16] - -class397.field5734[class69.field853][var15 + 2][var16] + class397.field5734[class69.field853][var15 + 2][var16]) * 3;
               var20 = class397.field5734[class69.field853][var15][var16];
               var21 = -var17 + var18;
               var22 = var17 - var18 * 2 + var19;
               var23 = class397.field5734[class69.field853][var15 + 2][var16] - (var20 - var18) + -var19;
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }

            while(true) {
               if (~var16 <= -4) {
                  float var24 = var14[0] + -var4[0];
                  float var25 = (var14[1] + -var4[1]) * -1.0F;
                  float var26 = var14[2] + -var4[2];
                  double var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                  class207.field2966 = 16383 & (int)(Math.atan2((double)var25, var27) * 2607.5945876176133D);
                  class10.field96 = 16383 & (int)(-Math.atan2((double)var24, (double)var26) * 2607.5945876176133D);
                  var10000 = ((class397.field5734[class83.field1078][var5 + 2][3] + -class397.field5734[class83.field1078][var5][3]) * class76.field953 >> 16) + class397.field5734[class83.field1078][var5][3];
                  if (!var1) {
                     class723.field10552 = var10000;
                     return;
                  }
               } else {
                  var10000 = class397.field5734[class69.field853][var15][var16] * 3;
               }

               var17 = var10000;
               var18 = class397.field5734[class69.field853][var15 + 1][var16] * 3;
               var19 = (-class397.field5734[class69.field853][var15 + 3][var16] - -class397.field5734[class69.field853][var15 + 2][var16] + class397.field5734[class69.field853][var15 + 2][var16]) * 3;
               var20 = class397.field5734[class69.field853][var15][var16];
               var21 = -var17 + var18;
               var22 = var17 - var18 * 2 + var19;
               var23 = class397.field5734[class69.field853][var15 + 2][var16] - (var20 - var18) + -var19;
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field5509[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(III[Lbl;ZIIIIII)V"
   )
   public static final void method2886(int arg0, int arg1, int arg2, class678[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4360;

      try {
         ++field5497;
         class383.field5543.method592(arg0, arg10, arg2, arg6);
         if (arg9 == 8822) {
            int var12 = 0;
            if (var11 || arg3.length > var12) {
               do {
                  class678 var13 = arg3[var12];
                  if (var13 != null && (~var13.field9892 == ~arg1 || ~arg1 == 1412584498 && (class182.field2549 == var13 || var11))) {
                     int var14;
                     int var15;
                     int var16;
                     int var17;
                     int var18;
                     label975: {
                        var14 = var13.field9879 + arg8;
                        var15 = var13.field9820 - -arg7;
                        var16 = var14 + 1 - -var13.field9904;
                        var17 = var13.field9980 - -1 + var15;
                        if (~arg5 != 0) {
                           var18 = arg5;
                           if (!var11) {
                              break label975;
                           }
                        }

                        class763.field11268[class425.field6085].setBounds(var13.field9879 + arg8, var13.field9820 + arg7, var13.field9904, var13.field9980);
                        var18 = class425.field6085++;
                     }

                     var13.field9950 = var18;
                     var13.field9939 = class96.field1234;
                     if (!client.method2352(var13)) {
                        label1027: {
                           if (var13.field9865 != 0) {
                              class127.method1013(0, var13);
                           }

                           int var19 = var13.field9879 - -arg8;
                           int var20 = var13.field9820 + arg7;
                           int var21 = 0;
                           int var22 = 0;
                           if (class681.field10034) {
                              var21 = class85.method755((byte)-94);
                              var22 = class592.method4305((byte)107);
                           }

                           int var23 = var13.field9871;
                           if (class661.field9629 && (client.method2351(var13).field3965 != 0 || var13.field9992 == 0) && ~var23 < -128) {
                              var23 = 127;
                           }

                           if (class182.field2549 == var13) {
                              if (arg1 != -1412584499 && (class747.field10992 == var13.field9931 || class644.field9402 == var13.field9931)) {
                                 class555.field7972 = arg7;
                                 class442.field6305 = arg8;
                                 class662.field9637 = arg3;
                                 if (!var11) {
                                    break label1027;
                                 }
                              }

                              if (class73.field905 && class418.field6000) {
                                 int var24 = var21 + class611.field8968.method1660(false);
                                 int var25 = class611.field8968.method1659((byte)-6) + var22;
                                 int var26 = var24 - class252.field3439;
                                 int var27 = var25 - class741.field10809;
                                 if (class286.field3958 > var26) {
                                    var26 = class286.field3958;
                                 }

                                 if (~class283.field3921 < ~var27) {
                                    var27 = class283.field3921;
                                 }

                                 if (class286.field3958 - -class368.field5038.field9904 < var13.field9904 + var26) {
                                    var26 = class286.field3958 - -class368.field5038.field9904 - var13.field9904;
                                 }

                                 var19 = var26;
                                 if (~(class283.field3921 + class368.field5038.field9980) > ~(var27 - -var13.field9980)) {
                                    var27 = class283.field3921 - -class368.field5038.field9980 - var13.field9980;
                                 }

                                 var20 = var27;
                              }

                              if (class644.field9402 == var13.field9931) {
                                 var23 = 128;
                              }
                           }

                           int var30;
                           int var31;
                           int var32;
                           int var33;
                           label951: {
                              if (~var13.field9992 != -3) {
                                 int var28 = var19 - -var13.field9904;
                                 int var29 = var13.field9980 + var20;
                                 var30 = var20 > arg10 ? var20 : arg10;
                                 var31 = ~var19 >= ~arg0 ? arg0 : var19;
                                 if (var13.field9992 == 9) {
                                    ++var28;
                                    ++var29;
                                 }

                                 var32 = arg6 <= var29 ? arg6 : var29;
                                 var33 = ~arg2 < ~var28 ? var28 : arg2;
                                 if (!var11) {
                                    break label951;
                                 }
                              }

                              var32 = arg6;
                              var33 = arg2;
                              var30 = arg10;
                              var31 = arg0;
                           }

                           if (~var31 > ~var33 && (var30 < var32 || var11)) {
                              label1063: {
                                 if (~var13.field9865 != -1) {
                                    if (class340.field4621 == var13.field9865 || ~class477.field6864 == ~var13.field9865) {
                                       class510.method3703(var13, var19, arg9 ^ 8829, var20);
                                       if (!class681.field10034) {
                                          class153.method1281(var13.field9904, var19, var13.field9980, -1, var20, ~class477.field6864 == ~var13.field9865);
                                          class383.field5543.method592(arg0, arg10, arg2, arg6);
                                       }

                                       class188.field2673[var18] = true;
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (~class720.field10513 == ~var13.field9865) {
                                       if (var13.method4930(false, class383.field5543) == null) {
                                          break label1063;
                                       }

                                       class581.method4207(50);
                                       class178.method1427(-31375, var20, class383.field5543, var19, var13);
                                       class301.field4123[var18] = true;
                                       class383.field5543.method592(arg0, arg10, arg2, arg6);
                                       if (!class681.field10034) {
                                          break label1063;
                                       }

                                       if (arg4) {
                                          class193.method1520(var15, -113, var17, var16, var14);
                                          if (!var11) {
                                             break label1063;
                                          }
                                       }

                                       class387.method2937(var14, var16, var15, (byte)-121, var17);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class292.field4038 == var13.field9865) {
                                       class351.method2557(var19, var20, -477732026, class383.field5543, var13);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class552.field7923 == var13.field9865) {
                                       class244.method1857(var13, var20, var13.field9949 % 64, 86, var19, class383.field5543);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class542.field7783 == var13.field9865) {
                                       if (var13.method4930(false, class383.field5543) == null) {
                                          break label1063;
                                       }

                                       class358.method2682(var19, var13, -83, var20);
                                       class301.field4123[var18] = true;
                                       class383.field5543.method592(arg0, arg10, arg2, arg6);
                                       if (!class681.field10034) {
                                          break label1063;
                                       }

                                       if (!arg4) {
                                          class387.method2937(var14, var16, var15, (byte)-126, var17);
                                          if (!var11) {
                                             break label1063;
                                          }
                                       }

                                       class193.method1520(var15, -105, var17, var16, var14);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class94.field1223 == var13.field9865) {
                                       class198.method1566(var19, (byte)-120, var13.field9980, class271.field3742, var20, class383.field5543, var13.field9904);
                                       class188.field2673[var18] = true;
                                       class383.field5543.method592(arg0, arg10, arg2, arg6);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class776.field11383 == var13.field9865) {
                                       class412.method3093(var20, var13.field9980, var19, var13.field9904, class383.field5543, false);
                                       class188.field2673[var18] = true;
                                       class383.field5543.method592(arg0, arg10, arg2, arg6);
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }

                                    if (class363.field5000 == var13.field9865) {
                                       if (!class753.field11135 && !class102.field1313) {
                                          break label1063;
                                       }

                                       int var34 = var13.field9904 + var19;
                                       if (class681.field10034) {
                                          label1040: {
                                             if (!arg4) {
                                                class387.method2937(var14, var16, var15, (byte)-116, var17);
                                                if (!var11) {
                                                   break label1040;
                                                }
                                             }

                                             class193.method1520(var15, arg9 ^ -8732, var17, var16, var14);
                                          }
                                       }

                                       int var35 = var20 + 15;
                                       if (class753.field11135) {
                                          int var36 = -256;
                                          if (~class108.field1348 > -21) {
                                             var36 = -65536;
                                          }

                                          class427.field6124.method624(var34, var35, -1, arg9 ^ 8822, field5509[11] + class108.field1348, var36);
                                          var35 += 15;
                                          Runtime var37 = Runtime.getRuntime();
                                          int var38 = (int)((var37.totalMemory() + -var37.freeMemory()) / 1024L);
                                          int var39 = -256;
                                          if (var38 > 98304) {
                                             if (class779.field11416) {
                                                class276.method2100(0);
                                                int var40 = 0;
                                                if (var11) {
                                                   System.gc();
                                                   ++var40;
                                                }

                                                while(true) {
                                                   while(~var40 > -11) {
                                                      System.gc();
                                                      ++var40;
                                                   }

                                                   var38 = (int)((var37.totalMemory() - var37.freeMemory()) / 1024L);
                                                   if (!var11) {
                                                      if (var38 > 65536) {
                                                         class684.method4989(field5509[6], 4, 4095);
                                                      }

                                                      var39 = -65536;
                                                      break;
                                                   }

                                                   ++var40;
                                                }
                                             } else {
                                                var39 = -65536;
                                             }
                                          }

                                          class427.field6124.method624(var34, var35, -1, arg9 ^ 8822, field5509[4] + var38 + "k", var39);
                                          var35 += 15;
                                          class427.field6124.method624(var34, var35, -1, 0, field5509[1] + class430.field6150.field111 + field5509[5] + class430.field6150.field118 + field5509[23], -256);
                                          var35 += 15;
                                          class427.field6124.method624(var34, var35, -1, 0, field5509[15] + class430.field6143.field111 + field5509[5] + class430.field6143.field118 + field5509[23], -256);
                                          var35 += 15;
                                          int var41 = class383.field5543.method545() / 1024;
                                          class427.field6124.method624(var34, var35, -1, 0, field5509[24] + var41 + "k", ~var41 < -65537 ? -65536 : -256);
                                          var35 += 15;
                                          int var42 = 0;
                                          int var43 = 0;
                                          int var44 = 0;
                                          int var45 = 0;
                                          if (var11) {
                                             if (class101.field1295[var45] != null) {
                                                var42 += class101.field1295[var45].method3540(30971);
                                                var43 += class101.field1295[var45].method3541(false);
                                                var44 += class101.field1295[var45].method3548(true);
                                             }

                                             ++var45;
                                          }

                                          while(true) {
                                             while(~var45 > -38) {
                                                if (class101.field1295[var45] != null) {
                                                   var42 += class101.field1295[var45].method3540(30971);
                                                   var43 += class101.field1295[var45].method3541(false);
                                                   var44 += class101.field1295[var45].method3548(true);
                                                }

                                                ++var45;
                                             }

                                             int var46 = var44 * 100 / var42;
                                             int var47 = var43 * 10000 / var42;
                                             String var48 = field5509[19] + class691.method5044(2, true, 0, 92, (long)var47) + field5509[18] + var46 + field5509[7];
                                             class215.field3075.method624(var34, var35, -1, 0, var48, -256);
                                             if (!var11) {
                                                var35 += 12;
                                                break;
                                             }

                                             ++var45;
                                          }
                                       }

                                       if (class22.field255 > 0) {
                                          class215.field3075.method624(var34, var35, -1, arg9 ^ 8822, field5509[20] + class552.field7915 + field5509[21] + class22.field255, -256);
                                       }

                                       var35 += 12;
                                       if (class102.field1313) {
                                          class215.field3075.method624(var34, var35, -1, arg9 + -8822, field5509[16] + class383.field5543.method563() + field5509[17] + class383.field5543.method524(), -256);
                                          var35 += 12;
                                          class215.field3075.method624(var34, var35, -1, arg9 + -8822, field5509[8] + class136.field1729 + field5509[2] + class292.field4042 + field5509[10] + class209.field2975 + field5509[14] + class110.field1389, -256);
                                          class103.method856(arg9 ^ 8726);
                                          var35 += 12;
                                       }

                                       class188.field2673[var18] = true;
                                       if (!var11) {
                                          break label1063;
                                       }
                                    }
                                 }

                                 if (~var13.field9992 == -1) {
                                    if (~class93.field1205 == ~var13.field9865 && class383.field5543.method528()) {
                                       class383.field5543.method575(var19, var20, var13.field9904, var13.field9980);
                                    }

                                    method2886(var31, var13.field9854, var33, arg3, arg4, var18, var32, -var13.field9991 + var20, var19 - var13.field9864, arg9, var30);
                                    if (var13.field9840 != null) {
                                       method2886(var31, var13.field9854, var33, var13.field9840, arg4, var18, var32, var20 - var13.field9991, -var13.field9864 + var19, arg9, var30);
                                    }

                                    class561 var49 = (class561)class191.field2708.method329((byte)-111, (long)var13.field9854);
                                    if (var49 != null) {
                                       class397.method3000(var18, var20, var30, var32, var49.field8021, var19, var31, var33, (byte)39);
                                    }

                                    if (~class93.field1205 == ~var13.field9865 && class383.field5543.method528()) {
                                       class383.field5543.method609();
                                    }

                                    class383.field5543.method592(arg0, arg10, arg2, arg6);
                                 }

                                 if (class299.field4092[var18] || ~class368.field5029 < -2) {
                                    label1082: {
                                       if (var13.field9992 == 3) {
                                          label1005: {
                                             if (~var23 == -1) {
                                                if (!var13.field9957) {
                                                   class383.field5543.method608(var19, var20, var13.field9904, var13.field9980, var13.field9949, 0);
                                                   if (!var11) {
                                                      break label1005;
                                                   }
                                                }

                                                class383.field5543.method496(var19, var20, var13.field9904, var13.field9980, var13.field9949, 0);
                                                if (!var11) {
                                                   break label1005;
                                                }
                                             }

                                             if (!var13.field9957) {
                                                class383.field5543.method608(var19, var20, var13.field9904, var13.field9980, -(255 & var23) + 255 << 24 | var13.field9949 & 16777215, 1);
                                                if (!var11) {
                                                   break label1005;
                                                }
                                             }

                                             class383.field5543.method496(var19, var20, var13.field9904, var13.field9980, 16777215 & var13.field9949 | -(var23 & 255) + 255 << 24, 1);
                                          }

                                          if (!class681.field10034) {
                                             break label1082;
                                          }

                                          if (!arg4) {
                                             class387.method2937(var14, var16, var15, (byte)-121, var17);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          class193.method1520(var15, -107, var17, var16, var14);
                                          if (!var11) {
                                             break label1082;
                                          }
                                       }

                                       if (~var13.field9992 == -5) {
                                          class67 var50 = var13.method4938(class383.field5543, 0);
                                          if (var50 == null) {
                                             if (!class403.field5821) {
                                                break label1082;
                                             }

                                             class743.method5384(var13, (byte)-22);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          int var51 = var13.field9949;
                                          String var52 = var13.field9915;
                                          if (~var13.field9912 != 0) {
                                             class358 var53 = class468.field6728.method2261(-1, var13.field9912);
                                             var52 = var53.field4830;
                                             if (var52 == null) {
                                                var52 = field5509[9];
                                             }

                                             if ((var53.field4854 == 1 || ~var13.field9928 != -2) && var13.field9928 != -1) {
                                                var52 = field5509[22] + var52 + field5509[3] + class588.method4281(var13.field9928, (byte)3);
                                             }
                                          }

                                          if (var13.field9843 != -1) {
                                             var52 = class494.method3588((byte)33, var13.field9843);
                                             if (var52 == null) {
                                                var52 = "";
                                             }
                                          }

                                          if (class602.field8848 == var13) {
                                             var52 = class180.field2510.method1437(class608.field8920, 50);
                                             var51 = var13.field9949;
                                          }

                                          if (class96.field1235) {
                                             class383.field5543.method547(var19, var20, var19 - -var13.field9904, var13.field9980 + var20);
                                          }

                                          var50.method628(0, class432.field6169, var19, var13.field9966, (byte)-41, (int[])null, var13.field9842, var13.field9916, var13.field9980, var13.field9890, 0, !var13.field9868 ? -1 : -(var23 & 255) + 255 << 24, var13.field9904, var52, (class515)null, var20, -(var23 & 255) + 255 << 24 | var51);
                                          if (class96.field1235) {
                                             class383.field5543.method592(arg0, arg10, arg2, arg6);
                                          }

                                          if (var52.trim().length() <= 0) {
                                             break label1082;
                                          }

                                          if (!class96.field1235) {
                                             class206 var54 = class264.method2020(class383.field5543, var13.field9847, (byte)48);
                                             int var55 = var54.method1630((byte)-84, var52, var13.field9904, class432.field6169);
                                             int var56 = var54.method1637(var52, arg9 ^ -8823, var13.field9890, var13.field9904, class432.field6169);
                                             if (!class681.field10034) {
                                                break label1082;
                                             }

                                             if (arg4) {
                                                class193.method1520(var20, -102, var20 - -var56, var19 + var55, var19);
                                                if (!var11) {
                                                   break label1082;
                                                }
                                             }

                                             class387.method2937(var19, var19 + var55, var20, (byte)-122, var20 - -var56);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          if (!class681.field10034) {
                                             break label1082;
                                          }

                                          if (!arg4) {
                                             class387.method2937(var14, var16, var15, (byte)-118, var17);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          class193.method1520(var15, -83, var17, var16, var14);
                                          if (!var11) {
                                             break label1082;
                                          }
                                       }

                                       if (~var13.field9992 == -6) {
                                          label849: {
                                             if (~var13.field9829 > -1) {
                                                class492 var57;
                                                label1011: {
                                                   if (~var13.field9912 == 0) {
                                                      if (~var13.field9843 != 0) {
                                                         var57 = class3.method14((byte)0, var13.field9843, class383.field5543);
                                                         if (!var11) {
                                                            break label1011;
                                                         }
                                                      }

                                                      var57 = var13.method4931(class383.field5543, 73);
                                                      if (!var11) {
                                                         break label1011;
                                                      }
                                                   }

                                                   class651 var58 = var13.field9908 ? class564.field8045.field1571 : null;
                                                   var57 = class468.field6728.method2258(var13.field9873, var13.field9866, -1, var13.field9928, var13.field9912, -16777216 | var13.field9858, var58, class383.field5543);
                                                }

                                                if (var57 == null) {
                                                   if (!class403.field5821) {
                                                      break label849;
                                                   }

                                                   class743.method5384(var13, (byte)-101);
                                                   if (!var11) {
                                                      break label849;
                                                   }
                                                }

                                                int var59 = var57.method960();
                                                int var60 = var57.method957();
                                                int var61 = (~var13.field9949 == -1 ? 16777215 : 16777215 & var13.field9949) | -(255 & var23) + 255 << 24;
                                                if (!var13.field9897) {
                                                   if (var13.field9949 != 0 || ~var23 != -1) {
                                                      if (~var13.field9821 != -1) {
                                                         var57.method3572((float)var13.field9904 / 2.0F + (float)var19, (float)var13.field9980 / 2.0F + (float)var20, var13.field9904 * 4096 / var59, var13.field9821, 0, var61, 1);
                                                         if (!var11) {
                                                            break label849;
                                                         }
                                                      }

                                                      if (~var13.field9904 == ~var59 && var13.field9980 == var60) {
                                                         var57.method429(var19, var20, 0, var61, 1);
                                                         if (!var11) {
                                                            break label849;
                                                         }
                                                      }

                                                      var57.method3570(var19, var20, var13.field9904, var13.field9980, 0, var61, 1);
                                                      if (!var11) {
                                                         break label849;
                                                      }
                                                   }

                                                   if (~var13.field9821 != -1) {
                                                      var57.method3579((float)var13.field9904 / 2.0F + (float)var19, (float)var13.field9980 / 2.0F + (float)var20, var13.field9904 * 4096 / var59, var13.field9821);
                                                      if (!var11) {
                                                         break label849;
                                                      }
                                                   }

                                                   if (~var13.field9904 == ~var59 && ~var13.field9980 == ~var60) {
                                                      var57.method3575(var19, var20);
                                                      if (!var11) {
                                                         break label849;
                                                      }
                                                   }

                                                   var57.method3577(var19, var20, var13.field9904, var13.field9980);
                                                   if (!var11) {
                                                      break label849;
                                                   }
                                                }

                                                label1014: {
                                                   class383.field5543.method547(var19, var20, var13.field9904 + var19, var13.field9980 + var20);
                                                   if (~var13.field9821 == -1) {
                                                      if (var13.field9949 == 0 && ~var23 == -1) {
                                                         var57.method3569(var19, var20, var13.field9904, var13.field9980);
                                                         if (!var11) {
                                                            break label1014;
                                                         }
                                                      }

                                                      var57.method966(var19, var20, var13.field9904, var13.field9980, 0, var61, 1);
                                                      if (!var11) {
                                                         break label1014;
                                                      }
                                                   }

                                                   int var62 = (var59 - (1 - var13.field9904)) / var59;
                                                   int var63 = (var13.field9980 + var60 + -1) / var60;
                                                   int var64 = 0;
                                                   if (var11 || ~var64 > ~var62) {
                                                      do {
                                                         int var65 = 0;
                                                         if (var11) {
                                                            if (var13.field9949 == 0) {
                                                               var57.method3579((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821);
                                                               if (var11) {
                                                                  var57.method3572((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821, 0, var61, 1);
                                                                  ++var65;
                                                               } else {
                                                                  ++var65;
                                                               }
                                                            } else {
                                                               var57.method3572((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821, 0, var61, 1);
                                                               ++var65;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var65 > ~var63) {
                                                               if (var13.field9949 == 0) {
                                                                  var57.method3579((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821);
                                                                  if (var11) {
                                                                     var57.method3572((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821, 0, var61, 1);
                                                                     ++var65;
                                                                  } else {
                                                                     ++var65;
                                                                  }
                                                               } else {
                                                                  var57.method3572((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821, 0, var61, 1);
                                                                  ++var65;
                                                               }
                                                            }

                                                            if (!var11) {
                                                               ++var64;
                                                               break;
                                                            }

                                                            var57.method3572((float)var59 / 2.0F + (float)(var59 * var64 + var19), (float)var60 / 2.0F + (float)(var60 * var65 + var20), 4096, var13.field9821, 0, var61, 1);
                                                            ++var65;
                                                         }
                                                      } while(~var64 > ~var62);
                                                   }
                                                }

                                                class383.field5543.method592(arg0, arg10, arg2, arg6);
                                                if (!var11) {
                                                   break label849;
                                                }
                                             }

                                             var13.method4939((byte)72, class685.field10097, class426.field6104).method3890(0, 0, 109, var13.field9980, var13.field9904, var19, var13.field9884 << 3, var20, class383.field5543, var13.field9959 << 3);
                                          }

                                          if (!class681.field10034) {
                                             break label1082;
                                          }

                                          if (!arg4) {
                                             class387.method2937(var14, var16, var15, (byte)-127, var17);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          class193.method1520(var15, arg9 ^ -8758, var17, var16, var14);
                                          if (!var11) {
                                             break label1082;
                                          }
                                       }

                                       if (var13.field9992 == 6) {
                                          class655.method4797(arg9 + -8823);
                                          Object var66 = null;
                                          class500 var67 = null;
                                          int var68 = 0;
                                          if (var13.field9912 != -1) {
                                             class358 var69 = class468.field6728.method2261(-1, var13.field9912);
                                             if (var69 != null) {
                                                class358 var70 = var69.method2666((byte)127, var13.field9928);
                                                class85 var71 = ~var13.field9855 != 0 ? class190.field2702.method4411(var13.field9855, 118) : null;
                                                class651 var72 = var13.field9908 ? class564.field8045.field1571 : null;
                                                var67 = var70.method2683(var13.field9886, class383.field5543, var13.field9869, var72, 127, 1, var71, var13.field9862, 2048);
                                                if (var67 != null) {
                                                   var68 = -var67.method226() >> 1;
                                                   if (var11) {
                                                      class743.method5384(var13, (byte)-98);
                                                   }
                                                } else {
                                                   class743.method5384(var13, (byte)-98);
                                                }
                                             }
                                          } else if (var13.field9874 != 5) {
                                             if (var13.field9874 != 8 && ~var13.field9874 != -10) {
                                                if (~var13.field9855 != 0) {
                                                   class85 var76 = class190.field2702.method4411(var13.field9855, 123);
                                                   var67 = var13.method4934(class780.field11425, class21.field248, (class164)var66, class383.field5543, var13.field9886, 2048, var13.field9862, var76, class564.field8045.field1571, class195.field2761, class190.field2702, (byte)45, var13.field9869, class427.field6121, class468.field6728);
                                                   if (var67 == null && class403.field5821) {
                                                      class743.method5384(var13, (byte)-94);
                                                   }
                                                } else {
                                                   var67 = var13.method4934(class780.field11425, class21.field248, (class164)var66, class383.field5543, -1, 2048, 0, (class85)null, class564.field8045.field1571, class195.field2761, class190.field2702, (byte)45, -1, class427.field6121, class468.field6728);
                                                   if (var67 == null && class403.field5821) {
                                                      class743.method5384(var13, (byte)-92);
                                                   }
                                                }
                                             } else {
                                                class111 var73 = class616.method4475(var13.field9994, false, (byte)-90);
                                                class85 var74 = ~var13.field9855 == 0 ? null : class190.field2702.method4411(var13.field9855, arg9 ^ 8731);
                                                if (var73 != null) {
                                                   class651 var75 = !var13.field9908 ? null : class564.field8045.field1571;
                                                   var67 = var73.method904(var13.field9869, var13.field9885, var75, var13.field9874 == 9, var74, var13.field9862, var13.field9886, false, class383.field5543, 2048);
                                                }
                                             }
                                          } else {
                                             int var77 = var13.field9994;
                                             if (~var77 <= -1 && var77 < 2048) {
                                                class121 var78 = class380.field5483[var77];
                                                class85 var79 = var13.field9855 == -1 ? null : class190.field2702.method4411(var13.field9855, 113);
                                                if (var78 != null && (class358.field4891 == var77 || ~class22.method134(-13, var78.field1575) == ~var13.field9885)) {
                                                   var67 = var78.field1571.method4770(0, class780.field11425, (int[])null, class21.field248, class383.field5543, class195.field2761, (class100[])null, 0, class427.field6121, -1, class452.field6400, class190.field2702, (byte)122, class468.field6728, 2048, var13.field9886, var13.field9869, (class85)null, true, var13.field9862, var79, 0);
                                                }
                                             }
                                          }

                                          if (var67 != null) {
                                             int var80;
                                             label722: {
                                                if (~var13.field9934 >= -1) {
                                                   var80 = 512;
                                                   if (!var11) {
                                                      break label722;
                                                   }
                                                }

                                                var80 = (var13.field9904 << 9) / var13.field9934;
                                             }

                                             int var81;
                                             if (~var13.field9877 < -1) {
                                                var81 = (var13.field9980 << 9) / var13.field9877;
                                                if (var11) {
                                                   var81 = 512;
                                                }
                                             } else {
                                                var81 = 512;
                                             }

                                             int var82 = var13.field9904 / 2 + var19;
                                             int var83 = var13.field9980 / 2 + var20;
                                             if (!var13.field9891) {
                                                var82 += var13.field9993 * var80 >> 9;
                                                var83 += var13.field9849 * var81 >> 9;
                                             }

                                             class89.field1160.method1220();
                                             class383.field5543.method532(class89.field1160);
                                             class383.field5543.method492(var82, var83, var80, var81);
                                             class383.field5543.method523();
                                             if (var13.field9969) {
                                                class383.field5543.method493(false);
                                             }

                                             label713: {
                                                if (var13.field9891) {
                                                   class405.field5861.method1224(var13.field9943);
                                                   class405.field5861.method1223(var13.field9990);
                                                   class405.field5861.method1229(var13.field9819);
                                                   class405.field5861.method1215(var13.field9993, var13.field9849, var13.field9977);
                                                   if (!var11) {
                                                      break label713;
                                                   }
                                                }

                                                int var84 = (var13.field9962 << 2) * class363.field4956[var13.field9943 << 3] >> 14;
                                                int var85 = (var13.field9962 << 2) * class363.field4987[var13.field9943 << 3] >> 14;
                                                class405.field5861.method1221(-var13.field9819 << 3);
                                                class405.field5861.method1223(var13.field9990 << 3);
                                                class405.field5861.method1215(var13.field9930 << 2, (var13.field9917 << 2) + var84 + var68, (var13.field9917 << 2) + var85);
                                                class405.field5861.method1228(var13.field9943 << 3);
                                             }

                                             var13.method4929(var67, (byte)48, class405.field5861, class96.field1234, class383.field5543);
                                             if (class96.field1235) {
                                                class383.field5543.method547(var19, var20, var13.field9904 + var19, var13.field9980 + var20);
                                             }

                                             label1023: {
                                                if (var13.field9891) {
                                                   if (var13.field9875) {
                                                      var67.method182(class405.field5861, (class307)null, var13.field9962, 1);
                                                      if (!var11) {
                                                         break label1023;
                                                      }
                                                   }

                                                   var67.method192(class405.field5861, (class307)null, 1);
                                                   if (var13.field9887 == null) {
                                                      break label1023;
                                                   }

                                                   class383.field5543.method562(var13.field9887.method4192());
                                                   if (!var11) {
                                                      break label1023;
                                                   }
                                                }

                                                if (!var13.field9875) {
                                                   var67.method192(class405.field5861, (class307)null, 1);
                                                   if (var13.field9887 == null) {
                                                      break label1023;
                                                   }

                                                   class383.field5543.method562(var13.field9887.method4192());
                                                   if (!var11) {
                                                      break label1023;
                                                   }
                                                }

                                                var67.method182(class405.field5861, (class307)null, var13.field9962 << 2, 1);
                                             }

                                             if (class96.field1235) {
                                                class383.field5543.method592(arg0, arg10, arg2, arg6);
                                             }

                                             if (var13.field9969) {
                                                class383.field5543.method493(true);
                                             }
                                          }

                                          if (!class681.field10034) {
                                             break label1082;
                                          }

                                          if (!arg4) {
                                             class387.method2937(var14, var16, var15, (byte)-117, var17);
                                             if (!var11) {
                                                break label1082;
                                             }
                                          }

                                          class193.method1520(var15, -104, var17, var16, var14);
                                          if (!var11) {
                                             break label1082;
                                          }
                                       }

                                       if (var13.field9992 == 9) {
                                          int var86;
                                          int var87;
                                          int var88;
                                          int var89;
                                          label688: {
                                             if (!var13.field9899) {
                                                var86 = var19;
                                                var87 = var20;
                                                var88 = var13.field9904 + var19;
                                                var89 = var13.field9980 + var20;
                                                if (!var11) {
                                                   break label688;
                                                }
                                             }

                                             var87 = var13.field9980 + var20;
                                             var88 = var13.field9904 + var19;
                                             var86 = var19;
                                             var89 = var20;
                                          }

                                          label683: {
                                             if (var13.field9946 == 1) {
                                                class383.field5543.method589(var86, var87, var88, var89, var13.field9949, 0);
                                                if (!var11) {
                                                   break label683;
                                                }
                                             }

                                             class383.field5543.method519(var86, var87, var88, var89, var13.field9949, var13.field9946, 0);
                                          }

                                          if (class681.field10034) {
                                             label1055: {
                                                if (arg4) {
                                                   class193.method1520(var15, -118, var17, var16, var14);
                                                   if (!var11) {
                                                      break label1055;
                                                   }
                                                }

                                                class387.method2937(var14, var16, var15, (byte)-117, var17);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var12;
               } while(arg3.length > var12);

            }
         }
      } catch (RuntimeException var91) {
         throw class237.method1823(var91, field5509[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5509[13] : field5509[9]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "d",
      descriptor = "(B)I"
   )
   public static final int method2887(byte arg0) {
      try {
         if (arg0 <= 101) {
            return 56;
         } else {
            ++field5501;
            return class686.field10122;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5509[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2888(int arg0) {
      try {
         field5500 = null;
         int var1 = -106 / ((29 - arg0) / 62);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5509[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method2889(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eh",
      name = "<init>",
      descriptor = "(Lvga;Lcba;)V"
   )
   public class382(class94 arg0, class577 arg1) {
      try {
         this.field5508 = arg0;
         this.field5498 = this.field5508.method808(47);
         this.method2884((byte)106);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5509[28] + (arg0 != null ? field5509[13] : field5509[9]) + ',' + (arg1 != null ? field5509[13] : field5509[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2890(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2891(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
