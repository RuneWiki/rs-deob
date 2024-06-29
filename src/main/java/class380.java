import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pka")
public class class380 extends class247 {
   @OriginalMember(
      owner = "client!pka",
      name = "o",
      descriptor = "[I"
   )
   public int[] field5559 = new int[]{-1};
   @OriginalMember(
      owner = "client!pka",
      name = "j",
      descriptor = "[I"
   )
   public int[] field5560 = new int[1];
   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5562 = new String[]{method2971(method2970(".uv\u0001Ov")), method2971(method2970(".uv\u0001Jv")), method2971(method2970("0k{C")), method2971(method2970("%09\u0001s")), method2971(method2970(".uv\u0001Kv")), method2971(method2970(".uv\u0001Mv"))};
   @OriginalMember(
      owner = "client!pka",
      name = "k",
      descriptor = "I"
   )
   public static int field5556;
   @OriginalMember(
      owner = "client!pka",
      name = "m",
      descriptor = "I"
   )
   public static int field5557;
   @OriginalMember(
      owner = "client!pka",
      name = "l",
      descriptor = "I"
   )
   public static int field5558;
   @OriginalMember(
      owner = "client!pka",
      name = "n",
      descriptor = "I"
   )
   public static int field5561;

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(IIIIIIIIZ)Z"
   )
   public static final boolean method2965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
      try {
         ++field5557;
         if (~arg5 > ~(arg0 + arg7) && arg7 < arg1 + arg5) {
            if (~(arg2 + arg4) < ~arg6 && ~(arg3 + arg6) < ~arg2) {
               if (!arg8) {
                  method2966(9, 78, -53, -31, -80);
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5562[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2966(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class157.field2392 != null) {
         class157.field2392[arg0][arg1] = -16777216 | arg2;
      }

      if (class175.field2603 != null) {
         class175.field2603[arg0][arg1] = (short)arg3;
      }

      if (class6.field103 != null) {
         class6.field103[arg0][arg1] = (byte)arg4;
      }

   }

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2967(int arg0) {
      try {
         class712.field10231 = null;
         class292.field4377 = null;
         class697.field10061 = null;
         class56.field805 = -1;
         class558.field7928 = null;
         class217.field3113 = -1;
         class265.field4047 = -1;
         ++field5558;
         if (arg0 != 0) {
            method2966(-75, 100, 54, -8, 92);
         }

         class614.field8733 = null;
         class110.field1710 = null;
         class162.field2469 = null;
         class434.field6363 = -1;
         class662.field9321.method1567((byte)-110);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5562[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(I[IBZ[I)J"
   )
   private final long method2968(int arg0, int[] arg1, byte arg2, boolean arg3, int[] arg4) {
      boolean var6 = client.field10022;

      try {
         ++field5556;
         long[] var7 = class575.field8135;
         long var8 = -1L;
         long var10 = var7[(int)((var8 ^ (long)(arg0 >> 8)) & 255L)] ^ var8 >>> 8;
         long var12 = var7[(int)(((long)arg0 ^ var10) & 255L)] ^ var10 >>> 8;
         int var14 = 0;
         long var15;
         long var17;
         long var19;
         if (var6) {
            var15 = var7[(int)(255L & (var12 ^ (long)(arg4[var14] >> 24)))] ^ var12 >>> 8;
            var17 = var15 >>> 8 ^ var7[(int)(255L & (var15 ^ (long)(arg4[var14] >> 16)))];
            var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg4[var14] >> 8)))];
            var12 = var19 >>> 8 ^ var7[(int)(255L & (var19 ^ (long)arg4[var14]))];
            ++var14;
         }

         while(true) {
            while(~arg4.length < ~var14) {
               var15 = var7[(int)(255L & (var12 ^ (long)(arg4[var14] >> 24)))] ^ var12 >>> 8;
               var17 = var15 >>> 8 ^ var7[(int)(255L & (var15 ^ (long)(arg4[var14] >> 16)))];
               var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg4[var14] >> 8)))];
               var12 = var19 >>> 8 ^ var7[(int)(255L & (var19 ^ (long)arg4[var14]))];
               ++var14;
            }

            if (!var6) {
               if (arg1 != null) {
                  int var21 = 0;
                  if (var6 || ~var21 > -6) {
                     do {
                        var12 = var7[(int)(255L & (var12 ^ (long)arg1[var21]))] ^ var12 >>> 8;
                        ++var21;
                     } while(~var21 > -6);
                  }
               }

               long var22 = var12 >>> 8 ^ var7[(int)(((long)(arg3 ? 1 : 0) ^ var12) & 255L)];
               int var24 = 23 / ((arg2 - 9) / 52);
               return var22;
            }

            ++var14;
         }
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field5562[4] + arg0 + ',' + (arg1 != null ? field5562[3] : field5562[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5562[3] : field5562[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "a",
      descriptor = "(Lha;ZIILof;ILaka;)Lka;"
   )
   public final class761 method2969(class17 arg0, boolean arg1, int arg2, int arg3, class384 arg4, int arg5, class258 arg6) {
      boolean var8 = client.field10022;

      try {
         ++field5561;
         class761 var9 = null;
         int var10 = arg5;
         class299 var11 = null;
         if (~arg2 != arg3) {
            var11 = class378.field5523.method1302((byte)-5, arg2);
         }

         int[] var12 = this.field5559;
         if (var11 != null && var11.field4435 != null) {
            var12 = new int[var11.field4435.length];
            int var13 = 0;
            if (var8 || var13 < var11.field4435.length) {
               do {
                  int var14 = var11.field4435[var13];
                  if (~var14 <= -1 && this.field5559.length > var14) {
                     var12[var13] = this.field5559[var14];
                     if (!var8) {
                        ++var13;
                        continue;
                     }
                  }

                  var12[var13] = -1;
                  ++var13;
               } while(var13 < var11.field4435.length);
            }
         }

         if (arg6 != null) {
            var10 = arg5 | arg6.method2197(-522362736);
         }

         long var15 = this.method2968(arg2, arg4 == null ? null : arg4.field5595, (byte)87, arg1, var12);
         if (class465.field6756 != null) {
            var9 = (class761)class465.field6756.method1041(var15, arg3 ^ 8);
         }

         if (var9 == null || ~arg0.method214(var9.method775(), var10) != -1) {
            if (var9 != null) {
               var10 = arg0.method246(var10, var9.method775());
            }

            int var17 = var10;
            byte var18 = 0;
            int var19 = 0;
            if (var8) {
               if (~var12[var19] != 0 && !class201.field2882.method5591(var12[var19], (byte)-84).method4548(-7202, (class487)null, arg1)) {
                  var18 = 1;
               }

               ++var19;
            }

            label259:
            while(true) {
               int var10000;
               if (~var19 <= ~var12.length) {
                  var10000 = var18;
                  if (!var8) {
                     if (var18 != 0) {
                        return null;
                     }

                     class590[] var20 = new class590[var12.length];
                     int var21 = 0;
                     if (var8) {
                        if (~var12[var21] != 0) {
                           var20[var21] = class201.field2882.method5591(var12[var21], (byte)-84).method4552((class487)null, (byte)-102, arg1);
                        }

                        ++var21;
                     }

                     while(true) {
                        while(var21 < var12.length) {
                           if (~var12[var21] != 0) {
                              var20[var21] = class201.field2882.method5591(var12[var21], (byte)-84).method4552((class487)null, (byte)-102, arg1);
                           }

                           ++var21;
                        }

                        if (!var8) {
                           if (var11 != null && var11.field4446 != null) {
                              int var22 = 0;
                              if (var8 || ~var11.field4446.length < ~var22) {
                                 do {
                                    if (var11.field4446[var22] != null) {
                                       if (var20[var22] == null && !var8) {
                                          ++var22;
                                       } else {
                                          int var23 = var11.field4446[var22][0];
                                          int var24 = var11.field4446[var22][1];
                                          int var25 = var11.field4446[var22][2];
                                          int var26 = var11.field4446[var22][3];
                                          int var27 = var11.field4446[var22][4];
                                          int var28 = var11.field4446[var22][5];
                                          if (var26 == 0) {
                                             if (var27 == 0) {
                                                if (var28 != 0) {
                                                   var20[var22].method4334(var27, var26, var28, arg3 ^ 12949);
                                                }
                                             } else {
                                                var20[var22].method4334(var27, var26, var28, arg3 ^ 12949);
                                             }
                                          } else {
                                             var20[var22].method4334(var27, var26, var28, arg3 ^ 12949);
                                          }

                                          if (~var23 == -1) {
                                             if (~var24 == -1) {
                                                if (~var25 != -1) {
                                                   var20[var22].method4342(var23, var24, var25, (byte)-110);
                                                   ++var22;
                                                } else {
                                                   ++var22;
                                                }
                                             } else {
                                                var20[var22].method4342(var23, var24, var25, (byte)-110);
                                                ++var22;
                                             }
                                          } else {
                                             var20[var22].method4342(var23, var24, var25, (byte)-110);
                                             ++var22;
                                          }
                                       }
                                    } else {
                                       ++var22;
                                    }
                                 } while(~var11.field4446.length < ~var22);
                              }
                           }

                           class590 var29 = new class590(var20, var20.length);
                           if (arg4 != null) {
                              var17 = var10 | 16384;
                           }

                           var9 = arg0.method240(var29, var17, class319.field4772, 64, 850);
                           if (arg4 != null) {
                              int var30 = 0;
                              if (var8 || ~var30 > -6) {
                                 do {
                                    int var31 = 0;
                                    if (var8) {
                                       if (~arg4.field5595[var30] > ~class533.field7512[var31][var30].length) {
                                          var9.method791(class266.field4055[var31][var30], class533.field7512[var31][var30][arg4.field5595[var30]]);
                                       }

                                       ++var31;
                                    }

                                    while(true) {
                                       while(~var31 > ~class533.field7512.length) {
                                          if (~arg4.field5595[var30] > ~class533.field7512[var31][var30].length) {
                                             var9.method791(class266.field4055[var31][var30], class533.field7512[var31][var30][arg4.field5595[var30]]);
                                          }

                                          ++var31;
                                       }

                                       if (!var8) {
                                          ++var30;
                                          break;
                                       }

                                       ++var31;
                                    }
                                 } while(~var30 > -6);
                              }
                           }

                           if (class465.field6756 != null) {
                              var9.method798(var10);
                              class465.field6756.method1050(-72, var9, var15);
                           }
                           break label259;
                        }

                        ++var21;
                     }
                  }
               } else {
                  var10000 = ~var12[var19];
               }

               if (var10000 != 0 && !class201.field2882.method5591(var12[var19], (byte)-84).method4548(-7202, (class487)null, arg1)) {
                  var18 = 1;
               }

               ++var19;
            }
         }

         if (arg6 == null) {
            return var9;
         } else {
            class761 var32 = var9.method755((byte)1, var10, true);
            arg6.method2211(var32, 0, (byte)109);
            return var32;
         }
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field5562[5] + (arg0 != null ? field5562[3] : field5562[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5562[3] : field5562[2]) + ',' + arg5 + ',' + (arg6 != null ? field5562[3] : field5562[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
