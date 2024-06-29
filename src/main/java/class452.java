import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class452 extends class70 {
   @OriginalMember(
      owner = "client!dfa",
      name = "O",
      descriptor = "I"
   )
   private int field6909 = 4096;
   @OriginalMember(
      owner = "client!dfa",
      name = "I",
      descriptor = "I"
   )
   private int field6917 = 4096;
   @OriginalMember(
      owner = "client!dfa",
      name = "Q",
      descriptor = "I"
   )
   private int field6911 = 4096;
   @OriginalMember(
      owner = "client!dfa",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6921 = new String[]{method3550(method3549("\u0018#)IUT")), method3550(method3549("\u0018#)IWT")), method3550(method3549("\u0018#)IRT")), method3550(method3549("\u0018#)IYT")), method3550(method3549("\u0007kfIn")), method3550(method3549("\u00120$\u000b")), method3550(method3549("\u0018#)I[T")), method3550(method3549("\u0018#)IVT"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field6908 = false;
   @OriginalMember(
      owner = "client!dfa",
      name = "P",
      descriptor = "I"
   )
   public static int field6916 = 0;
   @OriginalMember(
      owner = "client!dfa",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6907 = null;
   @OriginalMember(
      owner = "client!dfa",
      name = "N",
      descriptor = "I"
   )
   public static int field6918 = 0;
   @OriginalMember(
      owner = "client!dfa",
      name = "R",
      descriptor = "F"
   )
   public static float field6920;
   @OriginalMember(
      owner = "client!dfa",
      name = "K",
      descriptor = "I"
   )
   public static int field6910;
   @OriginalMember(
      owner = "client!dfa",
      name = "M",
      descriptor = "I"
   )
   public static int field6912;
   @OriginalMember(
      owner = "client!dfa",
      name = "G",
      descriptor = "I"
   )
   public static int field6913;
   @OriginalMember(
      owner = "client!dfa",
      name = "L",
      descriptor = "I"
   )
   public static int field6914;
   @OriginalMember(
      owner = "client!dfa",
      name = "S",
      descriptor = "I"
   )
   public static int field6919;
   @OriginalMember(
      owner = "client!dfa",
      name = "H",
      descriptor = "Lrr;"
   )
   public static class678 field6915;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3545(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IZ)Lln;"
   )
   public static final class433 method3546(int arg0, boolean arg1) {
      try {
         ++field6912;
         if (class50.field639 && ~arg0 <= ~class576.field8526 && ~class766.field11319 <= ~arg0) {
            if (arg1) {
               method3547(-59);
            }

            return class317.field4894[-class576.field8526 + arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6921[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3547(int arg0) {
      try {
         field6907 = null;
         if (arg0 != -257) {
            method3545(-46, 41, 63, 6, 41, -90);
         }

         field6915 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6921[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label46: {
            label45: {
               label44: {
                  ++field6914;
                  if (~arg1 != -1) {
                     if (~arg1 == -2) {
                        break label44;
                     }

                     if (arg1 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field6909 = arg2.method2848(-99);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field6911 = arg2.method2848(-101);
               if (!var4) {
                  break label46;
               }
            }

            this.field6917 = arg2.method2848(-99);
         }

         if (arg0 != -1) {
            field6907 = null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6921[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6921[4] : field6921[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3548(byte arg0) {
      boolean var1 = client.field1786;

      try {
         if (arg0 != -119) {
            field6916 = -14;
         }

         ++field6910;
         if (class143.field2034 == null || class594.field8746 == null) {
            class143.field2034 = new int[256];
            class594.field8746 = new int[256];
            int var2 = 0;
            if (var1 || ~var2 > -257) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class143.field2034[var2] = (int)(4096.0D * Math.sin(var3));
                  class594.field8746[var2] = (int)(Math.cos(var3) * 4096.0D);
                  ++var2;
               } while(~var2 > -257);
            }
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6921[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6919;
         int[][] var4 = super.field918.method3276((byte)100, arg1);
         if (super.field918.field6361) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class678.field10127 > var12) {
               do {
                  int var13 = var6[var12];
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  if (~var13 != ~var14 || var14 != var15) {
                     var9[var12] = this.field6909;
                     var10[var12] = this.field6911;
                     var11[var12] = this.field6917;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field6909 * var13 >> 12;
                  var10[var12] = this.field6911 * var14 >> 12;
                  var11[var12] = this.field6917 * var15 >> 12;
                  ++var12;
               } while(class678.field10127 > var12);
            }
         }

         return arg0 != 32 ? null : var4;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field6921[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class452() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3549(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3550(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
