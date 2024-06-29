import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class89 {

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Z")
    public boolean field1212 = false;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lfa;")
    private class156 field1214 = new class156(64);

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lfa;")
    public class156 field1219 = new class156(500);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lfa;")
    public class156 field1222 = new class156(30);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lfa;")
    public class156 field1223 = new class156(50);

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lfs;")
    private class387 field1218;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
    public boolean field1204;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lfs;")
    public class387 field1215;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    public static int[] field1217 = new int[250];

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[[I")
    public static int[][] field1220 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lib;")
    public static class106 field1216 = new class106(64);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1211;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "[[Z")
    public static boolean[][] field1221;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 9)
    public final void method781(byte arg0) {
        field1209++;
        class156 var2 = this.field1214;
        synchronized (this.field1214) {
            if (arg0 != -24) {
                this.method784(25, true);
            }
            this.field1214.method1105(false);
        }
        class156 var3 = this.field1219;
        synchronized (this.field1219) {
            this.field1219.method1105(false);
        }
        class156 var4 = this.field1222;
        synchronized (this.field1222) {
            this.field1222.method1105(false);
        }
        class156 var5 = this.field1223;
        synchronized (this.field1223) {
            this.field1223.method1105(false);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 34)
    public final void method782(int arg0, int arg1) {
        class156 var3 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method1116(arg0, -50);
        }
        field1203++;
        class156 var4 = this.field1219;
        synchronized (this.field1219) {
            this.field1219.method1116(arg0, -50);
        }
        class156 var5 = this.field1222;
        synchronized (this.field1222) {
            this.field1222.method1116(arg0, arg1 - 56);
        }
        class156 var6 = this.field1223;
        synchronized (this.field1223) {
            this.field1223.method1116(arg0, -50);
            if (arg1 != 6) {
                this.method781((byte) 34);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 63)
    public final void method783(byte arg0) {
        field1213++;
        class156 var2 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method1119(82);
        }
        class156 var3 = this.field1219;
        synchronized (this.field1219) {
            this.field1219.method1119(102);
        }
        class156 var4 = this.field1222;
        synchronized (this.field1222) {
            this.field1222.method1119(90);
            int var5 = 59 % ((arg0 - 12) / 54);
        }
        class156 var6 = this.field1223;
        synchronized (this.field1223) {
            this.field1223.method1119(87);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V", line = 84)
    public final void method784(int arg0, boolean arg1) {
        field1201++;
        this.field1224 = arg0;
        class156 var3 = this.field1219;
        synchronized (this.field1219) {
            this.field1219.method1105(arg1);
        }
        class156 var4 = this.field1222;
        synchronized (this.field1222) {
            this.field1222.method1105(arg1);
        }
        class156 var5 = this.field1223;
        synchronized (this.field1223) {
            this.field1223.method1105(arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljk;IZLfs;Lfs;)V", line = 351)
    public class89(class446 arg0, int arg1, boolean arg2, class387 arg3, class387 arg4) {
        this.field1218 = arg3;
        this.field1204 = arg2;
        this.field1215 = arg4;
        if (this.field1218 != null) {
            int var6 = this.field1218.method2359((byte) 39) - 1;
            this.field1218.method2367(var6, 28724);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 107)
    public static void method785(boolean arg0) {
        field1217 = null;
        if (arg0) {
            field1216 = null;
        }
        field1216 = null;
        field1220 = null;
        field1221 = null;
        field1211 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Lrd;", line = 121)
    public final class222 method786(int arg0, int arg1) {
        field1202++;
        if (arg1 != 0) {
            field1221 = null;
        }
        class156 var3 = this.field1214;
        class222 var4;
        synchronized (this.field1214) {
            var4 = (class222) this.field1214.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1218.method2363(class372.method2295(arg0, (byte) -98), class133.method1020(arg0, false), 89);
        class222 var6 = new class222();
        var6.field3220 = this;
        var6.field3217 = arg0;
        if (var5 != null) {
            var6.method1521(new class65(var5), 95);
        }
        var6.method1506((byte) -73);
        if (!this.field1204 && var6.field3228) {
            var6.field3205 = null;
            var6.field3245 = null;
        }
        if (var6.field3187) {
            var6.field3267 = 0;
            var6.field3230 = false;
        }
        class156 var7 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method1107(1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V", line = 166)
    public static final void method787(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class225.field3300 = class38.method296(class467.field6850, class478.field7044.field3335 * 2, class148.field2081, arg2, (byte) 62, class498.field7404);
        } else {
            if (arg1) {
                class225.field3300 = class38.method296(class467.field6850, 0, class148.field2081, 0, (byte) 90, class498.field7404);
                class225.field3300.method381(0);
                class316 var3 = class88.method775(6, 0, class398.field5888, class55.field584);
                class314 var4 = class225.field3300.method343(var3, class218.method1497(class240.field3533, class398.field5888, 0), true);
                class195.method1364(true, class179.field2529.method2031(true, class377.field5585), var4, 13);
                class225.field3300.method302();
                class175.method1228((byte) 118);
                class225.field3300.method333(true);
            }
            try {
                class225.field3300 = class38.method296(class467.field6850, class478.field7044.field3335 * 2, class148.field2081, arg2, (byte) -30, class498.field7404);
                if (class225.field3300.method377()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class53 var6;
                    if (var5) {
                        var6 = class225.field3300.method354(146800640);
                    } else {
                        var6 = class225.field3300.method354(104857600);
                    }
                    class225.field3300.method299(var6);
                }
            } catch (Throwable var8) {
                class225.field3300 = class38.method296(class467.field6850, 0, class148.field2081, 0, (byte) 109, class498.field7404);
                arg2 = 0;
            }
        }
        field1205++;
        if (arg0 != -27345) {
            field1220 = null;
        }
        class65.field802 = arg2;
        class170.method1194((byte) 3);
        if (!class225.field3300.method326()) {
            class176.field2498 = 1;
        }
        class225.field3300.method353(class176.field2498);
        class225.field3300.method340(0);
        class225.field3300.method360(8);
        class462.field6798 = class225.field3300.method341();
        class264.field3903 = class225.field3300.method341();
        class185.method1300(17569);
        class225.field3300.method290(!class478.field7044.field3333);
        if (class225.field3300.method312()) {
            class128.method994(-14734, class478.field7044.field3343);
        }
        class530.method3130(class457.field6713 >> 3, class225.field3300, class397.field5828 >> 3, 92);
        class284.method1815((byte) -36);
        class247.field3663 = false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BZ)V", line = 245)
    public final void method788(byte arg0, boolean arg1) {
        field1206++;
        if (arg1 == this.field1212) {
            return;
        }
        this.field1212 = arg1;
        this.method781((byte) -24);
        if (arg0 != 114) {
            field1220 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILya;IIIIIIIII[[[B)V", line = 262)
    public static final void method789(int arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field1207++;
        if (arg10 == 0 || arg1 == 0) {
            return;
        }
        if (arg3 != 6) {
            method789(-11, -30, null, 82, -115, 83, -89, -83, -21, 111, 95, -96, null);
        }
        if (arg10 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg10 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        arg2.method373(arg8, arg9, arg5, arg6, arg4, arg11, arg12[arg10 - 1][arg0], arg1, arg7);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)V", line = 297)
    public final void method790(boolean arg0, byte arg1) {
        field1210++;
        if (arg1 > 119 && arg0 != this.field1204) {
            this.field1204 = arg0;
            this.method781((byte) -24);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V", line = 320)
    public final void method791(int arg0, int arg1) {
        field1208++;
        if (arg0 != -27578) {
            this.field1204 = true;
        }
        this.field1214 = new class156(arg1);
    }
}
