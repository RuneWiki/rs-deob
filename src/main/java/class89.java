import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class89 {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lku;")
    private class232 field1101 = new class232(64);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lb;")
    private class201 field1099;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public static int[] field1098 = new int[4096];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLrp;)Ljh;")
    public static final class100 method496(byte arg0, class276 arg1) {
        int var2 = -84 / ((29 - arg0) / 34);
        field1097++;
        return new class100(arg1.method1702(-73), arg1.method1702(-65), arg1.method1702(-119), arg1.method1702(-128), arg1.method1748(false), arg1.method1701(-23121));
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lte;")
    public final class401 method497(int arg0, int arg1) {
        field1093++;
        class232 var3 = this.field1101;
        class401 var4;
        synchronized (this.field1101) {
            var4 = (class401) this.field1101.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1099.method1257(arg1, 16, 24558);
        class401 var6 = new class401();
        int var7 = -68 / ((arg0 + 71) / 45);
        if (var5 != null) {
            var6.method2395(new class276(var5), 29);
        }
        class232 var8 = this.field1101;
        synchronized (this.field1101) {
            this.field1101.method1473(var6, (long) arg1, -37);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method498(int arg0) {
        class232 var2 = this.field1101;
        synchronized (this.field1101) {
            int var3 = -47 / ((arg0 + 39) / 59);
            this.field1101.method1478((byte) -116);
        }
        field1100++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method499(byte arg0) {
        field1092++;
        class428.method2513();
        int var1 = 0;
        if (arg0 != 85) {
            field1102 = -49;
        }
        while (var1 < 4) {
            class422.field5918[var1].method2584(-124);
            var1++;
        }
        class304.method1885(872);
        class145.method905(1);
        System.gc();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhu;")
    public static final class76 method500(Throwable arg0, String arg1) {
        field1091++;
        class76 var2;
        if ((arg0 instanceof class76)) {
            var2 = (class76) arg0;
            var2.field939 = var2.field939 + ' ' + arg1;
        } else {
            var2 = new class76(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method501(String arg0, boolean arg1) {
        field1103++;
        if (!arg1) {
            field1102 = 72;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public final void method502(byte arg0) {
        field1090++;
        class232 var2 = this.field1101;
        synchronized (this.field1101) {
            if (arg0 > 44) {
                this.field1101.method1475(0);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public final void method503(boolean arg0, int arg1) {
        field1096++;
        class232 var3 = this.field1101;
        synchronized (this.field1101) {
            if (arg0) {
                this.field1101.method1486(438127120, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method504(int arg0) {
        if (arg0 < 73) {
            field1098 = null;
        }
        field1098 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class89(class353 arg0, int arg1, class201 arg2) {
        this.field1099 = arg2;
        if (this.field1099 == null) {
            this.field1094 = 0;
        } else {
            this.field1094 = this.field1099.method1235(0, 16);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
    public static final void method505(int arg0, byte arg1) {
        field1095++;
        if (class78.method452(arg0, -3192)) {
            class27.method195(class112.field1421[arg0], (byte) 62, -1);
            if (arg1 != -105) {
                method501((String) null, false);
            }
        }
    }
}
