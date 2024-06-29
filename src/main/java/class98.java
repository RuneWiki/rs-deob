import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class216 {

    @OriginalMember(owner = "client!pj", name = "Fb", descriptor = "Ljava/lang/String;")
    public static String field1313 = "Please remove ";

    @OriginalMember(owner = "client!pj", name = "Ab", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!pj", name = "Bb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!pj", name = "Cb", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!pj", name = "Db", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!pj", name = "Eb", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!pj", name = "Gb", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!pj", name = "Hb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!pj", name = "Ib", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!pj", name = "Jb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!pj", name = "Kb", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!pj", name = "Mb", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!pj", name = "Nb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!pj", name = "Ob", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "Laa;")
    private class42 field1307;

    @OriginalMember(owner = "client!pj", name = "Lb", descriptor = "Ljava/awt/Image;")
    public static Image field1319;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BIBI)V")
    public final void method584(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -4) {
            this.method595(94, -47);
        }
        for (int var5 = 0; var5 < arg3; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field3030[super.field3021++] + -this.field1307.method264(-28992));
        }
        ++field1308;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
    public class98(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(B)V")
    public static void method585(byte arg0) {
        int var1 = -26 % ((-53 - arg0) / 43);
        field1313 = null;
        field1319 = null;
    }

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(I)V")
    public final void method586(int arg0) {
        if (arg0 != -9) {
            field1311 = -9;
        }
        this.field1322 = super.field3021 * 8;
        ++field1310;
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(B)V")
    public final void method587(byte arg0) {
        if (arg0 <= -97) {
            super.field3021 = (this.field1322 - -7) / 8;
            ++field1315;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B[I)V")
    public final void method588(byte arg0, int[] arg1) {
        ++field1317;
        this.field1307 = new class42(arg1);
        if (arg0 != 1) {
            field1319 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "(I)I")
    public final int method589(int arg0) {
        ++field1309;
        return arg0 >= -106 ? -47 : super.field3030[super.field3021++] - this.field1307.method264(-28992) & 255;
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(B)V")
    public static final void method590(byte arg0) {
        class203.field2883.method67((byte) -126);
        if (arg0 == 45) {
            ++field1316;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([II)[I")
    public static final int[] method591(int[] arg0, int arg1) {
        ++field1321;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            if (arg1 >= -56) {
                field1311 = -67;
            }
            class194.method1262(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
    public final void method592(int arg0, boolean arg1) {
        if (arg1) {
            method590((byte) 105);
        }
        ++field1314;
        super.field3030[super.field3021++] = (byte) (arg0 + this.field1307.method264(-28992));
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqi;B)Lba;")
    public static final class279 method593(class216 arg0, byte arg1) {
        ++field1318;
        if (arg1 != 99) {
            field1319 = null;
        }
        return new class279(arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1382(arg1 + -166), arg0.method1382(-75), arg0.method1407(118));
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(BI)I")
    public final int method594(byte arg0, int arg1) {
        int var3 = this.field1322 >> 3;
        if (arg0 < 87) {
            return 16;
        } else {
            int var4 = 8 - (7 & this.field1322);
            ++field1312;
            this.field1322 += arg1;
            int var5 = 0;
            while (~var4 > ~arg1) {
                var5 += (super.field3030[var3++] & class197.field2810[var4]) << arg1 - var4;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 == var4) {
                var6 = (class197.field2810[var4] & super.field3030[var3]) + var5;
            } else {
                var6 = (super.field3030[var3] >> -arg1 + var4 & class197.field2810[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(II)I")
    public final int method595(int arg0, int arg1) {
        ++field1320;
        if (arg1 >= -108) {
            this.method594((byte) 82, 25);
        }
        return arg0 * 8 + -this.field1322;
    }
}
