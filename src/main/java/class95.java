import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class95 {

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Z")
    public boolean field1770 = true;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field1763 = new int[5];

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Li;")
    public static class88 field1768 = class208.method1425(105, "; Max)2Age=");

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Li;")
    public static class88 field1771 = class208.method1425(105, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[J")
    public static long[] field1765 = new long[100];

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Li;")
    public static class88 field1772 = class208.method1425(105, "http:)4)4");

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1761;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static final void method677(boolean arg0) {
        while (true) {
            if (class230.field4314.method31(false, class228.field4272) >= 11) {
                int var1 = class230.field4314.method28(11, -315);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class244.field4493[var1] == null) {
                        var2 = true;
                        class244.field4493[var1] = new class44();
                        if (class77.field1397[var1] != null) {
                            class244.field4493[var1].method285(class77.field1397[var1], true);
                        }
                    }
                    class174.field3430[class55.field1027++] = var1;
                    class44 var3 = class244.field4493[var1];
                    var3.field4083 = class117.field2115;
                    int var4 = class6.field75[class230.field4314.method28(3, -315)];
                    if (var2) {
                        var3.field4121 = var3.field4087 = var4;
                    }
                    int var5 = class230.field4314.method28(1, -315);
                    if (var5 == 1) {
                        class139.field2581[class192.field3704++] = var1;
                    }
                    int var6 = class230.field4314.method28(5, -315);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class230.field4314.method28(5, -315);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class230.field4314.method28(1, -315);
                    var3.method1476(var8 == 1, class240.field4458.field4089[0] + var7, 0, class240.field4458.field4143[0] + var6);
                    continue;
                }
            }
            class230.field4314.method35(8);
            if (!arg0) {
                return;
            }
            field1766++;
            return;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIBIII[BIIII)V")
    public static final void method678(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field1775++;
        int var11 = ((arg7 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg3 & 0xFF0000) >> 8;
        int var12 = 256 - arg3;
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                if (arg6[arg4++] == 0) {
                    arg8++;
                } else {
                    int var16 = arg0[arg8];
                    arg0[arg8++] = (class70.method470(var12 * class70.method470(var16, 16711935), -16711936) + class70.method470(16711680, var12 * class70.method470(var16, 65280)) >> 8) + var11;
                }
            }
            arg8 += arg5;
            arg4 += arg10;
        }
        int var14 = 65 / ((23 - arg2) / 45);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1771 = null;
        field1763 = null;
        field1768 = null;
        field1772 = null;
        field1765 = null;
        field1761 = null;
        if (arg0 > -48) {
            method677(false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1760 = arg3;
        this.field1770 = arg6;
        this.field1762 = arg0;
        this.field1774 = arg1;
        this.field1764 = arg4;
        this.field1773 = arg5;
        this.field1767 = arg2;
    }
}
