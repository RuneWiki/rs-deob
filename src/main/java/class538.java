import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class538 {
   @OriginalMember(
      owner = "client!gq",
      name = "h",
      descriptor = "I"
   )
   public int field7842;
   @OriginalMember(
      owner = "client!gq",
      name = "e",
      descriptor = "Z"
   )
   public boolean field7839;
   @OriginalMember(
      owner = "client!gq",
      name = "i",
      descriptor = "Z"
   )
   public boolean field7836;
   @OriginalMember(
      owner = "client!gq",
      name = "j",
      descriptor = "[S"
   )
   public short[] field7827;
   @OriginalMember(
      owner = "client!gq",
      name = "n",
      descriptor = "I"
   )
   private int field7840;
   @OriginalMember(
      owner = "client!gq",
      name = "p",
      descriptor = "I"
   )
   public int field7832;
   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7843 = new String[]{method4037(method4036("rw^i>{o\u0004k\u007f")), method4037(method4036("rw^\u0010\u007f")), method4037(method4036("{s\u001c9")), method4037(method4036("n(^{*")), method4037(method4036("rw^\u0017\u007f")), method4037(method4036("rw^\u0016\u007f")), method4037(method4036("rw^\u0013\u007f")), method4037(method4036("rw^\u0011\u007f")), method4037(method4036("rw^\u0014\u007f"))};
   @OriginalMember(
      owner = "client!gq",
      name = "d",
      descriptor = "Lpg;"
   )
   public static class762 field7841 = new class762(method4037(method4036("BR9")), method4037(method4036("z`\u0016<4p")), method4037(method4036("Jq\u0004<")), 5);
   @OriginalMember(
      owner = "client!gq",
      name = "m",
      descriptor = "I"
   )
   private int field7824;
   @OriginalMember(
      owner = "client!gq",
      name = "l",
      descriptor = "I"
   )
   public static int field7825;
   @OriginalMember(
      owner = "client!gq",
      name = "o",
      descriptor = "I"
   )
   public static int field7828;
   @OriginalMember(
      owner = "client!gq",
      name = "f",
      descriptor = "I"
   )
   private int field7830;
   @OriginalMember(
      owner = "client!gq",
      name = "s",
      descriptor = "I"
   )
   public static int field7831;
   @OriginalMember(
      owner = "client!gq",
      name = "g",
      descriptor = "I"
   )
   public static int field7833;
   @OriginalMember(
      owner = "client!gq",
      name = "b",
      descriptor = "I"
   )
   private int field7834;
   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "I"
   )
   private int field7835;
   @OriginalMember(
      owner = "client!gq",
      name = "r",
      descriptor = "I"
   )
   public static int field7837;
   @OriginalMember(
      owner = "client!gq",
      name = "c",
      descriptor = "I"
   )
   public static int field7838;
   @OriginalMember(
      owner = "client!gq",
      name = "q",
      descriptor = "Lria;"
   )
   public static class299 field7829;
   @OriginalMember(
      owner = "client!gq",
      name = "k",
      descriptor = "Lke;"
   )
   public class622 field7826;

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IZB)V"
   )
   public final void method4030(int arg0, boolean arg1, byte arg2) {
      boolean var4 = client.field4564;

      try {
         int var6;
         label69: {
            int var5 = -46 % ((arg2 - -20) / 49);
            ++field7837;
            if (arg1) {
               var6 = 2048;
               if (!var4) {
                  break label69;
               }
            }

            label70: {
               int var7;
               label59: {
                  label58: {
                     label57: {
                        label56: {
                           var7 = 2047 & this.field7830 * arg0 / 50 + this.field7840;
                           int var8 = this.field7834;
                           if (var8 != 1) {
                              if (~var8 == -4) {
                                 break label56;
                              }

                              if (~var8 == -5) {
                                 break label57;
                              }

                              if (~var8 == -3) {
                                 break label58;
                              }

                              if (var8 != 5) {
                                 break label70;
                              }

                              if (!var4) {
                                 break label59;
                              }
                           }

                           var6 = (class593.field8539[var7 << 3] >> 4) + 1024;
                           if (!var4) {
                              break label69;
                           }
                        }

                        var6 = client.field4559[var7] >> 1;
                        if (!var4) {
                           break label69;
                        }
                     }

                     var6 = var7 >> 10 << 11;
                     if (!var4) {
                        break label69;
                     }
                  }

                  var6 = var7;
                  if (!var4) {
                     break label69;
                  }
               }

               var6 = (~var7 <= -1025 ? 2048 - var7 : var7) << 1;
               if (!var4) {
                  break label69;
               }
            }

            var6 = 2048;
         }

         this.field7826.method1812((float)(this.field7835 - -(this.field7824 * var6 >> 11)) / 2048.0F, false);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7843[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4031(byte arg0) {
      try {
         ++field7833;
         if (arg0 != -18) {
            this.field7824 = 11;
         }

         int var2 = this.field7832;
         if (~var2 != -3) {
            if (~var2 == -4) {
               this.field7835 = 0;
               this.field7834 = 1;
               this.field7830 = 4096;
               this.field7824 = 2048;
               return;
            }

            if (~var2 == -5) {
               this.field7824 = 2048;
               this.field7834 = 4;
               this.field7830 = 2048;
               this.field7835 = 0;
               return;
            }

            if (var2 == 5) {
               this.field7834 = 4;
               this.field7835 = 0;
               this.field7824 = 2048;
               this.field7830 = 8192;
               return;
            }

            if (~var2 == -13) {
               this.field7830 = 2048;
               this.field7835 = 0;
               this.field7824 = 2048;
               this.field7834 = 2;
               return;
            }

            if (var2 == 13) {
               this.field7830 = 8192;
               this.field7834 = 2;
               this.field7824 = 2048;
               this.field7835 = 0;
               return;
            }

            if (~var2 == -11) {
               this.field7834 = 3;
               this.field7835 = 1536;
               this.field7824 = 512;
               this.field7830 = 2048;
               return;
            }

            if (~var2 == -12) {
               this.field7835 = 1536;
               this.field7834 = 3;
               this.field7830 = 4096;
               this.field7824 = 512;
               return;
            }

            if (~var2 == -7) {
               this.field7830 = 2048;
               this.field7824 = 768;
               this.field7834 = 3;
               this.field7835 = 1280;
               return;
            }

            if (var2 == 7) {
               this.field7834 = 3;
               this.field7835 = 1280;
               this.field7824 = 768;
               this.field7830 = 4096;
               return;
            }

            if (~var2 == -9) {
               this.field7835 = 1024;
               this.field7824 = 1024;
               this.field7830 = 2048;
               this.field7834 = 3;
               return;
            }

            if (~var2 == -10) {
               this.field7830 = 4096;
               this.field7824 = 1024;
               this.field7834 = 3;
               this.field7835 = 1024;
               return;
            }

            if (var2 == 14) {
               this.field7824 = 768;
               this.field7834 = 1;
               this.field7830 = 2048;
               this.field7835 = 1280;
               return;
            }

            if (var2 == 15) {
               this.field7834 = 1;
               this.field7824 = 512;
               this.field7830 = 4096;
               this.field7835 = 1536;
               return;
            }

            if (~var2 != -17) {
               this.field7835 = 0;
               this.field7830 = 2048;
               this.field7834 = 0;
               this.field7824 = 2048;
               return;
            }

            if (!client.field4564) {
               this.field7834 = 1;
               this.field7830 = 8192;
               this.field7824 = 256;
               this.field7835 = 1792;
               return;
            }
         }

         this.field7834 = 1;
         this.field7824 = 2048;
         this.field7835 = 0;
         this.field7830 = 2048;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7843[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public static final int method4032(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field7831 = 87;
         }

         ++field7828;
         int var3 = arg1 >>> 31;
         return (arg1 + var3) / arg0 + -var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7843[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4033(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7838;
         this.field7835 = arg0;
         this.field7834 = arg3;
         this.field7824 = arg4;
         if (arg2 != 8712) {
            field7829 = null;
         }

         this.field7830 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7843[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4034(byte arg0) {
      try {
         field7841 = null;
         if (arg0 != -66) {
            field7829 = null;
         }

         field7829 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7843[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(ILha;IIIIB)V"
   )
   private final void method4035(int arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         this.field7826 = arg1.method258(arg3, arg0, arg5, arg2, arg4, 1.0F);
         ++field7825;
         if (arg6 >= -72) {
            method4032(33, 42, false);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7843[7] + arg0 + ',' + (arg1 != null ? field7843[3] : field7843[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "<init>",
      descriptor = "()V"
   )
   protected class538() {
      try {
         if (client.field4559 == null) {
            class560.method4179(2048);
         }

         this.method4031((byte)-18);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7843[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "<init>",
      descriptor = "(Lha;Luda;I)V"
   )
   public class538(class65 arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;
      super();

      try {
         if (client.field4559 == null) {
            class560.method4179(2048);
         }

         this.field7842 = arg1.method3564((byte)-65);
         this.field7839 = (this.field7842 & 16) != 0;
         this.field7836 = (8 & this.field7842) != 0;
         this.field7842 &= 7;
         int var5 = arg1.method3565(true) << arg2;
         int var6 = arg1.method3565(true) << arg2;
         int var7 = arg1.method3565(true) << arg2;
         int var8 = arg1.method3564((byte)-79);
         int var9 = var8 * 2 + 1;
         this.field7827 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4) {
            short var11 = (short)arg1.method3565(true);
            var12 = var11 >>> 8;
            var13 = var11 & 255;
            if (~var12 <= ~var9) {
               var12 = var9 + -1;
            }

            if (var13 > -var12 + var9) {
               var13 = -var12 + var9;
            }

            this.field7827[var10] = (short)class93.method899(var12 << 8, var13);
            ++var10;
         }

         while(true) {
            int var10000;
            if (~var10 <= ~this.field7827.length) {
               var10000 = (var8 << class76.field1336) + class760.field11026;
               if (!var4) {
                  int var14 = var10000;
                  int var15 = class451.field6600 != null ? class451.field6600[arg1.method3565(true)] : class634.field9255[65535 & class223.method1870(arg1.method3565(true), 1859335297)];
                  int var16 = arg1.method3564((byte)-106);
                  this.field7840 = var16 << 3 & 1792;
                  this.field7832 = 31 & var16;
                  if (this.field7832 != 31) {
                     this.method4031((byte)-18);
                  }

                  this.method4035(var7, arg0, var14, var5, var15, var6, (byte)-105);
                  return;
               }
            } else {
               var10000 = (short)arg1.method3565(true);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            var13 = var19 & 255;
            if (~var12 <= ~var9) {
               var12 = var9 + -1;
            }

            if (var13 > -var12 + var9) {
               var13 = -var12 + var9;
            }

            this.field7827[var10] = (short)class93.method899(var12 << 8, var13);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field7843[0] + (arg0 != null ? field7843[3] : field7843[2]) + ',' + (arg1 != null ? field7843[3] : field7843[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4037(char[] arg0) {
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
            var10005 = 6;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
