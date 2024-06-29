import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class189 extends class379 {

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Z")
    private boolean field2776 = false;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public int field2777 = 0;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "Z")
    public boolean field2781 = false;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lgn;")
    private class493 field2774 = new class493();

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    private int field2784 = 0;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "Lpk;")
    public class133 field2783 = new class133();

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "Z")
    private boolean field2786 = false;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Lmc;")
    public class88 field2792 = new class88();

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "[Llb;")
    public class378[] field2779 = new class378[8192];

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "J")
    private long field2775;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "J")
    private long field2782;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "[Z")
    private static boolean[] field2778 = new boolean[8];

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "[Z")
    private static boolean[] field2780 = new boolean[8];

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 3)
    public final void method1324() {
        this.field2786 = true;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V", line = 6)
    public final void method1325() {
        this.field2781 = true;
        for (class290 var1 = (class290) this.field2783.method1018(125); var1 != null; var1 = (class290) this.field2783.method1022((byte) -112)) {
            if (var1.field4160.field3836 == 1) {
                var1.method2307((byte) 115);
            }
        }
        this.field2779 = new class378[8192];
        this.field2777 = 0;
        this.field2774 = new class493();
        this.field2784 = 0;
        this.field2783 = new class133();
        this.field2788 = 0;
        this.method2322(1024);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()V", line = 27)
    public final void method1326() {
        this.field2776 = true;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()V", line = 30)
    public static void method1327() {
        field2780 = null;
        field2778 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(J)V", line = 34)
    public final void method1328(long arg0) {
        this.field2775 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lya;J[Lbu;[Lpf;Z)V", line = 37)
    public final void method1329(class38 arg0, long arg1, class17[] arg2, class410[] arg3, boolean arg4) {
        if (!this.field2781) {
            this.method1335(arg0, arg2, arg4);
            this.method1333(arg3, arg4);
            this.field2775 = arg1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()V", line = 45)
    public final void method1330() {
        this.field2792.field1190.method2287(125);
        for (class526 var1 = (class526) this.field2774.method2955(62); var1 != null; var1 = (class526) this.field2774.method2952((byte) -71)) {
            var1.method3123(true, this.field2782);
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()Lmc;", line = 57)
    public final class88 method1331() {
        return this.field2792;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lya;J)Z", line = 61)
    public final boolean method1332(class38 arg0, long arg1) {
        if (this.field2782 == this.field2775) {
            this.method1336();
        } else {
            this.method1326();
        }
        if (arg1 - this.field2775 > 750L) {
            this.method1325();
            return false;
        }
        int var4 = (int) (arg1 - this.field2782);
        if (this.field2786) {
            for (class526 var5 = (class526) this.field2774.method2955(62); var5 != null; var5 = (class526) this.field2774.method2952((byte) -44)) {
                for (int var6 = 0; var6 < var5.field7742.field612; var6++) {
                    var5.method3120(1, 68, arg1, !this.field2776, arg0);
                }
            }
            this.field2786 = false;
        }
        for (class526 var7 = (class526) this.field2774.method2955(62); var7 != null; var7 = (class526) this.field2774.method2952((byte) -73)) {
            var7.method3120(var4, 93, arg1, !this.field2776, arg0);
        }
        this.field2782 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lpf;Z)V", line = 111)
    private final void method1333(class410[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2778[var3] = false;
        }
        label73: for (class290 var4 = (class290) this.field2783.method1018(71); var4 != null; var4 = (class290) this.field2783.method1022((byte) -112)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4159 || arg0[var7].field6096 == var4.field4159) {
                        field2778[var7] = true;
                        var4.method1833(2);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1525((byte) -119);
                this.field2788--;
                if (var4.method2311(true)) {
                    var4.method2307((byte) -104);
                    class40.field457--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2788 != 8; var5++) {
            if (!field2778[var5]) {
                class290 var6 = null;
                if (arg0[var5].method2515((byte) 34).field3836 == 1 && class40.field457 < 32) {
                    var6 = new class290(arg0[var5], this);
                    class139.field1978.method767((byte) 75, var6, (long) arg0[var5].field6090);
                    class40.field457++;
                }
                if (var6 == null) {
                    var6 = new class290(arg0[var5], this);
                }
                this.field2783.method1015(false, var6);
                this.field2788++;
                field2778[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(I)V", line = 331)
    public class189(int arg0) {
        class229.field3359.method2948(-120, this);
        this.field2775 = arg0;
        this.field2782 = arg0;
        this.field2786 = true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V", line = 207)
    public final void method1334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2789 = arg0;
        this.field2787 = arg1;
        this.field2790 = arg2;
        this.field2791 = arg3;
        this.field2785 = arg4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lya;[Lbu;Z)V", line = 217)
    private final void method1335(class38 arg0, class17[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2780[var4] = false;
        }
        label64: for (class526 var5 = (class526) this.field2774.method2955(62); var5 != null; var5 = (class526) this.field2774.method2952((byte) -86)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field7738 || arg1[var8].field185 == var5.field7738) {
                        field2780[var8] = true;
                        var5.method3118(1);
                        var5.field7748 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field7741 == 0) {
                    var5.method2322(1024);
                    this.field2784--;
                } else {
                    var5.field7748 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2784 != 8; var6++) {
            if (!field2780[var6]) {
                class526 var7 = new class526(arg0, arg1[var6], this, this.field2775);
                this.field2774.method2948(11, var7);
                this.field2784++;
                field2780[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "()V", line = 297)
    private final void method1336() {
        this.field2776 = false;
    }
}
