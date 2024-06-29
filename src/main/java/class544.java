import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class544 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/lang/String;")
    private String field7504 = "null";

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lej;")
    public static class124 field7496 = new class124(74, -1);

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field7510 = 0;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "C")
    public char field7508;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "C")
    public char field7509;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private int field7494;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Leq;")
    public class213 field7497;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Leq;")
    private class213 field7500;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 5)
    public static void method3137(int arg0) {
        if (arg0 != -3) {
            field7496 = null;
        }
        field7496 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lcea;II)V", line = 17)
    private final void method3138(class215 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field7508 = class216.method1548(arg0.method1536(-91), -128);
        } else if (arg2 == 2) {
            this.field7509 = class216.method1548(arg0.method1536(-119), -128);
        } else if (arg2 == 3) {
            this.field7504 = arg0.method1525((byte) 86);
        } else if (arg2 == 4) {
            this.field7494 = arg0.method1533((byte) -126);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1478(arg1 ^ 0xCDCA54A8);
            this.field7497 = new class213(class529.method3059(var4, (byte) 108));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1533((byte) -126);
                class362 var7;
                if (arg2 == 5) {
                    var7 = new class568(arg0.method1525((byte) -35));
                } else {
                    var7 = new class113(arg0.method1533((byte) -126));
                }
                this.field7497.method1468((byte) 21, (long) var6, var7);
            }
        }
        field7495++;
        if (arg1 != -21424) {
            this.method3141((byte) -15);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 70)
    public final boolean method3139(boolean arg0, String arg1) {
        field7506++;
        if (this.field7497 == null) {
            return false;
        }
        if (arg0) {
            this.field7500 = null;
        }
        if (this.field7500 == null) {
            this.method3144(true);
        }
        for (class410 var3 = (class410) this.field7500.method1465(class190.method1367(arg1, (byte) 109), -6008); var3 != null; var3 = (class410) this.field7500.method1461(true)) {
            if (var3.field5964.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Z", line = 103)
    public final boolean method3140(boolean arg0, int arg1) {
        field7503++;
        if (this.field7497 == null) {
            return false;
        } else if (arg0) {
            if (this.field7500 == null) {
                this.method3141((byte) 120);
            }
            class113 var3 = (class113) this.field7500.method1465((long) arg1, -6008);
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 125)
    private final void method3141(byte arg0) {
        field7502++;
        this.field7500 = new class213(this.field7497.method1460(true));
        for (class113 var2 = (class113) this.field7497.method1469(0); var2 != null; var2 = (class113) this.field7497.method1467(0)) {
            class113 var3 = new class113((int) var2.field5204);
            this.field7500.method1468((byte) 26, (long) var2.field1945, var3);
        }
        if (arg0 < 85) {
            this.method3142(111, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILcea;)V", line = 148)
    public final void method3142(int arg0, class215 arg1) {
        field7493++;
        while (true) {
            int var3 = arg1.method1535(arg0 + 255);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field7504 = null;
                    return;
                }
            }
            this.method3138(arg1, arg0 - 21424, var3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V", line = 169)
    public static final void method3143(byte arg0, int arg1) {
        if (arg0 < 109) {
            field7510 = 10;
        }
        field7499++;
        if (class665.field9082 == null || class665.field9082.length < arg1) {
            class665.field9082 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 193)
    private final void method3144(boolean arg0) {
        this.field7500 = new class213(this.field7497.method1460(arg0));
        field7498++;
        for (class568 var2 = (class568) this.field7497.method1469(0); var2 != null; var2 = (class568) this.field7497.method1467(0)) {
            class410 var3 = new class410(var2.field7814, (int) var2.field5204);
            this.field7500.method1468((byte) 102, class190.method1367(var2.field7814, (byte) 120), var3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lin;B)V", line = 217)
    public static final void method3145(class91 arg0, byte arg1) {
        if (arg1 >= -91) {
            method3143((byte) -93, 92);
        }
        class640.field8794 = arg0;
        field7501++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZI)I", line = 233)
    public final int method3146(boolean arg0, int arg1) {
        if (arg0) {
            this.method3140(false, -31);
        }
        field7505++;
        if (this.field7497 == null) {
            return this.field7494;
        } else {
            class113 var3 = (class113) this.field7497.method1465((long) arg1, -6008);
            return var3 == null ? this.field7494 : var3.field1945;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Ljava/lang/String;", line = 257)
    public final String method3147(int arg0, int arg1) {
        field7507++;
        if (arg1 <= 60) {
            return null;
        } else if (this.field7497 == null) {
            return this.field7504;
        } else {
            class568 var3 = (class568) this.field7497.method1465((long) arg0, -6008);
            return var3 == null ? this.field7504 : var3.field7814;
        }
    }
}
