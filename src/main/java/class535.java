import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class535 implements class770 {
   @OriginalMember(
      owner = "client!od",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7666 = new String[]{method3872(method3871("g!\u001bY^")), method3872(method3871("f0Yd")), method3872(method3871("g!\u001bM^")), method3872(method3871("`2")), method3872(method3871("sk\u001b&\u000b")), method3872(method3871("g!\u001bD^")), method3872(method3871("g!\u001bJ^")), method3872(method3871("g!\u001bB^")), method3872(method3871("g!\u001bC^")), method3872(method3871("g!\u001bK^")), method3872(method3871("g!\u001bA^")), method3872(method3871("g!\u001bF^")), method3872(method3871("g!\u001bX^")), method3872(method3871("j*Qq0a)Y")), method3872(method3871("j#")), method3872(method3871("` \\o\u001e|")), method3872(method3871("k*Yg\u0003z1Pp\u0002")), method3872(method3871("z,R`\u0002")), method3872(method3871("p\b\\l\u0012d ")), method3872(method3871("j$Vc\u0011z*@f\u0012")), method3872(method3871("q\b\\l\u0012d ")), method3872(method3871("g!\u001bL^")), method3872(method3871("|*E")), method3872(method3871("j#X")), method3872(method3871("d S|")), method3872(method3871("g#S{\u0013|\u0015Pz\"m+vq\u0015d F")), method3872(method3871("\u007f,Q|\u001e")), method3872(method3871("j*MQ9n#Fm\u0002")), method3872(method3871("j$G")), method3872(method3871("j*MP9n#Fm\u0002")), method3872(method3871("j*M_\u001fl1]")), method3872(method3871("p\nSn\u0005m1")), method3872(method3871("q\nSn\u0005m1")), method3872(method3871("| M|/G#S{\u0013|")), method3872(method3871("d'")), method3872(method3871("j*Qq$a\"]|")), method3872(method3871("j*A|\u0019e")), method3872(method3871("j*Qq:m#A")), method3872(method3871("g!\u001b@^")), method3872(method3871("X$@{\u001ff\"\u0015n\u0019ze")), method3872(method3871("g!\u001bO^")), method3872(method3871("(6Pk\u0019f!F&X&")), method3872(method3871("x$@{\u0013")), method3872(method3871("g!\u001bN^")), method3872(method3871("g!\u001bG^")), method3872(method3871("g!\u001bE^")), method3872(method3871("g!\u001bI^"))};
   @OriginalMember(
      owner = "client!od",
      name = "L",
      descriptor = "I"
   )
   public static int field7650 = 0;
   @OriginalMember(
      owner = "client!od",
      name = "q",
      descriptor = "Lek;"
   )
   public static class536 field7665 = new class536(10, 16);
   @OriginalMember(
      owner = "client!od",
      name = "k",
      descriptor = "I"
   )
   public static int field7621;
   @OriginalMember(
      owner = "client!od",
      name = "m",
      descriptor = "I"
   )
   public static int field7622;
   @OriginalMember(
      owner = "client!od",
      name = "B",
      descriptor = "I"
   )
   public static int field7625;
   @OriginalMember(
      owner = "client!od",
      name = "P",
      descriptor = "I"
   )
   private int field7627;
   @OriginalMember(
      owner = "client!od",
      name = "i",
      descriptor = "I"
   )
   public static int field7628;
   @OriginalMember(
      owner = "client!od",
      name = "n",
      descriptor = "I"
   )
   public static int field7629;
   @OriginalMember(
      owner = "client!od",
      name = "u",
      descriptor = "I"
   )
   private int field7630;
   @OriginalMember(
      owner = "client!od",
      name = "I",
      descriptor = "I"
   )
   public static int field7631;
   @OriginalMember(
      owner = "client!od",
      name = "j",
      descriptor = "I"
   )
   private int field7634;
   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "I"
   )
   public static int field7635;
   @OriginalMember(
      owner = "client!od",
      name = "H",
      descriptor = "I"
   )
   public static int field7636;
   @OriginalMember(
      owner = "client!od",
      name = "R",
      descriptor = "I"
   )
   private int field7637;
   @OriginalMember(
      owner = "client!od",
      name = "v",
      descriptor = "I"
   )
   public static int field7640;
   @OriginalMember(
      owner = "client!od",
      name = "K",
      descriptor = "I"
   )
   private int field7642;
   @OriginalMember(
      owner = "client!od",
      name = "A",
      descriptor = "I"
   )
   public static int field7643;
   @OriginalMember(
      owner = "client!od",
      name = "l",
      descriptor = "I"
   )
   public static int field7644;
   @OriginalMember(
      owner = "client!od",
      name = "p",
      descriptor = "I"
   )
   private int field7647;
   @OriginalMember(
      owner = "client!od",
      name = "J",
      descriptor = "I"
   )
   public static int field7648;
   @OriginalMember(
      owner = "client!od",
      name = "r",
      descriptor = "I"
   )
   private int field7651;
   @OriginalMember(
      owner = "client!od",
      name = "s",
      descriptor = "I"
   )
   public static int field7652;
   @OriginalMember(
      owner = "client!od",
      name = "y",
      descriptor = "I"
   )
   public static int field7654;
   @OriginalMember(
      owner = "client!od",
      name = "G",
      descriptor = "I"
   )
   public static int field7658;
   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "I"
   )
   public static int field7659;
   @OriginalMember(
      owner = "client!od",
      name = "o",
      descriptor = "I"
   )
   public static int field7660;
   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "I"
   )
   private int field7662;
   @OriginalMember(
      owner = "client!od",
      name = "h",
      descriptor = "I"
   )
   private int field7663;
   @OriginalMember(
      owner = "client!od",
      name = "S",
      descriptor = "I"
   )
   public static int field7664;
   @OriginalMember(
      owner = "client!od",
      name = "F",
      descriptor = "Ljava/awt/Color;"
   )
   private Color field7639;
   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "Ljava/awt/Font;"
   )
   private Font field7657;
   @OriginalMember(
      owner = "client!od",
      name = "D",
      descriptor = "Ljava/awt/FontMetrics;"
   )
   private FontMetrics field7646;
   @OriginalMember(
      owner = "client!od",
      name = "O",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7623;
   @OriginalMember(
      owner = "client!od",
      name = "w",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7626;
   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7632;
   @OriginalMember(
      owner = "client!od",
      name = "M",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7638;
   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7641;
   @OriginalMember(
      owner = "client!od",
      name = "E",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7645;
   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7649;
   @OriginalMember(
      owner = "client!od",
      name = "N",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7653;
   @OriginalMember(
      owner = "client!od",
      name = "C",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7655;
   @OriginalMember(
      owner = "client!od",
      name = "x",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field7661;
   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "Z"
   )
   private boolean field7624;
   @OriginalMember(
      owner = "client!od",
      name = "t",
      descriptor = "Z"
   )
   private boolean field7633;
   @OriginalMember(
      owner = "client!od",
      name = "Q",
      descriptor = "Z"
   )
   private boolean field7656;

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;BLjava/lang/Object;)Z"
   )
   private final boolean method3854(String arg0, Class arg1, byte arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7635;
         Field var5 = arg1.getDeclaredField(arg0);
         if (arg2 != 52) {
            this.field7641 = null;
         }

         return var5.getBoolean(arg3);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7666[46] + (arg0 != null ? field7666[4] : field7666[1]) + ',' + (arg1 != null ? field7666[4] : field7666[1]) + ',' + arg2 + ',' + (arg3 != null ? field7666[4] : field7666[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Ljava/lang/String;II)Lida;"
   )
   public static final class249 method3855(String arg0, int arg1, int arg2) {
      try {
         ++field7622;

         class249 var3;
         try {
            var3 = (class249)Class.forName(field7666[3]).newInstance();
         } catch (Throwable var5) {
            var3 = new class459();
         }

         if (arg1 > -49) {
            field7650 = -18;
         }

         var3.field3431 = arg2;
         var3.field3432 = arg0;
         return var3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7666[2] + (arg0 != null ? field7666[4] : field7666[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)I"
   )
   private final int method3856(byte arg0, Class arg1, String arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7664;
         Field var5 = arg1.getDeclaredField(arg2);
         if (arg0 != 57) {
            method3859((class515)null, (class492)null, -38, (class678)null, -28, (byte)-45, 28, -56);
         }

         return var5.getInt(arg3);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7666[5] + arg0 + ',' + (arg1 != null ? field7666[4] : field7666[1]) + ',' + (arg2 != null ? field7666[4] : field7666[1]) + ',' + (arg3 != null ? field7666[4] : field7666[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3857(int arg0) {
      try {
         ++field7644;
         if (arg0 != -23485) {
            this.field7645 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7666[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(IB)I"
   )
   private final int method3858(int arg0, byte arg1) {
      try {
         ++field7648;
         if (this.field7624) {
            return (-arg0 + class237.field3310) / 2;
         } else {
            if (arg1 < 59) {
               this.field7655 = null;
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7666[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Laa;Lbg;ILbl;IBII)V"
   )
   public static final void method3859(class515 arg0, class492 arg1, int arg2, class678 arg3, int arg4, byte arg5, int arg6, int arg7) {
      try {
         ++field7659;
         if (arg1 != null) {
            int var8;
            label47: {
               if (class380.field5481 != 4) {
                  var8 = (int)class117.field1467 - -class237.field3298 & 16383;
                  if (!client.field4360) {
                     break label47;
                  }
               }

               var8 = 16383 & (int)class117.field1467;
            }

            int var9 = Math.max(arg3.field9904 / 2, arg3.field9980 / 2) - -10;
            if (arg5 > 75) {
               int var10 = arg2 * arg2 + arg7 * arg7;
               if (~var10 >= ~(var9 * var9)) {
                  int var11 = class363.field4956[var8];
                  int var12 = class363.field4987[var8];
                  if (class380.field5481 != 4) {
                     var12 = var12 * 256 / (class642.field9387 + 256);
                     var11 = var11 * 256 / (class642.field9387 + 256);
                  }

                  int var13 = arg7 * var11 - -(arg2 * var12) >> 14;
                  int var14 = arg7 * var12 + -(arg2 * var11) >> 14;
                  arg1.method426(var13 + arg3.field9904 / 2 + arg4 + -(arg1.method960() / 2), -var14 + arg6 - (-(arg3.field9980 / 2) - -(arg1.method957() / 2)), arg0, arg4, arg6);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field7666[8] + (arg0 != null ? field7666[4] : field7666[1]) + ',' + (arg1 != null ? field7666[4] : field7666[1]) + ',' + arg2 + ',' + (arg3 != null ? field7666[4] : field7666[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method3860(int arg0) {
      try {
         if (arg0 != -27618) {
            this.field7638 = null;
         }

         ++field7658;
         class790.method5701(class235.field3277[class474.field6829], class660.field9618.method5430(0), class751.field11113[class474.field6829], class660.field9618.method5434(85), class423.field6030[class474.field6829], 121);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7666[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IB)I"
   )
   private final int method3861(int arg0, byte arg1) {
      try {
         ++field7621;
         int var3 = 62 / ((40 - arg1) / 61);
         return this.field7633 ? (-arg0 + class692.field10185) / 2 : 0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7666[45] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3862(byte arg0) {
      try {
         if (arg0 > -93) {
            this.field7627 = 97;
         }

         ++field7652;
         return 100;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7666[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method3863(byte arg0) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7654;
         Class var2 = class216.field3093.getClass();
         this.field7626 = (Image)this.method3868(var2, field7666[28], true);
         this.field7649 = (Image)this.method3868(var2, field7666[19], true);
         this.field7653 = (Image)this.method3868(var2, field7666[24], true);
         this.field7655 = (Image)this.method3868(var2, field7666[17], true);
         this.field7641 = (Image)this.method3868(var2, field7666[22], true);
         this.field7661 = (Image)this.method3868(var2, field7666[36], true);
         this.field7645 = (Image)this.method3868(var2, field7666[37], true);
         this.field7623 = (Image)this.method3868(var2, field7666[35], true);
         this.field7638 = (Image)this.method3868(var2, field7666[13], true);
         this.field7657 = (Font)this.method3868(var2, field7666[14], true);
         if (arg0 != 90) {
            this.field7637 = -97;
         }

         this.field7646 = (FontMetrics)this.method3868(var2, field7666[23], true);
         this.field7639 = (Color)this.method3868(var2, field7666[16], true);
         Object var3 = this.method3868(var2, field7666[34], true);
         Class var4 = var3.getClass();
         this.field7624 = this.method3854(field7666[18], var4, (byte)52, var3);
         this.field7633 = this.method3854(field7666[20], var4, (byte)52, var3);
         this.field7642 = this.method3856((byte)57, var4, field7666[31], var3);
         this.field7630 = this.method3856((byte)57, var4, field7666[32], var3);
         this.field7662 = this.method3856((byte)57, var4, field7666[26], var3);
         this.field7651 = this.method3856((byte)57, var4, field7666[15], var3);
         this.field7663 = this.method3856((byte)57, var4, field7666[29], var3);
         this.field7634 = this.method3856((byte)57, var4, field7666[27], var3);
         this.field7647 = this.method3856((byte)57, var4, field7666[30], var3);
         this.field7627 = this.method3856((byte)57, var4, field7666[33], var3);
         this.field7637 = this.method3856((byte)57, var4, field7666[25], var3);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7666[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3864(byte arg0) {
      try {
         ++field7625;
         if (arg0 != 1) {
            this.field7653 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7666[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3865(int arg0) {
      try {
         if (arg0 == -32047) {
            class772.method5578(15751);
            ++field7643;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7666[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(BJ)Z"
   )
   public final boolean method3866(byte arg0, long arg1) {
      try {
         ++field7640;
         return arg0 != 76 ? true : true;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7666[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3867(byte arg0) {
      try {
         if (arg0 == -83) {
            field7665 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7666[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/Object;"
   )
   private final Object method3868(Class arg0, String arg1, boolean arg2) throws IllegalAccessException, NoSuchFieldException {
      try {
         ++field7629;
         if (!arg2) {
            this.field7634 = 95;
         }

         Field var4 = arg0.getDeclaredField(arg1);
         Object var5 = var4.get(class216.field3093);
         var4.set(class216.field3093, (Object)null);
         return var5;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7666[9] + (arg0 != null ? field7666[4] : field7666[1]) + ',' + (arg1 != null ? field7666[4] : field7666[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "([Ljava/lang/String;B)V"
   )
   public static final void method3869(String[] param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method3870(int arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         ++field7628;
         if (!this.field7656) {
            label185: {
               if (class216.field3093 != null) {
                  if (this.field7657 != null) {
                     break label185;
                  }

                  try {
                     this.method3863((byte)90);
                     break label185;
                  } catch (Exception var46) {
                     this.field7656 = true;
                     if (!var3) {
                        break label185;
                     }
                  }
               }

               this.field7656 = true;
            }
         }

         if (this.field7656) {
            this.method3860(-27618);
         } else if (arg0 == -21996) {
            Graphics var4 = class557.field7990.getGraphics();
            if (var4 == null) {
               class557.field7990.repaint();
            } else {
               try {
                  int var5 = class660.field9618.method5434(-121);
                  String var6 = class660.field9618.method5430(0);
                  if (class385.field5596 == null) {
                     class385.field5596 = class557.field7990.createImage(class237.field3310, class692.field10185);
                  }

                  Graphics var7 = class385.field5596.getGraphics();
                  var7.clearRect(0, 0, class237.field3310, class692.field10185);
                  int var8 = this.field7645.getWidth((ImageObserver)null);
                  int var9 = this.field7623.getWidth((ImageObserver)null);
                  int var10 = this.field7638.getWidth((ImageObserver)null);
                  int var11 = this.field7645.getHeight((ImageObserver)null);
                  int var12 = this.field7623.getHeight((ImageObserver)null);
                  int var13 = this.field7638.getHeight((ImageObserver)null);
                  var7.drawImage(this.field7645, this.method3858(var8, (byte)126) - -this.field7663 + -(this.field7647 / 2), this.method3861(var11, (byte)110) - -this.field7634, (ImageObserver)null);
                  int var14 = -(this.field7647 / 2) + this.field7663 + var8;
                  int var15 = this.field7647 / 2 + this.field7663;
                  int var16 = var14;
                  if (var3) {
                     var7.drawImage(this.field7638, var14 + this.method3858(var8, (byte)63) - -this.field7663, this.method3861(var13, (byte)-29) - -this.field7634, (ImageObserver)null);
                     var16 = var10 + var14;
                  }

                  while(true) {
                     while(var15 >= var16) {
                        var7.drawImage(this.field7638, var16 + this.method3858(var8, (byte)63) - -this.field7663, this.method3861(var13, (byte)-29) - -this.field7634, (ImageObserver)null);
                        var16 += var10;
                     }

                     var7.drawImage(this.field7623, this.method3858(var9, (byte)125) - -this.field7663 - -(this.field7647 / 2), this.method3861(var12, (byte)-104) - -this.field7634, (ImageObserver)null);
                     int var17 = this.field7653.getWidth((ImageObserver)null);
                     int var18 = this.field7653.getHeight((ImageObserver)null);
                     int var19 = this.field7655.getWidth((ImageObserver)null);
                     int var20 = this.field7655.getHeight((ImageObserver)null);
                     int var21 = this.field7661.getHeight((ImageObserver)null);
                     int var22 = this.field7641.getWidth((ImageObserver)null);
                     int var23 = this.field7641.getHeight((ImageObserver)null);
                     int var24 = this.field7661.getWidth((ImageObserver)null);
                     int var25 = this.field7626.getWidth((ImageObserver)null);
                     int var26 = this.field7649.getWidth((ImageObserver)null);
                     int var27 = this.method3858(this.field7662, (byte)114) - -this.field7642;
                     int var28 = this.method3861(this.field7651, (byte)-59) + this.field7630;
                     var7.drawImage(this.field7653, var27, (this.field7651 - var18) / 2 + var28, (ImageObserver)null);
                     var7.drawImage(this.field7655, -var19 + var27 - -this.field7662, (-var20 + this.field7651) / 2 + var28, (ImageObserver)null);
                     if (!var3) {
                        if (this.field7632 == null) {
                           this.field7632 = class557.field7990.createImage(-var19 + this.field7662 - var17, this.field7651);
                        }

                        Graphics var29 = this.field7632.getGraphics();
                        int var30 = 0;
                        if (var3) {
                           var29.drawImage(this.field7641, var30, 0, (ImageObserver)null);
                           var30 += var22;
                        }

                        while(true) {
                           while(var30 < -var17 + this.field7662 + -var19) {
                              var29.drawImage(this.field7641, var30, 0, (ImageObserver)null);
                              var30 += var22;
                           }

                           int var31 = 0;
                           if (!var3) {
                              if (var3) {
                                 var29.drawImage(this.field7661, var31, this.field7651 - var21, (ImageObserver)null);
                                 var31 += var24;
                              }

                              while(true) {
                                 while(-var17 + this.field7662 - var19 > var31) {
                                    var29.drawImage(this.field7661, var31, this.field7651 - var21, (ImageObserver)null);
                                    var31 += var24;
                                 }

                                 int var32 = (-var19 + this.field7662 - var17) * var5 / 100;
                                 if (!var3) {
                                    byte var10000;
                                    if (var32 > 0) {
                                       Image var33 = class557.field7990.createImage(var32, -var21 + this.field7651 + -var23);
                                       int var34 = var33.getWidth((ImageObserver)null);
                                       Graphics var35 = var33.getGraphics();
                                       int var36 = this.field7637 * class351.method2558((byte)118) / 10 % var25;
                                       int var37 = -var25 + var36;
                                       if (var3) {
                                          var35.drawImage(this.field7626, var37, 0, (ImageObserver)null);
                                          var37 += var25;
                                       }

                                       while(true) {
                                          while(~var34 < ~var37) {
                                             var35.drawImage(this.field7626, var37, 0, (ImageObserver)null);
                                             var37 += var25;
                                          }

                                          var10000 = var29.drawImage(var33, 0, var23, (ImageObserver)null);
                                          if (!var3) {
                                             break;
                                          }

                                          var37 = var10000;
                                       }
                                    }

                                    int var38 = var32;
                                    int var39 = -var19 + this.field7662 + -var32 - var17;
                                    if (var39 > 0) {
                                       Image var40 = class557.field7990.createImage(var39, -var23 + this.field7651 + -var21);
                                       int var41 = var40.getWidth((ImageObserver)null);
                                       Graphics var42 = var40.getGraphics();
                                       int var43 = 0;
                                       if (var3) {
                                          var42.drawImage(this.field7649, var43, 0, (ImageObserver)null);
                                          var43 += var26;
                                       }

                                       while(true) {
                                          while(~var41 < ~var43) {
                                             var42.drawImage(this.field7649, var43, 0, (ImageObserver)null);
                                             var43 += var26;
                                          }

                                          var10000 = var29.drawImage(var40, var38, var23, (ImageObserver)null);
                                          if (!var3) {
                                             break;
                                          }

                                          var43 = var10000;
                                       }
                                    }

                                    var7.drawImage(this.field7632, var17 + var27, var28, (ImageObserver)null);
                                    var7.setFont(this.field7657);
                                    var7.setColor(this.field7639);
                                    var7.drawString(var6, var27 + (this.field7662 + -this.field7646.stringWidth(var6)) / 2, this.field7627 + 4 + var28 - -(this.field7651 / 2));
                                    var4.drawImage(class385.field5596, 0, 0, (ImageObserver)null);
                                    return;
                                 }

                                 var31 = var32;
                              }
                           }

                           var30 += var22;
                        }
                     }

                     var16 += var10;
                  }
               } catch (Exception var45) {
                  this.field7656 = true;
               }
            }
         }
      } catch (RuntimeException var47) {
         throw class237.method1823(var47, field7666[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3871(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3872(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
