import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class99 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[Ljd;")
    public static class85[] field1872 = new class85[5000];

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lhj;")
    private static class69 field1875 = class181.method1318("Drop", (byte) -123);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1868 = 2;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lhj;")
    public static class69 field1876 = class181.method1318("Welt", (byte) -117);

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lhj;")
    public static class69 field1877 = field1875;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
    public static boolean field1873 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lnc;")
    public static class83 field1879;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JB)V")
    public static final void method736(long arg0, byte arg1) {
        class48.field692.field2379 = 0;
        class48.field692.method933(111, arg1 ^ 0x51D2);
        field1871++;
        class48.field692.method918(arg0, 18820);
        class73.field1404 = 0;
        class266.field4735 = 1;
        class227.field4138 = 0;
        if (arg1 != -4) {
            field1872 = null;
        }
        class28.field407 = -3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lwk;")
    public static final class257 method737(int arg0, byte arg1) {
        if (arg1 < 61) {
            field1872 = null;
        }
        field1878++;
        class257 var2 = (class257) class129.field2402.method1448((long) arg0, (byte) -40);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1045.method590(arg0, 11, 0);
        class257 var4 = new class257();
        if (var3 != null) {
            var4.method1777(false, new class128(var3));
        }
        class129.field2402.method1453(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method738(int arg0) {
        field1879 = null;
        field1877 = null;
        field1876 = null;
        field1875 = null;
        field1872 = null;
        if (arg0 != -1) {
            method737(78, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
    public static final void method739(byte arg0, int arg1) {
        if (arg0 != 120) {
            field1875 = null;
        }
        class109.field2089 = -1;
        class135.field2528 = arg1;
        class4.field32 = -1;
        class69.method456(arg0 - 119);
        field1870++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[IIII)V")
    public static final void method740(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1162793114) {
            field1873 = false;
        }
        field1880++;
        arg4--;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg4 = var13 + 1;
            arg1[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg1[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ltk;I)V")
    public static final void method741(class50 arg0, int arg1) {
        if (arg1 != 2047) {
            return;
        }
        field1869++;
        int var2 = arg0.field828;
        if (var2 == 324) {
            if (class4.field31 == -1) {
                class252.field4550 = arg0.field838;
                class4.field31 = arg0.field876;
            }
            if (class127.field2330.field1736) {
                arg0.field876 = class4.field31;
            } else {
                arg0.field876 = class252.field4550;
            }
        } else if (var2 == 325) {
            if (class4.field31 == -1) {
                class4.field31 = arg0.field876;
                class252.field4550 = arg0.field838;
            }
            if (class127.field2330.field1736) {
                arg0.field876 = class252.field4550;
            } else {
                arg0.field876 = class4.field31;
            }
        } else if (var2 == 327) {
            arg0.field835 = 150;
            arg0.field883 = (int) (Math.sin((double) class180.field3272 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field737 = 5;
            arg0.field888 = -1;
        } else if (var2 == 328) {
            if (class156.field2904.field2045 == null) {
                arg0.field888 = 0;
            } else {
                arg0.field835 = 150;
                arg0.field883 = (int) (Math.sin((double) class180.field3272 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field737 = 5;
                arg0.field888 = ((int) class156.field2904.field2045.method473((byte) 88) << 11) + 2047;
                arg0.field821 = class156.field2904.field4055;
                arg0.field783 = class156.field2904.field3996;
            }
        }
    }
}
