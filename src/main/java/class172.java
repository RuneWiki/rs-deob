import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class172 extends class139 {

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field3489 = 20;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    private int field3497 = 1365;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    private int field3499 = 0;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "Lad;")
    public static class5 field3490 = new class5();

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field3496;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field3491 = arg2.method390((byte) 89);
                    }
                } else {
                    this.field3499 = arg2.method390((byte) 102);
                }
            } else {
                this.field3489 = arg2.method390((byte) 127);
            }
        } else {
            this.field3497 = arg2.method390((byte) 114);
        }
        if (arg1 != 21) {
            this.field3497 = 85;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z[Loa;IIII[BIII)V")
    public static final void method1154(boolean arg0, class131[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        ++field3494;
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; var15 < 8; ++var15) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && ~(arg8 + var15) < -1 && ~(arg8 + var15) > -104) {
                    arg1[arg3].field2736[arg5 + var10][arg8 + var15] = class133.method887(arg1[arg3].field2736[arg5 + var10][arg8 + var15], -16777217);
                }
            }
        }
        class52 var11 = new class52(arg6);
        if (!arg0) {
            field3490 = null;
        }
        for (int var12 = 0; var12 < 4; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (arg7 == var12 && ~var13 <= ~arg2 && var13 < arg2 + 8 && arg4 <= var14 && arg4 + 8 > var14) {
                        class184.method1247(arg3, 24, class68.method483(arg9, 7 & var14, -120, 7 & var13) + arg5, 0, 0, var11, arg8 + class86.method603(var14 & 7, var13 & 7, arg9, 108), arg9);
                    } else {
                        class184.method1247(0, 24, -1, 0, 0, var11, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z")
    public static final boolean method1155(int arg0) {
        ++field3498;
        class137 var1 = class175.field3528;
        synchronized (class175.field3528) {
            if (class31.field626 == class112.field2376) {
                return false;
            } else if (arg0 <= 30) {
                return false;
            } else {
                class39.field810 = class199.field3940[class31.field626];
                class57.field1160 = class137.field2832[class31.field626];
                class31.field626 = class31.field626 - -1 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
    public static void method1156(int arg0) {
        field3490 = null;
        if (arg0 <= 76) {
            field3493 = -13;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3488;
        if (arg1 != 7451) {
            field3487 = -75;
        }
        int[] var3 = super.field2859.method1319(-104, arg0);
        if (super.field2859.field3966) {
            for (int var4 = 0; var4 < class23.field402; ++var4) {
                int var5 = (class180.field3607[arg0] << 12) / this.field3497 + this.field3491;
                int var6 = (class189.field3772[var4] << 12) / this.field3497 + this.field3499;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && this.field3489 > var13) {
                    ++var13;
                    var9 = (var9 * var10 >> 12) * 2 + var8;
                    var10 = -var12 + var11 - -var7;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field3489 + -1) ? 0 : (var13 << 12) / this.field3489;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)I")
    public static final int method1157(int arg0) {
        if (arg0 != 7) {
            field3490 = null;
        }
        ++field3500;
        return class49.field960++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILs;J)V")
    public static final void method1158(int arg0, int arg1, int arg2, int arg3, class166 arg4, long arg5) {
        if (arg4 != null) {
            class9 var7 = new class9();
            var7.field184 = arg4;
            var7.field185 = arg1 * 128 + 64;
            var7.field181 = arg2 * 128 + 64;
            var7.field191 = arg3;
            var7.field192 = arg5;
            if (class97.field2054[arg0][arg1][arg2] == null) {
                class97.field2054[arg0][arg1][arg2] = new class111(arg0, arg1, arg2);
            }
            class97.field2054[arg0][arg1][arg2].field2357 = var7;
        }
    }
}
