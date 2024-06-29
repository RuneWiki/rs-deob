import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class504 implements class196 {
   @OriginalMember(
      owner = "client!vq",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7039 = new String[]{method3815(method3814("hX\u0018T")), method3815(method3814("p\\Zt\u0018")), method3815(method3814("}\u0003Z\u0016M")), method3815(method3814("p\\Zq\u0018")), method3815(method3814("p\\Z{\u0018")), method3815(method3814("p\\Zs\u0018")), method3815(method3814("\u007fb\u0012^CcY")), method3815(method3814("dB\u0010AboJ\u001cL")), method3815(method3814("tD\u0013PD")), method3815(method3814("dL\u0006")), method3815(method3814("\u007f`\u001d\\TjH")), method3815(method3814("nH\u001d_Xr")), method3815(method3814("rB\u0004")), method3815(method3814("eB\u0018WEtY\u0011@D")), method3815(method3814("dB\u0000L_k")), method3815(method3814("dB\f`\u007f`K\u0007]D")), method3815(method3814("dB\fa\u007f`K\u0007]D")), method3815(method3814("~`\u001d\\TjH")), method3815(method3814("dB\foYbY\u001c")), method3815(method3814("p\\Z}\u0018")), method3815(method3814("iK\u0012KUr}\u0011JdcC7ASjH\u0007")), method3815(method3814("dK")), method3815(method3814("qD\u0010LX")), method3815(method3814("dK\u0019")), method3815(method3814("rH\fLiIK\u0012KUr")), method3815(method3814("jH\u0012L")), method3815(method3814("dB\u0010A|cK\u0000")), method3815(method3814("~b\u0012^CcY")), method3815(method3814("jO")), method3815(method3814("dB\u0010AvoA\u0018")), method3815(method3814("dL\u0017SWtB\u0001VT")), method3815(method3814("p\\Z~\u0018")), method3815(method3814("p\\Z|\u0018")), method3815(method3814("p\\Zy\u0018")), method3815(method3814("p\\Zu\u0018")), method3815(method3814("p\\Zv\u0018")), method3815(method3814("p\\Zr\u0018")), method3815(method3814("p\\Z\u007f\u0018")), method3815(method3814("p\\Zz\u0018")), method3815(method3814("p\\Zp\u0018"))};
   @OriginalMember(
      owner = "client!vq",
      name = "y",
      descriptor = "J"
   )
   public static long field7016 = (long)(9.999999999E9D * Math.random());
   @OriginalMember(
      owner = "client!vq",
      name = "j",
      descriptor = "Lse;"
   )
   public static class6 field7025 = new class6(26, -1);
   @OriginalMember(
      owner = "client!vq",
      name = "N",
      descriptor = "Z"
   )
   public static boolean field7037 = false;
   @OriginalMember(
      owner = "client!vq",
      name = "g",
      descriptor = "D"
   )
   public static double field7031;
   @OriginalMember(
      owner = "client!vq",
      name = "s",
      descriptor = "I"
   )
   public static int field6996;
   @OriginalMember(
      owner = "client!vq",
      name = "Q",
      descriptor = "I"
   )
   public static int field6997;
   @OriginalMember(
      owner = "client!vq",
      name = "m",
      descriptor = "I"
   )
   public static int field6998;
   @OriginalMember(
      owner = "client!vq",
      name = "J",
      descriptor = "I"
   )
   private int field6999;
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "I"
   )
   public static int field7001;
   @OriginalMember(
      owner = "client!vq",
      name = "P",
      descriptor = "I"
   )
   public static int field7002;
   @OriginalMember(
      owner = "client!vq",
      name = "D",
      descriptor = "I"
   )
   private int field7003;
   @OriginalMember(
      owner = "client!vq",
      name = "x",
      descriptor = "I"
   )
   private int field7005;
   @OriginalMember(
      owner = "client!vq",
      name = "B",
      descriptor = "I"
   )
   public static int field7006;
   @OriginalMember(
      owner = "client!vq",
      name = "w",
      descriptor = "I"
   )
   public static int field7008;
   @OriginalMember(
      owner = "client!vq",
      name = "K",
      descriptor = "I"
   )
   public static int field7010;
   @OriginalMember(
      owner = "client!vq",
      name = "l",
      descriptor = "I"
   )
   private int field7011;
   @OriginalMember(
      owner = "client!vq",
      name = "H",
      descriptor = "I"
   )
   private int field7012;
   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "I"
   )
   public static int field7013;
   @OriginalMember(
      owner = "client!vq",
      name = "f",
      descriptor = "I"
   )
   public static int field7014;
   @OriginalMember(
      owner = "client!vq",
      name = "I",
      descriptor = "I"
   )
   public static int field7018;
   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "I"
   )
   public static int field7021;
   @OriginalMember(
      owner = "client!vq",
      name = "t",
      descriptor = "I"
   )
   private int field7024;
   @OriginalMember(
      owner = "client!vq",
      name = "F",
      descriptor = "I"
   )
   public static int field7026;
   @OriginalMember(
      owner = "client!vq",
      name = "q",
      descriptor = "I"
   )
   private int field7027;
   @OriginalMember(
      owner = "client!vq",
      name = "L",
      descriptor = "I"
   )
   private int field7028;
   @OriginalMember(
      owner = "client!vq",
      name = "p",
      descriptor = "I"
   )
   private int field7035;
   @OriginalMember(
      owner = "client!vq",
      name = "v",
      descriptor = "Lww;"
   )
   public static class339 field7017;
   @OriginalMember(
      owner = "client!vq",
      name = "k",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field7015;
   @OriginalMember(
      owner = "client!vq",
      name = "E",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field7004;
   @OriginalMember(
      owner = "client!vq",
      name = "A",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field7036;
   @OriginalMember(
      owner = "client!vq",
      name = "e",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7000;
   @OriginalMember(
      owner = "client!vq",
      name = "r",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7007;
   @OriginalMember(
      owner = "client!vq",
      name = "u",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7009;
   @OriginalMember(
      owner = "client!vq",
      name = "C",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7020;
   @OriginalMember(
      owner = "client!vq",
      name = "n",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7023;
   @OriginalMember(
      owner = "client!vq",
      name = "h",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7029;
   @OriginalMember(
      owner = "client!vq",
      name = "i",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7030;
   @OriginalMember(
      owner = "client!vq",
      name = "M",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7033;
   @OriginalMember(
      owner = "client!vq",
      name = "o",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7034;
   @OriginalMember(
      owner = "client!vq",
      name = "O",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7038;
   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "Z"
   )
   private boolean field7019;
   @OriginalMember(
      owner = "client!vq",
      name = "G",
      descriptor = "Z"
   )
   private boolean field7022;
   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "Z"
   )
   private boolean field7032;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method3806(int arg0, int arg1) {
      try {
         if (arg0 != -17862) {
            this.method3810(false, 98);
         }

         ++field6996;
         return this.field7019 ? (class91.field1242 - arg1) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7039[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ljava/lang/Object;"
   )
   private final Object method3807(Class arg0, byte arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7010;
         if (arg1 >= -26) {
            this.field7019 = false;
         }

         Field var4 = arg0.getDeclaredField(arg2);
         Object var5 = var4.get(class152.field1893);
         var4.set(class152.field1893, (Object)null);
         return var5;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7039[4] + (arg0 != null ? field7039[2] : field7039[0]) + ',' + arg1 + ',' + (arg2 != null ? field7039[2] : field7039[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method1632(byte arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         if (!this.field7022) {
            label185: {
               if (class152.field1893 == null) {
                  this.field7022 = true;
                  if (!var3) {
                     break label185;
                  }
               }

               if (this.field7004 == null) {
                  try {
                     this.method3813(2);
                  } catch (Exception var45) {
                     this.field7022 = true;
                  }
               }
            }
         }

         ++field7008;
         if (arg0 < -38) {
            if (this.field7022) {
               this.method3808((byte)-85);
            } else {
               Graphics var4 = class590.field8691.getGraphics();
               if (var4 != null) {
                  try {
                     int var5 = class532.field7800.method723(-488818536);
                     String var6 = class532.field7800.method729(0);
                     if (class146.field1831 == null) {
                        class146.field1831 = class590.field8691.createImage(class204.field2605, class91.field1242);
                     }

                     Graphics var7 = class146.field1831.getGraphics();
                     var7.clearRect(0, 0, class204.field2605, class91.field1242);
                     int var8 = this.field7009.getWidth((ImageObserver)null);
                     int var9 = this.field7000.getWidth((ImageObserver)null);
                     int var10 = this.field7030.getWidth((ImageObserver)null);
                     int var11 = this.field7009.getHeight((ImageObserver)null);
                     int var12 = this.field7000.getHeight((ImageObserver)null);
                     int var13 = this.field7030.getHeight((ImageObserver)null);
                     var7.drawImage(this.field7009, this.method3810(true, var8) + this.field7011 + -(this.field7028 / 2), this.method3806(-17862, var11) - -this.field7012, (ImageObserver)null);
                     int var14 = -(this.field7028 / 2) + this.field7011 - -var8;
                     int var15 = this.field7028 / 2 + this.field7011;
                     int var16 = var14;
                     if (var3) {
                        var7.drawImage(this.field7030, this.method3810(true, var8) - (-this.field7011 + -var14), this.method3806(-17862, var13) + this.field7012, (ImageObserver)null);
                        var16 = var10 + var14;
                     }

                     while(true) {
                        while(var15 >= var16) {
                           var7.drawImage(this.field7030, this.method3810(true, var8) - (-this.field7011 + -var16), this.method3806(-17862, var13) + this.field7012, (ImageObserver)null);
                           var16 += var10;
                        }

                        var7.drawImage(this.field7000, this.method3810(true, var9) + this.field7011 + this.field7028 / 2, this.method3806(-17862, var12) + this.field7012, (ImageObserver)null);
                        int var17 = this.field7034.getWidth((ImageObserver)null);
                        int var18 = this.field7034.getHeight((ImageObserver)null);
                        int var19 = this.field7023.getWidth((ImageObserver)null);
                        int var20 = this.field7023.getHeight((ImageObserver)null);
                        int var21 = this.field7007.getHeight((ImageObserver)null);
                        int var22 = this.field7029.getWidth((ImageObserver)null);
                        int var23 = this.field7029.getHeight((ImageObserver)null);
                        int var24 = this.field7007.getWidth((ImageObserver)null);
                        int var25 = this.field7038.getWidth((ImageObserver)null);
                        int var26 = this.field7033.getWidth((ImageObserver)null);
                        int var27 = this.method3810(true, this.field7024) + this.field7035;
                        int var28 = this.method3806(-17862, this.field7005) - -this.field7027;
                        var7.drawImage(this.field7034, var27, (-var18 + this.field7005) / 2 + var28, (ImageObserver)null);
                        var7.drawImage(this.field7023, -var19 + this.field7024 + var27, (-var20 + this.field7005) / 2 + var28, (ImageObserver)null);
                        if (!var3) {
                           if (this.field7020 == null) {
                              this.field7020 = class590.field8691.createImage(-var17 + this.field7024 + -var19, this.field7005);
                           }

                           Graphics var29 = this.field7020.getGraphics();
                           int var30 = 0;
                           if (var3) {
                              var29.drawImage(this.field7029, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           while(true) {
                              while(var30 < -var19 + this.field7024 + -var17) {
                                 var29.drawImage(this.field7029, var30, 0, (ImageObserver)null);
                                 var30 += var22;
                              }

                              int var31 = 0;
                              if (!var3) {
                                 if (var3) {
                                    var29.drawImage(this.field7007, var31, -var21 + this.field7005, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 while(true) {
                                    while(~(-var17 + this.field7024 + -var19) < ~var31) {
                                       var29.drawImage(this.field7007, var31, -var21 + this.field7005, (ImageObserver)null);
                                       var31 += var24;
                                    }

                                    int var32 = (-var17 + -var19 + this.field7024) * var5 / 100;
                                    int var10000 = ~var32;
                                    if (!var3) {
                                       byte var48;
                                       if (var10000 < -1) {
                                          Image var33 = class590.field8691.createImage(var32, -var23 + this.field7005 - var21);
                                          int var34 = var33.getWidth((ImageObserver)null);
                                          Graphics var35 = var33.getGraphics();
                                          int var36 = this.field6999 * class539.method4088(3) / 10 % var25;
                                          int var37 = var36 - var25;
                                          if (var3) {
                                             var35.drawImage(this.field7038, var37, 0, (ImageObserver)null);
                                             var37 += var25;
                                          }

                                          while(true) {
                                             while(var37 < var34) {
                                                var35.drawImage(this.field7038, var37, 0, (ImageObserver)null);
                                                var37 += var25;
                                             }

                                             var48 = var29.drawImage(var33, 0, var23, (ImageObserver)null);
                                             if (!var3) {
                                                break;
                                             }

                                             var37 = var48;
                                          }
                                       }

                                       int var38 = var32;
                                       int var39 = this.field7024 - var17 + -var19 + -var32;
                                       if (var39 > 0) {
                                          Image var40 = class590.field8691.createImage(var39, -var23 + this.field7005 + -var21);
                                          int var41 = var40.getWidth((ImageObserver)null);
                                          Graphics var42 = var40.getGraphics();
                                          int var43 = 0;
                                          if (var3) {
                                             var42.drawImage(this.field7033, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          while(true) {
                                             while(~var41 < ~var43) {
                                                var42.drawImage(this.field7033, var43, 0, (ImageObserver)null);
                                                var43 += var26;
                                             }

                                             var48 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                             if (!var3) {
                                                break;
                                             }

                                             var43 = var48;
                                          }
                                       }

                                       var7.drawImage(this.field7020, var17 + var27, var28, (ImageObserver)null);
                                       var7.setFont(this.field7004);
                                       var7.setColor(this.field7015);
                                       var7.drawString(var6, (this.field7024 + -this.field7036.stringWidth(var6)) / 2 + var27, this.field7005 / 2 + this.field7003 + var28 + 4);
                                       var4.drawImage(class146.field1831, 0, 0, (ImageObserver)null);
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
                     this.field7022 = true;
                  }
               } else {
                  class590.field8691.repaint();
               }
            }
         }
      } catch (RuntimeException var47) {
         throw class93.method866(var47, field7039[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1631(byte arg0) {
      try {
         int var2 = 59 / ((-89 - arg0) / 36);
         ++field6997;
         return 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7039[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method3808(byte arg0) {
      try {
         ++field7018;
         class752.method5448(class642.field9586[class482.field6691], class532.field7800.method723(-488818536), class111.field1491[class482.field6691], class36.field501[class482.field6691], 0, class532.field7800.method729(0));
         if (arg0 >= -83) {
            this.field7036 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7039[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1634(int arg0) {
      try {
         ++field7001;
         if (arg0 != 32416) {
            this.method3808((byte)47);
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7039[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1635(byte arg0) {
      try {
         ++field6998;
         if (arg0 < 23) {
            this.method1636(-95, -122L);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7039[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Z"
   )
   private final boolean method3809(int arg0, Object arg1, String arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7006;
         Field var5 = arg3.getDeclaredField(arg2);
         if (arg0 != -18195) {
            this.field7015 = null;
         }

         return var5.getBoolean(arg1);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7039[1] + arg0 + ',' + (arg1 != null ? field7039[2] : field7039[0]) + ',' + (arg2 != null ? field7039[2] : field7039[0]) + ',' + (arg3 != null ? field7039[2] : field7039[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(IJ)Z"
   )
   public final boolean method1636(int arg0, long arg1) {
      try {
         ++field7013;
         return arg0 != 11804 ? true : true;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7039[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(ZI)I"
   )
   private final int method3810(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            field7037 = true;
         }

         ++field7026;
         return this.field7032 ? (-arg1 + class204.field2605) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7039[34] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I"
   )
   private final int method3811(Class arg0, Object arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (arg3 != 2) {
            return -60;
         } else {
            ++field7021;
            Field var5 = arg0.getDeclaredField(arg2);
            return var5.getInt(arg1);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7039[33] + (arg0 != null ? field7039[2] : field7039[0]) + ',' + (arg1 != null ? field7039[2] : field7039[0]) + ',' + (arg2 != null ? field7039[2] : field7039[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3812(byte arg0) {
      try {
         field7017 = null;
         field7025 = null;
         if (arg0 > -19) {
            method3812((byte)120);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7039[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1633(boolean arg0) {
      try {
         ++field7002;
         if (arg0) {
            this.field7033 = null;
         }

         class280.method2207(90);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7039[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method3813(int arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7014;
         Class var2 = class152.field1893.getClass();
         this.field7038 = (Image)this.method3807(var2, (byte)-28, field7039[9]);
         this.field7033 = (Image)this.method3807(var2, (byte)-76, field7039[30]);
         this.field7034 = (Image)this.method3807(var2, (byte)-50, field7039[25]);
         this.field7023 = (Image)this.method3807(var2, (byte)-31, field7039[8]);
         this.field7029 = (Image)this.method3807(var2, (byte)-46, field7039[12]);
         this.field7007 = (Image)this.method3807(var2, (byte)-122, field7039[14]);
         this.field7009 = (Image)this.method3807(var2, (byte)-47, field7039[26]);
         this.field7000 = (Image)this.method3807(var2, (byte)-89, field7039[7]);
         this.field7030 = (Image)this.method3807(var2, (byte)-88, field7039[29]);
         this.field7004 = (Font)this.method3807(var2, (byte)-73, field7039[21]);
         this.field7036 = (FontMetrics)this.method3807(var2, (byte)-122, field7039[23]);
         this.field7015 = (Color)this.method3807(var2, (byte)-116, field7039[13]);
         Object var3 = this.method3807(var2, (byte)-62, field7039[28]);
         Class var4 = var3.getClass();
         this.field7032 = this.method3809(-18195, var3, field7039[17], var4);
         this.field7019 = this.method3809(-18195, var3, field7039[10], var4);
         this.field7035 = this.method3811(var4, var3, field7039[27], 2);
         this.field7027 = this.method3811(var4, var3, field7039[6], arg0);
         this.field7024 = this.method3811(var4, var3, field7039[22], 2);
         this.field7005 = this.method3811(var4, var3, field7039[11], arg0);
         this.field7011 = this.method3811(var4, var3, field7039[15], 2);
         this.field7012 = this.method3811(var4, var3, field7039[16], 2);
         this.field7028 = this.method3811(var4, var3, field7039[18], arg0);
         this.field7003 = this.method3811(var4, var3, field7039[24], 2);
         this.field6999 = this.method3811(var4, var3, field7039[20], arg0);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7039[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3814(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3815(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
