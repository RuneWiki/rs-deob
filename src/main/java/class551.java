import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class551 extends class159 {

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "Z")
    private boolean field7605 = true;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Ljava/lang/String;")
    public String field7604 = null;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public int field7599 = 0;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "[Lgl;")
    public static class625[] field7609 = new class625[4];

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Ljb;")
    public static class519 field7601 = new class519(76, -1);

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field7614 = 0;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "B")
    public byte field7610;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "B")
    public byte field7615;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "J")
    public long field7596;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "Ltn;")
    public static class95 field7606;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Z")
    private boolean field7597;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "[I")
    private int[] field7607;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "[Ldha;")
    public class85[] field7598;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLdha;)V")
    public final void method3164(byte arg0, class85 arg1) {
        if (this.field7598 == null || this.field7598.length <= this.field7599) {
            this.method3170(2917, this.field7599 + 5);
        }
        ++field7613;
        this.field7598[this.field7599++] = arg1;
        if (arg0 <= 56) {
            field7614 = -39;
        }
        this.field7607 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method3165(int arg0) {
        ++field7595;
        if (~class248.field3246.toLowerCase().indexOf("microsoft") != 0) {
            class88.field1241[220] = 74;
            class88.field1241[189] = 26;
            class88.field1241[187] = 27;
            class88.field1241[188] = 71;
            class88.field1241[192] = 58;
            class88.field1241[191] = 73;
            class88.field1241[186] = 57;
            class88.field1241[223] = 28;
            class88.field1241[190] = 72;
            class88.field1241[219] = 42;
            class88.field1241[221] = 43;
            class88.field1241[222] = 59;
        } else {
            class88.field1241[46] = 72;
            if (class248.field3256 == null) {
                class88.field1241[222] = 59;
                class88.field1241[192] = 58;
            } else {
                class88.field1241[222] = 58;
                class88.field1241[192] = 28;
                class88.field1241[520] = 59;
            }
            class88.field1241[44] = 71;
            class88.field1241[92] = 74;
            class88.field1241[45] = 26;
            class88.field1241[91] = 42;
            class88.field1241[47] = 73;
            class88.field1241[61] = 27;
            class88.field1241[59] = 57;
            class88.field1241[93] = 43;
        }
        if (arg0 != 190) {
            method3166((byte) -108);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method3166(byte arg0) {
        field7601 = null;
        field7606 = null;
        if (arg0 != 89) {
            method3173(25, -126, -86, 120, 29, -50, -123, 106);
        }
        field7609 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method3167(String arg0, byte arg1) {
        ++field7612;
        for (int var3 = 0; ~var3 > ~this.field7599; ++var3) {
            if (this.field7598[var3].field1206.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        if (arg1 != -19) {
            this.method3172(79, 116);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)[I")
    public final int[] method3168(int arg0) {
        ++field7608;
        if (this.field7607 == null) {
            this.field7607 = new int[this.field7599];
            String[] var2 = new String[this.field7599];
            int var3 = 0;
            while (~this.field7599 < ~var3) {
                var2[var3] = this.field7598[var3].field1206;
                this.field7607[var3] = var3++;
            }
            class267.method1785(var2, this.field7607, 3);
        }
        int var4 = 79 / ((-63 - arg0) / 40);
        return this.field7607;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
    public static final void method3169(int arg0, int arg1) {
        ++field7602;
        if (arg1 == 58) {
            class23.field237 = new int[arg0];
            class414.field5958 = new int[arg0];
            class730.field9894 = new int[arg0];
            class157.field2114 = new int[arg0];
            class304.field4276 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
    private final void method3170(int arg0, int arg1) {
        if (arg0 != 2917) {
            this.field7599 = -119;
        }
        if (this.field7598 == null) {
            this.field7598 = new class85[arg1];
        } else {
            class421.method2533(this.field7598, 0, this.field7598 = new class85[arg1], 0, this.field7599);
        }
        ++field7600;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLdt;)V")
    private final void method3171(boolean arg0, class254 arg1) {
        ++field7603;
        int var3 = arg1.method1731((byte) 64);
        if (~(1 & var3) != -1) {
            this.field7597 = true;
        }
        if ((var3 & 2) != 0) {
            this.field7605 = true;
        }
        super.field2146 = arg1.method1723(21795);
        if (!arg0) {
            this.field7596 = arg1.method1723(21795);
            this.field7604 = arg1.method1699(-90);
            arg1.method1731((byte) 64);
            this.field7615 = arg1.method1737(!arg0);
            this.field7610 = arg1.method1737(true);
            this.field7599 = arg1.method1728((byte) 50);
            if (~this.field7599 < -1) {
                this.field7598 = new class85[this.field7599];
                for (int var4 = 0; ~this.field7599 < ~var4; ++var4) {
                    class85 var5 = new class85();
                    if (this.field7597) {
                        arg1.method1723(21795);
                    }
                    if (this.field7605) {
                        var5.field1206 = arg1.method1699(-62);
                    }
                    var5.field1209 = arg1.method1737(true);
                    var5.field1210 = arg1.method1728((byte) 70);
                    this.field7598[var4] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
    public final void method3172(int arg0, int arg1) {
        --this.field7599;
        ++field7594;
        if (arg0 != 22165) {
            this.method3172(117, 79);
        }
        if (~this.field7599 != -1) {
            class421.method2533(this.field7598, arg1 + 1, this.field7598, arg1, -arg1 + this.field7599);
        } else {
            this.field7598 = null;
        }
        this.field7607 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7611;
        int var8 = arg1 + arg5;
        int var9 = arg6 - arg1;
        for (int var10 = arg5; var8 > var10; ++var10) {
            class464.method2733(arg0, arg7, arg3, -22816, class228.field2951[var10]);
        }
        int var11 = -arg1 + arg3;
        int var12 = arg6;
        if (arg2 != 0) {
            field7601 = null;
        }
        while (var12 > var9) {
            class464.method2733(arg0, arg7, arg3, -22816, class228.field2951[var12]);
            --var12;
        }
        int var13 = arg1 + arg7;
        for (int var14 = var8; ~var9 <= ~var14; ++var14) {
            int[] var15 = class228.field2951[var14];
            class464.method2733(arg0, arg7, var13, arg2 + -22816, var15);
            class464.method2733(arg4, var13, var11, arg2 ^ -22816, var15);
            class464.method2733(arg0, var11, arg3, -22816, var15);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ldt;)V")
    public class551(class254 arg0) {
        this.method3171(false, arg0);
    }
}
