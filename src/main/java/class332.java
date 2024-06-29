import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class332 extends class264 {

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4913 = null;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public static int field4930 = 0;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field4932 = new String[100];

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "Lct;")
    public static class104 field4928;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "Lsd;")
    public static class71 field4933;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)I", line = 4)
    public final int method2161(int arg0) {
        int var2 = -88 % ((arg0 + 26) / 43);
        field4916++;
        return this.field4926 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)I", line = 16)
    public final int method2162(int arg0) {
        field4914++;
        int var2 = -69 % ((arg0 + 38) / 35);
        return class435.method2674(this.field4926, 104);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 26)
    public static final void method2163(int arg0, int arg1) {
        field4920++;
        class125 var2 = class56.method428(arg0, 1, -3636);
        if (arg1 != 12119) {
            method2166(-124, -27);
        }
        var2.method847(arg1 - 11999);
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V", line = 40)
    public static void method2164(int arg0) {
        field4932 = null;
        if (arg0 == 21053) {
            field4928 = null;
            field4913 = null;
            field4933 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Z", line = 54)
    public final boolean method2165(int arg0, byte arg1) {
        field4922++;
        if (arg1 > -110) {
            this.field4927 = -81;
        }
        return (this.field4926 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I", line = 66)
    public static final int method2166(int arg0, int arg1) {
        if (class72.field933 != null) {
            class72.field933.method2695(0);
            class72.field933 = null;
        }
        field4912++;
        class400.field5788++;
        if (class400.field5788 > 4) {
            class337.field4971 = 0;
            class400.field5788 = 0;
            return arg0;
        }
        if (class369.field5320 == field4929) {
            class369.field5320 = class30.field419;
        } else {
            class369.field5320 = field4929;
        }
        class337.field4971 = arg1;
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZII)I", line = 104)
    public static final int method2167(boolean arg0, int arg1, int arg2) {
        field4925++;
        if (arg2 == 4 || arg2 == 5) {
            return class189.field2652[arg1 & 0x3];
        } else {
            if (arg0) {
                method2163(-23, 115);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Z", line = 122)
    public final boolean method2168(byte arg0) {
        field4931++;
        if (arg0 != -39) {
            field4913 = null;
        }
        return ((this.field4926 & 0x56384A) >> 22) != 0;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)Lk;", line = 133)
    public static final class302 method2169(int arg0, int arg1) {
        field4919++;
        class363 var2 = class303.field4440;
        class302 var3;
        synchronized (class303.field4440) {
            var3 = (class302) class303.field4440.method2310((byte) -128, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else if (arg0 == 256) {
            byte[] var4 = field4928.method715(method2171(38, arg1), (byte) 118, class385.method2429((byte) 38, arg1));
            class302 var5 = new class302();
            var5.field4409 = arg1;
            if (var4 != null) {
                var5.method2009(new class256(var4), (byte) 108);
            }
            class363 var6 = class303.field4440;
            synchronized (class303.field4440) {
                class303.field4440.method2299(true, var5, (long) arg1);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)Z", line = 162)
    public final boolean method2170(int arg0) {
        if (arg0 != -25047) {
            method2173(-69, (byte) -83);
        }
        field4915++;
        return ((this.field4926 & 0x304F27) >> 21) != 0;
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)I", line = 186)
    private static final int method2171(int arg0, int arg1) {
        if (arg0 < 35) {
            field4913 = null;
        }
        field4921++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)V", line = 200)
    public static final void method2172(int arg0) {
        field4924++;
        if (class242.field3594) {
            return;
        }
        class242.field3594 = true;
        if (arg0 >= -32) {
            method2166(-95, 19);
        }
        if (class400.field5790) {
            class170.field2220 = (float) ((int) class170.field2220 + 47 & 0xFFFFFFF0);
        } else {
            class299.field4361 += (12.0F - class299.field4361) / 2.0F;
        }
        class373.field5455 = true;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IB)V", line = 227)
    public static final void method2173(int arg0, byte arg1) {
        class120.field1605 = arg0;
        if (arg1 < 92) {
            field4929 = 30;
        }
        field4923++;
        class363 var2 = class9.field123;
        synchronized (class9.field123) {
            class9.field123.method2313(114);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(II)V", line = 240)
    public class332(int arg0, int arg1) {
        this.field4927 = arg1;
        this.field4926 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)Z", line = 249)
    public final boolean method2174(int arg0) {
        field4917++;
        if (arg0 == 3165991) {
            return (this.field4926 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
