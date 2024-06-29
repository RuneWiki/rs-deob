import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class7 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field79 = 1190717;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
    public boolean field78 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public int field77 = -1;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field82 = -1;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public int field84 = 8;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
    public boolean field83 = true;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public int field89 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field80 = 16;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field91 = 128;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Z")
    public boolean field81 = true;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lsf;")
    public static class108 field85 = class140.method973(255, "glissement:");

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lik;")
    public static class262 field86;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILrm;I)V", line = 13)
    private final void method39(int arg0, int arg1, class249 arg2, int arg3) {
        if (arg3 == 1) {
            this.field89 = class58.method400(-97, arg2.method1749(false));
        } else if (arg3 == 2) {
            this.field77 = arg2.method1731(true);
        } else if (arg3 == 3) {
            this.field77 = arg2.method1712(-1);
            if (this.field77 == 65535) {
                this.field77 = -1;
            }
        } else if (arg3 == 5) {
            this.field83 = false;
        } else if (arg3 == 7) {
            this.field82 = class58.method400(-128, arg2.method1749(false));
        } else if (arg3 == 8) {
            class145.field2622 = arg1;
        } else if (arg3 == 9) {
            this.field91 = arg2.method1712(arg0 ^ 0x3);
        } else if (arg3 == 10) {
            this.field81 = false;
        } else if (arg3 == 11) {
            this.field84 = arg2.method1731(true);
        } else if (arg3 == 12) {
            this.field78 = true;
        } else if (arg3 == 13) {
            this.field79 = arg2.method1749(false);
        } else if (arg3 == 14) {
            this.field80 = arg2.method1731(true);
        }
        if (arg0 == -4) {
            field92++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrm;Z)Lvk;", line = 80)
    public static final class173 method40(class249 arg0, boolean arg1) {
        field88++;
        class173 var2 = new class173(arg0.method1740(true), arg0.method1740(arg1), arg0.method1712(-1), arg0.method1712(-1), arg0.method1738(-1756395344), arg0.method1731(true) == 1);
        int var3 = arg0.method1731(true);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3158.method5(new class63(arg0.method1712(-1), arg0.method1712(-1), arg0.method1712(-1), arg0.method1712(-1)), (byte) -110);
        }
        var2.method1228((byte) 103);
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 109)
    public static void method41(byte arg0) {
        field86 = null;
        field85 = null;
        if (arg0 <= 29) {
            field86 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILrm;)V", line = 154)
    public final void method42(int arg0, int arg1, class249 arg2) {
        field90++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method1731(true);
            if (var4 == 0) {
                return;
            }
            this.method39(-4, arg0, arg2, var4);
        }
    }
}
