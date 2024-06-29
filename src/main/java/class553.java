import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class553 extends class606 {
   @OriginalMember(
      owner = "client!ve",
      name = "I",
      descriptor = "I"
   )
   private int field7880 = 1;
   @OriginalMember(
      owner = "client!ve",
      name = "F",
      descriptor = "I"
   )
   private int field7881 = 204;
   @OriginalMember(
      owner = "client!ve",
      name = "H",
      descriptor = "I"
   )
   private int field7883 = 1;
   @OriginalMember(
      owner = "client!ve",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7886 = new String[]{method4137(method4136("ID\u000b\u001b]")), method4137(method4136("QTI4")), method4137(method4136("ID\u000b\u0019]")), method4137(method4136("D\u000f\u000bv\b")), method4137(method4136("ID\u000b\u0010]"))};
   @OriginalMember(
      owner = "client!ve",
      name = "J",
      descriptor = "Lfm;"
   )
   public static class164 field7879 = new class164(47, 0);
   @OriginalMember(
      owner = "client!ve",
      name = "E",
      descriptor = "Liw;"
   )
   public static class107 field7885 = new class107(64);
   @OriginalMember(
      owner = "client!ve",
      name = "K",
      descriptor = "I"
   )
   public static int field7878;
   @OriginalMember(
      owner = "client!ve",
      name = "G",
      descriptor = "I"
   )
   public static int field7882;
   @OriginalMember(
      owner = "client!ve",
      name = "L",
      descriptor = "I"
   )
   public static int field7884;

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg2 >= -6) {
            method4135((byte)-38);
         }

         label45: {
            label44: {
               label43: {
                  if (~arg1 != -1) {
                     if (arg1 == 1) {
                        break label43;
                     }

                     if (~arg1 != -3) {
                        break label45;
                     }

                     if (!var4) {
                        break label44;
                     }
                  }

                  this.field7883 = arg0.method665(false);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field7880 = arg0.method665(false);
               if (!var4) {
                  break label45;
               }
            }

            this.field7881 = arg0.method685(-2);
         }

         ++field7878;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7886[2] + (arg0 != null ? field7886[3] : field7886[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method4135(byte arg0) {
      try {
         field7879 = null;
         field7885 = null;
         if (arg0 > -120) {
            field7879 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7886[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7882;
         int[] var4 = super.field8645.method2632(arg1, arg0 + 27230);
         if (super.field8645.field4884) {
            int var5 = 0;
            if (var3 || var5 < class563.field8014) {
               do {
                  int var6 = class387.field5650[var5];
                  int var7 = class693.field10001[arg1];
                  int var8 = this.field7883 * var6 >> 12;
                  int var9 = this.field7880 * var7 >> 12;
                  int var10 = var6 % (4096 / this.field7883) * this.field7883;
                  int var11 = var7 % (4096 / this.field7880) * this.field7880;
                  if (var11 < this.field7881) {
                     var8 -= var9;
                     if (var3) {
                        var8 += 4;
                     }

                     while(~var8 > -1) {
                        var8 += 4;
                     }

                     if (var3) {
                        var8 -= 4;
                     }

                     while(~var8 < -4) {
                        var8 -= 4;
                     }

                     if (var8 != 1) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }

                     if (~this.field7881 < ~var10) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }
                  }

                  if (this.field7881 <= var10) {
                     var4[var5] = 4096;
                     ++var5;
                  } else {
                     int var12 = var8 - var9;
                     if (var3) {
                        var12 += 4;
                     }

                     while(~var12 > -1) {
                        var12 += 4;
                     }

                     if (var3) {
                        var12 -= 4;
                     }

                     while(var12 > 3) {
                        var12 -= 4;
                     }

                     if (~var12 < -1) {
                        var4[var5] = 0;
                        if (var3) {
                           var4[var5] = 4096;
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        var4[var5] = 4096;
                        ++var5;
                     }
                  }
               } while(var5 < class563.field8014);
            }
         }

         if (arg0 != 0) {
            method4135((byte)28);
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field7886[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "()V"
   )
   public class553() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
