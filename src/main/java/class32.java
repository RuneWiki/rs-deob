import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class32 {

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "[B")
    public byte[] field538;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "[S")
    public short[] field531;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public int[] field528;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[S")
    public short[] field535;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[Lbd;")
    public class162[] field534;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lbd;")
    public static class162 field526 = class17.method142(0, " loggt sich aus)3");

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lbd;")
    public static class162 field532 = class17.method142(0, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lbd;")
    public static class162 field537 = class17.method142(0, "rect_debug=");

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field529 = 0;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lbd;")
    public static class162 field525 = class17.method142(0, ":clanreq:");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z", line = 7)
    public final boolean method259(byte arg0, int arg1) {
        field527++;
        if (arg0 != 58) {
            field525 = (class162) null;
        }
        return (this.field538[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I", line = 21)
    public final int method260(int arg0, int arg1) {
        field533++;
        if (arg0 != 4) {
            field537 = (class162) null;
        }
        return this.field538[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class258.field4293; var5++) {
            if (arg3 < (class214.field3593[var5] + class111.field2015[var5]) && class111.field2015[var5] < (arg3 + arg4) && arg0 < class283.field4799[var5] + class230.field3834[var5] && class230.field3834[var5] < (arg0 + arg2)) {
                class252.field4211[var5] = true;
            }
        }
        field540++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 79)
    public static void method262(byte arg0) {
        field526 = null;
        field532 = null;
        field525 = null;
        field537 = null;
        int var1 = 99 / ((arg0 - 34) / 60);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V", line = 102)
    public class32(int arg0) {
        this.field536 = arg0;
        this.field538 = new byte[this.field536];
        this.field531 = new short[this.field536];
        this.field528 = new int[this.field536];
        this.field535 = new short[this.field536];
        this.field534 = new class162[this.field536];
    }
}
