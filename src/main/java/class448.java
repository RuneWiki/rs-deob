import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class448 extends class592 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!jaa",
      name = "k",
      descriptor = "Lsb;"
   )
   private class261 field6513 = new class261();
   @OriginalMember(
      owner = "client!jaa",
      name = "v",
      descriptor = "Lsb;"
   )
   private class261 field6538 = new class261();
   @OriginalMember(
      owner = "client!jaa",
      name = "h",
      descriptor = "Z"
   )
   private boolean field6544;
   @OriginalMember(
      owner = "client!jaa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6545 = new String[]{method3478(method3477("y85\b")), method3478(method3477("lcwJt")), method3478(method3477("},8Jdx8*\u0001J{$:\u000flse")), method3478(method3477("},8JL?")), method3478(method3477("},8JG?")), method3478(method3477("},8JH?")), method3478(method3477("},8Jdx8*\u0001Dx;<\u0000!")), method3478(method3477("},8JO?")), method3478(method3477("},8JD?")), method3478(method3477("},8Jdx8*\u0001Me,>\u0003lse")), method3478(method3477("},8JK?")), method3478(method3477("},8JN?")), method3478(method3477("},8J5~#0\u00107?")), method3478(method3477("},8JE?")), method3478(method3477("},8Jdx8*\u0001Ly9<\u0016lse")), method3478(method3477("},8Jdx8*\u0001Lo$-\u0001m?")), method3478(method3477("},8Jdx8*\u0001[r!<\u0005zr)q")), method3478(method3477("},8JJ?")), method3478(method3477("},8JC?")), method3478(method3477("},8JM?")), method3478(method3477("},8JA?")), method3478(method3477("},8Jdx8*\u0001Ye(*\u0017lse")), method3478(method3477("},8J@?")), method3478(method3477("},8JB?"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "n",
      descriptor = "Liw;"
   )
   public static class107 field6532 = new class107(4);
   @OriginalMember(
      owner = "client!jaa",
      name = "r",
      descriptor = "I"
   )
   public static int field6512;
   @OriginalMember(
      owner = "client!jaa",
      name = "w",
      descriptor = "I"
   )
   public static int field6514;
   @OriginalMember(
      owner = "client!jaa",
      name = "L",
      descriptor = "I"
   )
   public static int field6515;
   @OriginalMember(
      owner = "client!jaa",
      name = "F",
      descriptor = "I"
   )
   public static int field6516;
   @OriginalMember(
      owner = "client!jaa",
      name = "G",
      descriptor = "I"
   )
   public static int field6517;
   @OriginalMember(
      owner = "client!jaa",
      name = "m",
      descriptor = "I"
   )
   public static int field6518;
   @OriginalMember(
      owner = "client!jaa",
      name = "D",
      descriptor = "I"
   )
   public static int field6519;
   @OriginalMember(
      owner = "client!jaa",
      name = "x",
      descriptor = "I"
   )
   public static int field6521;
   @OriginalMember(
      owner = "client!jaa",
      name = "C",
      descriptor = "I"
   )
   private int field6522;
   @OriginalMember(
      owner = "client!jaa",
      name = "K",
      descriptor = "I"
   )
   public static int field6523;
   @OriginalMember(
      owner = "client!jaa",
      name = "j",
      descriptor = "I"
   )
   public static int field6524;
   @OriginalMember(
      owner = "client!jaa",
      name = "I",
      descriptor = "I"
   )
   public static int field6525;
   @OriginalMember(
      owner = "client!jaa",
      name = "o",
      descriptor = "I"
   )
   public static int field6526;
   @OriginalMember(
      owner = "client!jaa",
      name = "l",
      descriptor = "I"
   )
   public static int field6527;
   @OriginalMember(
      owner = "client!jaa",
      name = "t",
      descriptor = "I"
   )
   public static int field6528;
   @OriginalMember(
      owner = "client!jaa",
      name = "p",
      descriptor = "I"
   )
   public static int field6529;
   @OriginalMember(
      owner = "client!jaa",
      name = "s",
      descriptor = "I"
   )
   private int field6530;
   @OriginalMember(
      owner = "client!jaa",
      name = "B",
      descriptor = "I"
   )
   public static int field6531;
   @OriginalMember(
      owner = "client!jaa",
      name = "y",
      descriptor = "I"
   )
   public static int field6533;
   @OriginalMember(
      owner = "client!jaa",
      name = "q",
      descriptor = "I"
   )
   private int field6534;
   @OriginalMember(
      owner = "client!jaa",
      name = "u",
      descriptor = "I"
   )
   public static int field6535;
   @OriginalMember(
      owner = "client!jaa",
      name = "E",
      descriptor = "I"
   )
   private int field6536;
   @OriginalMember(
      owner = "client!jaa",
      name = "g",
      descriptor = "I"
   )
   public static int field6537;
   @OriginalMember(
      owner = "client!jaa",
      name = "A",
      descriptor = "I"
   )
   public static int field6539;
   @OriginalMember(
      owner = "client!jaa",
      name = "H",
      descriptor = "I"
   )
   private int field6540;
   @OriginalMember(
      owner = "client!jaa",
      name = "i",
      descriptor = "I"
   )
   private int field6541;
   @OriginalMember(
      owner = "client!jaa",
      name = "J",
      descriptor = "I"
   )
   public static int field6543;
   @OriginalMember(
      owner = "client!jaa",
      name = "M",
      descriptor = "Lsa;"
   )
   public static class39 field6520;
   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field6542;

   @OriginalMember(
      owner = "client!jaa",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field10022;

      try {
         int var3;
         label39: {
            ++field6531;
            var3 = this.method3476(arg0, 19813);
            if (~var3 != -2) {
               if (var3 == 4) {
                  this.method3472(arg0.getY(), 2, arg0.getX(), (byte)93, arg0.getClickCount());
                  if (!var2) {
                     break label39;
                  }
               }

               if (~var3 != -3) {
                  break label39;
               }

               this.method3472(arg0.getY(), 1, arg0.getX(), (byte)93, arg0.getClickCount());
               if (!var2) {
                  break label39;
               }
            }

            this.method3472(arg0.getY(), 0, arg0.getX(), (byte)93, arg0.getClickCount());
         }

         this.field6536 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6545[21] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method3471(byte arg0) {
      try {
         ++field6516;
         if (this.field6542 != null) {
            this.field6542.removeMouseMotionListener(this);
            this.field6542.removeMouseListener(this);
            if (arg0 != 6) {
               this.mouseReleased((MouseEvent)null);
            }

            this.field6530 = this.field6522 = this.field6534 = 0;
            this.field6513 = null;
            this.field6538 = null;
            this.field6542 = null;
            this.field6541 = this.field6540 = this.field6536 = 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1551(boolean arg0) {
      try {
         if (arg0) {
            this.method3476((MouseEvent)null, 17);
         }

         ++field6514;
         return ~(this.field6534 & 4) != -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   private final void method3472(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         if (arg3 == 93) {
            ++field6543;
            class644 var6 = new class644();
            var6.field9068 = arg4;
            var6.field9069 = arg0;
            var6.field9072 = arg2;
            var6.field9066 = arg1;
            var6.field9057 = class604.method4452(21);
            this.field6538.method2238(var6, 13);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6545[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1558(int arg0) {
      try {
         if (arg0 <= 71) {
            this.mouseEntered((MouseEvent)null);
         }

         ++field6539;
         return (1 & this.field6534) != 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field6528;
         int var2 = this.method3476(arg0, 19813);
         if (~(var2 & this.field6536) == -1) {
            var2 = this.field6536;
         }

         if (~(1 & var2) != -1) {
            this.method3472(arg0.getY(), 3, arg0.getX(), (byte)93, arg0.getClickCount());
         }

         if (~(4 & var2) != -1) {
            this.method3472(arg0.getY(), 5, arg0.getX(), (byte)93, arg0.getClickCount());
         }

         if ((var2 & 2) != 0) {
            this.method3472(arg0.getY(), 4, arg0.getX(), (byte)93, arg0.getClickCount());
         }

         this.field6536 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6545[16] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         ++field6533;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[2] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(IIB)V"
   )
   private final void method3473(int arg0, int arg1, byte arg2) {
      try {
         this.field6541 = arg1;
         ++field6527;
         if (arg2 == -35) {
            this.field6540 = arg0;
            if (this.field6544) {
               this.method3472(arg0, -1, arg1, (byte)93, 0);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6545[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method1552(boolean arg0) {
      try {
         this.field6534 = this.field6536;
         this.field6530 = this.field6541;
         if (!arg0) {
            this.field6538 = null;
         }

         ++field6525;
         this.field6522 = this.field6540;
         class261 var2 = this.field6513;
         this.field6513 = this.field6538;
         this.field6538 = var2;
         this.field6538.method2237(87);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6545[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         ++field6526;
         this.method3473(arg0.getY(), arg0.getX(), (byte)-35);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[15] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method3474(Component arg0, int arg1) {
      try {
         this.method3471((byte)6);
         ++field6535;
         if (arg1 != -1) {
            this.method1549(104);
         }

         this.field6542 = arg0;
         this.field6542.addMouseListener(this);
         this.field6542.addMouseMotionListener(this);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6545[8] + (arg0 != null ? field6545[1] : field6545[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method3475(byte arg0) {
      try {
         field6532 = null;
         field6520 = null;
         if (arg0 < 6) {
            field6520 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6545[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method3473(arg0.getY(), arg0.getX(), (byte)-35);
         ++field6518;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[6] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(B)Lsc;"
   )
   public final class143 method1554(byte arg0) {
      try {
         ++field6519;
         if (arg0 <= 56) {
            this.method1554((byte)112);
         }

         return (class143)this.field6513.method2235(3);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1560(byte arg0) {
      try {
         int var2 = -43 % ((28 - arg0) / 62);
         ++field6524;
         return this.field6522;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6545[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I"
   )
   private final int method3476(MouseEvent arg0, int arg1) {
      try {
         ++field6512;
         int var3 = arg0.getModifiers();
         boolean var4 = (16 & var3) != 0;
         boolean var5 = (var3 & 8) != 0;
         boolean var6 = (4 & var3) != 0;
         if (var5 && (var4 || var6)) {
            var5 = false;
         }

         if (var4 && var6) {
            return 4;
         } else {
            if (arg1 != 19813) {
               this.field6534 = 103;
            }

            if (var4) {
               return 1;
            } else if (var5) {
               return 2;
            } else {
               return var6 ? 4 : 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6545[4] + (arg0 != null ? field6545[1] : field6545[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1557(byte arg0) {
      try {
         if (arg0 != -26) {
            method3475((byte)84);
         }

         this.method3471((byte)6);
         ++field6515;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1549(int arg0) {
      try {
         ++field6517;
         if (arg0 > -27) {
            this.field6541 = -101;
         }

         return this.field6530;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         ++field6529;
         this.method3473(arg0.getY(), arg0.getX(), (byte)-35);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[14] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V"
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field6521;
         this.method3473(arg0.getY(), arg0.getX(), (byte)-35);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[9] + (arg0 != null ? field6545[1] : field6545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1548(int arg0) {
      try {
         ++field6537;
         if (arg0 != 10035) {
            this.method3476((MouseEvent)null, -80);
         }

         return (this.field6534 & 2) != 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6545[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   public class448(Component arg0, boolean arg1) {
      try {
         this.method3474(arg0, -1);
         this.field6544 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6545[12] + (arg0 != null ? field6545[1] : field6545[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
