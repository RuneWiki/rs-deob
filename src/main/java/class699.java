import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class class699 extends Applet implements Runnable, FocusListener, WindowListener {
   @OriginalMember(
      owner = "client!bea",
      name = "p",
      descriptor = "Z"
   )
   private boolean field10410 = false;
   @OriginalMember(
      owner = "client!bea",
      name = "f",
      descriptor = "Z"
   )
   private boolean field10395 = false;
   @OriginalMember(
      owner = "client!bea",
      name = "db",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10436 = new String[]{method5154(method5153("#0Z\f2$!zR%-0Oa:/!^Z!i")), method5154(method5153("+4\\V=$:IC")), method5154(method5153("#0Z\f\u001f\u0000}")), method5154(method5153("/ WN")), method5154(method5153(":{\u0015\f(")), method5154(method5153("#0Z\f2$!kC' 8^V03}")), method5154(method5153("#0Z\f\"(;_M\"\u00050RA:/<]K0%}")), method5154(method5153("#0Z\f\u0003i")), method5154(method5153("#0Z\f\u0018\u0000}")), method5154(method5153("+4\\O<26")), method5154(method5153("#0Z\f\"(;_M\"\u00029TQ</2\u0013")), method5154(method5153("#0Z\f&54IV}")), method5154(method5153("#0Z\f\u001d\u0000}")), method5154(method5153("\u000b4\\G-")), method5154(method5153("#0Z\f\u001b\u0000}")), method5154(method5153("#0Z\f'4;\u0013")), method5154(method5153("p{\t")), method5154(method5153("p{\u000f\fg")), method5154(method5153("\"'ZQ=")), method5154(method5153("p{\n")), method5154(method5153("p{\t\f")), method5154(method5153("2 U")), method5154(method5153("p{\n\f")), method5154(method5153("(7V")), method5154(method5153("6'TL2+4MC")), method5154(method5153(" %KN0")), method5154(method5153("p{")), method5154(method5153("-:\\E0%:NV")), method5154(method5153("$'IM'\u001e2ZO0\u001e")), method5154(method5153("o\"H")), method5154(method5153("\u001e!TR")), method5154(method5153("#0Z\f\u0019\u0000}")), method5154(method5153("#0Z\f 11ZV0i")), method5154(method5153("#0Z\f\"(;_M\"\u00050ZA!(#ZV0%}")), method5154(method5153("#0Z\f1$&OP:8}")), method5154(method5153("#0Z\f% <UV}")), method5154(method5153("#0Z\f\"(;_M\"\u000e%^L0%}")), method5154(method5153("#0Z\f\u001a\u0000}")), method5154(method5153("+4XN<#")), method5154(method5153("#0Z\f\"(;_M\"\u00006OK# !^F}")), method5154(method5153("pl\t\fdwm\u0015\u0013{")), method5154(method5153("+4\\G-o6TO")), method5154(method5153("2!^N9 '_C\"/{XM8")), method5154(method5153("#0Z\f\u001e\u0000}")), method5154(method5153("3 UG&\"4KG{\":V")), method5154(method5153("o'NL026ZR0o6TO")), method5154(method5153("o?ZE09{XM8")), method5154(method5153("(;MC9(1SM&5")), method5154(method5153("pg\f\feoe\u0015\u0013")), method5154(method5153("o&OG9-4IF46;\u0015A:,")), method5154(method5153("\u001e&^N3")), method5154(method5153(" 9IG4%,WM4%0_")), method5154(method5153("#0Z\f\u0005\u0000}")), method5154(method5153("#0Z\f2$!\u007fM648^L!\u00034HG}")), method5154(method5153("#0Z\f\u0012\u0000}")), method5154(method5153("\u0012=NV1.\"U\u00026.8KN050\u001b\u000fu\"9^C;{")), method5154(method5153("\u0012=NV1.\"U\u0002&54IVuluXN0 ;\u0001")), method5154(method5153("#0Z\f\u001bi")), method5154(method5153("#0Z\f&5:K\n")), method5154(method5153("#0Z\f%3:MK1$\u0019TC1$'zR%-0O\n")), method5154(method5153("#0Z\f3.6NQ\u0019.&O\n")), method5154(method5153("#0Z\f\"(;_M\"\u00029TQ0%}")), method5154(method5153("#0Z\f\"(;_M\"\b6TL<'<^F}")), method5154(method5153("#0Z\f\u0013\u0000}")), method5154(method5153("#0Z\f3.6NQ\u0012 <UG1i"))};
   @OriginalMember(
      owner = "client!bea",
      name = "w",
      descriptor = "F"
   )
   public static float field10389;
   @OriginalMember(
      owner = "client!bea",
      name = "cb",
      descriptor = "I"
   )
   public static int field10381;
   @OriginalMember(
      owner = "client!bea",
      name = "O",
      descriptor = "I"
   )
   public static int field10382;
   @OriginalMember(
      owner = "client!bea",
      name = "g",
      descriptor = "I"
   )
   public static int field10383;
   @OriginalMember(
      owner = "client!bea",
      name = "d",
      descriptor = "I"
   )
   public static int field10384;
   @OriginalMember(
      owner = "client!bea",
      name = "o",
      descriptor = "I"
   )
   public static int field10385;
   @OriginalMember(
      owner = "client!bea",
      name = "k",
      descriptor = "I"
   )
   public static int field10386;
   @OriginalMember(
      owner = "client!bea",
      name = "D",
      descriptor = "I"
   )
   public static int field10387;
   @OriginalMember(
      owner = "client!bea",
      name = "ab",
      descriptor = "I"
   )
   public static int field10388;
   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "I"
   )
   public static int field10390;
   @OriginalMember(
      owner = "client!bea",
      name = "C",
      descriptor = "I"
   )
   public static int field10391;
   @OriginalMember(
      owner = "client!bea",
      name = "j",
      descriptor = "I"
   )
   public static int field10392;
   @OriginalMember(
      owner = "client!bea",
      name = "W",
      descriptor = "I"
   )
   public static int field10393;
   @OriginalMember(
      owner = "client!bea",
      name = "x",
      descriptor = "I"
   )
   public static int field10394;
   @OriginalMember(
      owner = "client!bea",
      name = "E",
      descriptor = "I"
   )
   public static int field10396;
   @OriginalMember(
      owner = "client!bea",
      name = "T",
      descriptor = "I"
   )
   public static int field10397;
   @OriginalMember(
      owner = "client!bea",
      name = "e",
      descriptor = "I"
   )
   public static int field10398;
   @OriginalMember(
      owner = "client!bea",
      name = "Y",
      descriptor = "I"
   )
   public static int field10399;
   @OriginalMember(
      owner = "client!bea",
      name = "M",
      descriptor = "I"
   )
   public static int field10400;
   @OriginalMember(
      owner = "client!bea",
      name = "n",
      descriptor = "I"
   )
   public static int field10401;
   @OriginalMember(
      owner = "client!bea",
      name = "A",
      descriptor = "I"
   )
   public static int field10402;
   @OriginalMember(
      owner = "client!bea",
      name = "Q",
      descriptor = "I"
   )
   public static int field10403;
   @OriginalMember(
      owner = "client!bea",
      name = "U",
      descriptor = "I"
   )
   public static int field10404;
   @OriginalMember(
      owner = "client!bea",
      name = "i",
      descriptor = "I"
   )
   public static int field10405;
   @OriginalMember(
      owner = "client!bea",
      name = "P",
      descriptor = "I"
   )
   public static int field10406;
   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "I"
   )
   public static int field10407;
   @OriginalMember(
      owner = "client!bea",
      name = "s",
      descriptor = "I"
   )
   public static int field10408;
   @OriginalMember(
      owner = "client!bea",
      name = "L",
      descriptor = "I"
   )
   public static int field10409;
   @OriginalMember(
      owner = "client!bea",
      name = "bb",
      descriptor = "I"
   )
   public static int field10411;
   @OriginalMember(
      owner = "client!bea",
      name = "h",
      descriptor = "I"
   )
   public static int field10412;
   @OriginalMember(
      owner = "client!bea",
      name = "r",
      descriptor = "I"
   )
   public static int field10413;
   @OriginalMember(
      owner = "client!bea",
      name = "u",
      descriptor = "I"
   )
   public static int field10414;
   @OriginalMember(
      owner = "client!bea",
      name = "R",
      descriptor = "I"
   )
   public static int field10415;
   @OriginalMember(
      owner = "client!bea",
      name = "t",
      descriptor = "I"
   )
   public static int field10416;
   @OriginalMember(
      owner = "client!bea",
      name = "S",
      descriptor = "I"
   )
   public static int field10418;
   @OriginalMember(
      owner = "client!bea",
      name = "J",
      descriptor = "I"
   )
   public static int field10424;
   @OriginalMember(
      owner = "client!bea",
      name = "G",
      descriptor = "I"
   )
   public static int field10426;
   @OriginalMember(
      owner = "client!bea",
      name = "I",
      descriptor = "I"
   )
   public static int field10429;
   @OriginalMember(
      owner = "client!bea",
      name = "K",
      descriptor = "I"
   )
   public static int field10431;
   @OriginalMember(
      owner = "client!bea",
      name = "N",
      descriptor = "I"
   )
   public static int field10433;
   @OriginalMember(
      owner = "client!bea",
      name = "V",
      descriptor = "I"
   )
   public static int field10434;
   @OriginalMember(
      owner = "client!bea",
      name = "X",
      descriptor = "Z"
   )
   public static boolean field10417;
   @OriginalMember(
      owner = "client!bea",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field10419;
   @OriginalMember(
      owner = "client!bea",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field10420;
   @OriginalMember(
      owner = "client!bea",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field10421;
   @OriginalMember(
      owner = "client!bea",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10422;
   @OriginalMember(
      owner = "client!bea",
      name = "Z",
      descriptor = "Z"
   )
   public static boolean field10423;
   @OriginalMember(
      owner = "client!bea",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field10425;
   @OriginalMember(
      owner = "client!bea",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field10427;
   @OriginalMember(
      owner = "client!bea",
      name = "H",
      descriptor = "Z"
   )
   public static boolean field10428;
   @OriginalMember(
      owner = "client!bea",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field10430;
   @OriginalMember(
      owner = "client!bea",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field10432;
   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field10435;

   @OriginalMember(
      owner = "client!bea",
      name = "windowClosing",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 3
   )
   public final void windowClosing(WindowEvent arg0) {
      try {
         ++field10398;
         this.destroy();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[10] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Z)Z",
      line = 12
   )
   public final boolean method5142(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         ++field10413;
         String var3 = this.getDocumentBase().getHost().toLowerCase();
         if (!var3.equals(field10436[41]) && !var3.endsWith(field10436[46])) {
            if (!var3.equals(field10436[44]) && !var3.endsWith(field10436[45])) {
               if (!var3.equals(field10436[42]) && !var3.endsWith(field10436[49])) {
                  if (var3.endsWith(field10436[48])) {
                     return true;
                  } else {
                     char var10000;
                     byte var10001;
                     while(true) {
                        if (var3.length() > 0) {
                           var10000 = var3.charAt(-1 + var3.length());
                           var10001 = 48;
                           if (var2) {
                              break;
                           }

                           if (var10000 >= '0' && ~var3.charAt(var3.length() - 1) >= -58) {
                              var3 = var3.substring(0, -1 + var3.length());
                              continue;
                           }
                        }

                        if (var3.endsWith(field10436[40])) {
                           return true;
                        }

                        var10000 = (char)arg0;
                        var10001 = 1;
                        break;
                     }

                     if (var10000 != var10001) {
                        return true;
                     } else {
                        this.method5148(field10436[47], false);
                        return false;
                     }
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10436[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "destroy",
      descriptor = "()V",
      line = 54
   )
   public final void destroy() {
      try {
         ++field10394;
         if (class92.field1327 == this && !class427.field6586) {
            class133.field1890 = class162.method1442(14080);
            class697.method5128(5000L, 94);
            class502.field7669 = null;
            this.method5151(-125, false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "(I)V",
      line = 71
   )
   private final void method5143(int arg0) {
      try {
         if (arg0 >= 49) {
            ++field10408;
            long var2 = class162.method1442(14080);
            long var4 = class202.field3085[class183.field2883];
            class202.field3085[class183.field2883] = var2;
            if (~var4 != -1L && ~var2 < ~var4) {
               int var6 = (int)(-var4 + var2);
               class14.field178 = (32000 - -(var6 >> 1)) / var6;
            }

            class183.field2883 = 31 & class183.field2883 + 1;
            if (class106.field1469++ > 50) {
               label40: {
                  class106.field1469 -= 50;
                  class365.field5653 = true;
                  class544.field8183.setSize(class316.field4878, class692.field10301);
                  class544.field8183.setVisible(true);
                  if (class479.field7289 == null || class751.field11144 != null) {
                     class544.field8183.setLocation(class16.field213, class519.field7895);
                     if (!client.field1786) {
                        break label40;
                     }
                  }

                  Insets var7 = class479.field7289.getInsets();
                  class544.field8183.setLocation(class16.field213 + var7.left, var7.top - -class519.field7895);
               }
            }

            this.method1173(true);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10436[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "d",
      descriptor = "(I)Z",
      line = 114
   )
   public final boolean method5144(int arg0) {
      try {
         if (arg0 != 32000) {
            this.field10410 = true;
         }

         ++field10401;
         return class158.method1410((byte)-93, field10436[9]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(ILjava/lang/String;IIIBI)V",
      line = 127
   )
   public final void method5145(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field10386;

         try {
            if (class92.field1327 != null) {
               ++class222.field3342;
               if (~class222.field3342 <= -4) {
                  this.method5148(field10436[51], false);
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), field10436[50]);
               }
            } else {
               class316.field4878 = arg4;
               class155.field2322 = arg4;
               class692.field10301 = arg0;
               class145.field2067 = arg0;
               class92.field1327 = this;
               class16.field213 = 0;
               class113.field1549 = class684.field10176;
               class200.field3066 = arg3;
               class519.field7895 = 0;
               if (arg5 != 10) {
                  this.focusGained((FocusEvent)null);
               }

               class502.field7669 = class498.field7578 = new class289(arg2, arg1, arg6, class684.field10176 != null);
               class275 var9 = class498.field7578.method2442(this, false, 1);
               if (var8 || var9.field4398 == 0) {
                  do {
                     class697.method5128(10L, arg5 + 111);
                  } while(var9.field4398 == 0);

               }
            }
         } catch (Throwable var12) {
            class281.method2349(arg5 ^ 11, (String)null, var12);
            this.method5148(field10436[18], false);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10436[52] + arg0 + ',' + (arg1 != null ? field10436[4] : field10436[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowIconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 173
   )
   public final void windowIconified(WindowEvent arg0) {
      try {
         ++field10400;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[62] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowActivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 180
   )
   public final void windowActivated(WindowEvent arg0) {
      try {
         ++field10387;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[39] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Lbaa;)V",
      line = 189
   )
   public static final void method5146(class109 arg0) {
      class546.field8193.method600(arg0.field1505, arg0.field1495 + (arg0.method230(2) >> 1), arg0.field1494, class24.field305);
      arg0.field1507 = class24.field305[0];
      arg0.field1504 = class24.field305[1];
      arg0.field1498 = class24.field305[2];
   }

   @OriginalMember(
      owner = "client!bea",
      name = "focusLost",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 195
   )
   public final void focusLost(FocusEvent arg0) {
      try {
         ++field10390;
         class351.field5353 = false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[60] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "(B)Z",
      line = 203
   )
   public final boolean method5147(byte arg0) {
      try {
         ++field10411;
         if (arg0 != 48) {
            this.method1160((byte)-118);
         }

         return class158.method1410((byte)-93, field10436[38]);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "start",
      descriptor = "()V",
      line = 216
   )
   public final void start() {
      try {
         ++field10405;
         if (class92.field1327 == this && !class427.field6586) {
            class133.field1890 = 0L;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V",
      line = 228
   )
   public final void method5148(String arg0, boolean arg1) {
      try {
         ++field10384;
         if (!this.field10410) {
            this.field10410 = true;
            System.out.println(field10436[28] + arg0);
            if (arg1) {
               field10389 = -0.10852454F;
            }

            try {
               class676.method4989(class684.field10176, field10436[27], -23226);
            } catch (Throwable var5) {
            }

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), field10436[28] + arg0 + field10436[29]), field10436[30]);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10436[31] + (arg0 != null ? field10436[4] : field10436[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 256
   )
   public final synchronized void paint(Graphics arg0) {
      try {
         ++field10403;
         if (class92.field1327 == this && !class427.field6586) {
            class365.field5653 = true;
            if (class797.field11601 && ~(class162.method1442(14080) + -class242.field3680) < -1001L) {
               Rectangle var2 = arg0.getClipBounds();
               if (var2 == null || var2.width >= class155.field2322 && class145.field2067 <= var2.height) {
                  class136.field1990 = true;
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10436[35] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "getCodeBase",
      descriptor = "()Ljava/net/URL;",
      line = 279
   )
   public final URL getCodeBase() {
      ++field10412;
      if (class479.field7289 != null) {
         return null;
      } else {
         return class684.field10176 != null && class684.field10176 != this ? class684.field10176.getCodeBase() : super.getCodeBase();
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowOpened",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 295
   )
   public final void windowOpened(WindowEvent arg0) {
      try {
         ++field10388;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[36] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "getParameter",
      descriptor = "(Ljava/lang/String;)Ljava/lang/String;",
      line = 307
   )
   public final String getParameter(String arg0) {
      try {
         ++field10392;
         if (class479.field7289 != null) {
            return null;
         } else {
            return class684.field10176 != null && class684.field10176 != this ? class684.field10176.getParameter(arg0) : super.getParameter(arg0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[5] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "provideLoaderApplet",
      descriptor = "(Ljava/applet/Applet;)V",
      line = 322
   )
   public static final void provideLoaderApplet(Applet arg0) {
      try {
         ++field10416;
         class684.field10176 = arg0;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[59] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(I)Ljava/lang/String;",
      line = 342
   )
   public String method1151(int arg0) {
      try {
         if (arg0 != -17) {
            method5146((class109)null);
         }

         ++field10407;
         return null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "getDocumentBase",
      descriptor = "()Ljava/net/URL;",
      line = 355
   )
   public final URL getDocumentBase() {
      try {
         ++field10414;
         if (class479.field7289 != null) {
            return null;
         } else {
            return class684.field10176 != null && class684.field10176 != this ? class684.field10176.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[53] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "e",
      descriptor = "(I)V",
      line = 371
   )
   private final void method5149(int arg0) {
      try {
         ++field10399;
         long var2 = class162.method1442(arg0 + 14079);
         long var4 = class780.field11437[class706.field10633];
         class780.field11437[class706.field10633] = var2;
         boolean var10000;
         if (~var4 != -1L && var4 < var2) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         class706.field10633 = class706.field10633 + arg0 & 31;
         synchronized(this) {
            class263.field4328 = class351.field5353;
         }

         this.method1166(15);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10436[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "stop",
      descriptor = "()V",
      line = 399
   )
   public final void stop() {
      try {
         ++field10391;
         if (class92.field1327 == this && !class427.field6586) {
            class133.field1890 = 4000L + class162.method1442(14080);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IILjava/lang/String;IIIIZ)V",
      line = 410
   )
   public final void method5150(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      boolean var9 = client.field1786;

      try {
         try {
            class200.field3066 = arg0;
            class113.field1549 = null;
            class16.field213 = 0;
            class92.field1327 = this;
            class692.field10301 = arg1;
            class145.field2067 = arg1;
            class519.field7895 = 0;
            class316.field4878 = arg5;
            class155.field2322 = arg5;
            class479.field7289 = new Frame();
            class479.field7289.setTitle(field10436[13]);
            class479.field7289.setResizable(true);
            class479.field7289.addWindowListener(this);
            class479.field7289.setVisible(true);
            class479.field7289.toFront();
            Insets var10 = class479.field7289.getInsets();
            class479.field7289.setSize(class155.field2322 + var10.right - -var10.left, class145.field2067 + var10.top + var10.bottom);
            if (arg4 != 5000) {
               this.field10395 = true;
            }

            class502.field7669 = class498.field7578 = new class289(arg3, arg2, arg6, true);
            class275 var11 = class498.field7578.method2442(this, false, 1);
            if (var9) {
               class697.method5128(10L, arg4 ^ -5090);
            }

            while(~var11.field4398 == -1) {
               class697.method5128(10L, arg4 ^ -5090);
            }
         } catch (Exception var14) {
            class281.method2349(1, (String)null, var14);
         }

         ++field10409;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field10436[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10436[4] : field10436[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IZ)V",
      line = 454
   )
   private final void method5151(int arg0, boolean arg1) {
      try {
         ++field10383;
         synchronized(this) {
            if (class427.field6586) {
               return;
            }

            class427.field6586 = true;
         }

         System.out.println(field10436[56] + arg1);
         if (class684.field10176 != null) {
            class684.field10176.destroy();
         }

         try {
            this.method1149((byte)-124);
         } catch (Exception var10) {
         }

         if (this.field10395) {
            try {
               jagmisc.quit();
            } catch (Throwable var9) {
            }

            this.field10395 = false;
         }

         class613.method4515(false, true);
         class82.method796(-128);
         if (class544.field8183 != null) {
            try {
               class544.field8183.removeFocusListener(this);
               class544.field8183.getParent().remove(class544.field8183);
            } catch (Exception var8) {
            }
         }

         if (class498.field7578 != null) {
            try {
               class498.field7578.method2435(-21621);
            } catch (Exception var7) {
            }
         }

         this.method1160((byte)-24);
         if (class479.field7289 != null) {
            class479.field7289.setVisible(false);
            class479.field7289.dispose();
            class479.field7289 = null;
         }

         System.out.println(field10436[55] + arg1);
         if (arg0 > -108) {
            field10389 = 1.1462716F;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field10436[54] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "d",
      descriptor = "(B)V",
      line = 527
   )
   public synchronized void method1159(byte arg0) {
      boolean var2 = client.field1786;

      try {
         if (class544.field8183 != null) {
            class544.field8183.removeFocusListener(this);
            class544.field8183.getParent().setBackground(Color.black);
            class544.field8183.getParent().remove(class544.field8183);
         }

         Container var3;
         label51: {
            ++field10402;
            if (class751.field11144 != null) {
               var3 = class751.field11144;
               if (!var2) {
                  break label51;
               }
            }

            if (class479.field7289 != null) {
               var3 = class479.field7289;
               if (!var2) {
                  break label51;
               }
            }

            if (class684.field10176 == null) {
               var3 = class92.field1327;
               if (!var2) {
                  break label51;
               }
            }

            var3 = class684.field10176;
         }

         if (arg0 == -84) {
            label31: {
               var3.setLayout((LayoutManager)null);
               class544.field8183 = new class628(this);
               var3.add(class544.field8183);
               class544.field8183.setSize(class316.field4878, class692.field10301);
               class544.field8183.setVisible(true);
               if (class479.field7289 == var3) {
                  Insets var4 = class479.field7289.getInsets();
                  class544.field8183.setLocation(class16.field213 + var4.left, var4.top - -class519.field7895);
                  if (!var2) {
                     break label31;
                  }
               }

               class544.field8183.setLocation(class16.field213, class519.field7895);
            }

            class544.field8183.addFocusListener(this);
            class544.field8183.requestFocus();
            class263.field4328 = true;
            class351.field5353 = true;
            class365.field5653 = true;
            class136.field1990 = false;
            class242.field3680 = class162.method1442(arg0 ^ -14164);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10436[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowClosed",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 579
   )
   public final void windowClosed(WindowEvent arg0) {
      try {
         ++field10406;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[61] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowDeiconified",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 589
   )
   public final void windowDeiconified(WindowEvent arg0) {
      try {
         ++field10381;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[6] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "f",
      descriptor = "(I)Z",
      line = 601
   )
   public final boolean method5152(int arg0) {
      try {
         if (arg0 != -1) {
            return false;
         } else {
            ++field10396;
            return class158.method1410((byte)-93, field10436[1]);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "getAppletContext",
      descriptor = "()Ljava/applet/AppletContext;",
      line = 612
   )
   public final AppletContext getAppletContext() {
      try {
         ++field10415;
         if (class479.field7289 != null) {
            return null;
         } else {
            return class684.field10176 != null && class684.field10176 != this ? class684.field10176.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10436[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "focusGained",
      descriptor = "(Ljava/awt/event/FocusEvent;)V",
      line = 626
   )
   public final void focusGained(FocusEvent arg0) {
      try {
         ++field10382;
         class351.field5353 = true;
         class365.field5653 = true;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[64] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "windowDeactivated",
      descriptor = "(Ljava/awt/event/WindowEvent;)V",
      line = 638
   )
   public final void windowDeactivated(WindowEvent arg0) {
      try {
         ++field10404;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[33] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 653
   )
   public final void update(Graphics arg0) {
      try {
         ++field10385;
         this.paint(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10436[32] + (arg0 != null ? field10436[4] : field10436[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "run",
      descriptor = "()V",
      line = 673
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         ++field10393;

         try {
            if (class289.field4545 != null) {
               label509: {
                  String var2 = class289.field4545.toLowerCase();
                  if (var2.indexOf(field10436[21]) != -1 || var2.indexOf(field10436[25]) != -1) {
                     String var3 = class289.field4546;
                     if (!var3.equals(field10436[19]) && !var3.startsWith(field10436[22]) && !var3.equals(field10436[16]) && !var3.startsWith(field10436[20])) {
                        break label509;
                     }

                     this.method5148(field10436[24], false);
                     if (!var1) {
                        return;
                     }
                  }

                  if (~var2.indexOf(field10436[23]) != 0 && (class289.field4546 == null || class289.field4546.equals(field10436[17]))) {
                     this.method5148(field10436[24], false);
                     if (!var1) {
                        return;
                     }
                  }
               }
            }

            int var10000;
            if (class289.field4546 != null && class289.field4546.startsWith(field10436[26])) {
               label506: {
                  int var4 = 2;
                  int var5 = 0;
                  if (var1) {
                     var10000 = class289.field4546.charAt(var4);
                  } else if (~class289.field4546.length() >= ~var4) {
                     var10000 = var5;
                     if (!var1) {
                        if (var5 >= 5) {
                           class797.field11601 = true;
                        }
                        break label506;
                     }
                  } else {
                     var10000 = class289.field4546.charAt(var4);
                  }

                  label467:
                  while(true) {
                     while(true) {
                        int var6 = var10000;
                        if (var6 >= 48) {
                           if (~var6 >= -58) {
                              ++var4;
                              var5 = var5 * 10 + (var6 - 48);
                              if (~class289.field4546.length() >= ~var4) {
                                 var10000 = var5;
                                 if (!var1) {
                                    if (var5 >= 5) {
                                       class797.field11601 = true;
                                    }
                                    break label467;
                                 }
                              } else {
                                 var10000 = class289.field4546.charAt(var4);
                              }
                           } else {
                              var10000 = var5;
                              if (!var1) {
                                 if (var5 >= 5) {
                                    class797.field11601 = true;
                                 }
                                 break label467;
                              }
                           }
                        } else {
                           var10000 = var5;
                           if (!var1) {
                              if (var5 >= 5) {
                                 class797.field11601 = true;
                              }
                              break label467;
                           }
                        }
                     }
                  }
               }
            }

            Applet var7 = class92.field1327;
            if (class684.field10176 != null) {
               var7 = class684.field10176;
            }

            Method var8 = class289.field4565;
            if (var8 != null) {
               try {
                  var8.invoke(var7, Boolean.TRUE);
               } catch (Throwable var21) {
               }
            }

            class149.method1364(89);
            class483.method3762((byte)-27);
            this.method1159((byte)-84);
            this.method1167(92);
            class255.field3856 = class425.method3374(-9);
            int var9;
            if (var1) {
               class314.field4857 = class255.field3856.method3128(class129.field1853, 0);
               var9 = 0;
               if (var1) {
                  this.method5149(1);
                  ++var9;
               }
            } else if (class133.field1890 != 0L) {
               long var26;
               var10000 = (var26 = ~class162.method1442(14080) - ~class133.field1890) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (!var1) {
                  if (var10000 <= 0) {
                     return;
                  }

                  class314.field4857 = class255.field3856.method3128(class129.field1853, 0);
                  var9 = 0;
                  if (var1) {
                     this.method5149(1);
                     ++var9;
                  }
               } else {
                  var9 = var10000;
                  if (var1) {
                     this.method5149(1);
                     ++var9;
                  }
               }
            } else {
               class314.field4857 = class255.field3856.method3128(class129.field1853, 0);
               var9 = 0;
               if (var1) {
                  this.method5149(1);
                  ++var9;
               }
            }

            while(true) {
               while(~class314.field4857 < ~var9) {
                  this.method5149(1);
                  ++var9;
               }

               this.method5143(127);
               if (!var1) {
                  class180.method1635((byte)56, class544.field8183, class498.field7578);
                  if (class133.field1890 != 0L) {
                     long var27;
                     var10000 = (var27 = ~class162.method1442(14080) - ~class133.field1890) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                     if (!var1) {
                        if (var10000 <= 0) {
                           break;
                        }

                        class314.field4857 = class255.field3856.method3128(class129.field1853, 0);
                        var9 = 0;
                        if (var1) {
                           this.method5149(1);
                           ++var9;
                        }
                     } else {
                        var9 = var10000;
                        if (var1) {
                           this.method5149(1);
                           ++var9;
                        }
                     }
                  } else {
                     class314.field4857 = class255.field3856.method3128(class129.field1853, 0);
                     var9 = 0;
                     if (var1) {
                        this.method5149(1);
                        ++var9;
                     }
                  }
               } else {
                  ++var9;
               }
            }
         } catch (ThreadDeath var22) {
            throw var22;
         } catch (Throwable var23) {
            class281.method2349(1, this.method1151(-17), var23);
            this.method5148(field10436[18], false);
         } finally {
            Object var15 = null;
            this.method5151(-110, true);
         }

      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field10436[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "(Z)V"
   )
   public abstract void method1173(boolean arg0);

   @OriginalMember(
      owner = "client!bea",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method1166(int arg0);

   @OriginalMember(
      owner = "client!bea",
      name = "init",
      descriptor = "()V"
   )
   public abstract void init();

   @OriginalMember(
      owner = "client!bea",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1167(int arg0);

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1149(byte arg0);

   @OriginalMember(
      owner = "client!bea",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method1160(byte arg0);

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5153(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5154(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
