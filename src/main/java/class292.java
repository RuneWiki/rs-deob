import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class292 implements class157 {
   @OriginalMember(
      owner = "client!lda",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4638 = new String[]{method2467(method2466("\u001f\"\u000e\u001b\u000f[")), method2467(method2466("\u001f\"\u000e\u001b\u0003[")), method2467(method2466("\u001f\"\u000e\u001b\n[")), method2467(method2466("\u001b#\u0006R/\u0007")), method2467(method2466("\u0001/\b]3")), method2467(method2466("\u0011'\u001d")), method2467(method2466("\u001f#\tA")), method2467(method2466("\u0004/\u000bA/")), method2467(method2466("\u0011'\f^ \u0001)\u001a[#")), method2467(method2466("\u0010)\u0003Z2\u00012\nM3")), method2467(method2466("\u001c \tF\"\u0007\u0016\nG\u0013\u0016(,L$\u001f#\u001c")), method2467(method2466("\u000b\u000b\u0006Q#\u001f#")), method2467(method2466("\u001f\"\u000e\u001b\u000e[")), method2467(method2466("\u0011)\u000bL\u0015\u001a!\u0007A")), method2467(method2466("\u000b\t\tS4\u00162")), method2467(method2466("\u0011)\u000bL\u000b\u0016 \u001b")), method2467(method2466("\u0011 \u0002")), method2467(method2466("\u0011)\u0017m\b\u0015 \u001cP3")), method2467(method2466("\u0007)\u001f")), method2467(method2466("\n\t\tS4\u00162")), method2467(method2466("\u0011)\u0017l\b\u0015 \u001cP3")), method2467(method2466("\u0011)\u001bA(\u001e")), method2467(method2466("\n\u000b\u0006Q#\u001f#")), method2467(method2466("\u0011)\u0017b.\u00172\u0007")), method2467(method2466("\u0011 ")), method2467(method2466("\u0007#\u0017A\u001e< \tF\"\u0007")), method2467(method2466("\u001f$")), method2467(method2466("\u0011)\u000bL\u0001\u001a*\u0003")), method2467(method2466("\u001d3\u0003Y")), method2467(method2466("\bhA\u001b:")), method2467(method2466("\u001f\"\u000e\u001b\u0000[")), method2467(method2466("\u001f\"\u000e\u001b\u0006[")), method2467(method2466("\u001f\"\u000e\u001b\u0002[")), method2467(method2466("\u001f\"\u000e\u001b\f[")), method2467(method2466("\u001f\"\u000e\u001b\u0005[")), method2467(method2466("\u001f\"\u000e\u001b\u0001[")), method2467(method2466("\u001f\"\u000e\u001b\u000b[")), method2467(method2466("\u001f\"\u000e\u001b\t[")), method2467(method2466("\u001f\"\u000e\u001b\b[")), method2467(method2466("\u001f\"\u000e\u001b\r[")), method2467(method2466("\u001f\"\u000e\u001b\u0004["))};
   @OriginalMember(
      owner = "client!lda",
      name = "t",
      descriptor = "Lnaa;"
   )
   public static class113 field4610 = new class113(87, 11);
   @OriginalMember(
      owner = "client!lda",
      name = "H",
      descriptor = "I"
   )
   public static int field4599;
   @OriginalMember(
      owner = "client!lda",
      name = "j",
      descriptor = "I"
   )
   public static int field4601;
   @OriginalMember(
      owner = "client!lda",
      name = "M",
      descriptor = "I"
   )
   public static int field4602;
   @OriginalMember(
      owner = "client!lda",
      name = "y",
      descriptor = "I"
   )
   public static int field4603;
   @OriginalMember(
      owner = "client!lda",
      name = "w",
      descriptor = "I"
   )
   private int field4607;
   @OriginalMember(
      owner = "client!lda",
      name = "P",
      descriptor = "I"
   )
   private int field4611;
   @OriginalMember(
      owner = "client!lda",
      name = "f",
      descriptor = "I"
   )
   public static int field4612;
   @OriginalMember(
      owner = "client!lda",
      name = "g",
      descriptor = "I"
   )
   private int field4613;
   @OriginalMember(
      owner = "client!lda",
      name = "m",
      descriptor = "I"
   )
   private int field4614;
   @OriginalMember(
      owner = "client!lda",
      name = "B",
      descriptor = "I"
   )
   public static int field4615;
   @OriginalMember(
      owner = "client!lda",
      name = "J",
      descriptor = "I"
   )
   private int field4617;
   @OriginalMember(
      owner = "client!lda",
      name = "N",
      descriptor = "I"
   )
   private int field4618;
   @OriginalMember(
      owner = "client!lda",
      name = "n",
      descriptor = "I"
   )
   private int field4619;
   @OriginalMember(
      owner = "client!lda",
      name = "F",
      descriptor = "I"
   )
   public static int field4620;
   @OriginalMember(
      owner = "client!lda",
      name = "x",
      descriptor = "I"
   )
   public static int field4621;
   @OriginalMember(
      owner = "client!lda",
      name = "e",
      descriptor = "I"
   )
   public static int field4622;
   @OriginalMember(
      owner = "client!lda",
      name = "D",
      descriptor = "I"
   )
   private int field4624;
   @OriginalMember(
      owner = "client!lda",
      name = "A",
      descriptor = "I"
   )
   public static int field4625;
   @OriginalMember(
      owner = "client!lda",
      name = "I",
      descriptor = "I"
   )
   public static int field4626;
   @OriginalMember(
      owner = "client!lda",
      name = "k",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "I"
   )
   public static int field4629;
   @OriginalMember(
      owner = "client!lda",
      name = "u",
      descriptor = "I"
   )
   public static int field4633;
   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "I"
   )
   private int field4634;
   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "I"
   )
   public static int field4635;
   @OriginalMember(
      owner = "client!lda",
      name = "q",
      descriptor = "I"
   )
   public static int field4637;
   @OriginalMember(
      owner = "client!lda",
      name = "r",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field4604;
   @OriginalMember(
      owner = "client!lda",
      name = "d",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field4616;
   @OriginalMember(
      owner = "client!lda",
      name = "p",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field4630;
   @OriginalMember(
      owner = "client!lda",
      name = "C",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4597;
   @OriginalMember(
      owner = "client!lda",
      name = "E",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4598;
   @OriginalMember(
      owner = "client!lda",
      name = "K",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4600;
   @OriginalMember(
      owner = "client!lda",
      name = "v",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4605;
   @OriginalMember(
      owner = "client!lda",
      name = "h",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4606;
   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4608;
   @OriginalMember(
      owner = "client!lda",
      name = "o",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4609;
   @OriginalMember(
      owner = "client!lda",
      name = "s",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4623;
   @OriginalMember(
      owner = "client!lda",
      name = "G",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4628;
   @OriginalMember(
      owner = "client!lda",
      name = "l",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4636;
   @OriginalMember(
      owner = "client!lda",
      name = "i",
      descriptor = "Z"
   )
   private boolean field4596;
   @OriginalMember(
      owner = "client!lda",
      name = "O",
      descriptor = "Z"
   )
   private boolean field4631;
   @OriginalMember(
      owner = "client!lda",
      name = "L",
      descriptor = "Z"
   )
   private boolean field4632;

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method856(byte arg0) {
      try {
         ++field4633;
         if (arg0 > -78) {
            this.method861(117, true);
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4638[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method860(byte arg0) {
      try {
         if (arg0 < 25) {
            this.field4632 = false;
         }

         ++field4627;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4638[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method2457(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            this.field4597 = null;
         }

         ++field4637;
         return this.field4596 ? (-arg1 + class692.field10301) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4638[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(JB)Z"
   )
   public final boolean method855(long arg0, byte arg1) {
      try {
         int var4 = 111 / ((-55 - arg1) / 43);
         ++field4620;
         return true;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4638[32] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;B)I"
   )
   private final int method2458(String arg0, Class arg1, Object arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         int var5 = -16 % ((arg3 - -11) / 42);
         ++field4599;
         Field var6 = arg1.getDeclaredField(arg0);
         return var6.getInt(arg2);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4638[33] + (arg0 != null ? field4638[29] : field4638[28]) + ',' + (arg1 != null ? field4638[29] : field4638[28]) + ',' + (arg2 != null ? field4638[29] : field4638[28]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(IZ)I"
   )
   private final int method2459(int arg0, boolean arg1) {
      try {
         ++field4612;
         if (!arg1) {
            this.field4598 = null;
         }

         return this.field4632 ? (-arg0 + class316.field4878) / 2 : 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4638[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2460(int arg0) {
      try {
         field4610 = null;
         if (arg0 != 0) {
            method2461(46, -38, 70, -103, -74, (byte)24, 92, 25, -92);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4638[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(IIIIIBIII)V"
   )
   public static final void method2461(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
      try {
         ++field4629;
         if (arg5 >= 21) {
            class463.field7035[class410.field6383++] = new class409(arg2, arg4, arg1, arg0, arg0, arg1, arg3, arg6, arg6, arg3, arg7, arg7, arg8, arg8);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4638[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method857(int arg0) {
      try {
         ++field4602;
         if (arg0 != 26187) {
            this.field4619 = 116;
         }

         class438.method3443(54);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4638[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method861(int arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4625;
         if (!this.field4631) {
            label186: {
               if (class684.field10176 != null) {
                  if (this.field4616 != null) {
                     break label186;
                  }

                  try {
                     this.method2464(-520);
                     break label186;
                  } catch (Exception var46) {
                     this.field4631 = true;
                     if (!var3) {
                        break label186;
                     }
                  }
               }

               this.field4631 = true;
            }
         }

         if (this.field4631) {
            this.method2465((byte)-104);
         } else {
            if (arg0 >= -98) {
               field4635 = 103;
            }

            Graphics var4 = class544.field8183.getGraphics();
            if (var4 != null) {
               try {
                  int var5 = class443.field6804.method1346(20);
                  String var6 = class443.field6804.method1344((byte)121);
                  if (class119.field1653 == null) {
                     class119.field1653 = class544.field8183.createImage(class316.field4878, class692.field10301);
                  }

                  Graphics var7 = class119.field1653.getGraphics();
                  var7.clearRect(0, 0, class316.field4878, class692.field10301);
                  int var8 = this.field4605.getWidth((ImageObserver)null);
                  int var9 = this.field4608.getWidth((ImageObserver)null);
                  int var10 = this.field4636.getWidth((ImageObserver)null);
                  int var11 = this.field4605.getHeight((ImageObserver)null);
                  int var12 = this.field4608.getHeight((ImageObserver)null);
                  int var13 = this.field4636.getHeight((ImageObserver)null);
                  var7.drawImage(this.field4605, this.method2459(var8, true) - -this.field4619 - this.field4634 / 2, this.method2457(0, var11) + this.field4624, (ImageObserver)null);
                  int var14 = -(this.field4634 / 2) - -var8 + this.field4619;
                  int var15 = this.field4634 / 2 + this.field4619;
                  int var16 = var14;
                  if (var3) {
                     var7.drawImage(this.field4636, var14 + this.method2459(var8, true) - -this.field4619, this.method2457(0, var13) + this.field4624, (ImageObserver)null);
                     var16 = var10 + var14;
                  }

                  while(true) {
                     while(~var16 >= ~var15) {
                        var7.drawImage(this.field4636, var16 + this.method2459(var8, true) - -this.field4619, this.method2457(0, var13) + this.field4624, (ImageObserver)null);
                        var16 += var10;
                     }

                     var7.drawImage(this.field4608, this.method2459(var9, true) - (-(this.field4634 / 2) + -this.field4619), this.method2457(0, var12) + this.field4624, (ImageObserver)null);
                     int var17 = this.field4623.getWidth((ImageObserver)null);
                     int var18 = this.field4623.getHeight((ImageObserver)null);
                     int var19 = this.field4609.getWidth((ImageObserver)null);
                     int var20 = this.field4609.getHeight((ImageObserver)null);
                     int var21 = this.field4600.getHeight((ImageObserver)null);
                     int var22 = this.field4598.getWidth((ImageObserver)null);
                     int var23 = this.field4598.getHeight((ImageObserver)null);
                     int var24 = this.field4600.getWidth((ImageObserver)null);
                     int var25 = this.field4628.getWidth((ImageObserver)null);
                     int var26 = this.field4606.getWidth((ImageObserver)null);
                     int var27 = this.method2459(this.field4614, true) + this.field4618;
                     int var28 = this.method2457(0, this.field4611) + this.field4607;
                     var7.drawImage(this.field4623, var27, var28 - -((-var18 + this.field4611) / 2), (ImageObserver)null);
                     var7.drawImage(this.field4609, this.field4614 + var27 + -var19, (-var20 + this.field4611) / 2 + var28, (ImageObserver)null);
                     if (!var3) {
                        if (this.field4597 == null) {
                           this.field4597 = class544.field8183.createImage(-var17 - var19 + this.field4614, this.field4611);
                        }

                        Graphics var29 = this.field4597.getGraphics();
                        int var30 = 0;
                        if (var3) {
                           var29.drawImage(this.field4598, var30, 0, (ImageObserver)null);
                           var30 += var22;
                        }

                        while(true) {
                           while(~var30 > ~(-var17 + this.field4614 - var19)) {
                              var29.drawImage(this.field4598, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           int var31 = 0;
                           if (!var3) {
                              if (var3) {
                                 var29.drawImage(this.field4600, var31, -var21 + this.field4611, (ImageObserver)null);
                                 var31 += var24;
                              }

                              while(true) {
                                 while(-var17 + this.field4614 + -var19 > var31) {
                                    var29.drawImage(this.field4600, var31, -var21 + this.field4611, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 int var32 = (this.field4614 - var17 + -var19) * var5 / 100;
                                 int var10000 = ~var32;
                                 if (!var3) {
                                    byte var48;
                                    if (var10000 < -1) {
                                       Image var33 = class544.field8183.createImage(var32, -var23 + this.field4611 - var21);
                                       int var34 = var33.getWidth((ImageObserver)null);
                                       Graphics var35 = var33.getGraphics();
                                       int var36 = this.field4617 * class302.method2528(-1) / 10 % var25;
                                       int var37 = -var25 + var36;
                                       if (var3) {
                                          var35.drawImage(this.field4628, var37, 0, (ImageObserver)null);
                                          var37 += var25;
                                       }

                                       while(true) {
                                          while(~var37 > ~var34) {
                                             var35.drawImage(this.field4628, var37, 0, (ImageObserver)null);
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
                                    int var39 = -var19 + this.field4614 - (var17 - -var32);
                                    if (~var39 < -1) {
                                       Image var40 = class544.field8183.createImage(var39, this.field4611 - var23 + -var21);
                                       int var41 = var40.getWidth((ImageObserver)null);
                                       Graphics var42 = var40.getGraphics();
                                       int var43 = 0;
                                       if (var3) {
                                          var42.drawImage(this.field4606, var43, 0, (ImageObserver)null);
                                          var43 += var26;
                                       }

                                       while(true) {
                                          while(var41 > var43) {
                                             var42.drawImage(this.field4606, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          var48 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                          if (!var3) {
                                             break;
                                          }

                                          var43 = var48;
                                       }
                                    }

                                    var7.drawImage(this.field4597, var17 + var27, var28, (ImageObserver)null);
                                    var7.setFont(this.field4616);
                                    var7.setColor(this.field4604);
                                    var7.drawString(var6, (this.field4614 - this.field4630.stringWidth(var6)) / 2 + var27, this.field4613 + var28 - (-(this.field4611 / 2) - 4));
                                    var4.drawImage(class119.field1653, 0, 0, (ImageObserver)null);
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
               } catch (Exception var45) {
                  this.field4631 = true;
               }
            } else {
               class544.field8183.repaint();
            }
         }
      } catch (RuntimeException var47) {
         throw class482.method3757(var47, field4638[40] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(ZLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z"
   )
   private final boolean method2462(boolean arg0, Object arg1, Class arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (!arg0) {
            this.field4611 = -58;
         }

         ++field4626;
         Field var5 = arg2.getDeclaredField(arg3);
         return var5.getBoolean(arg1);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4638[30] + arg0 + ',' + (arg1 != null ? field4638[29] : field4638[28]) + ',' + (arg2 != null ? field4638[29] : field4638[28]) + ',' + (arg3 != null ? field4638[29] : field4638[28]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;"
   )
   private final Object method2463(String arg0, int arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field4615;
         Field var4 = arg2.getDeclaredField(arg0);
         Object var5 = var4.get(class684.field10176);
         if (arg1 != 0) {
            return null;
         } else {
            var4.set(class684.field10176, (Object)null);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4638[39] + (arg0 != null ? field4638[29] : field4638[28]) + ',' + arg1 + ',' + (arg2 != null ? field4638[29] : field4638[28]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method2464(int arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field4601;
         Class var2 = class684.field10176.getClass();
         this.field4628 = (Image)this.method2463(field4638[5], 0, var2);
         this.field4606 = (Image)this.method2463(field4638[8], 0, var2);
         this.field4623 = (Image)this.method2463(field4638[6], 0, var2);
         this.field4609 = (Image)this.method2463(field4638[4], arg0 ^ -520, var2);
         this.field4598 = (Image)this.method2463(field4638[18], 0, var2);
         this.field4600 = (Image)this.method2463(field4638[21], arg0 ^ arg0, var2);
         this.field4605 = (Image)this.method2463(field4638[15], 0, var2);
         this.field4608 = (Image)this.method2463(field4638[13], arg0 + 520, var2);
         this.field4636 = (Image)this.method2463(field4638[27], 0, var2);
         this.field4616 = (Font)this.method2463(field4638[24], 0, var2);
         this.field4630 = (FontMetrics)this.method2463(field4638[16], 0, var2);
         this.field4604 = (Color)this.method2463(field4638[9], arg0 + 520, var2);
         Object var3 = this.method2463(field4638[26], 0, var2);
         Class var4 = var3.getClass();
         this.field4632 = this.method2462(true, var3, var4, field4638[11]);
         this.field4596 = this.method2462(true, var3, var4, field4638[22]);
         this.field4618 = this.method2458(field4638[14], var4, var3, (byte)-61);
         this.field4607 = this.method2458(field4638[19], var4, var3, (byte)89);
         this.field4614 = this.method2458(field4638[7], var4, var3, (byte)57);
         this.field4611 = this.method2458(field4638[3], var4, var3, (byte)75);
         this.field4619 = this.method2458(field4638[17], var4, var3, (byte)95);
         this.field4624 = this.method2458(field4638[20], var4, var3, (byte)64);
         this.field4634 = this.method2458(field4638[23], var4, var3, (byte)-55);
         this.field4613 = this.method2458(field4638[25], var4, var3, (byte)60);
         this.field4617 = this.method2458(field4638[10], var4, var3, (byte)-70);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4638[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method858(int arg0) {
      try {
         ++field4622;
         if (arg0 <= 30) {
            method2460(-94);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4638[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method2465(byte arg0) {
      try {
         ++field4621;
         class633.method4629(class233.field3563[class174.field2686], 3, class222.field3347[class174.field2686], class443.field6804.method1344((byte)118), class443.field6804.method1346(20), class440.field6777[class174.field2686]);
         int var2 = -119 % ((-27 - arg0) / 57);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4638[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2466(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2467(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
