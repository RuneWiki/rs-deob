import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class94 extends class34 {

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Z")
    private boolean field1587 = false;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public int field1586 = 0;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Z")
    public boolean field1590 = false;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lku;")
    private class254 field1584 = new class254();

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    private int field1593 = 0;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lug;")
    public class392 field1591 = new class392();

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    private int field1598 = 0;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Z")
    private boolean field1595 = false;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Lsh;")
    public class49 field1596 = new class49();

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[Ldq;")
    public class490[] field1585 = new class490[8192];

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
    private long field1588;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "J")
    private long field1589;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[Z")
    private static boolean[] field1583 = new boolean[8];

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[Z")
    private static boolean[] field1592 = new boolean[8];

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    public final void method717() {
        this.field1595 = true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
    public final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1600 = arg0;
        this.field1601 = arg1;
        this.field1599 = arg2;
        this.field1597 = arg3;
        this.field1594 = arg4;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
    public final void method719() {
        this.field1596.field892.method1535((byte) -127);
        for (class297 var1 = (class297) this.field1584.method1640(false); var1 != null; var1 = (class297) this.field1584.method1641(true)) {
            var1.method1882(65535, this.field1589);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
    public final void method720() {
        this.field1587 = true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lqa;J[Lwv;[Lnk;Z)V")
    public final void method721(class162 arg0, long arg1, class26[] arg2, class501[] arg3, boolean arg4) {
        if (!this.field1590) {
            this.method728(arg0, arg2, arg4);
            this.method726(arg3, arg4);
            this.field1588 = arg1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
    private final void method722() {
        this.field1587 = false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(J)V")
    public final void method723(long arg0) {
        this.field1588 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "()Lsh;")
    public final class49 method724() {
        return this.field1596;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method725(class162 arg0, long arg1) {
        if (this.field1589 == this.field1588) {
            this.method722();
        } else {
            this.method720();
        }
        if (arg1 - this.field1588 > 750L) {
            this.method729();
            return false;
        }
        int var4 = (int) (arg1 - this.field1589);
        if (this.field1595) {
            for (class297 var5 = (class297) this.field1584.method1640(false); var5 != null; var5 = (class297) this.field1584.method1641(true)) {
                for (int var6 = 0; var6 < var5.field4214.field363; var6++) {
                    var5.method1884(arg0, arg1, 1, !this.field1587, -6467);
                }
            }
            this.field1595 = false;
        }
        for (class297 var7 = (class297) this.field1584.method1640(false); var7 != null; var7 = (class297) this.field1584.method1641(true)) {
            var7.method1884(arg0, arg1, var4, !this.field1587, -6467);
        }
        this.field1589 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([Lnk;Z)V")
    private final void method726(class501[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1592[var3] = false;
        }
        label73: for (class372 var4 = (class372) this.field1591.method2427(109); var4 != null; var4 = (class372) this.field1591.method2422(-110)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5653 || arg0[var7].field7385 == var4.field5653) {
                        field1592[var7] = true;
                        var4.method2323(2);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2090(-1);
                this.field1598--;
                if (var4.method1379(117)) {
                    var4.method1382(7218);
                    class494.field7308--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1598 != 8; var5++) {
            if (!field1592[var5]) {
                class372 var6 = null;
                if (arg0[var5].method2998(109).field2340 == 1 && class494.field7308 < 32) {
                    var6 = new class372(arg0[var5], this);
                    class334.field5047.method3104((byte) 65, (long) arg0[var5].field7389, var6);
                    class494.field7308++;
                }
                if (var6 == null) {
                    var6 = new class372(arg0[var5], this);
                }
                this.field1591.method2417(-37, var6);
                this.field1598++;
                field1592[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "()V")
    public static void method727() {
        field1583 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lqa;[Lwv;Z)V")
    private final void method728(class162 arg0, class26[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1583[var4] = false;
        }
        label64: for (class297 var5 = (class297) this.field1584.method1640(false); var5 != null; var5 = (class297) this.field1584.method1641(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4222 || arg1[var8].field574 == var5.field4222) {
                        field1583[var8] = true;
                        var5.method1883((byte) 99);
                        var5.field4218 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4237 == 0) {
                    var5.method360(true);
                    this.field1593--;
                } else {
                    var5.field4218 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1593 != 8; var6++) {
            if (!field1583[var6]) {
                class297 var7 = new class297(arg0, arg1[var6], this, this.field1588);
                this.field1584.method1636(9, var7);
                this.field1593++;
                field1583[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "()V")
    public final void method729() {
        this.field1590 = true;
        for (class372 var1 = (class372) this.field1591.method2427(108); var1 != null; var1 = (class372) this.field1591.method2422(-128)) {
            if (var1.field5654.field2340 == 1) {
                var1.method1382(7218);
            }
        }
        this.field1585 = new class490[8192];
        this.field1586 = 0;
        this.field1584 = new class254();
        this.field1593 = 0;
        this.field1591 = new class392();
        this.field1598 = 0;
        this.method360(true);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class94(int arg0) {
        class286.field4081.method1636(9, this);
        this.field1588 = arg0;
        this.field1589 = arg0;
        this.field1595 = true;
    }
}
