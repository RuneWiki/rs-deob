import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class210 extends class350 implements MouseListener, MouseMotionListener {
   @OriginalMember(
      owner = "client!tj",
      name = "s",
      descriptor = "Lll;"
   )
   private class387 field2995 = new class387();
   @OriginalMember(
      owner = "client!tj",
      name = "o",
      descriptor = "Lll;"
   )
   private class387 field3009 = new class387();
   @OriginalMember(
      owner = "client!tj",
      name = "v",
      descriptor = "Z"
   )
   private boolean field3013;
   @OriginalMember(
      owner = "client!tj",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3014 = new String[]{method1670(method1669("p,:V\u000b")), method1670(method1669("\u007fh:4^")), method1670(method1669("j3xv")), method1670(method1669("p,:wLq5q_Mp#f\u007fG,")), method1670(method1669("p,:&Jj/`$\u000b")), method1670(method1669("p,:[\u000b")), method1670(method1669("p,:wLq5qJQa5g\u007fG,")), method1670(method1669("p,:^\u000b")), method1670(method1669("p,:wLq5q_[m2q~\u000b")), method1670(method1669("p,:Y\u000b")), method1670(method1669("p,:wLq5qYOm%\u007f\u007fG,")), method1670(method1669("p,:wLq5q^Qe!s\u007fG,")), method1670(method1669("p,:R\u000b")), method1670(method1669("p,:S\u000b")), method1670(method1669("p,:wLq5qWLr#p2")), method1670(method1669("p,:P\u000b")), method1670(method1669("p,:W\u000b")), method1670(method1669("p,:X\u000b")), method1670(method1669("p,:]\u000b")), method1670(method1669("p,:\\\u000b")), method1670(method1669("p,:Q\u000b")), method1670(method1669("p,:wLq5qHFh#uiF`n")), method1670(method1669("p,:_\u000b"))};
   @OriginalMember(
      owner = "client!tj",
      name = "A",
      descriptor = "I"
   )
   private int field2984;
   @OriginalMember(
      owner = "client!tj",
      name = "H",
      descriptor = "I"
   )
   public static int field2985;
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "I"
   )
   public static int field2986;
   @OriginalMember(
      owner = "client!tj",
      name = "t",
      descriptor = "I"
   )
   public static int field2987;
   @OriginalMember(
      owner = "client!tj",
      name = "n",
      descriptor = "I"
   )
   public static int field2988;
   @OriginalMember(
      owner = "client!tj",
      name = "r",
      descriptor = "I"
   )
   public static int field2989;
   @OriginalMember(
      owner = "client!tj",
      name = "K",
      descriptor = "I"
   )
   public static int field2990;
   @OriginalMember(
      owner = "client!tj",
      name = "C",
      descriptor = "I"
   )
   public static int field2991;
   @OriginalMember(
      owner = "client!tj",
      name = "m",
      descriptor = "I"
   )
   public static int field2992;
   @OriginalMember(
      owner = "client!tj",
      name = "B",
      descriptor = "I"
   )
   public static int field2993;
   @OriginalMember(
      owner = "client!tj",
      name = "D",
      descriptor = "I"
   )
   public static int field2994;
   @OriginalMember(
      owner = "client!tj",
      name = "q",
      descriptor = "I"
   )
   private int field2996;
   @OriginalMember(
      owner = "client!tj",
      name = "h",
      descriptor = "I"
   )
   public static int field2997;
   @OriginalMember(
      owner = "client!tj",
      name = "I",
      descriptor = "I"
   )
   public static int field2998;
   @OriginalMember(
      owner = "client!tj",
      name = "u",
      descriptor = "I"
   )
   public static int field2999;
   @OriginalMember(
      owner = "client!tj",
      name = "x",
      descriptor = "I"
   )
   public static int field3000;
   @OriginalMember(
      owner = "client!tj",
      name = "i",
      descriptor = "I"
   )
   public static int field3001;
   @OriginalMember(
      owner = "client!tj",
      name = "E",
      descriptor = "I"
   )
   public static int field3002;
   @OriginalMember(
      owner = "client!tj",
      name = "l",
      descriptor = "I"
   )
   public static int field3003;
   @OriginalMember(
      owner = "client!tj",
      name = "k",
      descriptor = "I"
   )
   private int field3004;
   @OriginalMember(
      owner = "client!tj",
      name = "J",
      descriptor = "I"
   )
   public static int field3005;
   @OriginalMember(
      owner = "client!tj",
      name = "j",
      descriptor = "I"
   )
   public static int field3006;
   @OriginalMember(
      owner = "client!tj",
      name = "w",
      descriptor = "I"
   )
   public static int field3007;
   @OriginalMember(
      owner = "client!tj",
      name = "G",
      descriptor = "I"
   )
   private int field3008;
   @OriginalMember(
      owner = "client!tj",
      name = "F",
      descriptor = "I"
   )
   private int field3010;
   @OriginalMember(
      owner = "client!tj",
      name = "p",
      descriptor = "I"
   )
   private int field3011;
   @OriginalMember(
      owner = "client!tj",
      name = "y",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field3012;

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public final void method1656(int arg0) {
      try {
         this.method1664((byte)-126);
         ++field3000;
         if (arg0 != 4096) {
            this.mouseDragged((MouseEvent)null);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "(I)Z",
      line = 14
   )
   public final boolean method1657(int arg0) {
      try {
         ++field3006;
         if (arg0 != -3964) {
            this.field3008 = -53;
         }

         return ~(2 & this.field3004) != -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIII)V",
      line = 25
   )
   private final void method1658(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2987;
         class391 var6 = new class391();
         var6.field5666 = arg1;
         var6.field5670 = arg4;
         if (arg0 != 4) {
            this.field3013 = false;
         }

         var6.field5665 = arg3;
         var6.field5672 = arg2;
         var6.field5669 = class133.method1054(-29025);
         this.field3009.method2930((byte)-62, var6);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3014[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseExited",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 45
   )
   public final synchronized void mouseExited(MouseEvent arg0) {
      try {
         this.method1668(13808, arg0.getY(), arg0.getX());
         ++field3003;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[8] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "(B)I",
      line = 55
   )
   public final int method1659(byte arg0) {
      try {
         int var2 = 94 / ((68 - arg0) / 53);
         ++field3002;
         return this.field2996;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3014[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(Z)I",
      line = 66
   )
   public final int method1660(boolean arg0) {
      try {
         ++field2985;
         if (arg0) {
            this.method1665((byte)34);
         }

         return this.field2984;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(I)Lcea;",
      line = 80
   )
   public final class227 method1661(int arg0) {
      try {
         ++field2990;
         if (arg0 != -753011614) {
            this.field3011 = 112;
         }

         return (class227)this.field2995.method2941(-14002);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseMoved",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 95
   )
   public final synchronized void mouseMoved(MouseEvent arg0) {
      try {
         this.method1668(13808, arg0.getY(), arg0.getX());
         ++field2994;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[14] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 106
   )
   private final void method1662(int arg0, Component arg1) {
      try {
         if (arg0 != 1) {
            this.field3008 = 64;
         }

         ++field2992;
         this.method1664((byte)-126);
         this.field3012 = arg1;
         this.field3012.addMouseListener(this);
         this.field3012.addMouseMotionListener(this);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3014[20] + arg0 + ',' + (arg1 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mousePressed",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 120
   )
   public final synchronized void mousePressed(MouseEvent arg0) {
      boolean var2 = client.field4360;

      try {
         int var3;
         label44: {
            ++field2989;
            var3 = this.method1666(arg0, 2);
            if (~var3 == -2) {
               this.method1658(4, arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
               if (!var2) {
                  break label44;
               }
            }

            if (~var3 == -5) {
               this.method1658(4, arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
               if (!var2) {
                  break label44;
               }
            }

            if (~var3 == -3) {
               this.method1658(4, arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
            }
         }

         this.field3010 |= var3;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3014[6] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(I)Z",
      line = 153
   )
   public final boolean method1663(int arg0) {
      try {
         ++field2991;
         if (arg0 != 0) {
            this.mousePressed((MouseEvent)null);
         }

         return (this.field3004 & 4) != 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "(B)V",
      line = 164
   )
   private final void method1664(byte arg0) {
      try {
         ++field2999;
         if (this.field3012 != null) {
            this.field3012.removeMouseMotionListener(this);
            this.field3012.removeMouseListener(this);
            this.field3012 = null;
            if (arg0 == -126) {
               this.field2995 = null;
               this.field3011 = this.field3008 = this.field3010 = 0;
               this.field2984 = this.field2996 = this.field3004 = 0;
               this.field3009 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseDragged",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 189
   )
   public final synchronized void mouseDragged(MouseEvent arg0) {
      try {
         ++field3007;
         this.method1668(13808, arg0.getY(), arg0.getX());
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[11] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(B)Z",
      line = 197
   )
   public final boolean method1665(byte arg0) {
      try {
         ++field2986;
         if (arg0 != -109) {
            return false;
         } else {
            return ~(1 & this.field3004) != -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      line = 209
   )
   private final int method1666(MouseEvent arg0, int arg1) {
      try {
         ++field2998;
         int var3 = arg0.getModifiers();
         if (arg1 != 2) {
            return -26;
         } else {
            boolean var4 = ~(16 & var3) != -1;
            boolean var5 = ~(var3 & 8) != -1;
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
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3014[19] + (arg0 != null ? field3014[1] : field3014[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseClicked",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 244
   )
   public final synchronized void mouseClicked(MouseEvent arg0) {
      try {
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }

         ++field2988;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[10] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;Z)V",
      line = 345
   )
   public class210(Component arg0, boolean arg1) {
      try {
         this.method1662(1, arg0);
         this.field3013 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3014[4] + (arg0 != null ? field3014[1] : field3014[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(B)V",
      line = 259
   )
   public final synchronized void method1667(byte arg0) {
      try {
         this.field2984 = this.field3011;
         this.field2996 = this.field3008;
         ++field2993;
         this.field3004 = this.field3010;
         class387 var2 = this.field2995;
         this.field2995 = this.field3009;
         this.field3009 = var2;
         this.field3009.method2934(0);
         if (arg0 != -2) {
            this.field2984 = 62;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3014[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(III)V",
      line = 283
   )
   private final void method1668(int arg0, int arg1, int arg2) {
      try {
         this.field3011 = arg2;
         this.field3008 = arg1;
         ++field3001;
         if (this.field3013) {
            this.method1658(4, arg2, -1, arg1, 0);
         }

         if (arg0 != 13808) {
            this.mouseEntered((MouseEvent)null);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3014[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseReleased",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 303
   )
   public final synchronized void mouseReleased(MouseEvent arg0) {
      try {
         ++field3005;
         int var2 = this.method1666(arg0, 2);
         if ((this.field3010 & var2) == 0) {
            var2 = this.field3010;
         }

         if (~(1 & var2) != -1) {
            this.method1658(4, arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
         }

         if ((4 & var2) != 0) {
            this.method1658(4, arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
         }

         if (~(var2 & 2) != -1) {
            this.method1658(4, arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
         }

         this.field3010 &= ~var2;
         if (arg0.isPopupTrigger()) {
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3014[21] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "mouseEntered",
      descriptor = "(Ljava/awt/event/MouseEvent;)V",
      line = 331
   )
   public final synchronized void mouseEntered(MouseEvent arg0) {
      try {
         ++field2997;
         this.method1668(13808, arg0.getY(), arg0.getX());
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3014[3] + (arg0 != null ? field3014[1] : field3014[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1669(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1670(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
