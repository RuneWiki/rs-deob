import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class47 extends class54 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!vo",
      name = "l",
      descriptor = "Lum;"
   )
   private class550 field550 = new class550();
   @OriginalMember(
      owner = "client!vo",
      name = "J",
      descriptor = "Lum;"
   )
   private class550 field570 = new class550();
   @OriginalMember(
      owner = "client!vo",
      name = "u",
      descriptor = "Z"
   )
   private boolean field574;
   @OriginalMember(
      owner = "client!vo",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field575 = new String[]{method381(method380(":l\u000ebG9pE_Z)pSjLd")), method381(method380("\"vLc")), method381(method380("7-\u000e!U")), method381(method380(":l\u000ebG9pEKZ-dGjLd")), method381(method380(":l\u000e3A\"jT1\u0000")), method381(method380(":l\u000e@\u0000")), method381(method380(":l\u000ebG9pE]M fA|M(+")), method381(method380(":l\u000eL\u0000")), method381(method380(":l\u000eA\u0000")), method381(method380(":l\u000eG\u0000")), method381(method380(":l\u000ebG9pEJP%wEk\u0000")), method381(method380(":l\u000e_\u0000")), method381(method380(":l\u000e^\u0000")), method381(method380(":l\u000e\\\u0000")), method381(method380(":l\u000eB\u0000")), method381(method380(":l\u000eJ\u0000")), method381(method380(":l\u000eK\u0000")), method381(method380(":l\u000e]\u0000")), method381(method380(":l\u000eD\u0000")), method381(method380(":l\u000eH\u0000")), method381(method380(":l\u000e[\u0000")), method381(method380(":l\u000ebG9pEBG:fD'")), method381(method380(":l\u000eE\u0000")), method381(method380(":l\u000ebG9pELD%`KjLd")), method381(method380(":l\u000ebG9pEJF8fRjLd"))};
   @OriginalMember(
      owner = "client!vo",
      name = "s",
      descriptor = "[F"
   )
   public static float[] field563 = new float[4];
   @OriginalMember(
      owner = "client!vo",
      name = "m",
      descriptor = "[[I"
   )
   public static int[][] field571 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   @OriginalMember(
      owner = "client!vo",
      name = "v",
      descriptor = "I"
   )
   public static int field542;
   @OriginalMember(
      owner = "client!vo",
      name = "y",
      descriptor = "I"
   )
   public static int field543;
   @OriginalMember(
      owner = "client!vo",
      name = "i",
      descriptor = "I"
   )
   public static int field544;
   @OriginalMember(
      owner = "client!vo",
      name = "q",
      descriptor = "I"
   )
   public static int field545;
   @OriginalMember(
      owner = "client!vo",
      name = "x",
      descriptor = "I"
   )
   public static int field546;
   @OriginalMember(
      owner = "client!vo",
      name = "r",
      descriptor = "I"
   )
   public static int field547;
   @OriginalMember(
      owner = "client!vo",
      name = "I",
      descriptor = "I"
   )
   public static int field548;
   @OriginalMember(
      owner = "client!vo",
      name = "n",
      descriptor = "I"
   )
   private int field549;
   @OriginalMember(
      owner = "client!vo",
      name = "L",
      descriptor = "I"
   )
   public static int field551;
   @OriginalMember(
      owner = "client!vo",
      name = "D",
      descriptor = "I"
   )
   private int field552;
   @OriginalMember(
      owner = "client!vo",
      name = "M",
      descriptor = "I"
   )
   public static int field553;
   @OriginalMember(
      owner = "client!vo",
      name = "w",
      descriptor = "I"
   )
   public static int field554;
   @OriginalMember(
      owner = "client!vo",
      name = "B",
      descriptor = "I"
   )
   public static int field555;
   @OriginalMember(
      owner = "client!vo",
      name = "H",
      descriptor = "I"
   )
   public static int field556;
   @OriginalMember(
      owner = "client!vo",
      name = "E",
      descriptor = "I"
   )
   public static int field557;
   @OriginalMember(
      owner = "client!vo",
      name = "F",
      descriptor = "I"
   )
   public static int field558;
   @OriginalMember(
      owner = "client!vo",
      name = "G",
      descriptor = "I"
   )
   public static int field559;
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "I"
   )
   public static int field560;
   @OriginalMember(
      owner = "client!vo",
      name = "h",
      descriptor = "I"
   )
   private int field561;
   @OriginalMember(
      owner = "client!vo",
      name = "N",
      descriptor = "I"
   )
   public static int field562;
   @OriginalMember(
      owner = "client!vo",
      name = "K",
      descriptor = "I"
   )
   public static int field564;
   @OriginalMember(
      owner = "client!vo",
      name = "t",
      descriptor = "I"
   )
   public static int field565;
   @OriginalMember(
      owner = "client!vo",
      name = "j",
      descriptor = "I"
   )
   public static int field566;
   @OriginalMember(
      owner = "client!vo",
      name = "p",
      descriptor = "I"
   )
   public static int field567;
   @OriginalMember(
      owner = "client!vo",
      name = "o",
      descriptor = "I"
   )
   private int field568;
   @OriginalMember(
      owner = "client!vo",
      name = "A",
      descriptor = "I"
   )
   private int field569;
   @OriginalMember(
      owner = "client!vo",
      name = "C",
      descriptor = "I"
   )
   private int field572;
   @OriginalMember(
      owner = "client!vo",
      name = "k",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field573;

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(III)V",
      line = 3
   )
   private final void method365(int arg0, int arg1, int arg2) {
      try {
         this.field569 = arg1;
         this.field568 = arg0;
         ++field560;
         if (this.field574) {
            this.method371(arg0, -1, arg2 ^ -6, arg1, 0);
         }

         if (arg2 != -1) {
            this.method368((byte)-95);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field575[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 21
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field556;
         int var2 = this.method370(3, arg0);
         if (~(this.field572 & var2) == -1) {
            var2 = this.field572;
         }

         if (~(1 & var2) != -1) {
            this.method371(arg0.getY(), 3, 5, arg0.getX(), arg0.getClickCount());
         }

         if ((4 & var2) != 0) {
            this.method371(arg0.getY(), 5, 5, arg0.getX(), arg0.getClickCount());
         }

         if (~(var2 & 2) != -1) {
            this.method371(arg0.getY(), 4, 5, arg0.getX(), arg0.getClickCount());
         }

         this.field572 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field575[6] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(Z)I",
      line = 50
   )
   public final int method366(boolean arg0) {
      try {
         ++field567;
         return !arg0 ? -114 : this.field552;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 62
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

         ++field562;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[23] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(Z)V",
      line = 74
   )
   private final void method367(boolean arg0) {
      try {
         ++field554;
         if (this.field573 != null) {
            this.field573.removeMouseMotionListener(this);
            this.field573.removeMouseListener(this);
            if (!arg0) {
               this.field550 = null;
               this.field570 = null;
               this.field569 = this.field568 = this.field572 = 0;
               this.field549 = this.field552 = this.field561 = 0;
               this.field573 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(B)I",
      line = 97
   )
   public final int method368(byte arg0) {
      try {
         if (arg0 != 106) {
            this.field561 = -23;
         }

         ++field544;
         return this.field549;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 108
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         ++field557;
         this.method365(arg0.getY(), arg0.getX(), -1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[24] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 116
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         ++field564;
         this.method365(arg0.getY(), arg0.getX(), -1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[10] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "e",
      descriptor = "(B)Z",
      line = 125
   )
   public final boolean method369(byte arg0) {
      try {
         ++field547;
         if (arg0 > -117) {
            field571 = null;
         }

         return (this.field561 & 2) != 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 142
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field553;
         this.method365(arg0.getY(), arg0.getX(), -1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[3] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ILjava/awt/event/MouseEvent;)I",
      line = 153
   )
   private final int method370(int arg0, MouseEvent arg1) {
      try {
         ++field545;
         int var3 = arg1.getModifiers();
         if (arg0 != 3) {
            this.method371(-54, -69, 121, 13, -125);
         }

         boolean var4 = (var3 & 16) != 0;
         boolean var5 = ~(8 & var3) != -1;
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
         throw class670.method4877(var8, field575[13] + arg0 + ',' + (arg1 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 194
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method365(arg0.getY(), arg0.getX(), -1);
         ++field546;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[21] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IIIII)V",
      line = 203
   )
   private final void method371(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field548;
         class769 var6 = new class769();
         if (arg2 != 5) {
            this.field552 = -10;
         }

         var6.field11278 = arg3;
         var6.field11273 = arg4;
         var6.field11281 = arg0;
         var6.field11276 = arg1;
         var6.field11275 = class188.method1462(true);
         this.field570.method4060(23, var6);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field575[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(I[IIBI)V",
      line = 221
   )
   public static final void method372(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
      int var5 = client.field4530;

      try {
         --arg4;
         if (arg3 <= 93) {
            field571 = null;
         }

         ++field551;
         int var9 = arg0 - 1;
         int var6 = -7 + var9;
         int var10;
         if (var5 != 0) {
            var10 = arg4 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            int var14 = var13 + 1;
            arg1[var14] = arg2;
            int var15 = var14 + 1;
            arg1[var15] = arg2;
            int var16 = var15 + 1;
            arg1[var16] = arg2;
            arg4 = var16 + 1;
            arg1[arg4] = arg2;
         }

         while(true) {
            while(var6 > arg4) {
               var10 = arg4 + 1;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               ++var10;
               arg1[var10] = arg2;
               arg4 = var10 + 1;
               arg1[arg4] = arg2;
            }

            if (var5 == 0) {
               if (var5 == 0 && arg4 >= var9) {
                  return;
               } else {
                  do {
                     ++arg4;
                     arg1[arg4] = arg2;
                  } while(arg4 < var9);

                  return;
               }
            }

            ++arg4;
            arg1[arg4] = arg2;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field575[17] + arg0 + ',' + (arg1 != null ? field575[2] : field575[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 253
   )
   private final void method373(int arg0, Component arg1) {
      try {
         ++field542;
         this.method367(false);
         this.field573 = arg1;
         if (arg0 != -1) {
            this.method369((byte)22);
         }

         this.field573.addMouseListener(this);
         this.field573.addMouseMotionListener(this);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field575[11] + arg0 + ',' + (arg1 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 267
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      int var2 = client.field4530;

      try {
         int var3;
         label44: {
            ++field543;
            var3 = this.method370(3, arg0);
            if (var3 == 1) {
               this.method371(arg0.getY(), 0, 5, arg0.getX(), arg0.getClickCount());
               if (var2 == 0) {
                  break label44;
               }
            }

            if (var3 == 4) {
               this.method371(arg0.getY(), 2, 5, arg0.getX(), arg0.getClickCount());
               if (var2 == 0) {
                  break label44;
               }
            }

            if (var3 == 2) {
               this.method371(arg0.getY(), 1, 5, arg0.getX(), arg0.getClickCount());
            }
         }

         this.field572 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field575[0] + (arg0 != null ? field575[2] : field575[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "d",
      descriptor = "(B)V",
      line = 293
   )
   public final synchronized void method374(byte arg0) {
      try {
         this.field561 = this.field572;
         this.field552 = this.field568;
         ++field566;
         this.field549 = this.field569;
         class550 var2 = this.field550;
         this.field550 = this.field570;
         this.field570 = var2;
         this.field570.method4062(0);
         if (arg0 < 121) {
            this.method368((byte)59);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field575[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "d",
      descriptor = "(I)Lbn;",
      line = 318
   )
   public final class467 method375(int arg0) {
      try {
         if (arg0 != -1) {
            this.method367(true);
         }

         ++field555;
         return (class467)this.field550.method4063(-5);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "(I)V",
      line = 329
   )
   public final void method376(int arg0) {
      try {
         int var2 = 116 / ((arg0 - -38) / 44);
         this.method367(false);
         ++field559;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field575[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "(B)Z",
      line = 340
   )
   public final boolean method377(byte arg0) {
      try {
         ++field565;
         if (arg0 != -72) {
            return false;
         } else {
            return (4 & this.field561) != 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "f",
      descriptor = "(I)V",
      line = 351
   )
   public static void method378(int arg0) {
      try {
         if (arg0 <= 25) {
            method378(-122);
         }

         field563 = null;
         field571 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field575[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "(I)Z",
      line = 364
   )
   public final boolean method379(int arg0) {
      try {
         if (arg0 != 3) {
            return false;
         } else {
            ++field558;
            return (1 & this.field561) != 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field575[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 398
   )
   public class47(Component arg0, boolean arg1) {
      try {
         this.method373(-1, arg0);
         this.field574 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field575[4] + (arg0 != null ? field575[2] : field575[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method380(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method381(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
