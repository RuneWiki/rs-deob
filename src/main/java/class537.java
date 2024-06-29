import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class537 extends class701 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!ek",
      name = "q",
      descriptor = "Lod;"
   )
   private class536 field7346 = new class536();
   @OriginalMember(
      owner = "client!ek",
      name = "s",
      descriptor = "Lod;"
   )
   private class536 field7351 = new class536();
   @OriginalMember(
      owner = "client!ek",
      name = "n",
      descriptor = "[Z"
   )
   private boolean[] field7353 = new boolean[112];
   @OriginalMember(
      owner = "client!ek",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7358 = new String[]{method3884(method3883("?\u0018\u0018\t>")), method3884(method3883("!]\u0018L&=bOW& \u001e")), method3884(method3883("*CZK")), method3884(method3883("!]\u0018ik")), method3884(method3883("!]\u0018A,'CE`\"-XSCk")), method3884(method3883("!]\u0018A,'CEk,7B\u001e")), method3884(method3883("!]\u0018L&=fDB07SR\u000f")), method3884(method3883("!]\u0018L&=dSK&%ESCk")), method3884(method3883("!]\u0018mk")), method3884(method3883("!]\u0018ck")), method3884(method3883("!]\u0018nk")), method3884(method3883("!]\u0018\u001b**_B\u0019k")), method3884(method3883("!]\u0018`k")), method3884(method3883("!]\u0018ok")), method3884(method3883("!]\u0018jk")), method3884(method3883("!]\u0018lk")), method3884(method3883("!]\u0018ak")), method3884(method3883("!]\u0018bk"))};
   @OriginalMember(
      owner = "client!ek",
      name = "w",
      descriptor = "[F"
   )
   public static float[] field7341 = new float[4];
   @OriginalMember(
      owner = "client!ek",
      name = "r",
      descriptor = "Lbga;"
   )
   public static class378 field7345 = new class378(131, 2);
   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "I"
   )
   public static int field7338;
   @OriginalMember(
      owner = "client!ek",
      name = "p",
      descriptor = "I"
   )
   public static int field7339;
   @OriginalMember(
      owner = "client!ek",
      name = "y",
      descriptor = "I"
   )
   public static int field7340;
   @OriginalMember(
      owner = "client!ek",
      name = "i",
      descriptor = "I"
   )
   public static int field7342;
   @OriginalMember(
      owner = "client!ek",
      name = "h",
      descriptor = "I"
   )
   public static int field7343;
   @OriginalMember(
      owner = "client!ek",
      name = "m",
      descriptor = "I"
   )
   public static int field7344;
   @OriginalMember(
      owner = "client!ek",
      name = "x",
      descriptor = "I"
   )
   public static int field7347;
   @OriginalMember(
      owner = "client!ek",
      name = "t",
      descriptor = "I"
   )
   public static int field7348;
   @OriginalMember(
      owner = "client!ek",
      name = "v",
      descriptor = "I"
   )
   public static int field7349;
   @OriginalMember(
      owner = "client!ek",
      name = "A",
      descriptor = "I"
   )
   public static int field7350;
   @OriginalMember(
      owner = "client!ek",
      name = "k",
      descriptor = "I"
   )
   public static int field7352;
   @OriginalMember(
      owner = "client!ek",
      name = "l",
      descriptor = "I"
   )
   public static int field7354;
   @OriginalMember(
      owner = "client!ek",
      name = "u",
      descriptor = "I"
   )
   public static int field7356;
   @OriginalMember(
      owner = "client!ek",
      name = "j",
      descriptor = "I"
   )
   public static int field7357;
   @OriginalMember(
      owner = "client!ek",
      name = "o",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field7355;

   @OriginalMember(
      owner = "client!ek",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         this.method3877(arg0, 0, (byte)-96);
         ++field7339;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[6] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3872(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      if (var3 != null) {
         class726.method5282(var3.field2820);
         if (var3.field2820 != null) {
            var3.field2820 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method3873(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(B)Ldja;"
   )
   public final class326 method3874(byte arg0) {
      try {
         if (arg0 != 80) {
            this.method3877((KeyEvent)null, 97, (byte)66);
         }

         ++field7350;
         return (class326)this.field7346.method3869((byte)93);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3875(int arg0) {
      try {
         this.method3879((byte)115);
         if (arg0 != 1) {
            this.keyPressed((KeyEvent)null);
         }

         ++field7347;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         ++field7343;
         this.method3881(0, '\u0000', -18920, -1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[5] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method3876(int arg0, int arg1) {
      try {
         int var3 = -24 % ((79 - arg0) / 42);
         ++field7338;
         return arg1 >= 0 && ~arg1 > -113 ? this.field7353[arg1] : false;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7358[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         ++field7348;
         this.method3877(arg0, 1, (byte)126);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[7] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Ljava/awt/event/KeyEvent;IB)V"
   )
   private final void method3877(KeyEvent arg0, int arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         int var6;
         label52: {
            ++field7357;
            int var5 = -116 % ((arg2 - -15) / 41);
            var6 = arg0.getKeyCode();
            if (~var6 == -1) {
               var6 = 0;
               if (!var4) {
                  break label52;
               }
            }

            if (~var6 <= -1 && var6 < class720.field10540.length) {
               int var7 = class720.field10540[var6];
               if (arg1 != 0 || (var7 & 128) == 0) {
                  var6 = var7 & -129;
                  if (!var4) {
                     break label52;
                  }
               }

               var6 = 0;
               if (!var4) {
                  break label52;
               }
            }

            var6 = 0;
         }

         if (~var6 != -1) {
            this.method3881(var6, '\u0000', -18920, arg1);
            arg0.consume();
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7358[15] + (arg0 != null ? field7358[0] : field7358[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field7342;
         char var2 = arg0.getKeyChar();
         if (~var2 != -1 && class345.method2729(true, var2)) {
            this.method3881(-1, var2, -18920, 3);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7358[1] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "d",
      descriptor = "(I)I"
   )
   private final int method3878(int arg0) {
      try {
         ++field7356;
         int var2 = 0;
         if (this.field7353[81]) {
            var2 |= 1;
         }

         if (this.field7353[82]) {
            var2 |= 4;
         }

         if (this.field7353[86]) {
            var2 |= 2;
         }

         if (arg0 > -126) {
            this.field7355 = null;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7358[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method3879(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ek",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field7354;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[4] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V"
   )
   private final void method3880(int arg0, Component arg1) {
      try {
         ++field7344;
         this.method3879((byte)115);
         this.field7355 = arg1;
         Method var3 = class255.field3239;
         if (arg0 > -91) {
            this.method3881(-71, (char)65480, -21, -101);
         }

         if (var3 != null) {
            try {
               var3.invoke(this.field7355, Boolean.FALSE);
            } catch (Throwable var5) {
            }
         }

         this.field7355.addKeyListener(this);
         this.field7355.addFocusListener(this);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7358[3] + arg0 + ',' + (arg1 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(ICII)V"
   )
   private final void method3881(int arg0, char arg1, int arg2, int arg3) {
      try {
         ++field7352;
         class413 var5 = new class413();
         var5.field5815 = arg3;
         if (arg2 != -18920) {
            field7345 = null;
         }

         var5.field5804 = arg0;
         var5.field5808 = arg1;
         var5.field5813 = class792.method5708(-25005);
         this.field7351.method3859(2, var5);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7358[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3882(int arg0) {
      try {
         field7341 = null;
         field7345 = null;
         if (arg0 != 0) {
            field7345 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7358[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class537(Component arg0) {
      try {
         class700.method5083(29);
         this.method3880(-92, arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7358[11] + (arg0 != null ? field7358[0] : field7358[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3883(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3884(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
