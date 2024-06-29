import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {
   @OriginalMember(
      owner = "client!qia",
      name = "n",
      descriptor = "Z"
   )
   public boolean field265;
   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "I"
   )
   private int field260;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "Lgia;"
   )
   private class284 field276;
   @OriginalMember(
      owner = "client!qia",
      name = "t",
      descriptor = "Lea;"
   )
   private class573 field271;
   @OriginalMember(
      owner = "client!qia",
      name = "r",
      descriptor = "I"
   )
   private int field277;
   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "I"
   )
   private int field264;
   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "I"
   )
   private int field272;
   @OriginalMember(
      owner = "client!qia",
      name = "q",
      descriptor = "Llfa;"
   )
   private class126 field274;
   @OriginalMember(
      owner = "client!qia",
      name = "p",
      descriptor = "Laha;"
   )
   private class404 field268;
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "Lbha;"
   )
   private class601 field270;
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field278 = new String[]{method147(method146(",wYd\u001cu")), method147(method146("&0\u0016d#")), method147(method146("3kT&")), method147(method146(",wYd\u0018u")), method147(method146(",wYd\u001bu")), method147(method146(",wYdb4pQ>`u")), method147(method146(",wYd\u001du")), method147(method146(",wYd\u001fu")), method147(method146(",wYd\u001au")), method147(method146(",wYd\u0019u"))};
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field259 = false;
   @OriginalMember(
      owner = "client!qia",
      name = "j",
      descriptor = "Llea;"
   )
   public static class639 field266 = new class639(11, 4);
   @OriginalMember(
      owner = "client!qia",
      name = "o",
      descriptor = "D"
   )
   public static double field267;
   @OriginalMember(
      owner = "client!qia",
      name = "m",
      descriptor = "I"
   )
   public static int field258;
   @OriginalMember(
      owner = "client!qia",
      name = "k",
      descriptor = "I"
   )
   public static int field261;
   @OriginalMember(
      owner = "client!qia",
      name = "s",
      descriptor = "I"
   )
   public static int field262;
   @OriginalMember(
      owner = "client!qia",
      name = "l",
      descriptor = "I"
   )
   public static int field263;
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "I"
   )
   public static int field269;
   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "I"
   )
   public static int field273;
   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "I"
   )
   public static int field275;

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field273;
         int var8 = -arg6 + arg5;
         int var9 = arg0 + arg6;
         if (arg1 != 17781) {
            field267 = -1.496174157409892D;
         }

         int var10 = arg0;
         if (var7) {
            class149.method1249(arg1 + -17788, arg4, arg2, class341.field4631[arg0], arg3);
            var10 = arg0 + 1;
         }

         while(true) {
            while(~var10 > ~var9) {
               class149.method1249(arg1 + -17788, arg4, arg2, class341.field4631[var10], arg3);
               ++var10;
            }

            int var11 = arg5;
            if (!var7) {
               if (var7) {
                  class149.method1249(-7, arg4, arg2, class341.field4631[arg5], arg3);
                  var11 = arg5 - 1;
               }

               while(true) {
                  while(var11 > var8) {
                     class149.method1249(-7, arg4, arg2, class341.field4631[var11], arg3);
                     --var11;
                  }

                  int var12 = arg4 - -arg6;
                  int var13 = -arg6 + arg3;
                  int var14 = var9;
                  if (!var7) {
                     if (!var7 && var8 < var9) {
                        return;
                     }

                     do {
                        int[] var15 = class341.field4631[var14];
                        class149.method1249(-7, arg4, arg2, var15, var12);
                        class149.method1249(-7, var13, arg2, var15, arg3);
                        ++var14;
                     } while(var8 >= var14);

                     return;
                  }

                  --var11;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field278[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method140(int arg0) {
      try {
         class220.field3148.method2898((byte)-38);
         ++field269;
         class136.field1737.method50(124);
         class136.field1737.field114 = 0;
         class124.field1612 = 0;
         class136.field1737.field105.field1856 = 0;
         class136.field1737.field115 = null;
         class136.field1737.field113 = null;
         class136.field1737.field117 = null;
         class284.method2151(true);
         class209.field2981 = null;
         class478.field6879 = 0;
         class506.field7358 = null;
         class257.field3490 = 0;
         class719.field10493 = null;
         if (arg0 >= -93) {
            method140(-28);
         }

         class408.field5907 = null;
         class710.field10360 = 0;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field278[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method141(int arg0, byte[] arg1, int arg2, int arg3) {
      try {
         this.field268.method1010((byte)102, arg2, arg1, this.field271.method4150(true, arg2) * arg0);
         if (arg3 != 0) {
            method139(-108, -102, 48, 24, 112, 108, -81);
         }

         ++field258;
         this.method142((byte)-102, this.field268, arg0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field278[4] + arg0 + ',' + (arg1 != null ? field278[1] : field278[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(BLlfa;I)V"
   )
   private final void method142(byte arg0, class126 arg1, int arg2) {
      try {
         ++field275;
         if (arg0 == -102) {
            if (arg2 != 0) {
               this.method143((byte)-107);
               this.field271.method4107(-124, this.field270);
               this.field271.method4136(4, arg1, 0, arg2, 91);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field278[0] + arg0 + ',' + (arg1 != null ? field278[1] : field278[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method143(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field263;
         if (this.field265) {
            this.field265 = false;
            byte[] var3 = this.field276.field3944;
            byte[] var4 = this.field271.field8503;
            byte var5 = 0;
            int var6 = this.field276.field3941;
            int var7 = this.field276.field3941 * this.field264 + this.field277;
            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var10000;
            int var17;
            int var10001;
            if (var2) {
               var17 = -var5 + (var5 << 8);
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }
            } else {
               if (var8 >= 0) {
                  var10000 = arg0;
                  var10001 = -70;
                  if (!var2) {
                     if (arg0 >= -70) {
                        this.field265 = false;
                     }

                     if (this.field270 != null && ~this.field260 == ~var5) {
                        this.field265 = false;
                        return;
                     }

                     this.field260 = var5;
                     var10 = this.field264 * var6 + this.field277;
                     var11 = 0;
                     var12 = -128;
                     if (!var2 && ~var12 <= -1) {
                        if (this.field270 != null) {
                           this.field270.method4375(false, 128, 0, 0, this.field271.field8503, 6406, 3317, 0, 128, 0);
                           return;
                        }

                        this.field270 = new class601(this.field271, 3553, 6406, 128, 128, false, this.field271.field8503, 6406, false);
                        this.field270.method4372(false, false, (byte)105);
                        this.field270.method3526(true, 32);
                        return;
                     }

                     do {
                        var13 = -128;
                        if (var2) {
                           if (~var3[var10] == -1) {
                              var14 = 0;
                              if (~var3[var10 + -1] != -1) {
                                 ++var14;
                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }
                              } else if (var3[var10 + 1] != 0) {
                                 ++var14;
                              }

                              if (~var3[-var6 + var10] != -1) {
                                 ++var14;
                                 if (var3[var6 + var10] != 0) {
                                    ++var14;
                                 }
                              } else if (var3[var6 + var10] != 0) {
                                 ++var14;
                              }

                              var4[var11++] = (byte)(var14 * 17);
                              if (var2) {
                                 var4[var11++] = 68;
                                 ++var10;
                                 ++var13;
                              } else {
                                 ++var10;
                                 ++var13;
                              }
                           } else {
                              var4[var11++] = 68;
                              ++var10;
                              ++var13;
                           }
                        }

                        while(true) {
                           while(~var13 > -1) {
                              if (~var3[var10] == -1) {
                                 var14 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var14;
                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[-var6 + var10] != -1) {
                                    ++var14;
                                    if (var3[var6 + var10] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var6 + var10] != 0) {
                                    ++var14;
                                 }

                                 var4[var11++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var4[var11++] = 68;
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var4[var11++] = 68;
                                 ++var10;
                                 ++var13;
                              }
                           }

                           var10 += this.field276.field3941 - 128;
                           if (!var2) {
                              ++var12;
                              break;
                           }

                           var4[var11++] = 68;
                           ++var10;
                           ++var13;
                        }
                     } while(~var12 > -1);

                     if (this.field270 != null) {
                        this.field270.method4375(false, 128, 0, 0, this.field271.field8503, 6406, 3317, 0, 128, 0);
                        return;
                     }

                     this.field270 = new class601(this.field271, 3553, 6406, 128, 128, false, this.field271.field8503, 6406, false);
                     this.field270.method4372(false, false, (byte)105);
                     this.field270.method3526(true, 32);
                     return;
                  }
               } else {
                  var10000 = -var5;
                  var10001 = var5 << 8;
               }

               var17 = var10000 + var10001;
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(~var9 > -1) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }

               var7 += var6 + -128;
               if (!var2) {
                  ++var8;
                  if (var8 >= 0) {
                     var10000 = arg0;
                     var10001 = -70;
                     if (!var2) {
                        if (arg0 >= -70) {
                           this.field265 = false;
                        }

                        if (this.field270 != null && ~this.field260 == ~var17) {
                           this.field265 = false;
                           return;
                        }

                        this.field260 = var17;
                        var10 = this.field264 * var6 + this.field277;
                        var11 = 0;
                        var12 = -128;
                        if (!var2 && ~var12 <= -1) {
                           if (this.field270 != null) {
                              this.field270.method4375(false, 128, 0, 0, this.field271.field8503, 6406, 3317, 0, 128, 0);
                              return;
                           }

                           this.field270 = new class601(this.field271, 3553, 6406, 128, 128, false, this.field271.field8503, 6406, false);
                           this.field270.method4372(false, false, (byte)105);
                           this.field270.method3526(true, 32);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (~var3[var10] == -1) {
                                 var14 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var14;
                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[-var6 + var10] != -1) {
                                    ++var14;
                                    if (var3[var6 + var10] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var6 + var10] != 0) {
                                    ++var14;
                                 }

                                 var4[var11++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var4[var11++] = 68;
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var4[var11++] = 68;
                                 ++var10;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (~var3[var10] == -1) {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                       if (var3[var10 + 1] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[-var6 + var10] != -1) {
                                       ++var14;
                                       if (var3[var6 + var10] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var6 + var10] != 0) {
                                       ++var14;
                                    }

                                    var4[var11++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var4[var11++] = 68;
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var4[var11++] = 68;
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              var10 += this.field276.field3941 - 128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var4[var11++] = 68;
                              ++var10;
                              ++var13;
                           }
                        } while(~var12 > -1);

                        if (this.field270 != null) {
                           this.field270.method4375(false, 128, 0, 0, this.field271.field8503, 6406, 3317, 0, 128, 0);
                           return;
                        }

                        this.field270 = new class601(this.field271, 3553, 6406, 128, 128, false, this.field271.field8503, 6406, false);
                        this.field270.method4372(false, false, (byte)105);
                        this.field270.method3526(true, 32);
                        return;
                     }
                  } else {
                     var10000 = -var17;
                     var10001 = var17 << 8;
                  }

                  var17 = var10000 + var10001;
                  var9 = -128;
                  if (var2) {
                     if (~var3[var7++] != -1) {
                        ++var17;
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field278[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method144(int arg0) {
      try {
         ++field261;
         int var2 = -72 % ((-18 - arg0) / 61);
         this.method142((byte)-102, this.field274, this.field272);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field278[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method145(int arg0) {
      try {
         field266 = null;
         if (arg0 != 0) {
            method140(33);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field278[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(Lea;Lgia;Lkk;IIIII)V"
   )
   public class23(class573 arg0, class284 arg1, class204 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field4360;
      super();
      this.field265 = true;
      this.field260 = -1;

      try {
         this.field276 = arg1;
         this.field271 = arg0;
         this.field277 = arg6;
         this.field264 = arg7;
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
         class147 var18;
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
            var15 = (var13 + var14) * arg2.field4071 - -var12;
            var16 = 0;
            if (var9) {
               var17 = arg2.field2909[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (~var10 >= ~var14) {
               this.field272 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (!var9) {
                  if (var10000 >= -1) {
                     this.field270 = null;
                     return;
                  }

                  label321: {
                     var18 = new class147(var11 * 2);
                     if (this.field271.field8469) {
                        var19 = 0;
                        if (var9 || ~var19 > ~var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field4071 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field2909[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && ~var22.length >= ~var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method1185(var22[var23] & 65535, true);
                                             ++var23;
                                          } while(~var22.length < ~var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(~var19 > ~var10);
                        }

                        if (!var9) {
                           break label321;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var10 < ~var24) {
                        do {
                           var25 = (var13 + var24) * arg2.field4071 + var12;
                           var26 = 0;
                           if (var9 || var10 > var26) {
                              do {
                                 var27 = arg2.field2909[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (!var9 && ~var27.length >= ~var28) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method1205(124, var27[var28] & 65535);
                                          ++var28;
                                       } while(~var27.length < ~var28);

                                       ++var26;
                                    }
                                 }
                              } while(var10 > var26);
                           }

                           ++var24;
                        } while(~var10 < ~var24);
                     }
                  }

                  this.field274 = this.field271.method4177(var18.field1889, 5123, false, 68, var18.field1856);
                  this.field268 = new class404(this.field271, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4071;
               var10001 = -var12;
            }

            var15 = var10000 - var10001;
            var16 = 0;
            if (var9) {
               var17 = arg2.field2909[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(~var10 < ~var16) {
               var17 = arg2.field2909[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (~var10 >= ~var14) {
               this.field272 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (!var9) {
                  if (var10000 >= -1) {
                     this.field270 = null;
                     return;
                  }

                  label329: {
                     var18 = new class147(var11 * 2);
                     if (this.field271.field8469) {
                        var19 = 0;
                        if (var9 || ~var19 > ~var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field4071 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field2909[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && ~var22.length >= ~var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method1185(var22[var23] & 65535, true);
                                             ++var23;
                                          } while(~var22.length < ~var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(~var19 > ~var10);
                        }

                        if (!var9) {
                           break label329;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var10 < ~var24) {
                        do {
                           var25 = (var13 + var24) * arg2.field4071 + var12;
                           var26 = 0;
                           if (var9 || var10 > var26) {
                              do {
                                 var27 = arg2.field2909[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (!var9 && ~var27.length >= ~var28) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method1205(124, var27[var28] & 65535);
                                          ++var28;
                                       } while(~var27.length < ~var28);

                                       ++var26;
                                    }
                                 }
                              } while(var10 > var26);
                           }

                           ++var24;
                        } while(~var10 < ~var24);
                     }
                  }

                  this.field274 = this.field271.method4177(var18.field1889, 5123, false, 68, var18.field1856);
                  this.field268 = new class404(this.field271, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4071;
               var10001 = -var12;
            }

            var15 = var10000 - var10001;
            var16 = 0;
            if (var9) {
               var17 = arg2.field2909[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field278[5] + (arg0 != null ? field278[1] : field278[2]) + ',' + (arg1 != null ? field278[1] : field278[2]) + ',' + (arg2 != null ? field278[1] : field278[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method146(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method147(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
