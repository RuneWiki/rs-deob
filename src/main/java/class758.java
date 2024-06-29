import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class758 extends class107 {

    @OriginalMember(owner = "client!sha", name = "E", descriptor = "I")
    public int field10444 = -1;

    @OriginalMember(owner = "client!sha", name = "D", descriptor = "I")
    public int field10443 = 0;

    @OriginalMember(owner = "client!sha", name = "H", descriptor = "I")
    public int field10447 = 12800;

    @OriginalMember(owner = "client!sha", name = "O", descriptor = "I")
    public int field10454 = 12800;

    @OriginalMember(owner = "client!sha", name = "y", descriptor = "I")
    public int field10438 = -1;

    @OriginalMember(owner = "client!sha", name = "T", descriptor = "I")
    public int field10459 = 0;

    @OriginalMember(owner = "client!sha", name = "S", descriptor = "Z")
    public boolean field10458 = true;

    @OriginalMember(owner = "client!sha", name = "C", descriptor = "I")
    public int field10442;

    @OriginalMember(owner = "client!sha", name = "B", descriptor = "Ljava/lang/String;")
    public String field10441;

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "I")
    public int field10439;

    @OriginalMember(owner = "client!sha", name = "F", descriptor = "Ljava/lang/String;")
    public String field10445;

    @OriginalMember(owner = "client!sha", name = "M", descriptor = "Lok;")
    public class266 field10452;

    @OriginalMember(owner = "client!sha", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field10440 = new String[100];

    @OriginalMember(owner = "client!sha", name = "U", descriptor = "F")
    public static float field10460 = 0.0F;

    @OriginalMember(owner = "client!sha", name = "P", descriptor = "Lef;")
    public static class512 field10455 = new class512();

    @OriginalMember(owner = "client!sha", name = "G", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!sha", name = "I", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!sha", name = "J", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!sha", name = "K", descriptor = "I")
    public static int field10450;

    @OriginalMember(owner = "client!sha", name = "L", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!sha", name = "N", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!sha", name = "Q", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!sha", name = "R", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!sha", name = "W", descriptor = "Lrja;")
    public static class114 field10462;

    @OriginalMember(owner = "client!sha", name = "V", descriptor = "Ljd;")
    public static class241 field10461;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "([BI)[B", line = 6)
    public static final byte[] method4206(byte[] arg0, int arg1) {
        field10448++;
        int var2 = arg0.length;
        if (arg1 != 19382) {
            method4213(120);
        }
        byte[] var3 = new byte[var2];
        class595.method3467(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZII)Z", line = 28)
    public final boolean method4207(boolean arg0, int arg1, int arg2) {
        field10450++;
        if (arg0) {
            this.field10442 = -2;
        }
        for (class533 var4 = (class533) this.field10452.method1731((byte) -122); var4 != null; var4 = (class533) this.field10452.method1724(0)) {
            if (var4.method3217(2, arg2, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[II)Z", line = 51)
    public final boolean method4208(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 0) {
            return false;
        }
        field10457++;
        for (class533 var5 = (class533) this.field10452.method1731((byte) -105); var5 != null; var5 = (class533) this.field10452.method1724(0)) {
            if (var5.method3218(arg1, (byte) 90, arg3)) {
                var5.method3216(115, arg2, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "(B)V", line = 79)
    public final void method4209(byte arg0) {
        this.field10459 = 0;
        this.field10447 = 12800;
        field10449++;
        if (arg0 != -50) {
            return;
        }
        this.field10454 = 12800;
        this.field10443 = 0;
        for (class533 var2 = (class533) this.field10452.method1731((byte) -105); var2 != null; var2 = (class533) this.field10452.method1724(0)) {
            if (this.field10443 < var2.field7708) {
                this.field10443 = var2.field7708;
            }
            if (var2.field7697 < this.field10454) {
                this.field10454 = var2.field7697;
            }
            if (this.field10447 > var2.field7698) {
                this.field10447 = var2.field7698;
            }
            if (this.field10459 < var2.field7706) {
                this.field10459 = var2.field7706;
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "([IZIII)Z", line = 117)
    public final boolean method4210(int[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field10451++;
        if (!arg1) {
            method4206(null, -107);
        }
        for (class533 var6 = (class533) this.field10452.method1731((byte) -109); var6 != null; var6 = (class533) this.field10452.method1724(0)) {
            if (var6.method3215(arg3, arg2, arg4, 113)) {
                var6.method3212((byte) -93, arg0, arg4, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 296)
    public class758(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field10458 = arg5;
        this.field10442 = arg0;
        this.field10444 = arg4;
        this.field10438 = arg6;
        this.field10441 = arg2;
        this.field10439 = arg3;
        this.field10445 = arg1;
        if (this.field10438 == 255) {
            this.field10438 = 0;
        }
        this.field10452 = new class266();
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V", line = 162)
    public static final void method4211(int arg0, boolean arg1) {
        if (class21.field353.field10101.method397(-89) == 0) {
            arg0 = -1;
        }
        if (arg1) {
            return;
        }
        field10456++;
        if (class648.field9063 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class578 var2 = class186.field2845.method3247(33, arg0);
            class1 var3 = var2.method3394(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class519.field7328.method2833(var3.method13(), new Point(var2.field8141, var2.field8142), var3.method1(), var3.method10(), class629.field8819, (byte) 75);
                class648.field9063 = arg0;
            }
        }
        if (arg0 == -1 && class648.field9063 != -1) {
            class519.field7328.method2833(-1, new Point(), null, -1, class629.field8819, (byte) 76);
            class648.field9063 = -1;
        }
    }

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "(B)V", line = 206)
    public static final void method4212(byte arg0) {
        field10453++;
        if (class110.field1678) {
            return;
        }
        class276.method1784(class385.field5312, true);
        int var1 = 107 / ((58 - arg0) / 62);
        if (class356.field5006 != null) {
            class276.method1784(class356.field5006, true);
        }
        class110.field1678 = true;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V", line = 230)
    public static void method4213(int arg0) {
        if (arg0 == -1) {
            field10440 = null;
            field10455 = null;
            field10461 = null;
            field10462 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[III)Z", line = 248)
    public final boolean method4214(int arg0, int[] arg1, int arg2, int arg3) {
        field10446++;
        if (arg3 != -1) {
            field10455 = null;
        }
        for (class533 var5 = (class533) this.field10452.method1731((byte) -114); var5 != null; var5 = (class533) this.field10452.method1724(0)) {
            if (var5.method3217(2, arg0, arg2)) {
                var5.method3212((byte) -107, arg1, arg2, arg0);
                return true;
            }
        }
        return false;
    }
}
