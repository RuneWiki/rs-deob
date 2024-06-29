import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class564 {

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Z")
    private boolean field8179 = true;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    private int field8177 = -1;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    private int field8162;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    private int field8173;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "[Lvw;")
    private class557[] field8166;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    private int field8167;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "[Lvw;")
    private class557[] field8168;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "Lvw;")
    private class557 field8178;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lea;")
    public static class478 field8164 = new class478(0, -1);

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Z")
    public static boolean field8175 = false;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "Z")
    public static boolean field8170 = false;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    private int field8169;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    private int field8171;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lda;")
    public static class400 field8163;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Lla;")
    public static class423 field8184;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Ltd;")
    private class515 field8165;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Z")
    public static boolean field8172;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lha;BI)Z")
    public final boolean method3374(class543 arg0, byte arg1, int arg2) {
        field8176++;
        if (this.field8177 != arg2) {
            this.field8177 = arg2;
            int var4 = class468.method2829(118, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8171 != var4) {
                this.field8171 = var4;
                this.field8165 = null;
            }
            if (this.field8166 != null) {
                this.field8169 = 0;
                int[] var5 = new int[this.field8166.length];
                for (int var6 = 0; var6 < this.field8166.length; var6++) {
                    class557 var7 = this.field8166[var6];
                    if (var7.method3344(this.field8162, this.field8173, this.field8167, this.field8177)) {
                        var5[this.field8169] = var7.field8096;
                        this.field8168[this.field8169++] = var7;
                    }
                }
                class510.method3103(this.field8168, this.field8169 - 1, arg1 + 206, 0, var5);
            }
            this.field8179 = true;
        }
        boolean var8 = false;
        if (this.field8179) {
            this.field8179 = false;
            for (int var9 = this.field8169 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8168[var9].method3343(arg0, this.field8178);
                this.field8179 |= !var10;
                var8 |= var10;
            }
        }
        return arg1 == 49 ? var8 : true;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public final void method3375(boolean arg0) {
        if (this.field8166 != null) {
            for (int var2 = 0; var2 < this.field8166.length; var2++) {
                this.field8166[var2].method3342();
            }
        }
        field8182++;
        if (arg0) {
            this.field8171 = -73;
        }
        this.field8165 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method3376(byte arg0) {
        field8164 = null;
        field8184 = null;
        field8163 = null;
        int var1 = 119 % ((arg0 - 21) / 56);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIILha;I)V")
    public final void method3377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class543 arg8, int arg9) {
        int var11 = arg2 + arg6 & 0x3FFF;
        field8180++;
        if (arg4 != -3) {
            return;
        }
        if (this.field8181 == -1 || this.field8171 == 0) {
            arg8.method397(arg1, arg9, arg5, arg3, arg7, 0);
        } else {
            class679 var12 = class453.field6479.method962(this.field8181, 2904);
            if (this.field8165 == null && class453.field6479.method963((byte) 41, this.field8181)) {
                int[] var13 = var12.field9632 == 2 ? class453.field6479.method966(this.field8171, false, 0.7F, this.field8171, false, this.field8181) : class453.field6479.method964(105, false, this.field8171, this.field8181, this.field8171, 0.7F);
                this.field8165 = arg8.method3265(var13, this.field8171, this.field8171, this.field8171, 0, (byte) 50);
            }
            if (var12.field9632 == 2) {
                arg8.method397(arg1, arg9, arg5, arg3, arg7, 0);
            }
            if (this.field8165 != null) {
                int var14 = var12.field9632 == 2 ? 1 : 0;
                int var15 = arg0 * arg3 / -4096;
                int var16;
                for (var16 = (arg5 - arg3) / 2 + (arg3 * var11 / 4096); var16 > arg3; var16 -= arg3) {
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg5; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field8165.method3130(arg1 + var17, arg9 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8169 - 1; var19 >= 0; var19--) {
            this.field8168[var19].method3345(arg8, arg1, arg9, arg5, arg3, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILnf;)Z")
    public static final boolean method3378(int arg0, int arg1, int arg2, int arg3, class19 arg4) {
        field8183++;
        if (!class522.field7591 || !class511.field7403) {
            return false;
        } else if (class163.field2324 < 100) {
            return false;
        } else if (class141.method998(arg1, 81, arg3, arg2)) {
            int var5 = arg1 << class639.field9095;
            int var6 = arg3 << class639.field9095;
            int var7 = class95.field1372[arg2].method2087(59, arg1, arg3) - 1;
            int var8 = arg4.method595(32767) + var7;
            if (arg4.field181 == 1) {
                if (!class403.method2446(var5, var8, var5, var6 + class150.field2190, 33, var6, var7, var6, var8, var5)) {
                    return false;
                } else if (class403.method2446(var5, var7, var5, class150.field2190 + var6, 31, class150.field2190 + var6, var7, var6, var8, var5)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == 2) {
                if (!class403.method2446(var5, var8, class150.field2190 + var5, var6 - -class150.field2190, 47, class150.field2190 + var6, var7, class150.field2190 + var6, var8, var5)) {
                    return false;
                } else if (class403.method2446(var5 + class150.field2190, var8, class150.field2190 + var5, class150.field2190 + var6, arg0 + 88, var6 - -class150.field2190, var7, var6 + class150.field2190, var7, var5)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == 4) {
                if (!class403.method2446(var5 + class150.field2190, var8, var5 + class150.field2190, class150.field2190 + var6, 77, var6, var7, var6, var8, class150.field2190 + var5)) {
                    return false;
                } else if (class403.method2446(class150.field2190 + var5, var7, class150.field2190 + var5, class150.field2190 + var6, 120, class150.field2190 + var6, var7, var6, var8, var5 + class150.field2190)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == arg0) {
                if (!class403.method2446(var5, var8, var5 + class150.field2190, var6, arg0 + 59, var6, var7, var6, var8, var5)) {
                    return false;
                } else if (class403.method2446(var5 + class150.field2190, var8, var5 + class150.field2190, var6, 16, var6, var7, var6, var7, var5)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == 16) {
                if (class550.method3313(var7, var5, class231.field3477, (byte) -63, class231.field3477, var8, class231.field3477 + var6)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == 32) {
                if (class550.method3313(var7, class231.field3477 + var5, class231.field3477, (byte) -79, class231.field3477, var8, class231.field3477 + var6)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 == 64) {
                if (class550.method3313(var7, class231.field3477 + var5, class231.field3477, (byte) -98, class231.field3477, var8, var6)) {
                    class343.field4713++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field181 != 128) {
                return true;
            } else if (class550.method3313(var7, var5, class231.field3477, (byte) -66, class231.field3477, var8, var6)) {
                class343.field4713++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I[Lvw;IIII)V")
    public class564(int arg0, class557[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8162 = arg3;
        this.field8173 = arg4;
        this.field8166 = arg1;
        this.field8181 = arg0;
        this.field8167 = arg5;
        if (arg1 == null) {
            this.field8168 = null;
            this.field8178 = null;
        } else {
            this.field8168 = new class557[arg1.length];
            this.field8178 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
