import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class726 extends class66 {
   @OriginalMember(
      owner = "client!sfa",
      name = "V",
      descriptor = "Z"
   )
   private boolean field10591;
   @OriginalMember(
      owner = "client!sfa",
      name = "C",
      descriptor = "Z"
   )
   private boolean field10594;
   @OriginalMember(
      owner = "client!sfa",
      name = "r",
      descriptor = "Lwv;"
   )
   private class37 field10592;
   @OriginalMember(
      owner = "client!sfa",
      name = "u",
      descriptor = "I"
   )
   public int field10613;
   @OriginalMember(
      owner = "client!sfa",
      name = "gb",
      descriptor = "I"
   )
   public int field10602;
   @OriginalMember(
      owner = "client!sfa",
      name = "K",
      descriptor = "I"
   )
   private int field10595;
   @OriginalMember(
      owner = "client!sfa",
      name = "H",
      descriptor = "I"
   )
   public int field10610;
   @OriginalMember(
      owner = "client!sfa",
      name = "jb",
      descriptor = "Z"
   )
   private boolean field10607;
   @OriginalMember(
      owner = "client!sfa",
      name = "db",
      descriptor = "I"
   )
   private int field10604;
   @OriginalMember(
      owner = "client!sfa",
      name = "nb",
      descriptor = "I"
   )
   public int field10603;
   @OriginalMember(
      owner = "client!sfa",
      name = "x",
      descriptor = "I"
   )
   public int field10619;
   @OriginalMember(
      owner = "client!sfa",
      name = "I",
      descriptor = "I"
   )
   public int field10609;
   @OriginalMember(
      owner = "client!sfa",
      name = "y",
      descriptor = "I"
   )
   public int field10628;
   @OriginalMember(
      owner = "client!sfa",
      name = "kb",
      descriptor = "I"
   )
   public int field10620;
   @OriginalMember(
      owner = "client!sfa",
      name = "w",
      descriptor = "I"
   )
   public int field10630;
   @OriginalMember(
      owner = "client!sfa",
      name = "W",
      descriptor = "I"
   )
   public int field10629;
   @OriginalMember(
      owner = "client!sfa",
      name = "S",
      descriptor = "I"
   )
   public int field10625;
   @OriginalMember(
      owner = "client!sfa",
      name = "eb",
      descriptor = "I"
   )
   public int field10624;
   @OriginalMember(
      owner = "client!sfa",
      name = "lb",
      descriptor = "Loi;"
   )
   private class80 field10616;
   @OriginalMember(
      owner = "client!sfa",
      name = "mb",
      descriptor = "I"
   )
   private int field10635;
   @OriginalMember(
      owner = "client!sfa",
      name = "s",
      descriptor = "Loi;"
   )
   private class80 field10618;
   @OriginalMember(
      owner = "client!sfa",
      name = "ib",
      descriptor = "Lvr;"
   )
   public class148 field10617;
   @OriginalMember(
      owner = "client!sfa",
      name = "P",
      descriptor = "I"
   )
   private int field10588;
   @OriginalMember(
      owner = "client!sfa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10636 = new String[]{method5300(method5299("Z{\r")), method5300(method5299("vM>")), method5300(method5299("eh\u0019zE\u007f|\u001d~")), method5300(method5299("{rKR1"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "ob",
      descriptor = "I"
   )
   private int field10587;
   @OriginalMember(
      owner = "client!sfa",
      name = "v",
      descriptor = "I"
   )
   private int field10590;
   @OriginalMember(
      owner = "client!sfa",
      name = "t",
      descriptor = "I"
   )
   public int field10598;
   @OriginalMember(
      owner = "client!sfa",
      name = "ab",
      descriptor = "I"
   )
   public int field10600;
   @OriginalMember(
      owner = "client!sfa",
      name = "Z",
      descriptor = "I"
   )
   private int field10601;
   @OriginalMember(
      owner = "client!sfa",
      name = "bb",
      descriptor = "I"
   )
   public int field10605;
   @OriginalMember(
      owner = "client!sfa",
      name = "L",
      descriptor = "I"
   )
   private int field10606;
   @OriginalMember(
      owner = "client!sfa",
      name = "R",
      descriptor = "I"
   )
   public int field10608;
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "I"
   )
   public int field10611;
   @OriginalMember(
      owner = "client!sfa",
      name = "fb",
      descriptor = "I"
   )
   private int field10612;
   @OriginalMember(
      owner = "client!sfa",
      name = "U",
      descriptor = "I"
   )
   public int field10614;
   @OriginalMember(
      owner = "client!sfa",
      name = "Q",
      descriptor = "I"
   )
   public int field10615;
   @OriginalMember(
      owner = "client!sfa",
      name = "O",
      descriptor = "I"
   )
   public int field10621;
   @OriginalMember(
      owner = "client!sfa",
      name = "E",
      descriptor = "I"
   )
   public int field10622;
   @OriginalMember(
      owner = "client!sfa",
      name = "hb",
      descriptor = "I"
   )
   public int field10623;
   @OriginalMember(
      owner = "client!sfa",
      name = "T",
      descriptor = "I"
   )
   private int field10627;
   @OriginalMember(
      owner = "client!sfa",
      name = "D",
      descriptor = "I"
   )
   public int field10631;
   @OriginalMember(
      owner = "client!sfa",
      name = "A",
      descriptor = "I"
   )
   private int field10632;
   @OriginalMember(
      owner = "client!sfa",
      name = "cb",
      descriptor = "Lsu;"
   )
   public class224 field10593;
   @OriginalMember(
      owner = "client!sfa",
      name = "B",
      descriptor = "Lig;"
   )
   private class258 field10597;
   @OriginalMember(
      owner = "client!sfa",
      name = "M",
      descriptor = "Lbg;"
   )
   private class492 field10634;
   @OriginalMember(
      owner = "client!sfa",
      name = "G",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field10589;
   @OriginalMember(
      owner = "client!sfa",
      name = "J",
      descriptor = "[F"
   )
   public float[] field10596;
   @OriginalMember(
      owner = "client!sfa",
      name = "X",
      descriptor = "[F"
   )
   public float[] field10626;
   @OriginalMember(
      owner = "client!sfa",
      name = "Y",
      descriptor = "[I"
   )
   public int[] field10633;
   @OriginalMember(
      owner = "client!sfa",
      name = "F",
      descriptor = "[Lnaa;"
   )
   private class79[] field10599;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method546(int[] arg0) {
      arg0[0] = this.field10608;
      arg0[1] = this.field10627;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method542(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      int var6 = arg1 - arg2;
      if (var6 < this.field10620) {
         var6 = this.field10620;
      }

      int var7 = arg1 + arg2 + 1;
      if (var7 > this.field10628) {
         var7 = this.field10628;
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
            if (var64 < this.field10619) {
               var64 = this.field10619;
            }

            int var65 = arg0 + var10;
            if (var65 > this.field10625) {
               var65 = this.field10625;
            }

            int var66 = this.field10608 * var8 + var64;

            for(int var67 = var64; var67 < var65; ++var67) {
               this.field10633[var66++] = arg3;
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
            if (var60 < this.field10619) {
               var60 = this.field10619;
            }

            int var61 = arg0 + var55;
            if (var61 > this.field10625 - 1) {
               var61 = this.field10625 - 1;
            }

            int var62 = this.field10608 * var8 + var60;

            for(int var63 = var60; var63 <= var61; ++var63) {
               this.field10633[var62++] = arg3;
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
            if (var28 < this.field10619) {
               var28 = this.field10619;
            }

            int var29 = arg0 + var10;
            if (var29 > this.field10625) {
               var29 = this.field10625;
            }

            int var30 = this.field10608 * var8 + var28;

            for(int var31 = var28; var31 < var29; ++var31) {
               int var32 = this.field10633[var30];
               int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
               this.field10633[var30++] = var15 + var33;
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
            if (var22 < this.field10619) {
               var22 = this.field10619;
            }

            int var23 = arg0 + var17;
            if (var23 > this.field10625 - 1) {
               var23 = this.field10625 - 1;
            }

            int var24 = this.field10608 * var8 + var22;

            for(int var25 = var22; var25 <= var23; ++var25) {
               int var26 = this.field10633[var24];
               int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
               this.field10633[var24++] = var15 + var27;
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
            if (var47 < this.field10619) {
               var47 = this.field10619;
            }

            int var48 = arg0 + var10;
            if (var48 > this.field10625) {
               var48 = this.field10625;
            }

            int var49 = this.field10608 * var8 + var47;

            for(int var50 = var47; var50 < var48; ++var50) {
               int var51 = this.field10633[var49];
               int var52 = arg3 + var51;
               int var53 = (arg3 & 16711935) + (var51 & 16711935);
               int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
               this.field10633[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
            if (var39 < this.field10619) {
               var39 = this.field10619;
            }

            int var40 = arg0 + var34;
            if (var40 > this.field10625 - 1) {
               var40 = this.field10625 - 1;
            }

            int var41 = this.field10608 * var8 + var39;

            for(int var42 = var39; var42 <= var40; ++var42) {
               int var43 = this.field10633[var41];
               int var44 = arg3 + var43;
               int var45 = (arg3 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               this.field10633[var41++] = var44 - var46 | var46 - (var46 >>> 8);
            }

            ++var8;
            var38 += var35 + var35;
            var37 += var35++ + var35;
         }

      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "I",
      descriptor = "()I"
   )
   public final int method563() {
      int var1 = this.field10604;
      this.field10604 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lus;)V"
   )
   public final void method556(class1 arg0) {
      class258 var2 = (class258)arg0;
      this.field10608 = var2.field3500;
      this.field10627 = var2.field3494;
      this.field10633 = var2.field3504;
      this.field10597 = var2;
      this.field10632 = var2.field3500;
      this.field10606 = var2.field3494;
      this.field10626 = var2.field3498;
      this.method5282();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg2 - arg0;
      int var8 = arg3 - arg1;
      if (var8 == 0) {
         if (var7 >= 0) {
            this.method576(arg0, arg1, var7 + 1, arg4, arg5);
         } else {
            this.method576(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
         }
      } else if (var7 == 0) {
         if (var8 >= 0) {
            this.method520(arg0, arg1, var8 + 1, arg4, arg5);
         } else {
            this.method520(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
            if (arg0 < this.field10619) {
               var10 += (this.field10619 - arg0) * var12;
               arg0 = this.field10619;
            }

            if (var13 >= this.field10625) {
               var13 = this.field10625 - 1;
            }

            int var14 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
               if (arg5 == 1) {
                  int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                  int var16 = 256 - var14;

                  while(arg0 <= var13) {
                     int var17 = var10 >> 16;
                     if (var17 >= this.field10620 && var17 < this.field10628) {
                        int var18 = this.field10608 * var17 + arg0;
                        int var19 = this.field10633[var18];
                        int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                        this.field10633[var18] = var15 + var20;
                     }

                     var10 += var12;
                     ++arg0;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var13) {
                     int var21 = var10 >> 16;
                     if (var21 >= this.field10620 && var21 < this.field10628) {
                        int var22 = this.field10608 * var21 + arg0;
                        int var23 = this.field10633[var22];
                        int var24 = arg4 + var23;
                        int var25 = (arg4 & 16711935) + (var23 & 16711935);
                        int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                        this.field10633[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                  if (var27 >= this.field10620 && var27 < this.field10628) {
                     this.field10633[this.field10608 * var27 + arg0] = arg4;
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
            if (arg1 < this.field10620) {
               var29 += (this.field10620 - arg1) * var31;
               arg1 = this.field10620;
            }

            if (var32 >= this.field10628) {
               var32 = this.field10628 - 1;
            }

            int var33 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg1 <= var32) {
                  int var46 = var29 >> 16;
                  if (var46 >= this.field10619 && var46 < this.field10625) {
                     this.field10633[this.field10608 * arg1 + var46] = arg4;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 1) {
               int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var35 = 256 - var33;

               while(arg1 <= var32) {
                  int var36 = var29 >> 16;
                  if (var36 >= this.field10619 && var36 < this.field10625) {
                     int var37 = this.field10608 * arg1 + var36;
                     int var38 = this.field10633[var37];
                     int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                     this.field10633[this.field10608 * arg1 + var36] = var34 + var39;
                  }

                  var29 += var31;
                  ++arg1;
               }

            } else if (arg5 == 2) {
               while(arg1 <= var32) {
                  int var40 = var29 >> 16;
                  if (var40 >= this.field10619 && var40 < this.field10625) {
                     int var41 = this.field10608 * arg1 + var40;
                     int var42 = this.field10633[var41];
                     int var43 = arg4 + var42;
                     int var44 = (arg4 & 16711935) + (var42 & 16711935);
                     int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                     this.field10633[var41] = var43 - var45 | var45 - (var45 >>> 8);
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
      owner = "client!sfa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method495(int arg0) {
      this.method496(0, 0, this.field10608, this.field10627, arg0, 0);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method604(int arg0) {
      class24.field341 = arg0;
      class24.field361 = arg0;
      if (this.field10611 > 1) {
         throw new IllegalStateException(field10636[3]);
      } else {
         this.method525(this.field10611);
         this.method570(0);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method526() {
      return true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = (float)arg2 * this.field10617.field1953 + (float)arg0 * this.field10617.field1962 + (float)arg1 * this.field10617.field1937 + this.field10617.field1966;
      if (var8 < 1.0F) {
         var8 = 1.0F;
      }

      float var9 = (float)arg5 * this.field10617.field1953 + (float)arg3 * this.field10617.field1962 + (float)arg4 * this.field10617.field1937 + this.field10617.field1966;
      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      if (var8 < (float)this.field10624 && var9 < (float)this.field10624) {
         var7 |= 16;
      } else if (var8 > (float)this.field10610 && var9 > (float)this.field10610) {
         var7 |= 32;
      }

      int var10 = (int)(((float)arg2 * this.field10617.field1952 + (float)arg0 * this.field10617.field1955 + (float)arg1 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / var8);
      int var11 = (int)(((float)arg5 * this.field10617.field1952 + (float)arg3 * this.field10617.field1955 + (float)arg4 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / var9);
      if (var10 < this.field10615 && var11 < this.field10615) {
         var7 |= 1;
      } else if (var10 > this.field10605 && var11 > this.field10605) {
         var7 |= 2;
      }

      int var12 = (int)(((float)arg2 * this.field10617.field1956 + (float)arg0 * this.field10617.field1939 + (float)arg1 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / var8);
      int var13 = (int)(((float)arg5 * this.field10617.field1956 + (float)arg3 * this.field10617.field1939 + (float)arg4 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / var9);
      if (var12 < this.field10631 && var13 < this.field10631) {
         var7 |= 4;
      } else if (var12 > this.field10614 && var13 > this.field10614) {
         var7 |= 8;
      }

      return var7;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "()V"
   )
   public final void method549() {
      if (this.field10589 != null) {
         this.field10633 = this.field10593.field3196;
         this.field10608 = this.field10593.field3197;
         this.field10627 = this.field10593.field3192;
         this.field10626 = this.field10596;
         this.field10632 = this.field10612;
         this.field10606 = this.field10601;
      } else {
         this.field10608 = 1;
         this.field10627 = 1;
         this.field10633 = null;
         this.field10632 = 1;
         this.field10606 = 1;
         this.field10626 = null;
      }

      this.field10597 = null;
      this.method5282();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method506(int arg0, int arg1) {
      class79 var3 = this.method5290(Thread.currentThread());
      this.field10624 = arg0;
      this.field10610 = arg1;
      var3.field983 = this.field10610 - 255;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method554(Canvas arg0) {
      if (this.field10589 == arg0) {
         this.method613((Canvas)null);
      }

      class224 var2 = (class224)this.field10592.method329((byte)-108, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method3165(125);
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "()V"
   )
   public final void method537() {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method583() {
      return true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public final void method532(class521 arg0) {
      this.field10617 = (class148)arg0;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3) {
      class79 var5 = this.method5290(Thread.currentThread());
      var5.field969 = arg0;
      var5.field978 = arg1;
      var5.field980 = arg2;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method614(class438 arg0) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method564() {
      return true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "B",
      descriptor = "()V"
   )
   private final void method5282() {
      for(int var1 = 0; var1 < this.field10611; ++var1) {
         this.field10599[var1].method708(true);
      }

      this.method574();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg2 > 0 && arg3 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = (arg7 << 16) / arg2;
         int var13 = (arg6.length / arg7 << 16) / arg3;
         int var14 = this.field10608 * arg1 + arg0;
         int var15 = this.field10608 - arg2;
         if (arg1 + arg3 > this.field10628) {
            arg3 -= arg1 + arg3 - this.field10628;
         }

         if (arg1 < this.field10620) {
            int var16 = this.field10620 - arg1;
            arg3 -= var16;
            var14 += this.field10608 * var16;
            var11 += var13 * var16;
         }

         if (arg0 + arg2 > this.field10625) {
            int var17 = arg0 + arg2 - this.field10625;
            arg2 -= var17;
            var15 += var17;
         }

         if (arg0 < this.field10619) {
            int var18 = this.field10619 - arg0;
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
                     int var28 = this.field10633[var14];
                     this.field10633[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                        int var34 = this.field10633[var14];
                        int var35 = var33 + var34;
                        int var36 = (var33 & 16711935) + (var34 & 16711935);
                        int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                        this.field10633[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                     this.field10633[var14++] = arg5;
                  } else {
                     this.field10633[var14++] = arg4;
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
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIZ)Lbg;"
   )
   public final class492 method565(int arg0, int arg1, boolean arg2) {
      return arg2 ? new class54(this, arg0, arg1) : new class585(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method613(Canvas arg0) {
      if (arg0 != null) {
         class224 var2 = (class224)this.field10592.method329((byte)122, (long)arg0.hashCode());
         if (var2 != null) {
            this.field10589 = arg0;
            Dimension var3 = arg0.getSize();
            this.field10590 = var3.width;
            this.field10587 = var3.height;
            this.field10593 = var2;
            if (this.field10597 == null) {
               this.field10633 = var2.field3196;
               this.field10608 = var2.field3197;
               this.field10627 = var2.field3192;
               if (this.field10632 != this.field10608 || this.field10627 != this.field10606) {
                  this.field10612 = this.field10632 = this.field10608;
                  this.field10601 = this.field10606 = this.field10627;
                  this.field10596 = this.field10626 = new float[this.field10632 * this.field10606];
               }

               this.method5282();
               return;
            }
         }
      } else {
         this.field10589 = null;
         this.field10593 = null;
         if (this.field10597 == null) {
            this.field10633 = null;
            this.field10608 = this.field10627 = 1;
            this.field10632 = this.field10606 = 1;
            this.method5282();
         }
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(I)Lza;"
   )
   public final class438 method594(int arg0) {
      return null;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method534(float arg0) {
      this.field10630 = (int)(arg0 * 65535.0F);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Loea;IIII)V"
   )
   private final void method5283(class624 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = arg0.field9179;
      int var8 = arg4 << 1;
      if (var6 == -1) {
         this.method5287(arg1, arg2, arg3, arg4, arg0.field9175, 1);
      } else {
         if (this.field10635 != var6) {
            class492 var9 = (class492)this.field10616.method725(0, (long)var6);
            if (var9 == null) {
               int[] var10 = this.method5298(var6);
               if (var10 == null) {
                  return;
               }

               int var11 = this.method5297(var6) ? 64 : this.field10602;
               var9 = this.method548(-19069, var11, var10, var11, var11, 0);
               this.field10616.method723(0, (long)var6, var9);
            }

            this.field10635 = var6;
            this.field10634 = var9;
         }

         ++var8;
         ((class120)this.field10634).method421(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field9175, 1, 1);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method499(Canvas arg0, int arg1, int arg2) {
      class224 var4 = (class224)this.field10592.method329((byte)-111, (long)arg0.hashCode());
      if (var4 == null) {
         class224 var5 = class436.method3217((byte)-87, arg1, arg0, arg2);
         this.field10592.method336(-1, (long)arg0.hashCode(), var5);
      } else {
         if (var4.field3197 != arg1 || var4.field3192 != arg2) {
            this.method588(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      float var8 = (float)arg2 * this.field10617.field1953 + (float)arg0 * this.field10617.field1962 + (float)arg1 * this.field10617.field1937 + this.field10617.field1966;
      float var9 = (float)arg5 * this.field10617.field1953 + (float)arg3 * this.field10617.field1962 + (float)arg4 * this.field10617.field1937 + this.field10617.field1966;
      int var10 = 0;
      if (var8 < (float)this.field10624 && var9 < (float)this.field10624) {
         var10 |= 16;
      } else if (var8 > (float)this.field10610 && var9 > (float)this.field10610) {
         var10 |= 32;
      }

      int var11 = (int)(((float)arg2 * this.field10617.field1952 + (float)arg0 * this.field10617.field1955 + (float)arg1 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / (float)arg6);
      int var12 = (int)(((float)arg5 * this.field10617.field1952 + (float)arg3 * this.field10617.field1955 + (float)arg4 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / (float)arg6);
      if (var11 < this.field10615 && var12 < this.field10615) {
         var10 |= 1;
      } else if (var11 > this.field10605 && var12 > this.field10605) {
         var10 |= 2;
      }

      int var13 = (int)(((float)arg2 * this.field10617.field1956 + (float)arg0 * this.field10617.field1939 + (float)arg1 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / (float)arg6);
      int var14 = (int)(((float)arg5 * this.field10617.field1956 + (float)arg3 * this.field10617.field1939 + (float)arg4 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / (float)arg6);
      if (var13 < this.field10631 && var14 < this.field10631) {
         var10 |= 4;
      } else if (var13 > this.field10614 && var14 > this.field10614) {
         var10 |= 8;
      }

      return var10;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < this.field10619) {
         arg2 -= this.field10619 - arg0;
         arg0 = this.field10619;
      }

      if (arg1 < this.field10620) {
         arg3 -= this.field10620 - arg1;
         arg1 = this.field10620;
      }

      if (arg0 + arg2 > this.field10625) {
         arg2 = this.field10625 - arg0;
      }

      if (arg1 + arg3 > this.field10628) {
         arg3 = this.field10628 - arg1;
      }

      if (arg2 > 0 && arg3 > 0 && arg0 <= this.field10625 && arg1 <= this.field10628) {
         int var7 = this.field10608 - arg2;
         int var8 = this.field10608 * arg1 + arg0;
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
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     ++var24;
                     this.field10633[var24] = arg4;
                     --var26;
                  } while(var26 > 0);
               }

               if (var23 > 0) {
                  int var27 = var23;

                  do {
                     ++var24;
                     this.field10633[var24] = arg4;
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
                  int var14 = this.field10633[var8];
                  int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                  this.field10633[var8++] = var10 + var15;
               }

               var8 += var7;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            for(int var16 = 0; var16 < arg3; ++var16) {
               for(int var17 = -arg2; var17 < 0; ++var17) {
                  int var18 = this.field10633[var8];
                  int var19 = arg4 + var18;
                  int var20 = (arg4 & 16711935) + (var18 & 16711935);
                  int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                  this.field10633[var8++] = var19 - var21 | var21 - (var21 >>> 8);
               }

               var8 += var7;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method612(int arg0, int arg1, int arg2, int arg3, double arg4) {
      int var7 = this.field10632 - arg2;
      int var8 = this.field10632 * arg1 + arg0;
      float[] var9 = this.field10626;
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
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lio;IIII)Lka;"
   )
   public final class500 method555(class464 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class24(this, arg0, arg1, arg3, arg4, arg2);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 >= this.field10619 && arg0 < this.field10625) {
         if (arg1 < this.field10620) {
            arg2 -= this.field10620 - arg1;
            arg1 = this.field10620;
         }

         if (arg1 + arg2 > this.field10628) {
            arg2 = this.field10628 - arg1;
         }

         int var6 = this.field10608 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10608 * var10 + var6;
                  int var12 = this.field10633[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field10633[var11] = var8 + var13;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field10608 * var14 + var6;
                  int var16 = this.field10633[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field10633[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }

            }
         } else {
            for(int var20 = 0; var20 < arg2; ++var20) {
               this.field10633[this.field10608 * var20 + var6] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method5284(int arg0) {
      return super.field802.method1354(arg0, (byte)-109).field4314 & 65535;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method536(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field10599.length; ++var5) {
         this.field10599[var5].field972 = this.field10599[var5].field978;
         this.field10599[var5].field969 = arg0;
         this.field10599[var5].field978 = arg1;
         this.field10599[var5].field980 = arg2;
         this.field10599[var5].field976 = true;
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "v",
      descriptor = "()V"
   )
   public final void method544() {
      if (this.field10594) {
         class165.method1365(-126, false, true);
         this.field10594 = false;
      }

      this.field10593 = null;
      this.field10589 = null;
      this.field10590 = 0;
      this.field10587 = 0;
      this.field10592 = null;
      this.field10591 = true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "()Lew;"
   )
   public final class521 method596() {
      return new class148();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class515 method602(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class701(arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg1 >= this.field10620 && arg1 < this.field10628) {
         if (arg0 < this.field10619) {
            arg2 -= this.field10619 - arg0;
            arg0 = this.field10619;
         }

         if (arg0 + arg2 > this.field10625) {
            arg2 = this.field10625 - arg0;
         }

         int var6 = this.field10608 * arg1 + arg0;
         int var7 = arg3 >>> 24;
         if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
            if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10633[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field10633[var6 + var10] = var8 + var12;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field10633[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field10633[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }

            }
         } else {
            for(int var18 = 0; var18 < arg2; ++var18) {
               this.field10633[var6 + var18] = arg3;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method5285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field802.method1354(arg6, (byte)-109).field4328) {
            if (this.field10635 != arg6) {
               class492 var11 = (class492)this.field10616.method725(0, (long)arg6);
               if (var11 == null) {
                  int[] var12 = this.method5298(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method5297(arg6) ? 64 : this.field10602;
                  var11 = this.method548(-19069, var13, var12, var13, var13, 0);
                  this.field10616.method723(0, (long)arg6, var11);
               }

               this.field10635 = arg6;
               this.field10634 = var11;
            }

            ((class120)this.field10634).method425(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method5287(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method590(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field10599.length; ++var4) {
         class79 var5 = this.field10599[var4];
         var5.field978 = arg0 & 16777215;
         int var6 = var5.field978 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field978 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field978 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field978 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field973 = false;
         } else {
            var5.field973 = true;
         }
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "la",
      descriptor = "()V"
   )
   public final void method574() {
      this.field10619 = 0;
      this.field10620 = 0;
      this.field10625 = this.field10608;
      this.field10628 = this.field10627;
      this.method5296();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method558() {
      return new int[]{this.field10621, this.field10622, this.field10629, this.field10609};
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIII)Llc;"
   )
   public final class676 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lst;Luu;)Lus;"
   )
   public final class1 method529(class461 arg0, class302 arg1) {
      return new class258(this, (class492)arg0, (class452)arg1);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "n",
      descriptor = "(I)Z"
   )
   public final boolean method5286(int arg0) {
      return super.field802.method1353(arg0, (byte)127);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method508() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field10617.field1953 + (float)arg0 * this.field10617.field1962 + (float)arg1 * this.field10617.field1937 + this.field10617.field1966;
      if (!(var5 < (float)this.field10624) && !(var5 > (float)this.field10610)) {
         int var6 = (int)(((float)arg2 * this.field10617.field1952 + (float)arg0 * this.field10617.field1955 + (float)arg1 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / var5);
         int var7 = (int)(((float)arg2 * this.field10617.field1956 + (float)arg0 * this.field10617.field1939 + (float)arg1 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / var5);
         if (var6 >= this.field10615 && var6 <= this.field10605 && var7 >= this.field10631 && var7 <= this.field10614) {
            arg3[0] = var6 - this.field10615;
            arg3[1] = var7 - this.field10631;
            arg3[2] = (int)var5;
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } else {
         arg3[0] = arg3[1] = arg3[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   private final void method5287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg3 < 0) {
         arg3 = -arg3;
      }

      int var7 = arg1 - arg3;
      if (var7 < this.field10620) {
         var7 = this.field10620;
      }

      int var8 = arg1 + arg3 + 1;
      if (var8 > this.field10628) {
         var8 = this.field10628;
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
            if (var65 < this.field10619) {
               var65 = this.field10619;
            }

            int var66 = arg0 + var11;
            if (var66 > this.field10625) {
               var66 = this.field10625;
            }

            int var67 = this.field10608 * var9 + var65;

            for(int var68 = var65; var68 < var66; ++var68) {
               if ((float)arg2 < this.field10626[var67]) {
                  this.field10633[var67] = arg4;
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
            if (var61 < this.field10619) {
               var61 = this.field10619;
            }

            int var62 = arg0 + var56;
            if (var62 > this.field10625 - 1) {
               var62 = this.field10625 - 1;
            }

            int var63 = this.field10608 * var9 + var61;

            for(int var64 = var61; var64 <= var62; ++var64) {
               if ((float)arg2 < this.field10626[var63]) {
                  this.field10633[var63] = arg4;
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
            if (var29 < this.field10619) {
               var29 = this.field10619;
            }

            int var30 = arg0 + var11;
            if (var30 > this.field10625) {
               var30 = this.field10625;
            }

            int var31 = this.field10608 * var9 + var29;

            for(int var32 = var29; var32 < var30; ++var32) {
               if ((float)arg2 < this.field10626[var31]) {
                  int var33 = this.field10633[var31];
                  int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                  this.field10633[var31] = var16 + var34;
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
            if (var23 < this.field10619) {
               var23 = this.field10619;
            }

            int var24 = arg0 + var18;
            if (var24 > this.field10625 - 1) {
               var24 = this.field10625 - 1;
            }

            int var25 = this.field10608 * var9 + var23;

            for(int var26 = var23; var26 <= var24; ++var26) {
               if ((float)arg2 < this.field10626[var25]) {
                  int var27 = this.field10633[var25];
                  int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                  this.field10633[var25] = var16 + var28;
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
            if (var48 < this.field10619) {
               var48 = this.field10619;
            }

            int var49 = arg0 + var11;
            if (var49 > this.field10625) {
               var49 = this.field10625;
            }

            int var50 = this.field10608 * var9 + var48;

            for(int var51 = var48; var51 < var49; ++var51) {
               if ((float)arg2 < this.field10626[var50]) {
                  int var52 = this.field10633[var50];
                  int var53 = arg4 + var52;
                  int var54 = (arg4 & 16711935) + (var52 & 16711935);
                  int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                  this.field10633[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
            if (var40 < this.field10619) {
               var40 = this.field10619;
            }

            int var41 = arg0 + var35;
            if (var41 > this.field10625 - 1) {
               var41 = this.field10625 - 1;
            }

            int var42 = this.field10608 * var9 + var40;

            for(int var43 = var40; var43 <= var41; ++var43) {
               if ((float)arg2 < this.field10626[var42]) {
                  int var44 = this.field10633[var42];
                  int var45 = arg4 + var44;
                  int var46 = (arg4 & 16711935) + (var44 & 16711935);
                  int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                  this.field10633[var42] = var45 - var47 | var47 - (var47 >>> 8);
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
      owner = "client!sfa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3) {
      this.field10621 = arg0;
      this.field10622 = arg1;
      this.field10629 = arg2;
      this.field10609 = arg3;
      this.method5296();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method575(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I[Lmn;)V"
   )
   public final void method553(int arg0, class389[] arg1) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "M",
      descriptor = "()I"
   )
   public final int method524() {
      int var1 = this.field10595;
      this.field10595 = 0;
      return var1;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method528() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method538() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "ya",
      descriptor = "()V"
   )
   public final void method523() {
      if (this.field10619 == 0 && this.field10625 == this.field10608 && this.field10620 == 0 && this.field10628 == this.field10627) {
         int var1 = this.field10626.length;
         int var2 = var1 - (var1 & 7);
         int var3 = 0;

         while(var3 < var2) {
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
            this.field10626[var3++] = 2.1474836E9F;
         }

         while(var3 < var1) {
            this.field10626[var3++] = 2.1474836E9F;
         }

      } else {
         int var4 = this.field10625 - this.field10619;
         int var5 = this.field10628 - this.field10620;
         int var6 = this.field10608 - var4;
         int var7 = this.field10620 * this.field10608 + this.field10619;
         int var8 = var4 >> 3;
         int var9 = var4 & 7;
         int var10 = var7 - 1;

         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var8 > 0) {
               int var12 = var8;

               do {
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  --var12;
               } while(var12 > 0);
            }

            if (var9 > 0) {
               int var13 = var9;

               do {
                  ++var10;
                  this.field10626[var10] = 2.1474836E9F;
                  --var13;
               } while(var13 > 0);
            }

            var10 += var6;
         }

      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "t",
      descriptor = "()Lew;"
   )
   public final class521 method598() {
      class79 var1 = this.method5290(Thread.currentThread());
      return var1.field970;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method606() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method570(int arg0) {
      this.field10599[arg0].method711(93, Thread.currentThread());
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method527(int arg0, class515 arg1, int arg2, int arg3) {
      class701 var5 = (class701)arg1;
      int[] var6 = var5.field10256;
      int[] var7 = var5.field10255;
      int var8;
      if (this.field10628 < var6.length + arg3) {
         var8 = this.field10628 - arg3;
      } else {
         var8 = var6.length;
      }

      int var9;
      if (this.field10620 > arg3) {
         var9 = this.field10620 - arg3;
         arg3 = this.field10620;
      } else {
         var9 = 0;
      }

      if (var8 - var9 > 0) {
         int var10 = this.field10608 * arg3;

         for(int var11 = var9; var11 < var8; ++var11) {
            int var12 = var6[var11] + arg2;
            int var13 = var7[var11];
            if (this.field10619 > var12) {
               var13 -= this.field10619 - var12;
               var12 = this.field10619;
            }

            if (this.field10625 < var12 + var13) {
               var13 = this.field10625 - var12;
            }

            int var14 = var10 + var12;

            for(int var15 = -var13; var15 < 0; ++var15) {
               this.field10633[var14++] = arg0;
            }

            var10 += this.field10608;
         }

      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field10608) {
         arg2 = this.field10608;
      }

      if (arg3 > this.field10627) {
         arg3 = this.field10627;
      }

      this.field10619 = arg0;
      this.field10625 = arg2;
      this.field10620 = arg1;
      this.field10628 = arg3;
      this.method5296();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "pa",
      descriptor = "()V"
   )
   public final void method518() {
      for(int var1 = 0; var1 < this.field10599.length; ++var1) {
         this.field10599[var1].field978 = this.field10599[var1].field972;
         this.field10599[var1].field976 = false;
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method611(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 - arg0;
      int var11 = arg3 - arg1;
      if (var11 == 0) {
         if (var10 >= 0) {
            this.method5294(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var12 = arg6 + arg7;
            int var13 = arg8 % var12;
            int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
            int var15 = var14 % var12;
            if (var15 < 0) {
               var15 += var12;
            }

            this.method5294(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
         }
      } else if (var10 == 0) {
         if (var11 >= 0) {
            this.method5289(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
         } else {
            int var16 = arg6 + arg7;
            int var17 = arg8 % var16;
            int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
            int var19 = var18 % var16;
            if (var19 < 0) {
               var19 += var16;
            }

            this.method5289(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                     if (arg0 >= this.field10619 && arg0 < this.field10625 && var37 >= this.field10620 && var37 < this.field10628 && var24 < var21) {
                        int var38 = this.field10608 * var37 + arg0;
                        int var39 = this.field10633[var38];
                        int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                        this.field10633[var38] = var35 + var40;
                     }

                     var29 += var31;
                     ++arg0;
                     int var41 = var24 + var34;
                     var24 = var41 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg0 <= var32) {
                     int var42 = var29 >> 16;
                     if (arg0 >= this.field10619 && arg0 < this.field10625 && var42 >= this.field10620 && var42 < this.field10628 && var24 < var21) {
                        int var43 = this.field10608 * var42 + arg0;
                        int var44 = this.field10633[var43];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field10633[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                  if (arg0 >= this.field10619 && arg0 < this.field10625 && var49 >= this.field10620 && var49 < this.field10628 && var24 < var21) {
                     this.field10633[this.field10608 * var49 + arg0] = arg4;
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
                     if (arg1 >= this.field10620 && arg1 < this.field10628 && var60 >= this.field10619 && var60 < this.field10625 && var24 < var21) {
                        int var61 = this.field10608 * arg1 + var60;
                        int var62 = this.field10633[var61];
                        int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                        this.field10633[this.field10608 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }

               } else if (arg5 == 2) {
                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field10620 && arg1 < this.field10628 && var65 >= this.field10619 && var65 < this.field10625 && var24 < var21) {
                        int var66 = this.field10608 * arg1 + var65;
                        int var67 = this.field10633[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field10633[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                  if (arg1 >= this.field10620 && arg1 < this.field10628 && var72 >= this.field10619 && var72 < this.field10625 && var24 < var21) {
                     this.field10633[this.field10608 * arg1 + var72] = arg4;
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
      owner = "client!sfa",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method507() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(IIIIIIIIII)V"
   )
   public final void method5288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 != 0 && arg4 != 0) {
         if (arg6 != 65535 && !super.field802.method1354(arg6, (byte)-109).field4328) {
            if (this.field10635 != arg6) {
               class492 var11 = (class492)this.field10616.method725(0, (long)arg6);
               if (var11 == null) {
                  int[] var12 = this.method5298(arg6);
                  if (var12 == null) {
                     return;
                  }

                  int var13 = this.method5297(arg6) ? 64 : this.field10602;
                  var11 = this.method548(-19069, var13, var12, var13, var13, 0);
                  this.field10616.method723(0, (long)arg6, var11);
               }

               this.field10635 = arg6;
               this.field10634 = var11;
            }

            ((class120)this.field10634).method421(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
         } else {
            this.method5287(arg0, arg1, arg2, arg3, arg7, arg9);
         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIF)Lmn;"
   )
   public final class389 method509(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "i",
      descriptor = "()I"
   )
   public final int method595() {
      return this.field10624;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method521(int arg0, int arg1) {
      int var3 = this.field10608 * arg1 + arg0;
      int var4 = this.field10632 * arg1 + arg0;
      if (var3 != 0 || var4 != 0) {
         int[] var5 = this.field10633;
         float[] var6 = this.field10626;
         if (var3 < 0) {
            int var7 = var5.length + var3;
            class242.method1853(var5, -var3, var5, 0, var7);
         } else if (var3 > 0) {
            int var8 = var5.length - var3;
            class242.method1853(var5, 0, var5, var3, var8);
         }

         if (var4 < 0) {
            int var9 = var6.length + var4;
            class242.method1852(var6, -var4, var6, 0, var9);
         } else {
            if (var4 > 0) {
               int var10 = var6.length - var4;
               class242.method1852(var6, 0, var6, var4, var10);
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "h",
      descriptor = "()V"
   )
   public final void method510() {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(IIIIIIII)V"
   )
   private final void method5289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 >= this.field10619 && arg0 < this.field10625) {
         int var9 = this.field10608 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field10620 && arg1 + var15 < this.field10628 && var12 < arg5) {
                     int var16 = this.field10608 * var15 + var9;
                     int var17 = this.field10633[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field10633[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field10620 && arg1 + var19 < this.field10628 && var12 < arg5) {
                     int var20 = this.field10608 * var19 + var9;
                     int var21 = this.field10633[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field10633[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
               if (arg1 + var25 >= this.field10620 && arg1 + var25 < this.field10628 && var12 < arg5) {
                  this.field10633[this.field10608 * var25 + var9] = arg3;
               }

               ++var25;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
      float var5 = (float)arg2 * this.field10617.field1953 + (float)arg0 * this.field10617.field1962 + (float)arg1 * this.field10617.field1937 + this.field10617.field1966;
      if (var5 == 0.0F) {
         arg3[0] = arg3[1] = arg3[2] = -1;
      } else {
         int var6 = (int)(((float)arg2 * this.field10617.field1952 + (float)arg0 * this.field10617.field1955 + (float)arg1 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / var5);
         int var7 = (int)(((float)arg2 * this.field10617.field1956 + (float)arg0 * this.field10617.field1939 + (float)arg1 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / var5);
         arg3[0] = var6 - this.field10615;
         arg3[1] = var7 - this.field10631;
         arg3[2] = (int)var5;
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;)Lnaa;"
   )
   public final class79 method5290(Runnable arg0) {
      for(int var2 = 0; var2 < this.field10611; ++var2) {
         if (this.field10599[var2].field975 == arg0) {
            return this.field10599[var2];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(II)Luu;"
   )
   public final class302 method498(int arg0, int arg1) {
      return new class452(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method597(int arg0) {
      int var2 = arg0 - this.field10588;

      for(Object var3 = this.field10618.method720(-85); var3 != null; var3 = this.field10618.method724(5394)) {
         class406 var4 = (class406)var3;
         if (var4.field5868) {
            var4.field5865 += var2;
            int var5 = var4.field5865 / 20;
            if (var5 > 0) {
               class317 var6 = super.field802.method1354(var4.field5867, (byte)-109);
               var4.method3062(var6.field4326 * var2 * 50 / 1000, var6.field4327 * var2 * 50 / 1000);
               var4.field5865 -= var5 * 20;
            }

            var4.field5868 = false;
         }
      }

      this.field10588 = arg0;
      this.field10616.method726(5, 25324);
      this.field10618.method726(5, 25324);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "o",
      descriptor = "()Lew;"
   )
   public final class521 method600() {
      return this.field10617;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lrha;I)V"
   )
   public final void method535(class234 arg0, int arg1) {
      class79 var3 = this.method5290(Thread.currentThread());
      class390 var4 = arg0.field3266.field9801;

      for(class390 var5 = var4.field5653; var4 != var5; var5 = var5.field5653) {
         class624 var6 = (class624)var5;
         int var7 = var6.field9180 >> 12;
         int var8 = var6.field9172 >> 12;
         int var9 = var6.field9174 >> 12;
         float var10 = (float)var9 * this.field10617.field1953 + (float)var7 * this.field10617.field1962 + (float)var8 * this.field10617.field1937 + this.field10617.field1966;
         if (!(var10 < (float)this.field10624) && !(var10 > (float)var3.field983)) {
            int var11 = (int)(((float)var9 * this.field10617.field1952 + (float)var7 * this.field10617.field1955 + (float)var8 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / (float)arg1) + this.field10621;
            int var12 = (int)(((float)var9 * this.field10617.field1956 + (float)var7 * this.field10617.field1939 + (float)var8 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / (float)arg1) + this.field10622;
            if (var11 >= this.field10619 && var11 <= this.field10625 && var12 >= this.field10620 && var12 <= this.field10628) {
               if (var10 == 0.0F) {
                  var10 = 1.0F;
               }

               this.method5283(var6, var11, var12, (int)var10, (this.field10629 * var6.field9181 >> 12) / arg1);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method511() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method588(Canvas arg0, int arg1, int arg2) {
      class224 var4 = (class224)this.field10592.method329((byte)-122, (long)arg0.hashCode());
      if (var4 != null) {
         var4.method3165(122);
         class224 var5 = class436.method3217((byte)-92, arg1, arg0, arg2);
         this.field10592.method336(-1, (long)arg0.hashCode(), var5);
         if (this.field10589 == arg0 && this.field10597 == null) {
            Dimension var6 = arg0.getSize();
            this.field10590 = var6.width;
            this.field10587 = var6.height;
            this.field10593 = var5;
            this.field10633 = var5.field3196;
            this.field10608 = var5.field3197;
            this.field10627 = var5.field3192;
            if (this.field10632 != this.field10608 || this.field10627 != this.field10606) {
               this.field10612 = this.field10632 = this.field10608;
               this.field10601 = this.field10606 = this.field10627;
               this.field10596 = this.field10626 = new float[this.field10632 * this.field10606];
            }

            this.method5282();
         }
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lru;[Lmha;Z)Lda;"
   )
   public final class67 method502(class206 arg0, class439[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field6269;
         var5[var7] = arg1[var7].field6267;
         if (arg1[var7].field6270 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class795(this, arg0, arg1, var4, var5);
         } else {
            return new class233(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class28(this, arg0, arg1, var4, var5);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method493(boolean arg0) {
      class79 var2 = this.method5290(Thread.currentThread());
      var2.field984 = arg0;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class726(Canvas arg0, class162 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method499(arg0, arg2, arg3);
         this.method613(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method567((byte)-105);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method547(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10619 < arg0) {
         this.field10619 = arg0;
      }

      if (this.field10620 < arg1) {
         this.field10620 = arg1;
      }

      if (this.field10625 > arg2) {
         this.field10625 = arg2;
      }

      if (this.field10628 > arg3) {
         this.field10628 = arg3;
      }

      this.method5296();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5291(int arg0) {
      return super.field802.method1354(arg0, (byte)-109).field4319;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method601(int arg0) {
      this.field10599[arg0].method711(114, (Runnable)null);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "()V"
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "(I)[I"
   )
   public final int[] method5292(int arg0) {
      class80 var2 = this.field10618;
      class406 var3;
      synchronized(this.field10618) {
         var3 = (class406)this.field10618.method725(0, (long)arg0);
         if (var3 == null) {
            if (!super.field802.method1353(arg0, (byte)127)) {
               return null;
            }

            class317 var5 = super.field802.method1354(arg0, (byte)-109);
            int var6 = !var5.field4318 && !this.field10607 ? this.field10602 : 64;
            var3 = new class406(arg0, var6, super.field802.method1350(0.7F, arg0, var6, var6, (byte)61, true), var5.field4319 != 1);
            this.field10618.method723(0, (long)arg0, var3);
         }
      }

      var3.field5868 = true;
      return var3.method3063();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   private class726(class162 arg0) {
      super(arg0);
      this.field10591 = false;
      this.field10594 = false;
      this.field10592 = new class37(4);
      this.field10613 = 78642;
      this.field10602 = 128;
      this.field10595 = 0;
      this.field10610 = 3500;
      this.field10607 = false;
      this.field10604 = 0;
      this.field10603 = 45823;
      this.field10619 = 0;
      this.field10609 = 512;
      this.field10628 = 0;
      this.field10620 = 0;
      this.field10630 = 75518;
      this.field10629 = 512;
      this.field10625 = 0;
      this.field10624 = 50;
      this.field10616 = new class80(16);
      this.field10635 = -1;

      try {
         this.field10618 = new class80(256);
         this.field10617 = new class148();
         this.method525(1);
         this.method570(0);
         class733.method5333(true, 127, true);
         this.field10594 = true;
         this.field10588 = (int)class133.method1054(-29025);
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method567((byte)-109);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8) {
      class701 var10 = (class701)arg6;
      int[] var11 = var10.field10256;
      int[] var12 = var10.field10255;
      int var13 = this.field10620 > arg8 ? this.field10620 : arg8;
      int var14 = this.field10628 < var11.length + arg8 ? this.field10628 : var11.length + arg8;
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
         if (arg0 < this.field10619) {
            var18 += (this.field10619 - arg0) * var20;
            arg0 = this.field10619;
         }

         if (var21 >= this.field10625) {
            var21 = this.field10625 - 1;
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
                        int var28 = this.field10608 * var25 + arg0;
                        int var29 = this.field10633[var28];
                        int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                        this.field10633[var28] = var23 + var30;
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
                        int var34 = this.field10608 * var31 + arg0;
                        int var35 = this.field10633[var34];
                        int var36 = arg4 + var35;
                        int var37 = (arg4 & 16711935) + (var35 & 16711935);
                        int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                        this.field10633[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                     this.field10633[this.field10608 * var39 + arg0] = arg4;
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
               if (var64 >= this.field10619 && var64 < this.field10625 && var64 >= var66 && var64 < var12[var65] + var66) {
                  this.field10633[this.field10608 * arg1 + var64] = arg4;
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
               if (var50 >= this.field10619 && var50 < this.field10625 && var50 >= var52 && var50 < var12[var51] + var52) {
                  int var53 = this.field10608 * arg1 + var50;
                  int var54 = this.field10633[var53];
                  int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                  this.field10633[this.field10608 * arg1 + var50] = var48 + var55;
               }

               var43 += var45;
               ++arg1;
            }

         } else if (arg5 == 2) {
            while(arg1 <= var46) {
               int var56 = var43 >> 16;
               int var57 = arg1 - arg8;
               int var58 = var11[var57] + arg7;
               if (var56 >= this.field10619 && var56 < this.field10625 && var56 >= var58 && var56 < var12[var57] + var58) {
                  int var59 = this.field10608 * arg1 + var56;
                  int var60 = this.field10633[var59];
                  int var61 = arg4 + var60;
                  int var62 = (arg4 & 16711935) + (var60 & 16711935);
                  int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                  this.field10633[var59] = var61 - var63 | var63 - (var63 >>> 8);
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
      owner = "client!sfa",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method571() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "l",
      descriptor = "(I)Z"
   )
   public final boolean method5293(int arg0) {
      return super.field802.method1354(arg0, (byte)-109).field4309 || super.field802.method1354(arg0, (byte)-109).field4313;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method517(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = 0;

      for(int var7 = 0; var7 < arg3; ++var7) {
         int var8 = (arg1 + var7) * this.field10608 + arg0;

         for(int var9 = 0; var9 < arg2; ++var9) {
            var5[var6++] = this.field10633[var8 + var9];
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method569() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   private final void method5294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 >= this.field10620 && arg1 < this.field10628) {
         int var9 = this.field10608 * arg1 + arg0;
         int var10 = arg3 >>> 24;
         int var11 = arg5 + arg6;
         int var12 = arg7 % var11;
         if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
            if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field10619 && arg0 + var15 < this.field10625 && var12 < arg5) {
                     int var16 = this.field10633[var9 + var15];
                     int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                     this.field10633[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }

            } else if (arg4 == 2) {
               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field10619 && arg0 + var18 < this.field10625 && var12 < arg5) {
                     int var19 = this.field10633[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field10633[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
               if (arg0 + var23 >= this.field10619 && arg0 + var23 < this.field10625 && var12 < arg5) {
                  this.field10633[var9 + var23] = arg3;
               }

               ++var23;
               ++var12;
               var12 %= var11;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "()I"
   )
   public final int method593() {
      return 0;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(II)Lst;"
   )
   public final class461 method513(int arg0, int arg1) {
      return this.method565(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIZ)Lbg;"
   )
   public final class492 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int[] var6 = new int[arg2 * arg3];
      int var7 = this.field10608 * arg1 + arg0;
      int var8 = this.field10608 - arg2;

      for(int var9 = 0; var9 < arg3; ++var9) {
         int var10 = arg2 * var9;

         for(int var11 = 0; var11 < arg2; ++var11) {
            var6[var10 + var11] = this.field10633[var7++];
         }

         var7 += var8;
      }

      if (arg4) {
         return new class54(this, var6, arg2, arg3);
      } else {
         return new class585(this, var6, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method582(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field10603 = (int)(arg1 * 65535.0F);
      this.field10613 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field10598 = (int)(arg3 * 65535.0F / var7);
      this.field10623 = (int)(arg4 * 65535.0F / var7);
      this.field10600 = (int)(arg5 * 65535.0F / var7);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method572(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "XA",
      descriptor = "()I"
   )
   public final int method504() {
      return this.field10610;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Llc;)V"
   )
   public final void method561(class676 arg0) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method531(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lmha;Z)Lbg;"
   )
   public final class492 method500(class439 arg0, boolean arg1) {
      int[] var3 = arg0.field6264;
      byte[] var4 = arg0.field6268;
      int var5 = arg0.field6269;
      int var6 = arg0.field6267;
      class120 var11;
      if (arg1 && arg0.field6270 == null) {
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

         var11 = new class440(this, var8, var7, var5, var6);
      } else {
         int[] var14 = new int[var5 * var6];
         byte[] var15 = arg0.field6270;
         if (var15 != null) {
            for(int var16 = 0; var16 < var6; ++var16) {
               int var17 = var5 * var16;

               for(int var18 = 0; var18 < var5; ++var18) {
                  var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
               }
            }

            var11 = new class54(this, var14, var5, var6);
         } else {
            for(int var19 = 0; var19 < var6; ++var19) {
               int var20 = var5 * var19;

               for(int var21 = 0; var21 < var5; ++var21) {
                  int var22 = var3[var4[var20 + var21] & 255];
                  var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
               }
            }

            var11 = new class585(this, var14, var5, var6);
         }
      }

      var11.method961(arg0.field6265, arg0.field6262, arg0.field6266, arg0.field6263);
      return var11;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method576(arg0, arg1, arg2, arg4, arg5);
      this.method576(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method520(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method520(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "A",
      descriptor = "()Ljr;"
   )
   public final class122 method573() {
      return new class122(0, field10636[2], 1, field10636[1], 0L);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method530(int arg0) {
      this.field10602 = arg0;
      this.field10618.method731(0);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method587(int arg0) {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Llc;Llc;FLlc;)Llc;"
   )
   public final class676 method540(class676 arg0, class676 arg1, float arg2, class676 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method605(int[] arg0) {
      arg0[0] = this.field10619;
      arg0[1] = this.field10620;
      arg0[2] = this.field10625;
      arg0[3] = this.field10628;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method505() {
      return true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class411(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      float var6 = (float)arg2 * this.field10617.field1953 + (float)arg0 * this.field10617.field1962 + (float)arg1 * this.field10617.field1937 + this.field10617.field1966;
      if (!(var6 < (float)this.field10624) && !(var6 > (float)this.field10610)) {
         int var7 = (int)(((float)arg2 * this.field10617.field1952 + (float)arg0 * this.field10617.field1955 + (float)arg1 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / (float)arg3);
         int var8 = (int)(((float)arg2 * this.field10617.field1956 + (float)arg0 * this.field10617.field1939 + (float)arg1 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / (float)arg3);
         if (var7 >= this.field10615 && var7 <= this.field10605 && var8 >= this.field10631 && var8 <= this.field10614) {
            arg4[0] = var7 - this.field10615;
            arg4[1] = var8 - this.field10631;
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } else {
         arg4[0] = arg4[1] = arg4[2] = -1;
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "C",
      descriptor = "()Z"
   )
   public final boolean method5295() {
      return this.field10591;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class79 var8 = this.method5290(Thread.currentThread());
      class567 var9 = var8.field994;
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
         int var23 = arg0 - var9.method4039();
         int var24 = arg1 - var9.method4053();
         int var25 = var19 + var23;
         int var26 = var23 - var20;
         int var27 = var17 + var23 - var20;
         int var28 = var17 + var23 + var19;
         int var29 = var21 + var24;
         int var30 = var24 - var22;
         int var31 = var18 + var24 - var22;
         int var32 = var18 + var24 + var21;
         if (arg6 == 0) {
            var9.field8090 = 0;
         } else {
            if (arg6 != 1) {
               throw new IllegalArgumentException();
            }

            var9.field8090 = 255 - (arg4 >>> 24);
         }

         this.method493(false);
         var9.field8082 = var25 < 0 || var25 > var9.field8088 || var26 < 0 || var26 > var9.field8088 || var27 < 0 || var27 > var9.field8088;
         var9.method4041((float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
         var9.field8082 = var25 < 0 || var25 > var9.field8088 || var27 < 0 || var27 > var9.field8088 || var28 < 0 || var28 > var9.field8088;
         var9.method4041((float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
         this.method493(true);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method516(boolean arg0) {
      this.field10607 = arg0;
      this.field10618.method731(0);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "g",
      descriptor = "()V"
   )
   private final void method5296() {
      this.field10615 = this.field10619 - this.field10621;
      this.field10605 = this.field10625 - this.field10621;
      this.field10631 = this.field10620 - this.field10622;
      this.field10614 = this.field10628 - this.field10622;

      for(int var1 = 0; var1 < this.field10611; ++var1) {
         class567 var5 = this.field10599[var1].field994;
         var5.field8091 = this.field10621 - this.field10619;
         var5.field8096 = this.field10622 - this.field10620;
         var5.field8088 = this.field10625 - this.field10619;
         var5.field8081 = this.field10628 - this.field10620;
      }

      int var2 = this.field10620 * this.field10608 + this.field10619;

      for(int var3 = this.field10620; var3 < this.field10628; ++var3) {
         for(int var4 = 0; var4 < this.field10611; ++var4) {
            this.field10599[var4].field994.field8083[var3 - this.field10620] = var2;
         }

         var2 += this.field10608;
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "([IIIIIZ)Lbg;"
   )
   public final class492 method515(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class54(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class585(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class54(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class585(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "x",
      descriptor = "()V"
   )
   public final void method514() {
      this.field10618.method731(0);
      this.field10616.method731(0);
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "o",
      descriptor = "(I)Z"
   )
   public final boolean method5297(int arg0) {
      return this.field10607 || super.field802.method1354(arg0, (byte)-109).field4318;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method525(int arg0) {
      this.field10611 = arg0;
      this.field10599 = new class79[this.field10611];

      for(int var2 = 0; var2 < this.field10611; ++var2) {
         this.field10599[var2] = new class79(this);
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method543(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method503() {
      return false;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      class79 var14 = this.method5290(Thread.currentThread());
      class567 var15 = var14.field994;
      var15.field8086 = false;
      int var16 = arg0 - this.field10615;
      int var17 = arg3 - this.field10615;
      int var18 = arg6 - this.field10615;
      int var19 = arg1 - this.field10631;
      int var20 = arg4 - this.field10631;
      int var21 = arg7 - this.field10631;
      var15.field8082 = var16 < 0 || var16 > var15.field8088 || var17 < 0 || var17 > var15.field8088 || var18 < 0 || var18 > var15.field8088;
      int var22 = arg9 >>> 24;
      if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
         if (arg12 == 1) {
            var15.field8090 = 255 - var22;
            var15.field8095 = false;
            var15.method4043((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var15.field8090 = 128;
            var15.field8095 = true;
            var15.method4043((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
         }
      } else {
         var15.field8090 = 0;
         var15.field8095 = false;
         var15.method4043((float)var19, (float)var20, (float)var21, (float)var16, (float)var17, (float)var18, (float)arg2, (float)arg5, (float)arg8, arg9, arg10, arg11);
      }

      var15.field8086 = true;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method560(int arg0, int arg1) throws class525 {
      if (this.field10589 != null && this.field10593 != null) {
         try {
            Graphics var3 = this.field10589.getGraphics();
            this.field10593.method1700(var3, -112, arg1, this.field10590, 0, arg0, 0, this.field10587);
         } catch (Exception var4) {
            this.field10589.repaint();
         }
      } else {
         throw new IllegalStateException(field10636[0]);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "r",
      descriptor = "()V"
   )
   public final void method609() {
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      class701 var13 = (class701)arg6;
      int[] var14 = var13.field10256;
      int[] var15 = var13.field10255;
      int var16 = this.field10620 > arg8 ? this.field10620 : arg8;
      int var17 = this.field10628 < var14.length + arg8 ? this.field10628 : var14.length + arg8;
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
                  if (arg0 >= this.field10619 && arg0 < this.field10625 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field10608 * var37 + arg0;
                        int var41 = this.field10633[var40];
                        int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                        this.field10633[var40] = var35 + var42;
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
                  if (arg0 >= this.field10619 && arg0 < this.field10625 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field10608 * var44 + arg0;
                        int var48 = this.field10633[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field10633[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
               if (arg0 >= this.field10619 && arg0 < this.field10625 && var53 >= var16 && var53 < var17 && var22 < var19) {
                  int var55 = var14[var54] + arg7;
                  if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                     this.field10633[this.field10608 * var53 + arg0] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var80 >= this.field10619 && var80 < this.field10625 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                  this.field10633[this.field10608 * arg1 + var80] = arg4;
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
               if (arg1 >= var16 && arg1 < var17 && var66 >= this.field10619 && var66 < this.field10625 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                  int var68 = this.field10608 * arg1 + var66;
                  int var69 = this.field10633[var68];
                  int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                  this.field10633[this.field10608 * arg1 + var66] = var64 + var70;
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
               if (arg1 >= var16 && arg1 < var17 && var72 >= this.field10619 && var72 < this.field10625 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                  int var74 = this.field10608 * arg1 + var72;
                  int var75 = this.field10633[var74];
                  int var76 = arg4 + var75;
                  int var77 = (arg4 & 16711935) + (var75 & 16711935);
                  int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                  this.field10633[var74] = var76 - var78 | var78 - (var78 >>> 8);
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
      owner = "client!sfa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method550(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class525 {
      if (this.field10589 != null && this.field10593 != null) {
         try {
            Graphics var5 = this.field10589.getGraphics();

            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.x + arg2 <= this.field10608 && var7.y + arg3 <= this.field10627 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                  this.field10593.method1700(var5, -20, var7.y + arg3, var7.width, var7.y, var7.x + arg2, var7.x, var7.height);
               }
            }

         } catch (Exception var8) {
            this.field10589.repaint();
         }
      } else {
         throw new IllegalStateException(field10636[0]);
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "k",
      descriptor = "(I)[I"
   )
   public final int[] method5298(int arg0) {
      class80 var2 = this.field10618;
      class406 var3;
      synchronized(this.field10618) {
         var3 = (class406)this.field10618.method725(0, (long)arg0 | Long.MIN_VALUE);
         if (var3 == null) {
            if (!super.field802.method1353(arg0, (byte)124)) {
               return null;
            }

            class317 var5 = super.field802.method1354(arg0, (byte)-109);
            int var6 = !var5.field4318 && !this.field10607 ? this.field10602 : 64;
            var3 = new class406(arg0, var6, super.field802.method1351(var6, 0.7F, true, arg0, 12356, var6), var5.field4319 != 1);
            this.field10618.method723(0, (long)arg0 | Long.MIN_VALUE, var3);
         }
      }

      var3.field5868 = true;
      return var3.method3063();
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "E",
      descriptor = "()I"
   )
   public final int method545() {
      return 0;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Lrha;)V"
   )
   public final void method562(class234 arg0) {
      class79 var2 = this.method5290(Thread.currentThread());
      class390 var3 = arg0.field3266.field9801;

      for(class390 var4 = var3.field5653; var3 != var4; var4 = var4.field5653) {
         class624 var5 = (class624)var4;
         int var6 = var5.field9180 >> 12;
         int var7 = var5.field9172 >> 12;
         int var8 = var5.field9174 >> 12;
         float var9 = (float)var8 * this.field10617.field1953 + (float)var6 * this.field10617.field1962 + (float)var7 * this.field10617.field1937 + this.field10617.field1966;
         if (!(var9 < (float)this.field10624) && !(var9 > (float)var2.field983)) {
            int var10 = (int)(((float)var8 * this.field10617.field1952 + (float)var6 * this.field10617.field1955 + (float)var7 * this.field10617.field1957 + this.field10617.field1941) * (float)this.field10629 / var9) + this.field10621;
            int var11 = (int)(((float)var8 * this.field10617.field1956 + (float)var6 * this.field10617.field1939 + (float)var7 * this.field10617.field1951 + this.field10617.field1965) * (float)this.field10609 / var9) + this.field10622;
            if (var10 >= this.field10619 && var10 <= this.field10625 && var11 >= this.field10620 && var11 <= this.field10628) {
               if (var9 == 0.0F) {
                  var9 = 1.0F;
               }

               this.method5283(var5, var10, var11, (int)var9, (int)((float)(this.field10629 * var5.field9181 >> 12) / var9));
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5299(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5300(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
