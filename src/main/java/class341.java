import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class341 extends class187 {

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Ljava/lang/String;")
    private String field4566 = "null";

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "C")
    public char field4558;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "C")
    public char field4560;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Lam;")
    public static class286 field4565;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Luc;")
    public class58 field4562;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Luc;")
    private class58 field4564;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "[[[Le;")
    public static class96[][][] field4571;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[[BBLbl;IILbl;Lvm;[[B[[BI[[I[[B)V")
    public static final void method1987(boolean arg0, byte[][] arg1, byte arg2, class54 arg3, int arg4, int arg5, class54 arg6, class322 arg7, byte[][] arg8, byte[][] arg9, int arg10, int[][] arg11, byte[][] arg12) {
        if (class101.field1182 == 0 && !class297.field4040) {
            class80.method441(arg9, true, arg3, arg6, arg10, arg4, arg7, arg12, arg1, arg0, arg11, arg5, arg8);
        } else {
            class53.method257(arg10, arg8, arg5, arg1, arg0, arg11, arg7, arg3, arg4, arg9, arg2 ^ 0x34, arg6, arg12);
        }
        if (arg2 != 104) {
            method1992(-96);
        }
        field4563++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1988(int arg0, int arg1) {
        field4569++;
        if (this.field4562 == null) {
            return this.field4566;
        } else {
            class195 var3 = (class195) this.field4562.method308((long) arg1, (byte) 38);
            int var4 = 2 / ((arg0 - 57) / 61);
            return var3 == null ? this.field4566 : var3.field2632;
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static void method1989(int arg0) {
        if (arg0 == 0) {
            field4571 = null;
            field4565 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    private final void method1990(byte arg0) {
        this.field4564 = new class58(this.field4562.method317((byte) 51));
        if (arg0 != 43) {
            field4571 = null;
        }
        field4556++;
        for (class195 var2 = (class195) this.field4562.method315((byte) -120); var2 != null; var2 = (class195) this.field4562.method310(-85)) {
            class264 var3 = new class264(var2.field2632, (int) var2.field4510);
            this.field4564.method314(class335.method1915((byte) 95, var2.field2632), var3, arg0 ^ 0x1B8C);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)I")
    public final int method1991(byte arg0, int arg1) {
        field4559++;
        if (this.field4562 == null) {
            return this.field4570;
        }
        class310 var3 = (class310) this.field4562.method308((long) arg1, (byte) 22);
        if (arg0 < 79) {
            method1989(10);
        }
        return var3 == null ? this.field4570 : var3.field4186;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public static final void method1992(int arg0) {
        class184[] var1 = class38.field396;
        synchronized (class38.field396) {
            if (arg0 >= -71) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (var2 >= class38.field396.length) {
                    break;
                }
                class38.field396[var2] = new class184();
                class19.field191[var2] = 0;
                var2++;
            }
        }
        field4567++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLtq;)V")
    public final void method1993(byte arg0, class250 arg1) {
        int var3 = -86 / ((-arg0 - 31) / 63);
        while (true) {
            int var4 = arg1.method1350(31351);
            if (var4 == 0) {
                field4554++;
                return;
            }
            this.method1994(arg1, var4, 6);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ltq;II)V")
    private final void method1994(class250 arg0, int arg1, int arg2) {
        if (arg2 != 6) {
            this.field4560 = '\u0007';
        }
        if (arg1 == 1) {
            this.field4560 = class199.method1066(arg0.method1363((byte) -3), false);
        } else if (arg1 == 2) {
            this.field4558 = class199.method1066(arg0.method1363((byte) 106), false);
        } else if (arg1 == 3) {
            this.field4566 = arg0.method1349(arg2 ^ 0x9766950E);
        } else if (arg1 == 4) {
            this.field4570 = arg0.method1359(255);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1374(-2);
            this.field4562 = new class58(class322.method1853(124, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1359(255);
                class338 var7;
                if (arg1 == 5) {
                    var7 = new class195(arg0.method1349(-1754884856));
                } else {
                    var7 = new class310(arg0.method1359(255));
                }
                this.field4562.method314((long) var6, var7, 7079);
            }
        }
        field4553++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)Z")
    public final boolean method1995(int arg0, int arg1) {
        field4552++;
        int var3 = 9 / ((arg0 + 3) / 58);
        if (this.field4562 == null) {
            return false;
        }
        if (this.field4564 == null) {
            this.method1998((byte) -56);
        }
        class310 var4 = (class310) this.field4564.method308((long) arg1, (byte) -15);
        return var4 != null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBII)V")
    public static final void method1996(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4557++;
        class40 var5 = class162.method872(arg3, (byte) 92, 8);
        var5.method190(0);
        var5.field413 = arg0;
        var5.field418 = arg4;
        var5.field410 = arg1;
        if (arg2 <= 35) {
            method1992(122);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1997(String arg0, int arg1) {
        field4555++;
        if (this.field4562 == null) {
            return false;
        }
        int var3 = -79 % ((-arg1 - 85) / 41);
        if (this.field4564 == null) {
            this.method1990((byte) 43);
        }
        for (class264 var4 = (class264) this.field4564.method308(class335.method1915((byte) 119, arg0), (byte) -116); var4 != null; var4 = (class264) this.field4564.method312(-1)) {
            if (var4.field3603.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    private final void method1998(byte arg0) {
        this.field4564 = new class58(this.field4562.method317((byte) 110));
        field4561++;
        if (arg0 >= -53) {
            this.method1995(-27, -96);
        }
        for (class310 var2 = (class310) this.field4562.method315((byte) -102); var2 != null; var2 = (class310) this.field4562.method310(-127)) {
            class310 var3 = new class310((int) var2.field4510);
            this.field4564.method314((long) var2.field4186, var3, 7079);
        }
    }
}
