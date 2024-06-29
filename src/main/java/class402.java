import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class402 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Z")
    public boolean field5762 = false;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    public static int[] field5764 = new int[2048];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lqu;")
    public static class364 field5756 = new class364(30, 3);

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lhd;")
    public class270 field5757;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lhd;")
    public static class270 field5766;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILps;I)V")
    private final void method2408(int arg0, class428 arg1, int arg2) {
        if (arg0 != 2) {
            method2411(true, 114);
        }
        field5759++;
        if (arg2 == 1) {
            this.field5763 = arg1.method2620(45);
        } else if (arg2 == 2) {
            this.field5768 = arg1.method2601(22);
        } else if (arg2 == 3) {
            this.field5762 = true;
            return;
        } else if (arg2 == 4) {
            this.field5763 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILps;)V")
    public final void method2409(int arg0, class428 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2561((byte) 127);
            if (var3 == 0) {
                field5761++;
                return;
            }
            this.method2408(2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static void method2410(byte arg0) {
        field5764 = null;
        field5766 = null;
        if (arg0 != 74) {
            field5766 = null;
        }
        field5756 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
    public static final void method2411(boolean arg0, int arg1) {
        class644.field9342 = 0;
        class34.field368 = 0;
        field5765++;
        if (arg1 < 29) {
            method2410((byte) 108);
        }
        class277.method1751(-3);
        class522.method3089(6, arg0);
        class128.method796((byte) -66);
        boolean var2 = false;
        for (int var3 = 0; var3 < class34.field368; var3++) {
            int var5 = class19.field179[var3];
            class234 var6 = (class234) class627.field9185.method1333((long) var5, false);
            class383 var7 = var6.field3443;
            if (class139.field1826 && class428.method2592(var5, (byte) 6)) {
                class502.method3015(false);
            }
            if (class576.field8505 != var7.field1022) {
                if (var7.field5601.method2631((byte) -78)) {
                    class292.method1807(9107, var7);
                }
                var7.method2322(null, -31902);
                var6.method2997(1);
                var2 = true;
            }
        }
        if (var2) {
            class350.field5086 = class627.field9185.method1337(0);
            class627.field9185.method1335(class579.field8530, 0);
        }
        if (class425.field6072 != class271.field4010.field6221) {
            throw new RuntimeException("gnp1 pos:" + class271.field4010.field6221 + " psize:" + class425.field6072);
        }
        for (int var4 = 0; var4 < class567.field8409; var4++) {
            if (class627.field9185.method1333((long) class25.field230[var4], false) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class567.field8409);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
    public final boolean method2412(int arg0) {
        field5760++;
        return arg0 == 0 ? this.field5757.field3998.method3491(108, this.field5763) : false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLqa;BI)Lha;")
    public final class116 method2413(boolean arg0, class167 arg1, byte arg2, int arg3) {
        field5758++;
        if (arg2 != -56) {
            return null;
        }
        long var5 = (long) ((arg0 ? 262144 : 0) | this.field5763 | arg3 << 16 | arg1.field2264 << 19);
        class116 var7 = (class116) this.field5757.field3999.method2025(var5, 2);
        if (var7 != null) {
            return var7;
        } else if (this.field5757.field3998.method3491(119, this.field5763)) {
            class610 var8 = class610.method3555(this.field5757.field3998, this.field5763, 0);
            if (var8 != null) {
                var8.field8969 = var8.field8971 = var8.field8968 = var8.field8973 = 0;
                if (arg0) {
                    var8.method3545();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method3556();
                }
            }
            class116 var10 = arg1.method961(var8, true);
            if (var10 != null) {
                this.field5757.field3999.method2029(false, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }
}
