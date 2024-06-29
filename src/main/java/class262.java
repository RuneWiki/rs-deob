import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class262 extends class325 {

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field4023 = -1;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public int field4036 = 12800;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public int field4037 = -1;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Z")
    public boolean field4038 = true;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public int field4043 = 0;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public int field4039 = 0;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public int field4046 = 12800;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "Ljava/lang/String;")
    public String field4044;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Ljava/lang/String;")
    public String field4049;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "La;")
    public class281 field4041;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "Z")
    public static boolean field4045 = false;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "F")
    public static float field4029;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Ljd;")
    public static class95 field4031;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "[Lfl;")
    public static class339[] field4047;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[[[I")
    public static int[][][] field4040;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILjd;III)V", line = 10)
    public static final void method1837(boolean arg0, int arg1, class95 arg2, int arg3, int arg4, int arg5) {
        field4042++;
        class268.field4171 = arg2;
        if (arg1 != 0) {
            return;
        }
        class220.field3364 = arg4;
        class23.field260 = arg3;
        class106.field1540 = 1;
        class77.field1135 = 10000;
        class4.field52 = arg5;
        class333.field5191 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)[I", line = 27)
    public final int[] method1838(byte arg0, int arg1, int arg2) {
        field4026++;
        if (arg0 != 62) {
            this.method1838((byte) -95, -6, -49);
        }
        for (class280 var4 = (class280) this.field4041.method1954(-66); var4 != null; var4 = (class280) this.field4041.method1950((byte) 95)) {
            if (var4.method1941(arg1, (byte) 116, arg2)) {
                return var4.method1936(arg1, true, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 51)
    public final void method1839(boolean arg0) {
        this.field4043 = 0;
        field4033++;
        this.field4036 = 12800;
        this.field4046 = 12800;
        this.field4039 = 0;
        if (arg0) {
            return;
        }
        for (class280 var2 = (class280) this.field4041.method1954(-66); var2 != null; var2 = (class280) this.field4041.method1950((byte) 121)) {
            if (this.field4043 < var2.field4349) {
                this.field4043 = var2.field4349;
            }
            if (this.field4036 > var2.field4365) {
                this.field4036 = var2.field4365;
            }
            if (var2.field4364 < this.field4046) {
                this.field4046 = var2.field4364;
            }
            if (var2.field4342 > this.field4039) {
                this.field4039 = var2.field4342;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 92)
    public static final void method1840(String arg0, String arg1, int arg2, int arg3) {
        field4030++;
        class131.method1018(94, arg1, -1, arg2, (String) null, arg0);
        if (arg3 > 0) {
            field4029 = -1.8469951F;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)Z", line = 114)
    public final boolean method1841(int arg0, int arg1, int arg2) {
        field4022++;
        if (arg1 <= 51) {
            return true;
        }
        for (class280 var4 = (class280) this.field4041.method1954(-66); var4 != null; var4 = (class280) this.field4041.method1950((byte) 114)) {
            if (var4.method1941(arg0, (byte) 116, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIB)[I", line = 136)
    public final int[] method1842(int arg0, int arg1, int arg2, byte arg3) {
        field4048++;
        int var5 = 109 % ((arg3 - 58) / 39);
        for (class280 var6 = (class280) this.field4041.method1954(-66); var6 != null; var6 = (class280) this.field4041.method1950((byte) 123)) {
            if (var6.method1935(arg1, arg0, (byte) 42, arg2)) {
                return var6.method1936(arg2, true, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 248)
    public class262(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4044 = arg2;
        this.field4034 = arg0;
        this.field4038 = arg5;
        this.field4037 = arg6;
        this.field4032 = arg3;
        this.field4049 = arg1;
        if (this.field4037 == 255) {
            this.field4037 = 0;
        }
        this.field4023 = arg4;
        this.field4041 = new class281();
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)[I", line = 181)
    public final int[] method1843(int arg0, int arg1, int arg2) {
        field4021++;
        for (class280 var4 = (class280) this.field4041.method1954(arg2 ^ 0x2304); var4 != null; var4 = (class280) this.field4041.method1950((byte) 91)) {
            if (var4.method1938(arg0, arg1, (byte) 110)) {
                return var4.method1939((byte) 106, arg0, arg1);
            }
        }
        if (arg2 == -9030) {
            return null;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V", line = 207)
    public static final void method1844(byte arg0, int arg1) {
        field4024++;
        class4.field45.method741(arg1, (byte) 124);
        if (arg0 != -14) {
            field4029 = -1.000806F;
        }
        class95.field1353.method741(arg1, (byte) 120);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V", line = 228)
    public static void method1845(byte arg0) {
        field4031 = null;
        field4040 = (int[][][]) null;
        if (arg0 < -91) {
            field4047 = null;
        }
    }
}
