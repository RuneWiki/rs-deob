import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class699 {
   @OriginalMember(
      owner = "client!client",
      name = "Bb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1787 = new String[]{method1177(method1176("T`,5c")), method1177(method1176("L\"k~p[`C3")), method1177(method1176("A;nw")), method1177(method1176("L\"k~p[`E3")), method1177(method1176("L\"k~p[`U3")), method1177(method1176("a;nw")), method1177(method1176("\u0013-mw#I(d}xIp")), method1177(method1176("\u000fc<")), method1177(method1176("[<w~")), method1177(method1176("\\=i~g")), method1177(method1176("B!f~iG/v")), method1177(method1176("Z f~l")), method1177(method1176("^;kok]\"")), method1177(method1176("N*t~l[")), method1177(method1176("I!px{\u0019zoy")), method1177(method1176("\\'v~mJ:vrpH=]v{B,gi")), method1177(method1176("H/o~")), method1177(method1176("E=")), method1177(method1176("C!`ygF*")), method1177(method1176("@,h~}[:c|")), method1177(method1176("C!`ygN*fi{\\=")), method1177(method1176("Z=giXC!u")), method1177(method1176("I<mv|F\"nrpH")), method1177(method1176("N*frjF!lzrf dt")), method1177(method1176("C/l|")), method1177(method1176("B!f~iG+p~")), method1177(method1176("L\"k~p[`kuw[f")), method1177(method1176("L!ntk]'f")), method1177(method1176("\\+vowA)q")), method1177(method1176("X!pwzI\"c|m")), method1177(method1176("N(drz")), method1177(method1176("L!wuj]7")), method1177(method1176("X!pwzF*")), method1177(method1176("L\"k~p[`P3")), method1177(method1176("E=7xqA gxj")), method1177(method1176("E=7kl@6{D")), method1177(method1176("L\"k~p[`A3")), method1177(method1176("E=7xqA gxjp(wwr")), method1177(method1176("E=7rq")), method1177(method1176("E=7xqA gxjp!woqI*co{")), method1177(method1176("E=7xlL")), method1177(method1176("L\"k~p[`W3")), method1177(method1176("\u001e|55.\u0001~,*")), method1177(method1176("e/e~f")), method1177(method1176("L\"k~p[`@Z6")), method1177(method1176("L\"k~p[`AZ6")), method1177(method1176("\u000ffP~}@8gi{Kg\"")), method1177(method1176("L\"k~p[`H3")), method1177(method1176("L\"k~p[`G3")), method1177(method1176("L\"k~p[`D3")), method1177(method1176("L\"k~p[`N3")), method1177(method1176("L\"k~p[`S3")), method1177(method1176("\ng")), method1177(method1176("\u0013,p%")), method1177(method1176("\u0013,p%6")), method1177(method1176("A/o~")), method1177(method1176("\u0018g")), method1177(method1176("G/l\u007frJ")), method1177(method1176("\u001dg")), method1177(method1176("t\u007f+")), method1177(method1176("\u001e\u007f+")), method1177(method1176("S\u007f42")), method1177(method1176("E/tz0C/l|0l\"chmc!c\u007f{]")), method1177(method1176("\u0017g")), method1177(method1176("\\91\u007f0K\"n")), method1177(method1176("\u001e~+")), method1177(method1176("A/vrhJ\u0002kylN<k~m")), method1177(method1176("S{+")), method1177(method1176("\\+vZ}L+qhwM\"g")), method1177(method1176("\u001e|+")), method1177(method1176("L\"k~p[")), method1177(method1176("\u001ez+")), method1177(method1176("Sz+")), method1177(method1176("Sx+")), method1177(method1176("\u001e}+")), method1177(method1176("L\"k~p[`L3")), method1177(method1176("E/tz0C/l|0]+dw{L:,Z}L+qhwM\"gT|E+ao")), method1177(method1176("\u0016g")), method1177(method1176("S\u007f72")), method1177(method1176("\u001cg")), method1177(method1176("L\"k~p[`O3")), method1177(method1176("L\"k~p[`T3")), method1177(method1176("L/lm\u007f\\")), method1177(method1176("L\"k~p[`ozwAf")), method1177(method1176("H/o~/")), method1177(method1176("H/o~.")), method1177(method1176("C't~")), method1177(method1176("]-")), method1177(method1176("n<ensJ v;}@;lo")), method1177(method1176("C/l|kN)g")), method1177(method1176("H/o~,")), method1177(method1176("H+pv\u007fA")), method1177(method1176("J eww\\&")), method1177(method1176("X'r")), method1177(method1176("H/o~-")), method1177(method1176("L\"k~p[`M3")), method1177(method1176("F(3")), method1177(method1176("L\"k~p[`@3"))};
   @OriginalMember(
      owner = "client!client",
      name = "eb",
      descriptor = "I"
   )
   public static int field1763 = 0;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1773 = new String[8];
   @OriginalMember(
      owner = "client!client",
      name = "lb",
      descriptor = "I"
   )
   public static int field1764;
   @OriginalMember(
      owner = "client!client",
      name = "mb",
      descriptor = "I"
   )
   public static int field1765;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "I"
   )
   public static int field1766;
   @OriginalMember(
      owner = "client!client",
      name = "gb",
      descriptor = "I"
   )
   public static int field1767;
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "I"
   )
   public static int field1768;
   @OriginalMember(
      owner = "client!client",
      name = "db",
      descriptor = "I"
   )
   public static int field1769;
   @OriginalMember(
      owner = "client!client",
      name = "Ab",
      descriptor = "I"
   )
   public static int field1770;
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "I"
   )
   public static int field1771;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field1772;
   @OriginalMember(
      owner = "client!client",
      name = "fb",
      descriptor = "I"
   )
   public static int field1774;
   @OriginalMember(
      owner = "client!client",
      name = "hb",
      descriptor = "I"
   )
   public static int field1775;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "I"
   )
   public static int field1776;
   @OriginalMember(
      owner = "client!client",
      name = "jb",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!client",
      name = "kb",
      descriptor = "I"
   )
   public static int field1778;
   @OriginalMember(
      owner = "client!client",
      name = "ib",
      descriptor = "I"
   )
   public static int field1779;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field1780;
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field1781;
   @OriginalMember(
      owner = "client!client",
      name = "zb",
      descriptor = "I"
   )
   public static int field1782;
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "I"
   )
   public static int field1783;
   @OriginalMember(
      owner = "client!client",
      name = "yb",
      descriptor = "I"
   )
   public static int field1784;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1785;
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "Z"
   )
   public static boolean field1786;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1175(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "()V",
      line = 5
   )
   public static final void method1147() {
      int var0 = class728.field10861;
      int[] var1 = class17.field223;
      int var2 = class687.field10213.field497.method1633(480102311);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class9 var14 = class484.field7370[var1[var4]];
         if (!var14.method55(-541)) {
            var14.field1623 = -1;
         } else if (var14.field80) {
            var14.field1623 = -1;
         } else {
            var14.method739(66);
            if (var14.field1040 >= 0 && var14.field1044 >= 0 && var14.field1042 < class513.field7828 && var14.field1049 < class475.field7230) {
               var14.field99 = var14.field1656 ? var3 : false;
               if (class476.field7251 == var14) {
                  var14.field1623 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field1601) {
                     ++var15;
                  }

                  if (var14.field1636 > class308.field4801) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method61((byte)70) << 2);
                  if (!var14.field81 && !var14.field78) {
                     if (class58.field720 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field1623 = var16 + 1;
               }
            } else {
               var14.field1623 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class615.field8929; ++var5) {
         class466 var11 = ((class795)class501.field7665.method3141((long)class334.field5139[var5], true)).field11592;
         if (var11.method3621(-541) && var11.field7072.method2784(true, class45.field599)) {
            var11.method739(122);
            if (var11.field1040 >= 0 && var11.field1044 >= 0 && var11.field1042 < class513.field7828 && var11.field1049 < class475.field7230) {
               int var12 = 0;
               if (!var11.field1601) {
                  ++var12;
               }

               if (var11.field1636 > class308.field4801) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method61((byte)70) << 2);
               if (class58.field720 == 0) {
                  if (var11.field7072.field5266) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class58.field720 == 1) {
                  if (var11.field7072.field5266) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field7072.field5254) {
                  var13 += 1024;
               } else if (!var11.field7072.field5280) {
                  var13 += 256;
               }

               var11.field1623 = var13 + 1;
            } else {
               var11.field1623 = -1;
            }
         } else {
            var11.field1623 = -1;
         }
      }

      for(int var6 = 0; var6 < class424.field6543.length; ++var6) {
         class619 var7 = class424.field6543[var6];
         if (var7 != null) {
            if (var7.field8999 == 1) {
               class795 var8 = (class795)class501.field7665.method3141((long)var7.field9002, true);
               if (var8 != null) {
                  class466 var9 = var8.field11592;
                  if (var9.field1623 >= 0) {
                     var9.field1623 += 2048;
                  }
               }
            } else if (var7.field8999 == 10) {
               class9 var10 = class484.field7370[var7.field9002];
               if (var10 != null && class476.field7251 != var10 && var10.field1623 >= 0) {
                  var10.field1623 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Lfq;)Lfs;",
      line = 177
   )
   public static final class68 method1148(class374 arg0) {
      class68 var1 = (class68)class592.field8715.method3141(((long)arg0.field5840 << 32) + (long)arg0.field5848, true);
      return var1 != null ? var1 : arg0.field5905;
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(B)V",
      line = 181
   )
   public final void method1149(byte arg0) {
      boolean var2 = field1786;

      try {
         if (class745.field11059) {
            class536.method4116(-35);
         }

         ++field1776;
         class733.method5399(0);
         if (class351.field5356 != null) {
            class351.field5356.method4495(true);
         }

         if (class751.field11144 != null) {
            class333.method2720(class751.field11144, class498.field7578, (byte)70);
            class751.field11144 = null;
         }

         class510.field7801.method204((byte)120);
         class510.field7800.method204((byte)118);
         class97.method952((byte)86);
         class522.field7958.method1851((byte)99);
         class740.field11003.method2659(false);
         if (class227.field3447 != null) {
            class227.field3447.method2536(1);
            class227.field3447 = null;
         }

         try {
            class63.field843.method1352((byte)-3);
            int var3 = 0;
            if (var2) {
               class632.field9151[var3].method1352((byte)-3);
               ++var3;
            }

            while(true) {
               while(~var3 > -38) {
                  class632.field9151[var3].method1352((byte)-3);
                  ++var3;
               }

               if (!var2) {
                  if (arg0 > -120) {
                     field1773 = null;
                  }

                  class444.field6808.method1352((byte)-3);
                  class505.field7744.method1352((byte)-3);
                  class522.method4022((byte)-109);
                  return;
               }

               ++var3;
            }
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1787[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)V",
      line = 233
   )
   public static void method1150(int arg0) {
      try {
         if (arg0 != -10811) {
            method1170(-58, (byte)14);
         }

         field1773 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1787[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(I)Ljava/lang/String;",
      line = 245
   )
   public final String method1151(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Lfq;)Lfq;",
      line = 330
   )
   public static final class374 method1152(class374 arg0) {
      int var1 = method1148(arg0).method528((byte)119);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class183.method1658(arg0.field5830, 126);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "m",
      descriptor = "(I)V",
      line = 352
   )
   public static final void method1153(int arg0) {
      int var1 = class728.field10861;
      int[] var2 = class17.field223;

      for(int var3 = 0; var3 < class615.field8929 + var1; ++var3) {
         class119 var4;
         if (var3 < var1) {
            var4 = class484.field7370[var2[var3]];
         } else {
            var4 = ((class795)class501.field7665.method3141((long)class334.field5139[var3 - var1], true)).field11592;
         }

         if (var4.field1506 == arg0 && var4.field1623 >= 0) {
            int var5 = var4.method61((byte)70);
            if ((var5 & 1) == 0) {
               if ((var4.field1505 & 511) != 0 || (var4.field1494 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field1505 & 511) != 256 || (var4.field1494 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field1505 >> 9;
               int var7 = var4.field1494 >> 9;
               if (var4.field1623 > class415.field6440[var6][var7]) {
                  class415.field6440[var6][var7] = var4.field1623;
                  class692.field10300[var6][var7] = 1;
               } else if (class415.field6440[var6][var7] == var4.field1623) {
                  var10002 = class692.field10300[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field1505 - var8 >> 9;
               int var10 = var4.field1494 - var8 >> 9;
               int var11 = var4.field1505 + var8 >> 9;
               int var12 = var4.field1494 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field1623 > class415.field6440[var13][var14]) {
                        class415.field6440[var13][var14] = var4.field1623;
                        class692.field10300[var13][var14] = 1;
                     } else if (class415.field6440[var13][var14] == var4.field1623) {
                        var10002 = class692.field10300[var13][var14]++;
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "e",
      descriptor = "(B)V",
      line = 454
   )
   private final void method1154(byte arg0) {
      boolean var2 = field1786;

      try {
         ++field1774;
         if (class522.field7958.field3232 > class729.field10886) {
            class154.field2296.method4136(43594);
            class561.field8341 = (class522.field7958.field3232 + -1) * 5 * 50;
            if (class561.field8341 > 3000) {
               class561.field8341 = 3000;
            }

            if (class522.field7958.field3232 >= 2 && ~class522.field7958.field3230 == -7) {
               this.method5148(field1787[39], false);
               class342.field5204 = 16;
               return;
            }

            if (~class522.field7958.field3232 <= -5 && class522.field7958.field3230 == -1) {
               this.method5148(field1787[40], false);
               class342.field5204 = 16;
               return;
            }

            if (class522.field7958.field3232 >= 4 && class59.method439(class342.field5204, 39)) {
               label188: {
                  if (class522.field7958.field3230 == 7 || class522.field7958.field3230 == 9) {
                     this.method5148(field1787[37], false);
                     if (!var2) {
                        break label188;
                     }
                  }

                  if (class522.field7958.field3230 > 0) {
                     if (class559.field8318 != null) {
                        this.method5148(field1787[35] + class559.field8318.trim(), false);
                        if (!var2) {
                           break label188;
                        }
                     }

                     this.method5148(field1787[34], false);
                     if (!var2) {
                        break label188;
                     }
                  }

                  this.method5148(field1787[38], false);
               }

               class342.field5204 = 16;
               return;
            }
         }

         class729.field10886 = class522.field7958.field3232;
         if (~class561.field8341 < -1) {
            --class561.field8341;
         } else {
            try {
               if (~class730.field10900 == -1) {
                  class645.field9312 = class154.field2296.method4137(443, class498.field7578);
                  ++class730.field10900;
               }

               if (arg0 <= -88) {
                  if (class730.field10900 == 1) {
                     if (~class645.field9312.field4398 == -3) {
                        if (class645.field9312.field4401 != null) {
                           class559.field8318 = (String)class645.field9312.field4401;
                        }

                        this.method1158((byte)-107, 1000);
                        return;
                     }

                     if (~class645.field9312.field4398 == -2) {
                        ++class730.field10900;
                     }
                  }

                  if (class730.field10900 == 2) {
                     class678.field10125 = new class412((Socket)class645.field9312.field4401, class498.field7578, 25000);
                     class354 var3 = new class354(5);
                     var3.method2864(-26110, class389.field6121.field4916);
                     var3.method2849(659, (byte)-34);
                     class678.field10125.method3296(0, 1, var3.field5428, 5);
                     ++class730.field10900;
                     class61.field791 = class162.method1442(14080);
                  }

                  if (class730.field10900 == 3) {
                     if (!class59.method439(class342.field5204, 36) && class678.field10125.method3303(0) <= 0) {
                        if (-class61.field791 + class162.method1442(14080) > 30000L) {
                           this.method1158((byte)-117, 1001);
                           return;
                        }
                     } else {
                        int var4 = class678.field10125.method3302(0);
                        if (~var4 != -1) {
                           this.method1158((byte)-102, var4);
                           return;
                        }

                        ++class730.field10900;
                     }
                  }

                  if (class730.field10900 == 4) {
                     boolean var5 = class59.method439(class342.field5204, 66) || class298.method2501(26256, class342.field5204) || class303.method2535(class342.field5204, 125);
                     class63[] var6 = class63.method487(-92);
                     class354 var7 = new class354(var6.length * 4);
                     class678.field10125.method3300(0, var7.field5428, var7.field5428.length, 24322);
                     int var8 = 0;
                     if (var2) {
                        var6[var8].method483((byte)-98, var7.method2894(104));
                        ++var8;
                     }

                     while(true) {
                        while(var6.length > var8) {
                           var6[var8].method483((byte)-98, var7.method2894(104));
                           ++var8;
                        }

                        if (!var2) {
                           class522.field7958.method1844((byte)-128, class678.field10125, !var5);
                           class678.field10125 = null;
                           class645.field9312 = null;
                           class730.field10900 = 0;
                           return;
                        }

                        ++var8;
                     }
                  }
               }
            } catch (IOException var10) {
               this.method1158((byte)-110, 1002);
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1787[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(B)V",
      line = 625
   )
   private final void method1155(byte arg0) {
      boolean var2 = field1786;

      try {
         ++field1767;
         if (class342.field5204 != 16) {
            long var3 = class524.method4047(6) / 1000000L - class68.field897;
            class68.field897 = class524.method4047(6) / 1000000L;
            boolean var5 = class570.method4287((byte)97);
            if (var5 && class176.field2762 && class218.field3290 != null) {
               class218.field3290.method5581(-75);
            }

            if (class21.method154(-4, class342.field5204)) {
               label410: {
                  if (class337.field5170 == 0L || ~class337.field5170 <= ~class162.method1442(14080)) {
                     if (class351.field5356.method664() || !class136.field1990) {
                        break label410;
                     }

                     class304.method2549((byte)76);
                     if (!var2) {
                        break label410;
                     }
                  }

                  class41.method294(-107, class187.method1682((byte)-30), class700.field10442, class599.field8780, false);
               }
            }

            if (class751.field11144 == null) {
               Container var6;
               label390: {
                  if (class479.field7289 != null) {
                     var6 = class479.field7289;
                     if (!var2) {
                        break label390;
                     }
                  }

                  if (class684.field10176 != null) {
                     var6 = class684.field10176;
                     if (!var2) {
                        break label390;
                     }
                  }

                  var6 = class92.field1327;
               }

               int var7 = var6.getSize().width;
               int var8 = var6.getSize().height;
               if (class479.field7289 == var6) {
                  Insets var9 = class479.field7289.getInsets();
                  var7 -= var9.right + var9.left;
                  var8 -= var9.top + var9.bottom;
               }

               if (~class155.field2322 != ~var7 || class145.field2067 != var8 || class741.field11026) {
                  label404: {
                     if (class351.field5356 == null || class351.field5356.method610()) {
                        class770.method5619(arg0 + -91);
                        if (!var2) {
                           break label404;
                        }
                     }

                     class145.field2067 = var8;
                     class155.field2322 = var7;
                  }

                  class337.field5170 = class162.method1442(14080) - -500L;
                  class741.field11026 = false;
               }
            }

            if (class751.field11144 != null && !class263.field4328 && class21.method154(-4, class342.field5204)) {
               class41.method294(arg0 ^ 76, class687.field10213.field504.method3173(480102311), -1, -1, false);
            }

            boolean var10 = false;
            if (class365.field5653) {
               class365.field5653 = false;
               var10 = true;
            }

            if (var10) {
               class651.method4724(-1);
            }

            if (arg0 != -36) {
               main((String[])null);
            }

            if (class351.field5356 != null && class351.field5356.method664() || class187.method1682((byte)-30) != 1) {
               class204.method1782((byte)7);
            }

            label391: {
               if (class59.method439(class342.field5204, 36)) {
                  class395.method3179((byte)70, var10);
                  if (!var2) {
                     break label391;
                  }
               }

               if (!class182.method1653(-4, class342.field5204)) {
                  if (class316.method2620(true, class342.field5204)) {
                     class190.method1693((byte)-99);
                     if (!var2) {
                        break label391;
                     }
                  }

                  if (!class544.method4149(0, class342.field5204)) {
                     if (class342.field5204 == 11) {
                        class779.method5658(var3, arg0 ^ 35);
                        if (!var2) {
                           break label391;
                        }
                     }

                     if (class342.field5204 == 14) {
                        class255.method2160(class577.field8538, 16, class351.field5356, false, class499.field7602.method3875(class493.field7455, arg0 ^ -79) + field1787[53] + class499.field7603.method3875(class493.field7455, 103), class564.field8381);
                        if (!var2) {
                           break label391;
                        }
                     }

                     if (class342.field5204 != 15) {
                        break label391;
                     }

                     class255.method2160(class577.field8538, 16, class351.field5356, false, class499.field7619.method3875(class493.field7455, arg0 ^ -69), class564.field8381);
                     if (!var2) {
                        break label391;
                     }
                  }

                  if (~class13.field163 == -2) {
                     if (~class306.field4786 < ~class234.field3585) {
                        class234.field3585 = class306.field4786;
                     }

                     int var11 = (class234.field3585 - class306.field4786) * 50 / class234.field3585;
                     class255.method2160(class577.field8538, 16, class351.field5356, true, class499.field7600.method3875(class493.field7455, 105) + field1787[54] + var11 + field1787[52], class564.field8381);
                     if (!var2) {
                        break label391;
                     }
                  }

                  if (~class13.field163 != -3) {
                     class255.method2160(class577.field8538, 16, class351.field5356, true, class499.field7600.method3875(class493.field7455, 105), class564.field8381);
                     if (!var2) {
                        break label391;
                     }
                  }

                  if (class338.field5181 > class486.field7396) {
                     class486.field7396 = class338.field5181;
                  }

                  int var12 = 50 - -((-class338.field5181 + class486.field7396) * 50 / class486.field7396);
                  class255.method2160(class577.field8538, 16, class351.field5356, true, class499.field7600.method3875(class493.field7455, 83) + field1787[54] + var12 + field1787[52], class564.field8381);
                  if (!var2) {
                     break label391;
                  }
               }

               class190.method1693((byte)66);
            }

            if (~class556.field8300 == -4) {
               int var13 = 0;
               if (var2 || class169.field2594 > var13) {
                  do {
                     Rectangle var14 = class640.field9275[var13];
                     if (class12.field158[var13]) {
                        class351.field5356.method4500(arg0 + 37, var14.width, var14.x, var14.y, var14.height, -65281);
                        if (!var2) {
                           ++var13;
                           continue;
                        }
                     }

                     if (class730.field10897[var13]) {
                        class351.field5356.method4500(arg0 ^ -35, var14.width, var14.x, var14.y, var14.height, -65536);
                        if (!var2) {
                           ++var13;
                           continue;
                        }
                     }

                     class351.field5356.method4500(1, var14.width, var14.x, var14.y, var14.height, -16711936);
                     ++var13;
                  } while(class169.field2594 > var13);
               }
            }

            if (class11.method89(-98)) {
               class211.method1838(class351.field5356, arg0 + -8097);
            }

            label408: {
               if (!class498.field7578.field4542 || !class21.method154(-4, class342.field5204) || ~class556.field8300 != -1 || ~class187.method1682((byte)-30) != -2 || var10) {
                  if (class59.method439(class342.field5204, arg0 + 84)) {
                     break label408;
                  }

                  int var15 = 0;
                  if (var2) {
                     class730.field10897[var15] = false;
                     ++var15;
                  }

                  while(true) {
                     while(~class169.field2594 < ~var15) {
                        class730.field10897[var15] = false;
                        ++var15;
                     }

                     try {
                        if (!var2) {
                           if (!class281.field4472) {
                              class351.field5356.method4489(-23395);
                              if (!var2) {
                                 break label408;
                              }
                           }

                           class33.method246((byte)-80);
                           break label408;
                        }
                     } catch (class623 var22) {
                        class281.method2349(1, var22.getMessage() + field1787[46] + this.method1151(arg0 ^ 51), var22);
                        class473.method3678(2744, 0, false);
                        if (!var2) {
                           break label408;
                        }
                        break;
                     }

                     ++var15;
                  }
               }

               int var17 = 0;
               int var18 = 0;
               if (var2) {
                  if (class730.field10897[var18]) {
                     class730.field10897[var18] = false;
                     class154.field2303[var17++] = class640.field9275[var18];
                  }

                  ++var18;
               }

               while(true) {
                  boolean var10000;
                  if (class169.field2594 <= var18) {
                     try {
                        var10000 = class281.field4472;
                        if (!var2) {
                           if (var10000) {
                              class102.method998(var17, class154.field2303, 104);
                              if (!var2) {
                                 break;
                              }
                           }

                           class351.field5356.method4496(var17, class154.field2303, false);
                           break;
                        }
                     } catch (class623 var21) {
                        break;
                     }
                  } else {
                     var10000 = class730.field10897[var18];
                  }

                  if (var10000) {
                     class730.field10897[var18] = false;
                     class154.field2303[var17++] = class640.field9275[var18];
                  }

                  ++var18;
               }
            }

            label401: {
               class489.method3796(100);
               int var19 = class687.field10213.field521.method3293(480102311);
               if (~var19 == -1) {
                  class697.method5128(15L, arg0 ^ -123);
                  if (!var2) {
                     break label401;
                  }
               }

               if (~var19 == -2) {
                  class697.method5128(10L, arg0 ^ -103);
                  if (!var2) {
                     break label401;
                  }
               }

               if (var19 == 2) {
                  class697.method5128(5L, -122);
                  if (!var2) {
                     break label401;
                  }
               }

               if (~var19 == -4) {
                  class697.method5128(2L, arg0 ^ 114);
               }
            }

            if (class22.field287) {
               class189.method1688((byte)-107);
            }

            if (class687.field10213.field522.method1006(arg0 + 480102347) == 1 && ~class342.field5204 == -4 && ~class288.field4539 != 0) {
               class687.field10213.method299(-17, 0, class687.field10213.field522);
               class388.method3135(0);
            }
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field1787[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "j",
      descriptor = "(I)V",
      line = 888
   )
   private final void method1156(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(BLica;)V",
      line = 1182
   )
   public static final void method1157(byte arg0, class354 arg1) {
      boolean var2 = field1786;

      try {
         int var3 = 0;
         int var4;
         int var5;
         if (var2) {
            var4 = arg1.method2896(0);
            var5 = arg1.method2848(-103);
            if (~var5 == -65536) {
               var5 = -1;
            }

            if (class317.field4894[var4] != null) {
               class317.field4894[var4].field9096 = var5;
            }

            ++var3;
         }

         while(true) {
            int var10000;
            if (~var3 <= ~class556.field8295) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != 37) {
                     field1763 = -126;
                  }

                  ++field1771;
                  return;
               }
            } else {
               var10000 = arg1.method2896(0);
            }

            var4 = var10000;
            var5 = arg1.method2848(-103);
            if (~var5 == -65536) {
               var5 = -1;
            }

            if (class317.field4894[var4] != null) {
               class317.field4894[var4].field9096 = var5;
            }

            ++var3;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1787[1] + arg0 + ',' + (arg1 != null ? field1787[0] : field1787[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(BI)V",
      line = 1211
   )
   private final void method1158(byte arg0, int arg1) {
      try {
         class645.field9312 = null;
         class730.field10900 = 0;
         class522.field7958.field3230 = arg1;
         ++field1775;
         if (arg0 > -96) {
            field1773 = null;
         }

         class678.field10125 = null;
         ++class522.field7958.field3232;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1787[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(B)V",
      line = 1226
   )
   public final synchronized void method1159(byte arg0) {
      try {
         ++field1764;
         if (class684.field10176 != null && class544.field8183 == null && !class498.field7578.field4542) {
            try {
               Class var2 = class684.field10176.getClass();
               Field var3 = var2.getDeclaredField(field1787[82]);
               class544.field8183 = (Canvas)var3.get(class684.field10176);
               var3.set(class684.field10176, (Object)null);
               if (class544.field8183 != null) {
                  return;
               }
            } catch (Exception var5) {
            }
         }

         super.method1159(arg0);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1787[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(B)V",
      line = 1253
   )
   public final void method1160(byte arg0) {
      boolean var2 = field1786;

      try {
         ++field1781;
         method1150(-10811);
         class314.method2605(32);
         class237.method2025(arg0 + 23);
         class499.method3873(0);
         class31.method217((byte)-113);
         class736.method5412((byte)-106);
         class565.method4260(-9);
         class192.method1708(-105);
         class285.method2380(6);
         class63.method484(false);
         class715.method5295((byte)-11);
         class366.method2972(256);
         class440.method3462((byte)-79);
         class204.method1786(89);
         class103.method1001(arg0 + -3023);
         class47.method334(arg0 ^ 22);
         class400.method3229(arg0 ^ 29369);
         class297.method2496((byte)-84);
         class294.method2475(8405);
         class475.method3694((byte)-53);
         class389.method3138(1);
         class387.method3127(100);
         class406.method3260((byte)-81);
         class12.method92(100);
         class311.method2594(arg0 + -31424);
         class401.method3240(arg0 ^ -23);
         class610.method4493(39);
         class41.method296(arg0 + 143);
         class632.method4620(37);
         class619.method4555(arg0 + 71);
         class675.method4977((byte)118);
         class412.method3298(-27431);
         class212.method1850(-26705);
         class325.method2662((byte)-60);
         class740.method5430(-34);
         class678.method5026(-1);
         class11.method86((byte)-110);
         class14.method100((byte)78);
         class296.method2490(22815);
         class731.method5393(120);
         class486.method3778(false);
         class514.method3984((byte)22);
         class17.method131((byte)-94);
         class520.method4015(26861);
         class81.method789((byte)-92);
         class241.method2054(arg0 ^ -117);
         class24.method174(-99);
         class657.method4844(arg0 + -24500);
         class464.method3597(96);
         class238.method2030(true);
         class181.method1644((byte)25);
         class698.method5137(32);
         class777.method5651(arg0 ^ 11389);
         class108.method1034(arg0 ^ -3504);
         class65.method503((byte)106);
         class392.method3166(108);
         class438.method3449(-21272);
         class226.method1958(-101);
         class795.method5742(-92);
         class410.method3286(-9260);
         class29.method209(true);
         class303.method2537(true);
         class92.method926(arg0 + 795706462);
         class482.method3741(arg0 + 23);
         class508.method3948(false);
         class191.method1704(39);
         class794.method5737(9);
         class208.method1816(-10506);
         class374.method3068(arg0 ^ -32);
         class738.method5420(true);
         class9.method50(0);
         class236.method2022(true);
         class637.method4653(458752);
         class57.method426(26003);
         class354.method2854((byte)112);
         class577.method4327((byte)-117);
         class119.method1095(false);
         class190.method1695((byte)101);
         class276.method2328(arg0 ^ 23);
         class68.method523(-8890);
         class33.method248((byte)55);
         class498.method3868(true);
         class378.method3090(arg0 ^ -18);
         class102.method991(true);
         class474.method3684(false);
         class391.method3157(-4453);
         class383.method3109((byte)3);
         class444.method3489(true);
         class234.method2012(true);
         class443.method3486((byte)96);
         class541.method4134(false);
         class595.method4424(-29646);
         class364.method2963(-5740);
         class615.method4528(-1);
         class178.method1621(119);
         class537.method4119(false);
         class339.method2756(arg0 + -66);
         class580.method4341((byte)98);
         class56.method416(arg0 + -4977);
         class450.method3532(-97);
         class456.method3569(-66);
         class69.method533(-32209);
         class91.method870((byte)-33);
         class221.method1910(16572);
         class365.method2964(true);
         class429.method3386(76);
         class331.method2699(18597);
         class6.method25(arg0 + -23);
         class333.method2717(true);
         class690.method5084(arg0 + 23);
         class271.method2315(805306368);
         class752.method5519((byte)-117);
         class344.method2785((byte)-107);
         class317.method2624(-1);
         class288.method2406((byte)-18);
         class198.method1748(true);
         class578.method4333(arg0 + -55);
         class608.method4481((byte)124);
         class706.method5211(88);
         class222.method1919(-26165);
         class180.method1631(-1976432919);
         class755.method5538((byte)-80);
         class753.method5526(1747);
         class22.method166((byte)94);
         class691.method5088(512);
         class239.method2037(arg0 ^ 100);
         class729.method5380(false);
         class589.method4393(24);
         class501.method3884(true);
         class593.method4413(20);
         class437.method3436((byte)125);
         class754.method5535(0);
         class621.method4565(false);
         class394.method3174(-31760);
         class336.method2742(arg0 ^ -23);
         class373.method3043(-6498);
         class774.method5628(-109);
         class104.method1007(19605);
         class203.method1773(-127);
         class67.method517(arg0 ^ 110);
         class547.method4160(-4);
         class623.method4573(arg0 + 65559);
         class96.method948(4462);
         class624.method4579(124);
         class43.method308(87);
         class404.method3245(108);
         class390.method3152((byte)-48);
         class78.method735(0);
         class109.method1038(0);
         class80.method747(0);
         class761.method5575(arg0 + 127);
         class398.method3208(true);
         class760.method5568((byte)-86);
         class82.method801(-13801);
         class469.method3643();
         class113.method1060(true);
         class642.method4683(arg0 + 25);
         class563.method4248(true);
         class532.method4083(-128);
         class579.method4337((byte)125);
         class656.method4834(true);
         class781.method5675(0);
         class790.method5721((byte)95);
         class290.method2448(false);
         class326.method2669(11819);
         class782.method5689(-801);
         class135.method1244(-126);
         class199.method1752(-4103);
         class155.method1402(60);
         class431.method3407((byte)118);
         class557.method4217(18004);
         class435.method3422((byte)-100);
         class509.method3958((byte)-79);
         class60.method451();
         class147.method1342(arg0 ^ 109);
         class186.method1674(-126);
         class3.method13(false);
         class507.method3938(arg0 ^ 22);
         class143.method1300(6395);
         class700.method5155(arg0 ^ 20203);
         class224.method1947((byte)-118);
         class797.method5746(1);
         class694.method5104(0);
         class750.method5511(-21);
         class769.method5616(1);
         class759.method5565(true);
         class246.method2089((byte)-10);
         class127.method1203(false);
         class788.method5712(-25721);
         class680.method5036(false);
         class681.method5042((byte)-112);
         class720.method5324(104);
         class743.method5456();
         class228.method1974(0);
         class211.method1836(76);
         class751.method5515(false);
         class142.method1292(104);
         class320.method2633(43);
         class335.method2734(true);
         class528.method4059(12);
         class28.method198(8558);
         class77.method730(false);
         class343.method2774();
         class321.method2637(false);
         class430.method3401(132);
         class214.method1863(arg0 ^ 23);
         class36.method261(0);
         class305.method2560(2);
         class555.method4211(-1);
         class735.method5408((byte)63);
         class330.method2691(arg0 ^ -18865);
         class451.method3535(-10336);
         class462.method3588(true);
         class484.method3767(-7);
         class15.method117();
         class253.method2134(arg0 ^ -16495);
         class369.method3021((byte)-60);
         class472.method3668(4);
         class215.method1870();
         class748.method5496(true);
         class618.method4551(16310);
         class727.method5365(arg0 ^ -26579);
         class524.method4046(6);
         class500.method3879(2);
         class240.method2044(-1);
         class1.method2(false);
         class168.method1565((byte)77);
         class617.method4537();
         class634.method4633(3);
         class45.method327(arg0 ^ 17950);
         class233.method2008(true);
         class87.method838(-61);
         class76.method718(arg0 ^ -7578);
         class287.method2391(3301);
         class58.method430(127);
         class385.method3119(true);
         class145.method1315((byte)-39);
         class801.method5772((byte)-48);
         class756.method5548(false);
         class381.method3101(100);
         class257.method2170(21393);
         class481.method3736(arg0 + 134);
         class395.method3180(-1);
         class259.method2260(-1);
         class359.method2945(-13779);
         class252.method2130(arg0 + -16361);
         class169.method1568((byte)57);
         class737.method5417((byte)113);
         class455.method3561(false);
         class286.method2386(-95);
         class213.method1860(false);
         class151.method1379(100);
         class653.method4818(352);
         class626.method4590(false);
         class207.method1806((byte)-106);
         class609.method4486(18814);
         class535.method4111(103);
         class558.method4222(arg0 ^ -2996);
         class779.method5660((byte)-72);
         class432.method3413(15731);
         class702.method5166(-2);
         class277.method2332(16);
         class684.method5053(0);
         class415.method3315(-4);
         class195.method1725(1);
         class348.method2808(-104);
         class522.method4031(-1);
         class640.method4675((byte)-57);
         class32.method240((byte)127);
         class423.method3356(true);
         class655.method4828(-40);
         class170.method1575(false);
         class231.method1986(27125);
         class636.method4646(true);
         class783.method5693(-88);
         class689.method5074((byte)-104);
         class90.method854(736106825);
         class594.method4421(arg0 ^ -34);
         class512.method3976(true);
         class598.method4434((byte)123);
         class696.method5114(0);
         class342.method2765(0);
         class725.method5359(-1);
         class407.method3268(-15251);
         class665.method4914((byte)-121);
         class529.method4063(false);
         class453.method3551(111);
         class59.method436(false);
         class120.method1110(124);
         class600.method4444((byte)-95);
         class409.method3281(arg0 ^ -78);
         class334.method2731(83);
         class298.method2499(9);
         class762.method5585(true);
         class767.method5605(false);
         class117.method1077(-108);
         class572.method4300(arg0 ^ -32);
         class280.method2344((byte)113);
         class306.method2563((byte)-66);
         class220.method1901();
         class255.method2159(2);
         class417.method3326((byte)126);
         class346.method2797(5);
         class539.method4122(-30921);
         class798.method5751(arg0 ^ 86);
         class692.method5095((byte)102);
         class439.method3454(true);
         class278.method2339(127);
         class668.method4926((byte)48);
         class55.method409(false);
         class629.method4608((byte)-119);
         class426.method3377((byte)126);
         class16.method121(12320);
         class357.method2918(75);
         class128.method1209();
         class494.method3820(true);
         class582.method4348(arg0 ^ -152);
         class677.method4992();
         class322.method2643();
         class125.method1185(true);
         class559.method4228((byte)-126);
         class349.method2815();
         class156.method1407(arg0 ^ 36);
         class744.method5467((byte)72);
         class518.method3999((byte)-86);
         class70.method543(47);
         class506.method3930(90);
         class489.method3798(false);
         class554.method4207(true);
         class711.method5256((byte)16);
         class300.method2514((byte)113);
         class230.method1980(-3833);
         class505.method3923(126);
         class341.method2761((byte)18);
         class40.method280(false);
         class603.method4457(arg0 + -6688);
         class465.method3609((byte)-22);
         class368.method3016(18581);
         if (arg0 != -24) {
            method1147();
         }

         class614.method4523(-108);
         class351.method2825(-38);
         class780.method5668(-48);
         class35.method255(24481);
         class551.method4182();
         class292.method2460(0);
         class718.method5314(true);
         class734.method5404(arg0 + 27);
         class194.method1717(15467);
         class523.method4036(0);
         class793.method5730(false);
         class27.method195(-7493);
         class459.method3580(80);
         class408.method3274((byte)-122);
         class478.method3722(77);
         class708.method5220((byte)55);
         class671.method4945((byte)-123);
         class175.method1605(126);
         class324.method2653(12749);
         class483.method3763(true);
         class202.method1768(arg0 + -59);
         class309.method2588(5);
         class225.method1952(arg0 ^ -22);
         class182.method1654((byte)116);
         class652.method4788((byte)66);
         class25.method185((byte)-4);
         class705.method5204(-14451);
         class583.method4359(21829);
         class445.method3495((byte)127);
         class649.method4716(arg0 + -99);
         class758.method5560(-117);
         class355.method2904(107);
         class358.method2934((byte)1);
         class799.method5765(13635);
         class396.method3197(arg0 + 24);
         class329.method2682(0);
         class419.method3337(false);
         class146.method1331(13692);
         class37.method267((byte)123);
         class553.method4202(32993);
         class258.method2186((byte)119);
         class42.method304((byte)-79);
         class650.method4719(arg0 ^ -20);
         class97.method954(110);
         class504.method3904((byte)-15);
         class666.method4920((byte)-97);
         class588.method4390(-116);
         class550.method4175(101);
         class757.method5551((byte)-89);
         class625.method4584(107);
         class371.method3031((byte)-107);
         class703.method5174(-122);
         class19.method144(-79);
         class742.method5447(arg0 ^ 9934);
         class570.method4289((byte)19);
         class133.method1234((byte)-114);
         class425.method3368(-124);
         class134.method1237();
         class293.method2471(125);
         class2.method6(arg0 + 139);
         class442.method3483(-55);
         class327.method2675(15837);
         class663.method4904((byte)-66);
         class546.method4155(86);
         class620.method4560((byte)-28);
         class176.method1612(117);
         class530.method4070(3);
         class452.method3547(-257);
         class548.method4164(-128);
         class360.method2949(true);
         class66.method508((byte)-29);
         class118.method1083((byte)-32);
         class645.method4690(true);
         class154.method1397(2);
         class201.method1762(arg0 ^ -22);
         class768.method5610((byte)92);
         class592.method4408((byte)-55);
         class256.method2165(false);
         class144.method1308(-24395);
         class573.method4307(336682444);
         class687.method5064(arg0 ^ -3790);
         class110.method1046(false);
         class397.method3202(0);
         class399.method3220((byte)-58);
         class7.method30();
         class561.method4235(65536);
         class53.method359(arg0 + -6218);
         class106.method1016(-1);
         class471.method3665(arg0 + 26);
         class461.method3583(-115);
         class218.method1885(arg0 + 109);
         class463.method3593((byte)58);
         class361.method2953(0);
         class789.method5717(108);
         class187.method1681((byte)-126);
         class284.method2367(28456);
         class416.method3321((byte)126);
         class786.method5706((byte)-94);
         class249.method2118(1000);
         class630.method4612(126);
         class88.method844((byte)55);
         class639.method4667((byte)-22);
         class701.method5161(-99);
         class586.method4382(false);
         class658.method4849((byte)97);
         class716.method5299(-65534);
         class337.method2747(0);
         class686.method5060(64);
         class569.method4280((byte)-44);
         class612.method4511(770);
         class312.method2600((byte)83);
         class210.method1829(2);
         class492.method3809(arg0 ^ -22);
         class723.method5343(false);
         class683.method5049(false);
         class356.method2913(81);
         class86.method835((byte)-56);
         class115.method1068((byte)-120);
         class562.method4240((byte)116);
         class291.method2453(0);
         class497.method3861((byte)5);
         class516.method3994(-1);
         class449.method3526((byte)64);
         class534.method4107(arg0 ^ -95);
         class247.method2100((byte)79);
         class153.method1392(false);
         class121.method1124(-1);
         class84.method816(-436142336);
         class585.method4376(21672);
         class21.method153(107);
         class576.method4321(-31106);
         class149.method1365((byte)-85);
         class263.method2283(arg0 + 56);
         class648.method4707(0);
         class62.method477((byte)18);
         class581.method4344(-128);
         class659.method4856((byte)120);
         class476.method3701(false);
         class571.method4296(arg0 ^ 101);
         class232.method1997(true);
         class785.method5699(true);
         class20.method147(116);
         class129.method1225((byte)120);
         class111.method1049((byte)-95);
         class739.method5426(-7712);
         class261.method2268(true);
         class301.method2518(110);
         class502.method3888((byte)120);
         class721.method5332(100);
         class654.method4823(108);
         class510.method3963((byte)-123);
         class479.method3726(123);
         class376.method3081(1);
         class611.method4506(3398);
         class219.method1895((byte)-13);
         class8.method36(arg0 + 1356126160);
         class513.method3979(arg0 + -80);
         class384.method3112((byte)-65);
         class372.method3035(arg0 + -76);
         class670.method4934((byte)-113);
         class332.method2704(arg0 + -19975);
         class564.method4257(true);
         class544.method4151(false);
         class682.method5045(2);
         class183.method1661(118);
         class695.method5110((byte)67);
         class664.method4907(arg0 ^ -12038);
         class674.method4967((byte)-50);
         class719.method5319(arg0 + -2147483625);
         class525.method4051(-111);
         class185.method1668(0);
         class775.method5633((byte)62);
         class173.method1593((byte)-89);
         class542.method4141((byte)108);
         class227.method1964((byte)-119);
         class556.method4214(arg0 ^ -122);
         class424.method3362((byte)126);
         class126.method1192(103);
         class382.method3106((byte)-86);
         class467.method3626(4095);
         class137.method1271(765);
         class722.method5338(-26756);
         class633.method4630(3);
         class446.method3500((byte)-121);
         class511.method3972(106);
         class83.method807(10);
         class44.method316(0);
         class651.method4723(-1);
         class552.method4189(2);
         class717.method5306(3);
         class363.method2958((byte)-105);
         class733.method5398(83);
         class741.method5442(false);
         class124.method1178((byte)-70);
         class265.method2290(1);
         class206.method1795((byte)94);
         class316.method2619((byte)121);
         class13.method97(arg0 + -102);
         class48.method341(true);
         class730.method5385((byte)-117);
         class766.method5598(114);
         class590.method4400((byte)-14);
         class52.method353(false);
         class302.method2526((byte)-38);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1787[50] + arg0 + ')');
      }

      if (class699.field10417) {
         field1786 = !var2;
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V",
      line = 1809
   )
   public static final void method1161() {
      int var0 = class728.field10861;
      int[] var1 = class17.field223;
      int var2 = class99.field1389 ? var0 : class615.field8929 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class119 var4;
         if (var3 < var0) {
            var4 = class484.field7370[var1[var3]];
         } else {
            var4 = ((class795)class501.field7665.method3141((long)class334.field5139[var3 - var0], true)).field11592;
         }

         if (var4.field1623 >= 0) {
            int var5 = var4.method61((byte)70);
            if ((var5 & 1) == 0) {
               if ((var4.field1505 & 511) == 0 && (var4.field1494 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field1505 & 511) == 256 && (var4.field1494 & 511) == 256) {
               continue;
            }

            var4.field1495 = class477.method3711(var4.field1506, var4.field1505, (byte)0, var4.field1494);
            class363.method2960(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "i",
      descriptor = "(I)V",
      line = 1854
   )
   public static final void method1162(int arg0) {
      int var1 = class728.field10861;
      int[] var2 = class17.field223;
      int var3 = class99.field1389 ? var1 : class615.field8929 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class119 var5;
         if (var4 < var1) {
            var5 = class484.field7370[var2[var4]];
         } else {
            var5 = ((class795)class501.field7665.method3141((long)class334.field5139[var4 - var1], true)).field11592;
         }

         if (var5.field1506 == arg0) {
            var5.field1610 = 0;
            if (var5.field1623 < 0) {
               var5.field1601 = false;
            } else {
               int var6 = var5.method61((byte)70);
               if ((var6 & 1) == 0) {
                  if ((var5.field1505 & 511) != 0 || (var5.field1494 & 511) != 0) {
                     var5.field1601 = false;
                     continue;
                  }
               } else if ((var5.field1505 & 511) != 256 || (var5.field1494 & 511) != 256) {
                  var5.field1601 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field1505 >> 9;
                  int var8 = var5.field1494 >> 9;
                  if (class415.field6440[var7][var8] != var5.field1623) {
                     var5.field1601 = true;
                     continue;
                  }

                  if (class692.field10300[var7][var8] > 1) {
                     var10002 = class692.field10300[var7][var8]--;
                     var5.field1601 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field1505 - var9 >> 9;
                  int var11 = var5.field1494 - var9 >> 9;
                  int var12 = var5.field1505 + var9 >> 9;
                  int var13 = var5.field1494 + var9 >> 9;
                  if (!class754.method5532(var13, var10, var5.field1623, 2753, var12, var11)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class415.field6440[var14][var15] == var5.field1623) {
                              var10002 = class692.field10300[var14][var15]--;
                           }
                        }
                     }

                     var5.field1601 = true;
                     continue;
                  }
               }

               var5.field1601 = false;
               var5.field1495 = class477.method3711(var5.field1506, var5.field1505, (byte)0, var5.field1494);
               class363.method2960(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V",
      line = 1969
   )
   public static final void main(String[] arg0) {
      boolean var1 = field1786;

      try {
         try {
            if (arg0.length != 6) {
               class793.method5732(field1787[88], (byte)17);
            }

            label103: {
               class546.field8194 = new class541();
               class546.field8194.field8150 = Integer.parseInt(arg0[0]);
               class663.field9937 = new class541();
               class663.field9937.field8150 = Integer.parseInt(arg0[1]);
               class657.field9823 = class129.field1851;
               if (arg0[3].equals(field1787[86])) {
                  class246.field3726 = class301.field4717;
                  if (!var1) {
                     break label103;
                  }
               }

               if (arg0[3].equals(field1787[87])) {
                  class246.field3726 = class391.field6149;
                  if (!var1) {
                     break label103;
                  }
               }

               if (arg0[3].equals(field1787[93])) {
                  class246.field3726 = class621.field9033;
                  if (!var1) {
                     break label103;
                  }
               }

               class793.method5732(field1787[10], (byte)17);
            }

            class493.field7455 = class603.method4458(arg0[4], -97);
            if (class493.field7455 == -1) {
               label106: {
                  if (arg0[4].equals(field1787[92])) {
                     class493.field7455 = 0;
                     if (!var1) {
                        break label106;
                     }
                  }

                  if (arg0[4].equals(field1787[91])) {
                     class493.field7455 = 1;
                     if (!var1) {
                        break label106;
                     }
                  }

                  class793.method5732(field1787[89], (byte)17);
               }
            }

            label74: {
               class774.field11383 = false;
               class777.field11408 = false;
               if (!arg0[5].equals(field1787[85])) {
                  if (arg0[5].equals(field1787[84])) {
                     class410.field6382 = class103.field1438;
                     if (!var1) {
                        break label74;
                     }
                  }

                  if (arg0[5].equals(field1787[90])) {
                     class410.field6382 = class339.field5183;
                     if (!var1) {
                        break label74;
                     }
                  }

                  if (arg0[5].equals(field1787[94])) {
                     class410.field6382 = class736.field10953;
                     if (!var1) {
                        break label74;
                     }
                  }

                  class793.method5732(field1787[16], (byte)17);
                  if (!var1) {
                     break label74;
                  }
               }

               class410.field6382 = class619.field9004;
            }

            class320.field4912 = 0;
            class395.field6192 = null;
            class5.field28 = 0L;
            class353.field5363 = 0;
            class518.field7891 = "";
            class174.field2686 = class410.field6382.field4824;
            class702.field10456 = 0;
            class168.field2578 = false;
            class506.field7756 = false;
            class625.field9068 = null;
            class376.field5984 = true;
            class197.field3035 = true;
            client var2 = new client();
            class798.field11616 = var2;
            var2.method5150(659, 768, class410.field6382.field4827, class246.field3726.method3262(true) + 32, 5000, 1024, 37, false);
            class479.field7289.setLocation(40, 40);
         } catch (Exception var5) {
            class281.method2349(1, (String)null, var5);
         }

         ++field1765;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1787[83] + (arg0 != null ? field1787[0] : field1787[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V",
      line = 2056
   )
   public static final void method1163() {
      class316.field4880 = 0;

      for(int var0 = 0; var0 < class615.field8929; ++var0) {
         class466 var1 = ((class795)class501.field7665.method3141((long)class334.field5139[var0], true)).field11592;
         if (var1.field1601 && var1.method51(-1) != -1) {
            int var2 = (var1.method61((byte)70) - 1) * 256 + 252;
            int var3 = var1.field1505 - var2 >> 9;
            int var4 = var1.field1494 - var2 >> 9;
            class119 var5 = class75.method713(var4, var3, var1.field1506, 124);
            if (var5 != null) {
               int var6 = var5.field1640;
               if (var5 instanceof class466) {
                  var6 += 2048;
               }

               if (var5.field1610 == 0 && var5.method51(-1) != -1) {
                  class119.field1652[class316.field4880] = var6;
                  class472.field7178[class316.field4880] = var6;
                  ++class316.field4880;
                  ++var5.field1610;
               }

               class119.field1652[class316.field4880] = var6;
               class472.field7178[class316.field4880] = var1.field1640 + 2048;
               ++class316.field4880;
               ++var5.field1610;
            }
         }
      }

      class654.method4824(class472.field7178, class316.field4880 - 1, 2, class119.field1652, 0);
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;BLica;)I",
      line = 2106
   )
   public static final int method1164(String arg0, byte arg1, class354 arg2) {
      try {
         ++field1777;
         int var3 = arg2.field5436;
         byte[] var4 = class761.method5580((byte)61, arg0);
         if (arg1 != -128) {
            return 126;
         } else {
            arg2.method2883(var4.length, 107);
            arg2.field5436 += class255.field3860.method3405(arg2.field5428, -101, arg2.field5436, var4.length, 0, var4);
            return arg2.field5436 - var3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1787[97] + (arg0 != null ? field1787[0] : field1787[2]) + ',' + arg1 + ',' + (arg2 != null ? field1787[0] : field1787[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(I)V",
      line = 2128
   )
   private final void method1165(int arg0) {
      try {
         ++field1778;
         boolean var2 = class522.field7958.method1845(-2);
         if (arg0 < -29) {
            if (!var2) {
               this.method1154((byte)-127);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1787[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "g",
      descriptor = "(I)V",
      line = 2147
   )
   public final void method1166(int arg0) {
      try {
         ++field1783;
         if (arg0 != 15) {
            field1773 = null;
         }

         if (class687.field10213.field507.method3440(480102311) == 2) {
            try {
               this.method1168(arg0 + -116);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class281.method2349(1, var6.getMessage() + field1787[46] + this.method1151(arg0 + -32), var6);
               class398.field6245 = true;
               class473.method3678(2744, 0, false);
            }
         } else {
            this.method1168(-2);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1787[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(I)V",
      line = 2172
   )
   public final void method1167(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V",
      line = 2292
   )
   private final void method1168(int arg0) {
      boolean var2 = field1786;

      try {
         ++field1780;
         if (class342.field5204 != 16) {
            ++class308.field4801;
            if (~(class308.field4801 % 1000) == -2) {
               GregorianCalendar var3 = new GregorianCalendar();
               class537.field8119 = var3.get(11) * 600 + 10 * var3.get(12) + var3.get(13) / 6;
               class238.field3621.setSeed((long)class537.field8119);
            }

            class510.field7801.method203(0);
            class510.field7800.method203(0);
            this.method1165(-100);
            if (class397.field6223 != null) {
               class397.field6223.method3713(-69);
            }

            class799.method5763(-126);
            class120.method1114((byte)12);
            class300.field4707.method221((byte)-21);
            class690.field10254.method2579(-50);
            if (class351.field5356 != null) {
               class351.field5356.method681((int)class162.method1442(14080));
            }

            class563.method4249(-3);
            class211.field3200 = 0;
            class202.field3089 = 0;
            if (arg0 < 0) {
               int var10000;
               label207: {
                  class132 var4 = class300.field4707.method222((byte)11);
                  if (var2) {
                     var10000 = var4.method314(-27114);
                  } else if (var4 == null) {
                     var10000 = 0;
                     if (!var2) {
                        break label207;
                     }
                  } else {
                     var10000 = var4.method314(-27114);
                  }

                  while(true) {
                     label291: {
                        int var5 = var10000;
                        if (~var5 != -3 && ~var5 != -4) {
                           if (~var5 != -1 || ~class211.field3200 <= -76) {
                              break label291;
                           }

                           class354.field5426[class211.field3200] = var4;
                           ++class211.field3200;
                           if (!var2) {
                              break label291;
                           }
                        }

                        char var6 = var4.method315(31589);
                        if (!class11.method87(false) || ~var6 != -97 && var6 != 167 && var6 != 178) {
                           if (class202.field3089 >= 128) {
                              break label291;
                           }

                           class608.field8857[class202.field3089] = var4;
                           ++class202.field3089;
                           if (!var2) {
                              break label291;
                           }
                        }

                        if (class11.method89(-98)) {
                           class762.method5584((byte)-68);
                           if (var2) {
                              class303.method2532((byte)72);
                           }
                        } else {
                           class303.method2532((byte)72);
                        }
                     }

                     var4 = class300.field4707.method222((byte)11);
                     if (var4 == null) {
                        var10000 = 0;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var4.method314(-27114);
                     }
                  }
               }

               class212.field3220 = var10000;
               class670 var7 = class690.field10254.method2576(120);
               int var8;
               if (var2) {
                  var8 = var7.method3789(-108);
                  if (var8 != -1) {
                     if (var8 != 6) {
                        if (class154.method1396(-26160, var8)) {
                           class748.field11087.method4980(var7, 0);
                           if (class748.field11087.method4971(-105) > 10) {
                              class748.field11087.method4974(124);
                              if (var2) {
                                 class212.field3220 += var7.method3792((byte)119);
                                 if (var2) {
                                    class57.field699.method4980(var7, 0);
                                 }
                              }
                           }
                        }
                     } else {
                        class212.field3220 += var7.method3792((byte)119);
                        if (var2) {
                           class57.field699.method4980(var7, 0);
                        }
                     }
                  } else {
                     class57.field699.method4980(var7, 0);
                  }

                  var7 = class690.field10254.method2576(107);
               }

               while(true) {
                  if (var7 == null) {
                     var10000 = class11.method89(-98);
                     if (!var2) {
                        if (var10000 != 0) {
                           class397.method3203(0);
                        }

                        label161: {
                           if (class59.method439(class342.field5204, 89)) {
                              class716.method5301(-73);
                              class56.method415((byte)-73);
                              if (!var2) {
                                 break label161;
                              }
                           }

                           if (class544.method4149(0, class342.field5204)) {
                              class206.method1798(6453);
                           }
                        }

                        label288: {
                           if (!class298.method2501(26256, class342.field5204) || class544.method4149(0, class342.field5204)) {
                              if (!class303.method2535(class342.field5204, -104) || class544.method4149(0, class342.field5204)) {
                                 if (class342.field5204 != 13) {
                                    if (class395.method3181(28566, class342.field5204) && !class544.method4149(0, class342.field5204)) {
                                       class785.method5701((byte)-99);
                                       if (!var2) {
                                          break label288;
                                       }
                                    }

                                    if (~class342.field5204 != -15 && ~class342.field5204 != -16) {
                                       break label288;
                                    }

                                    class258.method2196(2);
                                    if (~class536.field8114 == 2 || ~class536.field8114 == -3 || ~class536.field8114 == -16) {
                                       break label288;
                                    }

                                    if (class342.field5204 == 15) {
                                       class419.field6481 = class705.field10621;
                                       class130.field1878 = class115.field1560;
                                       class281.field4471 = class536.field8114;
                                       if (!class353.field5362) {
                                          class321.method2638(2, class686.field10207);
                                          if (!var2) {
                                             break label288;
                                          }
                                       }

                                       class48.method340(class703.field10591.field8152, class703.field10591.field8150, 0);
                                       class510.field7801.field355 = null;
                                       class69.method532(1, 14);
                                       if (!var2) {
                                          break label288;
                                       }
                                    }

                                    class321.method2638(2, false);
                                    if (!var2) {
                                       break label288;
                                    }
                                 }

                                 class258.method2196(2);
                                 if (!var2) {
                                    break label288;
                                 }
                              }

                              this.method1156(-101);
                              class258.method2196(2);
                              if (!var2) {
                                 break label288;
                              }
                           }

                           this.method1156(-55);
                           class191.method1701(-24120);
                           class258.method2196(2);
                        }

                        class593.method4412(0, class351.field5356);
                        class748.field11087.method4974(107);
                        return;
                     }
                  } else {
                     var10000 = var7.method3789(-108);
                  }

                  var8 = var10000;
                  if (var8 != -1) {
                     if (var8 != 6) {
                        if (class154.method1396(-26160, var8)) {
                           class748.field11087.method4980(var7, 0);
                           if (class748.field11087.method4971(-105) > 10) {
                              class748.field11087.method4974(124);
                              if (var2) {
                                 class212.field3220 += var7.method3792((byte)119);
                                 if (var2) {
                                    class57.field699.method4980(var7, 0);
                                 }
                              }
                           }
                        }
                     } else {
                        class212.field3220 += var7.method3792((byte)119);
                        if (var2) {
                           class57.field699.method4980(var7, 0);
                        }
                     }
                  } else {
                     class57.field699.method4980(var7, 0);
                  }

                  var7 = class690.field10254.method2576(107);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1787[80] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V",
      line = 2477
   )
   public final void init() {
      boolean var1 = field1786;

      try {
         ++field1784;
         if (this.method5142(true)) {
            label203: {
               class546.field8194 = new class541();
               class546.field8194.field8150 = Integer.parseInt(this.getParameter(field1787[32]));
               class663.field9937 = new class541();
               class663.field9937.field8150 = Integer.parseInt(this.getParameter(field1787[18]));
               class663.field9937.field8152 = this.getParameter(field1787[20]);
               class657.field9823 = class25.method183((byte)-28, Integer.parseInt(this.getParameter(field1787[25])));
               if (class657.field9823 != class129.field1851) {
                  if (class227.method1962(class657.field9823, (byte)106) || class657.field9823 == class129.field1852) {
                     break label203;
                  }

                  class657.field9823 = class129.field1852;
                  if (!var1) {
                     break label203;
                  }
               }

               class657.field9823 = class658.field9840;
            }

            class246.field3726 = class624.method4577(Integer.parseInt(this.getParameter(field1787[10])), false);
            if (class621.field9033 != class246.field3726 && class391.field6149 != class246.field3726 && class301.field4717 != class246.field3726) {
               class246.field3726 = class301.field4717;
            }

            try {
               class493.field7455 = Integer.parseInt(this.getParameter(field1787[24]));
            } catch (Exception var17) {
               class493.field7455 = 0;
            }

            label191: {
               String var2 = this.getParameter(field1787[19]);
               if (var2 != null && var2.equals("1")) {
                  class777.field11408 = true;
                  if (!var1) {
                     break label191;
                  }
               }

               class777.field11408 = false;
            }

            label212: {
               String var3 = this.getParameter(field1787[17]);
               if (var3 == null || !var3.equals("1")) {
                  class774.field11383 = false;
                  if (!var1) {
                     break label212;
                  }
               }

               class774.field11383 = true;
            }

            label213: {
               String var4 = this.getParameter(field1787[13]);
               if (var4 == null || !var4.equals("1")) {
                  class70.field922 = false;
                  if (!var1) {
                     break label213;
                  }
               }

               class70.field922 = true;
            }

            String var5 = this.getParameter(field1787[16]);
            if (var5 != null) {
               label210: {
                  if (var5.equals("0")) {
                     class410.field6382 = class619.field9004;
                     if (!var1) {
                        break label210;
                     }
                  }

                  if (var5.equals("1")) {
                     class410.field6382 = class103.field1438;
                     if (!var1) {
                        break label210;
                     }
                  }

                  if (!var5.equals("2")) {
                     if (!var5.equals("3")) {
                        break label210;
                     }

                     class410.field6382 = class736.field10953;
                     if (!var1) {
                        break label210;
                     }
                  }

                  class410.field6382 = class339.field5183;
               }
            }

            try {
               class320.field4912 = Integer.parseInt(this.getParameter(field1787[30]));
            } catch (Exception var16) {
               class320.field4912 = 0;
            }

            class579.field8559 = this.getParameter(field1787[12]);
            class518.field7891 = this.getParameter(field1787[28]);
            if (class518.field7891 == null) {
               class518.field7891 = "";
            }

            class283.field4478 = "1".equals(this.getParameter(field1787[11]));
            String var6 = this.getParameter(field1787[31]);
            if (var6 != null) {
               try {
                  class702.field10456 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class702.field10456 = 0;
               }
            }

            class174.field2686 = Integer.parseInt(this.getParameter(field1787[27]));
            if (~class174.field2686 > -1 || ~class174.field2686 <= ~class222.field3347.length) {
               class174.field2686 = 0;
            }

            if (~Integer.parseInt(this.getParameter(field1787[15])) == -2) {
               class376.field5984 = true;
               class197.field3035 = true;
            }

            String var7 = this.getParameter(field1787[22]);
            if (var7 != null && var7.equals(field1787[8])) {
               class506.field7756 = true;
            }

            String var8 = this.getParameter(field1787[9]);
            if (var8 != null) {
               class625.field9068 = class389.method3140(class248.method2114(var8, (byte)102), (byte)-127);
               if (~class625.field9068.length > -17) {
                  class625.field9068 = null;
               }
            }

            String var9 = this.getParameter(field1787[14]);
            if (var9 != null && var9.equals(field1787[8])) {
               class168.field2578 = true;
            }

            String var10 = this.getParameter(field1787[29]);
            if (var10 != null) {
               try {
                  class353.field5363 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field1787[21]);
            if (var11 != null) {
               try {
                  class5.field28 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class395.field6192 = this.getParameter(field1787[23]);
            if (class395.field6192 != null && class395.field6192.length() > 50) {
               class395.field6192 = null;
            }

            label134: {
               if (class619.field9004 == class410.field6382) {
                  class154.field2293 = 765;
                  class445.field6835 = 503;
                  if (!var1) {
                     break label134;
                  }
               }

               if (class410.field6382 == class103.field1438) {
                  class154.field2293 = 640;
                  class445.field6835 = 480;
               }
            }

            class798.field11616 = this;
            this.method5145(class445.field6835, class410.field6382.field4827, class246.field3726.method3262(true) + 32, 659, class154.field2293, (byte)10, 37);
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field1787[26] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Lfq;)Z",
      line = 2639
   )
   public static final boolean method1169(class374 arg0) {
      if (class351.field5351) {
         if (method1148(arg0).field898 != 0) {
            return false;
         }

         if (arg0.field5910 == 0) {
            return false;
         }
      }

      return arg0.field5785;
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(IB)Z",
      line = 2652
   )
   public static final boolean method1170(int arg0, byte arg1) {
      try {
         ++field1772;
         if (class14.field181[arg0]) {
            return true;
         } else if (!class70.field919.method5000(arg0, arg1 ^ -2913)) {
            return false;
         } else if (arg1 != -119) {
            return true;
         } else {
            int var2 = class70.field919.method4998((byte)-82, arg0);
            if (~var2 == -1) {
               class14.field181[arg0] = true;
               return true;
            } else {
               if (class296.field4672[arg0] == null) {
                  class296.field4672[arg0] = new class374[var2];
               }

               for(int var3 = 0; ~var2 < ~var3; ++var3) {
                  if (class296.field4672[arg0][var3] == null) {
                     byte[] var4 = class70.field919.method5017(arg0, var3, (byte)71);
                     if (var4 != null) {
                        class374 var5 = class296.field4672[arg0][var3] = new class374();
                        var5.field5840 = (arg0 << 16) - -var3;
                        if (var4[0] != -1) {
                           throw new IllegalStateException(field1787[96]);
                        }

                        var5.method3066((byte)-57, new class354(var4));
                     }
                  }
               }

               class14.field181[arg0] = true;
               return true;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1787[95] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V",
      line = 2714
   )
   public static final void method1171() {
      for(int var0 = 0; var0 < class513.field7828; ++var0) {
         int[] var1 = class415.field6440[var0];

         for(int var2 = 0; var2 < class475.field7230; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Lfq;IIIIIIIIIII)V",
      line = 2733
   )
   public static final void method1172(class374[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label864:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class374 var13 = arg0[var12];
         if (var13 != null && var13.field5830 == arg1) {
            int var14 = var13.field5845 + arg6;
            int var15 = var13.field5879 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field5910 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field5849 + var14;
               int var21 = var13.field5915 + var15;
               if (var13.field5910 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field5910 != 0 && !var13.field5904 && method1148(var13).field898 == 0 && class432.field6655 != var13 && class431.field6649 != var13.field5917 && class577.field8530 != var13.field5917) {
               if (var16 < var18 && var17 < var19) {
                  class700.method5156(var13, (byte)-101);
               }
            } else if (!method1169(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class281.field4472) {
                  var22 = class600.method4443(0);
                  var23 = class218.method1890(0);
               }

               if (class358.field5551 == var13 && class576.method4319(class358.field5551, 0) != null) {
                  class176.field2769 = true;
                  class678.field10113 = var14;
                  class376.field5985 = var15;
               }

               if (var13.field5803 || var16 < var18 && var17 < var19) {
                  if (var13.field5923 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class36 var24 = (class36)class678.field10117.method4972((byte)-84); var24 != null; var24 = (class36)class678.field10117.method4975((byte)109)) {
                        if (var24.field438) {
                           var24.method2477(1976);
                           var24.field441.field5945 = false;
                        }
                     }

                     if (class58.field719 == 0) {
                        class358.field5551 = null;
                        class432.field6655 = null;
                     }

                     class396.field6216 = 0;
                     class633.field9158 = false;
                     class775.field11392 = false;
                     if (!class304.field4759) {
                        class181.method1642((byte)126);
                     }
                  }

                  boolean var25;
                  if (class690.field10254.method2571(57) + var22 >= var16 && class690.field10254.method2578(true) + var23 >= var17 && class690.field10254.method2571(112) + var22 < var18 && class690.field10254.method2578(true) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class552.field8264 && var25) {
                     if (var13.field5884 >= 0) {
                        class436.field6683 = var13.field5884;
                     } else if (var13.field5923) {
                        class436.field6683 = -1;
                     }
                  }

                  if (!class304.field4759 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class130.method1228(1, var13, arg10 - var14, arg11 - var15);
                  }

                  boolean var26 = false;
                  if (class690.field10254.method2582((byte)-124) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class670 var28 = (class670)class748.field11087.method4972((byte)-84);
                  if (var28 != null && var28.method3789(-115) == 0 && var28.method3790(8) + var22 >= var16 && var28.method3793(1) + var23 >= var17 && var28.method3790(8) + var22 < var18 && var28.method3793(1) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field5790 != null && !class11.method89(-98)) {
                     for(int var29 = 0; var29 < var13.field5790.length; ++var29) {
                        if (!class300.field4707.method219(var13.field5790[var29], (byte)-96)) {
                           if (var13.field5880 != null) {
                              var13.field5880[var29] = 0;
                           }
                        } else if (var13.field5880 == null || class308.field4801 >= var13.field5880[var29]) {
                           byte var30 = var13.field5944[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class300.field4707.method219(86, (byte)-83) && !class300.field4707.method219(82, (byte)-103) && !class300.field4707.method219(81, (byte)-113)) && ((var30 & 2) == 0 || class300.field4707.method219(86, (byte)-108)) && ((var30 & 1) == 0 || class300.field4707.method219(82, (byte)-77)) && ((var30 & 4) == 0 || class300.field4707.method219(81, (byte)-25))) {
                              if (var29 < 10) {
                                 class24.method177(var29 + 1, var13.field5840, (byte)9, -1, "");
                              } else if (var29 == 10) {
                                 class411.method3292(2827);
                                 class68 var31 = method1148(var13);
                                 class438.method3446(false, var31.field900, var31.method520((byte)42), var13);
                                 class443.field6803 = class593.method4418(-124, var13);
                                 if (class443.field6803 == null) {
                                    class443.field6803 = field1787[5];
                                 }

                                 class65.field860 = var13.field5826 + field1787[6];
                              }

                              int var32 = var13.field5936[var29];
                              if (var13.field5880 == null) {
                                 var13.field5880 = new int[var13.field5790.length];
                              }

                              if (var32 != 0) {
                                 var13.field5880[var29] = class308.field4801 + var32;
                              } else {
                                 var13.field5880[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class491.method3801(var23 + var28.method3793(1) - var15, 20, var22 + var28.method3790(8) - var14, var13);
                  }

                  if (class358.field5551 != null && class358.field5551 != var13 && var25 && method1148(var13).method521(1)) {
                     class194.field3017 = var13;
                  }

                  if (class432.field6655 == var13) {
                     class717.field10744 = true;
                     class76.field980 = var14;
                     class37.field453 = var15;
                  }

                  if (var13.field5904 || var13.field5917 != 0) {
                     if (var25 && class212.field3220 != 0 && var13.field5863 != null) {
                        class36 var33 = new class36();
                        var33.field438 = true;
                        var33.field441 = var13;
                        var33.field436 = class212.field3220;
                        var33.field437 = var13.field5863;
                        class678.field10117.method4980(var33, 0);
                     }

                     if (class358.field5551 != null || class304.field4759 || class580.field8569 != var13.field5917 && class396.field6216 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field5917 != 0) {
                        if (class707.field10649 == var13.field5917 || class287.field4518 == var13.field5917) {
                           class494.field7460 = var13;
                           if (class354.field5400 != null) {
                              class354.field5400.method3396(var13.field5915, class687.field10213.field515.method5379(480102311), (byte)87, class351.field5356);
                           }

                           if (class707.field10649 == var13.field5917) {
                              if (class304.field4759 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class90.method859(class351.field5356, true, arg8, arg9);
                              class626 var34 = (class626)class481.field7315.method1815(1);

                              while(true) {
                                 if (var34 == null) {
                                    continue label864;
                                 }

                                 if (arg10 >= var34.field9071 && arg10 < var34.field9074 && arg11 >= var34.field9076 && arg11 < var34.field9078) {
                                    class181.method1642((byte)-49);
                                    class16.method126(-109, var34.field9072);
                                 }

                                 var34 = (class626)class481.field7315.method1817(0);
                              }
                           }
                        }

                        if (class431.field6649 == var13.field5917) {
                           if (var13.method3069(class351.field5356, (byte)-72) == null || class79.field1054 != 0 && class79.field1054 != 3 || class304.field4759 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field5843[var36];
                           if (var35 < var37 || var35 > var13.field5874[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field5849 / 2;
                           int var39 = var36 - var13.field5915 / 2;
                           int var40;
                           if (class648.field9340 == 4) {
                              var40 = (int)class417.field6456 & 16383;
                           } else {
                              var40 = (int)class417.field6456 + class438.field6710 & 16383;
                           }

                           int var41 = class83.field1196[var40];
                           int var42 = class83.field1194[var40];
                           if (class648.field9340 != 4) {
                              var41 = (class243.field3683 + 256) * var41 >> 8;
                              var42 = (class243.field3683 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class648.field9340 == 4) {
                              var45 = (class640.field9280 >> 9) + (var43 >> 2);
                              var46 = (class520.field7902 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class476.field7251.method61((byte)70) - 1) * 256;
                              var45 = (class476.field7251.field1505 - var47 >> 9) + (var43 >> 2);
                              var46 = (class476.field7251.field1494 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class552.field8264 && (class441.field6793 & 64) != 0) {
                              class374 var48 = class221.method1912(class175.field2750, -85, class105.field1459);
                              if (var48 != null) {
                                 class91.method921(var13.field5927, true, 1L, var45, true, false, true, class698.field10378, class443.field6803, field1787[7], var46, (long)(var13.field5848 << 0 | var13.field5840), 6);
                              } else {
                                 class411.method3292(2827);
                              }
                              continue;
                           }

                           if (class410.field6382 == class103.field1438) {
                              class91.method921(-1, true, 1L, var45, true, false, true, -1, class499.field7615.method3875(class493.field7455, 123), "", var46, 0L, 57);
                           }

                           class91.method921(-1, true, 1L, var45, true, false, true, class381.field6029, class659.field9847, "", var46, 0L, 44);
                           continue;
                        }

                        if (class580.field8569 == var13.field5917) {
                           class334.field5138 = var13;
                           if (var25) {
                              class633.field9158 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method3790(8) - var14 - var13.field5849 / 2) * 2.0D / (double)class60.field751);
                              int var50 = (int)(-((double)(var23 + var28.method3793(1) - var15 - var13.field5915 / 2) * 2.0D / (double)class60.field751));
                              int var51 = class354.field5389 + var49 + class60.field774;
                              int var52 = class546.field8195 + var50 + class60.field763;
                              class191 var53 = class370.method3027((byte)-123);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method1703((byte)106, var52, var54, var51);
                              if (var54 != null) {
                                 if (class300.field4707.method219(82, (byte)-76) && class487.field7404 > 0) {
                                    class388.method3133(var54[1], 11301, var54[2], var54[0]);
                                    continue;
                                 }

                                 class775.field11392 = true;
                                 class547.field8197 = var54[0];
                                 class719.field10780 = var54[1];
                                 class514.field7837 = var54[2];
                              }

                              class396.field6216 = 1;
                              class796.field11595 = false;
                              class36.field427 = class690.field10254.method2571(56);
                              class17.field229 = class690.field10254.method2578(true);
                              continue;
                           }

                           if (var26 && class396.field6216 > 0) {
                              if (class396.field6216 == 1 && (class36.field427 != class690.field10254.method2571(114) || class17.field229 != class690.field10254.method2578(true))) {
                                 class419.field6483 = class354.field5389;
                                 class696.field10332 = class546.field8195;
                                 class396.field6216 = 2;
                              }

                              if (class396.field6216 == 2) {
                                 class796.field11595 = true;
                                 class780.method5665(class419.field6483 + (int)((double)(class36.field427 - class690.field10254.method2571(62)) * 2.0D / (double)class60.field748), 114);
                                 class48.method339(-1, class696.field10332 - (int)((double)(class17.field229 - class690.field10254.method2578(true)) * 2.0D / (double)class60.field748));
                              }
                              continue;
                           }

                           if (class396.field6216 > 0 && !class796.field11595) {
                              if ((class504.field7688 == 1 || class748.method5499(6)) && class558.field8307 > 2) {
                                 class146.method1324(class17.field229, -54, class36.field427);
                              } else if (class317.method2623((byte)37)) {
                                 class146.method1324(class17.field229, -48, class36.field427);
                              }
                           }

                           class396.field6216 = 0;
                           continue;
                        }

                        if (class459.field7007 == var13.field5917) {
                           if (var26) {
                              class85.method830(var23 + class690.field10254.method2578(true) - var15, var22 + class690.field10254.method2571(82) - var14, (byte)-71, var13.field5915, var13.field5849);
                           }
                           continue;
                        }

                        if (class577.field8530 == var13.field5917) {
                           class99.method968(true, var15, var13, var14);
                           continue;
                        }
                     }

                     if (!var13.field5806 && var27) {
                        var13.field5806 = true;
                        if (var13.field5869 != null) {
                           class36 var55 = new class36();
                           var55.field438 = true;
                           var55.field441 = var13;
                           var55.field431 = var22 + var28.method3790(8) - var14;
                           var55.field436 = var23 + var28.method3793(1) - var15;
                           var55.field437 = var13.field5869;
                           class678.field10117.method4980(var55, 0);
                        }
                     }

                     if (var13.field5806 && var26 && var13.field5883 != null) {
                        class36 var56 = new class36();
                        var56.field438 = true;
                        var56.field441 = var13;
                        var56.field431 = var22 + class690.field10254.method2571(56) - var14;
                        var56.field436 = var23 + class690.field10254.method2578(true) - var15;
                        var56.field437 = var13.field5883;
                        class678.field10117.method4980(var56, 0);
                     }

                     if (var13.field5806 && !var26) {
                        var13.field5806 = false;
                        if (var13.field5784 != null) {
                           class36 var57 = new class36();
                           var57.field438 = true;
                           var57.field441 = var13;
                           var57.field431 = var22 + class690.field10254.method2571(104) - var14;
                           var57.field436 = var23 + class690.field10254.method2578(true) - var15;
                           var57.field437 = var13.field5784;
                           class390.field6136.method4980(var57, 0);
                        }
                     }

                     if (var26 && var13.field5881 != null) {
                        class36 var58 = new class36();
                        var58.field438 = true;
                        var58.field441 = var13;
                        var58.field431 = var22 + class690.field10254.method2571(114) - var14;
                        var58.field436 = var23 + class690.field10254.method2578(true) - var15;
                        var58.field437 = var13.field5881;
                        class678.field10117.method4980(var58, 0);
                     }

                     if (!var13.field5945 && var25) {
                        var13.field5945 = true;
                        if (var13.field5802 != null) {
                           class36 var59 = new class36();
                           var59.field438 = true;
                           var59.field441 = var13;
                           var59.field431 = var22 + class690.field10254.method2571(122) - var14;
                           var59.field436 = var23 + class690.field10254.method2578(true) - var15;
                           var59.field437 = var13.field5802;
                           class678.field10117.method4980(var59, 0);
                        }
                     }

                     if (var13.field5945 && var25 && var13.field5887 != null) {
                        class36 var60 = new class36();
                        var60.field438 = true;
                        var60.field441 = var13;
                        var60.field431 = var22 + class690.field10254.method2571(85) - var14;
                        var60.field436 = var23 + class690.field10254.method2578(true) - var15;
                        var60.field437 = var13.field5887;
                        class678.field10117.method4980(var60, 0);
                     }

                     if (var13.field5945 && !var25) {
                        var13.field5945 = false;
                        if (var13.field5857 != null) {
                           class36 var61 = new class36();
                           var61.field438 = true;
                           var61.field441 = var13;
                           var61.field431 = var22 + class690.field10254.method2571(125) - var14;
                           var61.field436 = var23 + class690.field10254.method2578(true) - var15;
                           var61.field437 = var13.field5857;
                           class390.field6136.method4980(var61, 0);
                        }
                     }

                     if (var13.field5921 != null) {
                        class36 var62 = new class36();
                        var62.field441 = var13;
                        var62.field437 = var13.field5921;
                        class425.field6570.method4980(var62, 0);
                     }

                     if (var13.field5908 != null && class571.field8452 > var13.field5925) {
                        if (var13.field5855 != null && class571.field8452 - var13.field5925 <= 32) {
                           label751:
                           for(int var63 = var13.field5925; var63 < class571.field8452; ++var63) {
                              int var64 = class70.field917[var63 & 31];

                              for(int var65 = 0; var65 < var13.field5855.length; ++var65) {
                                 if (var13.field5855[var65] == var64) {
                                    class36 var66 = new class36();
                                    var66.field441 = var13;
                                    var66.field437 = var13.field5908;
                                    class678.field10117.method4980(var66, 0);
                                    break label751;
                                 }
                              }
                           }
                        } else {
                           class36 var67 = new class36();
                           var67.field441 = var13;
                           var67.field437 = var13.field5908;
                           class678.field10117.method4980(var67, 0);
                        }

                        var13.field5925 = class571.field8452;
                     }

                     if (var13.field5892 != null && class530.field8033 > var13.field5953) {
                        if (var13.field5831 != null && class530.field8033 - var13.field5953 <= 32) {
                           label727:
                           for(int var68 = var13.field5953; var68 < class530.field8033; ++var68) {
                              int var69 = class314.field4856[var68 & 31];

                              for(int var70 = 0; var70 < var13.field5831.length; ++var70) {
                                 if (var13.field5831[var70] == var69) {
                                    class36 var71 = new class36();
                                    var71.field441 = var13;
                                    var71.field437 = var13.field5892;
                                    class678.field10117.method4980(var71, 0);
                                    break label727;
                                 }
                              }
                           }
                        } else {
                           class36 var72 = new class36();
                           var72.field441 = var13;
                           var72.field437 = var13.field5892;
                           class678.field10117.method4980(var72, 0);
                        }

                        var13.field5953 = class530.field8033;
                     }

                     if (var13.field5913 != null && class79.field1056 > var13.field5853) {
                        if (var13.field5817 != null && class79.field1056 - var13.field5853 <= 32) {
                           label703:
                           for(int var73 = var13.field5853; var73 < class79.field1056; ++var73) {
                              int var74 = class103.field1441[var73 & 31];

                              for(int var75 = 0; var75 < var13.field5817.length; ++var75) {
                                 if (var13.field5817[var75] == var74) {
                                    class36 var76 = new class36();
                                    var76.field441 = var13;
                                    var76.field437 = var13.field5913;
                                    class678.field10117.method4980(var76, 0);
                                    break label703;
                                 }
                              }
                           }
                        } else {
                           class36 var77 = new class36();
                           var77.field441 = var13;
                           var77.field437 = var13.field5913;
                           class678.field10117.method4980(var77, 0);
                        }

                        var13.field5853 = class79.field1056;
                     }

                     if (var13.field5832 != null && class560.field8327 > var13.field5804) {
                        if (var13.field5926 != null && class560.field8327 - var13.field5804 <= 32) {
                           label679:
                           for(int var78 = var13.field5804; var78 < class560.field8327; ++var78) {
                              int var79 = class290.field4579[var78 & 31];

                              for(int var80 = 0; var80 < var13.field5926.length; ++var80) {
                                 if (var13.field5926[var80] == var79) {
                                    class36 var81 = new class36();
                                    var81.field441 = var13;
                                    var81.field437 = var13.field5832;
                                    class678.field10117.method4980(var81, 0);
                                    break label679;
                                 }
                              }
                           }
                        } else {
                           class36 var82 = new class36();
                           var82.field441 = var13;
                           var82.field437 = var13.field5832;
                           class678.field10117.method4980(var82, 0);
                        }

                        var13.field5804 = class560.field8327;
                     }

                     if (var13.field5900 != null && class87.field1266 > var13.field5834) {
                        if (var13.field5777 != null && class87.field1266 - var13.field5834 <= 32) {
                           label655:
                           for(int var83 = var13.field5834; var83 < class87.field1266; ++var83) {
                              int var84 = class151.field2271[var83 & 31];

                              for(int var85 = 0; var85 < var13.field5777.length; ++var85) {
                                 if (var13.field5777[var85] == var84) {
                                    class36 var86 = new class36();
                                    var86.field441 = var13;
                                    var86.field437 = var13.field5900;
                                    class678.field10117.method4980(var86, 0);
                                    break label655;
                                 }
                              }
                           }
                        } else {
                           class36 var87 = new class36();
                           var87.field441 = var13;
                           var87.field437 = var13.field5900;
                           class678.field10117.method4980(var87, 0);
                        }

                        var13.field5834 = class87.field1266;
                     }

                     if (var13.field5833 != null && class42.field565 > var13.field5929) {
                        if (var13.field5854 != null && class42.field565 - var13.field5929 <= 32) {
                           label631:
                           for(int var88 = var13.field5929; var88 < class42.field565; ++var88) {
                              int var89 = class330.field5014[var88 & 31];

                              for(int var90 = 0; var90 < var13.field5854.length; ++var90) {
                                 if (var13.field5854[var90] == var89) {
                                    class36 var91 = new class36();
                                    var91.field441 = var13;
                                    var91.field437 = var13.field5833;
                                    class678.field10117.method4980(var91, 0);
                                    break label631;
                                 }
                              }
                           }
                        } else {
                           class36 var92 = new class36();
                           var92.field441 = var13;
                           var92.field437 = var13.field5833;
                           class678.field10117.method4980(var92, 0);
                        }

                        var13.field5929 = class42.field565;
                     }

                     if (class314.field4859 > var13.field5859 && var13.field5801 != null) {
                        class36 var93 = new class36();
                        var93.field441 = var13;
                        var93.field437 = var13.field5801;
                        class678.field10117.method4980(var93, 0);
                     }

                     if (class746.field11069 > var13.field5859 && var13.field5861 != null) {
                        class36 var94 = new class36();
                        var94.field441 = var13;
                        var94.field437 = var13.field5861;
                        class678.field10117.method4980(var94, 0);
                     }

                     if (class358.field5525 > var13.field5859 && var13.field5876 != null) {
                        class36 var95 = new class36();
                        var95.field441 = var13;
                        var95.field437 = var13.field5876;
                        class678.field10117.method4980(var95, 0);
                     }

                     if (class739.field10978 > var13.field5859 && var13.field5946 != null) {
                        class36 var96 = new class36();
                        var96.field441 = var13;
                        var96.field437 = var13.field5946;
                        class678.field10117.method4980(var96, 0);
                     }

                     if (class483.field7360 > var13.field5859 && var13.field5841 != null) {
                        class36 var97 = new class36();
                        var97.field441 = var13;
                        var97.field437 = var13.field5841;
                        class678.field10117.method4980(var97, 0);
                     }

                     if (class38.field458 > var13.field5859 && var13.field5902 != null) {
                        class36 var98 = new class36();
                        var98.field441 = var13;
                        var98.field437 = var13.field5902;
                        class678.field10117.method4980(var98, 0);
                     }

                     if (class450.field6886 > var13.field5859 && var13.field5795 != null) {
                        class36 var99 = new class36();
                        var99.field441 = var13;
                        var99.field437 = var13.field5795;
                        class678.field10117.method4980(var99, 0);
                     }

                     var13.field5859 = class1.field6;
                     if (var13.field5888 != null) {
                        for(int var100 = 0; var100 < class202.field3089; ++var100) {
                           class36 var101 = new class36();
                           var101.field441 = var13;
                           var101.field434 = class608.field8857[var100].method319(4618);
                           var101.field425 = class608.field8857[var100].method315(31589);
                           var101.field437 = var13.field5888;
                           class678.field10117.method4980(var101, 0);
                        }
                     }

                     if (class480.field7295 && var13.field5820 != null) {
                        class36 var102 = new class36();
                        var102.field441 = var13;
                        var102.field437 = var13.field5820;
                        class678.field10117.method4980(var102, 0);
                     }
                  }

                  if (var13.field5910 == 5 && var13.field5844 != -1) {
                     var13.method3061((byte)118, class88.field1274, class739.field10975).method3396(var13.field5915, class687.field10213.field515.method5379(480102311), (byte)87, class351.field5356);
                  }

                  class700.method5156(var13, (byte)-89);
                  if (var13.field5910 == 0) {
                     method1172(arg0, var13.field5840, var16, var17, var18, var19, var14 - var13.field5809, var15 - var13.field5812, arg8, arg9, arg10, arg11);
                     if (var13.field5829 != null) {
                        method1172(var13.field5829, var13.field5840, var16, var17, var18, var19, var14 - var13.field5809, var15 - var13.field5812, arg8, arg9, arg10, arg11);
                     }

                     class276 var103 = (class276)class507.field7766.method3141((long)var13.field5840, true);
                     if (var103 != null) {
                        if (class619.field9004 == class410.field6382 && var103.field4406 == 0 && !class304.field4759 && var25 && !class351.field5351) {
                           class181.method1642((byte)127);
                        }

                        class555.method4210(arg11, var16, arg9, arg8, var14, var17, var19, arg10, var18, false, var15, var103.field4404);
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Z)V",
      line = 3707
   )
   public final void method1173(boolean arg0) {
      try {
         label26: {
            ++field1779;
            if (class687.field10213.field507.method3440(480102311) != 2) {
               this.method1155((byte)-36);
               if (!field1786) {
                  break label26;
               }
            }

            try {
               this.method1155((byte)-36);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class281.method2349(1, var6.getMessage() + field1787[46] + this.method1151(-17), var6);
               class398.field6245 = true;
               class473.method3678(2744, 0, false);
            }
         }

         if (!arg0) {
            this.method1158((byte)90, 94);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1787[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(IIII)Z",
      line = 3736
   )
   public static final boolean method1174(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1782;
         if (class439.field6716 && class665.field9966) {
            if (class84.field1223 < 100) {
               return false;
            } else {
               int var4 = class590.field8696[arg1][arg2][arg0];
               if (~(-class406.field6331) == ~var4) {
                  return false;
               } else if (~class406.field6331 == ~var4) {
                  return true;
               } else if (class385.field6076 == class190.field2949) {
                  return false;
               } else {
                  if (arg3 < 37) {
                     field1773 = null;
                  }

                  int var5 = arg2 << class394.field6180;
                  int var6 = arg0 << class394.field6180;
                  if (class355.method2909(class385.field6076[arg1].method2313(-118, arg2, arg0), class385.field6076[arg1].method2313(28, arg2 + 1, arg0 + 1), class385.field6076[arg1].method2313(31, arg2, arg0 + 1), var5 + 1, class678.field10091 + -1 + var6, class678.field10091 - 1 + var6, var6 + 1, class678.field10091 + -1 + var5, var5 - -1, 0) && class355.method2909(class385.field6076[arg1].method2313(-124, arg2, arg0), class385.field6076[arg1].method2313(84, arg2 + 1, arg0), class385.field6076[arg1].method2313(-12, arg2 - -1, arg0 - -1), class678.field10091 + -1 + var5, class678.field10091 + var6 - 1, var6 + 1, var6 - -1, class678.field10091 + -1 + var5, var5 - -1, 0)) {
                     ++class200.field3071;
                     class590.field8696[arg1][arg2][arg0] = class406.field6331;
                     return true;
                  } else {
                     class590.field8696[arg1][arg2][arg0] = -class406.field6331;
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1787[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1176(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1177(char[] arg0) {
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
            var10005 = 78;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
