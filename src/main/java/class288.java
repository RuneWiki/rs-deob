import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class288 {

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "Lut;")
    private class136 field3465;

    @OriginalMember(owner = "client!tja", name = "q", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
    private int field3469;

    @OriginalMember(owner = "client!tja", name = "r", descriptor = "Ldj;")
    private class362 field3478;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "Ljw;")
    public static class581 field3466 = null;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!tja", name = "j", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!tja", name = "k", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tja", name = "l", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!tja", name = "m", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tja", name = "o", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!tja", name = "p", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!tja", name = "s", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tja", name = "n", descriptor = "[I")
    public static int[] field3474;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method1682(int arg0) {
        field3473++;
        if (arg0 < 19) {
            this.method1685((byte) 72);
        }
        class325 var2 = (class325) this.field3478.method2111((byte) 67);
        while (var2 != null) {
            Object var3 = var2.method1934(648);
            if (var3 != null) {
                return var3;
            }
            class325 var4 = var2;
            var2 = (class325) this.field3478.method2111((byte) 2);
            var4.method2219(13630);
            var4.method1088(4);
            this.field3469 += var4.field4028;
        }
        return null;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V", line = 36)
    public final void method1683(Object arg0, int arg1, int arg2, long arg3) {
        field3470++;
        int var6 = -84 / ((7 - arg2) / 57);
        if (this.field3477 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method1693(arg3, (byte) 5);
        this.field3469 -= arg1;
        while (this.field3469 < 0) {
            class325 var8 = (class325) this.field3465.method1006(24360);
            this.method1695(var8, 0);
        }
        class669 var7 = new class669(arg0, arg1);
        this.field3478.method2112(var7, (byte) 6, arg3);
        this.field3465.method1005(-44, var7);
        var7.field1894 = 0L;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 65)
    public final Object method1684(long arg0, int arg1) {
        if (arg1 != -359) {
            this.method1686(126, 2L, null);
        }
        field3479++;
        class325 var4 = (class325) this.field3478.method2121(arg1 ^ 0xFFFFFEDC, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1934(648);
        if (var5 == null) {
            var4.method2219(13630);
            var4.method1088(4);
            this.field3469 += var4.field4028;
            return null;
        }
        if (var4.method1932((byte) 66)) {
            class669 var6 = new class669(var5, var4.field4028);
            this.field3478.method2112(var6, (byte) 6, var4.field4809);
            this.field3465.method1005(arg1 + 235, var6);
            var6.field1894 = 0L;
            var4.method2219(13630);
            var4.method1088(4);
        } else {
            this.field3465.method1005(arg1 ^ 0x156, var4);
            var4.field1894 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)I", line = 108)
    public final int method1685(byte arg0) {
        if (arg0 > -14) {
            field3466 = null;
        }
        field3461++;
        return this.field3469;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 122)
    public final void method1686(int arg0, long arg1, Object arg2) {
        if (arg0 != -25638) {
            this.method1690(27);
        }
        this.method1683(arg2, 1, -54, arg1);
        field3475++;
    }

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(B)V", line = 139)
    public final void method1687(byte arg0) {
        if (arg0 != 61) {
            return;
        }
        for (class325 var2 = (class325) this.field3465.method1003((byte) 53); var2 != null; var2 = (class325) this.field3465.method1004(true)) {
            if (var2.method1932((byte) 89)) {
                var2.method2219(13630);
                var2.method1088(4);
                this.field3469 += var2.field4028;
            }
        }
        field3467++;
    }

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V", line = 165)
    public static void method1688(int arg0) {
        field3474 = null;
        field3466 = null;
        if (arg0 != 0) {
            field3474 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "(I)I", line = 177)
    public final int method1689(int arg0) {
        if (arg0 >= -84) {
            this.field3478 = null;
        }
        field3462++;
        return this.field3477;
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(I)V", line = 193)
    public class288(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "(I)V", line = 197)
    public final void method1690(int arg0) {
        this.field3465.method1000(31335);
        field3464++;
        this.field3478.method2115(arg0);
        this.field3469 = this.field3477;
    }

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "(B)I", line = 208)
    public final int method1691(byte arg0) {
        field3463++;
        if (arg0 != 121) {
            return -23;
        }
        int var2 = 0;
        for (class325 var3 = (class325) this.field3465.method1003((byte) 53); var3 != null; var3 = (class325) this.field3465.method1004(true)) {
            if (!var3.method1932((byte) 74)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 236)
    public final Object method1692(int arg0) {
        field3468++;
        if (arg0 != 0) {
            this.field3477 = 43;
        }
        class325 var2 = (class325) this.field3478.method2119(-60);
        while (var2 != null) {
            Object var3 = var2.method1934(648);
            if (var3 != null) {
                return var3;
            }
            class325 var4 = var2;
            var2 = (class325) this.field3478.method2111((byte) 4);
            var4.method2219(13630);
            var4.method1088(arg0 + 4);
            this.field3469 += var4.field4028;
        }
        return null;
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(II)V", line = 347)
    public class288(int arg0, int arg1) {
        this.field3465 = new class136();
        this.field3477 = arg0;
        this.field3469 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && var3 < arg1; var3 += var3) {
        }
        this.field3478 = new class362(var3);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(JB)V", line = 270)
    private final void method1693(long arg0, byte arg1) {
        if (arg1 != 5) {
            this.method1682(-52);
        }
        field3476++;
        class325 var4 = (class325) this.field3478.method2121(68, arg0);
        this.method1695(var4, 0);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)V", line = 283)
    public final void method1694(int arg0, int arg1) {
        if (class55.field736 != null) {
            for (class325 var3 = (class325) this.field3465.method1003((byte) 53); var3 != null; var3 = (class325) this.field3465.method1004(true)) {
                if (var3.method1932((byte) 33)) {
                    if (var3.method1934(648) == null) {
                        var3.method2219(13630);
                        var3.method1088(4);
                        this.field3469 += var3.field4028;
                    }
                } else if ((long) arg0 < ++var3.field1894) {
                    class325 var4 = class55.field736.method1574(var3, false);
                    this.field3478.method2112(var4, (byte) 6, var3.field4809);
                    class670.method3760(50, var3, var4);
                    var3.method2219(13630);
                    var3.method1088(4);
                }
            }
        }
        field3472++;
        if (arg1 >= -22) {
            this.method1682(-104);
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lle;I)V", line = 331)
    private final void method1695(class325 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2219(arg1 ^ 0x353E);
            arg0.method1088(4);
            this.field3469 += arg0.field4028;
        }
        if (arg1 == 0) {
            field3471++;
        }
    }
}
