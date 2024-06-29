import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class618 {
   @OriginalMember(
      owner = "client!of",
      name = "f",
      descriptor = "I"
   )
   public int field8974 = -1;
   @OriginalMember(
      owner = "client!of",
      name = "h",
      descriptor = "Z"
   )
   public boolean field8986 = false;
   @OriginalMember(
      owner = "client!of",
      name = "g",
      descriptor = "B"
   )
   public byte field8980 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "i",
      descriptor = "I"
   )
   private int field8977 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "n",
      descriptor = "I"
   )
   private int field8992 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "m",
      descriptor = "I"
   )
   private int field8990 = 128;
   @OriginalMember(
      owner = "client!of",
      name = "B",
      descriptor = "I"
   )
   private int field8995 = 128;
   @OriginalMember(
      owner = "client!of",
      name = "w",
      descriptor = "I"
   )
   private int field8994 = -1;
   @OriginalMember(
      owner = "client!of",
      name = "r",
      descriptor = "I"
   )
   private int field8996 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8998 = new String[]{method4554(method4553("\u000b\"Z\u000bD")), method4554(method4553("\u001fjZc\u0011")), method4554(method4553("\u000b\"Z\u000fD")), method4554(method4553("\n1\u0018!")), method4554(method4553("\u000b\"Z\u000eD")), method4554(method4553("\u000b\"Z\fD")), method4554(method4553("\u000b\"Z\u0005D")), method4554(method4553("\u000b\"Z\tD")), method4554(method4553("\u000b\"Z\bD")), method4554(method4553("\u000b\"Z\nD"))};
   @OriginalMember(
      owner = "client!of",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field8978 = true;
   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "I"
   )
   public static int field8988 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field8976 = new int[13];
   @OriginalMember(
      owner = "client!of",
      name = "v",
      descriptor = "I"
   )
   public static int field8971;
   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "I"
   )
   public static int field8972;
   @OriginalMember(
      owner = "client!of",
      name = "c",
      descriptor = "I"
   )
   public static int field8973;
   @OriginalMember(
      owner = "client!of",
      name = "l",
      descriptor = "I"
   )
   public static int field8975;
   @OriginalMember(
      owner = "client!of",
      name = "t",
      descriptor = "I"
   )
   public static int field8979;
   @OriginalMember(
      owner = "client!of",
      name = "u",
      descriptor = "I"
   )
   public int field8981;
   @OriginalMember(
      owner = "client!of",
      name = "e",
      descriptor = "I"
   )
   public static int field8982;
   @OriginalMember(
      owner = "client!of",
      name = "p",
      descriptor = "I"
   )
   private int field8985;
   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "I"
   )
   public static int field8991;
   @OriginalMember(
      owner = "client!of",
      name = "s",
      descriptor = "I"
   )
   public static int field8993;
   @OriginalMember(
      owner = "client!of",
      name = "j",
      descriptor = "Lqc;"
   )
   public class181 field8989;
   @OriginalMember(
      owner = "client!of",
      name = "k",
      descriptor = "[S"
   )
   private short[] field8983;
   @OriginalMember(
      owner = "client!of",
      name = "o",
      descriptor = "[S"
   )
   private short[] field8984;
   @OriginalMember(
      owner = "client!of",
      name = "q",
      descriptor = "[S"
   )
   private short[] field8987;
   @OriginalMember(
      owner = "client!of",
      name = "y",
      descriptor = "[S"
   )
   private short[] field8997;

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Lfq;B)V"
   )
   public static final void method4545(class374 arg0, byte arg1) {
      try {
         ++field8973;
         class374 var2 = class667.method4923(arg0, 83);
         if (arg1 != 62) {
            method4551(63);
         }

         int var3;
         int var4;
         label25: {
            if (var2 != null) {
               var3 = var2.field5915;
               var4 = var2.field5849;
               if (!client.field1786) {
                  break label25;
               }
            }

            var4 = class316.field4878;
            var3 = class692.field10301;
         }

         class718.method5315(var3, var4, false, arg0, 6227);
         class531.method4074(arg0, var3, var4, (byte)127);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8998[6] + (arg0 != null ? field8998[1] : field8998[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(BZLqu;ILha;)Lka;"
   )
   public final class91 method4546(byte arg0, boolean arg1, class366 arg2, int arg3, class610 arg4) {
      try {
         ++field8982;
         return !arg1 ? null : this.method4552((class271)null, arg3, 8, false, 0, arg2, 0, arg0, (class271)null, 0, arg4);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8998[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8998[1] : field8998[3]) + ',' + arg3 + ',' + (arg4 != null ? field8998[1] : field8998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4547(int arg0, int arg1, int arg2) {
      try {
         ++field8991;
         if (arg2 != -28299) {
            method4550((class455)null, 18, true);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8998[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(ZLica;)V"
   )
   public final void method4548(boolean arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(-31007);
            if (~var4 != -1) {
               this.method4549(arg1, var4, (byte)2);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0) {
               return;
            }

            ++field8975;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8998[5] + arg0 + ',' + (arg1 != null ? field8998[1] : field8998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Lica;IB)V"
   )
   private final void method4549(class354 arg0, int arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         label200: {
            ++field8979;
            if (arg1 == 1) {
               this.field8985 = arg0.method2848(-120);
               if (!var4) {
                  break label200;
               }
            }

            if (arg1 != 2) {
               if (~arg1 != -5) {
                  if (arg1 != 5) {
                     if (~arg1 == -7) {
                        this.field8977 = arg0.method2848(-117);
                        if (!var4) {
                           break label200;
                        }
                     }

                     if (~arg1 != -8) {
                        if (arg1 != 8) {
                           if (arg1 == 9) {
                              this.field8994 = 8224;
                              this.field8980 = 3;
                              if (!var4) {
                                 break label200;
                              }
                           }

                           if (~arg1 != -11) {
                              if (arg1 == 11) {
                                 this.field8980 = 1;
                                 if (!var4) {
                                    break label200;
                                 }
                              }

                              if (arg1 == 12) {
                                 this.field8980 = 4;
                                 if (!var4) {
                                    break label200;
                                 }
                              }

                              if (~arg1 != -14) {
                                 if (~arg1 == -15) {
                                    this.field8980 = 2;
                                    this.field8994 = 256 * arg0.method2855(-31007);
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (arg1 == 15) {
                                    this.field8980 = 3;
                                    this.field8994 = arg0.method2848(arg2 + -118);
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (arg1 == 16) {
                                    this.field8980 = 3;
                                    this.field8994 = arg0.method2894(102);
                                    if (!var4) {
                                       break label200;
                                    }
                                 }

                                 if (~arg1 != -41) {
                                    if (arg1 != 41) {
                                       break label200;
                                    }

                                    int var5 = arg0.method2855(-31007);
                                    this.field8987 = new short[var5];
                                    this.field8983 = new short[var5];
                                    int var6 = 0;
                                    if (var4) {
                                       this.field8987[var6] = (short)arg0.method2848(-97);
                                       this.field8983[var6] = (short)arg0.method2848(class419.method3339(arg2, -97));
                                       ++var6;
                                    }

                                    while(true) {
                                       while(var5 > var6) {
                                          this.field8987[var6] = (short)arg0.method2848(-97);
                                          this.field8983[var6] = (short)arg0.method2848(class419.method3339(arg2, -97));
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

                                 int var7 = arg0.method2855(-31007);
                                 this.field8984 = new short[var7];
                                 this.field8997 = new short[var7];
                                 int var8 = 0;
                                 if (var4) {
                                    this.field8997[var8] = (short)arg0.method2848(-104);
                                    this.field8984[var8] = (short)arg0.method2848(-116);
                                    ++var8;
                                 }

                                 while(true) {
                                    while(~var8 > ~var7) {
                                       this.field8997[var8] = (short)arg0.method2848(-104);
                                       this.field8984[var8] = (short)arg0.method2848(-116);
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

                              this.field8980 = 5;
                              if (!var4) {
                                 break label200;
                              }
                           }

                           this.field8986 = true;
                           if (!var4) {
                              break label200;
                           }
                        }

                        this.field8996 = arg0.method2855(-31007);
                        if (!var4) {
                           break label200;
                        }
                     }

                     this.field8992 = arg0.method2855(arg2 + -31009);
                     if (!var4) {
                        break label200;
                     }
                  }

                  this.field8990 = arg0.method2848(arg2 ^ -120);
                  if (!var4) {
                     break label200;
                  }
               }

               this.field8995 = arg0.method2848(-118);
               if (!var4) {
                  break label200;
               }
            }

            this.field8974 = arg0.method2848(-96);
         }

         if (arg2 != 2) {
            this.field8996 = -72;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8998[2] + (arg0 != null ? field8998[1] : field8998[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Ljea;IZ)V"
   )
   public static final void method4550(class455 arg0, int arg1, boolean arg2) {
      boolean var3 = client.field1786;

      try {
         label118: {
            ++field8971;
            if (!arg0.field6968) {
               if (!arg0.field6958 || ~arg0.field6970 > -2 || ~arg0.field6959 > -2 || class513.field7828 - 2 < arg0.field6970 || arg0.field6959 > class475.field7230 + -2 || arg0.field6960 >= 0 && !class302.method2527(arg0.field6965, arg0.field6960, -9)) {
                  break label118;
               }

               label109: {
                  if (arg2) {
                     class59.method440(arg0.field6951, arg0.field6959, arg0.field6970, arg0.field6969, arg0.field6956, 1);
                     if (!var3) {
                        break label109;
                     }
                  }

                  class101.method980((byte)106, arg0.field6956, arg0.field6959, arg0.field6951, arg0.field6960, arg0.field6970, -1, arg0.field6952, arg0.field6965);
               }

               arg0.field6958 = false;
               if (arg2 || ~arg0.field6960 != ~arg0.field6953 || arg0.field6953 != -1) {
                  if (arg2 || arg0.field6960 != arg0.field6953 || arg0.field6962 != arg0.field6952 || arg0.field6967 != arg0.field6965) {
                     break label118;
                  }

                  arg0.method2477(1976);
                  if (!var3) {
                     break label118;
                  }
               }

               arg0.method2477(1976);
               if (!var3) {
                  break label118;
               }
            }

            if (~arg0.field6953 > -1 || class302.method2527(arg0.field6967, arg0.field6953, -9)) {
               label71: {
                  if (arg2) {
                     class59.method440(arg0.field6951, arg0.field6959, arg0.field6970, (class752)null, arg0.field6956, 1);
                     if (!var3) {
                        break label71;
                     }
                  }

                  class101.method980((byte)106, arg0.field6956, arg0.field6959, arg0.field6951, arg0.field6953, arg0.field6970, -1, arg0.field6962, arg0.field6967);
               }

               arg0.method2477(1976);
            }
         }

         if (arg1 > -7) {
            field8978 = true;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8998[8] + (arg0 != null ? field8998[1] : field8998[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4551(int arg0) {
      try {
         if (arg0 == 16310) {
            field8976 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8998[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Ls;IIZILqu;IBLs;ILha;)Lka;"
   )
   public final class91 method4552(class271 arg0, int arg1, int arg2, boolean arg3, int arg4, class366 arg5, int arg6, byte arg7, class271 arg8, int arg9, class610 arg10) {
      boolean var12 = client.field1786;

      try {
         ++field8972;
         int var13 = arg1;
         boolean var26 = arg3 & ~this.field8980 != -1;
         if (arg5 != null) {
            var13 = arg1 | arg5.method2985(52);
         }

         if (var26) {
            var13 |= this.field8980 != 3 ? 2 : 7;
         }

         if (this.field8990 != 128) {
            var13 |= 2;
         }

         if (this.field8995 != 128 || this.field8977 != 0) {
            var13 |= 5;
         }

         class304 var14 = this.field8989.field2815;
         class91 var15;
         synchronized(this.field8989.field2815) {
            var15 = (class91)this.field8989.field2815.method2544(false, (long)(this.field8981 |= arg10.field8875 << 29));
         }

         if (arg2 != 8) {
            method4547(61, 51, -21);
         }

         if (var15 == null || arg10.method690(var15.method906(), var13) != 0) {
            if (var15 != null) {
               var13 = arg10.method584(var13, var15.method906());
            }

            int var16 = var13;
            if (this.field8997 != null) {
               var16 = var13 | 16384;
            }

            if (this.field8987 != null) {
               var16 |= 32768;
            }

            class159 var17 = class489.method3795(this.field8989.field2811, this.field8985, true, 0);
            if (var17 == null) {
               return null;
            }

            if (var17.field2408 < 13) {
               var17.method1426(2, 0);
            }

            var15 = arg10.method614(var17, var16, this.field8989.field2816, this.field8992 - -64, this.field8996 + 850);
            if (this.field8997 != null) {
               int var18 = 0;
               if (var12 || this.field8997.length > var18) {
                  do {
                     var15.method901(this.field8997[var18], this.field8984[var18]);
                     ++var18;
                  } while(this.field8997.length > var18);
               }
            }

            if (this.field8987 != null) {
               int var19 = 0;
               if (var12 || var19 < this.field8987.length) {
                  do {
                     var15.method922(this.field8987[var19], this.field8983[var19]);
                     ++var19;
                  } while(var19 < this.field8987.length);
               }
            }

            var15.method923(var13);
            class304 var20 = this.field8989.field2815;
            synchronized(this.field8989.field2815) {
               this.field8989.field2815.method2545((long)(this.field8981 |= arg10.field8875 << 29), 123, var15);
            }
         }

         class91 var21 = var15.method868(arg7, var13, true);
         if (arg5 != null) {
            arg5.method2982((byte)-120, 0, var21);
         }

         if (this.field8995 != 128 || this.field8990 != 128) {
            var21.method872(this.field8995, this.field8990, this.field8995);
         }

         if (~this.field8977 != -1) {
            if (~this.field8977 == -91) {
               var21.method888(4096);
            }

            if (this.field8977 == 180) {
               var21.method888(8192);
            }

            if (~this.field8977 == -271) {
               var21.method888(12288);
            }
         }

         if (var26) {
            var21.method917(this.field8980, this.field8994, arg8, arg0, arg6, arg4, arg9);
         }

         var21.method923(arg1);
         return var21;
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field8998[7] + (arg0 != null ? field8998[1] : field8998[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8998[1] : field8998[3]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field8998[1] : field8998[3]) + ',' + arg9 + ',' + (arg10 != null ? field8998[1] : field8998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4553(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4554(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
