import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class314 extends class423 {

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
    public boolean field4599 = false;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Z")
    private boolean field4600 = false;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field4602 = 0;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Ltg;")
    private class304 field4601 = new class304();

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    private int field4605 = 0;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Leb;")
    public class395 field4606 = new class395();

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    private int field4611 = 0;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Z")
    private boolean field4609 = false;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "Lci;")
    public class400 field4612 = new class400();

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[Lhm;")
    public class290[] field4603 = new class290[8192];

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "J")
    private long field4596;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "J")
    private long field4598;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "[Z")
    private static boolean[] field4597 = new boolean[8];

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "[Z")
    private static boolean[] field4604 = new boolean[8];

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(J)V", line = 7)
    public final void method2069(long arg0) {
        this.field4596 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Ljo;Z)V", line = 12)
    private final void method2070(class226[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4597[var3] = false;
        }
        label73: for (class266 var4 = (class266) this.field4606.method2478(1603); var4 != null; var4 = (class266) this.field4606.method2486((byte) -82)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3945 || arg0[var7].field3380 == var4.field3945) {
                        field4597[var7] = true;
                        var4.method1833(2);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1820(-25246);
                this.field4611--;
                if (var4.method294(600)) {
                    var4.method299((byte) -86);
                    class86.field1065--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4611 != 8; var5++) {
            if (!field4597[var5]) {
                class266 var6 = null;
                if (class152.method1041(0, arg0[var5].field3387).field4120 == 1 && class86.field1065 < 32) {
                    var6 = new class266(arg0[var5], this);
                    class31.field430.method316((long) arg0[var5].field3387, false, var6);
                    class86.field1065++;
                }
                if (var6 == null) {
                    var6 = new class266(arg0[var5], this);
                }
                this.field4606.method2484(0, var6);
                this.field4611++;
                field4597[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 97)
    public final void method2071() {
        this.field4599 = true;
        for (class266 var1 = (class266) this.field4606.method2478(1603); var1 != null; var1 = (class266) this.field4606.method2486((byte) -82)) {
            if (var1.field3953.field4120 == 1) {
                var1.method299((byte) -86);
            }
        }
        this.field4603 = new class290[8192];
        this.field4602 = 0;
        this.field4601 = new class304();
        this.field4605 = 0;
        this.field4606 = new class395();
        this.field4611 = 0;
        this.method2611(-1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lfp;J[Lai;[Ljo;Z)V", line = 118)
    public final void method2072(class9 arg0, long arg1, class133[] arg2, class226[] arg3, boolean arg4) {
        if (!this.field4599) {
            this.method2074(arg0, arg2, arg4);
            this.method2070(arg3, arg4);
            this.field4596 = arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V", line = 131)
    public final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4610 = arg0;
        this.field4607 = arg1;
        this.field4608 = arg2;
        this.field4613 = arg3;
        this.field4614 = arg4;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lfp;[Lai;Z)V", line = 140)
    private final void method2074(class9 arg0, class133[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4604[var4] = false;
        }
        label64: for (class319 var5 = (class319) this.field4601.method2026(100); var5 != null; var5 = (class319) this.field4601.method2022(10)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4683 || arg1[var8].field1821 == var5.field4683) {
                        field4604[var8] = true;
                        var5.method2102(32767);
                        var5.field4679 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4694 == 0) {
                    var5.method2611(-1);
                    this.field4605--;
                } else {
                    var5.field4679 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4605 != 8; var6++) {
            if (!field4604[var6]) {
                class319 var7 = new class319(arg0, arg1[var6], this, this.field4596);
                this.field4601.method2024(10, var7);
                this.field4605++;
                field4604[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 331)
    public class314(int arg0) {
        class343.field5049.method2024(10, this);
        this.field4596 = (long) arg0;
        this.field4598 = (long) arg0;
        this.field4609 = true;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V", line = 221)
    public final void method2075() {
        this.field4612.field5781.method2494((byte) 113);
        for (class319 var1 = (class319) this.field4601.method2026(100); var1 != null; var1 = (class319) this.field4601.method2022(10)) {
            var1.method2104(this.field4598, 116);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()Lci;", line = 233)
    public final class400 method2076() {
        return this.field4612;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "()V", line = 237)
    public final void method2077() {
        this.field4600 = true;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "()V", line = 240)
    private final void method2078() {
        this.field4600 = false;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "()V", line = 246)
    public final void method2079() {
        this.field4609 = true;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "()V", line = 249)
    public static void method2080() {
        field4604 = null;
        field4597 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lfp;J)Z", line = 253)
    public final boolean method2081(class9 arg0, long arg1) {
        if (this.field4598 == this.field4596) {
            this.method2078();
        } else {
            this.method2077();
        }
        if (arg1 - this.field4596 > 750L) {
            this.method2071();
            return false;
        }
        int var4 = (int) (arg1 - this.field4598);
        if (this.field4609) {
            for (class319 var5 = (class319) this.field4601.method2026(100); var5 != null; var5 = (class319) this.field4601.method2022(10)) {
                for (int var6 = 0; var6 < var5.field4689.field5386; var6++) {
                    var5.method2101(1, arg1, arg0, 116, !this.field4600);
                }
            }
            this.field4609 = false;
        }
        for (class319 var7 = (class319) this.field4601.method2026(100); var7 != null; var7 = (class319) this.field4601.method2022(10)) {
            var7.method2101(var4, arg1, arg0, 69, !this.field4600);
        }
        this.field4598 = arg1;
        return true;
    }
}
