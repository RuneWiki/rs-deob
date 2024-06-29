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
public class client extends class46 {
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10023 = new String[]{method5057(method5056("B\u001eZ&aU\\ek")), method5057(method5056("\u0001Za&lN\u0004V1jE[\u0013")), method5057(method5056("B\u001eZ&aU\\wk")), method5057(method5056("B\u001eZ&aU\\}k")), method5057(method5056("\u0001_\r")), method5057(method5056("\u001d\u0011\\/2G\u0014U%iGL")), method5057(method5056("o\u0007_/")), method5057(method5056("\u0010@\u0004m?\u000fB\u001dr")), method5057(method5056("B\u001eZ&aU\\bk")), method5057(method5056("k\u0013T&w")), method5057(method5056("K\u0001\u0006 `O\u001cV {")), method5057(method5056("K\u0001\u0006 `O\u001cV {~\u001dF7`G\u0016R7j")), method5057(method5056("K\u0001\u00063}N\nJ\u001c")), method5057(method5056("K\u0001\u0006 `O\u001cV {~\u0014F/c")), method5057(method5056("K\u0001\u0006 }B")), method5057(method5056("B\u001eZ&aU\\gk")), method5057(method5056("K\u0001\u0006*`")), method5057(method5056("B\u001eZ&aU\\\u007fk")), method5057(method5056("B\u0013]5nR")), method5057(method5056("B\u001eZ&aU\\{k")), method5057(method5056("B\u001eZ&aU\\vk")), method5057(method5056("D\u001cT/fR\u001a")), method5057(method5056("F\u0013^&")), method5057(method5056("M\u001bE&")), method5057(method5056("M\u0013]$z@\u0015V")), method5057(method5056("O\u0007_/")), method5057(method5056("F\u0013^&?")), method5057(method5056("F\u0013^&=")), method5057(method5056("F\u0013^&>")), method5057(method5056("S\u0011")), method5057(method5056("F\u0013^&<")), method5057(method5056("L\u001dW&xI\u0013G")), method5057(method5056("B\u001eZ&aU\\^\"fOZ")), method5057(method5056("F\u0017A.nO")), method5057(method5056("`\u0000T6bD\u001cGclN\u0007]7")), method5057(method5056("V\u001bC")), method5057(method5056("Z\\\u001dmr")), method5057(method5056("R\u0005\u0000'!E\u001e_")), method5057(method5056("\u0010C\u001a")), method5057(method5056("\u0010F\u001a")), method5057(method5056("\u0010@\u001a")), method5057(method5056("R\u0017G\u0002lB\u0017@0fC\u001eV")), method5057(method5056("]C\u0005j")), method5057(method5056("\u0016[")), method5057(method5056("]C\u0006j")), method5057(method5056("B\u001eZ&aU")), method5057(method5056("O\u0013^&")), method5057(method5056("K\u0013E\"!M\u0013]$!S\u0017U/jB\u0006\u001d\u0002lB\u0017@0fC\u001eV\fmK\u0017P7")), method5057(method5056("K\u0013E\"!M\u0013]$!b\u001eR0|m\u001dR'jS")), method5057(method5056("\u0010A\u001a")), method5057(method5056("\u0018[")), method5057(method5056("zC\u001a")), method5057(method5056("]F\u001a")), method5057(method5056("]G\u001a")), method5057(method5056("O\u0013G*yD>Z!}@\u0000Z&|")), method5057(method5056("\u0019[")), method5057(method5056("]D\u001a")), method5057(method5056("\u0013[")), method5057(method5056("B\u001eZ&aU\\~k")), method5057(method5056("\u0012[")), method5057(method5056("\u0010B\u001a")), method5057(method5056("I\u0013]'cD")), method5057(method5056("B\u001eZ&aU\\rk")), method5057(method5056("T\u0001V1IM\u001dD")), method5057(method5056("V\u001dA/kH\u0016")), method5057(method5056("R\u0017G7fO\u0015@")), method5057(method5056("N\u0010Y&lU\u0006R$")), method5057(method5056("B\u001d_,zS\u001bW")), method5057(method5056("@\u0014U*k")), method5057(method5056("V\u001dA/kG\u001eR$|")), method5057(method5056("B\u001eZ&aU\\Z-fUZ")), method5057(method5056("@\u0016E&}U")), method5057(method5056("M\u001dQ!vH\u0016")), method5057(method5056("G\u001dA j\u0017F^!")), method5057(method5056("U\u0000F&")), method5057(method5056("M\u0013]$")), method5057(method5056("M\u001dQ!v@\u0016W1jR\u0001")), method5057(method5056("G\u0000\\.mH\u001e_*aF")), method5057(method5056("P\u0007Z7zS\u001e")), method5057(method5056("B\u001dF-{S\u000b")), method5057(method5056("R\u0001X&v")), method5057(method5056("L\u001dW&xI\u0017A&")), method5057(method5056("R\u001bG&|D\u0006G*aF\u0001l.jL\u0010V1")), method5057(method5056("@\u0016W*{H\u001d]\"ch\u001cU,")), method5057(method5056("K\u0001")), method5057(method5056("T\u001cW&}")), method5057(method5056("B\u001eZ&aU\\r\u0002'")), method5057(method5056("B\u001eZ&aU\\fk")), method5057(method5056("B\u001eZ&aU\\dk")), method5057(method5056("\u001d\u0010A}'")), method5057(method5056("\u0004[")), method5057(method5056("\u001d\u0010A}")), method5057(method5056("B\u001eZ&aU\\ak")), method5057(method5056("B\u001eZ&aU\\zk"))};
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field10003;
   @OriginalMember(
      owner = "client!client",
      name = "kb",
      descriptor = "I"
   )
   public static int field10004;
   @OriginalMember(
      owner = "client!client",
      name = "eb",
      descriptor = "I"
   )
   public static int field10006;
   @OriginalMember(
      owner = "client!client",
      name = "gb",
      descriptor = "I"
   )
   public static int field10007;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "I"
   )
   public static int field10008;
   @OriginalMember(
      owner = "client!client",
      name = "hb",
      descriptor = "I"
   )
   public static int field10009;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "I"
   )
   public static int field10010;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "I"
   )
   public static int field10011;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field10012;
   @OriginalMember(
      owner = "client!client",
      name = "mb",
      descriptor = "I"
   )
   public static int field10013;
   @OriginalMember(
      owner = "client!client",
      name = "jb",
      descriptor = "I"
   )
   public static int field10014;
   @OriginalMember(
      owner = "client!client",
      name = "lb",
      descriptor = "I"
   )
   public static int field10015;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field10016;
   @OriginalMember(
      owner = "client!client",
      name = "db",
      descriptor = "I"
   )
   public static int field10017;
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "I"
   )
   public static int field10018;
   @OriginalMember(
      owner = "client!client",
      name = "ib",
      descriptor = "I"
   )
   public static int field10019;
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "I"
   )
   public static int field10020;
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "Lil;"
   )
   public static class574 field10005;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10021;
   @OriginalMember(
      owner = "client!client",
      name = "fb",
      descriptor = "Z"
   )
   public static boolean field10022;

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method5037(byte arg0, int arg1) {
      try {
         class766.field10986 = null;
         class613.field8722 = null;
         ++field10013;
         if (arg0 != 115) {
            field10005 = null;
         }

         class456.field6660.field9181 = arg1;
         class801.field11654 = 0;
         ++class456.field6660.field9180;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10023[87] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Ljga;)Ljga;"
   )
   public static final class91 method5038(class91 arg0) {
      int var1 = method5048(arg0).method3235((byte)42);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class460.method3554(-125, arg0.field1407);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method5039(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method5040(boolean arg0) {
      boolean var2 = field10022;

      try {
         ++field10006;
         if (class536.field7533 < class456.field6660.field9180) {
            class750.field10662.method1415((byte)-17);
            class50.field752 = (class456.field6660.field9180 + -1) * 5 * 50;
            if (~class50.field752 < -3001) {
               class50.field752 = 3000;
            }

            if (class456.field6660.field9180 >= 2 && class456.field6660.field9181 == 6) {
               this.method520(field10023[11], (byte)99);
               class394.field5712 = 16;
               return;
            }

            if (~class456.field6660.field9180 <= -5 && ~class456.field6660.field9181 == 0) {
               this.method520(field10023[14], (byte)101);
               class394.field5712 = 16;
               return;
            }

            if (class456.field6660.field9180 >= 4 && class62.method626(true, class394.field5712)) {
               label127: {
                  if (class456.field6660.field9181 != 7 && ~class456.field6660.field9181 != -10) {
                     if (~class456.field6660.field9181 >= -1) {
                        this.method520(field10023[16], (byte)108);
                        if (!var2) {
                           break label127;
                        }
                     }

                     if (class129.field2053 == null) {
                        this.method520(field10023[10], (byte)98);
                        if (!var2) {
                           break label127;
                        }
                     }

                     this.method520(field10023[12] + class129.field2053.trim(), (byte)115);
                     if (!var2) {
                        break label127;
                     }
                  }

                  this.method520(field10023[13], (byte)119);
               }

               class394.field5712 = 16;
               return;
            }
         }

         class536.field7533 = class456.field6660.field9180;
         if (class50.field752 > 0) {
            --class50.field752;
         } else {
            try {
               if (arg0) {
                  field10016 = 81;
               }

               if (class801.field11654 == 0) {
                  class613.field8722 = class750.field10662.method1416((byte)-4, class720.field10318);
                  ++class801.field11654;
               }

               if (class801.field11654 == 1) {
                  if (~class613.field8722.field1526 == -3) {
                     if (class613.field8722.field1525 != null) {
                        class129.field2053 = (String)class613.field8722.field1525;
                     }

                     this.method5037((byte)115, 1000);
                     return;
                  }

                  if (class613.field8722.field1526 == 1) {
                     ++class801.field11654;
                  }
               }

               if (~class801.field11654 == -3) {
                  class766.field10986 = new class796((Socket)class613.field8722.field1525, class720.field10318, 25000);
                  class65 var3 = new class65(5);
                  var3.method656((byte)57, class765.field10971.field11484);
                  var3.method674(-53, 660);
                  class766.field10986.method5730(false, 0, 5, var3.field942);
                  ++class801.field11654;
                  class260.field3984 = class604.method4452(61);
               }

               if (class801.field11654 == 3) {
                  label204: {
                     if (class62.method626(!arg0, class394.field5712) || ~class766.field10986.method5736((byte)-110) < -1) {
                        int var4 = class766.field10986.method5738((byte)-116);
                        if (~var4 != -1) {
                           this.method5037((byte)115, var4);
                           return;
                        }

                        ++class801.field11654;
                        if (!var2) {
                           break label204;
                        }
                     }

                     if (-class260.field3984 + class604.method4452(15) > 30000L) {
                        this.method5037((byte)115, 1001);
                        return;
                     }
                  }
               }

               if (~class801.field11654 == -5) {
                  boolean var5 = class62.method626(true, class394.field5712) || class783.method5655(class394.field5712, 0) || class239.method2100(class394.field5712, true);
                  class186[] var6 = class186.method1673(6410);
                  class65 var7 = new class65(var6.length * 4);
                  class766.field10986.method5731(97, 0, var7.field942, var7.field942.length);
                  int var8 = 0;
                  if (var2) {
                     var6[var8].method1669(var7.method701(255), 76);
                     ++var8;
                  }

                  while(true) {
                     while(~var8 > ~var6.length) {
                        var6[var8].method1669(var7.method701(255), 76);
                        ++var8;
                     }

                     if (!var2) {
                        class456.field6660.method4721(!arg0, !var5, class766.field10986);
                        class766.field10986 = null;
                        class801.field11654 = 0;
                        class613.field8722 = null;
                        return;
                     }

                     ++var8;
                  }
               }
            } catch (IOException var10) {
               this.method5037((byte)115, 1002);
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10023[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method512(int arg0) {
      try {
         ++field10014;
         if (arg0 != class476.field6870.field9109.method4676(-57)) {
            this.method5042((byte)109);
         } else {
            try {
               this.method5042((byte)60);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class117.method1138(arg0 ^ 78, var6.getMessage() + field10023[1] + this.method510((byte)-62), var6);
               class39.field594 = true;
               class508.method3828(arg0 + -1, false, 0);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10023[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method510(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V"
   )
   public static final void method5041() {
      class714.field10248 = 0;

      for(int var0 = 0; var0 < class261.field3995; ++var0) {
         class799 var1 = ((class432)class573.field8110.method3101(-1, (long)class344.field5068[var0])).field6345;
         if (var1.field5770 && var1.method1503((byte)65) != -1) {
            int var2 = (var1.method1507(-128) - 1) * 256 + 252;
            int var3 = var1.field6832 - var2 >> 9;
            int var4 = var1.field6833 - var2 >> 9;
            class395 var5 = class681.method4976(var1.field6824, var4, var3, false);
            if (var5 != null) {
               int var6 = var5.field5826;
               if (var5 instanceof class799) {
                  var6 += 2048;
               }

               if (var5.field5777 == 0 && var5.method1503((byte)65) != -1) {
                  class671.field9418[class714.field10248] = var6;
                  class533.field7515[class714.field10248] = var6;
                  ++class714.field10248;
                  ++var5.field5777;
               }

               class671.field9418[class714.field10248] = var6;
               class533.field7515[class714.field10248] = var1.field5826 + 2048;
               ++class714.field10248;
               ++var5.field5777;
            }
         }
      }

      class502.method3795(class533.field7515, 0, class714.field10248 - 1, (byte)-122, class671.field9418);
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method5042(byte arg0) {
      boolean var2 = field10022;

      try {
         ++field10008;
         if (class394.field5712 != 16) {
            long var3 = class361.method2842(-126) / 1000000L - class774.field11275;
            class774.field11275 = class361.method2842(-124) / 1000000L;
            boolean var5 = class423.method3292(124);
            if (arg0 < 44) {
               method5046((byte[])null, true, (byte)-67);
            }

            if (var5 && class253.field3843 && class375.field5484 != null) {
               class375.field5484.method5668(-117);
            }

            if (class126.method1296(class394.field5712, 7387)) {
               label373: {
                  if (class561.field7989 != 0L && class561.field7989 < class604.method4452(89)) {
                     class306.method2519(class40.method477(false), class193.field2804, (byte)-122, false, class678.field9658);
                     if (!var2) {
                        break label373;
                     }
                  }

                  if (!class54.field794.method201() && class784.field11418) {
                     class781.method5643(127);
                  }
               }
            }

            if (class687.field9907 == null) {
               Container var6;
               label365: {
                  if (class800.field11642 == null) {
                     if (class289.field4303 == null) {
                        var6 = class65.field898;
                        if (!var2) {
                           break label365;
                        }
                     }

                     var6 = class289.field4303;
                     if (!var2) {
                        break label365;
                     }
                  }

                  var6 = class800.field11642;
               }

               int var7 = var6.getSize().width;
               int var8 = var6.getSize().height;
               if (class800.field11642 == var6) {
                  Insets var9 = class800.field11642.getInsets();
                  var7 -= var9.right + var9.left;
                  var8 -= var9.top - -var9.bottom;
               }

               if (class91.field1368 != var7 || ~class223.field3171 != ~var8 || class350.field5131) {
                  label396: {
                     if (class54.field794 == null || class54.field794.method208()) {
                        class619.method4566((byte)65);
                        if (!var2) {
                           break label396;
                        }
                     }

                     class223.field3171 = var8;
                     class91.field1368 = var7;
                  }

                  class561.field7989 = 500L + class604.method4452(-125);
                  class350.field5131 = false;
               }
            }

            if (class687.field9907 != null && !class77.field1240 && class126.method1296(class394.field5712, 7387)) {
               class306.method2519(class476.field6870.field9136.method1905(-109), -1, (byte)-126, false, -1);
            }

            boolean var10 = false;
            if (class127.field2045) {
               class127.field2045 = false;
               var10 = true;
            }

            if (var10) {
               class646.method4702(true);
            }

            if (class54.field794 != null && class54.field794.method201() || ~class40.method477(false) != -2) {
               class258.method2194(-88);
            }

            label331: {
               if (!class62.method626(true, class394.field5712)) {
                  if (class366.method2882(-29222, class394.field5712)) {
                     class210.method1813((byte)-4);
                     if (!var2) {
                        break label331;
                     }
                  }

                  if (class274.method2318(class394.field5712, (byte)-125)) {
                     class210.method1813((byte)-4);
                     if (!var2) {
                        break label331;
                     }
                  }

                  if (class391.method3038(95, class394.field5712)) {
                     if (class702.field10113 != 1) {
                        if (class702.field10113 != 2) {
                           class644.method4685(class383.field5587, class765.field10915.method5512(-2, class777.field11340), (byte)-69, true, class510.field7243, class54.field794);
                           if (!var2) {
                              break label331;
                           }
                        }

                        if (class161.field2455 > class462.field6723) {
                           class462.field6723 = class161.field2455;
                        }

                        int var11 = (-class161.field2455 + class462.field6723) * 50 / class462.field6723 + 50;
                        class644.method4685(class383.field5587, class765.field10915.method5512(-2, class777.field11340) + field10023[89] + var11 + field10023[90], (byte)-30, true, class510.field7243, class54.field794);
                        if (!var2) {
                           break label331;
                        }
                     }

                     if (class548.field7805 < class124.field1984) {
                        class548.field7805 = class124.field1984;
                     }

                     int var12 = (-class124.field1984 + class548.field7805) * 50 / class548.field7805;
                     class644.method4685(class383.field5587, class765.field10915.method5512(-2, class777.field11340) + field10023[89] + var12 + field10023[90], (byte)-128, true, class510.field7243, class54.field794);
                     if (!var2) {
                        break label331;
                     }
                  }

                  if (class394.field5712 == 11) {
                     class556.method4142(-126, var3);
                     if (!var2) {
                        break label331;
                     }
                  }

                  if (~class394.field5712 == -15) {
                     class644.method4685(class383.field5587, class765.field10917.method5512(-2, class777.field11340) + field10023[91] + class765.field10918.method5512(-2, class777.field11340), (byte)-104, false, class510.field7243, class54.field794);
                     if (!var2) {
                        break label331;
                     }
                  }

                  if (~class394.field5712 != -16) {
                     break label331;
                  }

                  class644.method4685(class383.field5587, class765.field10934.method5512(-2, class777.field11340), (byte)-32, false, class510.field7243, class54.field794);
                  if (!var2) {
                     break label331;
                  }
               }

               class716.method5191(119, var10);
            }

            if (~class622.field8886 == -4) {
               int var13 = 0;
               if (var2 || class766.field10999 > var13) {
                  do {
                     Rectangle var14 = class223.field3167[var13];
                     if (class15.field210[var13]) {
                        class54.field794.method186(var14.width, var14.height, (byte)-11, -65281, var14.y, var14.x);
                        if (!var2) {
                           ++var13;
                           continue;
                        }
                     }

                     if (class55.field798[var13]) {
                        class54.field794.method186(var14.width, var14.height, (byte)-11, -65536, var14.y, var14.x);
                        if (!var2) {
                           ++var13;
                           continue;
                        }
                     }

                     class54.field794.method186(var14.width, var14.height, (byte)-11, -16711936, var14.y, var14.x);
                     ++var13;
                  } while(class766.field10999 > var13);
               }
            }

            if (class774.method5580((byte)124)) {
               class418.method3266(class54.field794, (byte)95);
            }

            label401: {
               if (!class720.field10318.field1291 || !class126.method1296(class394.field5712, 7387) || class622.field8886 != 0 || ~class40.method477(false) != -2 || var10) {
                  if (class62.method626(true, class394.field5712)) {
                     break label401;
                  }

                  int var15 = 0;
                  if (var2) {
                     class55.field798[var15] = false;
                     ++var15;
                  }

                  while(true) {
                     while(~class766.field10999 < ~var15) {
                        class55.field798[var15] = false;
                        ++var15;
                     }

                     try {
                        if (!var2) {
                           if (class563.field8012) {
                              class671.method4863(-29289);
                              if (!var2) {
                                 break label401;
                              }
                           }

                           class54.field794.method142(55);
                           break label401;
                        }
                     } catch (class37 var22) {
                        class117.method1138(-127, var22.getMessage() + field10023[1] + this.method510((byte)-76), var22);
                        class508.method3828(1, false, 0);
                        if (!var2) {
                           break label401;
                        }
                        break;
                     }

                     ++var15;
                  }
               }

               int var17 = 0;
               int var18 = 0;
               if (var2) {
                  if (class55.field798[var18]) {
                     class55.field798[var18] = false;
                     class511.field7258[var17++] = class223.field3167[var18];
                  }

                  ++var18;
               }

               while(true) {
                  boolean var10000;
                  if (class766.field10999 <= var18) {
                     try {
                        var10000 = class563.field8012;
                        if (!var2) {
                           if (!var10000) {
                              class54.field794.method172(class511.field7258, -105, var17);
                              if (!var2) {
                                 break;
                              }
                           }

                           class300.method2489(false, var17, class511.field7258);
                           break;
                        }
                     } catch (class37 var21) {
                        break;
                     }
                  } else {
                     var10000 = class55.field798[var18];
                  }

                  if (var10000) {
                     class55.field798[var18] = false;
                     class511.field7258[var17++] = class223.field3167[var18];
                  }

                  ++var18;
               }
            }

            label394: {
               class659.method4793(true);
               int var19 = class476.field6870.field9115.method3544(-69);
               if (~var19 == -1) {
                  class97.method968(32353, 15L);
                  if (!var2) {
                     break label394;
                  }
               }

               if (var19 == 1) {
                  class97.method968(32353, 10L);
                  if (!var2) {
                     break label394;
                  }
               }

               if (var19 == 2) {
                  class97.method968(32353, 5L);
                  if (!var2) {
                     break label394;
                  }
               }

               if (var19 == 3) {
                  class97.method968(32353, 2L);
               }
            }

            if (class463.field6745) {
               class32.method373(4625);
            }

            if (class476.field6870.field9130.method4315(-87) == 1 && ~class394.field5712 == -4 && ~class7.field130 != 0) {
               class476.field6870.method4707(0, false, class476.field6870.field9130);
               class737.method5332(0);
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field10023[92] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method514(boolean arg0) {
      try {
         if (!arg0) {
            ++field10012;
            if (~class476.field6870.field9109.method4676(-88) != -3) {
               this.method5051(-24698);
            } else {
               try {
                  this.method5051(-24698);
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class117.method1138(104, var6.getMessage() + field10023[1] + this.method510((byte)106), var6);
                  class39.field594 = true;
                  class508.method3828(1, false, 0);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10023[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Ljga;IIIIIIIIIII)V"
   )
   public static final void method5043(class91[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label864:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class91 var13 = arg0[var12];
         if (var13 != null && var13.field1407 == arg1) {
            int var14 = var13.field1341 + arg6;
            int var15 = var13.field1425 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field1403 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field1513 + var14;
               int var21 = var13.field1452 + var15;
               if (var13.field1403 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field1403 != 0 && !var13.field1408 && method5048(var13).field6076 == 0 && class138.field2224 != var13 && class375.field5480 != var13.field1418 && class53.field785 != var13.field1418) {
               if (var16 < var18 && var17 < var19) {
                  class253.method2169(var13, (byte)-96);
               }
            } else if (!method5053(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class563.field8012) {
                  var22 = class425.method3319(0);
                  var23 = class630.method4620((byte)85);
               }

               if (class696.field10048 == var13 && class775.method5594(18307, class696.field10048) != null) {
                  class363.field5364 = true;
                  class131.field2127 = var14;
                  class614.field8731 = var15;
               }

               if (var13.field1473 || var16 < var18 && var17 < var19) {
                  if (var13.field1381 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class536 var24 = (class536)class750.field10657.method2245((byte)-94); var24 != null; var24 = (class536)class750.field10657.method2239((byte)106)) {
                        if (var24.field7541) {
                           var24.method2140((byte)-96);
                           var24.field7524.field1398 = false;
                        }
                     }

                     if (class643.field9046 == 0) {
                        class696.field10048 = null;
                        class138.field2224 = null;
                     }

                     class436.field6387 = 0;
                     class25.field361 = false;
                     class435.field6375 = false;
                     if (!class678.field9669) {
                        class54.method573(5184);
                     }
                  }

                  boolean var25;
                  if (class387.field5645.method1549(-99) + var22 >= var16 && class387.field5645.method1560((byte)-117) + var23 >= var17 && class387.field5645.method1549(-121) + var22 < var18 && class387.field5645.method1560((byte)-82) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class37.field543 && var25) {
                     if (var13.field1376 >= 0) {
                        class357.field5276 = var13.field1376;
                     } else if (var13.field1381) {
                        class357.field5276 = -1;
                     }
                  }

                  if (!class678.field9669 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class271.method2305(arg11 - var15, arg10 - var14, var13, -127);
                  }

                  boolean var26 = false;
                  if (class387.field5645.method1558(97) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class143 var28 = (class143)class614.field8732.method2245((byte)-94);
                  if (var28 != null && var28.method504(false) == 0 && var28.method502(4) + var22 >= var16 && var28.method503(true) + var23 >= var17 && var28.method502(4) + var22 < var18 && var28.method503(true) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field1479 != null && !class774.method5580((byte)118)) {
                     for(int var29 = 0; var29 < var13.field1479.length; ++var29) {
                        if (!class130.field2085.method4653(var13.field1479[var29], (byte)-106)) {
                           if (var13.field1363 != null) {
                              var13.field1363[var29] = 0;
                           }
                        } else if (var13.field1363 == null || class51.field770 >= var13.field1363[var29]) {
                           byte var30 = var13.field1357[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class130.field2085.method4653(86, (byte)-106) && !class130.field2085.method4653(82, (byte)-106) && !class130.field2085.method4653(81, (byte)-106)) && ((var30 & 2) == 0 || class130.field2085.method4653(86, (byte)-106)) && ((var30 & 1) == 0 || class130.field2085.method4653(82, (byte)-106)) && ((var30 & 4) == 0 || class130.field2085.method4653(81, (byte)-106))) {
                              if (var29 < 10) {
                                 class456.method3532(-1, var13.field1356, "", var29 + 1, (byte)-79);
                              } else if (var29 == 10) {
                                 class499.method3776(-122);
                                 class414 var31 = method5048(var13);
                                 class623.method4585(var31.method3238(-69), var31.field6069, -27461, var13);
                                 class733.field10420 = class499.method3777(var13, 28);
                                 if (class733.field10420 == null) {
                                    class733.field10420 = field10023[6];
                                 }

                                 class128.field2048 = var13.field1437 + field10023[5];
                              }

                              int var32 = var13.field1410[var29];
                              if (var13.field1363 == null) {
                                 var13.field1363 = new int[var13.field1479.length];
                              }

                              if (var32 != 0) {
                                 var13.field1363[var29] = class51.field770 + var32;
                              } else {
                                 var13.field1363[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class170.method1582(var22 + var28.method502(4) - var14, true, var23 + var28.method503(true) - var15, var13);
                  }

                  if (class696.field10048 != null && class696.field10048 != var13 && var25 && method5048(var13).method3240(0)) {
                     class264.field4042 = var13;
                  }

                  if (class138.field2224 == var13) {
                     class11.field179 = true;
                     class464.field6752 = var14;
                     class495.field7060 = var15;
                  }

                  if (var13.field1408 || var13.field1418 != 0) {
                     if (var25 && class237.field3665 != 0 && var13.field1453 != null) {
                        class536 var33 = new class536();
                        var33.field7541 = true;
                        var33.field7524 = var13;
                        var33.field7530 = class237.field3665;
                        var33.field7529 = var13.field1453;
                        class750.field10657.method2238(var33, 13);
                     }

                     if (class696.field10048 != null || class678.field9669 || class586.field8225 != var13.field1418 && class436.field6387 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field1418 != 0) {
                        if (class540.field7580 == var13.field1418 || class207.field2939 == var13.field1418) {
                           class397.field5880 = var13;
                           if (class606.field8652 != null) {
                              class606.field8652.method5572(var13.field1452, class476.field6870.field9141.method4436(-67), class54.field794, 110);
                           }

                           if (class540.field7580 == var13.field1418) {
                              if (class678.field9669 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class361.method2841(arg8, (byte)-112, class54.field794, arg9);
                              class215 var34 = (class215)class398.field5892.method3307(16976);

                              while(true) {
                                 if (var34 == null) {
                                    continue label864;
                                 }

                                 if (arg10 >= var34.field3075 && arg10 < var34.field3074 && arg11 >= var34.field3078 && arg11 < var34.field3077) {
                                    class54.method573(5184);
                                    class203.method1761(var34.field3067, (byte)-116);
                                 }

                                 var34 = (class215)class398.field5892.method3309(true);
                              }
                           }
                        }

                        if (class375.field5480 == var13.field1418) {
                           if (var13.method935(class54.field794, false) == null || class359.field5306 != 0 && class359.field5306 != 3 || class678.field9669 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field1421[var36];
                           if (var35 < var37 || var35 > var13.field1384[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field1513 / 2;
                           int var39 = var36 - var13.field1452 / 2;
                           int var40;
                           if (class306.field4639 == 4) {
                              var40 = (int)class86.field1312 & 16383;
                           } else {
                              var40 = (int)class86.field1312 + class647.field9122 & 16383;
                           }

                           int var41 = class160.field2447[var40];
                           int var42 = class160.field2446[var40];
                           if (class306.field4639 != 4) {
                              var41 = (class455.field6620 + 256) * var41 >> 8;
                              var42 = (class455.field6620 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class306.field4639 == 4) {
                              var45 = (class704.field10131 >> 9) + (var43 >> 2);
                              var46 = (class232.field3606 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class117.field1849.method1507(-12) - 1) * 256;
                              var45 = (class117.field1849.field6832 - var47 >> 9) + (var43 >> 2);
                              var46 = (class117.field1849.field6833 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class37.field543 && (class394.field5716 & 64) != 0) {
                              class91 var48 = class751.method5399(class224.field3183, 1, class704.field10135);
                              if (var48 != null) {
                                 class643.method4678(var45, 0, 3, true, (long)(var13.field1362 << 0 | var13.field1356), field10023[4], var13.field1428, true, var46, class733.field10420, 1L, class127.field2038, false);
                              } else {
                                 class499.method3776(-10);
                              }
                              continue;
                           }

                           if (class343.field5054 == class122.field1967) {
                              class643.method4678(var45, 0, 21, true, 0L, "", -1, true, var46, class765.field10930.method5512(-2, class777.field11340), 1L, -1, false);
                           }

                           class643.method4678(var45, 0, 12, true, 0L, "", -1, true, var46, class708.field10164, 1L, class444.field6482, false);
                           continue;
                        }

                        if (class586.field8225 == var13.field1418) {
                           class778.field11352 = var13;
                           if (var25) {
                              class25.field361 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method502(4) - var14 - var13.field1513 / 2) * 2.0D / (double)class651.field9216);
                              int var50 = (int)(-((double)(var23 + var28.method503(true) - var15 - var13.field1452 / 2) * 2.0D / (double)class651.field9216));
                              int var51 = class784.field11423 + var49 + class651.field9220;
                              int var52 = class535.field7521 + var50 + class651.field9223;
                              class58 var53 = class521.method3884((byte)-61);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method601((byte)5, var51, var52, var54);
                              if (var54 != null) {
                                 if (class130.field2085.method4653(82, (byte)-106) && class33.field489 > 0) {
                                    class566.method4206((byte)-50, var54[1], var54[0], var54[2]);
                                    continue;
                                 }

                                 class435.field6375 = true;
                                 class109.field1705 = var54[0];
                                 class572.field8098 = var54[1];
                                 class744.field10586 = var54[2];
                              }

                              class436.field6387 = 1;
                              class152.field2333 = false;
                              class279.field4232 = class387.field5645.method1549(-116);
                              class732.field10411 = class387.field5645.method1560((byte)101);
                              continue;
                           }

                           if (var26 && class436.field6387 > 0) {
                              if (class436.field6387 == 1 && (class279.field4232 != class387.field5645.method1549(-78) || class732.field10411 != class387.field5645.method1560((byte)-119))) {
                                 class517.field7315 = class784.field11423;
                                 class471.field6839 = class535.field7521;
                                 class436.field6387 = 2;
                              }

                              if (class436.field6387 == 2) {
                                 class152.field2333 = true;
                                 class613.method4510(-1, class517.field7315 + (int)((double)(class279.field4232 - class387.field5645.method1549(-95)) * 2.0D / (double)class651.field9212));
                                 class384.method2994(class471.field6839 - (int)((double)(class732.field10411 - class387.field5645.method1560((byte)-66)) * 2.0D / (double)class651.field9212), 125);
                              }
                              continue;
                           }

                           if (class436.field6387 > 0 && !class152.field2333) {
                              if ((class525.field7421 == 1 || class662.method4801(1003)) && class687.field9909 > 2) {
                                 class789.method5696(class279.field4232, class732.field10411, -93);
                              } else if (class527.method3953(false)) {
                                 class789.method5696(class279.field4232, class732.field10411, -111);
                              }
                           }

                           class436.field6387 = 0;
                           continue;
                        }

                        if (class800.field11644 == var13.field1418) {
                           if (var26) {
                              class26.method328(-127, var23 + class387.field5645.method1560((byte)-51) - var15, var13.field1452, var13.field1513, var22 + class387.field5645.method1549(-104) - var14);
                           }
                           continue;
                        }

                        if (class53.field785 == var13.field1418) {
                           class341.method2713(var15, var13, var14, 0);
                           continue;
                        }
                     }

                     if (!var13.field1359 && var27) {
                        var13.field1359 = true;
                        if (var13.field1360 != null) {
                           class536 var55 = new class536();
                           var55.field7541 = true;
                           var55.field7524 = var13;
                           var55.field7536 = var22 + var28.method502(4) - var14;
                           var55.field7530 = var23 + var28.method503(true) - var15;
                           var55.field7529 = var13.field1360;
                           class750.field10657.method2238(var55, 13);
                        }
                     }

                     if (var13.field1359 && var26 && var13.field1491 != null) {
                        class536 var56 = new class536();
                        var56.field7541 = true;
                        var56.field7524 = var13;
                        var56.field7536 = var22 + class387.field5645.method1549(-83) - var14;
                        var56.field7530 = var23 + class387.field5645.method1560((byte)125) - var15;
                        var56.field7529 = var13.field1491;
                        class750.field10657.method2238(var56, 13);
                     }

                     if (var13.field1359 && !var26) {
                        var13.field1359 = false;
                        if (var13.field1404 != null) {
                           class536 var57 = new class536();
                           var57.field7541 = true;
                           var57.field7524 = var13;
                           var57.field7536 = var22 + class387.field5645.method1549(-97) - var14;
                           var57.field7530 = var23 + class387.field5645.method1560((byte)-100) - var15;
                           var57.field7529 = var13.field1404;
                           class379.field5534.method2238(var57, 13);
                        }
                     }

                     if (var26 && var13.field1504 != null) {
                        class536 var58 = new class536();
                        var58.field7541 = true;
                        var58.field7524 = var13;
                        var58.field7536 = var22 + class387.field5645.method1549(-67) - var14;
                        var58.field7530 = var23 + class387.field5645.method1560((byte)-112) - var15;
                        var58.field7529 = var13.field1504;
                        class750.field10657.method2238(var58, 13);
                     }

                     if (!var13.field1398 && var25) {
                        var13.field1398 = true;
                        if (var13.field1506 != null) {
                           class536 var59 = new class536();
                           var59.field7541 = true;
                           var59.field7524 = var13;
                           var59.field7536 = var22 + class387.field5645.method1549(-47) - var14;
                           var59.field7530 = var23 + class387.field5645.method1560((byte)-56) - var15;
                           var59.field7529 = var13.field1506;
                           class750.field10657.method2238(var59, 13);
                        }
                     }

                     if (var13.field1398 && var25 && var13.field1499 != null) {
                        class536 var60 = new class536();
                        var60.field7541 = true;
                        var60.field7524 = var13;
                        var60.field7536 = var22 + class387.field5645.method1549(-89) - var14;
                        var60.field7530 = var23 + class387.field5645.method1560((byte)92) - var15;
                        var60.field7529 = var13.field1499;
                        class750.field10657.method2238(var60, 13);
                     }

                     if (var13.field1398 && !var25) {
                        var13.field1398 = false;
                        if (var13.field1471 != null) {
                           class536 var61 = new class536();
                           var61.field7541 = true;
                           var61.field7524 = var13;
                           var61.field7536 = var22 + class387.field5645.method1549(-84) - var14;
                           var61.field7530 = var23 + class387.field5645.method1560((byte)110) - var15;
                           var61.field7529 = var13.field1471;
                           class379.field5534.method2238(var61, 13);
                        }
                     }

                     if (var13.field1429 != null) {
                        class536 var62 = new class536();
                        var62.field7524 = var13;
                        var62.field7529 = var13.field1429;
                        class70.field1028.method2238(var62, 13);
                     }

                     if (var13.field1509 != null && class744.field10580 > var13.field1342) {
                        if (var13.field1344 != null && class744.field10580 - var13.field1342 <= 32) {
                           label751:
                           for(int var63 = var13.field1342; var63 < class744.field10580; ++var63) {
                              int var64 = class468.field6779[var63 & 31];

                              for(int var65 = 0; var65 < var13.field1344.length; ++var65) {
                                 if (var13.field1344[var65] == var64) {
                                    class536 var66 = new class536();
                                    var66.field7524 = var13;
                                    var66.field7529 = var13.field1509;
                                    class750.field10657.method2238(var66, 13);
                                    break label751;
                                 }
                              }
                           }
                        } else {
                           class536 var67 = new class536();
                           var67.field7524 = var13;
                           var67.field7529 = var13.field1509;
                           class750.field10657.method2238(var67, 13);
                        }

                        var13.field1342 = class744.field10580;
                     }

                     if (var13.field1496 != null && class412.field6047 > var13.field1387) {
                        if (var13.field1335 != null && class412.field6047 - var13.field1387 <= 32) {
                           label727:
                           for(int var68 = var13.field1387; var68 < class412.field6047; ++var68) {
                              int var69 = class496.field7075[var68 & 31];

                              for(int var70 = 0; var70 < var13.field1335.length; ++var70) {
                                 if (var13.field1335[var70] == var69) {
                                    class536 var71 = new class536();
                                    var71.field7524 = var13;
                                    var71.field7529 = var13.field1496;
                                    class750.field10657.method2238(var71, 13);
                                    break label727;
                                 }
                              }
                           }
                        } else {
                           class536 var72 = new class536();
                           var72.field7524 = var13;
                           var72.field7529 = var13.field1496;
                           class750.field10657.method2238(var72, 13);
                        }

                        var13.field1387 = class412.field6047;
                     }

                     if (var13.field1488 != null && class771.field11111 > var13.field1424) {
                        if (var13.field1464 != null && class771.field11111 - var13.field1424 <= 32) {
                           label703:
                           for(int var73 = var13.field1424; var73 < class771.field11111; ++var73) {
                              int var74 = class192.field2797[var73 & 31];

                              for(int var75 = 0; var75 < var13.field1464.length; ++var75) {
                                 if (var13.field1464[var75] == var74) {
                                    class536 var76 = new class536();
                                    var76.field7524 = var13;
                                    var76.field7529 = var13.field1488;
                                    class750.field10657.method2238(var76, 13);
                                    break label703;
                                 }
                              }
                           }
                        } else {
                           class536 var77 = new class536();
                           var77.field7524 = var13;
                           var77.field7529 = var13.field1488;
                           class750.field10657.method2238(var77, 13);
                        }

                        var13.field1424 = class771.field11111;
                     }

                     if (var13.field1510 != null && class431.field6337 > var13.field1367) {
                        if (var13.field1467 != null && class431.field6337 - var13.field1367 <= 32) {
                           label679:
                           for(int var78 = var13.field1367; var78 < class431.field6337; ++var78) {
                              int var79 = class602.field8584[var78 & 31];

                              for(int var80 = 0; var80 < var13.field1467.length; ++var80) {
                                 if (var13.field1467[var80] == var79) {
                                    class536 var81 = new class536();
                                    var81.field7524 = var13;
                                    var81.field7529 = var13.field1510;
                                    class750.field10657.method2238(var81, 13);
                                    break label679;
                                 }
                              }
                           }
                        } else {
                           class536 var82 = new class536();
                           var82.field7524 = var13;
                           var82.field7529 = var13.field1510;
                           class750.field10657.method2238(var82, 13);
                        }

                        var13.field1367 = class431.field6337;
                     }

                     if (var13.field1416 != null && class106.field1651 > var13.field1354) {
                        if (var13.field1330 != null && class106.field1651 - var13.field1354 <= 32) {
                           label655:
                           for(int var83 = var13.field1354; var83 < class106.field1651; ++var83) {
                              int var84 = class696.field10049[var83 & 31];

                              for(int var85 = 0; var85 < var13.field1330.length; ++var85) {
                                 if (var13.field1330[var85] == var84) {
                                    class536 var86 = new class536();
                                    var86.field7524 = var13;
                                    var86.field7529 = var13.field1416;
                                    class750.field10657.method2238(var86, 13);
                                    break label655;
                                 }
                              }
                           }
                        } else {
                           class536 var87 = new class536();
                           var87.field7524 = var13;
                           var87.field7529 = var13.field1416;
                           class750.field10657.method2238(var87, 13);
                        }

                        var13.field1354 = class106.field1651;
                     }

                     if (var13.field1392 != null && class506.field7197 > var13.field1366) {
                        if (var13.field1503 != null && class506.field7197 - var13.field1366 <= 32) {
                           label631:
                           for(int var88 = var13.field1366; var88 < class506.field7197; ++var88) {
                              int var89 = class77.field1234[var88 & 31];

                              for(int var90 = 0; var90 < var13.field1503.length; ++var90) {
                                 if (var13.field1503[var90] == var89) {
                                    class536 var91 = new class536();
                                    var91.field7524 = var13;
                                    var91.field7529 = var13.field1392;
                                    class750.field10657.method2238(var91, 13);
                                    break label631;
                                 }
                              }
                           }
                        } else {
                           class536 var92 = new class536();
                           var92.field7524 = var13;
                           var92.field7529 = var13.field1392;
                           class750.field10657.method2238(var92, 13);
                        }

                        var13.field1366 = class506.field7197;
                     }

                     if (class602.field8583 > var13.field1456 && var13.field1450 != null) {
                        class536 var93 = new class536();
                        var93.field7524 = var13;
                        var93.field7529 = var13.field1450;
                        class750.field10657.method2238(var93, 13);
                     }

                     if (class709.field10182 > var13.field1456 && var13.field1399 != null) {
                        class536 var94 = new class536();
                        var94.field7524 = var13;
                        var94.field7529 = var13.field1399;
                        class750.field10657.method2238(var94, 13);
                     }

                     if (class591.field8358 > var13.field1456 && var13.field1414 != null) {
                        class536 var95 = new class536();
                        var95.field7524 = var13;
                        var95.field7529 = var13.field1414;
                        class750.field10657.method2238(var95, 13);
                     }

                     if (class598.field8419 > var13.field1456 && var13.field1412 != null) {
                        class536 var96 = new class536();
                        var96.field7524 = var13;
                        var96.field7529 = var13.field1412;
                        class750.field10657.method2238(var96, 13);
                     }

                     if (class271.field4145 > var13.field1456 && var13.field1370 != null) {
                        class536 var97 = new class536();
                        var97.field7524 = var13;
                        var97.field7529 = var13.field1370;
                        class750.field10657.method2238(var97, 13);
                     }

                     if (class693.field10000 > var13.field1456 && var13.field1438 != null) {
                        class536 var98 = new class536();
                        var98.field7524 = var13;
                        var98.field7529 = var13.field1438;
                        class750.field10657.method2238(var98, 13);
                     }

                     if (class317.field4734 > var13.field1456 && var13.field1355 != null) {
                        class536 var99 = new class536();
                        var99.field7524 = var13;
                        var99.field7529 = var13.field1355;
                        class750.field10657.method2238(var99, 13);
                     }

                     var13.field1456 = class742.field10569;
                     if (var13.field1395 != null) {
                        for(int var100 = 0; var100 < class80.field1258; ++var100) {
                           class536 var101 = new class536();
                           var101.field7524 = var13;
                           var101.field7528 = class440.field6456[var100].method104((byte)-90);
                           var101.field7535 = class440.field6456[var100].method106((byte)-102);
                           var101.field7529 = var13.field1395;
                           class750.field10657.method2238(var101, 13);
                        }
                     }

                     if (class556.field7900 && var13.field1390 != null) {
                        class536 var102 = new class536();
                        var102.field7524 = var13;
                        var102.field7529 = var13.field1390;
                        class750.field10657.method2238(var102, 13);
                     }
                  }

                  if (var13.field1403 == 5 && var13.field1460 != -1) {
                     var13.method943(class376.field5487, (byte)-100, class705.field10141).method5572(var13.field1452, class476.field6870.field9141.method4436(-103), class54.field794, 57);
                  }

                  class253.method2169(var13, (byte)-38);
                  if (var13.field1403 == 0) {
                     method5043(arg0, var13.field1356, var16, var17, var18, var19, var14 - var13.field1419, var15 - var13.field1371, arg8, arg9, arg10, arg11);
                     if (var13.field1373 != null) {
                        method5043(var13.field1373, var13.field1356, var16, var17, var18, var19, var14 - var13.field1419, var15 - var13.field1371, arg8, arg9, arg10, arg11);
                     }

                     class733 var103 = (class733)class139.field2228.method3101(-1, (long)var13.field1356);
                     if (var103 != null) {
                        if (class648.field9162 == class343.field5054 && var103.field10421 == 0 && !class678.field9669 && var25 && !class34.field514) {
                           class54.method573(5184);
                        }

                        class351.method2771(var18, arg9, arg10, arg11, var103.field10417, var17, var14, var16, var19, -1, arg8, var15);
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V"
   )
   public static final void main(String[] arg0) {
      boolean var1 = field10022;

      try {
         ++field10010;

         try {
            if (~arg0.length != -7) {
               class503.method3799(0, field10023[34]);
            }

            label94: {
               class107.field1674 = new class142();
               class107.field1674.field2262 = Integer.parseInt(arg0[0]);
               class432.field6349 = new class142();
               class432.field6349.field2262 = Integer.parseInt(arg0[1]);
               class479.field6892 = class693.field9999;
               if (!arg0[3].equals(field10023[23])) {
                  if (!arg0[3].equals(field10023[29])) {
                     if (arg0[3].equals(field10023[35])) {
                        class440.field6451 = class409.field5996;
                        if (!var1) {
                           break label94;
                        }
                     }

                     class503.method3799(0, field10023[31]);
                     if (!var1) {
                        break label94;
                     }
                  }

                  class440.field6451 = class211.field3018;
                  if (!var1) {
                     break label94;
                  }
               }

               class440.field6451 = class767.field11001;
            }

            class777.field11340 = class772.method5557(100, arg0[4]);
            if (class777.field11340 == -1) {
               label102: {
                  if (arg0[4].equals(field10023[21])) {
                     class777.field11340 = 0;
                     if (!var1) {
                        break label102;
                     }
                  }

                  if (!arg0[4].equals(field10023[33])) {
                     class503.method3799(0, field10023[24]);
                     if (!var1) {
                        break label102;
                     }
                  }

                  class777.field11340 = 1;
               }
            }

            label73: {
               class202.field2887 = false;
               class116.field1838 = false;
               if (!arg0[5].equals(field10023[26])) {
                  if (!arg0[5].equals(field10023[28])) {
                     if (arg0[5].equals(field10023[27])) {
                        class343.field5054 = class229.field3558;
                        if (!var1) {
                           break label73;
                        }
                     }

                     if (arg0[5].equals(field10023[30])) {
                        class343.field5054 = class313.field4696;
                        if (!var1) {
                           break label73;
                        }
                     }

                     class503.method3799(0, field10023[22]);
                     if (!var1) {
                        break label73;
                     }
                  }

                  class343.field5054 = class122.field1967;
                  if (!var1) {
                     break label73;
                  }
               }

               class343.field5054 = class648.field9162;
            }

            class762.field10879 = 0;
            class432.field6350 = "";
            class302.field4544 = 0;
            class537.field7555 = null;
            class647.field9107 = 0;
            class773.field11260 = false;
            class56.field809 = false;
            class436.field6382 = null;
            class490.field7005 = class343.field5054.field5700;
            class635.field9003 = 0L;
            class318.field4756 = true;
            class425.field6225 = true;
            client var2 = new client();
            class183.field2683 = var2;
            var2.method515(1024, class440.field6451.method2150((byte)-111) + 32, 660, 768, false, class343.field5054.field5702, 14196, 37);
            class800.field11642.setLocation(40, 40);
         } catch (Exception var5) {
            class117.method1138(92, (String)null, var5);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10023[32] + (arg0 != null ? field10023[36] : field10023[25]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "()V"
   )
   public static final void method5044() {
      int var0 = class274.field4182;
      int[] var1 = class124.field1983;
      int var2 = class769.field11031 ? var0 : class261.field3995 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class395 var4;
         if (var3 < var0) {
            var4 = class501.field7137[var1[var3]];
         } else {
            var4 = ((class432)class573.field8110.method3101(-1, (long)class344.field5068[var3 - var0])).field6345;
         }

         if (var4.field5779 >= 0) {
            int var5 = var4.method1507(-45);
            if ((var5 & 1) == 0) {
               if ((var4.field6832 & 511) == 0 && (var4.field6833 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field6832 & 511) == 256 && (var4.field6833 & 511) == 256) {
               continue;
            }

            var4.field6829 = class478.method3658(var4.field6824, var4.field6832, var4.field6833, (byte)-20);
            class575.method4259(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V"
   )
   public final void init() {
      boolean var1 = field10022;

      try {
         ++field10004;
         if (this.method523((byte)93)) {
            label200: {
               class107.field1674 = new class142();
               class107.field1674.field2262 = Integer.parseInt(this.getParameter(field10023[64]));
               class432.field6349 = new class142();
               class432.field6349.field2262 = Integer.parseInt(this.getParameter(field10023[72]));
               class432.field6349.field2258 = this.getParameter(field10023[76]);
               class479.field6892 = class501.method3790(Integer.parseInt(this.getParameter(field10023[81])), false);
               if (class693.field9999 == class479.field6892) {
                  class479.field6892 = class13.field193;
                  if (!var1) {
                     break label200;
                  }
               }

               if (!class561.method4181(-109, class479.field6892) && class479.field6892 != class160.field2451) {
                  class479.field6892 = class160.field2451;
               }
            }

            class440.field6451 = class54.method577(0, Integer.parseInt(this.getParameter(field10023[31])));
            if (class440.field6451 != class409.field5996 && class440.field6451 != class211.field3018 && class767.field11001 != class440.field6451) {
               class440.field6451 = class767.field11001;
            }

            try {
               class777.field11340 = Integer.parseInt(this.getParameter(field10023[75]));
            } catch (Exception var17) {
               class777.field11340 = 0;
            }

            label209: {
               String var2 = this.getParameter(field10023[66]);
               if (var2 == null || !var2.equals("1")) {
                  class116.field1838 = false;
                  if (!var1) {
                     break label209;
                  }
               }

               class116.field1838 = true;
            }

            label184: {
               String var3 = this.getParameter(field10023[84]);
               if (var3 != null && var3.equals("1")) {
                  class202.field2887 = true;
                  if (!var1) {
                     break label184;
                  }
               }

               class202.field2887 = false;
            }

            label210: {
               String var4 = this.getParameter(field10023[71]);
               if (var4 == null || !var4.equals("1")) {
                  class413.field6054 = false;
                  if (!var1) {
                     break label210;
                  }
               }

               class413.field6054 = true;
            }

            String var5 = this.getParameter(field10023[22]);
            if (var5 != null) {
               label169: {
                  if (!var5.equals("0")) {
                     if (!var5.equals("1")) {
                        if (var5.equals("2")) {
                           class343.field5054 = class229.field3558;
                           if (!var1) {
                              break label169;
                           }
                        }

                        if (!var5.equals("3")) {
                           break label169;
                        }

                        class343.field5054 = class313.field4696;
                        if (!var1) {
                           break label169;
                        }
                     }

                     class343.field5054 = class122.field1967;
                     if (!var1) {
                        break label169;
                     }
                  }

                  class343.field5054 = class648.field9162;
               }
            }

            try {
               class302.field4544 = Integer.parseInt(this.getParameter(field10023[68]));
            } catch (Exception var16) {
               class302.field4544 = 0;
            }

            class286.field4292 = this.getParameter(field10023[78]);
            class432.field6350 = this.getParameter(field10023[65]);
            if (class432.field6350 == null) {
               class432.field6350 = "";
            }

            class789.field11490 = "1".equals(this.getParameter(field10023[85]));
            String var6 = this.getParameter(field10023[79]);
            if (var6 != null) {
               try {
                  class762.field10879 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class762.field10879 = 0;
               }
            }

            class490.field7005 = Integer.parseInt(this.getParameter(field10023[67]));
            if (class490.field7005 < 0 || class490.field7005 >= class53.field784.length) {
               class490.field7005 = 0;
            }

            if (~Integer.parseInt(this.getParameter(field10023[82])) == -2) {
               class318.field4756 = true;
               class425.field6225 = true;
            }

            String var7 = this.getParameter(field10023[77]);
            if (var7 != null && var7.equals(field10023[74])) {
               class56.field809 = true;
            }

            String var8 = this.getParameter(field10023[80]);
            if (var8 != null) {
               class436.field6382 = class29.method362(-105, class55.method581(var8, (byte)-117));
               if (~class436.field6382.length > -17) {
                  class436.field6382 = null;
               }
            }

            String var9 = this.getParameter(field10023[73]);
            if (var9 != null && var9.equals(field10023[74])) {
               class773.field11260 = true;
            }

            String var10 = this.getParameter(field10023[69]);
            if (var10 != null) {
               try {
                  class647.field9107 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field10023[63]);
            if (var11 != null) {
               try {
                  class635.field9003 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class537.field7555 = this.getParameter(field10023[83]);
            if (class537.field7555 != null && ~class537.field7555.length() < -51) {
               class537.field7555 = null;
            }

            label137: {
               if (class648.field9162 != class343.field5054) {
                  if (class343.field5054 != class122.field1967) {
                     break label137;
                  }

                  class111.field1737 = 640;
                  class595.field8386 = 480;
                  if (!var1) {
                     break label137;
                  }
               }

               class595.field8386 = 503;
               class111.field1737 = 765;
            }

            class183.field2683 = this;
            this.method521(660, class111.field1737, class595.field8386, 37, class440.field6451.method2150((byte)-103) + 32, (byte)-124, class343.field5054.field5702);
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field10023[70] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method5045(int arg0) {
      int var1 = class274.field4182;
      int[] var2 = class124.field1983;

      for(int var3 = 0; var3 < class261.field3995 + var1; ++var3) {
         class395 var4;
         if (var3 < var1) {
            var4 = class501.field7137[var2[var3]];
         } else {
            var4 = ((class432)class573.field8110.method3101(-1, (long)class344.field5068[var3 - var1])).field6345;
         }

         if (var4.field6824 == arg0 && var4.field5779 >= 0) {
            int var5 = var4.method1507(-121);
            if ((var5 & 1) == 0) {
               if ((var4.field6832 & 511) != 0 || (var4.field6833 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field6832 & 511) != 256 || (var4.field6833 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field6832 >> 9;
               int var7 = var4.field6833 >> 9;
               if (var4.field5779 > class211.field3019[var6][var7]) {
                  class211.field3019[var6][var7] = var4.field5779;
                  class341.field5024[var6][var7] = 1;
               } else if (class211.field3019[var6][var7] == var4.field5779) {
                  var10002 = class341.field5024[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field6832 - var8 >> 9;
               int var10 = var4.field6833 - var8 >> 9;
               int var11 = var4.field6832 + var8 >> 9;
               int var12 = var4.field6833 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field5779 > class211.field3019[var13][var14]) {
                        class211.field3019[var13][var14] = var4.field5779;
                        class341.field5024[var13][var14] = 1;
                     } else if (class211.field3019[var13][var14] == var4.field5779) {
                        var10002 = class341.field5024[var13][var14]++;
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
      descriptor = "(I)V"
   )
   public final void method517(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([BZB)V"
   )
   public static final void method5046(byte[] arg0, boolean arg1, byte arg2) {
      boolean var3 = field10022;

      try {
         if (class440.field6457 == null) {
            class440.field6457 = new class65(20000);
         }

         ++field10020;
         class440.field6457.method694(0, arg0.length, arg0, -7033);
         if (arg2 < -20) {
            if (arg1) {
               class725.method5247((byte)120, class440.field6457.field942);
               class616.field8759 = new class639[class477.field6875];
               int var4 = 0;
               int var5 = class7.field134;
               class639 var6;
               if (var3) {
                  var6 = class605.method4458(var5, -28137);
                  if (var6 != null) {
                     class616.field8759[var4++] = var6;
                  }

                  ++var5;
               }

               while(true) {
                  int var10000;
                  if (var5 > class367.field5428) {
                     class759.field10846 = false;
                     var10000 = 30;
                     if (!var3) {
                        class359.field5309 = class604.method4452(30);
                        class440.field6457 = null;
                        return;
                     }
                  } else {
                     var10000 = var5;
                  }

                  var6 = class605.method4458(var10000, -28137);
                  if (var6 != null) {
                     class616.field8759[var4++] = var6;
                  }

                  ++var5;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10023[88] + (arg0 != null ? field10023[36] : field10023[25]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method5047(int arg0) {
      try {
         ++field10017;
         if (arg0 == 0) {
            boolean var2 = class456.field6660.method4733(29807);
            if (!var2) {
               this.method5040(false);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10023[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljga;)Lvja;"
   )
   public static final class414 method5048(class91 arg0) {
      class414 var1 = (class414)class351.field5147.method3101(-1, ((long)arg0.field1356 << 32) + (long)arg0.field1362);
      return var1 != null ? var1 : arg0.field1472;
   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)V"
   )
   public static final void method5049(int arg0) {
      int var1 = class274.field4182;
      int[] var2 = class124.field1983;
      int var3 = class769.field11031 ? var1 : class261.field3995 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class395 var5;
         if (var4 < var1) {
            var5 = class501.field7137[var2[var4]];
         } else {
            var5 = ((class432)class573.field8110.method3101(-1, (long)class344.field5068[var4 - var1])).field6345;
         }

         if (var5.field6824 == arg0) {
            var5.field5777 = 0;
            if (var5.field5779 < 0) {
               var5.field5770 = false;
            } else {
               int var6 = var5.method1507(-112);
               if ((var6 & 1) == 0) {
                  if ((var5.field6832 & 511) != 0 || (var5.field6833 & 511) != 0) {
                     var5.field5770 = false;
                     continue;
                  }
               } else if ((var5.field6832 & 511) != 256 || (var5.field6833 & 511) != 256) {
                  var5.field5770 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field6832 >> 9;
                  int var8 = var5.field6833 >> 9;
                  if (class211.field3019[var7][var8] != var5.field5779) {
                     var5.field5770 = true;
                     continue;
                  }

                  if (class341.field5024[var7][var8] > 1) {
                     var10002 = class341.field5024[var7][var8]--;
                     var5.field5770 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field6832 - var9 >> 9;
                  int var11 = var5.field6833 - var9 >> 9;
                  int var12 = var5.field6832 + var9 >> 9;
                  int var13 = var5.field6833 + var9 >> 9;
                  if (!class366.method2879(var10, var13, var12, (byte)116, var11, var5.field5779)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class211.field3019[var14][var15] == var5.field5779) {
                              var10002 = class341.field5024[var14][var15]--;
                           }
                        }
                     }

                     var5.field5770 = true;
                     continue;
                  }
               }

               var5.field5770 = false;
               var5.field6829 = class478.method3658(var5.field6824, var5.field6832, var5.field6833, (byte)-20);
               class575.method4259(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V"
   )
   public static final void method5050() {
      for(int var0 = 0; var0 < class234.field3626; ++var0) {
         int[] var1 = class211.field3019[var0];

         for(int var2 = 0; var2 < class209.field2989; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method513(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method5051(int arg0) {
      boolean var2 = field10022;

      try {
         ++field10007;
         if (class394.field5712 != 16) {
            ++class51.field770;
            if (class51.field770 % 1000 == 1) {
               GregorianCalendar var3 = new GregorianCalendar();
               class201.field2880 = var3.get(11) * 600 + (10 * var3.get(12) - -(var3.get(13) / 6));
               class141.field2253.setSeed((long)class201.field2880);
            }

            class745.field10605.method2117(-39);
            class745.field10604.method2117(-54);
            this.method5047(0);
            if (class378.field5526 != null) {
               class378.field5526.method2261(-85);
            }

            class378.method2948((byte)-124);
            class309.method2529(-116);
            class130.field2085.method4654(16166);
            class387.field5645.method1552(true);
            if (class54.field794 != null) {
               class54.field794.method252((int)class604.method4452(-6));
            }

            int var10000;
            label206: {
               class765.method5513(true);
               class80.field1258 = 0;
               class17.field244 = 0;
               class12 var4 = class130.field2085.method4655(-25388);
               if (var2) {
                  var10000 = var4.method105(23717);
               } else if (var4 == null) {
                  var10000 = 0;
                  if (!var2) {
                     break label206;
                  }
               } else {
                  var10000 = var4.method105(23717);
               }

               while(true) {
                  label289: {
                     int var5 = var10000;
                     if (~var5 == -3 || ~var5 == -4) {
                        char var6 = var4.method106((byte)120);
                        if (!class19.method266(1) || var6 != '`' && ~var6 != -168 && ~var6 != -179) {
                           if (class80.field1258 >= 128) {
                              break label289;
                           }

                           class440.field6456[class80.field1258] = var4;
                           ++class80.field1258;
                           if (!var2) {
                              break label289;
                           }
                        }

                        if (!class774.method5580((byte)127)) {
                           class711.method5169((byte)5);
                           if (!var2) {
                              break label289;
                           }
                        }

                        class80.method860((byte)72);
                        if (!var2) {
                           break label289;
                        }
                     }

                     if (var5 == 0 && ~class17.field244 > -76) {
                        class354.field5240[class17.field244] = var4;
                        ++class17.field244;
                     }
                  }

                  var4 = class130.field2085.method4655(arg0 ^ 850);
                  if (var4 == null) {
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = var4.method105(23717);
                  }
               }
            }

            class237.field3665 = var10000;
            class143 var7 = class387.field5645.method1554((byte)116);
            int var8;
            if (var2) {
               var8 = var7.method504(false);
               if (var8 != -1) {
                  if (var8 != 6) {
                     if (class584.method4292((byte)-35, var8)) {
                        class614.field8732.method2238(var7, 13);
                        if (class614.field8732.method2249(true) > 10) {
                           class614.field8732.method2235(105);
                           if (var2) {
                              class237.field3665 += var7.method500((byte)116);
                              if (var2) {
                                 class559.field7938.method2238(var7, 13);
                              }
                           }
                        }
                     }
                  } else {
                     class237.field3665 += var7.method500((byte)116);
                     if (var2) {
                        class559.field7938.method2238(var7, 13);
                     }
                  }
               } else {
                  class559.field7938.method2238(var7, 13);
               }

               var7 = class387.field5645.method1554((byte)104);
            }

            while(true) {
               if (var7 == null) {
                  var10000 = class774.method5580((byte)119);
                  if (!var2) {
                     if (var10000 != 0) {
                        class123.method1216(false);
                     }

                     label163: {
                        if (!class62.method626(true, class394.field5712)) {
                           if (!class391.method3038(arg0 + 24796, class394.field5712)) {
                              break label163;
                           }

                           class705.method5143(-119);
                           if (!var2) {
                              break label163;
                           }
                        }

                        class437.method3405(65536);
                        class102.method1002((byte)-49);
                     }

                     label285: {
                        if (!class783.method5655(class394.field5712, arg0 ^ arg0) || class391.method3038(122, class394.field5712)) {
                           if (!class239.method2100(class394.field5712, true) || class391.method3038(100, class394.field5712)) {
                              if (class394.field5712 == 13) {
                                 class9.method76(false);
                                 if (!var2) {
                                    break label285;
                                 }
                              }

                              if (!class696.method5094(class394.field5712, 31215) || class391.method3038(124, class394.field5712)) {
                                 if (class394.field5712 != 14 && class394.field5712 != 15) {
                                    break label285;
                                 }

                                 class9.method76(false);
                                 if (class94.field1536 == -3 || ~class94.field1536 == -3 || class94.field1536 == 15) {
                                    break label285;
                                 }

                                 if (class394.field5712 == 15) {
                                    class170.field2554 = class94.field1536;
                                    class608.field8659 = class268.field4090;
                                    class633.field8981 = class312.field4676;
                                    if (class356.field5270) {
                                       class14.method119(class147.field2298.field2262, 6410, class147.field2298.field2258);
                                       class745.field10605.field3713 = null;
                                       class755.method5457(14, false);
                                       if (!var2) {
                                          break label285;
                                       }
                                    }

                                    class593.method4358(arg0 + 46693, class208.field2957);
                                    if (!var2) {
                                       break label285;
                                    }
                                 }

                                 class593.method4358(21995, false);
                                 if (!var2) {
                                    break label285;
                                 }
                              }

                              class622.method4578((byte)55);
                              if (!var2) {
                                 break label285;
                              }
                           }

                           this.method5039(-33);
                           class9.method76(false);
                           if (!var2) {
                              break label285;
                           }
                        }

                        this.method5039(-55);
                        class796.method5735(arg0 ^ -24699);
                        class9.method76(false);
                     }

                     class574.method4253(class54.field794, -1);
                     class614.field8732.method2235(113);
                     return;
                  }
               } else {
                  var10000 = var7.method504(false);
               }

               var8 = var10000;
               if (var8 != -1) {
                  if (var8 != 6) {
                     if (class584.method4292((byte)-35, var8)) {
                        class614.field8732.method2238(var7, 13);
                        if (class614.field8732.method2249(true) > 10) {
                           class614.field8732.method2235(105);
                           if (var2) {
                              class237.field3665 += var7.method500((byte)116);
                              if (var2) {
                                 class559.field7938.method2238(var7, 13);
                              }
                           }
                        }
                     }
                  } else {
                     class237.field3665 += var7.method500((byte)116);
                     if (var2) {
                        class559.field7938.method2238(var7, 13);
                     }
                  }
               } else {
                  class559.field7938.method2238(var7, 13);
               }

               var7 = class387.field5645.method1554((byte)104);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10023[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "j",
      descriptor = "(I)V"
   )
   public static void method5052(int arg0) {
      try {
         if (arg0 == -1) {
            field10005 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10023[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Ljga;)Z"
   )
   public static final boolean method5053(class91 arg0) {
      if (class34.field514) {
         if (method5048(arg0).field6076 != 0) {
            return false;
         }

         if (arg0.field1403 == 0) {
            return false;
         }
      }

      return arg0.field1351;
   }

   @OriginalMember(
      owner = "client!client",
      name = "e",
      descriptor = "(Z)V"
   )
   public final synchronized void method506(boolean arg0) {
      try {
         ++field10003;
         if (class289.field4303 != null && class729.field10389 == null && !class720.field10318.field1291) {
            try {
               Class var2 = class289.field4303.getClass();
               Field var3 = var2.getDeclaredField(field10023[18]);
               class729.field10389 = (Canvas)var3.get(class289.field4303);
               var3.set(class289.field4303, (Object)null);
               if (class729.field10389 != null) {
                  return;
               }
            } catch (Exception var5) {
            }
         }

         super.method506(arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10023[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V"
   )
   public static final void method5054() {
      int var0 = class274.field4182;
      int[] var1 = class124.field1983;
      int var2 = class476.field6870.field9104.method5181(-87);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class158 var14 = class501.field7137[var1[var4]];
         if (!var14.method1506((byte)-109)) {
            var14.field5779 = -1;
         } else if (var14.field2443) {
            var14.field5779 = -1;
         } else {
            var14.method3052(240);
            if (var14.field8154 >= 0 && var14.field8160 >= 0 && var14.field8150 < class234.field3626 && var14.field8155 < class209.field2989) {
               var14.field2395 = var14.field5808 ? var3 : false;
               if (class117.field1849 == var14) {
                  var14.field5779 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field5770) {
                     ++var15;
                  }

                  if (var14.field5819 > class51.field770) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method1507(-60) << 2);
                  if (!var14.field2394 && !var14.field2399) {
                     if (class170.field2559 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field5779 = var16 + 1;
               }
            } else {
               var14.field5779 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class261.field3995; ++var5) {
         class799 var11 = ((class432)class573.field8110.method3101(-1, (long)class344.field5068[var5])).field6345;
         if (var11.method5756((byte)-107) && var11.field11618.method2499(class344.field5074, -1)) {
            var11.method3052(240);
            if (var11.field8154 >= 0 && var11.field8160 >= 0 && var11.field8150 < class234.field3626 && var11.field8155 < class209.field2989) {
               int var12 = 0;
               if (!var11.field5770) {
                  ++var12;
               }

               if (var11.field5819 > class51.field770) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method1507(-102) << 2);
               if (class170.field2559 == 0) {
                  if (var11.field11618.field4562) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class170.field2559 == 1) {
                  if (var11.field11618.field4562) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field11618.field4551) {
                  var13 += 1024;
               } else if (!var11.field11618.field4549) {
                  var13 += 256;
               }

               var11.field5779 = var13 + 1;
            } else {
               var11.field5779 = -1;
            }
         } else {
            var11.field5779 = -1;
         }
      }

      for(int var6 = 0; var6 < class645.field9076.length; ++var6) {
         class343 var7 = class645.field9076[var6];
         if (var7 != null) {
            if (var7.field5050 == 1) {
               class432 var8 = (class432)class573.field8110.method3101(-1, (long)var7.field5045);
               if (var8 != null) {
                  class799 var9 = var8.field6345;
                  if (var9.field5779 >= 0) {
                     var9.field5779 += 2048;
                  }
               }
            } else if (var7.field5050 == 10) {
               class158 var10 = class501.field7137[var7.field5045];
               if (var10 != null && class117.field1849 != var10 && var10.field5779 >= 0) {
                  var10.field5779 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method508(byte arg0) {
      boolean var2 = field10022;

      try {
         method5052(-1);
         ++field10011;
         class418.method3264((byte)114);
         class201.method1748(true);
         class765.method5511((byte)82);
         class592.method4351((byte)-88);
         class157.method1495(126);
         class186.method1670(-119280504);
         class15.method124((byte)-101);
         class258.method2202(15668);
         class197.method1725(25155);
         class410.method3208(true);
         class350.method2763(-30970);
         class115.method1126((byte)110);
         class96.method961(1);
         class247.method2141(12);
         class722.method5228(0);
         class398.method3100(0);
         class46.method522(true);
         class594.method4362((byte)-126);
         class249.method2151(-98);
         class392.method3041(-16);
         class17.method198(10258);
         class411.method3215(-1);
         class343.method2728(2);
         class386.method3013(25769);
         class261.method2244(-1);
         class648.method4720(15044);
         class264.method2262(90);
         class560.method4171((byte)-90);
         class39.method459(true);
         class717.method5196((byte)-82);
         class107.method1051(-43);
         class488.method3716(-100);
         class725.method5246((byte)87);
         class759.method5477(-20009);
         class340.method2706(2);
         class438.method3409(-79);
         class113.method1106(true);
         class511.method3855(30204);
         class282.method2362(0);
         class774.method5586((byte)-28);
         class124.method1223(0);
         class574.method4250((byte)73);
         class150.method1460((byte)39);
         class619.method4560(6);
         class413.method3229(true);
         class524.method3924(26);
         class584.method4291(103);
         class466.method3582((byte)-76);
         class341.method2717((byte)111);
         class332.method2660(25071);
         class193.method1701(98);
         class374.method2927(16);
         class432.method3368(-89);
         class533.method3987(0);
         class242.method2112((byte)94);
         class542.method4037(-122);
         class393.method3048(-29);
         class543.method4049(24562);
         class790.method5700(-77);
         class424.method3305(22945);
         class91.method936(-13630);
         class483.method3688(0);
         class387.method3020((byte)16);
         class456.method3524(-84);
         class65.method635(122);
         class312.method2546((byte)-25);
         class685.method4987(0);
         class311.method2540(false);
         class733.method5305((byte)105);
         class414.method3239((byte)44);
         class580.method4275(-21460);
         class724.method5242((byte)22);
         class292.method2448(30626);
         class556.method4143(-19022);
         class686.method4992((byte)-1);
         class476.method3651(-26);
         class25.method316(114);
         class604.method4454((byte)-7);
         class196.method1720(true);
         class309.method2532(50);
         class639.method4659(6);
         class93.method947(true);
         class142.method1417((byte)124);
         class300.method2490(85);
         class563.method4195(false);
         class51.method554((byte)-75);
         class166.method1561(true);
         class490.method3724((byte)94);
         class384.method3002((byte)79);
         class487.method3706(-66);
         class761.method5488((byte)-30);
         class194.method1709(true);
         class437.method3402(32);
         class773.method5564((byte)-59);
         class147.method1438(16776960);
         class430.method3354(-94);
         class544.method4077(79);
         class590.method4339(true);
         class176.method1614(false);
         class468.method3592(false);
         class302.method2504((byte)64);
         class559.method4156(1);
         class216.method1872(true);
         class610.method4496(-18650);
         class727.method5260(true);
         class608.method4482(0);
         class11.method95((byte)-121);
         class205.method1777(-6419);
         class509.method3838(492761538);
         class762.method5502(-127);
         class77.method848((byte)-116);
         class324.method2604(true);
         class66.method707(0);
         class550.method4122(2);
         class210.method1815((byte)86);
         class417.method3258(122);
         class459.method3549(11);
         class602.method4434(3);
         class787.method5685(9101);
         class646.method4698(214);
         class643.method4677(25431);
         class691.method5012(7762);
         class220.method1908(127);
         class144.method1429((byte)122);
         class44.method496(-1);
         class458.method3543(24204);
         class595.method4366((byte)-111);
         class588.method4316(11010);
         class499.method3780((byte)65);
         class557.method4148(61);
         class708.method5149((byte)-93);
         class37.method422(0);
         class348.method2756((byte)53);
         class440.method3422((byte)8);
         class521.method3885(-19215);
         class578.method4271((byte)120);
         class471.method3611((byte)-6);
         class119.method1167(116);
         class785.method5674(-24064);
         class195.method1717(25526);
         class180.method1628(false);
         class33.method381(-69);
         class427.method3335();
         class164.method1542((byte)-4);
         class75.method832(-91);
         class548.method4116((byte)127);
         class40.method475(3);
         class379.method2962(true);
         class289.method2392(113);
         class232.method2061(9311);
         class237.method2089(-128);
         class489.method3721(-5683);
         class576.method4262((byte)-118);
         class613.method4508((byte)108);
         class229.method2040(0);
         class784.method5663(32);
         class453.method3493(30001);
         class667.method4842(-44);
         class252.method2164(0);
         class224.method1923((byte)52);
         class651.method4754();
         class212.method1833(11755);
         class368.method2898((byte)-9);
         class744.method5360((byte)125);
         class478.method3659((byte)-127);
         class106.method1032(true);
         class583.method4285(-99);
         class634.method4635(0);
         class527.method3954(-8365);
         class273.method2314((byte)107);
         class167.method1569(-4);
         class731.method5295(4);
         class141.method1409((byte)-116);
         class756.method5462(2048);
         class532.method3979();
         class465.method3578(-58);
         class738.method5337(2);
         class495.method3758((byte)61);
         class366.method2885(5);
         class199.method1744(1234792416);
         class486.method3701(0);
         class704.method5137(true);
         class732.method5300((byte)-126);
         class270.method2300(-637050009);
         class541.method4029((byte)-85);
         class569.method4219();
         class62.method625((byte)109);
         class788.method5691((byte)-125);
         class344.method2732(-25529);
         class693.method5034(false);
         class536.method3996(65536);
         class248.method2146(-19492);
         class30.method366((byte)-118);
         class799.method5763(31876);
         class445.method3452(-30071);
         class314.method2558(true);
         class425.method3320((byte)75);
         class697.method5104(0);
         class349.method2760((byte)-57);
         class188.method1684((byte)55);
         class566.method4204(0);
         class84.method889((byte)85);
         class391.method3036(4);
         class754.method5453();
         class712.method5177((byte)-18);
         class747.method5377(false);
         class626.method4605(false);
         class797.method5744((byte)107);
         class514.method3868();
         class492.method3730(27799);
         class130.method1326((byte)4);
         class177.method1619((byte)125);
         class653.method4774(-50);
         class116.method1133(64);
         class482.method3682(-113);
         class268.method2289(10434);
         class469.method3603();
         class376.method2938((byte)-128);
         class266.method2273((byte)93);
         class296.method2473(7828);
         class507.method3819(9);
         class503.method3798((byte)-95);
         class582.method4281(115);
         class361.method2837((byte)-74);
         class104.method1018(false);
         class57.method588(-18);
         class129.method1317((byte)-120);
         class230.method2046((byte)33);
         class320.method2586(3);
         class175.method1609(true);
         class351.method2769(-62);
         class34.method392(-83);
         class153.method1477((byte)70);
         class9.method79(true);
         class530.method3960((byte)106);
         class703.method5131(true);
         class696.method5093(92);
         class701.method5122(10);
         class231.method2055(-13461);
         class80.method862(false);
         class403.method3148(1);
         class54.method575(79);
         class479.method3666(2883872);
         class537.method4005(-1);
         class215.method1856(0);
         class394.method3062(true);
         class364.method2859(24095);
         class681.method4973(4240);
         class279.method2344(0);
         class656.method4785(59);
         class365.method2866(-10610);
         class234.method2071((byte)-72);
         class135.method1377(-8461);
         class767.method5523(2745);
         class156.method1490((byte)111);
         class622.method4579(0);
         class777.method5613(6);
         class346.method2746(-1);
         class501.method3792((byte)122);
         class735.method5314(-4);
         class737.method5334(526699209);
         class69.method737((byte)-26);
         class155.method1487(118);
         class573.method4240(12);
         class192.method1695(4);
         class711.method5168(24571);
         class448.method3475((byte)10);
         class577.method4267((byte)-87);
         if (arg0 > -44) {
            return;
         }

         class333.method2667(-119);
         class463.method3567(-1);
         class742.method5351(1000);
         class53.method570(true);
         class283.method2372((byte)-117);
         class13.method110(118);
         class705.method5142(false);
         class377.method2942(-1700870800);
         class616.method4531(false);
         class494.method3750(42);
         class390.method3029(0);
         class716.method5189(0);
         class766.method5516(-121);
         class5.method38(0);
         class47.method527((byte)110);
         class462.method3563((byte)88);
         class662.method4803(4);
         class174.method1606(12740);
         class172.method1597(0);
         class567.method4209(-24672);
         class442.method3435(-117);
         class259.method2221(7);
         class746.method5371(1);
         class86.method902(84);
         class640.method4663();
         class549.method4119(true);
         class316.method2566((byte)-117);
         class657.method4790((byte)80);
         class313.method2552(-101);
         class330.method2649((byte)67);
         class589.method4325(92);
         class431.method3360(24178);
         class378.method2949((byte)117);
         class169.method1576(27);
         class209.method1803(2);
         class288.method2388(-1280);
         class354.method2784(125);
         class183.method1652(19290);
         class591.method4347((byte)-83);
         class666.method4839(0);
         class317.method2569(3);
         class35.method396();
         class23.method307((byte)122);
         class256.method2181();
         class786.method5682();
         class793.method5720((byte)-90);
         class254.method2172(-6);
         class420.method3280();
         class287.method2384(true);
         class325.method2610(-27465);
         class606.method4466((byte)-112);
         class267.method2283(2);
         class203.method1762((byte)-17);
         class222.method1911((byte)-32);
         class510.method3843(-76);
         class739.method5342(true);
         class318.method2575(2);
         class94.method950((byte)94);
         class100.method987(0);
         class776.method5603(true);
         class428.method3348(3);
         class322.method2598(16776960);
         class455.method3501(-63);
         class596.method4371((byte)73);
         class347.method2753(18083);
         class329.method2643();
         class112.method1100(-120);
         class671.method4865((byte)-9);
         class1.method2(-118);
         class137.method1387(10);
         class775.method5598(false);
         class162.method1529(100);
         class555.method4138(true);
         class286.method2380(22852);
         class161.method1516(-28188);
         class769.method5538(-1);
         class328.method2634(19);
         class614.method4516((byte)48);
         class306.method2516(-9600);
         class173.method1601(127);
         class415.method3246(-44);
         class72.method816((byte)70);
         class633.method4631(-2);
         class126.method1295((byte)-97);
         class26.method321((byte)-126);
         class772.method5556(4);
         class678.method4887((byte)-127);
         class690.method5008((byte)48);
         class692.method5018(0);
         class598.method4382(16);
         class290.method2397((byte)126);
         class561.method4177((byte)10);
         class132.method1348((byte)13);
         class603.method4448(-1);
         class719.method5206((byte)-94);
         class8.method70((byte)124);
         class117.method1137((byte)-93);
         class436.method3393((byte)100);
         class71.method793(-87);
         class451.method3487(8);
         class637.method4647(1409);
         class763.method5506((byte)-57);
         class226.method1948(31370);
         class586.method4305(true);
         class779.method5629((byte)-58);
         class497.method3772(-1);
         class522.method3913((byte)-125);
         class506.method3814((byte)-55);
         class171.method1589((byte)101);
         class729.method5284(2);
         class575.method4256(true);
         class454.method3496((byte)-108);
         class801.method5770(24010);
         class181.method1642((byte)87);
         class297.method2476(111);
         class599.method4389(255);
         class78.method852(true);
         class670.method4856(121);
         class168.method1573((byte)-101);
         class73.method820(-23998);
         class28.method349((byte)-33);
         class493.method3748();
         class505.method3808(-110);
         class21.method294(-103);
         class151.method1470((byte)-55);
         class278.method2337(-7049);
         class2.method7(-84);
         class464.method3573(-84);
         class416.method3250(25257);
         class88.method909(-122);
         class564.method4198(1);
         class668.method4849(81);
         class642.method4673(585);
         class748.method5382((byte)-62);
         class553.method4135((byte)-126);
         class700.method5112(2);
         class271.method2303(-30);
         class597.method4375(-12578);
         class435.method3389((byte)113);
         class7.method61(-17254);
         class798.method5749(-1);
         class227.method2021((byte)45);
         class280.method2349(6);
         class255.method2177(4096);
         class32.method372(0);
         class19.method269((byte)-38);
         class294.method2456((byte)96);
         class356.method2798(6276);
         class397.method3089(101);
         class218.method1893(95);
         class277.method2331(-123);
         class439.method3417(-119);
         class517.method3874(true);
         class185.method1667();
         class609.method4485((byte)30);
         class540.method4023(-88);
         class323.method2601((byte)-112);
         class121.method1197(-125);
         class319.method2580(false);
         class630.method4619(-24115);
         class108.method1065(1);
         class615.method4522(0);
         class101.method999(2);
         class6.method55(0);
         class627.method4610(-27657);
         class383.method2984((byte)121);
         class122.method1202(-77);
         class515.method3869(-5);
         class654.method4777(84);
         class750.method5394(20296);
         class545.method4088(-110);
         class55.method580(102);
         class61.method620((byte)101);
         class562.method4188(59);
         class274.method2321(0);
         class14.method118(2);
         class689.method5003((byte)-54);
         class635.method4641(110);
         class664.method4826(1);
         class236.method2086(-17811);
         class139.method1400(-1);
         class625.method4598(127);
         class133.method1368((byte)68);
         class60.method613(22);
         class792.method5715(121);
         class558.method4152(19860);
         class16.method134(9472);
         class617.method4537(false);
         class755.method5458(false);
         class631.method4626(-115);
         class388.method3025(31);
         class585.method4297(false);
         class359.method2822(0);
         class481.method3678((byte)-37);
         class138.method1393(-28481);
         class496.method3766(8394);
         class369.method2904(0);
         class679.method4969((byte)89);
         class49.method539((byte)-26);
         class709.method5157(true);
         class531.method3964(false);
         class68.method713(4);
         class444.method3448(11627);
         class783.method5652(true);
         class794.method5723((byte)-108);
         class695.method5089(1);
         class10.method83(26);
         class327.method2621((byte)41);
         class605.method4459(false);
         class105.method1026(3);
         class4.method30(26);
         class110.method1079(-85);
         class375.method2931(125);
         class140.method1406(0);
         class720.method5214(6776);
         class449.method3481(false);
         class79.method856(122);
         class131.method1337(-9019);
         class800.method5766(1);
         class225.method1932(-104);
         class184.method1657(74);
         class123.method1215(85);
         class546.method4092(2);
         class539.method4017(-1);
         class160.method1513((byte)123);
         class702.method5127(103);
         class339.method2701((byte)-74);
         class687.method4998(83);
         class70.method741(1);
         class235.method2080(-504);
         class399.method3112((byte)-8);
         class31.method369(4);
         class238.method2095(122);
         class143.method1424((byte)112);
         class24.method311(-107);
         class263.method2254(594062152);
         class269.method2294(125);
         class245.method2132(14421);
         class48.method533((byte)-117);
         class211.method1826(-17295);
         class272.method2308((byte)7);
         class396.method3084(0);
         class74.method823(95);
         class182.method1648((byte)61);
         class253.method2168(1);
         class571.method4231(20000000);
         class504.method3805((byte)-81);
         class27.method343((byte)-54);
         class353.method2780((byte)-81);
         class674.method4879(-2);
         class303.method2508(29460);
         class178.method1623((byte)110);
         class337.method2696((byte)-88);
         class128.method1309(true);
         class460.method3555(-118);
         class59.method605(-29104);
         class768.method5532((byte)-46);
         class114.method1114(-21033);
         class734.method5310((byte)-80);
         class644.method4687((byte)-85);
         class208.method1796(true);
         class778.method5620(-120);
         class190.method1689((byte)57);
         class629.method4615(true);
         class409.method3204(2);
         class443.method3441((byte)-120);
         class134.method1372(-74);
         class321.method2593(true);
         class752.method5405(-128);
         class645.method4693(-4);
         class103.method1012(5);
         class223.method1918(70);
         class513.method3865((byte)76);
         class315.method2563(2050112671);
         class587.method4310(-18351);
         class745.method5365(-21193);
         class251.method2160((byte)112);
         class480.method3674(-52);
         class421.method3283(false);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10023[93] + arg0 + ')');
      }

      if (class46.field703) {
         field10022 = !var2;
      }

   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5055(String arg0) {
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
   private static char[] method5056(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5057(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
