import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class372 extends class337 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lg;")
    public static class619 field4555;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
    public final boolean method2126(int arg0, int arg1) {
        if (arg1 != -1) {
            field4555 = null;
        }
        field4556++;
        return (this.field4547 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Z")
    public final boolean method2127(byte arg0) {
        if (arg0 != -57) {
            method2132(30);
        }
        field4546++;
        return (this.field4547 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
    public final int method2128(byte arg0) {
        field4552++;
        int var2 = -74 / ((-arg0 - 7) / 43);
        return (this.field4547 & 0x1CB61A) >> 18;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)Z")
    public final boolean method2129(boolean arg0) {
        field4554++;
        if (!arg0) {
            field4555 = null;
        }
        return ((this.field4547 & 0x3C14B0) >> 21) != 0;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)I")
    public final int method2130(byte arg0) {
        field4549++;
        int var2 = 74 % ((-arg0 - 28) / 49);
        return class25.method111(125, this.field4547);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FFIBF)F")
    public static final float method2131(float arg0, float arg1, int arg2, byte arg3, float arg4) {
        field4545++;
        if (arg3 >= -74) {
            field4550 = 75;
        }
        float[] var5 = class549.field6888[arg2];
        return var5[2] * arg1 + var5[0] * arg4 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method2132(int arg0) {
        if (arg0 != 1023) {
            field4550 = -57;
        }
        field4555 = null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)Z")
    public final boolean method2133(byte arg0) {
        field4544++;
        int var2 = 7 / ((arg0 + 19) / 52);
        return (this.field4547 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
    public class372(int arg0, int arg1) {
        this.field4547 = arg0;
        this.field4548 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)I")
    public static final int method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -89) {
            field4555 = null;
        }
        field4551++;
        int var5 = 65536 - class541.field6806[arg1 * 8192 / arg0] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static final void method2135(int arg0) {
        field4553++;
        if (class659.field8609) {
            return;
        }
        if (arg0 != 1) {
            method2132(-3);
        }
        class327.field4010 += (12.0F - class327.field4010) / 2.0F;
        class659.field8609 = true;
        class650.field8286 = true;
    }
}
