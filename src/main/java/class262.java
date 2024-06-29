import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class262 {

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "B")
    public byte field4023;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Luj;")
    public class262 field4029;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lwt;")
    public static class205 field4018;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lul;")
    public static class406 field4020;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILuq;)V")
    public static final void method1747(int arg0, class114 arg1) {
        field4019++;
        if (class376.field5641 == arg1.field1739) {
            class277.field4219[arg1.field1717] = true;
        }
        if (arg0 != 20556) {
            method1749((byte) -3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1748(int arg0, byte arg1, int arg2) {
        field4032++;
        if (class362.method2273(22464, arg2, arg0)) {
            if (arg1 < 41) {
                field4018 = null;
            }
            return (arg0 & 0xB000) != 0 | class215.method1488(arg2, arg0, 0) | class216.method1500(73, arg0, arg2) ? true : (class379.method2380(arg0, arg2, 16384) | class220.method1585(arg0, arg2, -122)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method1749(byte arg0) {
        field4020 = null;
        field4018 = null;
        if (arg0 != -58) {
            method1749((byte) -95);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)Luj;")
    public final class262 method1750(int arg0, int arg1, byte arg2, int arg3) {
        field4030++;
        if (arg2 < 66) {
            this.field4028 = -36;
        }
        return new class262(this.field4017, arg3, arg1, arg0, this.field4023);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lgf;")
    public final class184 method1751(int arg0) {
        if (arg0 == -27973) {
            field4014++;
            return class488.method2910((byte) 127, this.field4017);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIB)V")
    public class262(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4017 = arg0;
        this.field4023 = arg4;
        this.field4026 = arg2;
        this.field4025 = arg1;
        this.field4027 = arg3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Luj;I)V")
    public class262(class262 arg0, int arg1) {
        this.field4029 = arg0;
        this.field4025 = this.field4029.field4025 + arg1;
        this.field4026 = this.field4029.field4026 + arg1;
        this.field4017 = this.field4029.field4017;
        this.field4027 = this.field4029.field4027 + arg1;
        this.field4023 = this.field4029.field4023;
    }
}
