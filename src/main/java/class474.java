import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class474 extends class423 {
   @OriginalMember(
      owner = "client!rt",
      name = "F",
      descriptor = "I"
   )
   private int field6605 = -1;
   @OriginalMember(
      owner = "client!rt",
      name = "o",
      descriptor = "Lpq;"
   )
   private class195 field6607;
   @OriginalMember(
      owner = "client!rt",
      name = "x",
      descriptor = "I"
   )
   private int field6596;
   @OriginalMember(
      owner = "client!rt",
      name = "E",
      descriptor = "[[B"
   )
   private byte[][] field6597;
   @OriginalMember(
      owner = "client!rt",
      name = "v",
      descriptor = "[[B"
   )
   private byte[][] field6601;
   @OriginalMember(
      owner = "client!rt",
      name = "u",
      descriptor = "F"
   )
   private float field6595;
   @OriginalMember(
      owner = "client!rt",
      name = "y",
      descriptor = "F"
   )
   private float field6600;
   @OriginalMember(
      owner = "client!rt",
      name = "H",
      descriptor = "F"
   )
   private float field6602;
   @OriginalMember(
      owner = "client!rt",
      name = "D",
      descriptor = "F"
   )
   private float field6603;
   @OriginalMember(
      owner = "client!rt",
      name = "C",
      descriptor = "F"
   )
   private float field6608;
   @OriginalMember(
      owner = "client!rt",
      name = "w",
      descriptor = "F"
   )
   private float field6609;
   @OriginalMember(
      owner = "client!rt",
      name = "t",
      descriptor = "F"
   )
   private float field6610;
   @OriginalMember(
      owner = "client!rt",
      name = "G",
      descriptor = "F"
   )
   private float field6611;
   @OriginalMember(
      owner = "client!rt",
      name = "A",
      descriptor = "F"
   )
   private float field6612;
   @OriginalMember(
      owner = "client!rt",
      name = "m",
      descriptor = "F"
   )
   private float field6613;
   @OriginalMember(
      owner = "client!rt",
      name = "r",
      descriptor = "F"
   )
   private float field6614;
   @OriginalMember(
      owner = "client!rt",
      name = "B",
      descriptor = "F"
   )
   private float field6615;
   @OriginalMember(
      owner = "client!rt",
      name = "p",
      descriptor = "[[Lbb;"
   )
   private class222[][] field6599;
   @OriginalMember(
      owner = "client!rt",
      name = "n",
      descriptor = "[[Lno;"
   )
   private class386[][] field6594;
   @OriginalMember(
      owner = "client!rt",
      name = "q",
      descriptor = "[[Lcia;"
   )
   private class445[][] field6606;
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[[Lgi;"
   )
   private class643[][] field6604;
   @OriginalMember(
      owner = "client!rt",
      name = "s",
      descriptor = "[[Lci;"
   )
   private class724[][] field6598;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method941(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class432 var8 = this.field6607.field2475;
      this.field6605 = arg5;
      this.field6615 = var8.field5893;
      this.field6595 = var8.field5879;
      this.field6603 = var8.field5889;
      this.field6610 = var8.field5886;
      this.field6613 = var8.field5885;
      this.field6600 = var8.field5872;
      this.field6608 = var8.field5869;
      this.field6609 = var8.field5876;
      this.field6611 = var8.field5888;
      this.field6602 = var8.field5878;
      this.field6614 = var8.field5883;
      this.field6612 = var8.field5892;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field5769 && var12 >= 0 && var12 < super.field5767) {
                  this.method3612(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rt",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method952(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IILto;[I[I[I[II)V"
   )
   private final void method3606(int arg0, int arg1, class236 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class724 var9 = this.field6598[arg0][arg1];
      if (var9 != null) {
         if ((var9.field10579 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field10579 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field5764 * arg0;
            int var11 = super.field5764 + var10;
            int var12 = super.field5764 * arg1;
            int var13 = super.field5764 + var12;
            float var16;
            float var17;
            float var18;
            float var19;
            int var23;
            int var25;
            int var27;
            int var29;
            int var31;
            int var33;
            int var35;
            int var37;
            if ((var9.field10579 & 1) != 0) {
               int var14 = super.field5770[arg0][arg1];
               float var15 = (float)var14 * this.field6602;
               if (this.field6605 == -1) {
                  var16 = (float)var12 * this.field6614 + (float)var10 * this.field6611 + var15 + this.field6612;
                  if (var16 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var17 = (float)var12 * this.field6614 + (float)var11 * this.field6611 + var15 + this.field6612;
                  if (var17 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var18 = (float)var13 * this.field6614 + (float)var11 * this.field6611 + var15 + this.field6612;
                  if (var18 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var19 = (float)var13 * this.field6614 + (float)var10 * this.field6611 + var15 + this.field6612;
                  if (var19 <= (float)this.field6607.field2509) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field6614 + (float)var10 * this.field6611 + var15 + this.field6612;
                  var17 = (float)var12 * this.field6614 + (float)var11 * this.field6611 + var15 + this.field6612;
                  var18 = (float)var13 * this.field6614 + (float)var11 * this.field6611 + var15 + this.field6612;
                  var19 = (float)var13 * this.field6614 + (float)var10 * this.field6611 + var15 + this.field6612;
               }

               float var20 = (float)var14 * this.field6595;
               float var21 = (float)var14 * this.field6600;
               if (this.field6605 == -1) {
                  float var22 = (float)var12 * this.field6603 + (float)var10 * this.field6615 + var20 + this.field6610;
                  var23 = (int)((float)this.field6607.field2491 * var22 / var16) + arg2.field2961;
                  float var24 = (float)var12 * this.field6608 + (float)var10 * this.field6613 + var21 + this.field6609;
                  var25 = (int)((float)this.field6607.field2501 * var24 / var16) + arg2.field2975;
                  float var26 = (float)var12 * this.field6603 + (float)var11 * this.field6615 + var20 + this.field6610;
                  var27 = (int)((float)this.field6607.field2491 * var26 / var17) + arg2.field2961;
                  float var28 = (float)var12 * this.field6608 + (float)var11 * this.field6613 + var21 + this.field6609;
                  var29 = (int)((float)this.field6607.field2501 * var28 / var17) + arg2.field2975;
                  float var30 = (float)var13 * this.field6603 + (float)var11 * this.field6615 + var20 + this.field6610;
                  var31 = (int)((float)this.field6607.field2491 * var30 / var18) + arg2.field2961;
                  float var32 = (float)var13 * this.field6608 + (float)var11 * this.field6613 + var21 + this.field6609;
                  var33 = (int)((float)this.field6607.field2501 * var32 / var18) + arg2.field2975;
                  float var34 = (float)var13 * this.field6603 + (float)var10 * this.field6615 + var20 + this.field6610;
                  var35 = (int)((float)this.field6607.field2491 * var34 / var19) + arg2.field2961;
                  float var36 = (float)var13 * this.field6608 + (float)var10 * this.field6613 + var21 + this.field6609;
                  var37 = (int)((float)this.field6607.field2501 * var36 / var19) + arg2.field2975;
               } else {
                  float var38 = (float)var12 * this.field6603 + (float)var10 * this.field6615 + var20 + this.field6610;
                  var23 = (int)((float)this.field6607.field2491 * var38 / (float)this.field6605) + arg2.field2961;
                  float var39 = (float)var12 * this.field6608 + (float)var10 * this.field6613 + var21 + this.field6609;
                  var25 = (int)((float)this.field6607.field2501 * var39 / (float)this.field6605) + arg2.field2975;
                  float var40 = (float)var12 * this.field6603 + (float)var11 * this.field6615 + var20 + this.field6610;
                  var27 = (int)((float)this.field6607.field2491 * var40 / (float)this.field6605) + arg2.field2961;
                  float var41 = (float)var12 * this.field6608 + (float)var11 * this.field6613 + var21 + this.field6609;
                  var29 = (int)((float)this.field6607.field2501 * var41 / (float)this.field6605) + arg2.field2975;
                  float var42 = (float)var13 * this.field6603 + (float)var11 * this.field6615 + var20 + this.field6610;
                  var31 = (int)((float)this.field6607.field2491 * var42 / (float)this.field6605) + arg2.field2961;
                  float var43 = (float)var13 * this.field6608 + (float)var11 * this.field6613 + var21 + this.field6609;
                  var33 = (int)((float)this.field6607.field2501 * var43 / (float)this.field6605) + arg2.field2975;
                  float var44 = (float)var13 * this.field6603 + (float)var10 * this.field6615 + var20 + this.field6610;
                  var35 = (int)((float)this.field6607.field2491 * var44 / (float)this.field6605) + arg2.field2961;
                  float var45 = (float)var13 * this.field6608 + (float)var10 * this.field6613 + var21 + this.field6609;
                  var37 = (int)((float)this.field6607.field2501 * var45 / (float)this.field6605) + arg2.field2975;
               }
            } else {
               int var46 = super.field5770[arg0][arg1];
               int var47 = super.field5770[arg0 + 1][arg1];
               int var48 = super.field5770[arg0 + 1][arg1 + 1];
               int var49 = super.field5770[arg0][arg1 + 1];
               if (this.field6605 == -1) {
                  var16 = (float)var12 * this.field6614 + (float)var10 * this.field6611 + (float)var46 * this.field6602 + this.field6612;
                  if (var16 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var17 = (float)var12 * this.field6614 + (float)var11 * this.field6611 + (float)var47 * this.field6602 + this.field6612;
                  if (var17 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var18 = (float)var13 * this.field6614 + (float)var11 * this.field6611 + (float)var48 * this.field6602 + this.field6612;
                  if (var18 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var19 = (float)var13 * this.field6614 + (float)var10 * this.field6611 + (float)var49 * this.field6602 + this.field6612;
                  if (var19 <= (float)this.field6607.field2509) {
                     return;
                  }

                  float var50 = (float)var12 * this.field6603 + (float)var10 * this.field6615 + (float)var46 * this.field6595 + this.field6610;
                  var23 = (int)((float)this.field6607.field2491 * var50 / var16) + arg2.field2961;
                  float var51 = (float)var12 * this.field6608 + (float)var10 * this.field6613 + (float)var46 * this.field6600 + this.field6609;
                  var25 = (int)((float)this.field6607.field2501 * var51 / var16) + arg2.field2975;
                  float var52 = (float)var12 * this.field6603 + (float)var11 * this.field6615 + (float)var47 * this.field6595 + this.field6610;
                  var27 = (int)((float)this.field6607.field2491 * var52 / var17) + arg2.field2961;
                  float var53 = (float)var12 * this.field6608 + (float)var11 * this.field6613 + (float)var47 * this.field6600 + this.field6609;
                  var29 = (int)((float)this.field6607.field2501 * var53 / var17) + arg2.field2975;
                  float var54 = (float)var13 * this.field6603 + (float)var11 * this.field6615 + (float)var48 * this.field6595 + this.field6610;
                  var31 = (int)((float)this.field6607.field2491 * var54 / var18) + arg2.field2961;
                  float var55 = (float)var13 * this.field6608 + (float)var11 * this.field6613 + (float)var48 * this.field6600 + this.field6609;
                  var33 = (int)((float)this.field6607.field2501 * var55 / var18) + arg2.field2975;
                  float var56 = (float)var13 * this.field6603 + (float)var10 * this.field6615 + (float)var49 * this.field6595 + this.field6610;
                  var35 = (int)((float)this.field6607.field2491 * var56 / var19) + arg2.field2961;
                  float var57 = (float)var13 * this.field6608 + (float)var10 * this.field6613 + (float)var49 * this.field6600 + this.field6609;
                  var37 = (int)((float)this.field6607.field2501 * var57 / var19) + arg2.field2975;
               } else {
                  var16 = (float)var12 * this.field6614 + (float)var10 * this.field6611 + (float)var46 * this.field6602 + this.field6612;
                  var17 = (float)var12 * this.field6614 + (float)var11 * this.field6611 + (float)var47 * this.field6602 + this.field6612;
                  var18 = (float)var13 * this.field6614 + (float)var11 * this.field6611 + (float)var48 * this.field6602 + this.field6612;
                  var19 = (float)var13 * this.field6614 + (float)var10 * this.field6611 + (float)var49 * this.field6602 + this.field6612;
                  float var58 = (float)var12 * this.field6603 + (float)var10 * this.field6615 + (float)var46 * this.field6595 + this.field6610;
                  var23 = (int)((float)this.field6607.field2491 * var58 / (float)this.field6605) + arg2.field2961;
                  float var59 = (float)var12 * this.field6608 + (float)var10 * this.field6613 + (float)var46 * this.field6600 + this.field6609;
                  var25 = (int)((float)this.field6607.field2501 * var59 / (float)this.field6605) + arg2.field2975;
                  float var60 = (float)var12 * this.field6603 + (float)var11 * this.field6615 + (float)var47 * this.field6595 + this.field6610;
                  var27 = (int)((float)this.field6607.field2491 * var60 / (float)this.field6605) + arg2.field2961;
                  float var61 = (float)var12 * this.field6608 + (float)var11 * this.field6613 + (float)var47 * this.field6600 + this.field6609;
                  var29 = (int)((float)this.field6607.field2501 * var61 / (float)this.field6605) + arg2.field2975;
                  float var62 = (float)var13 * this.field6603 + (float)var11 * this.field6615 + (float)var48 * this.field6595 + this.field6610;
                  var31 = (int)((float)this.field6607.field2491 * var62 / (float)this.field6605) + arg2.field2961;
                  float var63 = (float)var13 * this.field6608 + (float)var11 * this.field6613 + (float)var48 * this.field6600 + this.field6609;
                  var33 = (int)((float)this.field6607.field2501 * var63 / (float)this.field6605) + arg2.field2975;
                  float var64 = (float)var13 * this.field6603 + (float)var10 * this.field6615 + (float)var49 * this.field6595 + this.field6610;
                  var35 = (int)((float)this.field6607.field2491 * var64 / (float)this.field6605) + arg2.field2961;
                  float var65 = (float)var13 * this.field6608 + (float)var10 * this.field6613 + (float)var49 * this.field6600 + this.field6609;
                  var37 = (int)((float)this.field6607.field2501 * var65 / (float)this.field6605) + arg2.field2975;
               }
            }

            if (this.field6605 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field2972 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field2965 || var35 > arg2.field2965 || var27 > arg2.field2965;
                  if (var9.field10576 >= 0) {
                     arg2.method1887((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class193.field2445[var9.field10582 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10577 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10581 & 65535] & 16777215, 0, 0, 0, 0, var9.field10576);
                  } else {
                     arg2.method1886((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field10582 & 65535), (float)(var9.field10577 & 65535), (float)(var9.field10581 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field2972 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field2965 || var27 > arg2.field2965 || var35 > arg2.field2965;
                  if (var9.field10576 >= 0) {
                     arg2.method1887((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class193.field2445[var9.field10578 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10581 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10577 & 65535] & 16777215, 0, 0, 0, 0, var9.field10576);
                     return;
                  }

                  arg2.method1886((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field10578 & 65535), (float)(var9.field10581 & 65535), (float)(var9.field10577 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field2972 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field2965 || var35 > arg2.field2965 || var27 > arg2.field2965;
                  if (var9.field10576 >= 0) {
                     arg2.method1887((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class193.field2445[var9.field10582 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10577 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10581 & 65535] & 16777215, 0, 0, 0, 0, var9.field10576);
                  } else {
                     arg2.method1886((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field10582 & 65535), (float)(var9.field10577 & 65535), (float)(var9.field10581 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field2972 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field2965 || var27 > arg2.field2965 || var35 > arg2.field2965;
                  if (var9.field10576 >= 0) {
                     arg2.method1887((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class193.field2445[var9.field10578 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10581 & 65535] & 16777215, -16777216 | class193.field2445[var9.field10577 & 65535] & 16777215, 0, 0, 0, 0, var9.field10576);
                     return;
                  }

                  arg2.method1886((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field10578 & 65535), (float)(var9.field10581 & 65535), (float)(var9.field10577 & 65535));
               }
            }

         }
      } else {
         class222 var66 = this.field6599[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field2786 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field6605 == -1) {
               for(int var67 = 0; var67 < var66.field2778; ++var67) {
                  int var68 = (arg0 << super.field5773) + var66.field2777[var67];
                  short var69 = var66.field2776[var67];
                  int var70 = (arg1 << super.field5773) + var66.field2774[var67];
                  float var71 = (float)var70 * this.field6614 + (float)var68 * this.field6611 + (float)var69 * this.field6602 + this.field6612;
                  if (var71 <= (float)this.field6607.field2509) {
                     return;
                  }

                  float var72 = (float)var70 * this.field6603 + (float)var68 * this.field6615 + (float)var69 * this.field6595 + this.field6610;
                  float var73 = (float)var70 * this.field6608 + (float)var68 * this.field6613 + (float)var69 * this.field6600 + this.field6609;
                  arg3[var67] = (int)((float)this.field6607.field2491 * var72 / var71) + arg2.field2961;
                  arg4[var67] = (int)((float)this.field6607.field2501 * var73 / var71) + arg2.field2975;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field2778; ++var74) {
                  int var110 = (arg0 << super.field5773) + var66.field2777[var74];
                  short var111 = var66.field2776[var74];
                  int var112 = (arg1 << super.field5773) + var66.field2774[var74];
                  float var113 = (float)var112 * this.field6614 + (float)var110 * this.field6611 + (float)var111 * this.field6602 + this.field6612;
                  float var114 = (float)var112 * this.field6603 + (float)var110 * this.field6615 + (float)var111 * this.field6595 + this.field6610;
                  float var115 = (float)var112 * this.field6608 + (float)var110 * this.field6613 + (float)var111 * this.field6600 + this.field6609;
                  arg3[var74] = (int)((float)this.field6607.field2491 * var114 / (float)this.field6605) + arg2.field2961;
                  arg4[var74] = (int)((float)this.field6607.field2501 * var115 / (float)this.field6605) + arg2.field2975;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field2784 != null) {
               if (this.field6605 == -1) {
                  for(int var75 = 0; var75 < var66.field2783; ++var75) {
                     short var76 = var66.field2781[var75];
                     short var77 = var66.field2785[var75];
                     short var78 = var66.field2779[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field2972 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field2965 || var80 > arg2.field2965 || var81 > arg2.field2965;
                        short var85 = var66.field2784[var75];
                        if (var85 != -1) {
                           arg2.method1887((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field2777[var76] / (float)super.field5764, (float)var66.field2777[var77] / (float)super.field5764, (float)var66.field2777[var78] / (float)super.field5764, (float)var66.field2774[var76] / (float)super.field5764, (float)var66.field2774[var77] / (float)super.field5764, (float)var66.field2774[var78] / (float)super.field5764, -16777216 | class193.field2445[var66.field2787[var76] & 65535] & 16777215, -16777216 | class193.field2445[var66.field2787[var77] & 65535] & 16777215, -16777216 | class193.field2445[var66.field2787[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field2782[var75];
                           if (var86 != -1) {
                              arg2.method1886((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class355.method2815(var86, 126, var66.field2787[var76]), (float)class355.method2815(var86, 126, var66.field2787[var77]), (float)class355.method2815(var86, 126, var66.field2787[var78]));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field2783; ++var87) {
                  short var88 = var66.field2781[var87];
                  short var89 = var66.field2785[var87];
                  short var90 = var66.field2779[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field2972 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field2965 || var92 > arg2.field2965 || var93 > arg2.field2965;
                     short var97 = var66.field2784[var87];
                     if (var97 != -1) {
                        arg2.method1887((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field2777[var88] / (float)super.field5764, (float)var66.field2777[var89] / (float)super.field5764, (float)var66.field2777[var90] / (float)super.field5764, (float)var66.field2774[var88] / (float)super.field5764, (float)var66.field2774[var89] / (float)super.field5764, (float)var66.field2774[var90] / (float)super.field5764, -16777216 | class193.field2445[var66.field2787[var88] & 65535] & 16777215, -16777216 | class193.field2445[var66.field2787[var89] & 65535] & 16777215, -16777216 | class193.field2445[var66.field2787[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field2782[var87];
                        if (var98 != -1) {
                           arg2.method1886((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class355.method2815(var98, 126, var66.field2787[var88]), (float)class355.method2815(var98, 126, var66.field2787[var89]), (float)class355.method2815(var98, 126, var66.field2787[var90]));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field2783; ++var99) {
               short var100 = var66.field2781[var99];
               short var101 = var66.field2785[var99];
               short var102 = var66.field2779[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field2782[var99];
                  if (var109 != -1) {
                     arg2.field2972 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field2965 || var104 > arg2.field2965 || var105 > arg2.field2965;
                     arg2.method1886((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class355.method2815(var109, 126, var66.field2787[var100]), (float)class355.method2815(var109, 126, var66.field2787[var101]), (float)class355.method2815(var109, 126, var66.field2787[var102]));
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(I)Z"
   )
   private final boolean method3607(int arg0) {
      if ((this.field6596 & 8) == 0) {
         return false;
      } else if (arg0 == 4) {
         return true;
      } else if (arg0 == 8) {
         return true;
      } else {
         return arg0 == 9;
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method950(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!rt",
      name = "ka",
      descriptor = "(III)V"
   )
   public final void method958(int arg0, int arg1, int arg2) {
      if (this.field6601[arg0][arg1] < arg2) {
         this.field6601[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method943(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class432 var7 = this.field6607.field2475;
      this.field6605 = -1;
      this.field6615 = var7.field5893;
      this.field6595 = var7.field5879;
      this.field6603 = var7.field5889;
      this.field6610 = var7.field5886;
      this.field6613 = var7.field5885;
      this.field6600 = var7.field5872;
      this.field6608 = var7.field5869;
      this.field6609 = var7.field5876;
      this.field6611 = var7.field5888;
      this.field6602 = var7.field5878;
      this.field6614 = var7.field5883;
      this.field6612 = var7.field5892;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field5769 && var11 >= 0 && var11 < super.field5767) {
                  this.method3612(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(IIIIIII[[ZLsr;Lto;[I[I)V"
   )
   private final void method3608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class640 arg8, class236 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field9392;
      this.field6607.method437(false);
      arg9.field2960 = false;
      arg9.field2974 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field6594 != null) {
                  if (this.field6594[var18][var19] != null) {
                     class386 var20 = this.field6594[var18][var19];
                     if (var20.field5340 != -1 && (var20.field5339 & 2) == 0 && var20.field5343 == 0) {
                        int var21 = this.field6607.method1620(var20.field5340);
                        arg9.method1886((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class355.method2815(var21, 126, var20.field5345), (float)class355.method2815(var21, 126, var20.field5341), (float)class355.method2815(var21, 126, var20.field5338));
                        arg9.method1886((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class355.method2815(var21, 126, var20.field5348), (float)class355.method2815(var21, 126, var20.field5338), (float)class355.method2815(var21, 126, var20.field5341));
                     } else if (var20.field5343 == 0) {
                        arg9.method1882((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field5345, var20.field5341, var20.field5338);
                        arg9.method1882((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field5348, var20.field5338, var20.field5341);
                     } else {
                        int var22 = var20.field5343;
                        arg9.method1882((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class204.method1685(var20.field5345 & -16777216, var22, 16711935), class204.method1685(var20.field5341 & -16777216, var22, 16711935), class204.method1685(var20.field5338 & -16777216, var22, 16711935));
                        arg9.method1882((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class204.method1685(var20.field5348 & -16777216, var22, 16711935), class204.method1685(var20.field5338 & -16777216, var22, 16711935), class204.method1685(var20.field5341 & -16777216, var22, 16711935));
                     }
                  } else if (this.field6604[var18][var19] != null) {
                     class643 var23 = this.field6604[var18][var19];

                     for(int var24 = 0; var24 < var23.field9655; ++var24) {
                        arg10[var24] = var23.field9653[var24] * var14 / super.field5764 + var16;
                        arg11[var24] = var17 - var23.field9656[var24] * var14 / super.field5764;
                     }

                     for(int var25 = 0; var25 < var23.field9658; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field9649 != null && var23.field9649[var25] != 0 && (var23.field9654 == null || var23.field9654 != null && var23.field9654[var25] == -1)) {
                           int var35 = var23.field9649[var25];
                           arg9.method1882((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class204.method1685(-16777216 - (var23.field9650[var26] & -16777216), var35, 16711935), class204.method1685(-16777216 - (var23.field9650[var27] & -16777216), var35, 16711935), class204.method1685(-16777216 - (var23.field9650[var28] & -16777216), var35, 16711935));
                        } else if (var23.field9654 != null && var23.field9654[var25] != -1) {
                           int var36 = this.field6607.method1620(var23.field9654[var25]);
                           arg9.method1886((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method1882((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field9650[var26], var23.field9650[var27], var23.field9650[var28]);
                        }
                     }
                  }
               } else if (this.field6606[var18][var19] != null) {
                  class445 var37 = this.field6606[var18][var19];

                  for(int var38 = 0; var38 < var37.field6026; ++var38) {
                     arg10[var38] = var37.field6025[var38] * var14 / super.field5764 + var16;
                     arg11[var38] = var17 - var37.field6032[var38] * var14 / super.field5764;
                  }

                  for(int var39 = 0; var39 < var37.field6029; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field6028 != null && var37.field6028[var39] != 0) {
                        int var49 = var37.field6028[var39];
                        arg9.method1882((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method1882((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field6022[var40], var37.field6022[var41], var37.field6022[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field2960 = true;
      this.field6607.method437(var15);
   }

   @OriginalMember(
      owner = "client!rt",
      name = "<init>",
      descriptor = "(Lpq;IIII[[I[[II)V"
   )
   public class474(class195 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field6607 = arg0;
      this.field6596 = arg2;
      this.field6597 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field6607.field2493 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field6607.field2482 * var18 + this.field6607.field2488 * var17 + this.field6607.field2481 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field6597[var11][var10] = (byte)var20;
         }
      }

      this.field6601 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(II)I"
   )
   private static final int method3609(int arg0, int arg1) {
      int var2 = (arg0 & 16711680) * arg1 >> 23;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 253) {
         var2 = 253;
      }

      int var3 = (arg0 & 65280) * arg1 >> 15;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 253) {
         var3 = 253;
      }

      int var4 = (arg0 & 255) * arg1 >> 7;
      if (var4 < 2) {
         var4 = 2;
      } else if (var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IIIIIII[[ZLsr;Lto;[I[I)V"
   )
   private final void method3610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class640 arg8, class236 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field9392;
      this.field6607.method437(false);
      arg9.field2960 = false;
      arg9.field2974 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field6598[var18][var19] != null) {
                  class724 var20 = this.field6598[var18][var19];
                  if (var20.field10576 != -1 && (var20.field10579 & 2) == 0 && var20.field10580 == -1) {
                     int var21 = this.field6607.method1620(var20.field10576);
                     arg9.method1886((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class355.method2815(var21, 126, var20.field10582 & 65535), (float)class355.method2815(var21, 126, var20.field10577 & 65535), (float)class355.method2815(var21, 126, var20.field10581 & 65535));
                     arg9.method1886((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class355.method2815(var21, 126, var20.field10578 & 65535), (float)class355.method2815(var21, 126, var20.field10581 & 65535), (float)class355.method2815(var21, 126, var20.field10577 & 65535));
                  } else if (var20.field10580 == -1) {
                     arg9.method1886((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field10582 & 65535), (float)(var20.field10577 & 65535), (float)(var20.field10581 & 65535));
                     arg9.method1886((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field10578 & 65535), (float)(var20.field10581 & 65535), (float)(var20.field10577 & 65535));
                  } else {
                     int var22 = var20.field10580;
                     arg9.method1886((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method1886((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field6599[var18][var19] != null) {
                  class222 var23 = this.field6599[var18][var19];

                  for(int var24 = 0; var24 < var23.field2778; ++var24) {
                     arg10[var24] = var23.field2777[var24] * var14 / super.field5764 + var16;
                     arg11[var24] = var17 - var23.field2774[var24] * var14 / super.field5764;
                  }

                  for(int var25 = 0; var25 < var23.field2783; ++var25) {
                     short var26 = var23.field2781[var25];
                     short var27 = var23.field2785[var25];
                     short var28 = var23.field2779[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field2775 != null && var23.field2775[var25] != -1) {
                        int var35 = var23.field2775[var25];
                        arg9.method1886((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class355.method2815(var35, 126, var23.field2787[var26]), (float)class355.method2815(var35, 126, var23.field2787[var27]), (float)class355.method2815(var35, 126, var23.field2787[var28]));
                     } else if (var23.field2784 != null && var23.field2784[var25] != -1) {
                        int var36 = this.field6607.method1620(var23.field2784[var25]);
                        arg9.method1886((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class355.method2815(var36, 126, var23.field2787[var26]), (float)class355.method2815(var36, 126, var23.field2787[var27]), (float)class355.method2815(var36, 126, var23.field2787[var28]));
                     } else {
                        int var37 = var23.field2782[var25];
                        arg9.method1886((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class355.method2815(var37, 126, var23.field2787[var26]), (float)class355.method2815(var37, 126, var23.field2787[var27]), (float)class355.method2815(var37, 126, var23.field2787[var28]));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field2960 = true;
      this.field6607.method437(var15);
   }

   @OriginalMember(
      owner = "client!rt",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method944(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field6596 & 32) == 0;
      if (this.field6594 == null && !var15) {
         this.field6594 = new class386[super.field5769][super.field5767];
         this.field6604 = new class643[super.field5769][super.field5767];
      } else if (this.field6606 == null && var15) {
         this.field6606 = new class445[super.field5769][super.field5767];
      } else if (this.field6598 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class193.field2445[class472.method3584(arg6[var16], -10794) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class193.field2445[class472.method3584(arg7[var17], -10794) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class445 var18 = new class445();
            var18.field6026 = (short)arg2.length;
            var18.field6029 = (short)(arg2.length / 3);
            var18.field6025 = new short[var18.field6026];
            var18.field6024 = new short[var18.field6026];
            var18.field6032 = new short[var18.field6026];
            var18.field6022 = new int[var18.field6026];
            var18.field6027 = new short[var18.field6026];
            var18.field6031 = new short[var18.field6026];
            var18.field6023 = new byte[var18.field6026];
            if (arg5 != null) {
               var18.field6030 = new short[var18.field6026];
            }

            for(int var19 = 0; var19 < var18.field6026; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field6597[arg0][arg1] - this.field6601[arg0][arg1];
               } else if (var22 == 0 && super.field5764 == var23) {
                  var25 = this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1];
               } else if (super.field5764 == var22 && super.field5764 == var23) {
                  var25 = this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1];
               } else if (super.field5764 == var22 && var23 == 0) {
                  var25 = this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]) * var22 + (this.field6597[arg0][arg1] - this.field6601[arg0][arg1]) * (super.field5764 - var22);
                  int var27 = (this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]) * var22 + (this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]) * (super.field5764 - var22);
                  var25 = (super.field5764 - var23) * var26 + var23 * var27 >> super.field5773 * 2;
               }

               int var28 = (arg0 << super.field5773) + var22;
               int var29 = (arg1 << super.field5773) + var23;
               var18.field6025[var19] = (short)var22;
               var18.field6032[var19] = (short)var23;
               var18.field6024[var19] = (short)(this.method3288(var28, (byte)121, var29) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field6022[var19] = 0;
                  if (arg7 != null) {
                     var18.field6023[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field6030[var19] = (short)arg5[var19];
                     if (arg11 != 0) {
                        var30 = var31 * 255 / arg11;
                        if (var30 < 0) {
                           var30 = 0;
                        } else if (var30 > 255) {
                           var30 = 255;
                        }
                     }
                  }

                  int var32 = -16777216;
                  if (arg8[var19] != -1 && this.method3607(this.field6607.field6667.method911(arg8[var19], 31).field9911)) {
                     var32 = -1694498816;
                  }

                  var18.field6022[var19] = var32 | class663.method4846(var30, method3609(arg6[var19] >> 8, var25), arg10, 16711680);
                  if (arg7 != null) {
                     var18.field6023[var19] = (byte)var25;
                  }
               }

               var18.field6027[var19] = (short)arg8[var19];
               var18.field6031[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field6028 = new int[var18.field6029];
            }

            for(int var20 = 0; var20 < var18.field6029; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field6028[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field6606[arg0][arg1] = var18;
         } else {
            boolean var33 = true;
            int var34 = -1;
            int var35 = -1;
            int var36 = -1;
            int var37 = -1;
            if (arg2.length == 6) {
               for(int var38 = 0; var38 < 6; ++var38) {
                  if (arg2[var38] == 0 && arg4[var38] == 0) {
                     if (var34 != -1 && arg6[var34] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var34 = var38;
                  } else if (arg2[var38] == super.field5764 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field5764 && arg4[var38] == super.field5764) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field5764) {
                     if (var37 != -1 && arg6[var37] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var37 = var38;
                  }
               }

               if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                  var33 = false;
               }

               if (var33) {
                  if (arg3 != null) {
                     for(int var39 = 0; var39 < 4; ++var39) {
                        if (arg3[var39] != 0) {
                           var33 = false;
                           break;
                        }
                     }
                  }

                  if (var33) {
                     for(int var40 = 1; var40 < 4; ++var40) {
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field5764 != arg2[var40] && arg2[0] - super.field5764 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field5764 != arg4[var40] && arg4[0] - super.field5764 != arg4[var40]) {
                           var33 = false;
                           break;
                        }
                     }
                  }
               }
            } else {
               var33 = false;
            }

            if (var33) {
               class386 var41 = new class386();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field5343 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field5339 = (byte)(var41.field5339 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field5770[arg0 + 1][arg1] == super.field5770[arg0][arg1] && super.field5770[arg0 + 1][arg1 + 1] == super.field5770[arg0][arg1] && super.field5770[arg0][arg1 + 1] == super.field5770[arg0][arg1]) {
                  var41.field5339 = (byte)(var41.field5339 | 1);
               }

               if (var43 != -1 && (var41.field5339 & 2) == 0 && !this.field6607.field6667.method911(var43, -127).field9894) {
                  int var44;
                  if (arg5 != null && arg11 != 0) {
                     var44 = arg5[var34] * 255 / arg11;
                     if (var44 < 0) {
                        var44 = 0;
                     } else if (var44 > 255) {
                        var44 = 255;
                     }
                  } else {
                     var44 = 0;
                  }

                  var41.field5348 = class663.method4846(var44, method3609(arg6[var34] >> 8, this.field6597[arg0][arg1] - this.field6601[arg0][arg1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5348 |= 255 - (this.field6597[arg0][arg1] - this.field6601[arg0][arg1]) << 25;
                  }

                  int var45;
                  if (arg5 != null && arg11 != 0) {
                     var45 = arg5[var35] * 255 / arg11;
                     if (var45 < 0) {
                        var45 = 0;
                     } else if (var45 > 255) {
                        var45 = 255;
                     }
                  } else {
                     var45 = 0;
                  }

                  var41.field5338 = class663.method4846(var45, method3609(arg6[var35] >> 8, this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5338 |= 255 - (this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]) << 25;
                  }

                  int var46;
                  if (arg5 != null && arg11 != 0) {
                     var46 = arg5[var36] * 255 / arg11;
                     if (var46 < 0) {
                        var46 = 0;
                     } else if (var46 > 255) {
                        var46 = 255;
                     }
                  } else {
                     var46 = 0;
                  }

                  var41.field5345 = class663.method4846(var46, method3609(arg6[var36] >> 8, this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5345 |= 255 - (this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var47;
                  if (arg5 != null && arg11 != 0) {
                     var47 = arg5[var37] * 255 / arg11;
                     if (var47 < 0) {
                        var47 = 0;
                     } else if (var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var41.field5341 = class663.method4846(var47, method3609(arg6[var37] >> 8, this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]), arg10, 16711680);
                  var41.field5340 = (short)var43;
               } else {
                  int var48;
                  if (arg5 != null && arg11 != 0) {
                     var48 = arg5[var34] * 255 / arg11;
                     if (var48 < 0) {
                        var48 = 0;
                     } else if (var48 > 255) {
                        var48 = 255;
                     }
                  } else {
                     var48 = 0;
                  }

                  var41.field5348 = class663.method4846(var48, method3609(arg6[var34] >> 8, this.field6597[arg0][arg1] - this.field6601[arg0][arg1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5348 |= 255 - (this.field6597[arg0][arg1] - this.field6601[arg0][arg1]) << 25;
                  }

                  int var49;
                  if (arg5 != null && arg11 != 0) {
                     var49 = arg5[var35] * 255 / arg11;
                     if (var49 < 0) {
                        var49 = 0;
                     } else if (var49 > 255) {
                        var49 = 255;
                     }
                  } else {
                     var49 = 0;
                  }

                  var41.field5338 = class663.method4846(var49, method3609(arg6[var35] >> 8, this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5338 |= 255 - (this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]) << 25;
                  }

                  int var50;
                  if (arg5 != null && arg11 != 0) {
                     var50 = arg5[var36] * 255 / arg11;
                     if (var50 < 0) {
                        var50 = 0;
                     } else if (var50 > 255) {
                        var50 = 255;
                     }
                  } else {
                     var50 = 0;
                  }

                  var41.field5345 = class663.method4846(var50, method3609(arg6[var36] >> 8, this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5345 |= 255 - (this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var51;
                  if (arg5 != null && arg11 != 0) {
                     var51 = arg5[var37] * 255 / arg11;
                     if (var51 < 0) {
                        var51 = 0;
                     } else if (var51 > 255) {
                        var51 = 255;
                     }
                  } else {
                     var51 = 0;
                  }

                  var41.field5341 = class663.method4846(var51, method3609(arg6[var37] >> 8, this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]), arg10, 16711680);
                  if (var41.field5343 != 0) {
                     var41.field5341 |= 255 - (this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]) << 25;
                  }

                  var41.field5340 = -1;
               }

               if (arg5 != null) {
                  var41.field5347 = (short)arg5[var36];
                  var41.field5342 = (short)arg5[var37];
                  var41.field5346 = (short)arg5[var35];
                  var41.field5344 = (short)arg5[var34];
               }

               this.field6594[arg0][arg1] = var41;
            } else {
               class643 var52 = new class643();
               var52.field9655 = (short)arg2.length;
               var52.field9658 = (short)(arg2.length / 3);
               var52.field9653 = new short[var52.field9655];
               var52.field9657 = new short[var52.field9655];
               var52.field9656 = new short[var52.field9655];
               var52.field9650 = new int[var52.field9655];
               if (arg5 != null) {
                  var52.field9651 = new short[var52.field9655];
               }

               for(int var53 = 0; var53 < var52.field9655; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field6597[arg0][arg1] - this.field6601[arg0][arg1];
                  } else if (var68 == 0 && super.field5764 == var69) {
                     var71 = this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1];
                  } else if (super.field5764 == var68 && super.field5764 == var69) {
                     var71 = this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1];
                  } else if (super.field5764 == var68 && var69 == 0) {
                     var71 = this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]) * var68 + (this.field6597[arg0][arg1] - this.field6601[arg0][arg1]) * (super.field5764 - var68);
                     int var73 = (this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]) * var68 + (this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]) * (super.field5764 - var68);
                     var71 = (super.field5764 - var69) * var72 + var69 * var73 >> super.field5773 * 2;
                  }

                  int var74 = (arg0 << super.field5773) + var68;
                  int var75 = (arg1 << super.field5773) + var69;
                  var52.field9653[var53] = (short)var68;
                  var52.field9656[var53] = (short)var69;
                  var52.field9657[var53] = (short)(this.method3288(var74, (byte)121, var75) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field9650[var53] = var71 << 25;
                     } else {
                        var52.field9650[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field9651[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field9650[var53] = class663.method4846(var76, method3609(arg6[var53] >> 8, var71), arg10, 16711680);
                     if (arg7 != null) {
                        var52.field9650[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field9658; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field6607.field6667.method911(arg8[var55 * 3], -85).field9894) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field9649 = new int[var52.field9658];
               }

               if (var54) {
                  var52.field9654 = new short[var52.field9658];
                  var52.field9648 = new short[var52.field9658];
               }

               for(int var56 = 0; var56 < var52.field9658; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field9649[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field6607.field6667.method911(var62, 115).field9894) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field6607.field6667.method911(var63, -89).field9894) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field6607.field6667.method911(var64, 72).field9894) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field9654[var56] = (short)var64;
                        var52.field9648[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field6607.field6667.method911(var65, 33).field9894) {
                              var52.field9650[var57] = class193.field2445[class472.method3584(this.field6607.field6667.method911(var65, 50).field9890 & 65535, -10794) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field6607.field6667.method911(var66, 86).field9894) {
                              var52.field9650[var58] = class193.field2445[class472.method3584(this.field6607.field6667.method911(var66, -84).field9890 & 65535, -10794) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field6607.field6667.method911(var67, -91).field9894) {
                              var52.field9650[var59] = class193.field2445[class472.method3584(this.field6607.field6667.method911(var67, 56).field9890 & 65535, -10794) & 65535];
                           }
                        }

                        var52.field9654[var56] = -1;
                     }
                  }
               }

               this.field6604[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method954(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field6598 == null) {
         this.field6598 = new class724[super.field5769][super.field5767];
         this.field6599 = new class222[super.field5769][super.field5767];
      } else if (this.field6594 != null || this.field6606 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field5764 != var20 || var21 != 0 && super.field5764 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class222 var22 = new class222();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field2778 = var23;
         var22.field2787 = new short[var23];
         var22.field2777 = new short[var23];
         var22.field2776 = new short[var23];
         var22.field2774 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field2787[var25] = (short)(this.field6597[arg0][arg1] - this.field6601[arg0][arg1]);
            } else if (var32 == 0 && super.field5764 == var33) {
               var22.field2787[var25] = (short)(this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]);
            } else if (super.field5764 == var32 && super.field5764 == var33) {
               var22.field2787[var25] = (short)(this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]);
            } else if (super.field5764 == var32 && var33 == 0) {
               var22.field2787[var25] = (short)(this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]) * var32 + (this.field6597[arg0][arg1] - this.field6601[arg0][arg1]) * (super.field5764 - var32);
               int var35 = (this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]) * var32 + (this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]) * (super.field5764 - var32);
               var22.field2787[var25] = (short)((super.field5764 - var33) * var34 + var33 * var35 >> super.field5773 * 2);
            }

            int var36 = (arg0 << super.field5773) + var32;
            int var37 = (arg1 << super.field5773) + var33;
            var22.field2777[var25] = (short)var32;
            var22.field2774[var25] = (short)var33;
            var22.field2776[var25] = (short)(this.method3288(var36, (byte)121, var37) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field2787[var25] < 2) {
               var22.field2787[var25] = 2;
            }
         }

         boolean var26 = false;
         int var27 = 0;

         for(int var28 = 0; var28 < var24; ++var28) {
            if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
               ++var27;
            }

            int var30 = arg11[var28];
            if (var30 != -1) {
               class668 var31 = this.field6607.field6667.method911(var30, -89);
               if (!var31.field9894) {
                  var26 = true;
                  if (this.method3607(var31.field9911) || var31.field9905 != 0 || var31.field9909 != 0) {
                     var22.field2786 = (byte)(var22.field2786 | 4);
                  }
               }
            }
         }

         var22.field2782 = new int[var27];
         if (arg10 != null) {
            var22.field2775 = new int[var27];
         }

         var22.field2781 = new short[var27];
         var22.field2785 = new short[var27];
         var22.field2779 = new short[var27];
         if (var26) {
            var22.field2784 = new short[var27];
            var22.field2780 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field2782[var22.field2783] = class472.method3584(arg9[var29], -10794);
               } else {
                  var22.field2782[var22.field2783] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field2775[var22.field2783] = class472.method3584(arg10[var29], -10794);
                  } else {
                     var22.field2775[var22.field2783] = -1;
                  }
               }

               var22.field2781[var22.field2783] = (short)arg6[var29];
               var22.field2785[var22.field2783] = (short)arg7[var29];
               var22.field2779[var22.field2783] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field6607.field6667.method911(arg11[var29], -93).field9894) {
                     var22.field2784[var22.field2783] = (short)arg11[var29];
                     var22.field2780[var22.field2783] = (short)arg12[var29];
                  } else {
                     var22.field2784[var22.field2783] = -1;
                  }
               }

               ++var22.field2783;
            }
         }

         this.field6599[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class724 var38 = new class724();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field10580 = class355.method2815(class472.method3584(arg10[0], -10794), 126, this.field6597[arg0][arg1] - this.field6601[arg0][arg1]);
               if (var39 == -1) {
                  var38.field10579 = (byte)(var38.field10579 | 2);
               }
            }

            if (super.field5770[arg0 + 1][arg1] == super.field5770[arg0][arg1] && super.field5770[arg0 + 1][arg1 + 1] == super.field5770[arg0][arg1] && super.field5770[arg0][arg1 + 1] == super.field5770[arg0][arg1]) {
               var38.field10579 = (byte)(var38.field10579 | 1);
            }

            class668 var41 = null;
            if (var40 != -1) {
               var41 = this.field6607.field6667.method911(var40, -128);
            }

            if (var41 != null && (var38.field10579 & 2) == 0 && !var41.field9894) {
               var38.field10578 = (short)(this.field6597[arg0][arg1] - this.field6601[arg0][arg1]);
               var38.field10581 = (short)(this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]);
               var38.field10582 = (short)(this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]);
               var38.field10577 = (short)(this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]);
               var38.field10576 = (short)var40;
               if (this.method3607(var41.field9911) || var41.field9905 != 0 || var41.field9909 != 0) {
                  var38.field10579 = (byte)(var38.field10579 | 4);
               }
            } else {
               short var42 = class472.method3584(var39, -10794);
               var38.field10578 = (short)class355.method2815(var42, 126, this.field6597[arg0][arg1] - this.field6601[arg0][arg1]);
               var38.field10581 = (short)class355.method2815(var42, 126, this.field6597[arg0 + 1][arg1] - this.field6601[arg0 + 1][arg1]);
               var38.field10582 = (short)class355.method2815(var42, 126, this.field6597[arg0 + 1][arg1 + 1] - this.field6601[arg0 + 1][arg1 + 1]);
               var38.field10577 = (short)class355.method2815(var42, 126, this.field6597[arg0][arg1 + 1] - this.field6601[arg0][arg1 + 1]);
               var38.field10576 = -1;
            }

            this.field6598[arg0][arg1] = var38;
         }

      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "YA",
      descriptor = "()V"
   )
   public final void method946() {
      this.field6597 = null;
      this.field6601 = null;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IIZLsr;Lto;[I[I[I[II)V"
   )
   private final void method3611(int arg0, int arg1, boolean arg2, class640 arg3, class236 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class386 var11 = this.field6594[arg0][arg1];
      if (var11 != null) {
         if ((var11.field5339 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field5339 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field5764 * arg0;
            int var13 = super.field5764 + var12;
            int var14 = super.field5764 * arg1;
            int var15 = super.field5764 + var14;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            float var22;
            float var23;
            float var24;
            float var25;
            int var33;
            int var35;
            int var37;
            int var39;
            int var41;
            int var43;
            int var45;
            int var47;
            if ((var11.field5339 & 1) != 0 && !arg2) {
               int var20 = super.field5770[arg0][arg1];
               float var21 = (float)var20 * this.field6602;
               if (this.field6605 == -1) {
                  var22 = (float)var14 * this.field6614 + (float)var12 * this.field6611 + var21 + this.field6612;
                  if (var22 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var23 = (float)var14 * this.field6614 + (float)var13 * this.field6611 + var21 + this.field6612;
                  if (var23 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var24 = (float)var15 * this.field6614 + (float)var13 * this.field6611 + var21 + this.field6612;
                  if (var24 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var25 = (float)var15 * this.field6614 + (float)var12 * this.field6611 + var21 + this.field6612;
                  if (var25 <= (float)this.field6607.field2509) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field6614 + (float)var12 * this.field6611 + var21 + this.field6612;
                  var23 = (float)var14 * this.field6614 + (float)var13 * this.field6611 + var21 + this.field6612;
                  var24 = (float)var15 * this.field6614 + (float)var13 * this.field6611 + var21 + this.field6612;
                  var25 = (float)var15 * this.field6614 + (float)var12 * this.field6611 + var21 + this.field6612;
               }

               if (arg3.field9393) {
                  int var26 = (int)(var22 - (float)arg3.field9386);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field9386);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field9386);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field9386);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field6595;
               float var31 = (float)var20 * this.field6600;
               if (this.field6605 == -1) {
                  float var32 = (float)var14 * this.field6603 + (float)var12 * this.field6615 + var30 + this.field6610;
                  var33 = (int)((float)this.field6607.field2491 * var32 / var22) + arg4.field2961;
                  float var34 = (float)var14 * this.field6608 + (float)var12 * this.field6613 + var31 + this.field6609;
                  var35 = (int)((float)this.field6607.field2501 * var34 / var22) + arg4.field2975;
                  float var36 = (float)var14 * this.field6603 + (float)var13 * this.field6615 + var30 + this.field6610;
                  var37 = (int)((float)this.field6607.field2491 * var36 / var23) + arg4.field2961;
                  float var38 = (float)var14 * this.field6608 + (float)var13 * this.field6613 + var31 + this.field6609;
                  var39 = (int)((float)this.field6607.field2501 * var38 / var23) + arg4.field2975;
                  float var40 = (float)var15 * this.field6603 + (float)var13 * this.field6615 + var30 + this.field6610;
                  var41 = (int)((float)this.field6607.field2491 * var40 / var24) + arg4.field2961;
                  float var42 = (float)var15 * this.field6608 + (float)var13 * this.field6613 + var31 + this.field6609;
                  var43 = (int)((float)this.field6607.field2501 * var42 / var24) + arg4.field2975;
                  float var44 = (float)var15 * this.field6603 + (float)var12 * this.field6615 + var30 + this.field6610;
                  var45 = (int)((float)this.field6607.field2491 * var44 / var25) + arg4.field2961;
                  float var46 = (float)var15 * this.field6608 + (float)var12 * this.field6613 + var31 + this.field6609;
                  var47 = (int)((float)this.field6607.field2501 * var46 / var25) + arg4.field2975;
               } else {
                  float var48 = (float)var14 * this.field6603 + (float)var12 * this.field6615 + var30 + this.field6610;
                  var33 = (int)((float)this.field6607.field2491 * var48 / (float)this.field6605) + arg4.field2961;
                  float var49 = (float)var14 * this.field6608 + (float)var12 * this.field6613 + var31 + this.field6609;
                  var35 = (int)((float)this.field6607.field2501 * var49 / (float)this.field6605) + arg4.field2975;
                  float var50 = (float)var14 * this.field6603 + (float)var13 * this.field6615 + var30 + this.field6610;
                  var37 = (int)((float)this.field6607.field2491 * var50 / (float)this.field6605) + arg4.field2961;
                  float var51 = (float)var14 * this.field6608 + (float)var13 * this.field6613 + var31 + this.field6609;
                  var39 = (int)((float)this.field6607.field2501 * var51 / (float)this.field6605) + arg4.field2975;
                  float var52 = (float)var15 * this.field6603 + (float)var13 * this.field6615 + var30 + this.field6610;
                  var41 = (int)((float)this.field6607.field2491 * var52 / (float)this.field6605) + arg4.field2961;
                  float var53 = (float)var15 * this.field6608 + (float)var13 * this.field6613 + var31 + this.field6609;
                  var43 = (int)((float)this.field6607.field2501 * var53 / (float)this.field6605) + arg4.field2975;
                  float var54 = (float)var15 * this.field6603 + (float)var12 * this.field6615 + var30 + this.field6610;
                  var45 = (int)((float)this.field6607.field2491 * var54 / (float)this.field6605) + arg4.field2961;
                  float var55 = (float)var15 * this.field6608 + (float)var12 * this.field6613 + var31 + this.field6609;
                  var47 = (int)((float)this.field6607.field2501 * var55 / (float)this.field6605) + arg4.field2975;
               }
            } else {
               int var56 = super.field5770[arg0][arg1];
               int var57 = super.field5770[arg0 + 1][arg1];
               int var58 = super.field5770[arg0 + 1][arg1 + 1];
               int var59 = super.field5770[arg0][arg1 + 1];
               if (this.field6605 == -1) {
                  var22 = (float)var14 * this.field6614 + (float)var12 * this.field6611 + (float)var56 * this.field6602 + this.field6612;
                  if (var22 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var23 = (float)var14 * this.field6614 + (float)var13 * this.field6611 + (float)var57 * this.field6602 + this.field6612;
                  if (var23 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var24 = (float)var15 * this.field6614 + (float)var13 * this.field6611 + (float)var58 * this.field6602 + this.field6612;
                  if (var24 <= (float)this.field6607.field2509) {
                     return;
                  }

                  var25 = (float)var15 * this.field6614 + (float)var12 * this.field6611 + (float)var59 * this.field6602 + this.field6612;
                  if (var25 <= (float)this.field6607.field2509) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field6614 + (float)var12 * this.field6611 + (float)var56 * this.field6602 + this.field6612;
                  var23 = (float)var14 * this.field6614 + (float)var13 * this.field6611 + (float)var57 * this.field6602 + this.field6612;
                  var24 = (float)var15 * this.field6614 + (float)var13 * this.field6611 + (float)var58 * this.field6602 + this.field6612;
                  var25 = (float)var15 * this.field6614 + (float)var12 * this.field6611 + (float)var59 * this.field6602 + this.field6612;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field9386);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field5344 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field9386);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field5346 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field9386);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field5347 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field9386);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field5342 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field9393) {
                  int var68 = (int)(var22 - (float)arg3.field9386);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field9386);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field9386);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field9386);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field6605 == -1) {
                  float var72 = (float)var14 * this.field6603 + (float)var12 * this.field6615 + (float)var56 * this.field6595 + this.field6610;
                  var33 = (int)((float)this.field6607.field2491 * var72 / var22) + arg4.field2961;
                  float var73 = (float)var14 * this.field6608 + (float)var12 * this.field6613 + (float)var56 * this.field6600 + this.field6609;
                  var35 = (int)((float)this.field6607.field2501 * var73 / var22) + arg4.field2975;
                  float var74 = (float)var14 * this.field6603 + (float)var13 * this.field6615 + (float)var57 * this.field6595 + this.field6610;
                  var37 = (int)((float)this.field6607.field2491 * var74 / var23) + arg4.field2961;
                  float var75 = (float)var14 * this.field6608 + (float)var13 * this.field6613 + (float)var57 * this.field6600 + this.field6609;
                  var39 = (int)((float)this.field6607.field2501 * var75 / var23) + arg4.field2975;
                  float var76 = (float)var15 * this.field6603 + (float)var13 * this.field6615 + (float)var58 * this.field6595 + this.field6610;
                  var41 = (int)((float)this.field6607.field2491 * var76 / var24) + arg4.field2961;
                  float var77 = (float)var15 * this.field6608 + (float)var13 * this.field6613 + (float)var58 * this.field6600 + this.field6609;
                  var43 = (int)((float)this.field6607.field2501 * var77 / var24) + arg4.field2975;
                  float var78 = (float)var15 * this.field6603 + (float)var12 * this.field6615 + (float)var59 * this.field6595 + this.field6610;
                  var45 = (int)((float)this.field6607.field2491 * var78 / var25) + arg4.field2961;
                  float var79 = (float)var15 * this.field6608 + (float)var12 * this.field6613 + (float)var59 * this.field6600 + this.field6609;
                  var47 = (int)((float)this.field6607.field2501 * var79 / var25) + arg4.field2975;
               } else {
                  float var80 = (float)var14 * this.field6603 + (float)var12 * this.field6615 + (float)var56 * this.field6595 + this.field6610;
                  var33 = (int)((float)this.field6607.field2491 * var80 / (float)this.field6605) + arg4.field2961;
                  float var81 = (float)var14 * this.field6608 + (float)var12 * this.field6613 + (float)var56 * this.field6600 + this.field6609;
                  var35 = (int)((float)this.field6607.field2501 * var81 / (float)this.field6605) + arg4.field2975;
                  float var82 = (float)var14 * this.field6603 + (float)var13 * this.field6615 + (float)var57 * this.field6595 + this.field6610;
                  var37 = (int)((float)this.field6607.field2491 * var82 / (float)this.field6605) + arg4.field2961;
                  float var83 = (float)var14 * this.field6608 + (float)var13 * this.field6613 + (float)var57 * this.field6600 + this.field6609;
                  var39 = (int)((float)this.field6607.field2501 * var83 / (float)this.field6605) + arg4.field2975;
                  float var84 = (float)var15 * this.field6603 + (float)var13 * this.field6615 + (float)var58 * this.field6595 + this.field6610;
                  var41 = (int)((float)this.field6607.field2491 * var84 / (float)this.field6605) + arg4.field2961;
                  float var85 = (float)var15 * this.field6608 + (float)var13 * this.field6613 + (float)var58 * this.field6600 + this.field6609;
                  var43 = (int)((float)this.field6607.field2501 * var85 / (float)this.field6605) + arg4.field2975;
                  float var86 = (float)var15 * this.field6603 + (float)var12 * this.field6615 + (float)var59 * this.field6595 + this.field6610;
                  var45 = (int)((float)this.field6607.field2491 * var86 / (float)this.field6605) + arg4.field2961;
                  float var87 = (float)var15 * this.field6608 + (float)var12 * this.field6613 + (float)var59 * this.field6600 + this.field6609;
                  var47 = (int)((float)this.field6607.field2501 * var87 / (float)this.field6605) + arg4.field2975;
               }
            }

            boolean var88 = var11.field5340 != -1 && this.method3607(this.field6607.field6667.method911(var11.field5340, 54).field9911);
            if (this.field6605 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field2972 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field2965 || var45 > arg4.field2965 || var37 > arg4.field2965;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field5340 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method1887((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field5345 & 16777215, var90 | var11.field5341 & 16777215, var90 | var11.field5338 & 16777215, arg3.field9383, var18, var19, var17, var11.field5340);
                        } else {
                           if (var88) {
                              arg4.field2969 = 100;
                           }

                           arg4.method1882((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class204.method1685(var18 << 24 | arg3.field9383, var11.field5345, 16711935), class204.method1685(var19 << 24 | arg3.field9383, var11.field5341, 16711935), class204.method1685(var17 << 24 | arg3.field9383, var11.field5338, 16711935));
                           arg4.field2969 = 0;
                        }
                     } else if (var11.field5340 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method1887((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field5345 & 16777215, var91 | var11.field5341 & 16777215, var91 | var11.field5338 & 16777215, 0, 0, 0, 0, var11.field5340);
                     } else {
                        if (var88) {
                           arg4.field2969 = 100;
                        }

                        arg4.method1882((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field5345, var11.field5341, var11.field5338);
                        arg4.field2969 = 0;
                     }
                  } else {
                     arg4.method1872((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field9383);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field2972 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field2965 || var37 > arg4.field2965 || var45 > arg4.field2965;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field2969 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field5340 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method1887((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field5348 & 16777215, var93 | var11.field5338 & 16777215, var93 | var11.field5341 & 16777215, arg3.field9383, var16, var17, var19, var11.field5340);
                           return;
                        }

                        if (var88) {
                           arg4.field2969 = 100;
                        }

                        arg4.method1882((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class204.method1685(var16 << 24 | arg3.field9383, var11.field5348, 16711935), class204.method1685(var17 << 24 | arg3.field9383, var11.field5338, 16711935), class204.method1685(var19 << 24 | arg3.field9383, var11.field5341, 16711935));
                        arg4.field2969 = 0;
                        return;
                     }

                     if (var11.field5340 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method1887((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field5348 & 16777215, var94 | var11.field5338 & 16777215, var94 | var11.field5341 & 16777215, 0, 0, 0, 0, var11.field5340);
                        return;
                     }

                     if (var88) {
                        arg4.field2969 = 100;
                     }

                     arg4.method1882((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field5348, var11.field5338, var11.field5341);
                     arg4.field2969 = 0;
                     return;
                  }

                  arg4.method1872((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field9383);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field2972 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field2965 || var45 > arg4.field2965 || var37 > arg4.field2965;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field2969 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field5340 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method1887((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field5345 & 16777215, var96 | var11.field5341 & 16777215, var96 | var11.field5338 & 16777215, arg3.field9383, var18, var19, var17, var11.field5340);
                        } else {
                           if (var88) {
                              arg4.field2969 = 100;
                           }

                           arg4.method1882((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class204.method1685(var18 << 24 | arg3.field9383, var11.field5345, 16711935), class204.method1685(var19 << 24 | arg3.field9383, var11.field5341, 16711935), class204.method1685(var17 << 24 | arg3.field9383, var11.field5338, 16711935));
                           arg4.field2969 = 0;
                        }
                     } else if (var11.field5340 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method1887((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field5345 & 16777215, var97 | var11.field5341 & 16777215, var97 | var11.field5338 & 16777215, 0, 0, 0, 0, var11.field5340);
                     } else {
                        if (var88) {
                           arg4.field2969 = 100;
                        }

                        arg4.method1882((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field5345, var11.field5341, var11.field5338);
                        arg4.field2969 = 0;
                     }
                  } else {
                     arg4.method1872((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field9383);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field2972 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field2965 || var37 > arg4.field2965 || var45 > arg4.field2965;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field2969 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field5340 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method1887((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field5348 & 16777215, var99 | var11.field5338 & 16777215, var99 | var11.field5341 & 16777215, arg3.field9383, var16, var17, var19, var11.field5340);
                           return;
                        }

                        if (var88) {
                           arg4.field2969 = 100;
                        }

                        arg4.method1882((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class204.method1685(var16 << 24 | arg3.field9383, var11.field5348, 16711935), class204.method1685(var17 << 24 | arg3.field9383, var11.field5338, 16711935), class204.method1685(var19 << 24 | arg3.field9383, var11.field5341, 16711935));
                        arg4.field2969 = 0;
                        return;
                     }

                     if (var11.field5340 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method1887((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field5348 & 16777215, var100 | var11.field5338 & 16777215, var100 | var11.field5341 & 16777215, 0, 0, 0, 0, var11.field5340);
                        return;
                     }

                     if (var88) {
                        arg4.field2969 = 100;
                     }

                     arg4.method1882((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field5348, var11.field5338, var11.field5341);
                     arg4.field2969 = 0;
                     return;
                  }

                  arg4.method1872((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field9383);
               }
            }

         }
      } else {
         class643 var101 = this.field6604[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field9652 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field6605 == -1) {
               for(int var102 = 0; var102 < var101.field9655; ++var102) {
                  int var103 = (arg0 << super.field5773) + var101.field9653[var102];
                  int var104 = var101.field9657[var102];
                  int var105 = (arg1 << super.field5773) + var101.field9656[var102];
                  float var106 = (float)var105 * this.field6614 + (float)var103 * this.field6611 + (float)var104 * this.field6602 + this.field6612;
                  if (var106 <= (float)this.field6607.field2509) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field9386);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field9651[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field9393) {
                     int var109 = (int)(var106 - (float)arg3.field9386);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field6603 + (float)var103 * this.field6615 + (float)var104 * this.field6595 + this.field6610;
                  float var111 = (float)var105 * this.field6608 + (float)var103 * this.field6613 + (float)var104 * this.field6600 + this.field6609;
                  arg5[var102] = (int)((float)this.field6607.field2491 * var110 / var106) + arg4.field2961;
                  arg6[var102] = (int)((float)this.field6607.field2501 * var111 / var106) + arg4.field2975;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field9655; ++var112) {
                  int var152 = (arg0 << super.field5773) + var101.field9653[var112];
                  int var153 = var101.field9657[var112];
                  int var154 = (arg1 << super.field5773) + var101.field9656[var112];
                  float var155 = (float)var154 * this.field6614 + (float)var152 * this.field6611 + (float)var153 * this.field6602 + this.field6612;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field6605 - arg3.field9386;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field9651[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field9393) {
                     int var158 = this.field6605 - arg3.field9386;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field6603 + (float)var152 * this.field6615 + (float)var153 * this.field6595 + this.field6610;
                  float var160 = (float)var154 * this.field6608 + (float)var152 * this.field6613 + (float)var153 * this.field6600 + this.field6609;
                  arg5[var112] = (int)((float)this.field6607.field2491 * var159 / (float)this.field6605) + arg4.field2961;
                  arg6[var112] = (int)((float)this.field6607.field2501 * var160 / (float)this.field6605) + arg4.field2975;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field9654 != null) {
               if (this.field6605 == -1) {
                  for(int var113 = 0; var113 < var101.field9658; ++var113) {
                     int var114 = var113 * 3;
                     int var115 = var114 + 1;
                     int var116 = var115 + 1;
                     int var117 = arg5[var114];
                     int var118 = arg5[var115];
                     int var119 = arg5[var116];
                     int var120 = arg6[var114];
                     int var121 = arg6[var115];
                     int var122 = arg6[var116];
                     int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                     if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                        arg4.field2972 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field2965 || var118 > arg4.field2965 || var119 > arg4.field2965;
                        short var124 = var101.field9654[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method3607(this.field6607.field6667.method911(var124, 38).field9911)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method1887((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field9653[var114] / (float)super.field5764, (float)var101.field9653[var115] / (float)super.field5764, (float)var101.field9653[var116] / (float)super.field5764, (float)var101.field9656[var114] / (float)super.field5764, (float)var101.field9656[var115] / (float)super.field5764, (float)var101.field9656[var116] / (float)super.field5764, var125 | var101.field9650[var114] & 16777215, var125 | var101.field9650[var115] & 16777215, var125 | var101.field9650[var116] & 16777215, arg3.field9383, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field9650[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method3607(this.field6607.field6667.method911(var124, 41).field9911)) {
                                    arg4.field2969 = -1694498816;
                                 }

                                 arg4.method1882((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class204.method1685(arg8[var114] << 24 | arg3.field9383, var101.field9650[var114], 16711935), class204.method1685(arg8[var115] << 24 | arg3.field9383, var101.field9650[var115], 16711935), class204.method1685(arg8[var116] << 24 | arg3.field9383, var101.field9650[var116], 16711935));
                                 arg4.field2969 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method3607(this.field6607.field6667.method911(var124, -101).field9911)) {
                                 var126 = -1694498816;
                              }

                              arg4.method1887((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field9653[var114] / (float)super.field5764, (float)var101.field9653[var115] / (float)super.field5764, (float)var101.field9653[var116] / (float)super.field5764, (float)var101.field9656[var114] / (float)super.field5764, (float)var101.field9656[var115] / (float)super.field5764, (float)var101.field9656[var116] / (float)super.field5764, var126 | var101.field9650[var114] & 16777215, var126 | var101.field9650[var115] & 16777215, var126 | var101.field9650[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field9650[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method3607(this.field6607.field6667.method911(var124, 108).field9911)) {
                                 arg4.field2969 = -1694498816;
                              }

                              arg4.method1882((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field9650[var114], var101.field9650[var115], var101.field9650[var116]);
                              arg4.field2969 = 0;
                           }
                        } else {
                           arg4.method1872((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field9383);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field9658; ++var127) {
                  int var128 = var127 * 3;
                  int var129 = var128 + 1;
                  int var130 = var129 + 1;
                  int var131 = arg5[var128];
                  int var132 = arg5[var129];
                  int var133 = arg5[var130];
                  int var134 = arg6[var128];
                  int var135 = arg6[var129];
                  int var136 = arg6[var130];
                  int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                  if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                     arg4.field2972 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field2965 || var132 > arg4.field2965 || var133 > arg4.field2965;
                     short var138 = var101.field9654[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method3607(this.field6607.field6667.method911(var138, 78).field9911)) {
                           arg4.field2969 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method3607(this.field6607.field6667.method911(var138, -119).field9911)) {
                                 var139 = -1694498816;
                              }

                              arg4.method1887((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field9653[var128] / (float)super.field5764, (float)var101.field9653[var129] / (float)super.field5764, (float)var101.field9653[var130] / (float)super.field5764, (float)var101.field9656[var128] / (float)super.field5764, (float)var101.field9656[var129] / (float)super.field5764, (float)var101.field9656[var130] / (float)super.field5764, var139 | var101.field9650[var128] & 16777215, var139 | var101.field9650[var129] & 16777215, var139 | var101.field9650[var130] & 16777215, arg3.field9383, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field9650[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method3607(this.field6607.field6667.method911(var138, 110).field9911)) {
                                 arg4.field2969 = -1694498816;
                              }

                              arg4.method1882((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class204.method1685(arg8[var128] << 24 | arg3.field9383, var101.field9650[var128], 16711935), class204.method1685(arg8[var129] << 24 | arg3.field9383, var101.field9650[var129], 16711935), class204.method1685(arg8[var130] << 24 | arg3.field9383, var101.field9650[var130], 16711935));
                              arg4.field2969 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method3607(this.field6607.field6667.method911(var138, -105).field9911)) {
                              var140 = -1694498816;
                           }

                           arg4.method1887((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field9653[var128] / (float)super.field5764, (float)var101.field9653[var129] / (float)super.field5764, (float)var101.field9653[var130] / (float)super.field5764, (float)var101.field9656[var128] / (float)super.field5764, (float)var101.field9656[var129] / (float)super.field5764, (float)var101.field9656[var130] / (float)super.field5764, var140 | var101.field9650[var128] & 16777215, var140 | var101.field9650[var129] & 16777215, var140 | var101.field9650[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field9650[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method3607(this.field6607.field6667.method911(var138, 34).field9911)) {
                              arg4.field2969 = -1694498816;
                           }

                           arg4.method1882((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field9650[var128], var101.field9650[var129], var101.field9650[var130]);
                           arg4.field2969 = 0;
                        }

                        arg4.field2969 = 0;
                     } else {
                        arg4.method1872((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field9383);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field9658; ++var141) {
               int var142 = var141 * 3;
               int var143 = var142 + 1;
               int var144 = var143 + 1;
               int var145 = arg5[var142];
               int var146 = arg5[var143];
               int var147 = arg5[var144];
               int var148 = arg6[var142];
               int var149 = arg6[var143];
               int var150 = arg6[var144];
               int var151 = arg8[var142] + arg8[var143] + arg8[var144];
               if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                  arg4.field2972 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field2965 || var146 > arg4.field2965 || var147 > arg4.field2965;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field9650[var142] & 16777215) != 0) {
                           arg4.method1882((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class663.method4846(arg8[var142], var101.field9650[var142], arg3.field9383, 16711680), class663.method4846(arg8[var143], var101.field9650[var143], arg3.field9383, 16711680), class663.method4846(arg8[var144], var101.field9650[var144], arg3.field9383, 16711680));
                        }
                     } else if ((var101.field9650[var142] & 16777215) != 0) {
                        arg4.method1882((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field9650[var142], var101.field9650[var143], var101.field9650[var144]);
                     }
                  } else {
                     arg4.method1872((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field9383);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "(III)V"
   )
   private final void method3612(int arg0, int arg1, int arg2) {
      class640 var4 = this.field6607.method1622(Thread.currentThread());
      var4.field9425.field2969 = 0;
      if (this.field6594 != null) {
         this.method3611(arg0, arg1, var4.field9382, var4, var4.field9425, var4.field9400, var4.field9420, var4.field9429, var4.field9413, arg2);
      } else if (this.field6598 != null) {
         this.method3606(arg0, arg1, var4.field9425, var4.field9400, var4.field9420, var4.field9429, var4.field9413, arg2);
      } else {
         if (this.field6606 != null) {
            this.method3613(arg0, arg1, var4.field9382, var4, var4.field9425, var4.field9400, var4.field9420, var4.field9429, var4.field9413, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(IIZLsr;Lto;[I[I[I[II)V"
   )
   private final void method3613(int arg0, int arg1, boolean arg2, class640 arg3, class236 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class445 var11 = this.field6606[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field6605 == -1) {
               for(int var12 = 0; var12 < var11.field6026; ++var12) {
                  int var13 = (arg0 << super.field5773) + var11.field6025[var12];
                  int var14 = var11.field6024[var12];
                  int var15 = (arg1 << super.field5773) + var11.field6032[var12];
                  float var16 = (float)var15 * this.field6614 + (float)var13 * this.field6611 + (float)var14 * this.field6602 + this.field6612;
                  if (var16 <= (float)this.field6607.field2509) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field9386);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field6030[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field9393) {
                     int var19 = (int)(var16 - (float)arg3.field9386);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field6603 + (float)var13 * this.field6615 + (float)var14 * this.field6595 + this.field6610;
                  float var21 = (float)var15 * this.field6608 + (float)var13 * this.field6613 + (float)var14 * this.field6600 + this.field6609;
                  arg5[var12] = (int)((float)this.field6607.field2491 * var20 / var16) + arg4.field2961;
                  arg6[var12] = (int)((float)this.field6607.field2501 * var21 / var16) + arg4.field2975;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field6026; ++var22) {
                  int var36 = (arg0 << super.field5773) + var11.field6025[var22];
                  int var37 = var11.field6024[var22];
                  int var38 = (arg1 << super.field5773) + var11.field6032[var22];
                  float var39 = (float)var38 * this.field6614 + (float)var36 * this.field6611 + (float)var37 * this.field6602 + this.field6612;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field6605 - arg3.field9386;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field6030[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field9393) {
                     int var42 = this.field6605 - arg3.field9386;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field6603 + (float)var36 * this.field6615 + (float)var37 * this.field6595 + this.field6610;
                  float var44 = (float)var38 * this.field6608 + (float)var36 * this.field6613 + (float)var37 * this.field6600 + this.field6609;
                  arg5[var22] = (int)((float)this.field6607.field2491 * var43 / (float)this.field6605) + arg4.field2961;
                  arg6[var22] = (int)((float)this.field6607.field2501 * var44 / (float)this.field6605) + arg4.field2975;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field5764;

            for(int var24 = 0; var24 < var11.field6029; ++var24) {
               int var25 = var24 * 3;
               int var26 = var25 + 1;
               int var27 = var26 + 1;
               int var28 = arg5[var25];
               int var29 = arg5[var26];
               int var30 = arg5[var27];
               int var31 = arg6[var25];
               int var32 = arg6[var26];
               int var33 = arg6[var27];
               if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                  arg4.field2972 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field2965 || var29 > arg4.field2965 || var30 > arg4.field2965;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field5773;
                     int var35 = arg1 << super.field5773;
                     if ((var11.field6022[var25] & 16777215) != 0) {
                        if (var11.field6027[var25] == var11.field6027[var26] && var11.field6027[var25] == var11.field6027[var27] && var11.field6031[var25] == var11.field6031[var26] && var11.field6031[var25] == var11.field6031[var27]) {
                           arg4.method1887((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field6025[var25] + var34) / (float)var11.field6031[var25], (float)(var11.field6025[var26] + var34) / (float)var11.field6031[var26], (float)(var11.field6025[var27] + var34) / (float)var11.field6031[var27], (float)(var11.field6032[var25] + var35) / (float)var11.field6031[var25], (float)(var11.field6032[var26] + var35) / (float)var11.field6031[var26], (float)(var11.field6032[var27] + var35) / (float)var11.field6031[var27], var11.field6022[var25], var11.field6022[var26], var11.field6022[var27], arg3.field9383, arg8[var25], arg8[var26], arg8[var27], var11.field6027[var25]);
                        } else {
                           arg4.method1876((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field6025[var25] + var34) / var23, (float)(var11.field6025[var26] + var34) / var23, (float)(var11.field6025[var27] + var34) / var23, (float)(var11.field6032[var25] + var35) / var23, (float)(var11.field6032[var26] + var35) / var23, (float)(var11.field6032[var27] + var35) / var23, var11.field6022[var25], var11.field6022[var26], var11.field6022[var27], arg3.field9383, arg8[var25], arg8[var26], arg8[var27], var11.field6027[var25], var23 / (float)var11.field6031[var25], var11.field6027[var26], var23 / (float)var11.field6031[var26], var11.field6027[var27], var23 / (float)var11.field6031[var27]);
                        }
                     }
                  } else {
                     arg4.method1872((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field9383);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lue;[I)V"
   )
   public final void method955(class243 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method947(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method956(int arg0, int arg1) {
      this.method3612(arg0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!rt",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final class114 method945(int arg0, int arg1, class114 arg2) {
      return null;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class640 var9 = this.field6607.method1622(Thread.currentThread());
      class236 var10 = var9.field9425;
      var10.field2969 = 0;
      var10.field2972 = true;
      this.field6607.method502();
      if (this.field6594 == null && this.field6606 == null) {
         if (this.field6598 != null) {
            this.method3610(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field9400, var9.field9420);
         }

      } else {
         this.method3608(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field9400, var9.field9420);
      }
   }
}
