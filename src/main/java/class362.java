import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class362 {
   @OriginalMember(
      owner = "client!ng",
      name = "n",
      descriptor = "I"
   )
   public int field4946 = -1;
   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4950 = new String[]{method2713(method2712("\u001d\u0018#Y=")), method2713(method2712("\u001d\u0018#X=")), method2713(method2712("\u001d\nav")), method2713(method2712("\u001d\u0018#^=")), method2713(method2712("\bQ#4h")), method2713(method2712("\u001d\u0018#[="))};
   @OriginalMember(
      owner = "client!ng",
      name = "c",
      descriptor = "I"
   )
   public static int field4934 = 0;
   @OriginalMember(
      owner = "client!ng",
      name = "e",
      descriptor = "Lrr;"
   )
   public static class383 field4931 = null;
   @OriginalMember(
      owner = "client!ng",
      name = "q",
      descriptor = "I"
   )
   public static int field4933;
   @OriginalMember(
      owner = "client!ng",
      name = "l",
      descriptor = "I"
   )
   public static int field4938;
   @OriginalMember(
      owner = "client!ng",
      name = "r",
      descriptor = "I"
   )
   public static int field4941;
   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "I"
   )
   public static int field4945;
   @OriginalMember(
      owner = "client!ng",
      name = "h",
      descriptor = "Lwv;"
   )
   private class37 field4932;
   @OriginalMember(
      owner = "client!ng",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   private String field4935;
   @OriginalMember(
      owner = "client!ng",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   private String field4942;
   @OriginalMember(
      owner = "client!ng",
      name = "u",
      descriptor = "[I"
   )
   private int[] field4927;
   @OriginalMember(
      owner = "client!ng",
      name = "o",
      descriptor = "[I"
   )
   private int[] field4929;
   @OriginalMember(
      owner = "client!ng",
      name = "s",
      descriptor = "[I"
   )
   private int[] field4936;
   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "[I"
   )
   private int[] field4937;
   @OriginalMember(
      owner = "client!ng",
      name = "t",
      descriptor = "[I"
   )
   private int[] field4944;
   @OriginalMember(
      owner = "client!ng",
      name = "m",
      descriptor = "[I"
   )
   private int[] field4947;
   @OriginalMember(
      owner = "client!ng",
      name = "g",
      descriptor = "[I"
   )
   private int[] field4948;
   @OriginalMember(
      owner = "client!ng",
      name = "w",
      descriptor = "[I"
   )
   private int[] field4949;
   @OriginalMember(
      owner = "client!ng",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field4928;
   @OriginalMember(
      owner = "client!ng",
      name = "v",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field4943;
   @OriginalMember(
      owner = "client!ng",
      name = "j",
      descriptor = "[[I"
   )
   private int[][] field4930;
   @OriginalMember(
      owner = "client!ng",
      name = "p",
      descriptor = "[[I"
   )
   private int[][] field4939;
   @OriginalMember(
      owner = "client!ng",
      name = "f",
      descriptor = "[[I"
   )
   private int[][] field4940;

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 33
   )
   public final void method2708(class147 arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field4938;

         while(true) {
            int var4 = arg0.method1143(arg1 + -15442);
            if (var4 != 0) {
               this.method2709(var4, 73, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -23) {
               this.method2708((class147)null, (byte)61);
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4950[5] + (arg0 != null ? field4950[4] : field4950[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(IILwf;)V",
      line = 66
   )
   private final void method2709(int arg0, int arg1, class147 arg2) {
      boolean var4 = client.field4360;

      try {
         ++field4945;
         if (arg1 >= 4) {
            if (~arg0 != -2) {
               if (arg0 == 2) {
                  this.field4942 = arg2.method1180((byte)80);
               } else if (~arg0 != -4) {
                  if (~arg0 != -5) {
                     if (~arg0 == -6) {
                        arg2.method1211(-26166);
                        return;
                     }

                     if (~arg0 == -7) {
                        arg2.method1143(-15465);
                        return;
                     }

                     if (~arg0 == -8) {
                        arg2.method1143(-15465);
                        return;
                     }

                     if (~arg0 != -9) {
                        if (arg0 == 9) {
                           arg2.method1143(-15465);
                           return;
                        }

                        if (arg0 != 10) {
                           if (arg0 == 12) {
                              arg2.method1164(19693);
                              return;
                           }

                           if (arg0 != 13) {
                              if (arg0 != 14) {
                                 if (arg0 == 15) {
                                    arg2.method1211(-26166);
                                    return;
                                 }

                                 if (arg0 == 17) {
                                    this.field4946 = arg2.method1211(-26166);
                                    return;
                                 }

                                 if (arg0 != 18) {
                                    if (~arg0 != -20) {
                                       if (~arg0 == -250) {
                                          int var11 = arg2.method1143(-15465);
                                          if (this.field4932 == null) {
                                             int var12 = class350.method2552(false, var11);
                                             this.field4932 = new class37(var12);
                                          }

                                          int var13 = 0;
                                          boolean var10000;
                                          if (var4) {
                                             var10000 = arg2.method1143(-15465) == 1;
                                          } else if (var11 <= var13) {
                                             if (!var4) {
                                                return;
                                             }

                                             var10000 = true;
                                          } else {
                                             var10000 = arg2.method1143(-15465) == 1;
                                          }

                                          while(true) {
                                             boolean var14 = var10000;
                                             int var15 = arg2.method1166((byte)-123);
                                             class428 var16;
                                             if (var14) {
                                                var16 = new class181(arg2.method1204(2119550368));
                                                if (var4) {
                                                   var16 = new class713(arg2.method1164(19693));
                                                }
                                             } else {
                                                var16 = new class713(arg2.method1164(19693));
                                             }

                                             this.field4932.method336(-1, (long)var15, var16);
                                             ++var13;
                                             if (var11 <= var13) {
                                                if (!var4) {
                                                   return;
                                                }

                                                var10000 = true;
                                             } else {
                                                var10000 = arg2.method1143(-15465) == 1;
                                             }
                                          }
                                       }
                                    } else {
                                       int var17 = arg2.method1143(-15465);
                                       this.field4928 = new String[var17];
                                       this.field4948 = new int[var17];
                                       this.field4937 = new int[var17];
                                       this.field4936 = new int[var17];
                                       int var18 = 0;
                                       if (var4 || ~var17 < ~var18) {
                                          do {
                                             this.field4936[var18] = arg2.method1164(19693);
                                             this.field4937[var18] = arg2.method1164(19693);
                                             this.field4948[var18] = arg2.method1164(19693);
                                             this.field4928[var18] = arg2.method1204(2119550368);
                                             ++var18;
                                          } while(~var17 < ~var18);
                                       }
                                    }

                                    return;
                                 }

                                 int var9 = arg2.method1143(-15465);
                                 this.field4943 = new String[var9];
                                 this.field4947 = new int[var9];
                                 this.field4944 = new int[var9];
                                 this.field4927 = new int[var9];
                                 int var10 = 0;
                                 if (var4) {
                                    this.field4944[var10] = arg2.method1164(19693);
                                    this.field4927[var10] = arg2.method1164(19693);
                                    this.field4947[var10] = arg2.method1164(19693);
                                    this.field4943[var10] = arg2.method1204(2119550368);
                                    ++var10;
                                 }

                                 while(true) {
                                    while(~var9 < ~var10) {
                                       this.field4944[var10] = arg2.method1164(19693);
                                       this.field4927[var10] = arg2.method1164(19693);
                                       this.field4947[var10] = arg2.method1164(19693);
                                       this.field4943[var10] = arg2.method1204(2119550368);
                                       ++var10;
                                    }

                                    if (!var4) {
                                       return;
                                    }

                                    ++var10;
                                 }
                              }

                              int var7 = arg2.method1143(-15465);
                              this.field4939 = new int[var7][2];
                              int var8 = 0;
                              if (var4) {
                                 this.field4939[var8][0] = arg2.method1143(-15465);
                                 this.field4939[var8][1] = arg2.method1143(-15465);
                                 ++var8;
                              }

                              while(true) {
                                 while(var8 < var7) {
                                    this.field4939[var8][0] = arg2.method1143(-15465);
                                    this.field4939[var8][1] = arg2.method1143(-15465);
                                    ++var8;
                                 }

                                 if (!var4) {
                                    return;
                                 }

                                 ++var8;
                              }
                           }

                           int var19 = arg2.method1143(-15465);
                           this.field4929 = new int[var19];
                           int var20 = 0;
                           if (var4) {
                              this.field4929[var20] = arg2.method1211(-26166);
                              ++var20;
                           }

                           while(true) {
                              while(~var19 < ~var20) {
                                 this.field4929[var20] = arg2.method1211(-26166);
                                 ++var20;
                              }

                              if (!var4) {
                                 return;
                              }

                              ++var20;
                           }
                        }

                        int var5 = arg2.method1143(-15465);
                        this.field4949 = new int[var5];
                        int var6 = 0;
                        if (var4) {
                           this.field4949[var6] = arg2.method1164(19693);
                           ++var6;
                        }

                        while(true) {
                           while(var5 > var6) {
                              this.field4949[var6] = arg2.method1164(19693);
                              ++var6;
                           }

                           if (!var4) {
                              return;
                           }

                           ++var6;
                        }
                     }
                  } else {
                     int var21 = arg2.method1143(-15465);
                     this.field4930 = new int[var21][3];
                     int var22 = 0;
                     if (var4 || var21 > var22) {
                        do {
                           this.field4930[var22][0] = arg2.method1211(-26166);
                           this.field4930[var22][1] = arg2.method1164(19693);
                           this.field4930[var22][2] = arg2.method1164(19693);
                           ++var22;
                        } while(var21 > var22);
                     }
                  }

               } else {
                  int var23 = arg2.method1143(-15465);
                  this.field4940 = new int[var23][3];
                  int var24 = 0;
                  if (var4) {
                     this.field4940[var24][0] = arg2.method1211(-26166);
                     this.field4940[var24][1] = arg2.method1164(19693);
                     this.field4940[var24][2] = arg2.method1164(19693);
                     ++var24;
                  }

                  while(true) {
                     while(var24 < var23) {
                        this.field4940[var24][0] = arg2.method1211(-26166);
                        this.field4940[var24][1] = arg2.method1164(19693);
                        this.field4940[var24][2] = arg2.method1164(19693);
                        ++var24;
                     }

                     if (!var4) {
                        return;
                     }

                     ++var24;
                  }
               }
            } else {
               this.field4935 = arg2.method1180((byte)116);
            }
         }
      } catch (RuntimeException var26) {
         throw class237.method1823(var26, field4950[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4950[4] : field4950[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 299
   )
   public static final void method2710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field4933;
         if (~arg2 == ~arg7) {
            class416.method3107(arg5, arg1, arg7, arg3, (byte)75, arg4, arg6);
         } else if (arg0 == -26359) {
            if (class457.field6528 <= -arg7 + arg1 && arg1 - -arg7 <= class348.field4702 && -arg2 + arg3 >= class245.field3374 && class699.field10237 >= arg2 + arg3) {
               class747.method5425(arg2, arg7, arg1, arg5, arg6, arg3, arg4, (byte)-109);
            } else {
               class735.method5344(arg6, arg1, arg5, arg4, arg7, arg3, arg2, arg0 + 26363);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4950[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(I)V",
      line = 334
   )
   public final void method2711(int arg0) {
      try {
         if (this.field4942 == null) {
            this.field4942 = this.field4935;
         }

         if (arg0 >= 74) {
            ++field4941;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4950[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
