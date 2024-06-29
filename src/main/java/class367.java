import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class367 {
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "I"
   )
   private int field5514;
   @OriginalMember(
      owner = "client!tu",
      name = "k",
      descriptor = "Z"
   )
   public boolean field5517;
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "I"
   )
   private int field5524;
   @OriginalMember(
      owner = "client!tu",
      name = "r",
      descriptor = "Lck;"
   )
   private class667 field5525;
   @OriginalMember(
      owner = "client!tu",
      name = "i",
      descriptor = "Lhc;"
   )
   private class150 field5528;
   @OriginalMember(
      owner = "client!tu",
      name = "q",
      descriptor = "I"
   )
   private int field5519;
   @OriginalMember(
      owner = "client!tu",
      name = "h",
      descriptor = "I"
   )
   private int field5518;
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "Lsha;"
   )
   private class758 field5515;
   @OriginalMember(
      owner = "client!tu",
      name = "o",
      descriptor = "Lvt;"
   )
   private class318 field5522;
   @OriginalMember(
      owner = "client!tu",
      name = "j",
      descriptor = "Ldt;"
   )
   private class251 field5521;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5531 = new String[]{method2854(method2853("\u0006J\u0010|")), method2854(method2853("\u0013\u0011R>(")), method2854(method2853("\u001cJR,<\u0006V\b.}")), method2854(method2853("\u001cJRU}")), method2854(method2853("\u001cJRQ}")), method2854(method2853("\u001cJRS}")), method2854(method2853("\u001cJRR}")), method2854(method2853("\u001cJRT}"))};
   @OriginalMember(
      owner = "client!tu",
      name = "p",
      descriptor = "Lwia;"
   )
   public static class791 field5523 = new class791(16);
   @OriginalMember(
      owner = "client!tu",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field5527 = new class269(27, 8);
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field5529 = new int[32];
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field5530 = false;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "I"
   )
   public static int field5513;
   @OriginalMember(
      owner = "client!tu",
      name = "n",
      descriptor = "I"
   )
   public static int field5516;
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "I"
   )
   public static int field5520;
   @OriginalMember(
      owner = "client!tu",
      name = "m",
      descriptor = "I"
   )
   public static int field5526;

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2848(int arg0) {
      try {
         this.method2851(this.field5515, this.field5518, 11992);
         ++field5516;
         if (arg0 != 4) {
            this.field5514 = 66;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5531[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method2849(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field5513;
         if (this.field5517) {
            this.field5517 = false;
            byte[] var3 = this.field5528.field1874;
            byte[] var4 = this.field5525.field10051;
            int var5 = 0;
            int var6 = this.field5528.field1876;
            if (arg0 != 65) {
               this.field5521 = null;
            }

            int var7 = this.field5524 - -(this.field5528.field1876 * this.field5519);
            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            if (var2 != 0) {
               var5 = (var5 << 8) - var5;
               var9 = -128;
               if (var2 != 0) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            } else {
               if (~var8 <= -1) {
                  if (var2 == 0) {
                     if (this.field5521 != null && ~this.field5514 == ~var5) {
                        this.field5517 = false;
                        return;
                     }

                     this.field5514 = var5;
                     var10 = 0;
                     var11 = this.field5519 * var6 + this.field5524;
                     var12 = -128;
                     if (var2 == 0 && ~var12 <= -1) {
                        if (this.field5521 != null) {
                           this.field5521.method1895(false, 0, 6406, this.field5525.field10051, 0, 128, 0, 10329, 0, 128);
                           return;
                        }

                        this.field5521 = new class251(this.field5525, 3553, 6406, 128, 128, false, this.field5525.field10051, 6406, false);
                        this.field5521.method1893(true, false, false);
                        this.field5521.method5012(true, -10161);
                        return;
                     }

                     do {
                        var13 = -128;
                        if (var2 != 0) {
                           if (var3[var11] == 0) {
                              var14 = 0;
                              if (var3[var11 + -1] != 0) {
                                 ++var14;
                              }

                              if (var3[var11 + 1] != 0) {
                                 ++var14;
                              }

                              if (~var3[var11 - var6] != -1) {
                                 ++var14;
                                 if (var3[var6 + var11] != 0) {
                                    ++var14;
                                 }
                              } else if (var3[var6 + var11] != 0) {
                                 ++var14;
                              }

                              var4[var10++] = (byte)(var14 * 17);
                              if (var2 != 0) {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              } else {
                                 ++var11;
                                 ++var13;
                              }
                           } else {
                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        }

                        while(true) {
                           while(~var13 > -1) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (var3[var11 + -1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[var11 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (var3[var6 + var11] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var6 + var11] != 0) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2 != 0) {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 } else {
                                    ++var11;
                                    ++var13;
                                 }
                              } else {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              }
                           }

                           var11 += this.field5528.field1876 + -128;
                           if (var2 == 0) {
                              ++var12;
                              break;
                           }

                           var4[var10++] = 68;
                           ++var11;
                           ++var13;
                        }
                     } while(~var12 > -1);

                     if (this.field5521 != null) {
                        this.field5521.method1895(false, 0, 6406, this.field5525.field10051, 0, 128, 0, 10329, 0, 128);
                        return;
                     }

                     this.field5521 = new class251(this.field5525, 3553, 6406, 128, 128, false, this.field5525.field10051, 6406, false);
                     this.field5521.method1893(true, false, false);
                     this.field5521.method5012(true, -10161);
                     return;
                  }
               } else {
                  var5 = (var5 << 8) - var5;
               }

               var9 = -128;
               if (var2 != 0) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(~var9 > -1) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }

               var7 += var6 + -128;
               if (var2 == 0) {
                  ++var8;
                  if (~var8 <= -1) {
                     if (var2 == 0) {
                        if (this.field5521 != null && ~this.field5514 == ~var5) {
                           this.field5517 = false;
                           return;
                        }

                        this.field5514 = var5;
                        var10 = 0;
                        var11 = this.field5519 * var6 + this.field5524;
                        var12 = -128;
                        if (var2 == 0 && ~var12 <= -1) {
                           if (this.field5521 != null) {
                              this.field5521.method1895(false, 0, 6406, this.field5525.field10051, 0, 128, 0, 10329, 0, 128);
                              return;
                           }

                           this.field5521 = new class251(this.field5525, 3553, 6406, 128, 128, false, this.field5525.field10051, 6406, false);
                           this.field5521.method1893(true, false, false);
                           this.field5521.method5012(true, -10161);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2 != 0) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (var3[var11 + -1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[var11 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (var3[var6 + var11] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var6 + var11] != 0) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2 != 0) {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 } else {
                                    ++var11;
                                    ++var13;
                                 }
                              } else {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (var3[var11] == 0) {
                                    var14 = 0;
                                    if (var3[var11 + -1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[var11 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var11 - var6] != -1) {
                                       ++var14;
                                       if (var3[var6 + var11] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var6 + var11] != 0) {
                                       ++var14;
                                    }

                                    var4[var10++] = (byte)(var14 * 17);
                                    if (var2 != 0) {
                                       var4[var10++] = 68;
                                       ++var11;
                                       ++var13;
                                    } else {
                                       ++var11;
                                       ++var13;
                                    }
                                 } else {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 }
                              }

                              var11 += this.field5528.field1876 + -128;
                              if (var2 == 0) {
                                 ++var12;
                                 break;
                              }

                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        } while(~var12 > -1);

                        if (this.field5521 != null) {
                           this.field5521.method1895(false, 0, 6406, this.field5525.field10051, 0, 128, 0, 10329, 0, 128);
                           return;
                        }

                        this.field5521 = new class251(this.field5525, 3553, 6406, 128, 128, false, this.field5525.field10051, 6406, false);
                        this.field5521.method1893(true, false, false);
                        this.field5521.method5012(true, -10161);
                        return;
                     }
                  } else {
                     var5 = (var5 << 8) - var5;
                  }

                  var9 = -128;
                  if (var2 != 0) {
                     if (~var3[var7++] != -1) {
                        ++var5;
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field5531[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2850(byte arg0) {
      try {
         field5523 = null;
         field5527 = null;
         if (arg0 == -45) {
            field5529 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5531[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(Lsha;II)V"
   )
   private final void method2851(class758 arg0, int arg1, int arg2) {
      try {
         ++field5526;
         if (arg2 != 11992) {
            this.field5528 = null;
         }

         if (~arg1 != -1) {
            this.method2849((byte)65);
            this.field5525.method4818((byte)17, this.field5521);
            this.field5525.method4781(arg1, 4, arg0, 0, 1024);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5531[4] + (arg0 != null ? field5531[1] : field5531[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method2852(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         if (arg3 == -8957) {
            ++field5520;
            this.field5522.method998(this.field5525.method4788(arg0, 1) * arg1, arg2, (byte)-82, arg0);
            this.method2851(this.field5522, arg1, arg3 ^ -3109);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5531[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5531[1] : field5531[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(Lck;Lhc;Ltda;IIIII)V"
   )
   public class367(class667 arg0, class150 arg1, class663 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var9 = client.field4530;
      super();
      this.field5514 = -1;
      this.field5517 = true;

      try {
         this.field5524 = arg6;
         this.field5525 = arg0;
         this.field5528 = arg1;
         this.field5519 = arg7;
         int var10 = 1 << arg5;
         int var11 = 0;
         int var12 = arg3 << arg5;
         int var13 = arg4 << arg5;
         int var14 = 0;
         int var15;
         int var16;
         int var10000;
         short[] var17;
         int var10001;
         class128 var18;
         int var19;
         int var20;
         int var21;
         short[] var22;
         int var23;
         int var24;
         int var25;
         int var26;
         short[] var27;
         int var28;
         if (var9 != 0) {
            var15 = var12 + (var13 + var14) * arg2.field4087;
            var16 = 0;
            if (var9 != 0) {
               var17 = arg2.field9620[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (var14 >= var10) {
               this.field5518 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (var9 == 0) {
                  if (var10000 >= -1) {
                     this.field5521 = null;
                     return;
                  }

                  label317: {
                     var18 = new class128(var11 * 2);
                     if (this.field5525.field10006) {
                        var19 = 0;
                        if (var9 != 0 || ~var10 < ~var19) {
                           do {
                              var20 = (var13 - -var19) * arg2.field4087 + var12;
                              var21 = 0;
                              if (var9 != 0 || ~var10 < ~var21) {
                                 do {
                                    var22 = arg2.field9620[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (var9 != 0) {
                                          var18.method1103(65535 & var22[var23], -57);
                                          ++var23;
                                       }

                                       while(~var22.length < ~var23) {
                                          var18.method1103(65535 & var22[var23], -57);
                                          ++var23;
                                       }

                                       ++var21;
                                    }
                                 } while(~var10 < ~var21);
                              }

                              ++var19;
                           } while(~var10 < ~var19);
                        }

                        if (var9 == 0) {
                           break label317;
                        }
                     }

                     var24 = 0;
                     if (var9 != 0 || ~var10 < ~var24) {
                        do {
                           var25 = (var13 + var24) * arg2.field4087 - -var12;
                           var26 = 0;
                           if (var9 != 0 || var26 < var10) {
                              do {
                                 var27 = arg2.field9620[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9 == 0 && var28 >= var27.length) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method1080(true, var27[var28] & 65535);
                                          ++var28;
                                       } while(var28 < var27.length);

                                       ++var26;
                                    }
                                 }
                              } while(var26 < var10);
                           }

                           ++var24;
                        } while(~var10 < ~var24);
                     }
                  }

                  this.field5515 = this.field5525.method4824(false, var18.field1590, 5123, var18.field1552, (byte)5);
                  this.field5522 = new class318(this.field5525, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = var12;
               var10001 = (var13 + var14) * arg2.field4087;
            }

            var15 = var10000 + var10001;
            var16 = 0;
            if (var9 != 0) {
               var17 = arg2.field9620[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(var10 > var16) {
               var17 = arg2.field9620[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (var14 >= var10) {
               this.field5518 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (var9 == 0) {
                  if (var10000 >= -1) {
                     this.field5521 = null;
                     return;
                  }

                  label325: {
                     var18 = new class128(var11 * 2);
                     if (this.field5525.field10006) {
                        var19 = 0;
                        if (var9 != 0 || ~var10 < ~var19) {
                           do {
                              var20 = (var13 - -var19) * arg2.field4087 + var12;
                              var21 = 0;
                              if (var9 != 0 || ~var10 < ~var21) {
                                 do {
                                    var22 = arg2.field9620[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (var9 != 0) {
                                          var18.method1103(65535 & var22[var23], -57);
                                          ++var23;
                                       }

                                       while(~var22.length < ~var23) {
                                          var18.method1103(65535 & var22[var23], -57);
                                          ++var23;
                                       }

                                       ++var21;
                                    }
                                 } while(~var10 < ~var21);
                              }

                              ++var19;
                           } while(~var10 < ~var19);
                        }

                        if (var9 == 0) {
                           break label325;
                        }
                     }

                     var24 = 0;
                     if (var9 != 0 || ~var10 < ~var24) {
                        do {
                           var25 = (var13 + var24) * arg2.field4087 - -var12;
                           var26 = 0;
                           if (var9 != 0 || var26 < var10) {
                              do {
                                 var27 = arg2.field9620[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9 == 0 && var28 >= var27.length) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method1080(true, var27[var28] & 65535);
                                          ++var28;
                                       } while(var28 < var27.length);

                                       ++var26;
                                    }
                                 }
                              } while(var26 < var10);
                           }

                           ++var24;
                        } while(~var10 < ~var24);
                     }
                  }

                  this.field5515 = this.field5525.method4824(false, var18.field1590, 5123, var18.field1552, (byte)5);
                  this.field5522 = new class318(this.field5525, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = var12;
               var10001 = (var13 + var14) * arg2.field4087;
            }

            var15 = var10000 + var10001;
            var16 = 0;
            if (var9 != 0) {
               var17 = arg2.field9620[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field5531[2] + (arg0 != null ? field5531[1] : field5531[0]) + ',' + (arg1 != null ? field5531[1] : field5531[0]) + ',' + (arg2 != null ? field5531[1] : field5531[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2853(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2854(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
