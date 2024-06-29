import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class312 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lfa;")
    private class156 field4443 = new class156(128);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lfs;")
    private class387 field4444;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
    public final void method1941(byte arg0, int arg1) {
        int var3 = 126 / ((49 - arg0) / 39);
        field4446++;
        class156 var4 = this.field4443;
        synchronized (this.field4443) {
            this.field4443.method1116(arg1, -50);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lsr;")
    public final class165 method1942(int arg0, int arg1) {
        field4447++;
        class156 var3 = this.field4443;
        class165 var4;
        synchronized (this.field4443) {
            var4 = (class165) this.field4443.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4444.method2363(arg1, 1, 90);
        class165 var6 = new class165();
        if (arg0 != -18411) {
            this.method1945(41);
        }
        if (var5 != null) {
            var6.method1169(-1, new class65(var5));
        }
        class156 var7 = this.field4443;
        synchronized (this.field4443) {
            this.field4443.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
    public static final void method1943(int arg0, int arg1, int arg2, int arg3) {
        class148 var4 = class422.field6240[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class386 var5 = var4.field2079;
        class386 var6 = var4.field2085;
        if (var5 != null) {
            var5.field5674 = var5.field5674 * arg3 / (0x10 << class527.field7754 - 7);
            var5.field5675 = var5.field5675 * arg3 / (0x10 << class527.field7754 - 7);
        }
        if (var6 != null) {
            var6.field5674 = var6.field5674 * arg3 / (0x10 << class527.field7754 - 7);
            var6.field5675 = var6.field5675 * arg3 / (0x10 << class527.field7754 - 7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public final void method1944(int arg0) {
        class156 var2 = this.field4443;
        synchronized (this.field4443) {
            if (arg0 <= 87) {
                this.method1945(71);
            }
            this.field4443.method1105(false);
        }
        field4445++;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class312(class446 arg0, int arg1, class387 arg2) {
        this.field4444 = arg2;
        this.field4444.method2367(1, 28724);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method1945(int arg0) {
        class156 var2 = this.field4443;
        synchronized (this.field4443) {
            this.field4443.method1119(80);
            if (arg0 != 7) {
                this.field4443 = null;
            }
        }
        field4448++;
    }

    static {
        new class331("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
