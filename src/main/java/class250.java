import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class250 extends class40 {

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Lci;")
    public class60 field4098 = new class60();

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Lgj;")
    public class38 field4103 = new class38();

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lne;")
    private class78 field4101;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field4086 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "[I")
    public static int[] field4091 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field4102 = null;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "[Lcj;")
    public static class74[] field4092;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lok;")
    public final class40 method251() {
        class10 var1 = (class10) this.field4098.method379(6347);
        field4087++;
        if (var1 == null) {
            return null;
        } else if (var1.field142 == null) {
            return this.method252();
        } else {
            return var1.field142;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public final void method253(int arg0) {
        this.field4103.method253(arg0);
        field4096++;
        for (class10 var2 = (class10) this.field4098.method379(6347); var2 != null; var2 = (class10) this.field4098.method378(68)) {
            if (!this.field4101.method501(var2, 77)) {
                int var3 = arg0;
                do {
                    if (var2.field143 >= var3) {
                        this.method1664(var3, var2, (byte) 125);
                        var2.field143 -= var3;
                        break;
                    }
                    this.method1664(var2.field143, var2, (byte) -11);
                    var3 -= var2.field143;
                } while (!this.field4101.method476(var2, (int[]) null, 0, -1, var3));
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()Lok;")
    public final class40 method252() {
        field4090++;
        class10 var1;
        do {
            var1 = (class10) this.field4098.method378(-74);
            if (var1 == null) {
                return null;
            }
        } while (var1.field142 == null);
        return var1.field142;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V")
    public final void method257(int[] arg0, int arg1, int arg2) {
        this.field4103.method257(arg0, arg1, arg2);
        for (class10 var4 = (class10) this.field4098.method379(6347); var4 != null; var4 = (class10) this.field4098.method378(-102)) {
            if (!this.field4101.method501(var4, -121)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field143) {
                        this.method1667(var5, var4, var5 + var6, var6, 1, arg0);
                        var4.field143 -= var6;
                        break;
                    }
                    this.method1667(var5, var4, var5 + var6, var4.field143, 1, arg0);
                    var6 -= var4.field143;
                    var5 += var4.field143;
                } while (!this.field4101.method476(var4, arg0, var5, -1, var6));
            }
        }
        field4094++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILtj;B)V")
    private final void method1664(int arg0, class10 arg1, byte arg2) {
        int var4 = 64 % ((55 - arg2) / 62);
        field4100++;
        if ((this.field4101.field1302[arg1.field132] & 0x4) != 0 && arg1.field125 < 0) {
            int var5 = this.field4101.field1312[arg1.field132] / class81.field1478;
            int var6 = (var5 + 1048575 - arg1.field122) / var5;
            arg1.field122 = arg1.field122 + (arg0 * var5) & 0xFFFFF;
            if (var6 <= arg0) {
                if (this.field4101.field1331[arg1.field132] == 0) {
                    arg1.field142 = class284.method1861(arg1.field131, arg1.field142.method1887(), arg1.field142.method1872(), arg1.field142.method1896());
                } else {
                    arg1.field142 = class284.method1861(arg1.field131, arg1.field142.method1887(), 0, arg1.field142.method1896());
                    this.field4101.method475(-120, arg1.field128.field4067[arg1.field135] < 0, arg1);
                }
                if (arg1.field128.field4067[arg1.field135] < 0) {
                    arg1.field142.method1900(-1);
                }
                arg0 = arg1.field122 / var5;
            }
        }
        arg1.field142.method253(arg0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1665(boolean arg0) {
        field4091 = null;
        field4102 = null;
        if (arg0) {
            field4093 = 41;
        }
        field4092 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIZIII)I")
    public static final int method1666(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            method1668(false);
        }
        field4089++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 1 - (arg5 - 7) - arg4;
        } else {
            return 1 + 7 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILtj;III[I)V")
    private final void method1667(int arg0, class10 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 != 1) {
            this.field4098 = null;
        }
        field4095++;
        if ((this.field4101.field1302[arg1.field132] & 0x4) != 0 && arg1.field125 < 0) {
            int var7 = this.field4101.field1312[arg1.field132] / class81.field1478;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field122) / var7;
                if (var8 > arg3) {
                    arg1.field122 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                int var9 = 262144 / var7;
                arg1.field142.method257(arg5, arg0, var8);
                int var10 = class81.field1478 / 100;
                arg0 += var8;
                arg1.field122 += var7 * var8 - 1048576;
                if (var9 < var10) {
                    var10 = var9;
                }
                class284 var11 = arg1.field142;
                if (this.field4101.field1331[arg1.field132] == 0) {
                    arg1.field142 = class284.method1861(arg1.field131, var11.method1887(), var11.method1872(), var11.method1896());
                } else {
                    arg1.field142 = class284.method1861(arg1.field131, var11.method1887(), 0, var11.method1896());
                    this.field4101.method475(arg4 ^ 0xFFFFFFC2, arg1.field128.field4067[arg1.field135] < 0, arg1);
                    arg1.field142.method1873(var10, var11.method1872());
                }
                if (arg1.field128.field4067[arg1.field135] < 0) {
                    arg1.field142.method1900(-1);
                }
                var11.method1891(var10);
                var11.method257(arg5, arg0, arg2 - arg0);
                if (var11.method1884()) {
                    this.field4103.method254(var11);
                }
            }
        }
        arg1.field142.method257(arg5, arg0, arg3);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)[Lid;")
    public static final class100[] method1668(boolean arg0) {
        field4099++;
        class100[] var1 = new class100[class110.field1990];
        for (int var2 = 0; var2 < class110.field1990; var2++) {
            var1[var2] = new class148(class79.field1365, class9.field116, class112.field2028[var2], class213.field3588[var2], class110.field1983[var2], class12.field168[var2], class199.field3226[var2], class54.field941);
        }
        if (arg0) {
            field4093 = 13;
        }
        class253.method1679((byte) -93);
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method256() {
        field4088++;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lne;)V")
    public class250(class78 arg0) {
        this.field4101 = arg0;
    }
}
