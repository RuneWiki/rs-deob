import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class394 {

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "Lvba;")
    public class36 field211;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "J")
    public static long field213 = -1L;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!qk", name = "mb", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qk", name = "lb", descriptor = "Lra;")
    public static class91 field214;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Let;)V")
    public class16(class511 arg0) {
        super(arg0);
        this.field211 = new class36(arg0);
        super.field5582 = new class247(super.field5557);
        super.field5600 = new class247(super.field5557);
        super.field5603 = new class247(super.field5557);
        super.field5608 = new class247(super.field5557);
        super.field5569 = new class247(super.field5557);
        super.field5585 = new class247(super.field5557);
        super.field5578 = new class247(super.field5557);
        super.field5575 = new class247(super.field5557);
        super.field5606 = new class247(super.field5557);
        super.field5577 = new class247(super.field5557);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public final void method180(int arg0) {
        ++field209;
        this.field211 = new class36(super.field5557);
        if (arg0 != -8191) {
            this.method180(-63);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
    public static final boolean method181(int arg0, int arg1, int arg2) {
        ++field212;
        if (arg2 != 16) {
            return false;
        } else {
            return (16 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method182(byte arg0) {
        field214 = null;
        if (arg0 > -26) {
            field210 = 28;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public static final void method183(byte arg0) {
        ++field208;
        class96.field1459.method570(false);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class31.field505[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 <= 112) {
            field213 = 46L;
        }
        while (var2 < 32) {
            class394.field5553[var2] = 0L;
            ++var2;
        }
        class49.field959 = 0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I")
    public static final int method184(int arg0, int arg1, int arg2) {
        ++field215;
        if (arg2 != 1501) {
            field213 = 107L;
        }
        int var3 = arg0 + -1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    static {
        new class104("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
