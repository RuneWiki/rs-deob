import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class256 extends class187 {

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Lar;")
    public static class47 field3500 = new class47(128);

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Z")
    public static boolean field3503 = false;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Luc;")
    private class58 field3501;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ltq;II)V")
    private final void method1443(class250 arg0, int arg1, int arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1350(31351);
            if (this.field3501 == null) {
                int var5 = class322.method1853(107, var4);
                this.field3501 = new class58(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1350(31351) == 1;
                int var8 = arg0.method1372(-2);
                class338 var9;
                if (var7) {
                    var9 = new class195(arg0.method1349(-1754884856));
                } else {
                    var9 = new class310(arg0.method1359(255));
                }
                this.field3501.method314((long) var8, var9, 7079);
            }
        }
        field3498++;
        if (arg2 > -93) {
            field3503 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLtq;)V")
    public final void method1444(boolean arg0, class250 arg1) {
        field3502++;
        while (true) {
            int var3 = arg1.method1350(31351);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    field3500 = null;
                    return;
                }
            }
            this.method1443(arg1, var3, -106);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method1445(boolean arg0) {
        if (arg0) {
            method1447(-44, 77, 125, -42, 16, 88);
        }
        field3500 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)I")
    public final int method1446(byte arg0, int arg1, int arg2) {
        field3496++;
        if (this.field3501 == null) {
            return arg1;
        }
        class310 var4 = (class310) this.field3501.method308((long) arg2, (byte) -110);
        if (arg0 != 33) {
            this.method1446((byte) 2, -35, 125);
        }
        return var4 == null ? arg1 : var4.field4186;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)I")
    public static final int method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3497++;
        if (class98.field1161 == null) {
            return 0;
        } else if (arg3 > -31) {
            return 44;
        } else {
            if (arg4 < 3) {
                int var6 = arg1 >> 7;
                int var7 = arg5 >> 7;
                if (arg2 < 0 || arg0 < 0 || (class315.field4214 - 1) < arg2 || (class340.field4549 - 1) < arg0) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || class315.field4214 - 1 < var6 || (class340.field4549 - 1) < var7) {
                    return 0;
                }
                boolean var8 = (class282.field3872[1][arg1 >> 7][arg5 >> 7] & 0x2) != 0;
                if ((arg1 & 0x7F) == 0) {
                    boolean var9 = (class282.field3872[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                    boolean var10 = (class282.field3872[1][var6][arg5 >> 7] & 0x2) != 0;
                    if (var9 != var10) {
                        var8 = (class282.field3872[1][arg2][arg0] & 0x2) != 0;
                    }
                }
                if ((arg5 & 0x7F) == 0) {
                    boolean var11 = (class282.field3872[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class282.field3872[1][arg1 >> 7][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class282.field3872[1][arg2][arg0] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg4++;
                }
            }
            return class98.field1161[arg4].method265(arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1448(int arg0, int arg1, String arg2) {
        field3505++;
        if (this.field3501 == null) {
            return arg2;
        }
        class195 var4 = (class195) this.field3501.method308((long) arg0, (byte) 75);
        if (arg1 < 29) {
            return null;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field2632;
        }
    }
}
