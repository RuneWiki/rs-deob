import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class728 extends class228 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!dq",
      name = "f",
      descriptor = "Lll;"
   )
   private class387 field10666 = new class387();
   @OriginalMember(
      owner = "client!dq",
      name = "y",
      descriptor = "Lll;"
   )
   private class387 field10669 = new class387();
   @OriginalMember(
      owner = "client!dq",
      name = "k",
      descriptor = "[Z"
   )
   private boolean[] field10673 = new boolean[112];
   @OriginalMember(
      owner = "client!dq",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10675 = new String[]{method5314(method5313("A\u000bV\r")), method5314(method5313("TP\u0014OY")), method5314(method5313("K\u000f\u0014\nAV*C\u0011AKV")), method5314(method5313("K\u000f\u00141\f")), method5314(method5313("K\u000f\u0014(\f")), method5314(method5313("K\u000f\u0014]MA\u0017N_\f")), method5314(method5313("K\u000f\u0014-\f")), method5314(method5313("K\u000f\u0014.\f")), method5314(method5313("K\u000f\u0014/\f")), method5314(method5313("K\u000f\u0014+\f")), method5314(method5313("K\u000f\u0014 \f")), method5314(method5313("K\u000f\u0014*\f")), method5314(method5313("K\u000f\u0014,\f")), method5314(method5313("K\u000f\u0014\u0007KL\u000bI-K\\\n\u0012")), method5314(method5313("K\u000f\u0014\nAV,_\rAN\r_\u0005\f")), method5314(method5313("K\u000f\u0014\nAV.H\u0004W\\\u001b^I")), method5314(method5313("K\u000f\u0014\u0007KL\u000bI&EF\u0010_\u0005\f")), method5314(method5313("K\u000f\u0014\"\f")), method5314(method5313("K\u000f\u0014'\f")), method5314(method5313("K\u000f\u0014)\f"))};
   @OriginalMember(
      owner = "client!dq",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10670 = new int[1];
   @OriginalMember(
      owner = "client!dq",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field10671 = new int[25];
   @OriginalMember(
      owner = "client!dq",
      name = "u",
      descriptor = "F"
   )
   public static float field10672;
   @OriginalMember(
      owner = "client!dq",
      name = "x",
      descriptor = "I"
   )
   public static int field10652;
   @OriginalMember(
      owner = "client!dq",
      name = "A",
      descriptor = "I"
   )
   public static int field10653;
   @OriginalMember(
      owner = "client!dq",
      name = "B",
      descriptor = "I"
   )
   public static int field10654;
   @OriginalMember(
      owner = "client!dq",
      name = "t",
      descriptor = "I"
   )
   public static int field10655;
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "I"
   )
   public static int field10656;
   @OriginalMember(
      owner = "client!dq",
      name = "h",
      descriptor = "I"
   )
   public static int field10657;
   @OriginalMember(
      owner = "client!dq",
      name = "o",
      descriptor = "I"
   )
   public static int field10658;
   @OriginalMember(
      owner = "client!dq",
      name = "s",
      descriptor = "I"
   )
   public static int field10659;
   @OriginalMember(
      owner = "client!dq",
      name = "i",
      descriptor = "I"
   )
   public static int field10660;
   @OriginalMember(
      owner = "client!dq",
      name = "q",
      descriptor = "I"
   )
   public static int field10661;
   @OriginalMember(
      owner = "client!dq",
      name = "p",
      descriptor = "I"
   )
   public static int field10662;
   @OriginalMember(
      owner = "client!dq",
      name = "n",
      descriptor = "I"
   )
   public static int field10663;
   @OriginalMember(
      owner = "client!dq",
      name = "m",
      descriptor = "I"
   )
   public static int field10664;
   @OriginalMember(
      owner = "client!dq",
      name = "w",
      descriptor = "I"
   )
   public static int field10665;
   @OriginalMember(
      owner = "client!dq",
      name = "v",
      descriptor = "I"
   )
   public static int field10667;
   @OriginalMember(
      owner = "client!dq",
      name = "r",
      descriptor = "I"
   )
   public static int field10668;
   @OriginalMember(
      owner = "client!dq",
      name = "j",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field10674;

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Lns;I)I",
      line = 5
   )
   public static final int method5305(class427 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            field10672 = 1.3855358F;
         }

         ++field10655;
         if (class423.field6028 == arg0) {
            return 9216;
         } else if (class647.field9458 == arg0) {
            return 34065;
         } else if (class679.field10013 == arg0) {
            return 34066;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[8] + (arg0 != null ? field10675[1] : field10675[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "(I)I",
      line = 29
   )
   private final int method5306(int arg0) {
      try {
         ++field10663;
         int var2 = 0;
         if (this.field10673[81]) {
            var2 |= 1;
         }

         if (this.field10673[82]) {
            var2 |= 4;
         }

         if (arg0 != 1) {
            field10670 = null;
         }

         if (this.field10673[86]) {
            var2 |= 2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10675[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IILjava/awt/event/KeyEvent;)V",
      line = 52
   )
   private final void method5307(int arg0, int arg1, KeyEvent arg2) {
      boolean var4 = client.field4360;

      try {
         ++field10656;
         if (arg1 != 26083) {
            this.method5310((Component)null, (byte)-19);
         }

         int var7;
         label52: {
            int var5 = arg2.getKeyCode();
            if (var5 != 0) {
               if (~var5 <= -1 && ~class788.field11567.length < ~var5) {
                  int var6 = class788.field11567[var5];
                  if (arg0 != 0 || ~(128 & var6) == -1) {
                     var7 = var6 & -129;
                     if (!var4) {
                        break label52;
                     }
                  }

                  var7 = 0;
                  if (!var4) {
                     break label52;
                  }
               }

               var7 = 0;
               if (!var4) {
                  break label52;
               }
            }

            var7 = 0;
         }

         if (~var7 != -1) {
            this.method5308('\u0000', var7, arg0, (byte)89);
            arg2.consume();
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field10675[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 89
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         ++field10652;
         this.method5308('\u0000', 0, -1, (byte)-90);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[13] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 97
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         this.method5307(1, 26083, arg0);
         ++field10661;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[14] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(CIIB)V",
      line = 105
   )
   private final void method5308(char arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field10662;
         class782 var5 = new class782();
         var5.field11467 = arg0;
         int var6 = 37 / ((arg3 - -27) / 43);
         var5.field11459 = arg2;
         var5.field11469 = arg1;
         var5.field11460 = class133.method1054(-29025);
         this.field10669.method2930((byte)-69, var5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10675[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(II)Z",
      line = 124
   )
   public final boolean method1779(int arg0, int arg1) {
      try {
         ++field10653;
         if (arg1 != -101) {
            field10671 = null;
         }

         return ~arg0 <= -1 && arg0 < 112 ? this.field10673[arg0] : false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10675[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(I)Luv;",
      line = 142
   )
   public final class386 method1776(int arg0) {
      try {
         ++field10668;
         int var2 = -95 / ((-8 - arg0) / 33);
         return (class386)this.field10666.method2941(-14002);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10675[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "(B)V",
      line = 152
   )
   public static void method5309(byte arg0) {
      try {
         field10671 = null;
         if (arg0 >= 102) {
            field10670 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10675[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Ljava/awt/Component;B)V",
      line = 167
   )
   private final void method5310(Component arg0, byte arg1) {
      try {
         this.method5312(false);
         ++field10658;
         this.field10674 = arg0;
         if (arg1 != 47) {
            this.focusLost((FocusEvent)null);
         }

         Method var3 = class619.field9122;
         if (var3 != null) {
            try {
               var3.invoke(this.field10674, Boolean.FALSE);
            } catch (Throwable var5) {
            }
         }

         this.field10674.addKeyListener(this);
         this.field10674.addFocusListener(this);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10675[3] + (arg0 != null ? field10675[1] : field10675[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "(B)V",
      line = 193
   )
   public final synchronized void method1773(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10659;
         this.field10666.method2934(0);
         class782 var3 = (class782)this.field10669.method2941(-14002);
         int var10000;
         byte var10001;
         if (var2) {
            var3.field11466 = this.method5306(1);
            var10000 = ~var3.field11459;
            var10001 = -1;
         } else if (var3 == null) {
            var10000 = arg0;
            var10001 = 1;
            if (!var2) {
               if (arg0 <= 1) {
                  this.method5312(false);
                  return;
               }

               return;
            }
         } else {
            var3.field11466 = this.method5306(1);
            var10000 = ~var3.field11459;
            var10001 = -1;
         }

         while(true) {
            label100: {
               if (var10000 == var10001) {
                  if (!this.field10673[var3.field11469]) {
                     class782 var4 = new class782();
                     var4.field11469 = var3.field11469;
                     var4.field11459 = 0;
                     var4.field11466 = var3.field11466;
                     var4.field11460 = var3.field11460;
                     var4.field11467 = 0;
                     this.field10666.method2930((byte)-97, var4);
                     this.field10673[var3.field11469] = true;
                  }

                  var3.field11459 = 2;
                  this.field10666.method2930((byte)-102, var3);
                  if (!var2) {
                     break label100;
                  }
               }

               if (var3.field11459 == 1) {
                  if (!this.field10673[var3.field11469]) {
                     break label100;
                  }

                  this.field10666.method2930((byte)-52, var3);
                  this.field10673[var3.field11469] = false;
                  if (!var2) {
                     break label100;
                  }
               }

               if (~var3.field11459 != 0) {
                  if (~var3.field11459 != -4) {
                     break label100;
                  }

                  this.field10666.method2930((byte)-102, var3);
                  if (!var2) {
                     break label100;
                  }
               }

               int var5 = 0;
               if (var2 || ~var5 > -113) {
                  do {
                     if (this.field10673[var5]) {
                        class782 var6 = new class782();
                        var6.field11466 = var3.field11466;
                        var6.field11469 = var5;
                        var6.field11459 = 1;
                        var6.field11467 = 0;
                        var6.field11460 = var3.field11460;
                        this.field10666.method2930((byte)-81, var6);
                        this.field10673[var5] = false;
                     }

                     ++var5;
                  } while(~var5 > -113);
               }
            }

            var3 = (class782)this.field10669.method2941(-14002);
            if (var3 == null) {
               var10000 = arg0;
               var10001 = 1;
               if (!var2) {
                  if (arg0 <= 1) {
                     this.method5312(false);
                     return;
                  }

                  return;
               }
            } else {
               var3.field11466 = this.method5306(1);
               var10000 = ~var3.field11459;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10675[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 284
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field10657;
         char var2 = arg0.getKeyChar();
         if (var2 != 0 && class46.method390(2, var2)) {
            this.method5308(var2, -1, 3, (byte)-71);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10675[2] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Z)V",
      line = 300
   )
   public final void method1777(boolean arg0) {
      try {
         if (!arg0) {
            this.method5308('\u0000', -65, 15, (byte)-24);
         }

         this.method5312(false);
         ++field10665;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V",
      line = 429
   )
   public class728(Component arg0) {
      try {
         class303.method2252(-1);
         this.method5310(arg0, (byte)47);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[5] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V",
      line = 314
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         this.method5307(0, 26083, arg0);
         ++field10660;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[15] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "d",
      descriptor = "(I)V",
      line = 323
   )
   public static final void method5311(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dq",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 377
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field10654;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10675[16] + (arg0 != null ? field10675[1] : field10675[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "(Z)V",
      line = 386
   )
   private final void method5312(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10664;
         if (this.field10674 != null) {
            this.field10674.removeKeyListener(this);
            this.field10674.removeFocusListener(this);
            this.field10674 = null;
            int var3 = 0;
            if (var2) {
               this.field10673[var3] = false;
               ++var3;
            }

            while(true) {
               while(var3 < 112) {
                  this.field10673[var3] = false;
                  ++var3;
               }

               this.field10666.method2934(0);
               if (!var2) {
                  if (arg0) {
                     return;
                  }

                  this.field10669.method2934(0);
                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10675[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
