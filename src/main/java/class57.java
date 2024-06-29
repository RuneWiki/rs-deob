import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 extends class50 {

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lbb;")
    private class9 field1175;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "[I")
    public static int[] field1183 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lo;")
    public static class84 field1184 = class15.method124("Take @lre@", 255);

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lo;")
    private static class84 field1179 = class15.method124("Hidden", 255);

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lo;")
    public static class84 field1188 = field1179;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[I")
    public static int[] field1180 = new int[25];

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Lo;")
    public static class84 field1181 = class15.method124("(U2", 255);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lqd;")
    private class98 field1173;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    private boolean field1169;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "Z")
    private boolean field1187;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "[B")
    private byte[] field1189;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(JB)Lo;", line = 17)
    public static final class84 method463(long arg0, byte arg1) {
        field1182++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        int var3 = -104 / ((58 - arg1) / 54);
        if (arg0 % 37L == 0L) {
            return null;
        }
        int var4 = 0;
        long var5 = arg0;
        while (var5 != 0L) {
            var5 /= 37L;
            var4++;
        }
        byte[] var7 = new byte[var4];
        while (arg0 != 0L) {
            long var9 = arg0;
            arg0 /= 37L;
            var4--;
            var7[var4] = class8.field170[(int) (var9 - arg0 * 37L)];
        }
        class84 var8 = new class84();
        var8.field1869 = var7;
        var8.field1906 = var7.length;
        return var8;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V", line = 59)
    public final void method439(int arg0) {
        field1177++;
        if (arg0 != 1) {
            method464(104);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)V", line = 69)
    public final void method432(byte arg0, int arg1, int arg2) {
        field1186++;
        if (arg0 != -97) {
            this.field1169 = true;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        int var4 = class50.method436(arg2, (byte) 71) - arg1;
        if (this.field1173 != null) {
            this.field1178 = var4;
        } else if (this.field1187) {
            try {
                class18.method144(arg0 - 18669, "midibox.volume=" + var4 + ";", this.field1175.field187);
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V", line = 97)
    public static final void method464(int arg0) {
        field1190++;
        class104.method776(100);
        class106.method788(116);
        class69.method521((byte) -122);
        class100.method756((byte) -14);
        class86.method681(false);
        class37.method331((byte) 103);
        class101.method769((byte) -55);
        class16.method129(-30989);
        class89.method709((byte) 100);
        if (arg0 != 33554431) {
            field1181 = null;
        }
        class50.method430((byte) 116);
        class61.method485((byte) -95);
        class35.method327(123);
        ((class26) class7.field130).method195(true);
        class50.field1076.method899(arg0 ^ 0x1FFFFFF);
        class106.field2244.method899(0);
        class33.field641.method899(0);
        class41.field831.method899(arg0 - 33554431);
        class42.field867.method899(0);
        class104.field2197.method899(arg0 ^ 0x1FFFFFF);
        class31.field602.method899(0);
        class100.field2122.method899(0);
        class41.field828.method899(arg0 - 33554431);
        class99.field2108.method899(0);
        class86.field1970.method899(arg0 - 33554431);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 132)
    public final void method437(int arg0) {
        field1185++;
        if (arg0 != 128) {
            field1176 = 98;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 157)
    public final void method440(int arg0) {
        field1172++;
        if (this.field1173 == null || ~this.field1173.field2091 == arg0) {
            return;
        }
        if (this.field1173.field2091 == 1) {
            class22 var2 = (class22) this.field1173.field2093;
            try {
                var2.method174((byte) -117, 0, this.field1189.length, this.field1189);
                var2.method173(-1);
                try {
                    class18.method144(arg0 - 18765, "midibox.loop=" + (this.field1169 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method177(110).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1178 + ";", this.field1175.field187);
                    this.field1187 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method173(arg0);
                } catch (Exception var3) {
                }
            }
        }
        this.field1173 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)I", line = 193)
    public static final int method465(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 121) {
            method465(86, -21, 62, (byte) -109);
        }
        field1167++;
        if ((class73.field1544[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class73.field1544[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 218)
    public final void method429(byte arg0) {
        field1174++;
        if (this.field1187) {
            try {
                class18.method144(-18766, "midibox.src=\"c:/silence.mid\";", this.field1175.field187);
            } catch (Throwable var3) {
            }
            this.field1187 = false;
        }
        int var2 = 102 / ((-arg0 - 2) / 57);
        this.field1173 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB[BI)V", line = 237)
    public final void method438(boolean arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 2) {
            return;
        }
        field1171++;
        this.field1173 = this.field1175.method73(0);
        if (this.field1173 == null) {
            return;
        }
        if (arg3 == 0) {
            arg3 = 1;
        }
        this.field1178 = class50.method436(arg3, (byte) 55);
        this.field1169 = arg0;
        this.field1189 = arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILgb;II)V", line = 265)
    public static final void method466(int arg0, int arg1, class39 arg2, int arg3, int arg4) {
        if (arg3 <= 45) {
            return;
        }
        field1168++;
        if (class40.field805 >= 400) {
            return;
        }
        if (arg2.field763 != null) {
            arg2 = arg2.method347((byte) -118);
        }
        if (arg2 == null || !arg2.field786) {
            return;
        }
        class84 var5 = arg2.field787;
        if (arg2.field765 != 0) {
            var5 = class97.method746(0, new class84[] { var5, class17.method139(class107.field2271.field1305, (byte) 9, arg2.field765), class37.field723, class62.method489(arg2.field765, (byte) -126), class109.field2358 });
        }
        if (class93.field2048 == 1) {
            class26.method196(class97.method746(0, new class84[] { class33.field643, class106.field2255, class89.field2006, var5 }), 7, arg4, arg1, false, arg0);
            class82.field1765++;
        } else if (class30.field601 != 1) {
            class84[] var6 = arg2.field767;
            class64.field1331++;
            if (class42.field866) {
                var6 = class106.method790((byte) 112, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method669(class126.field2793, true)) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 56;
                        }
                        class118.field2575++;
                        if (var7 == 1) {
                            var8 = 17;
                        }
                        if (var7 == 2) {
                            var8 = 8;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 31;
                        }
                        class26.method196(class97.method746(0, new class84[] { var6[var7], class15.field277, var5 }), var8, arg4, arg1, false, arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method669(class126.field2793, true)) {
                        class114.field2479++;
                        short var10 = 0;
                        if (class107.field2271.field1305 < arg2.field765) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 56;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 17;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 8;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 22;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 31;
                        }
                        class26.method196(class97.method746(0, new class84[] { var6[var9], class15.field277, var5 }), var11, arg4, arg1, false, arg0);
                    }
                }
            }
            class26.method196(class97.method746(0, new class84[] { class49.field1051, var5 }), 1006, arg4, arg1, false, arg0);
            return;
        } else if ((class105.field2220 & 0x2) == 2) {
            class123.field2749++;
            class26.method196(class97.method746(0, new class84[] { class101.field2141, class15.field277, var5 }), 44, arg4, arg1, false, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 416)
    public static void method467(boolean arg0) {
        field1179 = null;
        field1188 = null;
        field1184 = null;
        if (!arg0) {
            method465(-111, -57, 50, (byte) 105);
        }
        field1181 = null;
        field1180 = null;
        field1183 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lbb;)V", line = 431)
    public class57(class9 arg0) {
        this.field1175 = arg0;
    }
}
