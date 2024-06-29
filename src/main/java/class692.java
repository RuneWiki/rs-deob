import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class692 extends class629 {
   @OriginalMember(
      owner = "client!ua",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10151 = new String[]{method5037(method5036("wmdL3")), method5037(method5036("wmdF3")), method5037(method5036("ly&o")), method5037(method5036("y\"d-f")), method5037(method5036("wmdI3")), method5037(method5036("wmdS3")), method5037(method5036("wmdM3")), method5037(method5036("wa")), method5037(method5036("w`")), method5037(method5036("wmdO3")), method5037(method5036("wmdR3")), method5037(method5036("wmdN3"))};
   @OriginalMember(
      owner = "client!ua",
      name = "H",
      descriptor = "Lqe;"
   )
   public static class491 field10145 = new class491();
   @OriginalMember(
      owner = "client!ua",
      name = "N",
      descriptor = "Lnk;"
   )
   public static class746 field10150 = new class746();
   @OriginalMember(
      owner = "client!ua",
      name = "D",
      descriptor = "I"
   )
   public static int field10140;
   @OriginalMember(
      owner = "client!ua",
      name = "J",
      descriptor = "I"
   )
   public static int field10142;
   @OriginalMember(
      owner = "client!ua",
      name = "M",
      descriptor = "I"
   )
   public static int field10143;
   @OriginalMember(
      owner = "client!ua",
      name = "I",
      descriptor = "I"
   )
   public static int field10144;
   @OriginalMember(
      owner = "client!ua",
      name = "G",
      descriptor = "I"
   )
   public static int field10146;
   @OriginalMember(
      owner = "client!ua",
      name = "L",
      descriptor = "I"
   )
   public static int field10147;
   @OriginalMember(
      owner = "client!ua",
      name = "F",
      descriptor = "I"
   )
   public static int field10148;
   @OriginalMember(
      owner = "client!ua",
      name = "E",
      descriptor = "I"
   )
   public static int field10149;
   @OriginalMember(
      owner = "client!ua",
      name = "K",
      descriptor = "[Lbfa;"
   )
   private class385[] field10141;

   @OriginalMember(
      owner = "client!ua",
      name = "<init>",
      descriptor = "()V",
      line = 3
   )
   public class692() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ua",
      name = "h",
      descriptor = "(I)V",
      line = 11
   )
   public static final void method5031(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field10146;
         int var2 = class346.field4923.method3525(0);
         class124.field2049 = class346.field4923.method3564((byte)-67);
         int var3 = class346.field4923.method3564((byte)-87) != 1 ? 0 : 1;
         int var4 = class346.field4923.method3572((byte)-93);
         int var5 = class346.field4923.method3565(true);
         class443.method3333((byte)-28);
         class22.method155((byte)-80, var4);
         class346.field4923.method1711((byte)125);
         int var6 = 0;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var10000;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         if (var1) {
            var10000 = 0;
         } else if (~var6 <= -5) {
            var10000 = arg0;
            if (!var1) {
               if (arg0 != -9279) {
                  return;
               }

               label279: {
                  class346.field4923.method1719(-1537210170);
                  var10 = (class650.field9423 - class346.field4923.field6907) / 16;
                  class487.field7079 = new int[var10][4];
                  var11 = 0;
                  if (var1) {
                     var12 = 0;
                     if (var1) {
                        class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                        ++var12;
                     }
                  } else {
                     if (var11 >= var10) {
                        class245.field3526 = new byte[var10][];
                        class205.field3058 = new int[var10];
                        class719.field10376 = new byte[var10][];
                        class733.field10553 = new int[var10];
                        class360.field5391 = new byte[var10][];
                        class131.field2180 = new int[var10];
                        class64.field1171 = null;
                        class629.field9178 = null;
                        class213.field3183 = new int[var10];
                        class631.field9200 = new int[var10];
                        class756.field10978 = new byte[var10][];
                        var10 = 0;
                        var12 = 0;
                        if (!var1) {
                           break label279;
                        }
                     } else {
                        var12 = 0;
                     }

                     if (var1) {
                        class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                        ++var12;
                     }
                  }

                  while(true) {
                     while(var12 < 4) {
                        class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                        ++var12;
                     }

                     if (!var1) {
                        ++var11;
                        if (var11 >= var10) {
                           class245.field3526 = new byte[var10][];
                           class205.field3058 = new int[var10];
                           class719.field10376 = new byte[var10][];
                           class733.field10553 = new int[var10];
                           class360.field5391 = new byte[var10][];
                           class131.field2180 = new int[var10];
                           class64.field1171 = null;
                           class629.field9178 = null;
                           class213.field3183 = new int[var10];
                           class631.field9200 = new int[var10];
                           class756.field10978 = new byte[var10][];
                           var10 = 0;
                           var12 = 0;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                           ++var12;
                        }
                     } else {
                        ++var12;
                     }
                  }
               }

               if (var1) {
                  var10000 = 0;
               } else if (var12 >= 4) {
                  var10000 = var3;
                  if (!var1) {
                     class668.method4882((boolean)var3, 11, 0, var2, var5);
                     return;
                  }
               } else {
                  var10000 = 0;
               }

               while(true) {
                  var13 = var10000;
                  if (var1 || ~var13 > ~(class209.field3112 >> 3)) {
                     do {
                        var14 = 0;
                        if (var1 || class1.field3 >> 3 > var14) {
                           label382:
                           do {
                              var15 = class352.field4979[var12][var13][var14];
                              if (~var15 == 0) {
                                 ++var14;
                              } else {
                                 var16 = (var15 & 16774867) >> 14;
                                 var17 = (var15 & 16377) >> 3;
                                 var18 = (var16 / 8 << 8) + var17 / 8;
                                 var19 = 0;
                                 if (var1) {
                                    var10000 = var18;
                                 } else if (var10 <= var19) {
                                    var10000 = ~var18;
                                    if (!var1) {
                                       if (var10000 != 0) {
                                          class733.field10553[var10] = var18;
                                          var20 = 255 & var18 >> 8;
                                          var21 = var18 & 255;
                                          class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                          class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                          class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                          class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                          ++var10;
                                       }

                                       ++var14;
                                       continue;
                                    }
                                 } else {
                                    var10000 = var18;
                                 }

                                 do {
                                    while(true) {
                                       if (var10000 == class733.field10553[var19]) {
                                          var18 = -1;
                                          if (!var1) {
                                             var10000 = ~var18;
                                             break;
                                          }

                                          ++var19;
                                       } else {
                                          ++var19;
                                       }

                                       if (var10 <= var19) {
                                          var10000 = ~var18;
                                          if (!var1) {
                                             if (var10000 != 0) {
                                                class733.field10553[var10] = var18;
                                                var20 = 255 & var18 >> 8;
                                                var21 = var18 & 255;
                                                class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                                class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                                class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                                class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                                ++var10;
                                             }

                                             ++var14;
                                             continue label382;
                                          }
                                       } else {
                                          var10000 = var18;
                                       }
                                    }
                                 } while(var1);

                                 if (var10000 != 0) {
                                    class733.field10553[var10] = var18;
                                    var20 = 255 & var18 >> 8;
                                    var21 = var18 & 255;
                                    class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                    class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                    class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                    class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                    ++var10;
                                 }

                                 ++var14;
                              }
                           } while(class1.field3 >> 3 > var14);
                        }

                        ++var13;
                     } while(~var13 > ~(class209.field3112 >> 3));
                  }

                  ++var12;
                  if (var12 >= 4) {
                     var10000 = var3;
                     if (!var1) {
                        class668.method4882((boolean)var3, 11, 0, var2, var5);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
               }
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            label517: {
               int var7 = var10000;
               int var8;
               int var9;
               if (var1) {
                  var8 = 0;
                  if (var1) {
                     var9 = class346.field4923.method1714((byte)-34, 1);
                     if (var9 != 1) {
                        class352.field4979[var6][var7][var8] = -1;
                        if (var1) {
                           class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                        ++var8;
                     }
                  }
               } else {
                  if (~(class209.field3112 >> 3) >= ~var7) {
                     break label517;
                  }

                  var8 = 0;
                  if (var1) {
                     var9 = class346.field4923.method1714((byte)-34, 1);
                     if (var9 != 1) {
                        class352.field4979[var6][var7][var8] = -1;
                        if (var1) {
                           class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                        ++var8;
                     }
                  }
               }

               while(true) {
                  while(var8 < class1.field3 >> 3) {
                     var9 = class346.field4923.method1714((byte)-34, 1);
                     if (var9 != 1) {
                        class352.field4979[var6][var7][var8] = -1;
                        if (var1) {
                           class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                        ++var8;
                     }
                  }

                  ++var7;
                  if (~(class209.field3112 >> 3) >= ~var7) {
                     break;
                  }

                  var8 = 0;
                  if (var1) {
                     var9 = class346.field4923.method1714((byte)-34, 1);
                     if (var9 != 1) {
                        class352.field4979[var6][var7][var8] = -1;
                        if (var1) {
                           class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        class352.field4979[var6][var7][var8] = class346.field4923.method1714((byte)-34, 26);
                        ++var8;
                     }
                  }
               }
            }

            ++var6;
            if (~var6 <= -5) {
               var10000 = arg0;
               if (!var1) {
                  if (arg0 != -9279) {
                     return;
                  }

                  label119: {
                     class346.field4923.method1719(-1537210170);
                     var10 = (class650.field9423 - class346.field4923.field6907) / 16;
                     class487.field7079 = new int[var10][4];
                     var11 = 0;
                     if (var1) {
                        var12 = 0;
                        if (var1) {
                           class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                           ++var12;
                        }
                     } else {
                        if (var11 >= var10) {
                           class245.field3526 = new byte[var10][];
                           class205.field3058 = new int[var10];
                           class719.field10376 = new byte[var10][];
                           class733.field10553 = new int[var10];
                           class360.field5391 = new byte[var10][];
                           class131.field2180 = new int[var10];
                           class64.field1171 = null;
                           class629.field9178 = null;
                           class213.field3183 = new int[var10];
                           class631.field9200 = new int[var10];
                           class756.field10978 = new byte[var10][];
                           var10 = 0;
                           var12 = 0;
                           if (!var1) {
                              break label119;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                           ++var12;
                        }
                     }

                     while(true) {
                        while(var12 < 4) {
                           class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (var11 >= var10) {
                              class245.field3526 = new byte[var10][];
                              class205.field3058 = new int[var10];
                              class719.field10376 = new byte[var10][];
                              class733.field10553 = new int[var10];
                              class360.field5391 = new byte[var10][];
                              class131.field2180 = new int[var10];
                              class64.field1171 = null;
                              class629.field9178 = null;
                              class213.field3183 = new int[var10];
                              class631.field9200 = new int[var10];
                              class756.field10978 = new byte[var10][];
                              var10 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class487.field7079[var11][var12] = class346.field4923.method3567(31871);
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     }
                  }

                  if (var1) {
                     var10000 = 0;
                  } else if (var12 >= 4) {
                     var10000 = var3;
                     if (!var1) {
                        class668.method4882((boolean)var3, 11, 0, var2, var5);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 || ~var13 > ~(class209.field3112 >> 3)) {
                        do {
                           var14 = 0;
                           if (var1 || class1.field3 >> 3 > var14) {
                              label202:
                              do {
                                 var15 = class352.field4979[var12][var13][var14];
                                 if (~var15 == 0) {
                                    ++var14;
                                 } else {
                                    var16 = (var15 & 16774867) >> 14;
                                    var17 = (var15 & 16377) >> 3;
                                    var18 = (var16 / 8 << 8) + var17 / 8;
                                    var19 = 0;
                                    if (var1) {
                                       var10000 = var18;
                                    } else if (var10 <= var19) {
                                       var10000 = ~var18;
                                       if (!var1) {
                                          if (var10000 != 0) {
                                             class733.field10553[var10] = var18;
                                             var20 = 255 & var18 >> 8;
                                             var21 = var18 & 255;
                                             class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                             class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                             class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                             class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                             ++var10;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var18;
                                    }

                                    do {
                                       while(true) {
                                          if (var10000 == class733.field10553[var19]) {
                                             var18 = -1;
                                             if (!var1) {
                                                var10000 = ~var18;
                                                break;
                                             }

                                             ++var19;
                                          } else {
                                             ++var19;
                                          }

                                          if (var10 <= var19) {
                                             var10000 = ~var18;
                                             if (!var1) {
                                                if (var10000 != 0) {
                                                   class733.field10553[var10] = var18;
                                                   var20 = 255 & var18 >> 8;
                                                   var21 = var18 & 255;
                                                   class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                                   class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                                   class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                                   class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                                   ++var10;
                                                }

                                                ++var14;
                                                continue label202;
                                             }
                                          } else {
                                             var10000 = var18;
                                          }
                                       }
                                    } while(var1);

                                    if (var10000 != 0) {
                                       class733.field10553[var10] = var18;
                                       var20 = 255 & var18 >> 8;
                                       var21 = var18 & 255;
                                       class205.field3058[var10] = class515.field7506.method1329(arg0 + 9278, "m" + var20 + "_" + var21);
                                       class213.field3183[var10] = class515.field7506.method1329(-1, "l" + var20 + "_" + var21);
                                       class131.field2180[var10] = class515.field7506.method1329(-1, field10151[7] + var20 + "_" + var21);
                                       class631.field9200[var10] = class515.field7506.method1329(-1, field10151[8] + var20 + "_" + var21);
                                       ++var10;
                                    }

                                    ++var14;
                                 }
                              } while(class1.field3 >> 3 > var14);
                           }

                           ++var13;
                        } while(~var13 > ~(class209.field3112 >> 3));
                     }

                     ++var12;
                     if (var12 >= 4) {
                        var10000 = var3;
                        if (!var1) {
                           class668.method4882((boolean)var3, 11, 0, var2, var5);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }
            } else {
               var10000 = 0;
            }
         }
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field10151[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(B[[I)V",
      line = 160
   )
   private final void method5032(byte arg0, int[][] arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10144;
         int var4 = class66.field1214;
         int var5 = class686.field10095;
         class786.method5666(83, arg1);
         class493.method3719(0, class704.field10259, -12234, class37.field902, 0);
         if (arg0 != 69) {
            this.method45(47, 44);
         }

         if (this.field10141 != null) {
            int var6 = 0;
            if (var3 || this.field10141.length > var6) {
               do {
                  class385 var7 = this.field10141[var6];
                  int var8 = var7.field5689;
                  int var9 = var7.field5687;
                  if (~var8 > -1) {
                     if (~var9 > -1) {
                        ++var6;
                        continue;
                     }

                     var7.method2104(var5, var4, arg0 + 5529);
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (var9 < 0) {
                     var7.method2103((byte)-38, var4, var5);
                     if (var3) {
                        var7.method2108(var5, (byte)113, var4);
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var7.method2108(var5, (byte)113, var4);
                     ++var6;
                  }
               } while(this.field10141.length > var6);

            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10151[10] + arg0 + ',' + (arg1 != null ? field10151[3] : field10151[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(IZIII)V",
      line = 211
   )
   public static final void method5033(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         ++field10143;
         int var6 = 0;
         if (!arg1) {
            field10145 = null;
            if (!var5 && class656.field9577 <= var6) {
               class670.method4896(arg3 - -arg0, 0, arg3, arg2 + arg4, arg4);
               return;
            }
         } else if (class656.field9577 <= var6) {
            class670.method4896(arg3 - -arg0, 0, arg3, arg2 + arg4, arg4);
            return;
         }

         do {
            Rectangle var7 = class211.field3153[var6];
            if (var7.x + var7.width > arg3 && var7.x < arg0 + arg3 && var7.y - -var7.height > arg4 && var7.y < arg4 - -arg2) {
               class178.field2749[var6] = true;
            }

            ++var6;
         } while(class656.field9577 > var6);

         class670.method4896(arg3 - -arg0, 0, arg3, arg2 + arg4, arg4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10151[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "(II)[I",
      line = 237
   )
   public final int[] method45(int arg0, int arg1) {
      try {
         if (arg1 != 2048) {
            return null;
         } else {
            ++field10148;
            int[] var3 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               this.method5032((byte)69, super.field9161.method3869((byte)-88));
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10151[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "(I)V",
      line = 262
   )
   public static void method5034(int arg0) {
      try {
         if (arg0 == 0) {
            field10145 = null;
            field10150 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10151[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(II)[[I",
      line = 282
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10149;
         int[][] var4 = super.field9169.method785((byte)111, arg0);
         if (super.field9169.field1332) {
            int var5 = class66.field1214;
            int var6 = class686.field10095;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field9169.method781(arg1 + -623);
            this.method5032((byte)69, var7);
            int var9 = 0;
            if (var3 || class686.field10095 > var9) {
               do {
                  int[] var10 = var7[var9];
                  int[][] var11 = var8[var9];
                  int[] var12 = var11[0];
                  int[] var13 = var11[1];
                  int[] var14 = var11[2];
                  int var15 = 0;
                  if (var3 || class66.field1214 > var15) {
                     do {
                        int var16 = var10[var15];
                        var14[var15] = class66.method706(var16, 255) << 4;
                        var13[var15] = class66.method706(var16, 65280) >> 4;
                        var12[var15] = class66.method706(4080, var16 >> 12);
                        ++var15;
                     } while(class66.field1214 > var15);
                  }

                  ++var9;
               } while(class686.field10095 > var9);
            }
         }

         if (arg1 != 0) {
            method5033(20, true, -113, -52, -92);
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field10151[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(IIII)I",
      line = 343
   )
   public static final int method5035(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10140;
         if (~(8 & class608.field8732[arg0][arg3][arg1]) != -1) {
            return 0;
         } else {
            return arg0 > arg2 && ~(2 & class608.field8732[1][arg3][arg1]) != -1 ? arg0 + -1 : arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10151[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 359
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label103: {
            if (arg1 != arg2) {
               if (arg2 != 1) {
                  break label103;
               }

               super.field9166 = ~arg0.method3564((byte)-107) == -2;
               if (!var4) {
                  break label103;
               }
            }

            this.field10141 = new class385[arg0.method3564((byte)-42)];
            int var5 = 0;
            if (var4 || var5 < this.field10141.length) {
               do {
                  label88: {
                     int var6 = arg0.method3564((byte)-117);
                     if (~var6 != -1) {
                        if (~var6 == -2) {
                           break label88;
                        }

                        if (~var6 == -3) {
                           this.field10141[var5] = class744.method5398(arg0, (byte)-95);
                           if (var4) {
                              this.field10141[var5] = class514.method3887(arg0, arg1 + -18338);
                              ++var5;
                           } else {
                              ++var5;
                           }
                           continue;
                        }

                        if (var6 != 3) {
                           ++var5;
                           continue;
                        }

                        if (!var4) {
                           this.field10141[var5] = class514.method3887(arg0, arg1 + -18338);
                           ++var5;
                           continue;
                        }
                     }

                     this.field10141[var5] = class124.method1184(arg0, 87);
                     if (!var4) {
                        ++var5;
                        continue;
                     }
                  }

                  this.field10141[var5] = class597.method4413(arg0, arg1 + -126);
                  if (var4) {
                     this.field10141[var5] = class744.method5398(arg0, (byte)-95);
                     if (var4) {
                        this.field10141[var5] = class514.method3887(arg0, arg1 + -18338);
                        ++var5;
                     } else {
                        ++var5;
                     }
                  } else {
                     ++var5;
                  }
               } while(var5 < this.field10141.length);
            }
         }

         ++field10147;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10151[1] + (arg0 != null ? field10151[3] : field10151[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5037(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
