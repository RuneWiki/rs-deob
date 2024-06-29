import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class242 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
    private int[] field3013;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public static boolean field3012 = false;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lpl;")
    public static class612 field3020;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZI[B)V", line = 7)
    public static final void method1444(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte[] arg5) {
        field3016++;
        if (arg0 <= arg4) {
            return;
        }
        int var6 = arg0 - arg4 >> 2;
        int var7 = arg2 + arg4;
        if (!arg3) {
            field3020 = null;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I", line = 37)
    public final int method1445(int arg0, int arg1) {
        field3015++;
        if (arg1 <= 98) {
            method1444(-114, -80, 126, false, -2, null);
        }
        int var3 = (this.field3013.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3013[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3013[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([I)V", line = 64)
    public class242(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3013 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3013[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3013[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3013[var5 + var5] = arg0[var4];
            this.field3013[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 105)
    public static final void method1446(int arg0) {
        class82.field1096.method3850(-4, 5);
        field3014++;
        class583.field8147.method188(true, 5);
        class40.field540.method151((byte) -80, 5);
        class428.field5352.method3133(5, (byte) 111);
        class287.field3581.method1491(116, 5);
        class633.field8881.method426(5, 50);
        class583.field8149.method1840(-106, 5);
        class370.field4686.method3937(5, 29206);
        class452.field5800.method3566(5, (byte) 75);
        class659.field9342.method120(0, 5);
        class591.field8297.method1904(5, (byte) 57);
        class556.field7727.method3775((byte) 123, 5);
        class48.field671.method3756(29, 5);
        class705.field9939.method2478(118, 5);
        class453.field5806.method958((byte) -77, 5);
        class64.field879.method2872((byte) -54, 5);
        int var1 = 42 % ((arg0 - 35) / 41);
        class470.field5972.method2209(5, (byte) 49);
        class279.field3504.method1175(-18944, 5);
        class493.field6503.method3167(0, 5);
        class672.field9462.method1857(5, false);
        class493.method2661(0, 5);
        class272.method1561(50, (byte) 70);
        class572.method3155(50, (byte) -89);
        class305.method1751(0, 5);
        class135.method782(5, 100);
        class691.field9779.method2411(true, 5);
        class392.field4930.method2411(true, 5);
        class195.field2452.method2411(true, 5);
        class662.field9368.method2411(true, 5);
        class197.field2497.method2411(true, 5);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBILjava/lang/Object;)[B", line = 146)
    public static final byte[] method1447(int arg0, byte arg1, int arg2, Object arg3) {
        field3019++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class196.method1187(-1047, var4, arg0, arg2);
        } else if (arg3 instanceof class257) {
            class257 var5 = (class257) arg3;
            return var5.method1251((byte) -112, arg0, arg2);
        } else {
            if (arg1 != 121) {
                method1447(127, (byte) -10, -51, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 178)
    public static void method1448(byte arg0) {
        field3020 = null;
        int var1 = 3 % ((arg0 + 44) / 61);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIB)V", line = 189)
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -2 % ((arg4 + 46) / 60);
        if (arg0 - arg3 >= class263.field3294 && (arg0 + arg3) <= class314.field4052 && class289.field3595 <= (arg1 - arg3) && class159.field2063 >= arg1 + arg3) {
            class467.method2471(arg3, arg1, arg2, arg0, 0);
        } else {
            class527.method2864((byte) 82, arg3, arg1, arg0, arg2);
        }
        field3018++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)V", line = 205)
    public static final void method1450(boolean arg0, int arg1, int arg2) {
        field3011++;
        class592 var3 = class61.method371(16, arg1, (byte) -105);
        var3.method3256((byte) 11);
        if (arg0) {
            var3.field8314 = arg2;
        }
    }
}
