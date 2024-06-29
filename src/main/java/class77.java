import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class77 {

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lka;")
    private class473 field1086 = new class473(64);

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Lka;")
    public class473 field1100 = new class473(500);

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lka;")
    public class473 field1101 = new class473(30);

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Lka;")
    public class473 field1102 = new class473(50);

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Z")
    public boolean field1091;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Ldk;")
    private class421 field1080;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Ldk;")
    public class421 field1098;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[I")
    public static int[] field1082 = new int[32];

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1081 = -1;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
    public static volatile boolean field1095 = true;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lvu;")
    public static class155 field1090;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Lza;")
    public static class295 field1093;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Ldk;")
    public static class421 field1099;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method596(int arg0, String arg1) {
        if (arg0 != -14602) {
            field1081 = -103;
        }
        field1084++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 16)
    public final void method597(int arg0) {
        class473 var2 = this.field1086;
        synchronized (this.field1086) {
            this.field1086.method2774((byte) 115);
        }
        field1096++;
        class473 var3 = this.field1100;
        synchronized (this.field1100) {
            if (arg0 != 50) {
                return;
            }
            this.field1100.method2774((byte) 119);
        }
        class473 var4 = this.field1101;
        synchronized (this.field1101) {
            this.field1101.method2774((byte) -126);
        }
        class473 var5 = this.field1102;
        synchronized (this.field1102) {
            this.field1102.method2774((byte) 1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V", line = 39)
    public final void method598(int arg0, boolean arg1) {
        this.field1103 = arg0;
        field1083++;
        if (arg1) {
            this.method606(114, -106);
        }
        class473 var3 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2764(-769);
        }
        class473 var4 = this.field1101;
        synchronized (this.field1101) {
            this.field1101.method2764(-769);
        }
        class473 var5 = this.field1102;
        synchronized (this.field1102) {
            this.field1102.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IZ)V", line = 63)
    public final void method599(int arg0, boolean arg1) {
        field1079++;
        if (this.field1089 == arg1) {
            return;
        }
        this.field1089 = arg1;
        this.method604((byte) 16);
        if (arg0 != -1) {
            this.field1080 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 81)
    public static final void method600(byte arg0) {
        field1097++;
        if (arg0 == 114) {
            class316.field4301.method1583(86);
            class345.field4975.method1583(93);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 94)
    public static void method601(int arg0) {
        field1090 = null;
        if (arg0 > 3) {
            field1099 = null;
            field1082 = null;
            field1093 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 107)
    public final void method602(int arg0, int arg1) {
        class473 var3 = this.field1086;
        synchronized (this.field1086) {
            this.field1086.method2779(14896, arg1);
        }
        field1094++;
        class473 var4 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2779(14896, arg1);
        }
        class473 var5 = this.field1101;
        synchronized (this.field1101) {
            this.field1101.method2779(14896, arg1);
            if (arg0 != 1) {
                this.method603((byte) 115, -94);
            }
        }
        class473 var6 = this.field1102;
        synchronized (this.field1102) {
            this.field1102.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Lpm;", line = 138)
    public final class103 method603(byte arg0, int arg1) {
        field1088++;
        class473 var3 = this.field1086;
        class103 var4;
        synchronized (this.field1086) {
            var4 = (class103) this.field1086.method2767((long) arg1, 0);
        }
        if (arg0 <= 87) {
            method596(-50, null);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field1080;
        byte[] var6;
        synchronized (this.field1080) {
            var6 = this.field1080.method2512(class90.method737(arg1, -1522725112), (byte) -93, class497.method2951(arg1, (byte) -127));
        }
        class103 var7 = new class103();
        var7.field1635 = this;
        var7.field1646 = arg1;
        if (var6 != null) {
            var7.method798(1994, new class319(var6));
        }
        var7.method796(-1744);
        if (var7.field1698) {
            var7.field1693 = false;
            var7.field1663 = 0;
        }
        if (!this.field1091 && var7.field1700) {
            var7.field1650 = null;
            var7.field1615 = null;
        }
        class473 var8 = this.field1086;
        synchronized (this.field1086) {
            this.field1086.method2777(-1025, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lad;IZLdk;Ldk;)V", line = 270)
    public class77(class12 arg0, int arg1, boolean arg2, class421 arg3, class421 arg4) {
        this.field1091 = arg2;
        this.field1080 = arg3;
        this.field1098 = arg4;
        if (this.field1080 != null) {
            int var6 = this.field1080.method2493((byte) -41) - 1;
            this.field1080.method2509(0, var6);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 197)
    public final void method604(byte arg0) {
        class473 var2 = this.field1086;
        synchronized (this.field1086) {
            if (arg0 != 16) {
                return;
            }
            this.field1086.method2764(-769);
        }
        field1092++;
        class473 var3 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2764(arg0 - 785);
        }
        class473 var4 = this.field1101;
        synchronized (this.field1101) {
            this.field1101.method2764(-769);
        }
        class473 var5 = this.field1102;
        synchronized (this.field1102) {
            this.field1102.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V", line = 222)
    public final void method605(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field1085++;
        if (this.field1091 != arg1) {
            this.field1091 = arg1;
            this.method604((byte) 16);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V", line = 241)
    public final void method606(int arg0, int arg1) {
        field1087++;
        if (arg0 != 500) {
            method596(-15, null);
        }
        this.field1086 = new class473(arg1);
    }
}
