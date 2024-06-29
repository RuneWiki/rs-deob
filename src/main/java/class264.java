import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class264 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lhn;")
    private class509 field3539 = new class509(64);

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lfo;")
    private class361 field3542;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Lbu;")
    public static class17 field3547 = new class17("LOCAL", 4);

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lqh;")
    public static class50 field3548 = new class50(16);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/lang/String;)I", line = 3)
    public static final int method1618(int arg0, String arg1) {
        field3540++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != 4) {
            field3541 = -31;
        }
        for (int var2 = 0; var2 < class85.field1014; var2++) {
            if (arg1.equalsIgnoreCase(class52.field611[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Loh;", line = 31)
    public final class280 method1619(int arg0, int arg1) {
        field3543++;
        class509 var3 = this.field3539;
        class280 var4;
        synchronized (this.field3539) {
            var4 = (class280) this.field3539.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field3542;
        byte[] var7;
        synchronized (this.field3542) {
            if (arg0 != 2) {
                return null;
            }
            var7 = this.field3542.method2130(31, arg1, -82);
        }
        class280 var8 = new class280();
        if (var7 != null) {
            var8.method1696(new class396(var7), arg0 ^ 0xFFFFB56B);
        }
        class509 var9 = this.field3539;
        synchronized (this.field3539) {
            this.field3539.method3046((long) arg1, var8, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 62)
    public final void method1620(byte arg0) {
        int var2 = 97 % ((50 - arg0) / 35);
        field3546++;
        class509 var3 = this.field3539;
        synchronized (this.field3539) {
            this.field3539.method3034((byte) 79);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 76)
    public final void method1621(int arg0) {
        class509 var2 = this.field3539;
        synchronized (this.field3539) {
            this.field3539.method3045(48);
        }
        field3545++;
        if (arg0 != 31) {
            field3541 = -11;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[I[IB)V", line = 89)
    public static final void method1622(int arg0, int arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if ((var10 & var9) + var7 > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method1622(arg0, var6 - 1, arg2, arg3, (byte) -124);
            method1622(var6 + 1, arg1, arg2, arg3, (byte) -122);
        }
        int var13 = -9 / ((arg4 + 68) / 50);
        field3538++;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V", line = 152)
    public final void method1623(int arg0, int arg1) {
        field3544++;
        if (arg0 != 19562) {
            field3541 = 53;
        }
        class509 var3 = this.field3539;
        synchronized (this.field3539) {
            this.field3539.method3036(arg1, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 165)
    public static void method1624(int arg0) {
        if (arg0 != -1) {
            field3548 = null;
        }
        field3547 = null;
        field3548 = null;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 181)
    public class264(class104 arg0, int arg1, class361 arg2) {
        this.field3542 = arg2;
        this.field3542.method2136(-53, 31);
    }
}
