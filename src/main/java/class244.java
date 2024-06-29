import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class244 {

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Z")
    public boolean field3342 = false;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Lnr;")
    public class53 field3337;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lun;I)V", line = 6)
    public final void method1478(class389 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                if (arg1 != 1255404496) {
                    return;
                }
                field3336++;
                return;
            }
            this.method1481(var3, arg0, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method1479(int arg0) {
        if (arg0 == -28084) {
            field3331++;
            return this.field3337.field857.method3802(this.field3340, (byte) 120);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILr;ZI)Lf;", line = 38)
    public final class701 method1480(int arg0, class165 arg1, boolean arg2, int arg3) {
        field3335++;
        long var5 = (long) ((arg2 ? 262144 : 0) | this.field3340 | arg0 << 16 | arg1.field2018 << 19);
        if (arg3 != 262144) {
            this.method1478(null, -99);
        }
        class701 var7 = (class701) this.field3337.field864.method2766(-123, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field3337.field857.method3802(this.field3340, (byte) -25)) {
            class495 var8 = class495.method2874(this.field3337.field857, this.field3340, 0);
            if (var8 != null) {
                var8.field6904 = var8.field6901 = var8.field6903 = var8.field6900 = 0;
                if (arg2) {
                    var8.method2886();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2884();
                }
            }
            class701 var10 = arg1.method216(var8, true);
            if (var10 != null) {
                this.field3337.field864.method2772(var10, true, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILun;B)V", line = 87)
    private final void method1481(int arg0, class389 arg1, byte arg2) {
        int var4 = 53 % ((50 - arg2) / 45);
        field3341++;
        if (arg0 == 1) {
            this.field3340 = arg1.method2260(-120);
        } else if (arg0 == 2) {
            this.field3339 = arg1.method2258(-3);
        } else if (arg0 == 3) {
            this.field3342 = true;
        } else if (arg0 == 4) {
            this.field3340 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILpe;IIZIIIILop;I)V", line = 117)
    public static final void method1482(int arg0, int arg1, class564 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class172 arg10, int arg11) {
        class407.field5771 = arg2;
        class357.field4767 = arg1;
        class180.field2209 = null;
        class320.field4217 = null;
        class676.field9695 = arg3;
        class79.field1162 = arg10;
        class196.field2368 = arg8;
        class308.field4084 = null;
        if (arg5) {
            field3332 = 71;
        }
        class578.field8444 = arg7;
        class479.field6723 = arg6;
        class332.field4412 = arg11;
        class665.field9422 = arg4;
        class125.field1602 = arg0;
        field3343++;
        class91.field1278 = arg9;
        class176.method1107(-21733);
        class260.field3579 = true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 144)
    public static final String method1483(boolean arg0, int arg1, int arg2) {
        field3338++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0) {
                field3334 = -81;
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }
}
