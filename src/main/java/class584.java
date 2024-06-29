import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class584 {

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "Ljava/lang/String;")
    private String field8401 = "null";

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lin;")
    public static class380 field8399 = new class380(54, 3);

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Lhk;")
    public static class153 field8400 = new class153(11, 0, 1, 2);

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "C")
    public char field8392;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "C")
    public char field8395;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    private int field8390;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    private int field8403;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lsi;")
    private class769 field8386;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lsi;")
    public class769 field8397;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 4)
    private final void method3423(int arg0) {
        this.field8386 = new class769(this.field8397.method4250(arg0 ^ 0x69));
        field8394++;
        if (arg0 != 0) {
            this.method3426(-53);
        }
        for (class725 var2 = (class725) this.field8397.method4254((byte) 8); var2 != null; var2 = (class725) this.field8397.method4251(arg0 ^ 0xFFFFFF9C)) {
            class725 var3 = new class725((int) var2.field10592);
            this.field8386.method4252(false, var3, (long) var2.field10098);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)Z", line = 27)
    public final boolean method3424(boolean arg0, int arg1) {
        field8388++;
        if (this.field8397 == null) {
            return false;
        }
        if (this.field8386 == null) {
            this.method3423(0);
        }
        class725 var3 = (class725) this.field8386.method4253((long) arg1, -1);
        if (arg0) {
            return true;
        } else {
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 54)
    public final boolean method3425(byte arg0, String arg1) {
        field8391++;
        if (this.field8397 == null) {
            return false;
        }
        if (this.field8386 == null) {
            this.method3426(-10);
        }
        for (class640 var3 = (class640) this.field8386.method4253(class151.method1190(arg1, 82), -1); var3 != null; var3 = (class640) this.field8386.method4248(-64)) {
            if (var3.field9016.equals(arg1)) {
                return true;
            }
        }
        if (arg0 <= 13) {
            this.method3430(null, (byte) 95, -25);
        }
        return false;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 86)
    private final void method3426(int arg0) {
        int var2 = 109 / ((arg0 - 52) / 34);
        field8396++;
        this.field8386 = new class769(this.field8397.method4250(72));
        for (class662 var3 = (class662) this.field8397.method4254((byte) 8); var3 != null; var3 = (class662) this.field8397.method4251(-44)) {
            class640 var4 = new class640(var3.field9327, (int) var3.field10592);
            this.field8386.method4252(false, var4, class151.method1190(var3.field9327, 87));
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V", line = 107)
    public static final void method3427(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8393++;
        class190 var8 = new class190();
        var8.field2852 = arg4;
        var8.field2850 = arg7;
        var8.field2856 = arg5;
        var8.field2853 = arg6;
        var8.field2858 = arg2;
        if (arg1) {
            method3427(null, true, 64, -1, -114, 66, 89, -15);
        }
        var8.field2857 = arg0;
        var8.field2851 = class594.field8494 + arg3;
        class383.field5370.method1734(var8, 0);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)I", line = 128)
    public final int method3428(int arg0, int arg1) {
        field8387++;
        if (arg1 != -6) {
            this.method3424(false, -86);
        }
        if (this.field8397 == null) {
            return this.field8390;
        } else {
            class725 var3 = (class725) this.field8397.method4253((long) arg0, -1);
            return var3 == null ? this.field8390 : var3.field10098;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 150)
    public final String method3429(byte arg0, int arg1) {
        field8398++;
        if (this.field8397 == null) {
            return this.field8401;
        }
        class662 var3 = (class662) this.field8397.method4253((long) arg1, -1);
        if (var3 == null) {
            return this.field8401;
        } else {
            if (arg0 != -91) {
                this.method3426(49);
            }
            return var3.field9327;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lol;BI)V", line = 173)
    private final void method3430(class431 arg0, byte arg1, int arg2) {
        field8389++;
        if (arg2 == 1) {
            this.field8392 = class478.method2834((byte) 94, arg0.method2529(87));
        } else if (arg2 == 2) {
            this.field8395 = class478.method2834((byte) 23, arg0.method2529(84));
        } else if (arg2 == 3) {
            this.field8401 = arg0.method2532((byte) -124);
        } else if (arg2 == 4) {
            this.field8390 = arg0.method2526(17);
        } else if (arg2 == 5 || arg2 == 6) {
            this.field8403 = arg0.method2565((byte) -103);
            this.field8397 = new class769(class661.method3706(this.field8403, true));
            for (int var4 = 0; var4 < this.field8403; var4++) {
                int var5 = arg0.method2526(17);
                class766 var6;
                if (arg2 == 5) {
                    var6 = new class662(arg0.method2532((byte) -121));
                } else {
                    var6 = new class725(arg0.method2526(17));
                }
                this.field8397.method4252(false, var6, (long) var5);
            }
        }
        int var7 = -118 / ((arg1 - 64) / 34);
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 224)
    public static void method3431(int arg0) {
        field8400 = null;
        field8399 = null;
        if (arg0 != 1) {
            field8399 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lol;I)V", line = 239)
    public final void method3432(class431 arg0, int arg1) {
        if (arg1 != 14979) {
            return;
        }
        while (true) {
            int var3 = arg0.method2557(arg1 ^ 0xD2);
            if (var3 == 0) {
                field8402++;
                return;
            }
            this.method3430(arg0, (byte) 117, var3);
        }
    }
}
