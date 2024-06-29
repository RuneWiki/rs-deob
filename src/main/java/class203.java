import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class203 {

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Ljf;")
    public static class229 field3554 = class212.method1457((byte) 110, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[[B")
    public static byte[][] field3553;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[Ljf;[SII)V", line = 5)
    public static final void method1416(int arg0, class229[] arg1, short[] arg2, int arg3, int arg4) {
        if (arg0 != 1) {
            method1423(-52, (class185) null);
        }
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            class229 var6 = arg1[var5];
            int var7 = arg3;
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var6;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var6 == null || arg1[var9] != null && arg1[var9].method1624(var6, (byte) -120) < (var9 & 0x1)) {
                    class229 var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg1[arg4] = arg1[var7];
            arg1[var7] = var6;
            arg2[arg4] = arg2[var7];
            arg2[var7] = var8;
            method1416(arg0, arg1, arg2, arg3, var7 - 1);
            method1416(arg0, arg1, arg2, var7 + 1, arg4);
        }
        field3546++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILnf;II)V", line = 59)
    public static final void method1417(int arg0, class67 arg1, int arg2, int arg3) {
        field3549++;
        if (arg0 != 2) {
            field3553 = (byte[][]) ((byte[][]) null);
        }
        if (class124.field2176 < 2 && class23.field415 == 0 && !class273.field4677) {
            return;
        }
        class229 var4;
        if (class23.field415 == 1 && class124.field2176 < 2) {
            var4 = class142.method989(new class229[] { class156.field2670, class60.field1037, class26.field472, class299.field5090 }, -53);
        } else if (class273.field4677 && class124.field2176 < 2) {
            var4 = class142.method989(new class229[] { class228.field3916, class60.field1037, class147.field2550, class299.field5090 }, -24);
        } else if (class144.field2507 && class84.field1613[81] && class124.field2176 > 2) {
            var4 = class26.method238(115, class124.field2176 - 2);
        } else {
            var4 = class26.method238(arg0 + 106, class124.field2176 + -1);
        }
        if (class124.field2176 > 2) {
            var4 = class142.method989(new class229[] { var4, class321.field5430, class84.method607(108, class124.field2176 - 2), class18.field288 }, arg0 ^ 0xFFFFFFCE);
        }
        if (arg1 == null) {
            int var5 = class44.field796.method956(var4, arg3 + 4, arg2 + 15, 16777215, 0, class180.field3116, class244.field4352);
            class122.method872(arg3 + 4, arg2, class44.field796.method947(var4) + var5, 0, 15);
            return;
        }
        class138 var6 = arg1.method499(class305.field5169, 16777215);
        if (var6 == null) {
            var6 = class44.field796;
        }
        var6.method945(var4, arg3, arg2, arg1.field1258, arg1.field1295, arg1.field1292, arg1.field1196, arg1.field1194, arg1.field1254, class180.field3116, class244.field4352, class119.field2123);
        class122.method872(class119.field2123[0], class119.field2123[1], class119.field2123[2], 0, class119.field2123[3]);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 116)
    public static final Object method1418(boolean arg0, byte[] arg1, byte arg2) {
        field3555++;
        if (arg1 == null) {
            return null;
        } else if (arg2 >= -18) {
            return (Object) null;
        } else {
            if (arg1.length > 136 && !class303.field5159) {
                try {
                    class315 var3 = (class315) Class.forName("jk").getDeclaredConstructor().newInstance();
                    var3.method633((byte) -97, arg1);
                    return var3;
                } catch (Throwable var5) {
                    class303.field5159 = true;
                }
            }
            return arg0 ? class156.method1046(arg1, -122) : arg1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILek;)Lfh;", line = 149)
    public static final class201 method1419(int arg0, int arg1, class185 arg2) {
        field3545++;
        byte[] var3 = arg2.method1291(arg0, 0);
        int var4 = -26 % ((arg1 - 51) / 63);
        return var3 == null ? null : new class201(var3);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZZB)V", line = 164)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6) {
        if (arg1 < arg3) {
            int var7 = arg1;
            int var8 = (arg1 + arg3) / 2;
            class222 var9 = class41.field737[var8];
            class41.field737[var8] = class41.field737[arg3];
            class41.field737[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (class240.method1741(-99, var9, arg5, class41.field737[var10], arg2, arg4, arg0) <= 0) {
                    class222 var11 = class41.field737[var10];
                    class41.field737[var10] = class41.field737[var7];
                    class41.field737[var7++] = var11;
                }
            }
            class41.field737[arg3] = class41.field737[var7];
            class41.field737[var7] = var9;
            method1420(arg0, arg1, arg2, var7 - 1, arg4, arg5, (byte) -123);
            method1420(arg0, var7 + 1, arg2, arg3, arg4, arg5, (byte) -121);
        }
        if (arg6 > -115) {
            field3553 = (byte[][]) ((byte[][]) null);
        }
        field3548++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 213)
    public static void method1421(boolean arg0) {
        field3554 = null;
        field3553 = (byte[][]) null;
        if (arg0) {
            field3550 = -93;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)Z", line = 224)
    public static final boolean method1422(int arg0, boolean arg1) {
        if (!arg1) {
            field3553 = (byte[][]) ((byte[][]) null);
        }
        field3552++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILek;)V", line = 267)
    public static final void method1423(int arg0, class185 arg1) {
        field3547++;
        if (class104.field1796) {
            return;
        }
        if (class108.field1900) {
            class163.method1104();
        } else {
            class114.method821();
        }
        class170.field2964 = class295.method2045(arg1, true, class169.field2923);
        int var2 = class78.field1429;
        int var3 = var2 * 956 / 503;
        class170.field2964.method310((class175.field3046 - var3) / 2, 0, var3, var2);
        class22.field380 = class44.method384(arg0 ^ 0xFFFF8E60, class183.field3172, arg1);
        class22.field380.method543(class175.field3046 / 2 - class22.field380.field2294 / 2, 18);
        class104.field1796 = true;
        if (arg0 != 23823) {
            method1421(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIBIII)V", line = 294)
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3551++;
        if (class192.method1314(arg0, 113)) {
            if (arg5 < 92) {
                field3554 = (class229) null;
            }
            class98.field1743 = null;
            class260.method1855((byte) 47, arg2, class23.field423[arg0], arg4, arg1, arg6, arg3, arg7, arg8, -1);
            if (class98.field1743 != null) {
                class260.method1855((byte) 47, arg2, class98.field1743, arg4, arg1, arg6, class230.field3994, class44.field809, arg8, -1412584499);
                class98.field1743 = null;
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class244.field4341[var9] = true;
            }
        } else {
            class244.field4341[arg1] = true;
        }
    }
}
