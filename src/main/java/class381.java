import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class381 extends class345 {
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5652 = new String[]{method2972(method2971("Pl\u0002<-")), method2972(method2971("E7@~")), method2972(method2971("G.\u0002Zx")), method2972(method2971("G.\u0002Qx")), method2972(method2971("G.\u0002Sx")), method2972(method2971("G.\u0002Vx")), method2972(method2971("G.\u0002Wx")), method2972(method2971("G.\u0002Px")), method2972(method2971("G.\u0002[x")), method2972(method2971("G.\u0002Tx")), method2972(method2971("G.\u0002Yx")), method2972(method2971("G.\u0002Ux"))};
   @OriginalMember(
      owner = "client!ll",
      name = "q",
      descriptor = "I"
   )
   public static int field5640 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "p",
      descriptor = "J"
   )
   public static long field5642 = 1L;
   @OriginalMember(
      owner = "client!ll",
      name = "s",
      descriptor = "I"
   )
   public static int field5649 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "n",
      descriptor = "I"
   )
   public static int field5638;
   @OriginalMember(
      owner = "client!ll",
      name = "o",
      descriptor = "I"
   )
   public static int field5639;
   @OriginalMember(
      owner = "client!ll",
      name = "u",
      descriptor = "I"
   )
   public static int field5641;
   @OriginalMember(
      owner = "client!ll",
      name = "t",
      descriptor = "I"
   )
   public static int field5643;
   @OriginalMember(
      owner = "client!ll",
      name = "r",
      descriptor = "I"
   )
   public static int field5644;
   @OriginalMember(
      owner = "client!ll",
      name = "m",
      descriptor = "I"
   )
   public static int field5645;
   @OriginalMember(
      owner = "client!ll",
      name = "l",
      descriptor = "I"
   )
   public static int field5646;
   @OriginalMember(
      owner = "client!ll",
      name = "k",
      descriptor = "I"
   )
   public static int field5647;
   @OriginalMember(
      owner = "client!ll",
      name = "i",
      descriptor = "I"
   )
   public static int field5648;
   @OriginalMember(
      owner = "client!ll",
      name = "v",
      descriptor = "I"
   )
   public static int field5650;
   @OriginalMember(
      owner = "client!ll",
      name = "j",
      descriptor = "I"
   )
   public static int field5651;

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         label27: {
            ++field5638;
            if (super.field4914.method5561(arg0) == class459.field6730) {
               if (!super.field4914.method5560(13750)) {
                  break label27;
               }

               super.field4913 = 0;
               if (!client.field4564) {
                  break label27;
               }
            }

            super.field4913 = 1;
         }

         if (~super.field4913 != -1 && super.field4913 != 1) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5652[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "([I[IILuba;[I)V"
   )
   public static final void method2965(int[] arg0, int[] arg1, int arg2, class451 arg3, int[] arg4) {
      boolean var5 = client.field4564;

      try {
         int var6 = 0;
         if (arg2 == -1) {
            while(true) {
               int var10000 = ~arg0.length;
               int var10001 = ~var6;

               label123:
               while(true) {
                  if (var10000 >= var10001) {
                     var10000 = field5641 + 1;
                     if (!var5) {
                        field5641 = var10000;
                        return;
                     }
                  } else {
                     var10000 = arg0[var6];
                  }

                  int var7 = var10000;
                  int var8 = arg1[var6];
                  int var9 = arg4[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (var8 == 0) {
                        break;
                     }

                     var10000 = var10;
                     var10001 = arg3.field11240.length;
                     if (var5) {
                        continue;
                     }

                     if (var10 >= var10001) {
                        break;
                     }
                  }

                  while(true) {
                     if (~(var8 & 1) != -1) {
                        label136: {
                           if (var7 == -1) {
                              arg3.field11240[var10] = null;
                              if (!var5) {
                                 break label136;
                              }
                           }

                           class295 var11 = class588.field8496.method3781(5, var7);
                           int var12 = var11.field4114;
                           class716 var13 = arg3.field11240[var10];
                           if (var13 != null) {
                              if (~var13.field10358 == ~var7) {
                                 if (var12 != 0) {
                                    label113: {
                                       if (var12 != 1) {
                                          if (~var12 != -3) {
                                             break label113;
                                          }

                                          var13.field10361 = 0;
                                          if (!var5) {
                                             break label113;
                                          }
                                       }

                                       var13.field10363 = 1;
                                       var13.field10361 = 0;
                                       var13.field10359 = 0;
                                       var13.field10362 = var9;
                                       var13.field10360 = 0;
                                       if (!arg3.field11222) {
                                          class720.method5205(0, arg3, 0, var11);
                                          if (var5) {
                                             var13 = arg3.field11240[var10] = null;
                                          }
                                       }
                                    }
                                 } else {
                                    var13 = arg3.field11240[var10] = null;
                                 }
                              } else if (~var11.field4108 <= ~class588.field8496.method3781(5, var13.field10358).field4108) {
                                 var13 = arg3.field11240[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class716 var14 = arg3.field11240[var10] = new class716();
                              var14.field10362 = var9;
                              var14.field10360 = 0;
                              var14.field10358 = var7;
                              var14.field10363 = 1;
                              var14.field10361 = 0;
                              var14.field10359 = 0;
                              if (!arg3.field11222) {
                                 class720.method5205(arg2 + 1, arg3, 0, var11);
                              }
                           }
                        }
                     }

                     ++var10;
                     var8 >>>= 1;
                     if (var8 == 0) {
                        break label123;
                     }

                     var10000 = var10;
                     var10001 = arg3.field11240.length;
                     if (var5) {
                        break;
                     }

                     if (var10 >= var10001) {
                        break label123;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field5652[2] + (arg0 != null ? field5652[0] : field5652[1]) + ',' + (arg1 != null ? field5652[0] : field5652[1]) + ',' + arg2 + ',' + (arg3 != null ? field5652[0] : field5652[1]) + ',' + (arg4 != null ? field5652[0] : field5652[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field5648;
         if (arg1 >= 99) {
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5652[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Loha;ZI)V"
   )
   public static final void method2966(class771 arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field5651 = -18;
         }

         ++field5639;
         if (arg0.field11288 != null) {
            int var3 = arg0.field11288[arg2 + 1];
            if (~arg0.field11224 != ~var3) {
               arg0.field11250 = 0;
               arg0.field11224 = var3;
               arg0.field11231 = 1;
               arg0.field11234 = 0;
               arg0.field11267 = 0;
               arg0.field11316 = arg0.field11321;
               if (~arg0.field11224 != 0) {
                  class720.method5205(0, arg0, arg0.field11267, class588.field8496.method3781(5, arg0.field11224));
                  return;
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5652[4] + (arg0 != null ? field5652[0] : field5652[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2967(boolean arg0) {
      try {
         ++field5647;
         if (arg0) {
            this.method2967(false);
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5652[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2968(byte arg0) {
      try {
         ++field5644;
         if (super.field4914.method5560(13750)) {
            return false;
         } else if (super.field4914.method5561(0) == class459.field6730) {
            return true;
         } else {
            return arg0 > -127;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5652[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            this.method54(2, (byte)-101);
         }

         ++field5650;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else if (super.field4914.method5561(0) == class459.field6730) {
            if (arg1 == 0) {
               if (~super.field4914.field11181.method1262(false) == -2) {
                  return 2;
               }

               if (super.field4914.field11166.method5470(false) == 1) {
                  return 2;
               }

               if (~super.field4914.field11150.method1313(false) < -1) {
                  return 2;
               }
            }

            return 1;
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5652[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class381(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return -108;
         } else {
            ++field5646;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5652[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method2969(int arg0) {
      try {
         int var1 = 105 / ((-13 - arg0) / 49);
         ++field5645;
         return class124.field2055;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5652[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IILjfa;I)V"
   )
   public static final void method2970(int arg0, int arg1, class303 arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         label128: {
            ++field5643;
            if (~arg2.field4338 != -1) {
               if (arg2.field4338 != 1) {
                  if (~arg2.field4338 == -3) {
                     arg2.field4323 = -arg2.field4327 + arg0 + -arg2.field4226;
                     if (!var4) {
                        break label128;
                     }
                  }

                  if (arg2.field4338 == 3) {
                     arg2.field4323 = arg2.field4327 * arg0 >> 14;
                     if (!var4) {
                        break label128;
                     }
                  }

                  if (~arg2.field4338 == -5) {
                     arg2.field4323 = (arg2.field4327 * arg0 >> 14) + (-arg2.field4226 + arg0) / 2;
                     if (!var4) {
                        break label128;
                     }
                  }

                  arg2.field4323 = -arg2.field4226 + arg0 + -(arg2.field4327 * arg0 >> 14);
                  if (!var4) {
                     break label128;
                  }
               }

               arg2.field4323 = (-arg2.field4226 + arg0) / 2 + arg2.field4327;
               if (!var4) {
                  break label128;
               }
            }

            arg2.field4323 = arg2.field4327;
         }

         label111: {
            if (~arg2.field4274 != -1) {
               if (arg2.field4274 == 1) {
                  arg2.field4279 = (arg1 - arg2.field4308) / 2 + arg2.field4385;
                  if (!var4) {
                     break label111;
                  }
               }

               if (arg2.field4274 == 2) {
                  arg2.field4279 = -arg2.field4385 + -arg2.field4308 + arg1;
                  if (!var4) {
                     break label111;
                  }
               }

               if (~arg2.field4274 == -4) {
                  arg2.field4279 = arg2.field4385 * arg1 >> 14;
                  if (!var4) {
                     break label111;
                  }
               }

               if (~arg2.field4274 != -5) {
                  arg2.field4279 = -(arg2.field4385 * arg1 >> 14) + arg1 - arg2.field4308;
                  if (!var4) {
                     break label111;
                  }
               }

               arg2.field4279 = (arg2.field4385 * arg1 >> 14) + (-arg2.field4308 + arg1) / 2;
               if (!var4) {
                  break label111;
               }
            }

            arg2.field4279 = arg2.field4385;
         }

         if (class589.field8508 && (~client.method2454(arg2).field10311 != -1 || ~arg2.field4270 == -1)) {
            label139: {
               label88: {
                  if (~arg2.field4323 > -1) {
                     arg2.field4323 = 0;
                     if (!var4) {
                        break label88;
                     }
                  }

                  if (arg2.field4323 + arg2.field4226 > arg0) {
                     arg2.field4323 = -arg2.field4226 + arg0;
                  }
               }

               if (arg2.field4279 < 0) {
                  arg2.field4279 = 0;
                  if (!var4) {
                     break label139;
                  }
               }

               if (~(arg2.field4308 + arg2.field4279) < ~arg1) {
                  arg2.field4279 = arg1 - arg2.field4308;
               }
            }
         }

         if (arg3 != 1) {
            field5640 = -1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5652[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5652[0] : field5652[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class381(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2971(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2972(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
