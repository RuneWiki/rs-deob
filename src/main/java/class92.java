import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class92 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lrd;")
    private static class173 field1734 = class133.method843("and choose the (Wcreate account(W", 73);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lrd;")
    public static class173 field1732 = class133.method843("Hidden)2use", 125);

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lrd;")
    public static class173 field1737 = field1734;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Laf;")
    public static class7 field1739 = new class7(260);

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    public static int[] field1741 = new int[50];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Laf;")
    public static class7 field1743 = new class7(64);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ldh;")
    public static class39 field1742;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method584(byte arg0) {
        field1739 = null;
        field1732 = null;
        field1742 = null;
        field1734 = null;
        field1741 = null;
        if (arg0 > -4) {
            field1732 = null;
        }
        field1737 = null;
        field1743 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
    public static final void method585(int arg0, int arg1, byte arg2) {
        if (arg2 != 79) {
            field1732 = null;
        }
        long var3 = (long) ((arg0 << 16) + arg1);
        field1736++;
        class220 var5 = (class220) class69.field1329.method677(-2755, var3);
        if (var5 != null) {
            class161.field2991.method726(-76, var5);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII[BI[Lrh;IBI)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class177[] arg6, int arg7, byte arg8, int arg9) {
        field1733++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg6[arg7].field3474[arg0 + var10][arg2 + var15] = class209.method1383(arg6[arg7].field3474[arg0 + var10][arg2 + var15], -16777217);
                }
            }
        }
        class121 var11 = new class121(arg4);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg9 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg1 && arg1 + 8 > var14) {
                        class62.method398(arg0 + class19.method168(var14 & 0x7, arg3, var13 & 0x7, (byte) 59), arg8 ^ 0x3E, 0, arg3, arg7, 0, var11, arg2 + class40.method294(var13 & 0x7, arg3, arg8 ^ 0xFFFFFFCA, var14 & 0x7));
                    } else {
                        class62.method398(-1, 0, 0, 0, 0, 0, var11, -1);
                    }
                }
            }
        }
        if (arg8 != 62) {
            field1739 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lrd;ZI)V")
    public static final void method587(class173 arg0, boolean arg1, int arg2) {
        field1738++;
        class173 var3 = arg0.method1156(arg2 - 91);
        short[] var4 = new short[16];
        int var5 = arg2;
        for (int var6 = 0; var6 < class64.field1262; var6++) {
            class19 var9 = class195.method1298(1639, var6);
            if ((!arg1 || var9.field385) && var9.field399.method1156(-91).method1151(var3, false) != -1) {
                if (var5 >= 250) {
                    class10.field175 = -1;
                    class11.field182 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class212.field4113 = 0;
        class11.field182 = var4;
        class10.field175 = var5;
        class173[] var7 = new class173[class10.field175];
        for (int var8 = 0; var8 < class10.field175; var8++) {
            var7[var8] = class195.method1298(1639, var4[var8]).field399;
        }
        class9.method64(var7, class11.field182, arg2 - 27811);
    }
}
