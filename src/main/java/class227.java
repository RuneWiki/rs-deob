import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class227 {
   @OriginalMember(
      owner = "client!hv",
      name = "g",
      descriptor = "I"
   )
   private int field2846 = 0;
   @OriginalMember(
      owner = "client!hv",
      name = "j",
      descriptor = "[Lcm;"
   )
   public class673[] field2835;
   @OriginalMember(
      owner = "client!hv",
      name = "p",
      descriptor = "I"
   )
   public int field2839;
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2849 = new String[]{method1820(method1819("\u001e\t7\u001e$")), method1820(method1819("\u001e\t7\u0016$")), method1820(method1819("\u001e\t7\u001b$")), method1820(method1819("\u001e\t7\u001a$")), method1820(method1819("\u0018\nu3")), method1820(method1819("\rQ7qq")), method1820(method1819("\u001e\t7\u0019$")), method1820(method1819("\u001e\t7\u001d$")), method1820(method1819("\u001e\t7ce\u0018\u0016ma$")), method1820(method1819("\u001e\t7\u0015$")), method1820(method1819("\u001e\t7\u0017$")), method1820(method1819("\u001e\t7\u001c$")), method1820(method1819("\u001e\t7\u0018$")), method1820(method1819("\u001e\t7\u0013$")), method1820(method1819("\u001e\t7\u0014$"))};
   @OriginalMember(
      owner = "client!hv",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field2837 = new class418(131, 1);
   @OriginalMember(
      owner = "client!hv",
      name = "k",
      descriptor = "I"
   )
   public static int field2847 = -1;
   @OriginalMember(
      owner = "client!hv",
      name = "t",
      descriptor = "I"
   )
   public static int field2828;
   @OriginalMember(
      owner = "client!hv",
      name = "i",
      descriptor = "I"
   )
   public static int field2829;
   @OriginalMember(
      owner = "client!hv",
      name = "e",
      descriptor = "I"
   )
   public static int field2830;
   @OriginalMember(
      owner = "client!hv",
      name = "o",
      descriptor = "I"
   )
   public static int field2831;
   @OriginalMember(
      owner = "client!hv",
      name = "m",
      descriptor = "I"
   )
   public static int field2832;
   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "I"
   )
   public static int field2833;
   @OriginalMember(
      owner = "client!hv",
      name = "q",
      descriptor = "I"
   )
   public static int field2834;
   @OriginalMember(
      owner = "client!hv",
      name = "r",
      descriptor = "I"
   )
   public static int field2836;
   @OriginalMember(
      owner = "client!hv",
      name = "u",
      descriptor = "I"
   )
   public static int field2838;
   @OriginalMember(
      owner = "client!hv",
      name = "n",
      descriptor = "I"
   )
   public static int field2842;
   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "I"
   )
   public static int field2843;
   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "I"
   )
   public static int field2848;
   @OriginalMember(
      owner = "client!hv",
      name = "f",
      descriptor = "J"
   )
   private long field2841;
   @OriginalMember(
      owner = "client!hv",
      name = "s",
      descriptor = "Lww;"
   )
   public static class339 field2844;
   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "Lcm;"
   )
   private class673 field2840;
   @OriginalMember(
      owner = "client!hv",
      name = "h",
      descriptor = "Lcm;"
   )
   private class673 field2845;

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1807(int arg0) {
      try {
         ++field2843;
         if (arg0 != -1) {
            this.method1812(5);
         }

         return this.field2839;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2849[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(JLcm;I)V"
   )
   public final void method1808(long arg0, class673 arg1, int arg2) {
      try {
         ++field2838;
         if (arg1.field9975 != null) {
            arg1.method4924(-2970);
         }

         class673 var5 = this.field2835[(int)(arg0 & (long)(this.field2839 - 1))];
         if (arg2 != 26459) {
            this.field2840 = null;
         }

         arg1.field9975 = var5.field9975;
         arg1.field9972 = var5;
         arg1.field9975.field9972 = arg1;
         arg1.field9965 = arg0;
         arg1.field9972.field9975 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2849[6] + arg0 + ',' + (arg1 != null ? field2849[5] : field2849[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1809(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         int var3 = 0;
         class673 var4;
         if (var2) {
            var4 = this.field2835[var3];
         } else {
            if (this.field2839 <= var3) {
               if (!arg0) {
                  this.field2839 = -71;
               }

               ++field2830;
               this.field2845 = null;
               this.field2840 = null;
               return;
            }

            var4 = this.field2835[var3];
         }

         while(true) {
            while(true) {
               class673 var5 = var4.field9972;
               if (var4 != var5) {
                  var5.method4924(-2970);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (this.field2839 <= var3) {
               if (!arg0) {
                  this.field2839 = -71;
               }

               ++field2830;
               this.field2845 = null;
               this.field2840 = null;
               return;
            }

            var4 = this.field2835[var3];
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2849[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1810(byte arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != -114) {
            this.method1814(126, (class673[])null);
         }

         ++field2834;
         int var3 = 0;
         int var4 = 0;
         if (!var2 && var4 >= this.field2839) {
            return var3;
         } else {
            do {
               class673 var5 = this.field2835[var4];
               class673 var6 = var5.field9972;
               if (var2) {
                  var6 = var6.field9972;
                  ++var3;
               }

               while(true) {
                  while(var5 != var6) {
                     var6 = var6.field9972;
                     ++var3;
                  }

                  if (!var2) {
                     ++var4;
                     break;
                  }

                  ++var3;
               }
            } while(var4 < this.field2839);

            return var3;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2849[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method1811(int param0, boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)Lcm;"
   )
   public final class673 method1812(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field2831;
         if (~this.field2846 < -1 && this.field2835[this.field2846 + -1] != this.field2845) {
            class673 var3 = this.field2845;
            this.field2845 = var3.field9972;
            return var3;
         } else {
            if (arg0 != 353) {
               this.method1816((byte)89);
               if (!var2 && this.field2839 <= this.field2846) {
                  return null;
               }
            } else if (this.field2839 <= this.field2846) {
               return null;
            }

            do {
               class673 var4 = this.field2835[this.field2846++].field9972;
               class673 var10000 = this.field2835[this.field2846 + -1];

               while(var10000 != var4) {
                  this.field2845 = var4.field9972;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            } while(this.field2839 > this.field2846);

            return null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2849[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1813(byte arg0) {
      try {
         if (arg0 != -104) {
            method1811(56, false, 83, -6, 100, 110);
         }

         field2837 = null;
         field2844 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2849[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I[Lcm;)I"
   )
   public final int method1814(int arg0, class673[] arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2832;
         int var4 = arg0;
         int var5 = 0;
         if (!var3 && var5 >= this.field2839) {
            return arg0;
         } else {
            do {
               class673 var6 = this.field2835[var5];
               class673 var7 = var6.field9972;
               if (var3) {
                  arg1[var4++] = var7;
                  var7 = var7.field9972;
               }

               while(true) {
                  while(var6 != var7) {
                     arg1[var4++] = var7;
                     var7 = var7.field9972;
                  }

                  if (!var3) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field9972;
               }
            } while(var5 < this.field2839);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field2849[14] + arg0 + ',' + (arg1 != null ? field2849[5] : field2849[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(ILjava/lang/String;II[BI)I"
   )
   public static final int method1815(int arg0, String arg1, int arg2, int arg3, byte[] arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field2829;
         if (arg3 != -26257) {
            return -83;
         } else {
            int var7 = -arg0 + arg2;
            int var8 = 0;
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
               label292: {
                  int var9 = var10000;
                  if (var9 > 0 && ~var9 > -129 || var9 >= 160 && ~var9 >= -256) {
                     arg4[arg5 + var8] = (byte)var9;
                     if (!var6) {
                        break label292;
                     }
                  }

                  if (var9 != 8364) {
                     label276: {
                        if (var9 == 8218) {
                           arg4[arg5 + var8] = -126;
                           if (!var6) {
                              break label276;
                           }
                        }

                        if (var9 == 402) {
                           arg4[arg5 + var8] = -125;
                           if (!var6) {
                              break label276;
                           }
                        }

                        if (var9 == 8222) {
                           arg4[arg5 - -var8] = -124;
                           if (!var6) {
                              break label276;
                           }
                        }

                        if (~var9 == -8231) {
                           arg4[arg5 + var8] = -123;
                           if (!var6) {
                              break label276;
                           }
                        }

                        if (var9 != 8224) {
                           label277: {
                              if (var9 == 8225) {
                                 arg4[arg5 + var8] = -121;
                                 if (!var6) {
                                    break label277;
                                 }
                              }

                              if (var9 != 710) {
                                 if (var9 != 8240) {
                                    if (var9 != 352) {
                                       if (~var9 == -8250) {
                                          arg4[arg5 + var8] = -117;
                                          if (!var6) {
                                             break label277;
                                          }
                                       }

                                       if (~var9 == -339) {
                                          arg4[arg5 + var8] = -116;
                                          if (!var6) {
                                             break label277;
                                          }
                                       }

                                       if (var9 == 381) {
                                          arg4[arg5 + var8] = -114;
                                          if (!var6) {
                                             break label277;
                                          }
                                       }

                                       if (var9 != 8216) {
                                          if (~var9 != -8218) {
                                             if (~var9 == -8221) {
                                                arg4[arg5 + var8] = -109;
                                                if (!var6) {
                                                   break label277;
                                                }
                                             }

                                             if (var9 != 8221) {
                                                if (~var9 == -8227) {
                                                   arg4[arg5 - -var8] = -107;
                                                   if (!var6) {
                                                      break label277;
                                                   }
                                                }

                                                if (var9 != 8211) {
                                                   if (~var9 == -8213) {
                                                      arg4[arg5 + var8] = -105;
                                                      if (!var6) {
                                                         break label277;
                                                      }
                                                   }

                                                   if (var9 != 732) {
                                                      if (var9 != 8482) {
                                                         if (var9 == 353) {
                                                            arg4[arg5 + var8] = -102;
                                                            if (!var6) {
                                                               break label277;
                                                            }
                                                         }

                                                         if (var9 != 8250) {
                                                            if (~var9 != -340) {
                                                               if (var9 != 382) {
                                                                  if (var9 == 376) {
                                                                     arg4[arg5 - -var8] = -97;
                                                                     if (!var6) {
                                                                        break label277;
                                                                     }
                                                                  }

                                                                  arg4[arg5 - -var8] = 63;
                                                                  if (!var6) {
                                                                     break label277;
                                                                  }
                                                               }

                                                               arg4[arg5 - -var8] = -98;
                                                               if (!var6) {
                                                                  break label277;
                                                               }
                                                            }

                                                            arg4[arg5 + var8] = -100;
                                                            if (!var6) {
                                                               break label277;
                                                            }
                                                         }

                                                         arg4[arg5 + var8] = -101;
                                                         if (!var6) {
                                                            break label277;
                                                         }
                                                      }

                                                      arg4[arg5 + var8] = -103;
                                                      if (!var6) {
                                                         break label277;
                                                      }
                                                   }

                                                   arg4[arg5 + var8] = -104;
                                                   if (!var6) {
                                                      break label277;
                                                   }
                                                }

                                                arg4[arg5 + var8] = -106;
                                                if (!var6) {
                                                   break label277;
                                                }
                                             }

                                             arg4[arg5 + var8] = -108;
                                             if (!var6) {
                                                break label277;
                                             }
                                          }

                                          arg4[arg5 + var8] = -110;
                                          if (!var6) {
                                             break label277;
                                          }
                                       }

                                       arg4[arg5 + var8] = -111;
                                       if (!var6) {
                                          break label277;
                                       }
                                    }

                                    arg4[arg5 + var8] = -118;
                                    if (!var6) {
                                       break label277;
                                    }
                                 }

                                 arg4[arg5 + var8] = -119;
                                 if (!var6) {
                                    break label277;
                                 }
                              }

                              arg4[arg5 + var8] = -120;
                              if (var6) {
                                 arg4[arg5 + var8] = -122;
                                 if (var6) {
                                    arg4[arg5 - -var8] = -128;
                                 }
                              }
                           }
                        } else {
                           arg4[arg5 + var8] = -122;
                           if (var6) {
                              arg4[arg5 - -var8] = -128;
                           }
                        }
                     }
                  } else {
                     arg4[arg5 - -var8] = -128;
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
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2849[13] + arg0 + ',' + (arg1 != null ? field2849[5] : field2849[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2849[5] : field2849[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(B)Lcm;"
   )
   public final class673 method1816(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field2836;
         if (this.field2840 == null) {
            return null;
         } else {
            class673 var3 = this.field2835[(int)(this.field2841 & (long)(this.field2839 - 1))];
            class673 var4;
            if (var2) {
               if (this.field2840.field9965 == this.field2841) {
                  var4 = this.field2840;
                  this.field2840 = this.field2840.field9972;
                  return var4;
               }

               this.field2840 = this.field2840.field9972;
            }

            while(true) {
               while(this.field2840 != var3) {
                  if (this.field2840.field9965 == this.field2841) {
                     var4 = this.field2840;
                     this.field2840 = this.field2840.field9972;
                     return var4;
                  }

                  this.field2840 = this.field2840.field9972;
               }

               int var5 = -117 % ((38 - arg0) / 38);
               this.field2840 = null;
               if (!var2) {
                  return null;
               }

               this.field2840 = this.field2840.field9972;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2849[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "(I)Lcm;"
   )
   public final class673 method1817(int arg0) {
      try {
         ++field2828;
         this.field2846 = 0;
         if (arg0 > -20) {
            field2847 = -64;
         }

         return this.method1812(353);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2849[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(IJ)Lcm;"
   )
   public final class673 method1818(int arg0, long arg1) {
      boolean var4 = client.field1481;

      try {
         this.field2841 = arg1;
         ++field2842;
         class673 var5 = this.field2835[(int)(arg1 & (long)(this.field2839 + arg0))];
         this.field2840 = var5.field9972;
         class673 var6;
         if (var4) {
            if (this.field2840.field9965 == arg1) {
               var6 = this.field2840;
               this.field2840 = this.field2840.field9972;
               return var6;
            }

            this.field2840 = this.field2840.field9972;
         }

         while(true) {
            while(this.field2840 != var5) {
               if (this.field2840.field9965 == arg1) {
                  var6 = this.field2840;
                  this.field2840 = this.field2840.field9972;
                  return var6;
               }

               this.field2840 = this.field2840.field9972;
            }

            this.field2840 = null;
            if (!var4) {
               return null;
            }

            this.field2840 = this.field2840.field9972;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2849[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class227(int arg0) {
      try {
         this.field2835 = new class673[arg0];
         this.field2839 = arg0;

         for(int var2 = 0; arg0 > var2; ++var2) {
            class673 var3 = this.field2835[var2] = new class673();
            var3.field9972 = var3;
            var3.field9975 = var3;
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2849[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1819(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1820(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
