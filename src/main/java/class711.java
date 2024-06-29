import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class711 extends class638 implements KeyListener, FocusListener {
   @OriginalMember(
      owner = "client!dk",
      name = "x",
      descriptor = "Lsb;"
   )
   private class261 field10205 = new class261();
   @OriginalMember(
      owner = "client!dk",
      name = "n",
      descriptor = "Lsb;"
   )
   private class261 field10214 = new class261();
   @OriginalMember(
      owner = "client!dk",
      name = "i",
      descriptor = "[Z"
   )
   private boolean[] field10216 = new boolean[112];
   @OriginalMember(
      owner = "client!dk",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10219 = new String[]{method5174(method5173("XMmv")), method5174(method5173("M\u0016/4c")), method5174(method5173("RS/Q6")), method5174(method5173("RS/_6")), method5174(method5173("RS/V6")), method5174(method5173("RS/R6")), method5174(method5173("RS/q{Ojdv{WKd~6")), method5174(method5173("RS/q{Olxj{R\u0010")), method5174(method5173("RS/\\6")), method5174(method5173("RS/[6")), method5174(method5173("RS/|qUMr]\u007f_Vd~6")), method5174(method5173("RS/|qUMrVqEL)")), method5174(method5173("RS/&wXQu$6")), method5174(method5173("RS/S6")), method5174(method5173("RS/]6")), method5174(method5173("Y]`")), method5174(method5173("QZ`")), method5174(method5173("RS/Y6")), method5174(method5173("RS/^6")), method5174(method5173("RS/q{Ohs\u007fmE]e2")), method5174(method5173("RS/X6")), method5174(method5173("RS/P6"))};
   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "Lfm;"
   )
   public static class164 field10203 = new class164(4, 6);
   @OriginalMember(
      owner = "client!dk",
      name = "h",
      descriptor = "I"
   )
   public static int field10211 = 0;
   @OriginalMember(
      owner = "client!dk",
      name = "s",
      descriptor = "I"
   )
   public static int field10194;
   @OriginalMember(
      owner = "client!dk",
      name = "g",
      descriptor = "I"
   )
   public static int field10195;
   @OriginalMember(
      owner = "client!dk",
      name = "f",
      descriptor = "I"
   )
   public static int field10196;
   @OriginalMember(
      owner = "client!dk",
      name = "k",
      descriptor = "I"
   )
   public static int field10197;
   @OriginalMember(
      owner = "client!dk",
      name = "p",
      descriptor = "I"
   )
   public static int field10198;
   @OriginalMember(
      owner = "client!dk",
      name = "q",
      descriptor = "I"
   )
   public static int field10199;
   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "I"
   )
   public static int field10200;
   @OriginalMember(
      owner = "client!dk",
      name = "l",
      descriptor = "I"
   )
   public static int field10201;
   @OriginalMember(
      owner = "client!dk",
      name = "w",
      descriptor = "I"
   )
   public static int field10202;
   @OriginalMember(
      owner = "client!dk",
      name = "j",
      descriptor = "I"
   )
   public static int field10204;
   @OriginalMember(
      owner = "client!dk",
      name = "o",
      descriptor = "I"
   )
   public static int field10206;
   @OriginalMember(
      owner = "client!dk",
      name = "r",
      descriptor = "I"
   )
   public static int field10207;
   @OriginalMember(
      owner = "client!dk",
      name = "A",
      descriptor = "I"
   )
   public static int field10208;
   @OriginalMember(
      owner = "client!dk",
      name = "v",
      descriptor = "I"
   )
   public static int field10209;
   @OriginalMember(
      owner = "client!dk",
      name = "t",
      descriptor = "I"
   )
   public static int field10210;
   @OriginalMember(
      owner = "client!dk",
      name = "m",
      descriptor = "I"
   )
   public static int field10212;
   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "I"
   )
   public static int field10213;
   @OriginalMember(
      owner = "client!dk",
      name = "y",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field10215;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dk",
      name = "u",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10217;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10218;

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method5164(byte arg0) {
      try {
         ++field10201;
         int var1 = 0;
         Field[] var2 = (field10217 != null ? field10217 : (field10217 = method5172(field10219[15]))).getDeclaredFields();
         Field[] var3 = var2;
         int var4 = 0;
         if (arg0 != -19) {
            return 50;
         } else {
            while(var3.length > var4) {
               Field var5 = var3[var4];
               if ((field10218 != null ? field10218 : (field10218 = method5172(field10219[16]))).isAssignableFrom(var5.getType())) {
                  ++var1;
               }

               ++var4;
            }

            return var1 + 1;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10219[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4652(int arg0) {
      try {
         ++field10207;
         this.method5166(49);
         if (arg0 != -23729) {
            this.method5171((Component)null, -13);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(CBII)V"
   )
   private final void method5165(char arg0, byte arg1, int arg2, int arg3) {
      try {
         int var5 = 43 / ((-31 - arg1) / 44);
         ++field10209;
         class734 var6 = new class734();
         var6.field10428 = arg2;
         var6.field10432 = arg3;
         var6.field10425 = arg0;
         var6.field10437 = class604.method4452(-113);
         this.field10214.method2238(var6, 13);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10219[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method4654(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method5166(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dk",
      name = "keyTyped",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyTyped(KeyEvent arg0) {
      try {
         ++field10197;
         char var2 = arg0.getKeyChar();
         if (~var2 != -1 && class135.method1375(84, var2)) {
            this.method5165(var2, (byte)48, 3, -1);
            arg0.consume();
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10219[7] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field10198;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[10] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "keyReleased",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyReleased(KeyEvent arg0) {
      try {
         ++field10202;
         this.method5170(1, 0, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[6] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method4653(int arg0, byte arg1) {
      try {
         ++field10204;
         if (~arg0 <= -1 && arg0 < 112) {
            if (arg1 != -106) {
               this.field10205 = null;
            }

            return this.field10216[arg0];
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10219[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method5167(byte arg0) {
      try {
         ++field10199;
         if (arg0 > -116) {
            field10211 = 19;
         }

         int var2 = 0;
         if (this.field10216[81]) {
            var2 |= 1;
         }

         if (this.field10216[82]) {
            var2 |= 4;
         }

         if (this.field10216[86]) {
            var2 |= 2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10219[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5168(int arg0) {
      try {
         if (arg0 != 24571) {
            method5169((byte)-15);
         }

         field10203 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10219[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5169(byte arg0) {
      try {
         ++field10195;
         int var1 = 60 % ((66 - arg0) / 43);
         if (class19.method266(1)) {
            if (class359.field5307 == null) {
               class588.method4317(false);
            }

            class709.field10189 = true;
            class7.field125 = 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IILjava/awt/event/KeyEvent;)V"
   )
   private final void method5170(int arg0, int arg1, KeyEvent arg2) {
      boolean var4 = client.field10022;

      try {
         int var5;
         label46: {
            ++field10200;
            var5 = arg2.getKeyCode();
            if (arg1 != var5) {
               if (var5 < 0 || var5 >= class88.field1314.length) {
                  var5 = 0;
                  if (!var4) {
                     break label46;
                  }
               }

               var5 = class88.field1314[var5];
               if (arg0 == 0 && ~(var5 & 128) != -1) {
                  var5 = 0;
                  if (!var4) {
                     break label46;
                  }
               }

               var5 &= -129;
               if (!var4) {
                  break label46;
               }
            }

            var5 = 0;
         }

         if (var5 != 0) {
            this.method5165('\u0000', (byte)-106, arg0, var5);
            arg2.consume();
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10219[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Ljava/awt/Component;I)V"
   )
   private final void method5171(Component arg0, int arg1) {
      try {
         this.method5166(45);
         ++field10210;
         if (arg1 != 0) {
            method5168(-115);
         }

         this.field10215 = arg0;
         Method var3 = class82.field1273;
         if (var3 != null) {
            try {
               var3.invoke(this.field10215, Boolean.FALSE);
            } catch (Throwable var5) {
            }
         }

         this.field10215.addKeyListener(this);
         this.field10215.addFocusListener(this);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10219[21] + (arg0 != null ? field10219[1] : field10219[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V"
   )
   public final synchronized void focusLost(FocusEvent arg0) {
      try {
         this.method5165('\u0000', (byte)-93, -1, 0);
         ++field10213;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[11] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "keyPressed",
      descriptor = "(Ljava/awt/event/KeyEvent;)V"
   )
   public final synchronized void keyPressed(KeyEvent arg0) {
      try {
         this.method5170(0, 0, arg0);
         ++field10212;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[19] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(I)Lkca;"
   )
   public final class12 method4655(int arg0) {
      try {
         ++field10194;
         if (arg0 != -25388) {
            this.method4655(107);
         }

         return (class12)this.field10205.method2235(-41);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class711(Component arg0) {
      try {
         class749.method5390(21879);
         this.method5171(arg0, 0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10219[12] + (arg0 != null ? field10219[1] : field10219[0]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5172(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5173(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5174(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
