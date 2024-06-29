import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class131 extends class439 {

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "F")
    public float field2013;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "[Lil;")
    public static class7[] field2024 = new class7[6];

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "F")
    public static float field2012;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public static void method963(byte arg0) {
        field2024 = null;
        int var1 = 40 % ((arg0 - 62) / 62);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IF)V")
    public abstract void method651(int arg0, float arg1);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I")
    public final int method964(byte arg0) {
        if (arg0 >= -58) {
            method963((byte) 121);
        }
        field2011++;
        return this.field2026;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I")
    public final int method965(boolean arg0) {
        if (arg0) {
            this.field2021 = 105;
        }
        field2022++;
        return this.field2019;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
    public final int method966(int arg0) {
        int var2 = 98 % ((arg0 - 49) / 35);
        field2016++;
        return this.field2021;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)F")
    public final float method967(int arg0) {
        int var2 = 123 / ((-arg0 - 29) / 61);
        field2014++;
        return this.field2013;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)I")
    public final int method968(boolean arg0) {
        if (arg0) {
            this.method968(true);
        }
        field2023++;
        return this.field2018;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public abstract void method653(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)I")
    public final int method969(byte arg0) {
        field2020++;
        if (arg0 != -24) {
            field2015 = -96;
        }
        return this.field2017;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIF)V")
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2018 = arg4;
        this.field2019 = arg2;
        this.field2017 = arg1;
        this.field2021 = arg0;
        this.field2026 = arg3;
        this.field2013 = arg5;
    }
}
