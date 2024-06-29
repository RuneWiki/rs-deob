import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class603 implements class494 {
   @OriginalMember(
      owner = "client!nf",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8878 = new String[]{method4411(method4410("5*\u0014?6")), method4411(method4410("5*\u001456")), method4411(method4410(" b\u0014Rc")), method4411(method4410("59V\u0010")), method4411(method4410("5*\u001446")), method4411(method4410("5*\u0014=6")), method4411(method4410("5*\u0014;6")), method4411(method4410("5*\u001486")), method4411(method4410("3)S\u001bv/")), method4411(method4410("9#^\u0005X2 V")), method4411(method4410("7)\\\b")), method4411(method4410("9#N\bq6")), method4411(method4410("9-Y\u0017y)#O\u0012z")), method4411(method4410("/#J")), method4411(method4410("9#B$Q=*I\u0019j")), method4411(method4410("9#B%Q=*I\u0019j")), method4411(method4410("\"\u0001S\u0018z7)")), method4411(method4410("7.")), method4411(method4410("8#V\u0013k)8_\u0004j")), method4411(method4410("9*")), method4411(method4410("9*W")), method4411(method4410("#\u0001S\u0018z7)")), method4411(method4410(")%]\u0014j")), method4411(method4410("9#B+w?8R")), method4411(method4410("5*\u001406")), method4411(method4410("9#^\u0005R>*N")), method4411(method4410("9#^\u0005L2+R\b")), method4411(method4410("9-H")), method4411(method4410("\"\u0003\\\u001am>8")), method4411(method4410(",%^\bv")), method4411(method4410("4*\\\u000f{/\u001c_\u000eJ>\"y\u0005}7)I")), method4411(method4410("/)B\bG\u0014*\\\u000f{/")), method4411(method4410("#\u0003\\\u001am>8")), method4411(method4410("5*\u0014,6")), method4411(method4410("5*\u0014>6")), method4411(method4410("5*\u001466")), method4411(method4410("5*\u001476")), method4411(method4410("5*\u001426")), method4411(method4410("5*\u001436")), method4411(method4410("5*\u001496")), method4411(method4410("5*\u001416"))};
   @OriginalMember(
      owner = "client!nf",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field8840 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!nf",
      name = "q",
      descriptor = "D"
   )
   public static double field8856;
   @OriginalMember(
      owner = "client!nf",
      name = "y",
      descriptor = "I"
   )
   private int field8836;
   @OriginalMember(
      owner = "client!nf",
      name = "O",
      descriptor = "I"
   )
   public static int field8838;
   @OriginalMember(
      owner = "client!nf",
      name = "D",
      descriptor = "I"
   )
   private int field8839;
   @OriginalMember(
      owner = "client!nf",
      name = "h",
      descriptor = "I"
   )
   public static int field8841;
   @OriginalMember(
      owner = "client!nf",
      name = "g",
      descriptor = "I"
   )
   public static int field8843;
   @OriginalMember(
      owner = "client!nf",
      name = "C",
      descriptor = "I"
   )
   public static int field8844;
   @OriginalMember(
      owner = "client!nf",
      name = "L",
      descriptor = "I"
   )
   private int field8845;
   @OriginalMember(
      owner = "client!nf",
      name = "G",
      descriptor = "I"
   )
   public static int field8846;
   @OriginalMember(
      owner = "client!nf",
      name = "x",
      descriptor = "I"
   )
   public static int field8848;
   @OriginalMember(
      owner = "client!nf",
      name = "J",
      descriptor = "I"
   )
   public static int field8849;
   @OriginalMember(
      owner = "client!nf",
      name = "s",
      descriptor = "I"
   )
   public static int field8851;
   @OriginalMember(
      owner = "client!nf",
      name = "F",
      descriptor = "I"
   )
   public static int field8852;
   @OriginalMember(
      owner = "client!nf",
      name = "E",
      descriptor = "I"
   )
   private int field8854;
   @OriginalMember(
      owner = "client!nf",
      name = "e",
      descriptor = "I"
   )
   private int field8855;
   @OriginalMember(
      owner = "client!nf",
      name = "M",
      descriptor = "I"
   )
   private int field8858;
   @OriginalMember(
      owner = "client!nf",
      name = "A",
      descriptor = "I"
   )
   private int field8860;
   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "I"
   )
   public static int field8861;
   @OriginalMember(
      owner = "client!nf",
      name = "K",
      descriptor = "I"
   )
   private int field8862;
   @OriginalMember(
      owner = "client!nf",
      name = "p",
      descriptor = "I"
   )
   private int field8863;
   @OriginalMember(
      owner = "client!nf",
      name = "k",
      descriptor = "I"
   )
   public static int field8864;
   @OriginalMember(
      owner = "client!nf",
      name = "c",
      descriptor = "I"
   )
   public static int field8866;
   @OriginalMember(
      owner = "client!nf",
      name = "d",
      descriptor = "I"
   )
   public static int field8869;
   @OriginalMember(
      owner = "client!nf",
      name = "I",
      descriptor = "I"
   )
   public static int field8870;
   @OriginalMember(
      owner = "client!nf",
      name = "H",
      descriptor = "I"
   )
   public static int field8875;
   @OriginalMember(
      owner = "client!nf",
      name = "u",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field8859;
   @OriginalMember(
      owner = "client!nf",
      name = "f",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field8837;
   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field8874;
   @OriginalMember(
      owner = "client!nf",
      name = "r",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8842;
   @OriginalMember(
      owner = "client!nf",
      name = "l",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8847;
   @OriginalMember(
      owner = "client!nf",
      name = "N",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8850;
   @OriginalMember(
      owner = "client!nf",
      name = "j",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8853;
   @OriginalMember(
      owner = "client!nf",
      name = "m",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8857;
   @OriginalMember(
      owner = "client!nf",
      name = "Q",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8865;
   @OriginalMember(
      owner = "client!nf",
      name = "v",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8867;
   @OriginalMember(
      owner = "client!nf",
      name = "n",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8868;
   @OriginalMember(
      owner = "client!nf",
      name = "t",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8871;
   @OriginalMember(
      owner = "client!nf",
      name = "o",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8873;
   @OriginalMember(
      owner = "client!nf",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8872;
   @OriginalMember(
      owner = "client!nf",
      name = "w",
      descriptor = "Z"
   )
   private boolean field8876;
   @OriginalMember(
      owner = "client!nf",
      name = "B",
      descriptor = "Z"
   )
   private boolean field8877;

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(IIIILfka;)V",
      line = 10
   )
   public static final void method4400(int arg0, int arg1, int arg2, int arg3, class742 arg4) {
      class72 var5 = class349.method2732(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field9003 = (arg1 << class459.field6950) + class572.field8520;
         arg4.field8998 = arg3;
         arg4.field9007 = (arg2 << class459.field6950) + class572.field8520;
         var5.field917 = arg4;
         int var6 = class650.field9484 == class377.field5711 ? 1 : 0;
         if (arg4.method2(-7577)) {
            if (arg4.method5(-26787)) {
               arg4.field8996 = class197.field2449[var6];
               class197.field2449[var6] = arg4;
               return;
            }

            arg4.field8996 = class764.field11222[var6];
            class764.field11222[var6] = arg4;
            class321.field4583 = true;
            return;
         }

         arg4.field8996 = class535.field7803[var6];
         class535.field7803[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!nf",
      name = "d",
      descriptor = "(I)I",
      line = 44
   )
   public final int method2188(int arg0) {
      try {
         if (arg0 != -3535) {
            this.field8873 = null;
         }

         ++field8866;
         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(BI)I",
      line = 57
   )
   private final int method4401(byte arg0, int arg1) {
      try {
         ++field8864;
         if (arg0 != 52) {
            this.field8853 = null;
         }

         return this.field8872 ? (-arg1 + class411.field6305) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8878[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;",
      line = 73
   )
   private final Object method4402(int arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (arg0 >= -1) {
            this.field8837 = null;
         }

         ++field8851;
         Field var4 = arg2.getDeclaredField(arg1);
         Object var5 = var4.get(class238.field3003);
         var4.set(class238.field3003, (Object)null);
         return var5;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8878[40] + arg0 + ',' + (arg1 != null ? field8878[2] : field8878[3]) + ',' + (arg2 != null ? field8878[2] : field8878[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(ZZ)V",
      line = 91
   )
   public final void method2191(boolean arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         if (!this.field8876) {
            label184: {
               if (class238.field3003 == null) {
                  this.field8876 = true;
                  if (var3 == 0) {
                     break label184;
                  }
               }

               if (this.field8837 == null) {
                  try {
                     this.method4404(-103);
                  } catch (Exception var45) {
                     this.field8876 = true;
                  }
               }
            }
         }

         if (!arg1) {
            this.field8874 = null;
         }

         ++field8869;
         if (this.field8876) {
            this.method4403((byte)88);
         } else {
            Graphics var4 = class769.field11271.getGraphics();
            if (var4 == null) {
               class769.field11271.repaint();
            } else {
               try {
                  int var5 = class623.field9082.method3016(0);
                  String var6 = class623.field9082.method3012(14245);
                  if (class718.field10677 == null) {
                     class718.field10677 = class769.field11271.createImage(class207.field2647, class411.field6305);
                  }

                  Graphics var7 = class718.field10677.getGraphics();
                  var7.clearRect(0, 0, class207.field2647, class411.field6305);
                  int var8 = this.field8853.getWidth((ImageObserver)null);
                  int var9 = this.field8871.getWidth((ImageObserver)null);
                  int var10 = this.field8873.getWidth((ImageObserver)null);
                  int var11 = this.field8853.getHeight((ImageObserver)null);
                  int var12 = this.field8871.getHeight((ImageObserver)null);
                  int var13 = this.field8873.getHeight((ImageObserver)null);
                  var7.drawImage(this.field8853, this.method4405(var8, 0) + this.field8839 - this.field8854 / 2, this.method4401((byte)52, var11) - -this.field8860, (ImageObserver)null);
                  int var14 = this.field8839 + var8 + -(this.field8854 / 2);
                  int var15 = this.field8854 / 2 + this.field8839;
                  int var16 = var14;
                  if (var3 != 0) {
                     var7.drawImage(this.field8873, this.method4405(var8, 0) - (-this.field8839 - var14), this.method4401((byte)52, var13) - -this.field8860, (ImageObserver)null);
                     var16 = var10 + var14;
                  }

                  while(true) {
                     while(var16 <= var15) {
                        var7.drawImage(this.field8873, this.method4405(var8, 0) - (-this.field8839 - var16), this.method4401((byte)52, var13) - -this.field8860, (ImageObserver)null);
                        var16 += var10;
                     }

                     var7.drawImage(this.field8871, this.method4405(var9, 0) + this.field8839 + this.field8854 / 2, this.method4401((byte)52, var12) + this.field8860, (ImageObserver)null);
                     int var17 = this.field8867.getWidth((ImageObserver)null);
                     int var18 = this.field8867.getHeight((ImageObserver)null);
                     int var19 = this.field8850.getWidth((ImageObserver)null);
                     int var20 = this.field8850.getHeight((ImageObserver)null);
                     int var21 = this.field8868.getHeight((ImageObserver)null);
                     int var22 = this.field8847.getWidth((ImageObserver)null);
                     int var23 = this.field8847.getHeight((ImageObserver)null);
                     int var24 = this.field8868.getWidth((ImageObserver)null);
                     int var25 = this.field8865.getWidth((ImageObserver)null);
                     int var26 = this.field8842.getWidth((ImageObserver)null);
                     int var27 = this.method4405(this.field8862, 0) + this.field8845;
                     int var28 = this.method4401((byte)52, this.field8836) - -this.field8855;
                     var7.drawImage(this.field8867, var27, var28 - -((-var18 + this.field8836) / 2), (ImageObserver)null);
                     var7.drawImage(this.field8850, var27 - -this.field8862 + -var19, (-var20 + this.field8836) / 2 + var28, (ImageObserver)null);
                     if (var3 == 0) {
                        if (this.field8857 == null) {
                           this.field8857 = class769.field11271.createImage(-var17 + this.field8862 + -var19, this.field8836);
                        }

                        Graphics var29 = this.field8857.getGraphics();
                        int var30 = 0;
                        if (var3 != 0) {
                           var29.drawImage(this.field8847, var30, 0, (ImageObserver)null);
                           var30 += var22;
                        }

                        while(true) {
                           while(~var30 > ~(-var19 + this.field8862 + -var17)) {
                              var29.drawImage(this.field8847, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           int var31 = 0;
                           if (var3 == 0) {
                              if (var3 != 0) {
                                 var29.drawImage(this.field8868, var31, -var21 + this.field8836, (ImageObserver)null);
                                 var31 += var24;
                              }

                              while(true) {
                                 while(this.field8862 - var17 + -var19 > var31) {
                                    var29.drawImage(this.field8868, var31, -var21 + this.field8836, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 int var32 = (-var17 + this.field8862 + -var19) * var5 / 100;
                                 int var10000 = ~var32;
                                 if (var3 == 0) {
                                    byte var48;
                                    if (var10000 < -1) {
                                       Image var33 = class769.field11271.createImage(var32, this.field8836 - (var21 + var23));
                                       int var34 = var33.getWidth((ImageObserver)null);
                                       Graphics var35 = var33.getGraphics();
                                       int var36 = this.field8858 * class578.method4266((byte)-71) / 10 % var25;
                                       int var37 = -var25 + var36;
                                       if (var3 != 0) {
                                          var35.drawImage(this.field8865, var37, 0, (ImageObserver)null);
                                          var37 += var25;
                                       }

                                       while(true) {
                                          while(~var37 > ~var34) {
                                             var35.drawImage(this.field8865, var37, 0, (ImageObserver)null);
                                             var37 += var25;
                                          }

                                          var48 = var29.drawImage(var33, 0, var23, (ImageObserver)null);
                                          if (var3 == 0) {
                                             break;
                                          }

                                          var37 = var48;
                                       }
                                    }

                                    int var38 = var32;
                                    int var39 = -var17 + this.field8862 + -var19 + -var32;
                                    if (~var39 < -1) {
                                       Image var40 = class769.field11271.createImage(var39, -var23 - var21 + this.field8836);
                                       int var41 = var40.getWidth((ImageObserver)null);
                                       Graphics var42 = var40.getGraphics();
                                       int var43 = 0;
                                       if (var3 != 0) {
                                          var42.drawImage(this.field8842, var43, 0, (ImageObserver)null);
                                          var43 += var26;
                                       }

                                       while(true) {
                                          while(~var41 < ~var43) {
                                             var42.drawImage(this.field8842, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          var48 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                          if (var3 == 0) {
                                             break;
                                          }

                                          var43 = var48;
                                       }
                                    }

                                    var7.drawImage(this.field8857, var17 + var27, var28, (ImageObserver)null);
                                    var7.setFont(this.field8837);
                                    var7.setColor(this.field8859);
                                    var7.drawString(var6, (this.field8862 + -this.field8874.stringWidth(var6)) / 2 + var27, this.field8836 / 2 + this.field8863 + var28 + 4);
                                    var4.drawImage(class718.field10677, 0, 0, (ImageObserver)null);
                                    return;
                                 }

                                 var31 = var10000 + -1;
                              }
                           }

                           var30 += var22;
                        }
                     }

                     var16 += var10;
                  }
               } catch (Exception var46) {
                  this.field8876 = true;
               }
            }
         }
      } catch (RuntimeException var47) {
         throw class670.method4877(var47, field8878[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "b",
      descriptor = "(B)V",
      line = 284
   )
   private final void method4403(byte arg0) {
      try {
         if (arg0 != 88) {
            this.field8850 = null;
         }

         class591.method4348(class623.field9082.method3016(arg0 + -88), -14687, class623.field9082.method3012(14245), class336.field4808[class779.field11370], class8.field129[class779.field11370], class379.field5785[class779.field11370]);
         ++field8870;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "e",
      descriptor = "(I)V",
      line = 300
   )
   private final void method4404(int arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field8861;
         Class var2 = class238.field3003.getClass();
         this.field8865 = (Image)this.method4402(-89, field8878[27], var2);
         this.field8842 = (Image)this.method4402(-22, field8878[12], var2);
         this.field8867 = (Image)this.method4402(-30, field8878[10], var2);
         this.field8850 = (Image)this.method4402(-50, field8878[22], var2);
         this.field8847 = (Image)this.method4402(-2, field8878[13], var2);
         this.field8868 = (Image)this.method4402(-94, field8878[11], var2);
         this.field8853 = (Image)this.method4402(-51, field8878[25], var2);
         this.field8871 = (Image)this.method4402(-34, field8878[26], var2);
         this.field8873 = (Image)this.method4402(-36, field8878[9], var2);
         this.field8837 = (Font)this.method4402(-113, field8878[19], var2);
         this.field8874 = (FontMetrics)this.method4402(-118, field8878[20], var2);
         this.field8859 = (Color)this.method4402(-19, field8878[18], var2);
         Object var3 = this.method4402(-80, field8878[17], var2);
         Class var4 = var3.getClass();
         if (arg0 < -61) {
            this.field8877 = this.method4409(var3, field8878[21], (byte)-84, var4);
            this.field8872 = this.method4409(var3, field8878[16], (byte)-107, var4);
            this.field8845 = this.method4406((byte)-99, var3, var4, field8878[32]);
            this.field8855 = this.method4406((byte)-117, var3, var4, field8878[28]);
            this.field8862 = this.method4406((byte)-92, var3, var4, field8878[29]);
            this.field8836 = this.method4406((byte)-87, var3, var4, field8878[8]);
            this.field8839 = this.method4406((byte)-115, var3, var4, field8878[14]);
            this.field8860 = this.method4406((byte)-110, var3, var4, field8878[15]);
            this.field8854 = this.method4406((byte)-102, var3, var4, field8878[23]);
            this.field8863 = this.method4406((byte)-75, var3, var4, field8878[31]);
            this.field8858 = this.method4406((byte)-77, var3, var4, field8878[30]);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8878[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "b",
      descriptor = "(I)V",
      line = 343
   )
   public final void method2184(int arg0) {
      try {
         if (arg0 == 30953) {
            ++field8844;
            class729.method5310((byte)-44);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "c",
      descriptor = "(I)I",
      line = 354
   )
   public final int method2186(int arg0) {
      try {
         ++field8838;
         if (arg0 != -31247) {
            this.method2189(73);
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(II)I",
      line = 368
   )
   private final int method4405(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field8863 = 117;
         }

         ++field8841;
         return this.field8877 ? (class207.field2647 - arg0) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8878[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(BLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)I",
      line = 391
   )
   private final int method4406(byte arg0, Object arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (arg0 >= -73) {
            this.field8836 = 13;
         }

         ++field8846;
         Field var5 = arg2.getDeclaredField(arg3);
         return var5.getInt(arg1);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8878[4] + arg0 + ',' + (arg1 != null ? field8878[2] : field8878[3]) + ',' + (arg2 != null ? field8878[2] : field8878[3]) + ',' + (arg3 != null ? field8878[2] : field8878[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(ILkl;)Z",
      line = 406
   )
   public static final boolean method4407(int arg0, class86 arg1) {
      try {
         ++field8852;
         if (arg0 != 38) {
            method4408((byte)-104);
         }

         class557 var2 = class151.field1896.method5072(30, arg1.method350(25061));
         if (~var2.field8340 == 0) {
            return true;
         } else {
            class574 var3 = class427.field6523.method4157(false, var2.field8340);
            return ~var3.field8539 == 0 ? true : var3.method4250(168200068);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8878[33] + arg0 + ',' + (arg1 != null ? field8878[2] : field8878[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(IJ)Z",
      line = 427
   )
   public final boolean method2185(int arg0, long arg1) {
      try {
         if (arg0 != 10452) {
            this.method4405(-12, 90);
         }

         ++field8843;
         return true;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8878[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(I)V",
      line = 438
   )
   public final void method2189(int arg0) {
      try {
         if (arg0 != -12552) {
            this.field8859 = null;
         }

         ++field8848;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(B)V",
      line = 454
   )
   public static void method4408(byte arg0) {
      try {
         field8840 = null;
         int var1 = 14 % ((-62 - arg0) / 47);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8878[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/lang/String;BLjava/lang/Class;)Z",
      line = 469
   )
   private final boolean method4409(Object arg0, String arg1, byte arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field8875;
         Field var5 = arg3.getDeclaredField(arg1);
         if (arg2 >= -80) {
            this.field8865 = null;
         }

         return var5.getBoolean(arg0);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8878[38] + (arg0 != null ? field8878[2] : field8878[3]) + ',' + (arg1 != null ? field8878[2] : field8878[3]) + ',' + arg2 + ',' + (arg3 != null ? field8878[2] : field8878[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4410(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4411(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
