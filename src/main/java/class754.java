import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class754 {

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
    public boolean field10527 = false;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Luh;")
    public static class168 field10532 = new class168();

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field10534 = 1401;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "Lmu;")
    public static class303 field10533 = new class303(106, 8);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public int field10526;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public int field10529;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "Loda;")
    public class119 field10524;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIII)V", line = 16)
    public static final void method4205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10528++;
        if (arg0 >= 1 && arg6 >= 1 && arg0 <= (class376.field5325 - 2) && arg6 <= class175.field2711 - 2) {
            int var9 = arg8;
            if (arg8 < 3 && class334.method2118(arg6, arg0, true)) {
                var9 = arg8 + 1;
            }
            if (class693.field9368.field4458.method3022(-32350) == 0 && !class273.method1804(arg6, false, arg0, class534.field7352, var9)) {
                return;
            }
            if (class649.field8928 == null) {
                return;
            }
            class546.field7534.method2762(class19.field295[arg8], arg2, arg8, class272.field3822, arg0, arg6, (byte) 106);
            if (arg4 >= 0) {
                int var10 = class693.field9368.field4417.method966(-32350);
                class693.field9368.method2065((byte) 74, class693.field9368.field4417, 1);
                class546.field7534.method2757(arg0, arg8, arg4, class272.field3822, var9, 50, arg5, arg6, arg3, arg7, class19.field295[arg8]);
                class693.field9368.method2065((byte) 74, class693.field9368.field4417, var10);
            }
        }
        if (arg1 < 12) {
            field10532 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BIIILke;)V", line = 58)
    public static final void method4206(byte arg0, int arg1, int arg2, int arg3, class598 arg4) {
        field10522++;
        int var5 = arg4.field5746[0];
        int var6 = arg4.field5743[0];
        if (var5 < 0 || class376.field5325 <= var5 || var6 < 0 || class175.field2711 <= var6 || arg3 < 0 || class376.field5325 <= arg3 || arg1 < 0 || arg1 >= class175.field2711) {
            return;
        }
        int var7 = class275.method1816(arg3, arg4.method2457((byte) 62), 0, class265.field3765, true, (byte) 120, -4, var5, var6, class167.field2611, arg1, class19.field295[arg4.field5926], 0, 0, 0);
        if (var7 < 1) {
            return;
        }
        if (arg2 != 4) {
            field10532 = null;
        }
        if (var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg4.method3399(arg0, class167.field2611[var8], arg2 - 29038, class265.field3765[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Z", line = 98)
    public final boolean method4207(int arg0) {
        if (arg0 != 106) {
            this.field10524 = null;
        }
        field10531++;
        return this.field10524.field2011.method874(false, this.field10526);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V", line = 109)
    public static void method4208(int arg0) {
        field10532 = null;
        if (arg0 != -1966608624) {
            field10532 = null;
        }
        field10533 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILcea;)V", line = 120)
    private final void method4209(byte arg0, int arg1, class215 arg2) {
        field10525++;
        if (arg0 < 5) {
            return;
        }
        if (arg1 == 1) {
            this.field10526 = arg2.method1478(842397944);
        } else if (arg1 == 2) {
            this.field10529 = arg2.method1499(-1);
        } else if (arg1 == 3) {
            this.field10527 = true;
            return;
        } else if (arg1 == 4) {
            this.field10526 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZILha;)Lmi;", line = 151)
    public final class496 method4210(int arg0, boolean arg1, int arg2, class59 arg3) {
        field10530++;
        if (arg2 < 51) {
            field10533 = null;
        }
        long var5 = (long) (arg3.field1158 << 19 | this.field10526 | arg0 << 16 | (arg1 ? 262144 : 0));
        class496 var7 = (class496) this.field10524.field2022.method992(var5, -87);
        if (var7 != null) {
            return var7;
        } else if (this.field10524.field2011.method874(false, this.field10526)) {
            class267 var8 = class267.method1780(this.field10524.field2011, this.field10526, 0);
            if (var8 != null) {
                var8.field3783 = var8.field3785 = var8.field3780 = var8.field3782 = 0;
                if (arg1) {
                    var8.method1773();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1779();
                }
            }
            class496 var10 = arg3.method356(var8, true);
            if (var10 != null) {
                this.field10524.field2022.method991(var10, var5, (byte) -101);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLcea;)V", line = 199)
    public final void method4211(byte arg0, class215 arg1) {
        field10523++;
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                if (arg0 == -114) {
                    return;
                } else {
                    field10532 = null;
                    return;
                }
            }
            this.method4209((byte) 61, var3, arg1);
        }
    }
}
