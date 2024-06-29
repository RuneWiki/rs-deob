import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class545 extends class412 {
   @OriginalMember(
      owner = "client!tj",
      name = "B",
      descriptor = "[B"
   )
   public byte[] field7770;
   @OriginalMember(
      owner = "client!tj",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7776 = new String[]{method4091(method4090(",= YW")), method4091(method4090(",= ]W")), method4091(method4090(",= ^W")), method4091(method4090(",= [W")), method4091(method4090(",= XW")), method4091(method4090(",= _W")), method4091(method4090("6\"bv")), method4091(method4090("#y 4\u0002")), method4091(method4090(",= &\u00166>z$W")), method4091(method4090(",= \\W"))};
   @OriginalMember(
      owner = "client!tj",
      name = "F",
      descriptor = "Lhha;"
   )
   public static class724 field7764 = new class724(52, 1);
   @OriginalMember(
      owner = "client!tj",
      name = "D",
      descriptor = "Liw;"
   )
   public static class107 field7775 = new class107(260);
   @OriginalMember(
      owner = "client!tj",
      name = "H",
      descriptor = "I"
   )
   public static int field7762;
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "I"
   )
   public static int field7763;
   @OriginalMember(
      owner = "client!tj",
      name = "G",
      descriptor = "I"
   )
   public int field7765;
   @OriginalMember(
      owner = "client!tj",
      name = "v",
      descriptor = "I"
   )
   public static int field7766;
   @OriginalMember(
      owner = "client!tj",
      name = "u",
      descriptor = "I"
   )
   public static int field7767;
   @OriginalMember(
      owner = "client!tj",
      name = "C",
      descriptor = "I"
   )
   public static int field7768;
   @OriginalMember(
      owner = "client!tj",
      name = "y",
      descriptor = "I"
   )
   public int field7769;
   @OriginalMember(
      owner = "client!tj",
      name = "A",
      descriptor = "I"
   )
   public static int field7771;
   @OriginalMember(
      owner = "client!tj",
      name = "w",
      descriptor = "I"
   )
   public int field7772;
   @OriginalMember(
      owner = "client!tj",
      name = "x",
      descriptor = "I"
   )
   public int field7773;
   @OriginalMember(
      owner = "client!tj",
      name = "E",
      descriptor = "I"
   )
   public static int field7774;

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public final void method4083(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field7765 = -arg1 + arg3;
         if (arg4 != 74) {
            field7775 = null;
         }

         this.field7772 = arg2;
         this.field7773 = -arg2 + arg0;
         ++field7762;
         this.field7769 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7776[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4084(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field7771;
         if (arg0 == 0) {
            int var3 = -1;
            int var4 = this.field7770.length + -8;
            if (var2) {
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
               ++var3;
               this.field7770[var3] = 0;
            }

            while(true) {
               while(~var4 < ~var3) {
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
                  ++var3;
                  this.field7770[var3] = 0;
               }

               if (!var2) {
                  if (var2) {
                     ++var3;
                     this.field7770[var3] = 0;
                  }

                  while(~(this.field7770.length - 1) < ~var3) {
                     ++var3;
                     this.field7770[var3] = 0;
                  }

                  return;
               }

               ++var3;
               this.field7770[var3] = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7776[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public final boolean method4085(int arg0, int arg1, boolean arg2) {
      try {
         ++field7774;
         if (arg2) {
            return true;
         } else {
            return ~(arg0 * arg1) >= ~this.field7770.length;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7776[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIBIII)V"
   )
   public final void method4086(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field7766;
         int var9 = 0;
         if (arg0 != arg4) {
            var9 = (-arg5 + arg1 << 16) / (arg0 - arg4);
         }

         int var10 = 0;
         if (arg3 == -41) {
            if (~arg0 != ~arg6) {
               var10 = (-arg1 + arg2 << 16) / (arg6 - arg0);
            }

            int var11 = 0;
            if (arg4 != arg6) {
               var11 = (-arg2 + arg5 << 16) / (arg4 - arg6);
            }

            if (~arg4 >= ~arg0 && arg6 >= arg4) {
               if (arg6 > arg0) {
                  arg2 = arg5 <<= 16;
                  if (~arg4 > -1) {
                     arg5 -= arg4 * var9;
                     arg2 -= arg4 * var11;
                     arg4 = 0;
                  }

                  arg1 <<= 16;
                  if (~arg0 > -1) {
                     arg1 -= arg0 * var10;
                     arg0 = 0;
                  }

                  if (arg0 != arg4 && ~var9 < ~var11 || arg0 == arg4 && ~var11 < ~var10) {
                     arg6 -= arg0;
                     arg0 -= arg4;
                     arg4 = this.field7773 * arg4;
                     if (var8) {
                        class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-3, arg4);
                        arg5 += var9;
                        arg4 += this.field7773;
                        arg2 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)-127, arg4);
                                    arg2 += var11;
                                    arg1 += var10;
                                    arg4 += this.field7773;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (arg6 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg4 += this.field7773;
                                       } else {
                                          class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)-127, arg4);
                                          arg2 += var11;
                                          arg1 += var10;
                                          arg4 += this.field7773;
                                       }
                                    }
                                 }
                              }

                              arg2 += var11;
                           } else {
                              class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-3, arg4);
                              arg5 += var9;
                              arg4 += this.field7773;
                              arg2 += var11;
                           }
                        }
                     }
                  } else {
                     arg6 -= arg0;
                     arg0 -= arg4;
                     arg4 = this.field7773 * arg4;
                     if (var8) {
                        class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)114, arg4);
                        arg5 += var9;
                        arg4 += this.field7773;
                        arg2 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-24, arg4);
                                    arg1 += var10;
                                    arg4 += this.field7773;
                                    arg2 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (~arg6 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg2 += var11;
                                       } else {
                                          class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-24, arg4);
                                          arg1 += var10;
                                          arg4 += this.field7773;
                                          arg2 += var11;
                                       }
                                    }
                                 }
                              }

                              arg2 += var11;
                           } else {
                              class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)114, arg4);
                              arg5 += var9;
                              arg4 += this.field7773;
                              arg2 += var11;
                           }
                        }
                     }
                  }
               } else {
                  arg1 = arg5 <<= 16;
                  arg2 <<= 16;
                  if (arg4 < 0) {
                     arg1 -= arg4 * var11;
                     arg5 -= arg4 * var9;
                     arg4 = 0;
                  }

                  if (~arg6 > -1) {
                     arg2 -= arg6 * var10;
                     arg6 = 0;
                  }

                  if (~arg4 != ~arg6 && ~var9 < ~var11 || ~arg4 == ~arg6 && ~var9 > ~var10) {
                     arg0 -= arg6;
                     arg6 -= arg4;
                     arg4 = this.field7773 * arg4;
                     if (var8) {
                        class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)125, arg4);
                        arg4 += this.field7773;
                        arg5 += var9;
                        arg1 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg6;
                           if (~arg6 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-10, arg4);
                                    arg2 += var10;
                                    arg5 += var9;
                                    arg4 += this.field7773;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (~arg0 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg4 += this.field7773;
                                       } else {
                                          class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-10, arg4);
                                          arg2 += var10;
                                          arg5 += var9;
                                          arg4 += this.field7773;
                                       }
                                    }
                                 }
                              }

                              arg1 += var11;
                           } else {
                              class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)125, arg4);
                              arg4 += this.field7773;
                              arg5 += var9;
                              arg1 += var11;
                           }
                        }
                     }
                  } else {
                     arg0 -= arg6;
                     arg6 -= arg4;
                     arg4 = this.field7773 * arg4;
                     if (var8) {
                        class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)14, arg4);
                        arg1 += var11;
                        arg5 += var9;
                        arg4 += this.field7773;
                     }

                     while(true) {
                        while(true) {
                           --arg6;
                           if (~arg6 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)3, arg4);
                                    arg5 += var9;
                                    arg2 += var10;
                                    arg4 += this.field7773;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (arg0 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg4 += this.field7773;
                                       } else {
                                          class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)3, arg4);
                                          arg5 += var9;
                                          arg2 += var10;
                                          arg4 += this.field7773;
                                       }
                                    }
                                 }
                              }

                              arg4 += this.field7773;
                           } else {
                              class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)14, arg4);
                              arg1 += var11;
                              arg5 += var9;
                              arg4 += this.field7773;
                           }
                        }
                     }
                  }
               }
            } else if (arg6 >= arg0) {
               if (arg4 > arg6) {
                  arg5 = arg1 <<= 16;
                  if (arg0 < 0) {
                     arg1 -= arg0 * var10;
                     arg5 -= arg0 * var9;
                     arg0 = 0;
                  }

                  arg2 <<= 16;
                  if (arg6 < 0) {
                     arg2 -= arg6 * var11;
                     arg6 = 0;
                  }

                  if (arg0 != arg6 && ~var10 < ~var9 || arg0 == arg6 && ~var11 > ~var9) {
                     arg4 -= arg6;
                     arg6 -= arg0;
                     arg0 = this.field7773 * arg0;
                     if (var8) {
                        class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-123, arg0);
                        arg1 += var10;
                        arg0 += this.field7773;
                        arg5 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg6;
                           if (arg6 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)49, arg0);
                                    arg0 += this.field7773;
                                    arg2 += var11;
                                    arg5 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg4;
                                       if (~arg4 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg5 += var9;
                                       } else {
                                          class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)49, arg0);
                                          arg0 += this.field7773;
                                          arg2 += var11;
                                          arg5 += var9;
                                       }
                                    }
                                 }
                              }

                              arg5 += var9;
                           } else {
                              class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-123, arg0);
                              arg1 += var10;
                              arg0 += this.field7773;
                              arg5 += var9;
                           }
                        }
                     }
                  } else {
                     arg4 -= arg6;
                     arg6 -= arg0;
                     arg0 = this.field7773 * arg0;
                     if (var8) {
                        class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)-126, arg0);
                        arg0 += this.field7773;
                        arg5 += var9;
                        arg1 += var10;
                     }

                     while(true) {
                        while(true) {
                           --arg6;
                           if (~arg6 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-123, arg0);
                                    arg2 += var11;
                                    arg0 += this.field7773;
                                    arg5 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg4;
                                       if (~arg4 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg5 += var9;
                                       } else {
                                          class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-123, arg0);
                                          arg2 += var11;
                                          arg0 += this.field7773;
                                          arg5 += var9;
                                       }
                                    }
                                 }
                              }

                              arg1 += var10;
                           } else {
                              class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)-126, arg0);
                              arg0 += this.field7773;
                              arg5 += var9;
                              arg1 += var10;
                           }
                        }
                     }
                  }
               } else {
                  arg2 = arg1 <<= 16;
                  arg5 <<= 16;
                  if (arg0 < 0) {
                     arg1 -= arg0 * var10;
                     arg2 -= arg0 * var9;
                     arg0 = 0;
                  }

                  if (~arg4 > -1) {
                     arg5 -= arg4 * var11;
                     arg4 = 0;
                  }

                  if (~var9 <= ~var10) {
                     arg6 -= arg4;
                     arg4 -= arg0;
                     arg0 = this.field7773 * arg0;
                     if (var8) {
                        class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-121, arg0);
                        arg2 += var9;
                        arg1 += var10;
                        arg0 += this.field7773;
                     }

                     while(true) {
                        while(true) {
                           --arg4;
                           if (arg4 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)114, arg0);
                                    arg0 += this.field7773;
                                    arg1 += var10;
                                    arg5 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (arg6 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg5 += var11;
                                       } else {
                                          class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)114, arg0);
                                          arg0 += this.field7773;
                                          arg1 += var10;
                                          arg5 += var11;
                                       }
                                    }
                                 }
                              }

                              arg0 += this.field7773;
                           } else {
                              class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-121, arg0);
                              arg2 += var9;
                              arg1 += var10;
                              arg0 += this.field7773;
                           }
                        }
                     }
                  } else {
                     arg6 -= arg4;
                     arg4 -= arg0;
                     arg0 = this.field7773 * arg0;
                     if (var8) {
                        class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)-124, arg0);
                        arg0 += this.field7773;
                        arg1 += var10;
                        arg2 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg4;
                           if (arg4 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-125, arg0);
                                    arg1 += var10;
                                    arg5 += var11;
                                    arg0 += this.field7773;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (~arg6 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg0 += this.field7773;
                                       } else {
                                          class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-125, arg0);
                                          arg1 += var10;
                                          arg5 += var11;
                                          arg0 += this.field7773;
                                       }
                                    }
                                 }
                              }

                              arg2 += var9;
                           } else {
                              class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)-124, arg0);
                              arg0 += this.field7773;
                              arg1 += var10;
                              arg2 += var9;
                           }
                        }
                     }
                  }
               }
            } else if (~arg4 > ~arg0) {
               arg1 = arg2 <<= 16;
               arg5 <<= 16;
               if (~arg6 > -1) {
                  arg2 -= arg6 * var11;
                  arg1 -= arg6 * var10;
                  arg6 = 0;
               }

               if (arg4 < 0) {
                  arg5 -= arg4 * var9;
                  arg4 = 0;
               }

               if (var10 < var11) {
                  arg0 -= arg4;
                  arg4 -= arg6;
                  arg6 = this.field7773 * arg6;
                  if (var8) {
                     class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-123, arg6);
                     arg6 += this.field7773;
                     arg1 += var10;
                     arg2 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)17, arg6);
                                 arg5 += var9;
                                 arg1 += var10;
                                 arg6 += this.field7773;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field7773;
                                    } else {
                                       class56.method585(0, this.field7770, arg5 >> 16, arg1 >> 16, (byte)17, arg6);
                                       arg5 += var9;
                                       arg1 += var10;
                                       arg6 += this.field7773;
                                    }
                                 }
                              }
                           }

                           arg2 += var11;
                        } else {
                           class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)-123, arg6);
                           arg6 += this.field7773;
                           arg1 += var10;
                           arg2 += var11;
                        }
                     }
                  }
               } else {
                  arg0 -= arg4;
                  arg4 -= arg6;
                  arg6 = this.field7773 * arg6;
                  if (var8) {
                     class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)101, arg6);
                     arg6 += this.field7773;
                     arg1 += var10;
                     arg2 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-124, arg6);
                                 arg5 += var9;
                                 arg6 += this.field7773;
                                 arg1 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg1 += var10;
                                    } else {
                                       class56.method585(0, this.field7770, arg1 >> 16, arg5 >> 16, (byte)-124, arg6);
                                       arg5 += var9;
                                       arg6 += this.field7773;
                                       arg1 += var10;
                                    }
                                 }
                              }
                           }

                           arg2 += var11;
                        } else {
                           class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)101, arg6);
                           arg6 += this.field7773;
                           arg1 += var10;
                           arg2 += var11;
                        }
                     }
                  }
               }
            } else {
               arg5 = arg2 <<= 16;
               if (~arg6 > -1) {
                  arg5 -= arg6 * var10;
                  arg2 -= arg6 * var11;
                  arg6 = 0;
               }

               arg1 <<= 16;
               if (~arg0 > -1) {
                  arg1 -= arg0 * var9;
                  arg0 = 0;
               }

               if (~var10 <= ~var11) {
                  arg4 -= arg0;
                  arg0 -= arg6;
                  arg6 = this.field7773 * arg6;
                  if (var8) {
                     class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-125, arg6);
                     arg6 += this.field7773;
                     arg2 += var11;
                     arg5 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)91, arg6);
                                 arg6 += this.field7773;
                                 arg1 += var9;
                                 arg2 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += var11;
                                    } else {
                                       class56.method585(0, this.field7770, arg1 >> 16, arg2 >> 16, (byte)91, arg6);
                                       arg6 += this.field7773;
                                       arg1 += var9;
                                       arg2 += var11;
                                    }
                                 }
                              }
                           }

                           arg5 += var10;
                        } else {
                           class56.method585(0, this.field7770, arg5 >> 16, arg2 >> 16, (byte)-125, arg6);
                           arg6 += this.field7773;
                           arg2 += var11;
                           arg5 += var10;
                        }
                     }
                  }
               } else {
                  arg4 -= arg0;
                  arg0 -= arg6;
                  arg6 = this.field7773 * arg6;
                  if (var8) {
                     class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)-120, arg6);
                     arg6 += this.field7773;
                     arg2 += var11;
                     arg5 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)5, arg6);
                                 arg1 += var9;
                                 arg2 += var11;
                                 arg6 += this.field7773;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field7773;
                                    } else {
                                       class56.method585(0, this.field7770, arg2 >> 16, arg1 >> 16, (byte)5, arg6);
                                       arg1 += var9;
                                       arg2 += var11;
                                       arg6 += this.field7773;
                                    }
                                 }
                              }
                           }

                           arg5 += var10;
                        } else {
                           class56.method585(0, this.field7770, arg2 >> 16, arg5 >> 16, (byte)-120, arg6);
                           arg6 += this.field7773;
                           arg2 += var11;
                           arg5 += var10;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7776[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method4087(boolean arg0, int arg1) {
      try {
         ++field7767;
         if (arg0) {
            field7768 = -35;
         }

         class102.field1608 = arg1;
         class107 var2 = class211.field3013;
         synchronized(class211.field3013) {
            class211.field3013.method1052(true);
         }

         class107 var3 = field7775;
         synchronized(field7775) {
            field7775.method1052(!arg0);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7776[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4088(int arg0) {
      try {
         field7764 = null;
         field7775 = null;
         int var1 = 18 / ((41 - arg0) / 50);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4089(int arg0, int arg1, int arg2) {
      try {
         ++field7763;
         class111 var3 = class796.method5734(arg1, (long)arg2, (byte)-110);
         var3.method1087(arg1 + -17);
         var3.field1740 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7776[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "(Laea;II)V"
   )
   public class545(class678 arg0, int arg1, int arg2) {
      try {
         this.field7770 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7776[8] + (arg0 != null ? field7776[7] : field7776[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
