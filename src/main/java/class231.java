import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class231 extends class31 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!qia",
      name = "w",
      descriptor = "Lsn;"
   )
   private class675 field3542 = new class675();
   @OriginalMember(
      owner = "client!qia",
      name = "u",
      descriptor = "Lsn;"
   )
   private class675 field3545 = new class675();
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "[Z"
   )
   private boolean[] field3546 = new boolean[112];
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3551 = new String[]{method1993(method1992("\u007fT%~`&")), method1993(method1992("\u007fT%~n&")), method1993(method1992("\u007fT%~Ba^1#haN0x")), method1993(method1992("u\u0013j~Y")), method1993(method1992("`H(<")), method1993(method1992("\u007fT%~Ba^1#coT*5@&")), method1993(method1992("\u007fT%~OkD\u00165Hk\\75@&")), method1993(method1992("\u007fT%~b&")), method1993(method1992("\u007fT%~a&")), method1993(method1992("\u007fT%~m&")), method1993(method1992("\u007fT%~OkD\u0010)TkYl")), method1993(method1992("\u007fT%~c&")), method1993(method1992("\u007fT%~g&")), method1993(method1992("\u007fT%~f&")), method1993(method1992("\u007fT%~\u0018gS-$\u001a&")), method1993(method1992("\u007fT%~e&")), method1993(method1992("\u007fT%~OkD\u0014\"A}N!4\f")), method1993(method1992("\u007fT%~l&"))};
   @OriginalMember(
      owner = "client!qia",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field3531 = false;
   @OriginalMember(
      owner = "client!qia",
      name = "t",
      descriptor = "[[Z"
   )
   public static boolean[][] field3539 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!qia",
      name = "o",
      descriptor = "I"
   )
   public static int field3532;
   @OriginalMember(
      owner = "client!qia",
      name = "y",
      descriptor = "I"
   )
   public static int field3533;
   @OriginalMember(
      owner = "client!qia",
      name = "m",
      descriptor = "I"
   )
   public static int field3534;
   @OriginalMember(
      owner = "client!qia",
      name = "k",
      descriptor = "I"
   )
   public static int field3535;
   @OriginalMember(
      owner = "client!qia",
      name = "s",
      descriptor = "I"
   )
   public static int field3536;
   @OriginalMember(
      owner = "client!qia",
      name = "p",
      descriptor = "I"
   )
   public static int field3537;
   @OriginalMember(
      owner = "client!qia",
      name = "v",
      descriptor = "I"
   )
   public static int field3538;
   @OriginalMember(
      owner = "client!qia",
      name = "x",
      descriptor = "I"
   )
   public static int field3540;
   @OriginalMember(
      owner = "client!qia",
      name = "j",
      descriptor = "I"
   )
   public static int field3541;
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "I"
   )
   public static int field3543;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "I"
   )
   public static int field3544;
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "I"
   )
   public static int field3548;
   @OriginalMember(
      owner = "client!qia",
      name = "n",
      descriptor = "I"
   )
   public static int field3549;
   @OriginalMember(
      owner = "client!qia",
      name = "l",
      descriptor = "I"
   )
   public static int field3550;
   @OriginalMember(
      owner = "client!qia",
      name = "q",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field3547;

   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "(B)V"
   )
   public final synchronized void method221(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qia",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         ++field3534;
         this.method1991(arg0, true, 1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[6] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1986(int arg0) {
      try {
         field3539 = null;
         if (arg0 != 27125) {
            method1986(115);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3551[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method219(int arg0, byte arg1) {
      try {
         ++field3536;
         if (arg1 >= -20) {
            this.method222((byte)-45);
         }

         return ~arg0 <= -1 && ~arg0 > -113 ? this.field3546[arg0] : false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3551[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(IIIC)V"
   )
   private final void method1987(int arg0, int arg1, int arg2, char arg3) {
      try {
         ++field3538;
         if (arg0 > -21) {
            this.field3547 = null;
         }

         class44 var5 = new class44();
         var5.field586 = arg3;
         var5.field577 = arg2;
         var5.field588 = arg1;
         var5.field584 = class162.method1442(14080);
         this.field3545.method4980(var5, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3551[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method224(boolean arg0) {
      try {
         this.method1990(123);
         ++field3541;
         if (!arg0) {
            this.field3547 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field3537;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[5] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field3532;
         char var2 = arg0.getKeyChar();
         if (var2 != 0 && class145.method1312(var2, 2198)) {
            this.method1987(-67, 3, -1, var2);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3551[10] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(Z)I"
   )
   private final int method1988(boolean arg0) {
      try {
         ++field3549;
         int var2 = 0;
         if (arg0) {
            return 59;
         } else {
            if (this.field3546[81]) {
               var2 |= 1;
            }

            if (this.field3546[82]) {
               var2 |= 4;
            }

            if (this.field3546[86]) {
               var2 |= 2;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3551[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(B)Lkc;"
   )
   public final class132 method222(byte arg0) {
      try {
         if (arg0 != 11) {
            this.focusGained((FocusEvent)null);
         }

         ++field3548;
         return (class132)this.field3542.method4974(arg0 + 77);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method1989(Component arg0, int arg1) {
      try {
         this.method1990(120);
         ++field3540;
         if (arg1 != 0) {
            field3539 = null;
         }

         this.field3547 = arg0;
         Method var3 = class289.field4561;
         if (var3 != null) {
            try {
               var3.invoke(this.field3547, Boolean.FALSE);
            } catch (Throwable var5) {
            }
         }

         this.field3547.addKeyListener(this);
         this.field3547.addFocusListener(this);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3551[13] + (arg0 != null ? field3551[3] : field3551[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         ++field3533;
         this.method1991(arg0, true, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[16] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method1990(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3543;
         if (this.field3547 != null) {
            this.field3547.removeKeyListener(this);
            this.field3547.removeFocusListener(this);
            this.field3547 = null;
            int var3 = 0;
            if (var2) {
               this.field3546[var3] = false;
               ++var3;
            }

            while(true) {
               while(~var3 > -113) {
                  this.field3546[var3] = false;
                  ++var3;
               }

               this.field3542.method4981((byte)-83);
               this.field3545.method4981((byte)-91);
               if (!var2) {
                  if (arg0 < 116) {
                     this.field3547 = null;
                     return;
                  }

                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3551[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Ljava/awt/event/KeyEvent;ZI)V"
   )
   private final void method1991(KeyEvent arg0, boolean arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         if (!arg1) {
            this.field3547 = null;
         }

         int var5;
         label56: {
            ++field3550;
            var5 = arg0.getKeyCode();
            if (~var5 == -1) {
               var5 = 0;
               if (!var4) {
                  break label56;
               }
            }

            if (var5 >= 0 && var5 < class586.field8662.length) {
               int var6 = class586.field8662[var5];
               if (~arg2 != -1 || (128 & var6) == 0) {
                  var5 = var6 & -129;
                  if (!var4) {
                     break label56;
                  }
               }

               var5 = 0;
               if (!var4) {
                  break label56;
               }
            }

            var5 = 0;
         }

         if (~var5 != -1) {
            this.method1987(-23, arg2, var5, '\u0000');
            arg0.consume();
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3551[7] + (arg0 != null ? field3551[3] : field3551[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class231(Component arg0) {
      try {
         class723.method5345((byte)60);
         this.method1989(arg0, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[14] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         ++field3544;
         this.method1987(-94, -1, 0, '\u0000');
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3551[2] + (arg0 != null ? field3551[3] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1992(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1993(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
