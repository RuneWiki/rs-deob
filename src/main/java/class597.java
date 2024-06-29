import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class597 extends class629 {
   @OriginalMember(
      owner = "client!cr",
      name = "E",
      descriptor = "I"
   )
   private int field8609 = 4096;
   @OriginalMember(
      owner = "client!cr",
      name = "M",
      descriptor = "I"
   )
   private int field8612 = 12288;
   @OriginalMember(
      owner = "client!cr",
      name = "R",
      descriptor = "I"
   )
   private int field8614 = 0;
   @OriginalMember(
      owner = "client!cr",
      name = "L",
      descriptor = "I"
   )
   private int field8622 = 8192;
   @OriginalMember(
      owner = "client!cr",
      name = "F",
      descriptor = "I"
   )
   private int field8621 = 2048;
   @OriginalMember(
      owner = "client!cr",
      name = "O",
      descriptor = "I"
   )
   private int field8615 = 0;
   @OriginalMember(
      owner = "client!cr",
      name = "D",
      descriptor = "I"
   )
   private int field8620 = 2048;
   @OriginalMember(
      owner = "client!cr",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8624 = new String[]{method4415(method4414("9f%4\u001f")), method4415(method4414("9f%1\u001f")), method4415(method4414("9f%0\u001f")), method4415(method4414("!:%PJ")), method4415(method4414("9f%.\u001f")), method4415(method4414("4ag\u0012")), method4415(method4414("9f%;\u001f")), method4415(method4414("9f%7\u001f")), method4415(method4414("9f%3\u001f"))};
   @OriginalMember(
      owner = "client!cr",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field8619 = new int[2];
   @OriginalMember(
      owner = "client!cr",
      name = "P",
      descriptor = "F"
   )
   public static float field8617;
   @OriginalMember(
      owner = "client!cr",
      name = "J",
      descriptor = "I"
   )
   public static int field8610;
   @OriginalMember(
      owner = "client!cr",
      name = "N",
      descriptor = "I"
   )
   public static int field8611;
   @OriginalMember(
      owner = "client!cr",
      name = "I",
      descriptor = "I"
   )
   public static int field8613;
   @OriginalMember(
      owner = "client!cr",
      name = "K",
      descriptor = "I"
   )
   public static int field8616;
   @OriginalMember(
      owner = "client!cr",
      name = "G",
      descriptor = "I"
   )
   public static int field8618;
   @OriginalMember(
      owner = "client!cr",
      name = "H",
      descriptor = "I"
   )
   public static int field8623;

   @OriginalMember(
      owner = "client!cr",
      name = "g",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4410(int arg0) {
      try {
         if (arg0 != 3) {
            field8617 = -0.78357214F;
         }

         field8619 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8624[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "(III)Z",
      line = 14
   )
   private final boolean method4411(int arg0, int arg1, int arg2) {
      try {
         ++field8613;
         int var4 = (arg0 - -arg2) * this.field8612 >> 12;
         int var5 = class549.field7922[255 & var4 * 255 >> 12];
         if (arg1 != -1080161460) {
            this.method241((class473)null, -30, 67);
         }

         int var6 = (var5 << 12) / this.field8612;
         int var7 = (var6 << 12) / this.field8622;
         int var8 = this.field8609 * var7 >> 12;
         return var8 > -arg2 + arg0 && -var8 < -arg2 + arg0;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8624[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "<init>",
      descriptor = "()V",
      line = 179
   )
   public class597() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 36
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              if (arg2 != 0) {
                                 if (~arg2 == -2) {
                                    break label76;
                                 }

                                 if (arg2 == 2) {
                                    break label77;
                                 }

                                 if (arg2 == 3) {
                                    break label78;
                                 }

                                 if (arg2 == 4) {
                                    break label79;
                                 }

                                 if (~arg2 == -6) {
                                    break label80;
                                 }

                                 if (arg2 != 6) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field8620 = arg0.method3565(true);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field8614 = arg0.method3565(true);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field8615 = arg0.method3565(true);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field8621 = arg0.method3565(true);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field8612 = arg0.method3565(true);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field8609 = arg0.method3565(true);
               if (!var4) {
                  break label82;
               }
            }

            this.field8622 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            this.method901(12);
         }

         ++field8623;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8624[6] + (arg0 != null ? field8624[3] : field8624[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(II)[I",
      line = 116
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8610;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.field8620 = -93;
         }

         if (super.field9161.field7474) {
            int var5 = class442.field6448[arg0] + -2048;
            int var6 = 0;
            if (var3 || var6 < class66.field1214) {
               do {
                  int var7 = class429.field6201[var6] + -2048;
                  int var8 = this.field8620 + var7;
                  int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                  int var10 = ~var9 >= -2049 ? var9 : var9 + -4096;
                  int var11 = this.field8614 + var5;
                  int var12 = var11 < -2048 ? var11 + 4096 : var11;
                  int var13 = var12 > 2048 ? var12 + -4096 : var12;
                  int var14 = var7 - -this.field8615;
                  int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                  int var16 = var15 <= 2048 ? var15 : var15 + -4096;
                  int var17 = var5 - -this.field8621;
                  int var18 = ~var17 <= 2047 ? var17 : var17 + 4096;
                  int var19 = var18 > 2048 ? var18 + -4096 : var18;
                  var4[var6] = !this.method4412(var10, (byte)127, var13) ? (!this.method4411(var19, -1080161460, var16) ? 0 : 4096) : 4096;
                  ++var6;
               } while(var6 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field8624[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(I)V",
      line = 167
   )
   public final void method901(int arg0) {
      try {
         if (arg0 == 245880940) {
            class375.method2933(arg0 ^ 245881196);
            ++field8618;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8624[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(IBI)Z",
      line = 188
   )
   private final boolean method4412(int arg0, byte arg1, int arg2) {
      try {
         ++field8616;
         int var4 = (-arg0 + arg2) * this.field8612 >> 12;
         int var5 = 78 / ((arg1 - 73) / 53);
         int var6 = class549.field7922[(var4 * 255 & 1047356) >> 12];
         int var7 = (var6 << 12) / this.field8612;
         int var8 = (var7 << 12) / this.field8622;
         int var9 = this.field8609 * var8 >> 12;
         return var9 > arg0 - -arg2 && ~(arg0 + arg2) < ~(-var9);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8624[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Luda;I)Lep;",
      line = 215
   )
   public static final class440 method4413(class473 arg0, int arg1) {
      try {
         ++field8611;
         if (arg1 > -125) {
            method4410(55);
         }

         return new class440(arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3577(-2), arg0.method3564((byte)-66));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8624[4] + (arg0 != null ? field8624[3] : field8624[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4414(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4415(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
