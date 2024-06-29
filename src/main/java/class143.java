import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class143 {

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "Lmga;")
    private class666 field2302 = new class666(64);

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "Lmga;")
    public class666 field2319 = new class666(50);

    @OriginalMember(owner = "client!faa", name = "v", descriptor = "Ljea;")
    public class420 field2321 = new class420(250);

    @OriginalMember(owner = "client!faa", name = "w", descriptor = "Lrf;")
    private class77 field2322 = new class77();

    @OriginalMember(owner = "client!faa", name = "x", descriptor = "Lia;")
    private class551 field2323;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Lbi;")
    public class449 field2300;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Z")
    private boolean field2310;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "Lbi;")
    private class449 field2313;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2325;

    @OriginalMember(owner = "client!faa", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field2324;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field2307 = -1;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "Ldb;")
    public static class298 field2315 = new class298(81, -2);

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!faa", name = "u", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "Lnb;")
    public static class278 field2316;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method1038(int arg0, boolean arg1) {
        field2301++;
        if (arg0 != 36) {
            this.field2313 = null;
        }
        if (arg1 != this.field2310) {
            this.field2310 = arg1;
            this.method1042(true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILta;ZLoa;ZIILoa;ILwi;II)Lxa;", line = 21)
    public final class468 method1039(int arg0, class200 arg1, boolean arg2, class651 arg3, boolean arg4, int arg5, int arg6, class651 arg7, int arg8, class435 arg9, int arg10, int arg11) {
        field2317++;
        class468 var13 = this.method1043(arg11, arg9, arg5, arg7, arg10, arg6, arg8, (byte) 109);
        if (var13 != null) {
            return var13;
        } else if (arg0 == 81) {
            class577 var14 = this.method1047(arg8, arg0 - 82);
            if (arg10 > 1 && var14.field7644 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (var14.field7669[var16] <= arg10 && var14.field7669[var16] != 0) {
                        var15 = var14.field7644[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method1047(var15, arg0 - 82);
                }
            }
            int[] var17 = var14.method3163(arg6, arg1, arg3, arg9, arg2, arg7, arg11, arg10, -1, arg5);
            if (var17 == null) {
                return null;
            }
            class468 var18;
            if (arg4) {
                var18 = arg3.method374(var17, 0, 36, 36, 32);
            } else {
                var18 = arg7.method374(var17, 0, 36, 36, 32);
            }
            if (!arg4) {
                class77 var19 = new class77();
                var19.field1209 = arg9 != null;
                var19.field1213 = arg5;
                var19.field1211 = arg7.field8804;
                var19.field1205 = arg6;
                var19.field1207 = arg8;
                var19.field1203 = arg10;
                var19.field1212 = arg11;
                this.field2321.method2407(1, var18, var19);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 90)
    public final void method1040(byte arg0) {
        field2309++;
        int var2 = -73 % ((-arg0 - 56) / 54);
        class420 var3 = this.field2321;
        synchronized (this.field2321) {
            this.field2321.method2410(true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 106)
    public final void method1041(int arg0) {
        field2320++;
        class666 var2 = this.field2302;
        synchronized (this.field2302) {
            this.field2302.method3748(6);
        }
        class666 var3 = this.field2319;
        synchronized (this.field2319) {
            this.field2319.method3748(6);
            if (arg0 > -3) {
                this.method1042(false);
            }
        }
        class420 var4 = this.field2321;
        synchronized (this.field2321) {
            this.field2321.method2408(1);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V", line = 125)
    public final void method1042(boolean arg0) {
        field2305++;
        class666 var2 = this.field2302;
        synchronized (this.field2302) {
            this.field2302.method3739(0);
        }
        if (!arg0) {
            this.method1048(67, -6);
        }
        class666 var3 = this.field2319;
        synchronized (this.field2319) {
            this.field2319.method3739(0);
        }
        class420 var4 = this.field2321;
        synchronized (this.field2321) {
            this.field2321.method2410(arg0);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILwi;ILoa;IIIB)Lxa;", line = 145)
    public final class468 method1043(int arg0, class435 arg1, int arg2, class651 arg3, int arg4, int arg5, int arg6, byte arg7) {
        this.field2322.field1211 = arg3.field8804;
        this.field2322.field1212 = arg0;
        this.field2322.field1209 = arg1 != null;
        this.field2322.field1203 = arg4;
        if (arg7 < 82) {
            this.field2300 = null;
        }
        field2314++;
        this.field2322.field1205 = arg5;
        this.field2322.field1207 = arg6;
        this.field2322.field1213 = arg2;
        return (class468) this.field2321.method2417(this.field2322, -91);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V", line = 165)
    public static void method1044(int arg0) {
        field2316 = null;
        int var1 = -60 / ((-arg0 - 10) / 59);
        field2315 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V", line = 179)
    public final void method1045(int arg0, int arg1) {
        field2312++;
        class666 var3 = this.field2302;
        synchronized (this.field2302) {
            this.field2302.method3740((byte) 60, arg0);
        }
        class666 var4 = this.field2319;
        synchronized (this.field2319) {
            this.field2319.method3740((byte) 60, arg0);
        }
        class420 var5 = this.field2321;
        synchronized (this.field2321) {
            this.field2321.method2404(12764, arg0);
            if (arg1 != 50) {
                method1044(-41);
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V", line = 200)
    public final void method1046(byte arg0) {
        field2304++;
        class666 var2 = this.field2319;
        synchronized (this.field2319) {
            this.field2319.method3739(0);
        }
        if (arg0 != -16) {
            this.method1043(-51, null, -1, null, 11, 122, 10, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)Lmfa;", line = 213)
    public final class577 method1047(int arg0, int arg1) {
        field2318++;
        class666 var3 = this.field2302;
        class577 var4;
        synchronized (this.field2302) {
            var4 = (class577) this.field2302.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field2313;
        byte[] var6;
        synchronized (this.field2313) {
            var6 = this.field2313.method2537(false, class413.method2366(arg0, 123), class149.method1069(arg0, 31156));
        }
        class577 var7 = new class577();
        var7.field7615 = this;
        var7.field7670 = arg0;
        var7.field7616 = new String[] { null, null, class72.field1071.method546(this.field2311, (byte) -35), null, null };
        var7.field7674 = new String[] { null, null, null, null, class72.field1072.method546(this.field2311, (byte) -35) };
        if (var6 != null) {
            var7.method3169((byte) 122, new class335(var6));
        }
        var7.method3161(true);
        if (var7.field7628 != -1) {
            var7.method3170(this.method1047(var7.field7628, -1), this.method1047(var7.field7666, -1), (byte) -9);
        }
        if (var7.field7653 != arg1) {
            var7.method3171(this.method1047(var7.field7653, -1), this.method1047(var7.field7685, arg1), (byte) -112);
        }
        if (!this.field2310 && var7.field7636) {
            var7.field7679 = class72.field1069.method546(this.field2311, (byte) -35);
            var7.field7688 = 0;
            var7.field7674 = this.field2324;
            var7.field7690 = false;
            var7.field7616 = this.field2325;
            var7.field7654 = null;
            if (var7.field7621 != null) {
                boolean var8 = false;
                for (class504 var9 = var7.field7621.method2915(66); var9 != null; var9 = var7.field7621.method2912((byte) 109)) {
                    class538 var10 = this.field2323.method3062((byte) -78, (int) var9.field6724);
                    if (var10.field7105) {
                        var9.method2797(49);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7621 = null;
                }
            }
        }
        class666 var11 = this.field2302;
        synchronized (this.field2302) {
            this.field2302.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)V", line = 293)
    public final void method1048(int arg0, int arg1) {
        this.field2326 = arg1;
        field2306++;
        class666 var3 = this.field2319;
        synchronized (this.field2319) {
            this.field2319.method3739(0);
        }
        int var4 = 87 / ((arg0 - 81) / 38);
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lpca;IZLia;Lbi;Lbi;)V", line = 335)
    public class143(class671 arg0, int arg1, boolean arg2, class551 arg3, class449 arg4, class449 arg5) {
        this.field2323 = arg3;
        this.field2300 = arg5;
        this.field2310 = arg2;
        this.field2311 = arg1;
        this.field2313 = arg4;
        if (this.field2313 == null) {
            this.field2303 = 0;
        } else {
            int var7 = this.field2313.method2545(0) - 1;
            this.field2303 = this.field2313.method2527(0, var7) + var7 * 256;
        }
        this.field2325 = new String[] { null, null, class72.field1071.method546(this.field2311, (byte) -35), null, null };
        this.field2324 = new String[] { null, null, null, null, class72.field1072.method546(this.field2311, (byte) -35) };
    }
}
