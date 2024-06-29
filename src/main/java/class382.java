import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class382 extends class775 {
   @OriginalMember(
      owner = "client!rt",
      name = "B",
      descriptor = "I"
   )
   private int field6039 = -1;
   @OriginalMember(
      owner = "client!rt",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6040 = new String[]{method3108(method3107("g;T7;")), method3108(method3107("g;T6;")), method3108(method3107("naT]n")), method3108(method3107("{:\u0016\u001f")), method3108(method3107("g;T2;")), method3108(method3107("g;T1;")), method3108(method3107("g;T0;"))};
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "I"
   )
   public static int field6031 = 0;
   @OriginalMember(
      owner = "client!rt",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field6033 = new int[3];
   @OriginalMember(
      owner = "client!rt",
      name = "w",
      descriptor = "Luk;"
   )
   public static class498 field6035 = new class498(26, 10);
   @OriginalMember(
      owner = "client!rt",
      name = "v",
      descriptor = "I"
   )
   public static int field6032;
   @OriginalMember(
      owner = "client!rt",
      name = "y",
      descriptor = "I"
   )
   public static int field6034;
   @OriginalMember(
      owner = "client!rt",
      name = "t",
      descriptor = "I"
   )
   public static int field6036;
   @OriginalMember(
      owner = "client!rt",
      name = "x",
      descriptor = "I"
   )
   public static int field6037;
   @OriginalMember(
      owner = "client!rt",
      name = "A",
      descriptor = "I"
   )
   public static int field6038;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IIILjava/lang/String;[BI)I"
   )
   public static final int method3104(int arg0, int arg1, int arg2, String arg3, byte[] arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field6037;
         int var7 = -arg5 + arg0;
         int var8 = 0;
         int var10000;
         if (var6) {
            var10000 = arg3.charAt(arg5 + var8);
         } else if (var7 <= var8) {
            var10000 = arg2;
            if (!var6) {
               if (arg2 != 320) {
                  return 89;
               }

               return var7;
            }
         } else {
            var10000 = arg3.charAt(arg5 + var8);
         }

         while(true) {
            int var9 = var10000;
            if (var9 > 0 && var9 < 128) {
               arg4[arg1 + var8] = (byte)var9;
            } else if (~var9 <= -161 && ~var9 >= -256) {
               arg4[arg1 + var8] = (byte)var9;
            } else if (~var9 != -8365) {
               label261: {
                  if (var9 != 8218) {
                     if (var9 != 402) {
                        if (var9 != 8222) {
                           if (var9 == 8230) {
                              arg4[arg1 + var8] = -123;
                              if (!var6) {
                                 break label261;
                              }
                           }

                           if (var9 == 8224) {
                              arg4[arg1 + var8] = -122;
                              if (!var6) {
                                 break label261;
                              }
                           }

                           if (~var9 == -8226) {
                              arg4[arg1 + var8] = -121;
                              if (!var6) {
                                 break label261;
                              }
                           }

                           if (~var9 != -711) {
                              if (var9 == 8240) {
                                 arg4[arg1 + var8] = -119;
                                 if (!var6) {
                                    break label261;
                                 }
                              }

                              if (~var9 == -353) {
                                 arg4[arg1 + var8] = -118;
                                 if (!var6) {
                                    break label261;
                                 }
                              }

                              if (var9 == 8249) {
                                 arg4[arg1 + var8] = -117;
                                 if (!var6) {
                                    break label261;
                                 }
                              }

                              if (~var9 != -339) {
                                 if (~var9 == -382) {
                                    arg4[arg1 + var8] = -114;
                                    if (!var6) {
                                       break label261;
                                    }
                                 }

                                 if (var9 != 8216) {
                                    if (var9 != 8217) {
                                       if (~var9 == -8221) {
                                          arg4[arg1 + var8] = -109;
                                          if (!var6) {
                                             break label261;
                                          }
                                       }

                                       if (var9 != 8221) {
                                          if (var9 != 8226) {
                                             if (var9 != 8211) {
                                                if (var9 != 8212) {
                                                   if (~var9 == -733) {
                                                      arg4[arg1 + var8] = -104;
                                                      if (!var6) {
                                                         break label261;
                                                      }
                                                   }

                                                   if (~var9 != -8483) {
                                                      if (~var9 != -354) {
                                                         if (~var9 != -8251) {
                                                            if (~var9 == -340) {
                                                               arg4[arg1 + var8] = -100;
                                                               if (!var6) {
                                                                  break label261;
                                                               }
                                                            }

                                                            if (var9 != 382) {
                                                               if (~var9 != -377) {
                                                                  arg4[arg1 + var8] = 63;
                                                                  if (!var6) {
                                                                     break label261;
                                                                  }
                                                               }

                                                               arg4[arg1 + var8] = -97;
                                                               if (!var6) {
                                                                  break label261;
                                                               }
                                                            }

                                                            arg4[arg1 + var8] = -98;
                                                            if (!var6) {
                                                               break label261;
                                                            }
                                                         }

                                                         arg4[arg1 + var8] = -101;
                                                         if (!var6) {
                                                            break label261;
                                                         }
                                                      }

                                                      arg4[arg1 + var8] = -102;
                                                      if (!var6) {
                                                         break label261;
                                                      }
                                                   }

                                                   arg4[arg1 - -var8] = -103;
                                                   if (!var6) {
                                                      break label261;
                                                   }
                                                }

                                                arg4[arg1 + var8] = -105;
                                                if (!var6) {
                                                   break label261;
                                                }
                                             }

                                             arg4[arg1 + var8] = -106;
                                             if (!var6) {
                                                break label261;
                                             }
                                          }

                                          arg4[arg1 + var8] = -107;
                                          if (!var6) {
                                             break label261;
                                          }
                                       }

                                       arg4[arg1 - -var8] = -108;
                                       if (!var6) {
                                          break label261;
                                       }
                                    }

                                    arg4[arg1 + var8] = -110;
                                    if (!var6) {
                                       break label261;
                                    }
                                 }

                                 arg4[arg1 + var8] = -111;
                                 if (!var6) {
                                    break label261;
                                 }
                              }

                              arg4[arg1 - -var8] = -116;
                              if (!var6) {
                                 break label261;
                              }
                           }

                           arg4[arg1 + var8] = -120;
                           if (!var6) {
                              break label261;
                           }
                        }

                        arg4[arg1 + var8] = -124;
                        if (!var6) {
                           break label261;
                        }
                     }

                     arg4[arg1 - -var8] = -125;
                     if (!var6) {
                        break label261;
                     }
                  }

                  arg4[arg1 + var8] = -126;
                  if (var6) {
                     arg4[arg1 + var8] = -128;
                     if (var6) {
                        arg4[arg1 + var8] = (byte)var9;
                     }
                  }
               }
            } else {
               arg4[arg1 + var8] = -128;
               if (var6) {
                  arg4[arg1 + var8] = (byte)var9;
               }
            }

            ++var8;
            if (var7 <= var8) {
               var10000 = arg2;
               if (!var6) {
                  if (arg2 != 320) {
                     return 89;
                  }

                  return var7;
               }
            } else {
               var10000 = arg3.charAt(arg5 + var8);
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6040[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6040[2] : field6040[3]) + ',' + (arg4 != null ? field6040[2] : field6040[3]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         int var3 = -40 % ((arg1 - -84) / 34);
         ++field6032;
         this.field6039 = arg0.method2848(-118);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6040[6] + (arg0 != null ? field6040[2] : field6040[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method3105(int arg0, long arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6034;
         int var4 = class640.field9280;
         if (class674.field10031 != var4) {
            int var6;
            label81: {
               int var5 = -class674.field10031 + var4;
               var6 = (int)((long)var5 * arg1 / 320L);
               if (~var5 < -1) {
                  if (~var6 == -1) {
                     var6 = 1;
                     if (!var3) {
                        break label81;
                     }
                  }

                  if (~var5 <= ~var6) {
                     break label81;
                  }

                  var6 = var5;
                  if (!var3) {
                     break label81;
                  }
               }

               if (var6 != 0) {
                  if (~var5 >= ~var6) {
                     break label81;
                  }

                  var6 = var5;
                  if (!var3) {
                     break label81;
                  }
               }

               var6 = -1;
            }

            class674.field10031 += var6;
         }

         int var7 = class520.field7902;
         class417.field6456 += (float)arg1 * class730.field10902 / 40.0F * 8.0F;
         if (~class149.field2262 != ~var7) {
            int var9;
            label83: {
               int var8 = -class149.field2262 + var7;
               var9 = (int)((long)var8 * arg1 / 320L);
               if (var8 <= 0) {
                  if (var9 != 0) {
                     if (var8 <= var9) {
                        break label83;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label83;
                     }
                  }

                  var9 = -1;
                  if (!var3) {
                     break label83;
                  }
               }

               if (~var9 != -1) {
                  if (var8 >= var9) {
                     break label83;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label83;
                  }
               }

               var9 = 1;
            }

            class149.field2262 += var9;
         }

         class357.field5520 += (float)arg1 * class156.field2327 / 40.0F * 8.0F;
         class109.method1042(arg0 + 18536);
         if (arg0 != 1259) {
            field6035 = null;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6040[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         arg0.method1926(-12114, this.field6039);
         int var3 = -66 / ((-23 - arg1) / 45);
         ++field6036;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6040[4] + (arg0 != null ? field6040[2] : field6040[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3106(byte arg0) {
      try {
         if (arg0 == -86) {
            field6035 = null;
            field6033 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6040[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3107(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3108(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
