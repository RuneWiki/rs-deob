import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class129 {
   @OriginalMember(
      owner = "client!pr",
      name = "B",
      descriptor = "I"
   )
   public int field2063 = -1;
   @OriginalMember(
      owner = "client!pr",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2083 = new String[]{method1324(method1323("q,&\u001c!")), method1324(method1323("q,&\u0016!")), method1324(method1323("o+d2")), method1324(method1323("zp&pt")), method1324(method1323("q,&\u001b!")), method1324(method1323("q,&\u001a!")), method1324(method1323("q,&\u001f!")), method1324(method1323("q,&\u0017!")), method1324(method1323("q,&\u0019!")), method1324(method1323("q,&\u0015!")), method1324(method1323("q,&\u0018!")), method1324(method1323("q,&\u001d!")), method1324(method1323("q,&\u0014!"))};
   @OriginalMember(
      owner = "client!pr",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2053 = null;
   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field2065 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @OriginalMember(
      owner = "client!pr",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2080 = new int[200];
   @OriginalMember(
      owner = "client!pr",
      name = "D",
      descriptor = "I"
   )
   public static int field2059;
   @OriginalMember(
      owner = "client!pr",
      name = "e",
      descriptor = "I"
   )
   public static int field2060;
   @OriginalMember(
      owner = "client!pr",
      name = "A",
      descriptor = "I"
   )
   public static int field2061;
   @OriginalMember(
      owner = "client!pr",
      name = "y",
      descriptor = "I"
   )
   public static int field2062;
   @OriginalMember(
      owner = "client!pr",
      name = "m",
      descriptor = "I"
   )
   public static int field2064;
   @OriginalMember(
      owner = "client!pr",
      name = "f",
      descriptor = "I"
   )
   public static int field2069;
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "I"
   )
   public static int field2074;
   @OriginalMember(
      owner = "client!pr",
      name = "l",
      descriptor = "I"
   )
   public static int field2077;
   @OriginalMember(
      owner = "client!pr",
      name = "k",
      descriptor = "I"
   )
   public static int field2078;
   @OriginalMember(
      owner = "client!pr",
      name = "d",
      descriptor = "I"
   )
   public static int field2082;
   @OriginalMember(
      owner = "client!pr",
      name = "q",
      descriptor = "Lbga;"
   )
   private class398 field2054;
   @OriginalMember(
      owner = "client!pr",
      name = "j",
      descriptor = "Lnq;"
   )
   public static class52 field2068;
   @OriginalMember(
      owner = "client!pr",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field2055;
   @OriginalMember(
      owner = "client!pr",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   private String field2070;
   @OriginalMember(
      owner = "client!pr",
      name = "E",
      descriptor = "[I"
   )
   private int[] field2052;
   @OriginalMember(
      owner = "client!pr",
      name = "C",
      descriptor = "[I"
   )
   private int[] field2056;
   @OriginalMember(
      owner = "client!pr",
      name = "v",
      descriptor = "[I"
   )
   private int[] field2058;
   @OriginalMember(
      owner = "client!pr",
      name = "x",
      descriptor = "[I"
   )
   private int[] field2067;
   @OriginalMember(
      owner = "client!pr",
      name = "g",
      descriptor = "[I"
   )
   private int[] field2071;
   @OriginalMember(
      owner = "client!pr",
      name = "u",
      descriptor = "[I"
   )
   private int[] field2072;
   @OriginalMember(
      owner = "client!pr",
      name = "r",
      descriptor = "[I"
   )
   private int[] field2076;
   @OriginalMember(
      owner = "client!pr",
      name = "n",
      descriptor = "[I"
   )
   private int[] field2079;
   @OriginalMember(
      owner = "client!pr",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field2057;
   @OriginalMember(
      owner = "client!pr",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field2073;
   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "[[I"
   )
   private int[][] field2066;
   @OriginalMember(
      owner = "client!pr",
      name = "p",
      descriptor = "[[I"
   )
   private int[][] field2075;
   @OriginalMember(
      owner = "client!pr",
      name = "o",
      descriptor = "[[I"
   )
   private int[][] field2081;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method1312(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != -2582) {
            this.method1318(-70, (class65)null, (byte)-63);
         }

         while(true) {
            int var4 = arg0.method665(false);
            if (~var4 != -1) {
               this.method1318(var4, arg0, (byte)-108);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field2082;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2083[7] + (arg0 != null ? field2083[3] : field2083[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1313(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field2069;
         class321.method2594();
         int var2 = 0;
         if (var1) {
            class100.field1588[var2].method4812((byte)-13);
            ++var2;
         }

         while(true) {
            while(var2 < 4) {
               class100.field1588[var2].method4812((byte)-13);
               ++var2;
            }

            if (!var1) {
               if (arg0 != 2) {
                  method1320(0, (byte)-33, 17);
               }

               class762.method5498(arg0 ^ -120);
               class372.method2915((byte)35);
               class663.method4820(1);
               System.gc();
               class54.field794.method144();
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2083[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1314(int arg0) {
      try {
         if (this.field2070 == null) {
            this.field2070 = this.field2055;
         }

         if (arg0 != 15) {
            method1316((byte)5, (File)null, (String)null);
         }

         ++field2062;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2083[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(ILcu;)Lui;"
   )
   public static final class251 method1315(int arg0, class65 arg1) {
      try {
         ++field2060;
         if (arg0 != 0) {
            field2053 = null;
         }

         return new class251(arg1.method655((byte)98), arg1.method655((byte)79), arg1.method655((byte)91), arg1.method655((byte)72), arg1.method691((byte)-127), arg1.method691((byte)-127), arg1.method665(false));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2083[1] + arg0 + ',' + (arg1 != null ? field2083[3] : field2083[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(BLjava/io/File;Ljava/lang/String;)V"
   )
   public static final void method1316(byte arg0, File arg1, String arg2) {
      try {
         ++field2078;
         class235.field3630.put(arg2, arg1);
         if (arg0 < 50) {
            field2080 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2083[10] + arg0 + ',' + (arg1 != null ? field2083[3] : field2083[2]) + ',' + (arg2 != null ? field2083[3] : field2083[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1317(byte arg0) {
      try {
         field2053 = null;
         field2068 = null;
         field2065 = null;
         field2080 = null;
         if (arg0 >= -67) {
            method1319(0, (byte)35, 84, (class82)null, 6, -17);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2083[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(ILcu;B)V"
   )
   private final void method1318(int arg0, class65 arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         ++field2059;
         if (arg2 >= -96) {
            this.field2070 = null;
         }

         if (arg0 != 1) {
            if (arg0 == 2) {
               this.field2070 = arg1.method698((byte)15);
            } else if (~arg0 != -4) {
               if (arg0 != 4) {
                  if (arg0 != 5) {
                     if (~arg0 == -7) {
                        arg1.method665(false);
                        return;
                     }

                     if (~arg0 == -8) {
                        arg1.method665(false);
                        return;
                     }

                     if (arg0 != 8) {
                        if (arg0 == 9) {
                           arg1.method665(false);
                           return;
                        }

                        if (~arg0 != -11) {
                           if (arg0 == 12) {
                              arg1.method701(255);
                              return;
                           }

                           if (arg0 != 13) {
                              if (arg0 != 14) {
                                 if (arg0 != 15) {
                                    if (~arg0 == -18) {
                                       this.field2063 = arg1.method685(-2);
                                       return;
                                    }

                                    if (~arg0 == -19) {
                                       int var9 = arg1.method665(false);
                                       this.field2052 = new int[var9];
                                       this.field2071 = new int[var9];
                                       this.field2072 = new int[var9];
                                       this.field2057 = new String[var9];
                                       int var10 = 0;
                                       if (var4) {
                                          this.field2052[var10] = arg1.method701(255);
                                          this.field2071[var10] = arg1.method701(255);
                                          this.field2072[var10] = arg1.method701(255);
                                          this.field2057[var10] = arg1.method640((byte)51);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(var10 < var9) {
                                             this.field2052[var10] = arg1.method701(255);
                                             this.field2071[var10] = arg1.method701(255);
                                             this.field2072[var10] = arg1.method701(255);
                                             this.field2057[var10] = arg1.method640((byte)51);
                                             ++var10;
                                          }

                                          if (!var4) {
                                             return;
                                          }

                                          ++var10;
                                       }
                                    }

                                    if (~arg0 == -20) {
                                       int var11 = arg1.method665(false);
                                       this.field2073 = new String[var11];
                                       this.field2056 = new int[var11];
                                       this.field2067 = new int[var11];
                                       this.field2076 = new int[var11];
                                       int var12 = 0;
                                       if (var4) {
                                          this.field2076[var12] = arg1.method701(255);
                                          this.field2067[var12] = arg1.method701(255);
                                          this.field2056[var12] = arg1.method701(255);
                                          this.field2073[var12] = arg1.method640((byte)51);
                                          ++var12;
                                       }

                                       while(true) {
                                          while(~var12 > ~var11) {
                                             this.field2076[var12] = arg1.method701(255);
                                             this.field2067[var12] = arg1.method701(255);
                                             this.field2056[var12] = arg1.method701(255);
                                             this.field2073[var12] = arg1.method640((byte)51);
                                             ++var12;
                                          }

                                          if (!var4) {
                                             return;
                                          }

                                          ++var12;
                                       }
                                    }

                                    if (arg0 == 249) {
                                       int var13 = arg1.method665(false);
                                       if (this.field2054 == null) {
                                          int var14 = class645.method4694(var13, (byte)-128);
                                          this.field2054 = new class398(var14);
                                       }

                                       int var15 = 0;
                                       boolean var10000;
                                       if (var4) {
                                          var10000 = ~arg1.method665(false) == -2;
                                       } else if (~var13 >= ~var15) {
                                          if (!var4) {
                                             return;
                                          }

                                          var10000 = true;
                                       } else {
                                          var10000 = ~arg1.method665(false) == -2;
                                       }

                                       while(true) {
                                          boolean var16 = var10000;
                                          int var17 = arg1.method691((byte)-128);
                                          class247 var18;
                                          if (!var16) {
                                             var18 = new class288(arg1.method701(255));
                                             if (var4) {
                                                var18 = new class354(arg1.method640((byte)51));
                                             }
                                          } else {
                                             var18 = new class354(arg1.method640((byte)51));
                                          }

                                          this.field2054.method3098((long)var17, var18, -1);
                                          ++var15;
                                          if (~var13 >= ~var15) {
                                             if (!var4) {
                                                return;
                                             }

                                             var10000 = true;
                                          } else {
                                             var10000 = ~arg1.method665(false) == -2;
                                          }
                                       }
                                    }
                                 } else {
                                    arg1.method685(-2);
                                 }

                                 return;
                              }

                              int var7 = arg1.method665(false);
                              this.field2081 = new int[var7][2];
                              int var8 = 0;
                              if (var4) {
                                 this.field2081[var8][0] = arg1.method665(false);
                                 this.field2081[var8][1] = arg1.method665(false);
                                 ++var8;
                              }

                              while(true) {
                                 while(var8 < var7) {
                                    this.field2081[var8][0] = arg1.method665(false);
                                    this.field2081[var8][1] = arg1.method665(false);
                                    ++var8;
                                 }

                                 if (!var4) {
                                    return;
                                 }

                                 ++var8;
                              }
                           }

                           int var19 = arg1.method665(false);
                           this.field2058 = new int[var19];
                           int var20 = 0;
                           if (var4) {
                              this.field2058[var20] = arg1.method685(-2);
                              ++var20;
                           }

                           while(true) {
                              while(~var19 < ~var20) {
                                 this.field2058[var20] = arg1.method685(-2);
                                 ++var20;
                              }

                              if (!var4) {
                                 return;
                              }

                              ++var20;
                           }
                        }

                        int var5 = arg1.method665(false);
                        this.field2079 = new int[var5];
                        int var6 = 0;
                        if (var4) {
                           this.field2079[var6] = arg1.method701(255);
                           ++var6;
                        }

                        while(true) {
                           while(var6 < var5) {
                              this.field2079[var6] = arg1.method701(255);
                              ++var6;
                           }

                           if (!var4) {
                              return;
                           }

                           ++var6;
                        }
                     }
                  } else {
                     arg1.method685(-2);
                  }

               } else {
                  int var21 = arg1.method665(false);
                  this.field2075 = new int[var21][3];
                  int var22 = 0;
                  if (var4) {
                     this.field2075[var22][0] = arg1.method685(-2);
                     this.field2075[var22][1] = arg1.method701(255);
                     this.field2075[var22][2] = arg1.method701(255);
                     ++var22;
                  }

                  while(true) {
                     while(var22 < var21) {
                        this.field2075[var22][0] = arg1.method685(-2);
                        this.field2075[var22][1] = arg1.method701(255);
                        this.field2075[var22][2] = arg1.method701(255);
                        ++var22;
                     }

                     if (!var4) {
                        return;
                     }

                     ++var22;
                  }
               }
            } else {
               int var23 = arg1.method665(false);
               this.field2066 = new int[var23][3];
               int var24 = 0;
               if (var4) {
                  this.field2066[var24][0] = arg1.method685(-2);
                  this.field2066[var24][1] = arg1.method701(255);
                  this.field2066[var24][2] = arg1.method701(255);
                  ++var24;
               }

               while(true) {
                  while(~var24 > ~var23) {
                     this.field2066[var24][0] = arg1.method685(-2);
                     this.field2066[var24][1] = arg1.method701(255);
                     this.field2066[var24][2] = arg1.method701(255);
                     ++var24;
                  }

                  if (!var4) {
                     return;
                  }

                  ++var24;
               }
            }
         } else {
            this.field2055 = arg1.method698((byte)110);
         }
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field2083[9] + arg0 + ',' + (arg1 != null ? field2083[3] : field2083[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(IBILfea;II)Ljava/awt/Frame;"
   )
   public static final Frame method1319(int arg0, byte arg1, int arg2, class82 arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field2064;
         if (!arg3.method867(false)) {
            return null;
         } else {
            if (arg4 == 0) {
               class655[] var7 = class150.method1466(119, arg3);
               if (var7 == null) {
                  return null;
               }

               int var10000;
               label117: {
                  byte var8 = 0;
                  int var9 = 0;
                  if (var6) {
                     var10000 = var7[var9].field9282;
                  } else if (~var7.length >= ~var9) {
                     var10000 = var8;
                     if (!var6) {
                        break label117;
                     }
                  } else {
                     var10000 = var7[var9].field9282;
                  }

                  while(true) {
                     if (var10000 == arg5) {
                        if (~var7[var9].field9281 == ~arg0) {
                           if (~arg2 != -1) {
                              if (var7[var9].field9284 == arg2) {
                                 if (var8 != 0) {
                                    if (var7[var9].field9283 > arg4) {
                                       arg4 = var7[var9].field9283;
                                       var8 = 1;
                                       ++var9;
                                    } else {
                                       ++var9;
                                    }
                                 } else {
                                    arg4 = var7[var9].field9283;
                                    var8 = 1;
                                    ++var9;
                                 }
                              } else {
                                 ++var9;
                              }
                           } else if (var8 != 0) {
                              if (var7[var9].field9283 > arg4) {
                                 arg4 = var7[var9].field9283;
                                 var8 = 1;
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              arg4 = var7[var9].field9283;
                              var8 = 1;
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        ++var9;
                     }

                     if (~var7.length >= ~var9) {
                        var10000 = var8;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var7[var9].field9282;
                     }
                  }
               }

               if (var10000 == 0) {
                  return null;
               }
            }

            class92 var10 = arg3.method878(false, arg0, arg2, arg4, arg5);
            if (var6) {
               class97.method968(32353, 10L);
            }

            while(true) {
               short var14;
               if (~var10.field1526 != -1) {
                  var14 = arg1;
                  if (!var6) {
                     if (arg1 > -79) {
                        method1317((byte)20);
                     }

                     Frame var11 = (Frame)var10.field1525;
                     if (var11 == null) {
                        return null;
                     }

                     if (var10.field1526 == 2) {
                        class345.method2738(var11, 105, arg3);
                        return null;
                     }

                     return var11;
                  }
               } else {
                  var14 = 32353;
               }

               class97.method968(var14, 10L);
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2083[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2083[3] : field2083[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method1320(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -88) {
            method1322(97, -21, (byte)64);
         }

         ++field2077;
         if (class132.method1345(111, arg2)) {
            class137.method1386(class315.field4719[arg2], arg0, 0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2083[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(BILbt;)V"
   )
   public static final void method1321(byte arg0, int arg1, class395 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field2074;
         int var4 = -1;
         int var5 = 0;
         if (arg0 != -98) {
            field2068 = null;
         }

         label102: {
            if (~arg2.field5837 >= ~class51.field770) {
               if (~class51.field770 < ~arg2.field5836) {
                  class227.method2022(false, arg2, false);
                  var5 = class775.field11308;
                  var4 = class72.field1168;
                  if (!var3) {
                     break label102;
                  }
               }

               class381.method2972(arg2, -1);
               if (!var3) {
                  break label102;
               }
            }

            class704.method5135(arg0 + -15835, arg2);
         }

         class395 var10000;
         if (arg2.field6832 < 512 || arg2.field6833 < 512 || ~arg2.field6832 <= ~(class234.field3626 * 512 + -512) || arg2.field6833 >= (class209.field2989 - 1) * 512) {
            arg2.field5831.method2207(-1, (byte)-112);
            int var6 = 0;
            if (var3) {
               arg2.field5844[var6].field2248 = -1;
               arg2.field5844[var6].field2247.method2207(-1, (byte)-116);
               ++var6;
            }

            while(true) {
               if (~var6 <= ~arg2.field5844.length) {
                  arg2.field5837 = 0;
                  arg2.field5836 = 0;
                  arg2.field5816 = null;
                  var5 = 0;
                  var4 = -1;
                  arg2.field6832 = arg2.field5861[0] * 512 - -(256 * arg2.method1507(arg0 ^ 66));
                  arg2.field6833 = arg2.field5865[0] * 512 + arg2.method1507(-78) * 256;
                  var10000 = arg2;
                  if (!var3) {
                     arg2.method3080(0);
                     break;
                  }
               } else {
                  arg2.field5844[var6].field2248 = -1;
                  var10000 = arg2;
               }

               var10000.field5844[var6].field2247.method2207(-1, (byte)-116);
               ++var6;
            }
         }

         if (class117.field1849 == arg2 && (~arg2.field6832 > -6145 || ~arg2.field6833 > -6145 || (class234.field3626 + -12) * 512 <= arg2.field6832 || class209.field2989 * 512 + -6144 <= arg2.field6833)) {
            arg2.field5831.method2207(-1, (byte)-123);
            int var7 = 0;
            if (var3) {
               arg2.field5844[var7].field2248 = -1;
               arg2.field5844[var7].field2247.method2207(-1, (byte)-114);
               ++var7;
            }

            while(true) {
               if (~var7 <= ~arg2.field5844.length) {
                  arg2.field5837 = 0;
                  arg2.field5836 = 0;
                  var4 = -1;
                  var5 = 0;
                  arg2.field5816 = null;
                  arg2.field6832 = arg2.field5861[0] * 512 - -(arg2.method1507(-110) * 256);
                  arg2.field6833 = arg2.field5865[0] * 512 - -(256 * arg2.method1507(-79));
                  var10000 = arg2;
                  if (!var3) {
                     arg2.method3080(0);
                     break;
                  }
               } else {
                  arg2.field5844[var7].field2248 = -1;
                  var10000 = arg2;
               }

               var10000.field5844[var7].field2247.method2207(-1, (byte)-114);
               ++var7;
            }
         }

         int var8 = class15.method126(0, arg2);
         class537.method4006(arg2, (byte)-112);
         class431.method3362(10817, arg2, var4, var5, var8);
         class631.method4624(var4, arg2, (byte)127);
         class39.method435(arg2, -120);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2083[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2083[3] : field2083[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method1322(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 <= 111) {
            return true;
         } else {
            ++field2061;
            return (arg1 & 33) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2083[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
