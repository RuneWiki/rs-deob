import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class33 {
   @OriginalMember(
      owner = "client!uf",
      name = "k",
      descriptor = "I"
   )
   public int field474 = 99;
   @OriginalMember(
      owner = "client!uf",
      name = "t",
      descriptor = "I"
   )
   public int field476 = -1;
   @OriginalMember(
      owner = "client!uf",
      name = "h",
      descriptor = "I"
   )
   public int field462 = -1;
   @OriginalMember(
      owner = "client!uf",
      name = "m",
      descriptor = "I"
   )
   public int field463 = -1;
   @OriginalMember(
      owner = "client!uf",
      name = "A",
      descriptor = "Z"
   )
   public boolean field479 = false;
   @OriginalMember(
      owner = "client!uf",
      name = "n",
      descriptor = "Z"
   )
   public boolean field469 = false;
   @OriginalMember(
      owner = "client!uf",
      name = "D",
      descriptor = "I"
   )
   public int field480 = -1;
   @OriginalMember(
      owner = "client!uf",
      name = "i",
      descriptor = "I"
   )
   public int field481 = 5;
   @OriginalMember(
      owner = "client!uf",
      name = "u",
      descriptor = "I"
   )
   public int field468 = 2;
   @OriginalMember(
      owner = "client!uf",
      name = "e",
      descriptor = "Z"
   )
   public boolean field487 = false;
   @OriginalMember(
      owner = "client!uf",
      name = "v",
      descriptor = "I"
   )
   public int field485 = -1;
   @OriginalMember(
      owner = "client!uf",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field493 = new String[]{method386(method385("Z%A\u00031")), method386(method385("O~\u0003A")), method386(method385("TmAld")), method386(method385("TmAid")), method386(method385("Kj\u0019LbMj\u0001Jbs~\u0001Y%Ln")), method386(method385("@}\u000eD @i\u0003H\u001cSd\fH?Rd\u001d^")), method386(method385("TmAod")), method386(method385("TmAhd")), method386(method385("TmAnd"))};
   @OriginalMember(
      owner = "client!uf",
      name = "x",
      descriptor = "I"
   )
   public static int field470 = 0;
   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "I"
   )
   public static int field489 = 0;
   @OriginalMember(
      owner = "client!uf",
      name = "y",
      descriptor = "Ldi;"
   )
   public static class577 field484 = new class577(3, 2);
   @OriginalMember(
      owner = "client!uf",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field491 = new class724(127, 3);
   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "I"
   )
   public static int field464;
   @OriginalMember(
      owner = "client!uf",
      name = "f",
      descriptor = "I"
   )
   public static int field472;
   @OriginalMember(
      owner = "client!uf",
      name = "q",
      descriptor = "I"
   )
   public int field478;
   @OriginalMember(
      owner = "client!uf",
      name = "C",
      descriptor = "I"
   )
   public static int field482;
   @OriginalMember(
      owner = "client!uf",
      name = "s",
      descriptor = "I"
   )
   public static int field483;
   @OriginalMember(
      owner = "client!uf",
      name = "l",
      descriptor = "Lrfa;"
   )
   public static class202 field467;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field492;
   @OriginalMember(
      owner = "client!uf",
      name = "F",
      descriptor = "[I"
   )
   public int[] field465;
   @OriginalMember(
      owner = "client!uf",
      name = "w",
      descriptor = "[I"
   )
   public int[] field471;
   @OriginalMember(
      owner = "client!uf",
      name = "j",
      descriptor = "[I"
   )
   public int[] field475;
   @OriginalMember(
      owner = "client!uf",
      name = "o",
      descriptor = "[I"
   )
   public int[] field477;
   @OriginalMember(
      owner = "client!uf",
      name = "d",
      descriptor = "[I"
   )
   public int[] field486;
   @OriginalMember(
      owner = "client!uf",
      name = "E",
      descriptor = "[I"
   )
   private int[] field488;
   @OriginalMember(
      owner = "client!uf",
      name = "p",
      descriptor = "[Lma;"
   )
   public static class148[] field473;
   @OriginalMember(
      owner = "client!uf",
      name = "r",
      descriptor = "[Z"
   )
   public boolean[] field466;
   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "[[I"
   )
   public int[][] field490;

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method379(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 < 84) {
            this.method382(34, false, (class65)null);
         }

         ++field482;

         do {
            int var4 = arg1.method665(false);
            if (~var4 == -1) {
               break;
            }

            this.method382(var4, false, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field493[3] + arg0 + ',' + (arg1 != null ? field493[0] : field493[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method380(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (~this.field476 == 0) {
            label35: {
               if (this.field466 == null) {
                  this.field476 = 0;
                  if (!var2) {
                     break label35;
                  }
               }

               this.field476 = 2;
            }
         }

         if (this.field480 == -1) {
            label29: {
               if (this.field466 == null) {
                  this.field480 = 0;
                  if (!var2) {
                     break label29;
                  }
               }

               this.field480 = 2;
            }
         }

         if (arg0 != 2) {
            this.field479 = false;
         }

         ++field472;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field493[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method381(int arg0) {
      try {
         field467 = null;
         field473 = null;
         field484 = null;
         field491 = null;
         if (arg0 > -53) {
            field484 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field493[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(IZLcu;)V"
   )
   private final void method382(int arg0, boolean arg1, class65 arg2) {
      boolean var4 = client.field10022;

      try {
         label384: {
            if (~arg0 != -2) {
               if (arg0 == 2) {
                  this.field463 = arg2.method685(-2);
                  if (!var4) {
                     break label384;
                  }
               }

               if (~arg0 == -4) {
                  this.field466 = new boolean[256];
                  int var5 = arg2.method665(false);
                  int var6 = 0;
                  if (var4) {
                     this.field466[arg2.method665(false)] = true;
                     ++var6;
                  }

                  while(true) {
                     while(var6 < var5) {
                        this.field466[arg2.method665(false)] = true;
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label384;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               if (~arg0 != -6) {
                  if (~arg0 != -7) {
                     if (arg0 == 7) {
                        this.field462 = arg2.method685(-2);
                        if (!var4) {
                           break label384;
                        }
                     }

                     if (arg0 != 8) {
                        if (arg0 != 9) {
                           if (arg0 == 10) {
                              this.field480 = arg2.method665(false);
                              if (!var4) {
                                 break label384;
                              }
                           }

                           if (arg0 != 11) {
                              if (~arg0 == -13) {
                                 int var7 = arg2.method665(false);
                                 this.field488 = new int[var7];
                                 int var8 = 0;
                                 if (var4) {
                                    this.field488[var8] = arg2.method685(-2);
                                    ++var8;
                                 }

                                 label337:
                                 while(true) {
                                    while(var7 > var8) {
                                       this.field488[var8] = arg2.method685(-2);
                                       ++var8;
                                    }

                                    int var9 = 0;
                                    if (!var4) {
                                       if (var4) {
                                          this.field488[var9] = (arg2.method685(-2) << 16) - -this.field488[var9];
                                          ++var9;
                                       }

                                       while(true) {
                                          while(var9 < var7) {
                                             this.field488[var9] = (arg2.method685(-2) << 16) - -this.field488[var9];
                                             ++var9;
                                          }

                                          if (!var4) {
                                             if (!var4) {
                                                break label384;
                                             }
                                             break label337;
                                          }

                                          ++var9;
                                       }
                                    }

                                    ++var8;
                                 }
                              }

                              if (~arg0 != -14) {
                                 if (arg0 == 14) {
                                    this.field479 = true;
                                    if (!var4) {
                                       break label384;
                                    }
                                 }

                                 if (~arg0 == -16) {
                                    this.field487 = true;
                                    if (!var4) {
                                       break label384;
                                    }
                                 }

                                 if (arg0 == 16) {
                                    break label384;
                                 }

                                 if (~arg0 == -19) {
                                    this.field469 = true;
                                    if (!var4) {
                                       break label384;
                                    }
                                 }

                                 if (~arg0 != -20) {
                                    label424: {
                                       if (~arg0 != -21) {
                                          break label384;
                                       }

                                       int var10;
                                       if (this.field465 != null && this.field475 != null) {
                                          var10 = arg2.method665(false);
                                          this.field465[var10] = arg2.method685(-2);
                                          this.field475[var10] = arg2.method685(-2);
                                          if (!var4) {
                                             if (!var4) {
                                                break label384;
                                             }
                                             break label424;
                                          }

                                          ++var10;
                                       } else {
                                          this.field465 = new int[this.field490.length];
                                          this.field475 = new int[this.field490.length];
                                          var10 = 0;
                                          if (var4) {
                                             this.field465[var10] = 256;
                                             this.field475[var10] = 256;
                                             ++var10;
                                          }
                                       }

                                       while(true) {
                                          while(~this.field490.length < ~var10) {
                                             this.field465[var10] = 256;
                                             this.field475[var10] = 256;
                                             ++var10;
                                          }

                                          var10 = arg2.method665(false);
                                          this.field465[var10] = arg2.method685(-2);
                                          this.field475[var10] = arg2.method685(-2);
                                          if (!var4) {
                                             if (!var4) {
                                                break label384;
                                             }
                                             break;
                                          }

                                          ++var10;
                                       }
                                    }
                                 }

                                 if (this.field486 == null) {
                                    this.field486 = new int[this.field490.length];
                                    int var11 = 0;
                                    if (var4 || this.field490.length > var11) {
                                       do {
                                          this.field486[var11] = 255;
                                          ++var11;
                                       } while(this.field490.length > var11);
                                    }
                                 }

                                 this.field486[arg2.method665(false)] = arg2.method665(false);
                                 if (!var4) {
                                    break label384;
                                 }
                              }

                              int var12 = arg2.method685(-2);
                              this.field490 = new int[var12][];
                              int var13 = 0;
                              if (!var4 && var12 <= var13) {
                                 if (!var4) {
                                    break label384;
                                 }
                              } else {
                                 while(true) {
                                    int var14 = arg2.method665(false);
                                    if (~var14 >= -1) {
                                       ++var13;
                                    } else {
                                       this.field490[var13] = new int[var14];
                                       this.field490[var13][0] = arg2.method691((byte)-127);
                                       int var15 = 1;
                                       if (var4) {
                                          this.field490[var13][var15] = arg2.method685(-2);
                                          ++var15;
                                       }

                                       while(~var15 > ~var14) {
                                          this.field490[var13][var15] = arg2.method685(-2);
                                          ++var15;
                                       }

                                       ++var13;
                                    }

                                    if (var12 <= var13) {
                                       if (!var4) {
                                          break label384;
                                       }
                                       break;
                                    }
                                 }
                              }
                           }

                           this.field468 = arg2.method665(arg1);
                           if (!var4) {
                              break label384;
                           }
                        }

                        this.field476 = arg2.method665(false);
                        if (!var4) {
                           break label384;
                        }
                     }

                     this.field474 = arg2.method665(false);
                     if (!var4) {
                        break label384;
                     }
                  }

                  this.field485 = arg2.method685(-2);
                  if (!var4) {
                     break label384;
                  }
               }

               this.field481 = arg2.method665(false);
               if (!var4) {
                  break label384;
               }
            }

            int var16 = arg2.method685(-2);
            this.field477 = new int[var16];
            int var17 = 0;
            if (var4) {
               this.field477[var17] = arg2.method685(-2);
               ++var17;
            }

            label183:
            while(true) {
               while(var17 < var16) {
                  this.field477[var17] = arg2.method685(-2);
                  ++var17;
               }

               this.field471 = new int[var16];
               int var18 = 0;
               if (!var4) {
                  if (var4) {
                     this.field471[var18] = arg2.method685(-2);
                     ++var18;
                  }

                  while(true) {
                     while(~var16 < ~var18) {
                        this.field471[var18] = arg2.method685(-2);
                        ++var18;
                     }

                     int var19 = 0;
                     if (!var4) {
                        if (var4 || ~var19 > ~var16) {
                           do {
                              this.field471[var19] += arg2.method685(-2) << 16;
                              ++var19;
                           } while(~var19 > ~var16);
                        }
                        break label183;
                     }

                     ++var18;
                  }
               }

               ++var17;
            }
         }

         ++field464;
         if (arg1) {
            this.method382(111, true, (class65)null);
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field493[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field493[0] : field493[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method383(int arg0) {
      try {
         ++field483;

         try {
            int var1 = -27 / ((-61 - arg0) / 36);
            Method var2 = (field492 != null ? field492 : (field492 = method384(field493[4]))).getMethod(field493[5]);
            if (var2 != null) {
               try {
                  Runtime var3 = Runtime.getRuntime();
                  Integer var4 = (Integer)var2.invoke(var3, (Object[])null);
                  class412.field6049 = var4;
               } catch (Throwable var6) {
               }
            }
         } catch (Exception var7) {
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field493[6] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method384(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method385(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method386(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
