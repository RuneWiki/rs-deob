import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class355 extends class629 {
   @OriginalMember(
      owner = "client!jg",
      name = "D",
      descriptor = "I"
   )
   private int field5006 = 4096;
   @OriginalMember(
      owner = "client!jg",
      name = "I",
      descriptor = "I"
   )
   private int field5007 = 0;
   @OriginalMember(
      owner = "client!jg",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5009 = new String[]{method2725(method2724("%/\u0004EE")), method2725(method2724("%/\u0004JE")), method2725(method2724("4f\u0004!\u0010")), method2725(method2724("!=Fc")), method2725(method2724("%/\u0004@E")), method2725(method2724("%/\u0004BE")), method2725(method2724("%/\u0004AE")), method2725(method2724("%/\u0004CE"))};
   @OriginalMember(
      owner = "client!jg",
      name = "K",
      descriptor = "Luw;"
   )
   public static class435 field5001 = new class435(28, 2);
   @OriginalMember(
      owner = "client!jg",
      name = "E",
      descriptor = "I"
   )
   public static int field5000;
   @OriginalMember(
      owner = "client!jg",
      name = "J",
      descriptor = "I"
   )
   public static int field5002;
   @OriginalMember(
      owner = "client!jg",
      name = "G",
      descriptor = "I"
   )
   public static int field5003;
   @OriginalMember(
      owner = "client!jg",
      name = "L",
      descriptor = "I"
   )
   public static int field5004;
   @OriginalMember(
      owner = "client!jg",
      name = "H",
      descriptor = "I"
   )
   public static int field5005;
   @OriginalMember(
      owner = "client!jg",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5008;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "([IZ[I)V",
      line = 3
   )
   public static final void method2721(int[] param0, boolean param1, int[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "(II)[I",
      line = 36
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5004;
         if (arg1 != 2048) {
            this.method243(86, -65);
         }

         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)122, 0, arg0);
            int var6 = 0;
            if (var3 || ~var6 > ~class66.field1214) {
               do {
                  int var7 = var5[var6];
                  if (this.field5007 > var7) {
                     var4[var6] = this.field5007;
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (var7 <= this.field5006) {
                     var4[var6] = var7;
                     if (var3) {
                        var4[var6] = this.field5006;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var4[var6] = this.field5006;
                     ++var6;
                  }
               } while(~var6 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5009[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(II)[[I",
      line = 83
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5000;
         int[][] var4 = super.field9169.method785((byte)71, arg0);
         if (arg1 != 0) {
            this.field5006 = 68;
         }

         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(7, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class66.field1214) {
               do {
                  int var14;
                  int var15;
                  label68: {
                     int var13 = var6[var12];
                     var14 = var7[var12];
                     var15 = var8[var12];
                     if (this.field5007 > var13) {
                        var9[var12] = this.field5007;
                        if (!var3) {
                           break label68;
                        }
                     }

                     if (~var13 < ~this.field5006) {
                        var9[var12] = this.field5006;
                        if (var3) {
                           var9[var12] = var13;
                        }
                     } else {
                        var9[var12] = var13;
                     }
                  }

                  label72: {
                     if (this.field5007 > var14) {
                        var10[var12] = this.field5007;
                        if (!var3) {
                           break label72;
                        }
                     }

                     if (~this.field5006 > ~var14) {
                        var10[var12] = this.field5006;
                        if (var3) {
                           var10[var12] = var14;
                        }
                     } else {
                        var10[var12] = var14;
                     }
                  }

                  if (~var15 <= ~this.field5007) {
                     if (~this.field5006 <= ~var15) {
                        var11[var12] = var15;
                        if (!var3) {
                           ++var12;
                           continue;
                        }
                     }

                     var11[var12] = this.field5006;
                     if (var3) {
                        var11[var12] = this.field5007;
                        ++var12;
                     } else {
                        ++var12;
                     }
                  } else {
                     var11[var12] = this.field5007;
                     ++var12;
                  }
               } while(var12 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field5009[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "()V",
      line = 160
   )
   public class355() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Llja;Lha;II)V",
      line = 163
   )
   public static final void method2722(class743 arg0, class65 arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field5003;
         if (class503.field7324 != null && arg0.field10701 >= arg3) {
            int var5 = 0;
            if (var4 || var5 < class503.field7324.length) {
               do {
                  if (~class503.field7324[var5] != 999999 && (~arg0.field10705[0] >= ~class503.field7324[var5] || class503.field7324[var5] >= arg0.field10705[1] || ~arg0.field10705[2] >= ~class503.field7324[var5] || ~class503.field7324[var5] <= ~arg0.field10705[3]) && (~class621.field9024[var5] <= ~arg0.field10702[0] || arg0.field10702[1] <= class621.field9024[var5] || class621.field9024[var5] >= arg0.field10702[2] || ~arg0.field10702[3] >= ~class621.field9024[var5]) && (~arg0.field10702[0] <= ~class758.field11015[var5] || ~arg0.field10702[1] <= ~class758.field11015[var5] || class758.field11015[var5] <= arg0.field10702[2] || ~class758.field11015[var5] >= ~arg0.field10702[3]) && (~arg0.field10704[0] >= ~class445.field6488[var5] || ~class445.field6488[var5] <= ~arg0.field10704[1] || ~arg0.field10704[2] >= ~class445.field6488[var5] || ~arg0.field10704[3] >= ~class445.field6488[var5]) && (arg0.field10704[0] >= class384.field5677[var5] || ~arg0.field10704[1] <= ~class384.field5677[var5] || ~arg0.field10704[2] <= ~class384.field5677[var5] || class384.field5677[var5] <= arg0.field10704[3])) {
                     return;
                  }

                  ++var5;
               } while(var5 < class503.field7324.length);
            }
         }

         boolean var30;
         if (~arg0.field10710 == -2) {
            int var6 = -class566.field8206 + arg0.field10698 + class54.field1102;
            if (~var6 <= -1 && class54.field1102 - -class54.field1102 >= var6) {
               int var7 = arg0.field10706 - class115.field1864 - -class54.field1102;
               if (~var7 <= -1) {
                  if (~(class54.field1102 + class54.field1102) > ~var7) {
                     return;
                  }
               } else {
                  var7 = 0;
               }

               int var8 = class54.field1102 + arg0.field10703 + -class115.field1864;
               if (~var8 >= ~(class54.field1102 + class54.field1102)) {
                  if (var8 < 0) {
                     return;
                  }
               } else {
                  var8 = class54.field1102 - -class54.field1102;
               }

               boolean var9;
               label325: {
                  var9 = false;
                  if (var4) {
                     var30 = class750.field10812[var6][var7++];
                  } else {
                     if (~var7 < ~var8) {
                        break label325;
                     }

                     var30 = class750.field10812[var6][var7++];
                  }

                  label324:
                  while(true) {
                     while(var30) {
                        var30 = true;
                        if (!var4) {
                           var9 = true;
                           if (!var4) {
                              break label324;
                           }
                           break;
                        }
                     }

                     if (~var7 < ~var8) {
                        break;
                     }

                     var30 = class750.field10812[var6][var7++];
                  }
               }

               if (var9) {
                  float var10 = (float)(-arg0.field10702[0] + class359.field5370);
                  if (var10 < 0.0F) {
                     var10 *= -1.0F;
                  }

                  if (!((float)class727.field10461 > var10)) {
                     if (class57.method648(false, 0, arg0)) {
                        if (class57.method648(false, 1, arg0)) {
                           if (class57.method648(false, 2, arg0)) {
                              if (class57.method648(false, 3, arg0)) {
                                 class128.field2141[class203.field3041++] = arg0;
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else if (~arg0.field10710 == -3) {
            int var11 = -class115.field1864 + arg0.field10706 - -class54.field1102;
            if (var11 >= 0 && class54.field1102 + class54.field1102 >= var11) {
               int var12;
               label359: {
                  var12 = -class566.field8206 + arg0.field10698 + class54.field1102;
                  if (~var12 > -1) {
                     var12 = 0;
                     if (!var4) {
                        break label359;
                     }
                  }

                  if (~var12 < ~(class54.field1102 + class54.field1102)) {
                     return;
                  }
               }

               int var13 = -class566.field8206 + arg0.field10699 + class54.field1102;
               if (~var13 >= ~(class54.field1102 + class54.field1102)) {
                  if (~var13 > -1) {
                     return;
                  }
               } else {
                  var13 = class54.field1102 + class54.field1102;
               }

               boolean var14;
               label353: {
                  var14 = false;
                  if (var4) {
                     var30 = class750.field10812[var12++][var11];
                  } else {
                     if (~var12 < ~var13) {
                        break label353;
                     }

                     var30 = class750.field10812[var12++][var11];
                  }

                  label352:
                  while(true) {
                     while(var30) {
                        var30 = true;
                        if (!var4) {
                           var14 = true;
                           if (!var4) {
                              break label352;
                           }
                           break;
                        }
                     }

                     if (~var12 < ~var13) {
                        break;
                     }

                     var30 = class750.field10812[var12++][var11];
                  }
               }

               if (var14) {
                  float var15 = (float)(-arg0.field10704[0] + class400.field5883);
                  if (var15 < 0.0F) {
                     var15 *= -1.0F;
                  }

                  if (!((float)class727.field10461 > var15)) {
                     if (class57.method648(false, 0, arg0)) {
                        if (class57.method648(false, 1, arg0)) {
                           if (class57.method648(false, 2, arg0)) {
                              if (class57.method648(false, 3, arg0)) {
                                 class128.field2141[class203.field3041++] = arg0;
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            if (arg2 != 1) {
               method2722((class743)null, (class65)null, -87, -53);
            }

            if (~arg0.field10710 != -17 && ~arg0.field10710 != -9) {
               if (arg0.field10710 == 4) {
                  float var20 = (float)(arg0.field10705[0] + -class139.field2258);
                  if (!(var20 <= (float)class761.field11038)) {
                     int var21 = arg0.field10706 - (-class54.field1102 + class115.field1864);
                     if (var21 >= 0) {
                        if (~var21 < ~(class54.field1102 - -class54.field1102)) {
                           return;
                        }
                     } else {
                        var21 = 0;
                     }

                     int var22 = -class115.field1864 + arg0.field10703 + class54.field1102;
                     if (class54.field1102 - -class54.field1102 >= var22) {
                        if (var22 < 0) {
                           return;
                        }
                     } else {
                        var22 = class54.field1102 + class54.field1102;
                     }

                     int var23;
                     label518: {
                        var23 = arg0.field10698 - (class566.field8206 - class54.field1102);
                        if (~var23 > -1) {
                           var23 = 0;
                           if (!var4) {
                              break label518;
                           }
                        }

                        if (~(class54.field1102 + class54.field1102) > ~var23) {
                           return;
                        }
                     }

                     int var24 = -class566.field8206 + arg0.field10699 - -class54.field1102;
                     if (~(class54.field1102 + class54.field1102) <= ~var24) {
                        if (~var24 > -1) {
                           return;
                        }
                     } else {
                        var24 = class54.field1102 - -class54.field1102;
                     }

                     byte var25 = 0;
                     int var26 = var23;
                     int var10000;
                     if (var4) {
                        var10000 = var21;
                     } else if (~var24 > ~var23) {
                        var10000 = var25;
                        if (!var4) {
                           if (var25 == 0) {
                              return;
                           }

                           if (!class57.method648(false, 0, arg0)) {
                              return;
                           }

                           if (!class57.method648(false, 1, arg0)) {
                              return;
                           }

                           if (!class57.method648(false, 2, arg0)) {
                              return;
                           }

                           if (!class57.method648(false, 3, arg0)) {
                              return;
                           }

                           class128.field2141[class203.field3041++] = arg0;
                           return;
                        }
                     } else {
                        var10000 = var21;
                     }

                     while(true) {
                        label510:
                        while(true) {
                           int var27 = var10000;
                           if (var4) {
                              if (class750.field10812[var26][var27]) {
                                 var25 = 1;
                                 if (!var4) {
                                    var10000 = var25;
                                    if (!var4) {
                                       if (var25 == 0) {
                                          return;
                                       }

                                       if (!class57.method648(false, 0, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 1, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 2, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 3, arg0)) {
                                          return;
                                       }

                                       class128.field2141[class203.field3041++] = arg0;
                                       return;
                                    }
                                    continue;
                                 }

                                 ++var27;
                              } else {
                                 ++var27;
                              }
                           }

                           while(true) {
                              while(~var22 <= ~var27) {
                                 if (class750.field10812[var26][var27]) {
                                    var25 = 1;
                                    if (!var4) {
                                       var10000 = var25;
                                       if (!var4) {
                                          if (var25 == 0) {
                                             return;
                                          }

                                          if (!class57.method648(false, 0, arg0)) {
                                             return;
                                          }

                                          if (!class57.method648(false, 1, arg0)) {
                                             return;
                                          }

                                          if (!class57.method648(false, 2, arg0)) {
                                             return;
                                          }

                                          if (!class57.method648(false, 3, arg0)) {
                                             return;
                                          }

                                          class128.field2141[class203.field3041++] = arg0;
                                          return;
                                       }
                                       continue label510;
                                    }

                                    ++var27;
                                 } else {
                                    ++var27;
                                 }
                              }

                              if (!var4) {
                                 ++var26;
                                 if (~var24 > ~var26) {
                                    var10000 = var25;
                                    if (!var4) {
                                       if (var25 == 0) {
                                          return;
                                       }

                                       if (!class57.method648(false, 0, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 1, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 2, arg0)) {
                                          return;
                                       }

                                       if (!class57.method648(false, 3, arg0)) {
                                          return;
                                       }

                                       class128.field2141[class203.field3041++] = arg0;
                                       return;
                                    }
                                 } else {
                                    var10000 = var21;
                                 }
                                 break;
                              }

                              ++var27;
                           }
                        }
                     }
                  }
               }
            } else {
               int var16 = -class566.field8206 + arg0.field10698 + class54.field1102;
               if (~var16 <= -1 && ~var16 >= ~(class54.field1102 - -class54.field1102)) {
                  int var17 = -class115.field1864 + arg0.field10706 - -class54.field1102;
                  if (var17 >= 0 && class54.field1102 + class54.field1102 >= var17) {
                     if (class750.field10812[var16][var17]) {
                        float var18 = (float)(class359.field5370 - arg0.field10702[0]);
                        if (var18 < 0.0F) {
                           var18 *= -1.0F;
                        }

                        float var19 = (float)(-arg0.field10704[0] + class400.field5883);
                        if (var19 < 0.0F) {
                           var19 *= -1.0F;
                        }

                        if (!(var18 < (float)class727.field10461) || !(var19 < (float)class727.field10461)) {
                           if (class57.method648(false, 0, arg0)) {
                              if (class57.method648(false, 1, arg0)) {
                                 if (class57.method648(false, 2, arg0)) {
                                    if (class57.method648(false, 3, arg0)) {
                                       class128.field2141[class203.field3041++] = arg0;
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
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field5009[5] + (arg0 != null ? field5009[2] : field5009[3]) + ',' + (arg1 != null ? field5009[2] : field5009[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "g",
      descriptor = "(I)V",
      line = 489
   )
   public static void method2723(int arg0) {
      try {
         field5001 = null;
         if (arg0 != 0) {
            field5001 = null;
         }

         field5008 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5009[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 502
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg1 == 0) {
            label57: {
               label50: {
                  label49: {
                     if (arg2 != 0) {
                        if (arg2 == 1) {
                           break label49;
                        }

                        if (~arg2 != -3) {
                           break label57;
                        }

                        if (!var4) {
                           break label50;
                        }
                     }

                     this.field5007 = arg0.method3565(true);
                     if (!var4) {
                        break label57;
                     }
                  }

                  this.field5006 = arg0.method3565(true);
                  if (!var4) {
                     break label57;
                  }
               }

               super.field9166 = ~arg0.method3564((byte)-121) == -2;
            }

            ++field5002;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5009[1] + (arg0 != null ? field5009[2] : field5009[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
