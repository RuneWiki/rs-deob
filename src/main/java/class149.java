import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class149 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "F")
    public float field2113 = 0.25F;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "F")
    public float field2116 = 1.0F;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "F")
    public float field2127 = 1.0F;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "F")
    public float field2114;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "F")
    public float field2115;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lto;")
    public class8 field2122;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "F")
    public float field2126;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lcu;")
    public static class145 field2120 = new class145(58, 2);

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Lvj;")
    public static class304 field2128;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lpc;")
    public static class473 field2130;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "[I")
    public static int[] field2131;

    static {
        new class304("Select", "Auswählen", "Sélectionner", "Selecionar");
        field2128 = new class304("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
        field2129 = 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 4)
    public static void method1026(int arg0) {
        field2128 = null;
        field2131 = null;
        field2130 = null;
        field2120 = null;
        if (arg0 > -51) {
            method1029(-31, -86, true, 69, 102, false, 81);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lmd;I)V", line = 17)
    public final void method1027(class379 arg0, int arg1) {
        field2124++;
        this.field2127 = (float) (arg0.method2238(255) * 8) / 255.0F;
        this.field2113 = (float) (arg1 * arg0.method2238(255)) / 255.0F;
        this.field2116 = (float) (arg0.method2238(255) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)I", line = 38)
    public static final int method1028(int arg0, int arg1, int arg2) {
        field2112++;
        if (arg1 > -77) {
            method1026(-91);
        }
        int var3 = class102.method720(arg0 + 91923, arg2 + 45365, (byte) -85, 4) + (class102.method720(arg0 + 37821, arg2 + 10294, (byte) -85, 2) - 128 >> 1) + (class102.method720(arg0, arg2, (byte) -85, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 146)
    public class149() {
        this.field2114 = 0.69921875F;
        this.field2118 = 0;
        this.field2115 = 1.2F;
        this.field2122 = class434.field5954;
        this.field2111 = -50;
        this.field2117 = -60;
        this.field2126 = 1.1523438F;
        this.field2123 = -50;
        this.field2110 = class105.field1546;
        this.field2121 = class353.field4778;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lmd;)V", line = 162)
    public class149(class379 arg0) {
        int var2 = arg0.method2238(255);
        if (class154.field2244.method3086(class166.field2414, (byte) 60) && class302.field3987.method597() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2110 = class105.field1546;
            } else {
                this.field2110 = arg0.method2232((byte) 125);
            }
            if ((var2 & 0x2) == 0) {
                this.field2126 = 1.1523438F;
            } else {
                this.field2126 = (float) arg0.method2212((byte) 83) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2114 = 0.69921875F;
            } else {
                this.field2114 = (float) arg0.method2212((byte) 83) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2115 = 1.2F;
            } else {
                this.field2115 = (float) arg0.method2212((byte) 83) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2232((byte) 125);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2212((byte) 83);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2212((byte) 83);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2212((byte) 83);
            }
            this.field2115 = 1.2F;
            this.field2114 = 0.69921875F;
            this.field2110 = class105.field1546;
            this.field2126 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2123 = -50;
            this.field2111 = -50;
            this.field2117 = -60;
        } else {
            this.field2111 = arg0.method2202(-26372);
            this.field2117 = arg0.method2202(-26372);
            this.field2123 = arg0.method2202(-26372);
        }
        if ((var2 & 0x20) == 0) {
            this.field2121 = class353.field4778;
        } else {
            this.field2121 = arg0.method2232((byte) 124);
        }
        if ((var2 & 0x40) == 0) {
            this.field2118 = 0;
        } else {
            this.field2118 = arg0.method2212((byte) 83);
        }
        if ((var2 & 0x80) == 0) {
            this.field2122 = class434.field5954;
        } else {
            int var3 = arg0.method2212((byte) 83);
            int var4 = arg0.method2212((byte) 83);
            int var5 = arg0.method2212((byte) 83);
            int var6 = arg0.method2212((byte) 83);
            int var7 = arg0.method2212((byte) 83);
            int var8 = arg0.method2212((byte) 83);
            this.field2122 = class21.method197(var3, var7, var4, var5, var6, 10, var8);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZIIZI)V", line = 62)
    public static final void method1029(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 > arg3) {
            int var7 = (arg3 + arg1) / 2;
            int var8 = arg3;
            class386 var9 = class391.field5303[var7];
            class391.field5303[var7] = class391.field5303[arg1];
            class391.field5303[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (class233.method1448(var9, arg0, class391.field5303[var10], arg2, arg6, arg5, (byte) -102) <= 0) {
                    class386 var11 = class391.field5303[var10];
                    class391.field5303[var10] = class391.field5303[var8];
                    class391.field5303[var8++] = var11;
                }
            }
            class391.field5303[arg1] = class391.field5303[var8];
            class391.field5303[var8] = var9;
            method1029(arg0, var8 - 1, arg2, arg3, 2, arg5, arg6);
            method1029(arg0, arg1, arg2, var8 + 1, arg4, arg5, arg6);
        }
        if (arg4 != 2) {
            method1029(-9, 107, false, 58, 1, false, -48);
        }
        field2119++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lem;B)Z", line = 113)
    public final boolean method1030(class149 arg0, byte arg1) {
        if (arg1 != 3) {
            this.field2122 = null;
        }
        field2125++;
        return this.field2110 == arg0.field2110 && this.field2126 == arg0.field2126 && this.field2114 == arg0.field2114 && this.field2115 == arg0.field2115 && this.field2113 == arg0.field2113 && this.field2127 == arg0.field2127 && this.field2116 == arg0.field2116 && this.field2121 == arg0.field2121 && this.field2118 == arg0.field2118 && this.field2122 == arg0.field2122;
    }
}
