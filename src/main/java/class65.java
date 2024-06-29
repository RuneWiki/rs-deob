import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class65 extends class381 {

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public int field1024 = 0;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "Lvg;")
    public static class622 field1031 = new class622(38, -1);

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!qv", name = "P", descriptor = "Lnw;")
    public static class619 field1041 = new class619();

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!qv", name = "Q", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "Lpda;")
    public class137 field1019;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Lpda;")
    public class137 field1021;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Llt;")
    public class289 field1009;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "Lwm;")
    public class396 field1014;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "Lwm;")
    public class396 field1037;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "Lu;")
    public class53 field1015;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "Lmq;")
    public class71 field1013;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "Llca;")
    public class93 field1034;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "Llca;")
    public class93 field1036;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Z")
    public boolean field1008;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "Z")
    public boolean field1012;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "Z")
    public boolean field1032;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "[I")
    public int[] field1030;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method392(int arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            field1031 = null;
        }
        field1018++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 49)
    public static void method393(int arg0) {
        field1041 = null;
        field1031 = null;
        if (arg0 != 0) {
            method394(null, 92);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 60)
    public static final String method394(String arg0, int arg1) {
        if (arg1 != 256) {
            return null;
        }
        field1026++;
        if (class181.field2496.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class181.field2496.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class181.field2496.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V", line = 85)
    public static final void method395(boolean arg0, int arg1) {
        field1025++;
        if (class230.field3051 != null) {
            class230.field3051.method1362((byte) -112);
            class230.field3051 = null;
        }
        class641.field9191 = 0;
        class245.method1499(-116);
        class152.method1081();
        for (int var2 = 0; var2 < 4; var2++) {
            class629.field9104[var2].method2907((byte) -58);
        }
        class61.method379((byte) -101, false);
        System.gc();
        class489.method2795(2, (byte) -68);
        class443.field6426 = -1;
        class700.field9845 = false;
        class613.method3488(17299);
        class32.method200((byte) -53, true);
        class403.field6049 = 0;
        class22.field426 = 0;
        class397.field6005 = 0;
        class57.field938 = 0;
        class458.field6615 = 0;
        class697.field9827 = 0;
        for (int var3 = 0; var3 < class700.field9879.length; var3++) {
            class700.field9879[var3] = null;
        }
        class61.method382(1);
        int var4 = 0;
        int var5 = -103 % ((-arg1 - 20) / 35);
        while (var4 < 2048) {
            class35.field551[var4] = null;
            var4++;
        }
        class155.field2213 = 0;
        class271.field3550.method1995((byte) -123);
        class378.field5678 = 0;
        class86.field1336.method1995((byte) -123);
        class485.method2772((byte) -40);
        class298.field4387 = 0;
        class308.field4545.method3393(90);
        class573.method3295(125);
        class619.method3563(503);
        class141.field2040 = 0L;
        class464.field6701 = null;
        if (arg0) {
            class322.method2003(0, 12);
            return;
        }
        class322.method2003(0, 3);
        try {
            class101.method727("loggedout", -111, class551.field8116);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 164)
    public final void method396(byte arg0) {
        if (arg0 != 58) {
            method394(null, -12);
        }
        field1022++;
        int var2 = this.field1039;
        boolean var3 = this.field1012;
        if (this.field1009 != null) {
            class289 var4 = this.field1009.method1788(class308.field4545, -82);
            if (var4 == null) {
                this.field1017 = 256;
                this.field1042 = 0;
                this.field1030 = null;
                this.field1039 = -1;
                this.field1016 = 0;
                this.field1011 = 0;
                this.field1028 = 256;
                this.field1012 = false;
                this.field1010 = 0;
                this.field1008 = false;
            } else {
                this.field1011 = var4.field4222;
                this.field1028 = var4.field4191;
                this.field1039 = var4.field4189;
                this.field1008 = var4.field4200;
                this.field1017 = var4.field4206;
                this.field1042 = var4.field4209;
                this.field1030 = var4.field4193;
                this.field1010 = var4.field4233 << 9;
                this.field1016 = var4.field4207;
                this.field1012 = var4.field4204;
            }
        } else if (this.field1015 != null) {
            int var5 = class369.method2285(this.field1015, 0);
            if (var2 != var5) {
                this.field1039 = var5;
                class76 var6 = this.field1015.field805;
                if (var6.field1212 != null) {
                    var6 = var6.method443(class308.field4545, (byte) 122);
                }
                if (var6 == null) {
                    this.field1017 = 256;
                    this.field1016 = this.field1010 = 0;
                    this.field1028 = 256;
                    this.field1012 = this.field1015.field805.field1227;
                } else {
                    this.field1028 = var6.field1201;
                    this.field1016 = var6.field1193;
                    this.field1012 = var6.field1227;
                    this.field1010 = var6.field1177 << 9;
                    this.field1017 = var6.field1217;
                }
            }
        } else if (this.field1013 != null) {
            this.field1039 = class265.method1595(arg0 ^ 0x3A, this.field1013);
            this.field1010 = this.field1013.field1122 << 9;
            this.field1012 = this.field1013.field1107;
            this.field1028 = 256;
            this.field1016 = this.field1013.field1121;
            this.field1017 = 256;
        }
        if (this.field1039 == var2 && this.field1012 == var3) {
            return;
        }
        if (this.field1034 == null) {
            return;
        }
        class556.field8166.method2205(this.field1034);
        this.field1019 = null;
        this.field1034 = null;
        this.field1014 = null;
    }
}
