import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class100 extends class354 implements class738 {

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "[I")
    public static int[] field1320 = new int[256];

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "Loq;")
    public static class362 field1321;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "[I")
    public static int[] field1322;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field1320[var0] = var1;
        }
        field1321 = new class362();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lac;ILjaclib/memory/Buffer;IZ)V", line = 3)
    public class100(class541 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1316 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V", line = 17)
    public static void method688(int arg0) {
        field1322 = null;
        field1321 = null;
        field1320 = null;
        if (arg0 != -28614) {
            field1321 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)V", line = 29)
    public final void method689(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2052(0, arg0, arg2);
        ++field1319;
        this.field1316 = arg3;
        if (arg1 != 7896) {
            this.field1316 = -39;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)J", line = 41)
    public final long method690(int arg0) {
        ++field1315;
        if (arg0 != 24582) {
            field1322 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)I", line = 52)
    public final int method691(int arg0) {
        ++field1317;
        int var2 = -96 / ((arg0 - -19) / 45);
        return this.field1316;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lac;I[BIZ)V", line = 62)
    public class100(class541 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1316 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I", line = 72)
    public final int method692(int arg0) {
        ++field1318;
        return arg0 != -14112 ? 57 : super.field4728;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V", line = 86)
    public final void method693(int arg0) {
        super.field4717.method3030(this, arg0 + 34962);
        ++field1314;
        if (arg0 != 0) {
            this.method692(-28);
        }
    }
}
