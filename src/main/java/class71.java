import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class71 extends class235 {

    @OriginalMember(owner = "client!p", name = "E", descriptor = "[Lbe;")
    public class14[] field1140 = new class14[5];

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public int field1153 = 0;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "[I")
    public int[] field1159 = new int[5];

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "[I")
    public static int[] field1147 = new int[256];

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1130 = 0;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lcd;")
    public static class106 field1129 = new class106();

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Lsb;")
    private static class98 field1158 = class47.method368("Drop", 0);

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Lsb;")
    public static class98 field1160 = field1158;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lv;")
    public class205 field1133;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "Lid;")
    public class207 field1157;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Ljk;")
    public class225 field1141;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lcg;")
    public class42 field1155;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lld;")
    public class53 field1132;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lm;")
    public class59 field1131;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "Lp;")
    public class71 field1161;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Lfa;")
    public static class77 field1162;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Z")
    public boolean field1146;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Z")
    public boolean field1150;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Z")
    public boolean field1154;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method492(int arg0) {
        if (arg0 < 20) {
            field1158 = null;
        }
        field1158 = null;
        field1129 = null;
        field1147 = null;
        field1162 = null;
        field1160 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(III)V")
    public class71(int arg0, int arg1, int arg2) {
        this.field1156 = this.field1151 = arg0;
        this.field1152 = arg1;
        this.field1144 = arg2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI[Lj;I)V")
    public static final void method493(byte arg0, int arg1, class189[] arg2, int arg3) {
        if (arg0 >= -40) {
            field1129 = null;
        }
        if (arg1 > arg3) {
            int var4 = arg3 - 1;
            int var5 = arg1 + 1;
            int var6 = (arg1 + arg3) / 2;
            class189 var7 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class202.field3451[var9] == 2) {
                            var10 = var7.field3266;
                            var11 = arg2[var5].field3266;
                        } else if (class202.field3451[var9] == 1) {
                            var10 = var7.field3265;
                            if (var10 == -1 && class43.field724[var9] == 1) {
                                var10 = 2001;
                            }
                            var11 = arg2[var5].field3265;
                            if (var11 == -1 && class43.field724[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class202.field3451[var9] == 3) {
                            var10 = var7.field3269 ? 1 : 0;
                            var11 = arg2[var5].field3269 ? 1 : 0;
                        } else {
                            var11 = arg2[var5].field3276;
                            var10 = var7.field3276;
                        }
                        if (var10 != var11) {
                            if ((class43.field724[var9] != 1 || var11 <= var10) && (class43.field724[var9] != 0 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class202.field3451[var13] == 2) {
                            var14 = arg2[var4].field3266;
                            var15 = var7.field3266;
                        } else if (class202.field3451[var13] == 1) {
                            var15 = var7.field3265;
                            if (var15 == -1 && class43.field724[var13] == 1) {
                                var15 = 2001;
                            }
                            var14 = arg2[var4].field3265;
                            if (var14 == -1 && class43.field724[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class202.field3451[var13] == 3) {
                            var14 = arg2[var4].field3269 ? 1 : 0;
                            var15 = var7.field3269 ? 1 : 0;
                        } else {
                            var14 = arg2[var4].field3276;
                            var15 = var7.field3276;
                        }
                        if (var14 != var15) {
                            if ((class43.field724[var13] != 1 || var14 >= var15) && (class43.field724[var13] != 0 || var14 <= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var5 > var4) {
                    class189 var16 = arg2[var4];
                    arg2[var4] = arg2[var5];
                    arg2[var5] = var16;
                }
            }
            method493((byte) -117, var5, arg2, arg3);
            method493((byte) -60, arg1, arg2, var5 + 1);
        }
        field1135++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BJ)V")
    public static final void method494(byte arg0, long arg1) {
        field1142++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class191.field3318; var3++) {
            if (class228.field3926[var3] == arg1) {
                class15.field285++;
                class191.field3318--;
                for (int var4 = var3; var4 < class191.field3318; var4++) {
                    class228.field3926[var4] = class228.field3926[var4 + 1];
                    class181.field3131[var4] = class181.field3131[var4 + 1];
                }
                class237.field4093 = class186.field3214;
                class237.field4084.method490(162, -113);
                class237.field4084.method1484(arg1, (byte) 38);
                break;
            }
        }
        if (arg0 != -25) {
            field1129 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lne;III)V")
    public static final void method495(class108 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field1147 = null;
        }
        if (arg0.field4503 == arg2 && arg2 != -1) {
            class138 var4 = class16.method144(1, arg2);
            int var5 = var4.field2448;
            if (var5 == 1) {
                arg0.field4478 = 0;
                arg0.field4502 = 0;
                arg0.field4483 = 0;
                arg0.field4474 = arg3;
                class114.method850(false, arg0.field4492, arg0.field4466, arg0.field4502, var4, arg1 ^ 0x1000);
            }
            if (var5 == 2) {
                arg0.field4478 = 0;
            }
        } else if (arg2 == -1 || arg0.field4503 == -1 || class16.method144(arg1 + 1, arg2).field2438 >= class16.method144(arg1 ^ 0x1, arg0.field4503).field2438) {
            arg0.field4503 = arg2;
            arg0.field4483 = 0;
            arg0.field4482 = arg0.field4496;
            arg0.field4502 = 0;
            arg0.field4474 = arg3;
            arg0.field4478 = 0;
            if (arg0.field4503 != -1) {
                class114.method850(false, arg0.field4492, arg0.field4466, arg0.field4502, class16.method144(arg1 ^ 0x1, arg0.field4503), 4096);
            }
        }
        field1143++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method496(int arg0) {
        field1163++;
        if (arg0 <= 98) {
            method495((class108) null, 56, 85, -68);
        }
        if (class81.field1427 == 5) {
            class81.field1427 = 6;
        }
    }
}
