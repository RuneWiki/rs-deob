import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 implements class76 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ldd;")
    private class23 field1560 = new class23();

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field1576 = 0;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "D")
    private double field1579 = 1.0D;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field1580 = 128;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Lrd;")
    private class106 field1578;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[Lkd;")
    private class64[] field1566;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lad;")
    public static class5 field1558 = class88.method674("::clientdrop", -67);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lad;")
    public static class5 field1563 = class88.method674("null", -124);

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public static boolean field1559 = false;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lad;")
    public static class5 field1556 = class88.method674("Duell akzeptieren", 77);

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[[I")
    public static int[][] field1571 = new int[104][104];

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lad;")
    public static class5 field1569 = class88.method674("Regelversto-8 melden", -118);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lad;")
    private static class5 field1561 = class88.method674("Password: ", 58);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lad;")
    public static class5 field1562 = field1561;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 15)
    public static void method511(boolean arg0) {
        field1563 = null;
        field1558 = null;
        field1571 = null;
        field1556 = null;
        field1562 = null;
        field1561 = null;
        if (arg0) {
            field1569 = null;
        }
        field1569 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)I", line = 31)
    public final int method512(int arg0, boolean arg1) {
        field1564++;
        if (!arg1) {
            method511(false);
        }
        return this.field1566[arg0] == null ? 0 : this.field1566[arg0].field1546;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(DI)V", line = 54)
    public final void method513(double arg0, int arg1) {
        this.field1579 = arg0;
        field1565++;
        if (arg1 != -1) {
            this.field1578 = null;
        }
        this.method518((byte) -82);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V", line = 93)
    public final void method514(int arg0, int arg1) {
        int var3 = 0;
        if (arg0 != -1) {
            this.field1579 = 1.1707516362801327D;
        }
        while (this.field1566.length > var3) {
            class64 var4 = this.field1566[var3];
            if (var4 != null && var4.field1550 != 0 && var4.field1547) {
                var4.method508(arg1);
                var4.field1547 = false;
            }
            var3++;
        }
        field1557++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I", line = 136)
    public final int[] method515(int arg0, byte arg1) {
        field1570++;
        int var3 = -14 % ((79 - arg1) / 38);
        class64 var4 = this.field1566[arg0];
        if (var4 != null) {
            if (var4.field1552 != null) {
                this.field1560.method179(false, var4);
                var4.field1547 = true;
                return var4.field1552;
            }
            boolean var5 = var4.method510(this.field1579, this.field1580, this.field1578);
            if (var5) {
                if (this.field1576 == 0) {
                    class64 var6 = (class64) this.field1560.method186((byte) 93);
                    var6.method509();
                } else {
                    this.field1576--;
                }
                this.field1560.method179(false, var4);
                var4.field1547 = true;
                return var4.field1552;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Z", line = 184)
    public final boolean method516(int arg0, int arg1) {
        int var3 = 78 / ((arg1 - 50) / 42);
        field1575++;
        return this.field1580 == 64;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Z", line = 202)
    public final boolean method517(int arg0, int arg1) {
        if (arg1 != 26685) {
            this.field1579 = 0.647240721851274D;
        }
        field1574++;
        return this.field1566[arg0].field1549;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 213)
    public final void method518(byte arg0) {
        int var2 = 28 % ((arg0 - 8) / 59);
        for (int var3 = 0; var3 < this.field1566.length; var3++) {
            if (this.field1566[var3] != null) {
                this.field1566[var3].method509();
            }
        }
        field1555++;
        this.field1560 = new class23();
        this.field1576 = this.field1577;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lrd;Lrd;IDI)V", line = 251)
    public class65(class106 arg0, class106 arg1, int arg2, double arg3, int arg4) {
        this.field1577 = arg2;
        this.field1578 = arg1;
        this.field1580 = arg4;
        this.field1579 = arg3;
        this.field1576 = this.field1577;
        int[] var7 = arg0.method847(0, 6431);
        int var8 = var7.length;
        this.field1566 = new class64[arg0.method869(22222, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class39 var10 = new class39(arg0.method857(30580, 0, var7[var9]));
            this.field1566[var7[var9]] = new class64(var10);
        }
    }
}
