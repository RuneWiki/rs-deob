import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class71 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1677 = -1;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1687 = 10;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lkc;")
    private static class67 field1683 = class19.method144("green:", 117);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lkc;")
    public static class67 field1681 = field1683;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lkc;")
    private static class67 field1689 = class19.method144("Malformed login packet)3", 76);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lkc;")
    public static class67 field1678 = field1689;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lkc;")
    private static class67 field1686 = class19.method144(" from your ignore list first", 109);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
    public static int[] field1698 = new int[500];

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lkc;")
    public static class67 field1691 = field1686;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lta;")
    public static class119 field1696;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lje;")
    public static class63 field1684;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lpc;")
    public static class97 field1679;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[Lnd;")
    public static class86[] field1685;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I", line = 35)
    public static final int method580(int arg0) {
        field1690++;
        int var1 = class70.method575(class74.field1776, 1, class127.field2980, class112.field2593);
        if (var1 - class133.field3164 >= 800 || (class21.field443[class112.field2593][class127.field2980 >> 7][class74.field1776 >> 7] & 0x4) == 0) {
            if (arg0 > -126) {
                method585(-85);
            }
            return 3;
        } else {
            return class112.field2593;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILbf;Lje;)V", line = 58)
    public static final void method581(boolean arg0, int arg1, class14 arg2, class63 arg3) {
        field1692++;
        class38 var4 = new class38();
        var4.field22 = arg1;
        var4.field869 = arg2;
        var4.field872 = 1;
        var4.field886 = arg3;
        class10 var5 = class58.field1369;
        synchronized (class58.field1369) {
            class58.field1369.method95((byte) 110, var4);
        }
        class111.method838(-1001);
        if (!arg0) {
            method583(54, null, -89, null, (byte) 49, -42, 98);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 94)
    public static void method582(byte arg0) {
        field1698 = null;
        field1686 = null;
        field1679 = null;
        int var1 = -112 % ((-arg0 - 84) / 39);
        field1683 = null;
        field1681 = null;
        field1685 = null;
        field1696 = null;
        field1689 = null;
        field1691 = null;
        field1678 = null;
        field1684 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lad;I[BBII)V", line = 138)
    public static final void method583(int arg0, class5[] arg1, int arg2, byte[] arg3, byte arg4, int arg5, int arg6) {
        field1695++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg2 + var13 > 0 && arg2 + var13 < 103) {
                        arg1[var7].field98[arg6 + var12][arg2 + var13] = class90.method693(arg1[var7].field98[arg6 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class140 var8 = new class140(arg3);
        if (arg4 > -14) {
            field1696 = null;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class4.method37(arg0, arg2 + var11, var8, arg5, 0, arg6 + var10, var9, (byte) 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 207)
    public static final void method584(byte arg0) {
        field1682++;
        if (arg0 != 36) {
            field1685 = null;
        }
        for (int var1 = 0; var1 < class69.field1649; var1++) {
            int var2 = class138.field3308[var1];
            class103 var3 = class44.field1067[var2];
            int var4 = class112.field2558.method1105(arg0 ^ 0xDB);
            if ((var4 & 0x8) != 0) {
                var4 += class112.field2558.method1105(255) << 8;
            }
            class94.method742(var4, var3, (byte) 117, var2);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I", line = 236)
    public static final int method585(int arg0) {
        if (arg0 == -16777217) {
            field1688++;
            return 19;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lkc;", line = 251)
    public static final class67 method586(int arg0, int arg1) {
        if (arg0 != 103) {
            field1684 = null;
        }
        field1693++;
        return class90.method696(arg1, 10, -101, false);
    }
}
