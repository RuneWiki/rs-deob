import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class398 extends class588 {
   @OriginalMember(
      owner = "client!aha",
      name = "s",
      descriptor = "I"
   )
   private int field5856 = -1;
   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5862 = new String[]{method3072(method3071("wO\\ZS>")), method3072(method3071("xRQ\u0018")), method3072(method3071("wO\\ZT>")), method3072(method3071("e\u001dQ\u0006")), method3072(method3071("m\t\u0013Zj")), method3072(method3071("wO\\ZV>")), method3072(method3071("wO\\Z_>")), method3072(method3071("wO\\ZU>"))};
   @OriginalMember(
      owner = "client!aha",
      name = "q",
      descriptor = "Lld;"
   )
   public static class178 field5859 = new class178(8);
   @OriginalMember(
      owner = "client!aha",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field5860 = false;
   @OriginalMember(
      owner = "client!aha",
      name = "v",
      descriptor = "I"
   )
   public static int field5855;
   @OriginalMember(
      owner = "client!aha",
      name = "u",
      descriptor = "I"
   )
   public static int field5857;
   @OriginalMember(
      owner = "client!aha",
      name = "r",
      descriptor = "I"
   )
   public static int field5858;
   @OriginalMember(
      owner = "client!aha",
      name = "t",
      descriptor = "I"
   )
   public static int field5861;

   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method3068(boolean arg0) {
      try {
         field5859 = null;
         if (arg0) {
            method3069((class200)null, 22, 76);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5862[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 15
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field5856 = arg1.method3565(true);
         int var3 = -102 % ((arg0 - -26) / 33);
         ++field5858;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5862[6] + arg0 + ',' + (arg1 != null ? field5862[4] : field5862[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Lkk;II)V",
      line = 30
   )
   public static final void method3069(class200 arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field5855;
         boolean var4 = arg0.method1714((byte)-34, 1) == 1;
         if (var4) {
            class342.field4857[class477.field6954++] = arg1;
         }

         int var5 = arg0.method1714((byte)-34, 2);
         class457 var6 = class458.field6723[arg1];
         if (~var5 == -1) {
            if (var4) {
               var6.field6702 = false;
            } else if (~class20.field324 == ~arg1) {
               throw new RuntimeException(field5862[3]);
            } else {
               class312 var7;
               label191: {
                  var7 = class60.field1140[arg1] = new class312();
                  var7.field4494 = (var6.field4090 << 28) + ((var6.field11313[0] + class347.field4939 >> 6 << 14) - -(class753.field10887 - -var6.field11322[0] >> 6));
                  if (var6.field6671 != -1) {
                     var7.field4493 = var6.field6671;
                     if (!var3) {
                        break label191;
                     }
                  }

                  var7.field4493 = var6.field11236.method3490((byte)-31);
               }

               var7.field4489 = var6.field6707;
               var7.field4492 = var6.field6672;
               var7.field4490 = var6.field11263;
               if (var6.field6689 > 0) {
                  class470.method3511(var6, arg2 + 934621361);
               }

               class458.field6723[arg1] = null;
               if (~arg0.method1714((byte)-34, 1) != -1) {
                  class722.method5238(arg1, arg0, (byte)-110);
               }

            }
         } else if (var5 == 1) {
            int var9;
            int var10;
            label300: {
               int var8 = arg0.method1714((byte)-34, 3);
               var9 = var6.field11313[0];
               var10 = var6.field11322[0];
               if (var8 == 0) {
                  --var9;
                  --var10;
                  if (!var3) {
                     break label300;
                  }
               }

               if (~var8 != -2) {
                  if (~var8 != -3) {
                     if (~var8 == -4) {
                        --var9;
                        if (!var3) {
                           break label300;
                        }
                     }

                     if (var8 == 4) {
                        ++var9;
                        if (!var3) {
                           break label300;
                        }
                     }

                     if (~var8 != -6) {
                        if (~var8 != -7) {
                           if (~var8 != -8) {
                              break label300;
                           }

                           ++var9;
                           ++var10;
                           if (!var3) {
                              break label300;
                           }
                        }

                        ++var10;
                        if (!var3) {
                           break label300;
                        }
                     }

                     ++var10;
                     --var9;
                     if (!var3) {
                        break label300;
                     }
                  }

                  --var10;
                  ++var9;
                  if (!var3) {
                     break label300;
                  }
               }

               --var10;
            }

            if (!var4) {
               var6.method3429(var9, arg2 + 934621106, class171.field2656[arg1], var10);
            } else {
               var6.field6670 = var10;
               var6.field6702 = true;
               var6.field6668 = var9;
            }
         } else if (~var5 == -3) {
            int var12;
            int var13;
            label303: {
               int var11 = arg0.method1714((byte)-34, 4);
               var12 = var6.field11313[0];
               var13 = var6.field11322[0];
               if (~var11 == -1) {
                  var12 -= 2;
                  var13 -= 2;
                  if (!var3) {
                     break label303;
                  }
               }

               if (var11 != 1) {
                  if (var11 == 2) {
                     var13 -= 2;
                     if (!var3) {
                        break label303;
                     }
                  }

                  if (var11 != 3) {
                     if (~var11 != -5) {
                        if (var11 == 5) {
                           --var13;
                           var12 -= 2;
                           if (!var3) {
                              break label303;
                           }
                        }

                        if (var11 != 6) {
                           if (~var11 != -8) {
                              if (var11 != 8) {
                                 if (~var11 == -10) {
                                    ++var13;
                                    var12 -= 2;
                                    if (!var3) {
                                       break label303;
                                    }
                                 }

                                 if (var11 != 10) {
                                    if (var11 != 11) {
                                       if (~var11 == -13) {
                                          --var12;
                                          var13 += 2;
                                          if (!var3) {
                                             break label303;
                                          }
                                       }

                                       if (~var11 != -14) {
                                          if (var11 != 14) {
                                             if (var11 != 15) {
                                                break label303;
                                             }

                                             var12 += 2;
                                             var13 += 2;
                                             if (!var3) {
                                                break label303;
                                             }
                                          }

                                          var13 += 2;
                                          ++var12;
                                          if (!var3) {
                                             break label303;
                                          }
                                       }

                                       var13 += 2;
                                       if (!var3) {
                                          break label303;
                                       }
                                    }

                                    var13 += 2;
                                    var12 -= 2;
                                    if (!var3) {
                                       break label303;
                                    }
                                 }

                                 ++var13;
                                 var12 += 2;
                                 if (!var3) {
                                    break label303;
                                 }
                              }

                              var12 += 2;
                              if (!var3) {
                                 break label303;
                              }
                           }

                           var12 -= 2;
                           if (!var3) {
                              break label303;
                           }
                        }

                        --var13;
                        var12 += 2;
                        if (!var3) {
                           break label303;
                        }
                     }

                     var12 += 2;
                     var13 -= 2;
                     if (!var3) {
                        break label303;
                     }
                  }

                  ++var12;
                  var13 -= 2;
                  if (!var3) {
                     break label303;
                  }
               }

               --var12;
               var13 -= 2;
            }

            if (!var4) {
               var6.method3429(var12, 0, class171.field2656[arg1], var13);
            } else {
               var6.field6668 = var12;
               var6.field6670 = var13;
               var6.field6702 = true;
            }
         } else if (arg2 == -934621106) {
            int var14 = arg0.method1714((byte)-34, 1);
            if (~var14 == -1) {
               int var15 = arg0.method1714((byte)-34, 12);
               int var16 = var15 >> 10;
               int var17 = 31 & var15 >> 5;
               if (~var17 < -16) {
                  var17 -= 32;
               }

               int var18 = 31 & var15;
               if (var18 > 15) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label279: {
                  var19 = var6.field11313[0] - -var17;
                  var20 = var6.field11322[0] + var18;
                  if (var4) {
                     var6.field6702 = true;
                     var6.field6668 = var19;
                     var6.field6670 = var20;
                     if (!var3) {
                        break label279;
                     }
                  }

                  var6.method3429(var19, 0, class171.field2656[arg1], var20);
               }

               var6.field4090 = var6.field4091 = (byte)(3 & var6.field4090 + var16);
               if (class561.method4189(var19, -32018, var20)) {
                  ++var6.field4091;
               }

               if (~class20.field324 == ~arg1) {
                  if (class731.field10504 != var6.field4090) {
                     class186.field2818 = true;
                  }

                  class731.field10504 = var6.field4090;
               }

            } else {
               int var22;
               int var25;
               int var26;
               label289: {
                  int var21 = arg0.method1714((byte)-34, 30);
                  var22 = var21 >> 28;
                  int var23 = (268432079 & var21) >> 14;
                  int var24 = var21 & 16383;
                  var25 = (var6.field11313[0] + class347.field4939 - -var23 & 16383) + -class347.field4939;
                  var26 = (var6.field11322[0] - -class753.field10887 - -var24 & 16383) - class753.field10887;
                  if (!var4) {
                     var6.method3429(var25, arg2 + 934621106, class171.field2656[arg1], var26);
                     if (!var3) {
                        break label289;
                     }
                  }

                  var6.field6702 = true;
                  var6.field6670 = var26;
                  var6.field6668 = var25;
               }

               var6.field4090 = var6.field4091 = (byte)(var6.field4090 + var22 & 3);
               if (class561.method4189(var25, -32018, var26)) {
                  ++var6.field4091;
               }

               if (class20.field324 == arg1) {
                  class731.field10504 = var6.field4090;
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field5862[2] + (arg0 != null ? field5862[4] : field5862[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Lwga;I)V",
      line = 360
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5617(22124, this.field5856);
         if (arg1 <= -120) {
            ++field5857;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5862[7] + (arg0 != null ? field5862[4] : field5862[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(ILjava/util/Random;B)I",
      line = 377
   )
   public static final int method3070(int arg0, Random arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         ++field5861;
         if (~arg0 >= -1) {
            throw new IllegalArgumentException();
         } else if (class756.method5476((byte)-63, arg0)) {
            return (int)(((long)arg1.nextInt() & 4294967295L) * (long)arg0 >> 32);
         } else if (arg2 <= 15) {
            return -61;
         } else {
            int var4 = -((int)(4294967296L % (long)arg0)) + Integer.MIN_VALUE;

            while(true) {
               int var5 = arg1.nextInt();

               while(var4 > var5) {
                  if (!var3) {
                     return class642.method4701((byte)121, arg0, var5);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5862[5] + arg0 + ',' + (arg1 != null ? field5862[4] : field5862[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3071(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3072(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
