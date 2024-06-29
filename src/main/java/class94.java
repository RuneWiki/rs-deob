import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class94 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[Lnfa;")
    public static class225[] field1406 = new class225[0];

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
    public static int[] field1405 = new int[13];

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lkba;")
    public class184 field1404;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 3)
    public static void method781(int arg0) {
        field1405 = null;
        field1406 = null;
        if (arg0 != -3) {
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lnfa;ZIZLnfa;)I", line = 15)
    public static final int method782(class225 arg0, boolean arg1, int arg2, boolean arg3, class225 arg4) {
        field1407++;
        if (arg3) {
            field1405 = null;
        }
        if (arg2 == 1) {
            int var5 = arg4.field4706;
            int var6 = arg0.field4706;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class153.method1158(class467.field6804, arg4.method1582(-1).field10519, arg0.method1582(-1).field10519, -17);
        } else if (arg2 == 3) {
            if (arg4.field3621.equals("-")) {
                if (arg0.field3621.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field3621.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class153.method1158(class467.field6804, arg4.field3621, arg0.field3621, -93);
            }
        } else if (arg2 == 4) {
            if (arg4.method2056(true)) {
                return arg0.method2056(true) ? 0 : 1;
            } else if (arg0.method2056(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg4.method2053(78)) {
                return arg0.method2053(117) ? 0 : 1;
            } else if (arg0.method2053(95)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg4.method2059(-7968)) {
                return arg0.method2059(-7968) ? 0 : 1;
            } else if (arg0.method2059(-7968)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg4.method2055(0)) {
                return arg0.method2055(0) ? 0 : 1;
            } else if (arg0.method2055(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg4.field3625;
            int var8 = arg0.field3625;
            if (arg1) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg4.field3623 - arg0.field3623;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Lgu;", line = 121)
    public final synchronized class726 method783(byte arg0) {
        field1412++;
        class726 var2 = (class726) this.field1404.field3106.method80((byte) -28, (long) this.field1413);
        if (var2 != null) {
            return var2;
        }
        int var3 = 87 / ((arg0 - 1) / 58);
        class726 var4 = class726.method4002(this.field1404.field3095, this.field1413, 0);
        if (var4 != null) {
            this.field1404.field3106.method67((long) this.field1413, var4, -6772);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILofa;)V", line = 144)
    public final void method784(int arg0, class301 arg1) {
        field1408++;
        while (true) {
            int var3 = arg1.method1987(-82);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field1404 = null;
                    return;
                }
            }
            this.method787(var3, 75, arg1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIBI)V", line = 165)
    public static final void method785(int arg0, int arg1, byte arg2, int arg3) {
        class434.field6341 = new byte[arg3][arg1][arg0];
        field1409++;
        if (arg2 != -124) {
            method781(-26);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 177)
    public static final void method786(byte arg0) {
        field1414++;
        int var1 = 87 / ((-arg0 - 36) / 52);
        class404.field5991 = -1;
        class129.field2118 = 0;
        class257.field4036 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILofa;)V", line = 197)
    private final void method787(int arg0, int arg1, class301 arg2) {
        if (arg1 < 46) {
            field1406 = null;
        }
        field1411++;
        if (arg0 == 1) {
            this.field1413 = arg2.method1989((byte) -109);
        } else if (arg0 == 2) {
            this.field1410 = arg2.method1987(-90);
            this.field1403 = arg2.method1987(-98);
        }
    }
}
