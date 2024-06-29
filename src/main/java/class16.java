import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class16 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lwe;")
    public static class24 field177 = new class24(64);

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Ljava/lang/String;")
    public static String field183 = "glow2:";

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Lep;")
    public static class146 field182 = new class146();

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
    public static boolean field185 = false;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field186 = "Started 3d Library";

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lqj;")
    public static class238 field184;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)Ljava/lang/String;", line = 5)
    public static final String method109(byte arg0, int arg1, int arg2) {
        field175++;
        int var3 = arg2 - arg1;
        if (arg0 != 51) {
            method110(false);
        }
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
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

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V", line = 44)
    public static void method110(boolean arg0) {
        field177 = null;
        field186 = null;
        field183 = null;
        field182 = null;
        field184 = null;
        if (arg0) {
            field185 = false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 60)
    public static final void method111(int arg0) {
        class129.field1717.method204((byte) 56);
        field176++;
        class237.field3325.method204((byte) 56);
        class292.field4237.method204((byte) 56);
        class39.field628.method204((byte) 56);
        if (arg0 <= 115) {
            field184 = null;
        }
        class91.field1252.method204((byte) 56);
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 81)
    public static final void method112(int arg0) {
        class232.field3272.method41(arg0 + 123);
        field178++;
        if (arg0 != -1) {
            method110(true);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class100.field1346[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class34.field561[var2] = 0L;
        }
        class394.field5919 = 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I", line = 111)
    public static final int method113(int arg0, int arg1, int arg2, int arg3) {
        field180++;
        int var4 = arg3 & 0x3;
        if (arg0 == var4) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 132)
    public static final void method114(int arg0) {
        field179++;
        if (arg0 != -8822) {
            method110(false);
        }
        for (int var1 = -1; var1 < class153.field2004; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class66.field943[var1];
            }
            class194 var3 = class125.field1664[var2];
            if (var3 != null) {
                class256.method1619(var3.method130((byte) -39), arg0 ^ 0x221E, var3);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I")
    public abstract int method40(int arg0, int arg1);

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)J")
    public abstract long method42(int arg0);
}
