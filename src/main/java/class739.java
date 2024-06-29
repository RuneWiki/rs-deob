import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class739 extends class65 {
   @OriginalMember(
      owner = "client!lga",
      name = "Y",
      descriptor = "Z"
   )
   private boolean field10603;
   @OriginalMember(
      owner = "client!lga",
      name = "M",
      descriptor = "Z"
   )
   private boolean field10607;
   @OriginalMember(
      owner = "client!lga",
      name = "B",
      descriptor = "Lld;"
   )
   private class178 field10602;
   @OriginalMember(
      owner = "client!lga",
      name = "nb",
      descriptor = "I"
   )
   public int field10615;
   @OriginalMember(
      owner = "client!lga",
      name = "R",
      descriptor = "I"
   )
   public int field10623;
   @OriginalMember(
      owner = "client!lga",
      name = "kb",
      descriptor = "I"
   )
   private int field10626;
   @OriginalMember(
      owner = "client!lga",
      name = "X",
      descriptor = "I"
   )
   public int field10619;
   @OriginalMember(
      owner = "client!lga",
      name = "L",
      descriptor = "I"
   )
   public int field10622;
   @OriginalMember(
      owner = "client!lga",
      name = "G",
      descriptor = "I"
   )
   public int field10612;
   @OriginalMember(
      owner = "client!lga",
      name = "P",
      descriptor = "I"
   )
   public int field10625;
   @OriginalMember(
      owner = "client!lga",
      name = "ab",
      descriptor = "Z"
   )
   private boolean field10616;
   @OriginalMember(
      owner = "client!lga",
      name = "hb",
      descriptor = "I"
   )
   public int field10628;
   @OriginalMember(
      owner = "client!lga",
      name = "F",
      descriptor = "I"
   )
   private int field10614;
   @OriginalMember(
      owner = "client!lga",
      name = "v",
      descriptor = "I"
   )
   public int field10643;
   @OriginalMember(
      owner = "client!lga",
      name = "pb",
      descriptor = "I"
   )
   public int field10633;
   @OriginalMember(
      owner = "client!lga",
      name = "jb",
      descriptor = "I"
   )
   public int field10639;
   @OriginalMember(
      owner = "client!lga",
      name = "T",
      descriptor = "I"
   )
   public int field10644;
   @OriginalMember(
      owner = "client!lga",
      name = "J",
      descriptor = "I"
   )
   public int field10646;
   @OriginalMember(
      owner = "client!lga",
      name = "D",
      descriptor = "Lgw;"
   )
   private class179 field10645;
   @OriginalMember(
      owner = "client!lga",
      name = "V",
      descriptor = "I"
   )
   private int field10649;
   @OriginalMember(
      owner = "client!lga",
      name = "lb",
      descriptor = "Lgw;"
   )
   private class179 field10621;
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "Lnca;"
   )
   public class784 field10617;
   @OriginalMember(
      owner = "client!lga",
      name = "ib",
      descriptor = "I"
   )
   private int field10601;
   @OriginalMember(
      owner = "client!lga",
      name = "rb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10650 = new String[]{method5331(method5330(",}Y")), method5331(method5330("\u0013nMiK\tzIm")), method5331(method5330("\u0000Kj")), method5331(method5330("\rt\u001fA?"))};
   @OriginalMember(
      owner = "client!lga",
      name = "ob",
      descriptor = "I"
   )
   private int field10604;
   @OriginalMember(
      owner = "client!lga",
      name = "mb",
      descriptor = "I"
   )
   private int field10606;
   @OriginalMember(
      owner = "client!lga",
      name = "qb",
      descriptor = "I"
   )
   public int field10609;
   @OriginalMember(
      owner = "client!lga",
      name = "bb",
      descriptor = "I"
   )
   public int field10610;
   @OriginalMember(
      owner = "client!lga",
      name = "db",
      descriptor = "I"
   )
   private int field10618;
   @OriginalMember(
      owner = "client!lga",
      name = "fb",
      descriptor = "I"
   )
   private int field10620;
   @OriginalMember(
      owner = "client!lga",
      name = "A",
      descriptor = "I"
   )
   public int field10624;
   @OriginalMember(
      owner = "client!lga",
      name = "E",
      descriptor = "I"
   )
   public int field10630;
   @OriginalMember(
      owner = "client!lga",
      name = "W",
      descriptor = "I"
   )
   private int field10631;
   @OriginalMember(
      owner = "client!lga",
      name = "O",
      descriptor = "I"
   )
   public int field10632;
   @OriginalMember(
      owner = "client!lga",
      name = "U",
      descriptor = "I"
   )
   public int field10635;
   @OriginalMember(
      owner = "client!lga",
      name = "x",
      descriptor = "I"
   )
   public int field10636;
   @OriginalMember(
      owner = "client!lga",
      name = "I",
      descriptor = "I"
   )
   private int field10637;
   @OriginalMember(
      owner = "client!lga",
      name = "w",
      descriptor = "I"
   )
   public int field10638;
   @OriginalMember(
      owner = "client!lga",
      name = "K",
      descriptor = "I"
   )
   private int field10640;
   @OriginalMember(
      owner = "client!lga",
      name = "N",
      descriptor = "I"
   )
   public int field10641;
   @OriginalMember(
      owner = "client!lga",
      name = "S",
      descriptor = "I"
   )
   public int field10642;
   @OriginalMember(
      owner = "client!lga",
      name = "Q",
      descriptor = "I"
   )
   public int field10647;
   @OriginalMember(
      owner = "client!lga",
      name = "H",
      descriptor = "Lal;"
   )
   public class108 field10605;
   @OriginalMember(
      owner = "client!lga",
      name = "gb",
      descriptor = "Ltd;"
   )
   private class476 field10648;
   @OriginalMember(
      owner = "client!lga",
      name = "C",
      descriptor = "Lid;"
   )
   private class609 field10613;
   @OriginalMember(
      owner = "client!lga",
      name = "cb",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field10608;
   @OriginalMember(
      owner = "client!lga",
      name = "u",
      descriptor = "[F"
   )
   public float[] field10627;
   @OriginalMember(
      owner = "client!lga",
      name = "y",
      descriptor = "[F"
   )
   public float[] field10629;
   @OriginalMember(
      owner = "client!lga",
      name = "Z",
      descriptor = "[I"
   )
   public int[] field10634;
   @OriginalMember(
      owner = "client!lga",
      name = "eb",
      descriptor = "[Ldaa;"
   )
   private class12[] field10611;

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class510 method304(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class348(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field10617.field11500 + (float)arg0 * this.field10617.field11487 + (float)arg1 * this.field10617.field11479 + this.field10617.field11492;
      float var9 = (float)arg5 * this.field10617.field11500 + (float)arg3 * this.field10617.field11487 + (float)arg4 * this.field10617.field11479 + this.field10617.field11492;
      int var10 = 0;
      if (var8 < (float)this.field10628 && var9 < (float)this.field10628) {
         var10 |= 16;
      } else if (var8 > (float)this.field10643 && var9 > (float)this.field10643) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field10617.field11493 + (float)arg0 * this.field10617.field11475 + (float)arg1 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field10617.field11493 + (float)arg3 * this.field10617.field11475 + (float)arg4 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / (float)arg6);
      if (var11 < this.field10638 && var12 < this.field10638) {
         var10 |= 1;
      } else if (var11 > this.field10647 && var12 > this.field10647) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field10617.field11476 + (float)arg0 * this.field10617.field11481 + (float)arg1 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field10617.field11476 + (float)arg3 * this.field10617.field11481 + (float)arg4 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / (float)arg6);
      if (var13 < this.field10636 && var14 < this.field10636) {
         var10 |= 4;
      } else if (var13 > this.field10624 && var14 > this.field10624) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "I",
      descriptor = "()I"
   )
   public final int method346() {
      int var1 = this.field10614;
      this.field10614 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method429(int arg0, int arg1, int arg2, int arg3) {
      this.field10642 = arg0;
      this.field10641 = arg1;
      this.field10622 = arg2;
      this.field10646 = arg3;
      this.method5314();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "ya",
      descriptor = "()V"
   )
   public final void method380() {
      if (this.field10615 == 0 && this.field10630 == this.field10612 && this.field10644 == 0 && this.field10640 == this.field10639) {
         int var1 = this.field10627.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
            this.field10627[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field10627[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field10612 - this.field10615;
         int var5 = this.field10639 - this.field10644;
         int var6 = this.field10630 - var4;
         int var7 = this.field10644 * this.field10630 + this.field10615;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field10627[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "v",
      descriptor = "()I"
   )
   public final int method329() {
      return 0;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "C",
      descriptor = "()V"
   )
   private final void method5314() {
      this.field10638 = this.field10615 - this.field10642;
      this.field10647 = this.field10612 - this.field10642;
      this.field10636 = this.field10644 - this.field10641;
      this.field10624 = this.field10639 - this.field10641;

      for(int var1 = 0; var1 < this.field10609; ++var1) {
         class390 var5 = this.field10611[var1].field173;
         var5.field5748 = this.field10642 - this.field10615;
         var5.field5756 = this.field10641 - this.field10644;
         var5.field5761 = this.field10612 - this.field10615;
         var5.field5747 = this.field10639 - this.field10644;
      }

      int var2 = this.field10644 * this.field10630 + this.field10615;

      for(int var3 = this.field10644; var3 < this.field10639; ++var3) {
         for(int var4 = 0; var4 < this.field10609; ++var4) {
            this.field10611[var4].field173.field5750[var3 - this.field10644] = var2;
         }

         var2 += this.field10630;
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lvm;)V"
   )
   public final void method256(class713 arg0) {
      class12 var2 = this.method5317(Thread.currentThread());
      class429 var3 = arg0.field10342.field6061;

      for(class429 var4 = var3.field6197; var3 != var4; var4 = var4.field6197) {
         class599 var5 = (class599)var4;
         int var6 = var5.field8645 >> 12;
         int var7 = var5.field8630 >> 12;
         int var8 = var5.field8634 >> 12;
         float var9 = (float)var8 * this.field10617.field11500 + (float)var6 * this.field10617.field11487 + (float)var7 * this.field10617.field11479 + this.field10617.field11492;
         if (!(var9 < (float)this.field10628) && !(var9 > (float)var2.field138)) {
            int var10 = (int)(((float)var8 * this.field10617.field11493 + (float)var6 * this.field10617.field11475 + (float)var7 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / var9) + this.field10642;
            int var11 = (int)(((float)var8 * this.field10617.field11476 + (float)var6 * this.field10617.field11481 + (float)var7 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / var9) + this.field10641;
            if (var10 >= this.field10615 && var10 <= this.field10612 && var11 >= this.field10644 && var11 <= this.field10639) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method5323(var5, var10, var11, (int)var9, (int)((float)(this.field10622 * var5.field8638 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method326(int arg0, int arg1) {
      int var3 = this.field10630 * arg1 + arg0;
      int var4 = this.field10620 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field10634;
         float[] var6 = this.field10627;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class365.method2855(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class365.method2855(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class365.method2857(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class365.method2857(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "l",
      descriptor = "(I)Z"
   )
   public final boolean method5315(int arg0) {
      return this.field10616 || super.field1192.method1456(-8988, arg0).field10153;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method310(Canvas arg0, int arg1, int arg2) {
      class108 var4 = (class108)this.field10602.method1572((long)arg0.hashCode(), -16289);
      if (var4 != null) {
         var4.method154(-121);
         class108 var5 = class36.method448(arg2, arg0, arg1, (byte)-117);
         this.field10602.method1566(var5, 24742, (long)arg0.hashCode());
         if (this.field10608 == arg0 && this.field10613 == null) {
            Dimension var6 = arg0.getSize();
            this.field10604 = var6.width;
            this.field10606 = var6.height;
            this.field10605 = var5;
            this.field10634 = var5.field1778;
            this.field10630 = var5.field1780;
            this.field10640 = var5.field1779;
            if (this.field10630 != this.field10620 || this.field10640 != this.field10618) {
               this.field10637 = this.field10620 = this.field10630;
               this.field10631 = this.field10618 = this.field10640;
               this.field10629 = this.field10627 = new float[this.field10620 * this.field10618];
            }

            this.method5318();
         }
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method421(int arg0) {
      this.method295(0, 0, this.field10630, this.field10640, arg0, 0);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "n",
      descriptor = "(I)Z"
   )
   public final boolean method5316(int arg0) {
      return super.field1192.method1456(-8988, arg0).field10159 || super.field1192.method1456(-8988, arg0).field10171;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIF)Lke;"
   )
   public final class622 method258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Ldaa;"
   )
   public final class12 method5317(Runnable arg0) {
      for(int var2 = 0; var2 < this.field10609; ++var2) {
         if (this.field10611[var2].field131 == arg0) {
            return this.field10611[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "()V"
   )
   public final void method379() {
      if (this.field10608 != null) {
         this.field10634 = this.field10605.field1778;
         this.field10630 = this.field10605.field1780;
         this.field10640 = this.field10605.field1779;
         this.field10627 = this.field10629;
         this.field10620 = this.field10637;
         this.field10618 = this.field10631;
      } else {
         this.field10630 = 1;
         this.field10640 = 1;
         this.field10634 = null;
         this.field10620 = 1;
         this.field10618 = 1;
         this.field10627 = null;
      }

      this.field10613 = null;
      this.method5318();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field10615 && arg0 < this.field10612) {
         if (arg1 < this.field10644) {
            arg2 -= this.field10644 - arg1;
            arg1 = this.field10644;
         }

         if (arg1 + arg2 > this.field10639) {
            arg2 = this.field10639 - arg1;
         }

         int var6 = this.field10630 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10630 * var10 + var6;
                  int var12 = this.field10634[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field10634[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field10630 * var14 + var6;
                  int var16 = this.field10634[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field10634[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field10634[this.field10630 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method269(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method378(int arg0) {
      this.field10619 = arg0;
      this.field10621.method1589((byte)69);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lpa;)V"
   )
   public final void method402(class386 arg0) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method371(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "i",
      descriptor = "()I"
   )
   public final int method291() {
      return this.field10628;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method424(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field10611.length; ++var4) {
         class12 var5 = this.field10611[var4];
         var5.field135 = arg0 & 16777215;
         int var6 = var5.field135 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field135 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field135 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field135 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field137 = false;
         } else {
            var5.field137 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method260(int arg0, class510 arg1, int arg2, int arg3) {
      class348 var5 = (class348)arg1;
      int[] var6 = var5.field4952;
      int[] var7 = var5.field4947;
      int var8;
      if (this.field10639 < var6.length + arg3) {
         var8 = this.field10639 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field10644 > arg3) {
         var9 = this.field10644 - arg3;
         arg3 = this.field10644;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field10630 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field10615 > var12) {
               var13 -= this.field10615 - var12;
               var12 = this.field10615;
            }

            if (this.field10612 < var12 + var13) {
               var13 = this.field10612 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field10634[var14++] = arg0;
            }

            var10 += this.field10630;
         }

      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "y",
      descriptor = "()Ldfa;"
   )
   public final class173 method398() {
      return this.field10617;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method417(Canvas arg0) {
      if (this.field10608 == arg0) {
         this.method315((Canvas)null);
      }

      class108 var2 = (class108)this.field10602.method1572((long)arg0.hashCode(), -16289);
      if (var2 != null) {
         var2.method154(121);
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field10644) {
         var6 = this.field10644;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field10639) {
         var7 = this.field10639;
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
            if (var64 < this.field10615) {
               var64 = this.field10615;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field10612) {
               var65 = this.field10612;
            }

            int var66 = this.field10630 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field10634[var66++] = arg3;
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
            if (var60 < this.field10615) {
               var60 = this.field10615;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field10612 - 1) {
               var61 = this.field10612 - 1;
            }

            int var62 = this.field10630 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field10634[var62++] = arg3;
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
            if (var28 < this.field10615) {
               var28 = this.field10615;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field10612) {
               var29 = this.field10612;
            }

            int var30 = this.field10630 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field10634[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field10634[var30++] = var15 + var33;
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
            if (var22 < this.field10615) {
               var22 = this.field10615;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field10612 - 1) {
               var23 = this.field10612 - 1;
            }

            int var24 = this.field10630 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field10634[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field10634[var24++] = var15 + var27;
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
            if (var47 < this.field10615) {
               var47 = this.field10615;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field10612) {
               var48 = this.field10612;
            }

            int var49 = this.field10630 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field10634[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field10634[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
            if (var39 < this.field10615) {
               var39 = this.field10615;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field10612 - 1) {
               var40 = this.field10612 - 1;
            }

            int var41 = this.field10630 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field10634[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field10634[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method427(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method442(int arg0) {
      class509.field7381 = arg0;
      class509.field7435 = arg0;
      if (this.field10609 > 1) {
         throw new IllegalStateException(field10650[3]);
      } else {
         this.method312(this.field10609);
         this.method391(0);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field10617.field11500 + (float)arg0 * this.field10617.field11487 + (float)arg1 * this.field10617.field11479 + this.field10617.field11492;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field10617.field11500 + (float)arg3 * this.field10617.field11487 + (float)arg4 * this.field10617.field11479 + this.field10617.field11492;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field10628 && var9 < (float)this.field10628) {
         var7 |= 16;
      } else if (var8 > (float)this.field10643 && var9 > (float)this.field10643) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field10617.field11493 + (float)arg0 * this.field10617.field11475 + (float)arg1 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / var8);
      int var11 = (int)(((float)arg5 * this.field10617.field11493 + (float)arg3 * this.field10617.field11475 + (float)arg4 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / var9);
      if (var10 < this.field10638 && var11 < this.field10638) {
         var7 |= 1;
      } else if (var10 > this.field10647 && var11 > this.field10647) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field10617.field11476 + (float)arg0 * this.field10617.field11481 + (float)arg1 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / var8);
      int var13 = (int)(((float)arg5 * this.field10617.field11476 + (float)arg3 * this.field10617.field11481 + (float)arg4 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / var9);
      if (var12 < this.field10636 && var13 < this.field10636) {
         var7 |= 4;
      } else if (var12 > this.field10624 && var13 > this.field10624) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method297(float arg0) {
      this.field10625 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "g",
      descriptor = "()V"
   )
   private final void method5318() {
      for(int var1 = 0; var1 < this.field10609; ++var1) {
         this.field10611[var1].method81(2);
      }

      this.method349();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "n",
      descriptor = "()V"
   )
   public final void method433() {
      this.field10621.method1589((byte)49);
      this.field10645.method1589((byte)49);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "o",
      descriptor = "(I)I"
   )
   public final int method5319(int arg0) {
      return super.field1192.method1456(-8988, arg0).field10155;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method394(boolean arg0) {
      this.field10616 = arg0;
      this.field10621.method1589((byte)103);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "B",
      descriptor = "()Z"
   )
   public final boolean method5320() {
      return this.field10603;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lvm;I)V"
   )
   public final void method406(class713 arg0, int arg1) {
      class12 var3 = this.method5317(Thread.currentThread());
      class429 var4 = arg0.field10342.field6061;

      for(class429 var5 = var4.field6197; var4 != var5; var5 = var5.field6197) {
         class599 var6 = (class599)var5;
         int var7 = var6.field8645 >> 12;
         int var8 = var6.field8630 >> 12;
         int var9 = var6.field8634 >> 12;
         float var10 = (float)var9 * this.field10617.field11500 + (float)var7 * this.field10617.field11487 + (float)var8 * this.field10617.field11479 + this.field10617.field11492;
         if (!(var10 < (float)this.field10628) && !(var10 > (float)var3.field138)) {
            int var11 = (int)(((float)var9 * this.field10617.field11493 + (float)var7 * this.field10617.field11475 + (float)var8 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / (float)arg1) + this.field10642;
            int var12 = (int)(((float)var9 * this.field10617.field11476 + (float)var7 * this.field10617.field11481 + (float)var8 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / (float)arg1) + this.field10641;
            if (var11 >= this.field10615 && var11 <= this.field10612 && var12 >= this.field10644 && var12 <= this.field10639) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method5323(var6, var11, var12, (int)var10, (this.field10622 * var6.field8638 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method339(int arg0) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method254(int[] arg0) {
      arg0[0] = this.field10615;
      arg0[1] = this.field10644;
      arg0[2] = this.field10612;
      arg0[3] = this.field10639;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method5321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field1192.method1456(-8988, arg6).field10175) {
            if (this.field10649 != arg6) {
               class476 var11 = (class476)this.field10645.method1584((long)arg6, 1);
               if (var11 == null) {
                  int[] var12 = this.method5327(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method5315(arg6) ? 64 : this.field10619;
                  var11 = this.method696(var13, var13, 0, -121, var13, var12);
                  this.field10645.method1581((long)arg6, 0, var11);
               }

               this.field10649 = arg6;
               this.field10648 = var11;
            }

            ((class387)this.field10648).method1054(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method5325(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I[Lke;)V"
   )
   public final void method364(int arg0, class622[] arg1) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field10644 && arg1 < this.field10639) {
         if (arg0 < this.field10615) {
            arg2 -= this.field10615 - arg0;
            arg0 = this.field10615;
         }

         if (arg0 + arg2 > this.field10612) {
            arg2 = this.field10612 - arg0;
         }

         int var6 = this.field10630 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10634[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field10634[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field10634[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field10634[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field10634[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "la",
      descriptor = "()V"
   )
   public final void method349() {
      this.field10615 = 0;
      this.field10644 = 0;
      this.field10612 = this.field10630;
      this.field10639 = this.field10640;
      this.method5314();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "M",
      descriptor = "()I"
   )
   public final int method318() {
      int var1 = this.field10626;
      this.field10626 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ltn;Z)Ltd;"
   )
   public final class476 method307(class94 arg0, boolean arg1) {
      int[] var3 = arg0.field1521;
      byte[] var4 = arg0.field1519;
      int var5 = arg0.field1523;
      int var6 = arg0.field1520;
      class387 var11;
      if (arg1 && arg0.field1527 == null) {
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

         var11 = new class111(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field1527;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class156(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class467(this, var14, var5, var6);
         }
      }

      var11.method3006(arg0.field1522, arg0.field1525, arg0.field1526, arg0.field1524);
      return var11;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method396(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class676(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method5322(int arg0) {
      return super.field1192.method1455(arg0, 9777);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method286(class432 arg0) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public final void method338(class173 arg0) {
      this.field10617 = (class784)arg0;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method410() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method296(int arg0, int arg1) {
      class12 var3 = this.method5317(Thread.currentThread());
      this.field10628 = arg0;
      this.field10643 = arg1;
      var3.field138 = this.field10643 - 255;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method348() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "o",
      descriptor = "()Ldfa;"
   )
   public final class173 method432() {
      return new class784();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method274() {
      return true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method351() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(II)Leg;"
   )
   public final class117 method358(int arg0, int arg1) {
      return new class712(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(II)Lrj;"
   )
   public final class619 method263(int arg0, int arg1) {
      return this.method265(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method408(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field10611.length; ++var5) {
         this.field10611[var5].field126 = this.field10611[var5].field135;
         this.field10611[var5].field140 = arg0;
         this.field10611[var5].field135 = arg1;
         this.field10611[var5].field132 = arg2;
         this.field10611[var5].field130 = true;
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(I)Lza;"
   )
   public final class432 method300(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method309(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10615 < arg0) {
         this.field10615 = arg0;
      }

      if (this.field10644 < arg1) {
         this.field10644 = arg1;
      }

      if (this.field10612 > arg2) {
         this.field10612 = arg2;
      }

      if (this.field10639 > arg3) {
         this.field10639 = arg3;
      }

      this.method5314();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lfia;IIII)V"
   )
   private final void method5323(class599 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field8644;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method5325(arg1, arg2, arg3, arg4, arg0.field8641, 1);
      } else {
         if (this.field10649 != var6) {
            class476 var9 = (class476)this.field10645.method1584((long)var6, 1);
            if (var9 == null) {
               int[] var10 = this.method5327(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method5315(var6) ? 64 : this.field10619;
               var9 = this.method696(var11, var11, 0, -127, var11, var10);
               this.field10645.method1581((long)var6, 0, var9);
            }

            this.field10649 = var6;
            this.field10648 = var9;
         }

         ++var8;
         ((class387)this.field10648).method1054(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field8641, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method367(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field10617.field11500 + (float)arg0 * this.field10617.field11487 + (float)arg1 * this.field10617.field11479 + this.field10617.field11492;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field10617.field11493 + (float)arg0 * this.field10617.field11475 + (float)arg1 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / var5);
         int var7 = (int)(((float)arg2 * this.field10617.field11476 + (float)arg0 * this.field10617.field11481 + (float)arg1 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / var5);
         arg3[0] = var6 - this.field10638;
         arg3[1] = var7 - this.field10636;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method312(int arg0) {
      this.field10609 = arg0;
      this.field10611 = new class12[this.field10609];

      for(int var2 = 0; var2 < this.field10609; ++var2) {
         this.field10611[var2] = new class12(this);
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field10615) {
         arg2 -= this.field10615 - arg0;
         arg0 = this.field10615;
      }

      if (arg1 < this.field10644) {
         arg3 -= this.field10644 - arg1;
         arg1 = this.field10644;
      }

      if (arg0 + arg2 > this.field10612) {
         arg2 = this.field10612 - arg0;
      }

      if (arg1 + arg3 > this.field10639) {
         arg3 = this.field10639 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field10612 && arg1 <= this.field10639) {
         int var7 = this.field10630 - arg2;
         int var8 = this.field10630 * arg1 + arg0;
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
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     ++var24;
                     this.field10634[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field10634[var24] = arg4;
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
                  int var14 = this.field10634[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field10634[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field10634[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field10634[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method325(int arg0, int arg1, int arg2, int arg3) {
      class12 var5 = this.method5317(Thread.currentThread());
      var5.field140 = arg0;
      var5.field135 = arg1;
      var5.field132 = arg2;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method407(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field10630 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field10634[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method336(Canvas arg0, int arg1, int arg2) {
      class108 var4 = (class108)this.field10602.method1572((long)arg0.hashCode(), -16289);
      if (var4 == null) {
         class108 var5 = class36.method448(arg2, arg0, arg1, (byte)-117);
         this.field10602.method1566(var5, 24742, (long)arg0.hashCode());
      } else {
         if (var4.field1780 != arg1 || var4.field1779 != arg2) {
            this.method310(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIII)Lpa;"
   )
   public final class386 method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5324(int arg0) {
      return super.field1192.method1456(-8988, arg0).field10162 & 65535;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method308() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method386() {
      return true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "q",
      descriptor = "()V"
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class739(Canvas arg0, class160 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method336(arg0, arg2, arg3);
         this.method315(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method697(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "XA",
      descriptor = "()I"
   )
   public final int method437() {
      return this.field10643;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method317(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class12 var14 = this.method5317(Thread.currentThread());
      class390 var15 = var14.field173;
      var15.field5755 = false;
      int var16 = arg0 - this.field10638;
      int var17 = arg3 - this.field10638;
      int var18 = arg6 - this.field10638;
      int var19 = arg1 - this.field10636;
      int var20 = arg4 - this.field10636;
      int var21 = arg7 - this.field10636;
      var15.field5757 = var16 < 0 || var16 > var15.field5761 || var17 < 0 || var17 > var15.field5761 || var18 < 0 || var18 > var15.field5761;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field5760 = 255 - var22;
            var15.field5753 = false;
            var15.method3040((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field5760 = 128;
            var15.field5753 = true;
            var15.method3040((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field5760 = 0;
         var15.field5753 = false;
         var15.method3040((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field5755 = true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lika;[Ltn;Z)Lda;"
   )
   public final class66 method414(class445 arg0, class94[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field1523;
         var5[var7] = arg1[var7].field1520;
         if (arg1[var7].field1527 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class539(this, arg0, arg1, var4, var5);
         } else {
            return new class337(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class472(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   private final void method5325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field10644) {
         var7 = this.field10644;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field10639) {
         var8 = this.field10639;
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
            if (var65 < this.field10615) {
               var65 = this.field10615;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field10612) {
               var66 = this.field10612;
            }

            int var67 = this.field10630 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field10627[var67]) {
                  this.field10634[var67] = arg4;
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
            if (var61 < this.field10615) {
               var61 = this.field10615;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field10612 - 1) {
               var62 = this.field10612 - 1;
            }

            int var63 = this.field10630 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field10627[var63]) {
                  this.field10634[var63] = arg4;
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
            if (var29 < this.field10615) {
               var29 = this.field10615;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field10612) {
               var30 = this.field10612;
            }

            int var31 = this.field10630 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field10627[var31]) {
                  int var33 = this.field10634[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field10634[var31] = var16 + var34;
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
            if (var23 < this.field10615) {
               var23 = this.field10615;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field10612 - 1) {
               var24 = this.field10612 - 1;
            }

            int var25 = this.field10630 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field10627[var25]) {
                  int var27 = this.field10634[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field10634[var25] = var16 + var28;
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
            if (var48 < this.field10615) {
               var48 = this.field10615;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field10612) {
               var49 = this.field10612;
            }

            int var50 = this.field10630 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field10627[var50]) {
                  int var52 = this.field10634[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field10634[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
            if (var40 < this.field10615) {
               var40 = this.field10615;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field10612 - 1) {
               var41 = this.field10612 - 1;
            }

            int var42 = this.field10630 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field10627[var42]) {
                  int var44 = this.field10634[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field10634[var42] = var45 - var47 | var47 - (var47 >>> 8);
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
      owner = "client!lga",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method361(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method361(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method299(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method299(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
            if (arg0 < this.field10615) {
               var10 += (this.field10615 - arg0) * var12;
               arg0 = this.field10615;
            }

            if (var13 >= this.field10612) {
               var13 = this.field10612 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field10644 && var17 < this.field10639) {
                        int var18 = this.field10630 * var17 + arg0;
                        int var19 = this.field10634[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field10634[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field10644 && var21 < this.field10639) {
                        int var22 = this.field10630 * var21 + arg0;
                        int var23 = this.field10634[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field10634[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                  if (var27 >= this.field10644 && var27 < this.field10639) {
                     this.field10634[this.field10630 * var27 + arg0] = arg4;
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
            if (arg1 < this.field10644) {
               var29 += (this.field10644 - arg1) * var31;
               arg1 = this.field10644;
            }

            if (var32 >= this.field10639) {
               var32 = this.field10639 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field10615 && var46 < this.field10612) {
                     this.field10634[this.field10630 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field10615 && var36 < this.field10612) {
                     int var37 = this.field10630 * arg1 + var36;
                     int var38 = this.field10634[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field10634[this.field10630 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field10615 && var40 < this.field10612) {
                     int var41 = this.field10630 * arg1 + var40;
                     int var42 = this.field10634[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field10634[var41] = var43 - var45 | var45 - (var45 >>> 8);
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
      owner = "client!lga",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method411() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "([IIIIIZ)Ltd;"
   )
   public final class476 method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class156(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class467(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class156(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class467(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method315(Canvas arg0) {
      if (arg0 != null) {
         class108 var2 = (class108)this.field10602.method1572((long)arg0.hashCode(), -16289);
         if (var2 != null) {
            this.field10608 = arg0;
            Dimension var3 = arg0.getSize();
            this.field10604 = var3.width;
            this.field10606 = var3.height;
            this.field10605 = var2;
            if (this.field10613 == null) {
               this.field10634 = var2.field1778;
               this.field10630 = var2.field1780;
               this.field10640 = var2.field1779;
               if (this.field10630 != this.field10620 || this.field10640 != this.field10618) {
                  this.field10637 = this.field10620 = this.field10630;
                  this.field10631 = this.field10618 = this.field10640;
                  this.field10629 = this.field10627 = new float[this.field10620 * this.field10618];
               }

               this.method5318();
               return;
            }
         }
      } else {
         this.field10608 = null;
         this.field10605 = null;
         if (this.field10613 == null) {
            this.field10634 = null;
            this.field10630 = this.field10640 = 1;
            this.field10620 = this.field10618 = 1;
            this.method5318();
         }
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method327() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method267() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "E",
      descriptor = "()I"
   )
   public final int method287() {
      return 0;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method316(boolean arg0) {
      class12 var2 = this.method5317(Thread.currentThread());
      var2.field125 = arg0;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method392() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class739(class160 arg0) {
      super(arg0);
      this.field10603 = false;
      this.field10607 = false;
      this.field10602 = new class178(4);
      this.field10615 = 0;
      this.field10623 = 78642;
      this.field10626 = 0;
      this.field10619 = 128;
      this.field10622 = 512;
      this.field10612 = 0;
      this.field10625 = 75518;
      this.field10616 = false;
      this.field10628 = 50;
      this.field10614 = 0;
      this.field10643 = 3500;
      this.field10633 = 45823;
      this.field10639 = 0;
      this.field10644 = 0;
      this.field10646 = 512;
      this.field10645 = new class179(16);
      this.field10649 = -1;

      try {
         this.field10621 = new class179(256);
         this.field10617 = new class784();
         this.method312(1);
         this.method391(0);
         class294.method2297(true, true, -18330);
         this.field10607 = true;
         this.field10601 = (int)class57.method650(95);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method697(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method5326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field10644 && arg1 < this.field10639) {
         int var9 = this.field10630 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field10615 && arg0 + var15 < this.field10612 && var12 < arg5) {
                     int var16 = this.field10634[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field10634[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field10615 && arg0 + var18 < this.field10612 && var12 < arg5) {
                     int var19 = this.field10634[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field10634[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
               if (arg0 + var23 >= this.field10615 && arg0 + var23 < this.field10612 && var12 < arg5) {
                  this.field10634[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method333(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field10630) {
         arg2 = this.field10630;
      }

      if (arg3 > this.field10640) {
         arg3 = this.field10640;
      }

      this.field10615 = arg0;
      this.field10612 = arg2;
      this.field10644 = arg1;
      this.field10639 = arg3;
      this.method5314();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field10620 - arg2;
      int var8 = this.field10620 * arg1 + arg0;
      float[] var9 = this.field10627;
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
      owner = "client!lga",
      name = "pa",
      descriptor = "()V"
   )
   public final void method374() {
      for(int var1 = 0; var1 < this.field10611.length; ++var1) {
         this.field10611[var1].field135 = this.field10611[var1].field126;
         this.field10611[var1].field130 = false;
      }

   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328 {
      if (this.field10608 != null && this.field10605 != null) {
         try {
            Graphics var5 = this.field10608.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field10630 && var7.y + arg3 <= this.field10640 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field10605.method1039(var5, -24176, var7.height, var7.y, var7.y + arg3, var7.width, var7.x, var7.x + arg2);
               }
            }

         } catch (Exception var8) {
            this.field10608.repaint();
         }
      } else {
         throw new IllegalStateException(field10650[0]);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;"
   )
   public final class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method264(int[] arg0) {
      arg0[0] = this.field10630;
      arg0[1] = this.field10640;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class12 var8 = this.method5317(Thread.currentThread());
      class390 var9 = var8.field173;
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
         int var23 = arg0 - var9.method3025();
         int var24 = arg1 - var9.method3041();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field5760 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field5760 = 255 - (arg4 >>> 24);
         }

         this.method316(false);
         var9.field5757 = var25 < 0 || var25 > var9.field5761 || var26 < 0 || var26 > var9.field5761 || var27 < 0 || var27 > var9.field5761;
         var9.method3037((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field5757 = var25 < 0 || var25 > var9.field5761 || var27 < 0 || var27 > var9.field5761 || var28 < 0 || var28 > var9.field5761;
         var9.method3037((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method316(true);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method354(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method389(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field10617.field11500 + (float)arg0 * this.field10617.field11487 + (float)arg1 * this.field10617.field11479 + this.field10617.field11492;
      if (!(var5 < (float)this.field10628) && !(var5 > (float)this.field10643)) {
         int var6 = (int)(((float)arg2 * this.field10617.field11493 + (float)arg0 * this.field10617.field11475 + (float)arg1 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / var5);
         int var7 = (int)(((float)arg2 * this.field10617.field11476 + (float)arg0 * this.field10617.field11481 + (float)arg1 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / var5);
         if (var6 >= this.field10638 && var6 <= this.field10647 && var7 >= this.field10636 && var7 <= this.field10624) {
            arg3[0] = var6 - this.field10638;
            arg3[1] = var7 - this.field10636;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "p",
      descriptor = "(I)[I"
   )
   public final int[] method5327(int arg0) {
      class179 var2 = this.field10621;
      class369 var3;
      synchronized(this.field10621) {
         var3 = (class369)this.field10621.method1584((long)arg0 | Long.MIN_VALUE, 1);
         if (var3 == null) {
            if (!super.field1192.method1455(arg0, 9777)) {
               return null;
            }

            class693 var5 = super.field1192.method1456(-8988, arg0);
            int var6 = !var5.field10153 && !this.field10616 ? this.field10619 : 64;
            var3 = new class369(arg0, var6, super.field1192.method1460(0.7F, var6, arg0, true, 5517, var6), var5.field10155 != 1);
            this.field10621.method1581((long)arg0 | Long.MIN_VALUE, 0, var3);
         }
      }

      var3.field5473 = true;
      return var3.method2876();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIZ)Ltd;"
   )
   public final class476 method342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field10630 * arg1 + arg0;
      int var8 = this.field10630 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field10634[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class156(this, var6, arg2, arg3);
      } else {
         return new class467(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method337(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field10633 = (int)(arg1 * 65535.0F);
      this.field10623 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field10610 = (int)(arg3 * 65535.0F / var7);
      this.field10632 = (int)(arg4 * 65535.0F / var7);
      this.field10635 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lsfa;)V"
   )
   public final void method253(class723 arg0) {
      class609 var2 = (class609)arg0;
      this.field10630 = var2.field8735;
      this.field10640 = var2.field8741;
      this.field10634 = var2.field8740;
      this.field10613 = var2;
      this.field10620 = var2.field8735;
      this.field10618 = var2.field8741;
      this.field10627 = var2.field8738;
      this.method5318();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lph;IIII)Lka;"
   )
   public final class495 method352(class668 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class509(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method393(int arg0, int arg1) throws class328 {
      if (this.field10608 != null && this.field10605 != null) {
         try {
            Graphics var3 = this.field10608.getGraphics();
            this.field10605.method1039(var3, -24176, this.field10606, 0, arg1, this.field10604, 0, arg0);
         } catch (Exception var4) {
            this.field10608.repaint();
         }
      } else {
         throw new IllegalStateException(field10650[0]);
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method5326(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method5326(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method5329(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method5329(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                     if (arg0 >= this.field10615 && arg0 < this.field10612 && var37 >= this.field10644 && var37 < this.field10639 && var24 < var21) {
                        int var38 = this.field10630 * var37 + arg0;
                        int var39 = this.field10634[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field10634[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field10615 && arg0 < this.field10612 && var42 >= this.field10644 && var42 < this.field10639 && var24 < var21) {
                        int var43 = this.field10630 * var42 + arg0;
                        int var44 = this.field10634[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field10634[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                  if (arg0 >= this.field10615 && arg0 < this.field10612 && var49 >= this.field10644 && var49 < this.field10639 && var24 < var21) {
                     this.field10634[this.field10630 * var49 + arg0] = arg4;
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
                     if (arg1 >= this.field10644 && arg1 < this.field10639 && var60 >= this.field10615 && var60 < this.field10612 && var24 < var21) {
                        int var61 = this.field10630 * arg1 + var60;
                        int var62 = this.field10634[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field10634[this.field10630 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field10644 && arg1 < this.field10639 && var65 >= this.field10615 && var65 < this.field10612 && var24 < var21) {
                        int var66 = this.field10630 * arg1 + var65;
                        int var67 = this.field10634[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field10634[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                  if (arg1 >= this.field10644 && arg1 < this.field10639 && var72 >= this.field10615 && var72 < this.field10612 && var24 < var21) {
                     this.field10634[this.field10630 * arg1 + var72] = arg4;
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
      owner = "client!lga",
      name = "e",
      descriptor = "()V"
   )
   public final void method375() {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method323(int arg0) {
      this.field10611[arg0].method79(-123, (Runnable)null);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "m",
      descriptor = "(I)[I"
   )
   public final int[] method5328(int arg0) {
      class179 var2 = this.field10621;
      class369 var3;
      synchronized(this.field10621) {
         var3 = (class369)this.field10621.method1584((long)arg0, 1);
         if (var3 == null) {
            if (!super.field1192.method1455(arg0, 9777)) {
               return null;
            }

            class693 var5 = super.field1192.method1456(-8988, arg0);
            int var6 = !var5.field10153 && !this.field10616 ? this.field10619 : 64;
            var3 = new class369(arg0, var6, super.field1192.method1459(0.7F, true, var6, arg0, 126, var6), var5.field10155 != 1);
            this.field10621.method1581((long)arg0, 0, var3);
         }
      }

      var3.field5473 = true;
      return var3.method2876();
   }

   @OriginalMember(
      owner = "client!lga",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method280(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field10617.field11500 + (float)arg0 * this.field10617.field11487 + (float)arg1 * this.field10617.field11479 + this.field10617.field11492;
      if (!(var6 < (float)this.field10628) && !(var6 > (float)this.field10643)) {
         int var7 = (int)(((float)arg2 * this.field10617.field11493 + (float)arg0 * this.field10617.field11475 + (float)arg1 * this.field10617.field11499 + this.field10617.field11485) * (float)this.field10622 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field10617.field11476 + (float)arg0 * this.field10617.field11481 + (float)arg1 * this.field10617.field11473 + this.field10617.field11495) * (float)this.field10646 / (float)arg3);
         if (var7 >= this.field10638 && var7 <= this.field10647 && var8 >= this.field10636 && var8 <= this.field10624) {
            arg4[0] = var7 - this.field10638;
            arg4[1] = var8 - this.field10636;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIZ)Ltd;"
   )
   public final class476 method265(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class156(this, arg0, arg1) : new class467(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field10630 * arg1 + arg0;
         int var15 = this.field10630 - arg2;
         if (arg1 + arg3 > this.field10639) {
            arg3 -= arg1 + arg3 - this.field10639;
         }

         if (arg1 < this.field10644) {
            int var16 = this.field10644 - arg1;
            arg3 -= var16;
            var14 += this.field10630 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field10612) {
            int var17 = arg0 + arg2 - this.field10612;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field10615) {
            int var18 = this.field10615 - arg0;
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
                     int var28 = this.field10634[var14];
                     this.field10634[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                        int var34 = this.field10634[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field10634[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                     this.field10634[var14++] = arg5;
                  } else {
                     this.field10634[var14++] = arg4;
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
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
      class348 var10 = (class348)arg6;
      int[] var11 = var10.field4952;
      int[] var12 = var10.field4947;
      int var13 = this.field10644 > arg8 ? this.field10644 : arg8;
      int var14 = this.field10639 < var11.length + arg8 ? this.field10639 : var11.length + arg8;
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
         if (arg0 < this.field10615) {
            var18 += (this.field10615 - arg0) * var20;
            arg0 = this.field10615;
         }

         if (var21 >= this.field10612) {
            var21 = this.field10612 - 1;
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
                        int var28 = this.field10630 * var25 + arg0;
                        int var29 = this.field10634[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field10634[var28] = var23 + var30;
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
                        int var34 = this.field10630 * var31 + arg0;
                        int var35 = this.field10634[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field10634[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                     this.field10634[this.field10630 * var39 + arg0] = arg4;
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
               if (var64 >= this.field10615 && var64 < this.field10612 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field10634[this.field10630 * arg1 + var64] = arg4;
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
               if (var50 >= this.field10615 && var50 < this.field10612 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field10630 * arg1 + var50;
                  int var54 = this.field10634[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field10634[this.field10630 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field10615 && var56 < this.field10612 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field10630 * arg1 + var56;
                  int var60 = this.field10634[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field10634[var59] = var61 - var63 | var63 - (var63 >>> 8);
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
      owner = "client!lga",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method328() {
      return true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "p",
      descriptor = "()V"
   )
   public final void method272() {
      if (this.field10607) {
         class741.method5347(true, 63, false);
         this.field10607 = false;
      }

      this.field10605 = null;
      this.field10608 = null;
      this.field10604 = 0;
      this.field10606 = 0;
      this.field10602 = null;
      this.field10603 = true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method404() {
      return true;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "m",
      descriptor = "()Lvfa;"
   )
   public final class698 method273() {
      return new class698(0, field10650[1], 1, field10650[2], 0L);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;"
   )
   public final class723 method301(class619 arg0, class117 arg1) {
      return new class609(this, (class476)arg0, (class712)arg1);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "h",
      descriptor = "()Ldfa;"
   )
   public final class173 method255() {
      class12 var1 = this.method5317(Thread.currentThread());
      return var1.field127;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method278() {
      return new int[]{this.field10642, this.field10641, this.field10622, this.field10646};
   }

   @OriginalMember(
      owner = "client!lga",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method444(int arg0) {
      int var2 = arg0 - this.field10601;

      for(Object var3 = this.field10621.method1586(0); var3 != null; var3 = this.field10621.method1582(-27831)) {
         class369 var4 = (class369)var3;
         if (var4.field5473) {
            var4.field5472 += var2;
            int var5 = var4.field5472 / 20;
            if (var5 > 0) {
               class693 var6 = super.field1192.method1456(-8988, var4.field5469);
               var4.method2875(var6.field10152 * var2 * 50 / 1000, var6.field10173 * var2 * 50 / 1000);
               var4.field5472 -= var5 * 20;
            }

            var4.field5473 = false;
         }
      }

      this.field10601 = arg0;
      this.field10645.method1579(-83, 5);
      this.field10621.method1579(119, 5);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class348 var13 = (class348)arg6;
      int[] var14 = var13.field4952;
      int[] var15 = var13.field4947;
      int var16 = this.field10644 > arg8 ? this.field10644 : arg8;
      int var17 = this.field10639 < var14.length + arg8 ? this.field10639 : var14.length + arg8;
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
                  if (arg0 >= this.field10615 && arg0 < this.field10612 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field10630 * var37 + arg0;
                        int var41 = this.field10634[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field10634[var40] = var35 + var42;
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
                  if (arg0 >= this.field10615 && arg0 < this.field10612 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field10630 * var44 + arg0;
                        int var48 = this.field10634[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field10634[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
               if (arg0 >= this.field10615 && arg0 < this.field10612 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field10634[this.field10630 * var53 + arg0] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field10615 && var80 < this.field10612 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field10634[this.field10630 * arg1 + var80] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field10615 && var66 < this.field10612 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field10630 * arg1 + var66;
                  int var69 = this.field10634[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field10634[this.field10630 * arg1 + var66] = var64 + var70;
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
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field10615 && var72 < this.field10612 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field10630 * arg1 + var72;
                  int var75 = this.field10634[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field10634[var74] = var76 - var78 | var78 - (var78 >>> 8);
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
      owner = "client!lga",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method361(arg0, arg1, arg2, arg4, arg5);
      this.method361(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method299(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method299(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method391(int arg0) {
      this.field10611[arg0].method79(-23, Thread.currentThread());
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method416() {
      return false;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "()V"
   )
   public final void method268() {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "t",
      descriptor = "()V"
   )
   public final void method321() {
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method5329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field10615 && arg0 < this.field10612) {
         int var9 = this.field10630 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field10644 && arg1 + var15 < this.field10639 && var12 < arg5) {
                     int var16 = this.field10630 * var15 + var9;
                     int var17 = this.field10634[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field10634[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field10644 && arg1 + var19 < this.field10639 && var12 < arg5) {
                     int var20 = this.field10630 * var19 + var9;
                     int var21 = this.field10634[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field10634[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
               if (arg1 + var25 >= this.field10644 && arg1 + var25 < this.field10639 && var12 < arg5) {
                  this.field10634[this.field10630 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
