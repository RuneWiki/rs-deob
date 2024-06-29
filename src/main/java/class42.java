import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class42 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "B")
    public byte field525;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lqh;")
    public class42 field512;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "J")
    public static long field517;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "F")
    public static float field519;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public int field524;

    static {
        new class362("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field517 = 0L;
        field515 = 1;
        field516 = 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I", line = 3)
    public static final int method256(byte arg0, int arg1, int arg2) {
        field518++;
        int var3 = -75 / ((arg0 + 41) / 58);
        int var4 = class246.method1677(arg1 + 91923, 4, -11346, arg2 + 45365) + (class246.method1677(arg1 + 37821, 2, -11346, arg2 + 10294) - 128 >> 1) + (class246.method1677(arg1, 1, -11346, arg2) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)V", line = 33)
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= class81.field946 && arg3 <= class235.field3295 && class388.field5464 <= arg5 && arg6 <= class219.field3080) {
            if (arg2 == 1) {
                class411.method2622(arg3, arg0, arg6, arg1, arg5, -1);
            } else {
                class393.method2507(0, arg6, arg3, arg5, arg0, arg2, arg1);
            }
        } else if (arg2 == 1) {
            class65.method371(arg6, arg1, arg3, arg5, arg0, (byte) 120);
        } else {
            class329.method2125(arg6, arg2, arg5, arg3, arg1, arg0, -17462);
        }
        if (arg4 == 60) {
            field511++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V", line = 66)
    public static final void method258(boolean arg0, int arg1) {
        class3.field27 = arg1;
        class204.field2928 = -1;
        class152.field1877 = 100;
        class327.field4643 = 3;
        if (arg0) {
            field515 = 24;
        }
        field504++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIB)V", line = 110)
    public class42(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field507 = arg3;
        this.field510 = arg0;
        this.field513 = arg1;
        this.field525 = arg4;
        this.field508 = arg2;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqh;I)V", line = 121)
    public class42(class42 arg0, int arg1) {
        this.field512 = arg0;
        this.field508 = this.field512.field508 + arg1;
        this.field513 = this.field512.field513 + arg1;
        this.field510 = this.field512.field510;
        this.field525 = this.field512.field525;
        this.field507 = this.field512.field507 + arg1;
    }
}
