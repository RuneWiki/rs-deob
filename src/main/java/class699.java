import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class699 extends class323 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "Lrca;"
   )
   private class37 field10243 = new class37();
   @OriginalMember(
      owner = "client!uo",
      name = "A",
      descriptor = "Lrca;"
   )
   private class37 field10246 = new class37();
   @OriginalMember(
      owner = "client!uo",
      name = "q",
      descriptor = "[Z"
   )
   private boolean[] field10250 = new boolean[112];
   @OriginalMember(
      owner = "client!uo",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10251 = new String[]{method5100(method5099("r1I@")), method5100(method5099("i+\u000bG?e\u0014WI)o!A\u0004")), method5100(method5099("gj\u000b\u0002'")), method5100(method5099("i+\u000b}r")), method5100(method5099("i+\u000b\u00103r-Q\u0012r")), method5100(method5099("i+\u000bmr")), method5100(method5099("i+\u000bJ5\u007f1Vk;u*@Hr")), method5100(method5099("i+\u000bgr")), method5100(method5099("i+\u000bar")), method5100(method5099("i+\u000bG?e\u0016@@?}7@Hr")), method5100(method5099("i+\u000bfr")), method5100(method5099("i+\u000bdr")), method5100(method5099("i+\u000bJ5\u007f1V`5o0\r")), method5100(method5099("i+\u000ber")), method5100(method5099("i+\u000b`r")), method5100(method5099("i+\u000bor")), method5100(method5099("i+\u000bcr")), method5100(method5099("i+\u000bbr")), method5100(method5099("i+\u000bG?e\u0010\\\\?xl")), method5100(method5099("i+\u000bnr")), method5100(method5099("i+\u000b|r"))};
   @OriginalMember(
      owner = "client!uo",
      name = "E",
      descriptor = "I"
   )
   public static int field10229 = 0;
   @OriginalMember(
      owner = "client!uo",
      name = "n",
      descriptor = "[J"
   )
   public static long[] field10234 = new long[32];
   @OriginalMember(
      owner = "client!uo",
      name = "F",
      descriptor = "I"
   )
   public static int field10227;
   @OriginalMember(
      owner = "client!uo",
      name = "y",
      descriptor = "I"
   )
   public static int field10228;
   @OriginalMember(
      owner = "client!uo",
      name = "u",
      descriptor = "I"
   )
   public static int field10230;
   @OriginalMember(
      owner = "client!uo",
      name = "s",
      descriptor = "I"
   )
   public static int field10231;
   @OriginalMember(
      owner = "client!uo",
      name = "r",
      descriptor = "I"
   )
   public static int field10232;
   @OriginalMember(
      owner = "client!uo",
      name = "p",
      descriptor = "I"
   )
   public static int field10233;
   @OriginalMember(
      owner = "client!uo",
      name = "x",
      descriptor = "I"
   )
   public static int field10235;
   @OriginalMember(
      owner = "client!uo",
      name = "D",
      descriptor = "I"
   )
   public static int field10236;
   @OriginalMember(
      owner = "client!uo",
      name = "o",
      descriptor = "I"
   )
   public static int field10237;
   @OriginalMember(
      owner = "client!uo",
      name = "H",
      descriptor = "I"
   )
   public static int field10238;
   @OriginalMember(
      owner = "client!uo",
      name = "k",
      descriptor = "I"
   )
   public static int field10239;
   @OriginalMember(
      owner = "client!uo",
      name = "m",
      descriptor = "I"
   )
   public static int field10240;
   @OriginalMember(
      owner = "client!uo",
      name = "t",
      descriptor = "I"
   )
   public static int field10241;
   @OriginalMember(
      owner = "client!uo",
      name = "G",
      descriptor = "I"
   )
   public static int field10242;
   @OriginalMember(
      owner = "client!uo",
      name = "B",
      descriptor = "I"
   )
   public static int field10244;
   @OriginalMember(
      owner = "client!uo",
      name = "C",
      descriptor = "I"
   )
   public static int field10245;
   @OriginalMember(
      owner = "client!uo",
      name = "w",
      descriptor = "I"
   )
   public static int field10247;
   @OriginalMember(
      owner = "client!uo",
      name = "l",
      descriptor = "I"
   )
   public static int field10248;
   @OriginalMember(
      owner = "client!uo",
      name = "v",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field10249;

   @OriginalMember(
      owner = "client!uo",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         this.method5097('\u0000', -1, 0, (byte)45);
         ++field10241;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[12] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(ILha;Lfia;III)V"
   )
   public static final void method5090(int arg0, class479 arg1, class294 arg2, int arg3, int arg4, int arg5) {
      try {
         ++field10233;
         class544 var6 = class327.field4526.method1600(arg2.field4088, 200);
         if (var6.field7948 != -1) {
            label46: {
               if (!arg2.field4108) {
                  arg3 = 0;
                  if (!client.field1481) {
                     break label46;
                  }
               }

               arg3 += arg2.field4123;
               arg3 &= 3;
            }

            class648 var7 = var6.method4112(arg3, arg1, false, arg2.field4083);
            if (var7 != null) {
               int var8 = arg2.field4038;
               int var9 = arg2.field4066;
               if ((1 & arg3) == 1) {
                  var8 = arg2.field4066;
                  var9 = arg2.field4038;
               }

               int var10 = -53 / ((arg0 - -14) / 52);
               int var11 = var7.method2406();
               int var12 = var7.method2396();
               if (var6.field7950) {
                  var12 = var9 * 4;
                  var11 = var8 * 4;
               }

               if (var6.field7953 == 0) {
                  var7.method4766(arg4, -((var9 + -1) * 4) + arg5, var11, var12);
               } else {
                  var7.method4769(arg4, -((var9 + -1) * 4) + arg5, var11, var12, 0, var6.field7953 | -16777216, 1);
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field10251[3] + arg0 + ',' + (arg1 != null ? field10251[2] : field10251[0]) + ',' + (arg2 != null ? field10251[2] : field10251[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public final boolean method2538(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field10245;
            return arg1 >= 0 && arg1 < 112 ? this.field10250[arg1] : false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10251[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(Ljava/awt/event/KeyEvent;IZ)V"
   )
   private final void method5091(KeyEvent arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1481;

      try {
         ++field10235;
         int var5 = arg0.getKeyCode();
         if (!arg2) {
            label62: {
               if (var5 == 0) {
                  var5 = 0;
                  if (!var4) {
                     break label62;
                  }
               }

               if (var5 < 0 || var5 >= class50.field700.length) {
                  var5 = 0;
                  if (!var4) {
                     break label62;
                  }
               }

               var5 = class50.field700[var5];
               if (arg1 == 0 && ~(var5 & 128) != -1) {
                  var5 = 0;
                  if (!var4) {
                     break label62;
                  }
               }

               var5 &= -129;
            }

            if (~var5 != -1) {
               this.method5097('\u0000', arg1, var5, (byte)45);
               arg0.consume();
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10251[13] + (arg0 != null ? field10251[2] : field10251[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5092(int arg0) {
      try {
         if (arg0 == -30527) {
            field10234 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10251[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V"
   )
   private final void method5093(int arg0, Component arg1) {
      try {
         this.method5096(97);
         ++field10242;
         this.field10249 = arg1;
         Method var3 = class736.field10747;
         if (var3 != null) {
            try {
               var3.invoke(this.field10249, Boolean.FALSE);
            } catch (Throwable var5) {
            }
         }

         if (arg0 >= 82) {
            this.field10249.addKeyListener(this);
            this.field10249.addFocusListener(this);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10251[8] + arg0 + ',' + (arg1 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "g",
      descriptor = "(I)I"
   )
   private final int method5094(int arg0) {
      try {
         ++field10236;
         int var2 = 0;
         if (arg0 >= -10) {
            this.method5097('\r', -59, -32, (byte)-103);
         }

         if (this.field10250[81]) {
            var2 |= 1;
         }

         if (this.field10250[82]) {
            var2 |= 4;
         }

         if (this.field10250[86]) {
            var2 |= 2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10251[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         ++field10232;
         this.method5091(arg0, 0, false);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[1] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "(I)Ldk;"
   )
   public final class715 method2532(int arg0) {
      try {
         ++field10240;
         if (arg0 != 7) {
            this.keyReleased((KeyEvent)null);
         }

         return (class715)this.field10243.method281(true);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5095(int arg0, int arg1) {
      try {
         ++field10248;
         if (arg1 != 2) {
            return false;
         } else {
            return arg0 == 2 || arg0 == 3;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method5096(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(CIIB)V"
   )
   private final void method5097(char arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 == 45) {
            ++field10227;
            class365 var5 = new class365();
            var5.field5075 = arg2;
            var5.field5079 = arg1;
            var5.field5083 = arg0;
            var5.field5084 = class163.method1353(-126);
            this.field10246.method279(false, var5);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10251[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2536(int arg0) {
      try {
         if (arg0 != 2) {
            this.field10246 = null;
         }

         ++field10247;
         this.method5096(arg0 ^ 108);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         this.method5091(arg0, 1, false);
         ++field10238;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[9] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field10239;
         char var2 = arg0.getKeyChar();
         if (~var2 != -1 && class70.method686(-1, var2)) {
            this.method5097(var2, 3, -1, (byte)45);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10251[18] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "(I)V"
   )
   public final synchronized void method2531(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method5098(int arg0, int arg1, int arg2, int arg3) {
      try {
         label54: {
            ++field10237;
            int var6 = arg0 * class757.field11093.field10990.method3351(-18033) >> 8;
            if (~arg3 != 0 || class477.field6647) {
               if (~arg3 == 0 || class614.field9048 == arg3 && class131.method1113((byte)122) || var6 == 0 || class477.field6647) {
                  break label54;
               }

               class545.method4120(arg2, var6, 111, arg3, 0, class146.field1826, false);
               class318.method2514(116);
               if (!client.field1481) {
                  break label54;
               }
            }

            class395.method3114(127);
         }

         if (~class614.field9048 != ~arg3) {
            class773.field11261 = null;
         }

         if (arg1 > -9) {
            field10231 = 10;
         }

         class614.field9048 = arg3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10251[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field10230;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[6] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class699(Component arg0) {
      try {
         class487.method3699(61);
         this.method5093(121, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10251[4] + (arg0 != null ? field10251[2] : field10251[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5099(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5100(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
