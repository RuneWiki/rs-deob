import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class693 {
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10002 = new String[]{method5036(method5035("}\u0012\u0015{V")), method5036(method5035("cL\u0015\u0014\u0003")), method5036(method5035("v\u0017WV")), method5036(method5035("}\u0012\u0015~V")), method5036(method5035("}\u0012\u0015yV")), method5036(method5035("}\u0012\u0015xV"))};
   @OriginalMember(
      owner = "client!ep",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field9992 = new class724(133, 1);
   @OriginalMember(
      owner = "client!ep",
      name = "e",
      descriptor = "I"
   )
   public static int field10000 = 0;
   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "Lhn;"
   )
   public static class357 field9999 = new class357(method5036(method5035("T-x{2")), "", method5036(method5035("t\rX[\u0012")), 4);
   @OriginalMember(
      owner = "client!ep",
      name = "d",
      descriptor = "I"
   )
   public static int field9993;
   @OriginalMember(
      owner = "client!ep",
      name = "c",
      descriptor = "I"
   )
   public static int field9994;
   @OriginalMember(
      owner = "client!ep",
      name = "k",
      descriptor = "I"
   )
   public static int field9995;
   @OriginalMember(
      owner = "client!ep",
      name = "g",
      descriptor = "I"
   )
   public int field9996;
   @OriginalMember(
      owner = "client!ep",
      name = "i",
      descriptor = "I"
   )
   public static int field9997;
   @OriginalMember(
      owner = "client!ep",
      name = "j",
      descriptor = "Lmu;"
   )
   public class365 field9998;
   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field10001;
   @OriginalMember(
      owner = "client!ep",
      name = "h",
      descriptor = "[I"
   )
   public int[] field9991;

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I[BLjava/lang/String;III)I"
   )
   public static final int method5031(int arg0, byte[] arg1, String arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field9995;
         int var7 = arg0 - arg4;
         int var8 = 0;
         int var10000;
         if (arg3 != -5110) {
            method5033(20, -27, (class17)null, 96, -113, (byte)76);
            if (var6) {
               var10000 = arg2.charAt(arg4 + var8);
            } else if (var8 >= var7) {
               var10000 = var7;
               if (!var6) {
                  return var7;
               }
            } else {
               var10000 = arg2.charAt(arg4 + var8);
            }
         } else if (var8 >= var7) {
            var10000 = var7;
            if (!var6) {
               return var7;
            }
         } else {
            var10000 = arg2.charAt(arg4 + var8);
         }

         while(true) {
            int var9 = var10000;
            if (var9 > 0 && ~var9 > -129) {
               arg1[arg5 + var8] = (byte)var9;
            } else if (var9 >= 160 && var9 <= 255) {
               arg1[arg5 + var8] = (byte)var9;
            } else if (var9 != 8364) {
               label280: {
                  if (var9 == 8218) {
                     arg1[arg5 + var8] = -126;
                     if (!var6) {
                        break label280;
                     }
                  }

                  if (~var9 != -403) {
                     if (var9 == 8222) {
                        arg1[arg5 + var8] = -124;
                        if (!var6) {
                           break label280;
                        }
                     }

                     if (~var9 != -8231) {
                        if (var9 == 8224) {
                           arg1[arg5 + var8] = -122;
                           if (!var6) {
                              break label280;
                           }
                        }

                        if (var9 != 8225) {
                           if (~var9 == -711) {
                              arg1[arg5 + var8] = -120;
                              if (!var6) {
                                 break label280;
                              }
                           }

                           if (var9 != 8240) {
                              if (~var9 == -353) {
                                 arg1[arg5 - -var8] = -118;
                                 if (!var6) {
                                    break label280;
                                 }
                              }

                              if (var9 != 8249) {
                                 if (var9 == 338) {
                                    arg1[arg5 + var8] = -116;
                                    if (!var6) {
                                       break label280;
                                    }
                                 }

                                 if (~var9 == -382) {
                                    arg1[arg5 + var8] = -114;
                                    if (!var6) {
                                       break label280;
                                    }
                                 }

                                 if (var9 != 8216) {
                                    if (~var9 != -8218) {
                                       if (var9 == 8220) {
                                          arg1[arg5 + var8] = -109;
                                          if (!var6) {
                                             break label280;
                                          }
                                       }

                                       if (~var9 != -8222) {
                                          if (var9 == 8226) {
                                             arg1[arg5 + var8] = -107;
                                             if (!var6) {
                                                break label280;
                                             }
                                          }

                                          if (var9 != 8211) {
                                             if (var9 != 8212) {
                                                if (~var9 != -733) {
                                                   if (~var9 == -8483) {
                                                      arg1[arg5 - -var8] = -103;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   if (var9 == 353) {
                                                      arg1[arg5 + var8] = -102;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   if (var9 == 8250) {
                                                      arg1[arg5 - -var8] = -101;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   if (~var9 == -340) {
                                                      arg1[arg5 + var8] = -100;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   if (var9 == 382) {
                                                      arg1[arg5 + var8] = -98;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   if (var9 == 376) {
                                                      arg1[arg5 + var8] = -97;
                                                      if (!var6) {
                                                         break label280;
                                                      }
                                                   }

                                                   arg1[arg5 + var8] = 63;
                                                   if (!var6) {
                                                      break label280;
                                                   }
                                                }

                                                arg1[arg5 - -var8] = -104;
                                                if (!var6) {
                                                   break label280;
                                                }
                                             }

                                             arg1[arg5 + var8] = -105;
                                             if (!var6) {
                                                break label280;
                                             }
                                          }

                                          arg1[arg5 + var8] = -106;
                                          if (!var6) {
                                             break label280;
                                          }
                                       }

                                       arg1[arg5 + var8] = -108;
                                       if (!var6) {
                                          break label280;
                                       }
                                    }

                                    arg1[arg5 + var8] = -110;
                                    if (!var6) {
                                       break label280;
                                    }
                                 }

                                 arg1[arg5 + var8] = -111;
                                 if (!var6) {
                                    break label280;
                                 }
                              }

                              arg1[arg5 - -var8] = -117;
                              if (!var6) {
                                 break label280;
                              }
                           }

                           arg1[arg5 - -var8] = -119;
                           if (!var6) {
                              break label280;
                           }
                        }

                        arg1[arg5 + var8] = -121;
                        if (!var6) {
                           break label280;
                        }
                     }

                     arg1[arg5 + var8] = -123;
                     if (!var6) {
                        break label280;
                     }
                  }

                  arg1[arg5 - -var8] = -125;
                  if (var6) {
                     arg1[arg5 + var8] = -128;
                     if (var6) {
                        arg1[arg5 + var8] = (byte)var9;
                     }
                  }
               }
            } else {
               arg1[arg5 + var8] = -128;
               if (var6) {
                  arg1[arg5 + var8] = (byte)var9;
               }
            }

            ++var8;
            if (var8 >= var7) {
               var10000 = var7;
               if (!var6) {
                  return var7;
               }
            } else {
               var10000 = arg2.charAt(arg4 + var8);
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10002[3] + arg0 + ',' + (arg1 != null ? field10002[1] : field10002[2]) + ',' + (arg2 != null ? field10002[1] : field10002[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5032(int arg0, byte arg1) {
      try {
         if (arg1 != 38) {
            field9999 = null;
         }

         ++field9994;
         class111 var2 = class796.method5734(9, (long)arg0, (byte)-117);
         var2.method1083(-104);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10002[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IILha;IIB)V"
   )
   public static final void method5033(int arg0, int arg1, class17 arg2, int arg3, int arg4, byte arg5) {
      try {
         ++field9993;
         class712.field10231 = arg2;
         class292.field4377 = class712.field10231.method183();
         class162.field2469 = class712.field10231.method183();
         class110.field1710 = class712.field10231.method183();
         class217.field3113 = 0;
         class321.field4796 = arg3;
         int var6 = 39 / ((arg5 - -52) / 46);
         class558.field7928 = null;
         class7.field132 = arg1;
         class614.field8733 = null;
         class235.method2081(arg0, (byte)119, arg4);
         class56.field805 = -1;
         class434.field6363 = -1;
         class265.field4047 = -1;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10002[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10002[1] : field10002[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5034(boolean arg0) {
      try {
         field9992 = null;
         if (!arg0) {
            field10001 = null;
            field9999 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10002[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5035(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5036(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
