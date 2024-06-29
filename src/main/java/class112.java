import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class112 implements class677 {
   @OriginalMember(
      owner = "client!au",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1785 = new String[]{method1105(method1104("fDTF\u001f")), method1105(method1104("fDTN\u001f")), method1105(method1104("fDTJ\u001f")), method1105(method1104("fDTD\u001f")), method1105(method1104("fDTB\u001f")), method1105(method1104("fDTH\u001f")), method1105(method1104("fDT@\u001f")), method1105(method1104("iD\u0016`")), method1105(method1104("|\u001fT\"J")), method1105(method1104("fDTO\u001f")), method1105(method1104("fDTA\u001f")), method1105(method1104("fDTE\u001f")), method1105(method1104("fDTK\u001f")), method1105(method1104("kT\u001cx")), method1105(method1104("eW\u0017")), method1105(method1104("s^\n")), method1105(method1104("e^\u001eu{bW\u000e")), method1105(method1104("e^\u0002[^cE\u0012")), method1105(method1104("eP\u0019gPu^\u000fbS")), method1105(method1104("oT\u0013k_s")), method1105(method1104("e^\u0002UxaW\tiC")), method1105(method1104("uX\u001ddC")), method1105(method1104("sT\u0002xnHW\u001c\u007fRs")), method1105(method1104("e^\u0002TxaW\tiC")), method1105(method1104("d^\u0016cBuE\u001ftC")), method1105(method1104("eW")), method1105(method1104("kS")), method1105(method1104("hW\u001c\u007fRsa\u001f~cb_9uTkT\t")), method1105(method1104("~|\u0013hSkT")), method1105(method1104("eP\b")), method1105(method1104("fDTM\u001f")), method1105(method1104("e^\u001euenV\u0012x")), method1105(method1104("e^\u001euqn]\u0016")), method1105(method1104("pX\u001ex_")), method1105(method1104("~~\u001cjDbE")), method1105(method1104("\u007f~\u001cjDbE")), method1105(method1104("\u007f|\u0013hSkT")), method1105(method1104("e^\u000exXj")), method1105(method1104("fDTI\u001f")), method1105(method1104("fDTG\u001f"))};
   @OriginalMember(
      owner = "client!au",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field1744 = new int[1];
   @OriginalMember(
      owner = "client!au",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field1759 = new int[5];
   @OriginalMember(
      owner = "client!au",
      name = "h",
      descriptor = "I"
   )
   public static int field1775 = 0;
   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "I"
   )
   public static int field1745;
   @OriginalMember(
      owner = "client!au",
      name = "g",
      descriptor = "I"
   )
   public static int field1748;
   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "I"
   )
   public static int field1750;
   @OriginalMember(
      owner = "client!au",
      name = "K",
      descriptor = "I"
   )
   private int field1751;
   @OriginalMember(
      owner = "client!au",
      name = "f",
      descriptor = "I"
   )
   private int field1754;
   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "I"
   )
   public static int field1760;
   @OriginalMember(
      owner = "client!au",
      name = "t",
      descriptor = "I"
   )
   public static int field1762;
   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "I"
   )
   public static int field1763;
   @OriginalMember(
      owner = "client!au",
      name = "m",
      descriptor = "I"
   )
   public static int field1764;
   @OriginalMember(
      owner = "client!au",
      name = "i",
      descriptor = "I"
   )
   private int field1765;
   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "I"
   )
   private int field1767;
   @OriginalMember(
      owner = "client!au",
      name = "q",
      descriptor = "I"
   )
   public static int field1769;
   @OriginalMember(
      owner = "client!au",
      name = "O",
      descriptor = "I"
   )
   private int field1770;
   @OriginalMember(
      owner = "client!au",
      name = "u",
      descriptor = "I"
   )
   private int field1771;
   @OriginalMember(
      owner = "client!au",
      name = "B",
      descriptor = "I"
   )
   public static int field1772;
   @OriginalMember(
      owner = "client!au",
      name = "F",
      descriptor = "I"
   )
   public static int field1773;
   @OriginalMember(
      owner = "client!au",
      name = "I",
      descriptor = "I"
   )
   public static int field1774;
   @OriginalMember(
      owner = "client!au",
      name = "x",
      descriptor = "I"
   )
   private int field1776;
   @OriginalMember(
      owner = "client!au",
      name = "G",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!au",
      name = "k",
      descriptor = "I"
   )
   private int field1782;
   @OriginalMember(
      owner = "client!au",
      name = "P",
      descriptor = "I"
   )
   public static int field1783;
   @OriginalMember(
      owner = "client!au",
      name = "s",
      descriptor = "I"
   )
   private int field1784;
   @OriginalMember(
      owner = "client!au",
      name = "J",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field1780;
   @OriginalMember(
      owner = "client!au",
      name = "E",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field1756;
   @OriginalMember(
      owner = "client!au",
      name = "L",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field1753;
   @OriginalMember(
      owner = "client!au",
      name = "l",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1746;
   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1749;
   @OriginalMember(
      owner = "client!au",
      name = "M",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1752;
   @OriginalMember(
      owner = "client!au",
      name = "D",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1755;
   @OriginalMember(
      owner = "client!au",
      name = "j",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1757;
   @OriginalMember(
      owner = "client!au",
      name = "A",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1758;
   @OriginalMember(
      owner = "client!au",
      name = "y",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1761;
   @OriginalMember(
      owner = "client!au",
      name = "n",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1766;
   @OriginalMember(
      owner = "client!au",
      name = "w",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1779;
   @OriginalMember(
      owner = "client!au",
      name = "p",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1781;
   @OriginalMember(
      owner = "client!au",
      name = "o",
      descriptor = "Z"
   )
   private boolean field1747;
   @OriginalMember(
      owner = "client!au",
      name = "r",
      descriptor = "Z"
   )
   private boolean field1768;
   @OriginalMember(
      owner = "client!au",
      name = "N",
      descriptor = "Z"
   )
   private boolean field1778;

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Z"
   )
   private final boolean method1090(int arg0, String arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field1777;
         Field var5 = arg3.getDeclaredField(arg1);
         if (arg0 <= 57) {
            this.method1098(7, -79);
         }

         return var5.getBoolean(arg2);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1785[6] + arg0 + ',' + (arg1 != null ? field1785[8] : field1785[7]) + ',' + (arg2 != null ? field1785[8] : field1785[7]) + ',' + (arg3 != null ? field1785[8] : field1785[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method1091(int arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field1763;
         Class var2 = class289.field4303.getClass();
         this.field1781 = (Image)this.method1102(field1785[29], 23465, var2);
         this.field1757 = (Image)this.method1102(field1785[18], 23465, var2);
         this.field1758 = (Image)this.method1102(field1785[13], 23465, var2);
         this.field1766 = (Image)this.method1102(field1785[21], 23465, var2);
         this.field1761 = (Image)this.method1102(field1785[15], 23465, var2);
         this.field1752 = (Image)this.method1102(field1785[37], 23465, var2);
         this.field1749 = (Image)this.method1102(field1785[16], 23465, var2);
         this.field1779 = (Image)this.method1102(field1785[31], 23465, var2);
         this.field1755 = (Image)this.method1102(field1785[32], arg0 ^ 23467, var2);
         if (arg0 == 2) {
            this.field1756 = (Font)this.method1102(field1785[25], 23465, var2);
            this.field1753 = (FontMetrics)this.method1102(field1785[14], arg0 + 23463, var2);
            this.field1780 = (Color)this.method1102(field1785[24], 23465, var2);
            Object var3 = this.method1102(field1785[26], 23465, var2);
            Class var4 = var3.getClass();
            this.field1768 = this.method1090(66, field1785[36], var3, var4);
            this.field1778 = this.method1090(125, field1785[28], var3, var4);
            this.field1776 = this.method1101(var3, var4, 0, field1785[35]);
            this.field1767 = this.method1101(var3, var4, 0, field1785[34]);
            this.field1771 = this.method1101(var3, var4, 0, field1785[33]);
            this.field1782 = this.method1101(var3, var4, 0, field1785[19]);
            this.field1754 = this.method1101(var3, var4, 0, field1785[23]);
            this.field1770 = this.method1101(var3, var4, 0, field1785[20]);
            this.field1751 = this.method1101(var3, var4, 0, field1785[17]);
            this.field1784 = this.method1101(var3, var4, 0, field1785[22]);
            this.field1765 = this.method1101(var3, var4, 0, field1785[27]);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1785[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1092(int arg0) {
      try {
         ++field1764;
         if (arg0 != -14458) {
            this.method1099((byte)80);
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1785[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1093(int arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1762;
         if (!this.field1747) {
            label185: {
               if (class289.field4303 != null) {
                  if (this.field1756 != null) {
                     break label185;
                  }

                  try {
                     this.method1091(arg0 + -7494);
                     break label185;
                  } catch (Exception var46) {
                     this.field1747 = true;
                     if (!var3) {
                        break label185;
                     }
                  }
               }

               this.field1747 = true;
            }
         }

         if (this.field1747) {
            this.method1099((byte)43);
         } else {
            if (arg0 != 7496) {
               this.method1098(-47, -58);
            }

            Graphics var4 = class729.field10389.getGraphics();
            if (var4 == null) {
               class729.field10389.repaint();
            } else {
               try {
                  int var5 = class752.field10681.method1834(31297);
                  String var6 = class752.field10681.method1835(-1029);
                  if (class424.field6199 == null) {
                     class424.field6199 = class729.field10389.createImage(class557.field7909, class140.field2243);
                  }

                  Graphics var7 = class424.field6199.getGraphics();
                  var7.clearRect(0, 0, class557.field7909, class140.field2243);
                  int var8 = this.field1749.getWidth((ImageObserver)null);
                  int var9 = this.field1779.getWidth((ImageObserver)null);
                  int var10 = this.field1755.getWidth((ImageObserver)null);
                  int var11 = this.field1749.getHeight((ImageObserver)null);
                  int var12 = this.field1779.getHeight((ImageObserver)null);
                  int var13 = this.field1755.getHeight((ImageObserver)null);
                  var7.drawImage(this.field1749, this.method1097(var8, (byte)115) - (this.field1751 / 2 + -this.field1754), this.method1098(var11, -74) - -this.field1770, (ImageObserver)null);
                  int var14 = this.field1754 - -var8 + -(this.field1751 / 2);
                  int var15 = this.field1751 / 2 + this.field1754;
                  int var16 = var14;
                  if (var3) {
                     var7.drawImage(this.field1755, this.method1097(var8, (byte)65) - -this.field1754 - -var14, this.method1098(var13, 84) + this.field1770, (ImageObserver)null);
                     var16 = var10 + var14;
                  }

                  while(true) {
                     while(var15 >= var16) {
                        var7.drawImage(this.field1755, this.method1097(var8, (byte)65) - -this.field1754 - -var16, this.method1098(var13, 84) + this.field1770, (ImageObserver)null);
                        var16 += var10;
                     }

                     var7.drawImage(this.field1779, this.method1097(var9, (byte)85) + this.field1751 / 2 + this.field1754, this.method1098(var12, 103) + this.field1770, (ImageObserver)null);
                     int var17 = this.field1758.getWidth((ImageObserver)null);
                     int var18 = this.field1758.getHeight((ImageObserver)null);
                     int var19 = this.field1766.getWidth((ImageObserver)null);
                     int var20 = this.field1766.getHeight((ImageObserver)null);
                     int var21 = this.field1752.getHeight((ImageObserver)null);
                     int var22 = this.field1761.getWidth((ImageObserver)null);
                     int var23 = this.field1761.getHeight((ImageObserver)null);
                     int var24 = this.field1752.getWidth((ImageObserver)null);
                     int var25 = this.field1781.getWidth((ImageObserver)null);
                     int var26 = this.field1757.getWidth((ImageObserver)null);
                     int var27 = this.method1097(this.field1771, (byte)83) + this.field1776;
                     int var28 = this.method1098(this.field1782, 97) - -this.field1767;
                     var7.drawImage(this.field1758, var27, var28 - -((-var18 + this.field1782) / 2), (ImageObserver)null);
                     var7.drawImage(this.field1766, -var19 + var27 + this.field1771, (this.field1782 - var20) / 2 + var28, (ImageObserver)null);
                     if (!var3) {
                        if (this.field1746 == null) {
                           this.field1746 = class729.field10389.createImage(-var17 + this.field1771 + -var19, this.field1782);
                        }

                        Graphics var29 = this.field1746.getGraphics();
                        int var30 = 0;
                        if (var3) {
                           var29.drawImage(this.field1761, var30, 0, (ImageObserver)null);
                           var30 += var22;
                        }

                        while(true) {
                           while(~var30 > ~(-var17 + this.field1771 + -var19)) {
                              var29.drawImage(this.field1761, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           int var31 = 0;
                           if (!var3) {
                              if (var3) {
                                 var29.drawImage(this.field1752, var31, -var21 + this.field1782, (ImageObserver)null);
                                 var31 += var24;
                              }

                              while(true) {
                                 while(~var31 > ~(this.field1771 - var19 + -var17)) {
                                    var29.drawImage(this.field1752, var31, -var21 + this.field1782, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 int var32 = (-var19 + this.field1771 + -var17) * var5 / 100;
                                 int var10000 = ~var32;
                                 if (!var3) {
                                    byte var48;
                                    if (var10000 < -1) {
                                       Image var33 = class729.field10389.createImage(var32, this.field1782 - var23 + -var21);
                                       int var34 = var33.getWidth((ImageObserver)null);
                                       Graphics var35 = var33.getGraphics();
                                       int var36 = this.field1765 * class782.method5646((byte)100) / 10 % var25;
                                       int var37 = -var25 + var36;
                                       if (var3) {
                                          var35.drawImage(this.field1781, var37, 0, (ImageObserver)null);
                                          var37 += var25;
                                       }

                                       while(true) {
                                          while(var37 < var34) {
                                             var35.drawImage(this.field1781, var37, 0, (ImageObserver)null);
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
                                    int var39 = -var17 + this.field1771 - var32 + -var19;
                                    if (~var39 < -1) {
                                       Image var40 = class729.field10389.createImage(var39, -var23 + this.field1782 + -var21);
                                       int var41 = var40.getWidth((ImageObserver)null);
                                       Graphics var42 = var40.getGraphics();
                                       int var43 = 0;
                                       if (var3) {
                                          var42.drawImage(this.field1757, var43, 0, (ImageObserver)null);
                                          var43 += var26;
                                       }

                                       while(true) {
                                          while(~var43 > ~var41) {
                                             var42.drawImage(this.field1757, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          var48 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                          if (!var3) {
                                             break;
                                          }

                                          var43 = var48;
                                       }
                                    }

                                    var7.drawImage(this.field1746, var27 - -var17, var28, (ImageObserver)null);
                                    var7.setFont(this.field1756);
                                    var7.setColor(this.field1780);
                                    var7.drawString(var6, var27 - -((this.field1771 + -this.field1753.stringWidth(var6)) / 2), this.field1782 / 2 + this.field1784 + 4 + var28);
                                    var4.drawImage(class424.field6199, 0, 0, (ImageObserver)null);
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
                  this.field1747 = true;
               }
            }
         }
      } catch (RuntimeException var47) {
         throw class612.method4503(var47, field1785[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1094(int arg0) {
      try {
         ++field1760;
         if (arg0 != -5230) {
            this.method1093(-38, true);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1785[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1095(byte arg0) {
      try {
         class230.method2052(false);
         int var2 = 46 / ((arg0 - -1) / 43);
         ++field1773;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1785[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(ZJ)Z"
   )
   public final boolean method1096(boolean arg0, long arg1) {
      try {
         ++field1745;
         return !arg0 ? true : true;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1785[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(IB)I"
   )
   private final int method1097(int arg0, byte arg1) {
      try {
         ++field1772;
         if (arg1 <= 61) {
            return -118;
         } else {
            return this.field1768 ? (-arg0 + class557.field7909) / 2 : 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1785[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method1098(int arg0, int arg1) {
      try {
         ++field1750;
         if (this.field1778) {
            return (-arg0 + class140.field2243) / 2;
         } else {
            int var3 = 76 % ((arg1 - -3) / 58);
            return 0;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1785[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1099(byte arg0) {
      try {
         class656.method4784(24893, class752.field10681.method1834(31297), class129.field2065[class490.field7005], class558.field7923[class490.field7005], class53.field784[class490.field7005], class752.field10681.method1835(-1029));
         int var2 = 14 % ((arg0 - -66) / 49);
         ++field1748;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1785[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1100(int arg0) {
      try {
         field1759 = null;
         if (arg0 <= -115) {
            field1744 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1785[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/lang/Class;ILjava/lang/String;)I"
   )
   private final int method1101(Object arg0, Class arg1, int arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field1783;
         if (arg2 != 0) {
            this.method1094(84);
         }

         Field var5 = arg1.getDeclaredField(arg3);
         return var5.getInt(arg0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1785[39] + (arg0 != null ? field1785[8] : field1785[7]) + ',' + (arg1 != null ? field1785[8] : field1785[7]) + ',' + arg2 + ',' + (arg3 != null ? field1785[8] : field1785[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;"
   )
   private final Object method1102(String arg0, int arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field1769;
         if (arg1 != 23465) {
            return null;
         } else {
            Field var4 = arg2.getDeclaredField(arg0);
            Object var5 = var4.get(class289.field4303);
            var4.set(class289.field4303, (Object)null);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1785[38] + (arg0 != null ? field1785[8] : field1785[7]) + ',' + arg1 + ',' + (arg2 != null ? field1785[8] : field1785[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1103(int arg0) {
      try {
         ++field1774;
         if (arg0 >= -125) {
            this.method1099((byte)-38);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1785[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1105(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
