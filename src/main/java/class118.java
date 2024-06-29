import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class118 {

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Ltn;")
    private class59 field1651 = new class59();

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Lib;")
    private class106 field1640;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "[F")
    public static float[] field1639 = new float[16];

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "Lho;")
    public static class102 field1645 = new class102(7, 0, 1, 1);

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Lhk;")
    public static class67 field1655 = new class67(8192);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILbq;)V")
    private final void method928(int arg0, class190 arg1) {
        field1646++;
        long var3 = arg1.method1338((byte) 126);
        class444 var5 = (class444) this.field1640.method875(var3, 123);
        if (arg0 <= 33) {
            this.field1651 = null;
        }
        while (var5 != null) {
            if (var5.field6579.method1337(arg1, 27398)) {
                this.method930(var5, 21808);
                return;
            }
            var5 = (class444) this.field1640.method872(-1);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
    public final int method929(int arg0) {
        if (arg0 <= 93) {
            field1639 = null;
        }
        field1644++;
        return this.field1652;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lmh;I)V")
    private final void method930(class444 arg0, int arg1) {
        if (arg1 != 21808) {
            this.field1640 = null;
        }
        field1649++;
        if (arg0 != null) {
            arg0.method1525((byte) -107);
            arg0.method2307((byte) 71);
            this.field1652 += arg0.field6574;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lbq;I)Ljava/lang/Object;")
    public final Object method931(class190 arg0, int arg1) {
        field1642++;
        long var3 = arg0.method1338((byte) 125);
        if (arg1 != 14278) {
            this.method929(88);
        }
        for (class444 var5 = (class444) this.field1640.method875(var3, 125); var5 != null; var5 = (class444) this.field1640.method872(-1)) {
            if (var5.field6579.method1337(arg0, arg1 + 13120)) {
                Object var6 = var5.method718((byte) 43);
                if (var6 != null) {
                    if (var5.method719((byte) 114)) {
                        class366 var7 = new class366(arg0, var6, var5.field6574);
                        this.field1640.method878(var5.field3271, -2301, var7);
                        this.field1651.method536(-116, var7);
                        var7.field5561 = 0L;
                        var5.method1525((byte) 90);
                        var5.method2307((byte) -91);
                    } else {
                        this.field1651.method536(-115, var5);
                        var5.field5561 = 0L;
                    }
                    return var6;
                }
                var5.method1525((byte) -111);
                var5.method2307((byte) 97);
                this.field1652 += var5.field6574;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method932(int arg0) {
        field1655 = null;
        field1645 = null;
        field1639 = null;
        if (arg0 != 8192) {
            field1655 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILfs;BI)Ljq;")
    public static final class353 method933(int arg0, class387 arg1, byte arg2, int arg3) {
        field1653++;
        byte[] var4 = arg1.method2363(arg0, arg3, arg2 + 7);
        if (arg2 != 89) {
            field1639 = null;
        }
        return var4 == null ? null : new class353(var4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
    public static final int method934(int arg0, int arg1) {
        int var7 = arg0 - 1;
        if (arg1 != 269173057) {
            return 107;
        }
        field1648++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
    public final void method935(int arg0, int arg1) {
        field1637++;
        int var3 = -41 / ((-arg0 - 37) / 42);
        if (class430.field6322 == null) {
            return;
        }
        for (class444 var4 = (class444) this.field1651.method537((byte) 87); var4 != null; var4 = (class444) this.field1651.method540(true)) {
            if (var4.method719((byte) 95)) {
                if (var4.method718((byte) 75) == null) {
                    var4.method1525((byte) -115);
                    var4.method2307((byte) 19);
                    this.field1652 += var4.field6574;
                }
            } else if ((++var4.field5561) > ((long) arg1)) {
                class444 var5 = class430.field6322.method1(var4, -69);
                this.field1640.method878(var4.field3271, -2301, var5);
                class284.method1813(true, var4, var5);
                var4.method1525((byte) -112);
                var4.method2307((byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public final void method936(boolean arg0) {
        if (!arg0) {
            this.method929(-74);
        }
        field1654++;
        this.field1651.method535((byte) -77);
        this.field1640.method874(0);
        this.field1652 = this.field1647;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public final void method937(int arg0) {
        class444 var2 = (class444) this.field1651.method537((byte) 87);
        if (arg0 <= 18) {
            return;
        }
        while (var2 != null) {
            if (var2.method719((byte) 86)) {
                var2.method1525((byte) -92);
                var2.method2307((byte) -74);
                this.field1652 += var2.field6574;
            }
            var2 = (class444) this.field1651.method540(true);
        }
        field1641++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/lang/Object;Lbq;)V")
    public final void method938(int arg0, Object arg1, class190 arg2) {
        this.method940(arg2, arg1, false, 1);
        if (arg0 >= 44) {
            field1638++;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
    public final int method939(byte arg0) {
        field1643++;
        int var2 = -78 / ((arg0 + 63) / 36);
        return this.field1647;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lbq;Ljava/lang/Object;ZI)V")
    private final void method940(class190 arg0, Object arg1, boolean arg2, int arg3) {
        field1650++;
        if (arg3 > this.field1647) {
            throw new IllegalStateException("s>cs");
        }
        this.method928(80, arg0);
        this.field1652 -= arg3;
        while (this.field1652 < 0) {
            class444 var6 = (class444) this.field1651.method539((byte) -63);
            this.method930(var6, 21808);
        }
        if (arg2) {
            this.method937(-125);
        }
        class366 var5 = new class366(arg0, arg1, arg3);
        this.field1640.method878(arg0.method1338((byte) 113), -2301, var5);
        this.field1651.method536(-119, var5);
        var5.field5561 = 0L;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field1652 = arg0;
        this.field1647 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1640 = new class106(var2);
    }
}
