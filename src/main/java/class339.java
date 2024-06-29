import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class339 extends class639 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!nha",
      name = "v",
      descriptor = "Liw;"
   )
   private class332 field4825 = new class332();
   @OriginalMember(
      owner = "client!nha",
      name = "g",
      descriptor = "Liw;"
   )
   private class332 field4831 = new class332();
   @OriginalMember(
      owner = "client!nha",
      name = "D",
      descriptor = "Z"
   )
   private boolean field4835;
   @OriginalMember(
      owner = "client!nha",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4836 = new String[]{method2629(method2628("\u0006[ng\r")), method2629(method2628("\u0013\u001d!g!U")), method2629(method2628("\u0013\u0000,%")), method2629(method2628("\u0013\u001d!g6U")), method2629(method2628("\u0013\u001d!g1U")), method2629(method2628("\u0013\u001d!g#U")), method2629(method2628("\u0013\u001d!g3U")), method2629(method2628("\u0013\u001d!g;U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,=\u0012\u0003%-X")), method2629(method2628("\u0013\u001d!g U")), method2629(method2628("\u0013\u001d!g\"U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,3\u0011\u001c#\"\u0015\u0019]")), method2629(method2628("\u0013\u001d!g8U")), method2629(method2628("\u0013\u001d!g=U")), method2629(method2628("\u0013\u001d!g?U")), method2629(method2628("\u0013\u001d!g5U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,4\u000f\u0014'.\u0015\u0019]")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,\"\u0018\u0019%(\u0003\u0018\u0011h")), method2629(method2628("\u0013\u001d!g$U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003, \u000f\u00103:\u0015\u0019]")), method2629(method2628("\u0013\u001d!g4U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,5\u0005\u001c4,\u0014U")), method2629(method2628("\u0013\u001d!g7U")), method2629(method2628("\u0013\u001d!g<U")), method2629(method2628("\u0013\u001d!g\u001d\u0012\u00003,5\u0013\u0001%;\u0015\u0019]")), method2629(method2628("\u0013\u001d!gL\u0014\u001b)=NU")), method2629(method2628("\u0013\u001d!g>U"))};
   @OriginalMember(
      owner = "client!nha",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field4814 = false;
   @OriginalMember(
      owner = "client!nha",
      name = "w",
      descriptor = "Lpi;"
   )
   public static class521 field4821 = new class521(method2629(method2628("1<\u0016\f")), 0);
   @OriginalMember(
      owner = "client!nha",
      name = "n",
      descriptor = "I"
   )
   public static int field4800;
   @OriginalMember(
      owner = "client!nha",
      name = "E",
      descriptor = "I"
   )
   public static int field4801;
   @OriginalMember(
      owner = "client!nha",
      name = "u",
      descriptor = "I"
   )
   private int field4802;
   @OriginalMember(
      owner = "client!nha",
      name = "h",
      descriptor = "I"
   )
   public static int field4803;
   @OriginalMember(
      owner = "client!nha",
      name = "G",
      descriptor = "I"
   )
   public static int field4804;
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "I"
   )
   public static int field4805;
   @OriginalMember(
      owner = "client!nha",
      name = "K",
      descriptor = "I"
   )
   public static int field4806;
   @OriginalMember(
      owner = "client!nha",
      name = "r",
      descriptor = "I"
   )
   public static int field4807;
   @OriginalMember(
      owner = "client!nha",
      name = "x",
      descriptor = "I"
   )
   public static int field4808;
   @OriginalMember(
      owner = "client!nha",
      name = "C",
      descriptor = "I"
   )
   public static int field4809;
   @OriginalMember(
      owner = "client!nha",
      name = "I",
      descriptor = "I"
   )
   public static int field4810;
   @OriginalMember(
      owner = "client!nha",
      name = "o",
      descriptor = "I"
   )
   public static int field4811;
   @OriginalMember(
      owner = "client!nha",
      name = "B",
      descriptor = "I"
   )
   public static int field4812;
   @OriginalMember(
      owner = "client!nha",
      name = "y",
      descriptor = "I"
   )
   public static int field4813;
   @OriginalMember(
      owner = "client!nha",
      name = "O",
      descriptor = "I"
   )
   public static int field4815;
   @OriginalMember(
      owner = "client!nha",
      name = "i",
      descriptor = "I"
   )
   private int field4816;
   @OriginalMember(
      owner = "client!nha",
      name = "P",
      descriptor = "I"
   )
   public static int field4817;
   @OriginalMember(
      owner = "client!nha",
      name = "m",
      descriptor = "I"
   )
   public static int field4818;
   @OriginalMember(
      owner = "client!nha",
      name = "l",
      descriptor = "I"
   )
   public static int field4819;
   @OriginalMember(
      owner = "client!nha",
      name = "Q",
      descriptor = "I"
   )
   public static int field4820;
   @OriginalMember(
      owner = "client!nha",
      name = "j",
      descriptor = "I"
   )
   public static int field4822;
   @OriginalMember(
      owner = "client!nha",
      name = "p",
      descriptor = "I"
   )
   public static int field4823;
   @OriginalMember(
      owner = "client!nha",
      name = "M",
      descriptor = "I"
   )
   public static int field4824;
   @OriginalMember(
      owner = "client!nha",
      name = "H",
      descriptor = "I"
   )
   public static int field4826;
   @OriginalMember(
      owner = "client!nha",
      name = "t",
      descriptor = "I"
   )
   private int field4827;
   @OriginalMember(
      owner = "client!nha",
      name = "N",
      descriptor = "I"
   )
   private int field4828;
   @OriginalMember(
      owner = "client!nha",
      name = "F",
      descriptor = "I"
   )
   private int field4829;
   @OriginalMember(
      owner = "client!nha",
      name = "s",
      descriptor = "I"
   )
   public static int field4830;
   @OriginalMember(
      owner = "client!nha",
      name = "A",
      descriptor = "I"
   )
   public static int field4832;
   @OriginalMember(
      owner = "client!nha",
      name = "k",
      descriptor = "I"
   )
   private int field4833;
   @OriginalMember(
      owner = "client!nha",
      name = "R",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field4834;

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ILuda;)Lrga;",
      line = 8
   )
   public static final class250 method2619(int arg0, class473 arg1) {
      try {
         ++field4806;
         if (arg0 != -2) {
            field4821 = null;
         }

         class449 var2 = class561.method4185((byte)10, arg1);
         int var3 = arg1.method3567(31871);
         int var4 = arg1.method3567(arg0 + 31873);
         return new class250(var2.field6556, var2.field6564, var2.field6561, var2.field6560, var2.field6555, var2.field6566, var2.field6551, var2.field6562, var2.field6554, var3, var4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4836[1] + arg0 + ',' + (arg1 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 25
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         ++field4813;
         this.method2625(arg0.getX(), -98, arg0.getY());
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[8] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(I)Luv;",
      line = 38
   )
   public final class380 method1631(int arg0) {
      try {
         ++field4822;
         if (arg0 != 512) {
            this.field4802 = -43;
         }

         return (class380)this.field4825.method2577(true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "e",
      descriptor = "(B)V",
      line = 49
   )
   private final void method2620(byte arg0) {
      try {
         ++field4819;
         if (this.field4834 != null) {
            this.field4834.removeMouseMotionListener(this);
            this.field4834.removeMouseListener(this);
            this.field4829 = this.field4833 = this.field4828 = 0;
            this.field4831 = null;
            this.field4834 = null;
            if (arg0 > -118) {
               this.field4829 = 73;
            }

            this.field4825 = null;
            this.field4816 = this.field4827 = this.field4802 = 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 71
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field4564;

      try {
         int var3;
         label39: {
            ++field4801;
            var3 = this.method2626(arg0, -2);
            if (var3 != 1) {
               if (var3 != 4) {
                  if (~var3 != -3) {
                     break label39;
                  }

                  this.method2627(0, arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
                  if (!var2) {
                     break label39;
                  }
               }

               this.method2627(0, arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
               if (!var2) {
                  break label39;
               }
            }

            this.method2627(0, arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
         }

         this.field4828 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4836[19] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 99
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         ++field4824;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[11] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 110
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         this.method2625(arg0.getX(), -84, arg0.getY());
         ++field4811;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[21] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 119
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field4807;
         int var2 = this.method2626(arg0, -2);
         if (~(var2 & this.field4828) == -1) {
            var2 = this.field4828;
         }

         if (~(1 & var2) != -1) {
            this.method2627(0, arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
         }

         if (~(4 & var2) != -1) {
            this.method2627(0, arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
         }

         if ((var2 & 2) != 0) {
            this.method2627(0, arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
         }

         this.field4828 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4836[17] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V",
      line = 147
   )
   private final void method2621(Component arg0, int arg1) {
      try {
         int var3 = -31 / ((-10 - arg1) / 55);
         this.method2620((byte)-128);
         ++field4820;
         this.field4834 = arg0;
         this.field4834.addMouseListener(this);
         this.field4834.addMouseMotionListener(this);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4836[18] + (arg0 != null ? field4836[0] : field4836[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(B)Z",
      line = 161
   )
   public final boolean method1642(byte arg0) {
      try {
         ++field4823;
         if (arg0 != 88) {
            this.field4835 = false;
         }

         return ~(this.field4802 & 1) != -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 172
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         this.method2625(arg0.getX(), -120, arg0.getY());
         ++field4815;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[24] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(Z)Z",
      line = 180
   )
   public final boolean method1633(boolean arg0) {
      try {
         ++field4812;
         if (!arg0) {
            this.field4835 = true;
         }

         return ~(this.field4802 & 2) != -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "d",
      descriptor = "(B)V",
      line = 195
   )
   public static final void method2622(byte arg0) {
      try {
         class179 var1 = class734.field10556;
         synchronized(class734.field10556) {
            class734.field10556.method1591((byte)58);
         }

         ++field4805;
         int var2 = 48 / ((arg0 - -45) / 37);
         class179 var3 = class641.field9350;
         synchronized(class641.field9350) {
            class641.field9350.method1591((byte)58);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4836[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(I)I",
      line = 210
   )
   public final int method1632(int arg0) {
      try {
         ++field4804;
         if (arg0 >= -91) {
            this.method1636(-59);
         }

         return this.field4827;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "e",
      descriptor = "(I)V",
      line = 223
   )
   public static void method2623(int arg0) {
      try {
         field4821 = null;
         if (arg0 <= 88) {
            method2622((byte)1);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4836[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IIII)I",
      line = 234
   )
   public static final int method2624(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         if (arg1 < 91) {
            method2624(105, -16, -102, 72);
         }

         ++field4826;
         if (~class661.field9617 > -101) {
            return -2;
         } else {
            int var5 = -2;
            int var6 = Integer.MAX_VALUE;
            int var7 = -class370.field5513 + arg2;
            int var8 = -class370.field5494 + arg3;
            class269 var9 = (class269)class370.field5489.method2579(-801);
            int var10000;
            if (var4) {
               var10000 = arg0;
            } else if (var9 == null) {
               var10000 = var5;
               if (!var4) {
                  return var5;
               }
            } else {
               var10000 = arg0;
            }

            while(true) {
               if (var10000 == var9.field3806) {
                  int var10 = var9.field3803;
                  int var11 = var9.field3805;
                  int var12 = class370.field5513 + var10 << 14 | class370.field5494 + var11;
                  int var13 = (-var10 + var7) * (-var10 + var7) + (-var11 + var8) * (-var11 + var8);
                  if (var5 >= 0) {
                     if (~var6 < ~var13) {
                        var6 = var13;
                        var5 = var12;
                     }
                  } else {
                     var6 = var13;
                     var5 = var12;
                  }
               }

               var9 = (class269)class370.field5489.method2583(1);
               if (var9 == null) {
                  var10000 = var5;
                  if (!var4) {
                     return var5;
                  }
               } else {
                  var10000 = arg0;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field4836[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "d",
      descriptor = "(I)Z",
      line = 283
   )
   public final boolean method1639(int arg0) {
      try {
         if (arg0 <= 122) {
            this.method2627(-9, 124, 20, 118, 16);
         }

         ++field4832;
         return (4 & this.field4802) != 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(III)V",
      line = 297
   )
   private final void method2625(int arg0, int arg1, int arg2) {
      try {
         int var4 = -21 % ((-23 - arg1) / 42);
         this.field4829 = arg0;
         this.field4833 = arg2;
         ++field4830;
         if (this.field4835) {
            this.method2627(0, 0, arg2, -1, arg0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4836[23] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "c",
      descriptor = "(I)V",
      line = 316
   )
   public final void method1636(int arg0) {
      try {
         ++field4800;
         if (arg0 != -1) {
            this.field4825 = null;
         }

         this.method2620((byte)-119);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(B)V",
      line = 330
   )
   public final synchronized void method1634(byte arg0) {
      try {
         if (arg0 != -76) {
            this.method2620((byte)99);
         }

         this.field4816 = this.field4829;
         this.field4827 = this.field4833;
         ++field4803;
         this.field4802 = this.field4828;
         class332 var2 = this.field4825;
         this.field4825 = this.field4831;
         this.field4831 = var2;
         this.field4831.method2580((byte)-4);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4836[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      line = 355
   )
   private final int method2626(MouseEvent arg0, int arg1) {
      try {
         ++field4810;
         if (arg1 != -2) {
            this.mouseDragged((MouseEvent)null);
         }

         int var3 = arg0.getModifiers();
         boolean var4 = ~(var3 & 16) != -1;
         boolean var5 = (var3 & 8) != 0;
         boolean var6 = (4 & var3) != 0;
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
         throw class608.method4462(var8, field4836[13] + (arg0 != null ? field4836[0] : field4836[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 392
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field4809;
         this.method2625(arg0.getX(), 21, arg0.getY());
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[16] + (arg0 != null ? field4836[0] : field4836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Z)I",
      line = 401
   )
   public final int method1630(boolean arg0) {
      try {
         if (!arg0) {
            return -36;
         } else {
            ++field4818;
            return this.field4816;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4836[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 445
   )
   public class339(Component arg0, boolean arg1) {
      try {
         this.method2621(arg0, 48);
         this.field4835 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4836[25] + (arg0 != null ? field4836[0] : field4836[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 419
   )
   private final void method2627(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4808;
         class135 var6 = new class135();
         if (arg0 == 0) {
            var6.field2227 = arg2;
            var6.field2218 = arg1;
            var6.field2228 = arg4;
            var6.field2223 = arg3;
            var6.field2220 = class57.method650(123);
            this.field4831.method2585(var6, -71);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4836[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
