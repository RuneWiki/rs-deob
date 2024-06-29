import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class113 extends class315 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public boolean field1578 = false;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public int field1584 = 0;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Z")
    private boolean field1585 = false;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "Lmb;")
    private class262 field1580 = new class262();

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    private int field1586 = 0;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Lcf;")
    public class92 field1587 = new class92();

    @OriginalMember(owner = "client!an", name = "v", descriptor = "Z")
    private boolean field1591 = false;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    private int field1589 = 0;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "Lpa;")
    public class404 field1594 = new class404();

    @OriginalMember(owner = "client!an", name = "n", descriptor = "[Lsi;")
    public class474[] field1583 = new class474[8192];

    @OriginalMember(owner = "client!an", name = "j", descriptor = "J")
    private long field1579;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "J")
    private long field1582;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "[Z")
    private static boolean[] field1581 = new boolean[8];

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[Z")
    private static boolean[] field1588 = new boolean[8];

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V", line = 331)
    public class113(int arg0) {
        class384.field5274.method1765(126, this);
        this.field1579 = (long) arg0;
        this.field1582 = (long) arg0;
        this.field1591 = true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(J)V", line = 8)
    public final void method889(long arg0) {
        this.field1579 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lvc;[Lof;Z)V", line = 13)
    private final void method890(class89 arg0, class295[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1588[var4] = false;
        }
        label64: for (class207 var5 = (class207) this.field1580.method1763((byte) -62); var5 != null; var5 = (class207) this.field1580.method1767(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3024 || arg1[var8].field4155 == var5.field3024) {
                        field1588[var8] = true;
                        var5.method1415(93);
                        var5.field3046 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3047 == 0) {
                    var5.method2003(1);
                    this.field1586--;
                } else {
                    var5.field3046 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1586 != 8; var6++) {
            if (!field1588[var6]) {
                class207 var7 = new class207(arg0, arg1[var6], this, this.field1579);
                this.field1580.method1765(120, var7);
                this.field1586++;
                field1588[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lvc;J[Lof;[Llh;Z)V", line = 86)
    public final void method891(class89 arg0, long arg1, class295[] arg2, class235[] arg3, boolean arg4) {
        if (!this.field1578) {
            this.method890(arg0, arg2, arg4);
            this.method901(arg3, arg4);
            this.field1579 = arg1;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 94)
    private final void method892() {
        this.field1585 = false;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()V", line = 100)
    public final void method893() {
        this.field1585 = true;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "()V", line = 108)
    public static void method894() {
        field1588 = null;
        field1581 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V", line = 112)
    public final void method895(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1596 = arg0;
        this.field1593 = arg1;
        this.field1595 = arg2;
        this.field1592 = arg3;
        this.field1590 = arg4;
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "()Lpa;", line = 119)
    public final class404 method896() {
        return this.field1594;
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "()V", line = 122)
    public final void method897() {
        this.field1594.field5528.method2129((byte) 124);
        for (class207 var1 = (class207) this.field1580.method1763((byte) -81); var1 != null; var1 = (class207) this.field1580.method1767(true)) {
            var1.method1418(88, this.field1582);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lvc;J)Z", line = 134)
    public final boolean method898(class89 arg0, long arg1) {
        if (this.field1582 == this.field1579) {
            this.method892();
        } else {
            this.method893();
        }
        if (arg1 - this.field1579 > 750L) {
            this.method900();
            return false;
        }
        int var4 = (int) (arg1 - this.field1582);
        if (this.field1591) {
            for (class207 var5 = (class207) this.field1580.method1763((byte) -63); var5 != null; var5 = (class207) this.field1580.method1767(true)) {
                for (int var6 = 0; var6 < var5.field3021.field6711; var6++) {
                    var5.method1419(arg0, (byte) 62, arg1, 1, !this.field1585);
                }
            }
            this.field1591 = false;
        }
        for (class207 var7 = (class207) this.field1580.method1763((byte) -82); var7 != null; var7 = (class207) this.field1580.method1767(true)) {
            var7.method1419(arg0, (byte) 18, arg1, var4, !this.field1585);
        }
        this.field1582 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!an", name = "f", descriptor = "()V", line = 183)
    public final void method899() {
        this.field1591 = true;
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "()V", line = 189)
    public final void method900() {
        this.field1578 = true;
        for (class190 var1 = (class190) this.field1587.method775(1); var1 != null; var1 = (class190) this.field1587.method763(0)) {
            if (var1.field2849.field2771 == 1) {
                var1.method479((byte) -8);
            }
        }
        this.field1583 = new class474[8192];
        this.field1584 = 0;
        this.field1580 = new class262();
        this.field1586 = 0;
        this.field1587 = new class92();
        this.field1589 = 0;
        this.method2003(1);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([Llh;Z)V", line = 220)
    private final void method901(class235[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1581[var3] = false;
        }
        label73: for (class190 var4 = (class190) this.field1587.method775(1); var4 != null; var4 = (class190) this.field1587.method763(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2847 || arg0[var7].field3410 == var4.field2847) {
                        field1581[var7] = true;
                        var4.method1337(-78);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2714(69);
                this.field1589--;
                if (var4.method480((byte) -93)) {
                    var4.method479((byte) -8);
                    class97.field1363--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1589 != 8; var5++) {
            if (!field1581[var5]) {
                class190 var6 = null;
                if (class389.method2361(arg0[var5].field3414, (byte) -72).field2771 == 1 && class97.field1363 < 32) {
                    var6 = new class190(arg0[var5], this);
                    class268.field3928.method1905((long) arg0[var5].field3414, (byte) 123, var6);
                    class97.field1363++;
                }
                if (var6 == null) {
                    var6 = new class190(arg0[var5], this);
                }
                this.field1587.method766(var6, -1);
                this.field1589++;
                field1581[var5] = true;
            }
        }
    }
}
