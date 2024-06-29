import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class16 {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lij;")
    private class242 field237 = new class242();

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lge;")
    private class235 field239;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lha;")
    public static class46 field229 = class271.method1828("<br>", -46);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
    public static short[] field233 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
    public static boolean field244 = false;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    public static int[] field245 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lha;")
    public static class46 field232 = null;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "F")
    public static float field234;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
    public final void method80(Object arg0, long arg1, byte arg2) {
        this.method85(arg1, (byte) -3);
        field241++;
        if (this.field243 == 0) {
            class151 var5 = (class151) this.field237.method1660(arg2 ^ 0xFFFFFFC5);
            var5.method501(0);
            var5.method1219(64);
        } else {
            this.field243--;
        }
        class12 var6 = new class12(arg0);
        if (arg2 != 67) {
            field244 = true;
        }
        this.field239.method1597(arg1, (byte) -126, var6);
        this.field237.method1664(arg2 - 187, var6);
        var6.field3053 = 0L;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
    public final void method81(byte arg0, int arg1) {
        if (arg0 != 30) {
            return;
        }
        field236++;
        if (class232.field4038 == null) {
            return;
        }
        for (class151 var3 = (class151) this.field237.method1658((byte) 101); var3 != null; var3 = (class151) this.field237.method1662((byte) 97)) {
            if (var3.method68(-12)) {
                if (var3.method67(-83) == null) {
                    var3.method501(0);
                    var3.method1219(arg0 ^ 0x5E);
                    this.field243++;
                }
            } else if (++var3.field3053 > (long) arg1) {
                class151 var4 = class232.field4038.method1027((byte) 124, var3);
                this.field239.method1597(var3.field1195, (byte) -126, var4);
                class106.method796(6, var3, var4);
                var3.method501(0);
                var3.method1219(64);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method82(int arg0, byte[] arg1) {
        field230++;
        if (arg0 < 38) {
            method82(106, (byte[]) null);
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class104.method782(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public final void method83(int arg0) {
        for (class151 var2 = (class151) this.field237.method1658((byte) -77); var2 != null; var2 = (class151) this.field237.method1662((byte) 27)) {
            if (var2.method68(-103)) {
                var2.method501(0);
                var2.method1219(arg0 ^ 0x62C0);
                this.field243++;
            }
        }
        field242++;
        if (arg0 != 25216) {
            method87((byte) 41, (class181) null);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        this.field237.method1665(1502);
        this.field239.method1599(25);
        this.field243 = this.field235;
        if (arg0 == -32377) {
            field231++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JB)V")
    public final void method85(long arg0, byte arg1) {
        field238++;
        if (arg1 != -3) {
            field233 = null;
        }
        class151 var4 = (class151) this.field239.method1601(-61, arg0);
        if (var4 != null) {
            var4.method501(0);
            var4.method1219(64);
            this.field243++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method86(int arg0, long arg1) {
        class151 var4 = (class151) this.field239.method1601(-66, arg1);
        field240++;
        if (var4 == null) {
            return null;
        }
        if (arg0 != 7961) {
            this.field243 = 80;
        }
        Object var5 = var4.method67(64);
        if (var5 == null) {
            var4.method501(arg0 - 7961);
            var4.method1219(64);
            this.field243++;
            return null;
        }
        if (var4.method68(arg0 ^ 0x1F6D)) {
            class12 var6 = new class12(var5);
            this.field239.method1597(var4.field1195, (byte) -126, var6);
            this.field237.method1664(-121, var6);
            var6.field3053 = 0L;
            var4.method501(arg0 ^ 0x1F19);
            var4.method1219(arg0 - 7897);
        } else {
            this.field237.method1664(arg0 - 8070, var4);
            var4.field3053 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
    public class16(int arg0) {
        this.field235 = arg0;
        this.field243 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field239 = new class235(var2);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLpi;)V")
    public static final void method87(byte arg0, class181 arg1) {
        field246++;
        if (arg0 < 78) {
            method88(41);
        }
        class236.field4120 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method88(int arg0) {
        if (arg0 != -4163) {
            method88(-70);
        }
        field229 = null;
        field233 = null;
        field245 = null;
        field232 = null;
    }
}
