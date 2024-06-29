import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class74 extends class105 {

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "Leh;")
    public static class47 field1623 = class195.method1282((byte) -4, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Leh;")
    public static class47 field1622 = class195.method1282((byte) -4, "p12_full");

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1620 = 7759444;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "Lpa;")
    public static class136 field1626 = new class136(64);

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Leh;")
    public static class47 field1628 = class195.method1282((byte) -4, "Abbrechen");

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Leh;I)Z")
    public static final boolean method649(class47 arg0, int arg1) {
        ++field1625;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 >= -23) {
                method650(-94, (byte) 66, (class47[]) null, 79);
            }
            for (int var2 = 0; ~var2 > ~class77.field1679; ++var2) {
                if (arg0.method411(false, class43.field864[var2])) {
                    return true;
                }
            }
            return arg0.method411(false, class123.field2489.field598);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB[Leh;I)Leh;")
    public static final class47 method650(int arg0, byte arg1, class47[] arg2, int arg3) {
        ++field1619;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; ++var5) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class60.field1164;
            }
            var4 += arg2[arg0 + var5].field940;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        int var8 = 90 / ((arg1 - 53) / 48);
        for (int var9 = 0; ~arg3 < ~var9; ++var9) {
            class47 var11 = arg2[arg0 + var9];
            class128.method958(var11.field960, 0, var7, var6, var11.field940);
            var6 += var11.field940;
        }
        class47 var10 = new class47();
        var10.field960 = var7;
        var10.field940 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1628 = null;
        if (arg0 < 111) {
            method650(-71, (byte) -30, (class47[]) null, 42);
        }
        field1626 = null;
        field1622 = null;
        field1623 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIILkb;IJZ)Z")
    public static final boolean method652(int arg0, int arg1, int arg2, int arg3, int arg4, class92 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class106.method864(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            method652(-70, 73, -71, 107, -101, (class92) null, 127, -124L, true);
        }
        int[] var3 = super.field2192.method336(-106, arg0);
        if (super.field2192.field770) {
            for (int var4 = 0; ~class149.field2928 < ~var4; ++var4) {
                var3[var4] = class167.field3237[var4];
            }
        }
        ++field1621;
        return var3;
    }
}
