import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class331 {

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lro;")
    private class1 field4733 = new class1();

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lcs;")
    private class189 field4723;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Llc;")
    public static class386 field4736 = new class386();

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Lra;")
    public static class57 field4739;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public final int method2041(int arg0) {
        if (arg0 != 0) {
            method2048(53);
        }
        field4728++;
        return this.field4721;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2042(int arg0) {
        if (arg0 <= 36) {
            field4739 = null;
        }
        field4725++;
        class274 var2 = (class274) this.field4723.method1207(false);
        while (var2 != null) {
            Object var3 = var2.method298((byte) -110);
            if (var3 != null) {
                return var3;
            }
            class274 var4 = var2;
            var2 = (class274) this.field4723.method1207(false);
            var4.method2290((byte) 98);
            var4.method2519(-2107);
            this.field4721++;
        }
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method2043(int arg0) {
        field4724++;
        this.field4733.method1((byte) 83);
        this.field4723.method1206(71);
        this.field4721 = this.field4730;
        if (arg0 >= -20) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BJ)V")
    private final void method2044(byte arg0, long arg1) {
        if (arg0 != 100) {
            this.method2041(126);
        }
        field4732++;
        class274 var4 = (class274) this.field4723.method1204((byte) -107, arg1);
        if (var4 != null) {
            var4.method2290((byte) 98);
            var4.method2519(-2107);
            this.field4721++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method2045(byte arg0) {
        field4727++;
        class105.field1190 = 0;
        class88.field982 = 0;
        class199.field2717 = 0;
        class109.field1272 = 0;
        if (arg0 != 125) {
            method2045((byte) 118);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method2046(long arg0, int arg1, Object arg2) {
        field4738++;
        this.method2044((byte) 100, arg0);
        if (this.field4721 == arg1) {
            class274 var5 = (class274) this.field4733.method9(-6596);
            var5.method2290((byte) 98);
            var5.method2519(-2107);
        } else {
            this.field4721--;
        }
        class48 var6 = new class48(arg2);
        this.field4723.method1202(-1, arg0, var6);
        this.field4733.method6(-59, var6);
        var6.field5780 = 0L;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
    public final int method2047(int arg0) {
        if (arg0 < 65) {
            field4739 = null;
        }
        field4735++;
        return this.field4730;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static void method2048(int arg0) {
        if (arg0 == 0) {
            field4739 = null;
            field4736 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2049(int arg0, long arg1) {
        field4731++;
        class274 var4 = (class274) this.field4723.method1204((byte) -78, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method298((byte) -50);
        if (var5 == null) {
            var4.method2290((byte) 98);
            var4.method2519(-2107);
            this.field4721++;
            return null;
        } else if (arg0 > -44) {
            return null;
        } else {
            if (var4.method297(264559256)) {
                class48 var6 = new class48(var5);
                this.field4723.method1202(-1, var4.field5248, var6);
                this.field4733.method6(74, var6);
                var6.field5780 = 0L;
                var4.method2290((byte) 98);
                var4.method2519(-2107);
            } else {
                this.field4733.method6(-75, var4);
                var4.field5780 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lbk;I)Lsr;")
    public static final class136 method2050(class211 arg0, int arg1) {
        if (arg1 == 1) {
            field4737++;
            return new class136(arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1353(108), arg0.method1353(97), arg0.method1342((byte) -127));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2051(boolean arg0) {
        field4734++;
        class274 var2 = (class274) this.field4723.method1212(-16);
        if (!arg0) {
            method2048(28);
        }
        while (var2 != null) {
            Object var3 = var2.method298((byte) -87);
            if (var3 != null) {
                return var3;
            }
            class274 var4 = var2;
            var2 = (class274) this.field4723.method1207(false);
            var4.method2290((byte) 98);
            var4.method2519(-2107);
            this.field4721++;
        }
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
    public class331(int arg0) {
        this.field4730 = arg0;
        this.field4721 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4723 = new class189(var2);
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public final void method2052(int arg0) {
        field4729++;
        class274 var2 = (class274) this.field4733.method2(15056);
        if (arg0 != 0) {
            this.method2052(-89);
        }
        while (var2 != null) {
            if (var2.method297(arg0 ^ 0xFC4DA98)) {
                var2.method2290((byte) 98);
                var2.method2519(-2107);
                this.field4721++;
            }
            var2 = (class274) this.field4733.method10(120);
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
    public final int method2053(int arg0) {
        field4726++;
        int var2 = arg0;
        for (class274 var3 = (class274) this.field4733.method2(arg0 + 15056); var3 != null; var3 = (class274) this.field4733.method10(91)) {
            if (!var3.method297(arg0 ^ 0xFC4DA98)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
    public final void method2054(int arg0, int arg1) {
        int var3 = -41 % ((arg0 - 12) / 54);
        if (class247.field3353 != null) {
            for (class274 var4 = (class274) this.field4733.method2(15056); var4 != null; var4 = (class274) this.field4733.method10(101)) {
                if (var4.method297(264559256)) {
                    if (var4.method298((byte) -41) == null) {
                        var4.method2290((byte) 98);
                        var4.method2519(-2107);
                        this.field4721++;
                    }
                } else if (++var4.field5780 > (long) arg1) {
                    class274 var5 = class247.field3353.method1528(var4, 79);
                    this.field4723.method1202(-1, var4.field5248, var5);
                    class251.method1574(-1, var4, var5);
                    var4.method2290((byte) 98);
                    var4.method2519(-2107);
                }
            }
        }
        field4720++;
    }
}
