import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class13 extends class171 {

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public int field203 = 0;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lha;")
    private static class46 field202 = class271.method1828("Opened title screen", -46);

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lha;")
    public static class46 field207 = field202;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILwe;I)V")
    private final void method70(int arg0, class75 arg1, int arg2) {
        if (arg2 == 2) {
            this.field203 = arg1.method545((byte) 57);
        }
        if (arg0 != 0) {
            this.field203 = 101;
        }
        field201++;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public static void method71(int arg0) {
        if (arg0 != 0) {
            method73(-12, 55);
        }
        field202 = null;
        field207 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lwe;I)V")
    public final void method72(class75 arg0, int arg1) {
        field204++;
        if (arg1 != 0) {
            this.field203 = -90;
        }
        while (true) {
            int var3 = arg0.method558(arg1 ^ 0x1);
            if (var3 == 0) {
                return;
            }
            this.method70(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lhi;")
    public static final class24 method73(int arg0, int arg1) {
        field206++;
        if (arg0 != 1506528624) {
            field207 = null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class215.field3809[var2] == null || class215.field3809[var2][var3] == null) {
            boolean var4 = class175.method1259(var2, (byte) 114);
            if (!var4) {
                return null;
            }
        }
        return class215.field3809[var2][var3];
    }
}
