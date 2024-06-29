import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class536 extends class561 {

    @OriginalMember(owner = "client!at", name = "r", descriptor = "[[I")
    public static int[][] field7476 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!at", name = "t", descriptor = "Lim;")
    public static class353 field7478 = new class353(61, 2);

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Lov;")
    public static class346 field7473;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lba;")
    private class607 field7474;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public static void method2980(int arg0) {
        field7473 = null;
        field7476 = null;
        field7478 = null;
        if (arg0 != 1) {
            method2984(null, 110);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lge;I)V")
    public final void method2981(class551 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3045(-125);
            if (var3 == 0) {
                field7477++;
                int var4 = -87 % ((-arg1 - 35) / 63);
                return;
            }
            this.method2986(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(JI)V")
    public static final void method2982(long arg0, int arg1) {
        field7475++;
        int var3 = class83.field1134 + class147.field1899.field6362;
        if (arg1 != 1) {
            field7480 = 6;
        }
        int var4 = class585.field8464 + class147.field1899.field6368;
        if ((class223.field2859 - var3) < -2000 || class223.field2859 - var3 > 2000 || (class21.field301 - var4) < -2000 || class21.field301 - var4 > 2000) {
            class21.field301 = var4;
            class223.field2859 = var3;
        }
        if (class223.field2859 != var3) {
            int var5 = var3 - class223.field2859;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class223.field2859 += var6;
        }
        if (!class501.field6954.field7869) {
            class521.field7250 += (float) arg0 * class628.field9169 / 6.0F;
            class568.field7951 += (float) arg0 * class418.field5711 / 6.0F;
        }
        if (class21.field301 != var4) {
            int var7 = var4 - class21.field301;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class21.field301 += var8;
        }
        class509.method2849(3);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZI)I")
    public final int method2983(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field7476 = null;
        }
        field7484++;
        if (this.field7474 == null) {
            return arg2;
        } else {
            class147 var4 = (class147) this.field7474.method3476((long) arg0, (byte) 28);
            return var4 == null ? arg2 : var4.field1902;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2984(byte[] arg0, int arg1) {
        field7481++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class205.method1311(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2985(int arg0, String arg1, int arg2) {
        if (arg0 != -21928) {
            return null;
        }
        field7483++;
        if (this.field7474 == null) {
            return arg1;
        } else {
            class63 var4 = (class63) this.field7474.method3476((long) arg2, (byte) 28);
            return var4 == null ? arg1 : var4.field862;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lge;ZI)V")
    private final void method2986(class551 arg0, boolean arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method3045(-125);
            if (this.field7474 == null) {
                int var5 = class468.method2685(var4, false);
                this.field7474 = new class607(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method3045(-126) == 1;
                int var8 = arg0.method3043((byte) 49);
                class108 var9;
                if (var7) {
                    var9 = new class63(arg0.method3077(-20739));
                } else {
                    var9 = new class147(arg0.method3048(-4));
                }
                this.field7474.method3475(-91, var9, (long) var8);
            }
        }
        if (!arg1) {
            method2987(70, -101, -124, false, -85, 63);
        }
        field7479++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIZII)V")
    public static final void method2987(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7482++;
        int var6 = arg4 - arg5;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class78.method447(arg4, arg5, arg0, (byte) -111, arg2);
            }
        } else if (var6 == 0) {
            class48.method265(arg0, arg2, arg5, arg1, 4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            if (!arg3) {
                field7478 = null;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg1;
                arg2 = arg5;
                arg5 = var9;
                arg1 = arg4;
                arg4 = var10;
            }
            if (arg1 < arg2) {
                int var11 = arg2;
                int var12 = arg5;
                arg2 = arg1;
                arg5 = arg4;
                arg1 = var11;
                arg4 = var12;
            }
            int var13 = arg5;
            int var14 = arg1 - arg2;
            int var15 = arg4 - arg5;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg4 > arg5 ? 1 : -1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg1; var18++) {
                    class256.field3173[var18][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg1; var19++) {
                    var16 += var15;
                    class256.field3173[var13][var19] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }
}
