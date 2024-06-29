import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class567 {
   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8234 = new String[]{method4231(method4230("O\u0013s\b")), method4231(method4230("L\u00021&\u001d")), method4231(method4230("ZH1JH")), method4231(method4230("L\u00021'\u001d")), method4231(method4230("L\u00021%\u001d"))};
   @OriginalMember(
      owner = "client!md",
      name = "d",
      descriptor = "I"
   )
   public static int field8227 = 0;
   @OriginalMember(
      owner = "client!md",
      name = "h",
      descriptor = "I"
   )
   public static int field8229 = -1;
   @OriginalMember(
      owner = "client!md",
      name = "c",
      descriptor = "Lhm;"
   )
   public static class230 field8226 = new class230(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!md",
      name = "i",
      descriptor = "[J"
   )
   public static long[] field8232 = new long[10];
   @OriginalMember(
      owner = "client!md",
      name = "f",
      descriptor = "I"
   )
   public static int field8233 = -1;
   @OriginalMember(
      owner = "client!md",
      name = "e",
      descriptor = "I"
   )
   public static int field8225;
   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "I"
   )
   public static int field8228;
   @OriginalMember(
      owner = "client!md",
      name = "b",
      descriptor = "I"
   )
   public static int field8230;
   @OriginalMember(
      owner = "client!md",
      name = "g",
      descriptor = "I"
   )
   public static int field8231;

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4227(int arg0) {
      try {
         int var1 = -118 % ((arg0 - -49) / 50);
         field8226 = null;
         field8232 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8234[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(Ljava/lang/String;BIII[B)I"
   )
   public static final int method4228(String arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field4564;

      try {
         ++field8230;
         int var7 = -arg2 + arg3;
         if (arg1 != 64) {
            method4227(107);
         }

         int var8 = 0;
         int var10000;
         if (var6) {
            var10000 = arg0.charAt(arg2 + var8);
         } else if (~var7 >= ~var8) {
            var10000 = var7;
            if (!var6) {
               return var7;
            }
         } else {
            var10000 = arg0.charAt(arg2 + var8);
         }

         while(true) {
            int var9 = var10000;
            if (~var9 < -1 && var9 < 128) {
               arg5[arg4 + var8] = (byte)var9;
            } else if (~var9 <= -161 && ~var9 >= -256) {
               arg5[arg4 + var8] = (byte)var9;
            } else if (~var9 != -8365) {
               label273: {
                  if (var9 == 8218) {
                     arg5[arg4 + var8] = -126;
                     if (!var6) {
                        break label273;
                     }
                  }

                  if (var9 == 402) {
                     arg5[arg4 + var8] = -125;
                     if (!var6) {
                        break label273;
                     }
                  }

                  if (var9 == 8222) {
                     arg5[arg4 + var8] = -124;
                     if (!var6) {
                        break label273;
                     }
                  }

                  if (var9 != 8230) {
                     if (var9 != 8224) {
                        if (~var9 != -8226) {
                           if (~var9 == -711) {
                              arg5[arg4 + var8] = -120;
                              if (!var6) {
                                 break label273;
                              }
                           }

                           if (~var9 == -8241) {
                              arg5[arg4 - -var8] = -119;
                              if (!var6) {
                                 break label273;
                              }
                           }

                           if (var9 != 352) {
                              if (var9 == 8249) {
                                 arg5[arg4 + var8] = -117;
                                 if (!var6) {
                                    break label273;
                                 }
                              }

                              if (~var9 != -339) {
                                 if (var9 == 381) {
                                    arg5[arg4 - -var8] = -114;
                                    if (!var6) {
                                       break label273;
                                    }
                                 }

                                 if (var9 == 8216) {
                                    arg5[arg4 - -var8] = -111;
                                    if (!var6) {
                                       break label273;
                                    }
                                 }

                                 if (~var9 == -8218) {
                                    arg5[arg4 + var8] = -110;
                                    if (!var6) {
                                       break label273;
                                    }
                                 }

                                 if (var9 != 8220) {
                                    if (~var9 == -8222) {
                                       arg5[arg4 + var8] = -108;
                                       if (!var6) {
                                          break label273;
                                       }
                                    }

                                    if (~var9 != -8227) {
                                       if (var9 == 8211) {
                                          arg5[arg4 + var8] = -106;
                                          if (!var6) {
                                             break label273;
                                          }
                                       }

                                       if (~var9 != -8213) {
                                          if (var9 != 732) {
                                             if (var9 != 8482) {
                                                if (var9 == 353) {
                                                   arg5[arg4 - -var8] = -102;
                                                   if (!var6) {
                                                      break label273;
                                                   }
                                                }

                                                if (var9 == 8250) {
                                                   arg5[arg4 + var8] = -101;
                                                   if (!var6) {
                                                      break label273;
                                                   }
                                                }

                                                if (~var9 == -340) {
                                                   arg5[arg4 - -var8] = -100;
                                                   if (!var6) {
                                                      break label273;
                                                   }
                                                }

                                                if (var9 != 382) {
                                                   if (~var9 == -377) {
                                                      arg5[arg4 - -var8] = -97;
                                                      if (!var6) {
                                                         break label273;
                                                      }
                                                   }

                                                   arg5[arg4 + var8] = 63;
                                                   if (!var6) {
                                                      break label273;
                                                   }
                                                }

                                                arg5[arg4 + var8] = -98;
                                                if (!var6) {
                                                   break label273;
                                                }
                                             }

                                             arg5[arg4 - -var8] = -103;
                                             if (!var6) {
                                                break label273;
                                             }
                                          }

                                          arg5[arg4 + var8] = -104;
                                          if (!var6) {
                                             break label273;
                                          }
                                       }

                                       arg5[arg4 + var8] = -105;
                                       if (!var6) {
                                          break label273;
                                       }
                                    }

                                    arg5[arg4 + var8] = -107;
                                    if (!var6) {
                                       break label273;
                                    }
                                 }

                                 arg5[arg4 - -var8] = -109;
                                 if (!var6) {
                                    break label273;
                                 }
                              }

                              arg5[arg4 - -var8] = -116;
                              if (!var6) {
                                 break label273;
                              }
                           }

                           arg5[arg4 + var8] = -118;
                           if (!var6) {
                              break label273;
                           }
                        }

                        arg5[arg4 + var8] = -121;
                        if (!var6) {
                           break label273;
                        }
                     }

                     arg5[arg4 - -var8] = -122;
                     if (!var6) {
                        break label273;
                     }
                  }

                  arg5[arg4 - -var8] = -123;
                  if (var6) {
                     arg5[arg4 + var8] = -128;
                     if (var6) {
                        arg5[arg4 + var8] = (byte)var9;
                     }
                  }
               }
            } else {
               arg5[arg4 + var8] = -128;
               if (var6) {
                  arg5[arg4 + var8] = (byte)var9;
               }
            }

            ++var8;
            if (~var7 >= ~var8) {
               var10000 = var7;
               if (!var6) {
                  return var7;
               }
            } else {
               var10000 = arg0.charAt(arg2 + var8);
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8234[1] + (arg0 != null ? field8234[2] : field8234[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8234[2] : field8234[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4229(int arg0, int arg1) {
      try {
         if (arg1 <= 122) {
            return true;
         } else {
            ++field8228;
            if (arg0 != 46 && ~arg0 != -17 && ~arg0 != -53 && arg0 != 3 && ~arg0 != -7) {
               return arg0 == 57 || ~arg0 == -1008;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8234[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4230(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4231(char[] arg0) {
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
            var10005 = 102;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
