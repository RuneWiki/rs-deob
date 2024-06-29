import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class129 {

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    private int field162 = -1;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public int field167 = 0;

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
    public int field179 = -1;

    @OriginalMember(owner = "client!bc", name = "wb", descriptor = "I")
    private int field184 = -1;

    @OriginalMember(owner = "client!bc", name = "zb", descriptor = "I")
    public int field187 = 1;

    @OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
    private int field180 = 0;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    public int field174 = 0;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public int field168 = 2000;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "[Lmc;")
    public class75[] field169 = new class75[] { null, null, null, null, class79.field2001 };

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    private int field172 = 128;

    @OriginalMember(owner = "client!bc", name = "yb", descriptor = "Z")
    public boolean field186 = false;

    @OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
    private int field189 = -1;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public int field155 = 0;

    @OriginalMember(owner = "client!bc", name = "Fb", descriptor = "I")
    private int field193 = -1;

    @OriginalMember(owner = "client!bc", name = "Lb", descriptor = "[Lmc;")
    public class75[] field199 = new class75[] { null, null, class122.field2967, null, null };

    @OriginalMember(owner = "client!bc", name = "Ib", descriptor = "Z")
    public boolean field196 = false;

    @OriginalMember(owner = "client!bc", name = "Eb", descriptor = "I")
    private int field192 = 128;

    @OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
    private int field181 = -1;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
    private int field177 = -1;

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
    private int field178 = -1;

    @OriginalMember(owner = "client!bc", name = "Nb", descriptor = "I")
    public int field201 = 0;

    @OriginalMember(owner = "client!bc", name = "Kb", descriptor = "I")
    private int field198 = 128;

    @OriginalMember(owner = "client!bc", name = "Pb", descriptor = "I")
    private int field203 = -1;

    @OriginalMember(owner = "client!bc", name = "Ab", descriptor = "I")
    public int field188 = -1;

    @OriginalMember(owner = "client!bc", name = "Vb", descriptor = "I")
    public int field209 = 0;

    @OriginalMember(owner = "client!bc", name = "Wb", descriptor = "I")
    public int field210 = 0;

    @OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "client!bc", name = "Tb", descriptor = "I")
    private int field207 = -1;

    @OriginalMember(owner = "client!bc", name = "Cb", descriptor = "I")
    public int field190 = 0;

    @OriginalMember(owner = "client!bc", name = "Gb", descriptor = "I")
    private int field194 = -1;

    @OriginalMember(owner = "client!bc", name = "Qb", descriptor = "Lmc;")
    public class75 field204 = class32.field730;

    @OriginalMember(owner = "client!bc", name = "Zb", descriptor = "I")
    private int field213 = 0;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "Lmc;")
    private static class75 field161 = class30.method234(true, "Checking for updates )2 ");

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lmc;")
    public static class75 field153 = field161;

    @OriginalMember(owner = "client!bc", name = "Rb", descriptor = "Lmc;")
    public static class75 field205 = class30.method234(true, "redstone3");

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "Loa;")
    private static class85 field171 = new class85(5000);

    @OriginalMember(owner = "client!bc", name = "ec", descriptor = "I")
    public static int field218 = 0;

    @OriginalMember(owner = "client!bc", name = "ac", descriptor = "Lmc;")
    public static class75 field214 = class30.method234(true, "Benutzen");

    @OriginalMember(owner = "client!bc", name = "cc", descriptor = "Lmc;")
    public static class75 field216 = class30.method234(true, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!bc", name = "bc", descriptor = "Lmc;")
    public static class75 field215 = class30.method234(true, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!bc", name = "fc", descriptor = "Lmc;")
    private static class75 field219 = class30.method234(true, "Members object");

    @OriginalMember(owner = "client!bc", name = "ic", descriptor = "Lmc;")
    public static class75 field222 = field219;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bc", name = "vb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bc", name = "Db", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bc", name = "Hb", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bc", name = "Jb", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bc", name = "Mb", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bc", name = "Ob", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bc", name = "Sb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bc", name = "Ub", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bc", name = "Yb", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bc", name = "dc", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bc", name = "hc", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bc", name = "gc", descriptor = "Lnc;")
    public static class81 field220;

    @OriginalMember(owner = "client!bc", name = "jc", descriptor = "Lp;")
    public static class90 field223;

    @OriginalMember(owner = "client!bc", name = "kc", descriptor = "Lp;")
    public static class90 field224;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "[I")
    private int[] field175;

    @OriginalMember(owner = "client!bc", name = "ub", descriptor = "[I")
    public int[] field182;

    @OriginalMember(owner = "client!bc", name = "Xb", descriptor = "[I")
    private int[] field211;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 4)
    public final void method60(int arg0) {
        field200++;
        if (arg0 != -1) {
            method68(true, -8, false, -109, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 15)
    public static void method61(byte arg0) {
        field215 = null;
        field216 = null;
        field223 = null;
        if (arg0 != 14) {
            method67(-71);
        }
        field171 = null;
        field220 = null;
        field224 = null;
        field205 = null;
        field222 = null;
        field161 = null;
        field219 = null;
        field153 = null;
        field214 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Z", line = 41)
    public final boolean method62(int arg0, boolean arg1) {
        field195++;
        int var3 = this.field178;
        int var4 = this.field184;
        int var5 = this.field207;
        if (arg1) {
            var5 = this.field193;
            var3 = this.field177;
            var4 = this.field194;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class128.field3123.method441((byte) -128, 0, var3)) {
            var6 = false;
        }
        if (arg0 != -85) {
            method76(true);
        }
        if (var4 != -1 && !class128.field3123.method441((byte) -124, 0, var4)) {
            var6 = false;
        }
        if (var5 != -1 && !class128.field3123.method441((byte) -128, 0, var5)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Z", line = 88)
    public final boolean method63(boolean arg0, int arg1) {
        field166++;
        int var3 = this.field162;
        int var4 = this.field203;
        if (arg0) {
            var4 = this.field181;
            var3 = this.field189;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!class128.field3123.method441((byte) -128, 0, var3)) {
            var5 = false;
        }
        if (arg1 != var4 && !class128.field3123.method441((byte) -124, 0, var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 129)
    public static final void method64(boolean arg0) {
        class23.method158(-128);
        field173++;
        if (class110.field2787 != 10) {
            return;
        }
        int var1 = class97.field2435;
        if (!arg0) {
            return;
        }
        int var2 = class12.field245 - 202;
        int var3 = class71.field1813 - 171;
        if (class91.field2236 == 0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var1 == 1 && var4 - 75 <= var2 && var2 <= var4 + 75 && var5 - 20 <= var3 && var3 <= var5 + 20) {
                class91.field2236 = 3;
                class27.field549 = 0;
            }
            short var6 = 260;
            if (var1 == 1 && var6 - 75 <= var2 && var6 + 75 >= var2 && var3 >= var5 - 20 && var3 <= var5 + 20) {
                class91.field2236 = 2;
                class27.field549 = 0;
                class47.field1139 = class36.field860;
                class47.field1166 = class96.field2416;
                class47.field1157 = class96.field2396;
            }
        } else if (class91.field2236 == 2) {
            byte var7 = 60;
            int var15 = var7 + 30;
            byte var8 = 100;
            if (var1 == 1 && var15 - 15 <= var3 && var15 > var3) {
                class27.field549 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class27.field549 = 1;
            }
            var15 += 15;
            short var9 = 150;
            if (var1 == 1 && var8 - 75 <= var2 && var2 <= var8 + 75 && var3 >= var9 - 20 && var3 <= var9 + 20) {
                class47.field1149 = class47.field1149.method632(-30765).method652(1);
                class92.method766(class96.field2418, class47.field1125, class96.field2420, true);
                class17.method121(20, -9411);
            } else {
                short var10 = 260;
                if (var1 == 1 && var10 - 75 <= var2 && var2 <= var10 + 75 && var9 - 20 <= var3 && var9 + 20 >= var3) {
                    class47.field1130 = class47.field1150;
                    class47.field1149 = class47.field1150;
                    class91.field2236 = 0;
                }
                while (true) {
                    boolean var11;
                    label141: do {
                        while (class97.method813((byte) -67)) {
                            var11 = false;
                            for (int var12 = 0; var12 < class104.field2643.method621(-19198); var12++) {
                                if (class104.field2640 == class104.field2643.method656(true, var12)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class27.field549 != 0) {
                                continue label141;
                            }
                            if (class38.field900 == 85 && class47.field1149.method621(-19198) > 0) {
                                class47.field1149 = class47.field1149.method647(0, 0, class47.field1149.method621(-19198) - 1);
                            }
                            if (class38.field900 == 84 || class38.field900 == 80) {
                                class27.field549 = 1;
                            }
                            if (var11 && class47.field1149.method621(-19198) < 12) {
                                class47.field1149 = class47.field1149.method646((byte) -61, class104.field2640);
                            }
                        }
                        return;
                    } while (class27.field549 != 1);
                    if (class38.field900 == 85 && class47.field1130.method621(-19198) > 0) {
                        class47.field1130 = class47.field1130.method647(0, 0, class47.field1130.method621(-19198) - 1);
                    }
                    if (class38.field900 == 84 || class38.field900 == 80) {
                        class27.field549 = 0;
                    }
                    if (var11 && class47.field1130.method621(-19198) < 20) {
                        class47.field1130 = class47.field1130.method646((byte) -59, class104.field2640);
                    }
                }
            }
        } else if (class91.field2236 == 3) {
            short var13 = 150;
            short var14 = 180;
            if (var1 == 1 && var14 - 75 <= var2 && var14 + 75 >= var2 && var13 - 20 <= var3 && var13 + 20 >= var3) {
                class91.field2236 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIZ)Lpc;", line = 282)
    public final class93 method65(boolean arg0, int arg1, boolean arg2) {
        field159++;
        if (arg2) {
            this.field181 = -99;
        }
        if (this.field182 != null && arg1 > 1) {
            int var4 = -1;
            for (int var5 = 0; var5 < 10; var5++) {
                if (arg1 >= this.field157[var5] && this.field157[var5] != 0) {
                    var4 = this.field182[var5];
                }
            }
            if (var4 != -1) {
                return class43.method326(var4, 0).method65(arg0, 1, false);
            }
        }
        if (arg0) {
            class93 var6 = (class93) class50.field1203.method559((long) this.field160, -124);
            if (var6 != null) {
                return var6;
            }
        }
        class93 var7 = class93.method778(class128.field3123, this.field158, 0);
        if (var7 == null) {
            return null;
        }
        if (this.field192 != 128 || this.field172 != 128 || this.field198 != 128) {
            var7.method770(this.field192, this.field172, this.field198);
        }
        if (this.field211 != null) {
            for (int var8 = 0; var8 < this.field211.length; var8++) {
                var7.method789(this.field211[var8], this.field175[var8]);
            }
        }
        if (arg0) {
            var7.method800(this.field167 + 64, this.field155 + 768, -50, -10, -50, true);
            var7.field2310 = true;
            class50.field1203.method558((long) this.field160, var7, 304);
        }
        return var7;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lka;B)V", line = 360)
    public final void method66(class61 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method494(20471);
            if (var3 == 0) {
                int var4 = 70 / ((arg1 + 34) / 33);
                field165++;
                return;
            }
            this.method75(var3, arg0, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V", line = 415)
    public static final void method67(int arg0) {
        int var1 = 0;
        if (arg0 != 31266) {
            method71((byte) 62, -118, null, 77);
        }
        while (class76.field1921 > var1) {
            int var2 = class94.field2369[var1];
            class122 var3 = class40.field957[var2];
            int var4 = class97.field2448.method494(20471);
            if ((var4 & 0x4) != 0) {
                var4 += class97.field2448.method494(20471) << 8;
            }
            class101.method836(var4, (byte) -29, var2, var3);
            var1++;
        }
        field202++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIZIZ)Lp;", line = 443)
    public static final class90 method68(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg1 > -52) {
            field218 = 87;
        }
        field197++;
        class12 var5 = null;
        if (class68.field1740 != null) {
            var5 = new class12(arg3, class68.field1740, class37.field893[arg3], 1000000);
        }
        return new class90(var5, class30.field676, arg3, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V", line = 464)
    public static final void method69(int arg0) {
        field164++;
        if (~class37.field885 != arg0) {
            return;
        }
        int var1 = class97.field2435;
        if (class17.field332 == 1 && class12.field245 >= 516 && class71.field1813 >= 160 && class12.field245 <= 765 && class71.field1813 <= 205) {
            var1 = 0;
        }
        if (!class15.field283) {
            if (var1 == 1 && class100.field2585 > 0) {
                int var12 = class1.field28[class100.field2585 - 1];
                if (var12 == 39 || var12 == 51 || var12 == 53 || var12 == 40 || var12 == 11 || var12 == 56 || var12 == 50 || var12 == 9 || var12 == 18 || var12 == 38 || var12 == 46 || var12 == 1001) {
                    int var13 = class126.field3073[class100.field2585 - 1];
                    int var14 = class86.field2125[class100.field2585 - 1];
                    class99 var15 = class40.method305(65535, var14);
                    if (var15.field2523 || var15.field2531) {
                        class23.field443 = false;
                        client.field378 = class12.field245;
                        class32.field719 = var14;
                        class131.field3180 = var13;
                        class110.field2788 = 0;
                        class7.field118 = class71.field1813;
                        class37.field885 = 2;
                        if (var14 >> 16 == class130.field3155) {
                            class37.field885 = 1;
                        }
                        if (var14 >> 16 == class130.field3161) {
                            class37.field885 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class78.field1966 == 1 || class119.method949((byte) 14, class100.field2585 - 1)) && class100.field2585 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class100.field2585 > 0) {
                class44.method330(class100.field2585 - 1, (byte) 25);
            }
            if (var1 != 2 || class100.field2585 <= 0) {
                return;
            }
            class3.method18((byte) -19);
            return;
        }
        if (var1 != 1) {
            int var2 = class45.field1104;
            int var3 = class90.field2200;
            if (class90.field2218 == 0) {
                var2 -= 4;
                var3 -= 4;
            }
            if (class90.field2218 == 1) {
                var3 -= 553;
                var2 -= 205;
            }
            if (class90.field2218 == 2) {
                var3 -= 17;
                var2 -= 357;
            }
            if (var3 < class110.field2802 - 10 || class110.field2802 + class98.field2465 + 10 < var3 || class61.field1592 - 10 > var2 || class34.field809 + class61.field1592 + 10 < var2) {
                class15.field283 = false;
                if (class90.field2218 == 1) {
                    class108.field2743 = true;
                }
                if (class90.field2218 == 2) {
                    class35.field841 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class110.field2802;
        int var5 = class61.field1592;
        int var6 = class12.field245;
        int var7 = class71.field1813;
        int var8 = class98.field2465;
        if (class90.field2218 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class90.field2218 == 1) {
            var6 -= 553;
            var7 -= 205;
        }
        int var9 = -1;
        if (class90.field2218 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        for (int var10 = 0; var10 < class100.field2585; var10++) {
            int var11 = (class100.field2585 - var10 - 1) * 15 + var5 + 31;
            if (var6 > var4 && var4 + var8 > var6 && var11 - 13 < var7 && var11 + 3 > var7) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class44.method330(var9, (byte) 25);
        }
        if (class90.field2218 == 2) {
            class35.field841 = true;
        }
        class15.field283 = false;
        if (class90.field2218 == 1) {
            class108.field2743 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Lpc;", line = 663)
    public final class93 method70(boolean arg0, boolean arg1) {
        field191++;
        int var3 = this.field178;
        int var4 = this.field207;
        int var5 = this.field184;
        if (arg0) {
            var3 = this.field177;
            var5 = this.field194;
            var4 = this.field193;
        }
        if (var3 == -1) {
            return null;
        }
        class93 var6 = class93.method778(class128.field3123, var3, 0);
        if (arg1) {
            return null;
        }
        if (var5 != -1) {
            class93 var7 = class93.method778(class128.field3123, var5, 0);
            if (var4 == -1) {
                class93[] var8 = new class93[] { var6, var7 };
                var6 = new class93(var8, 2);
            } else {
                class93 var9 = class93.method778(class128.field3123, var4, 0);
                class93[] var10 = new class93[] { var6, var7, var9 };
                var6 = new class93(var10, 3);
            }
        }
        if (!arg0 && this.field213 != 0) {
            var6.method781(0, this.field213, 0);
        }
        if (arg0 && this.field180 != 0) {
            var6.method781(0, this.field180, 0);
        }
        if (this.field211 != null) {
            for (int var11 = 0; var11 < this.field211.length; var11++) {
                var6.method789(this.field211[var11], this.field175[var11]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILaa;I)V", line = 748)
    public static final void method71(byte arg0, int arg1, class2 arg2, int arg3) {
        field183++;
        if (arg2 == null) {
            return;
        }
        int var4 = class97.field2455 + class43.field1025 & 0x7FF;
        int var5 = arg3 * arg3 + arg1 * arg1;
        if (var5 > 6400) {
            return;
        }
        int var6 = class93.field2345[var4];
        int var7 = var6 * 256 / (class91.field2230 + 256);
        int var8 = class93.field2354[var4];
        int var9 = var8 * 256 / (class91.field2230 + 256);
        int var10 = arg1 * var7 + arg3 * var9 >> 16;
        int var11 = arg1 * var9 - arg3 * var7 >> 16;
        if (var5 <= 2500) {
            arg2.method14(var10 + 4 + 94 - arg2.field36 / 2, -var11 + 83 - (arg2.field35 / 2 - -4));
        } else {
            arg2.method16(class92.field2283, var10 + 94 + 4 - arg2.field36 / 2, -(arg2.field35 / 2) + -4 + -var11 + 83);
        }
        if (arg0 <= 35) {
            method68(true, -56, false, 107, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbc;BLbc;)V", line = 784)
    public final void method72(class10 arg0, byte arg1, class10 arg2) {
        this.field210 = arg0.field210;
        this.field204 = arg2.field204;
        this.field174 = arg0.field174;
        this.field158 = arg0.field158;
        this.field190 = arg0.field190;
        this.field201 = arg0.field201;
        this.field186 = true;
        this.field211 = arg0.field211;
        this.field175 = arg0.field175;
        this.field168 = arg0.field168;
        this.field185 = arg0.field185;
        int var4 = -3 / ((-arg1 - 59) / 57);
        this.field187 = arg2.field187;
        field163++;
        this.field196 = arg2.field196;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(ZI)Lpc;", line = 809)
    public final class93 method73(boolean arg0, int arg1) {
        int var3 = this.field203;
        int var4 = this.field162;
        field212++;
        if (arg0) {
            var4 = this.field189;
            var3 = this.field181;
        }
        if (var4 == -1) {
            return null;
        }
        class93 var5 = class93.method778(class128.field3123, var4, 0);
        if (var3 != -1) {
            class93 var6 = class93.method778(class128.field3123, var3, 0);
            class93[] var7 = new class93[] { var5, var6 };
            var5 = new class93(var7, 2);
        }
        if (arg1 != 2) {
            return null;
        }
        if (this.field211 != null) {
            for (int var8 = 0; var8 < this.field211.length; var8++) {
                var5.method789(this.field211[var8], this.field175[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lja;III)Lj;", line = 862)
    public static final class54 method74(class55 arg0, int arg1, int arg2, int arg3) {
        field206++;
        if (arg1 != -2097) {
            field214 = null;
        }
        return class82.method693(2151, arg3, arg0, arg2) ? class64.method563(-37) : null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILka;B)V", line = 884)
    private final void method75(int arg0, class61 arg1, byte arg2) {
        if (arg2 >= -67) {
            return;
        }
        if (arg0 == 1) {
            this.field158 = arg1.method507((byte) -35);
        } else if (arg0 == 2) {
            this.field204 = arg1.method509((byte) 78);
        } else if (arg0 == 4) {
            this.field168 = arg1.method507((byte) -21);
        } else if (arg0 == 5) {
            this.field185 = arg1.method507((byte) -121);
        } else if (arg0 == 6) {
            this.field201 = arg1.method507((byte) -113);
        } else if (arg0 == 7) {
            this.field210 = arg1.method507((byte) -126);
            if (this.field210 > 32767) {
                this.field210 -= 65536;
            }
        } else if (arg0 == 8) {
            this.field174 = arg1.method507((byte) -75);
            if (this.field174 > 32767) {
                this.field174 -= 65536;
            }
        } else if (arg0 == 10) {
            arg1.method507((byte) -66);
        } else if (arg0 == 11) {
            this.field186 = true;
        } else if (arg0 == 12) {
            this.field187 = arg1.method496((byte) 122);
        } else if (arg0 == 16) {
            this.field196 = true;
        } else if (arg0 == 23) {
            this.field178 = arg1.method507((byte) -125);
            this.field213 = arg1.method494(20471);
        } else if (arg0 == 24) {
            this.field184 = arg1.method507((byte) -69);
        } else if (arg0 == 25) {
            this.field177 = arg1.method507((byte) -101);
            this.field180 = arg1.method494(20471);
        } else if (arg0 == 26) {
            this.field194 = arg1.method507((byte) -103);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field199[arg0 - 30] = arg1.method509((byte) 78);
            if (this.field199[arg0 - 30].method634(class129.field3141, 1)) {
                this.field199[arg0 - 30] = null;
            }
        } else if (arg0 >= 35 && arg0 < 40) {
            this.field169[arg0 - 35] = arg1.method509((byte) 78);
        } else if (arg0 == 40) {
            int var4 = arg1.method494(20471);
            this.field175 = new int[var4];
            this.field211 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field211[var5] = arg1.method507((byte) -52);
                this.field175[var5] = arg1.method507((byte) -85);
            }
        } else if (arg0 == 78) {
            this.field207 = arg1.method507((byte) -114);
        } else if (arg0 == 79) {
            this.field193 = arg1.method507((byte) -26);
        } else if (arg0 == 90) {
            this.field162 = arg1.method507((byte) -92);
        } else if (arg0 == 91) {
            this.field189 = arg1.method507((byte) -98);
        } else if (arg0 == 92) {
            this.field203 = arg1.method507((byte) -59);
        } else if (arg0 == 93) {
            this.field181 = arg1.method507((byte) -65);
        } else if (arg0 == 95) {
            this.field190 = arg1.method507((byte) -57);
        } else if (arg0 == 97) {
            this.field188 = arg1.method507((byte) -95);
        } else if (arg0 == 98) {
            this.field179 = arg1.method507((byte) -111);
        } else if (arg0 >= 100 && arg0 < 110) {
            if (this.field182 == null) {
                this.field182 = new int[10];
                this.field157 = new int[10];
            }
            this.field182[arg0 - 100] = arg1.method507((byte) -58);
            this.field157[arg0 - 100] = arg1.method507((byte) -119);
        } else if (arg0 == 110) {
            this.field192 = arg1.method507((byte) -29);
        } else if (arg0 == 111) {
            this.field172 = arg1.method507((byte) -65);
        } else if (arg0 == 112) {
            this.field198 = arg1.method507((byte) -89);
        } else if (arg0 == 113) {
            this.field167 = arg1.method517(128);
        } else if (arg0 == 114) {
            this.field155 = arg1.method517(128) * 5;
        } else if (arg0 == 115) {
            this.field209 = arg1.method494(20471);
        }
        field208++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(Z)V", line = 1095)
    public static final void method76(boolean arg0) {
        field217++;
        try {
            if (class5.field79 == 0) {
                if (class70.field1795 != null) {
                    class70.field1795.method756(126);
                    class70.field1795 = null;
                }
                class59.field1536 = 0;
                class5.field79 = 1;
                class34.field778 = false;
                class104.field2639 = null;
            }
            if (class5.field79 == 1) {
                if (class104.field2639 == null) {
                    class104.field2639 = class78.field1967.method983(class112.field2841, true);
                }
                if (class104.field2639.field2964 == 2) {
                    throw new IOException();
                }
                if (class104.field2639.field2964 == 1) {
                    class70.field1795 = new class91((Socket) class104.field2639.field2959, class78.field1967);
                    class104.field2639 = null;
                    class5.field79 = 2;
                }
            }
            if (class5.field79 == 2) {
                long var1 = class119.field2946 = class47.field1149.method643(true);
                class118.field2923.field1556 = 0;
                class118.field2923.method493((byte) 88, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class118.field2923.method493((byte) 88, var3);
                class70.field1795.method761(2, 0, class118.field2923.field1577, 0);
                class5.field79 = 3;
                class97.field2448.field1556 = 0;
            }
            if (class5.field79 == 3) {
                int var4 = class70.field1795.method759((byte) 100);
                if (var4 != 0) {
                    class112.method907(var4, 22);
                    return;
                }
                class5.field79 = 4;
                class97.field2448.field1556 = 0;
            }
            if (class5.field79 == 4) {
                if (class97.field2448.field1556 < 8) {
                    int var5 = class70.field1795.method753(0);
                    if (8 - class97.field2448.field1556 < var5) {
                        var5 = 8 - class97.field2448.field1556;
                    }
                    if (var5 > 0) {
                        class70.field1795.method760(class97.field2448.field1556, class97.field2448.field1577, var5, 5000);
                        class97.field2448.field1556 += var5;
                    }
                }
                if (class97.field2448.field1556 == 8) {
                    class97.field2448.field1556 = 0;
                    class72.field1823 = class97.field2448.method532(!arg0);
                    class5.field79 = 5;
                }
            }
            if (class5.field79 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class72.field1823 >> 32), (int) class72.field1823 };
                class118.field2923.field1556 = 0;
                class118.field2923.method493((byte) 88, 10);
                class118.field2923.method526(var6[0], (byte) 7);
                class118.field2923.method526(var6[1], (byte) 7);
                class118.field2923.method526(var6[2], (byte) 7);
                class118.field2923.method526(var6[3], (byte) 7);
                class118.field2923.method526(class78.field1967.field3026, (byte) 7);
                class118.field2923.method501((byte) 35, class47.field1149.method643(true));
                class118.field2923.method512(255, class47.field1130);
                class118.field2923.method520(class41.field982, (byte) -88, class85.field2087);
                field171.field1556 = 0;
                if (class110.field2787 == 40) {
                    field171.method493((byte) 88, 18);
                } else {
                    field171.method493((byte) 88, 16);
                }
                field171.method493((byte) 88, class118.field2923.field1556 + 53);
                field171.method526(419, (byte) 7);
                field171.method493((byte) 88, class92.field2270 ? 1 : 0);
                field171.method526(class71.field1799.field1388, (byte) 7);
                field171.method526(class31.field693.field1388, (byte) 7);
                field171.method526(class125.field3070.field1388, (byte) 7);
                field171.method526(class112.field2838.field1388, (byte) 7);
                field171.method526(field223.field1388, (byte) 7);
                field171.method526(class40.field967.field1388, (byte) 7);
                field171.method526(field224.field1388, (byte) 7);
                field171.method526(class45.field1101.field1388, (byte) 7);
                field171.method526(class12.field248.field1388, (byte) 7);
                field171.method526(class57.field1440.field1388, (byte) 7);
                field171.method526(class32.field712.field1388, (byte) 7);
                field171.method526(class100.field2587.field1388, (byte) 7);
                field171.method537(class118.field2923.field1556, class118.field2923.field1577, (byte) 64, 0);
                class70.field1795.method761(field171.field1556, 0, field171.field1577, 0);
                class118.field2923.method708(arg0, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class97.field2448.method708(false, var6);
                class5.field79 = 6;
            }
            if (class5.field79 == 6 && class70.field1795.method753(0) > 0) {
                int var8 = class70.field1795.method759((byte) 26);
                if (var8 == 21 && class110.field2787 == 20) {
                    class5.field79 = 7;
                } else if (var8 == 2) {
                    class5.field79 = 9;
                } else if (var8 == 15 && class110.field2787 == 40) {
                    class8.method49(107);
                    return;
                } else if (var8 == 23 && class84.field2062 < 1) {
                    class84.field2062++;
                    class5.field79 = 0;
                } else {
                    class112.method907(var8, -125);
                    return;
                }
            }
            if (class5.field79 == 7 && class70.field1795.method753(0) > 0) {
                class86.field2139 = class70.field1795.method759((byte) 43) * 60 + 180;
                class5.field79 = 8;
            }
            if (!arg0) {
                if (class5.field79 == 8) {
                    class59.field1536 = 0;
                    class92.method766(class91.field2257, class27.field537, class69.method586(new class75[] { class45.method345(22978, class86.field2139 / 60), class68.field1742 }, (byte) 46), true);
                    if (--class86.field2139 <= 0) {
                        class5.field79 = 0;
                    }
                } else {
                    if (class5.field79 == 9 && class70.field1795.method753(0) >= 8) {
                        class32.field737 = class70.field1795.method759((byte) 83);
                        class114.field2879 = class70.field1795.method759((byte) 66) == 1;
                        class92.field2285 = class70.field1795.method759((byte) 86);
                        class92.field2285 <<= 0x8;
                        class92.field2285 += class70.field1795.method759((byte) 45);
                        class31.field695 = class70.field1795.method759((byte) 52);
                        class70.field1795.method760(0, class97.field2448.field1577, 1, 5000);
                        class97.field2448.field1556 = 0;
                        class107.field2692 = class97.field2448.method714((byte) -91);
                        class70.field1795.method760(0, class97.field2448.field1577, 2, 5000);
                        class97.field2448.field1556 = 0;
                        class27.field547 = class97.field2448.method507((byte) -29);
                        class5.field79 = 10;
                    }
                    if (class5.field79 != 10) {
                        class59.field1536++;
                        if (class59.field1536 > 2000) {
                            if (class84.field2062 < 1) {
                                class84.field2062++;
                                class5.field79 = 0;
                                if (class112.field2841 == class100.field2593) {
                                    class112.field2841 = class79.field2004;
                                } else {
                                    class112.field2841 = class100.field2593;
                                }
                            } else {
                                class112.method907(-3, 82);
                            }
                        }
                    } else if (class70.field1795.method753(0) >= class27.field547) {
                        class97.field2448.field1556 = 0;
                        class70.field1795.method760(0, class97.field2448.field1577, class27.field547, 5000);
                        class21.method153(0);
                        class3.field51 = -1;
                        class98.method822((byte) -5, false);
                        class107.field2692 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class84.field2062 < 1) {
                if (class112.field2841 == class100.field2593) {
                    class112.field2841 = class79.field2004;
                } else {
                    class112.field2841 = class100.field2593;
                }
                class84.field2062++;
                class5.field79 = 0;
            } else {
                class112.method907(-2, -127);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lka;IB)Lmc;", line = 1436)
    public static final class75 method77(class61 arg0, int arg1, byte arg2) {
        field156++;
        try {
            if (arg2 != 115) {
                return null;
            }
            class75 var3 = new class75();
            var3.field1869 = arg0.method498(-129);
            if (arg1 < var3.field1869) {
                var3.field1869 = arg1;
            }
            var3.field1912 = new byte[var3.field1869];
            arg0.field1556 += class38.field903.method315(var3.field1912, (byte) 108, 0, var3.field1869, arg0.field1577, arg0.field1556);
            return var3;
        } catch (Exception var4) {
            return class94.field2377;
        }
    }
}
