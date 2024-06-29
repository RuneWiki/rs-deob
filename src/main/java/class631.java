import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class631 extends class373 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!raa",
      name = "p",
      descriptor = "Liw;"
   )
   private class332 field9194 = new class332();
   @OriginalMember(
      owner = "client!raa",
      name = "i",
      descriptor = "Liw;"
   )
   private class332 field9211 = new class332();
   @OriginalMember(
      owner = "client!raa",
      name = "l",
      descriptor = "[Z"
   )
   private boolean[] field9213 = new boolean[112];
   @OriginalMember(
      owner = "client!raa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9215 = new String[]{method4640(method4639("Z\u0000}\r\u0001\u0000")), method4640(method4639("Z\u0000}\r\u0003\u0000")), method4640(method4639("Z\u0000}\r\f\u0000")), method4640(method4639("F\u0014pO")), method4640(method4639("SO2\r9")), method4640(method4639("Z\u0000}\rxA\u000fuWz\u0000")), method4640(method4639("Z\u0000}\r/M\u0018HZ4M\u00054")), method4640(method4639("Z\u0000}\r\r\u0000")), method4640(method4639("Z\u0000}\r\u0007\u0000")), method4640(method4639("Z\u0000}\r/M\u0018LQ![\u0012yGl")), method4640(method4639("Z\u0000}\r\u000f\u0000")), method4640(method4639("Z\u0000}\r\u0002\u0000")), method4640(method4639("Z\u0000}\r\u0000\u0000")), method4640(method4639("Z\u0000}\r\u0005\u0000")), method4640(method4639("Z\u0000}\r\"G\u0002iP\u0003I\brF \u0000")), method4640(method4639("Z\u0000}\r/M\u0018NF(M\u0000oF \u0000")), method4640(method4639("Z\u0000}\r\"G\u0002iP\bG\u0012h\u000b")), method4640(method4639("Z\u0000}\r\u000e\u0000")), method4640(method4639("Z\u0000}\r\u0006\u0000"))};
   @OriginalMember(
      owner = "client!raa",
      name = "h",
      descriptor = "Z"
   )
   public static volatile boolean field9196 = false;
   @OriginalMember(
      owner = "client!raa",
      name = "q",
      descriptor = "Lhc;"
   )
   public static class150 field9204 = new class150();
   @OriginalMember(
      owner = "client!raa",
      name = "n",
      descriptor = "I"
   )
   public static int field9212 = 0;
   @OriginalMember(
      owner = "client!raa",
      name = "x",
      descriptor = "I"
   )
   public static int field9192;
   @OriginalMember(
      owner = "client!raa",
      name = "w",
      descriptor = "I"
   )
   public static int field9193;
   @OriginalMember(
      owner = "client!raa",
      name = "o",
      descriptor = "I"
   )
   public static int field9195;
   @OriginalMember(
      owner = "client!raa",
      name = "v",
      descriptor = "I"
   )
   public static int field9197;
   @OriginalMember(
      owner = "client!raa",
      name = "u",
      descriptor = "I"
   )
   public static int field9198;
   @OriginalMember(
      owner = "client!raa",
      name = "D",
      descriptor = "I"
   )
   public static int field9199;
   @OriginalMember(
      owner = "client!raa",
      name = "k",
      descriptor = "I"
   )
   public static int field9201;
   @OriginalMember(
      owner = "client!raa",
      name = "E",
      descriptor = "I"
   )
   public static int field9202;
   @OriginalMember(
      owner = "client!raa",
      name = "C",
      descriptor = "I"
   )
   public static int field9203;
   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "I"
   )
   public static int field9205;
   @OriginalMember(
      owner = "client!raa",
      name = "m",
      descriptor = "I"
   )
   public static int field9206;
   @OriginalMember(
      owner = "client!raa",
      name = "y",
      descriptor = "I"
   )
   public static int field9207;
   @OriginalMember(
      owner = "client!raa",
      name = "j",
      descriptor = "I"
   )
   public static int field9208;
   @OriginalMember(
      owner = "client!raa",
      name = "r",
      descriptor = "I"
   )
   public static int field9209;
   @OriginalMember(
      owner = "client!raa",
      name = "t",
      descriptor = "I"
   )
   public static int field9210;
   @OriginalMember(
      owner = "client!raa",
      name = "A",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field9214;
   @OriginalMember(
      owner = "client!raa",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field9200;

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2916(boolean arg0) {
      try {
         if (arg0) {
            field9200 = null;
         }

         ++field9207;
         this.method4636(11474);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Z)Lgg;"
   )
   public final class184 method2914(boolean arg0) {
      try {
         if (arg0) {
            this.field9213 = null;
         }

         ++field9205;
         return (class184)this.field9194.method2577(true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IIIC)V"
   )
   private final void method4632(int arg0, int arg1, int arg2, char arg3) {
      try {
         ++field9208;
         class782 var5 = new class782();
         var5.field11448 = arg3;
         var5.field11443 = arg2;
         var5.field11441 = arg0;
         var5.field11450 = class57.method650(100);
         if (arg1 < 14) {
            this.method2920(false);
         }

         this.field9211.method2585(var5, -60);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9215[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4633(int arg0, int arg1) {
      try {
         ++field9197;
         if (arg0 != -9543) {
            field9196 = true;
         }

         class536 var2 = class108.method1038((long)arg1, arg0 ^ -9588, 6);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9215[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(ILjava/awt/event/KeyEvent;I)V"
   )
   private final void method4634(int arg0, KeyEvent arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         int var5;
         label50: {
            ++field9198;
            var5 = arg1.getKeyCode();
            if (~var5 == arg0) {
               var5 = 0;
               if (!var4) {
                  break label50;
               }
            }

            if (~var5 <= -1 && class791.field11565.length > var5) {
               var5 = class791.field11565[var5];
               if (arg2 == 0 && ~(128 & var5) != -1) {
                  var5 = 0;
                  if (!var4) {
                     break label50;
                  }
               }

               var5 &= -129;
               if (!var4) {
                  break label50;
               }
            }

            var5 = 0;
         }

         if (~var5 != -1) {
            this.method4632(var5, 64, arg2, '\u0000');
            arg1.consume();
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9215[12] + arg0 + ',' + (arg1 != null ? field9215[4] : field9215[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method2913(int arg0, byte arg1) {
      try {
         if (arg1 > -57) {
            this.method4637((Component)null, -34);
         }

         ++field9203;
         return ~arg0 <= -1 && arg0 < 112 ? this.field9213[arg0] : false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9215[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "(I)I"
   )
   private final int method4635(int arg0) {
      try {
         if (arg0 <= 80) {
            this.field9214 = null;
         }

         ++field9192;
         int var2 = 0;
         if (this.field9213[81]) {
            var2 |= 1;
         }

         if (this.field9213[82]) {
            var2 |= 4;
         }

         if (this.field9213[86]) {
            var2 |= 2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9215[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field9210;
         char var2 = arg0.getKeyChar();
         if (var2 != 0 && class330.method2562(var2, true)) {
            this.method4632(-1, 107, 3, var2);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9215[6] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4636(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field9201;
         if (this.field9214 != null) {
            this.field9214.removeKeyListener(this);
            this.field9214.removeFocusListener(this);
            this.field9214 = null;
            int var3 = 0;
            if (var2) {
               this.field9213[var3] = false;
               ++var3;
            }

            while(true) {
               while(var3 < 112) {
                  this.field9213[var3] = false;
                  ++var3;
               }

               this.field9194.method2580((byte)-4);
               this.field9211.method2580((byte)-4);
               if (!var2) {
                  if (arg0 != 11474) {
                     this.focusLost((FocusEvent)null);
                     return;
                  }

                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9215[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         ++field9209;
         this.method4632(0, 38, -1, '\u0000');
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[16] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field9195;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[14] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method4637(Component arg0, int arg1) {
      try {
         if (arg1 == 0) {
            ++field9193;
            this.method4636(arg1 ^ 11474);
            this.field9214 = arg0;
            Method var3 = class651.field9435;
            if (var3 != null) {
               try {
                  var3.invoke(this.field9214, Boolean.FALSE);
               } catch (Throwable var5) {
               }
            }

            this.field9214.addKeyListener(this);
            this.field9214.addFocusListener(this);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9215[18] + (arg0 != null ? field9215[4] : field9215[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         ++field9199;
         this.method4634(-1, arg0, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[9] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "(Z)V"
   )
   public final synchronized void method2920(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4638(int arg0) {
      try {
         field9200 = null;
         field9204 = null;
         if (arg0 != 128) {
            method4633(122, -68);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9215[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         ++field9206;
         this.method4634(-1, arg0, 1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[15] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class631(Component arg0) {
      try {
         class501.method3764(43);
         this.method4637(arg0, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9215[5] + (arg0 != null ? field9215[4] : field9215[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
