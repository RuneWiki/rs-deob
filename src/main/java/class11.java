import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class11 extends class252 {

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field213 = 0;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[S")
    public static short[] field209 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Z")
    public static boolean field214 = false;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "C")
    private char field205;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Ljava/lang/String;")
    public String field206;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)Z")
    public final boolean method87(byte arg0) {
        field203++;
        int var2 = 6 / ((arg0 - 29) / 62);
        return this.field205 == 's';
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)I")
    public static final int method88(int arg0, boolean arg1, int arg2) {
        field208++;
        int var3 = arg0 * 57 + arg2;
        if (arg1) {
            field209 = null;
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILfj;)V")
    private final void method89(int arg0, int arg1, class274 arg2) {
        field207++;
        if (arg1 == 1) {
            this.field205 = class88.method614(arg2.method1830((byte) -100), (byte) -85);
        } else if (arg1 == 2) {
            this.field204 = arg2.method1833((byte) -104);
        } else if (arg1 == 5) {
            this.field206 = arg2.method1855(arg0 + 7010);
        }
        if (arg0 != -7082) {
            method91(-114);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILfj;)V")
    public final void method90(int arg0, class274 arg1) {
        field212++;
        while (true) {
            int var3 = arg1.method1849(255);
            if (var3 == 0) {
                if (arg0 == 1515094893) {
                    return;
                } else {
                    this.method90(-57, (class274) null);
                    return;
                }
            }
            this.method89(-7082, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static void method91(int arg0) {
        if (arg0 == 22464) {
            field209 = null;
        }
    }
}
