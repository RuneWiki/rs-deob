import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class45 extends class177 {

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public int field1103 = 0;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Z")
    public boolean field1104 = false;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Lsk;")
    private class578 field1106 = new class578();

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    private int field1112 = 0;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "Lhga;")
    public class158 field1113 = new class158();

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Z")
    public boolean field1114 = false;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "Z")
    private boolean field1117 = false;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "Lfi;")
    public class518 field1115 = new class518();

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "[Lnk;")
    public class668[] field1107 = new class668[8192];

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "[Z")
    private static boolean[] field1111 = new boolean[32];

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "[Z")
    private static boolean[] field1108 = new boolean[8];

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "J")
    private long field1105;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "J")
    private long field1109;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    private final void method575() {
        this.field1110 = false;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;[Ltk;Z)V")
    private final void method576(class167 arg0, class317[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field1111[var4] = false;
        }
        label67: for (class607 var5 = (class607) this.field1106.method3317(-121); var5 != null; var5 = (class607) this.field1106.method3321(-121)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8831 || arg1[var8].field4665 == var5.field8831) {
                        field1111[var8] = true;
                        var5.method3492((byte) -37);
                        var5.field8825 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8829 == 0) {
                    var5.method1318(8);
                    this.field1112--;
                } else {
                    var5.field8825 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field1112 != 32; var6++) {
            if (!field1111[var6]) {
                class607 var7 = new class607(arg0, arg1[var6], this, this.field1105);
                this.field1106.method3322(var7, -53);
                this.field1112++;
                field1111[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
    public final void method577() {
        this.field1117 = true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1118 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)V")
    private final void method579(int arg0, boolean arg1) {
        class705.field9921.method3322(this, -12);
        this.field1105 = arg0;
        this.field1109 = arg0;
        this.field1117 = true;
        this.field1114 = arg1;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "()Lfi;")
    public final class518 method580() {
        this.field1115.field7307.method1450(15847);
        for (int var1 = 0; var1 < this.field1107.length; var1++) {
            if (this.field1107[var1] != null && this.field1107[var1].field9557 != null) {
                this.field1115.field7307.method1447(this.field1107[var1], (byte) -48);
            }
        }
        return this.field1115;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "()V")
    public static void method581() {
        field1111 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "()Lfi;")
    public final class518 method582() {
        return this.field1115;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method583(class167 arg0, long arg1) {
        if (this.field1109 == this.field1105) {
            this.method575();
        } else {
            this.method588();
        }
        if (arg1 - this.field1105 > 750L) {
            this.method585();
            return false;
        }
        int var4 = (int) (arg1 - this.field1109);
        if (this.field1117) {
            for (class607 var5 = (class607) this.field1106.method3317(-121); var5 != null; var5 = (class607) this.field1106.method3321(-121)) {
                for (int var6 = 0; var6 < var5.field8827.field2197; var6++) {
                    var5.method3496(!this.field1110, arg1, 1, arg0, 125);
                }
            }
            this.field1117 = false;
        }
        for (class607 var7 = (class607) this.field1106.method3317(-121); var7 != null; var7 = (class607) this.field1106.method3321(-121)) {
            var7.method3496(!this.field1110, arg1, var4, arg0, -98);
        }
        this.field1109 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([Laq;Z)V")
    private final void method584(class146[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1108[var3] = false;
        }
        label76: for (class221 var4 = (class221) this.field1113.method1224(-2); var4 != null; var4 = (class221) this.field1113.method1232(-2)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3338 || arg0[var7].field2536 == var4.field3338) {
                        field1108[var7] = true;
                        var4.method1529(false);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2588(300);
                this.field1116--;
                if (var4.method3815(false)) {
                    var4.method3813(-128);
                    class679.field9633--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field1116 != 8; var5++) {
            if (!field1108[var5]) {
                class221 var6 = null;
                if (arg0[var5].method1167(true).field4089 == 1 && class679.field9633 < 32) {
                    var6 = new class221(arg0[var5], this);
                    class90.field1652.method3646(-100, (long) arg0[var5].field2528, var6);
                    class679.field9633++;
                }
                if (var6 == null) {
                    var6 = new class221(arg0[var5], this);
                }
                this.field1113.method1229(var6, (byte) 120);
                this.field1116++;
                field1108[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "()V")
    public final void method585() {
        this.field1104 = true;
        for (class221 var1 = (class221) this.field1113.method1224(-2); var1 != null; var1 = (class221) this.field1113.method1232(-2)) {
            if (var1.field3345.field4089 == 1) {
                var1.method3813(-127);
            }
        }
        for (int var2 = 0; var2 < this.field1107.length; var2++) {
            if (this.field1107[var2] != null) {
                this.field1107[var2].method3776();
                this.field1107[var2] = null;
            }
        }
        this.field1103 = 0;
        this.field1106 = new class578();
        this.field1112 = 0;
        this.field1113 = new class158();
        this.field1116 = 0;
        this.method1318(8);
        class236.field3516[class239.field3537] = this;
        class239.field3537 = class239.field3537 + 1 & class594.field8550[class696.field9800];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;)V")
    public final void method586(class167 arg0) {
        this.field1115.field7307.method1450(15847);
        for (class607 var2 = (class607) this.field1106.method3317(-121); var2 != null; var2 = (class607) this.field1106.method3321(-121)) {
            var2.method3495(arg0, (byte) 46, this.field1109);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(IZ)Lgp;")
    public static final class45 method587(int arg0, boolean arg1) {
        if (class583.field8433 == class239.field3537) {
            return new class45(arg0, arg1);
        } else {
            class45 var2 = class236.field3516[class583.field8433];
            class583.field8433 = class583.field8433 + 1 & class594.field8550[class696.field9800];
            var2.method579(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "()V")
    public final void method588() {
        this.field1110 = true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;J[Ltk;[Laq;Z)V")
    public final void method589(class167 arg0, long arg1, class317[] arg2, class146[] arg3, boolean arg4) {
        if (!this.field1104) {
            this.method576(arg0, arg2, arg4);
            this.method584(arg3, arg4);
            this.field1105 = arg1;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(J)V")
    public final void method590(long arg0) {
        this.field1105 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IZ)V")
    private class45(int arg0, boolean arg1) {
        this.method579(arg0, arg1);
    }
}
