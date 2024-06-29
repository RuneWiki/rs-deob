import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class259 {
   @OriginalMember(
      owner = "client!jr",
      name = "n",
      descriptor = "I"
   )
   private int field3974 = 0;
   @OriginalMember(
      owner = "client!jr",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field3978 = new byte[64];
   @OriginalMember(
      owner = "client!jr",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field3976 = new byte[32];
   @OriginalMember(
      owner = "client!jr",
      name = "k",
      descriptor = "[J"
   )
   private long[] field3977 = new long[8];
   @OriginalMember(
      owner = "client!jr",
      name = "r",
      descriptor = "[J"
   )
   private long[] field3979 = new long[8];
   @OriginalMember(
      owner = "client!jr",
      name = "p",
      descriptor = "[J"
   )
   private long[] field3972 = new long[8];
   @OriginalMember(
      owner = "client!jr",
      name = "f",
      descriptor = "[J"
   )
   private long[] field3966 = new long[8];
   @OriginalMember(
      owner = "client!jr",
      name = "m",
      descriptor = "I"
   )
   private int field3981 = 0;
   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "[J"
   )
   private long[] field3980 = new long[8];
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3982 = new String[]{method2230(method2229(".\u0012az\u0019")), method2230(method2229(".\u0012a{\u0019")), method2230(method2229("*\u0015#R")), method2230(method2229("?Na\u0010L")), method2230(method2229(".\u0012a}\u0019")), method2230(method2229("\b/\bwrd%\u001dl~\u0016")), method2230(method2229(".\u0012a|\u0019")), method2230(method2229(".\u0012ay\u0019")), method2230(method2229("d\\,Q]y\u0006)XW\"\u0006q\u0000")), method2230(method2229(".\u0012a\u007f\u0019")), method2230(method2229(".\u0012av\u0019")), method2230(method2229(".\u0012ax\u0019"))};
   @OriginalMember(
      owner = "client!jr",
      name = "h",
      descriptor = "I"
   )
   public static int field3965;
   @OriginalMember(
      owner = "client!jr",
      name = "i",
      descriptor = "I"
   )
   public static int field3967;
   @OriginalMember(
      owner = "client!jr",
      name = "e",
      descriptor = "I"
   )
   public static int field3968;
   @OriginalMember(
      owner = "client!jr",
      name = "s",
      descriptor = "I"
   )
   public static int field3969;
   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "I"
   )
   public static int field3970;
   @OriginalMember(
      owner = "client!jr",
      name = "d",
      descriptor = "I"
   )
   public static int field3973;
   @OriginalMember(
      owner = "client!jr",
      name = "q",
      descriptor = "I"
   )
   public static int field3975;
   @OriginalMember(
      owner = "client!jr",
      name = "g",
      descriptor = "Lua;"
   )
   public static class569 field3963;
   @OriginalMember(
      owner = "client!jr",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field3964;
   @OriginalMember(
      owner = "client!jr",
      name = "j",
      descriptor = "[Lma;"
   )
   public static class148[] field3971;

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2221(int arg0) {
      try {
         field3963 = null;
         field3971 = null;
         if (arg0 != 7) {
            method2222((class523)null, (byte)-121, true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3982[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Ltf;BZ)V"
   )
   public static final void method2222(class523 arg0, byte arg1, boolean arg2) {
      boolean var3 = client.field10022;

      try {
         if (arg1 == 34) {
            ++field3968;
            if (!arg0.field7405) {
               if (arg0.field7402 && arg0.field7398 >= 1 && arg0.field7399 >= 1 && arg0.field7398 <= class234.field3626 - 2 && ~arg0.field7399 >= ~(class209.field2989 + -2)) {
                  if (~arg0.field7403 > -1 || class254.method2173(arg0.field7403, arg0.field7400, false)) {
                     label99: {
                        if (!arg2) {
                           class431.method3363(arg0.field7397, -1, arg0.field7403, arg0.field7394, arg0.field7400, arg0.field7398, arg0.field7401, arg1 + -36, arg0.field7399);
                           if (!var3) {
                              break label99;
                           }
                        }

                        class219.method1900(arg0.field7397, arg0.field7401, arg0.field7399, arg0.field7406, true, arg0.field7398);
                     }

                     arg0.field7402 = false;
                     if (arg2 || arg0.field7403 != arg0.field7396 || arg0.field7396 != -1) {
                        if (!arg2 && ~arg0.field7403 == ~arg0.field7396 && ~arg0.field7395 == ~arg0.field7394 && arg0.field7407 == arg0.field7400) {
                           arg0.method2140((byte)101);
                           return;
                        }

                        return;
                     }

                     arg0.method2140((byte)-71);
                  }

                  return;
               }
            } else if (arg0.field7396 < 0 || class254.method2173(arg0.field7396, arg0.field7407, false)) {
               label71: {
                  if (!arg2) {
                     class431.method3363(arg0.field7397, -1, arg0.field7396, arg0.field7395, arg0.field7407, arg0.field7398, arg0.field7401, -2, arg0.field7399);
                     if (!var3) {
                        break label71;
                     }
                  }

                  class219.method1900(arg0.field7397, arg0.field7401, arg0.field7399, (class468)null, true, arg0.field7398);
               }

               arg0.method2140((byte)60);
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3982[9] + (arg0 != null ? field3982[3] : field3982[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "([BII)V"
   )
   public final void method2223(byte[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field3973;
         this.field3978[this.field3974] = (byte)class91.method932(this.field3978[this.field3974], 128 >>> class697.method5101(7, this.field3981));
         ++this.field3974;
         class259 var10000;
         if (this.field3974 > 32) {
            if (var4) {
               this.field3978[this.field3974++] = 0;
            }

            while(true) {
               if (this.field3974 >= 64) {
                  this.method2227((byte)97);
                  var10000 = this;
                  if (!var4) {
                     this.field3974 = 0;
                     if (var4) {
                        this.field3978[this.field3974++] = 0;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field3978[this.field3974++] = 0;
            }
         }

         while(true) {
            if (~this.field3974 <= -33) {
               class474.method3640(this.field3976, 0, this.field3978, 32, 32);
               var10000 = this;
               if (!var4) {
                  this.method2227((byte)110);
                  int var5 = 91 % ((-42 - arg2) / 59);
                  int var6 = 0;
                  int var7 = arg1;
                  if (!var4 && ~var6 <= -9) {
                     return;
                  } else {
                     do {
                        long var8 = this.field3979[var6];
                        arg0[var7] = (byte)((int)(var8 >>> 56));
                        arg0[var7 + 1] = (byte)((int)(var8 >>> 48));
                        arg0[var7 + 2] = (byte)((int)(var8 >>> 40));
                        arg0[var7 + 3] = (byte)((int)(var8 >>> 32));
                        arg0[var7 + 4] = (byte)((int)(var8 >>> 24));
                        arg0[var7 + 5] = (byte)((int)(var8 >>> 16));
                        arg0[var7 + 6] = (byte)((int)(var8 >>> 8));
                        arg0[var7 + 7] = (byte)((int)var8);
                        var7 += 8;
                        ++var6;
                     } while(~var6 > -9);

                     return;
                  }
               }
            } else {
               var10000 = this;
            }

            var10000.field3978[this.field3974++] = 0;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3982[1] + (arg0 != null ? field3982[3] : field3982[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Ljq;I)Ljava/lang/String;"
   )
   public static final String method2224(class211 arg0, int arg1) {
      try {
         if (arg1 != 8) {
            return null;
         } else {
            ++field3965;
            return arg0.field3012 + field3982[8];
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3982[7] + (arg0 != null ? field3982[3] : field3982[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "([BJB)V"
   )
   public final void method2225(byte[] arg0, long arg1, byte arg2) {
      boolean var5 = client.field10022;

      try {
         ++field3967;
         if (arg2 != -117) {
            method2222((class523)null, (byte)-77, true);
         }

         int var6 = 0;
         int var7 = -(7 & (int)arg1) + 8 & 7;
         int var8 = 7 & this.field3981;
         long var9 = arg1;
         int var11 = 31;
         int var12 = 0;
         int var13;
         if (var5) {
            var13 = (this.field3976[var11] & 255) + (255 & (int)arg1) + var12;
            this.field3976[var11] = (byte)var13;
            var12 = var13 >>> 8;
            var9 = arg1 >>> 8;
            --var11;
         }

         while(true) {
            while(~var11 <= -1) {
               var13 = (this.field3976[var11] & 255) + (255 & (int)var9) + var12;
               this.field3976[var11] = (byte)var13;
               var12 = var13 >>> 8;
               var9 >>>= 8;
               --var11;
            }

            if (!var5) {
               int var14;
               if (var5) {
                  var14 = arg0[var6] << var7 & 255 | (arg0[var6 + 1] & 255) >>> -var7 + 8;
                  if (var14 < 0 || var14 >= 256) {
                     throw new RuntimeException(field3982[5]);
                  }

                  this.field3978[this.field3974] = (byte)class91.method932(this.field3978[this.field3974], var14 >>> var8);
                  this.field3981 += -var8 + 8;
                  ++this.field3974;
                  if (this.field3981 == 512) {
                     this.method2227((byte)101);
                     this.field3981 = this.field3974 = 0;
                  }

                  this.field3978[this.field3974] = (byte)class697.method5101(var14 << -var8 + 8, 255);
                  arg1 -= 8L;
                  this.field3981 += var8;
                  ++var6;
               }

               while(true) {
                  int var10000;
                  if (arg1 <= 8L) {
                     long var18;
                     var10000 = (var18 = arg1 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                     if (!var5) {
                        int var15;
                        label54: {
                           if (var10000 <= 0) {
                              var15 = 0;
                              if (!var5) {
                                 break label54;
                              }
                           }

                           var15 = arg0[var6] << var7 & 255;
                           this.field3978[this.field3974] = (byte)class91.method932(this.field3978[this.field3974], var15 >>> var8);
                        }

                        if (~((long)var8 - -arg1) > -9L) {
                           this.field3981 = (int)((long)this.field3981 + arg1);
                           return;
                        }

                        arg1 -= (long)(-var8 + 8);
                        ++this.field3974;
                        this.field3981 += -var8 + 8;
                        if (~this.field3981 == -513) {
                           this.method2227((byte)119);
                           this.field3981 = this.field3974 = 0;
                        }

                        this.field3978[this.field3974] = (byte)class697.method5101(255, var15 << -var8 + 8);
                        this.field3981 += (int)arg1;
                        return;
                     }
                  } else {
                     var10000 = arg0[var6] << var7 & 255 | (arg0[var6 + 1] & 255) >>> -var7 + 8;
                  }

                  var14 = var10000;
                  if (var14 < 0 || var14 >= 256) {
                     throw new RuntimeException(field3982[5]);
                  }

                  this.field3978[this.field3974] = (byte)class91.method932(this.field3978[this.field3974], var14 >>> var8);
                  this.field3981 += -var8 + 8;
                  ++this.field3974;
                  if (this.field3981 == 512) {
                     this.method2227((byte)101);
                     this.field3981 = this.field3974 = 0;
                  }

                  this.field3978[this.field3974] = (byte)class697.method5101(var14 << -var8 + 8, 255);
                  arg1 -= 8L;
                  this.field3981 += var8;
                  ++var6;
               }
            }

            --var11;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field3982[4] + (arg0 != null ? field3982[3] : field3982[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2226(boolean arg0) {
      try {
         ++field3969;
         class755.method5457(12, arg0);
         class88.method908(-15118);
         System.gc();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3982[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method2227(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field3970;
         int var3 = 0;
         int var4 = 0;
         if (var2) {
            this.field3972[var3] = class482.method3683(class747.method5378((long)this.field3978[var4 + 7], 255L), class482.method3683(class482.method3683(class747.method5378(255L, (long)this.field3978[var4 - -5]) << 16, class482.method3683(class482.method3683(class747.method5378((long)this.field3978[var4 + 3] << 32, 255L << 32), class482.method3683(class482.method3683(class747.method5378(255L << 48, (long)this.field3978[var4 + 1] << 48), (long)this.field3978[var4] << 56), class747.method5378(255L, (long)this.field3978[var4 + 2]) << 40)), class747.method5378(255L, (long)this.field3978[var4 + 4]) << 24)), class747.method5378(255L, (long)this.field3978[var4 + 6]) << 8));
            var4 += 8;
            ++var3;
         }

         while(true) {
            while(~var3 > -9) {
               this.field3972[var3] = class482.method3683(class747.method5378((long)this.field3978[var4 + 7], 255L), class482.method3683(class482.method3683(class747.method5378(255L, (long)this.field3978[var4 - -5]) << 16, class482.method3683(class482.method3683(class747.method5378((long)this.field3978[var4 + 3] << 32, 255L << 32), class482.method3683(class482.method3683(class747.method5378(255L << 48, (long)this.field3978[var4 + 1] << 48), (long)this.field3978[var4] << 56), class747.method5378(255L, (long)this.field3978[var4 + 2]) << 40)), class747.method5378(255L, (long)this.field3978[var4 + 4]) << 24)), class747.method5378(255L, (long)this.field3978[var4 + 6]) << 8));
               var4 += 8;
               ++var3;
            }

            int var5 = 0;
            if (!var2) {
               if (var2) {
                  this.field3977[var5] = class482.method3683(this.field3972[var5], this.field3980[var5] = this.field3979[var5]);
                  ++var5;
               }

               while(true) {
                  while(~var5 > -9) {
                     this.field3977[var5] = class482.method3683(this.field3972[var5], this.field3980[var5] = this.field3979[var5]);
                     ++var5;
                  }

                  int var6 = 1;
                  if (!var2) {
                     int var7;
                     label202: {
                        if (var2) {
                           var7 = 0;
                        } else if (~var6 < -11) {
                           var7 = 0;
                           if (!var2) {
                              break label202;
                           }
                        } else {
                           var7 = 0;
                        }

                        label201:
                        while(true) {
                           int var8;
                           label143: {
                              if (var2) {
                                 this.field3966[var7] = 0L;
                                 var8 = 0;
                              } else if (var7 >= 8) {
                                 var8 = 0;
                                 if (!var2) {
                                    break label143;
                                 }
                              } else {
                                 this.field3966[var7] = 0L;
                                 var8 = 0;
                              }

                              label142:
                              while(true) {
                                 int var9 = 56;
                                 if (var2) {
                                    this.field3966[var7] = class482.method3683(this.field3966[var7], class592.field8366[var8][class697.method5101((int)(this.field3980[class697.method5101(7, var7 - var8)] >>> var9), 255)]);
                                    ++var8;
                                    var9 -= 8;
                                 }

                                 while(true) {
                                    while(~var8 > -9) {
                                       this.field3966[var7] = class482.method3683(this.field3966[var7], class592.field8366[var8][class697.method5101((int)(this.field3980[class697.method5101(7, var7 - var8)] >>> var9), 255)]);
                                       ++var8;
                                       var9 -= 8;
                                    }

                                    if (!var2) {
                                       ++var7;
                                       if (var7 >= 8) {
                                          var8 = 0;
                                          if (!var2) {
                                             break label142;
                                          }
                                       } else {
                                          this.field3966[var7] = 0L;
                                          var8 = 0;
                                       }
                                       break;
                                    }

                                    var9 -= 8;
                                 }
                              }
                           }

                           if (var2) {
                              this.field3980[var8] = this.field3966[var8];
                              ++var8;
                           }

                           while(true) {
                              while(~var8 > -9) {
                                 this.field3980[var8] = this.field3966[var8];
                                 ++var8;
                              }

                              this.field3980[0] = class482.method3683(this.field3980[0], class592.field8365[var6]);
                              int var10 = 0;
                              if (!var2) {
                                 int var11;
                                 label187: {
                                    if (var2) {
                                       this.field3966[var10] = this.field3980[var10];
                                       var11 = 0;
                                    } else if (~var10 <= -9) {
                                       var11 = 0;
                                       if (!var2) {
                                          break label187;
                                       }
                                    } else {
                                       this.field3966[var10] = this.field3980[var10];
                                       var11 = 0;
                                    }

                                    label186:
                                    while(true) {
                                       int var12 = 56;
                                       if (var2) {
                                          this.field3966[var10] = class482.method3683(this.field3966[var10], class592.field8366[var11][class697.method5101((int)(this.field3977[class697.method5101(-var11 + var10, 7)] >>> var12), 255)]);
                                          var12 -= 8;
                                          ++var11;
                                       }

                                       while(true) {
                                          while(~var11 > -9) {
                                             this.field3966[var10] = class482.method3683(this.field3966[var10], class592.field8366[var11][class697.method5101((int)(this.field3977[class697.method5101(-var11 + var10, 7)] >>> var12), 255)]);
                                             var12 -= 8;
                                             ++var11;
                                          }

                                          if (!var2) {
                                             ++var10;
                                             if (~var10 <= -9) {
                                                var11 = 0;
                                                if (!var2) {
                                                   break label186;
                                                }
                                             } else {
                                                this.field3966[var10] = this.field3980[var10];
                                                var11 = 0;
                                             }
                                             break;
                                          }

                                          ++var11;
                                       }
                                    }
                                 }

                                 if (var2) {
                                    this.field3977[var11] = this.field3966[var11];
                                    ++var11;
                                 }

                                 while(true) {
                                    while(~var11 > -9) {
                                       this.field3977[var11] = this.field3966[var11];
                                       ++var11;
                                    }

                                    if (!var2) {
                                       ++var6;
                                       if (~var6 < -11) {
                                          var7 = 0;
                                          if (!var2) {
                                             break label201;
                                          }
                                       } else {
                                          var7 = 0;
                                       }
                                       continue label201;
                                    }

                                    ++var11;
                                 }
                              }

                              ++var8;
                           }
                        }
                     }

                     if (var2) {
                        this.field3979[var7] = class482.method3683(this.field3979[var7], class482.method3683(this.field3972[var7], this.field3977[var7]));
                        ++var7;
                     }

                     while(true) {
                        while(var7 < 8) {
                           this.field3979[var7] = class482.method3683(this.field3979[var7], class482.method3683(this.field3972[var7], this.field3977[var7]));
                           ++var7;
                        }

                        if (!var2) {
                           if (arg0 < 79) {
                              this.field3978 = null;
                              return;
                           }

                           return;
                        }

                        ++var7;
                     }
                  }

                  ++var5;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field3982[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2228(int arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = 0;
         if (var2) {
            this.field3976[var3] = 0;
            ++var3;
         }

         while(true) {
            while(var3 < 32) {
               this.field3976[var3] = 0;
               ++var3;
            }

            ++field3975;
            this.field3981 = this.field3974 = 0;
            this.field3978[0] = 0;
            int var4 = 0;
            if (!var2) {
               if (var2) {
                  this.field3979[var4] = 0L;
                  ++var4;
               }

               while(true) {
                  while(var4 < 8) {
                     this.field3979[var4] = 0L;
                     ++var4;
                  }

                  if (!var2) {
                     if (arg0 > -22) {
                        method2221(41);
                        return;
                     }

                     return;
                  }

                  ++var4;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3982[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2229(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2230(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
