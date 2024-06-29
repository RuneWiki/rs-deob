import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class574 {

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Ljt;")
    private class106 field8125 = new class106(64);

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Ljt;")
    public class106 field8128 = new class106(50);

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Ljt;")
    public class106 field8129 = new class106(5);

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lvd;")
    public class39 field8118;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Z")
    public boolean field8124;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lvd;")
    private class39 field8126;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lqg;")
    public class464 field8127;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    public static int[] field8111 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public int field8130;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lvd;")
    public static class39 field8114;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    public static int[] field8112;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
    public final void method3321(byte arg0, int arg1) {
        field8123++;
        if (arg0 != -127) {
            this.field8130 = -5;
        }
        class106 var3 = this.field8125;
        synchronized (this.field8125) {
            this.field8125.method807(arg1, -1);
        }
        class106 var4 = this.field8128;
        synchronized (this.field8128) {
            this.field8128.method807(arg1, -1);
        }
        class106 var5 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3322(String arg0, int arg1) {
        if (arg1 != 16383) {
            method3322(null, -101);
        }
        field8121++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method3323(boolean arg0) {
        class106 var2 = this.field8128;
        synchronized (this.field8128) {
            this.field8128.method809(arg0);
        }
        field8115++;
        class106 var3 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method809(arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method3324(int arg0) {
        field8111 = null;
        field8114 = null;
        if (arg0 == 5) {
            field8112 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public final void method3325(byte arg0) {
        field8119++;
        class106 var2 = this.field8125;
        synchronized (this.field8125) {
            this.field8125.method809(true);
        }
        class106 var3 = this.field8128;
        synchronized (this.field8128) {
            this.field8128.method809(true);
        }
        class106 var4 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method809(true);
            if (arg0 > -89) {
                field8111 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
    public final void method3326(int arg0, boolean arg1) {
        field8122++;
        if (arg1 == this.field8124) {
            return;
        }
        this.field8124 = arg1;
        this.method3325((byte) -110);
        if (arg0 != 1297) {
            this.field8125 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IZ)Low;")
    public final class348 method3327(int arg0, boolean arg1) {
        field8109++;
        class106 var3 = this.field8125;
        class348 var4;
        synchronized (this.field8125) {
            var4 = (class348) this.field8125.method803(125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field8126;
        byte[] var6;
        synchronized (this.field8126) {
            var6 = this.field8126.method211(true, class257.method1681((byte) 103, arg0), class399.method2534(arg0, (byte) -80));
        }
        class348 var7 = new class348();
        var7.field5021 = this;
        var7.field5064 = arg0;
        if (var6 != null) {
            var7.method2204(new class645(var6), (byte) -27);
        }
        var7.method2200((byte) 103);
        if (arg1) {
            return null;
        }
        class106 var8 = this.field8125;
        synchronized (this.field8125) {
            this.field8125.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public final void method3328(int arg0, int arg1) {
        field8110++;
        if (arg1 >= -50) {
            this.method3325((byte) -70);
        }
        this.field8130 = arg0;
        class106 var3 = this.field8128;
        synchronized (this.field8128) {
            this.field8128.method809(true);
        }
        class106 var4 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method809(true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public final void method3329(byte arg0) {
        field8117++;
        class106 var2 = this.field8125;
        synchronized (this.field8125) {
            this.field8125.method800(arg0 ^ 0x7D);
        }
        class106 var3 = this.field8128;
        synchronized (this.field8128) {
            this.field8128.method800(88);
        }
        if (arg0 != 12) {
            field8112 = null;
        }
        class106 var4 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method800(113);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BJ)V")
    public static final void method3330(byte arg0, long arg1) {
        field8120++;
        if (class80.field1136 != null) {
            if (class264.field3784 == 1 || class264.field3784 == 5) {
                class531.method3103(arg1, 0);
            } else if (class264.field3784 == 4) {
                class443.method2751((byte) -55, arg1);
            }
        }
        class400.method2542((long) class357.field5189, class736.field10316, -2682);
        if (class87.field1249 != -1) {
            class453.method2774(class87.field1249, 1024);
        }
        for (int var3 = 0; var3 < class196.field2983; var3++) {
            if (class228.field3352[var3]) {
                class50.field715[var3] = true;
            }
            class432.field6444[var3] = class228.field3352[var3];
            class228.field3352[var3] = false;
        }
        class2.field21 = class357.field5189;
        class325.method2065(-1, null, arg0 ^ 0x2BD0, -1);
        class48.method357(true, -1, null, -1);
        if (class87.field1249 != -1) {
            class196.field2983 = 0;
            class92.method728(true);
        }
        class736.field10316.method469();
        class2.method10(class736.field10316, 29085);
        int var4 = class268.method1715(-445);
        if (var4 == -1) {
            var4 = class389.field5865;
        }
        if (var4 == -1) {
            var4 = class734.field10270;
        }
        class462.method2819(-21356, var4);
        int var5 = class130.field1749.method2579(false) << 8;
        class313.method1984(class130.field1749.field8423 + var5, class130.field1749.field8428 + var5, class12.field171, class130.field1749.field8429, (byte) -34);
        if (arg0 != -79) {
            method3324(-63);
        }
        class12.field171 = 0;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lqg;IZLvd;Lvd;)V")
    public class574(class464 arg0, int arg1, boolean arg2, class39 arg3, class39 arg4) {
        this.field8118 = arg4;
        this.field8124 = arg2;
        this.field8126 = arg3;
        this.field8127 = arg0;
        if (this.field8126 != null) {
            int var6 = this.field8126.method222((byte) -2) - 1;
            this.field8126.method229(var6, 0);
        }
    }
}
