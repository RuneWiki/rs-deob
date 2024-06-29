import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class194 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field3268 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[Lfc;")
    public static class241[] field3270 = new class241[50];

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field3278 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[Lpm;")
    public static class99[] field3272;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[[[S")
    public static short[][][] field3271;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILb;)V", line = 4)
    public final void method1431(int arg0, class94 arg1) {
        field3266++;
        if (arg0 != -1) {
            field3270 = (class241[]) null;
        }
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                return;
            }
            this.method1438(arg1, 50, var3);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 36)
    public static final void method1432(byte arg0) {
        class133.field2377.method1533(true);
        class184.field3177.method1533(true);
        field3275++;
        if (arg0 != -78) {
            method1435(127, (class143) null, 79, 90, (class143) null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1433(int arg0) {
        class133.field2377.method1529(false);
        field3269++;
        class184.field3177.method1529(false);
        if (arg0 != 50) {
            method1436(true);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[B)[B", line = 93)
    public static final byte[] method1434(byte arg0, byte[] arg1) {
        field3277++;
        class94 var2 = new class94(arg1);
        if (arg0 < 61) {
            field3270 = (class241[]) null;
        }
        int var3 = var2.method756(915905888);
        int var4 = var2.method747(false);
        if (var4 < 0 || !(class247.field4086 == 0 || var4 <= class247.field4086)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method726(-31267, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method747(false);
            if (var6 < 0 || !(class247.field4086 == 0 || class247.field4086 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class193.method1424(var7, var6, arg1, var4, 9);
            } else {
                class167.field2936.method20(var2, var7, false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILda;IILda;)Lbj;", line = 146)
    public static final class276 method1435(int arg0, class143 arg1, int arg2, int arg3, class143 arg4) {
        field3276++;
        if (class94.method757(arg4, arg2, -1908303920, arg0)) {
            int var5 = 119 % ((35 - arg3) / 48);
            return class269.method1840(-3, arg1.method1128(arg2, 0, arg0));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 173)
    public static void method1436(boolean arg0) {
        field3270 = null;
        field3272 = null;
        if (arg0) {
            field3271 = (short[][][]) ((short[][][]) null);
        }
        field3271 = (short[][][]) null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 185)
    public static final void method1437(int arg0) {
        field3265++;
        class95.field1739 = new class78[class231.field3865.method1140(-1)][];
        class46.field730 = new boolean[class231.field3865.method1140(arg0 ^ 0x5)];
        if (arg0 != -6) {
            field3272 = (class99[]) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lb;II)V", line = 197)
    private final void method1438(class94 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field3268 = arg0.method761((byte) 108);
        }
        if (arg1 != 50) {
            field3278 = 97;
        }
        field3274++;
    }
}
