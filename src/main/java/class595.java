import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class595 extends class376 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!pca",
      name = "K",
      descriptor = "Lrca;"
   )
   private class37 field8802 = new class37();
   @OriginalMember(
      owner = "client!pca",
      name = "E",
      descriptor = "Lrca;"
   )
   private class37 field8812 = new class37();
   @OriginalMember(
      owner = "client!pca",
      name = "r",
      descriptor = "Z"
   )
   private boolean field8815;
   @OriginalMember(
      owner = "client!pca",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8817 = new String[]{method4439(method4438("B~\u0006\u000e,\u001a")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E>Jt\u0013E\u001f\u001a")), method4439(method4438("I3I\u000e\u0006")), method4439(method4438("\\h\u000bL")), method4439(method4438("B~\u0006\u000e(\u001a")), method4439(method4438("B~\u0006\u000eG[s\u000eTE\u001a")), method4439(method4438("B~\u0006\u000e/\u001a")), method4439(method4438("B~\u0006\u000e)\u001a")), method4439(method4438("B~\u0006\u000e+\u001a")), method4439(method4438("\u00120Y\u0000GQr\u000b\u001d\u001dT{\u0001\u0010K\f")), method4439(method4438("\u000e~\bLFT{\u0001FK\u0002#")), method4439(method4438("\u00125")), method4439(method4438("B~\u0006\u000e.\u001a")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E+@x\u0014S\u001eV5")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E8^t\u0004K\u001eV5")), method4439(method4438("B~\u0006\u000e4\u001a")), method4439(method4438("B~\u0006\u000e=\u001a")), method4439(method4438("B~\u0006\u000e*\u001a")), method4439(method4438("B~\u0006\u000e9\u001a")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E>\\i\u0002R\u001eV5")), method4439(method4438("B~\u0006\u000e5\u001a")), method4439(method4438("B~\u0006\u000e2\u001a")), method4439(method4438("B~\u0006\u000e:\u001a")), method4439(method4438("B~\u0006\u000e1\u001a")), method4439(method4438("B~\u0006\u000e<\u001a")), method4439(method4438("B~\u0006\u000e>\u001a")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E)Wq\u0002A\bWyO")), method4439(method4438("B~\u0006\u000e6\u001a")), method4439(method4438("B~\u0006\u000e3\u001a")), method4439(method4438("B~\u0006\u000e-\u001a")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E6]k\u0002DS")), method4439(method4438("B~\u0006\u000e\u0016]h\u0014E?@|\u0000G\u001eV5"))};
   @OriginalMember(
      owner = "client!pca",
      name = "O",
      descriptor = "I"
   )
   public static int field8796 = -1;
   @OriginalMember(
      owner = "client!pca",
      name = "F",
      descriptor = "I"
   )
   public static int field8780;
   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "I"
   )
   public static int field8781;
   @OriginalMember(
      owner = "client!pca",
      name = "C",
      descriptor = "I"
   )
   public static int field8782;
   @OriginalMember(
      owner = "client!pca",
      name = "D",
      descriptor = "I"
   )
   public static int field8783;
   @OriginalMember(
      owner = "client!pca",
      name = "m",
      descriptor = "I"
   )
   public static int field8784;
   @OriginalMember(
      owner = "client!pca",
      name = "N",
      descriptor = "I"
   )
   public static int field8785;
   @OriginalMember(
      owner = "client!pca",
      name = "j",
      descriptor = "I"
   )
   public static int field8786;
   @OriginalMember(
      owner = "client!pca",
      name = "s",
      descriptor = "I"
   )
   public static int field8787;
   @OriginalMember(
      owner = "client!pca",
      name = "n",
      descriptor = "I"
   )
   public static int field8788;
   @OriginalMember(
      owner = "client!pca",
      name = "x",
      descriptor = "I"
   )
   public static int field8789;
   @OriginalMember(
      owner = "client!pca",
      name = "y",
      descriptor = "I"
   )
   public static int field8790;
   @OriginalMember(
      owner = "client!pca",
      name = "G",
      descriptor = "I"
   )
   public static int field8791;
   @OriginalMember(
      owner = "client!pca",
      name = "i",
      descriptor = "I"
   )
   public static int field8792;
   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "I"
   )
   private int field8793;
   @OriginalMember(
      owner = "client!pca",
      name = "L",
      descriptor = "I"
   )
   public static int field8794;
   @OriginalMember(
      owner = "client!pca",
      name = "k",
      descriptor = "I"
   )
   public static int field8795;
   @OriginalMember(
      owner = "client!pca",
      name = "B",
      descriptor = "I"
   )
   public static int field8797;
   @OriginalMember(
      owner = "client!pca",
      name = "H",
      descriptor = "I"
   )
   public static int field8798;
   @OriginalMember(
      owner = "client!pca",
      name = "A",
      descriptor = "I"
   )
   public static int field8799;
   @OriginalMember(
      owner = "client!pca",
      name = "p",
      descriptor = "I"
   )
   public static int field8800;
   @OriginalMember(
      owner = "client!pca",
      name = "v",
      descriptor = "I"
   )
   public static int field8801;
   @OriginalMember(
      owner = "client!pca",
      name = "M",
      descriptor = "I"
   )
   public static int field8803;
   @OriginalMember(
      owner = "client!pca",
      name = "J",
      descriptor = "I"
   )
   private int field8804;
   @OriginalMember(
      owner = "client!pca",
      name = "t",
      descriptor = "I"
   )
   public static int field8805;
   @OriginalMember(
      owner = "client!pca",
      name = "o",
      descriptor = "I"
   )
   public static int field8806;
   @OriginalMember(
      owner = "client!pca",
      name = "I",
      descriptor = "I"
   )
   public static int field8807;
   @OriginalMember(
      owner = "client!pca",
      name = "P",
      descriptor = "I"
   )
   public static int field8808;
   @OriginalMember(
      owner = "client!pca",
      name = "q",
      descriptor = "I"
   )
   private int field8809;
   @OriginalMember(
      owner = "client!pca",
      name = "h",
      descriptor = "I"
   )
   public static int field8810;
   @OriginalMember(
      owner = "client!pca",
      name = "g",
      descriptor = "I"
   )
   private int field8811;
   @OriginalMember(
      owner = "client!pca",
      name = "w",
      descriptor = "I"
   )
   private int field8813;
   @OriginalMember(
      owner = "client!pca",
      name = "u",
      descriptor = "I"
   )
   private int field8814;
   @OriginalMember(
      owner = "client!pca",
      name = "l",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field8816;

   @OriginalMember(
      owner = "client!pca",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field8780;
         int var2 = this.method4429(arg0, 16);
         if (~(this.field8811 & var2) == -1) {
            var2 = this.field8811;
         }

         if (~(1 & var2) != -1) {
            this.method4427(3, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
         }

         if (~(var2 & 4) != -1) {
            this.method4427(5, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
         }

         if (~(2 & var2) != -1) {
            this.method4427(4, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
         }

         this.field8811 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8817[26] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1570(int arg0) {
      try {
         ++field8782;
         if (arg0 != 29658) {
            this.method4427(15, 20, -5, -5, 31);
         }

         return this.field8793;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field1481;

      try {
         int var3;
         label39: {
            ++field8797;
            var3 = this.method4429(arg0, 16);
            if (var3 != 1) {
               if (var3 == 4) {
                  this.method4427(2, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
                  if (!var2) {
                     break label39;
                  }
               }

               if (~var3 != -3) {
                  break label39;
               }

               this.method4427(1, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
               if (!var2) {
                  break label39;
               }
            }

            this.method4427(0, arg0.getY(), arg0.getX(), arg0.getClickCount(), -1);
         }

         this.field8811 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8817[13] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method4427(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field8803;
         class419 var6 = new class419();
         var6.field5730 = arg1;
         var6.field5723 = arg3;
         var6.field5732 = arg0;
         var6.field5724 = arg2;
         if (arg4 == -1) {
            var6.field5736 = class163.method1353(arg4 + -127);
            this.field8812.method279(false, var6);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8817[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method4428(class479 arg0, int arg1) {
      try {
         if (arg1 > 28) {
            label26: {
               if (class652.field9742) {
                  class131.method1114((byte)125, arg0);
                  if (!client.field1481) {
                     break label26;
                  }
               }

               class726.method5255(-118, arg0);
            }

            ++field8786;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[6] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "(I)Lwi;"
   )
   public final class505 method1563(int arg0) {
      try {
         if (arg0 != -28145) {
            this.field8816 = null;
         }

         ++field8785;
         return (class505)this.field8802.method281(true);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1558(int arg0) {
      try {
         ++field8790;
         int var2 = -117 / ((-24 - arg0) / 55);
         return ~(this.field8804 & 1) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8817[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I"
   )
   private final int method4429(MouseEvent arg0, int arg1) {
      try {
         ++field8795;
         int var3 = arg0.getModifiers();
         boolean var4 = (arg1 & var3) != 0;
         boolean var5 = (var3 & 8) != 0;
         boolean var6 = (var3 & 4) != 0;
         if (var5 && (var4 || var6)) {
            var5 = false;
         }

         if (var4 && var6) {
            return 4;
         } else if (var4) {
            return 1;
         } else if (var5) {
            return 2;
         } else {
            return var6 ? 4 : 0;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8817[17] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public static final void method4430(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8788;
         if (!arg0) {
            method4432((byte)15);
         }

         class244 var4 = class475.field6627[arg2][arg1];
         class696.method5071(arg3, var4 != null ? var4 : class568.field8355, false);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8817[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method4431(int arg0, int arg1, int arg2) {
      try {
         if (arg0 == 471) {
            this.field8814 = arg2;
            ++field8801;
            this.field8813 = arg1;
            if (this.field8815) {
               this.method4427(-1, arg2, arg1, 0, -1);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8817[29] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1566(int arg0) {
      try {
         if (arg0 != 0) {
            this.method4434((Component)null, -84);
         }

         ++field8807;
         return this.field8809;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         ++field8800;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[14] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(B)Ljava/lang/String;"
   )
   public static final String method4432(byte arg0) {
      try {
         ++field8808;
         if (arg0 != 56) {
            method4436((class81)null, 44, true);
         }

         if (!class652.field9742 && class213.field2705 != null) {
            return (class213.field2705.field7903 == null || ~class213.field2705.field7903.length() == -1) && class213.field2705.field7900 != null && ~class213.field2705.field7900.length() < -1 ? class213.field2705.field7900 : class213.field2705.field7903;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8817[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method4433(byte arg0) {
      try {
         if (arg0 != -53) {
            field8796 = 42;
         }

         ++field8798;
         class373.field5222.method3201((byte)95);
         class151.field1879.method3201((byte)-68);
         class390.field5406.method3201((byte)4);
         class266.field3370.method3201((byte)-23);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8817[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method4434(Component arg0, int arg1) {
      try {
         int var3 = -81 % ((-40 - arg1) / 42);
         ++field8783;
         this.method4435((byte)71);
         this.field8816 = arg0;
         this.field8816.addMouseListener(this);
         this.field8816.addMouseMotionListener(this);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8817[20] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method1559(boolean arg0) {
      try {
         if (arg0) {
            this.method1558(-56);
         }

         ++field8789;
         return (4 & this.field8804) != 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field8810;
         this.method4431(471, arg0.getX(), arg0.getY());
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[31] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1565(boolean arg0) {
      try {
         ++field8784;
         this.field8809 = this.field8814;
         this.field8793 = this.field8813;
         this.field8804 = this.field8811;
         class37 var2 = this.field8802;
         this.field8802 = this.field8812;
         this.field8812 = var2;
         this.field8812.method289(arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8817[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1569(byte arg0) {
      try {
         if (arg0 != 19) {
            this.field8811 = 43;
         }

         ++field8799;
         return (this.field8804 & 2) != 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4435(byte arg0) {
      try {
         ++field8792;
         if (arg0 > 52) {
            if (this.field8816 != null) {
               this.field8816.removeMouseMotionListener(this);
               this.field8816.removeMouseListener(this);
               this.field8816 = null;
               this.field8812 = null;
               this.field8802 = null;
               this.field8793 = this.field8809 = this.field8804 = 0;
               this.field8813 = this.field8814 = this.field8811 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         ++field8787;
         this.method4431(471, arg0.getX(), arg0.getY());
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[19] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lqh;IZ)V"
   )
   public static final void method4436(class81 arg0, int arg1, boolean arg2) {
      boolean var3 = client.field1481;

      try {
         ++field8794;
         if (class455.field6279 < 400) {
            class473 var4 = arg0.field1135;
            String var5 = arg0.field1126;
            if (var4.field6583 != null) {
               var4 = var4.method3603(class175.field2266, 4764);
               if (var4 == null) {
                  return;
               }

               var5 = var4.field6526;
            }

            if (var4.field6553) {
               if (~arg0.field1125 != -1) {
                  String var6 = class776.field11312 == class688.field10127 ? class606.field8933.method4490(class782.field11389, -16777216) : class606.field8931.method4490(class782.field11389, -16777216);
                  var5 = var5 + class674.method4932(3, class204.field2593.field11444, arg0.field1125) + field8817[11] + var6 + arg0.field1125 + ")";
               }

               if (class597.field8823 && !arg2) {
                  class32 var7 = class268.field3427 != -1 ? class566.field8336.method1210(class268.field3427, true) : null;
                  if (~(2 & class112.field1500) != -1 && (var7 == null || var4.method3600(var7.field466, class268.field3427, -10121) != var7.field466)) {
                     ++class505.field7040;
                     class254.method2040(15, true, (long)arg0.field145, class207.field2632 + field8817[9] + var5, 0, false, false, (byte)-98, -1, class741.field10841, class649.field9694, 0, (long)arg0.field145);
                  }
               }

               if (!arg2) {
                  String[] var8 = var4.field6525;
                  if (class365.field5077) {
                     var8 = class237.method1895(var8, (byte)83);
                  }

                  if (var8 != null) {
                     int var9 = 4;
                     if (var3 || ~var9 <= -1) {
                        do {
                           if (var8[var9] != null) {
                              if (~var4.field6582 != -1 && var8[var9].equalsIgnoreCase(class606.field8926.method4490(class782.field11389, arg1 ^ 16777215))) {
                                 --var9;
                              } else {
                                 byte var10 = 0;
                                 if (~var9 == -1) {
                                    var10 = 2;
                                 }

                                 int var11 = class286.field3953;
                                 if (var9 == 1) {
                                    var10 = 22;
                                 }

                                 if (~var9 == -3) {
                                    var10 = 12;
                                 }

                                 if (var9 == 3) {
                                    var10 = 57;
                                 }

                                 if (~var9 == -5) {
                                    var10 = 6;
                                 }

                                 if (var4.field6549 == var9) {
                                    var11 = var4.field6562;
                                 }

                                 if (~var4.field6566 == ~var9) {
                                    var11 = var4.field6542;
                                 }

                                 class254.method2040(var10, true, (long)arg0.field145, field8817[10] + var5, 0, false, false, (byte)-97, -1, var8[var9].equalsIgnoreCase(class606.field8926.method4490(class782.field11389, arg1 ^ 16777215)) ? var4.field6584 : var11, var8[var9], 0, (long)arg0.field145);
                                 ++class355.field4957;
                                 --var9;
                              }
                           } else {
                              --var9;
                           }
                        } while(~var9 <= -1);
                     }
                  }

                  if (var4.field6582 == 1 && var8 != null) {
                     int var12 = 4;
                     if (var3 || var12 >= 0) {
                        do {
                           if (var8[var12] != null && var8[var12].equalsIgnoreCase(class606.field8926.method4490(class782.field11389, -16777216))) {
                              short var13 = 0;
                              if (~arg0.field1125 < ~class204.field2593.field11444) {
                                 var13 = 2000;
                              }

                              short var14 = 0;
                              if (var12 == 0) {
                                 var14 = 2;
                              }

                              if (var12 == 1) {
                                 var14 = 22;
                              }

                              if (var12 == 2) {
                                 var14 = 12;
                              }

                              if (var12 == 3) {
                                 var14 = 57;
                              }

                              if (var12 == 4) {
                                 var14 = 6;
                              }

                              if (~var14 != -1) {
                                 var14 += var13;
                              }

                              class254.method2040(var14, true, (long)arg0.field145, field8817[10] + var5, 0, false, false, (byte)-42, -1, var4.field6584, var8[var12], 0, (long)arg0.field145);
                              ++class374.field5230;
                           }

                           --var12;
                        } while(var12 >= 0);
                     }
                  }
               }

               ++class413.field5673;
               class254.method2040(1012, true, (long)arg0.field145, field8817[10] + var5, 0, arg2, false, (byte)-98, arg1, class250.field3157, class606.field8925.method4490(class782.field11389, -16777216), 0, (long)arg0.field145);
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field8817[8] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lha;BLed;)I"
   )
   public static final int method4437(class479 arg0, byte arg1, class628 arg2) {
      try {
         if (arg1 != 111) {
            field8796 = 38;
         }

         ++field8805;
         if (arg2.field9267 == -1) {
            if (~arg2.field9274 != 0) {
               class668 var3 = arg0.field6667.method911(arg2.field9274, 65);
               if (!var3.field9894) {
                  return var3.field9890;
               }
            }

            return arg2.field9278;
         } else {
            return arg2.field9267;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8817[15] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ',' + (arg2 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method4431(471, arg0.getX(), arg0.getY());
         ++field8806;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[30] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1560(int arg0) {
      try {
         if (arg0 != 0) {
            this.mouseDragged((MouseEvent)null);
         }

         ++field8791;
         this.method4435((byte)64);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         this.method4431(471, arg0.getX(), arg0.getY());
         ++field8781;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8817[1] + (arg0 != null ? field8817[2] : field8817[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class595(Component arg0, boolean arg1) {
      try {
         this.method4434(arg0, -95);
         this.field8815 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8817[5] + (arg0 != null ? field8817[2] : field8817[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4439(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
