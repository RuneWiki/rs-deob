import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class621 {
   @OriginalMember(
      owner = "client!th",
      name = "k",
      descriptor = "I"
   )
   public int field9054 = -1;
   @OriginalMember(
      owner = "client!th",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9059 = new String[]{method4491(method4490("G`8?0")), method4491(method4490("G`8:0")), method4491(method4490("]}z\u0015")), method4491(method4490("H&8We")), method4491(method4490("G`810")), method4491(method4490("G`8=0")), method4491(method4490("G`800")), method4491(method4490("G`8>0")), method4491(method4490("G`8;0")), method4491(method4490("G`8<0"))};
   @OriginalMember(
      owner = "client!th",
      name = "t",
      descriptor = "I"
   )
   public static int field9053 = 0;
   @OriginalMember(
      owner = "client!th",
      name = "w",
      descriptor = "I"
   )
   public static int field9036;
   @OriginalMember(
      owner = "client!th",
      name = "o",
      descriptor = "I"
   )
   public static int field9037;
   @OriginalMember(
      owner = "client!th",
      name = "j",
      descriptor = "I"
   )
   public static int field9040;
   @OriginalMember(
      owner = "client!th",
      name = "c",
      descriptor = "I"
   )
   public static int field9044;
   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "I"
   )
   public static int field9046;
   @OriginalMember(
      owner = "client!th",
      name = "r",
      descriptor = "I"
   )
   public static int field9049;
   @OriginalMember(
      owner = "client!th",
      name = "i",
      descriptor = "I"
   )
   public static int field9052;
   @OriginalMember(
      owner = "client!th",
      name = "g",
      descriptor = "I"
   )
   public static int field9056;
   @OriginalMember(
      owner = "client!th",
      name = "f",
      descriptor = "Lwia;"
   )
   private class791 field9051;
   @OriginalMember(
      owner = "client!th",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   private String field9042;
   @OriginalMember(
      owner = "client!th",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   private String field9050;
   @OriginalMember(
      owner = "client!th",
      name = "s",
      descriptor = "[I"
   )
   private int[] field9034;
   @OriginalMember(
      owner = "client!th",
      name = "q",
      descriptor = "[I"
   )
   private int[] field9038;
   @OriginalMember(
      owner = "client!th",
      name = "e",
      descriptor = "[I"
   )
   private int[] field9041;
   @OriginalMember(
      owner = "client!th",
      name = "d",
      descriptor = "[I"
   )
   private int[] field9045;
   @OriginalMember(
      owner = "client!th",
      name = "u",
      descriptor = "[I"
   )
   private int[] field9047;
   @OriginalMember(
      owner = "client!th",
      name = "x",
      descriptor = "[I"
   )
   private int[] field9055;
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "[I"
   )
   private int[] field9057;
   @OriginalMember(
      owner = "client!th",
      name = "p",
      descriptor = "[I"
   )
   private int[] field9058;
   @OriginalMember(
      owner = "client!th",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field9039;
   @OriginalMember(
      owner = "client!th",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field9048;
   @OriginalMember(
      owner = "client!th",
      name = "n",
      descriptor = "[[I"
   )
   private int[][] field9033;
   @OriginalMember(
      owner = "client!th",
      name = "h",
      descriptor = "[[I"
   )
   private int[][] field9035;
   @OriginalMember(
      owner = "client!th",
      name = "b",
      descriptor = "[[I"
   )
   private int[][] field9043;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(ILjj;I)V",
      line = 5
   )
   private final void method4481(int arg0, class128 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field9044;
         int var5 = -42 % ((arg0 - 74) / 47);
         if (arg2 != 1) {
            if (arg2 == 2) {
               this.field9050 = arg1.method1049((byte)96);
            } else if (~arg2 != -4) {
               if (~arg2 != -5) {
                  if (arg2 == 5) {
                     arg1.method1038((byte)-104);
                  } else {
                     if (~arg2 != -7) {
                        if (~arg2 == -8) {
                           arg1.method1104(255);
                           return;
                        }

                        if (~arg2 != -9) {
                           if (~arg2 == -10) {
                              arg1.method1104(255);
                              return;
                           }

                           if (~arg2 != -11) {
                              if (arg2 == 12) {
                                 arg1.method1041(4758);
                                 return;
                              }

                              if (arg2 != 13) {
                                 if (~arg2 == -15) {
                                    int var8 = arg1.method1104(255);
                                    this.field9043 = new int[var8][2];
                                    int var9 = 0;
                                    if (var4 != 0) {
                                       this.field9043[var9][0] = arg1.method1104(255);
                                       this.field9043[var9][1] = arg1.method1104(255);
                                       ++var9;
                                    }

                                    while(true) {
                                       while(~var8 < ~var9) {
                                          this.field9043[var9][0] = arg1.method1104(255);
                                          this.field9043[var9][1] = arg1.method1104(255);
                                          ++var9;
                                       }

                                       if (var4 == 0) {
                                          return;
                                       }

                                       ++var9;
                                    }
                                 }

                                 if (~arg2 == -16) {
                                    arg1.method1038((byte)-118);
                                    return;
                                 }

                                 if (arg2 == 17) {
                                    this.field9054 = arg1.method1038((byte)-96);
                                    return;
                                 }

                                 if (~arg2 == -19) {
                                    int var10 = arg1.method1104(255);
                                    this.field9058 = new int[var10];
                                    this.field9048 = new String[var10];
                                    this.field9038 = new int[var10];
                                    this.field9034 = new int[var10];
                                    int var11 = 0;
                                    if (var4 != 0) {
                                       this.field9034[var11] = arg1.method1041(4758);
                                       this.field9038[var11] = arg1.method1041(4758);
                                       this.field9058[var11] = arg1.method1041(4758);
                                       this.field9048[var11] = arg1.method1083((byte)66);
                                       ++var11;
                                    }

                                    while(true) {
                                       while(~var10 < ~var11) {
                                          this.field9034[var11] = arg1.method1041(4758);
                                          this.field9038[var11] = arg1.method1041(4758);
                                          this.field9058[var11] = arg1.method1041(4758);
                                          this.field9048[var11] = arg1.method1083((byte)66);
                                          ++var11;
                                       }

                                       if (var4 == 0) {
                                          return;
                                       }

                                       ++var11;
                                    }
                                 }

                                 if (arg2 == 19) {
                                    int var12 = arg1.method1104(255);
                                    this.field9055 = new int[var12];
                                    this.field9045 = new int[var12];
                                    this.field9041 = new int[var12];
                                    this.field9039 = new String[var12];
                                    int var13 = 0;
                                    if (var4 != 0) {
                                       this.field9045[var13] = arg1.method1041(4758);
                                       this.field9055[var13] = arg1.method1041(4758);
                                       this.field9041[var13] = arg1.method1041(4758);
                                       this.field9039[var13] = arg1.method1083((byte)126);
                                       ++var13;
                                    }

                                    while(true) {
                                       while(var13 < var12) {
                                          this.field9045[var13] = arg1.method1041(4758);
                                          this.field9055[var13] = arg1.method1041(4758);
                                          this.field9041[var13] = arg1.method1041(4758);
                                          this.field9039[var13] = arg1.method1083((byte)126);
                                          ++var13;
                                       }

                                       if (var4 == 0) {
                                          return;
                                       }

                                       ++var13;
                                    }
                                 }

                                 if (~arg2 == -250) {
                                    int var14 = arg1.method1104(255);
                                    if (this.field9051 == null) {
                                       int var15 = class7.method63(var14, false);
                                       this.field9051 = new class791(var15);
                                    }

                                    int var16 = 0;
                                    boolean var10000;
                                    if (var4 != 0) {
                                       var10000 = arg1.method1104(255) == 1;
                                    } else if (~var16 <= ~var14) {
                                       if (var4 == 0) {
                                          return;
                                       }

                                       var10000 = true;
                                    } else {
                                       var10000 = arg1.method1104(255) == 1;
                                    }

                                    while(true) {
                                       boolean var17 = var10000;
                                       int var18 = arg1.method1077(-33);
                                       class347 var19;
                                       if (var17) {
                                          var19 = new class391(arg1.method1083((byte)66));
                                          if (var4 != 0) {
                                             var19 = new class10(arg1.method1041(4758));
                                          }
                                       } else {
                                          var19 = new class10(arg1.method1041(4758));
                                       }

                                       this.field9051.method5682((long)var18, var19, (byte)7);
                                       ++var16;
                                       if (~var16 <= ~var14) {
                                          if (var4 == 0) {
                                             return;
                                          }

                                          var10000 = true;
                                       } else {
                                          var10000 = arg1.method1104(255) == 1;
                                       }
                                    }
                                 }
                              } else {
                                 int var20 = arg1.method1104(255);
                                 this.field9047 = new int[var20];
                                 int var21 = 0;
                                 if (var4 != 0 || var20 > var21) {
                                    do {
                                       this.field9047[var21] = arg1.method1038((byte)-119);
                                       ++var21;
                                    } while(var20 > var21);
                                 }
                              }

                              return;
                           }

                           int var6 = arg1.method1104(255);
                           this.field9057 = new int[var6];
                           int var7 = 0;
                           if (var4 != 0) {
                              this.field9057[var7] = arg1.method1041(4758);
                              ++var7;
                           }

                           while(true) {
                              while(~var7 > ~var6) {
                                 this.field9057[var7] = arg1.method1041(4758);
                                 ++var7;
                              }

                              if (var4 == 0) {
                                 return;
                              }

                              ++var7;
                           }
                        }
                     } else {
                        arg1.method1104(255);
                     }

                  }
               } else {
                  int var22 = arg1.method1104(255);
                  this.field9035 = new int[var22][3];
                  int var23 = 0;
                  if (var4 != 0) {
                     this.field9035[var23][0] = arg1.method1038((byte)-122);
                     this.field9035[var23][1] = arg1.method1041(4758);
                     this.field9035[var23][2] = arg1.method1041(4758);
                     ++var23;
                  }

                  while(true) {
                     while(var23 < var22) {
                        this.field9035[var23][0] = arg1.method1038((byte)-122);
                        this.field9035[var23][1] = arg1.method1041(4758);
                        this.field9035[var23][2] = arg1.method1041(4758);
                        ++var23;
                     }

                     if (var4 == 0) {
                        return;
                     }

                     ++var23;
                  }
               }
            } else {
               int var24 = arg1.method1104(255);
               this.field9033 = new int[var24][3];
               int var25 = 0;
               if (var4 != 0) {
                  this.field9033[var25][0] = arg1.method1038((byte)-96);
                  this.field9033[var25][1] = arg1.method1041(4758);
                  this.field9033[var25][2] = arg1.method1041(4758);
                  ++var25;
               }

               while(true) {
                  while(var25 < var24) {
                     this.field9033[var25][0] = arg1.method1038((byte)-96);
                     this.field9033[var25][1] = arg1.method1041(4758);
                     this.field9033[var25][2] = arg1.method1041(4758);
                     ++var25;
                  }

                  if (var4 == 0) {
                     return;
                  }

                  ++var25;
               }
            }
         } else {
            this.field9042 = arg1.method1049((byte)116);
         }
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field9059[7] + arg0 + ',' + (arg1 != null ? field9059[3] : field9059[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IIILnfa;Lnfa;)V",
      line = 240
   )
   public static final void method4482(int arg0, int arg1, int arg2, class707 arg3, class707 arg4) {
      class72 var5 = class349.method2732(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field922 = arg3;
         var5.field913 = arg4;
         int var6 = class650.field9484 == class377.field5711 ? 1 : 0;
         if (arg3.method2(-7577)) {
            if (arg3.method5(-26787)) {
               arg3.field8996 = class197.field2449[var6];
               class197.field2449[var6] = arg3;
            } else {
               arg3.field8996 = class764.field11222[var6];
               class764.field11222[var6] = arg3;
               class321.field4583 = true;
            }
         } else {
            arg3.field8996 = class535.field7803[var6];
            class535.field7803[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method2(-7577)) {
               if (arg4.method5(-26787)) {
                  arg4.field8996 = class197.field2449[var6];
                  class197.field2449[var6] = arg4;
                  return;
               }

               arg4.field8996 = class764.field11222[var6];
               class764.field11222[var6] = arg4;
               class321.field4583 = true;
               return;
            }

            arg4.field8996 = class535.field7803[var6];
            class535.field7803[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Lgca;ILha;)I",
      line = 315
   )
   public static final int method4483(class261 arg0, int arg1, class66 arg2) {
      try {
         ++field9040;
         if (arg0.field3573 == -1) {
            if (~arg0.field3567 != 0) {
               class327 var3 = arg2.field813.method1159(arg0.field3567, 122);
               if (!var3.field4649) {
                  return var3.field4650;
               }
            }

            return arg1 >= -6 ? -70 : arg0.field3559;
         } else {
            return arg0.field3573;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9059[1] + (arg0 != null ? field9059[3] : field9059[2]) + ',' + arg1 + ',' + (arg2 != null ? field9059[3] : field9059[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z",
      line = 341
   )
   public static final boolean method4484(byte arg0, String arg1) {
      try {
         ++field9056;
         int var2 = 28 % ((-10 - arg0) / 52);
         return class474.method3526(10, true, 87, arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9059[5] + arg0 + ',' + (arg1 != null ? field9059[3] : field9059[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Ljj;B)V",
      line = 355
   )
   public final void method4485(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field9052;

         while(true) {
            int var4 = arg0.method1104(arg1 ^ -233);
            if (~var4 != -1) {
               this.method4481(arg1 ^ -110, arg0, var4);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            if (arg1 != -24) {
               method4484((byte)-111, (String)null);
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9059[4] + (arg0 != null ? field9059[3] : field9059[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(B)V",
      line = 381
   )
   public final void method4486(byte arg0) {
      try {
         if (arg0 != -97) {
            method4484((byte)-104, (String)null);
         }

         ++field9046;
         if (this.field9050 == null) {
            this.field9050 = this.field9042;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9059[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IIIIIB)V",
      line = 398
   )
   public static final void method4487(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      int var6 = client.field4530;

      try {
         int var7 = arg4;
         if (var6 != 0) {
            class47.method372(arg3, class292.field4077[arg4], arg1, (byte)116, arg0);
            var7 = arg4 + 1;
         }

         while(true) {
            int var10000;
            if (~var7 < ~arg2) {
               var10000 = arg5;
               if (var6 == 0) {
                  if (arg5 != -83) {
                     return;
                  }

                  ++field9037;
                  return;
               }
            } else {
               var10000 = arg3;
            }

            class47.method372(var10000, class292.field4077[var7], arg1, (byte)116, arg0);
            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9059[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(I[Ljava/lang/String;[III)V",
      line = 419
   )
   public static final void method4488(int arg0, String[] arg1, int[] arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         if (arg4 != 7116) {
            field9053 = 18;
         }

         if (~arg3 < ~arg0) {
            int var6 = (arg0 + arg3) / 2;
            int var7 = arg0;
            String var8 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var8;
            int var9 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = arg0;
            String var11;
            int var12;
            if (var5 != 0) {
               if (var8 != null) {
                  if (arg1[arg0] != null) {
                     if (~(1 & arg0) < ~arg1[arg0].compareTo(var8)) {
                        var11 = arg1[arg0];
                        arg1[arg0] = arg1[arg0];
                        arg1[arg0] = var11;
                        var12 = arg2[arg0];
                        arg2[arg0] = arg2[arg0];
                        var7 = arg0 + 1;
                        arg2[arg0] = var12;
                        var10 = arg0 + 1;
                     } else {
                        var10 = arg0 + 1;
                     }
                  } else {
                     var10 = arg0 + 1;
                  }
               } else {
                  var11 = arg1[arg0];
                  arg1[arg0] = arg1[arg0];
                  arg1[arg0] = var11;
                  var12 = arg2[arg0];
                  arg2[arg0] = arg2[arg0];
                  var7 = arg0 + 1;
                  arg2[arg0] = var12;
                  var10 = arg0 + 1;
               }
            }

            while(true) {
               while(~arg3 < ~var10) {
                  if (var8 != null) {
                     if (arg1[var10] != null) {
                        if (~(1 & var10) < ~arg1[var10].compareTo(var8)) {
                           var11 = arg1[var10];
                           arg1[var10] = arg1[var7];
                           arg1[var7] = var11;
                           var12 = arg2[var10];
                           arg2[var10] = arg2[var7];
                           arg2[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg1[var10];
                     arg1[var10] = arg1[var7];
                     arg1[var7] = var11;
                     var12 = arg2[var10];
                     arg2[var10] = arg2[var7];
                     arg2[var7++] = var12;
                     ++var10;
                  }
               }

               arg1[arg3] = arg1[var7];
               arg1[var7] = var8;
               arg2[arg3] = arg2[var7];
               arg2[var7] = var9;
               method4488(arg0, arg1, arg2, var7 + -1, 7116);
               int var10000 = var7 - -1;
               if (var5 == 0) {
                  method4488(var10000, arg1, arg2, arg3, arg4);
                  break;
               }

               if (var10000 < ~arg1[var10].compareTo(var8)) {
                  var11 = arg1[var10];
                  arg1[var10] = arg1[var7];
                  arg1[var7] = var11;
                  var12 = arg2[var10];
                  arg2[var10] = arg2[var7];
                  arg2[var7++] = var12;
                  ++var10;
               } else {
                  ++var10;
               }
            }
         }

         ++field9049;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field9059[6] + arg0 + ',' + (arg1 != null ? field9059[3] : field9059[2]) + ',' + (arg2 != null ? field9059[3] : field9059[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(III)V",
      line = 487
   )
   public static final void method4489(int arg0, int arg1, int arg2) {
      try {
         if (arg0 == -22585) {
            ++field9036;
            class403 var3 = class453.method3410((long)arg1, true, 17);
            var3.method3093(22144);
            var3.field6185 = arg2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9059[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
