import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class71 extends class270 {

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Z")
    public boolean field1228 = true;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[[I")
    public static int[][] field1218 = new int[128][128];

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Llo;")
    public static class306 field1223 = new class306("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Z")
    public static boolean field1234 = false;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
    public static boolean field1240 = false;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Lvv;")
    public static class313 field1238 = new class313(23, -2);

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Lc;")
    public static class202 field1242;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Ljd;")
    public class421 field1237;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[I")
    public int[] field1227;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "[Ljava/lang/String;")
    private String[] field1241;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[[I")
    private int[][] field1221;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I", line = 3)
    public final int method499(byte arg0) {
        field1225++;
        if (arg0 != -24) {
            this.field1221 = null;
        }
        return this.field1232 == null ? 0 : this.field1232.length;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)Lrr;", line = 20)
    public final class280 method500(int arg0, int arg1) {
        if (arg1 == 0) {
            field1226++;
            return this.field1232 == null || arg0 < 0 || arg0 > this.field1232.length ? null : class180.method1217(this.field1232[arg0], 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)I", line = 34)
    public final int method501(int arg0, int arg1, boolean arg2) {
        field1235++;
        if (this.field1232 == null || arg1 < 0 || this.field1232.length < arg1) {
            return -1;
        } else if (this.field1221[arg1] == null || arg0 < 0 || arg0 > this.field1221[arg1].length) {
            return -1;
        } else {
            if (arg2) {
                field1242 = null;
            }
            return this.field1221[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 56)
    public final void method502(boolean arg0) {
        if (this.field1227 != null) {
            for (int var2 = 0; var2 < this.field1227.length; var2++) {
                this.field1227[var2] = class338.method2141(this.field1227[var2], 32768);
            }
        }
        if (arg0) {
            field1224++;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V", line = 79)
    public static final void method503(byte arg0) {
        field1220++;
        int var1 = 103 % ((42 - arg0) / 43);
        if (class246.field4225 != null) {
            class246.field4225.method2867((byte) -120);
            class246.field4225 = null;
            class527.field7765 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLia;)V", line = 101)
    public final void method504(byte arg0, class23 arg1) {
        while (true) {
            int var3 = arg1.method126((byte) -109);
            if (var3 == 0) {
                if (arg0 <= 88) {
                    return;
                }
                field1236++;
                return;
            }
            this.method506(var3, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V", line = 123)
    public static final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= class182.field2877 && arg5 <= class235.field4076 && class29.field460 <= arg3 && class472.field6996 >= arg4) {
            class115.method923(arg4, arg1, 0, arg3, arg2, arg5);
        } else {
            class314.method1993((byte) 32, arg1, arg2, arg5, arg3, arg4);
        }
        if (arg0 < 67) {
            field1234 = true;
        }
        field1229++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILia;)V", line = 142)
    private final void method506(int arg0, int arg1, class23 arg2) {
        field1222++;
        if (arg1 != -1) {
            return;
        }
        if (arg0 == 1) {
            this.field1241 = class241.method1661('<', -20326, arg2.method156((byte) -25));
        } else if (arg0 == 2) {
            int var4 = arg2.method126((byte) -93);
            this.field1227 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1227[var5] = arg2.method132(61);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method126((byte) -72);
            this.field1232 = new int[var6];
            this.field1221 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method132(43);
                class280 var9 = class180.method1217(var8, arg1 + 1);
                if (var9 != null) {
                    this.field1232[var7] = var8;
                    this.field1221[var7] = new int[var9.field4595];
                    for (int var10 = 0; var10 < var9.field4595; var10++) {
                        this.field1221[var7][var10] = arg2.method132(class53.method369(arg1, -105));
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field1228 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(B)Ljava/lang/String;", line = 219)
    public final String method507(byte arg0) {
        field1219++;
        if (arg0 <= 58) {
            field1218 = null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1241 == null) {
            return "";
        }
        var2.append(this.field1241[0]);
        for (int var3 = 1; var3 < this.field1241.length; var3++) {
            var2.append("...");
            var2.append(this.field1241[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lia;I)Ljava/lang/String;", line = 255)
    public final String method508(class23 arg0, int arg1) {
        field1231++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1232 != null) {
            for (int var4 = 0; var4 < this.field1232.length; var4++) {
                var3.append(this.field1241[var4]);
                var3.append(this.field1237.method2587(arg0.method161(arg1 ^ 0x2F77, class180.method1217(this.field1232[var4], arg1 ^ 0x2F76).field4588), this.field1221[var4], (byte) -126, this.method500(var4, arg1 - 12150)));
            }
        }
        if (arg1 == 12150) {
            var3.append(this.field1241[this.field1241.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILqs;)V", line = 292)
    public static final void method509(int arg0, class496 arg1) {
        class191.field2972 = arg1.method2927("p11_full", -106);
        field1230++;
        class471.field6994 = arg1.method2927("p12_full", -78);
        class54.field874 = arg1.method2927("b12_full", -95);
        class200.field3187 = arg1.method2927("hitmarks", -55);
        class83.field1457 = arg1.method2927("hitbar_default", -58);
        class187.field2929 = arg1.method2927("timerbar_default", -87);
        class13.field155 = arg1.method2927("headicons_pk", -28);
        class437.field6532 = arg1.method2927("headicons_prayer", -67);
        class279.field4584 = arg1.method2927("hint_headicons", -69);
        class502.field7334 = arg1.method2927("hint_mapmarkers", -32);
        class422.field6376 = arg1.method2927("mapflag", -39);
        class204.field3235 = arg1.method2927("cross", -88);
        class129.field2218 = arg1.method2927("mapdots", -15);
        class57.field896 = arg1.method2927("scrollbar", -32);
        class350.field5476 = arg1.method2927("name_icons", -118);
        class64.field949 = arg1.method2927("floorshadows", -92);
        class441.field6577 = arg1.method2927("compass", -64);
        class429.field6439 = arg1.method2927("otherlevel", -82);
        int var2 = 12 % ((70 - arg0) / 46);
        class142.field2345 = arg1.method2927("hint_mapedge", -70);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lia;B[I)V", line = 320)
    public final void method510(class23 arg0, byte arg1, int[] arg2) {
        field1239++;
        if (this.field1232 == null) {
            return;
        }
        int var4 = -30 / ((arg1 + 55) / 41);
        for (int var5 = 0; var5 < this.field1232.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = this.method500(var5, 0).field4593;
            if (var6 > 0) {
                arg0.method177((long) arg2[var5], var6, (byte) 32);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 352)
    public static void method511(int arg0) {
        field1223 = null;
        field1218 = null;
        field1238 = null;
        field1242 = null;
        if (arg0 != 3335) {
            field1223 = null;
        }
    }
}
