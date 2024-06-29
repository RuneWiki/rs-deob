import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class788 extends class90 {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    private boolean field10804 = false;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field10808 = 0;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
    public boolean field10807 = false;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lem;")
    private class239 field10810 = new class239();

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    private int field10812 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Ljia;")
    public class645 field10813 = new class645();

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Z")
    private boolean field10814 = false;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field10817 = 0;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
    public boolean field10818 = false;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lmf;")
    public class442 field10815 = new class442();

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[Lpha;")
    public class176[] field10806 = new class176[8192];

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Z")
    private static boolean[] field10805 = new boolean[8];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[Z")
    private static boolean[] field10809 = new boolean[32];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public int field10816;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "J")
    private long field10803;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "J")
    private long field10811;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 3)
    public final void method4291() {
        this.field10804 = true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Lqr;Z)V", line = 8)
    private final void method4292(class72[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field10805[var3] = false;
        }
        label76: for (class566 var4 = (class566) this.field10813.method3589((byte) -127); var4 != null; var4 = (class566) this.field10813.method3591(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8002 || arg0[var7].field1058 == var4.field8002) {
                        field10805[var7] = true;
                        var4.method3271(false);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1207(102);
                this.field10817--;
                if (var4.method2939(-23829)) {
                    var4.method2942(false);
                    class388.field5336--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field10817 != 8; var5++) {
            if (!field10805[var5]) {
                class566 var6 = null;
                if (arg0[var5].method636(true).field5450 == 1 && class388.field5336 < 32) {
                    var6 = new class566(arg0[var5], this);
                    class381.field5182.method3537(var6, -78, (long) arg0[var5].field1053);
                    class388.field5336++;
                }
                if (var6 == null) {
                    var6 = new class566(arg0[var5], this);
                }
                this.field10813.method3594((byte) 118, var6);
                this.field10817++;
                field10805[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;[Loea;Z)V", line = 98)
    private final void method4293(class66 arg0, class624[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field10809[var4] = false;
        }
        label67: for (class227 var5 = (class227) this.field10810.method1597((byte) 76); var5 != null; var5 = (class227) this.field10810.method1601(120)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3297 || arg1[var8].field8696 == var5.field3297) {
                        field10809[var8] = true;
                        var5.method1550(32767);
                        var5.field3302 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3304 == 0) {
                    var5.method731((byte) 39);
                    this.field10812--;
                } else {
                    var5.field3302 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field10812 != 32; var6++) {
            if (!field10809[var6]) {
                class227 var7 = new class227(arg0, arg1[var6], this, this.field10811);
                this.field10810.method1600(var7, -3);
                this.field10812++;
                field10809[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;)V", line = 173)
    public final void method4294(class66 arg0) {
        this.field10815.field5985.method3849(29893);
        for (class227 var2 = (class227) this.field10810.method1597((byte) 127); var2 != null; var2 = (class227) this.field10810.method1601(71)) {
            var2.method1552(this.field10803, false, arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Lf;", line = 185)
    public static final class788 method4295(int arg0, boolean arg1) {
        if (class6.field116 == class193.field2951) {
            return new class788(arg0, arg1);
        } else {
            class788 var2 = class653.field9050[class6.field116];
            class6.field116 = class6.field116 + 1 & class522.field7072[class393.field5437];
            var2.method4296(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IZ)V", line = 198)
    private final void method4296(int arg0, boolean arg1) {
        class450.field6170.method1600(this, -3);
        this.field10811 = arg0;
        this.field10803 = arg0;
        this.field10814 = true;
        this.field10818 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V", line = 206)
    public static void method4297() {
        field10809 = null;
        field10805 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;J)Z", line = 212)
    public final boolean method4298(class66 arg0, long arg1) {
        if (this.field10811 == this.field10803) {
            this.method4302();
        } else {
            this.method4291();
        }
        if (arg1 - this.field10811 > 750L) {
            this.method4306();
            return false;
        }
        int var4 = (int) (arg1 - this.field10803);
        if (this.field10814) {
            for (class227 var5 = (class227) this.field10810.method1597((byte) 112); var5 != null; var5 = (class227) this.field10810.method1601(90)) {
                for (int var6 = 0; var6 < var5.field3298.field6911; var6++) {
                    var5.method1548(!this.field10804, -110, 1, arg1, arg0);
                }
            }
            this.field10814 = false;
        }
        for (class227 var7 = (class227) this.field10810.method1597((byte) -94); var7 != null; var7 = (class227) this.field10810.method1601(76)) {
            var7.method1548(!this.field10804, -99, var4, arg1, arg0);
        }
        this.field10803 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()Lmf;", line = 263)
    public final class442 method4299() {
        return this.field10815;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V", line = 266)
    public final void method4300() {
        this.field10814 = true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V", line = 269)
    public final void method4301(long arg0) {
        this.field10811 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class788(int arg0, boolean arg1) {
        this.method4296(arg0, arg1);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 275)
    private final void method4302() {
        this.field10804 = false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 279)
    public final void method4303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10816 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()Lmf;", line = 291)
    public final class442 method4304() {
        this.field10815.field5985.method3849(29893);
        for (int var1 = 0; var1 < this.field10806.length; var1++) {
            if (this.field10806[var1] != null && this.field10806[var1].field2776 != null) {
                this.field10815.field5985.method3851(13246, this.field10806[var1]);
            }
        }
        return this.field10815;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;J[Loea;[Lqr;Z)V", line = 307)
    public final void method4305(class66 arg0, long arg1, class624[] arg2, class72[] arg3, boolean arg4) {
        if (!this.field10807) {
            this.method4293(arg0, arg2, arg4);
            this.method4292(arg3, arg4);
            this.field10811 = arg1;
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "()V", line = 321)
    public final void method4306() {
        this.field10807 = true;
        for (class566 var1 = (class566) this.field10813.method3589((byte) -127); var1 != null; var1 = (class566) this.field10813.method3591(0)) {
            if (var1.field8011.field5450 == 1) {
                var1.method2942(false);
            }
        }
        for (int var2 = 0; var2 < this.field10806.length; var2++) {
            if (this.field10806[var2] != null) {
                this.field10806[var2].method1332();
                this.field10806[var2] = null;
            }
        }
        this.field10808 = 0;
        this.field10810 = new class239();
        this.field10812 = 0;
        this.field10813 = new class645();
        this.field10817 = 0;
        this.method731((byte) 39);
        class653.field9050[class193.field2951] = this;
        class193.field2951 = class193.field2951 + 1 & class522.field7072[class393.field5437];
    }
}
