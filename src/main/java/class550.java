import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class550 extends class166 {

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public int field7777 = 0;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "Z")
    public boolean field7783 = false;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Z")
    private boolean field7780 = false;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "Lo;")
    private class29 field7781 = new class29();

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
    private int field7787 = 0;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "Lkba;")
    public class108 field7786 = new class108();

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
    private int field7789 = 0;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "Z")
    public boolean field7792 = false;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "Z")
    private boolean field7791 = false;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Lpf;")
    public class583 field7788 = new class583();

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "[Lae;")
    public class254[] field7779 = new class254[8192];

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "[Z")
    private static boolean[] field7778 = new boolean[8];

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "[Z")
    private static boolean[] field7782 = new boolean[32];

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
    public int field7790;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "J")
    private long field7784;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "J")
    private long field7785;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "()V", line = 3)
    public final void method3114() {
        this.field7780 = true;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "()Lpf;", line = 6)
    public final class583 method3115() {
        this.field7788.field8165.method1883((byte) -17);
        for (int var1 = 0; var1 < this.field7779.length; var1++) {
            if (this.field7779[var1] != null && this.field7779[var1].field3291 != null) {
                this.field7788.field8165.method1888(this.field7779[var1], 8);
            }
        }
        return this.field7788;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "()Lpf;", line = 21)
    public final class583 method3116() {
        return this.field7788;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZ)Llba;", line = 24)
    public static final class550 method3117(int arg0, boolean arg1) {
        if (class743.field10335 == class447.field6242) {
            return new class550(arg0, arg1);
        } else {
            class550 var2 = class147.field1892[class743.field10335];
            class743.field10335 = class743.field10335 + 1 & class182.field2229[class658.field9179];
            var2.method3124(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lha;)V", line = 40)
    public final void method3118(class60 arg0) {
        this.field7788.field8165.method1883((byte) 99);
        for (class408 var2 = (class408) this.field7781.method113((byte) 15); var2 != null; var2 = (class408) this.field7781.method119(false)) {
            var2.method2354(this.field7784, arg0, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lha;[Lfk;Z)V", line = 54)
    private final void method3119(class60 arg0, class653[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field7782[var4] = false;
        }
        label67: for (class408 var5 = (class408) this.field7781.method113((byte) 15); var5 != null; var5 = (class408) this.field7781.method119(false)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5746 || arg1[var8].field9081 == var5.field5746) {
                        field7782[var8] = true;
                        var5.method2358(-1);
                        var5.field5758 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5752 == 0) {
                    var5.method975((byte) 122);
                    this.field7787--;
                } else {
                    var5.field5758 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7787 != 32; var6++) {
            if (!field7782[var6]) {
                class408 var7 = new class408(arg0, arg1[var6], this, this.field7785);
                this.field7781.method118(true, var7);
                this.field7787++;
                field7782[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lha;J[Lfk;[Lcia;Z)V", line = 129)
    public final void method3120(class60 arg0, long arg1, class653[] arg2, class614[] arg3, boolean arg4) {
        if (!this.field7783) {
            this.method3119(arg0, arg2, arg4);
            this.method3122(arg3, arg4);
            this.field7785 = arg1;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class550(int arg0, boolean arg1) {
        this.method3124(arg0, arg1);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lha;J)Z", line = 141)
    public final boolean method3121(class60 arg0, long arg1) {
        if (this.field7785 == this.field7784) {
            this.method3128();
        } else {
            this.method3114();
        }
        if (arg1 - this.field7785 > 750L) {
            this.method3129();
            return false;
        }
        int var4 = (int) (arg1 - this.field7784);
        if (this.field7791) {
            for (class408 var5 = (class408) this.field7781.method113((byte) 15); var5 != null; var5 = (class408) this.field7781.method119(false)) {
                for (int var6 = 0; var6 < var5.field5747.field4425; var6++) {
                    var5.method2355(arg0, !this.field7780, arg1, -64, 1);
                }
            }
            this.field7791 = false;
        }
        for (class408 var7 = (class408) this.field7781.method113((byte) 15); var7 != null; var7 = (class408) this.field7781.method119(false)) {
            var7.method2355(arg0, !this.field7780, arg1, -64, var4);
        }
        this.field7784 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([Lcia;Z)V", line = 191)
    private final void method3122(class614[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7778[var3] = false;
        }
        label76: for (class324 var4 = (class324) this.field7786.method724(32); var4 != null; var4 = (class324) this.field7786.method723(91)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4341 || arg0[var7].field8599 == var4.field4341) {
                        field7778[var7] = true;
                        var4.method1934(-121);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method315(111);
                this.field7789--;
                if (var4.method2285((byte) 92)) {
                    var4.method2287((byte) -90);
                    class577.field8099--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7789 != 8; var5++) {
            if (!field7778[var5]) {
                class324 var6 = null;
                if (arg0[var5].method3454((byte) 110).field9924 == 1 && class577.field8099 < 32) {
                    var6 = new class324(arg0[var5], this);
                    class719.field10063.method3169((byte) -14, var6, (long) arg0[var5].field8600);
                    class577.field8099++;
                }
                if (var6 == null) {
                    var6 = new class324(arg0[var5], this);
                }
                this.field7786.method725(var6, -20911);
                this.field7789++;
                field7778[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIII)V", line = 279)
    public final void method3123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7790 = arg0;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V", line = 291)
    private final void method3124(int arg0, boolean arg1) {
        class146.field1891.method118(true, this);
        this.field7785 = arg0;
        this.field7784 = arg0;
        this.field7791 = true;
        this.field7792 = arg1;
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "()V", line = 298)
    public static void method3125() {
        field7782 = null;
        field7778 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(J)V", line = 302)
    public final void method3126(long arg0) {
        this.field7785 = arg0;
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "()V", line = 305)
    public final void method3127() {
        this.field7791 = true;
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "()V", line = 308)
    private final void method3128() {
        this.field7780 = false;
    }

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "()V", line = 314)
    public final void method3129() {
        this.field7783 = true;
        for (class324 var1 = (class324) this.field7786.method724(32); var1 != null; var1 = (class324) this.field7786.method723(111)) {
            if (var1.field4343.field9924 == 1) {
                var1.method2287((byte) -90);
            }
        }
        for (int var2 = 0; var2 < this.field7779.length; var2++) {
            if (this.field7779[var2] != null) {
                this.field7779[var2].method1515();
                this.field7779[var2] = null;
            }
        }
        this.field7777 = 0;
        this.field7781 = new class29();
        this.field7787 = 0;
        this.field7786 = new class108();
        this.field7789 = 0;
        this.method975((byte) 127);
        class147.field1892[class447.field6242] = this;
        class447.field6242 = class447.field6242 + 1 & class182.field2229[class658.field9179];
    }
}
