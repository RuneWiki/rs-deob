import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class761 {
   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "[B"
   )
   private byte[] field11246;
   @OriginalMember(
      owner = "client!cm",
      name = "e",
      descriptor = "[I"
   )
   private int[] field11243;
   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "[I"
   )
   private int[] field11245;
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11252 = new String[]{method5522(method5521("\u0018;\u0015\u0005)")), method5522(method5521("\u0000x\u0015j|")), method5522(method5521("\u0018;\u0015\u0006)")), method5522(method5521("\u0015#W(")), method5522(method5521("59\u001b'n\u001f3L+s\u001fv]+s[2Z0`[ Z(t\u001ev")), method5522(method5521("\u0018;\u0015xh\u0015?Oz)")), method5522(method5521("\u0018;\u0015\u0007)"))};
   @OriginalMember(
      owner = "client!cm",
      name = "d",
      descriptor = "Lll;"
   )
   public static class387 field11242 = new class387();
   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "Lek;"
   )
   public static class536 field11247 = new class536(60, 2);
   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field11249 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!cm",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field11248 = new class118(23, -1);
   @OriginalMember(
      owner = "client!cm",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field11250 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!cm",
      name = "h",
      descriptor = "I"
   )
   public static int field11241;
   @OriginalMember(
      owner = "client!cm",
      name = "i",
      descriptor = "I"
   )
   public static int field11244;
   @OriginalMember(
      owner = "client!cm",
      name = "j",
      descriptor = "I"
   )
   public static int field11251;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method5518(int arg0) {
      try {
         if (arg0 != 12) {
            field11249 = null;
         }

         field11249 = null;
         field11242 = null;
         field11250 = null;
         field11247 = null;
         field11248 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11252[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(III[B[BB)I",
      line = 25
   )
   public final int method5519(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, byte arg5) {
      boolean var7 = client.field4360;

      try {
         ++field11241;
         if (arg1 == 0) {
            return 0;
         } else {
            int var8 = 0;
            int var22 = arg1 + arg2;
            int var9 = -40 / ((62 - arg5) / 49);
            int var10 = arg0;

            do {
               byte var11;
               label94: {
                  var11 = arg4[var10];
                  if (~var11 <= -1) {
                     ++var8;
                     if (var7 || !var7) {
                        break label94;
                     }
                  }

                  var8 = this.field11245[var8];
               }

               int var12;
               if ((var12 = this.field11245[var8]) < 0) {
                  arg3[arg2++] = (byte)(~var12);
                  if (arg2 >= var22) {
                     break;
                  }

                  var8 = 0;
               }

               label162: {
                  if (~(var11 & 64) == -1) {
                     ++var8;
                     if (!var7) {
                        break label162;
                     }
                  }

                  var8 = this.field11245[var8];
               }

               int var13;
               if ((var13 = this.field11245[var8]) < 0) {
                  arg3[arg2++] = (byte)(~var13);
                  if (~var22 >= ~arg2) {
                     break;
                  }

                  var8 = 0;
               }

               label156: {
                  if ((32 & var11) == 0) {
                     ++var8;
                     if (!var7) {
                        break label156;
                     }
                  }

                  var8 = this.field11245[var8];
               }

               int var14;
               if (~(var14 = this.field11245[var8]) > -1) {
                  arg3[arg2++] = (byte)(~var14);
                  if (~var22 >= ~arg2) {
                     break;
                  }

                  var8 = 0;
               }

               label150: {
                  if (~(var11 & 16) == -1) {
                     ++var8;
                     if (!var7) {
                        break label150;
                     }
                  }

                  var8 = this.field11245[var8];
               }

               int var15;
               if (~(var15 = this.field11245[var8]) > -1) {
                  arg3[arg2++] = (byte)(~var15);
                  if (~arg2 <= ~var22) {
                     break;
                  }

                  var8 = 0;
               }

               label144: {
                  if (~(var11 & 8) == -1) {
                     ++var8;
                     if (!var7) {
                        break label144;
                     }
                  }

                  var8 = this.field11245[var8];
               }

               int var16;
               if ((var16 = this.field11245[var8]) < 0) {
                  arg3[arg2++] = (byte)(~var16);
                  if (~arg2 <= ~var22) {
                     break;
                  }

                  var8 = 0;
               }

               label138: {
                  if (~(var11 & 4) != -1) {
                     var8 = this.field11245[var8];
                     if (!var7) {
                        break label138;
                     }
                  }

                  ++var8;
               }

               int var17;
               if (~(var17 = this.field11245[var8]) > -1) {
                  arg3[arg2++] = (byte)(~var17);
                  if (var22 <= arg2) {
                     break;
                  }

                  var8 = 0;
               }

               label132: {
                  if ((2 & var11) != 0) {
                     var8 = this.field11245[var8];
                     if (!var7) {
                        break label132;
                     }
                  }

                  ++var8;
               }

               int var18;
               if ((var18 = this.field11245[var8]) < 0) {
                  arg3[arg2++] = (byte)(~var18);
                  if (~arg2 <= ~var22) {
                     break;
                  }

                  var8 = 0;
               }

               label126: {
                  if ((var11 & 1) != 0) {
                     var8 = this.field11245[var8];
                     if (!var7) {
                        break label126;
                     }
                  }

                  ++var8;
               }

               int var19;
               if ((var19 = this.field11245[var8]) < 0) {
                  arg3[arg2++] = (byte)(~var19);
                  if (var22 <= arg2) {
                     break;
                  }

                  var8 = 0;
               }

               ++var10;
            } while(!var7);

            return -arg0 + var10 - -1;
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field11252[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11252[1] : field11252[3]) + ',' + (arg4 != null ? field11252[1] : field11252[3]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "([BZII[BI)I",
      line = 175
   )
   public final int method5520(byte[] arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         ++field11244;
         int var8 = 0;
         int var19 = arg3 + arg5;
         int var9 = arg2 << 3;
         short var10000;
         byte var10001;
         if (var7) {
            var10000 = 255;
            var10001 = arg0[arg5];
         } else if (arg5 >= var19) {
            var10000 = arg1;
            var10001 = 1;
            if (!var7) {
               if (arg1 != 1) {
                  field11250 = null;
               }

               return (var9 + 7 >> 3) - arg2;
            }
         } else {
            var10000 = 255;
            var10001 = arg0[arg5];
         }

         while(true) {
            int var10 = var10000 & var10001;
            int var11 = this.field11243[var10];
            byte var12 = this.field11246[var10];
            if (var12 == 0) {
               throw new RuntimeException(field11252[4] + var10);
            }

            int var13 = var9 >> 3;
            int var14 = var9 & 7;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 - -(var12 + var14 - 1 >> 3);
            int var20 = var14 + 24;
            arg4[var13] = (byte)(var8 = class300.method2238(var15, var11 >>> var20));
            if (~var16 < ~var13) {
               ++var13;
               var14 = var20 - 8;
               arg4[var13] = (byte)(var8 = var11 >>> var14);
               if (~var16 < ~var13) {
                  ++var13;
                  var14 -= 8;
                  arg4[var13] = (byte)(var8 = var11 >>> var14);
                  if (var13 < var16) {
                     ++var13;
                     var14 -= 8;
                     arg4[var13] = (byte)(var8 = var11 >>> var14);
                     if (~var13 > ~var16) {
                        var14 -= 8;
                        ++var13;
                        arg4[var13] = (byte)(var8 = var11 << -var14);
                     }
                  }
               }
            }

            var9 += var12;
            ++arg5;
            if (arg5 >= var19) {
               var10000 = arg1;
               var10001 = 1;
               if (!var7) {
                  if (arg1 != 1) {
                     field11250 = null;
                  }

                  return (var9 + 7 >> 3) - arg2;
               }
            } else {
               var10000 = 255;
               var10001 = arg0[arg5];
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field11252[2] + (arg0 != null ? field11252[1] : field11252[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11252[1] : field11252[3]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "<init>",
      descriptor = "([B)V",
      line = 258
   )
   public class761(byte[] arg0) {
      boolean var2 = client.field4360;
      super();

      try {
         int var3 = arg0.length;
         this.field11246 = arg0;
         this.field11243 = new int[var3];
         int[] var4 = new int[33];
         this.field11245 = new int[8];
         int var5 = 0;
         int var6 = 0;
         if (var2 || ~var3 < ~var6) {
            label216:
            do {
               byte var7 = arg0[var6];
               if (~var7 == -1) {
                  ++var6;
               } else {
                  int var9;
                  int var10;
                  int var10000;
                  label221: {
                     int var8 = 1 << -var7 + 32;
                     var9 = var4[var7];
                     this.field11243[var6] = var9;
                     if (~(var9 & var8) != -1) {
                        var10 = var4[var7 + -1];
                        if (!var2) {
                           break label221;
                        }
                     }

                     label207: {
                        int var11 = var7 - 1;
                        if (var2) {
                           var10000 = var4[var11];
                        } else if (~var11 > -2) {
                           var10000 = var9 | var8;
                           if (!var2) {
                              break label207;
                           }
                        } else {
                           var10000 = var4[var11];
                        }

                        label206:
                        while(true) {
                           label204:
                           while(true) {
                              while(true) {
                                 int var12 = var10000;
                                 if (var9 == var12) {
                                    int var13 = 1 << -var11 + 32;
                                    if ((var13 & var12) == 0) {
                                       var4[var11] = class300.method2238(var13, var12);
                                       if (!var2) {
                                          --var11;
                                          break label204;
                                       }
                                    }

                                    var4[var11] = var4[var11 + -1];
                                    if (var2) {
                                       --var11;
                                       break label204;
                                    }

                                    var10000 = var9 | var8;
                                    if (!var2) {
                                       break label206;
                                    }
                                 } else {
                                    var10000 = var9 | var8;
                                    if (!var2) {
                                       break label206;
                                    }
                                 }
                              }
                           }

                           if (~var11 > -2) {
                              var10000 = var9 | var8;
                              if (!var2) {
                                 break;
                              }
                           } else {
                              var10000 = var4[var11];
                           }
                        }
                     }

                     var10 = var10000;
                  }

                  var4[var7] = var10;
                  int var14 = var7 + 1;
                  if (var2) {
                     if (~var4[var14] == ~var9) {
                        var4[var14] = var10;
                     }

                     ++var14;
                  }

                  while(true) {
                     while(var14 <= 32) {
                        if (~var4[var14] == ~var9) {
                           var4[var14] = var10;
                        }

                        ++var14;
                     }

                     int var15 = 0;
                     int var16 = 0;
                     if (!var2) {
                        int var10001;
                        if (var2) {
                           var10000 = Integer.MIN_VALUE;
                           var10001 = var16;
                        } else if (var16 >= var7) {
                           var10000 = var15;
                           var10001 = var5;
                           if (!var2) {
                              if (var15 >= var5) {
                                 var5 = var15 - -1;
                              }

                              this.field11245[var15] = ~var6;
                              ++var6;
                              break;
                           }
                        } else {
                           var10000 = Integer.MIN_VALUE;
                           var10001 = var16;
                        }

                        while(true) {
                           int var17 = var10000 >>> var10001;
                           if (~(var17 & var9) == -1) {
                              ++var15;
                              if (var2) {
                                 if (~this.field11245[var15] == -1) {
                                    this.field11245[var15] = var5;
                                 }

                                 var15 = this.field11245[var15];
                              }
                           } else {
                              if (~this.field11245[var15] == -1) {
                                 this.field11245[var15] = var5;
                              }

                              var15 = this.field11245[var15];
                           }

                           int var20;
                           if (~this.field11245.length < ~var15) {
                              var20 = var17 >>> 1;
                              ++var16;
                           } else {
                              int[] var18 = new int[this.field11245.length * 2];
                              int var19 = 0;
                              if (var2) {
                                 var18[var19] = this.field11245[var19];
                                 ++var19;
                              }

                              while(true) {
                                 while(var19 < this.field11245.length) {
                                    var18[var19] = this.field11245[var19];
                                    ++var19;
                                 }

                                 if (!var2) {
                                    this.field11245 = var18;
                                    var20 = var17 >>> 1;
                                    ++var16;
                                    break;
                                 }

                                 ++var19;
                              }
                           }

                           if (var16 >= var7) {
                              var10000 = var15;
                              var10001 = var5;
                              if (!var2) {
                                 if (var15 >= var5) {
                                    var5 = var15 - -1;
                                 }

                                 this.field11245[var15] = ~var6;
                                 ++var6;
                                 continue label216;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }
                        }
                     }

                     ++var14;
                  }
               }
            } while(~var3 < ~var6);

         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field11252[5] + (arg0 != null ? field11252[1] : field11252[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
