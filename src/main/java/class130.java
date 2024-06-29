import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class130 {
   @OriginalMember(
      owner = "client!jd",
      name = "w",
      descriptor = "I"
   )
   public int field2101 = -1;
   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "I"
   )
   private int field2107 = 0;
   @OriginalMember(
      owner = "client!jd",
      name = "p",
      descriptor = "I"
   )
   private int field2105 = 0;
   @OriginalMember(
      owner = "client!jd",
      name = "n",
      descriptor = "B"
   )
   public byte field2104 = 0;
   @OriginalMember(
      owner = "client!jd",
      name = "B",
      descriptor = "I"
   )
   private int field2108 = -1;
   @OriginalMember(
      owner = "client!jd",
      name = "e",
      descriptor = "I"
   )
   private int field2110 = 128;
   @OriginalMember(
      owner = "client!jd",
      name = "x",
      descriptor = "I"
   )
   private int field2109 = 128;
   @OriginalMember(
      owner = "client!jd",
      name = "h",
      descriptor = "Z"
   )
   public boolean field2106 = false;
   @OriginalMember(
      owner = "client!jd",
      name = "c",
      descriptor = "I"
   )
   private int field2111 = 0;
   @OriginalMember(
      owner = "client!jd",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2112 = new String[]{method1335(method1334("|gN\rq")), method1335(method1334("m-Ng$")), method1335(method1334("i<\fO")), method1335(method1334("m-Nk$")), method1335(method1334("m-Nj$")), method1335(method1334("m-Nf$")), method1335(method1334("m-Na$")), method1335(method1334("m-Nd$")), method1335(method1334("m-N`$")), method1335(method1334("m-Nb$")), method1335(method1334("m-Ne$"))};
   @OriginalMember(
      owner = "client!jd",
      name = "s",
      descriptor = "I"
   )
   public static int field2086;
   @OriginalMember(
      owner = "client!jd",
      name = "v",
      descriptor = "I"
   )
   public static int field2087;
   @OriginalMember(
      owner = "client!jd",
      name = "t",
      descriptor = "I"
   )
   public static int field2090;
   @OriginalMember(
      owner = "client!jd",
      name = "y",
      descriptor = "I"
   )
   public int field2091;
   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "I"
   )
   public static int field2092;
   @OriginalMember(
      owner = "client!jd",
      name = "u",
      descriptor = "I"
   )
   public static int field2094;
   @OriginalMember(
      owner = "client!jd",
      name = "j",
      descriptor = "I"
   )
   public static int field2095;
   @OriginalMember(
      owner = "client!jd",
      name = "l",
      descriptor = "I"
   )
   public static int field2097;
   @OriginalMember(
      owner = "client!jd",
      name = "g",
      descriptor = "I"
   )
   public static int field2098;
   @OriginalMember(
      owner = "client!jd",
      name = "q",
      descriptor = "I"
   )
   private int field2102;
   @OriginalMember(
      owner = "client!jd",
      name = "d",
      descriptor = "I"
   )
   public static int field2103;
   @OriginalMember(
      owner = "client!jd",
      name = "m",
      descriptor = "Lmda;"
   )
   public class413 field2093;
   @OriginalMember(
      owner = "client!jd",
      name = "i",
      descriptor = "Lhk;"
   )
   public static class638 field2085;
   @OriginalMember(
      owner = "client!jd",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field2099;
   @OriginalMember(
      owner = "client!jd",
      name = "r",
      descriptor = "[Lip;"
   )
   public static class662[] field2084;
   @OriginalMember(
      owner = "client!jd",
      name = "k",
      descriptor = "[S"
   )
   private short[] field2088;
   @OriginalMember(
      owner = "client!jd",
      name = "f",
      descriptor = "[S"
   )
   private short[] field2089;
   @OriginalMember(
      owner = "client!jd",
      name = "A",
      descriptor = "[S"
   )
   private short[] field2096;
   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "[S"
   )
   private short[] field2100;

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method1325(byte arg0, int arg1) {
      try {
         if (arg0 != 3) {
            field2084 = null;
         }

         ++field2103;
         return ~arg1 != -2 && ~arg1 != -8;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2112[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1326(byte arg0) {
      try {
         field2085 = null;
         if (arg0 == 4) {
            field2084 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2112[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public static final void method1327(boolean arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            --class748.field10641;
            if (~class748.field10641 == -1) {
               class744.field10589 = null;
            }
         }

         if (arg0) {
            --class405.field5957;
            if (~class405.field5957 == -1) {
               class584.field8198 = null;
            }
         }

         ++field2087;
         int var3 = 45 / ((44 - arg2) / 37);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2112[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(Laka;IIBLha;)Lka;"
   )
   public final class761 method1328(class258 arg0, int arg1, int arg2, byte arg3, class17 arg4) {
      try {
         ++field2092;
         if (arg2 != 2) {
            this.field2105 = 79;
         }

         return this.method1329(arg0, 128, (class751)null, (class751)null, 0, 0, arg3, arg1, arg4, false, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2112[5] + (arg0 != null ? field2112[0] : field2112[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2112[0] : field2112[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(Laka;ILs;Ls;IIBILha;ZI)Lka;"
   )
   public final class761 method1329(class258 arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, byte arg6, int arg7, class17 arg8, boolean arg9, int arg10) {
      boolean var12 = client.field10022;

      try {
         ++field2095;
         boolean var26 = arg9 & this.field2104 != 0;
         int var13 = arg7;
         if (arg0 != null) {
            var13 = arg7 | arg0.method2197(-522362736);
         }

         if (var26) {
            var13 |= ~this.field2104 == -4 ? 7 : 2;
         }

         if (~this.field2110 != -129) {
            var13 |= 2;
         }

         if (this.field2109 != 128 || this.field2107 != 0) {
            var13 |= 5;
         }

         class107 var14 = this.field2093.field6062;
         class761 var15;
         synchronized(this.field2093.field6062) {
            var15 = (class761)this.field2093.field6062.method1041((long)(this.field2091 |= arg8.field241 << 29), 8);
         }

         if (var15 == null || ~arg8.method214(var15.method775(), var13) != -1) {
            if (var15 != null) {
               var13 = arg8.method246(var13, var15.method775());
            }

            int var16 = var13;
            if (this.field2096 != null) {
               var16 = var13 | 16384;
            }

            if (this.field2100 != null) {
               var16 |= 32768;
            }

            class590 var17 = class362.method2845(this.field2093.field6052, this.field2102, 0, (byte)-125);
            if (var17 == null) {
               return null;
            }

            if (~var17.field8349 > -14) {
               var17.method4343(2, arg1 ^ 130);
            }

            var15 = arg8.method240(var17, var16, this.field2093.field6065, this.field2105 + 64, this.field2111 + 850);
            if (this.field2096 != null) {
               int var18 = 0;
               if (var12 || this.field2096.length > var18) {
                  do {
                     var15.method791(this.field2096[var18], this.field2088[var18]);
                     ++var18;
                  } while(this.field2096.length > var18);
               }
            }

            if (this.field2100 != null) {
               int var19 = 0;
               if (var12 || ~this.field2100.length < ~var19) {
                  do {
                     var15.method811(this.field2100[var19], this.field2089[var19]);
                     ++var19;
                  } while(~this.field2100.length < ~var19);
               }
            }

            var15.method798(var13);
            class107 var20 = this.field2093.field6062;
            synchronized(this.field2093.field6062) {
               this.field2093.field6062.method1050(-86, var15, (long)(this.field2091 |= arg8.field241 << 29));
            }
         }

         class761 var21 = var15.method755(arg6, var13, true);
         if (arg0 != null) {
            arg0.method2211(var21, 0, (byte)109);
         }

         if (this.field2109 != arg1 || ~this.field2110 != -129) {
            var21.method747(this.field2109, this.field2110, this.field2109);
         }

         if (this.field2107 != 0) {
            if (~this.field2107 == -91) {
               var21.method809(4096);
            }

            if (~this.field2107 == -181) {
               var21.method809(8192);
            }

            if (~this.field2107 == -271) {
               var21.method809(12288);
            }
         }

         if (var26) {
            var21.method770(this.field2104, this.field2108, arg3, arg2, arg5, arg10, arg4);
         }

         var21.method798(arg7);
         return var21;
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field2112[8] + (arg0 != null ? field2112[0] : field2112[2]) + ',' + arg1 + ',' + (arg2 != null ? field2112[0] : field2112[2]) + ',' + (arg3 != null ? field2112[0] : field2112[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field2112[0] : field2112[2]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1330(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg0 & 3;
         ++field2090;
         if (arg3 != -14411) {
            field2099 = true;
         }

         if (~var6 == -1) {
            return arg1;
         } else if (~var6 == -2) {
            return -arg2 + 4095;
         } else {
            return var6 == 2 ? -arg1 + 4095 : arg2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2112[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "(BLcu;)Ljava/lang/String;"
   )
   public static final String method1331(byte arg0, class65 arg1) {
      try {
         ++field2094;
         if (arg0 != -6) {
            method1327(true, false, -94);
         }

         return class263.method2253((byte)3, arg1, 32767);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2112[1] + arg0 + ',' + (arg1 != null ? field2112[0] : field2112[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(BLcu;)V"
   )
   public final void method1332(byte arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field2097;

         while(true) {
            int var4 = arg1.method665(false);
            if (var4 != 0) {
               this.method1333(var4, arg1, (byte)91);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != -118) {
               this.field2106 = true;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2112[3] + arg0 + ',' + (arg1 != null ? field2112[0] : field2112[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(ILcu;B)V"
   )
   private final void method1333(int arg0, class65 arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label200: {
            if (arg0 == 1) {
               this.field2102 = arg1.method685(-2);
               if (!var4) {
                  break label200;
               }
            }

            if (~arg0 != -3) {
               if (~arg0 != -5) {
                  if (arg0 != 5) {
                     if (arg0 == 6) {
                        this.field2107 = arg1.method685(-2);
                        if (!var4) {
                           break label200;
                        }
                     }

                     if (~arg0 != -8) {
                        if (~arg0 != -9) {
                           if (arg0 == 9) {
                              this.field2108 = 8224;
                              this.field2104 = 3;
                              if (!var4) {
                                 break label200;
                              }
                           }

                           if (arg0 != 10) {
                              if (arg0 != 11) {
                                 if (arg0 == 12) {
                                    this.field2104 = 4;
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (arg0 == 13) {
                                    this.field2104 = 5;
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (~arg0 == -15) {
                                    this.field2104 = 2;
                                    this.field2108 = arg1.method665(false) * 256;
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (~arg0 != -16) {
                                    if (~arg0 == -17) {
                                       this.field2104 = 3;
                                       this.field2108 = arg1.method701(255);
                                       if (!var4) {
                                          break label200;
                                       }
                                    }

                                    if (arg0 != 40) {
                                       if (~arg0 != -42) {
                                          break label200;
                                       }

                                       int var5 = arg1.method665(false);
                                       this.field2089 = new short[var5];
                                       this.field2100 = new short[var5];
                                       int var6 = 0;
                                       if (var4) {
                                          this.field2100[var6] = (short)arg1.method685(-2);
                                          this.field2089[var6] = (short)arg1.method685(-2);
                                          ++var6;
                                       }

                                       while(true) {
                                          while(var5 > var6) {
                                             this.field2100[var6] = (short)arg1.method685(-2);
                                             this.field2089[var6] = (short)arg1.method685(-2);
                                             ++var6;
                                          }

                                          if (!var4) {
                                             if (!var4) {
                                                break label200;
                                             }
                                             break;
                                          }

                                          ++var6;
                                       }
                                    }

                                    int var7 = arg1.method665(false);
                                    this.field2096 = new short[var7];
                                    this.field2088 = new short[var7];
                                    int var8 = 0;
                                    if (var4) {
                                       this.field2096[var8] = (short)arg1.method685(-2);
                                       this.field2088[var8] = (short)arg1.method685(-2);
                                       ++var8;
                                    }

                                    while(true) {
                                       while(~var7 < ~var8) {
                                          this.field2096[var8] = (short)arg1.method685(-2);
                                          this.field2088[var8] = (short)arg1.method685(-2);
                                          ++var8;
                                       }

                                       if (!var4) {
                                          if (!var4) {
                                             break label200;
                                          }
                                          break;
                                       }

                                       ++var8;
                                    }
                                 }

                                 this.field2104 = 3;
                                 this.field2108 = arg1.method685(-2);
                                 if (!var4) {
                                    break label200;
                                 }
                              }

                              this.field2104 = 1;
                              if (!var4) {
                                 break label200;
                              }
                           }

                           this.field2106 = true;
                           if (!var4) {
                              break label200;
                           }
                        }

                        this.field2111 = arg1.method665(false);
                        if (!var4) {
                           break label200;
                        }
                     }

                     this.field2105 = arg1.method665(false);
                     if (!var4) {
                        break label200;
                     }
                  }

                  this.field2110 = arg1.method685(-2);
                  if (!var4) {
                     break label200;
                  }
               }

               this.field2109 = arg1.method685(-2);
               if (!var4) {
                  break label200;
               }
            }

            this.field2101 = arg1.method685(-2);
         }

         ++field2086;
         if (arg2 < 24) {
            field2085 = null;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2112[10] + arg0 + ',' + (arg1 != null ? field2112[0] : field2112[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
