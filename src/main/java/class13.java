import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class13 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
    public boolean field167 = false;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field169 = 128;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Loh;")
    public static class187 field165;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "[Loh;")
    public static class187[] field175;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lfh;IZ)V", line = 6)
    public final void method92(class313 arg0, int arg1, boolean arg2) {
        field174++;
        if (arg2) {
            field169 = 25;
        }
        while (true) {
            int var4 = arg0.method2224(-121);
            if (var4 == 0) {
                return;
            }
            this.method93(arg0, 114, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lfh;III)V", line = 29)
    private final void method93(class313 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field170 = arg0.method2250(-1613178296);
        } else if (arg2 == 2) {
            this.field176 = arg0.method2249(-39);
        } else if (arg2 == 3) {
            this.field167 = true;
        } else if (arg2 == 4) {
            this.field170 = -1;
        }
        if (arg1 < 90) {
            this.method93((class313) null, -115, 51, -70);
        }
        field173++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 66)
    public static void method94(byte arg0) {
        field165 = null;
        if (arg0 != 66) {
            field175 = (class187[]) null;
        }
        field175 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V", line = 79)
    public static final void method95(int arg0, int arg1) {
        field164++;
        int var2 = -74 % ((37 - arg1) / 52);
        class211 var3 = class17.method115(2, arg0, 4086);
        var3.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)J", line = 92)
    public static final long method96(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null || var3.field733 == null ? 0L : var3.field733.field1237;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 108)
    public static final void method97(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field172++;
        if (class49.field717) {
            return;
        }
        if (class307.field5005) {
            class355.field5628 = (float) ((int) class355.field5628 - 65 & 0xFFFFFF80);
        } else {
            class41.field629 += (-class41.field629 - 24.0F) / 2.0F;
        }
        class49.field717 = true;
        class58.field884 = true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)Lfo;", line = 135)
    public final class239 method98(boolean arg0, int arg1, int arg2) {
        field177++;
        class239 var4 = (class239) class154.field2511.method652((long) ((arg0 ? 262144 : 0) | this.field170 | arg2 << 16), false);
        if (var4 != null) {
            return var4;
        }
        class99.field1438.method1519(false, this.field170);
        class239 var5 = class310.method2168(arg1, class99.field1438, this.field170, (byte) 106);
        if (var5 != null) {
            var5.method1682(class150.field2419, class3.field27, class222.field3435);
            var5.field2917 = var5.field2915;
            var5.field2909 = var5.field2913;
            if (arg0) {
                var5.method1670();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1677();
            }
            class154.field2511.method642(var5, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field170), -100);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I[JZII)V", line = 173)
    public static final void method99(int[] arg0, long[] arg1, boolean arg2, int arg3, int arg4) {
        field178++;
        if (arg2 || arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        int var9 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var9;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg1[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                int var13 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var13;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var9;
        method99(arg0, arg1, false, arg3, var6 - 1);
        method99(arg0, arg1, false, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V", line = 228)
    public static final void method100(int arg0, int arg1) {
        field166++;
        if (!class31.method266(arg1, 1)) {
            return;
        }
        class264[] var2 = class167.field2627[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class264 var4 = var2[var3];
            if (var4 != null) {
                var4.field4285 = 0;
                var4.field4301 = 1;
                var4.field4313 = 0;
            }
        }
        if (arg0 >= -59) {
            field169 = -28;
        }
    }
}
