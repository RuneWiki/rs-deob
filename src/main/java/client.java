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
public class client extends class82 {
   @OriginalMember(
      owner = "client!client",
      name = "zb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4274 = new String[]{method2413(method2412("A_C}4DT\u000fR")), method2413(method2412("A_Cn4H")), method2413(method2412("A_Cn)EB\u0013n2tJ\u0003a*")), method2413(method2412("A_Cd)")), method2413(method2412("A_Cn)EB\u0013n2")), method2413(method2412("H@\u001fh(_\u0002!%")), method2413(method2412("A_Cn)EB\u0013n2tC\u0003y)MH\u0017y#")), method2413(method2412("H@\u001fh(_\u00022%")), method2413(method2412("\u000b\u0001H")), method2413(method2412("eY\u001aa")), method2413(method2412("\u0017O\u0019a{MJ\u0010k M\u0012")), method2413(method2412("H@\u001fh(_\u00023Ln")), method2413(method2412("AM\u0000lhGM\u0018jhh@\u0017~5gC\u0017i#Y")), method2413(method2412("H@\u001fh(_")), method2413(method2412("\u0018\u0005")), method2413(method2412("EM\u0002d0N`\u001fo4J^\u001fh5")), method2413(method2412("AM\u0000lhGM\u0018jhYI\u0010a#HXXL%HI\u0005~/I@\u0013B$AI\u0015y")), method2413(method2412("\u001a\u001f_")), method2413(method2412("CM\u0018i*N")), method2413(method2412("\u001a\u0018_")), method2413(method2412("X[EihO@\u001a")), method2413(method2412("H@\u001fh(_\u0002&%")), method2413(method2412("p\u001d_")), method2413(method2412("\u0012\u0005")), method2413(method2412("XI\u0002L%HI\u0005~/I@\u0013")), method2413(method2412("W\u001d@$")), method2413(method2412("\u0019\u0005")), method2413(method2412("\u001c\u0005")), method2413(method2412("\u001a\u001d_")), method2413(method2412("W\u0019_")), method2413(method2412("\u0013\u0005")), method2413(method2412("\u001a\u001c_")), method2413(method2412("EM\u001bh")), method2413(method2412("W\u0018_")), method2413(method2412("\u001a\u001e_")), method2413(method2412("W\u001a_")), method2413(method2412("W\u001dC$")), method2413(method2412("H@\u001fh(_\u0002=Ln")), method2413(method2412("H@\u001fh(_\u0002\"%")), method2413(method2412("\u0017N\u00043")), method2413(method2412("\u000b\u0004$h%DZ\u0013\u007f#O\u0005V")), method2413(method2412("\u000e\u0005")), method2413(method2412("\u0017N\u00043n")), method2413(method2412("HM\u0018{'X")), method2413(method2412("H@\u001fh(_\u00021%")), method2413(method2412("H@\u001fh(_\u0002<Ln")), method2413(method2412("H@\u001fh(_\u0002>Ln")), method2413(method2412("H@\u001fh(_\u0002$%")), method2413(method2412("H@\u001fh(_\u0002?Ln")), method2413(method2412("H@\u001fh(_\u0002:%")), method2413(method2412("H@\u001fh(_\u0002\u001bl/E\u0004")), method2413(method2412("LM\u001bht")), method2413(method2412("LM\u001bhv")), method2413(method2412("GE\u0000h")), method2413(method2412("P\u0002X#;")), method2413(method2412("LM\u001bhw")), method2413(method2412("EY\u001aa")), method2413(method2412("LM\u001bhu")), method2413(method2412("\\E\u0006")), method2413(method2412("LI\u0004`'E")), method2413(method2412("j^\u0011x+NB\u0002-%DY\u0018y")), method2413(method2412("YO")), method2413(method2412("LM\u001bh")), method2413(method2412("FC\u0012h1CM\u0002")), method2413(method2412("GM\u0018j3JK\u0013")), method2413(method2412("NB\u0011a/XD")), method2413(method2412("\u0017O\u0019a{\u001f\u001c\u0010kv\u001b\u0012")), method2413(method2412("\u0017O\u0019a{\u0013\u001c\u0010kv\u001b\u0012")), method2413(method2412("H@\u001fh(_\u00020Ln")), method2413(method2412("\u0017O\u0019a{\u001b\u001c\u0010kv\u001b\u0012")), method2413(method2412("\u0017O\u0019a{MJE=v\u001b\u0012")), method2413(method2412("\u0017O\u0019a{MJ\u0010kv\u001b\u0012")), method2413(method2412("\u0017O\u0019a{MJ\u0014=v\u001b\u0012")), method2413(method2412("\u0017O\u0019a{H\u001c\u0010kv\u001b\u0012")), method2413(method2412("\u0017O\u0019a{MJA=v\u001b\u0012")), method2413(method2412("\u0017O\u0019a{MJF=v\u001b\u0012")), method2413(method2412("H@\u001fh(_\u0002>%")), method2413(method2412("JJ\u0010d\"")), method2413(method2412("JH\u0000h4_")), method2413(method2412("A_")), method2413(method2412("_^\u0003h")), method2413(method2412("HC\u001ab3YE\u0012")), method2413(method2412("JH\u0012d2BC\u0018l*bB\u0010b")), method2413(method2412("GC\u0014o?JH\u0012\u007f#X_")), method2413(method2412("DN\u001ch%_X\u0017j")), method2413(method2412("GC\u0014o?BH")), method2413(method2412("H@\u001fh(_\u0002\u001fc/_\u0004")), method2413(method2412("FC\u0012h1CI\u0004h")), method2413(method2412("M^\u0019`$B@\u001ad(L")), method2413(method2412("GM\u0018j")), method2413(method2412("ZY\u001fy3Y@")), method2413(method2412("^_\u0013\u007f\u0000GC\u0001")), method2413(method2412("MC\u0004n#\u001d\u0018\u001bo")), method2413(method2412("OI\u001bb/O")), method2413(method2412("OI\u001bb'OH\u0004h5X")), method2413(method2412("\\C\u0004a\"BH")), method2413(method2412("HC\u0003c2YU")), method2413(method2412("XI\u0002y/EK\u0005")), method2413(method2412("^B\u0012h4")), method2413(method2412("\\C\u0004a\"M@\u0017j5")), method2413(method2412("X_\u001dh?")), method2413(method2412("XE\u0002h5NX\u0002d(L_)`#FN\u0013\u007f")), method2413(method2412("H@\u001fh(_\u00024%")), method2413(method2412("aM\u0011h>")), method2413(method2412("\u001a\u001eA#v\u0005\u001cX<"))};
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "Lbga;"
   )
   public static class378 field4269 = new class378(106, -1);
   @OriginalMember(
      owner = "client!client",
      name = "kb",
      descriptor = "F"
   )
   public static float field4268;
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "I"
   )
   public static int field4254;
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "I"
   )
   public static int field4255;
   @OriginalMember(
      owner = "client!client",
      name = "lb",
      descriptor = "I"
   )
   public static int field4256;
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "I"
   )
   public static int field4257;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field4258;
   @OriginalMember(
      owner = "client!client",
      name = "ib",
      descriptor = "I"
   )
   public static int field4259;
   @OriginalMember(
      owner = "client!client",
      name = "jb",
      descriptor = "I"
   )
   public static int field4260;
   @OriginalMember(
      owner = "client!client",
      name = "gb",
      descriptor = "I"
   )
   public static int field4261;
   @OriginalMember(
      owner = "client!client",
      name = "mb",
      descriptor = "I"
   )
   public static int field4262;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "I"
   )
   public static int field4263;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "I"
   )
   public static int field4264;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "I"
   )
   public static int field4265;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field4266;
   @OriginalMember(
      owner = "client!client",
      name = "yb",
      descriptor = "I"
   )
   public static int field4267;
   @OriginalMember(
      owner = "client!client",
      name = "fb",
      descriptor = "I"
   )
   public static int field4270;
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field4271;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "hb",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4272;
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "Z"
   )
   public static boolean field4273;

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method2393(int arg0, byte arg1) {
      try {
         class257.field3287 = 0;
         if (arg1 > -68) {
            field4269 = null;
         }

         ++field4255;
         class294.field3865 = null;
         class341.field4877 = null;
         class73.field896.field1676 = arg0;
         ++class73.field896.field1677;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4274[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method2394(int arg0) {
      boolean var2 = field4273;

      try {
         ++field4261;
         if (class445.field6162 != 16) {
            long var3 = class559.method4023(false) / 1000000L + -class612.field8548;
            class612.field8548 = class559.method4023(false) / 1000000L;
            boolean var5 = class734.method5326((byte)-95);
            if (var5 && class694.field10136 && class614.field8576 != null) {
               class614.field8576.method50((byte)40);
            }

            if (class141.method1205(-6140, class445.field6162)) {
               label407: {
                  if (~class51.field569 == -1L || class792.method5708(-25005) <= class51.field569) {
                     if (class338.field4832.method490() || !class101.field1308) {
                        break label407;
                     }

                     class170.method1332(false);
                     if (!var2) {
                        break label407;
                     }
                  }

                  class697.method5071((byte)102, class297.field3890, class600.method4374(arg0 + -14229), class611.field8540, false);
               }
            }

            if (class85.field1098 == null) {
               Container var6;
               label389: {
                  if (class533.field7289 != null) {
                     var6 = class533.field7289;
                     if (!var2) {
                        break label389;
                     }
                  }

                  if (class126.field1586 != null) {
                     var6 = class126.field1586;
                     if (!var2) {
                        break label389;
                     }
                  }

                  var6 = class186.field2284;
               }

               int var7 = var6.getSize().width;
               int var8 = var6.getSize().height;
               if (class533.field7289 == var6) {
                  Insets var9 = class533.field7289.getInsets();
                  var8 -= var9.top - -var9.bottom;
                  var7 -= var9.right + var9.left;
               }

               if (~class682.field10003 != ~var7 || class434.field6038 != var8 || class343.field4915) {
                  label403: {
                     if (class338.field4832 == null || class338.field4832.method566()) {
                        class31.method252(arg0 + -28076);
                        if (!var2) {
                           break label403;
                        }
                     }

                     class434.field6038 = var8;
                     class682.field10003 = var7;
                  }

                  class51.field569 = class792.method5708(-25005) - -500L;
                  class343.field4915 = false;
               }
            }

            if (arg0 == 14331) {
               if (class85.field1098 != null && !class308.field4094 && class141.method1205(-6140, class445.field6162)) {
                  class697.method5071((byte)97, -1, class674.field9907.field8431.method996((byte)-109), -1, false);
               }

               boolean var10 = false;
               if (class604.field8416) {
                  class604.field8416 = false;
                  var10 = true;
               }

               if (var10) {
                  class194.method1460((byte)5);
               }

               if (class338.field4832 != null && class338.field4832.method490() || ~class600.method4374(111) != -2) {
                  class570.method4093(-30624);
               }

               label328: {
                  if (!class190.method1431(class445.field6162, 1)) {
                     if (!class460.method3388(class445.field6162, arg0 ^ -3342)) {
                        if (class790.method5698(class445.field6162, -123)) {
                           class596.method4350((byte)-109);
                           if (!var2) {
                              break label328;
                           }
                        }

                        if (class434.method3239(7469, class445.field6162)) {
                           if (class76.field957 == 1) {
                              if (class256.field3272 > class14.field170) {
                                 class14.field170 = class256.field3272;
                              }

                              int var11 = (-class256.field3272 + class14.field170) * 50 / class14.field170;
                              class134.method1128(class551.field7533.method3980(class494.field6787, true) + field4274[42] + var11 + field4274[41], false, class163.field2095, class22.field281, class338.field4832, true);
                              if (!var2) {
                                 break label328;
                              }
                           }

                           if (~class76.field957 == -3) {
                              if (class12.field145 > class133.field1728) {
                                 class133.field1728 = class12.field145;
                              }

                              int var12 = (-class12.field145 + class133.field1728) * 50 / class133.field1728 + 50;
                              class134.method1128(class551.field7533.method3980(class494.field6787, true) + field4274[42] + var12 + field4274[41], false, class163.field2095, class22.field281, class338.field4832, true);
                              if (!var2) {
                                 break label328;
                              }
                           }

                           class134.method1128(class551.field7533.method3980(class494.field6787, true), false, class163.field2095, class22.field281, class338.field4832, true);
                           if (!var2) {
                              break label328;
                           }
                        }

                        if (~class445.field6162 == -12) {
                           class306.method2299(var3, arg0 + 6897);
                           if (!var2) {
                              break label328;
                           }
                        }

                        if (class445.field6162 == 14) {
                           class134.method1128(class551.field7535.method3980(class494.field6787, true) + field4274[39] + class551.field7536.method3980(class494.field6787, true), false, class163.field2095, class22.field281, class338.field4832, false);
                           if (!var2) {
                              break label328;
                           }
                        }

                        if (class445.field6162 != 15) {
                           break label328;
                        }

                        class134.method1128(class551.field7552.method3980(class494.field6787, true), false, class163.field2095, class22.field281, class338.field4832, false);
                        if (!var2) {
                           break label328;
                        }
                     }

                     class596.method4350((byte)41);
                     if (!var2) {
                        break label328;
                     }
                  }

                  class85.method832(var10, (byte)-67);
               }

               if (class309.field4103 == 3) {
                  int var13 = 0;
                  if (var2 || var13 < class739.field10765) {
                     do {
                        Rectangle var14 = class224.field2809[var13];
                        if (!class378.field5304[var13]) {
                           if (!class294.field3861[var13]) {
                              class338.field4832.method575(-16711936, var14.y, var14.width, var14.height, 1, var14.x);
                              if (!var2) {
                                 ++var13;
                                 continue;
                              }
                           }

                           class338.field4832.method575(-65536, var14.y, var14.width, var14.height, 1, var14.x);
                           if (!var2) {
                              ++var13;
                              continue;
                           }
                        }

                        class338.field4832.method575(-65281, var14.y, var14.width, var14.height, 1, var14.x);
                        ++var13;
                     } while(var13 < class739.field10765);
                  }
               }

               if (class318.method2385(97)) {
                  class90.method854(class338.field4832, (byte)-124);
               }

               label409: {
                  if (!class61.field671.field3265 || !class141.method1205(-6140, class445.field6162) || ~class309.field4103 != -1 || class600.method4374(109) != 1 || var10) {
                     if (class190.method1431(class445.field6162, arg0 + -14330)) {
                        break label409;
                     }

                     int var15 = 0;
                     if (var2) {
                        class294.field3861[var15] = false;
                        ++var15;
                     }

                     while(true) {
                        while(class739.field10765 > var15) {
                           class294.field3861[var15] = false;
                           ++var15;
                        }

                        try {
                           if (!var2) {
                              if (!class775.field11283) {
                                 class338.field4832.method548(false);
                                 if (!var2) {
                                    break label409;
                                 }
                              }

                              class530.method3828((byte)52);
                              break label409;
                           }
                        } catch (class265 var22) {
                           class106.method940(var22.getMessage() + field4274[40] + this.method804(arg0 + -26612), var22, (byte)-33);
                           class594.method4335(false, arg0 + 2147469316, 0);
                           if (!var2) {
                              break label409;
                           }
                           break;
                        }

                        ++var15;
                     }
                  }

                  int var17 = 0;
                  int var18 = 0;
                  if (var2) {
                     if (class294.field3861[var18]) {
                        class294.field3861[var18] = false;
                        class74.field919[var17++] = class224.field2809[var18];
                     }

                     ++var18;
                  }

                  while(true) {
                     boolean var10000;
                     if (class739.field10765 <= var18) {
                        try {
                           var10000 = class775.field11283;
                           if (!var2) {
                              if (!var10000) {
                                 class338.field4832.method545(class74.field919, 24548, var17);
                                 if (!var2) {
                                    break;
                                 }
                              }

                              class774.method5552(arg0 + -14332, var17, class74.field919);
                              break;
                           }
                        } catch (class265 var21) {
                           break;
                        }
                     } else {
                        var10000 = class294.field3861[var18];
                     }

                     if (var10000) {
                        class294.field3861[var18] = false;
                        class74.field919[var17++] = class224.field2809[var18];
                     }

                     ++var18;
                  }
               }

               label399: {
                  class719.method5226((byte)-19);
                  int var19 = class674.field9907.field8459.method693((byte)-96);
                  if (~var19 == -1) {
                     class173.method1347(61, 15L);
                     if (!var2) {
                        break label399;
                     }
                  }

                  if (var19 != 1) {
                     if (~var19 != -3) {
                        if (~var19 != -4) {
                           break label399;
                        }

                        class173.method1347(-100, 2L);
                        if (!var2) {
                           break label399;
                        }
                     }

                     class173.method1347(arg0 ^ -14246, 5L);
                     if (!var2) {
                        break label399;
                     }
                  }

                  class173.method1347(-119, 10L);
               }

               if (class92.field1229) {
                  class670.method4894((byte)-126);
               }

               if (class674.field9907.field8470.method2755((byte)-115) == 1 && ~class445.field6162 == -4 && ~class366.field5168 != 0) {
                  class674.field9907.method4407(class674.field9907.field8470, -2160, 0);
                  class647.method4661((byte)107);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field4274[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method814(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V"
   )
   public static final void main(String[] arg0) {
      boolean var1 = field4273;

      try {
         try {
            if (arg0.length != 6) {
               class435.method3244(field4274[60], (byte)18);
            }

            label103: {
               class85.field1100 = new class454();
               class85.field1100.field6242 = Integer.parseInt(arg0[0]);
               class308.field4093 = new class454();
               class308.field4093.field6242 = Integer.parseInt(arg0[1]);
               class41.field473 = new class454();
               class41.field473.field6242 = Integer.parseInt(arg0[2]);
               class269.field3480 = class5.field30;
               if (arg0[3].equals(field4274[53])) {
                  class300.field3960 = class718.field10519;
                  if (!var1) {
                     break label103;
                  }
               }

               if (arg0[3].equals(field4274[61])) {
                  class300.field3960 = class169.field2129;
                  if (!var1) {
                     break label103;
                  }
               }

               if (arg0[3].equals(field4274[58])) {
                  class300.field3960 = class403.field5647;
                  if (!var1) {
                     break label103;
                  }
               }

               class435.method3244(field4274[63], (byte)18);
            }

            class494.field6787 = class749.method5411(-61, arg0[4]);
            if (class494.field6787 == -1) {
               label106: {
                  if (arg0[4].equals(field4274[65])) {
                     class494.field6787 = 0;
                     if (!var1) {
                        break label106;
                     }
                  }

                  if (!arg0[4].equals(field4274[59])) {
                     class435.method3244(field4274[64], (byte)18);
                     if (!var1) {
                        break label106;
                     }
                  }

                  class494.field6787 = 1;
               }
            }

            label105: {
               class710.field10422 = false;
               class647.field9062 = false;
               if (arg0[5].equals(field4274[52])) {
                  class381.field5334 = class551.field7585;
                  if (!var1) {
                     break label105;
                  }
               }

               if (arg0[5].equals(field4274[55])) {
                  class381.field5334 = class339.field4866;
                  if (!var1) {
                     break label105;
                  }
               }

               if (!arg0[5].equals(field4274[51])) {
                  if (!arg0[5].equals(field4274[57])) {
                     class435.method3244(field4274[62], (byte)18);
                     if (!var1) {
                        break label105;
                     }
                  }

                  class381.field5334 = class4.field20;
                  if (!var1) {
                     break label105;
                  }
               }

               class381.field5334 = class667.field9486;
            }

            class349.field5007 = true;
            class530.field7265 = true;
            class600.field8375 = class381.field5334.field333;
            class280.field3748 = null;
            class447.field6183 = false;
            class74.field924 = 0;
            class55.field594 = 0L;
            class633.field8955 = 0;
            class683.field10028 = false;
            class701.field10211 = "";
            class771.field11125 = 0;
            class489.field6742 = null;
            client var2 = new client();
            class15.field197 = var2;
            var2.method812(768, 654, 1024, class381.field5334.field334, 37, class300.field3960.method410(false) + 32, 0, false);
            class533.field7289.setLocation(40, 40);
         } catch (Exception var5) {
            class106.method940((String)null, var5, (byte)-33);
         }

         ++field4254;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4274[50] + (arg0 != null ? field4274[54] : field4274[56]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method803(byte arg0) {
      try {
         label26: {
            ++field4258;
            if (~class674.field9907.field8451.method2770((byte)-92) != -3) {
               this.method2394(14331);
               if (!field4273) {
                  break label26;
               }
            }

            try {
               this.method2394(arg0 ^ 14232);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class106.method940(var6.getMessage() + field4274[40] + this.method804(arg0 + -12380), var6, (byte)-33);
               class595.field8291 = true;
               class594.method4335(false, Integer.MAX_VALUE, 0);
            }
         }

         if (arg0 != 99) {
            field4269 = null;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4274[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method806(int arg0) {
      boolean var2 = field4273;

      try {
         method2410((byte)79);
         ++field4256;
         class520.method3765(-7585);
         class427.method3208((byte)-127);
         class446.method3307(-2);
         class551.method3979(119);
         class701.method5089(false);
         class544.method3933(97);
         class175.method1357(27777);
         class668.method4829((byte)115);
         class8.method71(-83);
         class256.method1962(true);
         class106.method941(-111);
         class203.method1528((byte)16);
         class395.method3005(true);
         class603.method4399(-12140);
         class694.method5051((byte)120);
         class500.method3608(false);
         class549.method3967((byte)63);
         class245.method1846(0);
         class82.method808(-125);
         class195.method1470((byte)127);
         class49.method411((byte)46);
         class436.method3248((byte)-45);
         class26.method221(1);
         class17.method148((byte)111);
         class65.method518((byte)103);
         class605.method4411((byte)-102);
         class722.method5249((byte)-20);
         class565.method4054(120);
         class401.method3038(false);
         class131.method1101((byte)-61);
         class338.method2678((byte)-104);
         class210.method1601((byte)0);
         class74.method726(75);
         class259.method1979(0);
         class100.method909(-126);
         class590.method4243((byte)-21);
         class429.method3221(-115);
         class660.method4791(127);
         class504.method3638((byte)-126);
         class517.method3748(4096);
         class322.method2424(95);
         class237.method1779(-83);
         class706.method5137((byte)-62);
         class495.method3591((byte)-126);
         class720.method5234(0);
         class318.method2384((byte)-56);
         class323.method2437((byte)93);
         class64.method475(-20741);
         class296.method2225((byte)47);
         class196.method1474((byte)82);
         class257.method1970(30769);
         class447.method3320((byte)-19);
         class198.method1485(-23773);
         class540.method3897((byte)1);
         class434.method3240(-11);
         class354.method2785(117);
         class440.method3271(123);
         class443.method3292(805250689);
         class505.method3644(-6516);
         class766.method5496((byte)109);
         class243.method1823((byte)-38);
         class223.method1700((byte)-119);
         class380.method2927(7363);
         class10.method86(81);
         class126.method1056((byte)109);
         class242.method1809(4096);
         class411.method3112((byte)-93);
         class657.method4755((byte)-101);
         class404.method3069((byte)-61);
         class2.method15((byte)123);
         class464.method3406(21452);
         class139.method1184(6189);
         class457.method3358(0);
         class594.method4303(-79);
         class471.method3452(true);
         class569.method4082(false);
         class225.method1723(32);
         class31.method253(0);
         class666.method4818((byte)74);
         class588.method4225(-17285);
         class86.method837(-85);
         class378.method2913(-22440);
         class333.method2651((byte)-128);
         class206.method1562((byte)48);
         class529.method3821(4);
         class770.method5513((byte)108);
         class643.method4641(123);
         class577.method4148(2);
         class437.method3252(-19569);
         class148.method1241(1024);
         class454.method3349((byte)-126);
         class336.method2666(-3);
         class419.method3172(113);
         class360.method2810((byte)42);
         class250.method1881((byte)29);
         class110.method970((byte)-112);
         class556.method4011((byte)36);
         class364.method2823((byte)-127);
         class648.method4671(1073741823);
         class477.method3484(35);
         class61.method463(-105);
         class191.method1438(-4003);
         class501.method3620(904);
         class534.method3847(458752);
         class507.method3686((byte)-72);
         class172.method1342(-7121);
         class12.method94((byte)107);
         class92.method869(-67);
         class774.method5535(true);
         class200.method1502(0);
         class459.method3374(-110);
         class87.method840(-120);
         class392.method2985(0);
         class298.method2248(-31);
         class261.method2006(true);
         class66.method618(false);
         class468.method3431((byte)-124);
         class157.method1280(115);
         class143.method1210(71);
         class88.method846(-5);
         class710.method5181((byte)41);
         class522.method3777(-97);
         class104.method929(126);
         class548.method3959((byte)-116);
         class240.method1800(-52);
         class369.method2852(0);
         class550.method3976(false);
         class584.method4195(2);
         class527.method3802(2);
         class721.method5243(67);
         class568.method4068((byte)-78);
         class352.method2772(3);
         class331.method2630((byte)-30);
         class177.method1372(50);
         class115.method995((byte)58);
         class574.method4136(false);
         class70.method695(-19252);
         class734.method5325(22);
         class349.method2752(-7486);
         class713.method5189(5746);
         class719.method5227(2);
         class171.method1337(-25413);
         class386.method2955((byte)120);
         class265.method2033(-113);
         class516.method3744(-124);
         class438.method3256((byte)120);
         class663.method4802((byte)0);
         class478.method3487(8208);
         class127.method1071((byte)-55);
         class47.method399((byte)10);
         class80.method769((byte)-119);
         class69.method651(-111);
         class7.method59((byte)124);
         class693.method5036((byte)-42);
         class16.method137();
         class616.method4471(true);
         class394.method2999(255);
         class328.method2607((byte)-77);
         class748.method5398((byte)31);
         class277.method2109(125);
         class347.method2743(-14100);
         class656.method4738(22778);
         class367.method2836(-1);
         class422.method3189(11);
         class420.method3178(false);
         class423.method3194(230);
         class553.method3994(-685350845);
         class490.method3559(false);
         class281.method2147((byte)-47);
         class755.method5442(3);
         class202.method1520(30383);
         class618.method4500();
         class778.method5567(false);
         class611.method4446(-1);
         class739.method5357(false);
         class412.method3122(false);
         class234.method1769(-116);
         class21.method180((byte)-126);
         class156.method1274(true);
         class621.method4515(-19);
         class190.method1434(true);
         class169.method1327(0);
         class269.method2060((byte)-89);
         class794.method5721((byte)101);
         class79.method762((byte)90);
         class545.method3937((byte)-97);
         class311.method2332(-1);
         class672.method4926();
         class683.method4991((byte)-125);
         class785.method5655((byte)108);
         class35.method271(99);
         class168.method1320(39);
         class84.method819();
         class182.method1395(-127);
         class292.method2194(-32140);
         class566.method4057(-7317);
         class417.method3155(40);
         class717.method5214(7412);
         class589.method4229(-1);
         class462.method3393(false);
         class30.method246((byte)120);
         class743.method5376(true);
         class675.method4947((byte)82);
         class750.method5421(0);
         class525.method3791(36);
         class247.method1861(0);
         class718.method5218((byte)-66);
         class95.method892(-3);
         class752.method5429(2560);
         class194.method1462(116);
         class183.method1401((byte)-117);
         class408.method3101();
         class22.method187((byte)-109);
         class606.method4422(80);
         class135.method1134((byte)66);
         class773.method5532((byte)-126);
         class761.method5470();
         class185.method1412(false);
         class145.method1229((byte)16);
         class390.method2968((byte)-114);
         class466.method3415(true);
         class366.method2830(-24934);
         class633.method4596(-97);
         class775.method5559(-2165);
         class36.method277();
         class136.method1139(4355);
         class645.method4647(1652604848);
         class216.method1648(0);
         class305.method2295(260);
         class682.method4985(0);
         class407.method3091((byte)123);
         class146.method1235(-1333);
         class786.method5661(true);
         class547.method3950((byte)-116);
         class622.method4523(10);
         class382.method2937((byte)-2);
         class793.method5712((byte)-118);
         class639.method4627(123);
         class307.method2306(false);
         class688.method5019(2878);
         class20.method174(64);
         class711.method5186(56);
         class209.method1588((byte)-125);
         class118.method1004(-16032);
         class315.method2367((byte)1);
         class511.method3710(1);
         class158.method1286(27580);
         class310.method2324(-1881416416);
         class790.method5695((byte)-23);
         class634.method4602((byte)123);
         class163.method1303((byte)50);
         class552.method3987(113);
         class480.method3497(-117);
         class56.method430(111);
         class253.method1924(-124);
         class735.method5333((byte)54);
         class696.method5061(true);
         class530.method3825(3);
         class222.method1692(-69);
         class73.method702((byte)-108);
         class368.method2844((byte)-113);
         class219.method1661(110);
         class627.method4561(true);
         class312.method2343((byte)-60);
         class771.method5519(95);
         class398.method3023(true);
         class5.method32((byte)123);
         class537.method3882(0);
         class208.method1583((byte)125);
         class94.method880(203);
         class181.method1389(-121);
         class41.method310((byte)-23);
         class740.method5364((byte)-40);
         class602.method4392(-70);
         class141.method1206(16);
         class28.method233(false);
         class359.method2807(896);
         class601.method4388(255);
         class350.method2761((byte)-46);
         class674.method4942(-1);
         class29.method240(true);
         class716.method5210(109);
         class777.method5564(-31408);
         class489.method3555(4);
         class18.method163(false);
         class90.method853(false);
         class737.method5342(-6355);
         class44.method376(-8962);
         class264.method2029((byte)61);
         class375.method2902(0);
         class140.method1198(101);
         class205.method1546(62);
         class113.method985();
         class270.method2067(-128);
         class509.method3698((byte)40);
         class421.method3182(-13476);
         class570.method4094(0);
         class524.method3787((byte)25);
         class276.method2099(true);
         class497.method3597((byte)-128);
         class607.method4431(-128);
         class302.method2275((byte)28);
         class591.method4252(-81);
         class626.method4555(127);
         class144.method1215(268435455);
         class154.method1266(53);
         class561.method4036(1);
         class503.method3632(-6304);
         class756.method5445(107);
         class244.method1836((byte)101);
         class384.method2946(false);
         class23.method202();
         class381.method2933(46);
         class788.method5671();
         class337.method2671();
         class698.method5075(77);
         class68.method644(114);
         class451.method3339();
         class221.method1686(-80);
         class705.method5129(false);
         class53.method421(26);
         class213.method1620(-32);
         class476.method3476(-1);
         class767.method5500(-1);
         class119.method1007(2675);
         class473.method3467(8);
         class760.method5466(0);
         class125.method1048(-127);
         class463.method3402(-21176);
         class101.method915(0);
         class294.method2215((byte)-120);
         class650.method4711(-1);
         class362.method2814(-120);
         class109.method963(63);
         class60.method453(true);
         class114.method992((byte)-60);
         class212.method1612(2);
         class738.method5348();
         class779.method5588((byte)44);
         class526.method3797((byte)100);
         class406.method3084(14878);
         class432.method3236(0);
         class614.method4464(-90);
         class278.method2114((byte)48);
         class174.method1352(7890);
         class487.method3544(0);
         class667.method4823(false);
         class533.method3837(1);
         class617.method4476((byte)-87);
         class93.method873(113);
         class128.method1075(255);
         class204.method1535(0);
         class539.method3891((byte)94);
         class299.method2254(-1);
         class624.method4534((byte)-108);
         class728.method5296(3111);
         class133.method1123(93);
         class715.method5202((byte)-15);
         class670.method4873(-3923);
         class370.method2859(2639);
         class13.method100((byte)-116);
         class599.method4368(1);
         class628.method4569(-29073);
         class543.method3921(-124);
         class528.method3813(16383);
         class762.method5472(114);
         class280.method2130(false);
         class325.method2448(-1);
         class573.method4126(109);
         class684.method4999(-1);
         class604.method4404(-109);
         class40.method302(12471);
         class271.method2083(76);
         class178.method1377(1);
         class608.method4441((byte)126);
         class681.method4981((byte)82);
         class327.method2541(false);
         class727.method5289(595656065);
         class335.method2662(91);
         class502.method3626(-53);
         class635.method4608(-54);
         class416.method3150((byte)-57);
         class567.method4063(-122);
         class199.method1493(-128);
         class579.method4165(0);
         class403.method3050((byte)60);
         class709.method5161(-29055);
         class300.method2257(-104);
         class273.method2088(2048);
         class317.method2378(5123);
         class632.method4593(5126);
         class81.method793(-103);
         class769.method5510();
         class235.method1772(0);
         class97.method900((byte)53);
         class215.method1634(126);
         class472.method3462(41);
         class188.method1427(-8289);
         class387.method2958((byte)24);
         class248.method1866(-1854);
         class493.method3581(0);
         class726.method5283((byte)40);
         class306.method2300(6939);
         class676.method4952(-120);
         class345.method2730(-1);
         class637.method4621(true);
         class593.method4267(false);
         class700.method5081((byte)61);
         class542.method3909(-1090258740);
         class358.method2801((byte)114);
         class25.method213(0);
         class232.method1757((byte)-114);
         class37.method288(2);
         class576.method4145(0);
         class484.method3521(31629);
         class685.method5006(1);
         class742.method5372(105);
         int var3 = -33 / ((20 - arg0) / 48);
         class661.method4796(-11911);
         class795.method5730(-114);
         class193.method1455(-54);
         class733.method5320(true);
         class625.method4541(-97);
         class415.method3141((byte)122);
         class57.method436();
         class654.method4726(16);
         class155.method1269(67);
         class239.method1793(-109);
         class9.method79(10);
         class108.method958(1);
         class581.method4179(12832);
         class460.method3383(true);
         class768.method5503((byte)19);
         class469.method3438((byte)-46);
         class356.method2794(-2242);
         class42.method316(58);
         class655.method4732(3291);
         class224.method1715(7548);
         class757.method5449(21752);
         class238.method1784(-17268);
         class24.method209((byte)-65);
         class132.method1109((byte)-112);
         class233.method1761(9342);
         class111.method974((byte)-127);
         class697.method5067(1);
         class467.method3423((byte)-29);
         class186.method1418((byte)127);
         class39.method295(69);
         class746.method5389((byte)121);
         class252.method1913(-6447);
         class600.method4380((byte)5);
         class393.method2991(12);
         class76.method746(-128);
         class450.method3336(200);
         class658.method4780(768);
         class764.method5487(770);
         class442.method3284((byte)111);
         class580.method4171(3552);
         class316.method2372(-24622);
         class532.method3834(-117);
         class46.method389((byte)60);
         class343.method2720(1);
         class679.method4969(true);
         class102.method919(1);
         class374.method2897((byte)-61);
         class55.method427(125);
         class749.method5410((byte)-71);
         class192.method1450(true);
         class744.method5379((byte)-99);
         class465.method3410((byte)104);
         class613.method4459((byte)-87);
         class304.method2288(-1);
         class535.method3851(1);
         class671.method4918(true);
         class45.method380(23588);
         class287.method2177(0);
         class449.method3332(true);
         class383.method2941(true);
         class124.method1042(true);
         class791.method5704(75);
         class483.method3516(-85);
         class291.method2189(0);
         class486.method3530(3);
         class283.method2156(true);
         class33.method265(-112);
         class585.method4200(true);
         class572.method4118(-936);
         class388.method2961(98);
         class636.method4614(0);
         class71.method698(66);
         class708.method5151(-22);
         class288.method2181((byte)-47);
         class402.method3046(true);
         class564.method4049(8);
         class444.method3298(10543);
         class308.method2314((byte)-68);
         class282.method2151(0);
         class355.method2788(-76);
         class439.method3264(false);
         class121.method1024((byte)-121);
         class731.method5317((byte)42);
         class492.method3570(-1);
         class575.method4139(77);
         class554.method3998(-1);
         class686.method5011((byte)-82);
         class397.method3017((byte)-126);
         class348.method2748(50);
         class179.method1381(true);
         class346.method2734((byte)71);
         class470.method3444(false);
         class341.method2701(-71);
         class85.method828((byte)67);
         class241.method1803(false);
         class690.method5025(true);
         class4.method24(-128);
         class170.method1334(0);
         class38.method292(16);
         class231.method1752(-1);
         class481.method3504(0);
         class518.method3758(4);
         class558.method4016(false);
         class150.method1250(-39);
         class59.method442(-20049);
         class441.method3278((byte)73);
         class166.method1312(19035);
         class321.method2416(-30843);
         class578.method4152(-71);
         class413.method3126((byte)127);
         class371.method2872((byte)98);
         class329.method2618(-21771);
         class631.method4583(false);
         class619.method4507((byte)55);
         class14.method108((byte)-96);
         class340.method2694((byte)43);
         class475.method3472(16384);
         class266.method2036(-1);
         class184.method1405(-126);
         class353.method2776(true);
         class167.method1316((byte)47);
         class15.method116(15935);
         class254.method1934(-1530502200);
         class630.method4578(79);
         class285.method2164(-86);
         class334.method2655(0);
         class426.method3205(-17920);
         class488.method3551(731);
         class339.method2687((byte)41);
         class620.method4511(0);
         class226.method1726(11493);
         class560.method4033((byte)79);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4274[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method798(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "m",
      descriptor = "(I)V"
   )
   public static final void method2395(int arg0) {
      int var1 = class261.field3357;
      int[] var2 = class294.field3862;

      for(int var3 = 0; var3 < class741.field10800 + var1; ++var3) {
         class569 var4;
         if (var3 < var1) {
            var4 = class136.field1773[var2[var3]];
         } else {
            var4 = ((class243)class335.field4808.method1839(102, (long)class285.field3785[var3 - var1])).field3043;
         }

         if (var4.field1001 == arg0 && var4.field7773 >= 0) {
            int var5 = var4.method3060((byte)38);
            if ((var5 & 1) == 0) {
               if ((var4.field999 & 511) != 0 || (var4.field1003 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field999 & 511) != 256 || (var4.field1003 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field999 >> 9;
               int var7 = var4.field1003 >> 9;
               if (var4.field7773 > class371.field5227[var6][var7]) {
                  class371.field5227[var6][var7] = var4.field7773;
                  class752.field10919[var6][var7] = 1;
               } else if (class371.field5227[var6][var7] == var4.field7773) {
                  var10002 = class752.field10919[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field999 - var8 >> 9;
               int var10 = var4.field1003 - var8 >> 9;
               int var11 = var4.field999 + var8 >> 9;
               int var12 = var4.field1003 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field7773 > class371.field5227[var13][var14]) {
                        class371.field5227[var13][var14] = var4.field7773;
                        class752.field10919[var13][var14] = 1;
                     } else if (class371.field5227[var13][var14] == var4.field7773) {
                        var10002 = class752.field10919[var13][var14]++;
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V"
   )
   public final void init() {
      boolean var1 = field4273;

      try {
         ++field4264;
         if (this.method811(false)) {
            label201: {
               class85.field1100 = new class454();
               class85.field1100.field6242 = Integer.parseInt(this.getParameter(field4274[95]));
               class308.field4093 = new class454();
               class308.field4093.field6242 = Integer.parseInt(this.getParameter(field4274[85]));
               class308.field4093.field6244 = this.getParameter(field4274[83]);
               class41.field473 = new class454();
               class41.field473.field6242 = Integer.parseInt(this.getParameter(field4274[93]));
               class41.field473.field6244 = this.getParameter(field4274[94]);
               class269.field3480 = class470.method3446(-24577, Integer.parseInt(this.getParameter(field4274[87])));
               if (class5.field30 != class269.field3480) {
                  if (class632.method4590((byte)9, class269.field3480) || class304.field4027 == class269.field3480) {
                     break label201;
                  }

                  class269.field3480 = class304.field4027;
                  if (!var1) {
                     break label201;
                  }
               }

               class269.field3480 = class603.field8404;
            }

            class300.field3960 = class795.method5729(Integer.parseInt(this.getParameter(field4274[63])), 65535);
            if (class403.field5647 != class300.field3960 && class300.field3960 != class169.field2129 && class718.field10519 != class300.field3960) {
               class300.field3960 = class718.field10519;
            }

            try {
               class494.field6787 = Integer.parseInt(this.getParameter(field4274[89]));
            } catch (Exception var17) {
               class494.field6787 = 0;
            }

            label189: {
               String var2 = this.getParameter(field4274[84]);
               if (var2 != null && var2.equals("1")) {
                  class647.field9062 = true;
                  if (!var1) {
                     break label189;
                  }
               }

               class647.field9062 = false;
            }

            label210: {
               String var3 = this.getParameter(field4274[79]);
               if (var3 == null || !var3.equals("1")) {
                  class710.field10422 = false;
                  if (!var1) {
                     break label210;
                  }
               }

               class710.field10422 = true;
            }

            label175: {
               String var4 = this.getParameter(field4274[78]);
               if (var4 != null && var4.equals("1")) {
                  class749.field10902 = true;
                  if (!var1) {
                     break label175;
                  }
               }

               class749.field10902 = false;
            }

            String var5 = this.getParameter(field4274[62]);
            if (var5 != null) {
               label208: {
                  if (var5.equals("0")) {
                     class381.field5334 = class551.field7585;
                     if (!var1) {
                        break label208;
                     }
                  }

                  if (var5.equals("1")) {
                     class381.field5334 = class339.field4866;
                     if (!var1) {
                        break label208;
                     }
                  }

                  if (!var5.equals("2")) {
                     if (!var5.equals("3")) {
                        break label208;
                     }

                     class381.field5334 = class4.field20;
                     if (!var1) {
                        break label208;
                     }
                  }

                  class381.field5334 = class667.field9486;
               }
            }

            try {
               class74.field924 = Integer.parseInt(this.getParameter(field4274[77]));
            } catch (Exception var16) {
               class74.field924 = 0;
            }

            class60.field641 = this.getParameter(field4274[90]);
            class701.field10211 = this.getParameter(field4274[97]);
            if (class701.field10211 == null) {
               class701.field10211 = "";
            }

            class483.field6657 = "1".equals(this.getParameter(field4274[98]));
            String var6 = this.getParameter(field4274[96]);
            if (var6 != null) {
               try {
                  class771.field11125 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class771.field11125 = 0;
               }
            }

            class600.field8375 = Integer.parseInt(this.getParameter(field4274[81]));
            if (class600.field8375 < 0 || class497.field6835.length <= class600.field8375) {
               class600.field8375 = 0;
            }

            if (Integer.parseInt(this.getParameter(field4274[101])) == 1) {
               class349.field5007 = true;
               class530.field7265 = true;
            }

            String var7 = this.getParameter(field4274[88]);
            if (var7 != null && var7.equals(field4274[80])) {
               class683.field10028 = true;
            }

            String var8 = this.getParameter(field4274[100]);
            if (var8 != null) {
               class280.field3748 = class552.method3984(-66, class270.method2066(var8, (byte)125));
               if (~class280.field3748.length > -17) {
                  class280.field3748 = null;
               }
            }

            String var9 = this.getParameter(field4274[92]);
            if (var9 != null && var9.equals(field4274[80])) {
               class447.field6183 = true;
            }

            String var10 = this.getParameter(field4274[99]);
            if (var10 != null) {
               try {
                  class633.field8955 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field4274[91]);
            if (var11 != null) {
               try {
                  class55.field594 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class489.field6742 = this.getParameter(field4274[82]);
            if (class489.field6742 != null && ~class489.field6742.length() < -51) {
               class489.field6742 = null;
            }

            label134: {
               if (class551.field7585 == class381.field5334) {
                  class698.field10190 = 765;
                  class420.field5892 = 503;
                  if (!var1) {
                     break label134;
                  }
               }

               if (class381.field5334 == class339.field4866) {
                  class698.field10190 = 640;
                  class420.field5892 = 480;
               }
            }

            class15.field197 = this;
            this.method809(654, class381.field5334.field334, 37, class300.field3960.method410(false) + 32, class420.field5892, -4, class698.field10190);
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field4274[86] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Leb;)Lwj;"
   )
   public static final class418 method2396(class657 arg0) {
      class418 var1 = (class418)class45.field509.method1839(-31, ((long)arg0.field9220 << 32) + (long)arg0.field9285);
      return var1 != null ? var1 : arg0.field9365;
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Leb;IIIIIIIIIII)V"
   )
   public static final void method2397(class657[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label864:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class657 var13 = arg0[var12];
         if (var13 != null && var13.field9363 == arg1) {
            int var14 = var13.field9256 + arg6;
            int var15 = var13.field9380 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field9372 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field9379 + var14;
               int var21 = var13.field9360 + var15;
               if (var13.field9372 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field9372 != 0 && !var13.field9298 && method2396(var13).field5875 == 0 && class611.field8543 != var13 && class150.field1954 != var13.field9209 && class663.field9443 != var13.field9209) {
               if (var16 < var18 && var17 < var19) {
                  class795.method5728(0, var13);
               }
            } else if (!method2401(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class775.field11283) {
                  var22 = class101.method916(-109);
                  var23 = class291.method2190(-121);
               }

               if (class602.field8398 == var13 && class777.method5563(126, class602.field8398) != null) {
                  class89.field1134 = true;
                  class768.field11079 = var14;
                  class742.field10815 = var15;
               }

               if (var13.field9375 || var16 < var18 && var17 < var19) {
                  if (var13.field9212 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class589 var24 = (class589)class426.field5956.method3855(115); var24 != null; var24 = (class589)class426.field5956.method3866((byte)127)) {
                        if (var24.field8113) {
                           var24.method3609(92);
                           var24.field8110.field9227 = false;
                        }
                     }

                     if (class624.field8710 == 0) {
                        class602.field8398 = null;
                        class611.field8543 = null;
                     }

                     class450.field6220 = 0;
                     class626.field8755 = false;
                     class597.field8320 = false;
                     if (!class666.field9473) {
                        class193.method1456(11311);
                     }
                  }

                  boolean var25;
                  if (class242.field3026.method1581(69) + var22 >= var16 && class242.field3026.method1572(false) + var23 >= var17 && class242.field3026.method1581(69) + var22 < var18 && class242.field3026.method1572(false) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class221.field2764 && var25) {
                     if (var13.field9340 >= 0) {
                        class325.field4354 = var13.field9340;
                     } else if (var13.field9212) {
                        class325.field4354 = -1;
                     }
                  }

                  if (!class666.field9473 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class405.method3073(var13, (byte)-122, arg11 - var15, arg10 - var14);
                  }

                  boolean var26 = false;
                  if (class242.field3026.method1576(117) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class554 var28 = (class554)class746.field10840.method3855(117);
                  if (var28 != null && var28.method3706(-7560) == 0 && var28.method3705(true) + var22 >= var16 && var28.method3707((byte)-90) + var23 >= var17 && var28.method3705(true) + var22 < var18 && var28.method3707((byte)-60) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field9348 != null && !class318.method2385(50)) {
                     for(int var29 = 0; var29 < var13.field9348.length; ++var29) {
                        if (!class42.field495.method3876(-86, var13.field9348[var29])) {
                           if (var13.field9307 != null) {
                              var13.field9307[var29] = 0;
                           }
                        } else if (var13.field9307 == null || class369.field5205 >= var13.field9307[var29]) {
                           byte var30 = var13.field9287[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class42.field495.method3876(125, 86) && !class42.field495.method3876(126, 82) && !class42.field495.method3876(-1, 81)) && ((var30 & 2) == 0 || class42.field495.method3876(126, 86)) && ((var30 & 1) == 0 || class42.field495.method3876(124, 82)) && ((var30 & 4) == 0 || class42.field495.method3876(-12, 81))) {
                              if (var29 < 10) {
                                 class297.method2236("", -1, var29 + 1, var13.field9220, (byte)64);
                              } else if (var29 == 10) {
                                 class239.method1790(10);
                                 class418 var31 = method2396(var13);
                                 class341.method2700(var31.method3160(-26038), var13, (byte)-59, var31.field5871);
                                 class460.field6309 = class237.method1780(-116, var13);
                                 if (class460.field6309 == null) {
                                    class460.field6309 = field4274[9];
                                 }

                                 class88.field1123 = var13.field9328 + field4274[10];
                              }

                              int var32 = var13.field9359[var29];
                              if (var13.field9307 == null) {
                                 var13.field9307 = new int[var13.field9348.length];
                              }

                              if (var32 != 0) {
                                 var13.field9307[var29] = class369.field5205 + var32;
                              } else {
                                 var13.field9307[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class88.method845(var22 + var28.method3705(true) - var14, 0, var23 + var28.method3707((byte)-65) - var15, var13);
                  }

                  if (class602.field8398 != null && class602.field8398 != var13 && var25 && method2396(var13).method3167((byte)68)) {
                     class481.field6644 = var13;
                  }

                  if (class611.field8543 == var13) {
                     class565.field7705 = true;
                     class527.field7209 = var14;
                     class299.field3955 = var15;
                  }

                  if (var13.field9298 || var13.field9209 != 0) {
                     if (var25 && class51.field567 != 0 && var13.field9278 != null) {
                        class589 var33 = new class589();
                        var33.field8113 = true;
                        var33.field8110 = var13;
                        var33.field8114 = class51.field567;
                        var33.field8116 = var13.field9278;
                        class426.field5956.method3859(2, var33);
                     }

                     if (class602.field8398 != null || class666.field9473 || class61.field672 != var13.field9209 && class450.field6220 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field9209 != 0) {
                        if (class107.field1373 == var13.field9209 || class681.field9997 == var13.field9209) {
                           class726.field10630 = var13;
                           if (class256.field3271 != null) {
                              class256.field3271.method1815(var13.field9360, class338.field4832, (byte)-80);
                           }

                           if (class107.field1373 == var13.field9209) {
                              if (class666.field9473 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class425.method3202(arg8, arg9, (byte)56, class338.field4832);
                              class301 var34 = (class301)class106.field1361.method3110(-123);

                              while(true) {
                                 if (var34 == null) {
                                    continue label864;
                                 }

                                 if (arg10 >= var34.field3969 && arg10 < var34.field3974 && arg11 >= var34.field3973 && arg11 < var34.field3966) {
                                    class193.method1456(11311);
                                    class126.method1054(var34.field3968, (byte)124);
                                 }

                                 var34 = (class301)class106.field1361.method3114(2);
                              }
                           }
                        }

                        if (class150.field1954 == var13.field9209) {
                           if (var13.method4774(class338.field4832, (byte)-41) == null || class666.field9474 != 0 && class666.field9474 != 3 || class666.field9473 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field9318[var36];
                           if (var35 < var37 || var35 > var13.field9368[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field9379 / 2;
                           int var39 = var36 - var13.field9360 / 2;
                           int var40;
                           if (class635.field8977 == 4) {
                              var40 = (int)class363.field5142 & 16383;
                           } else {
                              var40 = (int)class363.field5142 + class661.field9423 & 16383;
                           }

                           int var41 = class192.field2342[var40];
                           int var42 = class192.field2341[var40];
                           if (class635.field8977 != 4) {
                              var41 = (class356.field5080 + 256) * var41 >> 8;
                              var42 = (class356.field5080 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class635.field8977 == 4) {
                              var45 = (class338.field4839 >> 9) + (var43 >> 2);
                              var46 = (class221.field2763 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class278.field3709.method3060((byte)38) - 1) * 256;
                              var45 = (class278.field3709.field999 - var47 >> 9) + (var43 >> 2);
                              var46 = (class278.field3709.field1003 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class221.field2764 && (class32.field377 & 64) != 0) {
                              class657 var48 = class728.method5295(class593.field8208, class226.field2837, -1);
                              if (var48 != null) {
                                 class324.method2441(1L, false, 121, (long)(var13.field9285 << 0 | var13.field9220), field4274[8], var45, class460.field6309, var13.field9345, var46, true, 21, true, class740.field10780);
                              } else {
                                 class239.method1790(92);
                              }
                              continue;
                           }

                           if (class381.field5334 == class339.field4866) {
                              class324.method2441(1L, false, 126, 0L, "", var45, class551.field7548.method3980(class494.field6787, true), -1, var46, true, 23, true, -1);
                           }

                           class324.method2441(1L, false, 124, 0L, "", var45, class696.field10171, -1, var46, true, 10, true, class350.field5016);
                           continue;
                        }

                        if (class61.field672 == var13.field9209) {
                           class432.field6030 = var13;
                           if (var25) {
                              class626.field8755 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method3705(true) - var14 - var13.field9379 / 2) * 2.0D / (double)class618.field8619);
                              int var50 = (int)(-((double)(var23 + var28.method3707((byte)-61) - var15 - var13.field9360 / 2) * 2.0D / (double)class618.field8619));
                              int var51 = class791.field11574 + var49 + class618.field8644;
                              int var52 = class231.field2870 + var50 + class618.field8627;
                              class126 var53 = class248.method1867(88);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method1059(var52, var51, var54, -19306);
                              if (var54 != null) {
                                 if (class42.field495.method3876(127, 82) && class179.field2223 > 0) {
                                    class383.method2942((byte)-81, var54[2], var54[0], var54[1]);
                                    continue;
                                 }

                                 class597.field8320 = true;
                                 class68.field784 = var54[0];
                                 class741.field10799 = var54[1];
                                 class130.field1623 = var54[2];
                              }

                              class450.field6220 = 1;
                              class690.field10090 = false;
                              class670.field9552 = class242.field3026.method1581(69);
                              class508.field7039 = class242.field3026.method1572(false);
                              continue;
                           }

                           if (var26 && class450.field6220 > 0) {
                              if (class450.field6220 == 1 && (class670.field9552 != class242.field3026.method1581(69) || class508.field7039 != class242.field3026.method1572(false))) {
                                 class470.field6512 = class791.field11574;
                                 class3.field16 = class231.field2870;
                                 class450.field6220 = 2;
                              }

                              if (class450.field6220 == 2) {
                                 class690.field10090 = true;
                                 class367.method2834(class470.field6512 + (int)((double)(class670.field9552 - class242.field3026.method1581(69)) * 2.0D / (double)class618.field8618), 18914);
                                 class554.method3999(class3.field16 - (int)((double)(class508.field7039 - class242.field3026.method1572(false)) * 2.0D / (double)class618.field8618), -1);
                              }
                              continue;
                           }

                           if (class450.field6220 > 0 && !class690.field10090) {
                              if ((class196.field2377 == 1 || class481.method3505(9611)) && class234.field2899 > 2) {
                                 class283.method2154(false, class508.field7039, class670.field9552);
                              } else if (class621.method4517((byte)-64)) {
                                 class283.method2154(false, class508.field7039, class670.field9552);
                              }
                           }

                           class450.field6220 = 0;
                           continue;
                        }

                        if (class688.field10081 == var13.field9209) {
                           if (var26) {
                              class51.method415(var13.field9360, var23 + class242.field3026.method1572(false) - var15, var13.field9379, var22 + class242.field3026.method1581(69) - var14, (byte)-76);
                           }
                           continue;
                        }

                        if (class663.field9443 == var13.field9209) {
                           class606.method4427(0, var14, var15, var13);
                           continue;
                        }
                     }

                     if (!var13.field9344 && var27) {
                        var13.field9344 = true;
                        if (var13.field9208 != null) {
                           class589 var55 = new class589();
                           var55.field8113 = true;
                           var55.field8110 = var13;
                           var55.field8117 = var22 + var28.method3705(true) - var14;
                           var55.field8114 = var23 + var28.method3707((byte)-54) - var15;
                           var55.field8116 = var13.field9208;
                           class426.field5956.method3859(2, var55);
                        }
                     }

                     if (var13.field9344 && var26 && var13.field9275 != null) {
                        class589 var56 = new class589();
                        var56.field8113 = true;
                        var56.field8110 = var13;
                        var56.field8117 = var22 + class242.field3026.method1581(69) - var14;
                        var56.field8114 = var23 + class242.field3026.method1572(false) - var15;
                        var56.field8116 = var13.field9275;
                        class426.field5956.method3859(2, var56);
                     }

                     if (var13.field9344 && !var26) {
                        var13.field9344 = false;
                        if (var13.field9244 != null) {
                           class589 var57 = new class589();
                           var57.field8113 = true;
                           var57.field8110 = var13;
                           var57.field8117 = var22 + class242.field3026.method1581(69) - var14;
                           var57.field8114 = var23 + class242.field3026.method1572(false) - var15;
                           var57.field8116 = var13.field9244;
                           class371.field5229.method3859(2, var57);
                        }
                     }

                     if (var26 && var13.field9321 != null) {
                        class589 var58 = new class589();
                        var58.field8113 = true;
                        var58.field8110 = var13;
                        var58.field8117 = var22 + class242.field3026.method1581(69) - var14;
                        var58.field8114 = var23 + class242.field3026.method1572(false) - var15;
                        var58.field8116 = var13.field9321;
                        class426.field5956.method3859(2, var58);
                     }

                     if (!var13.field9227 && var25) {
                        var13.field9227 = true;
                        if (var13.field9232 != null) {
                           class589 var59 = new class589();
                           var59.field8113 = true;
                           var59.field8110 = var13;
                           var59.field8117 = var22 + class242.field3026.method1581(69) - var14;
                           var59.field8114 = var23 + class242.field3026.method1572(false) - var15;
                           var59.field8116 = var13.field9232;
                           class426.field5956.method3859(2, var59);
                        }
                     }

                     if (var13.field9227 && var25 && var13.field9361 != null) {
                        class589 var60 = new class589();
                        var60.field8113 = true;
                        var60.field8110 = var13;
                        var60.field8117 = var22 + class242.field3026.method1581(69) - var14;
                        var60.field8114 = var23 + class242.field3026.method1572(false) - var15;
                        var60.field8116 = var13.field9361;
                        class426.field5956.method3859(2, var60);
                     }

                     if (var13.field9227 && !var25) {
                        var13.field9227 = false;
                        if (var13.field9251 != null) {
                           class589 var61 = new class589();
                           var61.field8113 = true;
                           var61.field8110 = var13;
                           var61.field8117 = var22 + class242.field3026.method1581(69) - var14;
                           var61.field8114 = var23 + class242.field3026.method1572(false) - var15;
                           var61.field8116 = var13.field9251;
                           class371.field5229.method3859(2, var61);
                        }
                     }

                     if (var13.field9371 != null) {
                        class589 var62 = new class589();
                        var62.field8110 = var13;
                        var62.field8116 = var13.field9371;
                        class56.field605.method3859(2, var62);
                     }

                     if (var13.field9301 != null && class758.field10978 > var13.field9367) {
                        if (var13.field9249 != null && class758.field10978 - var13.field9367 <= 32) {
                           label751:
                           for(int var63 = var13.field9367; var63 < class758.field10978; ++var63) {
                              int var64 = class791.field11573[var63 & 31];

                              for(int var65 = 0; var65 < var13.field9249.length; ++var65) {
                                 if (var13.field9249[var65] == var64) {
                                    class589 var66 = new class589();
                                    var66.field8110 = var13;
                                    var66.field8116 = var13.field9301;
                                    class426.field5956.method3859(2, var66);
                                    break label751;
                                 }
                              }
                           }
                        } else {
                           class589 var67 = new class589();
                           var67.field8110 = var13;
                           var67.field8116 = var13.field9301;
                           class426.field5956.method3859(2, var67);
                        }

                        var13.field9367 = class758.field10978;
                     }

                     if (var13.field9283 != null && class382.field5351 > var13.field9235) {
                        if (var13.field9310 != null && class382.field5351 - var13.field9235 <= 32) {
                           label727:
                           for(int var68 = var13.field9235; var68 < class382.field5351; ++var68) {
                              int var69 = class778.field11316[var68 & 31];

                              for(int var70 = 0; var70 < var13.field9310.length; ++var70) {
                                 if (var13.field9310[var70] == var69) {
                                    class589 var71 = new class589();
                                    var71.field8110 = var13;
                                    var71.field8116 = var13.field9283;
                                    class426.field5956.method3859(2, var71);
                                    break label727;
                                 }
                              }
                           }
                        } else {
                           class589 var72 = new class589();
                           var72.field8110 = var13;
                           var72.field8116 = var13.field9283;
                           class426.field5956.method3859(2, var72);
                        }

                        var13.field9235 = class382.field5351;
                     }

                     if (var13.field9218 != null && class660.field9416 > var13.field9222) {
                        if (var13.field9261 != null && class660.field9416 - var13.field9222 <= 32) {
                           label703:
                           for(int var73 = var13.field9222; var73 < class660.field9416; ++var73) {
                              int var74 = class368.field5186[var73 & 31];

                              for(int var75 = 0; var75 < var13.field9261.length; ++var75) {
                                 if (var13.field9261[var75] == var74) {
                                    class589 var76 = new class589();
                                    var76.field8110 = var13;
                                    var76.field8116 = var13.field9218;
                                    class426.field5956.method3859(2, var76);
                                    break label703;
                                 }
                              }
                           }
                        } else {
                           class589 var77 = new class589();
                           var77.field8110 = var13;
                           var77.field8116 = var13.field9218;
                           class426.field5956.method3859(2, var77);
                        }

                        var13.field9222 = class660.field9416;
                     }

                     if (var13.field9214 != null && class134.field1747 > var13.field9341) {
                        if (var13.field9351 != null && class134.field1747 - var13.field9341 <= 32) {
                           label679:
                           for(int var78 = var13.field9341; var78 < class134.field1747; ++var78) {
                              int var79 = class338.field4833[var78 & 31];

                              for(int var80 = 0; var80 < var13.field9351.length; ++var80) {
                                 if (var13.field9351[var80] == var79) {
                                    class589 var81 = new class589();
                                    var81.field8110 = var13;
                                    var81.field8116 = var13.field9214;
                                    class426.field5956.method3859(2, var81);
                                    break label679;
                                 }
                              }
                           }
                        } else {
                           class589 var82 = new class589();
                           var82.field8110 = var13;
                           var82.field8116 = var13.field9214;
                           class426.field5956.method3859(2, var82);
                        }

                        var13.field9341 = class134.field1747;
                     }

                     if (var13.field9338 != null && class179.field2232 > var13.field9239) {
                        if (var13.field9260 != null && class179.field2232 - var13.field9239 <= 32) {
                           label655:
                           for(int var83 = var13.field9239; var83 < class179.field2232; ++var83) {
                              int var84 = class791.field11576[var83 & 31];

                              for(int var85 = 0; var85 < var13.field9260.length; ++var85) {
                                 if (var13.field9260[var85] == var84) {
                                    class589 var86 = new class589();
                                    var86.field8110 = var13;
                                    var86.field8116 = var13.field9338;
                                    class426.field5956.method3859(2, var86);
                                    break label655;
                                 }
                              }
                           }
                        } else {
                           class589 var87 = new class589();
                           var87.field8110 = var13;
                           var87.field8116 = var13.field9338;
                           class426.field5956.method3859(2, var87);
                        }

                        var13.field9239 = class179.field2232;
                     }

                     if (var13.field9331 != null && class456.field6254 > var13.field9205) {
                        if (var13.field9364 != null && class456.field6254 - var13.field9205 <= 32) {
                           label631:
                           for(int var88 = var13.field9205; var88 < class456.field6254; ++var88) {
                              int var89 = class68.field789[var88 & 31];

                              for(int var90 = 0; var90 < var13.field9364.length; ++var90) {
                                 if (var13.field9364[var90] == var89) {
                                    class589 var91 = new class589();
                                    var91.field8110 = var13;
                                    var91.field8116 = var13.field9331;
                                    class426.field5956.method3859(2, var91);
                                    break label631;
                                 }
                              }
                           }
                        } else {
                           class589 var92 = new class589();
                           var92.field8110 = var13;
                           var92.field8116 = var13.field9331;
                           class426.field5956.method3859(2, var92);
                        }

                        var13.field9205 = class456.field6254;
                     }

                     if (class304.field4041 > var13.field9263 && var13.field9217 != null) {
                        class589 var93 = new class589();
                        var93.field8110 = var13;
                        var93.field8116 = var13.field9217;
                        class426.field5956.method3859(2, var93);
                     }

                     if (class667.field9490 > var13.field9263 && var13.field9356 != null) {
                        class589 var94 = new class589();
                        var94.field8110 = var13;
                        var94.field8116 = var13.field9356;
                        class426.field5956.method3859(2, var94);
                     }

                     if (class625.field8736 > var13.field9263 && var13.field9262 != null) {
                        class589 var95 = new class589();
                        var95.field8110 = var13;
                        var95.field8116 = var13.field9262;
                        class426.field5956.method3859(2, var95);
                     }

                     if (class295.field3870 > var13.field9263 && var13.field9266 != null) {
                        class589 var96 = new class589();
                        var96.field8110 = var13;
                        var96.field8116 = var13.field9266;
                        class426.field5956.method3859(2, var96);
                     }

                     if (class29.field357 > var13.field9263 && var13.field9242 != null) {
                        class589 var97 = new class589();
                        var97.field8110 = var13;
                        var97.field8116 = var13.field9242;
                        class426.field5956.method3859(2, var97);
                     }

                     if (class727.field10657 > var13.field9263 && var13.field9296 != null) {
                        class589 var98 = new class589();
                        var98.field8110 = var13;
                        var98.field8116 = var13.field9296;
                        class426.field5956.method3859(2, var98);
                     }

                     if (class131.field1654 > var13.field9263 && var13.field9236 != null) {
                        class589 var99 = new class589();
                        var99.field8110 = var13;
                        var99.field8116 = var13.field9236;
                        class426.field5956.method3859(2, var99);
                     }

                     var13.field9263 = class350.field5018;
                     if (var13.field9320 != null) {
                        for(int var100 = 0; var100 < class718.field10522; ++var100) {
                           class589 var101 = new class589();
                           var101.field8110 = var13;
                           var101.field8109 = class155.field2001[var100].method2468((byte)-101);
                           var101.field8126 = class155.field2001[var100].method2467(91);
                           var101.field8116 = var13.field9320;
                           class426.field5956.method3859(2, var101);
                        }
                     }

                     if (class21.field268 && var13.field9253 != null) {
                        class589 var102 = new class589();
                        var102.field8110 = var13;
                        var102.field8116 = var13.field9253;
                        class426.field5956.method3859(2, var102);
                     }
                  }

                  if (var13.field9372 == 5 && var13.field9213 != -1) {
                     var13.method4771(58, class371.field5238, class212.field2634).method1815(var13.field9360, class338.field4832, (byte)-80);
                  }

                  class795.method5728(0, var13);
                  if (var13.field9372 == 0) {
                     method2397(arg0, var13.field9220, var16, var17, var18, var19, var14 - var13.field9271, var15 - var13.field9255, arg8, arg9, arg10, arg11);
                     if (var13.field9322 != null) {
                        method2397(var13.field9322, var13.field9220, var16, var17, var18, var19, var14 - var13.field9271, var15 - var13.field9255, arg8, arg9, arg10, arg11);
                     }

                     class588 var103 = (class588)class202.field2476.method1839(-111, (long)var13.field9220);
                     if (var103 != null) {
                        if (class551.field7585 == class381.field5334 && var103.field8106 == 0 && !class666.field9473 && var25 && !class92.field1233) {
                           class193.method1456(11311);
                        }

                        class224.method1719((byte)37, arg8, var103.field8107, var16, arg9, arg10, var19, var18, var14, var15, arg11, var17);
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
      descriptor = "()V"
   )
   public static final void method2398() {
      class597.field8310 = 0;

      for(int var0 = 0; var0 < class741.field10800; ++var0) {
         class680 var1 = ((class243)class335.field4808.method1839(-112, (long)class285.field3785[var0])).field3043;
         if (var1.field7821 && var1.method3067(true) != -1) {
            int var2 = (var1.method3060((byte)38) - 1) * 256 + 252;
            int var3 = var1.field999 - var2 >> 9;
            int var4 = var1.field1003 - var2 >> 9;
            class569 var5 = class263.method2021(var4, 5353, var3, var1.field1001);
            if (var5 != null) {
               int var6 = var5.field7843;
               if (var5 instanceof class680) {
                  var6 += 2048;
               }

               if (var5.field7813 == 0 && var5.method3067(true) != -1) {
                  class607.field8499[class597.field8310] = var6;
                  class80.field1007[class597.field8310] = var6;
                  ++class597.field8310;
                  ++var5.field7813;
               }

               class607.field8499[class597.field8310] = var6;
               class80.field1007[class597.field8310] = var1.field7843 + 2048;
               ++class597.field8310;
               ++var5.field7813;
            }
         }
      }

      class605.method4416((byte)84, class80.field1007, 0, class607.field8499, class597.field8310 - 1);
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method2399(byte arg0) {
      boolean var2 = field4273;

      try {
         ++field4267;
         if (~class445.field6162 != -17) {
            ++class369.field5205;
            if (~(class369.field5205 % 1000) == -2) {
               GregorianCalendar var3 = new GregorianCalendar();
               class606.field8494 = 600 * var3.get(11) + var3.get(12) * 10 + var3.get(13) / 6;
               class771.field11111.setSeed((long)class606.field8494);
            }

            class605.field8474.method1703((byte)78);
            class605.field8473.method1703((byte)95);
            this.method2402(260);
            if (class398.field5595 != null) {
               class398.field5595.method2013(true);
            }

            class352.method2767((byte)-121);
            class559.method4022((byte)62);
            class42.field495.method3873(-34);
            class242.field3026.method1579(85);
            if (class338.field4832 != null) {
               class338.field4832.method553((int)class792.method5708(-25005));
            }

            int var10000;
            label198: {
               class497.method3598(6138);
               class718.field10522 = 0;
               class632.field8909 = 0;
               class326 var4 = class42.field495.method3874((byte)80);
               if (var2) {
                  var10000 = var4.method2469((byte)66);
               } else if (var4 == null) {
                  var10000 = 0;
                  if (!var2) {
                     break label198;
                  }
               } else {
                  var10000 = var4.method2469((byte)66);
               }

               while(true) {
                  label300: {
                     int var5 = var10000;
                     if (~var5 == -3 || var5 == 3) {
                        char var6 = var4.method2467(94);
                        if (!class253.method1919(21583) || ~var6 != -97 && ~var6 != -168 && ~var6 != -179) {
                           if (class718.field10522 >= 128) {
                              break label300;
                           }

                           class155.field2001[class718.field10522] = var4;
                           ++class718.field10522;
                           if (!var2) {
                              break label300;
                           }
                        }

                        if (class318.method2385(46)) {
                           class427.method3209((byte)-64);
                           if (!var2) {
                              break label300;
                           }
                        }

                        class715.method5205((byte)115);
                        if (!var2) {
                           break label300;
                        }
                     }

                     if (~var5 == -1 && ~class632.field8909 > -76) {
                        class215.field2665[class632.field8909] = var4;
                        ++class632.field8909;
                     }
                  }

                  var4 = class42.field495.method3874((byte)80);
                  if (var4 == null) {
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = var4.method2469((byte)66);
                  }
               }
            }

            class51.field567 = var10000;
            class554 var7 = class242.field3026.method1573((byte)-109);
            int var8;
            if (var2) {
               var8 = var7.method3706(-7560);
               if (~var8 != 0) {
                  if (~var8 == -7) {
                     class51.field567 += var7.method3704(3);
                     if (var2) {
                        if (class705.method5132(var8, 19829)) {
                           class746.field10840.method3859(2, var7);
                           if (class746.field10840.method3857(116) > 10) {
                              class746.field10840.method3869((byte)115);
                              if (var2) {
                                 class118.field1439.method3859(2, var7);
                              }
                           }
                        }

                        var7 = class242.field3026.method1573((byte)-109);
                     } else {
                        var7 = class242.field3026.method1573((byte)-109);
                     }
                  } else {
                     if (class705.method5132(var8, 19829)) {
                        class746.field10840.method3859(2, var7);
                        if (class746.field10840.method3857(116) > 10) {
                           class746.field10840.method3869((byte)115);
                           if (var2) {
                              class118.field1439.method3859(2, var7);
                           }
                        }
                     }

                     var7 = class242.field3026.method1573((byte)-109);
                  }
               } else {
                  class118.field1439.method3859(2, var7);
                  var7 = class242.field3026.method1573((byte)-109);
               }
            }

            while(true) {
               if (var7 == null) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 < 64) {
                        method2398();
                     }

                     if (class318.method2385(59)) {
                        class731.method5316((byte)-100);
                     }

                     label153: {
                        if (class190.method1431(class445.field6162, 1)) {
                           class522.method3778(-127);
                           class132.method1107((byte)-8);
                           if (!var2) {
                              break label153;
                           }
                        }

                        if (class434.method3239(7469, class445.field6162)) {
                           class331.method2629(true);
                        }
                     }

                     label296: {
                        if (class390.method2967(true, class445.field6162) && !class434.method3239(7469, class445.field6162)) {
                           this.method2404(1);
                           class358.method2803((byte)-86);
                           class183.method1399(false);
                           if (!var2) {
                              break label296;
                           }
                        }

                        if (class265.method2032(102, class445.field6162) && !class434.method3239(7469, class445.field6162)) {
                           this.method2404(1);
                           class183.method1399(false);
                           if (!var2) {
                              break label296;
                           }
                        }

                        if (class445.field6162 != 13) {
                           if (class422.method3188(-6196, class445.field6162) && !class434.method3239(7469, class445.field6162)) {
                              class543.method3919((byte)123);
                              if (!var2) {
                                 break label296;
                              }
                           }

                           if (class445.field6162 != 14 && ~class445.field6162 != -16) {
                              break label296;
                           }

                           class183.method1399(false);
                           if (~class654.field9151 == 2 || class654.field9151 == 2 || class654.field9151 == 15) {
                              break label296;
                           }

                           if (~class445.field6162 != -16) {
                              class316.method2373(false, -30);
                              if (!var2) {
                                 break label296;
                              }
                           }

                           class322.field4296 = class654.field9151;
                           class131.field1650 = class521.field7129;
                           class543.method3926(class12.field139.field6242, -29330, class12.field139.field6244);
                           class605.field8474.field2779 = null;
                           class397.method3019(-82, 14);
                           if (!var2) {
                              break label296;
                           }
                        }

                        class183.method1399(false);
                     }

                     class401.method3031(class338.field4832, (byte)-123);
                     class746.field10840.method3869((byte)49);
                     return;
                  }
               } else {
                  var10000 = var7.method3706(-7560);
               }

               var8 = var10000;
               if (~var8 != 0) {
                  if (~var8 == -7) {
                     class51.field567 += var7.method3704(3);
                     if (var2) {
                        if (class705.method5132(var8, 19829)) {
                           class746.field10840.method3859(2, var7);
                           if (class746.field10840.method3857(116) > 10) {
                              class746.field10840.method3869((byte)115);
                              if (var2) {
                                 class118.field1439.method3859(2, var7);
                              }
                           }
                        }

                        var7 = class242.field3026.method1573((byte)-109);
                     } else {
                        var7 = class242.field3026.method1573((byte)-109);
                     }
                  } else {
                     if (class705.method5132(var8, 19829)) {
                        class746.field10840.method3859(2, var7);
                        if (class746.field10840.method3857(116) > 10) {
                           class746.field10840.method3869((byte)115);
                           if (var2) {
                              class118.field1439.method3859(2, var7);
                           }
                        }
                     }

                     var7 = class242.field3026.method1573((byte)-109);
                  }
               } else {
                  class118.field1439.method3859(2, var7);
                  var7 = class242.field3026.method1573((byte)-109);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4274[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V"
   )
   public static final void method2400() {
      int var0 = class261.field3357;
      int[] var1 = class294.field3862;
      int var2 = class674.field9907.field8423.method3072((byte)-92);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class404 var14 = class136.field1773[var1[var4]];
         if (!var14.method3062((byte)60)) {
            var14.field7773 = -1;
         } else if (var14.field5677) {
            var14.field7773 = -1;
         } else {
            var14.method398(-118);
            if (var14.field547 >= 0 && var14.field540 >= 0 && var14.field548 < class507.field7030 && var14.field541 < class215.field2667) {
               var14.field5696 = var14.field7814 ? var3 : false;
               if (class278.field3709 == var14) {
                  var14.field7773 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field7821) {
                     ++var15;
                  }

                  if (var14.field7786 > class369.field5205) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method3060((byte)38) << 2);
                  if (!var14.field5689 && !var14.field5691) {
                     if (class2.field6 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field7773 = var16 + 1;
               }
            } else {
               var14.field7773 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class741.field10800; ++var5) {
         class680 var11 = ((class243)class335.field4808.method1839(55, (long)class285.field3785[var5])).field3043;
         if (var11.method4972((byte)72) && var11.field9989.method2984(-1, class259.field3320)) {
            var11.method398(-106);
            if (var11.field547 >= 0 && var11.field540 >= 0 && var11.field548 < class507.field7030 && var11.field541 < class215.field2667) {
               int var12 = 0;
               if (!var11.field7821) {
                  ++var12;
               }

               if (var11.field7786 > class369.field5205) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method3060((byte)38) << 2);
               if (class2.field6 == 0) {
                  if (var11.field9989.field5485) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class2.field6 == 1) {
                  if (var11.field9989.field5485) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field9989.field5482) {
                  var13 += 1024;
               } else if (!var11.field9989.field5500) {
                  var13 += 256;
               }

               var11.field7773 = var13 + 1;
            } else {
               var11.field7773 = -1;
            }
         } else {
            var11.field7773 = -1;
         }
      }

      for(int var6 = 0; var6 < class708.field10278.length; ++var6) {
         class565 var7 = class708.field10278[var6];
         if (var7 != null) {
            if (var7.field7709 == 1) {
               class243 var8 = (class243)class335.field4808.method1839(18, (long)var7.field7711);
               if (var8 != null) {
                  class680 var9 = var8.field3043;
                  if (var9.field7773 >= 0) {
                     var9.field7773 += 2048;
                  }
               }
            } else if (var7.field7709 == 10) {
               class404 var10 = class136.field1773[var7.field7711];
               if (var10 != null && class278.field3709 != var10 && var10.field7773 >= 0) {
                  var10.field7773 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Leb;)Z"
   )
   public static final boolean method2401(class657 arg0) {
      if (class92.field1233) {
         if (method2396(arg0).field5875 != 0) {
            return false;
         }

         if (arg0.field9372 == 0) {
            return false;
         }
      }

      return arg0.field9202;
   }

   @OriginalMember(
      owner = "client!client",
      name = "n",
      descriptor = "(I)V"
   )
   private final void method2402(int arg0) {
      try {
         if (arg0 == 260) {
            ++field4265;
            boolean var2 = class73.field896.method1092(0);
            if (!var2) {
               this.method2406(arg0 ^ -30800);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4274[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V"
   )
   public static final void method2403() {
      int var0 = class261.field3357;
      int[] var1 = class294.field3862;
      int var2 = class494.field6788 ? var0 : class741.field10800 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class569 var4;
         if (var3 < var0) {
            var4 = class136.field1773[var1[var3]];
         } else {
            var4 = ((class243)class335.field4808.method1839(38, (long)class285.field3785[var3 - var0])).field3043;
         }

         if (var4.field7773 >= 0) {
            int var5 = var4.method3060((byte)38);
            if ((var5 & 1) == 0) {
               if ((var4.field999 & 511) == 0 && (var4.field1003 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field999 & 511) == 256 && (var4.field1003 & 511) == 256) {
               continue;
            }

            var4.field998 = class687.method5016(var4.field999, var4.field1001, var4.field1003, 2);
            class239.method1792(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method810(boolean arg0) {
      try {
         ++field4266;
         if (class126.field1586 != null && class204.field2515 == null && !class61.field671.field3265) {
            try {
               Class var2 = class126.field1586.getClass();
               Field var3 = var2.getDeclaredField(field4274[43]);
               class204.field2515 = (Canvas)var3.get(class126.field1586);
               var3.set(class126.field1586, (Object)null);
               if (class204.field2515 != null) {
                  return;
               }
            } catch (Exception var5) {
            }
         }

         super.method810(arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4274[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method805(int arg0) {
      try {
         ++field4270;
         if (arg0 == 1428854857) {
            if (class674.field9907.field8451.method2770((byte)-75) == 2) {
               try {
                  this.method2399((byte)94);
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class106.method940(var6.getMessage() + field4274[40] + this.method804(arg0 + -1428867138), var6, (byte)-33);
                  class595.field8291 = true;
                  class594.method4335(false, Integer.MAX_VALUE, 0);
               }
            } else {
               this.method2399((byte)122);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4274[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method2404(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V"
   )
   public static final void method2405() {
      for(int var0 = 0; var0 < class507.field7030; ++var0) {
         int[] var1 = class371.field5227[var0];

         for(int var2 = 0; var2 < class215.field2667; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method2406(int arg0) {
      boolean var2 = field4273;

      try {
         ++field4257;
         if (~class73.field896.field1677 < ~class312.field4136) {
            class698.field10191.method3348((byte)-119);
            class595.field8298 = (class73.field896.field1677 * 50 + -50) * 5;
            if (~class595.field8298 < -3001) {
               class595.field8298 = 3000;
            }

            if (class73.field896.field1677 >= 2 && class73.field896.field1676 == 6) {
               this.method802(field4274[6], (byte)118);
               class445.field6162 = 16;
               return;
            }

            if (~class73.field896.field1677 <= -5 && class73.field896.field1676 == -1) {
               this.method802(field4274[1], (byte)54);
               class445.field6162 = 16;
               return;
            }

            if (class73.field896.field1677 >= 4 && class190.method1431(class445.field6162, 1)) {
               label117: {
                  if (class73.field896.field1676 != 7 && class73.field896.field1676 != 9) {
                     if (~class73.field896.field1676 < -1) {
                        if (class767.field11070 != null) {
                           this.method802(field4274[0] + class767.field11070.trim(), (byte)52);
                           if (!var2) {
                              break label117;
                           }
                        }

                        this.method802(field4274[4], (byte)68);
                        if (!var2) {
                           break label117;
                        }
                     }

                     this.method802(field4274[3], (byte)83);
                     if (!var2) {
                        break label117;
                     }
                  }

                  this.method802(field4274[2], (byte)39);
               }

               class445.field6162 = 16;
               return;
            }
         }

         class312.field4136 = class73.field896.field1677;
         if (~class595.field8298 < -1) {
            --class595.field8298;
         } else {
            try {
               if (class257.field3287 == 0) {
                  class341.field4877 = class698.field10191.method3351(class61.field671, 111);
                  ++class257.field3287;
               }

               if (class257.field3287 == 1) {
                  if (~class341.field4877.field3826 == -3) {
                     if (class341.field4877.field3830 != null) {
                        class767.field11070 = (String)class341.field4877.field3830;
                     }

                     this.method2393(1000, (byte)-122);
                     return;
                  }

                  if (class341.field4877.field3826 == 1) {
                     ++class257.field3287;
                  }
               }

               if (~class257.field3287 == -3) {
                  class294.field3865 = new class677((Socket)class341.field4877.field3830, class61.field671, 25000);
                  class594 var3 = new class594(5);
                  var3.method4318(class553.field7610.field3850, 0);
                  var3.method4337(654, arg0 ^ -1184038076);
                  class294.field3865.method4959(5, var3.field8227, 0, 0);
                  ++class257.field3287;
                  class241.field2998 = class792.method5708(-25005);
               }

               if (~class257.field3287 == -4) {
                  label186: {
                     if (class190.method1431(class445.field6162, arg0 ^ -31051) || ~class294.field3865.method4963(true) < -1) {
                        int var4 = class294.field3865.method4958(arg0 ^ -7164);
                        if (var4 != 0) {
                           this.method2393(var4, (byte)-116);
                           return;
                        }

                        ++class257.field3287;
                        if (!var2) {
                           break label186;
                        }
                     }

                     if (class792.method5708(-25005) - class241.field2998 > 30000L) {
                        this.method2393(1001, (byte)-88);
                        return;
                     }
                  }
               }

               if (arg0 != -31052) {
                  this.method798((byte)2);
               }

               if (~class257.field3287 == -5) {
                  boolean var5 = class190.method1431(class445.field6162, 1) || class390.method2967(true, class445.field6162) || class265.method2032(arg0 ^ -31061, class445.field6162);
                  class8[] var6 = class8.method72(false);
                  class594 var7 = new class594(var6.length * 4);
                  class294.field3865.method4961(true, var7.field8227.length, var7.field8227, 0);
                  int var8 = 0;
                  if (var2) {
                     var6[var8].method69((byte)-14, var7.method4302(true));
                     ++var8;
                  }

                  while(true) {
                     while(~var6.length < ~var8) {
                        var6[var8].method69((byte)-14, var7.method4302(true));
                        ++var8;
                     }

                     if (!var2) {
                        class73.field896.method1096(!var5, class294.field3865, -105);
                        class257.field3287 = 0;
                        class294.field3865 = null;
                        class341.field4877 = null;
                        return;
                     }

                     ++var8;
                  }
               }
            } catch (IOException var10) {
               this.method2393(1002, (byte)-122);
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4274[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "g",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method804(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)V"
   )
   public static final void method2407(int arg0) {
      int var1 = class261.field3357;
      int[] var2 = class294.field3862;
      int var3 = class494.field6788 ? var1 : class741.field10800 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class569 var5;
         if (var4 < var1) {
            var5 = class136.field1773[var2[var4]];
         } else {
            var5 = ((class243)class335.field4808.method1839(123, (long)class285.field3785[var4 - var1])).field3043;
         }

         if (var5.field1001 == arg0) {
            var5.field7813 = 0;
            if (var5.field7773 < 0) {
               var5.field7821 = false;
            } else {
               int var6 = var5.method3060((byte)38);
               if ((var6 & 1) == 0) {
                  if ((var5.field999 & 511) != 0 || (var5.field1003 & 511) != 0) {
                     var5.field7821 = false;
                     continue;
                  }
               } else if ((var5.field999 & 511) != 256 || (var5.field1003 & 511) != 256) {
                  var5.field7821 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field999 >> 9;
                  int var8 = var5.field1003 >> 9;
                  if (class371.field5227[var7][var8] != var5.field7773) {
                     var5.field7821 = true;
                     continue;
                  }

                  if (class752.field10919[var7][var8] > 1) {
                     var10002 = class752.field10919[var7][var8]--;
                     var5.field7821 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field999 - var9 >> 9;
                  int var11 = var5.field1003 - var9 >> 9;
                  int var12 = var5.field999 + var9 >> 9;
                  int var13 = var5.field1003 + var9 >> 9;
                  if (!class589.method4228(var10, 1, var11, var5.field7773, var13, var12)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class371.field5227[var14][var15] == var5.field7773) {
                              var10002 = class752.field10919[var14][var15]--;
                           }
                        }
                     }

                     var5.field7821 = true;
                     continue;
                  }
               }

               var5.field7821 = false;
               var5.field998 = class687.method5016(var5.field999, var5.field1001, var5.field1003, 2);
               class239.method1792(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(III)Ljava/lang/String;"
   )
   public static final String method2408(int arg0, int arg1, int arg2) {
      try {
         ++field4259;
         int var3 = -arg0 + arg1;
         if (~var3 > 8) {
            return field4274[75];
         } else if (~var3 > 5) {
            return field4274[70];
         } else if (var3 < -3) {
            return field4274[74];
         } else if (var3 < 0) {
            return field4274[72];
         } else if (var3 > 9) {
            return field4274[69];
         } else {
            int var4 = -112 % ((-13 - arg2) / 37);
            if (var3 > 6) {
               return field4274[66];
            } else if (~var3 < -4) {
               return field4274[67];
            } else {
               return var3 > 0 ? field4274[73] : field4274[71];
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4274[68] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Leb;)Leb;"
   )
   public static final class657 method2409(class657 arg0) {
      int var1 = method2396(arg0).method3163(true);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class420.method3176(arg0.field9363, -112);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method2410(byte arg0) {
      try {
         field4269 = null;
         int var1 = -76 / ((arg0 - 24) / 48);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4274[45] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2411(String arg0) {
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
   private static char[] method2412(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2413(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
