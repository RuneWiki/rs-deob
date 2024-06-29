import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class770 extends class302 {
   @OriginalMember(
      owner = "client!fl",
      name = "K",
      descriptor = "I"
   )
   private int field11289 = 1;
   @OriginalMember(
      owner = "client!fl",
      name = "N",
      descriptor = "I"
   )
   private int field11288 = 0;
   @OriginalMember(
      owner = "client!fl",
      name = "I",
      descriptor = "I"
   )
   private int field11294 = 0;
   @OriginalMember(
      owner = "client!fl",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11298 = new String[]{method5571(method5570("{L7;\u0011")), method5571(method5570("{L7:\u0011")), method5571(method5570("{L78\u0011")), method5571(method5570("{L7>\u0011")), method5571(method5570("f\u000e7QD")), method5571(method5570("sUu\u0013")), method5571(method5570("{L7<\u0011")), method5571(method5570("{L79\u0011"))};
   @OriginalMember(
      owner = "client!fl",
      name = "Q",
      descriptor = "I"
   )
   public static int field11295 = -1;
   @OriginalMember(
      owner = "client!fl",
      name = "O",
      descriptor = "[I"
   )
   public static int[] field11291 = new int[200];
   @OriginalMember(
      owner = "client!fl",
      name = "M",
      descriptor = "Lsda;"
   )
   public static class269 field11287 = new class269(71, 7);
   @OriginalMember(
      owner = "client!fl",
      name = "L",
      descriptor = "I"
   )
   public static int field11290;
   @OriginalMember(
      owner = "client!fl",
      name = "J",
      descriptor = "I"
   )
   public static int field11292;
   @OriginalMember(
      owner = "client!fl",
      name = "R",
      descriptor = "I"
   )
   public static int field11293;
   @OriginalMember(
      owner = "client!fl",
      name = "P",
      descriptor = "I"
   )
   public static int field11296;
   @OriginalMember(
      owner = "client!fl",
      name = "H",
      descriptor = "I"
   )
   public static int field11297;

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(ZILln;II)V",
      line = 3
   )
   public static final void method5567(boolean arg0, int arg1, class397 arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field11293;
         if (!arg0) {
            field11295 = -7;
         }

         class283 var6 = arg2.method3052(20733);
         int var7 = -arg2.field6077.field11424 + arg2.field6019 & 16383;
         if (arg1 == -1) {
            if (~var7 == -1 && arg2.field6056 <= 25) {
               if (!arg2.field6106 || !var6.method2162((byte)86, arg2.field6078)) {
                  arg2.field6078 = var6.method2161((byte)-117);
                  arg2.field6106 = ~arg2.field6078 != 0;
               }

            } else {
               label316: {
                  if (arg4 < 0 && var6.field3953 != -1) {
                     arg2.field6106 = false;
                     arg2.field6078 = var6.field3953;
                     if (var5 == 0) {
                        break label316;
                     }
                  }

                  if (~arg4 < -1 && var6.field3952 != -1) {
                     arg2.field6078 = var6.field3952;
                     if (var5 == 0) {
                        break label316;
                     }
                  }

                  arg2.field6078 = var6.field3930;
               }

               arg2.field6106 = false;
            }
         } else if (arg2.field6048 == -1 || ~var7 > -10241 && var7 > 2048) {
            if (~var7 == -1 && arg2.field6056 <= 25) {
               arg2.field6106 = false;
               if (arg1 == 2 && var6.field3959 != -1) {
                  arg2.field6078 = var6.field3959;
               } else if (arg1 == 0 && ~var6.field3950 != 0) {
                  arg2.field6078 = var6.field3950;
               } else {
                  arg2.field6078 = var6.field3930;
               }
            } else {
               label341: {
                  if (~arg1 != -3 || ~var6.field3959 == 0) {
                     if (~arg1 != -1 || var6.field3950 == -1) {
                        if (~arg4 <= -1 || ~var6.field3932 == 0) {
                           if (arg4 > 0 && ~var6.field3963 != 0) {
                              arg2.field6078 = var6.field3963;
                              if (var5 == 0) {
                                 break label341;
                              }
                           }

                           arg2.field6078 = var6.field3930;
                           if (var5 == 0) {
                              break label341;
                           }
                        }

                        arg2.field6078 = var6.field3932;
                        if (var5 == 0) {
                           break label341;
                        }
                     }

                     if (~arg4 > -1 && ~var6.field3954 != 0) {
                        arg2.field6078 = var6.field3954;
                        if (var5 == 0) {
                           break label341;
                        }
                     }

                     if (arg4 <= 0 || var6.field3929 == -1) {
                        arg2.field6078 = var6.field3950;
                        if (var5 == 0) {
                           break label341;
                        }
                     }

                     arg2.field6078 = var6.field3929;
                     if (var5 == 0) {
                        break label341;
                     }
                  }

                  if (arg4 >= 0 || var6.field3951 == -1) {
                     if (arg4 <= 0 || var6.field3955 == -1) {
                        arg2.field6078 = var6.field3959;
                        if (var5 == 0) {
                           break label341;
                        }
                     }

                     arg2.field6078 = var6.field3955;
                     if (var5 == 0) {
                        break label341;
                     }
                  }

                  arg2.field6078 = var6.field3951;
               }

               arg2.field6106 = false;
            }
         } else {
            int var8 = class625.field9095[arg3] + -arg2.field6077.field11424 & 16383;
            arg2.field6106 = false;
            if (~arg1 == -3 && ~var6.field3959 != 0) {
               if (var8 > 2048 && ~var8 >= -6145 && var6.field3942 != -1) {
                  arg2.field6078 = var6.field3942;
               } else if (var8 >= 10240 && ~var8 > -14337 && var6.field3960 != -1) {
                  arg2.field6078 = var6.field3960;
               } else if (var8 > 6144 && var8 < 10240 && var6.field3964 != -1) {
                  arg2.field6078 = var6.field3964;
               } else {
                  arg2.field6078 = var6.field3959;
               }
            } else if (~arg1 == -1 && var6.field3950 != -1) {
               if (~var8 < -2049 && var8 <= 6144 && var6.field3977 != -1) {
                  arg2.field6078 = var6.field3977;
               } else if (var8 >= 10240 && var8 < 14336 && var6.field3949 != -1) {
                  arg2.field6078 = var6.field3949;
               } else if (var8 > 6144 && var8 < 10240 && ~var6.field3938 != 0) {
                  arg2.field6078 = var6.field3938;
               } else {
                  arg2.field6078 = var6.field3950;
               }
            } else if (~var8 < -2049 && ~var8 >= -6145 && ~var6.field3943 != 0) {
               arg2.field6078 = var6.field3943;
            } else if (var8 >= 10240 && ~var8 > -14337 && var6.field3976 != -1) {
               arg2.field6078 = var6.field3976;
            } else if (~var8 < -6145 && ~var8 > -10241 && var6.field3940 != -1) {
               arg2.field6078 = var6.field3940;
            } else {
               arg2.field6078 = var6.field3930;
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field11298[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11298[4] : field11298[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(II)[I",
      line = 166
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field11297;
         if (arg1 > -37) {
            field11291 = null;
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int var5 = class23.field241[arg0];
            int var6 = var5 + -2048 >> 1;
            int var7 = 0;
            if (var3 != 0 || var7 < class344.field5238) {
               do {
                  int var10;
                  label40: {
                     int var8 = class757.field11167[var7];
                     int var9 = var8 + -2048 >> 1;
                     if (~this.field11294 == -1) {
                        var10 = (-var5 + var8) * this.field11289;
                        if (var3 == 0) {
                           break label40;
                        }
                     }

                     int var11 = var9 * var9 - -(var6 * var6) >> 12;
                     int var12 = (int)(4096.0D * Math.sqrt((double)((float)var11 / 4096.0F)));
                     var10 = (int)((double)(this.field11289 * var12) * 3.141592653589793D);
                  }

                  int var13;
                  label44: {
                     var13 = var10 - (-4096 & var10);
                     if (this.field11288 == 0) {
                        var13 = class731.field10851[(4087 & var13) >> 4] + 4096 >> 1;
                        if (var3 == 0) {
                           break label44;
                        }
                     }

                     if (this.field11288 == 2) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                           var13 = -var13;
                        }

                        var13 = -var13 + 2048 << 1;
                     }
                  }

                  var4[var7] = var13;
                  ++var7;
               } while(var7 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field11298[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "()V",
      line = 237
   )
   public class770() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fl",
      name = "f",
      descriptor = "(I)V",
      line = 240
   )
   public static void method5568(int arg0) {
      try {
         if (arg0 < 24) {
            method5568(-33);
         }

         field11287 = null;
         field11291 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11298[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "(IZI)V",
      line = 258
   )
   public static final void method5569(int arg0, boolean arg1, int arg2) {
      try {
         ++field11292;
         class403 var3 = class453.method3410((long)arg2, arg1, 5);
         var3.method3093(22144);
         var3.field6185 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11298[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 276
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field11296;
         if (arg1 != 0) {
            this.field11288 = 20;
         }

         if (~arg0 != -1) {
            if (arg0 == 1) {
               this.field11288 = arg2.method1104(255);
               return;
            }

            if (arg0 != 3) {
               return;
            }

            if (client.field4530 == 0) {
               this.field11289 = arg2.method1104(255);
               return;
            }
         }

         this.field11294 = arg2.method1104(255);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11298[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11298[4] : field11298[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "(B)V",
      line = 322
   )
   public final void method708(byte arg0) {
      try {
         ++field11290;
         if (arg0 > -87) {
            this.method401(-63, 109);
         }

         class378.method2923(-117);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11298[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5570(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5571(char[] arg0) {
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
            var10005 = 32;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
