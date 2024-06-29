import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class204 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lku;")
    private class232 field3027 = new class232(64);

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lku;")
    public class232 field3038 = new class232(30);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lb;")
    private class201 field3029;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lb;")
    public class201 field3036;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3025 = new String[100];

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lku;")
    public static class232 field3031 = new class232(10);

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lbc;")
    public static class225 field3040 = new class225();

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lwf;")
    public static class79 field3041 = new class79(39, -1);

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lba;")
    public static class240 field3042 = new class240(128);

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
    public static int[] field3043 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
    public final void method1276(int arg0, byte arg1) {
        field3037++;
        this.field3039 = arg0;
        class232 var3 = this.field3038;
        synchronized (this.field3038) {
            this.field3038.method1478((byte) -105);
        }
        if (arg1 != -39) {
            field3041 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILdt;II)V")
    public static final void method1277(int arg0, class145 arg1, int arg2, int arg3) {
        if (arg1.field2067 == 0) {
            arg1.field2041 = arg1.field1985;
        } else if (arg1.field2067 == 1) {
            arg1.field2041 = (arg3 - arg1.field2021) / 2 + arg1.field1985;
        } else if (arg1.field2067 == 2) {
            arg1.field2041 = arg3 - arg1.field2021 - arg1.field1985;
        } else if (arg1.field2067 == 3) {
            arg1.field2041 = arg1.field1985 * arg3 >> 14;
        } else if (arg1.field2067 == 4) {
            arg1.field2041 = (arg1.field1985 * arg3 >> 14) + (arg3 - arg1.field2021) / 2;
        } else {
            arg1.field2041 = arg3 - (arg1.field2021 + (arg1.field1985 * arg3 >> 14));
        }
        field3035++;
        if (arg1.field2007 == 0) {
            arg1.field1971 = arg1.field1978;
        } else if (arg1.field2007 == 1) {
            arg1.field1971 = (arg0 - arg1.field2010) / 2 + arg1.field1978;
        } else if (arg1.field2007 == 2) {
            arg1.field1971 = arg0 - arg1.field2010 - arg1.field1978;
        } else if (arg1.field2007 == 3) {
            arg1.field1971 = arg1.field1978 * arg0 >> 14;
        } else if (arg1.field2007 == 4) {
            arg1.field1971 = (arg1.field1978 * arg0 >> 14) + (arg0 - arg1.field2010) / 2;
        } else {
            arg1.field1971 = arg0 - arg1.field2010 - (arg1.field1978 * arg0 >> 14);
        }
        if (arg2 != -32368 || !class342.field4986 || client.method1122(arg1).field5472 == 0 && arg1.field2073 != 0) {
            return;
        }
        if (arg1.field1971 < 0) {
            arg1.field1971 = 0;
        } else if ((arg1.field1971 + arg1.field2010) > arg0) {
            arg1.field1971 = arg0 - arg1.field2010;
        }
        if (arg1.field2041 < 0) {
            arg1.field2041 = 0;
        } else if (arg1.field2041 + arg1.field2021 > arg3) {
            arg1.field2041 = arg3 - arg1.field2021;
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
    public static final int method1278(int arg0, int arg1) {
        field3030++;
        if (arg1 != -3689) {
            field3041 = null;
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Ljq;")
    public final class327 method1279(int arg0, int arg1) {
        field3026++;
        class232 var3 = this.field3027;
        class327 var4;
        synchronized (this.field3027) {
            var4 = (class327) this.field3027.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3029.method1257(class281.method1779((byte) 66, arg0), class244.method1537(arg0, 427369832), 24558);
        class327 var6 = new class327();
        var6.field4722 = arg0;
        var6.field4716 = this;
        if (var5 != null) {
            var6.method2072(new class276(var5), (byte) -118);
        }
        class232 var7 = this.field3027;
        synchronized (this.field3027) {
            if (arg1 != -2) {
                this.field3038 = null;
            }
            this.field3027.method1473(var6, (long) arg0, arg1 ^ 0x1C);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1280(int arg0) {
        class112.field1421 = new class145[class229.field3449.method1233(arg0)][];
        field3034++;
        class77.field945 = new class145[class229.field3449.method1233(-1)][];
        class481.field6780 = new boolean[class229.field3449.method1233(-1)];
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method1281(int arg0) {
        field3032++;
        class232 var2 = this.field3027;
        synchronized (this.field3027) {
            this.field3027.method1478((byte) -101);
        }
        class232 var3 = this.field3038;
        synchronized (this.field3038) {
            this.field3038.method1478((byte) -111);
        }
        if (arg0 != -5) {
            method1277(-85, (class145) null, 2, -50);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
    public final void method1282(int arg0, int arg1) {
        class232 var3 = this.field3027;
        synchronized (this.field3027) {
            this.field3027.method1486(438127120, arg1);
        }
        field3033++;
        class232 var4 = this.field3038;
        synchronized (this.field3038) {
            this.field3038.method1486(arg0 ^ 0x1A1D4A12, arg1);
            if (arg0 != 2) {
                field3043 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public final void method1283(byte arg0) {
        class232 var2 = this.field3027;
        synchronized (this.field3027) {
            int var3 = 124 % ((arg0 + 21) / 61);
            this.field3027.method1475(0);
        }
        field3028++;
        class232 var4 = this.field3038;
        synchronized (this.field3038) {
            this.field3038.method1475(0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        field3031 = null;
        field3043 = null;
        field3041 = null;
        field3042 = null;
        field3025 = null;
        field3040 = null;
        if (arg0 >= -69) {
            field3042 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lea;ILb;Lb;)V")
    public class204(class353 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field3029 = arg2;
        this.field3036 = arg3;
        int var5 = this.field3029.method1233(-1) - 1;
        this.field3029.method1235(0, var5);
    }
}
