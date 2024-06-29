import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class69 extends class264 {
   @OriginalMember(
      owner = "client!mia",
      name = "I",
      descriptor = "I"
   )
   private int field848 = 2;
   @OriginalMember(
      owner = "client!mia",
      name = "U",
      descriptor = "I"
   )
   private int field846 = 5;
   @OriginalMember(
      owner = "client!mia",
      name = "O",
      descriptor = "I"
   )
   private int field850 = 2048;
   @OriginalMember(
      owner = "client!mia",
      name = "F",
      descriptor = "[S"
   )
   private short[] field854 = new short[512];
   @OriginalMember(
      owner = "client!mia",
      name = "S",
      descriptor = "I"
   )
   private int field855 = 0;
   @OriginalMember(
      owner = "client!mia",
      name = "Q",
      descriptor = "I"
   )
   private int field849 = 5;
   @OriginalMember(
      owner = "client!mia",
      name = "P",
      descriptor = "I"
   )
   private int field857 = 1;
   @OriginalMember(
      owner = "client!mia",
      name = "R",
      descriptor = "[B"
   )
   private byte[] field858 = new byte[512];
   @OriginalMember(
      owner = "client!mia",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field859 = new String[]{method649(method648("\u0001x\u0005dYD")), method649(method648("\u0017?Jd`")), method649(method648("\u0002d\b&")), method649(method648("\u0001x\u0005dXD")), method649(method648("\u0001x\u0005d[D")), method649(method648("\u0001x\u0005dVD")), method649(method648("\u0001x\u0005d^D")), method649(method648("\u0001x\u0005d\\D")), method649(method648("\u0001x\u0005d_D"))};
   @OriginalMember(
      owner = "client!mia",
      name = "J",
      descriptor = "Leg;"
   )
   public static class118 field845 = new class118(60, -1);
   @OriginalMember(
      owner = "client!mia",
      name = "G",
      descriptor = "I"
   )
   public static int field853 = -1;
   @OriginalMember(
      owner = "client!mia",
      name = "M",
      descriptor = "I"
   )
   public static int field843;
   @OriginalMember(
      owner = "client!mia",
      name = "T",
      descriptor = "I"
   )
   public static int field844;
   @OriginalMember(
      owner = "client!mia",
      name = "K",
      descriptor = "I"
   )
   public static int field847;
   @OriginalMember(
      owner = "client!mia",
      name = "L",
      descriptor = "I"
   )
   public static int field851;
   @OriginalMember(
      owner = "client!mia",
      name = "H",
      descriptor = "I"
   )
   public static int field852;
   @OriginalMember(
      owner = "client!mia",
      name = "N",
      descriptor = "I"
   )
   public static int field856;

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field852;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var5 = class666.field9668[arg0] * this.field846 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            int var8 = 0;
            if (var3 || var8 < class430.field6152) {
               do {
                  int var10000;
                  int var21;
                  label319: {
                     class501.field7273 = Integer.MAX_VALUE;
                     class85.field1108 = Integer.MAX_VALUE;
                     class414.field5965 = Integer.MAX_VALUE;
                     class583.field8639 = Integer.MAX_VALUE;
                     int var9 = class258.field3496[var8] * this.field849 + 2048;
                     int var10 = var9 >> 12;
                     int var11 = var10 + 1;
                     int var12 = var6 + -1;
                     if (var3) {
                        var10000 = this.field858[255 & (~this.field846 < ~var12 ? var12 : -this.field846 + var12)] & 255;
                     } else if (var12 > var7) {
                        var21 = this.field848;
                        var10000 = var21;
                        if (!var3) {
                           break label319;
                        }
                     } else {
                        var10000 = this.field858[255 & (~this.field846 < ~var12 ? var12 : -this.field846 + var12)] & 255;
                     }

                     while(true) {
                        label316: {
                           int var13 = var10000;
                           int var14 = var10 + -1;
                           int var10001;
                           int var10002;
                           byte[] var26;
                           if (var3) {
                              var26 = this.field858;
                              var10001 = var13;
                              var10002 = this.field849 <= var14 ? var14 - this.field849 : var14;
                           } else {
                              if (~var14 < ~var11) {
                                 break label316;
                              }

                              var26 = this.field858;
                              var10001 = var13;
                              var10002 = this.field849 <= var14 ? var14 - this.field849 : var14;
                           }

                           while(true) {
                              int var19;
                              label308: {
                                 int var16;
                                 int var17;
                                 label307: {
                                    double var27;
                                    label355: {
                                       label356: {
                                          int var15 = (var26[var10001 - -var10002 & 255] & 255) * 2;
                                          int var25 = var15 + 1;
                                          var16 = -this.field854[var15] + -(var14 << 12) + var9;
                                          var17 = -this.field854[var25] - ((var12 << 12) - var5);
                                          int var18 = this.field857;
                                          if (var18 != 1) {
                                             if (~var18 == -4) {
                                                var17 = ~var17 > -1 ? -var17 : var17;
                                                var16 = var16 < 0 ? -var16 : var16;
                                                var10000 = var17 < var16 ? var16 : var17;
                                                break label356;
                                             }

                                             if (var18 == 4) {
                                                var16 = (int)(Math.sqrt((double)((float)(~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                                var27 = 4096.0D;
                                                var10001 = var17 < 0 ? -var17 : var17;
                                                break label355;
                                             }

                                             if (var18 == 5) {
                                                break label307;
                                             }

                                             if (~var18 != -3) {
                                                var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                                break label308;
                                             }

                                             if (!var3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                                if (var3) {
                                                   var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                                }
                                                break label308;
                                             }
                                          }

                                          var19 = var16 * var16 + var17 * var17 >> 12;
                                          if (!var3) {
                                             break label308;
                                          }

                                          var17 = ~var17 > -1 ? -var17 : var17;
                                          var16 = var16 < 0 ? -var16 : var16;
                                          var10000 = var17 < var16 ? var16 : var17;
                                       }

                                       var19 = var10000;
                                       if (!var3) {
                                          break label308;
                                       }

                                       var16 = (int)(Math.sqrt((double)((float)(~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                       var27 = 4096.0D;
                                       var10001 = var17 < 0 ? -var17 : var17;
                                    }

                                    var17 = (int)(var27 * Math.sqrt((double)((float)var10001 / 4096.0F)));
                                    int var20 = var16 + var17;
                                    var19 = var20 * var20 >> 12;
                                    if (!var3) {
                                       break label308;
                                    }
                                 }

                                 var17 *= var17;
                                 var16 *= var16;
                                 var19 = (int)(4096.0D * Math.sqrt(Math.sqrt((double)((float)(var16 + var17) / 1.6777216E7F))));
                                 if (var3) {
                                    var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                    if (var3) {
                                       var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                    }
                                 }
                              }

                              label312: {
                                 if (~var19 > ~class583.field8639) {
                                    class501.field7273 = class85.field1108;
                                    class85.field1108 = class414.field5965;
                                    class414.field5965 = class583.field8639;
                                    class583.field8639 = var19;
                                    if (!var3) {
                                       ++var14;
                                       break label312;
                                    }
                                 }

                                 if (~var19 > ~class414.field5965) {
                                    class501.field7273 = class85.field1108;
                                    class85.field1108 = class414.field5965;
                                    class414.field5965 = var19;
                                    if (var3) {
                                       if (~class85.field1108 < ~var19) {
                                          class501.field7273 = class85.field1108;
                                          class85.field1108 = var19;
                                          if (var3) {
                                             if (class501.field7273 > var19) {
                                                class501.field7273 = var19;
                                             }

                                             ++var14;
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          if (class501.field7273 > var19) {
                                             class501.field7273 = var19;
                                          }

                                          ++var14;
                                       }
                                    } else {
                                       ++var14;
                                    }
                                 } else if (~class85.field1108 < ~var19) {
                                    class501.field7273 = class85.field1108;
                                    class85.field1108 = var19;
                                    if (var3) {
                                       if (class501.field7273 > var19) {
                                          class501.field7273 = var19;
                                       }

                                       ++var14;
                                    } else {
                                       ++var14;
                                    }
                                 } else {
                                    if (class501.field7273 > var19) {
                                       class501.field7273 = var19;
                                    }

                                    ++var14;
                                 }
                              }

                              if (~var14 < ~var11) {
                                 break;
                              }

                              var26 = this.field858;
                              var10001 = var13;
                              var10002 = this.field849 <= var14 ? var14 - this.field849 : var14;
                           }
                        }

                        ++var12;
                        if (var12 > var7) {
                           var21 = this.field848;
                           var10000 = var21;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = this.field858[255 & (~this.field846 < ~var12 ? var12 : -this.field846 + var12)] & 255;
                        }
                     }
                  }

                  label343: {
                     label342: {
                        label341: {
                           label340: {
                              label339: {
                                 if (var10000 != 0) {
                                    if (var21 == 1) {
                                       break label339;
                                    }

                                    if (var21 == 3) {
                                       break label340;
                                    }

                                    if (var21 == 4) {
                                       break label341;
                                    }

                                    if (var21 != 2) {
                                       break label343;
                                    }

                                    if (!var3) {
                                       break label342;
                                    }
                                 }

                                 var4[var8] = class583.field8639;
                                 if (!var3) {
                                    break label343;
                                 }
                              }

                              var4[var8] = class414.field5965;
                              if (!var3) {
                                 break label343;
                              }
                           }

                           var4[var8] = class85.field1108;
                           if (!var3) {
                              break label343;
                           }
                        }

                        var4[var8] = class501.field7273;
                        if (!var3) {
                           break label343;
                        }
                     }

                     var4[var8] = -class583.field8639 + class414.field5965;
                  }

                  ++var8;
               } while(var8 < class430.field6152);
            }
         }

         int var22 = -75 % ((arg1 - 24) / 44);
         return var4;
      } catch (RuntimeException var24) {
         throw class237.method1823(var24, field859[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method644(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 != 693) {
            field853 = -74;
         }

         ++field843;
         if (class270.field3734 == null || class290.field4017 == null) {
            class290.field4017 = new int[256];
            class270.field3734 = new int[256];
            int var2 = 0;
            if (var1 || ~var2 > -257) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class270.field3734[var2] = (int)(Math.sin(var3) * 4096.0D);
                  class290.field4017[var2] = (int)(Math.cos(var3) * 4096.0D);
                  ++var2;
               } while(~var2 > -257);
            }
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field859[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method645(byte arg0) {
      try {
         field845 = null;
         if (arg0 <= 100) {
            method645((byte)-95);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field859[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (arg2 <= 49) {
            this.method6(78, -23);
         }

         ++field844;
         if (arg0 != 0) {
            if (~arg0 == -2) {
               this.field855 = arg1.method1143(-15465);
               return;
            }

            if (~arg0 == -3) {
               this.field850 = arg1.method1211(-26166);
               return;
            }

            if (~arg0 == -4) {
               this.field848 = arg1.method1143(-15465);
               return;
            }

            if (~arg0 == -5) {
               this.field857 = arg1.method1143(-15465);
               return;
            }

            if (~arg0 == -6) {
               this.field849 = arg1.method1143(-15465);
               return;
            }

            if (arg0 != 6) {
               return;
            }

            if (!client.field4360) {
               this.field846 = arg1.method1143(-15465);
               return;
            }
         }

         this.field849 = this.field846 = arg1.method1143(-15465);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field859[7] + arg0 + ',' + (arg1 != null ? field859[1] : field859[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method646(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "()V"
   )
   public class69() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method413(int arg0) {
      try {
         ++field847;
         this.field858 = class106.method870((byte)89, this.field855);
         this.method646((byte)8);
         if (arg0 < 49) {
            this.method413(115);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field859[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(I[III[Ljava/lang/String;)V"
   )
   public static final void method647(int arg0, int[] arg1, int arg2, int arg3, String[] arg4) {
      boolean var5 = client.field4360;

      try {
         ++field851;
         if (~arg2 < ~arg0) {
            int var6 = (arg0 - -arg2) / 2;
            int var7 = arg0;
            String var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            int var9 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var9;
            int var10 = arg0;
            String var11;
            int var12;
            if (var5) {
               if (var8 != null) {
                  if (arg4[arg0] != null) {
                     if (~arg4[arg0].compareTo(var8) > ~(1 & arg0)) {
                        var11 = arg4[arg0];
                        arg4[arg0] = arg4[arg0];
                        arg4[arg0] = var11;
                        var12 = arg1[arg0];
                        arg1[arg0] = arg1[arg0];
                        var7 = arg0 + 1;
                        arg1[arg0] = var12;
                        var10 = arg0 + 1;
                     } else {
                        var10 = arg0 + 1;
                     }
                  } else {
                     var10 = arg0 + 1;
                  }
               } else {
                  var11 = arg4[arg0];
                  arg4[arg0] = arg4[arg0];
                  arg4[arg0] = var11;
                  var12 = arg1[arg0];
                  arg1[arg0] = arg1[arg0];
                  var7 = arg0 + 1;
                  arg1[arg0] = var12;
                  var10 = arg0 + 1;
               }
            }

            while(true) {
               while(~var10 > ~arg2) {
                  if (var8 != null) {
                     if (arg4[var10] != null) {
                        if (~arg4[var10].compareTo(var8) > ~(1 & var10)) {
                           var11 = arg4[var10];
                           arg4[var10] = arg4[var7];
                           arg4[var7] = var11;
                           var12 = arg1[var10];
                           arg1[var10] = arg1[var7];
                           arg1[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg4[var10];
                     arg4[var10] = arg4[var7];
                     arg4[var7] = var11;
                     var12 = arg1[var10];
                     arg1[var10] = arg1[var7];
                     arg1[var7++] = var12;
                     ++var10;
                  }
               }

               arg4[arg2] = arg4[var7];
               arg4[var7] = var8;
               arg1[arg2] = arg1[var7];
               arg1[var7] = var9;
               method647(arg0, arg1, var7 + -1, -117, arg4);
               int var10000 = var7 - -1;
               if (!var5) {
                  method647(var10000, arg1, arg2, -127, arg4);
                  break;
               }

               if (var10000 > ~(1 & var10)) {
                  var11 = arg4[var10];
                  arg4[var10] = arg4[var7];
                  arg4[var7] = var11;
                  var12 = arg1[var10];
                  arg1[var10] = arg1[var7];
                  arg1[var7++] = var12;
                  ++var10;
               } else {
                  ++var10;
               }
            }
         }

         if (arg3 >= -98) {
            method647(68, (int[])null, 119, -101, (String[])null);
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field859[0] + arg0 + ',' + (arg1 != null ? field859[1] : field859[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field859[1] : field859[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method648(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method649(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
