import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class88 extends class184 implements class204 {

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "C")
    public char field1252;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!iia", name = "v", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!iia", name = "y", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!iia", name = "B", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "J")
    public long field1253;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "[Lnr;")
    public static class59[] field1263;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V")
    public static final void method708(boolean arg0) {
        field1259++;
        class390 var1 = null;
        try {
            var1 = class711.method4046(-60, "2");
            class645 var2 = new class645(class348.field5083 * 6 + 3);
            var2.method3730(118, 1);
            var2.method3702(class348.field5083, (byte) -114);
            for (int var3 = 0; var3 < class461.field6799.length; var3++) {
                if (class521.field7460[var3]) {
                    var2.method3702(var3, (byte) -123);
                    var2.method3695(class461.field6799[var3], 255);
                }
            }
            var1.method2507(var2.field9068, (byte) 115, 0, var2.field9084);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2504(103);
            }
        } catch (Exception var4) {
        }
        class673.field9388 = class524.method3075(18);
        class479.field6948 = arg0;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIIBLha;I)Lka;")
    public static final class473 method709(int arg0, int arg1, int arg2, int arg3, byte arg4, class60 arg5, int arg6) {
        field1258++;
        if (arg4 <= 58) {
            return null;
        }
        long var7 = (long) arg6;
        class473 var9 = (class473) class93.field1289.method803(107, var7);
        short var10 = 2055;
        if (var9 == null) {
            class322 var11 = class342.method2175(class169.field2651, 0, arg6, (byte) -126);
            if (var11 == null) {
                return null;
            }
            if (var11.field4570 < 13) {
                var11.method2040(2, (byte) 119);
            }
            var9 = arg5.method418(var11, var10, class538.field7692, 64, 768);
            class93.field1289.method801(1, var9, var7);
        }
        class473 var12 = var9.method251((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method257(arg1);
        }
        if (arg3 != 0) {
            var12.method243(arg3);
        }
        if (arg0 != 0) {
            var12.method279(arg0);
        }
        if (arg2 != 0) {
            var12.method238(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1263 = null;
        if (arg0 != 0) {
            method708(false);
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I")
    public final int method711(int arg0) {
        field1254++;
        return arg0 == 10196 ? this.field1250 : -30;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)C")
    public final char method712(byte arg0) {
        field1251++;
        return arg0 == -92 ? this.field1252 : '\u0006';
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)Z")
    public static final boolean method713(int arg0, int arg1) {
        field1255++;
        if (arg1 == 51 || arg1 == 23 || arg1 == 45 || arg1 == 49 || arg1 == 57) {
            return true;
        } else if (arg1 == 2 || arg1 == 1001) {
            return true;
        } else {
            return arg0 != 0;
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I")
    public final int method714(int arg0) {
        int var2 = 0 / ((-arg0 - 2) / 50);
        field1256++;
        return this.field1261;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)I")
    public final int method715(int arg0) {
        field1264++;
        if (arg0 != -1119) {
            this.field1261 = 20;
        }
        return this.field1260;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)J")
    public final long method716(byte arg0) {
        if (arg0 != 53) {
            method708(true);
        }
        field1262++;
        return this.field1253;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIBIII)V")
    public static final void method717(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class635[] var7 = class554.field7904;
        if (arg3 > -37) {
            method713(-34, 50);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class635 var9 = var7[var8];
            if (var9 != null && var9.field8922 == 2) {
                class112.method835(arg4 >> 1, var9.field8923, 124, arg6, var9.field8927, arg1 >> 1, var9.field8930, var9.field8925 * 2, arg0);
                if (class340.field4942[0] > -1 && class357.field5189 % 20 < 10) {
                    class536 var10 = class76.field1063[var9.field8924];
                    int var11 = arg5 + class340.field4942[0] - 12;
                    int var12 = class340.field4942[1] + arg2 - 28;
                    var10.method3142(var11, var12);
                    class497.method2963(var12 + var10.method1514(), var10.method1504() + var11, (byte) 39, var12, var11);
                }
            }
        }
        field1257++;
    }
}
