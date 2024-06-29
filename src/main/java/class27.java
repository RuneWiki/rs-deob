import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 {
   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field342 = new String[]{method231(method230("j;J)")), method231(method230("\u007f`\bk\u0004")), method231(method230("b,Gk8,")), method231(method230("b,Gk=,")), method231(method230("b,Gk:,")), method231(method230("b,Gk;,"))};
   @OriginalMember(
      owner = "client!fba",
      name = "d",
      descriptor = "I"
   )
   public static int field336;
   @OriginalMember(
      owner = "client!fba",
      name = "e",
      descriptor = "I"
   )
   public static int field337;
   @OriginalMember(
      owner = "client!fba",
      name = "c",
      descriptor = "I"
   )
   public static int field338;
   @OriginalMember(
      owner = "client!fba",
      name = "f",
      descriptor = "I"
   )
   public static int field339;
   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "I"
   )
   public static int field340;
   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "I"
   )
   public static int field341;

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method226(byte arg0) {
      try {
         int var1 = 98 / ((-64 - arg0) / 32);
         ++field340;
         return 16;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field342[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(ILjava/lang/String;IIB[B)I"
   )
   public static final int method227(int arg0, String arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
      boolean var6 = client.field4273;

      try {
         ++field341;
         int var7 = -arg0 + arg3;
         int var8 = 0;
         int var9 = 8 / ((-40 - arg4) / 56);
         int var10000;
         if (var6) {
            var10000 = arg1.charAt(arg0 + var8);
         } else if (~var8 <= ~var7) {
            var10000 = var7;
            if (!var6) {
               return var7;
            }
         } else {
            var10000 = arg1.charAt(arg0 + var8);
         }

         while(true) {
            label284: {
               int var10 = var10000;
               if (~var10 < -1 && ~var10 > -129 || ~var10 <= -161 && var10 <= 255) {
                  arg5[arg2 - -var8] = (byte)var10;
                  if (!var6) {
                     break label284;
                  }
               }

               if (var10 == 8364) {
                  arg5[arg2 + var8] = -128;
                  if (!var6) {
                     break label284;
                  }
               }

               if (~var10 == -8219) {
                  arg5[arg2 - -var8] = -126;
                  if (!var6) {
                     break label284;
                  }
               }

               if (var10 == 402) {
                  arg5[arg2 + var8] = -125;
                  if (!var6) {
                     break label284;
                  }
               }

               if (var10 != 8222) {
                  label270: {
                     if (~var10 == -8231) {
                        arg5[arg2 + var8] = -123;
                        if (!var6) {
                           break label270;
                        }
                     }

                     if (var10 == 8224) {
                        arg5[arg2 + var8] = -122;
                        if (!var6) {
                           break label270;
                        }
                     }

                     if (var10 == 8225) {
                        arg5[arg2 + var8] = -121;
                        if (!var6) {
                           break label270;
                        }
                     }

                     if (var10 != 710) {
                        label271: {
                           if (~var10 == -8241) {
                              arg5[arg2 + var8] = -119;
                              if (!var6) {
                                 break label271;
                              }
                           }

                           if (var10 != 352) {
                              if (~var10 != -8250) {
                                 if (var10 != 338) {
                                    if (~var10 == -382) {
                                       arg5[arg2 + var8] = -114;
                                       if (!var6) {
                                          break label271;
                                       }
                                    }

                                    if (var10 != 8216) {
                                       if (~var10 == -8218) {
                                          arg5[arg2 - -var8] = -110;
                                          if (!var6) {
                                             break label271;
                                          }
                                       }

                                       if (var10 != 8220) {
                                          if (~var10 != -8222) {
                                             if (~var10 != -8227) {
                                                if (~var10 != -8212) {
                                                   if (~var10 == -8213) {
                                                      arg5[arg2 + var8] = -105;
                                                      if (!var6) {
                                                         break label271;
                                                      }
                                                   }

                                                   if (~var10 != -733) {
                                                      if (~var10 != -8483) {
                                                         if (~var10 == -354) {
                                                            arg5[arg2 - -var8] = -102;
                                                            if (!var6) {
                                                               break label271;
                                                            }
                                                         }

                                                         if (~var10 == -8251) {
                                                            arg5[arg2 + var8] = -101;
                                                            if (!var6) {
                                                               break label271;
                                                            }
                                                         }

                                                         if (~var10 != -340) {
                                                            if (~var10 == -383) {
                                                               arg5[arg2 - -var8] = -98;
                                                               if (!var6) {
                                                                  break label271;
                                                               }
                                                            }

                                                            if (var10 == 376) {
                                                               arg5[arg2 + var8] = -97;
                                                               if (!var6) {
                                                                  break label271;
                                                               }
                                                            }

                                                            arg5[arg2 + var8] = 63;
                                                            if (!var6) {
                                                               break label271;
                                                            }
                                                         }

                                                         arg5[arg2 - -var8] = -100;
                                                         if (!var6) {
                                                            break label271;
                                                         }
                                                      }

                                                      arg5[arg2 + var8] = -103;
                                                      if (!var6) {
                                                         break label271;
                                                      }
                                                   }

                                                   arg5[arg2 + var8] = -104;
                                                   if (!var6) {
                                                      break label271;
                                                   }
                                                }

                                                arg5[arg2 + var8] = -106;
                                                if (!var6) {
                                                   break label271;
                                                }
                                             }

                                             arg5[arg2 - -var8] = -107;
                                             if (!var6) {
                                                break label271;
                                             }
                                          }

                                          arg5[arg2 + var8] = -108;
                                          if (!var6) {
                                             break label271;
                                          }
                                       }

                                       arg5[arg2 - -var8] = -109;
                                       if (!var6) {
                                          break label271;
                                       }
                                    }

                                    arg5[arg2 + var8] = -111;
                                    if (!var6) {
                                       break label271;
                                    }
                                 }

                                 arg5[arg2 + var8] = -116;
                                 if (!var6) {
                                    break label271;
                                 }
                              }

                              arg5[arg2 + var8] = -117;
                              if (!var6) {
                                 break label271;
                              }
                           }

                           arg5[arg2 + var8] = -118;
                           if (var6) {
                              arg5[arg2 - -var8] = -120;
                              if (var6) {
                                 arg5[arg2 + var8] = -124;
                              }
                           }
                        }
                     } else {
                        arg5[arg2 - -var8] = -120;
                        if (var6) {
                           arg5[arg2 + var8] = -124;
                        }
                     }
                  }
               } else {
                  arg5[arg2 + var8] = -124;
               }
            }

            ++var8;
            if (~var8 <= ~var7) {
               var10000 = var7;
               if (!var6) {
                  return var7;
               }
            } else {
               var10000 = arg1.charAt(arg0 + var8);
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field342[2] + arg0 + ',' + (arg1 != null ? field342[1] : field342[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field342[1] : field342[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IB[Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method228(int arg0, byte arg1, String[] arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field339;
         if (arg0 == 0) {
            return "";
         } else if (~arg0 == -2) {
            String var5 = arg2[arg3];
            return var5 == null ? field342[0] : var5.toString();
         } else {
            int var6 = arg0 - -arg3;
            if (arg1 != 52) {
               method226((byte)11);
            }

            int var7 = 0;
            int var8 = arg3;
            if (var4 || var6 > arg3) {
               do {
                  String var9 = arg2[var8];
                  if (var9 == null) {
                     var7 += 4;
                     if (!var4) {
                        ++var8;
                        continue;
                     }
                  }

                  var7 += var9.length();
                  ++var8;
               } while(var6 > var8);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = arg3;
            String var10000;
            if (var4) {
               var10000 = arg2[arg3];
            } else if (~var6 >= ~arg3) {
               var10000 = var10.toString();
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = arg2[arg3];
            }

            while(true) {
               String var12 = var10000;
               if (var12 == null) {
                  var10.append(field342[0]);
                  if (var4) {
                     var10.append(var12);
                     ++var11;
                  } else {
                     ++var11;
                  }
               } else {
                  var10.append(var12);
                  ++var11;
               }

               if (~var6 >= ~var11) {
                  var10000 = var10.toString();
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = arg2[var11];
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field342[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field342[1] : field342[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method229(int arg0, int arg1) {
      try {
         if (arg1 > -65) {
            field336 = 102;
         }

         ++field337;
         class446 var2 = class635.method4607(112, (long)arg0, 3);
         var2.method3312(-117);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field342[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method230(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method231(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
