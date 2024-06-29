import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class190 extends class162 {

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2938 = -1;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lhl;")
    public static class40 field2937 = new class40();

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Lfd;")
    private class130 field2935;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Lfa;")
    public static class273 field2931;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;IIB[B)I")
    public static final int method1284(int arg0, String arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field2936++;
        int var6 = arg2 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg3 + var7] = -97;
            } else {
                arg5[arg3 + var7] = 63;
            }
        }
        if (arg4 != 30) {
            field2937 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1285(class273 arg0, int arg1) {
        class174.field2725 = arg0.method1895("p11_full", false);
        class192.field3032 = arg0.method1895("p12_full", false);
        class53.field717 = arg0.method1895("b12_full", false);
        field2930++;
        if (arg1 >= -61) {
            method1284(120, (String) null, -113, -60, (byte) -86, (byte[]) null);
        }
        class124.field1903 = arg0.method1895("hitmarks", false);
        class103.field1554 = arg0.method1895("hitbar_default", false);
        class135.field2110 = arg0.method1895("headicons_pk", false);
        class197.field3129 = arg0.method1895("headicons_prayer", false);
        class115.field1743 = arg0.method1895("hint_headicons", false);
        class48.field668 = arg0.method1895("hint_mapmarkers", false);
        class29.field368 = arg0.method1895("mapflag", false);
        class304.field4967 = arg0.method1895("cross", false);
        class85.field1344 = arg0.method1895("mapdots", false);
        class260.field4265 = arg0.method1895("scrollbar", false);
        class165.field2602 = arg0.method1895("name_icons", false);
        class57.field778 = arg0.method1895("floorshadows", false);
        class107.field1651 = arg0.method1895("compass", false);
        class84.field1323 = arg0.method1895("hint_mapedge", false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILma;)V")
    public final void method1286(int arg0, class202 arg1) {
        if (arg0 != 9762) {
            this.method1287(-106, (String) null, (byte) 35);
        }
        field2940++;
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method1289(arg1, var3, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method1287(int arg0, String arg1, byte arg2) {
        field2934++;
        int var4 = -62 % ((arg2 + 16) / 52);
        if (this.field2935 == null) {
            return arg1;
        } else {
            class128 var5 = (class128) this.field2935.method872((byte) -118, (long) arg0);
            return var5 == null ? arg1 : var5.field1979;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lll;")
    public static final class222 method1288(int arg0, int arg1) {
        class222 var2 = (class222) class1.field4.method149((byte) -47, (long) arg0);
        field2932++;
        if (arg1 != -8227) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class209.field3358.method1877(0, arg0, (byte) 33);
            class222 var4 = new class222(var3);
            var4.method751(class126.field1958, (int[]) null);
            class1.field4.method152(var4, (long) arg0, true);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lma;IB)V")
    private final void method1289(class202 arg0, int arg1, byte arg2) {
        if (arg2 != -122) {
            field2938 = -94;
        }
        if (arg1 == 249) {
            int var4 = arg0.method1420((byte) 0);
            if (this.field2935 == null) {
                int var5 = class257.method1792(var4, (byte) 0);
                this.field2935 = new class130(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1420((byte) 0) == 1;
                int var8 = arg0.method1401((byte) -88);
                class134 var9;
                if (var7) {
                    var9 = new class128(arg0.method1403(-124));
                } else {
                    var9 = new class221(arg0.method1440(20404));
                }
                this.field2935.method857(false, var9, (long) var8);
            }
        }
        field2933++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)I")
    public final int method1290(int arg0, int arg1, byte arg2) {
        field2939++;
        if (this.field2935 == null) {
            return arg1;
        }
        class221 var4 = (class221) this.field2935.method872((byte) -115, (long) arg0);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2 != 121) {
                this.method1287(-46, (String) null, (byte) -100);
            }
            return var4.field3542;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static void method1291(byte arg0) {
        field2937 = null;
        if (arg0 > -1) {
            method1291((byte) 111);
        }
        field2931 = null;
    }
}
