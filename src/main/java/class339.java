import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class339 extends class200 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!nha",
      name = "C",
      descriptor = "Lum;"
   )
   private class550 field5146 = new class550();
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "Lum;"
   )
   private class550 field5149 = new class550();
   @OriginalMember(
      owner = "client!nha",
      name = "s",
      descriptor = "[Z"
   )
   private boolean[] field5152 = new boolean[112];
   @OriginalMember(
      owner = "client!nha",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5153 = new String[]{method2693(method2692("1\u000e\u0010\u0000\u0013")), method2693(method2692("$URB")), method2693(method2692("$H_\u0000\u0005/YlK\u0002/AMK\nb")), method2693(method2692("$H_\u0000\b%CK]\"%SJ\u0006")), method2693(method2692("$H_\u0000>b")), method2693(method2692("$H_\u0000<b")), method2693(method2692("$H_\u0000!b")), method2693(method2692("$H_\u0000*b")), method2693(method2692("$H_\u0000R#NWZPb")), method2693(method2692("$H_\u0000\u0005/Yn\\\u000b9S[JF")), method2693(method2692("$H_\u0000&b")), method2693(method2692("$H_\u0000,b")), method2693(method2692("$H_\u0000?b")), method2693(method2692("$H_\u0000\u0005/YjW\u001e/D\u0016")), method2693(method2692("$H_\u0000\"b")), method2693(method2692("$H_\u0000#b")), method2693(method2692("$H_\u0000\b%CK])+IPK\nb")), method2693(method2692("$H_\u0000%b")), method2693(method2692("$H_\u0000 b"))};
   @OriginalMember(
      owner = "client!nha",
      name = "y",
      descriptor = "Loj;"
   )
   public static class399 field5143 = null;
   @OriginalMember(
      owner = "client!nha",
      name = "o",
      descriptor = "I"
   )
   public static int field5132;
   @OriginalMember(
      owner = "client!nha",
      name = "r",
      descriptor = "I"
   )
   public static int field5133;
   @OriginalMember(
      owner = "client!nha",
      name = "B",
      descriptor = "I"
   )
   public static int field5134;
   @OriginalMember(
      owner = "client!nha",
      name = "t",
      descriptor = "I"
   )
   public static int field5135;
   @OriginalMember(
      owner = "client!nha",
      name = "k",
      descriptor = "I"
   )
   public static int field5136;
   @OriginalMember(
      owner = "client!nha",
      name = "w",
      descriptor = "I"
   )
   public static int field5137;
   @OriginalMember(
      owner = "client!nha",
      name = "j",
      descriptor = "I"
   )
   public static int field5139;
   @OriginalMember(
      owner = "client!nha",
      name = "p",
      descriptor = "I"
   )
   public static int field5140;
   @OriginalMember(
      owner = "client!nha",
      name = "n",
      descriptor = "I"
   )
   public static int field5141;
   @OriginalMember(
      owner = "client!nha",
      name = "l",
      descriptor = "I"
   )
   public static int field5142;
   @OriginalMember(
      owner = "client!nha",
      name = "i",
      descriptor = "I"
   )
   public static int field5144;
   @OriginalMember(
      owner = "client!nha",
      name = "v",
      descriptor = "I"
   )
   public static int field5145;
   @OriginalMember(
      owner = "client!nha",
      name = "x",
      descriptor = "I"
   )
   public static int field5147;
   @OriginalMember(
      owner = "client!nha",
      name = "q",
      descriptor = "I"
   )
   public static int field5148;
   @OriginalMember(
      owner = "client!nha",
      name = "m",
      descriptor = "I"
   )
   public static int field5150;
   @OriginalMember(
      owner = "client!nha",
      name = "u",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field5151;
   @OriginalMember(
      owner = "client!nha",
      name = "A",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field5138;

   @OriginalMember(
      owner = "client!nha",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         this.method2686(arg0, (byte)-128, 0);
         ++field5141;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[9] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method2685(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/awt/event/KeyEvent;BI)V"
   )
   private final void method2686(KeyEvent arg0, byte arg1, int arg2) {
      int var4 = client.field4530;

      try {
         int var5;
         label48: {
            ++field5144;
            var5 = arg0.getKeyCode();
            if (var5 != 0) {
               if (~var5 > -1 || var5 >= class137.field1779.length) {
                  var5 = 0;
                  if (var4 == 0) {
                     break label48;
                  }
               }

               int var6 = class137.field1779[var5];
               if (~arg2 != -1 || ~(128 & var6) == -1) {
                  var5 = var6 & -129;
                  if (var4 == 0) {
                     break label48;
                  }
               }

               var5 = 0;
               if (var4 == 0) {
                  break label48;
               }
            }

            var5 = 0;
         }

         if (var5 != 0) {
            this.method2688(0, '\u0000', var5, arg2);
            int var7 = 9 % ((arg1 - -37) / 35);
            arg0.consume();
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5153[15] + (arg0 != null ? field5153[0] : field5153[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1544(int arg0) {
      try {
         this.method2685(0);
         ++field5139;
         if (arg0 < 91) {
            this.method1542((byte)-85);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method1535(int arg0, byte arg1) {
      try {
         if (arg1 >= -71) {
            this.field5146 = null;
         }

         ++field5134;
         return arg0 >= 0 && ~arg0 > -113 ? this.field5152[arg0] : false;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5153[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1534(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nha",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field5142;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[16] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Lha;II)Lat;"
   )
   public static final class396 method2687(class66 arg0, int arg1, int arg2) {
      try {
         ++field5136;
         if (arg1 != 0) {
            method2691(-63);
         }

         class664 var3 = (class664)class204.field2628.method5681((long)arg2, -1);
         if (var3 != null) {
            class430 var4 = var3.field9657.method4113(1);
            var3.field9653 = true;
            if (var4 != null) {
               return var4.method3274(arg0, 28124);
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5153[18] + (arg0 != null ? field5153[0] : field5153[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         ++field5135;
         this.method2686(arg0, (byte)4, 1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[2] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ICII)V"
   )
   private final void method2688(int arg0, char arg1, int arg2, int arg3) {
      try {
         ++field5145;
         class321 var5 = new class321();
         var5.field4587 = arg1;
         if (arg0 != 0) {
            field5143 = null;
         }

         var5.field4586 = arg3;
         var5.field4579 = arg2;
         var5.field4577 = class188.method1462(true);
         this.field5149.method4060(23, var5);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5153[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         ++field5148;
         this.method2688(0, '\u0000', 0, -1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[3] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(Z)I"
   )
   private final int method2689(boolean arg0) {
      try {
         ++field5133;
         if (!arg0) {
            return -45;
         } else {
            int var2 = 0;
            if (this.field5152[81]) {
               var2 |= 1;
            }

            if (this.field5152[82]) {
               var2 |= 4;
            }

            if (this.field5152[86]) {
               var2 |= 2;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5153[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field5147;
         char var2 = arg0.getKeyChar();
         if (~var2 != -1 && class257.method1944(var2, false)) {
            this.method2688(0, var2, -1, 3);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5153[13] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/awt/Component;Z)V"
   )
   private final void method2690(Component arg0, boolean arg1) {
      try {
         this.method2685(0);
         ++field5150;
         this.field5151 = arg0;
         if (!arg1) {
            Method var3 = class719.field10709;
            if (var3 != null) {
               try {
                  var3.invoke(this.field5151, Boolean.FALSE);
               } catch (Throwable var5) {
               }
            }

            this.field5151.addKeyListener(this);
            this.field5151.addFocusListener(this);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5153[4] + (arg0 != null ? field5153[0] : field5153[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(B)Lrja;"
   )
   public final class114 method1542(byte arg0) {
      try {
         ++field5132;
         return arg0 >= -126 ? null : (class114)this.field5146.method4063(-5);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2691(int arg0) {
      try {
         field5143 = null;
         if (arg0 != 0) {
            method2687((class66)null, -3, 62);
         }

         field5138 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5153[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class339(Component arg0) {
      try {
         class426.method3235((byte)18);
         this.method2690(arg0, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5153[8] + (arg0 != null ? field5153[0] : field5153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2692(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2693(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
