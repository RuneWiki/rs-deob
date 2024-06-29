import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lhp;")
    private class277 field162 = new class277(64);

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lhp;")
    public class277 field164 = new class277(64);

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lkea;")
    private class203 field158;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lkea;")
    public class203 field163;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lig;")
    public static class206 field155 = new class206(16, 6);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILtt;II)V")
    public static final void method103(int arg0, class78 arg1, int arg2, int arg3) {
        field157++;
        if (arg1.field2502 == arg0 && arg0 != -1) {
            class177 var4 = class259.field3686.method2961(arg0, 8);
            int var5 = var4.field2160;
            if (var5 == 1) {
                arg1.field2486 = 1;
                arg1.field2491 = 0;
                arg1.field2482 = arg3;
                arg1.field2487 = 0;
                arg1.field2490 = 0;
                class405.method2571(false, arg1.field1764, 80, arg1.field1768, arg1.field1757, var4, arg1.field2491);
            }
            if (var5 == 2) {
                arg1.field2490 = 0;
            }
        } else if (arg0 == -1 || arg1.field2502 == -1 || class259.field3686.method2961(arg0, 8).field2161 >= class259.field3686.method2961(arg1.field2502, arg2 ^ 0x8).field2161) {
            arg1.field2519 = arg1.field2517;
            arg1.field2491 = 0;
            arg1.field2486 = 1;
            arg1.field2487 = 0;
            arg1.field2482 = arg3;
            arg1.field2502 = arg0;
            arg1.field2490 = 0;
            if (arg1.field2502 != -1) {
                class405.method2571(false, arg1.field1764, 89, arg1.field1768, arg1.field1757, class259.field3686.method2961(arg1.field2502, 8), arg1.field2491);
            }
        }
        if (arg2 != 0) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public final void method104(boolean arg0) {
        class277 var2 = this.field162;
        synchronized (this.field162) {
            if (arg0) {
                this.method108((byte) 2, 90);
            }
            this.field162.method1805(-109);
        }
        field152++;
        class277 var3 = this.field164;
        synchronized (this.field164) {
            this.field164.method1805(41);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILbw;Lbw;)V")
    public static final void method105(int arg0, int arg1, int arg2, class599 arg3, class599 arg4) {
        class99 var5 = class290.method1876(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1168 = arg3;
            var5.field1176 = arg4;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public static final int method106(int arg0, int arg1) {
        if (arg1 == 1585) {
            field160++;
            return arg0 >>> 7;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
    public static void method107(boolean arg0) {
        field155 = null;
        if (!arg0) {
            method107(true);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lbl;")
    public final class565 method108(byte arg0, int arg1) {
        int var3 = 13 / ((74 - arg0) / 38);
        field159++;
        class277 var4 = this.field162;
        class565 var5;
        synchronized (this.field162) {
            var5 = (class565) this.field162.method1801(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class203 var6 = this.field158;
        byte[] var7;
        synchronized (this.field158) {
            var7 = this.field158.method1286(arg1, 34, (byte) -49);
        }
        class565 var8 = new class565();
        var8.field8055 = this;
        if (var7 != null) {
            var8.method3272(new class194(var7), 0);
        }
        class277 var9 = this.field162;
        synchronized (this.field162) {
            this.field162.method1808((long) arg1, var8, (byte) -14);
            return var8;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method109(int arg0) {
        class277 var2 = this.field162;
        synchronized (this.field162) {
            this.field162.method1810(false);
        }
        field153++;
        if (arg0 != -19841) {
            this.field162 = null;
        }
        class277 var3 = this.field164;
        synchronized (this.field164) {
            this.field164.method1810(false);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        int var4 = -102 % ((77 - arg2) / 32);
        this.field162 = new class277(arg1);
        field156++;
        this.field164 = new class277(arg0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)Z")
    public static final boolean method111(int arg0, int arg1, byte arg2) {
        field161++;
        if (arg2 <= 118) {
            return false;
        } else {
            return (arg0 & 0x70000) != 0 | class271.method1777(arg0, arg1, 124) || class430.method2681(arg0, arg1, 121);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    public final void method112(int arg0, byte arg1) {
        field154++;
        int var3 = -128 % ((arg1 - 49) / 51);
        class277 var4 = this.field162;
        synchronized (this.field162) {
            this.field162.method1811((byte) 127, arg0);
        }
        class277 var5 = this.field164;
        synchronized (this.field164) {
            this.field164.method1811((byte) -52, arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;)V")
    public class16(class149 arg0, int arg1, class203 arg2, class203 arg3) {
        this.field158 = arg2;
        this.field163 = arg3;
        this.field158.method1309(1675886592, 34);
    }
}
