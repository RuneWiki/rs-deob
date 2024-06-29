import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class14 extends class757 {
   @OriginalMember(
      owner = "client!raa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field207 = new String[]{method122(method121("\u0010w@/QJ")), method122(method121("\u0010w@/TJ")), method122(method121("\u0010w@/PJ")), method122(method121("\u0010w@/SJ")), method122(method121("Mf\u001c")), method122(method121("Ny")), method122(method121("\u00198\u000f/k")), method122(method121("=eDmp")), method122(method121("M|")), method122(method121("Mw\u001c")), method122(method121("\fcMm")), method122(method121("Nw\u0013")), method122(method121("Mz\u001c")), method122(method121("\nbUq,M9")), method122(method121("\u0010w@/RJ")), method122(method121("\u0010w@/WJ")), method122(method121("\u0010w@/UJ"))};
   @OriginalMember(
      owner = "client!raa",
      name = "J",
      descriptor = "I"
   )
   public static int field198 = 1;
   @OriginalMember(
      owner = "client!raa",
      name = "H",
      descriptor = "Lfm;"
   )
   public static class164 field200 = new class164(75, 18);
   @OriginalMember(
      owner = "client!raa",
      name = "I",
      descriptor = "I"
   )
   public static int field199;
   @OriginalMember(
      owner = "client!raa",
      name = "E",
      descriptor = "I"
   )
   public static int field201;
   @OriginalMember(
      owner = "client!raa",
      name = "D",
      descriptor = "I"
   )
   public static int field202;
   @OriginalMember(
      owner = "client!raa",
      name = "F",
      descriptor = "I"
   )
   public static int field204;
   @OriginalMember(
      owner = "client!raa",
      name = "K",
      descriptor = "I"
   )
   public static int field205;
   @OriginalMember(
      owner = "client!raa",
      name = "A",
      descriptor = "I"
   )
   public static int field206;
   @OriginalMember(
      owner = "client!raa",
      name = "B",
      descriptor = "[Z"
   )
   public static boolean[] field203;

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method114(int arg0, int arg1, int arg2) {
      try {
         if (arg2 <= -103) {
            class517.field7313 = arg0;
            ++field201;
            class682.field9878 = arg1;
            if (~class217.field3113 != -1) {
               if (~class217.field3113 == -2) {
                  class701.field10102 = class682.field9878 / class466.field6765 + class106.field1656 + 2;
                  class590.field8352 = class517.field7313 / class502.field7168 - (-class252.field3833 + -2);
                  class690.field9938 = class590.field8352 * class502.field7168;
                  class515.field7310 = class701.field10102 * class466.field6765;
                  class7.field132 = -class682.field9878 + class515.field7310 >> 1;
                  class321.field4796 = -class517.field7313 + class690.field9938 >> 1;
                  return;
               }

               if (class217.field3113 == 2) {
                  class690.field9938 = class517.field7313;
                  class515.field7310 = class682.field9878;
                  return;
               }
            } else {
               class515.field7310 = class7.field132 * 2 + class682.field9878;
               class690.field9938 = class321.field4796 * 2 + class517.field7313;
            }

         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field207[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method115(float arg0, byte arg1) {
      try {
         super.field10818 = arg0;
         ++field202;
         if (arg1 <= 39) {
            method119(-105, -114, (String)null);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field207[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method116(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field199;
         short var2 = 1024;
         short var3 = 3072;
         if (class791.field11526) {
            if (class531.field7490) {
               var2 = 2048;
            }

            var3 = 4096;
         }

         if ((float)var2 > class604.field8615) {
            class604.field8615 = (float)var2;
         }

         if ((float)var3 < class604.field8615) {
            class604.field8615 = (float)var3;
            if (var1) {
               class86.field1312 -= 16384.0F;
            }
         }

         while(class86.field1312 >= 16384.0F) {
            class86.field1312 -= 16384.0F;
         }

         if (var1) {
            class86.field1312 += 16384.0F;
         }

         while(class86.field1312 < 0.0F) {
            class86.field1312 += 16384.0F;
         }

         int var4 = class779.field11378 >> 9;
         int var5 = class576.field8140 >> 9;
         if (arg0) {
            int var6 = class478.method3658(class128.field2049, class779.field11378, class576.field8140, (byte)-20);
            int var7 = 0;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if (~var4 < -4) {
               if (var5 > 3) {
                  if (class234.field3626 + -4 > var4) {
                     if (~var5 > ~(class209.field2989 + -4)) {
                        var8 = var4 + -4;
                        if (var1) {
                           var9 = var5 + -4;
                           if (var1) {
                              var10 = class128.field2049;
                              if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                                 var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                              }

                              if (class225.field3197 != null && class225.field3197[var10] != null) {
                                 var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                                 if (~var12 < ~var7) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        } else if (~var8 < ~(var4 + 4)) {
                           var8 = (var7 >> 2) * 1536;
                           if (!var1) {
                              if (var8 > 786432) {
                                 var8 = 786432;
                              }

                              if (var8 < 262144) {
                                 var8 = 262144;
                              }

                              if (~class290.field4343 > ~var8) {
                                 class290.field4343 += (-class290.field4343 + var8) / 24;
                                 return;
                              }

                              if (~var8 > ~class290.field4343) {
                                 class290.field4343 += (-class290.field4343 + var8) / 80;
                                 return;
                              }

                              return;
                           }

                           var9 = var8 + 786432;
                           if (var1) {
                              var10 = class128.field2049;
                              if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                                 var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                              }

                              if (class225.field3197 != null && class225.field3197[var10] != null) {
                                 var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                                 if (~var12 < ~var7) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        } else {
                           var9 = var5 + -4;
                           if (var1) {
                              var10 = class128.field2049;
                              if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                                 var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                              }

                              if (class225.field3197 != null && class225.field3197[var10] != null) {
                                 var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                                 if (~var12 < ~var7) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        }
                     } else {
                        var8 = (var7 >> 2) * 1536;
                        if (!var1) {
                           if (var8 > 786432) {
                              var8 = 786432;
                           }

                           if (var8 < 262144) {
                              var8 = 262144;
                           }

                           if (~class290.field4343 > ~var8) {
                              class290.field4343 += (-class290.field4343 + var8) / 24;
                              return;
                           }

                           if (~var8 > ~class290.field4343) {
                              class290.field4343 += (-class290.field4343 + var8) / 80;
                              return;
                           }

                           return;
                        }

                        var9 = var8 + 786432;
                        if (var1) {
                           var10 = class128.field2049;
                           if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                              var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                           }

                           if (class225.field3197 != null && class225.field3197[var10] != null) {
                              var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     if (!var1) {
                        if (var8 > 786432) {
                           var8 = 786432;
                        }

                        if (var8 < 262144) {
                           var8 = 262144;
                        }

                        if (~class290.field4343 > ~var8) {
                           class290.field4343 += (-class290.field4343 + var8) / 24;
                           return;
                        }

                        if (~var8 > ~class290.field4343) {
                           class290.field4343 += (-class290.field4343 + var8) / 80;
                           return;
                        }

                        return;
                     }

                     var9 = var8 + 786432;
                     if (var1) {
                        var10 = class128.field2049;
                        if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                           var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                        }

                        if (class225.field3197 != null && class225.field3197[var10] != null) {
                           var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }
               } else {
                  var8 = (var7 >> 2) * 1536;
                  if (!var1) {
                     if (var8 > 786432) {
                        var8 = 786432;
                     }

                     if (var8 < 262144) {
                        var8 = 262144;
                     }

                     if (~class290.field4343 > ~var8) {
                        class290.field4343 += (-class290.field4343 + var8) / 24;
                        return;
                     }

                     if (~var8 > ~class290.field4343) {
                        class290.field4343 += (-class290.field4343 + var8) / 80;
                        return;
                     }

                     return;
                  }

                  var9 = var8 + 786432;
                  if (var1) {
                     var10 = class128.field2049;
                     if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                        var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                     }

                     if (class225.field3197 != null && class225.field3197[var10] != null) {
                        var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                        if (~var12 < ~var7) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               }
            } else {
               var8 = (var7 >> 2) * 1536;
               if (!var1) {
                  if (var8 > 786432) {
                     var8 = 786432;
                  }

                  if (var8 < 262144) {
                     var8 = 262144;
                  }

                  if (~class290.field4343 > ~var8) {
                     class290.field4343 += (-class290.field4343 + var8) / 24;
                     return;
                  }

                  if (~var8 > ~class290.field4343) {
                     class290.field4343 += (-class290.field4343 + var8) / 80;
                     return;
                  }

                  return;
               }

               var9 = var8 + 786432;
               if (var1) {
                  var10 = class128.field2049;
                  if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                     var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                  }

                  if (class225.field3197 != null && class225.field3197[var10] != null) {
                     var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                     if (~var12 < ~var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            }

            while(true) {
               while(~var9 >= ~(var5 + 4)) {
                  var10 = class128.field2049;
                  if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                     var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                  }

                  if (class225.field3197 != null && class225.field3197[var10] != null) {
                     var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                     if (~var12 < ~var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }

               ++var8;
               if (~var8 < ~(var4 + 4)) {
                  var8 = (var7 >> 2) * 1536;
                  if (!var1) {
                     if (var8 > 786432) {
                        var8 = 786432;
                     }

                     if (var8 < 262144) {
                        var8 = 262144;
                     }

                     if (~class290.field4343 > ~var8) {
                        class290.field4343 += (-class290.field4343 + var8) / 24;
                        return;
                     }

                     if (~var8 > ~class290.field4343) {
                        class290.field4343 += (-class290.field4343 + var8) / 80;
                        return;
                     }

                     return;
                  }

                  var9 = var8 + 786432;
                  if (var1) {
                     var10 = class128.field2049;
                     if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                        var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                     }

                     if (class225.field3197 != null && class225.field3197[var10] != null) {
                        var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                        if (~var12 < ~var7) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               } else {
                  var9 = var5 + -4;
                  if (var1) {
                     var10 = class128.field2049;
                     if (~var10 > -4 && class172.method1598(var9, var8, 117)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class203.field2904.field1828 != null && class203.field2904.field1828[var10] != null) {
                        var11 = (255 & class203.field2904.field1828[var10][var8][var9]) * 8 << 2;
                     }

                     if (class225.field3197 != null && class225.field3197[var10] != null) {
                        var12 = var6 + var11 + -class225.field3197[var10].method5400(-1, var9, var8);
                        if (~var12 < ~var7) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field207[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method117(int arg0, int arg1) {
      try {
         ++field204;
         if (arg1 != 6407 && ~arg1 != -34844 && arg1 != 34837) {
            if (arg1 != 6408 && arg1 != 34842 && ~arg1 != -34837) {
               if (arg1 != 6406 && ~arg1 != -34845) {
                  if (~arg1 != -6410 && arg1 != 34846) {
                     if (arg0 != -18924) {
                        method117(115, 76);
                     }

                     if (arg1 != 6410 && ~arg1 != -34848) {
                        if (~arg1 == -6403) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field207[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method118(int arg0) {
      try {
         if (arg0 != 2) {
            method116(true);
         }

         field203 = null;
         field200 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field207[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IILjava/lang/String;)Z"
   )
   public static final boolean method119(int arg0, int arg1, String arg2) {
      boolean var3 = client.field10022;

      try {
         ++field205;
         if (arg1 != 6410) {
            field203 = null;
         }

         if (class720.field10318.field1275) {
            class750.field10662 = new class142();
            class750.field10662.field2262 = arg0;
            class750.field10662.field2258 = arg2;
            if (class479.field6892 != class160.field2451) {
               class750.field10662.field2260 = class750.field10662.field2262 + 40000;
               class750.field10662.field2264 = class750.field10662.field2262 + 50000;
            }

            int var4 = 0;
            if (var3) {
               if (~class616.field8759[var4].field9023 == ~arg0) {
                  class647.field9107 = class616.field8759[var4].field11518;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~var4 <= ~class616.field8759.length) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = ~class616.field8759[var4].field9023;
               }

               if (var10000 == ~arg0) {
                  class647.field9107 = class616.field8759[var4].field11518;
               }

               ++var4;
            }
         } else {
            String var5 = "";
            if (class479.field6892 != class160.field2451) {
               var5 = ":" + (arg0 + 7000);
            }

            String var6 = "";
            if (class432.field6350 != null) {
               var6 = field207[4] + class432.field6350;
            }

            String var7 = field207[13] + arg2 + var5 + field207[12] + class777.field11340 + field207[9] + class302.field4544 + var6 + field207[8] + (!class202.field2887 ? "0" : "1") + field207[5] + (!class116.field1838 ? "0" : "1") + field207[11];

            try {
               class183.field2683.getAppletContext().showDocument(new URL(var7), field207[7]);
               return true;
            } catch (Exception var9) {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field207[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field207[6] : field207[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method120(int arg0, int arg1, int arg2, int arg3) {
      try {
         super.field10822 = arg1;
         super.field10820 = arg2;
         int var5 = -103 % ((17 - arg3) / 49);
         super.field10819 = arg0;
         ++field206;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field207[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class14(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method121(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method122(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
