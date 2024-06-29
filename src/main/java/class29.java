import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 extends class609 {

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Z")
    private boolean field435 = false;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public int field432 = 0;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "Z")
    public boolean field440 = false;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "Lli;")
    private class392 field437 = new class392();

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    private int field442 = 0;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "Lwba;")
    public class46 field441 = new class46();

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "Z")
    private boolean field444 = false;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "Z")
    public boolean field446 = false;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "Lvi;")
    public class499 field443 = new class499();

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "[Llk;")
    public class543[] field434 = new class543[8192];

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "[Z")
    private static boolean[] field438 = new boolean[8];

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "[Z")
    private static boolean[] field436 = new boolean[32];

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "J")
    private long field433;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "J")
    private long field439;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "()V")
    public static void method326() {
        field436 = null;
        field438 = null;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "()V")
    private final void method327() {
        this.field435 = false;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(J)V")
    public final void method328(long arg0) {
        this.field439 = arg0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)Lmca;")
    public static final class29 method329(int arg0, boolean arg1) {
        if (class98.field1546 == class505.field7143) {
            return new class29(arg0, arg1);
        } else {
            class29 var2 = class64.field1214[class505.field7143];
            class505.field7143 = class505.field7143 + 1 & class60.field1140[class546.field7679];
            var2.method332(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "()V")
    public final void method330() {
        this.field440 = true;
        for (class162 var1 = (class162) this.field441.method472((byte) -87); var1 != null; var1 = (class162) this.field441.method482(22)) {
            if (var1.field2318.field2185 == 1) {
                var1.method2258((byte) 127);
            }
        }
        for (int var2 = 0; var2 < this.field434.length; var2++) {
            if (this.field434[var2] != null) {
                this.field434[var2].method3077();
                this.field434[var2] = null;
            }
        }
        this.field432 = 0;
        this.field437 = new class392();
        this.field442 = 0;
        this.field441 = new class46();
        this.field445 = 0;
        this.method3414(0);
        class64.field1214[class98.field1546] = this;
        class98.field1546 = class98.field1546 + 1 & class60.field1140[class546.field7679];
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([Lin;Z)V")
    private final void method331(class77[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field438[var3] = false;
        }
        label76: for (class162 var4 = (class162) this.field441.method472((byte) -99); var4 != null; var4 = (class162) this.field441.method482(-35)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2324 || arg0[var7].field1323 == var4.field2324) {
                        field438[var7] = true;
                        var4.method1116(24528);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3678(-1);
                this.field445--;
                if (var4.method2259(3)) {
                    var4.method2258((byte) 122);
                    class136.field1997--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field445 != 8; var5++) {
            if (!field438[var5]) {
                class162 var6 = null;
                if (arg0[var5].method713(true).field2185 == 1 && class136.field1997 < 32) {
                    var6 = new class162(arg0[var5], this);
                    class535.field7504.method1958(var6, (long) arg0[var5].field1326, (byte) -108);
                    class136.field1997++;
                }
                if (var6 == null) {
                    var6 = new class162(arg0[var5], this);
                }
                this.field441.method474(var6, 6);
                this.field445++;
                field438[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(IZ)V")
    private final void method332(int arg0, boolean arg1) {
        class448.field6482.method2413(this, (byte) 111);
        this.field439 = arg0;
        this.field433 = arg0;
        this.field444 = true;
        this.field446 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIII)V")
    public final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field447 = arg0;
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "()V")
    public final void method334() {
        this.field435 = true;
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "()Lvi;")
    public final class499 method335() {
        this.field443.field7068.method3344(-27732);
        for (int var1 = 0; var1 < this.field434.length; var1++) {
            if (this.field434[var1] != null && this.field434[var1].field7640 != null) {
                this.field443.field7068.method3343(this.field434[var1], 38);
            }
        }
        return this.field443;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lr;J[Llea;[Lin;Z)V")
    public final void method336(class166 arg0, long arg1, class568[] arg2, class77[] arg3, boolean arg4) {
        if (!this.field440) {
            this.method340(arg0, arg2, arg4);
            this.method331(arg3, arg4);
            this.field439 = arg1;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method337(class166 arg0, long arg1) {
        if (this.field439 == this.field433) {
            this.method327();
        } else {
            this.method334();
        }
        if (arg1 - this.field439 > 750L) {
            this.method330();
            return false;
        }
        int var4 = (int) (arg1 - this.field433);
        if (this.field444) {
            for (class593 var5 = (class593) this.field437.method2417(false); var5 != null; var5 = (class593) this.field437.method2414(true)) {
                for (int var6 = 0; var6 < var5.field8370.field7574; var6++) {
                    var5.method3362((byte) 38, 1, arg1, !this.field435, arg0);
                }
            }
            this.field444 = false;
        }
        for (class593 var7 = (class593) this.field437.method2417(false); var7 != null; var7 = (class593) this.field437.method2414(true)) {
            var7.method3362((byte) 38, var4, arg1, !this.field435, arg0);
        }
        this.field433 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "()V")
    public final void method338() {
        this.field444 = true;
    }

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "()Lvi;")
    public final class499 method339() {
        return this.field443;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lr;[Llea;Z)V")
    private final void method340(class166 arg0, class568[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field436[var4] = false;
        }
        label67: for (class593 var5 = (class593) this.field437.method2417(false); var5 != null; var5 = (class593) this.field437.method2414(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8374 || arg1[var8].field7989 == var5.field8374) {
                        field436[var8] = true;
                        var5.method3360((byte) -77);
                        var5.field8371 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8369 == 0) {
                    var5.method3414(0);
                    this.field442--;
                } else {
                    var5.field8371 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field442 != 32; var6++) {
            if (!field436[var6]) {
                class593 var7 = new class593(arg0, arg1[var6], this, this.field439);
                this.field437.method2413(var7, (byte) 112);
                this.field442++;
                field436[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lr;)V")
    public final void method341(class166 arg0) {
        this.field443.field7068.method3344(-27732);
        for (class593 var2 = (class593) this.field437.method2417(false); var2 != null; var2 = (class593) this.field437.method2414(true)) {
            var2.method3361(this.field433, (byte) 124, arg0);
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IZ)V")
    private class29(int arg0, boolean arg1) {
        this.method332(arg0, arg1);
    }
}
