import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class158 extends class428 {
   @OriginalMember(
      owner = "client!pj",
      name = "w",
      descriptor = "[Lmca;"
   )
   public class33[] field2253;
   @OriginalMember(
      owner = "client!pj",
      name = "u",
      descriptor = "[B"
   )
   public byte[] field2250;
   @OriginalMember(
      owner = "client!pj",
      name = "r",
      descriptor = "[I"
   )
   private int[] field2258;
   @OriginalMember(
      owner = "client!pj",
      name = "t",
      descriptor = "[Lvea;"
   )
   public class289[] field2252;
   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "[B"
   )
   public byte[] field2257;
   @OriginalMember(
      owner = "client!pj",
      name = "o",
      descriptor = "[S"
   )
   public short[] field2261;
   @OriginalMember(
      owner = "client!pj",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field2260;
   @OriginalMember(
      owner = "client!pj",
      name = "A",
      descriptor = "I"
   )
   public int field2256;
   @OriginalMember(
      owner = "client!pj",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2265 = new String[]{method1328(method1327("kD-h[")), method1328(method1327("`\u0000-\u0002\u000e")), method1328(method1327("~\u001fo*")), method1328(method1327("`\u0000-zO~\u0003wx\u000e")), method1328(method1327("`\u0000-\u0003\u000e")), method1328(method1327("`\u0000-\u0005\u000e")), method1328(method1327("`\u0000-\u0004\u000e")), method1328(method1327("`\u0000-\u0007\u000e")), method1328(method1327("`\u0000-\u0000\u000e"))};
   @OriginalMember(
      owner = "client!pj",
      name = "v",
      descriptor = "I"
   )
   public static int field2255 = 0;
   @OriginalMember(
      owner = "client!pj",
      name = "y",
      descriptor = "Leg;"
   )
   public static class118 field2262 = new class118(105, -2);
   @OriginalMember(
      owner = "client!pj",
      name = "q",
      descriptor = "Lek;"
   )
   public static class536 field2264 = new class536(88, -1);
   @OriginalMember(
      owner = "client!pj",
      name = "n",
      descriptor = "I"
   )
   public static int field2248;
   @OriginalMember(
      owner = "client!pj",
      name = "p",
      descriptor = "I"
   )
   public static int field2249;
   @OriginalMember(
      owner = "client!pj",
      name = "x",
      descriptor = "I"
   )
   public static int field2251;
   @OriginalMember(
      owner = "client!pj",
      name = "C",
      descriptor = "I"
   )
   public static int field2254;
   @OriginalMember(
      owner = "client!pj",
      name = "s",
      descriptor = "I"
   )
   public static int field2259;
   @OriginalMember(
      owner = "client!pj",
      name = "B",
      descriptor = "I"
   )
   public static int field2263;

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1321(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1322(byte arg0) {
      try {
         field2262 = null;
         field2264 = null;
         if (arg0 != 40) {
            method1321(-35, -104, 96, -26, 127, -74, -24);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2265[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(Lnca;[BI[I)Z"
   )
   public final boolean method1323(class787 arg0, byte[] arg1, int arg2, int[] arg3) {
      boolean var5 = client.field4360;

      try {
         ++field2248;
         if (arg2 >= -74) {
            method1321(-38, 14, -55, 20, 81, -79, 37);
         }

         byte var6 = 1;
         int var7 = 0;
         class289 var8 = null;
         int var9 = 0;

         while(true) {
            label73: {
               int var10000;
               if (~var9 <= -129) {
                  var10000 = var6;
                  if (!var5) {
                     return (boolean)var6;
                  }
               } else {
                  if (arg1 != null && ~arg1[var9] == -1) {
                     break label73;
                  }

                  var10000 = this.field2258[var9];
               }

               int var10 = var10000;
               if (~var10 != -1) {
                  if (~var7 != ~var10) {
                     label62: {
                        var7 = var10--;
                        if (~(1 & var10) == -1) {
                           var8 = arg0.method5676(-20876, arg3, var10 >> 2);
                           if (!var5) {
                              break label62;
                           }
                        }

                        var8 = arg0.method5683(var10 >> 2, arg3, -998493968);
                     }

                     if (var8 == null) {
                        var6 = 0;
                     }
                  }

                  if (var8 != null) {
                     this.field2252[var9] = var8;
                     this.field2258[var9] = 0;
                  }
               }
            }

            ++var9;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field2265[1] + (arg0 != null ? field2265[0] : field2265[2]) + ',' + (arg1 != null ? field2265[0] : field2265[2]) + ',' + arg2 + ',' + (arg3 != null ? field2265[0] : field2265[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1324(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 2303) {
            method1325((String)null, (byte[])null, (byte)-124, -23);
         }

         ++field2254;
         if (class152.field2126 != class134.field1715) {
            if (!class53.method418(false, 1, 1, arg0, arg2, 0, (byte)42, -3, 0)) {
               class53.method418(false, 1, 1, arg0, arg2, 0, (byte)-83, -2, 0);
            }
         } else if (!class53.method418(false, 1, 1, arg0, arg2, 0, (byte)44, -2, 0)) {
            class53.method418(false, 1, 1, arg0, arg2, 0, (byte)109, -3, 0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2265[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(Ljava/lang/String;[BBI)I"
   )
   public static final int method1325(String arg0, byte[] arg1, byte arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         if (arg2 != -47) {
            return -41;
         } else {
            ++field2249;
            int var5 = arg3;
            int var6 = arg0.length();
            int var7 = 0;
            int var10000;
            if (var4) {
               var10000 = class668.method4875(-1, arg0.charAt(var7));
            } else if (~var7 <= ~var6) {
               var10000 = arg3 - arg3;
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = class668.method4875(-1, arg0.charAt(var7));
            }

            label91:
            do {
               while(true) {
                  while(true) {
                     int var8 = var10000;
                     int var9 = var7 + 1 < var6 ? class668.method4875(-1, arg0.charAt(var7 + 1)) : -1;
                     int var10 = var7 + 2 >= var6 ? -1 : class668.method4875(-1, arg0.charAt(var7 + 2));
                     int var11 = ~var6 >= ~(var7 + 3) ? -1 : class668.method4875(-1, arg0.charAt(var7 + 3));
                     arg1[arg3++] = (byte)class300.method2238(var8 << 2, var9 >>> 4);
                     if (var10 != -1) {
                        arg1[arg3++] = (byte)class300.method2238(class556.method3988(240, var9 << 4), var10 >>> 2);
                        if (~var11 == 0) {
                           if (!var4) {
                              var10000 = arg3 - var5;
                              continue label91;
                           }

                           arg1[arg3++] = (byte)class300.method2238(class556.method3988(3, var10) << 6, var11);
                           var7 += 4;
                        } else {
                           arg1[arg3++] = (byte)class300.method2238(class556.method3988(3, var10) << 6, var11);
                           var7 += 4;
                        }

                        if (~var7 <= ~var6) {
                           var10000 = arg3 - var5;
                           if (!var4) {
                              return var10000;
                           }
                        } else {
                           var10000 = class668.method4875(-1, arg0.charAt(var7));
                        }
                     } else {
                        var10000 = arg3 - var5;
                        if (!var4) {
                           return var10000;
                        }
                     }
                  }
               }
            } while(var4);

            return var10000;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field2265[8] + (arg0 != null ? field2265[0] : field2265[2]) + ',' + (arg1 != null ? field2265[0] : field2265[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1326(int arg0) {
      try {
         this.field2258 = null;
         ++field2259;
         if (arg0 != -2401) {
            this.method1323((class787)null, (byte[])null, 0, (int[])null);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2265[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "<init>",
      descriptor = "()V"
   )
   public class158() {
   }

   @OriginalMember(
      owner = "client!pj",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class158(byte[] arg0) {
      boolean var2 = client.field4360;
      super();

      try {
         this.field2253 = new class33[128];
         this.field2250 = new byte[128];
         this.field2258 = new int[128];
         this.field2252 = new class289[128];
         this.field2257 = new byte[128];
         this.field2261 = new short[128];
         this.field2260 = new byte[128];
         class147 var3 = new class147(arg0);
         int var4 = 0;
         if (var2) {
            ++var4;
         }

         while(var3.field1889[var3.field1856 + var4] != 0) {
            ++var4;
         }

         byte[] var5 = new byte[var4];
         int var6 = 0;
         if (var2) {
            var5[var6] = var3.method1162(4);
            ++var6;
         }

         while(true) {
            while(~var4 < ~var6) {
               var5[var6] = var3.method1162(4);
               ++var6;
            }

            ++var4;
            ++var3.field1856;
            int var7 = var3.field1856;
            var3.field1856 += var4;
            int var8 = 0;
            if (!var2) {
               if (var2) {
                  ++var8;
               }

               while(var3.field1889[var3.field1856 + var8] != 0) {
                  ++var8;
               }

               byte[] var9 = new byte[var8];
               int var10 = 0;
               if (var2) {
                  var9[var10] = var3.method1162(4);
                  ++var10;
               }

               while(true) {
                  while(~var8 < ~var10) {
                     var9[var10] = var3.method1162(4);
                     ++var10;
                  }

                  ++var8;
                  ++var3.field1856;
                  int var11 = var3.field1856;
                  var3.field1856 += var8;
                  int var12 = 0;
                  if (!var2) {
                     if (var2) {
                        ++var12;
                     }

                     while(~var3.field1889[var3.field1856 + var12] != -1) {
                        ++var12;
                     }

                     byte[] var13 = new byte[var12];
                     int var14 = 0;
                     if (var2) {
                        var13[var14] = var3.method1162(4);
                        ++var14;
                     }

                     while(true) {
                        while(~var12 < ~var14) {
                           var13[var14] = var3.method1162(4);
                           ++var14;
                        }

                        ++var12;
                        ++var3.field1856;
                        byte[] var15 = new byte[var12];
                        if (!var2) {
                           int var16;
                           label4460: {
                              if (~var12 >= -2) {
                                 var16 = var12;
                                 if (!var2) {
                                    break label4460;
                                 }
                              }

                              var15[1] = 1;
                              var16 = 2;
                              int var17 = 1;
                              int var18 = 2;
                              if (var2 || ~var12 < ~var18) {
                                 do {
                                    int var19 = var3.method1143(-15465);
                                    if (var19 != 0) {
                                       if (~var19 >= ~var17) {
                                          --var19;
                                       }

                                       var17 = var19;
                                       if (var2) {
                                          var17 = var16++;
                                       }
                                    } else {
                                       var17 = var16++;
                                    }

                                    var15[var18] = (byte)var17;
                                    ++var18;
                                 } while(~var12 < ~var18);
                              }
                           }

                           class33[] var20 = new class33[var16];
                           int var21 = 0;
                           class33 var22;
                           int var23;
                           int var24;
                           if (var2) {
                              var22 = var20[var21] = new class33();
                              var23 = var3.method1143(-15465);
                              if (~var23 < -1) {
                                 var22.field479 = new byte[var23 * 2];
                              }

                              var24 = var3.method1143(-15465);
                              if (~var24 < -1) {
                                 var22.field483 = new byte[var24 * 2 + 2];
                                 var22.field483[1] = 64;
                              }

                              ++var21;
                           }

                           while(~var20.length < ~var21) {
                              var22 = var20[var21] = new class33();
                              var23 = var3.method1143(-15465);
                              if (~var23 < -1) {
                                 var22.field479 = new byte[var23 * 2];
                              }

                              var24 = var3.method1143(-15465);
                              if (~var24 < -1) {
                                 var22.field483 = new byte[var24 * 2 + 2];
                                 var22.field483[1] = 64;
                              }

                              ++var21;
                           }

                           int var25 = var3.method1143(-15465);
                           byte[] var26 = ~var25 < -1 ? new byte[var25 * 2] : null;
                           int var27 = var3.method1143(-15465);
                           byte[] var28 = var27 <= 0 ? null : new byte[var27 * 2];
                           int var29 = 0;
                           if (var2) {
                              ++var29;
                           }

                           while(~var3.field1889[var3.field1856 - -var29] != -1) {
                              ++var29;
                           }

                           byte[] var30 = new byte[var29];
                           int var31 = 0;
                           if (var2) {
                              var30[var31] = var3.method1162(4);
                              ++var31;
                           }

                           while(true) {
                              while(var29 > var31) {
                                 var30[var31] = var3.method1162(4);
                                 ++var31;
                              }

                              ++var29;
                              ++var3.field1856;
                              int var32 = 0;
                              int var33 = 0;
                              if (!var2) {
                                 if (var2) {
                                    var32 += var3.method1143(-15465);
                                    this.field2261[var33] = (short)var32;
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 < 128) {
                                       var32 += var3.method1143(-15465);
                                       this.field2261[var33] = (short)var32;
                                       ++var33;
                                    }

                                    var32 = 0;
                                    int var34 = 0;
                                    if (!var2) {
                                       if (var2) {
                                          var32 += var3.method1143(-15465);
                                          this.field2261[var34] = (short)(this.field2261[var34] + (var32 << 8));
                                          ++var34;
                                       }

                                       while(true) {
                                          while(var34 < 128) {
                                             var32 += var3.method1143(-15465);
                                             this.field2261[var34] = (short)(this.field2261[var34] + (var32 << 8));
                                             ++var34;
                                          }

                                          int var35 = 0;
                                          int var36 = 0;
                                          int var37 = 0;
                                          int var38 = 0;
                                          if (!var2) {
                                             if (var2) {
                                                if (var35 == 0) {
                                                   if (var30.length > var36) {
                                                      var35 = var30[var36++];
                                                      if (var2) {
                                                         var35 = -1;
                                                      }
                                                   } else {
                                                      var35 = -1;
                                                   }

                                                   var37 = var3.method1198(117);
                                                }

                                                this.field2261[var38] = (short)(this.field2261[var38] + class556.method3988(32768, var37 - 1 << 14));
                                                --var35;
                                                this.field2258[var38] = var37;
                                                ++var38;
                                             }

                                             while(true) {
                                                while(~var38 > -129) {
                                                   if (var35 == 0) {
                                                      if (var30.length > var36) {
                                                         var35 = var30[var36++];
                                                         if (var2) {
                                                            var35 = -1;
                                                         }
                                                      } else {
                                                         var35 = -1;
                                                      }

                                                      var37 = var3.method1198(117);
                                                   }

                                                   this.field2261[var38] = (short)(this.field2261[var38] + class556.method3988(32768, var37 - 1 << 14));
                                                   --var35;
                                                   this.field2258[var38] = var37;
                                                   ++var38;
                                                }

                                                var35 = 0;
                                                var36 = 0;
                                                int var39 = 0;
                                                int var40 = 0;
                                                if (!var2) {
                                                   if (var2) {
                                                      if (~this.field2258[var40] != -1) {
                                                         if (var35 == 0) {
                                                            var39 = -1 + var3.field1889[var7++];
                                                            if (var5.length <= var36) {
                                                               var35 = -1;
                                                               if (var2) {
                                                                  var35 = var5[var36++];
                                                               }
                                                            } else {
                                                               var35 = var5[var36++];
                                                            }
                                                         }

                                                         this.field2250[var40] = (byte)var39;
                                                         --var35;
                                                         ++var40;
                                                      } else {
                                                         ++var40;
                                                      }
                                                   }

                                                   while(true) {
                                                      while(~var40 > -129) {
                                                         if (~this.field2258[var40] != -1) {
                                                            if (var35 == 0) {
                                                               var39 = -1 + var3.field1889[var7++];
                                                               if (var5.length <= var36) {
                                                                  var35 = -1;
                                                                  if (var2) {
                                                                     var35 = var5[var36++];
                                                                  }
                                                               } else {
                                                                  var35 = var5[var36++];
                                                               }
                                                            }

                                                            this.field2250[var40] = (byte)var39;
                                                            --var35;
                                                            ++var40;
                                                         } else {
                                                            ++var40;
                                                         }
                                                      }

                                                      var35 = 0;
                                                      var36 = 0;
                                                      int var41 = 0;
                                                      int var42 = 0;
                                                      if (!var2) {
                                                         if (var2) {
                                                            if (~this.field2258[var42] != -1) {
                                                               if (var35 == 0) {
                                                                  if (var9.length > var36) {
                                                                     var35 = var9[var36++];
                                                                     if (var2) {
                                                                        var35 = -1;
                                                                     }
                                                                  } else {
                                                                     var35 = -1;
                                                                  }

                                                                  var41 = 16 + var3.field1889[var11++] << 2;
                                                               }

                                                               this.field2260[var42] = (byte)var41;
                                                               --var35;
                                                            }

                                                            ++var42;
                                                         }

                                                         while(true) {
                                                            while(~var42 > -129) {
                                                               if (~this.field2258[var42] != -1) {
                                                                  if (var35 == 0) {
                                                                     if (var9.length > var36) {
                                                                        var35 = var9[var36++];
                                                                        if (var2) {
                                                                           var35 = -1;
                                                                        }
                                                                     } else {
                                                                        var35 = -1;
                                                                     }

                                                                     var41 = 16 + var3.field1889[var11++] << 2;
                                                                  }

                                                                  this.field2260[var42] = (byte)var41;
                                                                  --var35;
                                                               }

                                                               ++var42;
                                                            }

                                                            var36 = 0;
                                                            var35 = 0;
                                                            class33 var43 = null;
                                                            int var44 = 0;
                                                            if (!var2) {
                                                               while(true) {
                                                                  if (~var44 <= -129) {
                                                                     var36 = 0;
                                                                     var35 = 0;
                                                                     int var45 = 0;
                                                                     int var46 = 0;
                                                                     if (!var2) {
                                                                        if (var2) {
                                                                           if (var35 == 0) {
                                                                              if (var36 < var30.length) {
                                                                                 var35 = var30[var36++];
                                                                                 if (var2) {
                                                                                    var35 = -1;
                                                                                 }
                                                                              } else {
                                                                                 var35 = -1;
                                                                              }

                                                                              if (~this.field2258[var46] < -1) {
                                                                                 var45 = var3.method1143(-15465) + 1;
                                                                              }
                                                                           }

                                                                           --var35;
                                                                           this.field2257[var46] = (byte)var45;
                                                                           ++var46;
                                                                        }

                                                                        while(true) {
                                                                           while(var46 < 128) {
                                                                              if (var35 == 0) {
                                                                                 if (var36 < var30.length) {
                                                                                    var35 = var30[var36++];
                                                                                    if (var2) {
                                                                                       var35 = -1;
                                                                                    }
                                                                                 } else {
                                                                                    var35 = -1;
                                                                                 }

                                                                                 if (~this.field2258[var46] < -1) {
                                                                                    var45 = var3.method1143(-15465) + 1;
                                                                                 }
                                                                              }

                                                                              --var35;
                                                                              this.field2257[var46] = (byte)var45;
                                                                              ++var46;
                                                                           }

                                                                           this.field2256 = 1 + var3.method1143(-15465);
                                                                           int var47 = 0;
                                                                           if (!var2) {
                                                                              int var10000;
                                                                              int var51;
                                                                              int var52;
                                                                              class33 var53;
                                                                              int var54;
                                                                              int var55;
                                                                              int var56;
                                                                              class33 var57;
                                                                              int var58;
                                                                              int var59;
                                                                              int var60;
                                                                              int var61;
                                                                              int var62;
                                                                              byte var63;
                                                                              int var64;
                                                                              int var65;
                                                                              int var66;
                                                                              byte var67;
                                                                              int var68;
                                                                              int var69;
                                                                              int var70;
                                                                              Object var71;
                                                                              int var72;
                                                                              int var73;
                                                                              int var74;
                                                                              int var75;
                                                                              int var76;
                                                                              int var77;
                                                                              int var78;
                                                                              int var79;
                                                                              int var80;
                                                                              int var81;
                                                                              int var82;
                                                                              int var83;
                                                                              int var84;
                                                                              Object var85;
                                                                              int var86;
                                                                              int var87;
                                                                              class33 var88;
                                                                              int var89;
                                                                              int var90;
                                                                              class33 var91;
                                                                              int var92;
                                                                              class33 var93;
                                                                              if (!var2 && var16 <= var47) {
                                                                                 if (var26 != null) {
                                                                                    var51 = 1;
                                                                                    if (var2 || var26.length > var51) {
                                                                                       do {
                                                                                          var26[var51] = var3.method1162(4);
                                                                                          var51 += 2;
                                                                                       } while(var26.length > var51);
                                                                                    }
                                                                                 }

                                                                                 if (var28 != null) {
                                                                                    var52 = 1;
                                                                                    if (var2) {
                                                                                       var28[var52] = var3.method1162(4);
                                                                                       var52 += 2;
                                                                                    }
                                                                                 } else {
                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var16 < ~var52) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field483 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var53.field483.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var3.method1143(-15465) + var54 + 1;
                                                                                                      var53.field483[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field483.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var16 < ~var52);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && ~var16 >= ~var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method1143(-15465);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label2201:
                                                                                             while(true) {
                                                                                                while(var26.length > var61) {
                                                                                                   var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var64 > ~var62) {
                                                                                                         this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         label2254: {
                                                                                                            if (var2) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break label2254;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label2271: {
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  } else if (~var62 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label2271;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     ++var69;
                                                                                                                     if (~var69 <= ~var66) {
                                                                                                                        var63 = var67;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                               var65 += 2;
                                                                                                               if (~var65 <= ~var26.length) {
                                                                                                                  var66 = var62;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(~var66 > -129) {
                                                                                                               this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (!var2) {
                                                                                                               var71 = null;
                                                                                                               break label2201;
                                                                                                            }

                                                                                                            ++var66;
                                                                                                         }
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var72 = var3.method1143(-15465);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var73 < var28.length) {
                                                                                                   var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (!var2) {
                                                                                                   label2370: {
                                                                                                      if (var2) {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      } else if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label2370;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (var77 > 128) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field2260[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (var76 >= var74) {
                                                                                                            var77 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (255 & this.field2260[var76]) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label2409: {
                                                                                                      if (var2) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break label2409;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label2426: {
                                                                                                            var79 = var28[var77 - -1] << 1;
                                                                                                            var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                            var81 = var74;
                                                                                                            if (var2) {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            } else if (~var74 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break label2426;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (this.field2260[var81] & 255) + var82;
                                                                                                               if (var83 < 0) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (~var83 < -129) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               var80 += -var75 + var79;
                                                                                                               this.field2260[var81] = (byte)var83;
                                                                                                               ++var81;
                                                                                                               if (~var81 <= ~var78) {
                                                                                                                  var74 = var78;
                                                                                                                  var77 += 2;
                                                                                                                  var10000 = var79;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var75 = var10000;
                                                                                                         if (var28.length <= var77) {
                                                                                                            var78 = var74;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 || var78 < 128) {
                                                                                                      do {
                                                                                                         var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field2260[var78] = (byte)var84;
                                                                                                         ++var78;
                                                                                                      } while(var78 < 128);
                                                                                                   }

                                                                                                   var85 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var73 += 2;
                                                                                             }
                                                                                          }

                                                                                          var86 = 0;
                                                                                          if (var2) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var86 < var16) {
                                                                                                var20[var86].field480 = var3.method1143(-15465);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var87 < var16) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field479 != null) {
                                                                                                         var88.field482 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      if (var88.field483 != null) {
                                                                                                         var88.field476 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      if (~var88.field480 < -1) {
                                                                                                         var88.field484 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(var87 < var16);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var89 > ~var16) {
                                                                                                      var20[var89].field475 = var3.method1143(-15465);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var16 > var90) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field475 < -1) {
                                                                                                               var91.field485 = var3.method1143(-15465);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(var16 > var90);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (!var2 && ~var16 >= ~var92) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (~var93.field485 < -1) {
                                                                                                            var93.field487 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(~var16 < ~var92);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var89;
                                                                                                }
                                                                                             }

                                                                                             ++var86;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field479 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                                var57.field479[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(var59 < var57.field479.length) {
                                                                                                var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                                var57.field479[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(~var16 < ~var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1143(-15465);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label2669:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var64 > ~var62) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label2722: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label2722;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label2739: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               } else if (~var62 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label2739;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var69 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            var65 += 2;
                                                                                                            if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(~var66 > -129) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label2669;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method1143(-15465);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label2838: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label2838;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field2260[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label2877: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label2877;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label2894: {
                                                                                                         var79 = var28[var77 - -1] << 1;
                                                                                                         var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label2894;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field2260[var81] & 255) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            var80 += -var75 + var79;
                                                                                                            this.field2260[var81] = (byte)var83;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
                                                                                                      if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || var78 < 128) {
                                                                                                   do {
                                                                                                      var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field2260[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(var78 < 128);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var16) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || var87 < var16) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field479 != null) {
                                                                                                      var88.field482 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (var88.field483 != null) {
                                                                                                      var88.field476 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (~var88.field480 < -1) {
                                                                                                      var88.field484 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(var87 < var16);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var89 > ~var16) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var16 > var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field475 < -1) {
                                                                                                            var91.field485 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(var16 > var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var16 >= ~var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field485 < -1) {
                                                                                                         var93.field487 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var16 < ~var92);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }

                                                                                 while(true) {
                                                                                    while(var52 < var28.length) {
                                                                                       var28[var52] = var3.method1162(4);
                                                                                       var52 += 2;
                                                                                    }

                                                                                    var52 = 0;
                                                                                    if (!var2) {
                                                                                       if (var2 || ~var16 < ~var52) {
                                                                                          do {
                                                                                             var53 = var20[var52];
                                                                                             if (var53.field483 == null) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                var54 = 0;
                                                                                                var55 = 2;
                                                                                                if (!var2 && var53.field483.length <= var55) {
                                                                                                   ++var52;
                                                                                                } else {
                                                                                                   do {
                                                                                                      var54 = var3.method1143(-15465) + var54 + 1;
                                                                                                      var53.field483[var55] = (byte)var54;
                                                                                                      var55 += 2;
                                                                                                   } while(var53.field483.length > var55);

                                                                                                   ++var52;
                                                                                                }
                                                                                             }
                                                                                          } while(~var16 < ~var52);
                                                                                       }

                                                                                       var56 = 0;
                                                                                       if (!var2 && ~var16 >= ~var56) {
                                                                                          if (var26 != null) {
                                                                                             var60 = var3.method1143(-15465);
                                                                                             var26[0] = (byte)var60;
                                                                                             var61 = 2;
                                                                                             if (var2) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             label3173:
                                                                                             while(true) {
                                                                                                while(var26.length > var61) {
                                                                                                   var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                   var26[var61] = (byte)var60;
                                                                                                   var61 += 2;
                                                                                                }

                                                                                                var62 = var26[0];
                                                                                                var63 = var26[1];
                                                                                                var64 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var64 > ~var62) {
                                                                                                         this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                         ++var64;
                                                                                                      }

                                                                                                      var65 = 2;
                                                                                                      if (!var2) {
                                                                                                         label3226: {
                                                                                                            if (var2) {
                                                                                                               var66 = var26[var65];
                                                                                                            } else if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break label3226;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               label3243: {
                                                                                                                  var67 = var26[var65 + 1];
                                                                                                                  var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                                  var69 = var62;
                                                                                                                  if (var2) {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  } else if (~var62 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break label3243;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }

                                                                                                                  while(true) {
                                                                                                                     var70 = var10000;
                                                                                                                     this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                     var68 += -var63 + var67;
                                                                                                                     ++var69;
                                                                                                                     if (~var69 <= ~var66) {
                                                                                                                        var63 = var67;
                                                                                                                        var10000 = var66;
                                                                                                                        if (!var2) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                     }
                                                                                                                  }
                                                                                                               }

                                                                                                               var62 = var10000;
                                                                                                               var65 += 2;
                                                                                                               if (~var65 <= ~var26.length) {
                                                                                                                  var66 = var62;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var66 = var26[var65];
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         if (var2) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            while(~var66 > -129) {
                                                                                                               this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                               ++var66;
                                                                                                            }

                                                                                                            if (!var2) {
                                                                                                               var71 = null;
                                                                                                               break label3173;
                                                                                                            }

                                                                                                            ++var66;
                                                                                                         }
                                                                                                      }

                                                                                                      ++var64;
                                                                                                   }
                                                                                                }

                                                                                                var61 += 2;
                                                                                             }
                                                                                          }

                                                                                          if (var28 != null) {
                                                                                             var72 = var3.method1143(-15465);
                                                                                             var28[0] = (byte)var72;
                                                                                             var73 = 2;
                                                                                             if (var2) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(var73 < var28.length) {
                                                                                                   var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                   var28[var73] = (byte)var72;
                                                                                                   var73 += 2;
                                                                                                }

                                                                                                var74 = var28[0];
                                                                                                var75 = var28[1] << 1;
                                                                                                var76 = 0;
                                                                                                if (!var2) {
                                                                                                   label3342: {
                                                                                                      if (var2) {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      } else if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break label3342;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         if (~var77 > -1) {
                                                                                                            var77 = 0;
                                                                                                         }

                                                                                                         if (var77 > 128) {
                                                                                                            var77 = 128;
                                                                                                         }

                                                                                                         this.field2260[var76] = (byte)var77;
                                                                                                         ++var76;
                                                                                                         if (var76 >= var74) {
                                                                                                            var77 = 2;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var77 = (255 & this.field2260[var76]) + var75;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   label3381: {
                                                                                                      if (var2) {
                                                                                                         var78 = var28[var77];
                                                                                                      } else if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break label3381;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label3398: {
                                                                                                            var79 = var28[var77 - -1] << 1;
                                                                                                            var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                            var81 = var74;
                                                                                                            if (var2) {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            } else if (~var74 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break label3398;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var82 = var10000;
                                                                                                               var83 = (this.field2260[var81] & 255) + var82;
                                                                                                               if (var83 < 0) {
                                                                                                                  var83 = 0;
                                                                                                               }

                                                                                                               if (~var83 < -129) {
                                                                                                                  var83 = 128;
                                                                                                               }

                                                                                                               var80 += -var75 + var79;
                                                                                                               this.field2260[var81] = (byte)var83;
                                                                                                               ++var81;
                                                                                                               if (~var81 <= ~var78) {
                                                                                                                  var74 = var78;
                                                                                                                  var77 += 2;
                                                                                                                  var10000 = var79;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var75 = var10000;
                                                                                                         if (var28.length <= var77) {
                                                                                                            var78 = var74;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var78 = var28[var77];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2 || var78 < 128) {
                                                                                                      do {
                                                                                                         var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                         if (var84 < 0) {
                                                                                                            var84 = 0;
                                                                                                         }

                                                                                                         if (~var84 < -129) {
                                                                                                            var84 = 128;
                                                                                                         }

                                                                                                         this.field2260[var78] = (byte)var84;
                                                                                                         ++var78;
                                                                                                      } while(var78 < 128);
                                                                                                   }

                                                                                                   var85 = null;
                                                                                                   break;
                                                                                                }

                                                                                                var73 += 2;
                                                                                             }
                                                                                          }

                                                                                          var86 = 0;
                                                                                          if (var2) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var86 < var16) {
                                                                                                var20[var86].field480 = var3.method1143(-15465);
                                                                                                ++var86;
                                                                                             }

                                                                                             var87 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var87 < var16) {
                                                                                                   do {
                                                                                                      var88 = var20[var87];
                                                                                                      if (var88.field479 != null) {
                                                                                                         var88.field482 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      if (var88.field483 != null) {
                                                                                                         var88.field476 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      if (~var88.field480 < -1) {
                                                                                                         var88.field484 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var87;
                                                                                                   } while(var87 < var16);
                                                                                                }

                                                                                                var89 = 0;
                                                                                                if (var2) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var89 > ~var16) {
                                                                                                      var20[var89].field475 = var3.method1143(-15465);
                                                                                                      ++var89;
                                                                                                   }

                                                                                                   var90 = 0;
                                                                                                   if (!var2) {
                                                                                                      if (var2 || var16 > var90) {
                                                                                                         do {
                                                                                                            var91 = var20[var90];
                                                                                                            if (~var91.field475 < -1) {
                                                                                                               var91.field485 = var3.method1143(-15465);
                                                                                                            }

                                                                                                            ++var90;
                                                                                                         } while(var16 > var90);
                                                                                                      }

                                                                                                      var92 = 0;
                                                                                                      if (!var2 && ~var16 >= ~var92) {
                                                                                                         return;
                                                                                                      }

                                                                                                      do {
                                                                                                         var93 = var20[var92];
                                                                                                         if (~var93.field485 < -1) {
                                                                                                            var93.field487 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var92;
                                                                                                      } while(~var16 < ~var92);

                                                                                                      return;
                                                                                                   }

                                                                                                   ++var89;
                                                                                                }
                                                                                             }

                                                                                             ++var86;
                                                                                          }
                                                                                       }

                                                                                       do {
                                                                                          var57 = var20[var56];
                                                                                          if (var57.field479 == null) {
                                                                                             ++var56;
                                                                                          } else {
                                                                                             var58 = 0;
                                                                                             var59 = 2;
                                                                                             if (var2) {
                                                                                                var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                                var57.field479[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             while(var59 < var57.field479.length) {
                                                                                                var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                                var57.field479[var59] = (byte)var58;
                                                                                                var59 += 2;
                                                                                             }

                                                                                             ++var56;
                                                                                          }
                                                                                       } while(~var16 < ~var56);

                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1143(-15465);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label3641:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var64 > ~var62) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label3694: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label3694;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label3711: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               } else if (~var62 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label3711;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var69 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            var65 += 2;
                                                                                                            if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(~var66 > -129) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label3641;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method1143(-15465);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label3810: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label3810;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field2260[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label3849: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label3849;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label3866: {
                                                                                                         var79 = var28[var77 - -1] << 1;
                                                                                                         var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label3866;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field2260[var81] & 255) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            var80 += -var75 + var79;
                                                                                                            this.field2260[var81] = (byte)var83;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
                                                                                                      if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || var78 < 128) {
                                                                                                   do {
                                                                                                      var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field2260[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(var78 < 128);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var16) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || var87 < var16) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field479 != null) {
                                                                                                      var88.field482 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (var88.field483 != null) {
                                                                                                      var88.field476 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (~var88.field480 < -1) {
                                                                                                      var88.field484 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(var87 < var16);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var89 > ~var16) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var16 > var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field475 < -1) {
                                                                                                            var91.field485 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(var16 > var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var16 >= ~var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field485 < -1) {
                                                                                                         var93.field487 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var16 < ~var92);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    var52 += 2;
                                                                                 }
                                                                              }

                                                                              do {
                                                                                 class33 var48 = var20[var47];
                                                                                 if (var48.field479 != null) {
                                                                                    int var49 = 1;
                                                                                    if (var2) {
                                                                                       var48.field479[var49] = var3.method1162(4);
                                                                                       var49 += 2;
                                                                                    }

                                                                                    while(var49 < var48.field479.length) {
                                                                                       var48.field479[var49] = var3.method1162(4);
                                                                                       var49 += 2;
                                                                                    }
                                                                                 }

                                                                                 if (var48.field483 == null) {
                                                                                    ++var47;
                                                                                 } else {
                                                                                    int var50 = 3;
                                                                                    if (var2) {
                                                                                       var48.field483[var50] = var3.method1162(4);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    while(var48.field483.length + -2 > var50) {
                                                                                       var48.field483[var50] = var3.method1162(4);
                                                                                       var50 += 2;
                                                                                    }

                                                                                    ++var47;
                                                                                 }
                                                                              } while(var16 > var47);

                                                                              if (var26 != null) {
                                                                                 var51 = 1;
                                                                                 if (var2 || var26.length > var51) {
                                                                                    do {
                                                                                       var26[var51] = var3.method1162(4);
                                                                                       var51 += 2;
                                                                                    } while(var26.length > var51);
                                                                                 }
                                                                              }

                                                                              if (var28 != null) {
                                                                                 var52 = 1;
                                                                                 if (var2) {
                                                                                    var28[var52] = var3.method1162(4);
                                                                                    var52 += 2;
                                                                                 }
                                                                              } else {
                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var16 < ~var52) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field483 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var53.field483.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var3.method1143(-15465) + var54 + 1;
                                                                                                   var53.field483[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field483.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var16 < ~var52);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && ~var16 >= ~var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1143(-15465);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label1140:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var64 > ~var62) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label1193: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label1193;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label1210: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               } else if (~var62 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label1210;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var69 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            var65 += 2;
                                                                                                            if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(~var66 > -129) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label1140;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method1143(-15465);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label1309: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label1309;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field2260[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label1348: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label1348;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label1365: {
                                                                                                         var79 = var28[var77 - -1] << 1;
                                                                                                         var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label1365;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field2260[var81] & 255) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            var80 += -var75 + var79;
                                                                                                            this.field2260[var81] = (byte)var83;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
                                                                                                      if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || var78 < 128) {
                                                                                                   do {
                                                                                                      var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field2260[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(var78 < 128);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var16) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || var87 < var16) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field479 != null) {
                                                                                                      var88.field482 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (var88.field483 != null) {
                                                                                                      var88.field476 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (~var88.field480 < -1) {
                                                                                                      var88.field484 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(var87 < var16);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var89 > ~var16) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var16 > var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field475 < -1) {
                                                                                                            var91.field485 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(var16 > var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var16 >= ~var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field485 < -1) {
                                                                                                         var93.field487 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var16 < ~var92);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field479 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                             var57.field479[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(var59 < var57.field479.length) {
                                                                                             var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                             var57.field479[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(~var16 < ~var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method1143(-15465);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = var3.method1143(-15465) + var60 + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label1608:
                                                                                       while(true) {
                                                                                          while(var26.length > var61) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var64 > ~var62) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   label1661: {
                                                                                                      if (var2) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (~var65 <= ~var26.length) {
                                                                                                         var66 = var62;
                                                                                                         if (!var2) {
                                                                                                            break label1661;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label1678: {
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                            } else if (~var62 <= ~var66) {
                                                                                                               var63 = var67;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label1678;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                               var68 += -var63 + var67;
                                                                                                               ++var69;
                                                                                                               if (~var69 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                         var65 += 2;
                                                                                                         if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2) {
                                                                                                      this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var66 > -129) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (!var2) {
                                                                                                         var71 = null;
                                                                                                         break label1608;
                                                                                                      }

                                                                                                      ++var66;
                                                                                                   }
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var72 = var3.method1143(-15465);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2) {
                                                                                          var72 = var3.method1143(-15465) + var72 + 1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var73 < var28.length) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (!var2) {
                                                                                             label1777: {
                                                                                                if (var2) {
                                                                                                   var77 = (255 & this.field2260[var76]) + var75;
                                                                                                } else if (var76 >= var74) {
                                                                                                   var77 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label1777;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (255 & this.field2260[var76]) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (var77 > 128) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field2260[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label1816: {
                                                                                                if (var2) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (var28.length <= var77) {
                                                                                                   var78 = var74;
                                                                                                   if (!var2) {
                                                                                                      break label1816;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label1833: {
                                                                                                      var79 = var28[var77 - -1] << 1;
                                                                                                      var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                      var81 = var74;
                                                                                                      if (var2) {
                                                                                                         var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                      } else if (~var74 <= ~var78) {
                                                                                                         var74 = var78;
                                                                                                         var77 += 2;
                                                                                                         var10000 = var79;
                                                                                                         if (!var2) {
                                                                                                            break label1833;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (this.field2260[var81] & 255) + var82;
                                                                                                         if (var83 < 0) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (~var83 < -129) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         var80 += -var75 + var79;
                                                                                                         this.field2260[var81] = (byte)var83;
                                                                                                         ++var81;
                                                                                                         if (~var81 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var75 = var10000;
                                                                                                   if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 || var78 < 128) {
                                                                                                do {
                                                                                                   var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                   if (var84 < 0) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (~var84 < -129) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field2260[var78] = (byte)var84;
                                                                                                   ++var78;
                                                                                                } while(var78 < 128);
                                                                                             }

                                                                                             var85 = null;
                                                                                             break;
                                                                                          }

                                                                                          var73 += 2;
                                                                                       }
                                                                                    }

                                                                                    var86 = 0;
                                                                                    if (var2) {
                                                                                       var20[var86].field480 = var3.method1143(-15465);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var86 < var16) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || var87 < var16) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field479 != null) {
                                                                                                   var88.field482 = var3.method1143(-15465);
                                                                                                }

                                                                                                if (var88.field483 != null) {
                                                                                                   var88.field476 = var3.method1143(-15465);
                                                                                                }

                                                                                                if (~var88.field480 < -1) {
                                                                                                   var88.field484 = var3.method1143(-15465);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(var87 < var16);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2) {
                                                                                             var20[var89].field475 = var3.method1143(-15465);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var89 > ~var16) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var16 > var90) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field475 < -1) {
                                                                                                         var91.field485 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(var16 > var90);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (!var2 && ~var16 >= ~var92) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (~var93.field485 < -1) {
                                                                                                      var93.field487 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(~var16 < ~var92);

                                                                                                return;
                                                                                             }

                                                                                             ++var89;
                                                                                          }
                                                                                       }

                                                                                       ++var86;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }

                                                                              while(true) {
                                                                                 while(var52 < var28.length) {
                                                                                    var28[var52] = var3.method1162(4);
                                                                                    var52 += 2;
                                                                                 }

                                                                                 var52 = 0;
                                                                                 if (!var2) {
                                                                                    if (var2 || ~var16 < ~var52) {
                                                                                       do {
                                                                                          var53 = var20[var52];
                                                                                          if (var53.field483 == null) {
                                                                                             ++var52;
                                                                                          } else {
                                                                                             var54 = 0;
                                                                                             var55 = 2;
                                                                                             if (!var2 && var53.field483.length <= var55) {
                                                                                                ++var52;
                                                                                             } else {
                                                                                                do {
                                                                                                   var54 = var3.method1143(-15465) + var54 + 1;
                                                                                                   var53.field483[var55] = (byte)var54;
                                                                                                   var55 += 2;
                                                                                                } while(var53.field483.length > var55);

                                                                                                ++var52;
                                                                                             }
                                                                                          }
                                                                                       } while(~var16 < ~var52);
                                                                                    }

                                                                                    var56 = 0;
                                                                                    if (!var2 && ~var16 >= ~var56) {
                                                                                       if (var26 != null) {
                                                                                          var60 = var3.method1143(-15465);
                                                                                          var26[0] = (byte)var60;
                                                                                          var61 = 2;
                                                                                          if (var2) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          label610:
                                                                                          while(true) {
                                                                                             while(var26.length > var61) {
                                                                                                var60 = var3.method1143(-15465) + var60 + 1;
                                                                                                var26[var61] = (byte)var60;
                                                                                                var61 += 2;
                                                                                             }

                                                                                             var62 = var26[0];
                                                                                             var63 = var26[1];
                                                                                             var64 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                while(true) {
                                                                                                   while(~var64 > ~var62) {
                                                                                                      this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                      ++var64;
                                                                                                   }

                                                                                                   var65 = 2;
                                                                                                   if (!var2) {
                                                                                                      label663: {
                                                                                                         if (var2) {
                                                                                                            var66 = var26[var65];
                                                                                                         } else if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break label663;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            label680: {
                                                                                                               var67 = var26[var65 + 1];
                                                                                                               var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                               var69 = var62;
                                                                                                               if (var2) {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               } else if (~var62 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break label680;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }

                                                                                                               while(true) {
                                                                                                                  var70 = var10000;
                                                                                                                  this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                                  var68 += -var63 + var67;
                                                                                                                  ++var69;
                                                                                                                  if (~var69 <= ~var66) {
                                                                                                                     var63 = var67;
                                                                                                                     var10000 = var66;
                                                                                                                     if (!var2) {
                                                                                                                        break;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                                  }
                                                                                                               }
                                                                                                            }

                                                                                                            var62 = var10000;
                                                                                                            var65 += 2;
                                                                                                            if (~var65 <= ~var26.length) {
                                                                                                               var66 = var62;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var66 = var26[var65];
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      if (var2) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         while(~var66 > -129) {
                                                                                                            this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                            ++var66;
                                                                                                         }

                                                                                                         if (!var2) {
                                                                                                            var71 = null;
                                                                                                            break label610;
                                                                                                         }

                                                                                                         ++var66;
                                                                                                      }
                                                                                                   }

                                                                                                   ++var64;
                                                                                                }
                                                                                             }

                                                                                             var61 += 2;
                                                                                          }
                                                                                       }

                                                                                       if (var28 != null) {
                                                                                          var72 = var3.method1143(-15465);
                                                                                          var28[0] = (byte)var72;
                                                                                          var73 = 2;
                                                                                          if (var2) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(var73 < var28.length) {
                                                                                                var72 = var3.method1143(-15465) + var72 + 1;
                                                                                                var28[var73] = (byte)var72;
                                                                                                var73 += 2;
                                                                                             }

                                                                                             var74 = var28[0];
                                                                                             var75 = var28[1] << 1;
                                                                                             var76 = 0;
                                                                                             if (!var2) {
                                                                                                label779: {
                                                                                                   if (var2) {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   } else if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break label779;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      if (~var77 > -1) {
                                                                                                         var77 = 0;
                                                                                                      }

                                                                                                      if (var77 > 128) {
                                                                                                         var77 = 128;
                                                                                                      }

                                                                                                      this.field2260[var76] = (byte)var77;
                                                                                                      ++var76;
                                                                                                      if (var76 >= var74) {
                                                                                                         var77 = 2;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var77 = (255 & this.field2260[var76]) + var75;
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                label818: {
                                                                                                   if (var2) {
                                                                                                      var78 = var28[var77];
                                                                                                   } else if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break label818;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      label835: {
                                                                                                         var79 = var28[var77 - -1] << 1;
                                                                                                         var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                         var81 = var74;
                                                                                                         if (var2) {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         } else if (~var74 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break label835;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }

                                                                                                         while(true) {
                                                                                                            var82 = var10000;
                                                                                                            var83 = (this.field2260[var81] & 255) + var82;
                                                                                                            if (var83 < 0) {
                                                                                                               var83 = 0;
                                                                                                            }

                                                                                                            if (~var83 < -129) {
                                                                                                               var83 = 128;
                                                                                                            }

                                                                                                            var80 += -var75 + var79;
                                                                                                            this.field2260[var81] = (byte)var83;
                                                                                                            ++var81;
                                                                                                            if (~var81 <= ~var78) {
                                                                                                               var74 = var78;
                                                                                                               var77 += 2;
                                                                                                               var10000 = var79;
                                                                                                               if (!var2) {
                                                                                                                  break;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                            }
                                                                                                         }
                                                                                                      }

                                                                                                      var75 = var10000;
                                                                                                      if (var28.length <= var77) {
                                                                                                         var78 = var74;
                                                                                                         if (!var2) {
                                                                                                            break;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var78 = var28[var77];
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                if (var2 || var78 < 128) {
                                                                                                   do {
                                                                                                      var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                      if (var84 < 0) {
                                                                                                         var84 = 0;
                                                                                                      }

                                                                                                      if (~var84 < -129) {
                                                                                                         var84 = 128;
                                                                                                      }

                                                                                                      this.field2260[var78] = (byte)var84;
                                                                                                      ++var78;
                                                                                                   } while(var78 < 128);
                                                                                                }

                                                                                                var85 = null;
                                                                                                break;
                                                                                             }

                                                                                             var73 += 2;
                                                                                          }
                                                                                       }

                                                                                       var86 = 0;
                                                                                       if (var2) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var86 < var16) {
                                                                                             var20[var86].field480 = var3.method1143(-15465);
                                                                                             ++var86;
                                                                                          }

                                                                                          var87 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2 || var87 < var16) {
                                                                                                do {
                                                                                                   var88 = var20[var87];
                                                                                                   if (var88.field479 != null) {
                                                                                                      var88.field482 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (var88.field483 != null) {
                                                                                                      var88.field476 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   if (~var88.field480 < -1) {
                                                                                                      var88.field484 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var87;
                                                                                                } while(var87 < var16);
                                                                                             }

                                                                                             var89 = 0;
                                                                                             if (var2) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var89 > ~var16) {
                                                                                                   var20[var89].field475 = var3.method1143(-15465);
                                                                                                   ++var89;
                                                                                                }

                                                                                                var90 = 0;
                                                                                                if (!var2) {
                                                                                                   if (var2 || var16 > var90) {
                                                                                                      do {
                                                                                                         var91 = var20[var90];
                                                                                                         if (~var91.field475 < -1) {
                                                                                                            var91.field485 = var3.method1143(-15465);
                                                                                                         }

                                                                                                         ++var90;
                                                                                                      } while(var16 > var90);
                                                                                                   }

                                                                                                   var92 = 0;
                                                                                                   if (!var2 && ~var16 >= ~var92) {
                                                                                                      return;
                                                                                                   }

                                                                                                   do {
                                                                                                      var93 = var20[var92];
                                                                                                      if (~var93.field485 < -1) {
                                                                                                         var93.field487 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var92;
                                                                                                   } while(~var16 < ~var92);

                                                                                                   return;
                                                                                                }

                                                                                                ++var89;
                                                                                             }
                                                                                          }

                                                                                          ++var86;
                                                                                       }
                                                                                    }

                                                                                    do {
                                                                                       var57 = var20[var56];
                                                                                       if (var57.field479 == null) {
                                                                                          ++var56;
                                                                                       } else {
                                                                                          var58 = 0;
                                                                                          var59 = 2;
                                                                                          if (var2) {
                                                                                             var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                             var57.field479[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          while(var59 < var57.field479.length) {
                                                                                             var58 = var58 - -1 - -var3.method1143(-15465);
                                                                                             var57.field479[var59] = (byte)var58;
                                                                                             var59 += 2;
                                                                                          }

                                                                                          ++var56;
                                                                                       }
                                                                                    } while(~var16 < ~var56);

                                                                                    if (var26 != null) {
                                                                                       var60 = var3.method1143(-15465);
                                                                                       var26[0] = (byte)var60;
                                                                                       var61 = 2;
                                                                                       if (var2) {
                                                                                          var60 = var3.method1143(-15465) + var60 + 1;
                                                                                          var26[var61] = (byte)var60;
                                                                                          var61 += 2;
                                                                                       }

                                                                                       label560:
                                                                                       while(true) {
                                                                                          while(var26.length > var61) {
                                                                                             var60 = var3.method1143(-15465) + var60 + 1;
                                                                                             var26[var61] = (byte)var60;
                                                                                             var61 += 2;
                                                                                          }

                                                                                          var62 = var26[0];
                                                                                          var63 = var26[1];
                                                                                          var64 = 0;
                                                                                          if (!var2) {
                                                                                             if (var2) {
                                                                                                this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                ++var64;
                                                                                             }

                                                                                             while(true) {
                                                                                                while(~var64 > ~var62) {
                                                                                                   this.field2257[var64] = (byte)(this.field2257[var64] * var63 + 32 >> 6);
                                                                                                   ++var64;
                                                                                                }

                                                                                                var65 = 2;
                                                                                                if (!var2) {
                                                                                                   label521: {
                                                                                                      if (var2) {
                                                                                                         var66 = var26[var65];
                                                                                                      } else if (~var65 <= ~var26.length) {
                                                                                                         var66 = var62;
                                                                                                         if (!var2) {
                                                                                                            break label521;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var66 = var26[var65];
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         label518: {
                                                                                                            var67 = var26[var65 + 1];
                                                                                                            var68 = (-var62 + var66) * var63 - -((-var62 + var66) / 2);
                                                                                                            var69 = var62;
                                                                                                            if (var2) {
                                                                                                               var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                            } else if (~var62 <= ~var66) {
                                                                                                               var63 = var67;
                                                                                                               var10000 = var66;
                                                                                                               if (!var2) {
                                                                                                                  break label518;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                            }

                                                                                                            while(true) {
                                                                                                               var70 = var10000;
                                                                                                               this.field2257[var69] = (byte)(this.field2257[var69] * var70 - -32 >> 6);
                                                                                                               var68 += -var63 + var67;
                                                                                                               ++var69;
                                                                                                               if (~var69 <= ~var66) {
                                                                                                                  var63 = var67;
                                                                                                                  var10000 = var66;
                                                                                                                  if (!var2) {
                                                                                                                     break;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var10000 = class96.method819(var66 - var62, -1930109569, var68);
                                                                                                               }
                                                                                                            }
                                                                                                         }

                                                                                                         var62 = var10000;
                                                                                                         var65 += 2;
                                                                                                         if (~var65 <= ~var26.length) {
                                                                                                            var66 = var62;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var66 = var26[var65];
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   if (var2) {
                                                                                                      this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                      ++var66;
                                                                                                   }

                                                                                                   while(true) {
                                                                                                      while(~var66 > -129) {
                                                                                                         this.field2257[var66] = (byte)(this.field2257[var66] * var63 + 32 >> 6);
                                                                                                         ++var66;
                                                                                                      }

                                                                                                      if (!var2) {
                                                                                                         var71 = null;
                                                                                                         break label560;
                                                                                                      }

                                                                                                      ++var66;
                                                                                                   }
                                                                                                }

                                                                                                ++var64;
                                                                                             }
                                                                                          }

                                                                                          var61 += 2;
                                                                                       }
                                                                                    }

                                                                                    if (var28 != null) {
                                                                                       var72 = var3.method1143(-15465);
                                                                                       var28[0] = (byte)var72;
                                                                                       var73 = 2;
                                                                                       if (var2) {
                                                                                          var72 = var3.method1143(-15465) + var72 + 1;
                                                                                          var28[var73] = (byte)var72;
                                                                                          var73 += 2;
                                                                                       }

                                                                                       while(true) {
                                                                                          while(var73 < var28.length) {
                                                                                             var72 = var3.method1143(-15465) + var72 + 1;
                                                                                             var28[var73] = (byte)var72;
                                                                                             var73 += 2;
                                                                                          }

                                                                                          var74 = var28[0];
                                                                                          var75 = var28[1] << 1;
                                                                                          var76 = 0;
                                                                                          if (!var2) {
                                                                                             label424: {
                                                                                                if (var2) {
                                                                                                   var77 = (255 & this.field2260[var76]) + var75;
                                                                                                } else if (var76 >= var74) {
                                                                                                   var77 = 2;
                                                                                                   if (!var2) {
                                                                                                      break label424;
                                                                                                   }
                                                                                                } else {
                                                                                                   var77 = (255 & this.field2260[var76]) + var75;
                                                                                                }

                                                                                                while(true) {
                                                                                                   if (~var77 > -1) {
                                                                                                      var77 = 0;
                                                                                                   }

                                                                                                   if (var77 > 128) {
                                                                                                      var77 = 128;
                                                                                                   }

                                                                                                   this.field2260[var76] = (byte)var77;
                                                                                                   ++var76;
                                                                                                   if (var76 >= var74) {
                                                                                                      var77 = 2;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var77 = (255 & this.field2260[var76]) + var75;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             label406: {
                                                                                                if (var2) {
                                                                                                   var78 = var28[var77];
                                                                                                } else if (var28.length <= var77) {
                                                                                                   var78 = var74;
                                                                                                   if (!var2) {
                                                                                                      break label406;
                                                                                                   }
                                                                                                } else {
                                                                                                   var78 = var28[var77];
                                                                                                }

                                                                                                while(true) {
                                                                                                   label403: {
                                                                                                      var79 = var28[var77 - -1] << 1;
                                                                                                      var80 = (var78 - var74) / 2 + (-var74 + var78) * var75;
                                                                                                      var81 = var74;
                                                                                                      if (var2) {
                                                                                                         var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                      } else if (~var74 <= ~var78) {
                                                                                                         var74 = var78;
                                                                                                         var77 += 2;
                                                                                                         var10000 = var79;
                                                                                                         if (!var2) {
                                                                                                            break label403;
                                                                                                         }
                                                                                                      } else {
                                                                                                         var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         var82 = var10000;
                                                                                                         var83 = (this.field2260[var81] & 255) + var82;
                                                                                                         if (var83 < 0) {
                                                                                                            var83 = 0;
                                                                                                         }

                                                                                                         if (~var83 < -129) {
                                                                                                            var83 = 128;
                                                                                                         }

                                                                                                         var80 += -var75 + var79;
                                                                                                         this.field2260[var81] = (byte)var83;
                                                                                                         ++var81;
                                                                                                         if (~var81 <= ~var78) {
                                                                                                            var74 = var78;
                                                                                                            var77 += 2;
                                                                                                            var10000 = var79;
                                                                                                            if (!var2) {
                                                                                                               break;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var10000 = class96.method819(-var74 + var78, -1930109569, var80);
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   var75 = var10000;
                                                                                                   if (var28.length <= var77) {
                                                                                                      var78 = var74;
                                                                                                      if (!var2) {
                                                                                                         break;
                                                                                                      }
                                                                                                   } else {
                                                                                                      var78 = var28[var77];
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             if (var2 || var78 < 128) {
                                                                                                do {
                                                                                                   var84 = (this.field2260[var78] & 255) - -var75;
                                                                                                   if (var84 < 0) {
                                                                                                      var84 = 0;
                                                                                                   }

                                                                                                   if (~var84 < -129) {
                                                                                                      var84 = 128;
                                                                                                   }

                                                                                                   this.field2260[var78] = (byte)var84;
                                                                                                   ++var78;
                                                                                                } while(var78 < 128);
                                                                                             }

                                                                                             var85 = null;
                                                                                             break;
                                                                                          }

                                                                                          var73 += 2;
                                                                                       }
                                                                                    }

                                                                                    var86 = 0;
                                                                                    if (var2) {
                                                                                       var20[var86].field480 = var3.method1143(-15465);
                                                                                       ++var86;
                                                                                    }

                                                                                    while(true) {
                                                                                       while(var86 < var16) {
                                                                                          var20[var86].field480 = var3.method1143(-15465);
                                                                                          ++var86;
                                                                                       }

                                                                                       var87 = 0;
                                                                                       if (!var2) {
                                                                                          if (var2 || var87 < var16) {
                                                                                             do {
                                                                                                var88 = var20[var87];
                                                                                                if (var88.field479 != null) {
                                                                                                   var88.field482 = var3.method1143(-15465);
                                                                                                }

                                                                                                if (var88.field483 != null) {
                                                                                                   var88.field476 = var3.method1143(-15465);
                                                                                                }

                                                                                                if (~var88.field480 < -1) {
                                                                                                   var88.field484 = var3.method1143(-15465);
                                                                                                }

                                                                                                ++var87;
                                                                                             } while(var87 < var16);
                                                                                          }

                                                                                          var89 = 0;
                                                                                          if (var2) {
                                                                                             var20[var89].field475 = var3.method1143(-15465);
                                                                                             ++var89;
                                                                                          }

                                                                                          while(true) {
                                                                                             while(~var89 > ~var16) {
                                                                                                var20[var89].field475 = var3.method1143(-15465);
                                                                                                ++var89;
                                                                                             }

                                                                                             var90 = 0;
                                                                                             if (!var2) {
                                                                                                if (var2 || var16 > var90) {
                                                                                                   do {
                                                                                                      var91 = var20[var90];
                                                                                                      if (~var91.field475 < -1) {
                                                                                                         var91.field485 = var3.method1143(-15465);
                                                                                                      }

                                                                                                      ++var90;
                                                                                                   } while(var16 > var90);
                                                                                                }

                                                                                                var92 = 0;
                                                                                                if (!var2 && ~var16 >= ~var92) {
                                                                                                   return;
                                                                                                }

                                                                                                do {
                                                                                                   var93 = var20[var92];
                                                                                                   if (~var93.field485 < -1) {
                                                                                                      var93.field487 = var3.method1143(-15465);
                                                                                                   }

                                                                                                   ++var92;
                                                                                                } while(~var16 < ~var92);

                                                                                                return;
                                                                                             }

                                                                                             ++var89;
                                                                                          }
                                                                                       }

                                                                                       ++var86;
                                                                                    }
                                                                                 }

                                                                                 var52 += 2;
                                                                              }
                                                                           }

                                                                           ++var46;
                                                                        }
                                                                     }
                                                                  } else if (~this.field2258[var44] != -1) {
                                                                     if (var35 == 0) {
                                                                        label4102: {
                                                                           var43 = var20[var15[var36]];
                                                                           if (~var13.length < ~var36) {
                                                                              var35 = var13[var36++];
                                                                              if (!var2) {
                                                                                 break label4102;
                                                                              }
                                                                           }

                                                                           var35 = -1;
                                                                        }
                                                                     }

                                                                     --var35;
                                                                     this.field2253[var44] = var43;
                                                                  }

                                                                  ++var44;
                                                               }
                                                            }

                                                            ++var42;
                                                         }
                                                      }

                                                      ++var40;
                                                   }
                                                }

                                                ++var38;
                                             }
                                          }

                                          ++var34;
                                       }
                                    }

                                    ++var33;
                                 }
                              }

                              ++var31;
                           }
                        }

                        ++var14;
                     }
                  }

                  ++var10;
               }
            }

            ++var6;
         }
      } catch (RuntimeException var95) {
         throw class237.method1823(var95, field2265[3] + (arg0 != null ? field2265[0] : field2265[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
