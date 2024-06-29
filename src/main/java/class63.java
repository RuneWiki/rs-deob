import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 extends class337 implements class637 {

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "[F")
    public static float[] field833 = new float[4];

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lrn;")
    public static class633 field827 = new class633(85, -1);

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "C")
    public char field832;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "J")
    public long field823;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I", line = 3)
    public final int method369(int arg0) {
        field830++;
        int var2 = 96 / ((-arg0 - 4) / 33);
        return this.field826;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)I", line = 18)
    public final int method370(byte arg0) {
        field825++;
        if (arg0 != 65) {
            this.method374((byte) 105);
        }
        return this.field824;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I", line = 29)
    public final int method371(boolean arg0) {
        if (arg0) {
            this.method371(true);
        }
        field822++;
        return this.field831;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 42)
    public static void method372(int arg0) {
        if (arg0 != -31330) {
            field833 = null;
        }
        field827 = null;
        field833 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZBII)I", line = 54)
    public static final int method373(boolean arg0, byte arg1, int arg2, int arg3) {
        field820++;
        if (arg1 != 70) {
            method373(false, (byte) 90, 28, -23);
        }
        class148 var4 = class398.method2306(arg2, arg0, (byte) 41);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field1892.length > arg3) {
            return var4.field1892[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)J", line = 74)
    public final long method374(byte arg0) {
        if (arg0 != -70) {
            this.field826 = -86;
        }
        field834++;
        return this.field823;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)C", line = 88)
    public final char method375(int arg0) {
        field821++;
        if (arg0 != 3206) {
            this.field831 = 100;
        }
        return this.field832;
    }
}
