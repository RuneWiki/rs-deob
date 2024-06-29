import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class251 extends class23 {

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "[B")
    private byte[] field4165 = new byte[512];

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public int field4164 = 0;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    public int field4160 = 4;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "Z")
    public boolean field4151 = true;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public int field4163 = 4;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public int field4167 = 1638;

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "I")
    public int field4172 = 4;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Lqd;")
    public static class40 field4158 = class147.method1106("gleiten:", (byte) -111);

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "[Z")
    public static boolean[] field4162 = new boolean[112];

    @OriginalMember(owner = "client!id", name = "ub", descriptor = "I")
    public static int field4173 = 0;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!id", name = "vb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "Lce;")
    public static class239 field4155;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "[S")
    private short[] field4152;

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "[S")
    private short[] field4171;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V", line = 9)
    private final void method1772(int arg0) {
        if (this.field4167 > 0) {
            this.field4152 = new short[this.field4160];
            this.field4171 = new short[this.field4160];
            for (int var3 = 0; var3 < this.field4160; var3++) {
                this.field4171[var3] = (short) ((int) (Math.pow((double) ((float) this.field4167 / 4096.0F), (double) var3) * 4096.0D));
                this.field4152[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4171 != null && this.field4171.length == this.field4160) {
            this.field4152 = new short[this.field4160];
            for (int var2 = 0; var2 < this.field4160; var2++) {
                this.field4152[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != 2) {
            this.method1773(-47, 68, 77, -96, -9, 4, -121);
        }
        field4154++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 50)
    public final void method61(byte arg0) {
        this.field4165 = class122.method923(this.field4164, -112);
        this.method1772(arg0 ^ 0x6);
        field4159++;
        for (int var2 = this.field4160 - 1; var2 >= 1; var2--) {
            short var3 = this.field4171[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4160--;
        }
        if (arg0 != 4) {
            method1775(19, false, 93, -105, true, false, -4);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILsd;)V", line = 101)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field4151 = arg2.method226(255) == 1;
        } else if (arg0 == 1) {
            this.field4160 = arg2.method226(255);
        } else if (arg0 == 2) {
            this.field4167 = arg2.method201(true);
            if (this.field4167 < 0) {
                this.field4171 = new short[this.field4160];
                for (int var5 = 0; var5 < this.field4160; var5++) {
                    this.field4171[var5] = (short) arg2.method201(true);
                }
            }
        } else if (arg0 == 3) {
            this.field4172 = this.field4163 = arg2.method226(255);
        } else if (arg0 == 4) {
            this.field4164 = arg2.method226(arg1 ^ 0xFF);
        } else if (arg0 == 5) {
            this.field4172 = arg2.method226(255);
        } else if (arg0 == 6) {
            this.field4163 = arg2.method226(255);
        }
        field4174++;
        if (arg1 != 0) {
            method1777(-62, false);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[I", line = 196)
    public final int[] method32(byte arg0, int arg1) {
        field4161++;
        int[] var3 = this.field403.method724((byte) 85, arg1);
        if (this.field403.field1760) {
            this.method1776(arg1, var3, arg0 ^ 0x5AB99C6E);
        }
        if (arg0 != -94) {
            this.method32((byte) -126, -2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)I", line = 217)
    private final int method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4170++;
        int var8 = arg3 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        if (arg2 <= var10) {
            var10 = 0;
        }
        int var11 = var9 & 0xFF;
        int var12 = var10 & 0xFF;
        int var13 = this.field4165[arg1 + var11] & 0x3;
        int var14 = arg6 & arg0;
        int var15 = var14 - 4096;
        int var16;
        if (var13 <= 1) {
            var16 = var13 == 0 ? arg3 + var14 : arg3 - var14;
        } else {
            var16 = var13 == 2 ? var14 - arg3 : -arg3 + -var14;
        }
        int var17 = this.field4165[arg1 + var12] & 0x3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 == 0 ? arg3 + var15 : -var15 + arg3;
        } else {
            var18 = var17 == 2 ? var15 - arg3 : -var15 - arg3;
        }
        int var19 = this.field4165[arg5 + var11] & 0x3;
        int var20 = class186.field3000[var14];
        int var21 = var16 + ((var18 - var16) * var20 >> 12);
        int var22;
        if (var19 > 1) {
            var22 = var19 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var22 = var19 == 0 ? var8 + var14 : -var14 + var8;
        }
        int var23 = this.field4165[arg5 + var12] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var15 - var8 : -var8 + -var15;
        } else {
            var24 = var23 == 0 ? var8 + var15 : -var15 + var8;
        }
        int var25 = ((var24 - var22) * var20 >> 12) + var22;
        return ((var25 - var21) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V", line = 294)
    public static void method1774(int arg0) {
        field4155 = null;
        field4162 = null;
        field4158 = null;
        if (arg0 != 3000) {
            method1777(-51, false);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 306)
    public class251() {
        super(0, true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIZZI)V", line = 326)
    public static final void method1775(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg1) {
            return;
        }
        if (arg0 < arg2) {
            int var7 = (arg0 + arg2) / 2;
            class291 var8 = class89.field1611[var7];
            int var9 = arg0;
            class89.field1611[var7] = class89.field1611[arg2];
            class89.field1611[arg2] = var8;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (class210.method1480(arg5, class89.field1611[var10], arg4, (byte) 78, arg3, arg6, var8) <= 0) {
                    class291 var11 = class89.field1611[var10];
                    class89.field1611[var10] = class89.field1611[var9];
                    class89.field1611[var9++] = var11;
                }
            }
            class89.field1611[arg2] = class89.field1611[var9];
            class89.field1611[var9] = var8;
            method1775(arg0, false, var9 - 1, arg3, arg4, arg5, arg6);
            method1775(var9 + 1, false, arg2, arg3, arg4, arg5, arg6);
        }
        field4153++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[II)V", line = 376)
    public final void method1776(int arg0, int[] arg1, int arg2) {
        field4157++;
        if (arg2 != -1522113588) {
            this.method32((byte) 109, -85);
        }
        int var4 = class150.field2509[arg0] * this.field4163;
        if (this.field4160 == 1) {
            int var5 = this.field4152[0] << 12;
            int var6 = this.field4172 * var5 >> 12;
            int var7 = var4 * var5 >> 12;
            int var8 = var7 >> 12;
            int var9 = var8 + 1;
            int var10 = var7 & 0xFFF;
            short var11 = this.field4171[0];
            int var12 = this.field4163 * var5 >> 12;
            int var13 = class186.field3000[var10];
            int var14 = this.field4165[var8 & 0xFF] & 0xFF;
            if (var12 <= var9) {
                var9 = 0;
            }
            int var15 = this.field4165[var9 & 0xFF] & 0xFF;
            if (this.field4151) {
                for (int var19 = 0; var19 < class52.field1007; var19++) {
                    int var20 = class315.field5345[var19] * this.field4172;
                    int var21 = this.method1773(arg2 ^ 0xA5466C33, var14, var6, var10, var13, var15, var5 * var20 >> 12);
                    int var22 = var11 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class52.field1007; var16++) {
                    int var17 = class315.field5345[var16] * this.field4172;
                    int var18 = this.method1773(4095, var14, var6, var10, var13, var15, var5 * var17 >> 12);
                    arg1[var16] = var11 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field4171[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field4152[0] << 12;
            int var25 = this.field4163 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = var26 >> 12;
            int var28 = this.field4172 * var24 >> 12;
            int var29 = var26 & 0xFFF;
            int var30 = this.field4165[var27 & 0xFF] & 0xFF;
            int var31 = class186.field3000[var29];
            int var32 = var27 + 1;
            if (var32 >= var25) {
                var32 = 0;
            }
            int var33 = this.field4165[var32 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class52.field1007; var34++) {
                int var35 = class315.field5345[var34] * this.field4172;
                int var36 = this.method1773(arg2 ^ 0xA5466C33, var30, var28, var29, var31, var33, var24 * var35 >> 12);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field4160; var37++) {
            short var38 = this.field4171[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field4152[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field4163 * var39 >> 12;
                int var42 = this.field4172 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                int var45 = this.field4165[var43 & 0xFF] & 0xFF;
                if (var41 <= var44) {
                    var44 = 0;
                }
                int var46 = var40 & 0xFFF;
                int var47 = this.field4165[var44 & 0xFF] & 0xFF;
                int var48 = class186.field3000[var46];
                if (this.field4151 && (this.field4160 - 1) == var37) {
                    for (int var49 = 0; var49 < class52.field1007; var49++) {
                        int var50 = class315.field5345[var49] * this.field4172;
                        int var51 = this.method1773(4095, var45, var42, var46, var48, var47, var39 * var50 >> 12);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class52.field1007; var53++) {
                        int var54 = class315.field5345[var53] * this.field4172;
                        int var55 = this.method1773(4095, var45, var42, var46, var48, var47, var39 * var54 >> 12);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V", line = 545)
    public static final void method1777(int arg0, boolean arg1) {
        if (arg1) {
            if (class148.field2499 != -1) {
                class135.method998(class148.field2499, (byte) -59);
            }
            for (class297 var2 = (class297) class165.field2731.method1400(arg0); var2 != null; var2 = (class297) class165.field2731.method1403(114)) {
                class310.method2119(true, 1, var2);
            }
            class148.field2499 = -1;
            class165.field2731 = new class199(8);
            class206.method1448(-122);
            class148.field2499 = class249.field4117;
            class248.method1754(false, (byte) 67);
            class298.method2031(119);
            class227.method1590(class148.field2499, 47);
        }
        class255.field4233 = new class258();
        class255.field4233.field1497 = 3000;
        field4168++;
        class255.field4233.field1531 = 3000;
        if (class21.field350) {
            if (class103.field1814 == 2) {
                class238.field3922 = class233.field3836 << 7;
                class289.field4841 = class244.field4023 << 7;
            } else {
                class314.method2167(arg0 ^ 0x7C);
            }
            class153.method1195(1120341478);
            class166.method1250(6);
            class271.method1879(28, 17646);
        } else {
            class15.method87(arg0 - 26835, class120.field2030);
            class271.method1879(10, arg0 ^ 0xFFFFBB11);
        }
        if (arg0 != -1) {
            method1775(-122, false, 28, -42, true, true, -68);
        }
    }
}
