import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class134 extends class1 {

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "Loc;")
    public static class151 field2441 = class137.method873(2, "");

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "Loc;")
    public static class151 field2443 = class137.method873(2, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Loh;")
    public static class156 field2438 = new class156(500);

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    private int field2439;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mf", name = "rb", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mf", name = "tb", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!mf", name = "ub", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
    public static final void method822(int arg0, int arg1) {
        if (arg1 != 0) {
            method825((byte) -26);
        }
        if (arg0 == -1 && !class149.field2669) {
            class1.method3(false);
        } else if (~arg0 != 0 && (class12.field247 != arg0 || !class193.method1216(0)) && class156.field2825 != 0 && !class149.field2669) {
            class20.method172(0, (byte) -87, 2, arg0, false, class16.field363, class156.field2825);
        }
        class12.field247 = arg0;
        ++field2446;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILpd;)V")
    public static final void method823(int arg0, class162 arg1) {
        if (arg0 <= 35) {
            field2441 = null;
        }
        class74.field1428 = arg1;
        ++field2450;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static void method824(int arg0) {
        int var1 = -15 / ((arg0 - 30) / 57);
        field2441 = null;
        field2443 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
    public static final void method825(byte arg0) {
        ++field2442;
        class192.field3433.method1317((byte) 58);
        if (arg0 != -104) {
            method823(-17, (class162) null);
        }
        class66.field1268.method1026(-1);
        class235.field4330.method1317((byte) -121);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field2445;
        if (arg1 != -81) {
            return null;
        } else {
            int[][] var3 = super.field13.method578(arg0, -1);
            if (super.field13.field1658) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                for (int var7 = 0; var7 < class202.field3603; ++var7) {
                    var4[var7] = this.field2439;
                    var6[var7] = this.field2436;
                    var5[var7] = this.field2449;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)V")
    private final void method826(int arg0, int arg1) {
        this.field2436 = 4080 & arg0 >> 4;
        ++field2437;
        this.field2449 = arg0 << 4 & 4080;
        this.field2439 = 4080 & arg0 >> 12;
        if (arg1 != 0) {
            method822(-74, -112);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field2440;
        if (arg1 == 0) {
            this.method826(arg2.method1450(-23209), 0);
        }
        if (arg0 != 0) {
            this.field2439 = 116;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    private class134(int arg0) {
        super(0, false);
        this.method826(arg0, 0);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class134() {
        this(0);
    }
}
