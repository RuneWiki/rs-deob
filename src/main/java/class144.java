import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class144 extends class70 {
   @OriginalMember(
      owner = "client!tt",
      name = "O",
      descriptor = "I"
   )
   private int field2037 = 409;
   @OriginalMember(
      owner = "client!tt",
      name = "S",
      descriptor = "I"
   )
   private int field2041 = 2048;
   @OriginalMember(
      owner = "client!tt",
      name = "U",
      descriptor = "I"
   )
   private int field2049 = 0;
   @OriginalMember(
      owner = "client!tt",
      name = "Q",
      descriptor = "I"
   )
   private int field2044 = 1024;
   @OriginalMember(
      owner = "client!tt",
      name = "M",
      descriptor = "I"
   )
   private int field2050 = 1024;
   @OriginalMember(
      owner = "client!tt",
      name = "N",
      descriptor = "I"
   )
   private int field2039 = 0;
   @OriginalMember(
      owner = "client!tt",
      name = "K",
      descriptor = "I"
   )
   private int field2036 = 1024;
   @OriginalMember(
      owner = "client!tt",
      name = "L",
      descriptor = "I"
   )
   private int field2053 = 819;
   @OriginalMember(
      owner = "client!tt",
      name = "R",
      descriptor = "I"
   )
   private int field2056 = 1024;
   @OriginalMember(
      owner = "client!tt",
      name = "ab",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2057 = new String[]{method1310(method1309("xD#r3")), method1310(method1309("xD#p3")), method1310(method1309("xD#q3")), method1310(method1309("bEa_")), method1310(method1309("xD#{3")), method1310(method1309("w\u001e#\u001df")), method1310(method1309("xD#z3")), method1310(method1309("xD#t3")), method1310(method1309("xD#w3")), method1310(method1309("xD#u3")), method1310(method1309("xD#v3"))};
   @OriginalMember(
      owner = "client!tt",
      name = "H",
      descriptor = "Lnaa;"
   )
   public static class113 field2052 = new class113(14, -1);
   @OriginalMember(
      owner = "client!tt",
      name = "G",
      descriptor = "Luk;"
   )
   public static class498 field2055 = new class498(66, -1);
   @OriginalMember(
      owner = "client!tt",
      name = "V",
      descriptor = "I"
   )
   public static int field2038;
   @OriginalMember(
      owner = "client!tt",
      name = "Y",
      descriptor = "I"
   )
   public static int field2040;
   @OriginalMember(
      owner = "client!tt",
      name = "F",
      descriptor = "I"
   )
   private int field2042;
   @OriginalMember(
      owner = "client!tt",
      name = "T",
      descriptor = "I"
   )
   public static int field2043;
   @OriginalMember(
      owner = "client!tt",
      name = "P",
      descriptor = "I"
   )
   public static int field2045;
   @OriginalMember(
      owner = "client!tt",
      name = "I",
      descriptor = "I"
   )
   public static int field2046;
   @OriginalMember(
      owner = "client!tt",
      name = "J",
      descriptor = "I"
   )
   public static int field2047;
   @OriginalMember(
      owner = "client!tt",
      name = "X",
      descriptor = "I"
   )
   public static int field2048;
   @OriginalMember(
      owner = "client!tt",
      name = "W",
      descriptor = "I"
   )
   public static int field2051;
   @OriginalMember(
      owner = "client!tt",
      name = "Z",
      descriptor = "I"
   )
   public static int field2054;

   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method1303(byte arg0) {
      try {
         class727.field10854 = -1;
         class654.field9782 = "";
         ++field2040;
         if (arg0 <= 75) {
            field2055 = null;
         }

         class656.field9800 = 0L;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2057[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "(III)Z",
      line = 16
   )
   public static final boolean method1304(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 50560) {
            field2055 = null;
         }

         ++field2046;
         return ~(50560 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2057[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(IILica;)V",
      line = 27
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label100: {
            label99: {
               label98: {
                  label97: {
                     label96: {
                        label95: {
                           label94: {
                              label93: {
                                 label92: {
                                    ++field2038;
                                    if (~arg1 != -1) {
                                       if (~arg1 == -2) {
                                          break label92;
                                       }

                                       if (~arg1 == -3) {
                                          break label93;
                                       }

                                       if (arg1 == 3) {
                                          break label94;
                                       }

                                       if (~arg1 == -5) {
                                          break label95;
                                       }

                                       if (~arg1 == -6) {
                                          break label96;
                                       }

                                       if (~arg1 == -7) {
                                          break label97;
                                       }

                                       if (arg1 == 7) {
                                          break label98;
                                       }

                                       if (arg1 != 8) {
                                          break label100;
                                       }

                                       if (!var4) {
                                          break label99;
                                       }
                                    }

                                    this.field2049 = arg2.method2855(-31007);
                                    if (!var4) {
                                       break label100;
                                    }
                                 }

                                 this.field2056 = arg2.method2848(-124);
                                 if (!var4) {
                                    break label100;
                                 }
                              }

                              this.field2041 = arg2.method2848(-100);
                              if (!var4) {
                                 break label100;
                              }
                           }

                           this.field2037 = arg2.method2848(arg0 + -103);
                           if (!var4) {
                              break label100;
                           }
                        }

                        this.field2053 = arg2.method2848(-122);
                        if (!var4) {
                           break label100;
                        }
                     }

                     this.field2044 = arg2.method2848(-100);
                     if (!var4) {
                        break label100;
                     }
                  }

                  this.field2039 = arg2.method2855(-31007);
                  if (!var4) {
                     break label100;
                  }
               }

               this.field2050 = arg2.method2848(-92);
               if (!var4) {
                  break label100;
               }
            }

            this.field2036 = arg2.method2848(-119);
         }

         if (arg0 != -1) {
            this.field2044 = -75;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2057[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2057[5] : field2057[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "h",
      descriptor = "(I)V",
      line = 124
   )
   public static final void method1305(int arg0) {
      try {
         class659.field9850.method679(1.1523438F * (0.1F * (float)class687.field10213.field508.method4962(480102311) + 0.7F));
         ++field2054;
         if (arg0 != -30608) {
            field2052 = null;
         }

         class659.field9850.method656(class589.field8679, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         class659.field9850.method627(class582.field8595, -1, 0);
         class659.field9850.method667(class185.field2897);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2057[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "<init>",
      descriptor = "()V",
      line = 138
   )
   public class144() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(IIIIBLjava/util/Random;[[I)V",
      line = 142
   )
   private final void method1306(int param1, int param2, int param3, int param4, byte param5, Random param6, int[][] param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(Z)V",
      line = 338
   )
   public final void method275(boolean arg0) {
      try {
         if (!arg0) {
            ++field2051;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2057[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(BLoo;[[B)V",
      line = 354
   )
   public static final void method1307(byte arg0, class508 arg1, byte[][] arg2) {
      boolean var3 = client.field1786;

      try {
         ++field2045;
         int var4 = class332.field5034.length;
         int var5 = 0;
         int var9;
         if (!var3 && ~var4 >= ~var5) {
            var9 = 85 % ((arg0 - 23) / 42);
         } else {
            do {
               byte[] var6 = arg2[var5];
               if (var6 != null) {
                  int var7 = (class62.field796[var5] >> 8) * 64 + -class120.field1694;
                  int var8 = (class62.field796[var5] & 255) * 64 + -class119.field1606;
                  class532.method4095(-127);
                  arg1.method3944(var6, class351.field5356, class221.field3326, (byte)53, var7, var8);
               }

               ++var5;
            } while(~var4 < ~var5);

            var9 = 85 % ((arg0 - 23) / 42);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2057[10] + arg0 + ',' + (arg1 != null ? field2057[5] : field2057[3]) + ',' + (arg2 != null ? field2057[5] : field2057[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "g",
      descriptor = "(I)V",
      line = 387
   )
   public static void method1308(int arg0) {
      try {
         field2055 = null;
         if (arg0 == -24395) {
            field2052 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2057[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(BI)[I",
      line = 408
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 87) {
            return null;
         } else {
            ++field2043;
            int[] var4 = super.field923.method3718(arg0 ^ -87, arg1);
            if (super.field923.field7284) {
               int[][] var5 = super.field923.method3719((byte)73);
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               int var9 = 0;
               int var10 = 0;
               boolean var11 = true;
               byte var12 = 1;
               int var13 = 0;
               int var14 = 0;
               int var15 = class678.field10127 * this.field2056 >> 12;
               int var16 = class678.field10127 * this.field2041 >> 12;
               int var17 = class304.field4744 * this.field2037 >> 12;
               int var18 = class304.field4744 * this.field2053 >> 12;
               if (~var18 >= -2) {
                  return var5[arg1];
               }

               this.field2042 = class678.field10127 / 8 * this.field2044 >> 12;
               int var19 = class678.field10127 / var15 + 1;
               int[][] var20 = new int[var19][3];
               int[][] var21 = new int[var19][3];
               Random var22 = new Random((long)this.field2049);

               do {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  label173:
                  do {
                     label185: {
                        int var10000;
                        label92: {
                           var23 = var15 - -class784.method5696((byte)25, -var15 + var16, var22);
                           var24 = var17 - -class784.method5696((byte)25, -var17 + var18, var22);
                           var25 = var9 - -var23;
                           if (class678.field10127 < var25) {
                              var25 = class678.field10127;
                              var10000 = class678.field10127 - var9;
                              if (var3) {
                                 break label92;
                              }

                              var23 = var10000;
                           }

                           var10000 = var12;
                        }

                        if (var10000 != 0) {
                           var26 = 0;
                           if (!var3) {
                              break label185;
                           }
                        }

                        int var27 = var10;
                        int[] var28 = var21[var10];
                        int var29 = 0;
                        int var30 = var6 + var25;
                        if (~var30 > -1) {
                           var30 += class678.field10127;
                        }

                        if (var30 > class678.field10127) {
                           var30 -= class678.field10127;
                        }

                        do {
                           int var10001;
                           label145: {
                              int[] var31 = var21[var27];
                              if (var30 >= var31[0]) {
                                 var10000 = ~var31[1];
                                 var10001 = ~var30;
                                 if (var3) {
                                    break label145;
                                 }

                                 if (var10000 <= var10001) {
                                    break;
                                 }
                              }

                              var10000 = ~var13;
                              ++var27;
                              var10001 = ~var27;
                           }

                           if (var10000 >= var10001) {
                              var27 = 0;
                           }

                           ++var29;
                        } while(!var3);

                        var26 = var28[2];
                        if (var10 != var27) {
                           int var32 = var6 + var9;
                           if (~var32 > -1) {
                              var32 += class678.field10127;
                           }

                           if (~class678.field10127 > ~var32) {
                              var32 -= class678.field10127;
                           }

                           int var33 = 1;
                           if (var3 || var33 <= var29) {
                              do {
                                 int[] var34 = var21[(var10 + var33) % var13];
                                 var26 = Math.max(var26, var34[2]);
                                 ++var33;
                              } while(var33 <= var29);
                           }

                           int var35 = 0;
                           if (var3 || ~var35 >= ~var29) {
                              do {
                                 int[] var36 = var21[(var10 + var35) % var13];
                                 int var37 = var36[2];
                                 if (~var26 == ~var37) {
                                    ++var35;
                                 } else {
                                    int var38 = var36[0];
                                    int var39 = var36[1];
                                    int var40;
                                    int var41;
                                    if (~var30 >= ~var32) {
                                       label115: {
                                          if (~var38 == -1) {
                                             var40 = Math.min(var30, var39);
                                             var41 = 0;
                                             if (!var3) {
                                                break label115;
                                             }
                                          }

                                          var41 = Math.max(var32, var38);
                                          var40 = class678.field10127;
                                          if (var3) {
                                             var41 = Math.max(var32, var38);
                                             var40 = Math.min(var30, var39);
                                          }
                                       }
                                    } else {
                                       var41 = Math.max(var32, var38);
                                       var40 = Math.min(var30, var39);
                                    }

                                    this.method1306(var37, -var37 + var26, -var41 + var40, var8 + var41, (byte)-78, var22, var5);
                                    ++var35;
                                 }
                              } while(~var35 >= ~var29);
                           }
                        }

                        var10 = var27;
                     }

                     label153: {
                        if (var24 + var26 <= class304.field4744) {
                           var11 = false;
                           if (!var3) {
                              break label153;
                           }
                        }

                        var24 = -var26 + class304.field4744;
                     }

                     if (class678.field10127 != var25) {
                        break;
                     }

                     this.method1306(var26, var24, var23, var7 + var9, (byte)-78, var22, var5);
                     if (var11) {
                        return var4;
                     }

                     var11 = true;
                     int[] var42 = var20[var14++];
                     var42[1] = var25;
                     var42[0] = var9;
                     var42[2] = var26 - -var24;
                     int[][] var43 = var21;
                     var21 = var20;
                     var13 = var14;
                     var20 = var43;
                     var14 = 0;
                     var8 = var7;
                     var7 = class784.method5696((byte)25, class678.field10127, var22);
                     var9 = 0;
                     var6 = -var8 + var7;
                     int var44 = var6;
                     if (var6 < 0) {
                        var44 = class678.field10127 + var6;
                     }

                     if (~var44 < ~class678.field10127) {
                        var44 -= class678.field10127;
                     }

                     var10 = 0;
                     var12 = 0;

                     while(true) {
                        int[] var45 = var21[var10];
                        if (var44 >= var45[0] && var45[1] >= var44) {
                           break;
                        }

                        ++var10;

                        while(var10 >= var13) {
                           var10 = 0;
                           if (!var3) {
                              if (var3) {
                                 continue label173;
                              }
                              break;
                           }
                        }
                     }
                  } while(!var3);

                  int[] var46 = var20[var14++];
                  var46[2] = var26 - -var24;
                  var46[1] = var25;
                  var46[0] = var9;
                  this.method1306(var26, var24, var23, var7 + var9, (byte)-78, var22, var5);
                  var9 = var25;
               } while(!var3);
            }

            return var4;
         }
      } catch (RuntimeException var48) {
         throw class482.method3757(var48, field2057[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1309(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1310(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
