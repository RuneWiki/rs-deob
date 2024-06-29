import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class345 extends class213 {
   @OriginalMember(
      owner = "client!vv",
      name = "E",
      descriptor = "I"
   )
   private int field4941 = 5;
   @OriginalMember(
      owner = "client!vv",
      name = "N",
      descriptor = "I"
   )
   private int field4936 = 5;
   @OriginalMember(
      owner = "client!vv",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field4940 = new byte[512];
   @OriginalMember(
      owner = "client!vv",
      name = "S",
      descriptor = "I"
   )
   private int field4944 = 0;
   @OriginalMember(
      owner = "client!vv",
      name = "L",
      descriptor = "I"
   )
   private int field4948 = 2;
   @OriginalMember(
      owner = "client!vv",
      name = "M",
      descriptor = "I"
   )
   private int field4951 = 1;
   @OriginalMember(
      owner = "client!vv",
      name = "R",
      descriptor = "[S"
   )
   private short[] field4946 = new short[512];
   @OriginalMember(
      owner = "client!vv",
      name = "K",
      descriptor = "I"
   )
   private int field4952 = 2048;
   @OriginalMember(
      owner = "client!vv",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4953 = new String[]{method2732(method2731("U;$`d")), method2732(method2731("U;$bd")), method2732(method2731("M8fM")), method2732(method2731("Xc$\u000f1")), method2732(method2731("U;$cd")), method2732(method2731("U;$dd")), method2732(method2731("U;$jd")), method2732(method2731("U;$fd")), method2732(method2731("U;$ed")), method2732(method2731("U;$gd"))};
   @OriginalMember(
      owner = "client!vv",
      name = "J",
      descriptor = "I"
   )
   public static int field4937;
   @OriginalMember(
      owner = "client!vv",
      name = "H",
      descriptor = "I"
   )
   public static int field4938;
   @OriginalMember(
      owner = "client!vv",
      name = "D",
      descriptor = "I"
   )
   public static int field4939;
   @OriginalMember(
      owner = "client!vv",
      name = "O",
      descriptor = "I"
   )
   public static int field4942;
   @OriginalMember(
      owner = "client!vv",
      name = "F",
      descriptor = "I"
   )
   public static int field4943;
   @OriginalMember(
      owner = "client!vv",
      name = "Q",
      descriptor = "I"
   )
   public static int field4947;
   @OriginalMember(
      owner = "client!vv",
      name = "T",
      descriptor = "I"
   )
   public static int field4949;
   @OriginalMember(
      owner = "client!vv",
      name = "U",
      descriptor = "I"
   )
   public static int field4950;
   @OriginalMember(
      owner = "client!vv",
      name = "P",
      descriptor = "Lbo;"
   )
   public static class763 field4945;

   @OriginalMember(
      owner = "client!vv",
      name = "<init>",
      descriptor = "()V"
   )
   public class345() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "([Ljava/lang/Object;I[I)V"
   )
   public static final void method2726(Object[] arg0, int arg1, int[] arg2) {
      try {
         if (arg1 > 88) {
            ++field4947;
            class315.method2365(arg2.length + -1, arg2, true, 0, arg0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4953[1] + (arg0 != null ? field4953[3] : field4953[2]) + ',' + arg1 + ',' + (arg2 != null ? field4953[3] : field4953[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            method2727(84, -5, -104, -116, 41, -79, -69, -86, -60);
         }

         ++field4938;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = 2048 - -(class551.field7586[arg0] * this.field4941);
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            int var8 = 0;
            if (var3 || class576.field7916 > var8) {
               do {
                  int var10000;
                  int var21;
                  label348: {
                     class70.field876 = Integer.MAX_VALUE;
                     class148.field1938 = Integer.MAX_VALUE;
                     class131.field1665 = Integer.MAX_VALUE;
                     class566.field7722 = Integer.MAX_VALUE;
                     int var9 = 2048 - -(class534.field7301[var8] * this.field4936);
                     int var10 = var9 >> 12;
                     int var11 = var10 + 1;
                     int var12 = var6 + -1;
                     if (var3) {
                        var10000 = this.field4940[(~this.field4941 >= ~var12 ? -this.field4941 + var12 : var12) & 255] & 255;
                     } else if (~var7 > ~var12) {
                        var21 = this.field4948;
                        var10000 = var21;
                        if (!var3) {
                           break label348;
                        }
                     } else {
                        var10000 = this.field4940[(~this.field4941 >= ~var12 ? -this.field4941 + var12 : var12) & 255] & 255;
                     }

                     while(true) {
                        label345: {
                           int var13 = var10000;
                           int var14 = var10 + -1;
                           short var10001;
                           byte[] var10002;
                           int var10003;
                           int var10004;
                           byte var25;
                           if (var3) {
                              var25 = 2;
                              var10001 = 255;
                              var10002 = this.field4940;
                              var10003 = var13;
                              var10004 = ~var14 > ~this.field4936 ? var14 : var14 - this.field4936;
                           } else {
                              if (~var11 > ~var14) {
                                 break label345;
                              }

                              var25 = 2;
                              var10001 = 255;
                              var10002 = this.field4940;
                              var10003 = var13;
                              var10004 = ~var14 > ~this.field4936 ? var14 : var14 - this.field4936;
                           }

                           while(true) {
                              int var19;
                              label342: {
                                 int var16;
                                 int var17;
                                 label341: {
                                    int var26;
                                    double var27;
                                    label386: {
                                       label387: {
                                          int var15 = var25 * (var10001 & var10002[var10003 - -var10004 & 255]);
                                          int var24 = var15 + 1;
                                          var16 = var9 - (this.field4946[var15] - -(var14 << 12));
                                          var17 = -(var12 << 12) + -this.field4946[var24] + var5;
                                          int var18 = this.field4951;
                                          if (var18 != 1) {
                                             if (var18 == 3) {
                                                var17 = ~var17 > -1 ? -var17 : var17;
                                                var16 = ~var16 > -1 ? -var16 : var16;
                                                var10000 = ~var17 > ~var16 ? var16 : var17;
                                                break label387;
                                             }

                                             if (~var18 == -5) {
                                                var16 = (int)(4096.0D * Math.sqrt((double)((float)(~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                                var27 = 4096.0D;
                                                var26 = var17 < 0 ? -var17 : var17;
                                                break label386;
                                             }

                                             if (~var18 == -6) {
                                                break label341;
                                             }

                                             if (var18 != 2) {
                                                var19 = (int)(Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                                break label342;
                                             }

                                             if (!var3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
                                                if (var3) {
                                                   var19 = (int)(Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                                }
                                                break label342;
                                             }
                                          }

                                          var19 = var16 * var16 + var17 * var17 >> 12;
                                          if (!var3) {
                                             break label342;
                                          }

                                          var17 = ~var17 > -1 ? -var17 : var17;
                                          var16 = ~var16 > -1 ? -var16 : var16;
                                          var10000 = ~var17 > ~var16 ? var16 : var17;
                                       }

                                       var19 = var10000;
                                       if (!var3) {
                                          break label342;
                                       }

                                       var16 = (int)(4096.0D * Math.sqrt((double)((float)(~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                       var27 = 4096.0D;
                                       var26 = var17 < 0 ? -var17 : var17;
                                    }

                                    var17 = (int)(var27 * Math.sqrt((double)((float)var26 / 4096.0F)));
                                    int var20 = var16 + var17;
                                    var19 = var20 * var20 >> 12;
                                    if (!var3) {
                                       break label342;
                                    }
                                 }

                                 var17 *= var17;
                                 var16 *= var16;
                                 var19 = (int)(Math.sqrt(Math.sqrt((double)((float)(var16 + var17) / 1.6777216E7F))) * 4096.0D);
                                 if (var3) {
                                    var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
                                    if (var3) {
                                       var19 = (int)(Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                    }
                                 }
                              }

                              if (var19 >= class566.field7722) {
                                 if (class131.field1665 > var19) {
                                    class70.field876 = class148.field1938;
                                    class148.field1938 = class131.field1665;
                                    class131.field1665 = var19;
                                    if (var3) {
                                       if (var19 < class148.field1938) {
                                          class70.field876 = class148.field1938;
                                          class148.field1938 = var19;
                                          if (var3) {
                                             if (~var19 > ~class70.field876) {
                                                class70.field876 = var19;
                                                if (var3) {
                                                   class70.field876 = class148.field1938;
                                                   class148.field1938 = class131.field1665;
                                                   class131.field1665 = class566.field7722;
                                                   class566.field7722 = var19;
                                                   ++var14;
                                                } else {
                                                   ++var14;
                                                }
                                             } else {
                                                ++var14;
                                             }
                                          } else {
                                             ++var14;
                                          }
                                       } else if (~var19 > ~class70.field876) {
                                          class70.field876 = var19;
                                          if (var3) {
                                             class70.field876 = class148.field1938;
                                             class148.field1938 = class131.field1665;
                                             class131.field1665 = class566.field7722;
                                             class566.field7722 = var19;
                                             ++var14;
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else {
                                       ++var14;
                                    }
                                 } else if (var19 < class148.field1938) {
                                    class70.field876 = class148.field1938;
                                    class148.field1938 = var19;
                                    if (var3) {
                                       if (~var19 > ~class70.field876) {
                                          class70.field876 = var19;
                                          if (var3) {
                                             class70.field876 = class148.field1938;
                                             class148.field1938 = class131.field1665;
                                             class131.field1665 = class566.field7722;
                                             class566.field7722 = var19;
                                             ++var14;
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else {
                                       ++var14;
                                    }
                                 } else if (~var19 > ~class70.field876) {
                                    class70.field876 = var19;
                                    if (var3) {
                                       class70.field876 = class148.field1938;
                                       class148.field1938 = class131.field1665;
                                       class131.field1665 = class566.field7722;
                                       class566.field7722 = var19;
                                       ++var14;
                                    } else {
                                       ++var14;
                                    }
                                 } else {
                                    ++var14;
                                 }
                              } else {
                                 class70.field876 = class148.field1938;
                                 class148.field1938 = class131.field1665;
                                 class131.field1665 = class566.field7722;
                                 class566.field7722 = var19;
                                 ++var14;
                              }

                              if (~var11 > ~var14) {
                                 break;
                              }

                              var25 = 2;
                              var10001 = 255;
                              var10002 = this.field4940;
                              var10003 = var13;
                              var10004 = ~var14 > ~this.field4936 ? var14 : var14 - this.field4936;
                           }
                        }

                        ++var12;
                        if (~var7 > ~var12) {
                           var21 = this.field4948;
                           var10000 = var21;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = this.field4940[(~this.field4941 >= ~var12 ? -this.field4941 + var12 : var12) & 255] & 255;
                        }
                     }
                  }

                  label372: {
                     label371: {
                        label370: {
                           label369: {
                              label368: {
                                 if (var10000 != 0) {
                                    if (~var21 == -2) {
                                       break label368;
                                    }

                                    if (var21 == 3) {
                                       break label369;
                                    }

                                    if (~var21 == -5) {
                                       break label370;
                                    }

                                    if (~var21 != -3) {
                                       break label372;
                                    }

                                    if (!var3) {
                                       break label371;
                                    }
                                 }

                                 var4[var8] = class566.field7722;
                                 if (!var3) {
                                    break label372;
                                 }
                              }

                              var4[var8] = class131.field1665;
                              if (!var3) {
                                 break label372;
                              }
                           }

                           var4[var8] = class148.field1938;
                           if (!var3) {
                              break label372;
                           }
                        }

                        var4[var8] = class70.field876;
                        if (!var3) {
                           break label372;
                        }
                     }

                     var4[var8] = -class566.field7722 + class131.field1665;
                  }

                  ++var8;
               } while(class576.field7916 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field4953[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method2727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field4937;
         class625.field8733[class642.field9026++] = new class777(arg6, arg0, arg5, arg4, arg4, arg5, arg3, arg7, arg7, arg3, arg2, arg2, arg1, arg1);
         if (arg8 >= -64) {
            field4945 = null;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4953[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label78: {
            label77: {
               label76: {
                  label75: {
                     label74: {
                        label73: {
                           label72: {
                              if (~arg2 != -1) {
                                 if (arg2 == 1) {
                                    break label72;
                                 }

                                 if (arg2 == 2) {
                                    break label73;
                                 }

                                 if (arg2 == 3) {
                                    break label74;
                                 }

                                 if (arg2 == 4) {
                                    break label75;
                                 }

                                 if (arg2 == 5) {
                                    break label76;
                                 }

                                 if (~arg2 != -7) {
                                    break label78;
                                 }

                                 if (!var4) {
                                    break label77;
                                 }
                              }

                              this.field4936 = this.field4941 = arg0.method4288((byte)83);
                              if (!var4) {
                                 break label78;
                              }
                           }

                           this.field4944 = arg0.method4288((byte)84);
                           if (!var4) {
                              break label78;
                           }
                        }

                        this.field4952 = arg0.method4280(-19104);
                        if (!var4) {
                           break label78;
                        }
                     }

                     this.field4948 = arg0.method4288((byte)113);
                     if (!var4) {
                        break label78;
                     }
                  }

                  this.field4951 = arg0.method4288((byte)90);
                  if (!var4) {
                     break label78;
                  }
               }

               this.field4936 = arg0.method4288((byte)101);
               if (!var4) {
                  break label78;
               }
            }

            this.field4941 = arg0.method4288((byte)95);
         }

         int var6 = -91 % ((arg1 - 68) / 48);
         ++field4949;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4953[7] + (arg0 != null ? field4953[3] : field4953[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method2728(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(ZC)Z"
   )
   public static final boolean method2729(boolean arg0, char arg1) {
      boolean var2 = client.field4273;

      try {
         if (!arg0) {
            method2730(2);
         }

         ++field4943;
         if (arg1 > 0 && arg1 < 128 || arg1 >= 160 && arg1 <= 255) {
            return true;
         } else {
            if (arg1 != 0) {
               char[] var3 = class79.field989;
               int var4 = 0;
               if (var2 || var4 < var3.length) {
                  do {
                     char var5 = var3[var4];
                     if (~arg1 == ~var5) {
                        return true;
                     }

                     ++var4;
                  } while(var4 < var3.length);
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4953[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2730(int arg0) {
      try {
         if (arg0 != -1) {
            method2727(-106, 54, -84, 51, 74, 113, -25, 54, 35);
         }

         field4945 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4953[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         ++field4950;
         this.field4940 = class790.method5699(this.field4944, arg0 + -28376);
         if (arg0 != 28274) {
            method2730(-65);
         }

         this.method2728(arg0 + -28274);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4953[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2731(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2732(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
