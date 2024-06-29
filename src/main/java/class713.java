import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class713 extends class428 {
   @OriginalMember(
      owner = "client!ag",
      name = "u",
      descriptor = "I"
   )
   public int field10388;
   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10398 = new String[]{method5184(method5183("mi\u0003?~")), method5184(method5183("b{A\u0017")), method5184(method5183("mi\u00039~")), method5184(method5183("w \u0003U+")), method5184(method5183("mi\u0003:~")), method5184(method5183("mi\u0003>~")), method5184(method5183("mi\u0003G?bgYE~")), method5184(method5183("mi\u00038~"))};
   @OriginalMember(
      owner = "client!ag",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field10394 = new int[8];
   @OriginalMember(
      owner = "client!ag",
      name = "t",
      descriptor = "Leg;"
   )
   public static class118 field10390 = new class118(29, 6);
   @OriginalMember(
      owner = "client!ag",
      name = "p",
      descriptor = "I"
   )
   public static int field10395 = 0;
   @OriginalMember(
      owner = "client!ag",
      name = "s",
      descriptor = "Lkt;"
   )
   public static class169 field10396 = new class169();
   @OriginalMember(
      owner = "client!ag",
      name = "o",
      descriptor = "Lek;"
   )
   public static class536 field10397 = new class536(35, 11);
   @OriginalMember(
      owner = "client!ag",
      name = "r",
      descriptor = "I"
   )
   public static int field10389;
   @OriginalMember(
      owner = "client!ag",
      name = "n",
      descriptor = "I"
   )
   public static int field10391;
   @OriginalMember(
      owner = "client!ag",
      name = "v",
      descriptor = "I"
   )
   public static int field10392;
   @OriginalMember(
      owner = "client!ag",
      name = "q",
      descriptor = "I"
   )
   public static int field10393;

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method5178(int arg0) {
      try {
         ++field10391;
         if (class326.field4414 != null) {
            return 3;
         } else {
            int var1 = 18 / ((-63 - arg0) / 34);
            return class40.field569 ? 2 : 1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10398[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5179(int arg0, byte arg1) {
      try {
         ++field10392;
         class755 var2 = class317.method2325((long)arg0, 115, 12);
         if (arg1 != -111) {
            field10396 = null;
         }

         var2.method5481(-91);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10398[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(ILjava/lang/String;[BZII)I"
   )
   public static final int method5180(int arg0, String arg1, byte[] arg2, boolean arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         ++field10389;
         int var7 = -arg5 + arg0;
         if (arg3) {
            method5182((byte)-47);
         }

         int var8 = 0;
         int var10000;
         if (var6) {
            var10000 = arg1.charAt(arg5 + var8);
         } else if (var7 <= var8) {
            var10000 = var7;
            if (!var6) {
               return var7;
            }
         } else {
            var10000 = arg1.charAt(arg5 + var8);
         }

         while(true) {
            label286: {
               int var9 = var10000;
               if (~var9 < -1 && var9 < 128 || var9 >= 160 && var9 <= 255) {
                  arg2[arg4 + var8] = (byte)var9;
                  if (!var6) {
                     break label286;
                  }
               }

               if (var9 == 8364) {
                  arg2[arg4 + var8] = -128;
                  if (!var6) {
                     break label286;
                  }
               }

               if (var9 == 8218) {
                  arg2[arg4 + var8] = -126;
                  if (!var6) {
                     break label286;
                  }
               }

               if (~var9 != -403) {
                  label271: {
                     if (var9 == 8222) {
                        arg2[arg4 + var8] = -124;
                        if (!var6) {
                           break label271;
                        }
                     }

                     if (~var9 != -8231) {
                        if (var9 != 8224) {
                           if (var9 == 8225) {
                              arg2[arg4 - -var8] = -121;
                              if (!var6) {
                                 break label271;
                              }
                           }

                           if (~var9 != -711) {
                              if (~var9 == -8241) {
                                 arg2[arg4 + var8] = -119;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (var9 == 352) {
                                 arg2[arg4 + var8] = -118;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (~var9 == -8250) {
                                 arg2[arg4 + var8] = -117;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (var9 == 338) {
                                 arg2[arg4 + var8] = -116;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (~var9 == -382) {
                                 arg2[arg4 + var8] = -114;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (var9 == 8216) {
                                 arg2[arg4 + var8] = -111;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (~var9 == -8218) {
                                 arg2[arg4 + var8] = -110;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              if (~var9 != -8221) {
                                 if (var9 == 8221) {
                                    arg2[arg4 + var8] = -108;
                                    if (!var6) {
                                       break label271;
                                    }
                                 }

                                 if (var9 == 8226) {
                                    arg2[arg4 + var8] = -107;
                                    if (!var6) {
                                       break label271;
                                    }
                                 }

                                 if (~var9 != -8212) {
                                    if (~var9 == -8213) {
                                       arg2[arg4 + var8] = -105;
                                       if (!var6) {
                                          break label271;
                                       }
                                    }

                                    if (~var9 == -733) {
                                       arg2[arg4 + var8] = -104;
                                       if (!var6) {
                                          break label271;
                                       }
                                    }

                                    if (var9 != 8482) {
                                       if (var9 != 353) {
                                          if (~var9 == -8251) {
                                             arg2[arg4 - -var8] = -101;
                                             if (!var6) {
                                                break label271;
                                             }
                                          }

                                          if (var9 != 339) {
                                             if (var9 == 382) {
                                                arg2[arg4 + var8] = -98;
                                                if (!var6) {
                                                   break label271;
                                                }
                                             }

                                             if (var9 == 376) {
                                                arg2[arg4 + var8] = -97;
                                                if (!var6) {
                                                   break label271;
                                                }
                                             }

                                             arg2[arg4 + var8] = 63;
                                             if (!var6) {
                                                break label271;
                                             }
                                          }

                                          arg2[arg4 - -var8] = -100;
                                          if (!var6) {
                                             break label271;
                                          }
                                       }

                                       arg2[arg4 + var8] = -102;
                                       if (!var6) {
                                          break label271;
                                       }
                                    }

                                    arg2[arg4 - -var8] = -103;
                                    if (!var6) {
                                       break label271;
                                    }
                                 }

                                 arg2[arg4 + var8] = -106;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              arg2[arg4 + var8] = -109;
                              if (!var6) {
                                 break label271;
                              }
                           }

                           arg2[arg4 + var8] = -120;
                           if (!var6) {
                              break label271;
                           }
                        }

                        arg2[arg4 + var8] = -122;
                        if (!var6) {
                           break label271;
                        }
                     }

                     arg2[arg4 + var8] = -123;
                     if (var6) {
                        arg2[arg4 + var8] = -125;
                     }
                  }
               } else {
                  arg2[arg4 + var8] = -125;
               }
            }

            ++var8;
            if (var7 <= var8) {
               var10000 = var7;
               if (!var6) {
                  return var7;
               }
            } else {
               var10000 = arg1.charAt(arg5 + var8);
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10398[2] + arg0 + ',' + (arg1 != null ? field10398[3] : field10398[1]) + ',' + (arg2 != null ? field10398[3] : field10398[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(IIIBI[B)V"
   )
   public static final void method5181(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field4360;

      try {
         ++field10393;
         if (~arg0 > ~arg1) {
            arg4 = arg1 - arg0 >> 2;
            arg2 += arg0;
            int var9;
            if (var6) {
               var9 = arg2 + 1;
               arg5[arg2] = 1;
               int var10 = var9 + 1;
               arg5[var9] = 1;
               int var11 = var10 + 1;
               arg5[var10] = 1;
               arg2 = var11 + 1;
               arg5[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg4;
                  if (arg4 < 0) {
                     arg4 = arg1 - arg0 & 3;
                     if (!var6) {
                        if (var6) {
                           arg5[arg2++] = 1;
                        }

                        while(true) {
                           --arg4;
                           if (arg4 < 0) {
                              if (arg3 < 60) {
                                 method5182((byte)-95);
                                 return;
                              }

                              return;
                           }

                           arg5[arg2++] = 1;
                        }
                     }

                     arg5[arg2++] = 1;
                  } else {
                     var9 = arg2 + 1;
                     arg5[arg2] = 1;
                     arg5[var9++] = 1;
                     arg5[var9++] = 1;
                     arg2 = var9 + 1;
                     arg5[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10398[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10398[3] : field10398[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5182(byte arg0) {
      try {
         field10396 = null;
         int var1 = 110 / ((23 - arg0) / 57);
         field10394 = null;
         field10397 = null;
         field10390 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10398[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "()V"
   )
   public class713() {
   }

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class713(int arg0) {
      try {
         this.field10388 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10398[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5184(char[] arg0) {
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
            var10005 = 14;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
