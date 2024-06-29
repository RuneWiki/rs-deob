import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class649 {
   @OriginalMember(
      owner = "client!wha",
      name = "l",
      descriptor = "[F"
   )
   private float[] field9348 = new float[16];
   @OriginalMember(
      owner = "client!wha",
      name = "h",
      descriptor = "Lfc;"
   )
   private class37 field9347 = new class37(786336);
   @OriginalMember(
      owner = "client!wha",
      name = "f",
      descriptor = "I"
   )
   private int field9354 = class277.method2331(1600, (byte)124);
   @OriginalMember(
      owner = "client!wha",
      name = "q",
      descriptor = "[I"
   )
   private int[] field9360 = new int[1600];
   @OriginalMember(
      owner = "client!wha",
      name = "t",
      descriptor = "[[Lar;"
   )
   private class194[][] field9359 = new class194[1600][64];
   @OriginalMember(
      owner = "client!wha",
      name = "u",
      descriptor = "I"
   )
   private int field9361 = 0;
   @OriginalMember(
      owner = "client!wha",
      name = "g",
      descriptor = "[I"
   )
   private int[] field9362 = new int[8191];
   @OriginalMember(
      owner = "client!wha",
      name = "i",
      descriptor = "[I"
   )
   private int[] field9363 = new int[64];
   @OriginalMember(
      owner = "client!wha",
      name = "o",
      descriptor = "[[Lar;"
   )
   private class194[][] field9364 = new class194[64][768];
   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9365 = new String[]{method4718(method4717("\u007f\u0014L\r")), method4718(method4717("jO\u000eOx")), method4718(method4717("f\tAOD9")), method4718(method4717("f\tAOB9")), method4718(method4717("f\tAOF9")), method4718(method4717("f\tAOC9")), method4718(method4717("f\tAOG9")), method4718(method4717("f\tAOA9")), method4718(method4717("f\tAO@9"))};
   @OriginalMember(
      owner = "client!wha",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field9351 = new int[8];
   @OriginalMember(
      owner = "client!wha",
      name = "r",
      descriptor = "I"
   )
   public static int field9344;
   @OriginalMember(
      owner = "client!wha",
      name = "n",
      descriptor = "I"
   )
   public static int field9345;
   @OriginalMember(
      owner = "client!wha",
      name = "j",
      descriptor = "I"
   )
   public static int field9346;
   @OriginalMember(
      owner = "client!wha",
      name = "s",
      descriptor = "I"
   )
   public static int field9350;
   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "I"
   )
   public static int field9352;
   @OriginalMember(
      owner = "client!wha",
      name = "e",
      descriptor = "I"
   )
   public static int field9353;
   @OriginalMember(
      owner = "client!wha",
      name = "k",
      descriptor = "Lli;"
   )
   private class112 field9358;
   @OriginalMember(
      owner = "client!wha",
      name = "m",
      descriptor = "Lgs;"
   )
   private class436 field9355;
   @OriginalMember(
      owner = "client!wha",
      name = "p",
      descriptor = "Lgs;"
   )
   private class436 field9356;
   @OriginalMember(
      owner = "client!wha",
      name = "d",
      descriptor = "Lgs;"
   )
   private class436 field9357;
   @OriginalMember(
      owner = "client!wha",
      name = "b",
      descriptor = "Lab;"
   )
   public static class698 field9349;

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(Lc;Z)V",
      line = 5
   )
   public final void method4710(class652 arg0, boolean arg1) {
      try {
         this.field9358 = arg0.method4759(24, 196584, arg1, (byte[])null, -104);
         ++field9345;
         this.field9356 = new class436(this.field9358, 5126, 2, 0);
         this.field9355 = new class436(this.field9358, 5126, 3, 8);
         this.field9357 = new class436(this.field9358, 5121, 4, 20);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9365[5] + (arg0 != null ? field9365[1] : field9365[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(ILc;B)V",
      line = 17
   )
   private final void method4711(int arg0, class652 arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         ++field9353;
         OpenGL.glGetFloatv(2982, this.field9348, 0);
         float var5 = this.field9348[0];
         float var6 = this.field9348[4];
         float var7 = this.field9348[8];
         float var8 = this.field9348[1];
         float var9 = this.field9348[5];
         float var10 = this.field9348[9];
         float var11 = var5 + var8;
         float var12 = var6 + var9;
         float var13 = var7 + var10;
         float var14 = -var8 + var5;
         float var15 = var6 - var9;
         float var16 = -var10 + var7;
         float var17 = -var5 + var8;
         float var18 = var9 - var6;
         if (arg2 <= 77) {
            this.method4711(67, (class652)null, (byte)7);
         }

         int var10000;
         float var19;
         int var20;
         class649 var71;
         label248: {
            var19 = -var7 + var10;
            this.field9347.field5436 = 0;
            if (!arg1.field9695) {
               label134: {
                  var20 = arg0 + -1;
                  if (var4) {
                     var10000 = ~this.field9360[var20] >= -65 ? this.field9360[var20] : 64;
                  } else if (var20 < 0) {
                     if (!var4) {
                        break label134;
                     }

                     var10000 = 64;
                  } else {
                     var10000 = ~this.field9360[var20] >= -65 ? this.field9360[var20] : 64;
                  }

                  while(true) {
                     int var21 = var10000;
                     if (var21 <= 0) {
                        --var20;
                     } else {
                        int var22 = var21 - 1;
                        class194 var23;
                        int var24;
                        byte var25;
                        byte var26;
                        byte var27;
                        byte var28;
                        float var29;
                        float var30;
                        float var31;
                        int var32;
                        if (var4) {
                           var23 = this.field9359[var20][var22];
                           var24 = var23.field3011;
                           var25 = (byte)(var24 >> 16);
                           var26 = (byte)(var24 >> 8);
                           var27 = (byte)var24;
                           var28 = (byte)(var24 >>> 24);
                           var29 = (float)(var23.field3005 >> 12);
                           var30 = (float)(var23.field3009 >> 12);
                           var31 = (float)(var23.field3014 >> 12);
                           var32 = var23.field3013 >> 12;
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, (float)(-var32) * var11 + var29);
                           this.field9347.method266(115976568, (float)(-var32) * var12 + var30);
                           this.field9347.method266(115976568, (float)(-var32) * var13 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, (float)var32 * var14 + var29);
                           this.field9347.method266(115976568, (float)var32 * var15 + var30);
                           this.field9347.method266(115976568, (float)var32 * var16 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, (float)var32 * var11 + var29);
                           this.field9347.method266(115976568, (float)var32 * var12 + var30);
                           this.field9347.method266(115976568, (float)var32 * var13 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, (float)var32 * var17 + var29);
                           this.field9347.method266(115976568, (float)var32 * var18 + var30);
                           this.field9347.method266(115976568, (float)var32 * var19 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           --var22;
                        }

                        while(true) {
                           if (~var22 > -1) {
                              var71 = this;
                              if (!var4) {
                                 if (~this.field9360[var20] >= -65) {
                                    --var20;
                                    break;
                                 }

                                 int var33 = this.field9360[var20] + -65;
                                 int var34 = this.field9363[var33] + -1;
                                 if (!var4 && var34 < 0) {
                                    --var20;
                                    break;
                                 }

                                 do {
                                    class194 var35 = this.field9364[var33][var34];
                                    int var36 = var35.field3011;
                                    byte var37 = (byte)(var36 >> 16);
                                    byte var38 = (byte)(var36 >> 8);
                                    byte var39 = (byte)var36;
                                    byte var40 = (byte)(var36 >>> 24);
                                    float var41 = (float)(var35.field3005 >> 12);
                                    float var42 = (float)(var35.field3009 >> 12);
                                    float var43 = (float)(var35.field3014 >> 12);
                                    int var44 = var35.field3013 >> 12;
                                    this.field9347.method266(115976568, 0.0F);
                                    this.field9347.method266(115976568, 0.0F);
                                    this.field9347.method266(115976568, (float)(-var44) * var11 + var41);
                                    this.field9347.method266(115976568, (float)(-var44) * var12 + var42);
                                    this.field9347.method266(115976568, (float)(-var44) * var13 + var43);
                                    this.field9347.method2864(-26110, var37);
                                    this.field9347.method2864(-26110, var38);
                                    this.field9347.method2864(-26110, var39);
                                    this.field9347.method2864(-26110, var40);
                                    this.field9347.method266(115976568, 1.0F);
                                    this.field9347.method266(115976568, 0.0F);
                                    this.field9347.method266(115976568, (float)var44 * var14 + var41);
                                    this.field9347.method266(115976568, (float)var44 * var15 + var42);
                                    this.field9347.method266(115976568, (float)var44 * var16 + var43);
                                    this.field9347.method2864(-26110, var37);
                                    this.field9347.method2864(-26110, var38);
                                    this.field9347.method2864(-26110, var39);
                                    this.field9347.method2864(-26110, var40);
                                    this.field9347.method266(115976568, 1.0F);
                                    this.field9347.method266(115976568, 1.0F);
                                    this.field9347.method266(115976568, (float)var44 * var11 + var41);
                                    this.field9347.method266(115976568, (float)var44 * var12 + var42);
                                    this.field9347.method266(115976568, (float)var44 * var13 + var43);
                                    this.field9347.method2864(-26110, var37);
                                    this.field9347.method2864(-26110, var38);
                                    this.field9347.method2864(-26110, var39);
                                    this.field9347.method2864(-26110, var40);
                                    this.field9347.method266(115976568, 0.0F);
                                    this.field9347.method266(115976568, 1.0F);
                                    this.field9347.method266(115976568, (float)var44 * var17 + var41);
                                    this.field9347.method266(115976568, (float)var44 * var18 + var42);
                                    this.field9347.method266(115976568, (float)var44 * var19 + var43);
                                    this.field9347.method2864(-26110, var37);
                                    this.field9347.method2864(-26110, var38);
                                    this.field9347.method2864(-26110, var39);
                                    this.field9347.method2864(-26110, var40);
                                    --var34;
                                 } while(var34 >= 0);

                                 --var20;
                                 break;
                              }
                           } else {
                              var71 = this;
                           }

                           var23 = var71.field9359[var20][var22];
                           var24 = var23.field3011;
                           var25 = (byte)(var24 >> 16);
                           var26 = (byte)(var24 >> 8);
                           var27 = (byte)var24;
                           var28 = (byte)(var24 >>> 24);
                           var29 = (float)(var23.field3005 >> 12);
                           var30 = (float)(var23.field3009 >> 12);
                           var31 = (float)(var23.field3014 >> 12);
                           var32 = var23.field3013 >> 12;
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, (float)(-var32) * var11 + var29);
                           this.field9347.method266(115976568, (float)(-var32) * var12 + var30);
                           this.field9347.method266(115976568, (float)(-var32) * var13 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, (float)var32 * var14 + var29);
                           this.field9347.method266(115976568, (float)var32 * var15 + var30);
                           this.field9347.method266(115976568, (float)var32 * var16 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, (float)var32 * var11 + var29);
                           this.field9347.method266(115976568, (float)var32 * var12 + var30);
                           this.field9347.method266(115976568, (float)var32 * var13 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           this.field9347.method266(115976568, 0.0F);
                           this.field9347.method266(115976568, 1.0F);
                           this.field9347.method266(115976568, (float)var32 * var17 + var29);
                           this.field9347.method266(115976568, (float)var32 * var18 + var30);
                           this.field9347.method266(115976568, (float)var32 * var19 + var31);
                           this.field9347.method2864(-26110, var25);
                           this.field9347.method2864(-26110, var26);
                           this.field9347.method2864(-26110, var27);
                           this.field9347.method2864(-26110, var28);
                           --var22;
                        }
                     }

                     if (var20 < 0) {
                        if (!var4) {
                           break;
                        }

                        var10000 = 64;
                     } else {
                        var10000 = ~this.field9360[var20] >= -65 ? this.field9360[var20] : 64;
                     }
                  }
               }

               if (!var4) {
                  var10000 = ~this.field9347.field5436;
                  if (!var4) {
                     if (var10000 != -1) {
                        this.field9358.method1056(-1752, this.field9347.field5436, 24, this.field9347.field5428);
                        arg1.method4768(-677, this.field9356, this.field9357, this.field9355, (class436)null);
                        arg1.method4812((byte)30, this.field9347.field5436 / 24, 7, 0);
                        return;
                     }

                     return;
                  }

                  var10000 = var10000 < -1 ? 64 : this.field9360[var20];
                  break label248;
               }
            }

            var20 = arg0 + -1;
            if (var4) {
               var10000 = ~this.field9360[var20] < -65 ? 64 : this.field9360[var20];
            } else if (~var20 > -1) {
               var10000 = ~this.field9347.field5436;
               if (!var4) {
                  if (var10000 != -1) {
                     this.field9358.method1056(-1752, this.field9347.field5436, 24, this.field9347.field5428);
                     arg1.method4768(-677, this.field9356, this.field9357, this.field9355, (class436)null);
                     arg1.method4812((byte)30, this.field9347.field5436 / 24, 7, 0);
                     return;
                  }

                  return;
               }

               var10000 = var10000 < -1 ? 64 : this.field9360[var20];
            } else {
               var10000 = ~this.field9360[var20] < -65 ? 64 : this.field9360[var20];
            }
         }

         while(true) {
            int var45 = var10000;
            if (var45 <= 0) {
               --var20;
            } else {
               int var46 = var45 + -1;
               class194 var47;
               int var48;
               byte var49;
               byte var50;
               byte var51;
               byte var52;
               float var53;
               float var54;
               float var55;
               int var56;
               if (var4) {
                  var47 = this.field9359[var20][var46];
                  var48 = var47.field3011;
                  var49 = (byte)(var48 >> 16);
                  var50 = (byte)(var48 >> 8);
                  var51 = (byte)var48;
                  var52 = (byte)(var48 >>> 24);
                  var53 = (float)(var47.field3005 >> 12);
                  var54 = (float)(var47.field3009 >> 12);
                  var55 = (float)(var47.field3014 >> 12);
                  var56 = var47.field3013 >> 12;
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, (float)(-var56) * var11 + var53);
                  this.field9347.method265(29481, (float)(-var56) * var12 + var54);
                  this.field9347.method265(29481, (float)(-var56) * var13 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, (float)var56 * var14 + var53);
                  this.field9347.method265(29481, (float)var56 * var15 + var54);
                  this.field9347.method265(29481, (float)var56 * var16 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, (float)var56 * var11 + var53);
                  this.field9347.method265(29481, (float)var56 * var12 + var54);
                  this.field9347.method265(29481, (float)var56 * var13 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, (float)var56 * var17 + var53);
                  this.field9347.method265(29481, (float)var56 * var18 + var54);
                  this.field9347.method265(29481, (float)var56 * var19 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  --var46;
               }

               while(true) {
                  if (~var46 > -1) {
                     var71 = this;
                     if (!var4) {
                        if (this.field9360[var20] <= 64) {
                           --var20;
                           break;
                        }

                        int var57 = this.field9360[var20] + -65;
                        int var58 = this.field9363[var57] + -1;
                        if (!var4 && ~var58 > -1) {
                           --var20;
                           break;
                        }

                        do {
                           class194 var59 = this.field9364[var57][var58];
                           int var60 = var59.field3011;
                           byte var61 = (byte)(var60 >> 16);
                           byte var62 = (byte)(var60 >> 8);
                           byte var63 = (byte)var60;
                           byte var64 = (byte)(var60 >>> 24);
                           float var65 = (float)(var59.field3005 >> 12);
                           float var66 = (float)(var59.field3009 >> 12);
                           float var67 = (float)(var59.field3014 >> 12);
                           int var68 = var59.field3013 >> 12;
                           this.field9347.method265(29481, 0.0F);
                           this.field9347.method265(29481, 0.0F);
                           this.field9347.method265(29481, (float)(-var68) * var11 + var65);
                           this.field9347.method265(29481, (float)(-var68) * var12 + var66);
                           this.field9347.method265(29481, (float)(-var68) * var13 + var67);
                           this.field9347.method2864(-26110, var61);
                           this.field9347.method2864(-26110, var62);
                           this.field9347.method2864(-26110, var63);
                           this.field9347.method2864(-26110, var64);
                           this.field9347.method265(29481, 1.0F);
                           this.field9347.method265(29481, 0.0F);
                           this.field9347.method265(29481, (float)var68 * var14 + var65);
                           this.field9347.method265(29481, (float)var68 * var15 + var66);
                           this.field9347.method265(29481, (float)var68 * var16 + var67);
                           this.field9347.method2864(-26110, var61);
                           this.field9347.method2864(-26110, var62);
                           this.field9347.method2864(-26110, var63);
                           this.field9347.method2864(-26110, var64);
                           this.field9347.method265(29481, 1.0F);
                           this.field9347.method265(29481, 1.0F);
                           this.field9347.method265(29481, (float)var68 * var11 + var65);
                           this.field9347.method265(29481, (float)var68 * var12 + var66);
                           this.field9347.method265(29481, (float)var68 * var13 + var67);
                           this.field9347.method2864(-26110, var61);
                           this.field9347.method2864(-26110, var62);
                           this.field9347.method2864(-26110, var63);
                           this.field9347.method2864(-26110, var64);
                           this.field9347.method265(29481, 0.0F);
                           this.field9347.method265(29481, 1.0F);
                           this.field9347.method265(29481, (float)var68 * var17 + var65);
                           this.field9347.method265(29481, (float)var68 * var18 + var66);
                           this.field9347.method265(29481, (float)var68 * var19 + var67);
                           this.field9347.method2864(-26110, var61);
                           this.field9347.method2864(-26110, var62);
                           this.field9347.method2864(-26110, var63);
                           this.field9347.method2864(-26110, var64);
                           --var58;
                        } while(~var58 <= -1);

                        --var20;
                        break;
                     }
                  } else {
                     var71 = this;
                  }

                  var47 = var71.field9359[var20][var46];
                  var48 = var47.field3011;
                  var49 = (byte)(var48 >> 16);
                  var50 = (byte)(var48 >> 8);
                  var51 = (byte)var48;
                  var52 = (byte)(var48 >>> 24);
                  var53 = (float)(var47.field3005 >> 12);
                  var54 = (float)(var47.field3009 >> 12);
                  var55 = (float)(var47.field3014 >> 12);
                  var56 = var47.field3013 >> 12;
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, (float)(-var56) * var11 + var53);
                  this.field9347.method265(29481, (float)(-var56) * var12 + var54);
                  this.field9347.method265(29481, (float)(-var56) * var13 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, (float)var56 * var14 + var53);
                  this.field9347.method265(29481, (float)var56 * var15 + var54);
                  this.field9347.method265(29481, (float)var56 * var16 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, (float)var56 * var11 + var53);
                  this.field9347.method265(29481, (float)var56 * var12 + var54);
                  this.field9347.method265(29481, (float)var56 * var13 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  this.field9347.method265(29481, 0.0F);
                  this.field9347.method265(29481, 1.0F);
                  this.field9347.method265(29481, (float)var56 * var17 + var53);
                  this.field9347.method265(29481, (float)var56 * var18 + var54);
                  this.field9347.method265(29481, (float)var56 * var19 + var55);
                  this.field9347.method2864(-26110, var49);
                  this.field9347.method2864(-26110, var50);
                  this.field9347.method2864(-26110, var51);
                  this.field9347.method2864(-26110, var52);
                  --var46;
               }
            }

            if (~var20 > -1) {
               var10000 = ~this.field9347.field5436;
               if (!var4) {
                  if (var10000 != -1) {
                     this.field9358.method1056(-1752, this.field9347.field5436, 24, this.field9347.field5428);
                     arg1.method4768(-677, this.field9356, this.field9357, this.field9355, (class436)null);
                     arg1.method4812((byte)30, this.field9347.field5436 / 24, 7, 0);
                     return;
                  }

                  return;
               }

               var10000 = var10000 < -1 ? 64 : this.field9360[var20];
            } else {
               var10000 = ~this.field9360[var20] < -65 ? 64 : this.field9360[var20];
            }
         }
      } catch (RuntimeException var70) {
         throw class482.method3757(var70, field9365[7] + arg0 + ',' + (arg1 != null ? field9365[1] : field9365[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(BLfca;Lc;I)V",
      line = 373
   )
   public final void method4712(byte param1, class43 param2, class652 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(ILc;I)V",
      line = 537
   )
   private final void method4713(int arg0, class652 arg1, int arg2) {
      try {
         class664.field9946 = arg1.field9725;
         ++field9352;
         if (arg0 <= 55) {
            this.method4713(64, (class652)null, -15);
         }

         arg1.method4797(0, (float)arg2);
         arg1.method4771(1);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg1.method4779((byte)-35, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9365[4] + arg0 + ',' + (arg1 != null ? field9365[1] : field9365[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(BLc;)V",
      line = 557
   )
   private final void method4714(byte arg0, class652 arg1) {
      try {
         arg1.method4779((byte)-35, true);
         ++field9346;
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (class664.field9946 != arg1.field9725) {
            arg1.method679(class664.field9946);
         }

         int var3 = -52 % ((arg0 - -38) / 60);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9365[6] + arg0 + ',' + (arg1 != null ? field9365[1] : field9365[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(Lc;I)V",
      line = 573
   )
   private final void method4715(class652 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field9355 = null;
         }

         class664.field9946 = arg0.field9725;
         ++field9344;
         arg0.method4761(arg1 + 4098);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg0.method4779((byte)-35, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9365[3] + (arg0 != null ? field9365[1] : field9365[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(I)V",
      line = 591
   )
   public static void method4716(int arg0) {
      try {
         field9351 = null;
         if (arg0 > -119) {
            method4716(57);
         }

         field9349 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9365[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
