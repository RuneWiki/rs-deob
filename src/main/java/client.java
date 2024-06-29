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
public class client extends class78 {
   @OriginalMember(
      owner = "client!client",
      name = "Jb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1482 = new String[]{method1002(method1001("\r-xEi\u001aoC\b")), method1002(method1001("\u00042$Ih")), method1002(method1001("\u00042$Ch\u0000/tCs1.dTh\b%pTb")), method1002(method1001("\u00042$Cu\r")), method1002(method1001("\u00042$Pu\u00019h\u007f")), method1002(method1001("\u00042$Ch\u0000/tCs")), method1002(method1001("\u00042$Ch\u0000/tCs1'dLk")), method1002(method1001("\r-xEi\u001ao^\b")), method1002(method1001("\r \u007fVf\u001d")), method1002(method1001("\r-xEi\u001aoX\b")), method1002(method1001("NiCEd\u00017tRb\nh1")), method1002(method1001("R#c\u001e")), method1002(method1001("Kh")), method1002(method1001("R#c\u001e/")), method1002(method1001("\r-xEi\u001aoD\b")), method1002(method1001("\r-xEi\u001aoPa/")), method1002(method1001("Nl/")), method1002(method1001(" 4}L")), method1002(method1001("R\"~L:\b'wFa\b\u007f")), method1002(method1001("\r-xEi\u001ao]\b")), method1002(method1001("\u0015o?\u000ez")), method1002(method1001("\u0003.uEp\u0006 e")), method1002(method1001("\u0019(a")), method1002(method1001("/3vUj\u000b/e\u0000d\u00014\u007fT")), method1002(method1001("\t |E4")), method1002(method1001("\t |E")), method1002(method1001("\u0002 \u007fGr\u000f&t")), method1002(method1001("\r-xEi\u001ao|An\u0000i")), method1002(method1001("\t$cMf\u0000")), method1002(method1001("\u000b/vLn\u001d)")), method1002(method1001("\t |E5")), method1002(method1001("\t |E7")), method1002(method1001("\t |E6")), method1002(method1001("\u001c\"")), method1002(method1001("\u00004}L")), method1002(method1001("\u0002(gE")), method1002(method1001("\r-xEi\u001aoG\b")), method1002(method1001("\r-xEi\u001aoF\b")), method1002(method1001("\r-xEi\u001aoT\b")), method1002(method1001("Wh")), method1002(method1001("\u0012u8")), method1002(method1001("\u0004 gA)\u0002 \u007fG)--pSt\".pDb\u001c")), method1002(method1001("_u8")), method1002(method1001("\u001d$ead\r$bSn\f-t")), method1002(method1001("_p8")), method1002(method1001("_s8")), method1002(method1001("\u0000 |E")), method1002(method1001("_r8")), method1002(method1001("\\h")), method1002(method1001("\u0004 gA)\u0002 \u007fG)\u001c$wLb\r5?ad\r$bSn\f-toe\u0004$rT")), method1002(method1001("\u0012w8")), method1002(method1001("\u0012t8")), method1002(method1001("Vh")), method1002(method1001("\r-xEi\u001aoR\b")), method1002(method1001("Yh")), method1002(method1001("\u0012p'\t")), method1002(method1001("\u0006 \u007fDk\u000b")), method1002(method1001("]h")), method1002(method1001("5p8")), method1002(method1001("_q8")), method1002(method1001("\u0000 eIq\u000b\rxBu\u000f3xEt")), method1002(method1001("\u001d6\"D)\n-}")), method1002(method1001("\r-xEi\u001a")), method1002(method1001("\u0012p$\t")), method1002(method1001("\r-xEi\u001ao[\b")), method1002(method1001("\r-xEi\u001aoE\b")), method1002(method1001("$ vE\u007f")), method1002(method1001("_s&\u000e7@q?\u0011")), method1002(method1001("\r-xEi\u001ao_\b")), method1002(method1001("\r-xEi\u001aoV\b")), method1002(method1001("\r-xEi\u001aoU\b")), method1002(method1001("\u001b/uEu")), method1002(method1001("\u0002 \u007fG")), method1002(method1001("\u0003.uEp\u0006$cE")), method1002(method1001("\u000f%uIs\u0007.\u007fAk'/wO")), method1002(method1001("\u0001#{Ed\u001a5pG")), method1002(method1001("\u001d$eTn\u0000&b")), method1002(method1001("\u001b2tRA\u0002.f")), method1002(method1001("\b3~Me\u0007-}Ii\t")), method1002(method1001("\u00042")), method1002(method1001("\u001f4xTr\u001c-")), method1002(method1001("\r.}Or\u001c(u")), method1002(method1001("\u001a3dE")), method1002(method1001("\u0002.sB~\u0007%")), method1002(method1001("\r-xEi\u001aoxNn\u001ai")), method1002(method1001("\r.dNs\u001c8")), method1002(method1001("\u001d(eEt\u000b5eIi\t2NMb\u0003#tR")), method1002(method1001("\b.cCbXu|B")), method1002(method1001("\u001d2zE~")), method1002(method1001("\n$|On\n")), method1002(method1001("\u000f'wIc")), method1002(method1001("\u0002.sB~\u000f%uRb\u001d2")), method1002(method1001("\u000f%gEu\u001a")), method1002(method1001("\u0019.cLc\b-pGt")), method1002(method1001("\n$|Of\n%cEt\u001d")), method1002(method1001("\u0019.cLc\u0007%"))};
   @OriginalMember(
      owner = "client!client",
      name = "Db",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1470 = new String[100];
   @OriginalMember(
      owner = "client!client",
      name = "zb",
      descriptor = "I"
   )
   public static int field1476 = 0;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "Lifa;"
   )
   public static class75 field1465 = new class75(5, 16);
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "[Lig;"
   )
   public static class142[] field1479 = new class142[50];
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field1460;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "I"
   )
   public static int field1461;
   @OriginalMember(
      owner = "client!client",
      name = "Hb",
      descriptor = "I"
   )
   public static int field1462;
   @OriginalMember(
      owner = "client!client",
      name = "Ib",
      descriptor = "I"
   )
   public static int field1463;
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "I"
   )
   public static int field1464;
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "I"
   )
   public static int field1466;
   @OriginalMember(
      owner = "client!client",
      name = "Gb",
      descriptor = "I"
   )
   public static int field1467;
   @OriginalMember(
      owner = "client!client",
      name = "Bb",
      descriptor = "I"
   )
   public static int field1468;
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "I"
   )
   public static int field1469;
   @OriginalMember(
      owner = "client!client",
      name = "Ab",
      descriptor = "I"
   )
   public static int field1471;
   @OriginalMember(
      owner = "client!client",
      name = "Cb",
      descriptor = "I"
   )
   public static int field1472;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field1473;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field1474;
   @OriginalMember(
      owner = "client!client",
      name = "yb",
      descriptor = "I"
   )
   public static int field1475;
   @OriginalMember(
      owner = "client!client",
      name = "Eb",
      descriptor = "I"
   )
   public static int field1477;
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "I"
   )
   public static int field1478;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "Fb",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1480;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "Z"
   )
   public static boolean field1481;

   @OriginalMember(
      owner = "client!client",
      name = "s",
      descriptor = "(I)V"
   )
   public static final void method982(int arg0) {
      int var1 = class304.field4255;
      int[] var2 = class710.field10421;

      for(int var3 = 0; var3 < class737.field10798 + var1; ++var3) {
         class9 var4;
         if (var3 < var1) {
            var4 = class59.field771[var2[var3]];
         } else {
            var4 = ((class411)class35.field493.method1818(-1, (long)class277.field3534[var3 - var1])).field5654;
         }

         if (var4.field10457 == arg0 && var4.field112 >= 0) {
            int var5 = var4.method78(0);
            if ((var5 & 1) == 0) {
               if ((var4.field10467 & 511) != 0 || (var4.field10468 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field10467 & 511) != 256 || (var4.field10468 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field10467 >> 9;
               int var7 = var4.field10468 >> 9;
               if (var4.field112 > class9.field191[var6][var7]) {
                  class9.field191[var6][var7] = var4.field112;
                  class28.field417[var6][var7] = 1;
               } else if (class9.field191[var6][var7] == var4.field112) {
                  var10002 = class28.field417[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field10467 - var8 >> 9;
               int var10 = var4.field10468 - var8 >> 9;
               int var11 = var4.field10467 + var8 >> 9;
               int var12 = var4.field10468 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field112 > class9.field191[var13][var14]) {
                        class9.field191[var13][var14] = var4.field112;
                        class28.field417[var13][var14] = 1;
                     } else if (class9.field191[var13][var14] == var4.field112) {
                        var10002 = class28.field417[var13][var14]++;
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method747(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "n",
      descriptor = "(I)V"
   )
   private final void method983(int arg0) {
      boolean var2 = field1481;

      try {
         ++field1463;
         if (~class213.field2712 > ~class507.field7060.field5177) {
            class44.field571.method5456(-1);
            class344.field4725 = (class507.field7060.field5177 + -1) * 5 * 50;
            if (class344.field4725 > 3000) {
               class344.field4725 = 3000;
            }

            if (~class507.field7060.field5177 <= -3 && ~class507.field7060.field5178 == -7) {
               this.method746(true, field1482[2]);
               class157.field2022 = 16;
               return;
            }

            if (~class507.field7060.field5177 <= -5 && class507.field7060.field5178 == -1) {
               this.method746(true, field1482[3]);
               class157.field2022 = 16;
               return;
            }

            if (class507.field7060.field5177 >= 4 && class275.method2172((byte)117, class157.field2022)) {
               label189: {
                  if (~class507.field7060.field5178 == -8 || ~class507.field7060.field5178 == -10) {
                     this.method746(true, field1482[6]);
                     if (!var2) {
                        break label189;
                     }
                  }

                  if (class507.field7060.field5178 <= 0) {
                     this.method746(true, field1482[1]);
                     if (!var2) {
                        break label189;
                     }
                  }

                  if (class583.field8610 == null) {
                     this.method746(true, field1482[5]);
                     if (!var2) {
                        break label189;
                     }
                  }

                  this.method746(true, field1482[4] + class583.field8610.trim());
               }

               class157.field2022 = 16;
               return;
            }
         }

         class213.field2712 = class507.field7060.field5177;
         if (class344.field4725 > 0) {
            --class344.field4725;
         } else {
            try {
               if (class103.field1334 == 0) {
                  class72.field957 = class44.field571.method5457(class366.field5092, 18746);
                  ++class103.field1334;
               }

               if (~class103.field1334 == -2) {
                  if (~class72.field957.field11210 == -3) {
                     if (class72.field957.field11212 != null) {
                        class583.field8610 = (String)class72.field957.field11212;
                     }

                     this.method989(1000, 27591);
                     return;
                  }

                  if (class72.field957.field11210 == 1) {
                     ++class103.field1334;
                  }
               }

               if (arg0 < 6) {
                  field1470 = null;
               }

               if (class103.field1334 == 2) {
                  class680.field10013 = new class471((Socket)class72.field957.field11212, class366.field5092, 25000);
                  class66 var3 = new class66(5);
                  var3.method593(class561.field8217.field69, 867770704);
                  var3.method649((byte)-124, 657);
                  class680.field10013.method3571(5, 0, var3.field859, 10);
                  ++class103.field1334;
                  class155.field2000 = class163.method1353(-122);
               }

               if (~class103.field1334 == -4) {
                  if (!class275.method2172((byte)96, class157.field2022) && ~class680.field10013.method3581(31335) >= -1) {
                     if (~(class163.method1353(-126) + -class155.field2000) < -30001L) {
                        this.method989(1001, 27591);
                        return;
                     }
                  } else {
                     int var4 = class680.field10013.method3572(1);
                     if (~var4 != -1) {
                        this.method989(var4, 27591);
                        return;
                     }

                     ++class103.field1334;
                  }
               }

               if (~class103.field1334 == -5) {
                  boolean var5 = class275.method2172((byte)94, class157.field2022) || class772.method5574(class157.field2022, 5) || class385.method3048(class157.field2022, (byte)126);
                  class461[] var6 = class461.method3515((byte)-96);
                  class66 var7 = new class66(var6.length * 4);
                  class680.field10013.method3580(var7.field859.length, var7.field859, (byte)123, 0);
                  int var8 = 0;
                  if (var2) {
                     var6[var8].method3514(var7.method610(127), (byte)91);
                     ++var8;
                  }

                  while(true) {
                     while(~var6.length < ~var8) {
                        var6[var8].method3514(var7.method610(127), (byte)91);
                        ++var8;
                     }

                     if (!var2) {
                        class507.field7060.method2919(class680.field10013, !var5, 3);
                        class103.field1334 = 0;
                        class72.field957 = null;
                        class680.field10013 = null;
                        return;
                     }

                     ++var8;
                  }
               }
            } catch (IOException var10) {
               this.method989(1002, 27591);
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field1482[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V"
   )
   public final void init() {
      boolean var1 = field1481;

      try {
         ++field1467;
         if (this.method742(-1)) {
            label198: {
               class489.field6822 = new class753();
               class489.field6822.field11035 = Integer.parseInt(this.getParameter(field1482[95]));
               class732.field10678 = new class753();
               class732.field10678.field11035 = Integer.parseInt(this.getParameter(field1482[83]));
               class732.field10678.field11029 = this.getParameter(field1482[91]);
               class485.field6754 = new class753();
               class485.field6754.field11035 = Integer.parseInt(this.getParameter(field1482[89]));
               class485.field6754.field11029 = this.getParameter(field1482[94]);
               class583.field8611 = class295.method2381(Integer.parseInt(this.getParameter(field1482[73])), false);
               if (class585.field8634 == class583.field8611) {
                  class583.field8611 = class267.field3376;
                  if (!var1) {
                     break label198;
                  }
               }

               if (!class552.method4176(class583.field8611, true) && class781.field11380 != class583.field8611) {
                  class583.field8611 = class781.field11380;
               }
            }

            class183.field2319 = class262.method2103(Integer.parseInt(this.getParameter(field1482[21])), 28);
            if (class428.field5820 != class183.field2319 && class585.field8633 != class183.field2319 && class87.field1189 != class183.field2319) {
               class183.field2319 = class87.field1189;
            }

            try {
               class782.field11389 = Integer.parseInt(this.getParameter(field1482[72]));
            } catch (Exception var17) {
               class782.field11389 = 0;
            }

            label190: {
               String var2 = this.getParameter(field1482[75]);
               if (var2 != null && var2.equals("1")) {
                  class292.field4022 = true;
                  if (!var1) {
                     break label190;
                  }
               }

               class292.field4022 = false;
            }

            label206: {
               String var3 = this.getParameter(field1482[79]);
               if (var3 == null || !var3.equals("1")) {
                  class322.field4415 = false;
                  if (!var1) {
                     break label206;
                  }
               }

               class322.field4415 = true;
            }

            label176: {
               String var4 = this.getParameter(field1482[92]);
               if (var4 != null && var4.equals("1")) {
                  class107.field1430 = true;
                  if (!var1) {
                     break label176;
                  }
               }

               class107.field1430 = false;
            }

            String var5 = this.getParameter(field1482[25]);
            if (var5 != null) {
               label204: {
                  if (var5.equals("0")) {
                     class688.field10127 = class450.field6103;
                     if (!var1) {
                        break label204;
                     }
                  }

                  if (!var5.equals("1")) {
                     if (!var5.equals("2")) {
                        if (!var5.equals("3")) {
                           break label204;
                        }

                        class688.field10127 = class68.field910;
                        if (!var1) {
                           break label204;
                        }
                     }

                     class688.field10127 = class174.field2247;
                     if (!var1) {
                        break label204;
                     }
                  }

                  class688.field10127 = class776.field11312;
               }
            }

            try {
               class311.field4331 = Integer.parseInt(this.getParameter(field1482[90]));
            } catch (Exception var16) {
               class311.field4331 = 0;
            }

            class404.field5549 = this.getParameter(field1482[80]);
            class452.field6244 = this.getParameter(field1482[76]);
            if (class452.field6244 == null) {
               class452.field6244 = "";
            }

            class726.field10603 = "1".equals(this.getParameter(field1482[71]));
            String var6 = this.getParameter(field1482[85]);
            if (var6 != null) {
               try {
                  class36.field502 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class36.field502 = 0;
               }
            }

            class482.field6691 = Integer.parseInt(this.getParameter(field1482[81]));
            if (class482.field6691 < 0 || ~class642.field9586.length >= ~class482.field6691) {
               class482.field6691 = 0;
            }

            if (Integer.parseInt(this.getParameter(field1482[86])) == 1) {
               class234.field2942 = true;
               class221.field2771 = true;
            }

            String var7 = this.getParameter(field1482[78]);
            if (var7 != null && var7.equals(field1482[82])) {
               class287.field3971 = true;
            }

            String var8 = this.getParameter(field1482[88]);
            if (var8 != null) {
               class226.field2825 = class71.method700(class78.method755(var8, 38), -2);
               if (~class226.field2825.length > -17) {
                  class226.field2825 = null;
               }
            }

            String var9 = this.getParameter(field1482[87]);
            if (var9 != null && var9.equals(field1482[82])) {
               class613.field9025 = true;
            }

            String var10 = this.getParameter(field1482[93]);
            if (var10 != null) {
               try {
                  class745.field10875 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field1482[77]);
            if (var11 != null) {
               try {
                  class390.field5408 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class539.field7894 = this.getParameter(field1482[74]);
            if (class539.field7894 != null && ~class539.field7894.length() < -51) {
               class539.field7894 = null;
            }

            label136: {
               class107.field1426 = this;
               if (class688.field10127 == class450.field6103) {
                  class627.field9254 = 503;
                  class286.field3961 = 765;
                  if (!var1) {
                     break label136;
                  }
               }

               if (class776.field11312 == class688.field10127) {
                  class286.field3961 = 640;
                  class627.field9254 = 480;
               }
            }

            this.method743(32 + class183.field2319.method2321((byte)118), 657, 37, -27, class688.field10127.field6964, class627.field9254, class286.field3961);
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field1482[84] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "r",
      descriptor = "(I)V"
   )
   public static void method984(int arg0) {
      try {
         field1470 = null;
         if (arg0 != -7851) {
            method999((class642)null);
         }

         field1465 = null;
         field1479 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1482[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method985(int arg0) {
      try {
         ++field1474;
         if (arg0 > 122) {
            boolean var2 = class507.field7060.method2926((byte)100);
            if (!var2) {
               this.method983(73);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1482[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V"
   )
   public static final void method986() {
      for(int var0 = 0; var0 < class273.field3491; ++var0) {
         int[] var1 = class9.field191[var0];

         for(int var2 = 0; var2 < class211.field2689; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method762(int arg0) {
      boolean var2 = field1481;

      try {
         ++field1460;
         method984(-7851);
         class581.method4346(-4854);
         class741.method5378((byte)-64);
         class487.method3697(8851);
         class606.method4488(-16777216);
         class323.method2534(arg0 + -19462);
         class400.method3141(57);
         class401.method3149(0);
         class461.method3513(125);
         class318.method2511(-103);
         class307.method2451(arg0 + -7578);
         class676.method4943(0);
         class170.method1470((byte)-28);
         class389.method3073((byte)56);
         class15.method127((byte)-94);
         class673.method4927(70);
         class728.method5268(0);
         class227.method1813((byte)-104);
         class78.method758(true);
         class174.method1492((byte)-120);
         class285.method2322(-17);
         class500.method3790(33);
         class93.method862(19802);
         class479.method3644(arg0 ^ 7455);
         class752.method5443((byte)127);
         class31.method247(true);
         class337.method2665((byte)-118);
         class763.method5531(36068);
         class37.method282(-20934);
         class471.method3576(true);
         class370.method2922(true);
         class613.method4515((byte)-2);
         class615.method4532(-105);
         class496.method3778((byte)-127);
         class339.method2699(-1);
         class532.method4051((byte)84);
         class347.method2743((byte)126);
         class407.method3200(11);
         class331.method2621((byte)96);
         class649.method4771(0);
         class277.method2186(-97);
         class24.method197(13003);
         class276.method2179(arg0 ^ 7455);
         class20.method156((byte)-16);
         class254.method2042((byte)95);
         class104.method924(arg0 + -7391);
         class674.method4931(false);
         class193.method1604(-22312);
         class711.method5198(arg0 + -7456);
         class772.method5573(-109);
         class151.method1212((byte)-60);
         class733.method5298(67);
         class262.method2104((byte)-35);
         class329.method2616(arg0 + -7199);
         class665.method4860(-31945);
         class201.method1665((byte)-117);
         class462.method3526(16);
         class223.method1787(false);
         class21.method166(true);
         class88.method825(arg0 + -7450);
         class411.method3224(0);
         class698.method5087((byte)61);
         class594.method4421(true);
         class348.method2749(arg0 ^ -7456);
         class327.method2598(0);
         class621.method4603(0);
         class120.method1061(false);
         class642.method4726(true);
         class593.method4416(arg0 ^ 7543);
         class783.method5657(true);
         class17.method136(8);
         class107.method962(-2);
         class80.method779((byte)53);
         class625.method4622(1);
         class66.method599(arg0 ^ 7455);
         class702.method5106(-1);
         class9.method77(-1);
         class75.method720((byte)-108);
         class710.method5186(-1);
         class729.method5271(arg0 ^ 27331);
         class502.method3798(false);
         class418.method3261((byte)99);
         class7.method55((byte)47);
         class431.method3329(true);
         class793.method5721(-73);
         class427.method3307(arg0 + 1820618690);
         class439.method3389((byte)-85);
         class163.method1355(arg0 ^ 7453);
         class226.method1801(17576);
         class588.method4378(-20974);
         class111.method1004((byte)17);
         class397.method3125(arg0 ^ 7453);
         class753.method5453(-128);
         class507.method3829(34065);
         class245.method1944(-1332);
         class62.method557(arg0 ^ -7552);
         class480.method3652(false);
         class583.method4357((byte)58);
         class764.method5536(90);
         class112.method1009((byte)-108);
         class570.method4288(false);
         class742.method5384((byte)118);
         class670.method4885((byte)103);
         class238.method1900(arg0 + -7356);
         class287.method2330((byte)-85);
         class244.method1940((byte)34);
         class72.method704((byte)-66);
         class707.method5169(arg0 ^ 7543);
         class600.method4464(false);
         class294.method2364(true);
         class167.method1441(false);
         class35.method273(-23589);
         class423.method3287(1);
         class271.method2152(-100);
         class473.method3593(-3113);
         class12.method106(false);
         class447.method3428(arg0 + -7333);
         class492.method3746(11);
         class301.method2416(arg0 + 8929);
         class720.method5234(false);
         class105.method937(4);
         class721.method5238((byte)-105);
         class458.method3499(3);
         class202.method1674(-2);
         class464.method3534(0);
         class214.method1751(false);
         class632.method4664((byte)-20);
         class175.method1500((byte)73);
         class784.method5661(-1788);
         class216.method1762((byte)-74);
         class481.method3659(112);
         class408.method3206(-32212);
         class263.method2108(arg0 ^ 7452);
         class650.method4779((byte)90);
         class749.method5422(3072);
         class3.method25((byte)73);
         class520.method3907(arg0 ^ -7549);
         class158.method1330((byte)90);
         class476.method3625(arg0 ^ 7535);
         class67.method665(true);
         class689.method5033(-1);
         class433.method3355((byte)126);
         class563.method4237((byte)78);
         class454.method3477((byte)97);
         class776.method5604(-10);
         class87.method819(-111);
         class735.method5319(657);
         class554.method4187(arg0 + -7454);
         class243.method1930(91);
         class459.method3503(true);
         class680.method4960(-1);
         class591.method4402((byte)46);
         class491.method3736(arg0 ^ 20310);
         class256.method2067();
         class6.method49(-2260);
         class292.method2352((byte)-37);
         class667.method4870(0);
         class350.method2781(-65536);
         class509.method3840((byte)-107);
         class652.method4789(0);
         class246.method1955((byte)-9);
         class694.method5058((byte)-49);
         class57.method532((byte)104);
         class562.method4228(14010);
         class208.method1715((byte)-87);
         class286.method2327(-27270);
         class754.method5463(0);
         class42.method312(arg0 ^ 7490);
         class293.method2356((byte)-18);
         class296.method2388(124);
         class659.method4830((byte)58);
         class326.method2563();
         class76.method732(0);
         class50.method375((byte)-44);
         class437.method3373((byte)-124);
         class239.method1909(true);
         class317.method2507(264438404);
         class382.method3030((byte)-120);
         class161.method1345(-5868);
         class237.method1894(true);
         class596.method4441(22);
         class316.method2504((byte)-127);
         class99.method900(241307872);
         class39.method296(arg0 + -7341);
         class328.method2604(false);
         class484.method3675(-127);
         class332.method2630(124);
         class404.method3165(-1);
         class619.method4570();
         class516.method3885(-110);
         class765.method5539((byte)-78);
         class134.method1127((byte)-7);
         class2.method16(86);
         class79.method768(-101);
         class267.method2130(3);
         class160.method1340(-1);
         class519.method3895(64);
         class394.method3105();
         class497.method3782(-109);
         class5.method43((byte)19);
         class374.method2957((byte)41);
         class738.method5363((byte)118);
         class145.method1176((byte)116);
         class36.method276(arg0 + 16769760);
         class693.method5051(125);
         class795.method5732(12);
         class664.method4854(arg0 ^ 7459);
         class204.method1687((byte)114);
         class403.method3161(arg0 ^ -7456);
         class488.method3704(1);
         class30.method241((byte)-56);
         class762.method5523(-95);
         class131.method1109(true);
         class599.method4457();
         class426.method3301(512);
         class224.method1792(arg0 ^ 7505);
         class115.method1024((byte)126);
         class451.method3454();
         class559.method4214(false);
         class282.method2301(true);
         class602.method4472(-21025);
         class657.method4821((byte)-124);
         class626.method4628((byte)112);
         class176.method1504(-20);
         class450.method3448(-70);
         class779.method5626((byte)108);
         class658.method4827((byte)122);
         class258.method2082((byte)63);
         class672.method4922();
         class628.method4643(0);
         class367.method2897((byte)127);
         class475.method3616(true);
         class637.method4700((byte)126);
         class209.method1723((byte)19);
         class544.method4116(arg0 ^ -7508);
         class32.method256((byte)-126);
         class368.method2903(arg0 + -7535);
         class398.method3131(arg0 + -7452);
         class495.method3763((byte)-103);
         class590.method4395(0);
         class494.method3754((byte)89);
         class48.method359(-22763);
         class289.method2342(34023);
         class127.method1088(73);
         class372.method2944(-91);
         class704.method5114(0);
         class550.method4165((byte)3);
         class446.method3416(false);
         class608.method4498(3);
         class614.method4524(-1);
         class159.method1336((byte)113);
         class585.method4366(17709);
         class589.method4387(arg0 ^ 7455);
         class592.method4410(false);
         class268.method2135(1);
         class560.method4218(24);
         class40.method302((byte)96);
         class206.method1701(0);
         class579.method4334(-1);
         class490.method3722(true);
         class681.method4963(arg0 + -7348);
         class457.method3494((byte)-112);
         class98.method896(arg0 + -32955);
         class116.method1031(-1);
         class371.method2941((byte)-32);
         class341.method2723(131072);
         class485.method3684(81);
         class234.method1862(arg0 + 12031);
         class623.method4614(arg0 + -34366);
         class641.method4714(262144);
         class359.method2835(arg0 ^ 7454);
         class745.method5398(4);
         class597.method4444(-6692);
         class699.method5092(arg0 + -37982);
         class499.method3785((byte)3);
         class523.method3918(false);
         class455.method3485((byte)-82);
         class598.method4448((byte)71);
         class300.method2412(500);
         class533.method4056((byte)-33);
         class773.method5579(0);
         class548.method4148((byte)-12);
         class555.method4192(-125);
         class259.method2089(108);
         class366.method2890(-108);
         class630.method4655(0);
         class91.method844(124);
         class539.method4084(-95);
         class668.method4876(72);
         class135.method1134(arg0 ^ -7649);
         class380.method3017(false);
         class139.method1155(126);
         class696.method5068((byte)66);
         class535.method4062((byte)77);
         class242.method1922(27603);
         class529.method3950((byte)-128);
         class141.method1160(-121);
         class199.method1650(0);
         class723.method5244(3670);
         class381.method3025(false);
         class313.method2490((byte)-86);
         class568.method4269(false);
         class413.method3241(0);
         class388.method3062();
         class444.method3411(false);
         class288.method2337((byte)125);
         class647.method4755(arg0 ^ 7450);
         class119.method1049(1);
         class210.method1730(8);
         class746.method5406(113);
         class23.method189(-26954);
         class373.method2953(2);
         class737.method5348((byte)-60);
         class278.method2194((byte)1);
         class217.method1769((byte)-110);
         class566.method4254(17973);
         class379.method3005(0);
         class69.method683((byte)30);
         class448.method3439((byte)-121);
         class636.method4691();
         class777.method5610(9);
         class402.method3152(true);
         class683.method4973();
         class253.method2038();
         class280.method2204((byte)-37);
         class96.method892();
         class233.method1849(40);
         if (arg0 != 7455) {
            field1465 = null;
         }

         class113.method1016(122);
         class552.method4175(2919);
         class785.method5666(0);
         class197.method1637(arg0 + -1772144062);
         class28.method220(-25596);
         class147.method1188(-101);
         class460.method3507((byte)109);
         class757.method5482((byte)29);
         class228.method1821((byte)-87);
         class573.method4299(false);
         class273.method2161(104);
         class503.method3801(105);
         class354.method2810(-26058);
         class49.method365(-62);
         class90.method834((byte)-60);
         class100.method904((byte)-112);
         class27.method210();
         class504.method3812((byte)-24);
         class686.method5019(-103);
         class74.method716((byte)-13);
         class435.method3360(arg0 ^ 7453);
         class25.method201(arg0 ^ 7466);
         class422.method3274(-348281108);
         class363.method2858((byte)46);
         class14.method120((byte)-99);
         class275.method2171(0);
         class150.method1204(-115);
         class162.method1350(arg0 + -7449);
         class390.method3086(true);
         class405.method3172(true);
         class510.method3851((byte)56);
         class89.method830((byte)70);
         class629.method4650(-116);
         class432.method3343(false);
         class640.method4709((byte)-104);
         class530.method4003(true);
         class781.method5637(22953);
         class383.method3034((byte)-42);
         class714.method5219(-121);
         class270.method2146(arg0 + -7455);
         class184.method1543(false);
         class740.method5372(1);
         class302.method2427((byte)-65);
         class734.method5312(-1);
         class549.method4152((byte)-56);
         class266.method2123(arg0 ^ -7456);
         class743.method5391(arg0 ^ 7473);
         class452.method3455(arg0 + -20565);
         class771.method5562(arg0 ^ -7456);
         class789.method5678(true);
         class281.method2248((byte)-8);
         class279.method2199(-123);
         class576.method4318((byte)-101);
         class712.method5203(false);
         class620.method4581(89);
         class314.method2495(-125);
         class95.method885(arg0 + -14659);
         class198.method1647(-16919);
         class774.method5585(99999999);
         class543.method4106(false);
         class428.method3314(12140);
         class351.method2801(true);
         class45.method337(7);
         class255.method2054(true);
         class207.method1710(arg0 ^ -7510);
         class68.method672(86);
         class574.method4305(100);
         class103.method918(0);
         class200.method1654();
         class121.method1068(2);
         class192.method1595((byte)-15);
         class320.method2521((byte)-70);
         class618.method4551((byte)-124);
         class395.method3116(2);
         class169.method1467((byte)110);
         class63.method563((byte)54);
         class44.method329(21726);
         class569.method4273((byte)-122);
         class725.method5250((byte)-84);
         class751.method5431(5302);
         class94.method877(false);
         class77.method738((byte)-18);
         class315.method2499(false);
         class688.method5027(21152);
         class86.method814((byte)56);
         class225.method1796(-25361);
         class616.method4542(8);
         class436.method3370(true);
         class756.method5476(100);
         class166.method1435((byte)-92);
         class582.method4351(9526);
         class561.method4221(113);
         class109.method979(-19427);
         class84.method805(0);
         class551.method4171((byte)91);
         class312.method2484();
         class308.method2465(-101);
         class424.method3292(70);
         class651.method4785(-121);
         class634.method4672((byte)6);
         class146.method1185(-30935);
         class4.method34((byte)-128);
         class750.method5425(-22032);
         class761.method5517(arg0 + -6685);
         class666.method4866(-108);
         class274.method2164((byte)4);
         class324.method2543(1);
         class43.method326(-110);
         class125.method1082(true);
         class248.method1971(true);
         class791.method5713(arg0 + -7454);
         class747.method5413((byte)-25);
         class684.method4984(arg0 + -10784);
         class353.method2807(63);
         class229.method1824(false);
         class249.method1975(100);
         class429.method3319((byte)-109);
         class558.method4208((byte)74);
         class577.method4326((byte)72);
         class182.method1528((byte)107);
         class188.method1574(false);
         class108.method969((byte)-42);
         class212.method1741(1);
         class46.method342(arg0 + 20003);
         class545.method4119(7681);
         class794.method5727(arg0 + -7365);
         class654.method4803((byte)125);
         class8.method62((byte)127);
         class631.method4659(-27235);
         class138.method1149(0);
         class152.method1220(30091);
         class518.method3891(16821);
         class156.method1320((byte)-75);
         class52.method389(arg0 ^ 7456);
         class106.method951(false);
         class489.method3715(-23583);
         class1.method8(1);
         class205.method1696(0);
         class183.method1534(true);
         class168.method1463(-12857);
         class482.method3663((byte)127);
         class284.method2316((byte)63);
         class617.method4548((byte)95);
         class732.method5289(-1);
         class792.method5718(arg0 ^ -11719);
         class344.method2728(arg0 + -7345);
         class303.method2433((byte)-63);
         class364.method2870(119);
         class557.method4200((byte)13);
         class679.method4954(-108);
         class392.method3096((byte)-58);
         class469.method3564((byte)-119);
         class575.method4312((byte)47);
         class465.method3537(10131);
         class511.method3858(1);
         class215.method1758(0);
         class513.method3872((byte)110);
         class375.method2962(false);
         class22.method170(arg0 + -7328);
         class311.method2478((byte)91);
         class604.method4476((byte)107);
         class705.method5125(arg0 + -7454);
         class653.method4800(68);
         class118.method1041(false);
         class440.method3393(-2278);
         class478.method3632(-1);
         class211.method1736((byte)7);
         class505.method3817((byte)-76);
         class191.method1590(0);
         class553.method4182((byte)-125);
         class646.method4750(true);
         class700.method5101((byte)-51);
         class123.method1074((byte)-117);
         class203.method1680(arg0 ^ 7450);
         class387.method3055((byte)-102);
         class438.method3383(arg0 ^ 7454);
         class541.method4093(arg0 + -7365);
         class644.method4743(6);
         class506.method3822((byte)-110);
         class321.method2525(false);
         class441.method3398((byte)106);
         class587.method4375((byte)92);
         class13.method112((byte)-28);
         class522.method3911((byte)-110);
         class755.method5469(1);
         class58.method535(arg0 ^ -7456);
         class584.method4362(918);
         class556.method4195((byte)-38);
         class171.method1477(2232);
         class213.method1745(arg0 + -7200);
         class708.method5175((byte)60);
         class130.method1105(0);
         class365.method2880(true);
         class419.method3266(-110);
         class605.method4484(-68);
         class190.method1586((byte)127);
         class335.method2658(27102);
         class92.method849(-1);
         class778.method5618(109);
         class137.method1144(1);
         class417.method3253(arg0 ^ 7492);
         class194.method1608((byte)-125);
         class59.method541(1073741824);
         class231.method1832(-9954);
         class54.method524((byte)93);
         class425.method3297(arg0 ^ 7443);
         class340.method2715((byte)33);
         class508.method3833(false);
         class716.method5223((byte)-101);
         class391.method3089(-19127);
         class456.method3491(52);
         class493.method3751(arg0 ^ 12582);
         class430.method3323(953875920);
         class607.method4494(-13623);
         class338.method2674(2132891692);
         class449.method3445(2048);
         class47.method351((byte)51);
         class466.method3545(-1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1482[64] + arg0 + ')');
      }

      if (class78.field1073) {
         field1481 = !var2;
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method756(int arg0) {
      try {
         ++field1469;
         if (arg0 >= 37) {
            if (class757.field11093.field11012.method27(-18033) == 2) {
               try {
                  this.method988(10);
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class668.method4877((byte)-107, var6, var6.getMessage() + field1482[10] + this.method754(26519));
                  class337.field4608 = true;
                  class214.method1749(0, false, 127);
               }
            } else {
               this.method988(10);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1482[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V"
   )
   public static final void main(String[] arg0) {
      boolean var1 = field1481;

      try {
         ++field1477;

         try {
            if (~arg0.length != -7) {
               class742.method5383(field1482[23], false);
            }

            label94: {
               class489.field6822 = new class753();
               class489.field6822.field11035 = Integer.parseInt(arg0[0]);
               class732.field10678 = new class753();
               class732.field10678.field11035 = Integer.parseInt(arg0[1]);
               class485.field6754 = new class753();
               class485.field6754.field11035 = Integer.parseInt(arg0[2]);
               class583.field8611 = class585.field8634;
               if (!arg0[3].equals(field1482[35])) {
                  if (!arg0[3].equals(field1482[33])) {
                     if (!arg0[3].equals(field1482[22])) {
                        class742.method5383(field1482[21], false);
                        if (!var1) {
                           break label94;
                        }
                     }

                     class183.field2319 = class428.field5820;
                     if (!var1) {
                        break label94;
                     }
                  }

                  class183.field2319 = class585.field8633;
                  if (!var1) {
                     break label94;
                  }
               }

               class183.field2319 = class87.field1189;
            }

            class782.field11389 = class91.method843(arg0[4], -122);
            if (class782.field11389 == -1) {
               label102: {
                  if (arg0[4].equals(field1482[29])) {
                     class782.field11389 = 0;
                     if (!var1) {
                        break label102;
                     }
                  }

                  if (!arg0[4].equals(field1482[28])) {
                     class742.method5383(field1482[26], false);
                     if (!var1) {
                        break label102;
                     }
                  }

                  class782.field11389 = 1;
               }
            }

            label73: {
               class292.field4022 = false;
               class322.field4415 = false;
               if (!arg0[5].equals(field1482[31])) {
                  if (!arg0[5].equals(field1482[32])) {
                     if (arg0[5].equals(field1482[30])) {
                        class688.field10127 = class174.field2247;
                        if (!var1) {
                           break label73;
                        }
                     }

                     if (!arg0[5].equals(field1482[24])) {
                        class742.method5383(field1482[25], false);
                        if (!var1) {
                           break label73;
                        }
                     }

                     class688.field10127 = class68.field910;
                     if (!var1) {
                        break label73;
                     }
                  }

                  class688.field10127 = class776.field11312;
                  if (!var1) {
                     break label73;
                  }
               }

               class688.field10127 = class450.field6103;
            }

            class539.field7894 = null;
            class36.field502 = 0;
            class234.field2942 = true;
            class221.field2771 = true;
            class482.field6691 = class688.field10127.field6966;
            class452.field6244 = "";
            class745.field10875 = 0;
            class311.field4331 = 0;
            class390.field5408 = 0L;
            class226.field2825 = null;
            class613.field9025 = false;
            class287.field3971 = false;
            client var2 = new client();
            class107.field1426 = var2;
            var2.method761(657, 32 + class183.field2319.method2321((byte)116), false, 1024, 768, -1, 37, class688.field10127.field6964);
            class570.field8391.setLocation(40, 40);
         } catch (Exception var5) {
            class668.method4877((byte)-97, var5, (String)null);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1482[27] + (arg0 != null ? field1482[20] : field1482[34]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method987(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method754(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method988(int arg0) {
      boolean var2 = field1481;

      try {
         ++field1468;
         if (~class157.field2022 != -17) {
            ++class413.field5678;
            if (class413.field5678 % 1000 == 1) {
               GregorianCalendar var3 = new GregorianCalendar();
               class406.field5572 = 600 * var3.get(11) - (-(var3.get(12) * 10) + -(var3.get(13) / 6));
               class555.field8146.setSeed((long)class406.field5572);
            }

            class387.field5365.method4420(true);
            class387.field5363.method4420(true);
            this.method985(arg0 + 115);
            if (class476.field6638 != null) {
               class476.field6638.method4533(arg0 ^ 10);
            }

            class650.method4781(-109);
            class650.method4777((byte)75);
            class15.field273.method2531(-5017);
            class372.field5216.method1565(true);
            if (class629.field9294 != null) {
               class629.field9294.method458((int)class163.method1353(arg0 ^ -126));
            }

            class618.method4552((byte)-102);
            class581.field8591 = 0;
            class86.field1176 = 0;
            if (arg0 != 10) {
               field1470 = null;
            }

            int var10000;
            label199: {
               class715 var4 = class15.field273.method2532(7);
               if (var2) {
                  var10000 = var4.method2881(false);
               } else if (var4 == null) {
                  var10000 = 0;
                  if (!var2) {
                     break label199;
                  }
               } else {
                  var10000 = var4.method2881(false);
               }

               while(true) {
                  label309: {
                     int var5 = var10000;
                     if (~var5 == -3 || var5 == 3) {
                        char var6 = var4.method2878(-32420);
                        if (!class19.method141(arg0 + 6540) || ~var6 != -97 && var6 != 167 && ~var6 != -179) {
                           if (~class581.field8591 <= -129) {
                              break label309;
                           }

                           class69.field915[class581.field8591] = var4;
                           ++class581.field8591;
                           if (!var2) {
                              break label309;
                           }
                        }

                        if (!class492.method3747(arg0 + -10)) {
                           class130.method1103((byte)40);
                           if (!var2) {
                              break label309;
                           }
                        }

                        class88.method827(false);
                        if (!var2) {
                           break label309;
                        }
                     }

                     if (var5 == 0 && ~class86.field1176 > -76) {
                        class171.field2225[class86.field1176] = var4;
                        ++class86.field1176;
                     }
                  }

                  var4 = class15.field273.method2532(7);
                  if (var4 == null) {
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = var4.method2881(false);
                  }
               }
            }

            class659.field9814 = var10000;
            class505 var7 = class372.field5216.method1563(-28145);
            int var8;
            if (var2) {
               var8 = var7.method1556(true);
               if (var8 == -1) {
                  class641.field9462.method279(false, var7);
                  if (var2) {
                     if (var8 != 6) {
                        if (class383.method3039(var8, 123)) {
                           class17.field291.method279(false, var7);
                           if (class17.field291.method286(true) > 10) {
                              class17.field291.method281(true);
                              if (var2) {
                                 class659.field9814 += var7.method1553(arg0 ^ 119);
                              }
                           }
                        }
                     } else {
                        class659.field9814 += var7.method1553(arg0 ^ 119);
                     }

                     var7 = class372.field5216.method1563(-28145);
                  } else {
                     var7 = class372.field5216.method1563(-28145);
                  }
               } else {
                  if (var8 != 6) {
                     if (class383.method3039(var8, 123)) {
                        class17.field291.method279(false, var7);
                        if (class17.field291.method286(true) > 10) {
                           class17.field291.method281(true);
                           if (var2) {
                              class659.field9814 += var7.method1553(arg0 ^ 119);
                           }
                        }
                     }
                  } else {
                     class659.field9814 += var7.method1553(arg0 ^ 119);
                  }

                  var7 = class372.field5216.method1563(-28145);
               }
            }

            while(true) {
               if (var7 == null) {
                  var10000 = class492.method3747(0);
                  if (!var2) {
                     if (var10000 != 0) {
                        class32.method258(21769);
                     }

                     label156: {
                        if (class275.method2172((byte)116, class157.field2022)) {
                           class134.method1123(arg0 + -111);
                           class67.method669(96);
                           if (!var2) {
                              break label156;
                           }
                        }

                        if (class427.method3309(class157.field2022, (byte)-81)) {
                           class745.method5395(true);
                        }
                     }

                     label310: {
                        if (!class772.method5574(class157.field2022, arg0 ^ 15) || class427.method3309(class157.field2022, (byte)101)) {
                           if (!class385.method3048(class157.field2022, (byte)-44) || class427.method3309(class157.field2022, (byte)101)) {
                              if (class157.field2022 != 13) {
                                 if (class391.method3090(83, class157.field2022) && !class427.method3309(class157.field2022, (byte)104)) {
                                    class208.method1714((byte)102);
                                    if (!var2) {
                                       break label310;
                                    }
                                 }

                                 if (class157.field2022 != 14 && class157.field2022 != 15) {
                                    break label310;
                                 }

                                 class575.method4314(6);
                                 if (class681.field10031 == -3 || class681.field10031 == 2 || ~class681.field10031 == -16) {
                                    break label310;
                                 }

                                 if (~class157.field2022 == -16) {
                                    class353.field4943 = class681.field10031;
                                    class387.field5359 = class116.field1525;
                                    class552.method4179(-3616, class585.field8635.field11035, class585.field8635.field11029);
                                    class387.field5365.field8760 = null;
                                    class577.method4324((byte)-127, 14);
                                    if (!var2) {
                                       break label310;
                                    }
                                 }

                                 class367.method2893(false, 255);
                                 if (!var2) {
                                    break label310;
                                 }
                              }

                              class575.method4314(arg0 ^ 12);
                              if (!var2) {
                                 break label310;
                              }
                           }

                           this.method990((byte)107);
                           class575.method4314(6);
                           if (!var2) {
                              break label310;
                           }
                        }

                        this.method990((byte)107);
                        class226.method1802(-117);
                        class575.method4314(6);
                     }

                     class149.method1198(class629.field9294, (byte)119);
                     class17.field291.method281(true);
                     return;
                  }
               } else {
                  var10000 = var7.method1556(true);
               }

               var8 = var10000;
               if (var8 == -1) {
                  class641.field9462.method279(false, var7);
                  if (var2) {
                     if (var8 != 6) {
                        if (class383.method3039(var8, 123)) {
                           class17.field291.method279(false, var7);
                           if (class17.field291.method286(true) > 10) {
                              class17.field291.method281(true);
                              if (var2) {
                                 class659.field9814 += var7.method1553(arg0 ^ 119);
                              }
                           }
                        }
                     } else {
                        class659.field9814 += var7.method1553(arg0 ^ 119);
                     }

                     var7 = class372.field5216.method1563(-28145);
                  } else {
                     var7 = class372.field5216.method1563(-28145);
                  }
               } else {
                  if (var8 != 6) {
                     if (class383.method3039(var8, 123)) {
                        class17.field291.method279(false, var7);
                        if (class17.field291.method286(true) > 10) {
                           class17.field291.method281(true);
                           if (var2) {
                              class659.field9814 += var7.method1553(arg0 ^ 119);
                           }
                        }
                     }
                  } else {
                     class659.field9814 += var7.method1553(arg0 ^ 119);
                  }

                  var7 = class372.field5216.method1563(-28145);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1482[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method989(int arg0, int arg1) {
      try {
         ++field1475;
         class507.field7060.field5178 = arg0;
         class72.field957 = null;
         ++class507.field7060.field5177;
         class103.field1334 = 0;
         class680.field10013 = null;
         if (arg1 != 27591) {
            method994((class642)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1482[37] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method990(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "()V"
   )
   public static final void method991() {
      class384.field5326 = 0;

      for(int var0 = 0; var0 < class737.field10798; ++var0) {
         class81 var1 = ((class411)class35.field493.method1818(-1, (long)class277.field3534[var0])).field5654;
         if (var1.field148 && var1.method73(-1) != -1) {
            int var2 = (var1.method78(0) - 1) * 256 + 252;
            int var3 = var1.field10467 - var2 >> 9;
            int var4 = var1.field10468 - var2 >> 9;
            class9 var5 = class768.method5548(var4, false, var1.field10457, var3);
            if (var5 != null) {
               int var6 = var5.field145;
               if (var5 instanceof class81) {
                  var6 += 2048;
               }

               if (var5.field165 == 0 && var5.method73(-1) != -1) {
                  class300.field4187[class384.field5326] = var6;
                  class398.field5485[class384.field5326] = var6;
                  ++class384.field5326;
                  ++var5.field165;
               }

               class300.field4187[class384.field5326] = var6;
               class398.field5485[class384.field5326] = var1.field145 + 2048;
               ++class384.field5326;
               ++var5.field165;
            }
         }
      }

      class602.method4471((byte)-118, 0, class300.field4187, class384.field5326 - 1, class398.field5485);
   }

   @OriginalMember(
      owner = "client!client",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method992(int arg0) {
      boolean var2 = field1481;

      try {
         ++field1461;
         if (class157.field2022 != 16) {
            long var3 = class727.method5258(false) / 1000000L - class458.field6306;
            if (arg0 == 16360) {
               class458.field6306 = class727.method5258(false) / 1000000L;
               boolean var5 = class755.method5470((byte)-104);
               if (var5 && class477.field6647 && class737.field10797 != null) {
                  class737.field10797.method4400(-16385);
               }

               if (class641.method4713(class157.field2022, (byte)-38)) {
                  label401: {
                     if (~class520.field7314 == -1L || class163.method1353(arg0 + -16487) <= class520.field7314) {
                        if (class629.field9294.method422() || !class300.field4186) {
                           break label401;
                        }

                        class623.method4612(2048);
                        if (!var2) {
                           break label401;
                        }
                     }

                     class575.method4313((byte)60, class119.field1572, class621.field9188, false, class137.method1146((byte)96));
                  }
               }

               if (class233.field2900 == null) {
                  Container var6;
                  label385: {
                     if (class570.field8391 != null) {
                        var6 = class570.field8391;
                        if (!var2) {
                           break label385;
                        }
                     }

                     if (class152.field1893 == null) {
                        var6 = class329.field4545;
                        if (!var2) {
                           break label385;
                        }
                     }

                     var6 = class152.field1893;
                  }

                  int var7 = var6.getSize().width;
                  int var8 = var6.getSize().height;
                  if (class570.field8391 == var6) {
                     Insets var9 = class570.field8391.getInsets();
                     var8 -= var9.top + var9.bottom;
                     var7 -= var9.left - -var9.right;
                  }

                  if (~class282.field3917 != ~var7 || ~class315.field4358 != ~var8 || class187.field2382) {
                     label396: {
                        if (class629.field9294 == null || class629.field9294.method520()) {
                           class33.method263((byte)89);
                           if (!var2) {
                              break label396;
                           }
                        }

                        class315.field4358 = var8;
                        class282.field3917 = var7;
                     }

                     class520.field7314 = 500L + class163.method1353(-128);
                     class187.field2382 = false;
                  }
               }

               if (class233.field2900 != null && !class479.field6672 && class641.method4713(class157.field2022, (byte)-49)) {
                  class575.method4313((byte)60, -1, -1, false, class757.field11093.field11013.method3905(arg0 ^ -31129));
               }

               boolean var10 = false;
               if (class402.field5528) {
                  var10 = true;
                  class402.field5528 = false;
               }

               if (var10) {
                  class729.method5273(0);
               }

               if (class629.field9294 != null && class629.field9294.method422() || ~class137.method1146((byte)48) != -2) {
                  class406.method3178((byte)117);
               }

               label325: {
                  if (!class275.method2172((byte)102, class157.field2022)) {
                     if (class689.method5035(-7, class157.field2022)) {
                        class280.method2208(arg0 ^ -30387);
                        if (!var2) {
                           break label325;
                        }
                     }

                     if (class175.method1498((byte)8, class157.field2022)) {
                        class280.method2208(arg0 ^ -30387);
                        if (!var2) {
                           break label325;
                        }
                     }

                     if (!class427.method3309(class157.field2022, (byte)-122)) {
                        if (class157.field2022 == 11) {
                           class157.method1326(var3, (byte)-58);
                           if (!var2) {
                              break label325;
                           }
                        }

                        if (class157.field2022 != 14) {
                           if (class157.field2022 != 15) {
                              break label325;
                           }

                           class120.method1058(false, -570417178, class629.field9294, class689.field10134, class606.field8934.method4490(class782.field11389, -16777216), class209.field2657);
                           if (!var2) {
                              break label325;
                           }
                        }

                        class120.method1058(false, -570417178, class629.field9294, class689.field10134, class606.field8917.method4490(class782.field11389, -16777216) + field1482[11] + class606.field8918.method4490(class782.field11389, arg0 ^ -16760856), class209.field2657);
                        if (!var2) {
                           break label325;
                        }
                     }

                     if (class779.field11364 != 1) {
                        if (class779.field11364 == 2) {
                           if (~class120.field1587 > ~class566.field8338) {
                              class120.field1587 = class566.field8338;
                           }

                           int var11 = (-class566.field8338 + class120.field1587) * 50 / class120.field1587 + 50;
                           class120.method1058(true, -570417178, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216) + field1482[13] + var11 + field1482[12], class209.field2657);
                           if (!var2) {
                              break label325;
                           }
                        }

                        class120.method1058(true, -570417178, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216), class209.field2657);
                        if (!var2) {
                           break label325;
                        }
                     }

                     if (class700.field10258 > class313.field4348) {
                        class313.field4348 = class700.field10258;
                     }

                     int var12 = (-class700.field10258 + class313.field4348) * 50 / class313.field4348;
                     class120.method1058(true, arg0 ^ -570417138, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216) + field1482[13] + var12 + field1482[12], class209.field2657);
                     if (!var2) {
                        break label325;
                     }
                  }

                  class399.method3134((byte)-112, var10);
               }

               if (class420.field5741 == 3) {
                  int var13 = 0;
                  if (var2 || class121.field1604 > var13) {
                     do {
                        Rectangle var14 = class439.field5975[var13];
                        if (!class708.field10409[var13]) {
                           if (class626.field9246[var13]) {
                              class629.field9294.method3645(var14.height, var14.x, -65536, var14.width, (byte)53, var14.y);
                              if (!var2) {
                                 ++var13;
                                 continue;
                              }
                           }

                           class629.field9294.method3645(var14.height, var14.x, -16711936, var14.width, (byte)74, var14.y);
                           if (!var2) {
                              ++var13;
                              continue;
                           }
                        }

                        class629.field9294.method3645(var14.height, var14.x, -65281, var14.width, (byte)56, var14.y);
                        ++var13;
                     } while(class121.field1604 > var13);
                  }
               }

               if (class492.method3747(0)) {
                  class563.method4236(class629.field9294, (byte)65);
               }

               label271: {
                  if (class366.field5092.field10749 && class641.method4713(class157.field2022, (byte)-76) && ~class420.field5741 == -1 && class137.method1146((byte)123) == 1 && !var10) {
                     int var15 = 0;
                     int var16 = 0;
                     if (var2) {
                        if (class626.field9246[var16]) {
                           class626.field9246[var16] = false;
                           class43.field563[var15++] = class439.field5975[var16];
                        }

                        ++var16;
                     }

                     while(true) {
                        boolean var10000;
                        if (~class121.field1604 >= ~var16) {
                           try {
                              var10000 = class28.field416;
                              if (!var2) {
                                 if (!var10000) {
                                    class629.field9294.method3646(arg0 ^ -16300, var15, class43.field563);
                                    if (!var2) {
                                       break label271;
                                    }
                                 }

                                 class794.method5729(class43.field563, arg0 + -16357, var15);
                                 break label271;
                              }
                           } catch (class221 var22) {
                              if (!var2) {
                                 break label271;
                              }
                              break;
                           }
                        } else {
                           var10000 = class626.field9246[var16];
                        }

                        if (var10000) {
                           class626.field9246[var16] = false;
                           class43.field563[var15++] = class439.field5975[var16];
                        }

                        ++var16;
                     }
                  }

                  if (!class275.method2172((byte)105, class157.field2022)) {
                     int var17 = 0;
                     if (var2) {
                        class626.field9246[var17] = false;
                        ++var17;
                     }

                     while(true) {
                        while(class121.field1604 > var17) {
                           class626.field9246[var17] = false;
                           ++var17;
                        }

                        try {
                           if (!var2) {
                              if (class28.field416) {
                                 class341.method2725(125);
                                 if (!var2) {
                                    break;
                                 }
                              }

                              class629.field9294.method3642((byte)77);
                              break;
                           }
                        } catch (class221 var21) {
                           class668.method4877((byte)126, var21, var21.getMessage() + field1482[10] + this.method754(26519));
                           class214.method1749(0, false, 71);
                           break;
                        }

                        ++var17;
                     }
                  }
               }

               label214: {
                  class467.method3551((byte)83);
                  int var19 = class757.field11093.field10965.method3626(arg0 ^ -31129);
                  if (var19 != 0) {
                     if (var19 == 1) {
                        class340.method2717(10L, (byte)-119);
                        if (!var2) {
                           break label214;
                        }
                     }

                     if (~var19 == -3) {
                        class340.method2717(5L, (byte)-119);
                        if (!var2) {
                           break label214;
                        }
                     }

                     if (~var19 != -4) {
                        break label214;
                     }

                     class340.method2717(2L, (byte)-119);
                     if (!var2) {
                        break label214;
                     }
                  }

                  class340.method2717(15L, (byte)-119);
               }

               if (class457.field6295) {
                  class612.method4512(5);
               }

               if (class757.field11093.field10981.method5034(-18033) == 1 && ~class157.field2022 == -4 && ~class661.field9817 != 0) {
                  class757.field11093.method5438(true, class757.field11093.field10981, 0);
                  class654.method4804((byte)84);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field1482[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Loca;IIIIIIIIIII)V"
   )
   public static final void method993(class642[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label864:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class642 var13 = arg0[var12];
         if (var13 != null && var13.field9589 == arg1) {
            int var14 = var13.field9495 + arg6;
            int var15 = var13.field9570 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field9493 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field9629 + var14;
               int var21 = var13.field9572 + var15;
               if (var13.field9493 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field9493 != 0 && !var13.field9608 && method999(var13).field10630 == 0 && class509.field7102 != var13 && class139.field1754 != var13.field9558 && class100.field1319 != var13.field9558) {
               if (var16 < var18 && var17 < var19) {
                  class70.method695(false, var13);
               }
            } else if (!method994(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class28.field416) {
                  var22 = class356.method2825(0);
                  var23 = class465.method3538(-26506);
               }

               if (class584.field8627 == var13 && class513.method3871(true, class584.field8627) != null) {
                  class379.field5273 = true;
                  class235.field2954 = var14;
                  class317.field4374 = var15;
               }

               if (var13.field9646 || var16 < var18 && var17 < var19) {
                  if (var13.field9563 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class586 var24 = (class586)class452.field6201.method288(0); var24 != null; var24 = (class586)class452.field6201.method290(17958)) {
                        if (var24.field8645) {
                           var24.method4924(-2970);
                           var24.field8655.field9575 = false;
                        }
                     }

                     if (class6.field83 == 0) {
                        class584.field8627 = null;
                        class509.field7102 = null;
                     }

                     class486.field6784 = 0;
                     class370.field5154 = false;
                     class631.field9311 = false;
                     if (!class652.field9742) {
                        class202.method1673((byte)73);
                     }
                  }

                  boolean var25;
                  if (class372.field5216.method1570(29658) + var22 >= var16 && class372.field5216.method1566(0) + var23 >= var17 && class372.field5216.method1570(29658) + var22 < var18 && class372.field5216.method1566(0) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class597.field8823 && var25) {
                     if (var13.field9538 >= 0) {
                        class436.field5949 = var13.field9538;
                     } else if (var13.field9563) {
                        class436.field5949 = -1;
                     }
                  }

                  if (!class652.field9742 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class417.method3252(arg11 - var15, arg10 - var14, (byte)-58, var13);
                  }

                  boolean var26 = false;
                  if (class372.field5216.method1558(-93) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class505 var28 = (class505)class17.field291.method288(0);
                  if (var28 != null && var28.method1556(true) == 0 && var28.method1557(-1012) + var22 >= var16 && var28.method1554((byte)106) + var23 >= var17 && var28.method1557(-1012) + var22 < var18 && var28.method1554((byte)118) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field9585 != null && !class492.method3747(0)) {
                     for(int var29 = 0; var29 < var13.field9585.length; ++var29) {
                        if (!class15.field273.method2538(true, var13.field9585[var29])) {
                           if (var13.field9499 != null) {
                              var13.field9499[var29] = 0;
                           }
                        } else if (var13.field9499 == null || class413.field5678 >= var13.field9499[var29]) {
                           byte var30 = var13.field9561[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class15.field273.method2538(true, 86) && !class15.field273.method2538(true, 82) && !class15.field273.method2538(true, 81)) && ((var30 & 2) == 0 || class15.field273.method2538(true, 86)) && ((var30 & 1) == 0 || class15.field273.method2538(true, 82)) && ((var30 & 4) == 0 || class15.field273.method2538(true, 81))) {
                              if (var29 < 10) {
                                 class307.method2456(var29 + 1, "", var13.field9482, 30881, -1);
                              } else if (var29 == 10) {
                                 class321.method2526(27352);
                                 class729 var31 = method999(var13);
                                 class263.method2110(var31.field10634, var13, -14332, var31.method5275(4004219));
                                 class649.field9694 = class403.method3159(-1, var13);
                                 if (class649.field9694 == null) {
                                    class649.field9694 = field1482[17];
                                 }

                                 class207.field2632 = var13.field9560 + field1482[18];
                              }

                              int var32 = var13.field9473[var29];
                              if (var13.field9499 == null) {
                                 var13.field9499 = new int[var13.field9585.length];
                              }

                              if (var32 != 0) {
                                 var13.field9499[var29] = class413.field5678 + var32;
                              } else {
                                 var13.field9499[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class528.method3945(var22 + var28.method1557(-1012) - var14, 2, var13, var23 + var28.method1554((byte)104) - var15);
                  }

                  if (class584.field8627 != null && class584.field8627 != var13 && var25 && method999(var13).method5272((byte)59)) {
                     class5.field66 = var13;
                  }

                  if (class509.field7102 == var13) {
                     class50.field697 = true;
                     class417.field5706 = var14;
                     class727.field10608 = var15;
                  }

                  if (var13.field9608 || var13.field9558 != 0) {
                     if (var25 && class659.field9814 != 0 && var13.field9628 != null) {
                        class586 var33 = new class586();
                        var33.field8645 = true;
                        var33.field8655 = var13;
                        var33.field8646 = class659.field9814;
                        var33.field8648 = var13.field9628;
                        class452.field6201.method279(false, var33);
                     }

                     if (class584.field8627 != null || class652.field9742 || class785.field11473 != var13.field9558 && class486.field6784 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field9558 != 0) {
                        if (class157.field2024 == var13.field9558 || class119.field1570 == var13.field9558) {
                           class438.field5963 = var13;
                           if (class676.field9996 != null) {
                              class676.field9996.method3556(-112, class629.field9294, var13.field9572);
                           }

                           if (class157.field2024 == var13.field9558) {
                              if (class652.field9742 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class208.method1717(arg9, class629.field9294, (byte)-109, arg8);
                              class592 var34 = (class592)class184.field2338.method4639(-109);

                              while(true) {
                                 if (var34 == null) {
                                    continue label864;
                                 }

                                 if (arg10 >= var34.field8736 && arg10 < var34.field8738 && arg11 >= var34.field8737 && arg11 < var34.field8735) {
                                    class202.method1673((byte)36);
                                    class338.method2670(var34.field8732, 779412684);
                                 }

                                 var34 = (class592)class184.field2338.method4636((byte)82);
                              }
                           }
                        }

                        if (class139.field1754 == var13.field9558) {
                           if (var13.method4732(class629.field9294, 1618484232) == null || class779.field11361 != 0 && class779.field11361 != 3 || class652.field9742 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field9501[var36];
                           if (var35 < var37 || var35 > var13.field9531[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field9629 / 2;
                           int var39 = var36 - var13.field9572 / 2;
                           int var40;
                           if (class784.field11454 == 4) {
                              var40 = (int)class623.field9202 & 16383;
                           } else {
                              var40 = (int)class623.field9202 + class495.field6914 & 16383;
                           }

                           int var41 = class746.field10907[var40];
                           int var42 = class746.field10897[var40];
                           if (class784.field11454 != 4) {
                              var41 = (class391.field5419 + 256) * var41 >> 8;
                              var42 = (class391.field5419 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class784.field11454 == 4) {
                              var45 = (class2.field27 >> 9) + (var43 >> 2);
                              var46 = (class274.field3506 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class204.field2593.method78(0) - 1) * 256;
                              var45 = (class204.field2593.field10467 - var47 >> 9) + (var43 >> 2);
                              var46 = (class204.field2593.field10468 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class597.field8823 && (class112.field1500 & 64) != 0) {
                              class642 var48 = class77.method737(-16985, class26.field392, class371.field5188);
                              if (var48 != null) {
                                 class254.method2040(58, true, 1L, field1482[16], var46, false, true, (byte)-40, var13.field9524, class741.field10841, class649.field9694, var45, (long)(var13.field9518 << 0 | var13.field9482));
                              } else {
                                 class321.method2526(27352);
                              }
                              continue;
                           }

                           if (class776.field11312 == class688.field10127) {
                              class254.method2040(60, true, 1L, "", var46, false, true, (byte)-116, -1, -1, class606.field8930.method4490(class782.field11389, -16777216), var45, 0L);
                           }

                           class254.method2040(48, true, 1L, "", var46, false, true, (byte)-42, -1, class331.field4568, class327.field4531, var45, 0L);
                           continue;
                        }

                        if (class785.field11473 == var13.field9558) {
                           class777.field11329 = var13;
                           if (var25) {
                              class370.field5154 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method1557(-1012) - var14 - var13.field9629 / 2) * 2.0D / (double)class326.field4481);
                              int var50 = (int)(-((double)(var23 + var28.method1554((byte)109) - var15 - var13.field9572 / 2) * 2.0D / (double)class326.field4481));
                              int var51 = class345.field4731 + var49 + class326.field4502;
                              int var52 = class381.field5303 + var50 + class326.field4499;
                              class120 var53 = class543.method4101((byte)-128);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method1059(var54, var51, true, var52);
                              if (var54 != null) {
                                 if (class15.field273.method2538(true, 82) && class580.field8586 > 0) {
                                    class364.method2864(var54[1], (byte)-35, var54[2], var54[0]);
                                    continue;
                                 }

                                 class631.field9311 = true;
                                 class732.field10680 = var54[0];
                                 class48.field672 = var54[1];
                                 class401.field5508 = var54[2];
                              }

                              class486.field6784 = 1;
                              class693.field10173 = false;
                              class308.field4309 = class372.field5216.method1570(29658);
                              class67.field897 = class372.field5216.method1566(0);
                              continue;
                           }

                           if (var26 && class486.field6784 > 0) {
                              if (class486.field6784 == 1 && (class308.field4309 != class372.field5216.method1570(29658) || class67.field897 != class372.field5216.method1566(0))) {
                                 class790.field11548 = class345.field4731;
                                 class243.field3071 = class381.field5303;
                                 class486.field6784 = 2;
                              }

                              if (class486.field6784 == 2) {
                                 class693.field10173 = true;
                                 class214.method1748(-3, class790.field11548 + (int)((double)(class308.field4309 - class372.field5216.method1570(29658)) * 2.0D / (double)class326.field4483));
                                 class295.method2382(class243.field3071 - (int)((double)(class67.field897 - class372.field5216.method1566(0)) * 2.0D / (double)class326.field4483), true);
                              }
                              continue;
                           }

                           if (class486.field6784 > 0 && !class693.field10173) {
                              if ((class393.field5442 == 1 || class371.method2933(6004)) && class455.field6279 > 2) {
                                 class323.method2533(23324, class67.field897, class308.field4309);
                              } else if (class160.method1339((byte)118)) {
                                 class323.method2533(23324, class67.field897, class308.field4309);
                              }
                           }

                           class486.field6784 = 0;
                           continue;
                        }

                        if (class527.field7384 == var13.field9558) {
                           if (var26) {
                              class95.method884(var23 + class372.field5216.method1566(0) - var15, var13.field9572, var13.field9629, var22 + class372.field5216.method1570(29658) - var14, 2);
                           }
                           continue;
                        }

                        if (class100.field1319 == var13.field9558) {
                           class211.method1735(true, var13, var14, var15);
                           continue;
                        }
                     }

                     if (!var13.field9468 && var27) {
                        var13.field9468 = true;
                        if (var13.field9613 != null) {
                           class586 var55 = new class586();
                           var55.field8645 = true;
                           var55.field8655 = var13;
                           var55.field8653 = var22 + var28.method1557(-1012) - var14;
                           var55.field8646 = var23 + var28.method1554((byte)118) - var15;
                           var55.field8648 = var13.field9613;
                           class452.field6201.method279(false, var55);
                        }
                     }

                     if (var13.field9468 && var26 && var13.field9548 != null) {
                        class586 var56 = new class586();
                        var56.field8645 = true;
                        var56.field8655 = var13;
                        var56.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                        var56.field8646 = var23 + class372.field5216.method1566(0) - var15;
                        var56.field8648 = var13.field9548;
                        class452.field6201.method279(false, var56);
                     }

                     if (var13.field9468 && !var26) {
                        var13.field9468 = false;
                        if (var13.field9547 != null) {
                           class586 var57 = new class586();
                           var57.field8645 = true;
                           var57.field8655 = var13;
                           var57.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                           var57.field8646 = var23 + class372.field5216.method1566(0) - var15;
                           var57.field8648 = var13.field9547;
                           class728.field10615.method279(false, var57);
                        }
                     }

                     if (var26 && var13.field9514 != null) {
                        class586 var58 = new class586();
                        var58.field8645 = true;
                        var58.field8655 = var13;
                        var58.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                        var58.field8646 = var23 + class372.field5216.method1566(0) - var15;
                        var58.field8648 = var13.field9514;
                        class452.field6201.method279(false, var58);
                     }

                     if (!var13.field9575 && var25) {
                        var13.field9575 = true;
                        if (var13.field9623 != null) {
                           class586 var59 = new class586();
                           var59.field8645 = true;
                           var59.field8655 = var13;
                           var59.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                           var59.field8646 = var23 + class372.field5216.method1566(0) - var15;
                           var59.field8648 = var13.field9623;
                           class452.field6201.method279(false, var59);
                        }
                     }

                     if (var13.field9575 && var25 && var13.field9526 != null) {
                        class586 var60 = new class586();
                        var60.field8645 = true;
                        var60.field8655 = var13;
                        var60.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                        var60.field8646 = var23 + class372.field5216.method1566(0) - var15;
                        var60.field8648 = var13.field9526;
                        class452.field6201.method279(false, var60);
                     }

                     if (var13.field9575 && !var25) {
                        var13.field9575 = false;
                        if (var13.field9484 != null) {
                           class586 var61 = new class586();
                           var61.field8645 = true;
                           var61.field8655 = var13;
                           var61.field8653 = var22 + class372.field5216.method1570(29658) - var14;
                           var61.field8646 = var23 + class372.field5216.method1566(0) - var15;
                           var61.field8648 = var13.field9484;
                           class728.field10615.method279(false, var61);
                        }
                     }

                     if (var13.field9583 != null) {
                        class586 var62 = new class586();
                        var62.field8655 = var13;
                        var62.field8648 = var13.field9583;
                        class631.field9305.method279(false, var62);
                     }

                     if (var13.field9479 != null && class311.field4329 > var13.field9635) {
                        if (var13.field9515 != null && class311.field4329 - var13.field9635 <= 32) {
                           label751:
                           for(int var63 = var13.field9635; var63 < class311.field4329; ++var63) {
                              int var64 = class630.field9301[var63 & 31];

                              for(int var65 = 0; var65 < var13.field9515.length; ++var65) {
                                 if (var13.field9515[var65] == var64) {
                                    class586 var66 = new class586();
                                    var66.field8655 = var13;
                                    var66.field8648 = var13.field9479;
                                    class452.field6201.method279(false, var66);
                                    break label751;
                                 }
                              }
                           }
                        } else {
                           class586 var67 = new class586();
                           var67.field8655 = var13;
                           var67.field8648 = var13.field9479;
                           class452.field6201.method279(false, var67);
                        }

                        var13.field9635 = class311.field4329;
                     }

                     if (var13.field9620 != null && class130.field1664 > var13.field9607) {
                        if (var13.field9505 != null && class130.field1664 - var13.field9607 <= 32) {
                           label727:
                           for(int var68 = var13.field9607; var68 < class130.field1664; ++var68) {
                              int var69 = class23.field363[var68 & 31];

                              for(int var70 = 0; var70 < var13.field9505.length; ++var70) {
                                 if (var13.field9505[var70] == var69) {
                                    class586 var71 = new class586();
                                    var71.field8655 = var13;
                                    var71.field8648 = var13.field9620;
                                    class452.field6201.method279(false, var71);
                                    break label727;
                                 }
                              }
                           }
                        } else {
                           class586 var72 = new class586();
                           var72.field8655 = var13;
                           var72.field8648 = var13.field9620;
                           class452.field6201.method279(false, var72);
                        }

                        var13.field9607 = class130.field1664;
                     }

                     if (var13.field9483 != null && class496.field6941 > var13.field9541) {
                        if (var13.field9527 != null && class496.field6941 - var13.field9541 <= 32) {
                           label703:
                           for(int var73 = var13.field9541; var73 < class496.field6941; ++var73) {
                              int var74 = class224.field2811[var73 & 31];

                              for(int var75 = 0; var75 < var13.field9527.length; ++var75) {
                                 if (var13.field9527[var75] == var74) {
                                    class586 var76 = new class586();
                                    var76.field8655 = var13;
                                    var76.field8648 = var13.field9483;
                                    class452.field6201.method279(false, var76);
                                    break label703;
                                 }
                              }
                           }
                        } else {
                           class586 var77 = new class586();
                           var77.field8655 = var13;
                           var77.field8648 = var13.field9483;
                           class452.field6201.method279(false, var77);
                        }

                        var13.field9541 = class496.field6941;
                     }

                     if (var13.field9466 != null && class376.field5243 > var13.field9549) {
                        if (var13.field9626 != null && class376.field5243 - var13.field9549 <= 32) {
                           label679:
                           for(int var78 = var13.field9549; var78 < class376.field5243; ++var78) {
                              int var79 = class729.field10637[var78 & 31];

                              for(int var80 = 0; var80 < var13.field9626.length; ++var80) {
                                 if (var13.field9626[var80] == var79) {
                                    class586 var81 = new class586();
                                    var81.field8655 = var13;
                                    var81.field8648 = var13.field9466;
                                    class452.field6201.method279(false, var81);
                                    break label679;
                                 }
                              }
                           }
                        } else {
                           class586 var82 = new class586();
                           var82.field8655 = var13;
                           var82.field8648 = var13.field9466;
                           class452.field6201.method279(false, var82);
                        }

                        var13.field9549 = class376.field5243;
                     }

                     if (var13.field9554 != null && class650.field9700 > var13.field9595) {
                        if (var13.field9562 != null && class650.field9700 - var13.field9595 <= 32) {
                           label655:
                           for(int var83 = var13.field9595; var83 < class650.field9700; ++var83) {
                              int var84 = class233.field2893[var83 & 31];

                              for(int var85 = 0; var85 < var13.field9562.length; ++var85) {
                                 if (var13.field9562[var85] == var84) {
                                    class586 var86 = new class586();
                                    var86.field8655 = var13;
                                    var86.field8648 = var13.field9554;
                                    class452.field6201.method279(false, var86);
                                    break label655;
                                 }
                              }
                           }
                        } else {
                           class586 var87 = new class586();
                           var87.field8655 = var13;
                           var87.field8648 = var13.field9554;
                           class452.field6201.method279(false, var87);
                        }

                        var13.field9595 = class650.field9700;
                     }

                     if (var13.field9520 != null && class667.field9881 > var13.field9573) {
                        if (var13.field9512 != null && class667.field9881 - var13.field9573 <= 32) {
                           label631:
                           for(int var88 = var13.field9573; var88 < class667.field9881; ++var88) {
                              int var89 = class112.field1495[var88 & 31];

                              for(int var90 = 0; var90 < var13.field9512.length; ++var90) {
                                 if (var13.field9512[var90] == var89) {
                                    class586 var91 = new class586();
                                    var91.field8655 = var13;
                                    var91.field8648 = var13.field9520;
                                    class452.field6201.method279(false, var91);
                                    break label631;
                                 }
                              }
                           }
                        } else {
                           class586 var92 = new class586();
                           var92.field8655 = var13;
                           var92.field8648 = var13.field9520;
                           class452.field6201.method279(false, var92);
                        }

                        var13.field9573 = class667.field9881;
                     }

                     if (class281.field3657 > var13.field9631 && var13.field9539 != null) {
                        class586 var93 = new class586();
                        var93.field8655 = var13;
                        var93.field8648 = var13.field9539;
                        class452.field6201.method279(false, var93);
                     }

                     if (class224.field2809 > var13.field9631 && var13.field9543 != null) {
                        class586 var94 = new class586();
                        var94.field8655 = var13;
                        var94.field8648 = var13.field9543;
                        class452.field6201.method279(false, var94);
                     }

                     if (class88.field1200 > var13.field9631 && var13.field9644 != null) {
                        class586 var95 = new class586();
                        var95.field8655 = var13;
                        var95.field8648 = var13.field9644;
                        class452.field6201.method279(false, var95);
                     }

                     if (class291.field4009 > var13.field9631 && var13.field9569 != null) {
                        class586 var96 = new class586();
                        var96.field8655 = var13;
                        var96.field8648 = var13.field9569;
                        class452.field6201.method279(false, var96);
                     }

                     if (class747.field10921 > var13.field9631 && var13.field9467 != null) {
                        class586 var97 = new class586();
                        var97.field8655 = var13;
                        var97.field8648 = var13.field9467;
                        class452.field6201.method279(false, var97);
                     }

                     if (class630.field9303 > var13.field9631 && var13.field9552 != null) {
                        class586 var98 = new class586();
                        var98.field8655 = var13;
                        var98.field8648 = var13.field9552;
                        class452.field6201.method279(false, var98);
                     }

                     if (class42.field552 > var13.field9631 && var13.field9525 != null) {
                        class586 var99 = new class586();
                        var99.field8655 = var13;
                        var99.field8648 = var13.field9525;
                        class452.field6201.method279(false, var99);
                     }

                     var13.field9631 = class10.field229;
                     if (var13.field9508 != null) {
                        for(int var100 = 0; var100 < class581.field8591; ++var100) {
                           class586 var101 = new class586();
                           var101.field8655 = var13;
                           var101.field8652 = class69.field915[var100].method2883(-25);
                           var101.field8642 = class69.field915[var100].method2878(-32420);
                           var101.field8648 = var13.field9508;
                           class452.field6201.method279(false, var101);
                        }
                     }

                     if (class46.field581 && var13.field9521 != null) {
                        class586 var102 = new class586();
                        var102.field8655 = var13;
                        var102.field8648 = var13.field9521;
                        class452.field6201.method279(false, var102);
                     }
                  }

                  if (var13.field9493 == 5 && var13.field9506 != -1) {
                     var13.method4739(class720.field10555, (byte)-8, class263.field3339).method3556(93, class629.field9294, var13.field9572);
                  }

                  class70.method695(false, var13);
                  if (var13.field9493 == 0) {
                     method993(arg0, var13.field9482, var16, var17, var18, var19, var14 - var13.field9556, var15 - var13.field9584, arg8, arg9, arg10, arg11);
                     if (var13.field9530 != null) {
                        method993(var13.field9530, var13.field9482, var16, var17, var18, var19, var14 - var13.field9556, var15 - var13.field9584, arg8, arg9, arg10, arg11);
                     }

                     class710 var103 = (class710)class397.field5473.method1818(-1, (long)var13.field9482);
                     if (var103 != null) {
                        if (class688.field10127 == class450.field6103 && var103.field10417 == 0 && !class652.field9742 && var25 && !class497.field6955) {
                           class202.method1673((byte)52);
                        }

                        class529.method3948(var16, var103.field10422, arg8, var17, arg9, var18, var19, var15, arg11, arg10, -125, var14);
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method751(int arg0) {
      try {
         if (arg0 > 106) {
            ++field1472;
            if (~class757.field11093.field11012.method27(-18033) == -3) {
               try {
                  this.method992(16360);
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class668.method4877((byte)-62, var6, var6.getMessage() + field1482[10] + this.method754(26519));
                  class337.field4608 = true;
                  class214.method1749(0, false, 127);
               }
            } else {
               this.method992(16360);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1482[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(I)V"
   )
   public final synchronized void method753(int arg0) {
      try {
         if (arg0 <= -55) {
            ++field1464;
            if (class152.field1893 != null && class590.field8691 == null && !class366.field5092.field10749) {
               try {
                  Class var2 = class152.field1893.getClass();
                  Field var3 = var2.getDeclaredField(field1482[8]);
                  class590.field8691 = (Canvas)var3.get(class152.field1893);
                  var3.set(class152.field1893, (Object)null);
                  if (class590.field8691 != null) {
                     return;
                  }
               } catch (Exception var5) {
               }
            }

            super.method753(-103);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1482[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Loca;)Z"
   )
   public static final boolean method994(class642 arg0) {
      if (class497.field6955) {
         if (method999(arg0).field10630 != 0) {
            return false;
         }

         if (arg0.field9493 == 0) {
            return false;
         }
      }

      return arg0.field9610;
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V"
   )
   public static final void method995() {
      int var0 = class304.field4255;
      int[] var1 = class710.field10421;
      int var2 = class3.field35 ? var0 : class737.field10798 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class9 var4;
         if (var3 < var0) {
            var4 = class59.field771[var1[var3]];
         } else {
            var4 = ((class411)class35.field493.method1818(-1, (long)class277.field3534[var3 - var0])).field5654;
         }

         if (var4.field112 >= 0) {
            int var5 = var4.method78(0);
            if ((var5 & 1) == 0) {
               if ((var4.field10467 & 511) == 0 && (var4.field10468 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field10467 & 511) == 256 && (var4.field10468 & 511) == 256) {
               continue;
            }

            var4.field10466 = class215.method1757(var4.field10467, false, var4.field10457, var4.field10468);
            class606.method4491(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V"
   )
   public static final void method996() {
      int var0 = class304.field4255;
      int[] var1 = class710.field10421;
      int var2 = class757.field11093.field10987.method2348(-18033);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class783 var14 = class59.field771[var1[var4]];
         if (!var14.method5653((byte)-24)) {
            var14.field112 = -1;
         } else if (var14.field11405) {
            var14.field112 = -1;
         } else {
            var14.method84((byte)36);
            if (var14.field10010 >= 0 && var14.field10011 >= 0 && var14.field10015 < class273.field3491 && var14.field10020 < class211.field2689) {
               var14.field11396 = var14.field154 ? var3 : false;
               if (class204.field2593 == var14) {
                  var14.field112 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field148) {
                     ++var15;
                  }

                  if (var14.field130 > class413.field5678) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method78(0) << 2);
                  if (!var14.field11450 && !var14.field11406) {
                     if (class204.field2595 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field112 = var16 + 1;
               }
            } else {
               var14.field112 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class737.field10798; ++var5) {
         class81 var11 = ((class411)class35.field493.method1818(-1, (long)class277.field3534[var5])).field5654;
         if (var11.method792((byte)-24) && var11.field1135.method3599(-1, class175.field2266)) {
            var11.method84((byte)36);
            if (var11.field10010 >= 0 && var11.field10011 >= 0 && var11.field10015 < class273.field3491 && var11.field10020 < class211.field2689) {
               int var12 = 0;
               if (!var11.field148) {
                  ++var12;
               }

               if (var11.field130 > class413.field5678) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method78(0) << 2);
               if (class204.field2595 == 0) {
                  if (var11.field1135.field6561) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class204.field2595 == 1) {
                  if (var11.field1135.field6561) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field1135.field6523) {
                  var13 += 1024;
               } else if (!var11.field1135.field6534) {
                  var13 += 256;
               }

               var11.field112 = var13 + 1;
            } else {
               var11.field112 = -1;
            }
         } else {
            var11.field112 = -1;
         }
      }

      for(int var6 = 0; var6 < class570.field8383.length; ++var6) {
         class337 var7 = class570.field8383[var6];
         if (var7 != null) {
            if (var7.field4618 == 1) {
               class411 var8 = (class411)class35.field493.method1818(-1, (long)var7.field4613);
               if (var8 != null) {
                  class81 var9 = var8.field5654;
                  if (var9.field112 >= 0) {
                     var9.field112 += 2048;
                  }
               }
            } else if (var7.field4618 == 10) {
               class783 var10 = class59.field771[var7.field4613];
               if (var10 != null && class204.field2593 != var10 && var10.field112 >= 0) {
                  var10.field112 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method748(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "m",
      descriptor = "(I)V"
   )
   public static final void method997(int arg0) {
      int var1 = class304.field4255;
      int[] var2 = class710.field10421;
      int var3 = class3.field35 ? var1 : class737.field10798 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class9 var5;
         if (var4 < var1) {
            var5 = class59.field771[var2[var4]];
         } else {
            var5 = ((class411)class35.field493.method1818(-1, (long)class277.field3534[var4 - var1])).field5654;
         }

         if (var5.field10457 == arg0) {
            var5.field165 = 0;
            if (var5.field112 < 0) {
               var5.field148 = false;
            } else {
               int var6 = var5.method78(0);
               if ((var6 & 1) == 0) {
                  if ((var5.field10467 & 511) != 0 || (var5.field10468 & 511) != 0) {
                     var5.field148 = false;
                     continue;
                  }
               } else if ((var5.field10467 & 511) != 256 || (var5.field10468 & 511) != 256) {
                  var5.field148 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field10467 >> 9;
                  int var8 = var5.field10468 >> 9;
                  if (class9.field191[var7][var8] != var5.field112) {
                     var5.field148 = true;
                     continue;
                  }

                  if (class28.field417[var7][var8] > 1) {
                     var10002 = class28.field417[var7][var8]--;
                     var5.field148 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field10467 - var9 >> 9;
                  int var11 = var5.field10468 - var9 >> 9;
                  int var12 = var5.field10467 + var9 >> 9;
                  int var13 = var5.field10468 + var9 >> 9;
                  if (!class775.method5598(var13, var12, var11, (byte)123, var5.field112, var10)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class9.field191[var14][var15] == var5.field112) {
                              var10002 = class28.field417[var14][var15]--;
                           }
                        }
                     }

                     var5.field148 = true;
                     continue;
                  }
               }

               var5.field148 = false;
               var5.field10466 = class215.method1757(var5.field10467, false, var5.field10457, var5.field10468);
               class606.method4491(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Loca;)Loca;"
   )
   public static final class642 method998(class642 arg0) {
      int var1 = method999(arg0).method5274((byte)-89);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class82.method795(arg0.field9589, -26545);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Loca;)Lcca;"
   )
   public static final class729 method999(class642 arg0) {
      class729 var1 = (class729)class793.field11600.method1818(-1, ((long)arg0.field9482 << 32) + (long)arg0.field9518);
      return var1 != null ? var1 : arg0.field9491;
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1000(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1001(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1002(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
