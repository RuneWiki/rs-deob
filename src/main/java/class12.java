import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class12 extends class92 {

    @OriginalMember(owner = "client!al", name = "E", descriptor = "[I")
    private final int[] field197 = new int[this.field1638];

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[[B")
    public static byte[][] field191 = new byte[250][];

    @OriginalMember(owner = "client!al", name = "K", descriptor = "Lbd;")
    private static class162 field203 = class17.method142(0, "glow2:");

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Lbd;")
    public static class162 field206 = field203;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Lbd;")
    public static class162 field209 = field203;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Lqb;")
    public static class209 field190 = new class209(32);

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field211 = 2;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Lda;")
    public static class143 field201;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "[B")
    private byte[] field198;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)V", line = 6)
    public final void method98(int arg0, boolean arg1, int arg2) {
        field208++;
        if (arg1) {
            this.field198 = (byte[]) null;
        }
        this.field205 += this.field197[arg0] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(II)I", line = 20)
    public static final int method99(int arg0, int arg1) {
        field202++;
        if (arg0 != -16) {
            field201 = (class143) null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 45)
    public static final void method100(int arg0, int arg1, int arg2) {
        if (arg1 >= -77) {
            field211 = 121;
        }
        field199++;
        class63 var3 = class46.method332(7, arg2, -12770);
        var3.method430(false);
        var3.field971 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V", line = 60)
    public void method101(int arg0, byte arg1) {
        this.field198[this.field189++] = (byte) ((class92.method695(arg1, 255) >> 1) + 127);
        field210++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BJ)V", line = 69)
    public static final void method102(byte arg0, long arg1) {
        field194++;
        int var3 = 122 / ((arg0 - 67) / 47);
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 82)
    public final void method103(int arg0) {
        field200++;
        this.field205 = 0;
        this.field189 = 0;
        if (arg0 != 1644) {
            this.method101(-116, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(II)Z", line = 94)
    public static final boolean method104(int arg0, int arg1) {
        field204++;
        if (class46.field730[arg0]) {
            return true;
        } else if (class231.field3865.method1131(arg1 - 571329371, arg0)) {
            int var2 = class231.field3865.method1121(arg0, (byte) -110);
            if (var2 == 0) {
                class46.field730[arg0] = true;
                return true;
            }
            if (arg1 != 571329488) {
                method105(-119);
            }
            if (class95.field1739[arg0] == null) {
                class95.field1739[arg0] = new class78[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class95.field1739[arg0][var3] == null) {
                    byte[] var4 = class231.field3865.method1128(var3, arg1 ^ 0x220DCBD0, arg0);
                    if (var4 != null) {
                        class95.field1739[arg0][var3] = new class78();
                        class95.field1739[arg0][var3].field1235 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class95.field1739[arg0][var3].method588(new class94(var4), 44);
                        } else {
                            class95.field1739[arg0][var3].method597((byte) -77, new class94(var4));
                        }
                    }
                }
            }
            class46.field730[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Lja;", line = 152)
    public static final class206 method105(int arg0) {
        if (arg0 < 88) {
            field190 = (class209) null;
        }
        field196++;
        try {
            return (class206) Class.forName("ql").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBIIII)V", line = 170)
    public static final void method106(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field192++;
        class46.field731[0].method266(arg4, arg5);
        int var6 = (arg2 - 32) * arg2 / arg3;
        class46.field731[1].method266(arg4, arg5 + arg2 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg0 / (arg3 - arg2);
        if (class117.field2159) {
            class16.method124(arg4, arg5 + 16, 16, arg2 - 32, class186.field3214);
            class16.method124(arg4, arg5 + var7 + 16, 16, var6, class39.field626);
            class16.method123(arg4, arg5 + var7 + 16, var6, class206.field3469);
            class16.method123(arg4 + 1, arg5 - (-16 - var7), var6, class206.field3469);
            class16.method131(arg4, arg5 + var7 + 16, 16, class206.field3469);
            class16.method131(arg4, arg5 + var7 + 17, 16, class206.field3469);
            class16.method123(arg4 + 15, arg5 + 16 + var7, var6, class290.field4888);
            class16.method123(arg4 + 14, arg5 - (-var7 + -17), var6 - 1, class290.field4888);
            class16.method131(arg4, arg5 + var6 + var7 + 15, 16, class290.field4888);
            class16.method131(arg4 + 1, arg5 + 14 + var7 + var6, 15, class290.field4888);
        } else {
            class316.method2174(arg4, arg5 + 16, 16, arg2 - 32, class186.field3214);
            class316.method2174(arg4, arg5 + var7 + 16, 16, var6, class39.field626);
            class316.method2162(arg4, arg5 + var7 + 16, var6, class206.field3469);
            class316.method2162(arg4 + 1, arg5 - -16 - -var7, var6, class206.field3469);
            class316.method2153(arg4, arg5 + var7 + 16, 16, class206.field3469);
            class316.method2153(arg4, arg5 + var7 + 17, 16, class206.field3469);
            class316.method2162(arg4 + 15, arg5 + 16 + var7, var6, class290.field4888);
            class316.method2162(arg4 + 14, var7 + 17 + arg5, var6 - 1, class290.field4888);
            class316.method2153(arg4, arg5 + var6 + var7 + 15, 16, class290.field4888);
            class316.method2153(arg4 + 1, arg5 + 14 + var6 + var7, 15, class290.field4888);
        }
        if (arg1 >= -37) {
            method99(41, -77);
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 217)
    public static void method107(int arg0) {
        field190 = null;
        field191 = (byte[][]) null;
        field203 = null;
        field209 = null;
        field206 = null;
        if (arg0 == 0) {
            field201 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lbd;Z)I", line = 232)
    public static final int method108(class162 arg0, boolean arg1) {
        if (arg1) {
            method99(-39, -41);
        }
        field193++;
        if (class9.field112 == null || arg0.method1249((byte) -118) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class9.field112.field536; var2++) {
            if (class9.field112.field534[var2].method1285(class47.field747, class237.field3947, true).method1268(arg0, 1384)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 266)
    public final void method109(int arg0) {
        field207++;
        if (arg0 > -106) {
            field206 = (class162) null;
        }
        this.field205 = Math.abs(this.field205);
        if (this.field205 >= 4096) {
            this.field205 = 4095;
        }
        this.method101(this.field189++, (byte) (this.field205 >> 4));
        this.field205 = 0;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIF)V", line = 291)
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1638; var7++) {
            this.field197[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
