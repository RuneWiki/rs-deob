import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class502 {
   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "I"
   )
   private int field7304;
   @OriginalMember(
      owner = "client!iea",
      name = "j",
      descriptor = "Z"
   )
   public boolean field7315;
   @OriginalMember(
      owner = "client!iea",
      name = "c",
      descriptor = "Lrk;"
   )
   private class35 field7316;
   @OriginalMember(
      owner = "client!iea",
      name = "d",
      descriptor = "I"
   )
   private int field7314;
   @OriginalMember(
      owner = "client!iea",
      name = "i",
      descriptor = "I"
   )
   private int field7309;
   @OriginalMember(
      owner = "client!iea",
      name = "k",
      descriptor = "Lfm;"
   )
   private class764 field7303;
   @OriginalMember(
      owner = "client!iea",
      name = "q",
      descriptor = "I"
   )
   private int field7317;
   @OriginalMember(
      owner = "client!iea",
      name = "p",
      descriptor = "Lkv;"
   )
   private class281 field7308;
   @OriginalMember(
      owner = "client!iea",
      name = "b",
      descriptor = "Lee;"
   )
   private class703 field7307;
   @OriginalMember(
      owner = "client!iea",
      name = "e",
      descriptor = "Lfaa;"
   )
   private class163 field7313;
   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7320 = new String[]{method3775(method3774("\u001cXiq")), method3775(method3774("\u001bHd3\\Z")), method3775(method3774("\t\u0003+3b")), method3775(method3774("\u001bHd3^Z")), method3775(method3774("\u001bHd3XZ")), method3775(method3774("\u001bHd3[Z")), method3775(method3774("R\u0011lpxO")), method3775(method3774("\u001bHd3ZZ")), method3775(method3774("\u001bHd3YZ")), method3775(method3774("\u001bHd3#\u001bCli!Z")), method3775(method3774("\u001bHd3]Z"))};
   @OriginalMember(
      owner = "client!iea",
      name = "h",
      descriptor = "[[[I"
   )
   public static int[][][] field7310 = new int[2][][];
   @OriginalMember(
      owner = "client!iea",
      name = "f",
      descriptor = "I"
   )
   public static int field7305;
   @OriginalMember(
      owner = "client!iea",
      name = "o",
      descriptor = "I"
   )
   public static int field7306;
   @OriginalMember(
      owner = "client!iea",
      name = "l",
      descriptor = "I"
   )
   public static int field7311;
   @OriginalMember(
      owner = "client!iea",
      name = "m",
      descriptor = "I"
   )
   public static int field7312;
   @OriginalMember(
      owner = "client!iea",
      name = "g",
      descriptor = "I"
   )
   public static int field7318;
   @OriginalMember(
      owner = "client!iea",
      name = "n",
      descriptor = "I"
   )
   public static int field7319;

   @OriginalMember(
      owner = "client!iea",
      name = "<init>",
      descriptor = "(Lrk;Lfm;Liaa;IIIII)V",
      line = 230
   )
   public class502(class35 arg0, class764 arg1, class518 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field4564;
      super();
      this.field7304 = -1;
      this.field7315 = true;

      try {
         this.field7316 = arg0;
         this.field7314 = arg7;
         this.field7309 = arg6;
         this.field7303 = arg1;
         int var10 = 1 << arg5;
         int var11 = 0;
         int var12 = arg3 << arg5;
         int var13 = arg4 << arg5;
         int var14 = 0;
         int var15;
         int var16;
         int var10000;
         short[] var17;
         class473 var18;
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
         if (var9) {
            var15 = (var13 + var14) * arg2.field4080 - -var12;
            var16 = 0;
            if (var9) {
               var17 = arg2.field7541[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (var10 <= var14) {
               this.field7317 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field7308 = null;
                     return;
                  }

                  label317: {
                     var18 = new class473(var11 * 2);
                     if (!this.field7316.field807) {
                        var19 = 0;
                        if (var9 || var10 > var19) {
                           do {
                              var20 = (var13 + var19) * arg2.field4080 + var12;
                              var21 = 0;
                              if (var9 || var21 < var10) {
                                 do {
                                    var22 = arg2.field7541[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && var22.length <= var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method3582(-106, var22[var23] & 65535);
                                             ++var23;
                                          } while(var22.length > var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var21 < var10);
                              }

                              ++var19;
                           } while(var10 > var19);
                        }

                        if (!var9) {
                           break label317;
                        }
                     }

                     var24 = 0;
                     if (var9 || var10 > var24) {
                        do {
                           var25 = (var13 - -var24) * arg2.field4080 + var12;
                           var26 = 0;
                           if (var9 || ~var26 > ~var10) {
                              do {
                                 var27 = arg2.field7541[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method3550(65535 & var27[var28], 29620);
                                       ++var28;
                                    }

                                    while(~var27.length < ~var28) {
                                       var18.method3550(65535 & var27[var28], 29620);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var26 > ~var10);
                           }

                           ++var24;
                        } while(var10 > var24);
                     }
                  }

                  this.field7307 = this.field7316.method345(25589, var18.field6907, var18.field6889, 5123, false);
                  this.field7313 = new class163(this.field7316, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4080 - -var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field7541[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(var16 < var10) {
               var17 = arg2.field7541[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (var10 <= var14) {
               this.field7317 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field7308 = null;
                     return;
                  }

                  label325: {
                     var18 = new class473(var11 * 2);
                     if (!this.field7316.field807) {
                        var19 = 0;
                        if (var9 || var10 > var19) {
                           do {
                              var20 = (var13 + var19) * arg2.field4080 + var12;
                              var21 = 0;
                              if (var9 || var21 < var10) {
                                 do {
                                    var22 = arg2.field7541[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && var22.length <= var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method3582(-106, var22[var23] & 65535);
                                             ++var23;
                                          } while(var22.length > var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var21 < var10);
                              }

                              ++var19;
                           } while(var10 > var19);
                        }

                        if (!var9) {
                           break label325;
                        }
                     }

                     var24 = 0;
                     if (var9 || var10 > var24) {
                        do {
                           var25 = (var13 - -var24) * arg2.field4080 + var12;
                           var26 = 0;
                           if (var9 || ~var26 > ~var10) {
                              do {
                                 var27 = arg2.field7541[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method3550(65535 & var27[var28], 29620);
                                       ++var28;
                                    }

                                    while(~var27.length < ~var28) {
                                       var18.method3550(65535 & var27[var28], 29620);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var26 > ~var10);
                           }

                           ++var24;
                        } while(var10 > var24);
                     }
                  }

                  this.field7307 = this.field7316.method345(25589, var18.field6907, var18.field6889, 5123, false);
                  this.field7313 = new class163(this.field7316, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4080 - -var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field7541[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field7320[9] + (arg0 != null ? field7320[2] : field7320[0]) + ',' + (arg1 != null ? field7320[2] : field7320[0]) + ',' + (arg2 != null ? field7320[2] : field7320[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(B[I)Ljava/lang/String;",
      line = 12
   )
   public static final String method3767(byte arg0, int[] arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7305;
         StringBuffer var3 = new StringBuffer();
         int var4 = class583.field8438;
         if (arg0 >= -40) {
            return null;
         } else {
            int var5 = 0;
            if (!var2 && ~var5 <= ~arg1.length) {
               return var3.toString();
            } else {
               do {
                  class372 var6 = class681.field9992.method3914((byte)127, arg1[var5]);
                  if (var6.field5526 != -1) {
                     class476 var7 = (class476)class217.field3287.method1584((long)var6.field5526, 1);
                     if (var7 == null) {
                        class94 var8 = class94.method913(class392.field5782, var6.field5526, 0);
                        if (var8 != null) {
                           var7 = class444.field6473.method307(var8, true);
                           class217.field3287.method1581((long)var6.field5526, 0, var7);
                        }
                     }

                     if (var7 != null) {
                        class207.field3090[var4] = var7;
                        var3.append(field7320[6]).append(var4).append(">");
                        ++var4;
                     }
                  }

                  ++var5;
               } while(~var5 > ~arg1.length);

               return var3.toString();
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7320[5] + arg0 + ',' + (arg1 != null ? field7320[2] : field7320[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(II)Z",
      line = 62
   )
   public static final boolean method3768(int arg0, int arg1) {
      try {
         ++field7312;
         if (arg1 != 13879) {
            return false;
         } else {
            return ~arg0 == -4 || ~arg0 == -6 || ~arg0 == -7;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7320[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "([BIII)V",
      line = 76
   )
   public final void method3769(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7318;
         if (arg1 < 125) {
            this.method3773((class703)null, 95, true);
         }

         this.field7313.method1488(arg0, arg3, -15857, this.field7316.method431(arg3, -5125) * arg2);
         this.method3773(this.field7313, arg2, true);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7320[4] + (arg0 != null ? field7320[2] : field7320[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(Z)V",
      line = 88
   )
   public final void method3770(boolean arg0) {
      try {
         ++field7311;
         this.method3773(this.field7307, this.field7317, true);
         if (arg0) {
            field7310 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7320[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(B)V",
      line = 103
   )
   public static void method3771(byte arg0) {
      try {
         if (arg0 != -31) {
            field7310 = null;
         }

         field7310 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7320[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(I)V",
      line = 126
   )
   private final void method3772(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field7319;
         if (this.field7315) {
            this.field7315 = false;
            byte[] var3 = this.field7303.field11087;
            byte[] var4 = this.field7316.field873;
            int var5 = 0;
            int var6 = this.field7303.field11086;
            int var7 = this.field7309 - -(this.field7303.field11086 * this.field7314);
            if (arg0 < 12) {
               method3771((byte)-114);
            }

            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            if (var2) {
               var5 = (var5 << 8) - var5;
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            } else {
               if (var8 >= 0) {
                  if (!var2) {
                     if (this.field7308 != null && ~this.field7304 == ~var5) {
                        this.field7315 = false;
                        return;
                     }

                     this.field7304 = var5;
                     var10 = this.field7309 - -(this.field7314 * var6);
                     var11 = 0;
                     var12 = -128;
                     if (!var2 && ~var12 <= -1) {
                        if (this.field7308 != null) {
                           this.field7308.method2198(0, 128, 0, this.field7316.field873, 6406, 126, false, 0, 128, 0);
                           return;
                        }

                        this.field7308 = new class281(this.field7316, 3553, 6406, 128, 128, false, this.field7316.field873, 6406, false);
                        this.field7308.method2195(false, (byte)-59, false);
                        this.field7308.method5132(true, 0);
                        return;
                     }

                     do {
                        var13 = -128;
                        if (var2) {
                           if (~var3[var10] != -1) {
                              var4[var11++] = 68;
                              if (var2) {
                                 var14 = 0;
                                 if (var3[var10 - 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var6 + var10] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var10 - -var6] != -1) {
                                    ++var14;
                                 }

                                 var4[var11++] = (byte)(var14 * 17);
                                 ++var10;
                                 ++var13;
                              } else {
                                 ++var10;
                                 ++var13;
                              }
                           } else {
                              var14 = 0;
                              if (var3[var10 - 1] != 0) {
                                 ++var14;
                              }

                              if (var3[var10 + 1] != 0) {
                                 ++var14;
                              }

                              if (var3[-var6 + var10] != 0) {
                                 ++var14;
                              }

                              if (~var3[var10 - -var6] != -1) {
                                 ++var14;
                              }

                              var4[var11++] = (byte)(var14 * 17);
                              ++var10;
                              ++var13;
                           }
                        }

                        while(true) {
                           while(~var13 > -1) {
                              if (~var3[var10] != -1) {
                                 var4[var11++] = 68;
                                 if (var2) {
                                    var14 = 0;
                                    if (var3[var10 - 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var6 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var10 - -var6] != -1) {
                                       ++var14;
                                    }

                                    var4[var11++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var14 = 0;
                                 if (var3[var10 - 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var6 + var10] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var10 - -var6] != -1) {
                                    ++var14;
                                 }

                                 var4[var11++] = (byte)(var14 * 17);
                                 ++var10;
                                 ++var13;
                              }
                           }

                           var10 += this.field7303.field11086 + -128;
                           if (!var2) {
                              ++var12;
                              break;
                           }

                           var14 = 0;
                           if (var3[var10 - 1] != 0) {
                              ++var14;
                           }

                           if (var3[var10 + 1] != 0) {
                              ++var14;
                           }

                           if (var3[-var6 + var10] != 0) {
                              ++var14;
                           }

                           if (~var3[var10 - -var6] != -1) {
                              ++var14;
                           }

                           var4[var11++] = (byte)(var14 * 17);
                           ++var10;
                           ++var13;
                        }
                     } while(~var12 > -1);

                     if (this.field7308 != null) {
                        this.field7308.method2198(0, 128, 0, this.field7316.field873, 6406, 126, false, 0, 128, 0);
                        return;
                     }

                     this.field7308 = new class281(this.field7316, 3553, 6406, 128, 128, false, this.field7316.field873, 6406, false);
                     this.field7308.method2195(false, (byte)-59, false);
                     this.field7308.method5132(true, 0);
                     return;
                  }
               } else {
                  var5 = (var5 << 8) - var5;
               }

               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(var9 < 0) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }

               var7 += var6 - 128;
               if (!var2) {
                  ++var8;
                  if (var8 >= 0) {
                     if (!var2) {
                        if (this.field7308 != null && ~this.field7304 == ~var5) {
                           this.field7315 = false;
                           return;
                        }

                        this.field7304 = var5;
                        var10 = this.field7309 - -(this.field7314 * var6);
                        var11 = 0;
                        var12 = -128;
                        if (!var2 && ~var12 <= -1) {
                           if (this.field7308 != null) {
                              this.field7308.method2198(0, 128, 0, this.field7316.field873, 6406, 126, false, 0, 128, 0);
                              return;
                           }

                           this.field7308 = new class281(this.field7316, 3553, 6406, 128, 128, false, this.field7316.field873, 6406, false);
                           this.field7308.method2195(false, (byte)-59, false);
                           this.field7308.method5132(true, 0);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (~var3[var10] != -1) {
                                 var4[var11++] = 68;
                                 if (var2) {
                                    var14 = 0;
                                    if (var3[var10 - 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var6 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var10 - -var6] != -1) {
                                       ++var14;
                                    }

                                    var4[var11++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var14 = 0;
                                 if (var3[var10 - 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var6 + var10] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var10 - -var6] != -1) {
                                    ++var14;
                                 }

                                 var4[var11++] = (byte)(var14 * 17);
                                 ++var10;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (~var3[var10] != -1) {
                                    var4[var11++] = 68;
                                    if (var2) {
                                       var14 = 0;
                                       if (var3[var10 - 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[var10 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var6 + var10] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var10 - -var6] != -1) {
                                          ++var14;
                                       }

                                       var4[var11++] = (byte)(var14 * 17);
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var14 = 0;
                                    if (var3[var10 - 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var6 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var10 - -var6] != -1) {
                                       ++var14;
                                    }

                                    var4[var11++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              var10 += this.field7303.field11086 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var14 = 0;
                              if (var3[var10 - 1] != 0) {
                                 ++var14;
                              }

                              if (var3[var10 + 1] != 0) {
                                 ++var14;
                              }

                              if (var3[-var6 + var10] != 0) {
                                 ++var14;
                              }

                              if (~var3[var10 - -var6] != -1) {
                                 ++var14;
                              }

                              var4[var11++] = (byte)(var14 * 17);
                              ++var10;
                              ++var13;
                           }
                        } while(~var12 > -1);

                        if (this.field7308 != null) {
                           this.field7308.method2198(0, 128, 0, this.field7316.field873, 6406, 126, false, 0, 128, 0);
                           return;
                        }

                        this.field7308 = new class281(this.field7316, 3553, 6406, 128, 128, false, this.field7316.field873, 6406, false);
                        this.field7308.method2195(false, (byte)-59, false);
                        this.field7308.method5132(true, 0);
                        return;
                     }
                  } else {
                     var5 = (var5 << 8) - var5;
                  }

                  var9 = -128;
                  if (var2) {
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
         throw class608.method4462(var16, field7320[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(Lee;IZ)V",
      line = 357
   )
   private final void method3773(class703 arg0, int arg1, boolean arg2) {
      try {
         ++field7306;
         if (arg1 != 0) {
            if (!arg2) {
               this.method3772(126);
            }

            this.method3772(63);
            this.field7316.method252(this.field7308, (byte)-104);
            this.field7316.method384(arg0, arg1, (byte)-94, 0, 4);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7320[1] + (arg0 != null ? field7320[2] : field7320[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3774(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3775(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
