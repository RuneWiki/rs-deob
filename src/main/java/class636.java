import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rka")
public class class636 extends class736 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!rka",
      name = "O",
      descriptor = "Lsn;"
   )
   private class675 field9210 = new class675();
   @OriginalMember(
      owner = "client!rka",
      name = "k",
      descriptor = "Lsn;"
   )
   private class675 field9216 = new class675();
   @OriginalMember(
      owner = "client!rka",
      name = "q",
      descriptor = "Z"
   )
   private boolean field9218;
   @OriginalMember(
      owner = "client!rka",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9220 = new String[]{method4649(method4648("U,k7\u0007\u000f")), method4649(method4648("U,k7\u0003\u000f")), method4649(method4648("I2fu")), method4649(method4648("\\i$7=")), method4649(method4648("U,k7\u0010\u000f")), method4649(method4648("U,k7-H2y|\u0005_.~|$\u000f")), method4649(method4648("U,k7-H2y|\u0012B+ox3B#\"")), method4649(method4648("U,k7-H2y|\u0004U&m~%Co")), method4649(method4648("U,k7-H2y|\u0003K.ir%Co")), method4649(method4648("U,k7\u0006\u000f")), method4649(method4648("U,k7\u0011\u000f")), method4649(method4648("U,k7-H2y|\u0005I3ok%Co")), method4649(method4648("U,k7|N)cm~\u000f")), method4649(method4648("U,k7\u0012\u000f")), method4649(method4648("U,k7\u0004\u000f")), method4649(method4648("U,k7\b\u000f")), method4649(method4648("U,k7\t\u000f")), method4649(method4648("U,k7\f\u000f")), method4649(method4648("U,k7\u0002\u000f")), method4649(method4648("U,k7\u000e\u000f")), method4649(method4648("U,k7\u000b\u000f")), method4649(method4648("U,k7-H2y|\rH1o}h")), method4649(method4648("U,k7-H2y|\u0010U\"yj%Co")), method4649(method4648("U,k7\u000f\u000f")), method4649(method4648("U,k7\r\u000f")), method4649(method4648("U,k7\u0013\u000f"))};
   @OriginalMember(
      owner = "client!rka",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field9187 = false;
   @OriginalMember(
      owner = "client!rka",
      name = "m",
      descriptor = "I"
   )
   public static int field9186;
   @OriginalMember(
      owner = "client!rka",
      name = "G",
      descriptor = "I"
   )
   public static int field9188;
   @OriginalMember(
      owner = "client!rka",
      name = "N",
      descriptor = "I"
   )
   public static int field9189;
   @OriginalMember(
      owner = "client!rka",
      name = "w",
      descriptor = "I"
   )
   public static int field9190;
   @OriginalMember(
      owner = "client!rka",
      name = "l",
      descriptor = "I"
   )
   public static int field9191;
   @OriginalMember(
      owner = "client!rka",
      name = "r",
      descriptor = "I"
   )
   public static int field9192;
   @OriginalMember(
      owner = "client!rka",
      name = "n",
      descriptor = "I"
   )
   public static int field9193;
   @OriginalMember(
      owner = "client!rka",
      name = "M",
      descriptor = "I"
   )
   public static int field9194;
   @OriginalMember(
      owner = "client!rka",
      name = "t",
      descriptor = "I"
   )
   public static int field9195;
   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "I"
   )
   private int field9196;
   @OriginalMember(
      owner = "client!rka",
      name = "A",
      descriptor = "I"
   )
   public static int field9197;
   @OriginalMember(
      owner = "client!rka",
      name = "B",
      descriptor = "I"
   )
   public static int field9198;
   @OriginalMember(
      owner = "client!rka",
      name = "C",
      descriptor = "I"
   )
   public static int field9200;
   @OriginalMember(
      owner = "client!rka",
      name = "o",
      descriptor = "I"
   )
   public static int field9201;
   @OriginalMember(
      owner = "client!rka",
      name = "j",
      descriptor = "I"
   )
   public static int field9202;
   @OriginalMember(
      owner = "client!rka",
      name = "D",
      descriptor = "I"
   )
   public static int field9203;
   @OriginalMember(
      owner = "client!rka",
      name = "i",
      descriptor = "I"
   )
   public static int field9204;
   @OriginalMember(
      owner = "client!rka",
      name = "L",
      descriptor = "I"
   )
   private int field9205;
   @OriginalMember(
      owner = "client!rka",
      name = "P",
      descriptor = "I"
   )
   private int field9206;
   @OriginalMember(
      owner = "client!rka",
      name = "E",
      descriptor = "I"
   )
   public static int field9207;
   @OriginalMember(
      owner = "client!rka",
      name = "y",
      descriptor = "I"
   )
   public static int field9208;
   @OriginalMember(
      owner = "client!rka",
      name = "F",
      descriptor = "I"
   )
   public static int field9209;
   @OriginalMember(
      owner = "client!rka",
      name = "h",
      descriptor = "I"
   )
   public static int field9211;
   @OriginalMember(
      owner = "client!rka",
      name = "s",
      descriptor = "I"
   )
   private int field9212;
   @OriginalMember(
      owner = "client!rka",
      name = "K",
      descriptor = "I"
   )
   public static int field9213;
   @OriginalMember(
      owner = "client!rka",
      name = "J",
      descriptor = "I"
   )
   private int field9214;
   @OriginalMember(
      owner = "client!rka",
      name = "v",
      descriptor = "I"
   )
   private int field9215;
   @OriginalMember(
      owner = "client!rka",
      name = "x",
      descriptor = "I"
   )
   public static int field9217;
   @OriginalMember(
      owner = "client!rka",
      name = "H",
      descriptor = "Laka;"
   )
   public static class637 field9199;
   @OriginalMember(
      owner = "client!rka",
      name = "u",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field9219;

   @OriginalMember(
      owner = "client!rka",
      name = "c",
      descriptor = "(B)Z",
      line = 6
   )
   public final boolean method2573(byte arg0) {
      try {
         int var2 = -125 / ((-70 - arg0) / 36);
         ++field9204;
         return (this.field9196 & 2) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9220[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(Z)I",
      line = 16
   )
   public final int method2578(boolean arg0) {
      try {
         ++field9201;
         if (!arg0) {
            this.method4645(-123, 51, 53);
         }

         return this.field9205;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(I)Z",
      line = 29
   )
   public final boolean method2570(int arg0) {
      try {
         if (arg0 != 25) {
            method4643(-97, (class672[])null);
         }

         ++field9195;
         return (4 & this.field9196) != 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "b",
      descriptor = "(I)V",
      line = 42
   )
   public final synchronized void method2579(int arg0) {
      try {
         this.field9196 = this.field9214;
         ++field9200;
         this.field9205 = this.field9212;
         this.field9206 = this.field9215;
         class675 var2 = this.field9210;
         this.field9210 = this.field9216;
         this.field9216 = var2;
         this.field9216.method4981((byte)-127);
         if (arg0 >= -41) {
            this.method4641(85, (MouseEvent)null);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9220[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "c",
      descriptor = "(I)I",
      line = 67
   )
   public final int method2571(int arg0) {
      try {
         if (arg0 < 53) {
            return -117;
         } else {
            ++field9209;
            return this.field9206;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 80
   )
   private final void method4640(int arg0, Component arg1) {
      try {
         ++field9189;
         this.method4644(-106);
         this.field9219 = arg1;
         this.field9219.addMouseListener(this);
         if (arg0 != 571) {
            this.method4645(-34, -71, 89);
         }

         this.field9219.addMouseMotionListener(this);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9220[19] + arg0 + ',' + (arg1 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(ILjava/awt/event/MouseEvent;)I",
      line = 94
   )
   private final int method4641(int arg0, MouseEvent arg1) {
      try {
         ++field9190;
         int var3 = -31 / ((arg0 - 14) / 51);
         int var4 = arg1.getModifiers();
         boolean var5 = (16 & var4) != 0;
         boolean var6 = (8 & var4) != 0;
         boolean var7 = ~(var4 & 4) != -1;
         if (var6 && (var5 || var7)) {
            var6 = false;
         }

         if (var5 && var7) {
            return 4;
         } else if (var5) {
            return 1;
         } else if (var6) {
            return 2;
         } else {
            return var7 ? 4 : 0;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9220[24] + arg0 + ',' + (arg1 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 131
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         this.method4645(arg0.getX(), -21789, arg0.getY());
         ++field9186;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[5] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 139
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field1786;

      try {
         int var3;
         label39: {
            ++field9193;
            var3 = this.method4641(-114, arg0);
            if (var3 != 1) {
               if (~var3 != -5) {
                  if (~var3 != -3) {
                     break label39;
                  }

                  this.method4647(arg0.getY(), 1, 88, arg0.getX(), arg0.getClickCount());
                  if (!var2) {
                     break label39;
                  }
               }

               this.method4647(arg0.getY(), 2, 116, arg0.getX(), arg0.getClickCount());
               if (!var2) {
                  break label39;
               }
            }

            this.method4647(arg0.getY(), 0, 72, arg0.getX(), arg0.getClickCount());
         }

         this.field9214 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9220[22] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 164
   )
   public static final void method4642(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(I[Ljq;)V",
      line = 279
   )
   public static final void method4643(int param0, class672[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 309
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field9188;
         int var2 = this.method4641(-115, arg0);
         if (~(var2 & this.field9214) == -1) {
            var2 = this.field9214;
         }

         if ((var2 & 1) != 0) {
            this.method4647(arg0.getY(), 3, 118, arg0.getX(), arg0.getClickCount());
         }

         if (~(4 & var2) != -1) {
            this.method4647(arg0.getY(), 5, 65, arg0.getX(), arg0.getClickCount());
         }

         if (~(var2 & 2) != -1) {
            this.method4647(arg0.getY(), 4, 64, arg0.getX(), arg0.getClickCount());
         }

         this.field9214 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9220[6] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "d",
      descriptor = "(I)Luw;",
      line = 338
   )
   public final class670 method2576(int arg0) {
      try {
         if (arg0 < 59) {
            this.field9218 = false;
         }

         ++field9197;
         return (class670)this.field9210.method4974(115);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "d",
      descriptor = "(B)Z",
      line = 351
   )
   public final boolean method2582(byte arg0) {
      try {
         if (arg0 > -95) {
            method4642(77, -58, 24, 72, 30, -106);
         }

         ++field9198;
         return ~(1 & this.field9196) != -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 371
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field9202;
         this.method4645(arg0.getX(), -21789, arg0.getY());
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[7] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 379
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         this.method4645(arg0.getX(), -21789, arg0.getY());
         ++field9207;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[11] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "f",
      descriptor = "(I)V",
      line = 388
   )
   private final void method4644(int arg0) {
      try {
         ++field9203;
         if (this.field9219 != null) {
            this.field9219.removeMouseMotionListener(this);
            this.field9219.removeMouseListener(this);
            this.field9206 = this.field9205 = this.field9196 = 0;
            this.field9215 = this.field9212 = this.field9214 = 0;
            this.field9216 = null;
            this.field9210 = null;
            this.field9219 = null;
            if (arg0 >= -42) {
               this.field9210 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 412
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

         ++field9211;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[8] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(III)V",
      line = 423
   )
   private final void method4645(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -21789) {
            this.field9214 = 42;
         }

         ++field9208;
         this.field9215 = arg0;
         this.field9212 = arg2;
         if (this.field9218) {
            this.method4647(arg2, -1, arg1 ^ -21886, arg0, 0);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9220[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "e",
      descriptor = "(I)V",
      line = 441
   )
   public final void method2577(int arg0) {
      try {
         this.method4644(-116);
         if (arg0 == -6457) {
            ++field9213;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 507
   )
   public class636(Component arg0, boolean arg1) {
      try {
         this.method4640(571, arg0);
         this.field9218 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9220[12] + (arg0 != null ? field9220[3] : field9220[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 458
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method4645(arg0.getX(), -21789, arg0.getY());
         ++field9194;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9220[21] + (arg0 != null ? field9220[3] : field9220[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "b",
      descriptor = "(Z)V",
      line = 467
   )
   public static void method4646(boolean arg0) {
      try {
         if (!arg0) {
            method4643(79, (class672[])null);
         }

         field9199 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9220[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(IIIII)V",
      line = 482
   )
   private final void method4647(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9192;
         class651 var6 = new class651();
         if (arg2 > 40) {
            var6.field9382 = arg0;
            var6.field9388 = arg4;
            var6.field9394 = arg3;
            var6.field9390 = arg1;
            var6.field9380 = class162.method1442(14080);
            this.field9216.method4980(var6, 0);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9220[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4648(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4649(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
