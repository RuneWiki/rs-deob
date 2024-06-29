import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class467 extends class606 {
   @OriginalMember(
      owner = "client!cr",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6777 = new String[]{method3589(method3588("nC'zA")), method3589(method3588("cDe^")), method3589(method3588("nC'sA")), method3589(method3588("v\u001f'\u001c\u0014")), method3589(method3588("nC'qA")), method3589(method3588("nC'pA"))};
   @OriginalMember(
      owner = "client!cr",
      name = "J",
      descriptor = "I"
   )
   public static int field6773 = 0;
   @OriginalMember(
      owner = "client!cr",
      name = "I",
      descriptor = "I"
   )
   public static int field6771;
   @OriginalMember(
      owner = "client!cr",
      name = "D",
      descriptor = "I"
   )
   public static int field6772;
   @OriginalMember(
      owner = "client!cr",
      name = "G",
      descriptor = "I"
   )
   public static int field6774;
   @OriginalMember(
      owner = "client!cr",
      name = "H",
      descriptor = "I"
   )
   public static int field6775;
   @OriginalMember(
      owner = "client!cr",
      name = "F",
      descriptor = "I"
   )
   public static int field6776;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(ZII)V"
   )
   private final void method3587(boolean arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field6776;
         if (arg0) {
            this.method3587(true, 84, 109);
         }

         label115: {
            int var5 = class387.field5650[arg1];
            int var6 = class693.field10001[arg2];
            float var7 = (float)Math.atan2((double)(var5 + -2048), (double)(var6 + -2048));
            if ((double)var7 >= -3.141592653589793D && (double)var7 <= -2.356194490192345D) {
               class527.field7459 = arg2;
               class239.field3683 = arg1;
               if (!var4) {
                  break label115;
               }
            }

            if (!((double)var7 <= -1.5707963267948966D) || !((double)var7 >= -2.356194490192345D)) {
               if (!((double)var7 <= -0.7853981633974483D) || !((double)var7 >= -1.5707963267948966D)) {
                  if (var7 <= 0.0F && (double)var7 >= -0.7853981633974483D) {
                     class239.field3683 = arg1;
                     class527.field7459 = -arg2 + class451.field6570;
                     if (!var4) {
                        break label115;
                     }
                  }

                  if (var7 >= 0.0F && (double)var7 <= 0.7853981633974483D) {
                     class527.field7459 = -arg2 + class451.field6570;
                     class239.field3683 = -arg1 + class563.field8014;
                     if (!var4) {
                        break label115;
                     }
                  }

                  if (!((double)var7 >= 0.7853981633974483D) || !((double)var7 <= 1.5707963267948966D)) {
                     if (!((double)var7 >= 1.5707963267948966D) || !((double)var7 <= 2.356194490192345D)) {
                        if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                           break label115;
                        }

                        class239.field3683 = -arg1 + class563.field8014;
                        class527.field7459 = arg2;
                        if (!var4) {
                           break label115;
                        }
                     }

                     class239.field3683 = arg2;
                     class527.field7459 = -arg1 + class451.field6570;
                     if (!var4) {
                        break label115;
                     }
                  }

                  class239.field3683 = -arg2 + class563.field8014;
                  class527.field7459 = -arg1 + class451.field6570;
                  if (!var4) {
                     break label115;
                  }
               }

               class239.field3683 = class563.field8014 - arg2;
               class527.field7459 = arg1;
               if (!var4) {
                  break label115;
               }
            }

            class239.field3683 = arg2;
            class527.field7459 = arg1;
         }

         class239.field3683 &= class358.field5293;
         class527.field7459 &= class801.field11660;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6777[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6771;
         if (arg0 != 373) {
            this.method8((class65)null, 94, -8);
         }

         int[][] var4 = super.field8649.method5536(arg0 + 23497, arg1);
         if (super.field8649.field11043) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || var8 < class563.field8014) {
               do {
                  this.method3587(false, var8, arg1);
                  int[][] var9 = this.method4467(0, class527.field7459, (byte)83);
                  var5[var8] = var9[0][class239.field3683];
                  var6[var8] = var9[1][class239.field3683];
                  var7[var8] = var9[2][class239.field3683];
                  ++var8;
               } while(var8 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6777[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6774;
         int[] var4 = super.field8645.method2632(arg1, arg0 ^ 27230);
         if (super.field8645.field4884) {
            int var5 = 0;
            if (var3 || ~class563.field8014 < ~var5) {
               do {
                  this.method3587(false, var5, arg1);
                  int[] var6 = this.method4463(class527.field7459, 13064, 0);
                  var4[var5] = var6[class239.field3683];
                  ++var5;
               } while(~class563.field8014 < ~var5);
            }
         }

         return arg0 != 0 ? null : var4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6777[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg1 == 0) {
            super.field8641 = arg0.method665(false) == 1;
         }

         ++field6775;
         if (arg2 > -6) {
            this.method3587(false, 55, 21);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6777[2] + (arg0 != null ? field6777[3] : field6777[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "<init>",
      descriptor = "()V"
   )
   public class467() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
