import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class789 {
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11473 = new String[]{method5666(method5665("j-FM+")), method5666(method5665("j-FI+")), method5666(method5665("v/\u0004d")), method5666(method5665("ctF&~")), method5666(method5665("j-FK+")), method5666(method5665("j-FJ+")), method5666(method5665("j-FL+"))};
   @OriginalMember(
      owner = "client!rw",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field11468 = new class101(24, 6);
   @OriginalMember(
      owner = "client!rw",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field11471 = new int[3];
   @OriginalMember(
      owner = "client!rw",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field11470 = false;
   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "I"
   )
   public static int field11472 = 0;
   @OriginalMember(
      owner = "client!rw",
      name = "g",
      descriptor = "I"
   )
   public static int field11465;
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "I"
   )
   public static int field11466;
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "I"
   )
   public static int field11467;
   @OriginalMember(
      owner = "client!rw",
      name = "d",
      descriptor = "I"
   )
   public static int field11469;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method5660(int arg0, int arg1, int arg2) {
      try {
         ++field11469;
         if (arg0 >= -25) {
            field11471 = null;
         }

         return class79.method751(arg1, arg2, (byte)-6) & class380.method2937(arg1, 35, arg2);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11473[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(IBI)V",
      line = 15
   )
   public static final void method5661(int arg0, byte arg1, int arg2) {
      try {
         int var3 = 66 % ((59 - arg1) / 60);
         class73.field933 = arg0;
         ++field11467;
         class92.field1176 = arg2;
         if (~class4.field85 == -1) {
            class379.field5808 = class122.field1489 * 2 + class73.field933;
            class680.field10222 = class92.field1176 - -(class344.field5248 * 2);
         } else {
            if (~class4.field85 != -2) {
               if (~class4.field85 == -3) {
                  class379.field5808 = class73.field933;
                  class680.field10222 = class92.field1176;
                  return;
               }
            } else {
               class312.field4444 = class92.field1176 / class186.field2315 + class232.field2945 + 2;
               class690.field10400 = class73.field933 / class519.field7557 - (-2 - class362.field5457);
               class379.field5808 = class690.field10400 * class519.field7557;
               class680.field10222 = class312.field4444 * class186.field2315;
               class344.field5248 = -class92.field1176 + class680.field10222 >> 1;
               class122.field1489 = -class73.field933 + class379.field5808 >> 1;
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11473[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(Z)V",
      line = 53
   )
   public static void method5662(boolean arg0) {
      try {
         field11471 = null;
         if (arg0) {
            field11471 = null;
         }

         field11468 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11473[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(II)V",
      line = 66
   )
   public static final void method5663(int arg0, int arg1) {
      try {
         ++field11466;
         class91.field1167 = arg0;
         if (arg1 != -25083) {
            field11471 = null;
         }

         class310.field4409.method5451(-116);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11473[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(IZILjava/lang/String;I[B)I",
      line = 78
   )
   public static final int method5664(int arg0, boolean arg1, int arg2, String arg3, int arg4, byte[] arg5) {
      int var6 = client.field4530;

      try {
         ++field11465;
         int var7 = arg4 - arg2;
         int var8 = 0;
         char var10000;
         if (var6 != 0) {
            var10000 = arg3.charAt(arg2 + var8);
         } else if (var8 >= var7) {
            var10000 = (char)arg1;
            if (var6 == 0) {
               if (arg1 != 1) {
                  field11472 = 15;
               }

               return var7;
            }
         } else {
            var10000 = arg3.charAt(arg2 + var8);
         }

         while(true) {
            label294: {
               char var9 = var10000;
               if (var9 > 0 && ~var9 > -129 || ~var9 <= -161 && ~var9 >= -256) {
                  arg5[arg0 + var8] = (byte)var9;
                  if (var6 == 0) {
                     break label294;
                  }
               }

               if (var9 != 8364) {
                  if (~var9 != -8219) {
                     label280: {
                        if (var9 == 402) {
                           arg5[arg0 + var8] = -125;
                           if (var6 == 0) {
                              break label280;
                           }
                        }

                        if (var9 == 8222) {
                           arg5[arg0 + var8] = -124;
                           if (var6 == 0) {
                              break label280;
                           }
                        }

                        if (~var9 == -8231) {
                           arg5[arg0 - -var8] = -123;
                           if (var6 == 0) {
                              break label280;
                           }
                        }

                        if (var9 != 8224) {
                           if (~var9 != -8226) {
                              if (~var9 != -711) {
                                 if (var9 == 8240) {
                                    arg5[arg0 + var8] = -119;
                                    if (var6 == 0) {
                                       break label280;
                                    }
                                 }

                                 if (~var9 == -353) {
                                    arg5[arg0 + var8] = -118;
                                    if (var6 == 0) {
                                       break label280;
                                    }
                                 }

                                 if (~var9 == -8250) {
                                    arg5[arg0 + var8] = -117;
                                    if (var6 == 0) {
                                       break label280;
                                    }
                                 }

                                 if (var9 == 338) {
                                    arg5[arg0 + var8] = -116;
                                    if (var6 == 0) {
                                       break label280;
                                    }
                                 }

                                 if (var9 != 381) {
                                    if (~var9 == -8217) {
                                       arg5[arg0 + var8] = -111;
                                       if (var6 == 0) {
                                          break label280;
                                       }
                                    }

                                    if (~var9 != -8218) {
                                       if (~var9 != -8221) {
                                          if (var9 == 8221) {
                                             arg5[arg0 - -var8] = -108;
                                             if (var6 == 0) {
                                                break label280;
                                             }
                                          }

                                          if (~var9 != -8227) {
                                             if (~var9 == -8212) {
                                                arg5[arg0 + var8] = -106;
                                                if (var6 == 0) {
                                                   break label280;
                                                }
                                             }

                                             if (~var9 != -8213) {
                                                if (var9 == 732) {
                                                   arg5[arg0 + var8] = -104;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (var9 == 8482) {
                                                   arg5[arg0 + var8] = -103;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (var9 == 353) {
                                                   arg5[arg0 + var8] = -102;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (~var9 == -8251) {
                                                   arg5[arg0 + var8] = -101;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (var9 == 339) {
                                                   arg5[arg0 + var8] = -100;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (var9 == 382) {
                                                   arg5[arg0 - -var8] = -98;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                if (~var9 != -377) {
                                                   arg5[arg0 + var8] = 63;
                                                   if (var6 == 0) {
                                                      break label280;
                                                   }
                                                }

                                                arg5[arg0 + var8] = -97;
                                                if (var6 == 0) {
                                                   break label280;
                                                }
                                             }

                                             arg5[arg0 + var8] = -105;
                                             if (var6 == 0) {
                                                break label280;
                                             }
                                          }

                                          arg5[arg0 - -var8] = -107;
                                          if (var6 == 0) {
                                             break label280;
                                          }
                                       }

                                       arg5[arg0 + var8] = -109;
                                       if (var6 == 0) {
                                          break label280;
                                       }
                                    }

                                    arg5[arg0 + var8] = -110;
                                    if (var6 == 0) {
                                       break label280;
                                    }
                                 }

                                 arg5[arg0 - -var8] = -114;
                                 if (var6 == 0) {
                                    break label280;
                                 }
                              }

                              arg5[arg0 - -var8] = -120;
                              if (var6 == 0) {
                                 break label280;
                              }
                           }

                           arg5[arg0 + var8] = -121;
                           if (var6 == 0) {
                              break label280;
                           }
                        }

                        arg5[arg0 - -var8] = -122;
                        if (var6 != 0) {
                           arg5[arg0 + var8] = -126;
                           if (var6 != 0) {
                              arg5[arg0 + var8] = -128;
                           }
                        }
                     }
                  } else {
                     arg5[arg0 + var8] = -126;
                     if (var6 != 0) {
                        arg5[arg0 + var8] = -128;
                     }
                  }
               } else {
                  arg5[arg0 + var8] = -128;
               }
            }

            ++var8;
            if (var8 >= var7) {
               var10000 = (char)arg1;
               if (var6 == 0) {
                  if (arg1 != 1) {
                     field11472 = 15;
                  }

                  return var7;
               }
            } else {
               var10000 = arg3.charAt(arg2 + var8);
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11473[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11473[3] : field11473[2]) + ',' + arg4 + ',' + (arg5 != null ? field11473[3] : field11473[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5666(char[] arg0) {
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
            var10005 = 90;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
