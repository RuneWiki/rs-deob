import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class531 extends class66 {
   @OriginalMember(
      owner = "client!bda",
      name = "H",
      descriptor = "Z"
   )
   private boolean field7720;
   @OriginalMember(
      owner = "client!bda",
      name = "V",
      descriptor = "Z"
   )
   private boolean field7721;
   @OriginalMember(
      owner = "client!bda",
      name = "kb",
      descriptor = "Lwia;"
   )
   private class791 field7717;
   @OriginalMember(
      owner = "client!bda",
      name = "ib",
      descriptor = "I"
   )
   public int field7726;
   @OriginalMember(
      owner = "client!bda",
      name = "G",
      descriptor = "I"
   )
   public int field7732;
   @OriginalMember(
      owner = "client!bda",
      name = "C",
      descriptor = "I"
   )
   public int field7725;
   @OriginalMember(
      owner = "client!bda",
      name = "E",
      descriptor = "I"
   )
   public int field7723;
   @OriginalMember(
      owner = "client!bda",
      name = "U",
      descriptor = "I"
   )
   public int field7741;
   @OriginalMember(
      owner = "client!bda",
      name = "u",
      descriptor = "I"
   )
   public int field7740;
   @OriginalMember(
      owner = "client!bda",
      name = "db",
      descriptor = "I"
   )
   private int field7737;
   @OriginalMember(
      owner = "client!bda",
      name = "X",
      descriptor = "I"
   )
   public int field7739;
   @OriginalMember(
      owner = "client!bda",
      name = "jb",
      descriptor = "I"
   )
   public int field7745;
   @OriginalMember(
      owner = "client!bda",
      name = "cb",
      descriptor = "I"
   )
   public int field7749;
   @OriginalMember(
      owner = "client!bda",
      name = "v",
      descriptor = "I"
   )
   public int field7752;
   @OriginalMember(
      owner = "client!bda",
      name = "bb",
      descriptor = "I"
   )
   public int field7759;
   @OriginalMember(
      owner = "client!bda",
      name = "t",
      descriptor = "I"
   )
   private int field7754;
   @OriginalMember(
      owner = "client!bda",
      name = "Y",
      descriptor = "I"
   )
   public int field7750;
   @OriginalMember(
      owner = "client!bda",
      name = "O",
      descriptor = "Z"
   )
   private boolean field7751;
   @OriginalMember(
      owner = "client!bda",
      name = "R",
      descriptor = "Ldw;"
   )
   private class748 field7753;
   @OriginalMember(
      owner = "client!bda",
      name = "I",
      descriptor = "I"
   )
   private int field7763;
   @OriginalMember(
      owner = "client!bda",
      name = "nb",
      descriptor = "Ldw;"
   )
   private class748 field7748;
   @OriginalMember(
      owner = "client!bda",
      name = "T",
      descriptor = "Lvp;"
   )
   public class199 field7729;
   @OriginalMember(
      owner = "client!bda",
      name = "P",
      descriptor = "I"
   )
   private int field7715;
   @OriginalMember(
      owner = "client!bda",
      name = "pb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7764 = new String[]{method3944(method3943("Jm5")), method3944(method3943("f[\u0006")), method3944(method3943("u~!Oroj%K")), method3944(method3943("kdsg\u0006"))};
   @OriginalMember(
      owner = "client!bda",
      name = "A",
      descriptor = "I"
   )
   private int field7718;
   @OriginalMember(
      owner = "client!bda",
      name = "mb",
      descriptor = "I"
   )
   private int field7722;
   @OriginalMember(
      owner = "client!bda",
      name = "J",
      descriptor = "I"
   )
   public int field7724;
   @OriginalMember(
      owner = "client!bda",
      name = "s",
      descriptor = "I"
   )
   public int field7727;
   @OriginalMember(
      owner = "client!bda",
      name = "W",
      descriptor = "I"
   )
   private int field7728;
   @OriginalMember(
      owner = "client!bda",
      name = "K",
      descriptor = "I"
   )
   private int field7731;
   @OriginalMember(
      owner = "client!bda",
      name = "w",
      descriptor = "I"
   )
   public int field7733;
   @OriginalMember(
      owner = "client!bda",
      name = "ab",
      descriptor = "I"
   )
   public int field7734;
   @OriginalMember(
      owner = "client!bda",
      name = "Q",
      descriptor = "I"
   )
   public int field7735;
   @OriginalMember(
      owner = "client!bda",
      name = "hb",
      descriptor = "I"
   )
   public int field7736;
   @OriginalMember(
      owner = "client!bda",
      name = "D",
      descriptor = "I"
   )
   public int field7738;
   @OriginalMember(
      owner = "client!bda",
      name = "S",
      descriptor = "I"
   )
   public int field7742;
   @OriginalMember(
      owner = "client!bda",
      name = "B",
      descriptor = "I"
   )
   public int field7744;
   @OriginalMember(
      owner = "client!bda",
      name = "N",
      descriptor = "I"
   )
   private int field7747;
   @OriginalMember(
      owner = "client!bda",
      name = "x",
      descriptor = "I"
   )
   private int field7755;
   @OriginalMember(
      owner = "client!bda",
      name = "eb",
      descriptor = "I"
   )
   public int field7756;
   @OriginalMember(
      owner = "client!bda",
      name = "Z",
      descriptor = "I"
   )
   private int field7757;
   @OriginalMember(
      owner = "client!bda",
      name = "fb",
      descriptor = "I"
   )
   public int field7758;
   @OriginalMember(
      owner = "client!bda",
      name = "gb",
      descriptor = "Lat;"
   )
   private class396 field7762;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "Lqi;"
   )
   public class593 field7719;
   @OriginalMember(
      owner = "client!bda",
      name = "L",
      descriptor = "Lmo;"
   )
   private class780 field7746;
   @OriginalMember(
      owner = "client!bda",
      name = "y",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field7716;
   @OriginalMember(
      owner = "client!bda",
      name = "M",
      descriptor = "[F"
   )
   public float[] field7743;
   @OriginalMember(
      owner = "client!bda",
      name = "ob",
      descriptor = "[F"
   )
   public float[] field7760;
   @OriginalMember(
      owner = "client!bda",
      name = "F",
      descriptor = "[I"
   )
   public int[] field7761;
   @OriginalMember(
      owner = "client!bda",
      name = "lb",
      descriptor = "[Lig;"
   )
   private class255[] field7730;

   @OriginalMember(
      owner = "client!bda",
      name = "B",
      descriptor = "()Z"
   )
   public final boolean method3927() {
      return this.field7720;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public final class575 method578(int arg0, int arg1) {
      return new class85(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class531(Canvas arg0, class160 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method601(arg0, arg2, arg3);
         this.method571(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method653(-124);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method627(int arg0, int arg1) throws class280 {
      if (this.field7716 != null && this.field7719 != null) {
         try {
            Graphics var3 = this.field7716.getGraphics();
            this.field7719.method985(-31, arg0, 0, arg1, this.field7718, var3, this.field7722, 0);
         } catch (Exception var4) {
            this.field7716.repaint();
         }
      } else {
         throw new IllegalStateException(field7764[0]);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method636(int arg0, class512 arg1, int arg2, int arg3) {
      class645 var5 = (class645)arg1;
      int[] var6 = var5.field9384;
      int[] var7 = var5.field9387;
      int var8;
      if (this.field7723 < var6.length + arg3) {
         var8 = this.field7723 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field7740 > arg3) {
         var9 = this.field7740 - arg3;
         arg3 = this.field7740;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field7758 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field7745 > var12) {
               var13 -= this.field7745 - var12;
               var12 = this.field7745;
            }

            if (this.field7732 < var12 + var13) {
               var13 = this.field7732 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field7761[var14++] = arg0;
            }

            var10 += this.field7758;
         }

      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method615(arg0, arg1, arg2, arg4, arg5);
      this.method615(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method539(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method539(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "n",
      descriptor = "(I)Z"
   )
   public final boolean method3928(int arg0) {
      return super.field813.method1165(arg0, -23239);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method657() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method584(Canvas arg0, int arg1, int arg2) {
      class593 var4 = (class593)this.field7717.method5681((long)arg0.hashCode(), -1);
      if (var4 != null) {
         var4.method2720(0);
         class593 var5 = class425.method3232(true, arg2, arg1, arg0);
         this.field7717.method5682((long)arg0.hashCode(), var5, (byte)7);
         if (this.field7716 == arg0 && this.field7746 == null) {
            Dimension var6 = arg0.getSize();
            this.field7722 = var6.width;
            this.field7718 = var6.height;
            this.field7719 = var5;
            this.field7761 = var5.field8751;
            this.field7758 = var5.field8750;
            this.field7747 = var5.field8749;
            if (this.field7758 != this.field7731 || this.field7755 != this.field7747) {
               this.field7757 = this.field7731 = this.field7758;
               this.field7728 = this.field7755 = this.field7747;
               this.field7760 = this.field7743 = new float[this.field7755 * this.field7731];
            }

            this.method3941();
         }
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method605(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class280 {
      if (this.field7716 != null && this.field7719 != null) {
         try {
            Graphics var5 = this.field7716.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field7758 && var7.y + arg3 <= this.field7747 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field7719.method985(-76, var7.x + arg2, var7.y, var7.y + arg3, var7.height, var5, var7.width, var7.x);
               }
            }

         } catch (Exception var8) {
            this.field7716.repaint();
         }
      } else {
         throw new IllegalStateException(field7764[0]);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "v",
      descriptor = "()V"
   )
   public final void method624() {
      if (this.field7721) {
         class442.method3343(false, true, (byte)-106);
         this.field7721 = false;
      }

      this.field7719 = null;
      this.field7716 = null;
      this.field7722 = 0;
      this.field7718 = 0;
      this.field7717 = null;
      this.field7720 = true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method658(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class83(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      class267.field3745 = arg0;
      class267.field3730 = arg0;
      if (this.field7744 > 1) {
         throw new IllegalStateException(field7764[3]);
      } else {
         this.method628(this.field7744);
         this.method563(0);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method628(int arg0) {
      this.field7744 = arg0;
      this.field7730 = new class255[this.field7744];

      for(int var2 = 0; var2 < this.field7744; ++var2) {
         this.field7730[var2] = new class255(this);
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class645 var13 = (class645)arg6;
      int[] var14 = var13.field9384;
      int[] var15 = var13.field9387;
      int var16 = this.field7740 > arg8 ? this.field7740 : arg8;
      int var17 = this.field7723 < var14.length + arg8 ? this.field7723 : var14.length + arg8;
      int var18 = arg11 << 8;
      int var19 = arg9 << 8;
      int var20 = arg10 << 8;
      int var21 = var19 + var20;
      int var22 = var18 % var21;
      int var23 = arg2 - arg0;
      int var24 = arg3 - arg1;
      if (var23 + var24 < 0) {
         int var25 = (int)(Math.sqrt((double)(var23 * var23 + var24 * var24)) * 256.0D);
         int var26 = var25 % var21;
         int var27 = var19 + var21 - var22 - var26;
         var22 = var27 % var21;
         if (var22 < 0) {
            var22 += var21;
         }

         arg0 += var23;
         var23 = -var23;
         arg1 += var24;
         var24 = -var24;
      }

      if (var23 > var24) {
         int var28 = arg1 << 16;
         int var29 = var28 + 32768;
         int var30 = var24 << 16;
         int var31 = (int)Math.floor((double)var30 / (double)var23 + 0.5D);
         int var32 = arg0 + var23;
         int var33 = arg4 >>> 24;
         int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
         if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
            if (arg5 == 1) {
               int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var36 = 256 - var33;

               while(arg0 <= var32) {
                  int var37 = var29 >> 16;
                  int var38 = var37 - arg8;
                  if (arg0 >= this.field7745 && arg0 < this.field7732 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field7758 * var37 + arg0;
                        int var41 = this.field7761[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field7761[var40] = var35 + var42;
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var43 = var22 + var34;
                  var22 = var43 % var21;
               }

            } else if (arg5 == 2) {
               while(arg0 <= var32) {
                  int var44 = var29 >> 16;
                  int var45 = var44 - arg8;
                  if (arg0 >= this.field7745 && arg0 < this.field7732 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field7758 * var44 + arg0;
                        int var48 = this.field7761[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field7761[var47] = var49 - var51 | var51 - (var51 >>> 8);
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var52 = var22 + var34;
                  var22 = var52 % var21;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            while(arg0 <= var32) {
               int var53 = var29 >> 16;
               int var54 = var53 - arg8;
               if (arg0 >= this.field7745 && arg0 < this.field7732 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field7761[this.field7758 * var53 + arg0] = arg4;
                  }
               }

               var29 += var31;
               ++arg0;
               int var56 = var22 + var34;
               var22 = var56 % var21;
            }

         }
      } else {
         int var57 = arg0 << 16;
         int var58 = var57 + 32768;
         int var59 = var23 << 16;
         int var60 = (int)Math.floor((double)var59 / (double)var24 + 0.5D);
         int var61 = (int)Math.sqrt((double)((var60 >> 8) * (var60 >> 8) + 65536));
         int var62 = arg1 + var24;
         int var63 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var63 == 255) {
            while(arg1 <= var62) {
               int var80 = var58 >> 16;
               int var81 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field7745 && var80 < this.field7732 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field7761[this.field7758 * arg1 + var80] = arg4;
               }

               var58 += var60;
               ++arg1;
               int var82 = var22 + var61;
               var22 = var82 % var21;
            }

         } else if (arg5 == 1) {
            int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
            int var65 = 256 - var63;

            while(arg1 <= var62) {
               int var66 = var58 >> 16;
               int var67 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field7745 && var66 < this.field7732 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field7758 * arg1 + var66;
                  int var69 = this.field7761[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field7761[this.field7758 * arg1 + var66] = var64 + var70;
               }

               var58 += var60;
               ++arg1;
               int var71 = var22 + var61;
               var22 = var71 % var21;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var62) {
               int var72 = var58 >> 16;
               int var73 = arg1 - arg8;
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field7745 && var72 < this.field7732 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field7758 * arg1 + var72;
                  int var75 = this.field7761[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field7761[var74] = var76 - var78 | var78 - (var78 >>> 8);
               }

               var58 += var60;
               ++arg1;
               int var79 = var22 + var61;
               var22 = var79 % var21;
            }

         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "ya",
      descriptor = "()V"
   )
   public final void method561() {
      if (this.field7745 == 0 && this.field7758 == this.field7732 && this.field7740 == 0 && this.field7747 == this.field7723) {
         int var1 = this.field7743.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
            this.field7743[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field7743[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field7732 - this.field7745;
         int var5 = this.field7723 - this.field7740;
         int var6 = this.field7758 - var4;
         int var7 = this.field7758 * this.field7740 + this.field7745;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field7743[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method622(boolean arg0) {
      class255 var2 = this.method3934(Thread.currentThread());
      var2.field3400 = arg0;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lid;IIII)V"
   )
   private final void method3929(class611 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field8956;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method3931(arg1, arg2, arg3, arg4, arg0.field8948, 1);
      } else {
         if (this.field7763 != var6) {
            class396 var9 = (class396)this.field7753.method5454((long)var6, 18261);
            if (var9 == null) {
               int[] var10 = this.method3932(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method3936(var6) ? 64 : this.field7752;
               var9 = this.method589(var11, 0, 0, var10, var11, var11);
               this.field7753.method5455(-2049, var9, (long)var6);
            }

            this.field7763 = var6;
            this.field7762 = var9;
         }

         ++var8;
         ((class435)this.field7762).method266(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field8948, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public final void method550(class540 arg0) {
      this.field7729 = (class199)arg0;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "l",
      descriptor = "(I)Z"
   )
   public final boolean method3930(int arg0) {
      return super.field813.method1159(arg0, 127).field4639 || super.field813.method1159(arg0, 122).field4631;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method576() {
      return new int[]{this.field7727, this.field7742, this.field7725, this.field7739};
   }

   @OriginalMember(
      owner = "client!bda",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field7745) {
         arg2 -= this.field7745 - arg0;
         arg0 = this.field7745;
      }

      if (arg1 < this.field7740) {
         arg3 -= this.field7740 - arg1;
         arg1 = this.field7740;
      }

      if (arg0 + arg2 > this.field7732) {
         arg2 = this.field7732 - arg0;
      }

      if (arg1 + arg3 > this.field7723) {
         arg3 = this.field7723 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7732 && arg1 <= this.field7723) {
         int var7 = this.field7758 - arg2;
         int var8 = this.field7758 * arg1 + arg0;
         int var9 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var9 == 255) {
            int var22 = arg2 >> 3;
            int var23 = arg2 & 7;
            int var24 = var8 - 1;

            for(int var25 = -arg3; var25 < 0; ++var25) {
               if (var22 > 0) {
                  int var26 = var22;

                  do {
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     ++var24;
                     this.field7761[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field7761[var24] = arg4;
                     --var27;
                  } while(var27 > 0);
               }

               var24 += var7;
            }

         } else if (arg5 == 1) {
            int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
            int var11 = 256 - var9;

            for(int var12 = 0; var12 < arg3; ++var12) {
               for(int var13 = -arg2; var13 < 0; ++var13) {
                  int var14 = this.field7761[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field7761[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field7761[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field7761[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "g",
      descriptor = "(IIIIII)V"
   )
   private final void method3931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field7740) {
         var7 = this.field7740;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field7723) {
         var8 = this.field7723;
      }

      int var9 = var7;
      int var10 = arg3 * arg3;
      int var11 = 0;
      int var12 = arg1 - var7;
      int var13 = var12 * var12;
      int var14 = var13 - var12;
      if (arg1 > var8) {
         arg1 = var8;
      }

      int var15 = arg4 >>> 24;
      if (arg5 == 0 || arg5 == 1 && var15 == 255) {
         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var65 = arg0 - var11 + 1;
            if (var65 < this.field7745) {
               var65 = this.field7745;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field7732) {
               var66 = this.field7732;
            }

            int var67 = this.field7758 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field7743[var67]) {
                  this.field7761[var67] = arg4;
               }

               ++var67;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var56 = arg3;
         int var57 = var9 - arg1;
         int var58 = var57 * var57 + var10;
         int var59 = var58 - arg3;
         int var60 = var58 - var57;

         while(var9 < var8) {
            while(var60 > var10 && var59 > var10) {
               var60 -= var56-- + var56;
               var59 -= var56 + var56;
            }

            int var61 = arg0 - var56;
            if (var61 < this.field7745) {
               var61 = this.field7745;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field7732 - 1) {
               var62 = this.field7732 - 1;
            }

            int var63 = this.field7758 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field7743[var63]) {
                  this.field7761[var63] = arg4;
               }

               ++var63;
            }

            ++var9;
            var60 += var57 + var57;
            var59 += var57++ + var57;
         }

      } else if (arg5 == 1) {
         int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
         int var17 = 256 - var15;

         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var29 = arg0 - var11 + 1;
            if (var29 < this.field7745) {
               var29 = this.field7745;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field7732) {
               var30 = this.field7732;
            }

            int var31 = this.field7758 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field7743[var31]) {
                  int var33 = this.field7761[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field7761[var31] = var16 + var34;
               }

               ++var31;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var18 = arg3;
         int var19 = -var12;
         int var20 = var19 * var19 + var10;
         int var21 = var20 - arg3;
         int var22 = var20 - var19;

         while(var9 < var8) {
            while(var22 > var10 && var21 > var10) {
               var22 -= var18-- + var18;
               var21 -= var18 + var18;
            }

            int var23 = arg0 - var18;
            if (var23 < this.field7745) {
               var23 = this.field7745;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field7732 - 1) {
               var24 = this.field7732 - 1;
            }

            int var25 = this.field7758 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field7743[var25]) {
                  int var27 = this.field7761[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field7761[var25] = var16 + var28;
               }

               ++var25;
            }

            ++var9;
            var22 += var19 + var19;
            var21 += var19++ + var19;
         }

      } else if (arg5 != 2) {
         throw new IllegalArgumentException();
      } else {
         while(var9 < arg1) {
            while(var14 <= var10 || var13 <= var10) {
               var13 += var11 + var11;
               var14 += var11++ + var11;
            }

            int var48 = arg0 - var11 + 1;
            if (var48 < this.field7745) {
               var48 = this.field7745;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field7732) {
               var49 = this.field7732;
            }

            int var50 = this.field7758 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field7743[var50]) {
                  int var52 = this.field7761[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field7761[var50] = var53 - var55 | var55 - (var55 >>> 8);
               }

               ++var50;
            }

            ++var9;
            var13 -= var12-- + var12;
            var14 -= var12 + var12;
         }

         int var35 = arg3;
         int var36 = -var12;
         int var37 = var36 * var36 + var10;
         int var38 = var37 - arg3;
         int var39 = var37 - var36;

         while(var9 < var8) {
            while(var39 > var10 && var38 > var10) {
               var39 -= var35-- + var35;
               var38 -= var35 + var35;
            }

            int var40 = arg0 - var35;
            if (var40 < this.field7745) {
               var40 = this.field7745;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field7732 - 1) {
               var41 = this.field7732 - 1;
            }

            int var42 = this.field7758 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field7743[var42]) {
                  int var44 = this.field7761[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field7761[var42] = var45 - var47 | var47 - (var47 >>> 8);
               }

               ++var42;
            }

            ++var9;
            var39 += var36 + var36;
            var38 += var36++ + var36;
         }

      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method544() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method585() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method615(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method615(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method539(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method539(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
         }
      } else {
         if (var7 + var8 < 0) {
            arg0 += var7;
            var7 = -var7;
            arg1 += var8;
            var8 = -var8;
         }

         if (var7 > var8) {
            int var9 = arg1 << 16;
            int var10 = var9 + 32768;
            int var11 = var8 << 16;
            int var12 = (int)Math.floor((double)var11 / (double)var7 + 0.5D);
            int var13 = arg0 + var7;
            if (arg0 < this.field7745) {
               var10 += (this.field7745 - arg0) * var12;
               arg0 = this.field7745;
            }

            if (var13 >= this.field7732) {
               var13 = this.field7732 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field7740 && var17 < this.field7723) {
                        int var18 = this.field7758 * var17 + arg0;
                        int var19 = this.field7761[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field7761[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field7740 && var21 < this.field7723) {
                        int var22 = this.field7758 * var21 + arg0;
                        int var23 = this.field7761[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field7761[var22] = var24 - var26 | var26 - (var26 >>> 8);
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg0 <= var13) {
                  int var27 = var10 >> 16;
                  if (var27 >= this.field7740 && var27 < this.field7723) {
                     this.field7761[this.field7758 * var27 + arg0] = arg4;
                  }

                  var10 += var12;
                  ++arg0;
               }

            }
         } else {
            int var28 = arg0 << 16;
            int var29 = var28 + 32768;
            int var30 = var7 << 16;
            int var31 = (int)Math.floor((double)var30 / (double)var8 + 0.5D);
            int var32 = arg1 + var8;
            if (arg1 < this.field7740) {
               var29 += (this.field7740 - arg1) * var31;
               arg1 = this.field7740;
            }

            if (var32 >= this.field7723) {
               var32 = this.field7723 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field7745 && var46 < this.field7732) {
                     this.field7761[this.field7758 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field7745 && var36 < this.field7732) {
                     int var37 = this.field7758 * arg1 + var36;
                     int var38 = this.field7761[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field7761[this.field7758 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field7745 && var40 < this.field7732) {
                     int var41 = this.field7758 * arg1 + var40;
                     int var42 = this.field7761[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field7761[var41] = var43 - var45 | var45 - (var45 >>> 8);
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else {
               throw new IllegalArgumentException();
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "w",
      descriptor = "()V"
   )
   public final void method647() {
      if (this.field7716 != null) {
         this.field7761 = this.field7719.field8751;
         this.field7758 = this.field7719.field8750;
         this.field7747 = this.field7719.field8749;
         this.field7743 = this.field7760;
         this.field7731 = this.field7757;
         this.field7755 = this.field7728;
      } else {
         this.field7758 = 1;
         this.field7747 = 1;
         this.field7761 = null;
         this.field7731 = 1;
         this.field7755 = 1;
         this.field7743 = null;
      }

      this.field7746 = null;
      this.method3941();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Luaa;Luaa;FLuaa;)Luaa;"
   )
   public final class126 method608(class126 arg0, class126 arg1, float arg2, class126 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method641(int arg0, int arg1, int arg2, int arg3) {
      class255 var5 = this.method3934(Thread.currentThread());
      var5.field3407 = arg0;
      var5.field3395 = arg1;
      var5.field3389 = arg2;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "r",
      descriptor = "()Lgq;"
   )
   public final class540 method659() {
      class255 var1 = this.method3934(Thread.currentThread());
      return var1.field3391;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class744 method611(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method3933(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method3933(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method3942(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method3942(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
         }
      } else {
         int var20 = arg8 << 8;
         int var21 = arg6 << 8;
         int var22 = arg7 << 8;
         int var23 = var21 + var22;
         int var24 = var20 % var23;
         if (var10 + var11 < 0) {
            int var25 = (int)(Math.sqrt((double)(var10 * var10 + var11 * var11)) * 256.0D);
            int var26 = var25 % var23;
            int var27 = var21 + var23 - var24 - var26;
            var24 = var27 % var23;
            if (var24 < 0) {
               var24 += var23;
            }

            arg0 += var10;
            var10 = -var10;
            arg1 += var11;
            var11 = -var11;
         }

         if (var10 > var11) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var11 << 16;
            int var31 = (int)Math.floor((double)var30 / (double)var10 + 0.5D);
            int var32 = arg0 + var10;
            int var33 = arg4 >>> 24;
            int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
               if (arg5 == 1) {
                  int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                  int var36 = 256 - var33;

                  while(arg0 <= var32) {
                     int var37 = var29 >> 16;
                     if (arg0 >= this.field7745 && arg0 < this.field7732 && var37 >= this.field7740 && var37 < this.field7723 && var24 < var21) {
                        int var38 = this.field7758 * var37 + arg0;
                        int var39 = this.field7761[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field7761[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field7745 && arg0 < this.field7732 && var42 >= this.field7740 && var42 < this.field7723 && var24 < var21) {
                        int var43 = this.field7758 * var42 + arg0;
                        int var44 = this.field7761[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field7761[var43] = var45 - var47 | var47 - (var47 >>> 8);
                     }

                     var29 += var31;
                     ++arg0;
                     int var48 = var24 + var34;
                     var24 = var48 % var23;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg0 <= var32) {
                  int var49 = var29 >> 16;
                  if (arg0 >= this.field7745 && arg0 < this.field7732 && var49 >= this.field7740 && var49 < this.field7723 && var24 < var21) {
                     this.field7761[this.field7758 * var49 + arg0] = arg4;
                  }

                  var29 += var31;
                  ++arg0;
                  int var50 = var24 + var34;
                  var24 = var50 % var23;
               }

            }
         } else {
            int var51 = arg0 << 16;
            int var52 = var51 + 32768;
            int var53 = var10 << 16;
            int var54 = (int)Math.floor((double)var53 / (double)var11 + 0.5D);
            int var55 = arg1 + var11;
            int var56 = arg4 >>> 24;
            int var57 = (int)Math.sqrt((double)((var54 >> 8) * (var54 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
               if (arg5 == 1) {
                  int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                  int var59 = 256 - var56;

                  while(arg1 <= var55) {
                     int var60 = var52 >> 16;
                     if (arg1 >= this.field7740 && arg1 < this.field7723 && var60 >= this.field7745 && var60 < this.field7732 && var24 < var21) {
                        int var61 = this.field7758 * arg1 + var60;
                        int var62 = this.field7761[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field7761[this.field7758 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field7740 && arg1 < this.field7723 && var65 >= this.field7745 && var65 < this.field7732 && var24 < var21) {
                        int var66 = this.field7758 * arg1 + var65;
                        int var67 = this.field7761[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field7761[var66] = var68 - var70 | var70 - (var70 >>> 8);
                     }

                     var52 += var54;
                     ++arg1;
                     int var71 = var24 + var57;
                     var24 = var71 % var23;
                  }

               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               while(arg1 <= var55) {
                  int var72 = var52 >> 16;
                  if (arg1 >= this.field7740 && arg1 < this.field7723 && var72 >= this.field7745 && var72 < this.field7732 && var24 < var21) {
                     this.field7761[this.field7758 * arg1 + var72] = arg4;
                  }

                  var52 += var54;
                  ++arg1;
                  int var73 = var24 + var57;
                  var24 = var73 % var23;
               }

            }
         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Loda;)V"
   )
   public final void method562(class127 arg0) {
      class255 var2 = this.method3934(Thread.currentThread());
      class750 var3 = arg0.field1524.field593;

      for(class750 var4 = var3.field11109; var3 != var4; var4 = var4.field11109) {
         class611 var5 = (class611)var4;
         int var6 = var5.field8960 >> 12;
         int var7 = var5.field8954 >> 12;
         int var8 = var5.field8953 >> 12;
         float var9 = (float)var8 * this.field7729.field2486 + (float)var6 * this.field7729.field2492 + (float)var7 * this.field7729.field2485 + this.field7729.field2472;
         if (!(var9 < (float)this.field7741) && !(var9 > (float)var2.field3402)) {
            int var10 = (int)(((float)var8 * this.field7729.field2484 + (float)var6 * this.field7729.field2494 + (float)var7 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / var9) + this.field7727;
            int var11 = (int)(((float)var8 * this.field7729.field2473 + (float)var6 * this.field7729.field2479 + (float)var7 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / var9) + this.field7742;
            if (var10 >= this.field7745 && var10 <= this.field7732 && var11 >= this.field7740 && var11 <= this.field7723) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method3929(var5, var10, var11, (int)var9, (int)((float)(this.field7725 * var5.field8952 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method630(int arg0, int arg1, int arg2, int arg3) {
      this.field7727 = arg0;
      this.field7742 = arg1;
      this.field7725 = arg2;
      this.field7739 = arg3;
      this.method3937();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method618(int[] arg0) {
      arg0[0] = this.field7745;
      arg0[1] = this.field7740;
      arg0[2] = this.field7732;
      arg0[3] = this.field7723;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "m",
      descriptor = "()I"
   )
   public final int method586() {
      return 0;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field7758 * arg1 + arg0;
         int var15 = this.field7758 - arg2;
         if (arg1 + arg3 > this.field7723) {
            arg3 -= arg1 + arg3 - this.field7723;
         }

         if (arg1 < this.field7740) {
            int var16 = this.field7740 - arg1;
            arg3 -= var16;
            var14 += this.field7758 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field7732) {
            int var17 = arg0 + arg2 - this.field7732;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field7745) {
            int var18 = this.field7745 - arg0;
            arg2 -= var18;
            var14 += var18;
            var10 += var12 * var18;
            var15 += var18;
         }

         int var19 = arg4 >>> 24;
         int var20 = arg5 >>> 24;
         if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
            if (arg8 == 1) {
               int var21 = var10;

               for(int var22 = -arg3; var22 < 0; ++var22) {
                  int var23 = (var11 >> 16) * arg7;

                  for(int var24 = -arg2; var24 < 0; ++var24) {
                     int var25 = arg4;
                     if (arg6[(var10 >> 16) + var23] != 0) {
                        var25 = arg5;
                     }

                     int var26 = var25 >>> 24;
                     int var27 = 255 - var26;
                     int var28 = this.field7761[var14];
                     this.field7761[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var21;
                  var14 += var15;
               }

            } else if (arg8 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var29 = var10;

               for(int var30 = -arg3; var30 < 0; ++var30) {
                  int var31 = (var11 >> 16) * arg7;

                  for(int var32 = -arg2; var32 < 0; ++var32) {
                     int var33 = arg4;
                     if (arg6[(var10 >> 16) + var31] != 0) {
                        var33 = arg5;
                     }

                     if (var33 != 0) {
                        int var34 = this.field7761[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field7761[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                     } else {
                        ++var14;
                     }

                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var29;
                  var14 += var15;
               }

            }
         } else {
            int var38 = var10;

            for(int var39 = -arg3; var39 < 0; ++var39) {
               int var40 = (var11 >> 16) * arg7;

               for(int var41 = -arg2; var41 < 0; ++var41) {
                  if (arg6[(var10 >> 16) + var40] != 0) {
                     this.field7761[var14++] = arg5;
                  } else {
                     this.field7761[var14++] = arg4;
                  }

                  var10 += var12;
               }

               var11 += var13;
               var10 = var38;
               var14 += var15;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method587(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field7729.field2486 + (float)arg0 * this.field7729.field2492 + (float)arg1 * this.field7729.field2485 + this.field7729.field2472;
      if (!(var6 < (float)this.field7741) && !(var6 > (float)this.field7726)) {
         int var7 = (int)(((float)arg2 * this.field7729.field2484 + (float)arg0 * this.field7729.field2494 + (float)arg1 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field7729.field2473 + (float)arg0 * this.field7729.field2479 + (float)arg1 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / (float)arg3);
         if (var7 >= this.field7735 && var7 <= this.field7738 && var8 >= this.field7734 && var8 <= this.field7733) {
            arg4[0] = var7 - this.field7735;
            arg4[1] = var8 - this.field7734;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method591() {
      return true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "(IIIIII)Luaa;"
   )
   public final class126 method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method554(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field7758) {
         arg2 = this.field7758;
      }

      if (arg3 > this.field7747) {
         arg3 = this.field7747;
      }

      this.field7745 = arg0;
      this.field7732 = arg2;
      this.field7740 = arg1;
      this.field7723 = arg3;
      this.method3937();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Loda;I)V"
   )
   public final void method623(class127 arg0, int arg1) {
      class255 var3 = this.method3934(Thread.currentThread());
      class750 var4 = arg0.field1524.field593;

      for(class750 var5 = var4.field11109; var4 != var5; var5 = var5.field11109) {
         class611 var6 = (class611)var5;
         int var7 = var6.field8960 >> 12;
         int var8 = var6.field8954 >> 12;
         int var9 = var6.field8953 >> 12;
         float var10 = (float)var9 * this.field7729.field2486 + (float)var7 * this.field7729.field2492 + (float)var8 * this.field7729.field2485 + this.field7729.field2472;
         if (!(var10 < (float)this.field7741) && !(var10 > (float)var3.field3402)) {
            int var11 = (int)(((float)var9 * this.field7729.field2484 + (float)var7 * this.field7729.field2494 + (float)var8 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / (float)arg1) + this.field7727;
            int var12 = (int)(((float)var9 * this.field7729.field2473 + (float)var7 * this.field7729.field2479 + (float)var8 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / (float)arg1) + this.field7742;
            if (var11 >= this.field7745 && var11 <= this.field7732 && var12 >= this.field7740 && var12 <= this.field7723) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method3929(var6, var11, var12, (int)var10, (this.field7725 * var6.field8952 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method643(int arg0) {
      this.field7752 = arg0;
      this.field7748.method5451(-126);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method555(int arg0) {
      int var2 = arg0 - this.field7715;

      for(Object var3 = this.field7748.method5448(-19226); var3 != null; var3 = this.field7748.method5460((byte)123)) {
         class632 var4 = (class632)var3;
         if (var4.field9185) {
            var4.field9186 += var2;
            int var5 = var4.field9186 / 20;
            if (var5 > 0) {
               class327 var6 = super.field813.method1159(var4.field9189, 125);
               var4.method4549(var6.field4654 * var2 * 50 / 1000, var6.field4656 * var2 * 50 / 1000);
               var4.field9186 -= var5 * 20;
            }

            var4.field9185 = false;
         }
      }

      this.field7715 = arg0;
      this.field7753.method5453(5, false);
      this.field7748.method5453(5, false);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method551(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field7730.length; ++var5) {
         this.field7730[var5].field3393 = this.field7730[var5].field3395;
         this.field7730[var5].field3407 = arg0;
         this.field7730[var5].field3395 = arg1;
         this.field7730[var5].field3389 = arg2;
         this.field7730[var5].field3406 = true;
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "(I)[I"
   )
   public final int[] method3932(int arg0) {
      class748 var2 = this.field7748;
      class632 var3;
      synchronized(this.field7748) {
         var3 = (class632)this.field7748.method5454((long)arg0 | Long.MIN_VALUE, 18261);
         if (var3 == null) {
            if (!super.field813.method1165(arg0, -23239)) {
               return null;
            }

            class327 var5 = super.field813.method1159(arg0, 125);
            int var6 = !var5.field4646 && !this.field7751 ? this.field7752 : 64;
            var3 = new class632(arg0, var6, super.field813.method1168(0.7F, true, var6, 24521, arg0, var6), var5.field4636 != 1);
            this.field7748.method5455(-2049, var3, (long)arg0 | Long.MIN_VALUE);
         }
      }

      var3.field9185 = true;
      return var3.method4550();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method569(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field7758 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field7761[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method571(Canvas arg0) {
      if (arg0 != null) {
         class593 var2 = (class593)this.field7717.method5681((long)arg0.hashCode(), -1);
         if (var2 != null) {
            this.field7716 = arg0;
            Dimension var3 = arg0.getSize();
            this.field7722 = var3.width;
            this.field7718 = var3.height;
            this.field7719 = var2;
            if (this.field7746 == null) {
               this.field7761 = var2.field8751;
               this.field7758 = var2.field8750;
               this.field7747 = var2.field8749;
               if (this.field7758 != this.field7731 || this.field7755 != this.field7747) {
                  this.field7757 = this.field7731 = this.field7758;
                  this.field7728 = this.field7755 = this.field7747;
                  this.field7760 = this.field7743 = new float[this.field7755 * this.field7731];
               }

               this.method3941();
               return;
            }
         }
      } else {
         this.field7716 = null;
         this.field7719 = null;
         if (this.field7746 == null) {
            this.field7761 = null;
            this.field7758 = this.field7747 = 1;
            this.field7731 = this.field7755 = 1;
            this.method3941();
         }
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method598(int arg0, int arg1, int arg2, int arg3) {
      if (this.field7745 < arg0) {
         this.field7745 = arg0;
      }

      if (this.field7740 < arg1) {
         this.field7740 = arg1;
      }

      if (this.field7732 > arg2) {
         this.field7732 = arg2;
      }

      if (this.field7723 > arg3) {
         this.field7723 = arg3;
      }

      this.method3937();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method633(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "p",
      descriptor = "()V"
   )
   public final void method614() {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method3933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field7740 && arg1 < this.field7723) {
         int var9 = this.field7758 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field7745 && arg0 + var15 < this.field7732 && var12 < arg5) {
                     int var16 = this.field7761[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field7761[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field7745 && arg0 + var18 < this.field7732 && var12 < arg5) {
                     int var19 = this.field7761[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field7761[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                  }

                  ++var18;
                  ++var12;
                  var12 %= var11;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            int var23 = 0;

            while(var23 < arg2) {
               if (arg0 + var23 >= this.field7745 && arg0 + var23 < this.field7732 && var12 < arg5) {
                  this.field7761[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class255 var8 = this.method3934(Thread.currentThread());
      class584 var9 = var8.field3411;
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      int var12 = var10 >= 0 ? var10 : -var10;
      int var13 = var11 >= 0 ? var11 : -var11;
      int var14 = var12;
      if (var12 < var13) {
         var14 = var13;
      }

      if (var14 != 0) {
         int var15 = (var10 << 16) / var14;
         int var16 = (var11 << 16) / var14;
         int var17 = (var15 >> 16) + var10;
         int var18 = (var16 >> 16) + var11;
         if (var16 <= var15) {
            var15 = -var15;
         } else {
            var16 = -var16;
         }

         int var19 = arg5 * var16 >> 17;
         int var20 = arg5 * var16 + 1 >> 17;
         int var21 = arg5 * var15 >> 17;
         int var22 = arg5 * var15 + 1 >> 17;
         int var23 = arg0 - var9.method4306();
         int var24 = arg1 - var9.method4305();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field8650 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field8650 = 255 - (arg4 >>> 24);
         }

         this.method622(false);
         var9.field8662 = var25 < 0 || var25 > var9.field8649 || var26 < 0 || var26 > var9.field8649 || var27 < 0 || var27 > var9.field8649;
         var9.method4307((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field8662 = var25 < 0 || var25 > var9.field8649 || var27 < 0 || var27 > var9.field8649 || var28 < 0 || var28 > var9.field8649;
         var9.method4307((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method622(true);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method540(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field7730.length; ++var4) {
         class255 var5 = this.field7730[var4];
         var5.field3395 = arg0 & 16777215;
         int var6 = var5.field3395 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field3395 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field3395 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field3395 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field3403 = false;
         } else {
            var5.field3403 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "XA",
      descriptor = "()I"
   )
   public final int method639() {
      return this.field7726;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method632(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method660(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field7759 = (int)(arg1 * 65535.0F);
      this.field7750 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field7736 = (int)(arg3 * 65535.0F / var7);
      this.field7756 = (int)(arg4 * 65535.0F / var7);
      this.field7724 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method620(Canvas arg0) {
      if (this.field7716 == arg0) {
         this.method571((Canvas)null);
      }

      class593 var2 = (class593)this.field7717.method5681((long)arg0.hashCode(), -1);
      if (var2 != null) {
         var2.method2720(0);
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lpg;[Lnia;Z)Lda;"
   )
   public final class67 method570(class763 arg0, class671[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field10100;
         var5[var7] = arg1[var7].field10097;
         if (arg1[var7].field10095 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class43(this, arg0, arg1, var4, var5);
         } else {
            return new class245(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class452(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method601(Canvas arg0, int arg1, int arg2) {
      class593 var4 = (class593)this.field7717.method5681((long)arg0.hashCode(), -1);
      if (var4 == null) {
         class593 var5 = class425.method3232(true, arg2, arg1, arg0);
         this.field7717.method5682((long)arg0.hashCode(), var5, (byte)7);
      } else {
         if (var4.field8750 != arg1 || var4.field8749 != arg2) {
            this.method584(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "la",
      descriptor = "()V"
   )
   public final void method607() {
      this.field7745 = 0;
      this.field7740 = 0;
      this.field7732 = this.field7758;
      this.field7723 = this.field7747;
      this.method3937();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Lig;"
   )
   public final class255 method3934(Runnable arg0) {
      for(int var2 = 0; var2 < this.field7744; ++var2) {
         if (this.field7730[var2].field3397 == arg0) {
            return this.field7730[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIZ)Lat;"
   )
   public final class396 method580(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class381(this, arg0, arg1) : new class343(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method644() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "()V"
   )
   public final void method616() {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Luaa;)V"
   )
   public final void method583(class126 arg0) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method596(class434 arg0) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "()V"
   )
   public final void method581() {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "o",
      descriptor = "(I)[I"
   )
   public final int[] method3935(int arg0) {
      class748 var2 = this.field7748;
      class632 var3;
      synchronized(this.field7748) {
         var3 = (class632)this.field7748.method5454((long)arg0, 18261);
         if (var3 == null) {
            if (!super.field813.method1165(arg0, -23239)) {
               return null;
            }

            class327 var5 = super.field813.method1159(arg0, 127);
            int var6 = !var5.field4646 && !this.field7751 ? this.field7752 : 64;
            var3 = new class632(arg0, var6, super.field813.method1166((byte)89, 0.7F, var6, var6, true, arg0), var5.field4636 != 1);
            this.field7748.method5455(-2049, var3, (long)arg0);
         }
      }

      var3.field9185 = true;
      return var3.method4550();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method567() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method545() {
      return true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method625(int arg0, int arg1) {
      class255 var3 = this.method3934(Thread.currentThread());
      this.field7741 = arg0;
      this.field7726 = arg1;
      var3.field3402 = this.field7726 - 255;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method573() {
      return true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lut;IIII)Lka;"
   )
   public final class497 method547(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class267(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "j",
      descriptor = "(I)Z"
   )
   public final boolean method3936(int arg0) {
      return this.field7751 || super.field813.method1159(arg0, 127).field4646;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "g",
      descriptor = "()V"
   )
   private final void method3937() {
      this.field7735 = this.field7745 - this.field7727;
      this.field7738 = this.field7732 - this.field7727;
      this.field7734 = this.field7740 - this.field7742;
      this.field7733 = this.field7723 - this.field7742;

      for(int var1 = 0; var1 < this.field7744; ++var1) {
         class584 var5 = this.field7730[var1].field3411;
         var5.field8654 = this.field7727 - this.field7745;
         var5.field8647 = this.field7742 - this.field7740;
         var5.field8649 = this.field7732 - this.field7745;
         var5.field8661 = this.field7723 - this.field7740;
      }

      int var2 = this.field7758 * this.field7740 + this.field7745;

      for(int var3 = this.field7740; var3 < this.field7723; ++var3) {
         for(int var4 = 0; var4 < this.field7744; ++var4) {
            this.field7730[var4].field3411.field8655[var3 - this.field7740] = var2;
         }

         var2 += this.field7758;
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method654(float arg0) {
      this.field7749 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method543(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lnia;Z)Lat;"
   )
   public final class396 method577(class671 arg0, boolean arg1) {
      int[] var3 = arg0.field10096;
      byte[] var4 = arg0.field10099;
      int var5 = arg0.field10100;
      int var6 = arg0.field10097;
      class435 var11;
      if (arg1 && arg0.field10095 == null) {
         int[] var7 = new int[var3.length];
         byte[] var8 = new byte[var5 * var6];

         for(int var9 = 0; var9 < var6; ++var9) {
            int var12 = var5 * var9;

            for(int var13 = 0; var13 < var5; ++var13) {
               var8[var12 + var13] = var4[var12 + var13];
            }
         }

         for(int var10 = 0; var10 < var3.length; ++var10) {
            var7[var10] = var3[var10];
         }

         var11 = new class38(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field10095;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class381(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class343(this, var14, var5, var6);
         }
      }

      var11.method1976(arg0.field10103, arg0.field10102, arg0.field10101, arg0.field10098);
      return var11;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "(II)Lps;"
   )
   public final class103 method568(int arg0, int arg1) {
      return this.method580(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field7729.field2486 + (float)arg0 * this.field7729.field2492 + (float)arg1 * this.field7729.field2485 + this.field7729.field2472;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field7729.field2486 + (float)arg3 * this.field7729.field2492 + (float)arg4 * this.field7729.field2485 + this.field7729.field2472;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field7741 && var9 < (float)this.field7741) {
         var7 |= 16;
      } else if (var8 > (float)this.field7726 && var9 > (float)this.field7726) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field7729.field2484 + (float)arg0 * this.field7729.field2494 + (float)arg1 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / var8);
      int var11 = (int)(((float)arg5 * this.field7729.field2484 + (float)arg3 * this.field7729.field2494 + (float)arg4 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / var9);
      if (var10 < this.field7735 && var11 < this.field7735) {
         var7 |= 1;
      } else if (var10 > this.field7738 && var11 > this.field7738) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field7729.field2473 + (float)arg0 * this.field7729.field2479 + (float)arg1 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / var8);
      int var13 = (int)(((float)arg5 * this.field7729.field2473 + (float)arg3 * this.field7729.field2479 + (float)arg4 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / var9);
      if (var12 < this.field7734 && var13 < this.field7734) {
         var7 |= 4;
      } else if (var12 > this.field7733 && var13 > this.field7733) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "i",
      descriptor = "(I)Lza;"
   )
   public final class434 method592(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class531(class160 arg0) {
      super(arg0);
      this.field7720 = false;
      this.field7721 = false;
      this.field7717 = new class791(4);
      this.field7726 = 3500;
      this.field7732 = 0;
      this.field7725 = 512;
      this.field7723 = 0;
      this.field7741 = 50;
      this.field7740 = 0;
      this.field7737 = 0;
      this.field7739 = 512;
      this.field7745 = 0;
      this.field7749 = 75518;
      this.field7752 = 128;
      this.field7759 = 45823;
      this.field7754 = 0;
      this.field7750 = 78642;
      this.field7751 = false;
      this.field7753 = new class748(16);
      this.field7763 = -1;

      try {
         this.field7748 = new class748(256);
         this.field7729 = new class199();
         this.method628(1);
         this.method563(0);
         class301.method2294(-7208, true, true);
         this.field7721 = true;
         this.field7715 = (int)class188.method1462(true);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method653(-117);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field7729.field2486 + (float)arg0 * this.field7729.field2492 + (float)arg1 * this.field7729.field2485 + this.field7729.field2472;
      if (!(var5 < (float)this.field7741) && !(var5 > (float)this.field7726)) {
         int var6 = (int)(((float)arg2 * this.field7729.field2484 + (float)arg0 * this.field7729.field2494 + (float)arg1 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / var5);
         int var7 = (int)(((float)arg2 * this.field7729.field2473 + (float)arg0 * this.field7729.field2479 + (float)arg1 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / var5);
         if (var6 >= this.field7735 && var6 <= this.field7738 && var7 >= this.field7734 && var7 <= this.field7733) {
            arg3[0] = var6 - this.field7735;
            arg3[1] = var7 - this.field7734;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "m",
      descriptor = "(I)I"
   )
   public final int method3938(int arg0) {
      return super.field813.method1159(arg0, 122).field4650 & 65535;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class255 var14 = this.method3934(Thread.currentThread());
      class584 var15 = var14.field3411;
      var15.field8657 = false;
      int var16 = arg0 - this.field7735;
      int var17 = arg3 - this.field7735;
      int var18 = arg6 - this.field7735;
      int var19 = arg1 - this.field7734;
      int var20 = arg4 - this.field7734;
      int var21 = arg7 - this.field7734;
      var15.field8662 = var16 < 0 || var16 > var15.field8649 || var17 < 0 || var17 > var15.field8649 || var18 < 0 || var18 > var15.field8649;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field8650 = 255 - var22;
            var15.field8659 = false;
            var15.method4322((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field8650 = 128;
            var15.field8659 = true;
            var15.method4322((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field8650 = 0;
         var15.field8659 = false;
         var15.method4322((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field8657 = true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method649() {
      return true;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method3939(int arg0) {
      return super.field813.method1159(arg0, 125).field4636;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method560(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method646(int arg0) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method651() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "o",
      descriptor = "()V"
   )
   public final void method548() {
      this.field7748.method5451(-119);
      this.field7753.method5451(123);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lsea;)V"
   )
   public final void method566(class725 arg0) {
      class780 var2 = (class780)arg0;
      this.field7758 = var2.field11390;
      this.field7747 = var2.field11381;
      this.field7761 = var2.field11382;
      this.field7746 = var2;
      this.field7731 = var2.field11390;
      this.field7755 = var2.field11381;
      this.field7743 = var2.field11389;
      this.method3941();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "i",
      descriptor = "()I"
   )
   public final int method635() {
      return this.field7741;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method542() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "A",
      descriptor = "()Lgq;"
   )
   public final class540 method656() {
      return this.field7729;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method615(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field7740 && arg1 < this.field7723) {
         if (arg0 < this.field7745) {
            arg2 -= this.field7745 - arg0;
            arg0 = this.field7745;
         }

         if (arg0 + arg2 > this.field7732) {
            arg2 = this.field7732 - arg0;
         }

         int var6 = this.field7758 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field7761[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field7761[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field7761[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field7761[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field7761[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field7745 && arg0 < this.field7732) {
         if (arg1 < this.field7740) {
            arg2 -= this.field7740 - arg1;
            arg1 = this.field7740;
         }

         if (arg1 + arg2 > this.field7723) {
            arg2 = this.field7723 - arg1;
         }

         int var6 = this.field7758 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field7758 * var10 + var6;
                  int var12 = this.field7761[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field7761[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field7758 * var14 + var6;
                  int var16 = this.field7761[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field7761[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field7761[this.field7758 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method610(int[] arg0) {
      arg0[0] = this.field7758;
      arg0[1] = this.field7747;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "()Lqha;"
   )
   public final class110 method595() {
      return new class110(0, field7764[2], 1, field7764[1], 0L);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field7740) {
         var6 = this.field7740;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field7723) {
         var7 = this.field7723;
      }

      int var8 = var6;
      int var9 = arg2 * arg2;
      int var10 = 0;
      int var11 = arg1 - var6;
      int var12 = var11 * var11;
      int var13 = var12 - var11;
      if (arg1 > var7) {
         arg1 = var7;
      }

      int var14 = arg3 >>> 24;
      if (arg4 == 0 || arg4 == 1 && var14 == 255) {
         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var64 = arg0 - var10 + 1;
            if (var64 < this.field7745) {
               var64 = this.field7745;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field7732) {
               var65 = this.field7732;
            }

            int var66 = this.field7758 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field7761[var66++] = arg3;
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var55 = arg2;
         int var56 = var8 - arg1;
         int var57 = var56 * var56 + var9;
         int var58 = var57 - arg2;
         int var59 = var57 - var56;

         while(var8 < var7) {
            while(var59 > var9 && var58 > var9) {
               var59 -= var55-- + var55;
               var58 -= var55 + var55;
            }

            int var60 = arg0 - var55;
            if (var60 < this.field7745) {
               var60 = this.field7745;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field7732 - 1) {
               var61 = this.field7732 - 1;
            }

            int var62 = this.field7758 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field7761[var62++] = arg3;
            }

            ++var8;
            var59 += var56 + var56;
            var58 += var56++ + var56;
         }

      } else if (arg4 == 1) {
         int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
         int var16 = 256 - var14;

         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var28 = arg0 - var10 + 1;
            if (var28 < this.field7745) {
               var28 = this.field7745;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field7732) {
               var29 = this.field7732;
            }

            int var30 = this.field7758 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field7761[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field7761[var30++] = var15 + var33;
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var17 = arg2;
         int var18 = -var11;
         int var19 = var18 * var18 + var9;
         int var20 = var19 - arg2;
         int var21 = var19 - var18;

         while(var8 < var7) {
            while(var21 > var9 && var20 > var9) {
               var21 -= var17-- + var17;
               var20 -= var17 + var17;
            }

            int var22 = arg0 - var17;
            if (var22 < this.field7745) {
               var22 = this.field7745;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field7732 - 1) {
               var23 = this.field7732 - 1;
            }

            int var24 = this.field7758 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field7761[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field7761[var24++] = var15 + var27;
            }

            ++var8;
            var21 += var18 + var18;
            var20 += var18++ + var18;
         }

      } else if (arg4 != 2) {
         throw new IllegalArgumentException();
      } else {
         while(var8 < arg1) {
            while(var13 <= var9 || var12 <= var9) {
               var12 += var10 + var10;
               var13 += var10++ + var10;
            }

            int var47 = arg0 - var10 + 1;
            if (var47 < this.field7745) {
               var47 = this.field7745;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field7732) {
               var48 = this.field7732;
            }

            int var49 = this.field7758 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field7761[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field7761[var49++] = var52 - var54 | var54 - (var54 >>> 8);
            }

            ++var8;
            var12 -= var11-- + var11;
            var13 -= var11 + var11;
         }

         int var34 = arg2;
         int var35 = -var11;
         int var36 = var35 * var35 + var9;
         int var37 = var36 - arg2;
         int var38 = var36 - var35;

         while(var8 < var7) {
            while(var38 > var9 && var37 > var9) {
               var38 -= var34-- + var34;
               var37 -= var34 + var34;
            }

            int var39 = arg0 - var34;
            if (var39 < this.field7745) {
               var39 = this.field7745;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field7732 - 1) {
               var40 = this.field7732 - 1;
            }

            int var41 = this.field7758 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field7761[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field7761[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "([IIIIIZ)Lat;"
   )
   public final class396 method603(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class381(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class343(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class381(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class343(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method3940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field813.method1159(arg6, 122).field4649) {
            if (this.field7763 != arg6) {
               class396 var11 = (class396)this.field7753.method5454((long)arg6, 18261);
               if (var11 == null) {
                  int[] var12 = this.method3932(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method3936(arg6) ? 64 : this.field7752;
                  var11 = this.method589(var13, 0, 0, var12, var13, var13);
                  this.field7753.method5455(-2049, var11, (long)arg6);
               }

               this.field7763 = arg6;
               this.field7762 = var11;
            }

            ((class435)this.field7762).method266(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method3931(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "I",
      descriptor = "()I"
   )
   public final int method631() {
      int var1 = this.field7737;
      this.field7737 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "pa",
      descriptor = "()V"
   )
   public final void method648() {
      for(int var1 = 0; var1 < this.field7730.length; ++var1) {
         this.field7730[var1].field3395 = this.field7730[var1].field3393;
         this.field7730[var1].field3406 = false;
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method563(int arg0) {
      this.field7730[arg0].method1918(Thread.currentThread(), -16569);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method640(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field7731 - arg2;
      int var8 = this.field7731 * arg1 + arg0;
      float[] var9 = this.field7743;
      int var10 = 0;

      while(var10 < arg3) {
         int var11 = 0;

         while(var11 < arg2) {
            float var12 = var9[var8];
            if (var12 != 2.1474836E9F) {
               var9[var8] = (float)((double)var12 + arg4);
            }

            ++var11;
            ++var8;
         }

         ++var10;
         var8 += var7;
      }

   }

   @OriginalMember(
      owner = "client!bda",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method638(int arg0, int arg1) {
      int var3 = this.field7758 * arg1 + arg0;
      int var4 = this.field7731 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field7761;
         float[] var6 = this.field7743;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class195.method1495(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class195.method1495(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class195.method1491(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class195.method1491(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "j",
      descriptor = "()Lgq;"
   )
   public final class540 method559() {
      return new class199();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lps;Llba;)Lsea;"
   )
   public final class725 method541(class103 arg0, class575 arg1) {
      return new class780(this, (class396)arg0, (class85)arg1);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "C",
      descriptor = "()V"
   )
   private final void method3941() {
      for(int var1 = 0; var1 < this.field7744; ++var1) {
         this.field7730[var1].method1917((byte)-76);
      }

      this.method607();
   }

   @OriginalMember(
      owner = "client!bda",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field7729.field2486 + (float)arg0 * this.field7729.field2492 + (float)arg1 * this.field7729.field2485 + this.field7729.field2472;
      float var9 = (float)arg5 * this.field7729.field2486 + (float)arg3 * this.field7729.field2492 + (float)arg4 * this.field7729.field2485 + this.field7729.field2472;
      int var10 = 0;
      if (var8 < (float)this.field7741 && var9 < (float)this.field7741) {
         var10 |= 16;
      } else if (var8 > (float)this.field7726 && var9 > (float)this.field7726) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field7729.field2484 + (float)arg0 * this.field7729.field2494 + (float)arg1 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field7729.field2484 + (float)arg3 * this.field7729.field2494 + (float)arg4 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / (float)arg6);
      if (var11 < this.field7735 && var12 < this.field7735) {
         var10 |= 1;
      } else if (var11 > this.field7738 && var12 > this.field7738) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field7729.field2473 + (float)arg0 * this.field7729.field2479 + (float)arg1 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field7729.field2473 + (float)arg3 * this.field7729.field2479 + (float)arg4 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / (float)arg6);
      if (var13 < this.field7734 && var14 < this.field7734) {
         var10 |= 4;
      } else if (var13 > this.field7733 && var14 > this.field7733) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method597(int arg0) {
      this.method645(0, 0, this.field7758, this.field7747, arg0, 0);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method621(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field7729.field2486 + (float)arg0 * this.field7729.field2492 + (float)arg1 * this.field7729.field2485 + this.field7729.field2472;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field7729.field2484 + (float)arg0 * this.field7729.field2494 + (float)arg1 * this.field7729.field2470 + this.field7729.field2491) * (float)this.field7725 / var5);
         int var7 = (int)(((float)arg2 * this.field7729.field2473 + (float)arg0 * this.field7729.field2479 + (float)arg1 * this.field7729.field2497 + this.field7729.field2476) * (float)this.field7739 / var5);
         arg3[0] = var6 - this.field7735;
         arg3[1] = var7 - this.field7734;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "E",
      descriptor = "()I"
   )
   public final int method565() {
      return 0;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
      class645 var10 = (class645)arg6;
      int[] var11 = var10.field9384;
      int[] var12 = var10.field9387;
      int var13 = this.field7740 > arg8 ? this.field7740 : arg8;
      int var14 = this.field7723 < var11.length + arg8 ? this.field7723 : var11.length + arg8;
      int var15 = arg2 - arg0;
      int var16 = arg3 - arg1;
      if (var15 + var16 < 0) {
         arg0 += var15;
         var15 = -var15;
         arg1 += var16;
         var16 = -var16;
      }

      if (var15 > var16) {
         int var17 = arg1 << 16;
         int var18 = var17 + 32768;
         int var19 = var16 << 16;
         int var20 = (int)Math.floor((double)var19 / (double)var15 + 0.5D);
         int var21 = arg0 + var15;
         if (arg0 < this.field7745) {
            var18 += (this.field7745 - arg0) * var20;
            arg0 = this.field7745;
         }

         if (var21 >= this.field7732) {
            var21 = this.field7732 - 1;
         }

         int var22 = arg4 >>> 24;
         if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
            if (arg5 == 1) {
               int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
               int var24 = 256 - var22;

               while(arg0 <= var21) {
                  int var25 = var18 >> 16;
                  int var26 = var25 - arg8;
                  if (var25 >= var13 && var25 < var14) {
                     int var27 = var11[var26] + arg7;
                     if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                        int var28 = this.field7758 * var25 + arg0;
                        int var29 = this.field7761[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field7761[var28] = var23 + var30;
                     }
                  }

                  var18 += var20;
                  ++arg0;
               }

            } else if (arg5 == 2) {
               while(arg0 <= var21) {
                  int var31 = var18 >> 16;
                  int var32 = var31 - arg8;
                  if (var31 >= var13 && var31 < var14) {
                     int var33 = var11[var32] + arg7;
                     if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                        int var34 = this.field7758 * var31 + arg0;
                        int var35 = this.field7761[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field7761[var34] = var36 - var38 | var38 - (var38 >>> 8);
                     }
                  }

                  var18 += var20;
                  ++arg0;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            while(arg0 <= var21) {
               int var39 = var18 >> 16;
               int var40 = var39 - arg8;
               if (var39 >= var13 && var39 < var14) {
                  int var41 = var11[var40] + arg7;
                  if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                     this.field7761[this.field7758 * var39 + arg0] = arg4;
                  }
               }

               var18 += var20;
               ++arg0;
            }

         }
      } else {
         int var42 = arg0 << 16;
         int var43 = var42 + 32768;
         int var44 = var15 << 16;
         int var45 = (int)Math.floor((double)var44 / (double)var16 + 0.5D);
         int var46 = arg1 + var16;
         if (arg1 < var13) {
            var43 += (var13 - arg1) * var45;
            arg1 = var13;
         }

         if (var46 >= var14) {
            var46 = var14 - 1;
         }

         int var47 = arg4 >>> 24;
         if (arg5 == 0 || arg5 == 1 && var47 == 255) {
            while(arg1 <= var46) {
               int var64 = var43 >> 16;
               int var65 = arg1 - arg8;
               int var66 = var11[var65] + arg7;
               if (var64 >= this.field7745 && var64 < this.field7732 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field7761[this.field7758 * arg1 + var64] = arg4;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 1) {
            int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
            int var49 = 256 - var47;

            while(arg1 <= var46) {
               int var50 = var43 >> 16;
               int var51 = arg1 - arg8;
               int var52 = var11[var51] + arg7;
               if (var50 >= this.field7745 && var50 < this.field7732 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field7758 * arg1 + var50;
                  int var54 = this.field7761[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field7761[this.field7758 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field7745 && var56 < this.field7732 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field7758 * arg1 + var56;
                  int var60 = this.field7761[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field7761[var59] = var61 - var63 | var63 - (var63 >>> 8);
               }

               var43 += var45;
               ++arg1;
            }

         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method613(int arg0) {
      this.field7730[arg0].method1918((Runnable)null, -16569);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "M",
      descriptor = "()I"
   )
   public final int method556() {
      int var1 = this.field7754;
      this.field7754 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method582(boolean arg0) {
      this.field7751 = arg0;
      this.field7748.method5451(65);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method599(int arg0, class744[] arg1) {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method634() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "()V"
   )
   public final void method549() {
   }

   @OriginalMember(
      owner = "client!bda",
      name = "h",
      descriptor = "()Z"
   )
   public final boolean method604() {
      return false;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method3942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field7745 && arg0 < this.field7732) {
         int var9 = this.field7758 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field7740 && arg1 + var15 < this.field7723 && var12 < arg5) {
                     int var16 = this.field7758 * var15 + var9;
                     int var17 = this.field7761[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field7761[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field7740 && arg1 + var19 < this.field7723 && var12 < arg5) {
                     int var20 = this.field7758 * var19 + var9;
                     int var21 = this.field7761[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field7761[var20] = var22 - var24 | var24 - (var24 >>> 8);
                  }

                  ++var19;
                  ++var12;
                  var12 %= var11;
               }

            } else {
               throw new IllegalArgumentException();
            }
         } else {
            int var25 = 0;

            while(var25 < arg2) {
               if (arg1 + var25 >= this.field7740 && arg1 + var25 < this.field7723 && var12 < arg5) {
                  this.field7761[this.field7758 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIIZ)Lat;"
   )
   public final class396 method602(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field7758 * arg1 + arg0;
      int var8 = this.field7758 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field7761[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class381(this, var6, arg2, arg3);
      } else {
         return new class343(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class512 method572(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class645(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3943(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3944(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
