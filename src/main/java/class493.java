import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class493 {

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public int field7026 = 8;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public int field7028 = 16777215;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "Lmia;")
    public static class63 field7030 = new class63(78, 16);

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field7032 = 328;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public int field7020;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public int field7025;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "Leia;")
    public static class243 field7031;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Z")
    public boolean field7023;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
    public static void method2940(boolean arg0) {
        field7030 = null;
        if (arg0) {
            method2940(true);
        }
        field7031 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lrg;I)V")
    public final void method2941(class645 arg0, int arg1) {
        int var3 = 50 / ((67 - arg1) / 41);
        field7021++;
        while (true) {
            int var4 = arg0.method3745(-6314);
            if (var4 == 0) {
                return;
            }
            this.method2942(arg0, -126, var4);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lrg;II)V")
    private final void method2942(class645 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field7026 = arg0.method3712((byte) 63);
        } else if (arg2 == 2) {
            this.field7023 = true;
        } else if (arg2 == 3) {
            this.field7020 = arg0.method3756(65536);
            this.field7024 = arg0.method3756(65536);
            this.field7025 = arg0.method3756(65536);
        } else if (arg2 == 4) {
            this.field7022 = arg0.method3745(-6314);
        } else if (arg2 == 5) {
            this.field7027 = arg0.method3712((byte) -128);
        } else if (arg2 == 6) {
            this.field7028 = arg0.method3747((byte) -74);
        }
        int var4 = 113 / ((arg1 + 73) / 53);
        field7029++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)I")
    public static int method2943(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
