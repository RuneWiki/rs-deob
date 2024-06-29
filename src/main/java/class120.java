import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public abstract class class120 extends class492 {
   @OriginalMember(
      owner = "client!jja",
      name = "u",
      descriptor = "Lsfa;"
   )
   public class726 field1499;
   @OriginalMember(
      owner = "client!jja",
      name = "E",
      descriptor = "I"
   )
   public int field1493;
   @OriginalMember(
      owner = "client!jja",
      name = "w",
      descriptor = "I"
   )
   public int field1515;
   @OriginalMember(
      owner = "client!jja",
      name = "t",
      descriptor = "I"
   )
   private static int field1501 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "r",
      descriptor = "I"
   )
   public static int field1494 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "q",
      descriptor = "I"
   )
   public static int field1506 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "k",
      descriptor = "I"
   )
   private static int field1497 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "D",
      descriptor = "I"
   )
   public static int field1513 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "F",
      descriptor = "I"
   )
   public static int field1507 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "I"
   )
   public static int field1519 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "l",
      descriptor = "I"
   )
   public static int field1518 = 0;
   @OriginalMember(
      owner = "client!jja",
      name = "v",
      descriptor = "I"
   )
   public static int field1490;
   @OriginalMember(
      owner = "client!jja",
      name = "C",
      descriptor = "I"
   )
   public int field1491;
   @OriginalMember(
      owner = "client!jja",
      name = "G",
      descriptor = "I"
   )
   private static int field1492;
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "I"
   )
   private static int field1495;
   @OriginalMember(
      owner = "client!jja",
      name = "A",
      descriptor = "I"
   )
   public static int field1496;
   @OriginalMember(
      owner = "client!jja",
      name = "e",
      descriptor = "I"
   )
   public static int field1498;
   @OriginalMember(
      owner = "client!jja",
      name = "f",
      descriptor = "I"
   )
   public static int field1500;
   @OriginalMember(
      owner = "client!jja",
      name = "i",
      descriptor = "I"
   )
   private static int field1502;
   @OriginalMember(
      owner = "client!jja",
      name = "y",
      descriptor = "I"
   )
   private static int field1503;
   @OriginalMember(
      owner = "client!jja",
      name = "g",
      descriptor = "I"
   )
   public static int field1504;
   @OriginalMember(
      owner = "client!jja",
      name = "j",
      descriptor = "I"
   )
   public static int field1505;
   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "I"
   )
   public static int field1508;
   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "I"
   )
   public static int field1510;
   @OriginalMember(
      owner = "client!jja",
      name = "p",
      descriptor = "I"
   )
   public static int field1511;
   @OriginalMember(
      owner = "client!jja",
      name = "s",
      descriptor = "I"
   )
   public int field1512;
   @OriginalMember(
      owner = "client!jja",
      name = "n",
      descriptor = "I"
   )
   public static int field1514;
   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "I"
   )
   public static int field1516;
   @OriginalMember(
      owner = "client!jja",
      name = "B",
      descriptor = "I"
   )
   public static int field1517;
   @OriginalMember(
      owner = "client!jja",
      name = "d",
      descriptor = "I"
   )
   public int field1520;
   @OriginalMember(
      owner = "client!jja",
      name = "m",
      descriptor = "I"
   )
   public static int field1521;
   @OriginalMember(
      owner = "client!jja",
      name = "x",
      descriptor = "I"
   )
   public int field1522;
   @OriginalMember(
      owner = "client!jja",
      name = "o",
      descriptor = "[I"
   )
   private int[] field1509;

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "()I",
      line = 3
   )
   public final int method957() {
      return this.field1520 + this.field1515 + this.field1512;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "()I",
      line = 13
   )
   public final int method958() {
      return this.field1493;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(FFFFFF)Z",
      line = 17
   )
   private final boolean method959(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field1522 + this.field1493 + this.field1491;
      int var8 = this.field1520 + this.field1515 + this.field1512;
      if (this.field1493 != var7 || this.field1515 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field1520 * var11;
         float var14 = (float)this.field1520 * var12;
         float var15 = (float)this.field1522 * var9;
         float var16 = (float)this.field1522 * var10;
         float var17 = (float)this.field1491 * -var9;
         float var18 = (float)this.field1491 * -var10;
         float var19 = (float)this.field1512 * -var11;
         float var20 = (float)this.field1512 * -var12;
         arg0 += var13 + var15;
         arg1 += var14 + var16;
         arg2 += var13 + var17;
         arg3 += var14 + var18;
         arg4 += var15 + var19;
         arg5 += var16 + var20;
      }

      float var21 = arg2 - arg0 + arg4;
      float var22 = arg5 - arg1 + arg3;
      float var23;
      float var24;
      if (arg0 < arg2) {
         var23 = arg0;
         var24 = arg2;
      } else {
         var23 = arg2;
         var24 = arg0;
      }

      if (arg4 < var23) {
         var23 = arg4;
      }

      if (var21 < var23) {
         var23 = var21;
      }

      if (arg4 > var24) {
         var24 = arg4;
      }

      if (var21 > var24) {
         var24 = var21;
      }

      float var25;
      float var26;
      if (arg1 < arg3) {
         var25 = arg1;
         var26 = arg3;
      } else {
         var25 = arg3;
         var26 = arg1;
      }

      if (arg5 < var25) {
         var25 = arg5;
      }

      if (var22 < var25) {
         var25 = var22;
      }

      if (arg5 > var26) {
         var26 = arg5;
      }

      if (var22 > var26) {
         var26 = var22;
      }

      if (var23 < (float)this.field1499.field10619) {
         var23 = (float)this.field1499.field10619;
      }

      if (var24 > (float)this.field1499.field10625) {
         var24 = (float)this.field1499.field10625;
      }

      if (var25 < (float)this.field1499.field10620) {
         var25 = (float)this.field1499.field10620;
      }

      if (var26 > (float)this.field1499.field10628) {
         var26 = (float)this.field1499.field10628;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field1517 = this.field1499.field10608;
            field1504 = (int)((float)((int)var25 * field1517) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field1521 = (int)((arg5 - arg1) * 4096.0F * (float)this.field1493 / var29);
            field1508 = (int)((arg3 - arg1) * 4096.0F * (float)this.field1515 / var30);
            field1511 = (int)((arg4 - arg0) * 4096.0F * (float)this.field1493 / var30);
            field1514 = (int)((arg2 - arg0) * 4096.0F * (float)this.field1515 / var29);
            field1495 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field1492 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field1505 = (this.field1493 >> 1 << 12) + (field1511 * field1492 >> 4);
            field1496 = (this.field1515 >> 1 << 12) + (field1514 * field1492 >> 4);
            field1510 = field1521 * field1495 >> 4;
            field1500 = field1508 * field1495 >> 4;
            field1502 = (int)var23;
            field1498 = (int)var27;
            field1503 = (int)var25;
            field1516 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "()I",
      line = 153
   )
   public final int method960() {
      return this.field1522 + this.field1493 + this.field1491;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "(IIII)V",
      line = 171
   )
   public final void method961(int arg0, int arg1, int arg2, int arg3) {
      this.field1522 = arg0;
      this.field1520 = arg1;
      this.field1491 = arg2;
      this.field1512 = arg3;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "([I)V",
      line = 195
   )
   public final void method962(int[] arg0) {
      arg0[0] = this.field1522;
      arg0[1] = this.field1520;
      arg0[2] = this.field1491;
      arg0[3] = this.field1512;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "d",
      descriptor = "()I",
      line = 203
   )
   public final int method963() {
      return this.field1515;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 209
   )
   public final void method964(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field1499.method5295()) {
         throw new IllegalStateException();
      } else if (this.method959(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field1490 = arg7;
         if (arg6 != 1) {
            field1507 = arg7 >>> 24;
            field1506 = 256 - field1507;
            if (arg6 == 0) {
               field1494 = (arg7 & 16711680) >> 16;
               field1513 = (arg7 & 65280) >> 8;
               field1519 = arg7 & 255;
            } else if (arg6 == 2) {
               field1501 = arg7 >>> 24;
               field1497 = 256 - field1501;
               int var11 = (arg7 & 16711935) * field1497 & -16711936;
               int var12 = (arg7 & 65280) * field1497 & 16711680;
               field1518 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method422(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method422(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method422(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method422(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method422(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method422(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method422(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method422(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method422(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method422(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method422(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method422(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 311
   )
   public final void method965(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class515 arg7, int arg8, int arg9) {
      if (this.field1499.method5295()) {
         throw new IllegalStateException();
      } else if (this.method959(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class701 var11 = (class701)arg7;
         this.method427(var11.field10256, var11.field10255, field1502 - arg8, -arg9 - (field1516 - field1503));
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(IIIIIII)V",
      line = 324
   )
   public final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field1499.method5295()) {
         throw new IllegalStateException();
      } else {
         if (this.field1509 == null) {
            this.field1509 = new int[4];
         }

         this.field1499.method605(this.field1509);
         this.field1499.method547(this.field1499.field10619, this.field1499.field10620, arg0 + arg2, arg1 + arg3);
         int var8 = this.method960();
         int var9 = this.method957();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method429(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field1499.method592(this.field1509[0], this.field1509[1], this.field1509[2], this.field1509[3]);
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(Lsfa;II)V",
      line = 378
   )
   public class120(class726 arg0, int arg1, int arg2) {
      this.field1499 = arg0;
      this.field1493 = arg1;
      this.field1515 = arg2;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method422(int arg0, int arg1);

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method429(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method426(int arg0, int arg1, class515 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method427(int[] arg0, int[] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
