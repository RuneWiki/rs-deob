import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class615 {
   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "Ljea;"
   )
   private class6 field8745;
   @OriginalMember(
      owner = "client!gw",
      name = "j",
      descriptor = "Laea;"
   )
   private class678 field8740;
   @OriginalMember(
      owner = "client!gw",
      name = "p",
      descriptor = "I"
   )
   public int field8749;
   @OriginalMember(
      owner = "client!gw",
      name = "q",
      descriptor = "I"
   )
   private int field8741;
   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field8738;
   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "I"
   )
   private int field8755;
   @OriginalMember(
      owner = "client!gw",
      name = "l",
      descriptor = "I"
   )
   private int field8737;
   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "I"
   )
   private int field8744;
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8758 = new String[]{method4530(method4529("9/c\u0019R")), method4530(method4529("9/c\u001bR")), method4530(method4529("0-!6")), method4530(method4529("%vct\u0007")), method4530(method4529("9/cf\u0013019dR")), method4530(method4529("9/c\u001eR")), method4530(method4529("9/c\u0010R")), method4530(method4529("9/c\u0013R")), method4530(method4529("9/c\u001cR")), method4530(method4529("9/c\u0018R")), method4530(method4529("9/c\u001fR")), method4530(method4529("9/c\u0012R")), method4530(method4529("9/c\u001dR"))};
   @OriginalMember(
      owner = "client!gw",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field8752 = new class724(23, 3);
   @OriginalMember(
      owner = "client!gw",
      name = "u",
      descriptor = "Lhha;"
   )
   public static class724 field8756 = new class724(69, -1);
   @OriginalMember(
      owner = "client!gw",
      name = "w",
      descriptor = "[J"
   )
   public static long[] field8757 = new long[32];
   @OriginalMember(
      owner = "client!gw",
      name = "h",
      descriptor = "I"
   )
   public static int field8735;
   @OriginalMember(
      owner = "client!gw",
      name = "k",
      descriptor = "I"
   )
   public static int field8736;
   @OriginalMember(
      owner = "client!gw",
      name = "r",
      descriptor = "I"
   )
   public static int field8742;
   @OriginalMember(
      owner = "client!gw",
      name = "o",
      descriptor = "I"
   )
   public static int field8743;
   @OriginalMember(
      owner = "client!gw",
      name = "n",
      descriptor = "I"
   )
   public static int field8746;
   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "I"
   )
   public static int field8747;
   @OriginalMember(
      owner = "client!gw",
      name = "s",
      descriptor = "I"
   )
   public static int field8748;
   @OriginalMember(
      owner = "client!gw",
      name = "e",
      descriptor = "I"
   )
   public static int field8750;
   @OriginalMember(
      owner = "client!gw",
      name = "t",
      descriptor = "I"
   )
   public static int field8753;
   @OriginalMember(
      owner = "client!gw",
      name = "f",
      descriptor = "I"
   )
   public static int field8754;
   @OriginalMember(
      owner = "client!gw",
      name = "v",
      descriptor = "[Ldea;"
   )
   public static class471[] field8739;
   @OriginalMember(
      owner = "client!gw",
      name = "m",
      descriptor = "[[Lad;"
   )
   private class108[][] field8751;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILcu;)Loka;"
   )
   public static final class385 method4519(int arg0, class65 arg1) {
      try {
         if (arg0 != -19324) {
            field8739 = null;
         }

         ++field8743;
         int var2 = arg1.method701(255);
         return new class385(var2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8758[6] + arg0 + ',' + (arg1 != null ? field8758[3] : field8758[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(BZII[[ZI)V"
   )
   public final void method4520(byte param1, boolean param2, int param3, int param4, boolean[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IILr;I)V"
   )
   public final void method4521(int arg0, int arg1, class412 arg2, int arg3) {
      try {
         ++field8753;
         class545 var5 = (class545)arg2;
         arg3 += var5.field7769 - -1;
         int var6 = 100 / ((arg1 - 14) / 54);
         arg0 += var5.field7772 - -1;
         int var7 = arg0 - -(this.field8749 * arg3);
         int var8 = 0;
         int var9 = var5.field7765;
         int var10 = var5.field7773;
         int var11 = this.field8749 - var10;
         if (~arg3 >= -1) {
            int var12 = 1 - arg3;
            arg3 = 1;
            var7 += this.field8749 * var12;
            var9 -= var12;
            var8 += var10 * var12;
         }

         int var13 = 0;
         if (~this.field8741 >= ~(arg3 + var9)) {
            int var14 = -this.field8741 + arg3 - (-var9 + -1);
            var9 -= var14;
         }

         if (arg0 <= 0) {
            int var15 = -arg0 + 1;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var10 -= var15;
            arg0 = 1;
            var11 += var15;
         }

         if (arg0 - -var10 >= this.field8749) {
            int var16 = arg0 + var10 + 1 + -this.field8749;
            var13 += var16;
            var10 -= var16;
            var11 += var16;
         }

         if (var10 > 0 && var9 > 0) {
            class496.method3762(var8, this.field8738, var10, var11, var5.field7770, var7, var9, false, var13);
            this.method4527(true, var9, arg3, var10, arg0);
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field8758[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8758[3] : field8758[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4522(int arg0) {
      try {
         field8757 = null;
         field8739 = null;
         field8756 = null;
         if (arg0 == 0) {
            field8752 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8758[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method4523(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8750;
         if (class556.field7901 == null) {
            return 0;
         } else if (!arg1 && class61.field873 != null) {
            return class556.field7901.length * 2;
         } else {
            int var3 = 0;
            if (arg0 >= -2) {
               return -74;
            } else {
               int var4 = 0;
               int var5;
               if (var2) {
                  var5 = class556.field7901[var4];
                  if (class222.field3159.method450(0, var5)) {
                     ++var3;
                  }

                  if (class793.field11535.method450(0, var5)) {
                     ++var3;
                  }

                  ++var4;
               }

               while(true) {
                  int var10000;
                  if (~class556.field7901.length >= ~var4) {
                     var10000 = var3;
                     if (!var2) {
                        return var3;
                     }
                  } else {
                     var10000 = class556.field7901[var4];
                  }

                  var5 = var10000;
                  if (class222.field3159.method450(0, var5)) {
                     ++var3;
                  }

                  if (class793.field11535.method450(0, var5)) {
                     ++var3;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8758[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4524(byte arg0) {
      boolean var2 = client.field10022;

      try {
         this.field8751 = new class108[this.field8737][this.field8744];
         if (arg0 != 75) {
            method4523(33, true);
         }

         ++field8736;
         int var3 = 0;
         if (var2 || var3 < this.field8744) {
            do {
               int var4 = 0;
               if (var2) {
                  this.field8751[var4][var3] = new class108(this.field8740, this, this.field8745, var4, var3, this.field8755, var4 * 128 + 1, var3 * 128 + 1);
                  ++var4;
               }

               while(true) {
                  while(~this.field8737 < ~var4) {
                     this.field8751[var4][var3] = new class108(this.field8740, this, this.field8745, var4, var3, this.field8755, var4 * 128 + 1, var3 * 128 + 1);
                     ++var4;
                  }

                  if (!var2) {
                     ++var3;
                     break;
                  }

                  ++var4;
               }
            } while(var3 < this.field8744);

         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8758[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Lr;IBI)Z"
   )
   public final boolean method4525(class412 arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field8748;
         class545 var5 = (class545)arg0;
         arg3 += var5.field7769 + 1;
         arg1 += var5.field7772 + 1;
         int var6 = this.field8749 * arg3 + arg1;
         int var7 = var5.field7765;
         int var8 = var5.field7773;
         int var9 = -var8 + this.field8749;
         if (arg3 <= 0) {
            int var10 = -arg3 + 1;
            var7 -= var10;
            var6 += this.field8749 * var10;
            arg3 = 1;
         }

         if (arg2 != 11) {
            this.field8741 = -67;
         }

         if (~this.field8741 >= ~(arg3 + var7)) {
            int var11 = arg3 - this.field8741 + var7 + 1;
            var7 -= var11;
         }

         if (arg1 <= 0) {
            int var12 = -arg1 + 1;
            var9 += var12;
            var6 += var12;
            var8 -= var12;
            arg1 = 1;
         }

         if (~this.field8749 >= ~(arg1 + var8)) {
            int var13 = arg1 - (this.field8749 + -1) + var8;
            var8 -= var13;
            var9 += var13;
         }

         if (var8 > 0 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field8749 + var9;
            return class326.method2618(this.field8738, var6, true, var8, var14, var15, var7);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field8758[11] + (arg0 != null ? field8758[3] : field8758[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IIILr;)V"
   )
   public final void method4526(int arg0, int arg1, int arg2, class412 arg3) {
      try {
         ++field8742;
         class545 var5 = (class545)arg3;
         arg1 += var5.field7772 + 1;
         arg0 += var5.field7769 + 1;
         int var6 = this.field8749 * arg0 + arg1;
         int var7 = 0;
         int var8 = var5.field7765;
         int var9 = var5.field7773;
         int var10 = this.field8749 - var9;
         int var11 = 0;
         if (~arg0 >= -1) {
            int var12 = -arg0 + 1;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += this.field8749 * var12;
            arg0 = 1;
         }

         if (arg2 != -21663) {
            method4528(-83);
         }

         if (~this.field8741 >= ~(arg0 + var8)) {
            int var13 = -this.field8741 + arg0 + var8 + 1;
            var8 -= var13;
         }

         if (~arg1 >= -1) {
            int var14 = -arg1 + 1;
            var9 -= var14;
            var11 += var14;
            arg1 = 1;
            var7 += var14;
            var6 += var14;
            var10 += var14;
         }

         if (arg1 + var9 >= this.field8749) {
            int var15 = -this.field8749 + arg1 + var9 + 1;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
         }

         if (var9 > 0 && ~var8 < -1) {
            class383.method2988(var5.field7770, var6, (byte)-111, var8, var7, var10, this.field8738, var9, var11);
            this.method4527(true, var8, arg0, var9, arg1);
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field8758[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8758[3] : field8758[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(Laea;Ljea;)V"
   )
   public class615(class678 arg0, class6 arg1) {
      try {
         this.field8745 = arg1;
         this.field8740 = arg0;
         this.field8749 = (this.field8745.field10672 * this.field8745.field10665 >> this.field8740.field9683) + 2;
         this.field8741 = (this.field8745.field10672 * this.field8745.field10666 >> this.field8740.field9683) + 2;
         this.field8738 = new byte[this.field8749 * this.field8741];
         this.field8755 = this.field8740.field9683 + 7 + -this.field8745.field10671;
         this.field8737 = this.field8745.field10665 >> this.field8755;
         this.field8744 = this.field8745.field10666 >> this.field8755;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8758[4] + (arg0 != null ? field8758[3] : field8758[2]) + ',' + (arg1 != null ? field8758[3] : field8758[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ZIIII)V"
   )
   private final void method4527(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field8747;
         if (this.field8751 != null) {
            int var7 = arg4 + -1 >> 7;
            int var8 = arg3 + -1 + arg4 + -1 >> 7;
            int var9 = arg2 - 1 >> 7;
            int var10 = arg1 + -1 + arg2 + -1 >> 7;
            if (!arg0) {
               method4522(-22);
            }

            int var11 = var7;
            if (var6 || ~var8 <= ~var7) {
               do {
                  class108[] var12 = this.field8751[var11];
                  int var13 = var9;
                  if (var6) {
                     var12[var9].field1688 = true;
                     var13 = var9 + 1;
                  }

                  while(true) {
                     while(~var13 >= ~var10) {
                        var12[var13].field1688 = true;
                        ++var13;
                     }

                     if (!var6) {
                        ++var11;
                        break;
                     }

                     ++var13;
                  }
               } while(~var8 <= ~var11);

            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field8758[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4528(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
