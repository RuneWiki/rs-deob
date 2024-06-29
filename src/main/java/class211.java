import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class211 extends class601 {

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "Z")
    private boolean field2796 = false;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public int field2797 = 0;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "Z")
    public boolean field2798 = false;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "Lfh;")
    private class567 field2801 = new class567();

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    private int field2806 = 0;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "Leea;")
    public class114 field2805 = new class114();

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "Z")
    private boolean field2809 = false;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    private int field2811 = 0;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "Z")
    public boolean field2814 = false;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "Lbe;")
    public class33 field2807 = new class33();

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "[Lkq;")
    public class516[] field2800 = new class516[8192];

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "[Z")
    private static boolean[] field2803 = new boolean[32];

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "[Z")
    private static boolean[] field2802 = new boolean[8];

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "J")
    private long field2799;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "J")
    private long field2804;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
    public final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2810 = arg0;
        this.field2815 = arg1;
        this.field2813 = arg2;
        this.field2812 = arg3;
        this.field2808 = arg4;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
    public final void method1333() {
        this.field2809 = true;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "()Lbe;")
    public final class33 method1334() {
        return this.field2807;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;)V")
    public final void method1335(class605 arg0) {
        this.field2807.field378.method1485(true);
        for (class92 var2 = (class92) this.field2801.method3297((byte) 96); var2 != null; var2 = (class92) this.field2801.method3296((byte) -108)) {
            var2.method587((byte) 65, arg0, this.field2804);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;J)Z")
    public final boolean method1336(class605 arg0, long arg1) {
        if (this.field2804 == this.field2799) {
            this.method1338();
        } else {
            this.method1344();
        }
        if (arg1 - this.field2799 > 750L) {
            this.method1342();
            return false;
        }
        int var4 = (int) (arg1 - this.field2804);
        if (this.field2809) {
            for (class92 var5 = (class92) this.field2801.method3297((byte) 110); var5 != null; var5 = (class92) this.field2801.method3296((byte) -119)) {
                for (int var6 = 0; var6 < var5.field1065.field6152; var6++) {
                    var5.method585(!this.field2796, arg0, arg1, 1, 2);
                }
            }
            this.field2809 = false;
        }
        for (class92 var7 = (class92) this.field2801.method3297((byte) 114); var7 != null; var7 = (class92) this.field2801.method3296((byte) -119)) {
            var7.method585(!this.field2796, arg0, arg1, var4, 115);
        }
        this.field2804 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)Lkw;")
    public static final class211 method1337(int arg0, boolean arg1) {
        if (class31.field350 == class158.field1956) {
            return new class211(arg0, arg1);
        } else {
            class211 var2 = class324.field4682[class158.field1956];
            class158.field1956 = class158.field1956 + 1 & class535.field7726[class178.field2192];
            var2.method1346(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "()V")
    private final void method1338() {
        this.field2796 = false;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "()V")
    public static void method1339() {
        field2803 = null;
        field2802 = null;
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "()Lbe;")
    public final class33 method1340() {
        this.field2807.field378.method1485(true);
        for (int var1 = 0; var1 < this.field2800.length; var1++) {
            if (this.field2800[var1] != null && this.field2800[var1].field7514 != null) {
                this.field2807.field378.method1486(this.field2800[var1], false);
            }
        }
        return this.field2807;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;[Lfca;Z)V")
    private final void method1341(class605 arg0, class75[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field2803[var4] = false;
        }
        label67: for (class92 var5 = (class92) this.field2801.method3297((byte) 87); var5 != null; var5 = (class92) this.field2801.method3296((byte) -121)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1082 || arg1[var8].field799 == var5.field1082) {
                        field2803[var8] = true;
                        var5.method586((byte) -113);
                        var5.field1073 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1068 == 0) {
                    var5.method3488(false);
                    this.field2806--;
                } else {
                    var5.field1073 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field2806 != 32; var6++) {
            if (!field2803[var6]) {
                class92 var7 = new class92(arg0, arg1[var6], this, this.field2799);
                this.field2801.method3293(var7, (byte) 112);
                this.field2806++;
                field2803[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "()V")
    public final void method1342() {
        this.field2798 = true;
        for (class546 var1 = (class546) this.field2805.method719(false); var1 != null; var1 = (class546) this.field2805.method716(14)) {
            if (var1.field7818.field2535 == 1) {
                var1.method199(-98);
            }
        }
        for (int var2 = 0; var2 < this.field2800.length; var2++) {
            if (this.field2800[var2] != null) {
                this.field2800[var2].method3060();
                this.field2800[var2] = null;
            }
        }
        this.field2797 = 0;
        this.field2801 = new class567();
        this.field2806 = 0;
        this.field2805 = new class114();
        this.field2811 = 0;
        this.method3488(false);
        class324.field4682[class31.field350] = this;
        class31.field350 = class31.field350 + 1 & class535.field7726[class178.field2192];
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;J[Lfca;[Lgl;Z)V")
    public final void method1343(class605 arg0, long arg1, class75[] arg2, class522[] arg3, boolean arg4) {
        if (!this.field2798) {
            this.method1341(arg0, arg2, arg4);
            this.method1347(arg3, arg4);
            this.field2799 = arg1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "()V")
    public final void method1344() {
        this.field2796 = true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(J)V")
    public final void method1345(long arg0) {
        this.field2799 = arg0;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)V")
    private final void method1346(int arg0, boolean arg1) {
        class132.field1661.method3293(this, (byte) 90);
        this.field2799 = arg0;
        this.field2804 = arg0;
        this.field2809 = true;
        this.field2814 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lgl;Z)V")
    private final void method1347(class522[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2802[var3] = false;
        }
        label76: for (class546 var4 = (class546) this.field2805.method719(false); var4 != null; var4 = (class546) this.field2805.method716(14)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field7821 || arg0[var7].field7587 == var4.field7821) {
                        field2802[var7] = true;
                        var4.method3179(0);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2108(true);
                this.field2811--;
                if (var4.method200(0)) {
                    var4.method199(-88);
                    class297.field4396--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field2811 != 8; var5++) {
            if (!field2802[var5]) {
                class546 var6 = null;
                if (arg0[var5].method3085(-1).field2535 == 1 && class297.field4396 < 32) {
                    var6 = new class546(arg0[var5], this);
                    class574.field8289.method1896((byte) 50, var6, (long) arg0[var5].field7588);
                    class297.field4396++;
                }
                if (var6 == null) {
                    var6 = new class546(arg0[var5], this);
                }
                this.field2805.method706(var6, true);
                this.field2811++;
                field2802[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IZ)V")
    private class211(int arg0, boolean arg1) {
        this.method1346(arg0, arg1);
    }
}
