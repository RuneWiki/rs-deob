import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class380 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lgfa;")
    private class150 field5020;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field5027;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    private int field5024;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lwh;")
    private class546 field5036;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lbk;")
    public static class122 field5023 = new class122(8);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 3)
    public final void method2168(byte arg0) {
        if (arg0 >= -67) {
            this.method2180(-10);
        }
        this.field5020.method884(-128);
        field5037++;
        this.field5036.method3063((byte) -98);
        this.field5027 = this.field5024;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILok;)V", line = 16)
    private final void method2169(int arg0, class99 arg1) {
        if (arg0 != 8) {
            this.method2175((byte) 4);
        }
        field5035++;
        if (arg1 != null) {
            arg1.method242(true);
            arg1.method1982((byte) -24);
            this.field5027 += arg1.field1195;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2170(boolean arg0) {
        if (arg0) {
            method2170(false);
        }
        field5023 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/Object;IJ)V", line = 57)
    public final void method2171(byte arg0, Object arg1, int arg2, long arg3) {
        field5032++;
        if (arg2 > this.field5024) {
            throw new IllegalStateException("s>cs");
        }
        this.method2173((byte) -123, arg3);
        this.field5027 -= arg2;
        while (this.field5027 < 0) {
            class99 var7 = (class99) this.field5020.method885((byte) -94);
            this.method2169(8, var7);
        }
        class664 var6 = new class664(arg1, arg2);
        this.field5036.method3061(arg0 + 207, arg3, var6);
        this.field5020.method879((byte) -110, var6);
        var6.field4564 = 0L;
        if (arg0 != -83) {
            this.field5036 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 87)
    public final void method2172(int arg0) {
        field5031++;
        for (class99 var2 = (class99) this.field5020.method878(false); var2 != null; var2 = (class99) this.field5020.method880(-11278)) {
            if (var2.method560(-128)) {
                var2.method242(true);
                var2.method1982((byte) -24);
                this.field5027 += var2.field1195;
            }
        }
        if (arg0 != -15112) {
            this.field5036 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BJ)V", line = 116)
    private final void method2173(byte arg0, long arg1) {
        field5021++;
        class99 var4 = (class99) this.field5036.method3057(1, arg1);
        this.method2169(8, var4);
        if (arg0 > -122) {
            this.method2177(64);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 129)
    public final void method2174(Object arg0, long arg1, byte arg2) {
        field5028++;
        this.method2171((byte) -83, arg0, 1, arg1);
        int var5 = -114 % ((82 - arg2) / 40);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I", line = 139)
    public final int method2175(byte arg0) {
        int var2 = -15 % ((arg0 - 26) / 57);
        field5025++;
        int var3 = 0;
        for (class99 var4 = (class99) this.field5020.method878(false); var4 != null; var4 = (class99) this.field5020.method880(-11278)) {
            if (!var4.method560(-127)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 164)
    public final Object method2176(int arg0, long arg1) {
        field5033++;
        class99 var4 = (class99) this.field5036.method3057(1, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 >= -123) {
            this.method2172(45);
        }
        Object var5 = var4.method561(false);
        if (var5 == null) {
            var4.method242(true);
            var4.method1982((byte) -24);
            this.field5027 += var4.field1195;
            return null;
        }
        if (var4.method560(-113)) {
            class664 var6 = new class664(var5, var4.field1195);
            this.field5036.method3061(127, var4.field545, var6);
            this.field5020.method879((byte) -93, var6);
            var6.field4564 = 0L;
            var4.method242(true);
            var4.method1982((byte) -24);
        } else {
            this.field5020.method879((byte) -113, var4);
            var4.field4564 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V", line = 208)
    public class380(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 212)
    public final Object method2177(int arg0) {
        field5030++;
        int var2 = 12 % ((arg0 - 11) / 48);
        class99 var3 = (class99) this.field5036.method3056(18113);
        while (var3 != null) {
            Object var4 = var3.method561(false);
            if (var4 != null) {
                return var4;
            }
            class99 var5 = var3;
            var3 = (class99) this.field5036.method3056(18113);
            var5.method242(true);
            var5.method1982((byte) -24);
            this.field5027 += var5.field1195;
        }
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I", line = 243)
    public final int method2178(byte arg0) {
        field5034++;
        if (arg0 > -15) {
            this.method2168((byte) -55);
        }
        return this.field5027;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V", line = 255)
    public final void method2179(boolean arg0, int arg1) {
        if (arg0) {
            this.method2178((byte) -48);
        }
        if (class82.field949 != null) {
            for (class99 var3 = (class99) this.field5020.method878(false); var3 != null; var3 = (class99) this.field5020.method880(-11278)) {
                if (var3.method560(-120)) {
                    if (var3.method561(false) == null) {
                        var3.method242(true);
                        var3.method1982((byte) -24);
                        this.field5027++;
                    }
                } else if ((++var3.field4564) > ((long) arg1)) {
                    class99 var4 = class82.field949.method42(var3, (byte) -77);
                    this.field5036.method3061(126, var3.field545, var4);
                    class72.method398(var3, var4, 36161);
                    var3.method242(true);
                    var3.method1982((byte) -24);
                }
            }
        }
        field5022++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 306)
    public final Object method2180(int arg0) {
        field5029++;
        if (arg0 != 1) {
            return null;
        }
        class99 var2 = (class99) this.field5036.method3053((byte) 66);
        while (var2 != null) {
            Object var3 = var2.method561(false);
            if (var3 != null) {
                return var3;
            }
            class99 var4 = var2;
            var2 = (class99) this.field5036.method3056(arg0 ^ 0x46C0);
            var4.method242(true);
            var4.method1982((byte) -24);
            this.field5027 += var4.field1195;
        }
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)I", line = 337)
    public final int method2181(boolean arg0) {
        field5026++;
        if (!arg0) {
            this.field5027 = -24;
        }
        return this.field5024;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V", line = 352)
    public class380(int arg0, int arg1) {
        this.field5020 = new class150();
        this.field5027 = arg0;
        this.field5024 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
        }
        this.field5036 = new class546(var3);
    }
}
