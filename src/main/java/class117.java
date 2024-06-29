import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class117 extends class399 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Z")
    public boolean field1496 = false;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Z")
    private boolean field1500 = false;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field1494 = 0;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Lpn;")
    private class361 field1498 = new class361();

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    private int field1504 = 0;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "Lrh;")
    public class59 field1503 = new class59();

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    private int field1506 = 0;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "Z")
    private boolean field1511 = false;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "Z")
    public boolean field1513 = false;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "Lob;")
    public class309 field1509 = new class309();

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "[Lfh;")
    public class260[] field1495 = new class260[8192];

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "[Z")
    private static boolean[] field1499 = new boolean[8];

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "[Z")
    private static boolean[] field1501 = new boolean[32];

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "J")
    private long field1497;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "J")
    private long field1502;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)Ltp;", line = 3)
    public static final class117 method707(int arg0, boolean arg1) {
        if (class645.field9135 == class314.field4520) {
            return new class117(arg0, arg1);
        } else {
            class117 var2 = class104.field1269[class645.field9135];
            class645.field9135 = class645.field9135 + 1 & class127.field1625[class353.field5149];
            var2.method717(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loa;J[Ljq;[Lpp;Z)V", line = 16)
    public final void method708(class689 arg0, long arg1, class594[] arg2, class190[] arg3, boolean arg4) {
        if (!this.field1496) {
            this.method713(arg0, arg2, arg4);
            this.method722(arg3, arg4);
            this.field1502 = arg1;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V", line = 26)
    public static void method709() {
        field1501 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "()V", line = 30)
    public final void method710() {
        this.field1511 = true;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "()V", line = 35)
    public final void method711() {
        this.field1496 = true;
        for (class649 var1 = (class649) this.field1503.method374((byte) 67); var1 != null; var1 = (class649) this.field1503.method372(-20740)) {
            if (var1.field9197.field8262 == 1) {
                var1.method2669(-29226);
            }
        }
        for (int var2 = 0; var2 < this.field1495.length; var2++) {
            if (this.field1495[var2] != null) {
                this.field1495[var2].method1627();
                this.field1495[var2] = null;
            }
        }
        this.field1494 = 0;
        this.field1498 = new class361();
        this.field1504 = 0;
        this.field1503 = new class59();
        this.field1506 = 0;
        this.method2357(3553);
        class104.field1269[class314.field4520] = this;
        class314.field4520 = class314.field4520 + 1 & class127.field1625[class353.field5149];
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "()V", line = 72)
    public final void method712() {
        this.field1500 = true;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loa;[Ljq;Z)V", line = 77)
    private final void method713(class689 arg0, class594[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field1501[var4] = false;
        }
        label67: for (class327 var5 = (class327) this.field1498.method2224((byte) -112); var5 != null; var5 = (class327) this.field1498.method2222((byte) -27)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4764 || arg1[var8].field8143 == var5.field4764) {
                        field1501[var8] = true;
                        var5.method2099((byte) -107);
                        var5.field4757 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4784 == 0) {
                    var5.method2357(3553);
                    this.field1504--;
                } else {
                    var5.field4757 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field1504 != 32; var6++) {
            if (!field1501[var6]) {
                class327 var7 = new class327(arg0, arg1[var6], this, this.field1502);
                this.field1498.method2216(4, var7);
                this.field1504++;
                field1501[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "()Lob;", line = 153)
    public final class309 method714() {
        this.field1509.field4141.method385(true);
        for (int var1 = 0; var1 < this.field1495.length; var1++) {
            if (this.field1495[var1] != null && this.field1495[var1].field3594 != null) {
                this.field1509.field4141.method386((byte) 95, this.field1495[var1]);
            }
        }
        return this.field1509;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(J)V", line = 170)
    public final void method715(long arg0) {
        this.field1502 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "()V", line = 173)
    private final void method716() {
        this.field1500 = false;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(IZ)V", line = 179)
    private final void method717(int arg0, boolean arg1) {
        class379.field5440.method2216(4, this);
        this.field1502 = arg0;
        this.field1497 = arg0;
        this.field1511 = true;
        this.field1513 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IZ)V", line = 390)
    private class117(int arg0, boolean arg1) {
        this.method717(arg0, arg1);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(IIIII)V", line = 189)
    public final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1510 = arg0;
        this.field1512 = arg1;
        this.field1507 = arg2;
        this.field1505 = arg3;
        this.field1508 = arg4;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loa;J)Z", line = 196)
    public final boolean method719(class689 arg0, long arg1) {
        if (this.field1502 == this.field1497) {
            this.method716();
        } else {
            this.method712();
        }
        if (arg1 - this.field1502 > 750L) {
            this.method711();
            return false;
        }
        int var4 = (int) (arg1 - this.field1497);
        if (this.field1511) {
            for (class327 var5 = (class327) this.field1498.method2224((byte) -112); var5 != null; var5 = (class327) this.field1498.method2222((byte) -92)) {
                for (int var6 = 0; var6 < var5.field4775.field4592; var6++) {
                    var5.method2096(false, !this.field1500, arg1, arg0, 1);
                }
            }
            this.field1511 = false;
        }
        for (class327 var7 = (class327) this.field1498.method2224((byte) -112); var7 != null; var7 = (class327) this.field1498.method2222((byte) -113)) {
            var7.method2096(false, !this.field1500, arg1, arg0, var4);
        }
        this.field1497 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loa;)V", line = 247)
    public final void method720(class689 arg0) {
        this.field1509.field4141.method385(true);
        for (class327 var2 = (class327) this.field1498.method2224((byte) -112); var2 != null; var2 = (class327) this.field1498.method2222((byte) -27)) {
            var2.method2094(53, arg0, this.field1497);
        }
    }

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "()Lob;", line = 263)
    public final class309 method721() {
        return this.field1509;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([Lpp;Z)V", line = 276)
    private final void method722(class190[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1499[var3] = false;
        }
        label76: for (class649 var4 = (class649) this.field1503.method374((byte) 106); var4 != null; var4 = (class649) this.field1503.method372(-20740)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field9199 || arg0[var7].field2474 == var4.field9199) {
                        field1499[var7] = true;
                        var4.method3606(98);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method175(30604);
                this.field1506--;
                if (var4.method2670((byte) 116)) {
                    var4.method2669(-29226);
                    class131.field1676--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field1506 != 8; var5++) {
            if (!field1499[var5]) {
                class649 var6 = null;
                if (arg0[var5].method1223(3).field8262 == 1 && class131.field1676 < 32) {
                    var6 = new class649(arg0[var5], this);
                    class58.field810.method3170(0, (long) arg0[var5].field2482, var6);
                    class131.field1676++;
                }
                if (var6 == null) {
                    var6 = new class649(arg0[var5], this);
                }
                this.field1503.method378(var6, 31316);
                this.field1506++;
                field1499[var5] = true;
            }
        }
    }
}
