import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class108 {
   @OriginalMember(
      owner = "client!ad",
      name = "r",
      descriptor = "Z"
   )
   public boolean field1688;
   @OriginalMember(
      owner = "client!ad",
      name = "h",
      descriptor = "I"
   )
   private int field1694;
   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "Lgw;"
   )
   private class615 field1700;
   @OriginalMember(
      owner = "client!ad",
      name = "i",
      descriptor = "I"
   )
   private int field1691;
   @OriginalMember(
      owner = "client!ad",
      name = "l",
      descriptor = "I"
   )
   private int field1695;
   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "Laea;"
   )
   private class678 field1692;
   @OriginalMember(
      owner = "client!ad",
      name = "j",
      descriptor = "I"
   )
   private int field1685;
   @OriginalMember(
      owner = "client!ad",
      name = "p",
      descriptor = "Lss;"
   )
   private class723 field1684;
   @OriginalMember(
      owner = "client!ad",
      name = "n",
      descriptor = "Lkb;"
   )
   private class101 field1690;
   @OriginalMember(
      owner = "client!ad",
      name = "t",
      descriptor = "Lmn;"
   )
   private class8 field1683;
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1702 = new String[]{method1067(method1066("\u001c5V\u0001\u0004")), method1067(method1066("\u001c5V\u0005\u0004")), method1067(method1066("\u0006\u007fViQ")), method1067(method1066("\u0013$\u0014+")), method1067(method1066("\u001c5V\u000f\u0004")), method1067(method1066("\u001c5V\u0002\u0004")), method1067(method1066("\u001c5V\u0000\u0004")), method1067(method1066("\u001c5V{E\u00138\fy\u0004")), method1067(method1066("\u001a?\bt\f\u00108\u000b}")), method1067(method1066("\u001a?\bs\f\b:B")), method1067(method1066("\u001a?\bv\f\r>\u000b}")), method1067(method1066("\u001a?\bu\f\r>\u000b}")), method1067(method1066("]!\u000b.V\u0018k")), method1067(method1066("\u001c5V\u0004\u0004")), method1067(method1066("]\"\u0011=IG")), method1067(method1066("\u001c5V\u0003\u0004")), method1067(method1066("\u001c5V\u0006\u0004"))};
   @OriginalMember(
      owner = "client!ad",
      name = "k",
      descriptor = "I"
   )
   public static int field1689 = 0;
   @OriginalMember(
      owner = "client!ad",
      name = "s",
      descriptor = "I"
   )
   public static int field1686;
   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "I"
   )
   public static int field1687;
   @OriginalMember(
      owner = "client!ad",
      name = "g",
      descriptor = "I"
   )
   public static int field1693;
   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "I"
   )
   public static int field1696;
   @OriginalMember(
      owner = "client!ad",
      name = "m",
      descriptor = "I"
   )
   public static int field1697;
   @OriginalMember(
      owner = "client!ad",
      name = "q",
      descriptor = "I"
   )
   public static int field1698;
   @OriginalMember(
      owner = "client!ad",
      name = "o",
      descriptor = "I"
   )
   public static int field1699;
   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "I"
   )
   public static int field1701;
   @OriginalMember(
      owner = "client!ad",
      name = "f",
      descriptor = "Lma;"
   )
   public static class148 field1682;

   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1058(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1696;
         if (this.field1688) {
            this.field1688 = false;
            byte[] var3 = this.field1700.field8738;
            byte[] var4 = this.field1692.field9829;
            byte var5 = 0;
            int var6 = this.field1700.field8749;
            int var7 = this.field1700.field8749 * this.field1691 + this.field1695;
            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var10000;
            int var17;
            if (var2) {
               var17 = (var5 << 8) - var5;
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }
            } else {
               byte var18;
               if (~var8 <= -1) {
                  var10000 = arg0;
                  var18 = -38;
                  if (!var2) {
                     if (arg0 > -38) {
                        this.field1692 = null;
                     }

                     if (this.field1683 != null && this.field1694 == var5) {
                        this.field1688 = false;
                        return;
                     }

                     this.field1694 = var5;
                     var10 = 0;
                     var11 = this.field1691 * var6 + this.field1695;
                     var12 = -128;
                     if (!var2 && ~var12 <= -1) {
                        if (this.field1683 == null) {
                           this.field1683 = new class8(this.field1692, 3553, 6406, 128, 128, false, this.field1692.field9829, 6406, false);
                           this.field1683.method67(false, 118, false);
                           this.field1683.method5204(true, -1);
                           return;
                        }

                        this.field1683.method68(this.field1692.field9829, false, 128, 128, 0, 0, 6406, 0, 0, (byte)4);
                        return;
                     }

                     do {
                        var13 = -128;
                        if (var2) {
                           if (var3[var11] == 0) {
                              var14 = 0;
                              if (~var3[var11 + -1] != -1) {
                                 ++var14;
                                 if (var3[var11 + 1] != 0) {
                                    ++var14;
                                 }
                              } else if (var3[var11 + 1] != 0) {
                                 ++var14;
                              }

                              if (~var3[var11 - var6] != -1) {
                                 ++var14;
                                 if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }
                              } else if (~var3[var6 + var11] != -1) {
                                 ++var14;
                              }

                              var4[var10++] = (byte)(var14 * 17);
                              if (var2) {
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
                                 if (~var3[var11 + -1] != -1) {
                                    ++var14;
                                    if (var3[var11 + 1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var11 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2) {
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

                           var11 += this.field1700.field8749 + -128;
                           if (!var2) {
                              ++var12;
                              break;
                           }

                           var4[var10++] = 68;
                           ++var11;
                           ++var13;
                        }
                     } while(~var12 > -1);

                     if (this.field1683 == null) {
                        this.field1683 = new class8(this.field1692, 3553, 6406, 128, 128, false, this.field1692.field9829, 6406, false);
                        this.field1683.method67(false, 118, false);
                        this.field1683.method5204(true, -1);
                        return;
                     }

                     this.field1683.method68(this.field1692.field9829, false, 128, 128, 0, 0, 6406, 0, 0, (byte)4);
                     return;
                  }
               } else {
                  var10000 = var5 << 8;
                  var18 = var5;
               }

               var17 = var10000 - var18;
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(var9 < 0) {
                  if (~var3[var7++] != -1) {
                     ++var17;
                  }

                  ++var9;
               }

               var7 += var6 + -128;
               if (!var2) {
                  ++var8;
                  int var10001;
                  if (~var8 <= -1) {
                     var10000 = arg0;
                     var10001 = -38;
                     if (!var2) {
                        if (arg0 > -38) {
                           this.field1692 = null;
                        }

                        if (this.field1683 != null && this.field1694 == var17) {
                           this.field1688 = false;
                           return;
                        }

                        this.field1694 = var17;
                        var10 = 0;
                        var11 = this.field1691 * var6 + this.field1695;
                        var12 = -128;
                        if (!var2 && ~var12 <= -1) {
                           if (this.field1683 == null) {
                              this.field1683 = new class8(this.field1692, 3553, 6406, 128, 128, false, this.field1692.field9829, 6406, false);
                              this.field1683.method67(false, 118, false);
                              this.field1683.method5204(true, -1);
                              return;
                           }

                           this.field1683.method68(this.field1692.field9829, false, 128, 128, 0, 0, 6406, 0, 0, (byte)4);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (~var3[var11 + -1] != -1) {
                                    ++var14;
                                    if (var3[var11 + 1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var11 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2) {
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
                                    if (~var3[var11 + -1] != -1) {
                                       ++var14;
                                       if (var3[var11 + 1] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var11 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var11 - var6] != -1) {
                                       ++var14;
                                       if (~var3[var6 + var11] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }

                                    var4[var10++] = (byte)(var14 * 17);
                                    if (var2) {
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

                              var11 += this.field1700.field8749 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        } while(~var12 > -1);

                        if (this.field1683 == null) {
                           this.field1683 = new class8(this.field1692, 3553, 6406, 128, 128, false, this.field1692.field9829, 6406, false);
                           this.field1683.method67(false, 118, false);
                           this.field1683.method5204(true, -1);
                           return;
                        }

                        this.field1683.method68(this.field1692.field9829, false, 128, 128, 0, 0, 6406, 0, 0, (byte)4);
                        return;
                     }
                  } else {
                     var10000 = var17 << 8;
                     var10001 = var17;
                  }

                  var17 = var10000 - var10001;
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
         throw class612.method4503(var16, field1702[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "(I)[Leu;"
   )
   public static final class634[] method1059(int arg0) {
      try {
         if (arg0 != -23386) {
            field1682 = null;
         }

         ++field1699;
         return new class634[]{class453.field6594, class368.field5439, class530.field7480};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1702[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1060(boolean arg0) {
      try {
         class344.method2733(255, 122, -1);
         if (arg0) {
            field1682 = null;
         }

         ++field1686;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1702[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method1061(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         this.field1690.method996(arg1, arg2, -76, this.field1692.method4928(arg3 + 7896, arg1) * arg0);
         ++field1693;
         this.method1063(arg0, this.field1690, (byte)12);
         if (arg3 != 0) {
            method1062(-83);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1702[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1702[2] : field1702[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1062(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(ILss;B)V"
   )
   private final void method1063(int arg0, class723 arg1, byte arg2) {
      try {
         ++field1701;
         if (~arg0 != -1) {
            this.method1058(-99);
            this.field1692.method4906(-2, this.field1683);
            if (arg2 <= 2) {
               this.field1695 = 100;
            }

            this.field1692.method4952(124, 4, arg0, 0, arg1);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1702[4] + arg0 + ',' + (arg1 != null ? field1702[2] : field1702[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1064(int arg0) {
      try {
         if (arg0 > -114) {
            method1060(true);
         }

         this.method1063(this.field1685, this.field1684, (byte)53);
         ++field1687;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1702[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1065(int arg0) {
      try {
         field1682 = null;
         if (arg0 != 1) {
            method1060(false);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1702[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(Laea;Lgw;Ljea;IIIII)V"
   )
   public class108(class678 arg0, class615 arg1, class6 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field10022;
      super();
      this.field1688 = true;
      this.field1694 = -1;

      try {
         this.field1700 = arg1;
         this.field1691 = arg7;
         this.field1695 = arg6;
         this.field1692 = arg0;
         int var10 = 1 << arg5;
         int var11 = 0;
         int var12 = arg3 << arg5;
         int var13 = arg4 << arg5;
         int var14 = 0;
         int var15;
         int var16;
         int var10000;
         short[] var17;
         class65 var18;
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
            var15 = (var13 + var14) * arg2.field10665 + var12;
            var16 = 0;
            if (var9) {
               var17 = arg2.field71[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (var14 >= var10) {
               this.field1685 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field1683 = null;
                     return;
                  }

                  label317: {
                     var18 = new class65(var11 * 2);
                     if (!this.field1692.field9826) {
                        var19 = 0;
                        if (var9 || var19 < var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field10665 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field71[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && ~var22.length >= ~var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method695(65535 & var22[var23], (byte)-80);
                                             ++var23;
                                          } while(~var22.length < ~var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(var19 < var10);
                        }

                        if (!var9) {
                           break label317;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 - -var24) * arg2.field10665 + var12;
                           var26 = 0;
                           if (var9 || ~var10 < ~var26) {
                              do {
                                 var27 = arg2.field71[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method653(var27[var28] & 65535, -99);
                                       ++var28;
                                    }

                                    while(~var28 > ~var27.length) {
                                       var18.method653(var27[var28] & 65535, -99);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var10 < ~var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field1684 = this.field1692.method4899(5123, -100, var18.field942, false, var18.field945);
                  this.field1690 = new class101(this.field1692, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field10665 + var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field71[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(~var16 > ~var10) {
               var17 = arg2.field71[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (var14 >= var10) {
               this.field1685 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field1683 = null;
                     return;
                  }

                  label325: {
                     var18 = new class65(var11 * 2);
                     if (!this.field1692.field9826) {
                        var19 = 0;
                        if (var9 || var19 < var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field10665 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field71[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && ~var22.length >= ~var23) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method695(65535 & var22[var23], (byte)-80);
                                             ++var23;
                                          } while(~var22.length < ~var23);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(var19 < var10);
                        }

                        if (!var9) {
                           break label325;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 - -var24) * arg2.field10665 + var12;
                           var26 = 0;
                           if (var9 || ~var10 < ~var26) {
                              do {
                                 var27 = arg2.field71[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method653(var27[var28] & 65535, -99);
                                       ++var28;
                                    }

                                    while(~var28 > ~var27.length) {
                                       var18.method653(var27[var28] & 65535, -99);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var10 < ~var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field1684 = this.field1692.method4899(5123, -100, var18.field942, false, var18.field945);
                  this.field1690 = new class101(this.field1692, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field10665 + var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field71[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field1702[7] + (arg0 != null ? field1702[2] : field1702[3]) + ',' + (arg1 != null ? field1702[2] : field1702[3]) + ',' + (arg2 != null ? field1702[2] : field1702[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1066(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1067(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
