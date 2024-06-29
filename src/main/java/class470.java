import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class470 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Lgg;")
    private class114 field6750 = new class114(128);

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Lgg;")
    public class114 field6760 = new class114(64);

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lkha;")
    private class687 field6756;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lkha;")
    public class687 field6754;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Lbh;")
    public static class429 field6749;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[Lfba;")
    public static class600[] field6755;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "[[I")
    public static int[][] field6753;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V", line = 4)
    public final void method2764(int arg0, byte arg1) {
        class114 var3 = this.field6750;
        synchronized (this.field6750) {
            this.field6750.method775(1, arg0);
        }
        field6758++;
        class114 var4 = this.field6760;
        synchronized (this.field6760) {
            this.field6760.method775(1, arg0);
            if (arg1 < 80) {
                method2769(-102);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Lqca;", line = 20)
    public final class351 method2765(int arg0, int arg1) {
        field6757++;
        class114 var3 = this.field6750;
        class351 var4;
        synchronized (this.field6750) {
            var4 = (class351) this.field6750.method778((long) arg1, -59);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field6756;
        byte[] var6;
        synchronized (this.field6756) {
            var6 = this.field6756.method3810(arg0, -23360, arg1);
        }
        class351 var7 = new class351();
        var7.field4615 = this;
        var7.field4625 = arg1;
        if (var6 != null) {
            var7.method2062(false, new class179(var6));
        }
        var7.method2069(true);
        class114 var8 = this.field6750;
        synchronized (this.field6750) {
            this.field6750.method774((long) arg1, -93, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBI)I", line = 60)
    public static final int method2766(int arg0, byte arg1, int arg2) {
        if (arg1 != 48) {
            field6749 = null;
        }
        field6751++;
        int var3 = class625.method3415(arg0 + 45365, -117, 4, arg2 + 91923) - (-(class625.method3415(arg0 + 10294, -123, 2, arg2 - -37821) + -128 >> 1) - (class625.method3415(arg0, -88, 1, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 82)
    public final void method2767(int arg0) {
        field6746++;
        class114 var2 = this.field6750;
        synchronized (this.field6750) {
            this.field6750.method781((byte) 47);
        }
        int var3 = -115 / ((-arg0 - 39) / 60);
        class114 var4 = this.field6760;
        synchronized (this.field6760) {
            this.field6760.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(IBI)V", line = 98)
    public final void method2768(int arg0, byte arg1, int arg2) {
        field6747++;
        if (arg1 != 116) {
            field6753 = null;
        }
        this.field6750 = new class114(arg0);
        this.field6760 = new class114(arg2);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 111)
    public static final void method2769(int arg0) {
        class198.field2544 = class619.field8670.field800 + class619.field8670.field808 - arg0;
        field6748++;
        class48.field701 = new String[500];
        class546.field7684 = class111.field1373.field800 + class111.field1373.field808 + 2;
        for (int var1 = 0; var1 < class48.field701.length; var1++) {
            class48.field701[var1] = "";
        }
        class192.method1210(51, class586.field8125.method3261(class416.field5920, (byte) 82));
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V", line = 181)
    public class470(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field6756 = arg2;
        this.field6754 = arg3;
        this.field6756.method3812(0, 36);
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 138)
    public final void method2770(int arg0) {
        if (arg0 > -98) {
            field6749 = null;
        }
        class114 var2 = this.field6750;
        synchronized (this.field6750) {
            this.field6750.method776((byte) -84);
        }
        field6752++;
        class114 var3 = this.field6760;
        synchronized (this.field6760) {
            this.field6760.method776((byte) 120);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 155)
    public static void method2771(boolean arg0) {
        field6753 = null;
        field6749 = null;
        if (!arg0) {
            field6755 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)I", line = 168)
    public static final int method2772(byte arg0, int arg1) {
        if (arg0 > -119) {
            return -119;
        } else {
            field6759++;
            return arg1 & 0xFF;
        }
    }
}
