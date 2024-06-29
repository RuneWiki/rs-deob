import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class186 {
   @OriginalMember(
      owner = "client!gg",
      name = "o",
      descriptor = "[I"
   )
   private int[] field2314;
   @OriginalMember(
      owner = "client!gg",
      name = "g",
      descriptor = "I"
   )
   private int field2317;
   @OriginalMember(
      owner = "client!gg",
      name = "s",
      descriptor = "[I"
   )
   private int[] field2322;
   @OriginalMember(
      owner = "client!gg",
      name = "n",
      descriptor = "[[Lid;"
   )
   private class611[][] field2325;
   @OriginalMember(
      owner = "client!gg",
      name = "j",
      descriptor = "[[Lid;"
   )
   private class611[][] field2327;
   @OriginalMember(
      owner = "client!gg",
      name = "l",
      descriptor = "[I"
   )
   private int[] field2335;
   @OriginalMember(
      owner = "client!gg",
      name = "e",
      descriptor = "Lib;"
   )
   private class163 field2316;
   @OriginalMember(
      owner = "client!gg",
      name = "p",
      descriptor = "Lgp;"
   )
   private class53 field2330;
   @OriginalMember(
      owner = "client!gg",
      name = "d",
      descriptor = "Lgp;"
   )
   private class53 field2319;
   @OriginalMember(
      owner = "client!gg",
      name = "q",
      descriptor = "Lhi;"
   )
   private class215 field2320;
   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2337 = new String[]{method1454(method1453("ES\u0003T\u001a")), method1454(method1453("ES\u0003R\u001a")), method1454(method1453("Y\u001a\u00038O")), method1454(method1453("LAAz")), method1454(method1453("ES\u0003*[L]Y(\u001a")), method1454(method1453("ES\u0003U\u001a")), method1454(method1453("ES\u0003P\u001a")), method1454(method1453("ES\u0003S\u001a")), method1454(method1453("ES\u0003^\u001a")), method1454(method1453("ES\u0003Q\u001a")), method1454(method1453("ES\u0003W\u001a"))};
   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "I"
   )
   public static int field2328 = 2;
   @OriginalMember(
      owner = "client!gg",
      name = "w",
      descriptor = "[[I"
   )
   public static int[][] field2321 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   @OriginalMember(
      owner = "client!gg",
      name = "m",
      descriptor = "F"
   )
   public static float field2333 = 0.0F;
   @OriginalMember(
      owner = "client!gg",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field2334 = new int[2];
   @OriginalMember(
      owner = "client!gg",
      name = "u",
      descriptor = "I"
   )
   public static int field2315;
   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "I"
   )
   public static int field2318;
   @OriginalMember(
      owner = "client!gg",
      name = "i",
      descriptor = "I"
   )
   public static int field2323;
   @OriginalMember(
      owner = "client!gg",
      name = "r",
      descriptor = "I"
   )
   public static int field2324;
   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "I"
   )
   public static int field2326;
   @OriginalMember(
      owner = "client!gg",
      name = "f",
      descriptor = "I"
   )
   public static int field2329;
   @OriginalMember(
      owner = "client!gg",
      name = "t",
      descriptor = "I"
   )
   public static int field2331;
   @OriginalMember(
      owner = "client!gg",
      name = "v",
      descriptor = "I"
   )
   public static int field2332;
   @OriginalMember(
      owner = "client!gg",
      name = "h",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field2336;

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ILdh;)V"
   )
   public final void method1445(int arg0, class338 arg1) {
      try {
         ++field2329;
         this.field2330.method424(786336, (byte)98, 24);
         int var3 = 100 / ((arg0 - 3) / 55);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2337[5] + arg0 + ',' + (arg1 != null ? field2337[2] : field2337[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IILdh;)V"
   )
   private final void method1446(int arg0, int arg1, class338 arg2) {
      try {
         if (arg1 != 0) {
            this.field2322 = null;
         }

         class576.field8552 = arg2.field5059;
         ++field2324;
         arg2.method2613(8, (float)arg0);
         arg2.method2650((byte)91);
         arg2.method2655(arg1 ^ 9092, false);
         arg2.method2551(18702, false);
         arg2.method2661((byte)-115);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2337[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2337[2] : field2337[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ILdh;I)V"
   )
   private final void method1447(int arg0, class338 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field2323;
         int var5 = 0;
         class495 var6 = arg1.method2638((byte)-14);
         float var7 = var6.field7331;
         float var8 = var6.field7328;
         float var9 = var6.field7306;
         float var10 = var6.field7310;
         float var11 = var6.field7284;
         if (arg0 != 1467385112) {
            field2321 = null;
         }

         float var12 = var6.field7325;
         float var13 = var7 + var10;
         float var14 = var8 + var11;
         float var15 = var9 + var12;
         float var16 = -var10 + var7;
         float var17 = var8 - var11;
         float var18 = -var12 + var9;
         float var19 = -var7 + var10;
         float var20 = -var8 + var11;
         float var21 = var12 - var9;
         Buffer var22 = this.field2330.method421((byte)-115, true);
         if (var22 != null) {
            int var10000;
            Stream var23;
            int var24;
            class186 var75;
            byte var76;
            label482: {
               var23 = arg1.method2593(var22, 0);
               if (Stream.method5098()) {
                  label284: {
                     var24 = arg2 + -1;
                     if (var4 != 0) {
                        var10000 = this.field2335[var24] > 64 ? 64 : this.field2335[var24];
                     } else if (var24 < 0) {
                        if (var4 == 0) {
                           break label284;
                        }

                        var10000 = this.field2335[var24];
                     } else {
                        var10000 = this.field2335[var24] > 64 ? 64 : this.field2335[var24];
                     }

                     while(true) {
                        int var25 = var10000;
                        if (~var25 >= -1) {
                           --var24;
                        } else {
                           int var26 = var25 + -1;
                           class611 var27;
                           int var28;
                           byte var29;
                           byte var30;
                           byte var31;
                           byte var32;
                           float var33;
                           float var34;
                           float var35;
                           int var36;
                           if (var4 != 0) {
                              var27 = this.field2325[var24][var26];
                              var28 = var27.field8948;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field8960 >> 12);
                              var34 = (float)(var27.field8954 >> 12);
                              var35 = (float)(var27.field8953 >> 12);
                              var36 = var27.field8952 >> 12;
                              var23.method5084((float)(-var36) * var13 + var33);
                              var23.method5084((float)(-var36) * var14 + var34);
                              var23.method5084((float)(-var36) * var15 + var35);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5097(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5097(var29, var30, var31, var32);
                              }

                              var23.method5084(0.0F);
                              var23.method5084(0.0F);
                              var23.method5084((float)var36 * var16 + var33);
                              var23.method5084((float)var36 * var17 + var34);
                              var23.method5084((float)var36 * var18 + var35);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5097(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5097(var29, var30, var31, var32);
                              }

                              var23.method5084(1.0F);
                              var23.method5084(0.0F);
                              var23.method5084((float)var36 * var13 + var33);
                              var23.method5084((float)var36 * var14 + var34);
                              var23.method5084((float)var36 * var15 + var35);
                              if (arg1.field5034 != 0) {
                                 var23.method5097(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5091(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5091(var29, var30, var31, var32);
                              }

                              var23.method5084(1.0F);
                              var23.method5084(1.0F);
                              var23.method5084((float)var36 * var19 + var33);
                              var23.method5084((float)var36 * var20 + var34);
                              var23.method5084((float)var36 * var21 + var35);
                              if (~arg1.field5034 != -1) {
                                 var23.method5097(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5091(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5091(var29, var30, var31, var32);
                              }

                              var23.method5084(0.0F);
                              ++var5;
                              var23.method5084(1.0F);
                              --var26;
                           }

                           while(true) {
                              if (var26 < 0) {
                                 var75 = this;
                                 if (var4 == 0) {
                                    if (this.field2335[var24] <= 64) {
                                       --var24;
                                       break;
                                    }

                                    int var37 = this.field2335[var24] + -64 + -1;
                                    int var38 = this.field2314[var37] - 1;
                                    if (var4 == 0 && var38 < 0) {
                                       --var24;
                                       break;
                                    }

                                    do {
                                       class611 var39 = this.field2327[var37][var38];
                                       int var40 = var39.field8948;
                                       byte var41 = (byte)(var40 >> 16);
                                       byte var42 = (byte)(var40 >> 8);
                                       byte var43 = (byte)var40;
                                       byte var44 = (byte)(var40 >>> 24);
                                       float var45 = (float)(var39.field8960 >> 12);
                                       float var46 = (float)(var39.field8954 >> 12);
                                       float var47 = (float)(var39.field8953 >> 12);
                                       int var48 = var39.field8952 >> 12;
                                       var23.method5084((float)(-var48) * var13 + var45);
                                       var23.method5084((float)(-var48) * var14 + var46);
                                       var23.method5084((float)(-var48) * var15 + var47);
                                       if (~arg1.field5034 == -1) {
                                          var23.method5091(var41, var42, var43, var44);
                                          if (var4 != 0) {
                                             var23.method5097(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5097(var41, var42, var43, var44);
                                       }

                                       var23.method5084(0.0F);
                                       var23.method5084(0.0F);
                                       var23.method5084((float)var48 * var16 + var45);
                                       var23.method5084((float)var48 * var17 + var46);
                                       var23.method5084((float)var48 * var18 + var47);
                                       if (arg1.field5034 == 0) {
                                          var23.method5091(var41, var42, var43, var44);
                                          if (var4 != 0) {
                                             var23.method5097(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5097(var41, var42, var43, var44);
                                       }

                                       var23.method5084(1.0F);
                                       var23.method5084(0.0F);
                                       var23.method5084((float)var48 * var13 + var45);
                                       var23.method5084((float)var48 * var14 + var46);
                                       var23.method5084((float)var48 * var15 + var47);
                                       if (~arg1.field5034 != -1) {
                                          var23.method5097(var41, var42, var43, var44);
                                          if (var4 != 0) {
                                             var23.method5091(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5091(var41, var42, var43, var44);
                                       }

                                       var23.method5084(1.0F);
                                       var23.method5084(1.0F);
                                       var23.method5084((float)var48 * var19 + var45);
                                       var23.method5084((float)var48 * var20 + var46);
                                       var23.method5084((float)var48 * var21 + var47);
                                       if (~arg1.field5034 != -1) {
                                          var23.method5097(var41, var42, var43, var44);
                                          if (var4 != 0) {
                                             var23.method5091(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5091(var41, var42, var43, var44);
                                       }

                                       var23.method5084(0.0F);
                                       var23.method5084(1.0F);
                                       ++var5;
                                       --var38;
                                    } while(var38 >= 0);

                                    --var24;
                                    break;
                                 }
                              } else {
                                 var75 = this;
                              }

                              var27 = var75.field2325[var24][var26];
                              var28 = var27.field8948;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field8960 >> 12);
                              var34 = (float)(var27.field8954 >> 12);
                              var35 = (float)(var27.field8953 >> 12);
                              var36 = var27.field8952 >> 12;
                              var23.method5084((float)(-var36) * var13 + var33);
                              var23.method5084((float)(-var36) * var14 + var34);
                              var23.method5084((float)(-var36) * var15 + var35);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5097(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5097(var29, var30, var31, var32);
                              }

                              var23.method5084(0.0F);
                              var23.method5084(0.0F);
                              var23.method5084((float)var36 * var16 + var33);
                              var23.method5084((float)var36 * var17 + var34);
                              var23.method5084((float)var36 * var18 + var35);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5097(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5097(var29, var30, var31, var32);
                              }

                              var23.method5084(1.0F);
                              var23.method5084(0.0F);
                              var23.method5084((float)var36 * var13 + var33);
                              var23.method5084((float)var36 * var14 + var34);
                              var23.method5084((float)var36 * var15 + var35);
                              if (arg1.field5034 != 0) {
                                 var23.method5097(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5091(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5091(var29, var30, var31, var32);
                              }

                              var23.method5084(1.0F);
                              var23.method5084(1.0F);
                              var23.method5084((float)var36 * var19 + var33);
                              var23.method5084((float)var36 * var20 + var34);
                              var23.method5084((float)var36 * var21 + var35);
                              if (~arg1.field5034 != -1) {
                                 var23.method5097(var29, var30, var31, var32);
                                 if (var4 != 0) {
                                    var23.method5091(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5091(var29, var30, var31, var32);
                              }

                              var23.method5084(0.0F);
                              ++var5;
                              var23.method5084(1.0F);
                              --var26;
                           }
                        }

                        if (var24 < 0) {
                           if (var4 == 0) {
                              break;
                           }

                           var10000 = this.field2335[var24];
                        } else {
                           var10000 = this.field2335[var24] > 64 ? 64 : this.field2335[var24];
                        }
                     }
                  }

                  if (var4 == 0) {
                     var23.method5085();
                     var76 = this.field2330.method422((byte)98);
                     if (var4 == 0) {
                        if (var76 != 0) {
                           arg1.method2659(113, this.field2330, 0);
                           arg1.method2659(arg0 + -1467385009, this.field2319, 1);
                           arg1.method2642(this.field2316, (byte)118);
                           arg1.method2628(var5 * 4, 0, 0, 16, class260.field3546, var5 * 2, this.field2320);
                           return;
                        }

                        return;
                     }

                     var10000 = var76 >= -65 ? this.field2335[var24] : 64;
                     break label482;
                  }
               }

               var24 = arg2 - 1;
               if (var4 != 0) {
                  var10000 = ~this.field2335[var24] >= -65 ? this.field2335[var24] : 64;
               } else if (~var24 > -1) {
                  var23.method5085();
                  var76 = this.field2330.method422((byte)98);
                  if (var4 == 0) {
                     if (var76 != 0) {
                        arg1.method2659(113, this.field2330, 0);
                        arg1.method2659(arg0 + -1467385009, this.field2319, 1);
                        arg1.method2642(this.field2316, (byte)118);
                        arg1.method2628(var5 * 4, 0, 0, 16, class260.field3546, var5 * 2, this.field2320);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field2335[var24] : 64;
               } else {
                  var10000 = ~this.field2335[var24] >= -65 ? this.field2335[var24] : 64;
               }
            }

            while(true) {
               int var49 = var10000;
               if (var49 <= 0) {
                  --var24;
               } else {
                  int var50 = var49 - 1;
                  class611 var51;
                  int var52;
                  byte var53;
                  byte var54;
                  byte var55;
                  byte var56;
                  float var57;
                  float var58;
                  float var59;
                  int var60;
                  if (var4 != 0) {
                     var51 = this.field2325[var24][var50];
                     var52 = var51.field8948;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field8960 >> 12);
                     var58 = (float)(var51.field8954 >> 12);
                     var59 = (float)(var51.field8953 >> 12);
                     var60 = var51.field8952 >> 12;
                     var23.method5089((float)(-var60) * var13 + var57);
                     var23.method5089((float)(-var60) * var14 + var58);
                     var23.method5089((float)(-var60) * var15 + var59);
                     if (~arg1.field5034 != -1) {
                        var23.method5097(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5091(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5091(var53, var54, var55, var56);
                     }

                     var23.method5089(0.0F);
                     var23.method5089(0.0F);
                     var23.method5089((float)var60 * var16 + var57);
                     var23.method5089((float)var60 * var17 + var58);
                     var23.method5089((float)var60 * var18 + var59);
                     if (~arg1.field5034 == -1) {
                        var23.method5091(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5097(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5097(var53, var54, var55, var56);
                     }

                     var23.method5089(1.0F);
                     var23.method5089(0.0F);
                     var23.method5089((float)var60 * var13 + var57);
                     var23.method5089((float)var60 * var14 + var58);
                     var23.method5089((float)var60 * var15 + var59);
                     if (~arg1.field5034 != -1) {
                        var23.method5097(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5091(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5091(var53, var54, var55, var56);
                     }

                     var23.method5089(1.0F);
                     var23.method5089(1.0F);
                     var23.method5089((float)var60 * var19 + var57);
                     var23.method5089((float)var60 * var20 + var58);
                     var23.method5089((float)var60 * var21 + var59);
                     if (~arg1.field5034 == -1) {
                        var23.method5091(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5097(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5097(var53, var54, var55, var56);
                     }

                     var23.method5089(0.0F);
                     var23.method5089(1.0F);
                     ++var5;
                     --var50;
                  }

                  while(true) {
                     if (var50 < 0) {
                        var75 = this;
                        if (var4 == 0) {
                           if (~this.field2335[var24] >= -65) {
                              --var24;
                              break;
                           }

                           int var61 = this.field2335[var24] + -64 + -1;
                           int var62 = this.field2314[var61] - 1;
                           if (var4 == 0 && var62 < 0) {
                              --var24;
                              break;
                           }

                           do {
                              class611 var63 = this.field2327[var61][var62];
                              int var64 = var63.field8948;
                              byte var65 = (byte)(var64 >> 16);
                              byte var66 = (byte)(var64 >> 8);
                              byte var67 = (byte)var64;
                              byte var68 = (byte)(var64 >>> 24);
                              float var69 = (float)(var63.field8960 >> 12);
                              float var70 = (float)(var63.field8954 >> 12);
                              float var71 = (float)(var63.field8953 >> 12);
                              int var72 = var63.field8952 >> 12;
                              var23.method5089((float)(-var72) * var13 + var69);
                              var23.method5089((float)(-var72) * var14 + var70);
                              var23.method5089((float)(-var72) * var15 + var71);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var65, var66, var67, var68);
                                 if (var4 != 0) {
                                    var23.method5097(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5097(var65, var66, var67, var68);
                              }

                              var23.method5089(0.0F);
                              var23.method5089(0.0F);
                              var23.method5089((float)var72 * var16 + var69);
                              var23.method5089((float)var72 * var17 + var70);
                              var23.method5089((float)var72 * var18 + var71);
                              if (arg1.field5034 != 0) {
                                 var23.method5097(var65, var66, var67, var68);
                                 if (var4 != 0) {
                                    var23.method5091(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5091(var65, var66, var67, var68);
                              }

                              var23.method5089(1.0F);
                              var23.method5089(0.0F);
                              var23.method5089((float)var72 * var13 + var69);
                              var23.method5089((float)var72 * var14 + var70);
                              var23.method5089((float)var72 * var15 + var71);
                              if (arg1.field5034 == 0) {
                                 var23.method5091(var65, var66, var67, var68);
                                 if (var4 != 0) {
                                    var23.method5097(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5097(var65, var66, var67, var68);
                              }

                              var23.method5089(1.0F);
                              var23.method5089(1.0F);
                              var23.method5089((float)var72 * var19 + var69);
                              var23.method5089((float)var72 * var20 + var70);
                              var23.method5089((float)var72 * var21 + var71);
                              if (arg1.field5034 != 0) {
                                 var23.method5097(var65, var66, var67, var68);
                                 if (var4 != 0) {
                                    var23.method5091(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5091(var65, var66, var67, var68);
                              }

                              var23.method5089(0.0F);
                              var23.method5089(1.0F);
                              ++var5;
                              --var62;
                           } while(var62 >= 0);

                           --var24;
                           break;
                        }
                     } else {
                        var75 = this;
                     }

                     var51 = var75.field2325[var24][var50];
                     var52 = var51.field8948;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field8960 >> 12);
                     var58 = (float)(var51.field8954 >> 12);
                     var59 = (float)(var51.field8953 >> 12);
                     var60 = var51.field8952 >> 12;
                     var23.method5089((float)(-var60) * var13 + var57);
                     var23.method5089((float)(-var60) * var14 + var58);
                     var23.method5089((float)(-var60) * var15 + var59);
                     if (~arg1.field5034 != -1) {
                        var23.method5097(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5091(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5091(var53, var54, var55, var56);
                     }

                     var23.method5089(0.0F);
                     var23.method5089(0.0F);
                     var23.method5089((float)var60 * var16 + var57);
                     var23.method5089((float)var60 * var17 + var58);
                     var23.method5089((float)var60 * var18 + var59);
                     if (~arg1.field5034 == -1) {
                        var23.method5091(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5097(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5097(var53, var54, var55, var56);
                     }

                     var23.method5089(1.0F);
                     var23.method5089(0.0F);
                     var23.method5089((float)var60 * var13 + var57);
                     var23.method5089((float)var60 * var14 + var58);
                     var23.method5089((float)var60 * var15 + var59);
                     if (~arg1.field5034 != -1) {
                        var23.method5097(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5091(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5091(var53, var54, var55, var56);
                     }

                     var23.method5089(1.0F);
                     var23.method5089(1.0F);
                     var23.method5089((float)var60 * var19 + var57);
                     var23.method5089((float)var60 * var20 + var58);
                     var23.method5089((float)var60 * var21 + var59);
                     if (~arg1.field5034 == -1) {
                        var23.method5091(var53, var54, var55, var56);
                        if (var4 != 0) {
                           var23.method5097(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5097(var53, var54, var55, var56);
                     }

                     var23.method5089(0.0F);
                     var23.method5089(1.0F);
                     ++var5;
                     --var50;
                  }
               }

               if (~var24 > -1) {
                  var23.method5085();
                  var76 = this.field2330.method422((byte)98);
                  if (var4 == 0) {
                     if (var76 != 0) {
                        arg1.method2659(113, this.field2330, 0);
                        arg1.method2659(arg0 + -1467385009, this.field2319, 1);
                        arg1.method2642(this.field2316, (byte)118);
                        arg1.method2628(var5 * 4, 0, 0, 16, class260.field3546, var5 * 2, this.field2320);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field2335[var24] : 64;
               } else {
                  var10000 = ~this.field2335[var24] >= -65 ? this.field2335[var24] : 64;
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class670.method4877(var74, field2337[7] + arg0 + ',' + (arg1 != null ? field2337[2] : field2337[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(Loda;IILdh;)V"
   )
   public final void method1448(class127 param1, int param2, int param3, class338 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(Ldh;I)V"
   )
   private final void method1449(class338 arg0, int arg1) {
      try {
         if (arg1 == 2045139884) {
            arg0.method2551(18702, true);
            ++field2331;
            arg0.method2655(arg1 ^ 2045147176, true);
            if (class576.field8552 != arg0.field5059) {
               arg0.method654(class576.field8552);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2337[8] + (arg0 != null ? field2337[2] : field2337[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(Ldh;B)V"
   )
   private final void method1450(class338 arg0, byte arg1) {
      try {
         ++field2332;
         if (arg1 > -120) {
            this.method1447(2, (class338)null, 120);
         }

         class576.field8552 = arg0.field5059;
         arg0.method2623((byte)-72);
         arg0.method2655(9092, false);
         arg0.method2551(18702, false);
         arg0.method2661((byte)-96);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2337[6] + (arg0 != null ? field2337[2] : field2337[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1451(int arg0) {
      try {
         ++field2318;
         this.field2330.method423(-15607);
         if (arg0 != 1) {
            this.method1451(-3);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2337[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1452(int arg0) {
      try {
         field2336 = null;
         if (arg0 == -17445) {
            field2334 = null;
            field2321 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2337[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(Ldh;)V"
   )
   public class186(class338 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1453(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1454(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
