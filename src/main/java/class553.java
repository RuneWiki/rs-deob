import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class553 implements class705 {
   @OriginalMember(
      owner = "client!iba",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8025 = new String[]{method4133(method4132("qcY3{0")), method4133(method4132("vtTq")), method4133(method4132("qcY3\u007f0")), method4133(method4132("c/\u00163N")), method4133(method4132("qcY3r0")), method4133(method4132("qcY3}0")), method4133(method4132("qcY3t0")), method4133(method4132("qcY3u0")), method4133(method4132("qcY3w0")), method4133(method4132("qcY3|0")), method4133(method4132("qcY3v0")), method4133(method4132("qcY3p0")), method4133(method4132("qcY3~0")), method4133(method4132("qcY3x0")), method4133(method4132("qcY3y0")), method4133(method4132("qcY3q0")), method4133(method4132("aLQyWtd")), method4133(method4132("oh\\i[")), method4133(method4132("`LQyWtd")), method4133(method4132("{nTrFju]eG")), method4133(method4132("zg")), method4133(method4132("qcY3z0")), method4133(method4132("ld@ijWg^nVl")), method4133(method4132("zgU")), method4133(method4132("`N^{@}u")), method4133(method4132("zn@JZ|uP")), method4133(method4132("zn\\daqfPi")), method4133(method4132("aN^{@}u")), method4133(method4132("zn\\duqmT")), method4133(method4132("znLi\\u")), method4133(method4132("jh_uG")), method4133(method4132("z`[vTjnMsW")), method4133(method4132("zn@D|~gKxG")), method4133(method4132("td^i")), method4133(method4132("tc")), method4133(method4132("wg^nVlQ]og}o{dPtdK")), method4133(method4132("lnH")), method4133(method4132("z`J")), method4133(method4132("zn@E|~gKxG")), method4133(method4132("pdQz[l")), method4133(method4132("zn\\d\u007f}gL"))};
   @OriginalMember(
      owner = "client!iba",
      name = "L",
      descriptor = "I"
   )
   public static int field7986;
   @OriginalMember(
      owner = "client!iba",
      name = "o",
      descriptor = "I"
   )
   public static int field7987;
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "I"
   )
   public static int field7988;
   @OriginalMember(
      owner = "client!iba",
      name = "A",
      descriptor = "I"
   )
   private int field7989;
   @OriginalMember(
      owner = "client!iba",
      name = "l",
      descriptor = "I"
   )
   public static int field7990;
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "I"
   )
   public static int field7993;
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "I"
   )
   private int field7994;
   @OriginalMember(
      owner = "client!iba",
      name = "n",
      descriptor = "I"
   )
   public static int field7996;
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "I"
   )
   private int field7997;
   @OriginalMember(
      owner = "client!iba",
      name = "J",
      descriptor = "I"
   )
   public static int field7998;
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "I"
   )
   private int field7999;
   @OriginalMember(
      owner = "client!iba",
      name = "m",
      descriptor = "I"
   )
   public static int field8002;
   @OriginalMember(
      owner = "client!iba",
      name = "C",
      descriptor = "I"
   )
   private int field8003;
   @OriginalMember(
      owner = "client!iba",
      name = "r",
      descriptor = "I"
   )
   private int field8008;
   @OriginalMember(
      owner = "client!iba",
      name = "p",
      descriptor = "I"
   )
   public static int field8010;
   @OriginalMember(
      owner = "client!iba",
      name = "u",
      descriptor = "I"
   )
   private int field8012;
   @OriginalMember(
      owner = "client!iba",
      name = "M",
      descriptor = "I"
   )
   private int field8015;
   @OriginalMember(
      owner = "client!iba",
      name = "F",
      descriptor = "I"
   )
   public static int field8016;
   @OriginalMember(
      owner = "client!iba",
      name = "x",
      descriptor = "I"
   )
   public static int field8017;
   @OriginalMember(
      owner = "client!iba",
      name = "k",
      descriptor = "I"
   )
   public static int field8018;
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "I"
   )
   public static int field8019;
   @OriginalMember(
      owner = "client!iba",
      name = "q",
      descriptor = "I"
   )
   public static int field8022;
   @OriginalMember(
      owner = "client!iba",
      name = "G",
      descriptor = "I"
   )
   private int field8023;
   @OriginalMember(
      owner = "client!iba",
      name = "v",
      descriptor = "Luda;"
   )
   public static class473 field8007;
   @OriginalMember(
      owner = "client!iba",
      name = "t",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field8004;
   @OriginalMember(
      owner = "client!iba",
      name = "I",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field8006;
   @OriginalMember(
      owner = "client!iba",
      name = "D",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field8011;
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7985;
   @OriginalMember(
      owner = "client!iba",
      name = "w",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7991;
   @OriginalMember(
      owner = "client!iba",
      name = "y",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7992;
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7995;
   @OriginalMember(
      owner = "client!iba",
      name = "j",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8000;
   @OriginalMember(
      owner = "client!iba",
      name = "B",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8001;
   @OriginalMember(
      owner = "client!iba",
      name = "s",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8005;
   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8014;
   @OriginalMember(
      owner = "client!iba",
      name = "E",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8020;
   @OriginalMember(
      owner = "client!iba",
      name = "N",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field8024;
   @OriginalMember(
      owner = "client!iba",
      name = "K",
      descriptor = "Z"
   )
   private boolean field8009;
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "Z"
   )
   private boolean field8013;
   @OriginalMember(
      owner = "client!iba",
      name = "H",
      descriptor = "Z"
   )
   private boolean field8021;

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/lang/Object;Ljava/lang/Class;)I",
      line = 5
   )
   private final int method4117(String arg0, byte arg1, Object arg2, Class arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field8019;
         if (arg1 > -92) {
            this.field7999 = 94;
         }

         Field var5 = arg3.getDeclaredField(arg0);
         return var5.getInt(arg2);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8025[12] + (arg0 != null ? field8025[3] : field8025[1]) + ',' + arg1 + ',' + (arg2 != null ? field8025[3] : field8025[1]) + ',' + (arg3 != null ? field8025[3] : field8025[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(B)V",
      line = 18
   )
   private final void method4118(byte arg0) {
      try {
         if (arg0 > -70) {
            this.field8000 = null;
         }

         ++field8018;
         class261.method2090(class445.field6487.method1072(3505), (byte)122, class685.field10082[class276.field3900], class713.field10344[class276.field3900], class397.field5844[class276.field3900], class445.field6487.method1075(-70));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8025[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/lang/Class;ILjava/lang/String;)Z",
      line = 31
   )
   private final boolean method4119(Object arg0, Class arg1, int arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         if (arg2 != -27561) {
            this.field8012 = 113;
         }

         ++field7988;
         Field var5 = arg1.getDeclaredField(arg3);
         return var5.getBoolean(arg0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8025[13] + (arg0 != null ? field8025[3] : field8025[1]) + ',' + (arg1 != null ? field8025[3] : field8025[1]) + ',' + arg2 + ',' + (arg3 != null ? field8025[3] : field8025[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "(I)I",
      line = 52
   )
   public final int method4120(int arg0) {
      try {
         if (arg0 <= 49) {
            method4124(88, (byte[])null);
         }

         ++field8002;
         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8025[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(II)I",
      line = 65
   )
   private final int method4121(int arg0, int arg1) {
      try {
         if (arg0 < 0) {
            return -34;
         } else {
            ++field7993;
            return this.field8013 ? (class218.field3296 - arg1) / 2 : 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8025[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "(I)V",
      line = 82
   )
   private final void method4122(int arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7990;
         Class var2 = class514.field7493.getClass();
         this.field7995 = (Image)this.method4125(-94, field8025[37], var2);
         this.field7992 = (Image)this.method4125(-81, field8025[31], var2);
         this.field7985 = (Image)this.method4125(115, field8025[33], var2);
         this.field8020 = (Image)this.method4125(106, field8025[30], var2);
         this.field8024 = (Image)this.method4125(arg0 + 50, field8025[36], var2);
         this.field8000 = (Image)this.method4125(-103, field8025[29], var2);
         this.field8001 = (Image)this.method4125(-54, field8025[40], var2);
         this.field8014 = (Image)this.method4125(89, field8025[26], var2);
         this.field7991 = (Image)this.method4125(-34, field8025[28], var2);
         this.field8006 = (Font)this.method4125(-35, field8025[20], var2);
         this.field8011 = (FontMetrics)this.method4125(-71, field8025[23], var2);
         this.field8004 = (Color)this.method4125(-59, field8025[19], var2);
         Object var3 = this.method4125(48, field8025[34], var2);
         Class var4 = var3.getClass();
         this.field8021 = this.method4119(var3, var4, arg0 + -27560, field8025[18]);
         if (arg0 != -1) {
            this.field7995 = null;
         }

         this.field8013 = this.method4119(var3, var4, arg0 + -27560, field8025[16]);
         this.field7989 = this.method4117(field8025[24], (byte)-113, var3, var4);
         this.field8023 = this.method4117(field8025[27], (byte)-106, var3, var4);
         this.field8003 = this.method4117(field8025[17], (byte)-110, var3, var4);
         this.field7997 = this.method4117(field8025[39], (byte)-128, var3, var4);
         this.field8015 = this.method4117(field8025[38], (byte)-126, var3, var4);
         this.field7994 = this.method4117(field8025[32], (byte)-108, var3, var4);
         this.field8008 = this.method4117(field8025[25], (byte)-101, var3, var4);
         this.field8012 = this.method4117(field8025[22], (byte)-103, var3, var4);
         this.field7999 = this.method4117(field8025[35], (byte)-121, var3, var4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8025[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(BJ)Z",
      line = 122
   )
   public final boolean method4123(byte arg0, long arg1) {
      try {
         if (arg0 >= -8) {
            this.field8006 = null;
         }

         ++field8010;
         return true;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8025[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I[B)Ljava/lang/String;",
      line = 134
   )
   public static final String method4124(int arg0, byte[] arg1) {
      try {
         ++field8016;
         if (arg0 != 0) {
            method4131(32);
         }

         return class493.method3716(arg0 ^ -111, arg1, arg1.length, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8025[9] + arg0 + ',' + (arg1 != null ? field8025[3] : field8025[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;",
      line = 149
   )
   private final Object method4125(int arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field8022;
         Field var4 = arg2.getDeclaredField(arg1);
         Object var5 = var4.get(class514.field7493);
         int var6 = -45 % ((6 - arg0) / 35);
         var4.set(class514.field7493, (Object)null);
         return var5;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8025[2] + arg0 + ',' + (arg1 != null ? field8025[3] : field8025[1]) + ',' + (arg2 != null ? field8025[3] : field8025[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(II)I",
      line = 165
   )
   private final int method4126(int arg0, int arg1) {
      try {
         if (arg0 > -84) {
            return -37;
         } else {
            ++field8017;
            return this.field8021 ? (-arg1 + class720.field10406) / 2 : 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8025[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I)I",
      line = 180
   )
   public final int method4127(int arg0) {
      try {
         if (arg0 != -3441) {
            return 104;
         } else {
            ++field7986;
            return 100;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8025[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(B)V",
      line = 192
   )
   public final void method4128(byte arg0) {
      try {
         ++field7996;
         class25.method175(-115);
         int var2 = -85 / ((arg0 - -53) / 62);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8025[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(ZB)V",
      line = 204
   )
   public final void method4129(boolean arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field7987;
         if (arg1 < 65) {
            this.field7985 = null;
         }

         if (!this.field8009) {
            label183: {
               if (class514.field7493 == null) {
                  this.field8009 = true;
                  if (!var3) {
                     break label183;
                  }
               }

               if (this.field8006 == null) {
                  try {
                     this.method4122(-1);
                  } catch (Exception var45) {
                     this.field8009 = true;
                  }
               }
            }
         }

         if (this.field8009) {
            this.method4118((byte)-124);
         } else {
            Graphics var4 = class386.field5692.getGraphics();
            if (var4 == null) {
               class386.field5692.repaint();
            } else {
               try {
                  int var5 = class445.field6487.method1075(95);
                  String var6 = class445.field6487.method1072(3505);
                  if (class729.field10493 == null) {
                     class729.field10493 = class386.field5692.createImage(class720.field10406, class218.field3296);
                  }

                  Graphics var7 = class729.field10493.getGraphics();
                  var7.clearRect(0, 0, class720.field10406, class218.field3296);
                  int var8 = this.field8001.getWidth((ImageObserver)null);
                  int var9 = this.field8014.getWidth((ImageObserver)null);
                  int var10 = this.field7991.getWidth((ImageObserver)null);
                  int var11 = this.field8001.getHeight((ImageObserver)null);
                  int var12 = this.field8014.getHeight((ImageObserver)null);
                  int var13 = this.field7991.getHeight((ImageObserver)null);
                  var7.drawImage(this.field8001, this.method4126(-100, var8) - -this.field8015 - this.field8008 / 2, this.method4121(75, var11) + this.field7994, (ImageObserver)null);
                  int var14 = -(this.field8008 / 2) + this.field8015 + var8;
                  int var15 = this.field8008 / 2 + this.field8015;
                  int var16 = var14;
                  if (var3) {
                     var7.drawImage(this.field7991, var14 + this.method4126(-103, var8) + this.field8015, this.method4121(70, var13) + this.field7994, (ImageObserver)null);
                     var16 = var10 + var14;
                  }

                  while(true) {
                     while(var16 <= var15) {
                        var7.drawImage(this.field7991, var16 + this.method4126(-103, var8) + this.field8015, this.method4121(70, var13) + this.field7994, (ImageObserver)null);
                        var16 += var10;
                     }

                     var7.drawImage(this.field8014, this.method4126(-126, var9) + (this.field8015 - -(this.field8008 / 2)), this.method4121(73, var12) - -this.field7994, (ImageObserver)null);
                     int var17 = this.field7985.getWidth((ImageObserver)null);
                     int var18 = this.field7985.getHeight((ImageObserver)null);
                     int var19 = this.field8020.getWidth((ImageObserver)null);
                     int var20 = this.field8020.getHeight((ImageObserver)null);
                     int var21 = this.field8000.getHeight((ImageObserver)null);
                     int var22 = this.field8024.getWidth((ImageObserver)null);
                     int var23 = this.field8024.getHeight((ImageObserver)null);
                     int var24 = this.field8000.getWidth((ImageObserver)null);
                     int var25 = this.field7995.getWidth((ImageObserver)null);
                     int var26 = this.field7992.getWidth((ImageObserver)null);
                     int var27 = this.method4126(-120, this.field8003) - -this.field7989;
                     int var28 = this.method4121(98, this.field7997) - -this.field8023;
                     var7.drawImage(this.field7985, var27, (this.field7997 - var18) / 2 + var28, (ImageObserver)null);
                     var7.drawImage(this.field8020, this.field8003 + var27 + -var19, (-var20 + this.field7997) / 2 + var28, (ImageObserver)null);
                     if (!var3) {
                        if (this.field8005 == null) {
                           this.field8005 = class386.field5692.createImage(-var17 + this.field8003 + -var19, this.field7997);
                        }

                        Graphics var29 = this.field8005.getGraphics();
                        int var30 = 0;
                        if (var3) {
                           var29.drawImage(this.field8024, var30, 0, (ImageObserver)null);
                           var30 += var22;
                        }

                        while(true) {
                           while(-var19 + this.field8003 + -var17 > var30) {
                              var29.drawImage(this.field8024, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           int var31 = 0;
                           if (!var3) {
                              if (var3) {
                                 var29.drawImage(this.field8000, var31, -var21 + this.field7997, (ImageObserver)null);
                                 var31 += var24;
                              }

                              while(true) {
                                 while(var31 < -var19 + this.field8003 + -var17) {
                                    var29.drawImage(this.field8000, var31, -var21 + this.field7997, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 int var32 = (-var17 + this.field8003 - var19) * var5 / 100;
                                 int var10000 = ~var32;
                                 if (!var3) {
                                    byte var48;
                                    if (var10000 < -1) {
                                       Image var33 = class386.field5692.createImage(var32, this.field7997 - (var21 + var23));
                                       int var34 = var33.getWidth((ImageObserver)null);
                                       Graphics var35 = var33.getGraphics();
                                       int var36 = this.field7999 * class655.method4814(0) / 10 % var25;
                                       int var37 = var36 - var25;
                                       if (var3) {
                                          var35.drawImage(this.field7995, var37, 0, (ImageObserver)null);
                                          var37 += var25;
                                       }

                                       while(true) {
                                          while(~var37 > ~var34) {
                                             var35.drawImage(this.field7995, var37, 0, (ImageObserver)null);
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
                                    int var39 = -var17 + this.field8003 - var19 + -var32;
                                    if (var39 > 0) {
                                       Image var40 = class386.field5692.createImage(var39, this.field7997 - (var21 + var23));
                                       int var41 = var40.getWidth((ImageObserver)null);
                                       Graphics var42 = var40.getGraphics();
                                       int var43 = 0;
                                       if (var3) {
                                          var42.drawImage(this.field7992, var43, 0, (ImageObserver)null);
                                          var43 += var26;
                                       }

                                       while(true) {
                                          while(~var41 < ~var43) {
                                             var42.drawImage(this.field7992, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          var48 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                          if (!var3) {
                                             break;
                                          }

                                          var43 = var48;
                                       }
                                    }

                                    var7.drawImage(this.field8005, var27 - -var17, var28, (ImageObserver)null);
                                    var7.setFont(this.field8006);
                                    var7.setColor(this.field8004);
                                    var7.drawString(var6, var27 + (this.field8003 - this.field8011.stringWidth(var6)) / 2, this.field7997 / 2 + var28 + 4 + this.field8012);
                                    var4.drawImage(class729.field10493, 0, 0, (ImageObserver)null);
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
                  this.field8009 = true;
               }
            }
         }
      } catch (RuntimeException var47) {
         throw class608.method4462(var47, field8025[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(I)V",
      line = 398
   )
   public final void method4130(int arg0) {
      try {
         if (arg0 == 18973) {
            ++field7998;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8025[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "(I)V",
      line = 408
   )
   public static void method4131(int arg0) {
      try {
         field8007 = null;
         if (arg0 != 0) {
            field8007 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8025[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4132(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4133(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
