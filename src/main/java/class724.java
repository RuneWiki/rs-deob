import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class724 extends class120 {

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public int field10136;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public int field10138;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "Lob;")
    public static class735 field10140;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method4031(boolean arg0) {
        if (arg0) {
            method4032(53);
        }
        field10140 = null;
    }

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V")
    public static final void method4032(int arg0) {
        field10139++;
        if (class461.field6567 == 0 || class461.field6567 == 5) {
            return;
        }
        try {
            short var1;
            if (class308.field3829 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < (++class453.field6517)) {
                if (class751.field10504 != null) {
                    class751.field10504.method1691(70);
                    class751.field10504 = null;
                }
                if (class308.field3829 >= 3) {
                    class461.field6567 = 0;
                    class40.method240(-5, true);
                    return;
                }
                if (class352.field4528 == 2) {
                    class76.field802.method2759((byte) -53);
                } else {
                    class142.field1593.method2759((byte) -53);
                }
                class308.field3829++;
                class453.field6517 = 0;
                class461.field6567 = 1;
            }
            if (class461.field6567 == 1) {
                if (class352.field4528 == 2) {
                    class344.field4466 = class76.field802.method2757(-12113, class289.field3549);
                } else {
                    class344.field4466 = class142.field1593.method2757(-12113, class289.field3549);
                }
                class461.field6567 = 2;
            }
            if (class461.field6567 == 2) {
                if (class344.field4466.field3573 == 2) {
                    throw new IOException();
                }
                if (class344.field4466.field3573 != 1) {
                    return;
                }
                class751.field10504 = class643.method3665(114, (Socket) class344.field4466.field3577, 7500);
                class344.field4466 = null;
                class220.method1285((byte) -39);
                class249 var2 = class187.method1149((byte) -126);
                var2.field3016.method1460(class360.field4606.field3126, 24710);
                class510.method3017(var2, 111);
                class704.method3953(-62);
                class461.field6567 = 3;
            }
            if (class461.field6567 == 3) {
                if (!class751.field10504.method1694(1, 6406)) {
                    return;
                }
                class751.field10504.method1692(class248.field3008.field2912, 0, -44, 1);
                int var3 = class248.field3008.field2912[0] & 0xFF;
                if (var3 != 0) {
                    class461.field6567 = 0;
                    class40.method240(var3, true);
                    class751.field10504.method1691(48);
                    class751.field10504 = null;
                    class374.method2173(-49);
                    return;
                }
                class248.field3008.field2903 = 0;
                class244 var4 = new class244(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method1460(10, 24710);
                var4.method1421(var5[0], -20798);
                var4.method1421(var5[1], -20798);
                var4.method1421(var5[2], -20798);
                var4.method1421(var5[3], -20798);
                var4.method1462(24557, 0L);
                var4.method1480(class80.field835, false);
                var4.method1462(24557, class504.field7157);
                var4.method1462(24557, class77.field804);
                var4.method1455(121, class730.field10212, class676.field9575);
                class220.method1285((byte) -39);
                class249 var6 = class187.method1149((byte) -126);
                class179 var7 = var6.field3016;
                if (class352.field4528 == 2) {
                    if (class392.field5397 == 13) {
                        var7.method1460(class360.field4611.field3126, 24710);
                    } else {
                        var7.method1460(class360.field4609.field3126, 24710);
                    }
                    var7.method1446(0, true);
                    int var10 = var7.field2903;
                    var7.method1421(632, -20798);
                    var7.method1430(var4.field2903, (byte) 84, 0, var4.field2912);
                    int var11 = var7.field2903;
                    var7.method1480(class411.field5619, false);
                    var7.method1460(class126.field1328, 24710);
                    var7.method1460(class735.method4098(false), 24710);
                    var7.method1446(class705.field9926, true);
                    var7.method1446(class476.field6777, true);
                    var7.method1460(class654.field9334.field9852.method3133(-120), 24710);
                    class435.method2719(var7, 24);
                    var7.method1480(class608.field8638, false);
                    var7.method1421(class519.field7378, -20798);
                    class244 var12 = class654.field9334.method3935((byte) -63);
                    var7.method1460(var12.field2903, 24710);
                    var7.method1430(var12.field2903, (byte) 84, 0, var12.field2912);
                    class361.field4632 = true;
                    class244 var13 = new class244(class463.field6618.method1488((byte) -11));
                    class463.field6618.method1491(0, var13);
                    var7.method1430(var13.field2912.length, (byte) 84, 0, var13.field2912);
                    var7.method1446(class442.field6417, true);
                    var7.method1462(24557, class553.field7927);
                    var7.method1460(class359.field4598 == null ? 0 : 1, 24710);
                    if (class359.field4598 != null) {
                        var7.method1480(class359.field4598, false);
                    }
                    var7.method1460(class54.method303("jagtheora", (byte) -127) ? 1 : 0, 24710);
                    class713.method3986(-127, var7);
                    var7.method1457(var11, var5, (byte) -127, var7.field2903);
                    var7.method1431(var7.field2903 - var10, -99);
                } else {
                    var7.method1460(class360.field4612.field3126, 24710);
                    var7.method1446(0, true);
                    int var8 = var7.field2903;
                    var7.method1421(632, -20798);
                    var7.method1430(var4.field2903, (byte) 84, 0, var4.field2912);
                    int var9 = var7.field2903;
                    var7.method1480(class411.field5619, false);
                    var7.method1460(class99.field1034.field3752, 24710);
                    var7.method1460(class489.field6978, 24710);
                    class435.method2719(var7, 24);
                    var7.method1480(class608.field8638, false);
                    var7.method1421(class519.field7378, -20798);
                    class713.method3986(119, var7);
                    var7.method1457(var9, var5, (byte) 101, var7.field2903);
                    var7.method1431(var7.field2903 - var8, -111);
                }
                class510.method3017(var6, 105);
                class704.method3953(-75);
                class41.field470 = new class20(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class248.field3008.method1100(var5, (byte) 47);
                class461.field6567 = 4;
            }
            if (class461.field6567 == 4) {
                if (!class751.field10504.method1694(1, 6406)) {
                    return;
                }
                class751.field10504.method1692(class248.field3008.field2912, 0, -35, 1);
                int var15 = class248.field3008.field2912[0] & 0xFF;
                if (var15 == 21) {
                    class461.field6567 = 7;
                } else if (var15 == 29) {
                    class461.field6567 = 13;
                } else if (var15 == 1) {
                    class461.field6567 = 5;
                    class40.method240(var15, true);
                    return;
                } else if (var15 == 2) {
                    class461.field6567 = 8;
                } else if (var15 == 15) {
                    class461.field6567 = 14;
                    class741.field10364 = -2;
                } else if (var15 == 23 && class308.field3829 < 3) {
                    class308.field3829++;
                    class453.field6517 = 0;
                    class461.field6567 = 1;
                    class751.field10504.method1691(79);
                    class751.field10504 = null;
                    return;
                } else {
                    class461.field6567 = 0;
                    class40.method240(var15, true);
                    class751.field10504.method1691(70);
                    class751.field10504 = null;
                    class374.method2173(-31);
                    return;
                }
            }
            if (class461.field6567 == 6) {
                class220.method1285((byte) -39);
                class249 var16 = class187.method1149((byte) -126);
                class179 var17 = var16.field3016;
                var17.method1104(class41.field470, (byte) -63);
                var17.method1107(0, class360.field4618.field3126);
                class510.method3017(var16, 47);
                class704.method3953(-77);
                class461.field6567 = 4;
            } else {
                if (arg0 < 88) {
                    method4031(false);
                }
                if (class461.field6567 == 7) {
                    if (class751.field10504.method1694(1, 6406)) {
                        class751.field10504.method1692(class248.field3008.field2912, 0, -66, 1);
                        int var18 = class248.field3008.field2912[0] & 0xFF;
                        class729.field10198 = (var18 + 3) * 60;
                        class461.field6567 = 0;
                        class40.method240(21, true);
                        class751.field10504.method1691(61);
                        class751.field10504 = null;
                        class374.method2173(-99);
                    }
                } else if (class461.field6567 == 13) {
                    if (class751.field10504.method1694(1, 6406)) {
                        class751.field10504.method1692(class248.field3008.field2912, 0, -87, 1);
                        class461.field6567 = 0;
                        class434.field6339 = class248.field3008.field2912[0] & 0xFF;
                        class40.method240(29, true);
                        class751.field10504.method1691(68);
                        class751.field10504 = null;
                        class374.method2173(-94);
                    }
                } else if (class461.field6567 != 8) {
                    if (class461.field6567 == 9) {
                        class179 var19 = class248.field3008;
                        if (class352.field4528 == 2) {
                            if (!class751.field10504.method1694(class96.field1015, 6406)) {
                                return;
                            }
                            class751.field10504.method1692(var19.field2912, 0, -28, class96.field1015);
                            var19.field2903 = 0;
                            class58.field594 = var19.method1423(-72);
                            class153.field1678 = var19.method1423(-58);
                            class603.field8592 = var19.method1423(-95) == 1;
                            class85.field900 = var19.method1423(-123) == 1;
                            class697.field9807 = var19.method1423(-106) == 1;
                            class550.field7899 = var19.method1423(-126) == 1;
                            class701.field9893 = var19.method1476(126);
                            class722.field10120 = var19.method1423(-66) == 1;
                            class306.field3817 = var19.method1459((byte) -121);
                            class511.field7290 = var19.method1423(-13) == 1;
                            class445.field6442.method3971(class511.field7290, 50);
                            class361.field4643.method911(-96, class511.field7290);
                            class451.field6506.method139(class511.field7290, (byte) -112);
                        } else if (class751.field10504.method1694(class96.field1015, 6406)) {
                            class751.field10504.method1692(var19.field2912, 0, -108, class96.field1015);
                            var19.field2903 = 0;
                            class58.field594 = var19.method1423(-58);
                            class153.field1678 = var19.method1423(-49);
                            class603.field8592 = var19.method1423(-119) == 1;
                            class85.field900 = var19.method1423(-22) == 1;
                            class697.field9807 = var19.method1423(-94) == 1;
                            class244.field2924 = var19.method1466((byte) 31);
                            class722.field10120 = class244.field2924 > 0;
                            class123.field1290 = var19.method1476(53);
                            class291.field3583 = var19.method1476(33);
                            class348.field4499 = var19.method1476(-1);
                            class448.field6469 = var19.method1438(122);
                            class348.field4495 = class289.field3549.method3203((byte) -112, class448.field6469);
                            class440.field6386 = var19.method1423(-63);
                            class182.field2145 = var19.method1476(-84);
                            class592.field8345 = var19.method1476(-76);
                            class302.field3762 = var19.method1423(-124) == 1;
                            class90.field937.field2157 = class90.field937.field2161 = class720.field10105 = var19.method1467(9348);
                            class157.field1729 = var19.method1423(-122);
                            class312.field3875 = var19.method1438(112);
                            class506.field7223 = new class444();
                            class506.field7223.field6435 = var19.method1476(115);
                            if (class506.field7223.field6435 == 65535) {
                                class506.field7223.field6435 = -1;
                            }
                            class506.field7223.field6430 = var19.method1467(9348);
                            if (class342.field4425 != class237.field2829) {
                                class506.field7223.field6431 = class506.field7223.field6435 + 50000;
                                class506.field7223.field6441 = class506.field7223.field6435 + 40000;
                            }
                            if (class237.field2829 != class159.field1757 && (class76.field802.method2754(class593.field8383, 4761) || class76.field802.method2754(class431.field6269, 4761))) {
                                class486.method2931(111);
                            }
                        } else {
                            return;
                        }
                        if ((!class603.field8592 || class697.field9807) && !class722.field10120) {
                            try {
                                class393.method2415("unzap", 41, class255.field3123);
                            } catch (Throwable var24) {
                            }
                        } else {
                            try {
                                class393.method2415("zap", 1, class255.field3123);
                            } catch (Throwable var26) {
                                if (class654.field9329) {
                                    try {
                                        class255.field3123.getAppletContext().showDocument(new URL(class255.field3123.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var25) {
                                    }
                                }
                            }
                        }
                        if (class342.field4425 == class237.field2829) {
                            try {
                                class393.method2415("loggedin", -109, class255.field3123);
                            } catch (Throwable var23) {
                            }
                        }
                        if (class352.field4528 != 2) {
                            class461.field6567 = 0;
                            class40.method240(2, true);
                            class336.method1998(3);
                            class313.method1860(true, 7);
                            class691.field9738 = null;
                            return;
                        }
                        class461.field6567 = 11;
                    }
                    if (class461.field6567 == 11) {
                        if (!class751.field10504.method1694(3, 6406)) {
                            return;
                        }
                        class751.field10504.method1692(class248.field3008.field2912, 0, -17, 3);
                        class461.field6567 = 12;
                    }
                    if (class461.field6567 == 12) {
                        class179 var20 = class248.field3008;
                        var20.field2903 = 0;
                        if (var20.method1103((byte) 73)) {
                            if (!class751.field10504.method1694(1, 6406)) {
                                return;
                            }
                            class751.field10504.method1692(var20.field2912, 3, -24, 1);
                        }
                        class691.field9738 = class374.method2174(-1)[var20.method1109(0)];
                        class741.field10364 = var20.method1476(63);
                        class461.field6567 = 10;
                    }
                    if (class461.field6567 == 10) {
                        if (class751.field10504.method1694(class741.field10364, 6406)) {
                            class751.field10504.method1692(class248.field3008.field2912, 0, -75, class741.field10364);
                            class248.field3008.field2903 = 0;
                            class461.field6567 = 0;
                            int var21 = class741.field10364;
                            class40.method240(2, true);
                            class650.method3696(26254);
                            class485.method2930((byte) -35, class248.field3008);
                            class443.field6427 = -1;
                            if (class691.field9738 == class379.field5191) {
                                class120.method776(-6252);
                            } else {
                                class234.method1389(false);
                            }
                            if (class248.field3008.field2903 != var21) {
                                throw new RuntimeException("lswp pos:" + class248.field3008.field2903 + " psize:" + var21);
                            }
                            class691.field9738 = null;
                        }
                    } else if (class461.field6567 == 14) {
                        if (class741.field10364 == -2) {
                            if (!class751.field10504.method1694(2, 6406)) {
                                return;
                            }
                            class751.field10504.method1692(class248.field3008.field2912, 0, -30, 2);
                            class248.field3008.field2903 = 0;
                            class741.field10364 = class248.field3008.method1476(-73);
                        }
                        if (class751.field10504.method1694(class741.field10364, 6406)) {
                            class751.field10504.method1692(class248.field3008.field2912, 0, -48, class741.field10364);
                            class248.field3008.field2903 = 0;
                            class461.field6567 = 0;
                            int var22 = class741.field10364;
                            class40.method240(15, true);
                            class70.method519(88);
                            class485.method2930((byte) -35, class248.field3008);
                            if (class248.field3008.field2903 != var22) {
                                throw new RuntimeException("lswpr pos:" + class248.field3008.field2903 + " psize:" + var22);
                            }
                            class691.field9738 = null;
                        }
                    }
                } else if (class751.field10504.method1694(1, 6406)) {
                    class751.field10504.method1692(class248.field3008.field2912, 0, -75, 1);
                    class461.field6567 = 9;
                    class96.field1015 = class248.field3008.field2912[0] & 0xFF;
                }
            }
        } catch (IOException var27) {
            if (class751.field10504 != null) {
                class751.field10504.method1691(59);
                class751.field10504 = null;
            }
            if (class308.field3829 < 3) {
                if (class352.field4528 == 2) {
                    class76.field802.method2759((byte) -53);
                } else {
                    class142.field1593.method2759((byte) -53);
                }
                class461.field6567 = 1;
                class308.field3829++;
                class453.field6517 = 0;
            } else {
                class461.field6567 = 0;
                class40.method240(-4, true);
                class374.method2173(-84);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)Lhs;")
    public final class325 method777(int arg0) {
        field10137++;
        if (arg0 >= -8) {
            method4032(-56);
        }
        return class621.field8902;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lkda;Lcu;IIIIIIIII)V")
    public class724(class388 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10136 = arg9;
        this.field10138 = arg10;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)[Lse;")
    public static final class256[] method4033(byte arg0) {
        if (arg0 == 4) {
            field10135++;
            return new class256[] { class360.field4606, class360.field4608, class360.field4609, class360.field4610, class360.field4611, class360.field4612, class360.field4613, class360.field4614, class360.field4615, class360.field4616, class360.field4617, class360.field4618, class360.field4619, class360.field4620 };
        } else {
            return null;
        }
    }
}
