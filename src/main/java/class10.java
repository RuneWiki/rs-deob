import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class224 {

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "[I")
    public static int[] field141 = new int[2];

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Ljava/lang/String;")
    public static String field135 = "wave2:";

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "Ljava/lang/String;")
    public static String field146 = "glow3:";

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIILlk;I)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, int arg6) {
        int var7 = 112 / ((65 - arg1) / 59);
        class215.method1457(arg4, arg3, arg6, arg0, 13, arg5.field1226, arg5.field1273, arg2);
        ++field139;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            method61(-118);
        }
        ++field142;
        if (~arg1 == -1) {
            this.field144 = (arg0.method201(255) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static void method61(int arg0) {
        field141 = null;
        field146 = null;
        if (arg0 != 100) {
            field146 = null;
        }
        field135 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)I")
    public static final int method62(byte arg0) {
        int var1 = -57 / ((arg0 - 53) / 41);
        ++field137;
        return 2;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static final void method63(int arg0) {
        if (arg0 != 13371) {
            field135 = null;
        }
        ++field136;
        if (class54.field739 != null) {
            class54.field739.method399(false);
        }
        if (class239.field3821 != null) {
            class239.field3821.method399(false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field143;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field3625.method1862(arg0, (byte) 52);
            if (super.field3625.field4425) {
                class196.method1356(var3, 0, class78.field1108, this.field144);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    private class10(int arg0) {
        super(0, true);
        this.field144 = 4096;
        this.field144 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBZZI)V")
    public static final void method64(int arg0, int arg1, int arg2, byte arg3, boolean arg4, boolean arg5, int arg6) {
        ++field140;
        if (arg3 <= -39) {
            if (~arg0 == -4) {
                method64(class8.field124, arg1, -1, (byte) -45, true, true, -1);
            } else {
                Container var7;
                if (class154.field2291 == null) {
                    if (class215.field3519 != null) {
                        var7 = class215.field3519;
                    } else {
                        var7 = class2.field23.field237;
                    }
                } else {
                    var7 = class154.field2291;
                }
                class99.field1542 = var7.getSize().width;
                class19.field223 = var7.getSize().height;
                if (class215.field3519 == var7) {
                    Insets var8 = class215.field3519.getInsets();
                    class99.field1542 -= var8.right + var8.left;
                    class19.field223 -= var8.top - -var8.bottom;
                }
                if (arg0 < 2) {
                    class98.field1510 = 503;
                    class216.field3533 = 0;
                    class82.field1234 = (class99.field1542 + -765) / 2;
                    class135.field1960 = 765;
                } else {
                    class135.field1960 = class99.field1542;
                    class82.field1234 = 0;
                    class216.field3533 = 0;
                    class98.field1510 = class19.field223;
                }
                if (arg4) {
                    class286.method1904(class86.field1364, 5952);
                    class153.method1017(0, class86.field1364);
                    if (class40.field545 != null) {
                        class40.field545.method467(class86.field1364, (byte) 117);
                    }
                    class215.field3506.method983(-105);
                    class229.method1569(256, class86.field1364);
                    class222.method1508((byte) -122, class86.field1364);
                    if (class40.field545 != null) {
                        class40.field545.method465(20646, class86.field1364);
                    }
                } else {
                    class86.field1364.setSize(class135.field1960, class98.field1510);
                    if (class215.field3519 == var7) {
                        Insets var9 = class215.field3519.getInsets();
                        class86.field1364.setLocation(class82.field1234 + var9.left, class216.field3533 + var9.top);
                    } else {
                        class86.field1364.setLocation(class82.field1234, class216.field3533);
                    }
                }
                if (~arg0 < -1) {
                    method64(0, arg1, -1, (byte) -45, true, true, -1);
                } else {
                    class91.field1396 = !class26.method227(10920);
                    if (class242.field3880 != -1) {
                        class146.method969((byte) 88, true);
                    }
                    if (class240.field3833 != null && (~class203.field3182 == -31 || ~class203.field3182 == -26)) {
                        class79.method545(89);
                    }
                    for (int var10 = 0; var10 < 100; ++var10) {
                        class110.field1675[var10] = true;
                    }
                    class83.field1311 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class10() {
        this(4096);
    }
}
