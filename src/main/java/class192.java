import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class192 extends class70 {
   @OriginalMember(
      owner = "client!an",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2441 = new String[]{method1599(method1598("K<")), method1599(method1598("_?bo\u0010")), method1599(method1598("K=")), method1599(method1598("_?bh\u0010")), method1599(method1598("_?bb\u0010")), method1599(method1598("_?bc\u0010")), method1599(method1598("X!?H^X")), method1599(method1598("Y48PWL=(")), method1599(method1598("X!?\u0007\\[39@\u0018[?-ET[5")), method1599(method1598("h4>\u001d\u0018")), method1599(method1598("}$>U]P%lSWQ='NL\u001e5#BKPv8\u0007KK!<HJJq!RTJ8<K]\u001e2#U]M")), method1599(method1598("L4?BLS8\"NU_!")), method1599(method1598("Z8>B[J=#@QP")), method1599(method1598("M9%AL]=%DS")), method1599(method1598("N4>J\u0018H0>DK\u001e\"-Q]Z")), method1599(method1598("z#%Q]Lq\u001aBJM8#I\u0002\u001e")), method1599(method1598("L!")), method1599(method1598("qy?\u000e\u0002\u001e")), method1599(method1598("[?-ET[q#ULV>lJWZ4lAQL\"8\u0007\u0010K\")\u0007\u001fQ#8OW\u001em\"\u0019\u001f\u0017")), method1599(method1598("j>+@T[5m")), method1599(method1598("t0:F\u0018J>#KSW%v\u0007")), method1599(method1598("X!?HV")), method1599(method1598("_?b`\u0010")), method1599(method1598("{?8BJ[5lSS\u000e")), method1599(method1598("E\u007fb\tE")), method1599(method1598("X!?\u0007")), method1599(method1598("M&%S[V4(")), method1599(method1598("y\u001d\u0014\u0007LQ> LQJkl\u0007")), method1599(method1598("M&%S[V&#UTZ")), method1599(method1598("]=)FJJ44S")), method1599(method1598("|=#HU\u001e5%TY\\=)C")), method1599(method1598("Ic(BZK6")), method1599(method1598("O0\u0013HHa%)TL\u0003")), method1599(method1598("]\"<UWX8 BWK%<RL]")), method1599(method1598("H0>WZW%q")), method1599(method1598("N4>J\u0018H0>DK\u001e\"/UYS3 B\\")), method1599(method1598("l4.RQR5%I_\u001e<-W\u0018\u0016&%SP\u001e!>H^W=%I_\u0017")), method1599(method1598("I<~")), method1599(method1598("\u007f28NN[q?SJ[0!T\u0002\u001e")), method1599(method1598("P>\"W[Ml")), method1599(method1598("I<}")), method1599(method1598("_$8H\u0018I>>K\\\u001e\")K]]%)C")), method1599(method1598("S2")), method1599(method1598("s8\"NU_!lU]M48")), method1599(method1598("_$8HK[%9W")), method1599(method1598("M48EY")), method1599(method1598("x\u0001\u001f\u001d\u0018")), method1599(method1598("l>8FL[5lDWP?)DLW>\"\u0007U[%$H\\M")), method1599(method1598("x0%K]Zq8H\u0018[?8BJ\u001e%'\u0014")), method1599(method1598("x0%K]Zq8H\u0018[?-ET[q.KWQ<")), method1599(method1598("V4-W\u0018\u0013q\u001cUQP%lMYH0lJ]S>>^\u0018W?*HJS08NWP")), method1599(method1598("Q?")), method1599(method1598("V4-W\\K<<")), method1599(method1598("J&)BV")), method1599(method1598("{?8BJ[5lSS\u000b")), method1599(method1598("N#%ILX!?")), method1599(method1598("J:~")), method1599(method1598("{?8BJ[5lSS\r")), method1599(method1598("z##WH[5lDTW4\"S\u0018T\"y\u0007V[%lVM[$)")), method1599(method1598("]>!JYP5?")), method1599(method1598("}>9K\\\u001e?#S\u0018]#)FL[q")), method1599(method1598("]\"~C]\\$+")), method1599(method1598("Fk")), method1599(method1598("O0\u0013HHa%)TL")), method1599(method1598("r>#L\u0002\u001e")), method1599(method1598("l4\"C]Lq/HJ[\"lIWIkl")), method1599(method1598("I<}\u0007^_8 B\\")), method1599(method1598("L>8FL[2#IV[28J]J9#CK")), method1599(method1598("]\"~C]\\$+\u001d\u0018\u0016")), method1599(method1598("L4\"C]L!>H^W=)")), method1599(method1598("y\u001dlSWQ='NL\u0004ql\u0007")), method1599(method1598("|=#HU\u001e4\"FZR4(")), method1599(method1598("L4?BL]0/O]")), method1599(method1598("x0%K]Zq8H\u0018[?8BJ\u001e%'\u0015")), method1599(method1598("N##AQR4/WM")), method1599(method1598("Q#8OW]0!KW]:")), method1599(method1598("L4.RQR5<UWX8 B")), method1599(method1598("q2/KKW>\"\u0007VQ&lH^Xp")), method1599(method1598("h4\"CWLkl")), method1599(method1598("p>lTM]9lAQR4")), method1599(method1598("M>9I\\M%>BYS2#RVJ")), method1599(method1598("M9#P[Q=!FH")), method1599(method1598("M(?S]S<)J")), method1599(method1598("x0%K]Zq8H\u0018]9-I_[q#ULV>lJWZ4")), method1599(method1598("m\u0002\t\u0007LQ> LQJkl\u0007")), method1599(method1598("q2/KKW>\"\u0007VQ&lHV\u001f")), method1599(method1598("Q2/KMZ4")), method1599(method1598("S04EMW=(FJ[0q")), method1599(method1598("Q#8OWD>#J\u0018")), method1599(method1598("Q#8OWJ8 BKW+)\u0007")), method1599(method1598("I<\u007f\u0007^_8 B\\")), method1599(method1598("M48HMJ!9S\u0018")), method1599(method1598("L4\"C]L4>\u0007\u0015\u001e\u0001>NVJq+UYN9%DK\u001e#)I\\[#)U\u0018W?*HJS08NWP")), method1599(method1598("M4>Q]L;?\u0012\\L><")), method1599(method1598("V4-W")), method1599(method1598("Q#8OW\u001e2-J]L0lKW]:lNK\u001e")), method1599(method1598("M? H_W?l")), method1599(method1598("\u001e\u0019)N_V%v\u0007")), method1599(method1598("N4>AWL<-I[[%)TL")), method1599(method1598("X8 B\u0018_=>BYZ(lB@W\"8T\u0019")), method1599(method1598("J44TQD4")), method1599(method1598("m9%AL\u00132 N[Uq(NK_3 B\\\u0010")), method1599(method1598("}0/O]Mq>BK[%")), method1599(method1598("Q#8OW\u001e%%K]\u001e\"%]]\u0003")), method1599(method1598("m(?S]Sq!BUQ#5\u001d\u0018")), method1599(method1598("h4>TQQ?v\u0007")), method1599(method1598("Z8?WT_(*WK")), method1599(method1598("Y48O]W6$S")), method1599(method1598("]=#T]Q$8WMJ")), method1599(method1598("I<\u007f")), method1599(method1598("I<~\u0007KK2/B]Z4(")), method1599(method1598("Q#8OWD>#J\u0005")), method1599(method1598("j44S\u0018]>#U\\Mq/K]_#)C")), method1599(method1598("]=%BVJ5>HH")), method1599(method1598("I8\"")), method1599(method1598("r8.UYL8)T\u0018K? HYZ4(")), method1599(method1598("}0\"IWJq;UQJ4lSW\u001e")), method1599(method1598("m9%AL\u00132 N[Uq\tiy|\u001d\tc\u0019")), method1599(method1598("wy!\u000e\u0002\u001e")), method1599(method1598("]>!JYP5?\u0007\u0015\u001e\u0005$NK\u001e2#JU_?(")), method1599(method1598("p0!B\u0002\u001e")), method1599(method1598("{?8BJ[5lSS\u000f")), method1599(method1598("|#)FSW?+\u0007V[&lDWP?)DLW>\"T\u0018X>>\u0007\r\u001e\")DWP5?")), method1599(method1598("Y48DTW4\"SN_#<")), method1599(method1598("v4-W\u0002\u001e")), method1599(method1598("]> JYNq%T\u0018M9#PV")), method1599(method1598("I<\u007f\u0007KK2/B]Z4(")), method1599(method1598("n4>AWL<-I[[kl")), method1599(method1598("w?:FTW5lU]]%\u0013C]\\$+\u0007N_=9B")), method1599(method1598("Q7*")), method1599(method1598("\u007f#/O\u0002\u001e")), method1599(method1598("]> JYNq%T\u0018V8(C]P")), method1599(method1598("\u001e+v")), method1599(method1598("]=?")), method1599(method1598("s3")), method1599(method1598("]\"~C]\\$+\u001d")), method1599(method1598("s4!HJGq.B^Q#)\u0007[R4-IMNl")), method1599(method1598("J:y")), method1599(method1598("L$\"T[L8<S\u0018")), method1599(method1598("z4:N[[kl")), method1599(method1598("}>!WT[%)\t\u0018j>#KSW%lIWIkl")), method1599(method1598("{?8BJ[5lSS\f")), method1599(method1598("]>!WY]%")), method1599(method1598("x0%K]Zq8H\u0018L4-C\u0018X8 B")), method1599(method1598("x>>D]Zq8P][?%I_\u001e\u0014\u0002fzr\u0014\b\u0006")), method1599(method1598("V4 W")), method1599(method1598("M0:BN_#/T")), method1599(method1598("s\u0013")), method1599(method1598("\u0010=#@")), method1599(method1598("]=%W[Q<<HV[?8T")), method1599(method1598("x>>D]Zq8P][?%I_\u001e5%TY\\=)C\u0016")), method1599(method1598("zb\b\u0007LQ> LQJkl\u0007")), method1599(method1598("J:|")), method1599(method1598("K? HYZ?-SQH4?")), method1599(method1598("]\"<UWX8 BWK%<RLJ")), method1599(method1598("L4.RQR5")), method1599(method1598("I<~\u0007^_8 B\\")), method1599(method1598("]0/O]M!-D]")), method1599(method1598("N2")), method1599(method1598("P$ K")), method1599(method1598("Y48D_]>#U\\")), method1599(method1598("Y2")), method1599(method1598("]=?\u0007\u0015\u001e\u0012 BYLq/HVM> B")), method1599(method1598("m$/D]M\"*RTR(lDP_?+B\\\u001e>>SPQq!H\\[")), method1599(method1598("l4.RQR5%I_\u001e<-W")), method1599(method1598("L4/SgZ4.R_")), method1599(method1598("x0%K]Zq8H\u0018[?8BJ\u001e%'\u0017")), method1599(method1598("r8.UYL(lRVR>-CQP6lAYW=)C\u0019")), method1599(method1598("I<}\u0007KK2/B]Z4(")), method1599(method1598("z##WH[5lT]L')U\u0018T\"y\u0007V[%lVM[$)")), method1599(method1598("}k\u0010s]S!\u0010O]_!bCMS!")), method1599(method1598("D>#J\u0018")), method1599(method1598("J:\u007f")), method1599(method1598("P08NN[y\u0001wj")), method1599(method1598("s4!HJGq-AL[#lDT[0\"RH\u0003")), method1599(method1598("w?:FTW5lEMW=(FJ[0lQYR$)")), method1599(method1598("z##WH[5lDTW4\"S\u0018]>\"I]]%%HV")), method1599(method1598("v4%@PJkl")), method1599(method1598("_$8HOQ# C")), method1599(method1598("M2>FU\\=)QYL2?")), method1599(method1598("]=%BVJ;?\u0012\\L><")), method1599(method1598("J:}")), method1599(method1598("]=%W[Q<<HV[?8T\u0005")), method1599(method1598("x0%K]Zq8H\u0018[?8BJ\u001e%'\u0012")), method1599(method1598("x0%K]Zq8H\u0018[?8BJ\u001e%'\u0016")), method1599(method1598("S4!\u001a")), method1599(method1598("P>\"W[M")), method1599(method1598("x\u0001\u001f\u0007WX7")), method1599(method1598("X!?\u0007\\[39@\u0018Z8?FZR4(")), method1599(method1598("n>?\u001d\u0018")), method1599(method1598("m(\"SYFklHJJ9#\u0007\u0004Po")), method1599(method1598("wy?\u000e\u0002\u001e")), method1599(method1598("z>\"B")), method1599(method1598("x\u0001\u001f\u0007WP")), method1599(method1598("Ikl")), method1599(method1598("Y48DYS4>FHQ\"")), method1599(method1598("Y48DTW4\"SN_#<EQJ")), method1599(method1598("M9#PHL>*NTW?+\u001a")), method1599(method1598("[#>HJJ4?S")), method1599(method1598("\\=#HU")), method1599(method1598("]\"<UWX8 B[R4-U")), method1599(method1598("L4\"C]L4>")), method1599(method1598("H0>W\u0005")), method1599(method1598("Z8?WT_(*WK\u001e|lsWY6 B\u0018x\u0001\u001f\u0007YP5lHLV4>\u0007QP7#UU_%%HV")), method1599(method1598("L4/SgZ4.R_\u0003")), method1599(method1598("S\"")), method1599(method1598("\u0011%!W\u0017V4-W\u0016Z$!W")), method1599(method1598("[#>HJS4?TYY4")), method1599(method1598("P08NN[<)J]L##U")), method1599(method1598("Q#8OW\u001e")), method1599(method1598("\\#)FS]>\"")), method1599(method1598("Q\"")), method1599(method1598("V8(B[Q=!FH"))};
   @OriginalMember(
      owner = "client!an",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field2435 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!an",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field2431 = false;
   @OriginalMember(
      owner = "client!an",
      name = "M",
      descriptor = "[F"
   )
   public static float[] field2432 = new float[4];
   @OriginalMember(
      owner = "client!an",
      name = "N",
      descriptor = "Laka;"
   )
   public static class418 field2440 = new class418(117, 4);
   @OriginalMember(
      owner = "client!an",
      name = "O",
      descriptor = "I"
   )
   public static int field2433;
   @OriginalMember(
      owner = "client!an",
      name = "R",
      descriptor = "I"
   )
   public static int field2434;
   @OriginalMember(
      owner = "client!an",
      name = "J",
      descriptor = "I"
   )
   public static int field2436;
   @OriginalMember(
      owner = "client!an",
      name = "Q",
      descriptor = "I"
   )
   public static int field2437;
   @OriginalMember(
      owner = "client!an",
      name = "I",
      descriptor = "I"
   )
   public static int field2439;
   @OriginalMember(
      owner = "client!an",
      name = "L",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field2438;

   @OriginalMember(
      owner = "client!an",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method1594(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field2437;
         class431 var2 = class387.field5365.field8764;
         class493.field6885 = var2.method626(255);
         boolean var3 = var2.method622((byte)70) == 1;
         int var4 = var2.method642(false);
         if (arg0 <= -61) {
            int var5 = var2.method633((byte)-15);
            int var6 = var2.method661((byte)-74);
            class366.method2889(-7593);
            class73.method711(var5, (byte)-127);
            var2.method3333(false);
            int var7 = 0;
            int var8;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            byte var10000;
            int var16;
            int var17;
            int var10001;
            int var18;
            int var19;
            int var20;
            int var21;
            int var24;
            if (var1) {
               var8 = 0;
            } else if (~var7 <= -5) {
               var2.method3328(true);
               var8 = (-var2.field864 + class387.field5365.field8776) / 16;
               class288.field3982 = new int[var8][4];
               var11 = 0;
               if (!var1) {
                  label275: {
                     if (var1) {
                        var12 = 0;
                        if (var1) {
                           class288.field3982[var11][var12] = var2.method610(-80);
                           ++var12;
                        }
                     } else {
                        if (var11 >= var8) {
                           class640.field9391 = null;
                           class359.field5005 = new byte[var8][];
                           class123.field1614 = new byte[var8][];
                           class772.field11242 = new byte[var8][];
                           class141.field1781 = new int[var8];
                           class455.field6280 = new int[var8];
                           class383.field5321 = new int[var8];
                           class118.field1543 = new int[var8];
                           class640.field9381 = new byte[var8][];
                           class108.field1437 = null;
                           class708.field10405 = new int[var8];
                           var8 = 0;
                           var12 = 0;
                           if (!var1) {
                              break label275;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class288.field3982[var11][var12] = var2.method610(-80);
                           ++var12;
                        }
                     }

                     while(true) {
                        while(~var12 > -5) {
                           class288.field3982[var11][var12] = var2.method610(-80);
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (var11 >= var8) {
                              class640.field9391 = null;
                              class359.field5005 = new byte[var8][];
                              class123.field1614 = new byte[var8][];
                              class772.field11242 = new byte[var8][];
                              class141.field1781 = new int[var8];
                              class455.field6280 = new int[var8];
                              class383.field5321 = new int[var8];
                              class118.field1543 = new int[var8];
                              class640.field9381 = new byte[var8][];
                              class108.field1437 = null;
                              class708.field10405 = new int[var8];
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class288.field3982[var11][var12] = var2.method610(-80);
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     }
                  }

                  if (var1) {
                     var10000 = 0;
                  } else if (~var12 <= -5) {
                     var10000 = -121;
                     if (!var1) {
                        class637.method4698(-121, var4, var3, var6, 12);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 || var13 < class273.field3491 >> 3) {
                        do {
                           var14 = 0;
                           if (var1 || ~(class211.field2689 >> 3) < ~var14) {
                              label375:
                              do {
                                 var15 = class276.field3527[var12][var13][var14];
                                 if (var15 == -1) {
                                    ++var14;
                                 } else {
                                    var16 = var15 >> 14 & 1023;
                                    var17 = (var15 & 16381) >> 3;
                                    var18 = (var16 / 8 << 8) - -(var17 / 8);
                                    var19 = 0;
                                    if (var1) {
                                       var24 = var18;
                                       var10001 = class383.field5321[var19];
                                    } else if (~var19 <= ~var8) {
                                       var24 = var18;
                                       var10001 = -1;
                                       if (!var1) {
                                          if (var18 != -1) {
                                             class383.field5321[var8] = var18;
                                             var20 = var18 >> 8 & 255;
                                             var21 = 255 & var18;
                                             class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                             class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                             class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                             class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                             ++var8;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var24 = var18;
                                       var10001 = class383.field5321[var19];
                                    }

                                    do {
                                       while(true) {
                                          if (var24 == var10001) {
                                             var18 = -1;
                                             if (!var1) {
                                                var24 = var18;
                                                var10001 = -1;
                                                break;
                                             }

                                             ++var19;
                                          } else {
                                             ++var19;
                                          }

                                          if (~var19 <= ~var8) {
                                             var24 = var18;
                                             var10001 = -1;
                                             if (!var1) {
                                                if (var18 != -1) {
                                                   class383.field5321[var8] = var18;
                                                   var20 = var18 >> 8 & 255;
                                                   var21 = 255 & var18;
                                                   class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                                   class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                                   class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                                   class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                                   ++var8;
                                                }

                                                ++var14;
                                                continue label375;
                                             }
                                          } else {
                                             var24 = var18;
                                             var10001 = class383.field5321[var19];
                                          }
                                       }
                                    } while(var1);

                                    if (var18 != -1) {
                                       class383.field5321[var8] = var18;
                                       var20 = var18 >> 8 & 255;
                                       var21 = 255 & var18;
                                       class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                       class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                       class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                       class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                       ++var8;
                                    }

                                    ++var14;
                                 }
                              } while(~(class211.field2689 >> 3) < ~var14);
                           }

                           ++var13;
                        } while(var13 < class273.field3491 >> 3);
                     }

                     ++var12;
                     if (~var12 <= -5) {
                        var10000 = -121;
                        if (!var1) {
                           class637.method4698(-121, var4, var3, var6, 12);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }
            } else {
               var8 = 0;
            }

            while(true) {
               label510: {
                  int var9;
                  int var10;
                  if (var1) {
                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3335(4756, 1);
                        if (var10 == 1) {
                           class276.field3527[var7][var8][var9] = var2.method3335(4756, 26);
                           if (var1) {
                              class276.field3527[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class276.field3527[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  } else {
                     if (class273.field3491 >> 3 <= var8) {
                        break label510;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3335(4756, 1);
                        if (var10 == 1) {
                           class276.field3527[var7][var8][var9] = var2.method3335(4756, 26);
                           if (var1) {
                              class276.field3527[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class276.field3527[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  }

                  while(true) {
                     while(~(class211.field2689 >> 3) < ~var9) {
                        var10 = var2.method3335(4756, 1);
                        if (var10 == 1) {
                           class276.field3527[var7][var8][var9] = var2.method3335(4756, 26);
                           if (var1) {
                              class276.field3527[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class276.field3527[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }

                     ++var8;
                     if (class273.field3491 >> 3 <= var8) {
                        break;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3335(4756, 1);
                        if (var10 == 1) {
                           class276.field3527[var7][var8][var9] = var2.method3335(4756, 26);
                           if (var1) {
                              class276.field3527[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class276.field3527[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  }
               }

               ++var7;
               if (~var7 <= -5) {
                  var2.method3328(true);
                  var8 = (-var2.field864 + class387.field5365.field8776) / 16;
                  class288.field3982 = new int[var8][4];
                  var11 = 0;
                  if (!var1) {
                     label119: {
                        if (var1) {
                           var12 = 0;
                           if (var1) {
                              class288.field3982[var11][var12] = var2.method610(-80);
                              ++var12;
                           }
                        } else {
                           if (var11 >= var8) {
                              class640.field9391 = null;
                              class359.field5005 = new byte[var8][];
                              class123.field1614 = new byte[var8][];
                              class772.field11242 = new byte[var8][];
                              class141.field1781 = new int[var8];
                              class455.field6280 = new int[var8];
                              class383.field5321 = new int[var8];
                              class118.field1543 = new int[var8];
                              class640.field9381 = new byte[var8][];
                              class108.field1437 = null;
                              class708.field10405 = new int[var8];
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break label119;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class288.field3982[var11][var12] = var2.method610(-80);
                              ++var12;
                           }
                        }

                        while(true) {
                           while(~var12 > -5) {
                              class288.field3982[var11][var12] = var2.method610(-80);
                              ++var12;
                           }

                           if (!var1) {
                              ++var11;
                              if (var11 >= var8) {
                                 class640.field9391 = null;
                                 class359.field5005 = new byte[var8][];
                                 class123.field1614 = new byte[var8][];
                                 class772.field11242 = new byte[var8][];
                                 class141.field1781 = new int[var8];
                                 class455.field6280 = new int[var8];
                                 class383.field5321 = new int[var8];
                                 class118.field1543 = new int[var8];
                                 class640.field9381 = new byte[var8][];
                                 class108.field1437 = null;
                                 class708.field10405 = new int[var8];
                                 var8 = 0;
                                 var12 = 0;
                                 if (!var1) {
                                    break;
                                 }
                              } else {
                                 var12 = 0;
                              }

                              if (var1) {
                                 class288.field3982[var11][var12] = var2.method610(-80);
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        }
                     }

                     if (var1) {
                        var10000 = 0;
                     } else if (~var12 <= -5) {
                        var10000 = -121;
                        if (!var1) {
                           class637.method4698(-121, var4, var3, var6, 12);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        var13 = var10000;
                        if (var1 || var13 < class273.field3491 >> 3) {
                           do {
                              var14 = 0;
                              if (var1 || ~(class211.field2689 >> 3) < ~var14) {
                                 label201:
                                 do {
                                    var15 = class276.field3527[var12][var13][var14];
                                    if (var15 == -1) {
                                       ++var14;
                                    } else {
                                       var16 = var15 >> 14 & 1023;
                                       var17 = (var15 & 16381) >> 3;
                                       var18 = (var16 / 8 << 8) - -(var17 / 8);
                                       var19 = 0;
                                       if (var1) {
                                          var24 = var18;
                                          var10001 = class383.field5321[var19];
                                       } else if (~var19 <= ~var8) {
                                          var24 = var18;
                                          var10001 = -1;
                                          if (!var1) {
                                             if (var18 != -1) {
                                                class383.field5321[var8] = var18;
                                                var20 = var18 >> 8 & 255;
                                                var21 = 255 & var18;
                                                class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                                class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                                class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                                class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                                ++var8;
                                             }

                                             ++var14;
                                             continue;
                                          }
                                       } else {
                                          var24 = var18;
                                          var10001 = class383.field5321[var19];
                                       }

                                       do {
                                          while(true) {
                                             if (var24 == var10001) {
                                                var18 = -1;
                                                if (!var1) {
                                                   var24 = var18;
                                                   var10001 = -1;
                                                   break;
                                                }

                                                ++var19;
                                             } else {
                                                ++var19;
                                             }

                                             if (~var19 <= ~var8) {
                                                var24 = var18;
                                                var10001 = -1;
                                                if (!var1) {
                                                   if (var18 != -1) {
                                                      class383.field5321[var8] = var18;
                                                      var20 = var18 >> 8 & 255;
                                                      var21 = 255 & var18;
                                                      class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                                      class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                                      class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                                      class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                                      ++var8;
                                                   }

                                                   ++var14;
                                                   continue label201;
                                                }
                                             } else {
                                                var24 = var18;
                                                var10001 = class383.field5321[var19];
                                             }
                                          }
                                       } while(var1);

                                       if (var18 != -1) {
                                          class383.field5321[var8] = var18;
                                          var20 = var18 >> 8 & 255;
                                          var21 = 255 & var18;
                                          class141.field1781[var8] = class657.field9803.method2712("m" + var20 + "_" + var21, (byte)73);
                                          class708.field10405[var8] = class657.field9803.method2712("l" + var20 + "_" + var21, (byte)111);
                                          class455.field6280[var8] = class657.field9803.method2712(field2441[0] + var20 + "_" + var21, (byte)-124);
                                          class118.field1543[var8] = class657.field9803.method2712(field2441[2] + var20 + "_" + var21, (byte)104);
                                          ++var8;
                                       }

                                       ++var14;
                                    }
                                 } while(~(class211.field2689 >> 3) < ~var14);
                              }

                              ++var13;
                           } while(var13 < class273.field3491 >> 3);
                        }

                        ++var12;
                        if (~var12 <= -5) {
                           var10000 = -121;
                           if (!var1) {
                              class637.method4698(-121, var4, var3, var6, 12);
                              return;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }
               } else {
                  var8 = 0;
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field2441[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      try {
         ++field2433;
         int[] var3 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            class349.method2764(var3, 0, class262.field3328, class502.field6979[arg1]);
         }

         if (arg0 != -63) {
            this.method331((byte)63, -51);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2441[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1595(byte arg0) {
      try {
         if (arg0 != -15) {
            method1595((byte)57);
         }

         field2432 = null;
         field2438 = null;
         field2440 = null;
         field2435 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2441[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "<init>",
      descriptor = "()V"
   )
   public class192() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(ZZLjava/lang/String;Z)V"
   )
   public static final void method1596(boolean arg0, boolean arg1, String arg2, boolean arg3) {
      boolean var4 = client.field1481;

      try {
         ++field2439;

         try {
            label888: {
               if (!arg2.equalsIgnoreCase(field2441[59]) && !arg2.equalsIgnoreCase(field2441[145])) {
                  if (arg2.equalsIgnoreCase(field2441[133])) {
                     class737.field10796 = 0;
                     class307.field4306 = 0;
                     return;
                  }

                  if (!arg3) {
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field2441[106])) {
                     class731.field10652 = !class731.field10652;
                     if (!class731.field10652) {
                        class586.method4369(field2441[187], 72);
                        return;
                     }

                     class586.method4369(field2441[193], 89);
                     return;
                  }

                  if (!arg2.equals(field2441[201])) {
                     if (arg2.equals(field2441[94])) {
                        class586.method4369(field2441[124] + class578.field8565 + field2441[147], 104);
                        return;
                     }
                     break label888;
                  }

                  class776 var5 = class629.field9294.method425();
                  class586.method4369(field2441[78] + var5.field11314, 71);
                  class586.method4369(field2441[120] + var5.field11310, 92);
                  class586.method4369(field2441[105] + var5.field11307, 55);
                  class586.method4369(field2441[139] + var5.field11313, 76);
                  class586.method4369(field2441[15] + var5.field11308, 65);
                  return;
               }

               class586.method4369(field2441[119], 66);
               class586.method4369(field2441[162], 59);
               class586.method4369(field2441[203], 101);
               class586.method4369(field2441[92], 52);
               class586.method4369(field2441[50], 108);
               return;
            }
         } catch (Exception var55) {
            class586.method4369(class606.field8905.method4490(class782.field11389, -16777216), 101);
            return;
         }

         if (class781.field11380 != class583.field8611 || ~class580.field8586 <= -3) {
            if (arg2.equalsIgnoreCase(field2441[198])) {
               throw new RuntimeException();
            }

            if (arg2.equals(field2441[208])) {
               throw new OutOfMemoryError(field2441[173]);
            }

            try {
               label816: {
                  if (arg2.equalsIgnoreCase(field2441[55])) {
                     class586.method4369(field2441[46] + class618.field9102, 69);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field2441[86])) {
                     class613.field9018 = !class613.field9018;
                     if (!class613.field9018) {
                        class586.method4369(field2441[77], 114);
                        return;
                     }

                     class586.method4369(field2441[85], 82);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field2441[21])) {
                     class731.field10652 = true;
                     class586.method4369(field2441[8], 117);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field2441[6])) {
                     class731.field10652 = false;
                     class586.method4369(field2441[188], 63);
                     return;
                  }

                  if (arg2.equals(field2441[82])) {
                     try {
                        class586.method4369(field2441[104] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class12.field244.field461 + field2441[134], 38);
                        return;
                     } catch (Throwable var49) {
                        return;
                     }
                  }

                  if (arg2.equalsIgnoreCase(field2441[29])) {
                     class94.field1271.method4631((byte)-125);
                     class586.method4369(field2441[112], 119);
                     return;
                  }

                  if (!arg2.equalsIgnoreCase(field2441[161])) {
                     if (arg2.equalsIgnoreCase(field2441[142])) {
                        class507.method3825(-77);
                        int var9 = 0;
                        if (var4) {
                           System.gc();
                           ++var9;
                        }

                        while(true) {
                           while(~var9 > -11) {
                              System.gc();
                              ++var9;
                           }

                           Runtime var10 = Runtime.getRuntime();
                           int var11 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
                           class586.method4369(field2441[136] + var11 + "k", 72);
                           class640.method4708(61);
                           class507.method3825(-87);
                           int var12 = 0;
                           if (!var4) {
                              if (var4) {
                                 System.gc();
                                 ++var12;
                              }

                              while(true) {
                                 if (~var12 <= -11) {
                                    int var13 = (int)((var10.totalMemory() + -var10.freeMemory()) / 1024L);
                                    class586.method4369(field2441[174] + var13 + "k", 122);
                                    if (!var4) {
                                       return;
                                    }
                                 } else {
                                    System.gc();
                                 }

                                 ++var12;
                              }
                           }

                           ++var9;
                        }
                     }

                     if (arg2.equalsIgnoreCase(field2441[153])) {
                        class586.method4369(class584.method4361((byte)-55) ? field2441[115] : field2441[167], 53);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field2441[113])) {
                        class586.method4369(field2441[176], 111);
                        if (~class157.field2022 == -12) {
                           class70.method697(-123);
                           return;
                        }

                        if (class157.field2022 == 12) {
                           class387.field5365.field8768 = true;
                        }

                        return;
                     }

                     if (arg2.equalsIgnoreCase(field2441[67])) {
                        class44.field571.method5456(62);
                        class586.method4369(field2441[47], 76);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field2441[180])) {
                        class507.field7060.method2928((byte)85);
                        class586.method4369(field2441[58], 71);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field2441[93])) {
                        class507.field7060.method2920(2418);
                        class586.method4369(field2441[169], 73);
                        return;
                     }

                     if (!arg2.equalsIgnoreCase(field2441[210])) {
                        if (arg2.equalsIgnoreCase(field2441[155])) {
                           class568.method4266(4);
                           class598.method4450(true);
                           class586.method4369(field2441[164], 120);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[76])) {
                           class716.field10512 = class163.method1353(-124);
                           class359.field5013 = true;
                           class568.method4266(4);
                           class598.method4450(true);
                           class586.method4369(field2441[36], 109);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[40])) {
                           class575.method4313((byte)60, -1, -1, false, 1);
                           if (class137.method1146((byte)27) == 1) {
                              class586.method4369(field2441[168], 48);
                              return;
                           }

                           class586.method4369(field2441[66], 54);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[37])) {
                           class575.method4313((byte)60, -1, -1, false, 2);
                           if (~class137.method1146((byte)85) == -3) {
                              class586.method4369(field2441[110], 84);
                              return;
                           }

                           class586.method4369(field2441[156], 102);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[109])) {
                           class575.method4313((byte)60, 768, 1024, false, 3);
                           if (class137.method1146((byte)97) == 3) {
                              class586.method4369(field2441[126], 47);
                              return;
                           }

                           class586.method4369(field2441[90], 84);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[152])) {
                           class214.method1749(0, false, 52);
                           if (~class757.field11093.field11012.method27(-18033) == -1) {
                              class586.method4369(field2441[23], 85);
                              class757.field11093.method5438(true, class757.field11093.field10997, 0);
                              class654.method4804((byte)53);
                              class228.field2860 = false;
                              return;
                           }

                           class586.method4369(field2441[166], 114);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[181])) {
                           class214.method1749(1, false, 62);
                           if (~class757.field11093.field11012.method27(-18033) == -2) {
                              class586.method4369(field2441[121], 114);
                              class757.field11093.method5438(arg3, class757.field11093.field10997, 1);
                              class654.method4804((byte)58);
                              class228.field2860 = false;
                              return;
                           }

                           class586.method4369(field2441[184], 118);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[56])) {
                           class214.method1749(2, false, 49);
                           if (~class757.field11093.field11012.method27(-18033) == -3) {
                              class586.method4369(field2441[141], 47);
                              class757.field11093.method5438(true, class757.field11093.field10997, 2);
                              class654.method4804((byte)53);
                              class228.field2860 = false;
                              return;
                           }

                           class586.method4369(field2441[73], 102);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[172])) {
                           class214.method1749(3, false, 55);
                           if (class757.field11093.field11012.method27(-18033) == 3) {
                              class586.method4369(field2441[57], 38);
                              class757.field11093.method5438(arg3, class757.field11093.field10997, 3);
                              class654.method4804((byte)50);
                              class228.field2860 = false;
                              return;
                           }

                           class586.method4369(field2441[48], 54);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[137])) {
                           class214.method1749(5, false, 54);
                           if (~class757.field11093.field11012.method27(-18033) != -6) {
                              class586.method4369(field2441[183], 72);
                              return;
                           }

                           class586.method4369(field2441[54], 38);
                           class757.field11093.method5438(true, class757.field11093.field10997, 5);
                           class654.method4804((byte)63);
                           class228.field2860 = false;
                           return;
                        }

                        if (arg2.startsWith(field2441[45])) {
                           if (arg2.length() < 6) {
                              class586.method4369(field2441[175], 47);
                              return;
                           }

                           int var17 = class338.method2669(arg2.substring(6), (byte)-126);
                           if (~var17 <= -1 && ~var17 >= ~class570.method4281(125, class578.field8565)) {
                              class757.field11093.method5438(true, class757.field11093.field11009, var17);
                              class654.method4804((byte)-110);
                              class228.field2860 = false;
                              class586.method4369(field2441[87] + class757.field11093.field11009.method3497(-18033), 127);
                              return;
                           }

                           class586.method4369(field2441[175], 127);
                           return;
                        }

                        if (arg2.startsWith(field2441[165])) {
                           if (~arg2.length() > -11) {
                              class586.method4369(field2441[128], 63);
                              return;
                           }

                           class420.field5741 = class338.method2669(arg2.substring(10).trim(), (byte)-126);
                           class586.method4369(field2441[204] + class420.field5741, 63);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[63])) {
                           class497.field6955 = true;
                           class586.method4369(field2441[32] + class497.field6955, 60);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[149])) {
                           class554.field8140 = !class554.field8140;
                           class586.method4369(field2441[182] + class554.field8140, 122);
                           return;
                        }

                        if (arg2.startsWith(field2441[199])) {
                           boolean var18 = class629.field9294.method399();
                           if (!class210.method1727(!var18, arg3)) {
                              class586.method4369(field2441[49], 77);
                              return;
                           }

                           if (var18) {
                              class586.method4369(field2441[30], 108);
                              return;
                           }

                           class586.method4369(field2441[71], 72);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[53])) {
                           if (!class350.field4799) {
                              class350.field4799 = true;
                              class586.method4369(field2441[144], 76);
                              return;
                           }

                           class350.field4799 = false;
                           class586.method4369(field2441[150], 88);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[13])) {
                           if (!class327.field4524) {
                              class586.method4369(field2441[117], 101);
                              class327.field4524 = true;
                              return;
                           }

                           class586.method4369(field2441[101], 69);
                           class327.field4524 = false;
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[160])) {
                           class586.method4369(field2441[62] + (class204.field2593.field10467 >> 9) + field2441[132] + (class204.field2593.field10468 >> 9), 66);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[107])) {
                           class586.method4369(field2441[177] + class659.field9815[class204.field2593.field10457].method3284(-1, class204.field2593.field10467 >> 9, class204.field2593.field10468 >> 9), 84);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[11])) {
                           class268.field3430.method2683((byte)-112);
                           class268.field3430.method2701((byte)109);
                           class327.field4526.method1605(127);
                           class237.field3002.method4934(-25014);
                           class598.method4450(true);
                           class586.method4369(field2441[43], 125);
                           return;
                        }

                        if (arg2.startsWith(field2441[42])) {
                           if (!class629.field9294.method515()) {
                              class586.method4369(field2441[10], 107);
                              return;
                           }

                           int var19;
                           label620: {
                              var19 = Integer.parseInt(arg2.substring(3));
                              if (~var19 <= -2) {
                                 if (~var19 >= -5) {
                                    break label620;
                                 }

                                 var19 = 4;
                                 if (!var4) {
                                    break label620;
                                 }
                              }

                              var19 = 1;
                           }

                           class567.field8349 = var19;
                           class568.method4266(4);
                           class586.method4369(field2441[65] + class567.field8349, 56);
                           return;
                        }

                        if (arg2.startsWith(field2441[157])) {
                           class586.method4369(field2441[191] + class373.field5222.method3189(false) + "/" + class373.field5222.method3193(2), 44);
                           class586.method4369(field2441[118] + class151.field1879.method3189(!arg3) + "/" + class151.field1879.method3193(2), 74);
                           class586.method4369(field2441[17] + class166.field2126.field11252.method2305(0) + "/" + class166.field2126.field11252.method2302((byte)-61), 50);
                           return;
                        }

                        if (arg2.equalsIgnoreCase(field2441[195])) {
                           class586.method4369(field2441[189] + class204.field2593.field10457 + "," + ((class160.field2051 >> 9) + class539.field7889 >> 6) + "," + ((class168.field2195 >> 9) + class353.field4940 >> 6) + "," + (63 & (class160.field2051 >> 9) + class539.field7889) + "," + (63 & (class168.field2195 >> 9) + class353.field4940) + field2441[97] + (class215.method1757(class160.field2051, !arg3, class204.field2593.field10457, class168.field2195) + -class546.field8031), 118);
                           class586.method4369(field2441[64] + class204.field2593.field10457 + "," + (class539.field7889 + class283.field3927 >> 6) + "," + (class353.field4940 + class175.field2264 >> 6) + "," + (63 & class283.field3927 - -class539.field7889) + "," + (63 & class353.field4940 + class175.field2264) + field2441[97] + (class215.method1757(class283.field3927, !arg3, class204.field2593.field10457, class175.field2264) - class550.field8112), 48);
                           return;
                        }

                        if (!arg2.equals(field2441[69]) && !arg2.equals(field2441[16])) {
                           if (arg2.startsWith(field2441[98])) {
                              int var20 = -1;
                              int var21 = 1000;
                              if (arg2.length() > 15) {
                                 String[] var22 = class61.method549(arg2, ' ', arg3);

                                 try {
                                    if (~var22.length < -2) {
                                       var21 = Integer.parseInt(var22[1]);
                                    }
                                 } catch (Throwable var51) {
                                 }

                                 try {
                                    if (~var22.length < -3) {
                                       var20 = Integer.parseInt(var22[2]);
                                    }
                                 } catch (Throwable var50) {
                                 }
                              }

                              if (var20 != -1) {
                                 class586.method4369(field2441[127] + class593.method4414(var20, var21, (byte)126), 49);
                                 return;
                              }

                              class586.method4369(field2441[20] + class593.method4414(0, var21, (byte)119), 38);
                              class586.method4369(field2441[84] + class593.method4414(2, var21, (byte)-44), 53);
                              class586.method4369(field2441[151] + class593.method4414(3, var21, (byte)-72), 46);
                              class586.method4369(field2441[70] + class593.method4414(1, var21, (byte)-4), 106);
                              class586.method4369(field2441[27] + class593.method4414(5, var21, (byte)-10), 58);
                              return;
                           }

                           if (arg2.equals(field2441[186])) {
                              class3.field35 = !class3.field35;
                              class586.method4369(field2441[39] + class3.field35, 67);
                              return;
                           }

                           if (arg2.equals(field2441[178])) {
                              class254.method2041(98);
                              class586.method4369(field2441[41], 93);
                              return;
                           }

                           if (arg2.startsWith(field2441[28])) {
                              int var23 = Integer.parseInt(arg2.substring(12));
                              class552.method4179(-3616, var23, class329.method2615((byte)123, var23).field1485);
                              class586.method4369(field2441[26], 82);
                              return;
                           }

                           if (arg2.equals(field2441[7])) {
                              class586.method4369(field2441[194] + class44.field571.field11035, 66);
                              return;
                           }

                           if (arg2.startsWith(field2441[158])) {
                              class594 var24 = class145.method1177((byte)103);
                              class702 var25 = class19.method142(var24.field8765, class52.field711, (byte)-100);
                              var25.field10264.method593(0, 867770704);
                              int var26 = var25.field10264.field864;
                              int var27 = arg2.indexOf(" ", 4);
                              var25.field10264.method595(-15010, arg2.substring(3, var27));
                              class264.method2116(var25.field10264, arg2.substring(var27), 30);
                              var25.field10264.method650(-var26 + var25.field10264.field864, 1);
                              var24.method4423(var25, (byte)107);
                              return;
                           }

                           if (arg2.equals(field2441[146])) {
                              class709.method5181(arg3);
                              class586.method4369(field2441[14], 92);
                              return;
                           }

                           if (!arg2.equals(field2441[179])) {
                              if (arg2.equals(field2441[81])) {
                                 class292.field4020 = true;
                                 class598.method4450(arg3);
                                 class586.method4369(field2441[125], 105);
                                 return;
                              }

                              if (arg2.equals(field2441[212])) {
                                 class292.field4020 = false;
                                 class598.method4450(true);
                                 class586.method4369(field2441[131], 72);
                                 return;
                              }

                              if (arg2.equals(field2441[72])) {
                                 class230.method1829((byte)58);
                                 class586.method4369(field2441[102], 82);
                                 return;
                              }

                              if (arg2.equals(field2441[74])) {
                                 class586.method4369(class209.method1720(-113) + field2441[205], 126);
                                 return;
                              }

                              if (arg2.startsWith(field2441[196])) {
                                 int var29 = Integer.parseInt(arg2.substring(17));
                                 class586.method4369(field2441[34] + class175.field2266.method1118(0, var29), 104);
                                 return;
                              }

                              if (arg2.startsWith(field2441[123])) {
                                 int var30 = Integer.parseInt(arg2.substring(14));
                                 class586.method4369(field2441[202] + class175.field2266.method1117(var30, arg3), 38);
                                 return;
                              }

                              if (arg2.startsWith(field2441[12])) {
                                 String[] var31 = class61.method549(arg2.substring(12), ' ', true);
                                 if (var31.length >= 2) {
                                    int var32 = var31.length <= 2 ? 0 : Integer.parseInt(var31[2]);
                                    class74.method715(var31[0], var32, 6, var31[1]);
                                    return;
                                 }
                              }

                              if (arg2.startsWith(field2441[96])) {
                                 String[] var33 = class61.method549(arg2.substring(8), ' ', arg3);
                                 int var34 = Integer.parseInt(var33[0]);
                                 int var35 = var33.length == 2 ? Integer.parseInt(var33[1]) : 0;
                                 class686.method5021(var35, var34, (byte)115);
                                 return;
                              }

                              if (arg2.startsWith(field2441[200])) {
                                 class256.method2068();
                                 return;
                              }

                              if (arg2.startsWith(field2441[33])) {
                                 class256.method2072(100, false);
                                 return;
                              }

                              if (arg2.startsWith(field2441[154])) {
                                 class256.method2072(10, true);
                                 return;
                              }

                              if (arg2.startsWith(field2441[100])) {
                                 int var36 = Integer.parseInt(arg2.substring(8));
                                 class629.field9294.method493(var36);
                                 return;
                              }

                              if (arg2.equals(field2441[80])) {
                                 class586.method4369(field2441[38] + class674.field9978.method2843(), 68);
                                 return;
                              }

                              if (arg2.equals(field2441[44])) {
                                 class371.method2938(2);
                                 class586.method4369(field2441[140] + class757.field11093.field11012.method27(-18033), 53);
                                 return;
                              }

                              if (arg2.equals(field2441[207])) {
                                 class586.method4369(class107.field1426.method754(26519), 103);
                                 return;
                              }

                              if (arg2.equals(field2441[52])) {
                                 label628: {
                                    if (class736.field10758.startsWith(field2441[114])) {
                                       class417.method3251(new File(field2441[170]), false, (byte)-104);
                                       if (!var4) {
                                          break label628;
                                       }
                                    }

                                    class417.method3251(new File(field2441[206]), false, (byte)-105);
                                 }

                                 class586.method4369(field2441[192], 124);
                                 return;
                              }

                              if (arg2.equals(field2441[211])) {
                                 class586.method4369(field2441[120] + class736.field10758, 115);
                                 class586.method4369(field2441[130] + class736.field10757, 110);
                                 class586.method4369(field2441[9] + class736.field10756, 71);
                                 return;
                              }

                              if (arg2.startsWith(field2441[31])) {
                                 int var37 = Integer.parseInt(arg2.substring(8, 9));
                                 class203.field2585 = var37;
                                 class568.method4266(4);
                                 class586.method4369(field2441[19], 101);
                                 return;
                              }

                              if (arg2.startsWith(field2441[209])) {
                                 int var38 = arg2.indexOf(32);
                                 if (~var38 > -1) {
                                    class586.method4369(field2441[190], 78);
                                    return;
                                 }

                                 int var39 = class338.method2669(arg2.substring(var38 - -1), (byte)-126);
                                 class757.field11093.method5438(arg3, class757.field11093.field10977, var39);
                                 class654.method4804((byte)94);
                                 class228.field2860 = false;
                                 class30.method239(-16530);
                                 if (class757.field11093.field10977.method1764(-18033) != var39) {
                                    class586.method4369(field2441[83], 99);
                                    return;
                                 }

                                 class586.method4369(field2441[163], 67);
                                 return;
                              }

                              if (arg2.startsWith(field2441[88])) {
                                 if (class757.field11093.field10977.method1764(-18033) == 0) {
                                    class586.method4369(field2441[18], 51);
                                    return;
                                 }

                                 int var40 = class338.method2669(arg2.substring(arg2.indexOf(32) - -1), (byte)-126);
                                 class629.field9295 = var40;
                                 class586.method4369(field2441[111] + class629.field9295, 52);
                                 return;
                              }

                              if (arg2.startsWith(field2441[89])) {
                                 int var41 = class338.method2669(arg2.substring(1 + arg2.indexOf(32)), (byte)-126);
                                 class187.field2380 = var41;
                                 class690.field10142 = var41;
                                 class586.method4369(field2441[103] + var41, 121);
                                 class30.method239(-16530);
                                 return;
                              }

                              if (arg2.equals(field2441[75])) {
                                 class212.field2698 = !class212.field2698;
                                 class586.method4369(field2441[95] + (class212.field2698 ? field2441[51] : field2441[129]), 118);
                                 return;
                              }

                              if (arg2.startsWith(field2441[91])) {
                                 File var42 = new File(arg2.substring(10));
                                 if (var42.exists()) {
                                    var42 = new File(arg2.substring(10) + "." + class163.method1353(-125) + field2441[148]);
                                    if (var42.exists()) {
                                       class586.method4369(field2441[99], 87);
                                       return;
                                    }
                                 }

                                 if (class199.field2533 != null) {
                                    class199.field2533.close();
                                    class199.field2533 = null;
                                 }

                                 try {
                                    class199.field2533 = new FileOutputStream(var42);
                                    return;
                                 } catch (FileNotFoundException var52) {
                                    class586.method4369(field2441[60] + var42.getName(), 92);
                                    return;
                                 } catch (SecurityException var53) {
                                    class586.method4369(field2441[116] + var42.getName(), 102);
                                    return;
                                 }
                              }

                              if (arg2.equals(field2441[108])) {
                                 if (class199.field2533 != null) {
                                    class199.field2533.close();
                                 }

                                 class199.field2533 = null;
                                 return;
                              }

                              if (arg2.startsWith(field2441[138])) {
                                 File var43 = new File(arg2.substring(10));
                                 if (!var43.exists()) {
                                    class586.method4369(field2441[79], 91);
                                    return;
                                 }

                                 byte[] var44 = class217.method1770(-127, var43);
                                 if (var44 == null) {
                                    class586.method4369(field2441[143], 84);
                                    return;
                                 }

                                 String[] var45 = class61.method549(class471.method3575('\r', class229.method1825(arg3, var44), 0, ""), '\n', true);
                                 class479.method3637(var45, 25812);
                              }

                              if (arg2.startsWith(field2441[171])) {
                                 short var46 = (short)class338.method2669(arg2.substring(5), (byte)-126);
                                 if (var46 > 0) {
                                    class147.field1841 = var46;
                                 }

                                 return;
                              }

                              if (arg2.startsWith(field2441[61])) {
                                 if (arg2.length() > 9 && ~arg2.charAt(8) == -33) {
                                    class256.field3249 = arg2.substring(9);
                                    class256.field3251 = true;
                                    class586.method4369(field2441[68] + class256.field3249 + ")", 59);
                                    return;
                                 }

                                 class256.field3249 = null;
                                 class256.field3251 = !class256.field3251;
                                 class586.method4369(field2441[135] + class256.field3251, 58);
                                 return;
                              }

                              if (class157.field2022 == 11) {
                                 ++class410.field5652;
                                 class702 var47 = class19.method142(class387.field5365.field8765, class400.field5495, (byte)-114);
                                 var47.field10264.method593(3 + arg2.length(), 867770704);
                                 var47.field10264.method593(!arg0 ? 0 : 1, 867770704);
                                 var47.field10264.method593(arg1 ? 1 : 0, 867770704);
                                 var47.field10264.method595(-15010, arg2);
                                 class387.field5365.method4423(var47, (byte)109);
                              }

                              if (arg2.startsWith(field2441[25]) && class781.field11380 != class583.field8611) {
                                 class145.method1179(class338.method2669(arg2.substring(4), (byte)-126), (byte)-27);
                                 return;
                              }
                              break label816;
                           }

                           int var28 = 0;
                           if (var4) {
                              if (class749.field10938[var28]) {
                                 class402.field5522[var28] = (int)(99999.0D * Math.random());
                                 if (Math.random() > 0.5D) {
                                    class402.field5522[var28] *= -1;
                                 }
                              }

                              ++var28;
                           }

                           while(true) {
                              while(class402.field5522.length > var28) {
                                 if (class749.field10938[var28]) {
                                    class402.field5522[var28] = (int)(99999.0D * Math.random());
                                    if (Math.random() > 0.5D) {
                                       class402.field5522[var28] *= -1;
                                    }
                                 }

                                 ++var28;
                              }

                              class709.method5181(arg3);
                              class586.method4369(field2441[35], 43);
                              if (!var4) {
                                 return;
                              }

                              ++var28;
                           }
                        }

                        class506.field7050 = !class506.field7050;
                        class629.field9294.method432(class506.field7050);
                        class410.method3219(-90);
                        class586.method4369(field2441[197] + class506.field7050, 80);
                        return;
                     }

                     class366.field5092.method5340(5000);
                     class594[] var14 = class387.field5366;
                     int var15 = 0;
                     class594 var16;
                     if (var4) {
                        var16 = var14[var15];
                        if (var16.field8760 != null) {
                           var16.field8760.method1051((byte)-79);
                        }

                        ++var15;
                     }

                     while(~var15 > ~var14.length) {
                        var16 = var14[var15];
                        if (var16.field8760 != null) {
                           var16.field8760.method1051((byte)-79);
                        }

                        ++var15;
                     }

                     class507.field7060.method2918((byte)47);
                     class586.method4369(field2441[122], 49);
                     return;
                  }

                  class507.method3825(-85);
                  int var6 = 0;
                  if (var4) {
                     System.gc();
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > -11) {
                        System.gc();
                        ++var6;
                     }

                     Runtime var7 = Runtime.getRuntime();
                     int var8 = (int)((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                     class586.method4369(field2441[185] + var8 + "k", 87);
                     if (!var4) {
                        return;
                     }

                     ++var6;
                  }
               }
            } catch (Exception var54) {
               class586.method4369(class606.field8905.method4490(class782.field11389, -16777216), 85);
               return;
            }
         }

         if (~class157.field2022 != -12) {
            class586.method4369(class606.field8906.method4490(class782.field11389, -16777216) + arg2, 124);
         }
      } catch (RuntimeException var56) {
         throw class93.method866(var56, field2441[22] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2441[24] : field2441[159]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1597(byte arg0) {
      boolean var1 = client.field1481;

      try {
         if (arg0 < 13) {
            field2440 = null;
         }

         byte var2;
         label47: {
            ++field2434;
            if (~class578.field8565 > -97) {
               var2 = 1;
               class743.method5390((byte)55, true);
               if (!var1) {
                  break label47;
               }
            }

            int var3 = class209.method1720(-56);
            if (~var3 >= -101) {
               var2 = 4;
               class435.method3362((byte)90);
               if (!var1) {
                  break label47;
               }
            }

            if (~var3 < -501) {
               if (~var3 >= -1001) {
                  var2 = 2;
                  class551.method4170(0);
                  if (!var1) {
                     break label47;
                  }
               }

               var2 = 1;
               class743.method5390((byte)47, true);
               if (!var1) {
                  break label47;
               }
            }

            var2 = 3;
            class384.method3042(true);
         }

         if (class757.field11093.field11012.method27(-18033) != 0) {
            class757.field11093.method5438(true, class757.field11093.field10997, 0);
            class214.method1749(0, false, 119);
         }

         class654.method4804((byte)113);
         return var2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2441[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1598(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1599(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
