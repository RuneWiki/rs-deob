import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class208 extends class544 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "Lod;"
   )
   private class536 field2573 = new class536();
   @OriginalMember(
      owner = "client!tj",
      name = "u",
      descriptor = "Lod;"
   )
   private class536 field2574 = new class536();
   @OriginalMember(
      owner = "client!tj",
      name = "A",
      descriptor = "Z"
   )
   private boolean field2579;
   @OriginalMember(
      owner = "client!tj",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2581 = new String[]{method1587(method1586("\u0011(rUr")), method1587(method1586("\u000b70j")), method1587(method1586("\u001elr('")), method1587(method1586("\u0011(r@r")), method1587(method1586("\u0011(rKr")), method1587(method1586("\u0011(rWr")), method1587(method1586("\u0011(rk5\u001019K5\u0013'8.")), method1587(method1586("\u0011(rNr")), method1587(method1586("\u0011(r:3\u000b+(8r")), method1587(method1586("\u0011(rTr")), method1587(method1586("\u0011(rk5\u001019C4\u0011'.c>M")), method1587(method1586("\u0011(rVr")), method1587(method1586("\u0011(rk5\u001019T?\t'=u?\u0001j")), method1587(method1586("\u0011(rk5\u001019V(\u00001/c>M")), method1587(method1586("\u0011(rAr")), method1587(method1586("\u0011(rk5\u001019B(\u0004%;c>M")), method1587(method1586("\u0011(rBr")), method1587(method1586("\u0011(rk5\u001019C\"\f69br")), method1587(method1586("\u0011(rMr")), method1587(method1586("\u0011(rJr")), method1587(method1586("\u0011(rHr")), method1587(method1586("\u0011(rIr")), method1587(method1586("\u0011(rk5\u001019E6\f!7c>M")), method1587(method1586("\u0011(rCr"))};
   @OriginalMember(
      owner = "client!tj",
      name = "H",
      descriptor = "Lnw;"
   )
   public static class616 field2552 = new class616(89, -1);
   @OriginalMember(
      owner = "client!tj",
      name = "G",
      descriptor = "I"
   )
   public static int field2549;
   @OriginalMember(
      owner = "client!tj",
      name = "v",
      descriptor = "I"
   )
   private int field2550;
   @OriginalMember(
      owner = "client!tj",
      name = "t",
      descriptor = "I"
   )
   public static int field2551;
   @OriginalMember(
      owner = "client!tj",
      name = "m",
      descriptor = "I"
   )
   public static int field2553;
   @OriginalMember(
      owner = "client!tj",
      name = "q",
      descriptor = "I"
   )
   private int field2554;
   @OriginalMember(
      owner = "client!tj",
      name = "s",
      descriptor = "I"
   )
   public static int field2555;
   @OriginalMember(
      owner = "client!tj",
      name = "w",
      descriptor = "I"
   )
   public static int field2556;
   @OriginalMember(
      owner = "client!tj",
      name = "k",
      descriptor = "I"
   )
   public static int field2557;
   @OriginalMember(
      owner = "client!tj",
      name = "h",
      descriptor = "I"
   )
   public static int field2558;
   @OriginalMember(
      owner = "client!tj",
      name = "x",
      descriptor = "I"
   )
   public static int field2559;
   @OriginalMember(
      owner = "client!tj",
      name = "K",
      descriptor = "I"
   )
   public static int field2560;
   @OriginalMember(
      owner = "client!tj",
      name = "l",
      descriptor = "I"
   )
   private int field2561;
   @OriginalMember(
      owner = "client!tj",
      name = "D",
      descriptor = "I"
   )
   public static int field2562;
   @OriginalMember(
      owner = "client!tj",
      name = "p",
      descriptor = "I"
   )
   public static int field2563;
   @OriginalMember(
      owner = "client!tj",
      name = "M",
      descriptor = "I"
   )
   public static int field2564;
   @OriginalMember(
      owner = "client!tj",
      name = "o",
      descriptor = "I"
   )
   public static int field2565;
   @OriginalMember(
      owner = "client!tj",
      name = "E",
      descriptor = "I"
   )
   public static int field2566;
   @OriginalMember(
      owner = "client!tj",
      name = "r",
      descriptor = "I"
   )
   public static int field2567;
   @OriginalMember(
      owner = "client!tj",
      name = "j",
      descriptor = "I"
   )
   public static int field2568;
   @OriginalMember(
      owner = "client!tj",
      name = "n",
      descriptor = "I"
   )
   public static int field2569;
   @OriginalMember(
      owner = "client!tj",
      name = "I",
      descriptor = "I"
   )
   public static int field2570;
   @OriginalMember(
      owner = "client!tj",
      name = "L",
      descriptor = "I"
   )
   public static int field2571;
   @OriginalMember(
      owner = "client!tj",
      name = "B",
      descriptor = "I"
   )
   public static int field2572;
   @OriginalMember(
      owner = "client!tj",
      name = "i",
      descriptor = "I"
   )
   public static int field2575;
   @OriginalMember(
      owner = "client!tj",
      name = "J",
      descriptor = "I"
   )
   private int field2576;
   @OriginalMember(
      owner = "client!tj",
      name = "F",
      descriptor = "I"
   )
   private int field2577;
   @OriginalMember(
      owner = "client!tj",
      name = "y",
      descriptor = "I"
   )
   private int field2578;
   @OriginalMember(
      owner = "client!tj",
      name = "C",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field2580;

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1572(boolean arg0) {
      try {
         if (arg0) {
            this.field2578 = -75;
         }

         ++field2569;
         return this.field2561;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         ++field2555;
         this.method1585(arg0.getX(), -5, arg0.getY());
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[17] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(B)Lum;"
   )
   public final class554 method1573(byte arg0) {
      try {
         ++field2567;
         if (arg0 != -109) {
            this.mouseMoved((MouseEvent)null);
         }

         return (class554)this.field2573.method3869((byte)61);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1574(int arg0) {
      try {
         ++field2571;
         if (arg0 != -16009) {
            return false;
         } else {
            return ~(this.field2554 & 2) != -1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1575(int arg0) {
      try {
         this.method1578((byte)123);
         if (arg0 != 13361) {
            this.field2579 = false;
         }

         ++field2556;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         ++field2563;
         this.method1585(arg0.getX(), -5, arg0.getY());
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[10] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         this.method1585(arg0.getX(), -5, arg0.getY());
         ++field2575;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[15] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1576(int arg0) {
      try {
         int var2 = -96 % ((arg0 - -8) / 62);
         ++field2553;
         return (1 & this.field2554) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   private final void method1577(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field2568;
         class510 var6 = new class510();
         var6.field7058 = arg0;
         var6.field7066 = arg1;
         if (arg3 == -106) {
            var6.field7065 = arg4;
            var6.field7055 = arg2;
            var6.field7063 = class792.method5708(arg3 + -24899);
            this.field2574.method3859(2, var6);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2581[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1578(byte arg0) {
      try {
         ++field2572;
         if (this.field2580 != null) {
            if (arg0 < 45) {
               this.mouseExited((MouseEvent)null);
            }

            this.field2580.removeMouseMotionListener(this);
            this.field2580.removeMouseListener(this);
            this.field2578 = this.field2577 = this.field2576 = 0;
            this.field2573 = null;
            this.field2580 = null;
            this.field2574 = null;
            this.field2550 = this.field2561 = this.field2554 = 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "(I)V"
   )
   public final synchronized void method1579(int arg0) {
      try {
         this.field2561 = this.field2577;
         this.field2554 = this.field2576;
         ++field2562;
         this.field2550 = this.field2578;
         if (arg0 == 85) {
            class536 var2 = this.field2573;
            this.field2573 = this.field2574;
            this.field2574 = var2;
            this.field2574.method3861(102);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method1585(arg0.getX(), -5, arg0.getY());
         ++field2566;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[6] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field4273;

      try {
         int var3;
         label44: {
            ++field2565;
            var3 = this.method1584((byte)115, arg0);
            if (var3 == 1) {
               this.method1577(arg0.getY(), 0, arg0.getClickCount(), (byte)-106, arg0.getX());
               if (!var2) {
                  break label44;
               }
            }

            if (~var3 == -5) {
               this.method1577(arg0.getY(), 2, arg0.getClickCount(), (byte)-106, arg0.getX());
               if (!var2) {
                  break label44;
               }
            }

            if (var3 == 2) {
               this.method1577(arg0.getY(), 1, arg0.getClickCount(), (byte)-106, arg0.getX());
            }
         }

         this.field2576 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2581[13] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V"
   )
   private final void method1580(int arg0, Component arg1) {
      try {
         ++field2558;
         this.method1578((byte)101);
         if (arg0 != -1) {
            this.field2577 = 83;
         }

         this.field2580 = arg1;
         this.field2580.addMouseListener(this);
         this.field2580.addMouseMotionListener(this);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[21] + arg0 + ',' + (arg1 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method1581(int arg0) {
      try {
         ++field2570;
         return arg0 != 69 ? 20 : this.field2550;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field2559;
         int var2 = this.method1584((byte)113, arg0);
         if (~(this.field2576 & var2) == -1) {
            var2 = this.field2576;
         }

         if (~(var2 & 1) != -1) {
            this.method1577(arg0.getY(), 3, arg0.getClickCount(), (byte)-106, arg0.getX());
         }

         if (~(var2 & 4) != -1) {
            this.method1577(arg0.getY(), 5, arg0.getClickCount(), (byte)-106, arg0.getX());
         }

         if (~(var2 & 2) != -1) {
            this.method1577(arg0.getY(), 4, arg0.getClickCount(), (byte)-106, arg0.getX());
         }

         this.field2576 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[12] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method1582(int arg0) {
      try {
         int var2 = -90 % ((-36 - arg0) / 45);
         ++field2551;
         return (4 & this.field2554) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1583(byte arg0) {
      try {
         field2552 = null;
         if (arg0 <= 103) {
            field2552 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2581[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(BLjava/awt/event/MouseEvent;)I"
   )
   private final int method1584(byte arg0, MouseEvent arg1) {
      try {
         ++field2549;
         int var3 = arg1.getModifiers();
         if (arg0 < 84) {
            return 50;
         } else {
            boolean var4 = (16 & var3) != 0;
            boolean var5 = ~(var3 & 8) != -1;
            boolean var6 = ~(var3 & 4) != -1;
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
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2581[0] + arg0 + ',' + (arg1 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(III)V"
   )
   private final void method1585(int arg0, int arg1, int arg2) {
      try {
         this.field2577 = arg2;
         if (arg1 != -5) {
            this.field2554 = -95;
         }

         ++field2557;
         this.field2578 = arg0;
         if (this.field2579) {
            this.method1577(arg2, -1, 0, (byte)-106, arg0);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2581[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

         ++field2560;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2581[22] + (arg0 != null ? field2581[2] : field2581[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class208(Component arg0, boolean arg1) {
      try {
         this.method1580(-1, arg0);
         this.field2579 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2581[8] + (arg0 != null ? field2581[2] : field2581[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1586(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1587(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
