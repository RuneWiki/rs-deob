import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class587 extends class65 {
   @OriginalMember(
      owner = "client!nda",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field8057;
   @OriginalMember(
      owner = "client!nda",
      name = "s",
      descriptor = "Z"
   )
   private boolean field8056;
   @OriginalMember(
      owner = "client!nda",
      name = "P",
      descriptor = "Ldia;"
   )
   private class245 field8059;
   @OriginalMember(
      owner = "client!nda",
      name = "db",
      descriptor = "I"
   )
   public int field8064;
   @OriginalMember(
      owner = "client!nda",
      name = "jb",
      descriptor = "I"
   )
   public int field8083;
   @OriginalMember(
      owner = "client!nda",
      name = "u",
      descriptor = "I"
   )
   private int field8063;
   @OriginalMember(
      owner = "client!nda",
      name = "ab",
      descriptor = "I"
   )
   public int field8075;
   @OriginalMember(
      owner = "client!nda",
      name = "R",
      descriptor = "I"
   )
   private int field8087;
   @OriginalMember(
      owner = "client!nda",
      name = "U",
      descriptor = "I"
   )
   public int field8062;
   @OriginalMember(
      owner = "client!nda",
      name = "M",
      descriptor = "I"
   )
   public int field8090;
   @OriginalMember(
      owner = "client!nda",
      name = "w",
      descriptor = "I"
   )
   public int field8067;
   @OriginalMember(
      owner = "client!nda",
      name = "W",
      descriptor = "I"
   )
   public int field8097;
   @OriginalMember(
      owner = "client!nda",
      name = "J",
      descriptor = "I"
   )
   public int field8081;
   @OriginalMember(
      owner = "client!nda",
      name = "I",
      descriptor = "I"
   )
   public int field8065;
   @OriginalMember(
      owner = "client!nda",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field8092;
   @OriginalMember(
      owner = "client!nda",
      name = "cb",
      descriptor = "I"
   )
   public int field8073;
   @OriginalMember(
      owner = "client!nda",
      name = "eb",
      descriptor = "I"
   )
   public int field8098;
   @OriginalMember(
      owner = "client!nda",
      name = "D",
      descriptor = "I"
   )
   public int field8099;
   @OriginalMember(
      owner = "client!nda",
      name = "x",
      descriptor = "Ltv;"
   )
   private class590 field8070;
   @OriginalMember(
      owner = "client!nda",
      name = "O",
      descriptor = "I"
   )
   private int field8100;
   @OriginalMember(
      owner = "client!nda",
      name = "t",
      descriptor = "Ltv;"
   )
   private class590 field8082;
   @OriginalMember(
      owner = "client!nda",
      name = "mb",
      descriptor = "Lgm;"
   )
   public class133 field8069;
   @OriginalMember(
      owner = "client!nda",
      name = "ob",
      descriptor = "I"
   )
   private int field8053;
   @OriginalMember(
      owner = "client!nda",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8102 = new String[]{method4222(method4221("\u0018g\u001dR\u001f\u0002s\u0019V")), method4222(method4221("\u000bB:")), method4222(method4221("'t\t")), method4222(method4221("\u0006}Ozk"))};
   @OriginalMember(
      owner = "client!nda",
      name = "pb",
      descriptor = "I"
   )
   private int field8055;
   @OriginalMember(
      owner = "client!nda",
      name = "lb",
      descriptor = "I"
   )
   private int field8060;
   @OriginalMember(
      owner = "client!nda",
      name = "kb",
      descriptor = "I"
   )
   private int field8066;
   @OriginalMember(
      owner = "client!nda",
      name = "Q",
      descriptor = "I"
   )
   public int field8071;
   @OriginalMember(
      owner = "client!nda",
      name = "Y",
      descriptor = "I"
   )
   private int field8072;
   @OriginalMember(
      owner = "client!nda",
      name = "N",
      descriptor = "I"
   )
   public int field8074;
   @OriginalMember(
      owner = "client!nda",
      name = "H",
      descriptor = "I"
   )
   public int field8077;
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "I"
   )
   public int field8079;
   @OriginalMember(
      owner = "client!nda",
      name = "gb",
      descriptor = "I"
   )
   private int field8080;
   @OriginalMember(
      owner = "client!nda",
      name = "X",
      descriptor = "I"
   )
   public int field8084;
   @OriginalMember(
      owner = "client!nda",
      name = "bb",
      descriptor = "I"
   )
   public int field8085;
   @OriginalMember(
      owner = "client!nda",
      name = "G",
      descriptor = "I"
   )
   public int field8086;
   @OriginalMember(
      owner = "client!nda",
      name = "V",
      descriptor = "I"
   )
   public int field8089;
   @OriginalMember(
      owner = "client!nda",
      name = "S",
      descriptor = "I"
   )
   public int field8091;
   @OriginalMember(
      owner = "client!nda",
      name = "E",
      descriptor = "I"
   )
   private int field8093;
   @OriginalMember(
      owner = "client!nda",
      name = "r",
      descriptor = "I"
   )
   public int field8094;
   @OriginalMember(
      owner = "client!nda",
      name = "v",
      descriptor = "I"
   )
   private int field8095;
   @OriginalMember(
      owner = "client!nda",
      name = "L",
      descriptor = "I"
   )
   public int field8096;
   @OriginalMember(
      owner = "client!nda",
      name = "ib",
      descriptor = "Let;"
   )
   public class624 field8058;
   @OriginalMember(
      owner = "client!nda",
      name = "A",
      descriptor = "Lsea;"
   )
   private class728 field8076;
   @OriginalMember(
      owner = "client!nda",
      name = "y",
      descriptor = "Lbo;"
   )
   private class763 field8101;
   @OriginalMember(
      owner = "client!nda",
      name = "Z",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field8054;
   @OriginalMember(
      owner = "client!nda",
      name = "B",
      descriptor = "[F"
   )
   public float[] field8061;
   @OriginalMember(
      owner = "client!nda",
      name = "nb",
      descriptor = "[F"
   )
   public float[] field8088;
   @OriginalMember(
      owner = "client!nda",
      name = "T",
      descriptor = "[I"
   )
   public int[] field8068;
   @OriginalMember(
      owner = "client!nda",
      name = "K",
      descriptor = "[Ljca;"
   )
   private class715[] field8078;

   @OriginalMember(
      owner = "client!nda",
      name = "XA",
      descriptor = "()I"
   )
   public final int method578() {
      return this.field8098;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "j",
      descriptor = "(I)[I"
   )
   public final int[] method4204(int arg0) {
      class590 var2 = this.field8082;
      class57 var3;
      synchronized(this.field8082) {
         var3 = (class57)this.field8082.method4239((long)arg0, 0);
         if (var3 == null) {
            if (!super.field726.method1289((byte)-47, arg0)) {
               return null;
            }

            class359 var5 = super.field726.method1293(arg0, -5150);
            int var6 = !var5.field5116 && !this.field8092 ? this.field8075 : 64;
            var3 = new class57(arg0, var6, super.field726.method1292(var6, true, (byte)124, 0.7F, var6, arg0), var5.field5113 != 1);
            this.field8082.method4238(43, var3, (long)arg0);
         }
      }

      var3.field617 = true;
      return var3.method437();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method580(int arg0) {
      this.field8078[arg0].method5201(Thread.currentThread(), (byte)-120);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method539(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field8091 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field8068[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "u",
      descriptor = "()V"
   )
   public final void method519() {
      this.field8082.method4245(true);
      this.field8070.method4245(true);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lmp;Ldw;)Lg;"
   )
   public final class165 method495(class796 arg0, class751 arg1) {
      return new class728(this, (class763)arg0, (class654)arg1);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIF)Loda;"
   )
   public final class127 method591(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method4205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field8073 && arg1 < this.field8062) {
         int var9 = this.field8091 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field8099 && arg0 + var15 < this.field8083 && var12 < arg5) {
                     int var16 = this.field8068[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field8068[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field8099 && arg0 + var18 < this.field8083 && var12 < arg5) {
                     int var19 = this.field8068[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field8068[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
               if (arg0 + var23 >= this.field8099 && arg0 + var23 < this.field8083 && var12 < arg5) {
                  this.field8068[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "n",
      descriptor = "(I)Z"
   )
   public final boolean method4206(int arg0) {
      return super.field726.method1293(arg0, -5150).field5107 || super.field726.method1293(arg0, -5150).field5108;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method557(float arg0) {
      this.field8067 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field8080 - arg2;
      int var8 = this.field8080 * arg1 + arg0;
      float[] var9 = this.field8061;
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
      owner = "client!nda",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field8073 && arg1 < this.field8062) {
         if (arg0 < this.field8099) {
            arg2 -= this.field8099 - arg0;
            arg0 = this.field8099;
         }

         if (arg0 + arg2 > this.field8083) {
            arg2 = this.field8083 - arg0;
         }

         int var6 = this.field8091 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field8068[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field8068[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field8068[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field8068[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field8068[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field8099) {
         arg2 -= this.field8099 - arg0;
         arg0 = this.field8099;
      }

      if (arg1 < this.field8073) {
         arg3 -= this.field8073 - arg1;
         arg1 = this.field8073;
      }

      if (arg0 + arg2 > this.field8083) {
         arg2 = this.field8083 - arg0;
      }

      if (arg1 + arg3 > this.field8062) {
         arg3 = this.field8062 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field8083 && arg1 <= this.field8062) {
         int var7 = this.field8091 - arg2;
         int var8 = this.field8091 * arg1 + arg0;
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
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     ++var24;
                     this.field8068[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field8068[var24] = arg4;
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
                  int var14 = this.field8068[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field8068[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field8068[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field8068[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lvp;IIII)Lka;"
   )
   public final class501 method573(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class506(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIZ)Lbo;"
   )
   public final class763 method605(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class272(this, arg0, arg1) : new class400(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "pa",
      descriptor = "()V"
   )
   public final void method528() {
      for(int var1 = 0; var1 < this.field8078.length; ++var1) {
         this.field8078[var1].field10446 = this.field8078[var1].field10447;
         this.field8078[var1].field10459 = false;
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "h",
      descriptor = "()V"
   )
   public final void method563() {
      if (this.field8056) {
         class481.method3502(-1, true, false);
         this.field8056 = false;
      }

      this.field8058 = null;
      this.field8054 = null;
      this.field8060 = 0;
      this.field8055 = 0;
      this.field8059 = null;
      this.field8057 = true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "C",
      descriptor = "()Z"
   )
   public final boolean method4207() {
      return this.field8057;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ltba;Ltba;FLtba;)Ltba;"
   )
   public final class172 method597(class172 arg0, class172 arg1, float arg2, class172 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method561() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method551() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "I",
      descriptor = "()I"
   )
   public final int method494() {
      int var1 = this.field8087;
      this.field8087 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method596() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "()Lkh;"
   )
   public final class17 method603() {
      return new class133();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method562(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field8069.field1718 + (float)arg0 * this.field8069.field1730 + (float)arg1 * this.field8069.field1709 + this.field8069.field1729;
      if (!(var5 < (float)this.field8064) && !(var5 > (float)this.field8098)) {
         int var6 = (int)(((float)arg2 * this.field8069.field1697 + (float)arg0 * this.field8069.field1715 + (float)arg1 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / var5);
         int var7 = (int)(((float)arg2 * this.field8069.field1704 + (float)arg0 * this.field8069.field1698 + (float)arg1 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / var5);
         if (var6 >= this.field8094 && var6 <= this.field8071 && var7 >= this.field8096 && var7 <= this.field8086) {
            arg3[0] = var6 - this.field8094;
            arg3[1] = var7 - this.field8096;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class438 method576(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(I[Loda;)V"
   )
   public final void method601(int arg0, class127[] arg1) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method570(int arg0, int arg1) {
      int var3 = this.field8091 * arg1 + arg0;
      int var4 = this.field8080 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field8068;
         float[] var6 = this.field8061;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class714.method5199(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class714.method5199(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class714.method5197(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class714.method5197(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method532(int arg0) {
      this.field8084 = arg0;
      this.field8078 = new class715[this.field8084];

      for(int var2 = 0; var2 < this.field8084; ++var2) {
         this.field8078[var2] = new class715(this);
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIZ)Lbo;"
   )
   public final class763 method513(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field8091 * arg1 + arg0;
      int var8 = this.field8091 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field8068[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class272(this, var6, arg2, arg3);
      } else {
         return new class400(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method588(Canvas arg0) {
      if (arg0 != null) {
         class624 var2 = (class624)this.field8059.method1839(91, (long)arg0.hashCode());
         if (var2 != null) {
            this.field8054 = arg0;
            Dimension var3 = arg0.getSize();
            this.field8060 = var3.width;
            this.field8055 = var3.height;
            this.field8058 = var2;
            if (this.field8076 == null) {
               this.field8068 = var2.field8712;
               this.field8091 = var2.field8711;
               this.field8066 = var2.field8716;
               if (this.field8091 != this.field8080 || this.field8095 != this.field8066) {
                  this.field8072 = this.field8080 = this.field8091;
                  this.field8093 = this.field8095 = this.field8066;
                  this.field8088 = this.field8061 = new float[this.field8095 * this.field8080];
               }

               this.method4219();
               return;
            }
         }
      } else {
         this.field8054 = null;
         this.field8058 = null;
         if (this.field8076 == null) {
            this.field8068 = null;
            this.field8091 = this.field8066 = 1;
            this.field8080 = this.field8095 = 1;
            this.method4219();
         }
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method558(arg0, arg1, arg2, arg4, arg5);
      this.method558(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method527(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method527(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ltba;)V"
   )
   public final void method556(class172 arg0) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "k",
      descriptor = "()Lkh;"
   )
   public final class17 method600() {
      class715 var1 = this.method4208(Thread.currentThread());
      return var1.field10453;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "x",
      descriptor = "()V"
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field8069.field1718 + (float)arg0 * this.field8069.field1730 + (float)arg1 * this.field8069.field1709 + this.field8069.field1729;
      if (!(var6 < (float)this.field8064) && !(var6 > (float)this.field8098)) {
         int var7 = (int)(((float)arg2 * this.field8069.field1697 + (float)arg0 * this.field8069.field1715 + (float)arg1 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field8069.field1704 + (float)arg0 * this.field8069.field1698 + (float)arg1 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / (float)arg3);
         if (var7 >= this.field8094 && var7 <= this.field8071 && var8 >= this.field8096 && var8 <= this.field8086) {
            arg4[0] = var7 - this.field8094;
            arg4[1] = var8 - this.field8096;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Ljca;"
   )
   public final class715 method4208(Runnable arg0) {
      for(int var2 = 0; var2 < this.field8084; ++var2) {
         if (this.field8078[var2].field10449 == arg0) {
            return this.field8078[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method498() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljk;[Lok;Z)Lda;"
   )
   public final class66 method496(class663 arg0, class267[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field3467;
         var5[var7] = arg1[var7].field3469;
         if (arg1[var7].field3464 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class258(this, arg0, arg1, var4, var5);
         } else {
            return new class723(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class218(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method594(boolean arg0) {
      this.field8092 = arg0;
      this.field8082.method4245(true);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method521(Canvas arg0, int arg1, int arg2) {
      class624 var4 = (class624)this.field8059.method1839(-118, (long)arg0.hashCode());
      if (var4 != null) {
         var4.method3609(126);
         class624 var5 = class759.method5462(123, arg1, arg2, arg0);
         this.field8059.method1841((long)arg0.hashCode(), true, var5);
         if (this.field8054 == arg0 && this.field8076 == null) {
            Dimension var6 = arg0.getSize();
            this.field8060 = var6.width;
            this.field8055 = var6.height;
            this.field8058 = var5;
            this.field8068 = var5.field8712;
            this.field8091 = var5.field8711;
            this.field8066 = var5.field8716;
            if (this.field8091 != this.field8080 || this.field8095 != this.field8066) {
               this.field8072 = this.field8080 = this.field8091;
               this.field8093 = this.field8095 = this.field8066;
               this.field8088 = this.field8061 = new float[this.field8095 * this.field8080];
            }

            this.method4219();
         }
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method546() {
      return true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field8069.field1718 + (float)arg0 * this.field8069.field1730 + (float)arg1 * this.field8069.field1709 + this.field8069.field1729;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field8069.field1697 + (float)arg0 * this.field8069.field1715 + (float)arg1 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / var5);
         int var7 = (int)(((float)arg2 * this.field8069.field1704 + (float)arg0 * this.field8069.field1698 + (float)arg1 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / var5);
         arg3[0] = var6 - this.field8094;
         arg3[1] = var7 - this.field8096;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method553(int arg0) {
      int var2 = arg0 - this.field8053;

      for(Object var3 = this.field8082.method4241((byte)-71); var3 != null; var3 = this.field8082.method4236(-24321)) {
         class57 var4 = (class57)var3;
         if (var4.field617) {
            var4.field618 += var2;
            int var5 = var4.field618 / 20;
            if (var5 > 0) {
               class359 var6 = super.field726.method1293(var4.field616, -5150);
               var4.method438(var6.field5101 * var2 * 50 / 1000, var6.field5103 * var2 * 50 / 1000);
               var4.field618 -= var5 * 20;
            }

            var4.field617 = false;
         }
      }

      this.field8053 = arg0;
      this.field8070.method4234(2, 5);
      this.field8082.method4234(2, 5);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method547(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field8078.length; ++var4) {
         class715 var5 = this.field8078[var4];
         var5.field10446 = arg0 & 16777215;
         int var6 = var5.field10446 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field10446 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field10446 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field10446 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field10454 = false;
         } else {
            var5.field10454 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class715 var14 = this.method4208(Thread.currentThread());
      class789 var15 = var14.field10498;
      var15.field11535 = false;
      int var16 = arg0 - this.field8094;
      int var17 = arg3 - this.field8094;
      int var18 = arg6 - this.field8094;
      int var19 = arg1 - this.field8096;
      int var20 = arg4 - this.field8096;
      int var21 = arg7 - this.field8096;
      var15.field11526 = var16 < 0 || var16 > var15.field11530 || var17 < 0 || var17 > var15.field11530 || var18 < 0 || var18 > var15.field11530;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field11524 = 255 - var22;
            var15.field11523 = false;
            var15.method5690((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field11524 = 128;
            var15.field11523 = true;
            var15.method5690((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field11524 = 0;
         var15.field11523 = false;
         var15.method5690((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field11535 = true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method489(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class265 {
      if (this.field8054 != null && this.field8058 != null) {
         try {
            Graphics var5 = this.field8054.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field8091 && var7.y + arg3 <= this.field8066 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field8058.method1263(var5, var7.x, var7.height, var7.x + arg2, var7.y + arg3, var7.y, (byte)-108, var7.width);
               }
            }

         } catch (Exception var8) {
            this.field8054.repaint();
         }
      } else {
         throw new IllegalStateException(field8102[2]);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class587(class160 arg0) {
      super(arg0);
      this.field8057 = false;
      this.field8056 = false;
      this.field8059 = new class245(4);
      this.field8064 = 50;
      this.field8083 = 0;
      this.field8063 = 0;
      this.field8075 = 128;
      this.field8087 = 0;
      this.field8062 = 0;
      this.field8090 = 45823;
      this.field8067 = 75518;
      this.field8097 = 78642;
      this.field8081 = 512;
      this.field8065 = 512;
      this.field8092 = false;
      this.field8073 = 0;
      this.field8098 = 3500;
      this.field8099 = 0;
      this.field8070 = new class590(16);
      this.field8100 = -1;

      try {
         this.field8082 = new class590(256);
         this.field8069 = new class133();
         this.method532(1);
         this.method580(0);
         class593.method4269(-1, true, true);
         this.field8056 = true;
         this.field8053 = (int)class792.method5708(-25005);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method559(-10565);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "M",
      descriptor = "()I"
   )
   public final int method505() {
      int var1 = this.field8063;
      this.field8063 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "()Lkh;"
   )
   public final class17 method507() {
      return this.field8069;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method517() {
      return true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "p",
      descriptor = "()V"
   )
   public final void method560() {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lg;)V"
   )
   public final void method550(class165 arg0) {
      class728 var2 = (class728)arg0;
      this.field8091 = var2.field10665;
      this.field8066 = var2.field10660;
      this.field8068 = var2.field10671;
      this.field8076 = var2;
      this.field8080 = var2.field10665;
      this.field8095 = var2.field10660;
      this.field8061 = var2.field10666;
      this.method4219();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method564(int arg0, int arg1, int arg2, int arg3) {
      class715 var5 = this.method4208(Thread.currentThread());
      var5.field10463 = arg0;
      var5.field10446 = arg1;
      var5.field10450 = arg2;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "m",
      descriptor = "(I)Z"
   )
   public final boolean method4209(int arg0) {
      return this.field8092 || super.field726.method1293(arg0, -5150).field5116;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method509(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field8090 = (int)(arg1 * 65535.0F);
      this.field8097 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field8089 = (int)(arg3 * 65535.0F / var7);
      this.field8085 = (int)(arg4 * 65535.0F / var7);
      this.field8077 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method4210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field726.method1293(arg6, -5150).field5115) {
            if (this.field8100 != arg6) {
               class763 var11 = (class763)this.field8070.method4239((long)arg6, 0);
               if (var11 == null) {
                  int[] var12 = this.method4214(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method4209(arg6) ? 64 : this.field8075;
                  var11 = this.method525(var13, var12, var13, var13, 0, 0);
                  this.field8070.method4238(75, var11, (long)arg6);
               }

               this.field8100 = arg6;
               this.field8101 = var11;
            }

            ((class780)this.field8101).method1627(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method4213(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field8069.field1718 + (float)arg0 * this.field8069.field1730 + (float)arg1 * this.field8069.field1709 + this.field8069.field1729;
      float var9 = (float)arg5 * this.field8069.field1718 + (float)arg3 * this.field8069.field1730 + (float)arg4 * this.field8069.field1709 + this.field8069.field1729;
      int var10 = 0;
      if (var8 < (float)this.field8064 && var9 < (float)this.field8064) {
         var10 |= 16;
      } else if (var8 > (float)this.field8098 && var9 > (float)this.field8098) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field8069.field1697 + (float)arg0 * this.field8069.field1715 + (float)arg1 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field8069.field1697 + (float)arg3 * this.field8069.field1715 + (float)arg4 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / (float)arg6);
      if (var11 < this.field8094 && var12 < this.field8094) {
         var10 |= 1;
      } else if (var11 > this.field8071 && var12 > this.field8071) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field8069.field1704 + (float)arg0 * this.field8069.field1698 + (float)arg1 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field8069.field1704 + (float)arg3 * this.field8069.field1698 + (float)arg4 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / (float)arg6);
      if (var13 < this.field8096 && var14 < this.field8096) {
         var10 |= 4;
      } else if (var13 > this.field8086 && var14 > this.field8086) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class587(Canvas arg0, class160 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method585(arg0, arg2, arg3);
         this.method588(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method559(-10565);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method571(int[] arg0) {
      arg0[0] = this.field8091;
      arg0[1] = this.field8066;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIII)Ltba;"
   )
   public final class172 method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method599() {
      return new int[]{this.field8074, this.field8079, this.field8081, this.field8065};
   }

   @OriginalMember(
      owner = "client!nda",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method529(int arg0) {
      this.field8078[arg0].method5201((Runnable)null, (byte)-128);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method503(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method583() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method540(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "ya",
      descriptor = "()V"
   )
   public final void method608() {
      if (this.field8099 == 0 && this.field8091 == this.field8083 && this.field8073 == 0 && this.field8066 == this.field8062) {
         int var1 = this.field8061.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
            this.field8061[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field8061[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field8083 - this.field8099;
         int var5 = this.field8062 - this.field8073;
         int var6 = this.field8091 - var4;
         int var7 = this.field8091 * this.field8073 + this.field8099;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field8061[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lok;Z)Lbo;"
   )
   public final class763 method549(class267 arg0, boolean arg1) {
      int[] var3 = arg0.field3468;
      byte[] var4 = arg0.field3472;
      int var5 = arg0.field3467;
      int var6 = arg0.field3469;
      class780 var11;
      if (arg1 && arg0.field3464 == null) {
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

         var11 = new class214(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field3464;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class272(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class400(this, var14, var5, var6);
         }
      }

      var11.method2132(arg0.field3465, arg0.field3466, arg0.field3471, arg0.field3470);
      return var11;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method582(int[] arg0) {
      arg0[0] = this.field8099;
      arg0[1] = this.field8073;
      arg0[2] = this.field8083;
      arg0[3] = this.field8062;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method530(int arg0, int arg1, int arg2, int arg3) {
      if (this.field8099 < arg0) {
         this.field8099 = arg0;
      }

      if (this.field8073 < arg1) {
         this.field8073 = arg1;
      }

      if (this.field8083 > arg2) {
         this.field8083 = arg2;
      }

      if (this.field8062 > arg3) {
         this.field8062 = arg3;
      }

      this.method4211();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method585(Canvas arg0, int arg1, int arg2) {
      class624 var4 = (class624)this.field8059.method1839(-116, (long)arg0.hashCode());
      if (var4 == null) {
         class624 var5 = class759.method5462(110, arg1, arg2, arg0);
         this.field8059.method1841((long)arg0.hashCode(), true, var5);
      } else {
         if (var4.field8711 != arg1 || var4.field8716 != arg2) {
            this.method521(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "()V"
   )
   public final void method592() {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method566() {
      return true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "w",
      descriptor = "()I"
   )
   public final int method500() {
      return 0;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method490() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "B",
      descriptor = "()V"
   )
   private final void method4211() {
      this.field8094 = this.field8099 - this.field8074;
      this.field8071 = this.field8083 - this.field8074;
      this.field8096 = this.field8073 - this.field8079;
      this.field8086 = this.field8062 - this.field8079;

      for(int var1 = 0; var1 < this.field8084; ++var1) {
         class789 var5 = this.field8078[var1].field10498;
         var5.field11533 = this.field8074 - this.field8099;
         var5.field11528 = this.field8079 - this.field8073;
         var5.field11530 = this.field8083 - this.field8099;
         var5.field11529 = this.field8062 - this.field8073;
      }

      int var2 = this.field8091 * this.field8073 + this.field8099;

      for(int var3 = this.field8073; var3 < this.field8062; ++var3) {
         for(int var4 = 0; var4 < this.field8084; ++var4) {
            this.field8078[var4].field10498.field11531[var3 - this.field8073] = var2;
         }

         var2 += this.field8091;
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "E",
      descriptor = "()I"
   )
   public final int method610() {
      return 0;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method4212(int arg0) {
      return super.field726.method1293(arg0, -5150).field5113;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "([IIIIIZ)Lbo;"
   )
   public final class763 method524(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class272(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class400(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class272(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class400(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method589(int arg0) {
      this.method508(0, 0, this.field8091, this.field8066, arg0, 0);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method534() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method538() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "v",
      descriptor = "()Z"
   )
   public final boolean method512() {
      return false;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "g",
      descriptor = "(IIIIII)V"
   )
   private final void method4213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field8073) {
         var7 = this.field8073;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field8062) {
         var8 = this.field8062;
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
            if (var65 < this.field8099) {
               var65 = this.field8099;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field8083) {
               var66 = this.field8083;
            }

            int var67 = this.field8091 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field8061[var67]) {
                  this.field8068[var67] = arg4;
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
            if (var61 < this.field8099) {
               var61 = this.field8099;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field8083 - 1) {
               var62 = this.field8083 - 1;
            }

            int var63 = this.field8091 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field8061[var63]) {
                  this.field8068[var63] = arg4;
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
            if (var29 < this.field8099) {
               var29 = this.field8099;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field8083) {
               var30 = this.field8083;
            }

            int var31 = this.field8091 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field8061[var31]) {
                  int var33 = this.field8068[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field8068[var31] = var16 + var34;
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
            if (var23 < this.field8099) {
               var23 = this.field8099;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field8083 - 1) {
               var24 = this.field8083 - 1;
            }

            int var25 = this.field8091 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field8061[var25]) {
                  int var27 = this.field8068[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field8068[var25] = var16 + var28;
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
            if (var48 < this.field8099) {
               var48 = this.field8099;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field8083) {
               var49 = this.field8083;
            }

            int var50 = this.field8091 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field8061[var50]) {
                  int var52 = this.field8068[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field8068[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
            if (var40 < this.field8099) {
               var40 = this.field8099;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field8083 - 1) {
               var41 = this.field8083 - 1;
            }

            int var42 = this.field8091 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field8061[var42]) {
                  int var44 = this.field8068[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field8068[var42] = var45 - var47 | var47 - (var47 >>> 8);
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
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method4205(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method4205(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method4215(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method4215(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                     if (arg0 >= this.field8099 && arg0 < this.field8083 && var37 >= this.field8073 && var37 < this.field8062 && var24 < var21) {
                        int var38 = this.field8091 * var37 + arg0;
                        int var39 = this.field8068[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field8068[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field8099 && arg0 < this.field8083 && var42 >= this.field8073 && var42 < this.field8062 && var24 < var21) {
                        int var43 = this.field8091 * var42 + arg0;
                        int var44 = this.field8068[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field8068[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                  if (arg0 >= this.field8099 && arg0 < this.field8083 && var49 >= this.field8073 && var49 < this.field8062 && var24 < var21) {
                     this.field8068[this.field8091 * var49 + arg0] = arg4;
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
                     if (arg1 >= this.field8073 && arg1 < this.field8062 && var60 >= this.field8099 && var60 < this.field8083 && var24 < var21) {
                        int var61 = this.field8091 * arg1 + var60;
                        int var62 = this.field8068[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field8068[this.field8091 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field8073 && arg1 < this.field8062 && var65 >= this.field8099 && var65 < this.field8083 && var24 < var21) {
                        int var66 = this.field8091 * arg1 + var65;
                        int var67 = this.field8068[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field8068[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                  if (arg1 >= this.field8073 && arg1 < this.field8062 && var72 >= this.field8099 && var72 < this.field8083 && var24 < var21) {
                     this.field8068[this.field8091 * arg1 + var72] = arg4;
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
      owner = "client!nda",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method554(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method577(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field8091) {
         arg2 = this.field8091;
      }

      if (arg3 > this.field8066) {
         arg3 = this.field8066;
      }

      this.field8099 = arg0;
      this.field8083 = arg2;
      this.field8073 = arg1;
      this.field8062 = arg3;
      this.method4211();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class715 var8 = this.method4208(Thread.currentThread());
      class789 var9 = var8.field10498;
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
         int var23 = arg0 - var9.method5674();
         int var24 = arg1 - var9.method5679();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field11524 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field11524 = 255 - (arg4 >>> 24);
         }

         this.method574(false);
         var9.field11526 = var25 < 0 || var25 > var9.field11530 || var26 < 0 || var26 > var9.field11530 || var27 < 0 || var27 > var9.field11530;
         var9.method5692((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field11526 = var25 < 0 || var25 > var9.field11530 || var27 < 0 || var27 > var9.field11530 || var28 < 0 || var28 > var9.field11530;
         var9.method5692((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method574(true);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method586(class438 arg0) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "(I)[I"
   )
   public final int[] method4214(int arg0) {
      class590 var2 = this.field8082;
      class57 var3;
      synchronized(this.field8082) {
         var3 = (class57)this.field8082.method4239((long)arg0 | Long.MIN_VALUE, 0);
         if (var3 == null) {
            if (!super.field726.method1289((byte)-124, arg0)) {
               return null;
            }

            class359 var5 = super.field726.method1293(arg0, -5150);
            int var6 = !var5.field5116 && !this.field8092 ? this.field8075 : 64;
            var3 = new class57(arg0, var6, super.field726.method1291(var6, true, var6, 0.7F, arg0, (byte)63), var5.field5113 != 1);
            this.field8082.method4238(40, var3, (long)arg0 | Long.MIN_VALUE);
         }
      }

      var3.field617 = true;
      return var3.method437();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljea;I)V"
   )
   public final void method555(class478 arg0, int arg1) {
      class715 var3 = this.method4208(Thread.currentThread());
      class643 var4 = arg0.field6608.field3047;

      for(class643 var5 = var4.field9034; var4 != var5; var5 = var5.field9034) {
         class526 var6 = (class526)var5;
         int var7 = var6.field7196 >> 12;
         int var8 = var6.field7191 >> 12;
         int var9 = var6.field7195 >> 12;
         float var10 = (float)var9 * this.field8069.field1718 + (float)var7 * this.field8069.field1730 + (float)var8 * this.field8069.field1709 + this.field8069.field1729;
         if (!(var10 < (float)this.field8064) && !(var10 > (float)var3.field10460)) {
            int var11 = (int)(((float)var9 * this.field8069.field1697 + (float)var7 * this.field8069.field1715 + (float)var8 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / (float)arg1) + this.field8074;
            int var12 = (int)(((float)var9 * this.field8069.field1704 + (float)var7 * this.field8069.field1698 + (float)var8 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / (float)arg1) + this.field8079;
            if (var11 >= this.field8099 && var11 <= this.field8083 && var12 >= this.field8073 && var12 <= this.field8062) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method4218(var6, var11, var12, (int)var10, (this.field8081 * var6.field7194 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method4215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field8099 && arg0 < this.field8083) {
         int var9 = this.field8091 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field8073 && arg1 + var15 < this.field8062 && var12 < arg5) {
                     int var16 = this.field8091 * var15 + var9;
                     int var17 = this.field8068[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field8068[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field8073 && arg1 + var19 < this.field8062 && var12 < arg5) {
                     int var20 = this.field8091 * var19 + var9;
                     int var21 = this.field8068[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field8068[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
               if (arg1 + var25 >= this.field8073 && arg1 + var25 < this.field8062 && var12 < arg5) {
                  this.field8068[this.field8091 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "l",
      descriptor = "(I)Z"
   )
   public final boolean method4216(int arg0) {
      return super.field726.method1289((byte)-92, arg0);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8) {
      class155 var10 = (class155)arg6;
      int[] var11 = var10.field2000;
      int[] var12 = var10.field2003;
      int var13 = this.field8073 > arg8 ? this.field8073 : arg8;
      int var14 = this.field8062 < var11.length + arg8 ? this.field8062 : var11.length + arg8;
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
         if (arg0 < this.field8099) {
            var18 += (this.field8099 - arg0) * var20;
            arg0 = this.field8099;
         }

         if (var21 >= this.field8083) {
            var21 = this.field8083 - 1;
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
                        int var28 = this.field8091 * var25 + arg0;
                        int var29 = this.field8068[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field8068[var28] = var23 + var30;
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
                        int var34 = this.field8091 * var31 + arg0;
                        int var35 = this.field8068[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field8068[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                     this.field8068[this.field8091 * var39 + arg0] = arg4;
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
               if (var64 >= this.field8099 && var64 < this.field8083 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field8068[this.field8091 * arg1 + var64] = arg4;
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
               if (var50 >= this.field8099 && var50 < this.field8083 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field8091 * arg1 + var50;
                  int var54 = this.field8068[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field8068[this.field8091 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field8099 && var56 < this.field8083 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field8091 * arg1 + var56;
                  int var60 = this.field8068[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field8068[var59] = var61 - var63 | var63 - (var63 >>> 8);
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
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class155 var13 = (class155)arg6;
      int[] var14 = var13.field2000;
      int[] var15 = var13.field2003;
      int var16 = this.field8073 > arg8 ? this.field8073 : arg8;
      int var17 = this.field8062 < var14.length + arg8 ? this.field8062 : var14.length + arg8;
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
                  if (arg0 >= this.field8099 && arg0 < this.field8083 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field8091 * var37 + arg0;
                        int var41 = this.field8068[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field8068[var40] = var35 + var42;
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
                  if (arg0 >= this.field8099 && arg0 < this.field8083 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field8091 * var44 + arg0;
                        int var48 = this.field8068[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field8068[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
               if (arg0 >= this.field8099 && arg0 < this.field8083 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field8068[this.field8091 * var53 + arg0] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field8099 && var80 < this.field8083 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field8068[this.field8091 * arg1 + var80] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field8099 && var66 < this.field8083 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field8091 * arg1 + var66;
                  int var69 = this.field8068[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field8068[this.field8091 * arg1 + var66] = var64 + var70;
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
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field8099 && var72 < this.field8083 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field8091 * arg1 + var72;
                  int var75 = this.field8068[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field8068[var74] = var76 - var78 | var78 - (var78 >>> 8);
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
      owner = "client!nda",
      name = "o",
      descriptor = "()Luv;"
   )
   public final class386 method499() {
      return new class386(0, field8102[0], 1, field8102[1], 0L);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "r",
      descriptor = "()V"
   )
   public final void method544() {
      if (this.field8054 != null) {
         this.field8068 = this.field8058.field8712;
         this.field8091 = this.field8058.field8711;
         this.field8066 = this.field8058.field8716;
         this.field8061 = this.field8088;
         this.field8080 = this.field8072;
         this.field8095 = this.field8093;
      } else {
         this.field8091 = 1;
         this.field8066 = 1;
         this.field8068 = null;
         this.field8080 = 1;
         this.field8095 = 1;
         this.field8061 = null;
      }

      this.field8076 = null;
      this.method4219();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "i",
      descriptor = "()I"
   )
   public final int method567() {
      return this.field8064;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method511(int arg0, int arg1) {
      class715 var3 = this.method4208(Thread.currentThread());
      this.field8064 = arg0;
      this.field8098 = arg1;
      var3.field10460 = this.field8098 - 255;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field8091 * arg1 + arg0;
         int var15 = this.field8091 - arg2;
         if (arg1 + arg3 > this.field8062) {
            arg3 -= arg1 + arg3 - this.field8062;
         }

         if (arg1 < this.field8073) {
            int var16 = this.field8073 - arg1;
            arg3 -= var16;
            var14 += this.field8091 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field8083) {
            int var17 = arg0 + arg2 - this.field8083;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field8099) {
            int var18 = this.field8099 - arg0;
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
                     int var28 = this.field8068[var14];
                     this.field8068[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                        int var34 = this.field8068[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field8068[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                     this.field8068[var14++] = arg5;
                  } else {
                     this.field8068[var14++] = arg4;
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
      owner = "client!nda",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method493() {
      return true;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "()V"
   )
   public final void method552() {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method516(int arg0, class516 arg1, int arg2, int arg3) {
      class155 var5 = (class155)arg1;
      int[] var6 = var5.field2000;
      int[] var7 = var5.field2003;
      int var8;
      if (this.field8062 < var6.length + arg3) {
         var8 = this.field8062 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field8073 > arg3) {
         var9 = this.field8073 - arg3;
         arg3 = this.field8073;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field8091 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field8099 > var12) {
               var13 -= this.field8099 - var12;
               var12 = this.field8099;
            }

            if (this.field8083 < var12 + var13) {
               var13 = this.field8083 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field8068[var14++] = arg0;
            }

            var10 += this.field8091;
         }

      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method4217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field726.method1293(arg6, -5150).field5115) {
            if (this.field8100 != arg6) {
               class763 var11 = (class763)this.field8070.method4239((long)arg6, 0);
               if (var11 == null) {
                  int[] var12 = this.method4214(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method4209(arg6) ? 64 : this.field8075;
                  var11 = this.method525(var13, var12, var13, var13, 0, 0);
                  this.field8070.method4238(41, var11, (long)arg6);
               }

               this.field8100 = arg6;
               this.field8101 = var11;
            }

            ((class780)this.field8101).method1630(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method4213(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method572(int arg0) {
      this.field8075 = arg0;
      this.field8082.method4245(true);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljea;)V"
   )
   public final void method598(class478 arg0) {
      class715 var2 = this.method4208(Thread.currentThread());
      class643 var3 = arg0.field6608.field3047;

      for(class643 var4 = var3.field9034; var3 != var4; var4 = var4.field9034) {
         class526 var5 = (class526)var4;
         int var6 = var5.field7196 >> 12;
         int var7 = var5.field7191 >> 12;
         int var8 = var5.field7195 >> 12;
         float var9 = (float)var8 * this.field8069.field1718 + (float)var6 * this.field8069.field1730 + (float)var7 * this.field8069.field1709 + this.field8069.field1729;
         if (!(var9 < (float)this.field8064) && !(var9 > (float)var2.field10460)) {
            int var10 = (int)(((float)var8 * this.field8069.field1697 + (float)var6 * this.field8069.field1715 + (float)var7 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / var9) + this.field8074;
            int var11 = (int)(((float)var8 * this.field8069.field1704 + (float)var6 * this.field8069.field1698 + (float)var7 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / var9) + this.field8079;
            if (var10 >= this.field8099 && var10 <= this.field8083 && var11 >= this.field8073 && var11 <= this.field8062) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method4218(var5, var10, var11, (int)var9, (int)((float)(this.field8081 * var5.field7194 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field8073) {
         var6 = this.field8073;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field8062) {
         var7 = this.field8062;
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
            if (var64 < this.field8099) {
               var64 = this.field8099;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field8083) {
               var65 = this.field8083;
            }

            int var66 = this.field8091 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field8068[var66++] = arg3;
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
            if (var60 < this.field8099) {
               var60 = this.field8099;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field8083 - 1) {
               var61 = this.field8083 - 1;
            }

            int var62 = this.field8091 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field8068[var62++] = arg3;
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
            if (var28 < this.field8099) {
               var28 = this.field8099;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field8083) {
               var29 = this.field8083;
            }

            int var30 = this.field8091 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field8068[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field8068[var30++] = var15 + var33;
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
            if (var22 < this.field8099) {
               var22 = this.field8099;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field8083 - 1) {
               var23 = this.field8083 - 1;
            }

            int var24 = this.field8091 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field8068[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field8068[var24++] = var15 + var27;
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
            if (var47 < this.field8099) {
               var47 = this.field8099;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field8083) {
               var48 = this.field8083;
            }

            int var49 = this.field8091 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field8068[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field8068[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
            if (var39 < this.field8099) {
               var39 = this.field8099;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field8083 - 1) {
               var40 = this.field8083 - 1;
            }

            int var41 = this.field8091 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field8068[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field8068[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method542(int arg0, int arg1) throws class265 {
      if (this.field8054 != null && this.field8058 != null) {
         try {
            Graphics var3 = this.field8054.getGraphics();
            this.field8058.method1263(var3, 0, this.field8055, arg0, arg1, 0, (byte)-118, this.field8060);
         } catch (Exception var4) {
            this.field8054.repaint();
         }
      } else {
         throw new IllegalStateException(field8102[2]);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lva;IIII)V"
   )
   private final void method4218(class526 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field7192;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method4213(arg1, arg2, arg3, arg4, arg0.field7200, 1);
      } else {
         if (this.field8100 != var6) {
            class763 var9 = (class763)this.field8070.method4239((long)var6, 0);
            if (var9 == null) {
               int[] var10 = this.method4214(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method4209(var6) ? 64 : this.field8075;
               var9 = this.method525(var11, var10, var11, var11, 0, 0);
               this.field8070.method4238(52, var9, (long)var6);
            }

            this.field8100 = var6;
            this.field8101 = var9;
         }

         ++var8;
         ((class780)this.field8101).method1627(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field7200, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field8069.field1718 + (float)arg0 * this.field8069.field1730 + (float)arg1 * this.field8069.field1709 + this.field8069.field1729;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field8069.field1718 + (float)arg3 * this.field8069.field1730 + (float)arg4 * this.field8069.field1709 + this.field8069.field1729;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field8064 && var9 < (float)this.field8064) {
         var7 |= 16;
      } else if (var8 > (float)this.field8098 && var9 > (float)this.field8098) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field8069.field1697 + (float)arg0 * this.field8069.field1715 + (float)arg1 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / var8);
      int var11 = (int)(((float)arg5 * this.field8069.field1697 + (float)arg3 * this.field8069.field1715 + (float)arg4 * this.field8069.field1713 + this.field8069.field1712) * (float)this.field8081 / var9);
      if (var10 < this.field8094 && var11 < this.field8094) {
         var7 |= 1;
      } else if (var10 > this.field8071 && var11 > this.field8071) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field8069.field1704 + (float)arg0 * this.field8069.field1698 + (float)arg1 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / var8);
      int var13 = (int)(((float)arg5 * this.field8069.field1704 + (float)arg3 * this.field8069.field1698 + (float)arg4 * this.field8069.field1707 + this.field8069.field1724) * (float)this.field8065 / var9);
      if (var12 < this.field8096 && var13 < this.field8096) {
         var7 |= 4;
      } else if (var12 > this.field8086 && var13 > this.field8086) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "g",
      descriptor = "()V"
   )
   private final void method4219() {
      for(int var1 = 0; var1 < this.field8084; ++var1) {
         this.field8078[var1].method5206(false);
      }

      this.method593();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(II)Ldw;"
   )
   public final class751 method531(int arg0, int arg1) {
      return new class654(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method533(int arg0) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "o",
      descriptor = "(I)I"
   )
   public final int method4220(int arg0) {
      return super.field726.method1293(arg0, -5150).field5112 & 65535;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method502(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class516 method604(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class155(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public final void method581(class17 arg0) {
      this.field8069 = (class133)arg0;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "la",
      descriptor = "()V"
   )
   public final void method593() {
      this.field8099 = 0;
      this.field8073 = 0;
      this.field8083 = this.field8091;
      this.field8062 = this.field8066;
      this.method4211();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method574(boolean arg0) {
      class715 var2 = this.method4208(Thread.currentThread());
      var2.field10461 = arg0;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method491(int arg0) {
      class506.field6971 = arg0;
      class506.field6950 = arg0;
      if (this.field8084 > 1) {
         throw new IllegalStateException(field8102[3]);
      } else {
         this.method532(this.field8084);
         this.method580(0);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method501(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field8078.length; ++var5) {
         this.field8078[var5].field10447 = this.field8078[var5].field10446;
         this.field8078[var5].field10463 = arg0;
         this.field8078[var5].field10446 = arg1;
         this.field8078[var5].field10450 = arg2;
         this.field8078[var5].field10459 = true;
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(II)Lmp;"
   )
   public final class796 method590(int arg0, int arg1) {
      return this.method605(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method506(Canvas arg0) {
      if (this.field8054 == arg0) {
         this.method588((Canvas)null);
      }

      class624 var2 = (class624)this.field8059.method1839(-127, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method3609(115);
      }

   }

   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method558(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method558(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method527(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method527(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
            if (arg0 < this.field8099) {
               var10 += (this.field8099 - arg0) * var12;
               arg0 = this.field8099;
            }

            if (var13 >= this.field8083) {
               var13 = this.field8083 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field8073 && var17 < this.field8062) {
                        int var18 = this.field8091 * var17 + arg0;
                        int var19 = this.field8068[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field8068[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field8073 && var21 < this.field8062) {
                        int var22 = this.field8091 * var21 + arg0;
                        int var23 = this.field8068[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field8068[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                  if (var27 >= this.field8073 && var27 < this.field8062) {
                     this.field8068[this.field8091 * var27 + arg0] = arg4;
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
            if (arg1 < this.field8073) {
               var29 += (this.field8073 - arg1) * var31;
               arg1 = this.field8073;
            }

            if (var32 >= this.field8062) {
               var32 = this.field8062 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field8099 && var46 < this.field8083) {
                     this.field8068[this.field8091 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field8099 && var36 < this.field8083) {
                     int var37 = this.field8091 * arg1 + var36;
                     int var38 = this.field8068[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field8068[this.field8091 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field8099 && var40 < this.field8083) {
                     int var41 = this.field8091 * arg1 + var40;
                     int var42 = this.field8068[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field8068[var41] = var43 - var45 | var45 - (var45 >>> 8);
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
      owner = "client!nda",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method541(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class220(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!nda",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method526(int arg0, int arg1, int arg2, int arg3) {
      this.field8074 = arg0;
      this.field8079 = arg1;
      this.field8081 = arg2;
      this.field8065 = arg3;
      this.method4211();
   }

   @OriginalMember(
      owner = "client!nda",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field8099 && arg0 < this.field8083) {
         if (arg1 < this.field8073) {
            arg2 -= this.field8073 - arg1;
            arg1 = this.field8073;
         }

         if (arg1 + arg2 > this.field8062) {
            arg2 = this.field8062 - arg1;
         }

         int var6 = this.field8091 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field8091 * var10 + var6;
                  int var12 = this.field8068[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field8068[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field8091 * var14 + var6;
                  int var16 = this.field8068[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field8068[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field8068[this.field8091 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method537(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4222(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
