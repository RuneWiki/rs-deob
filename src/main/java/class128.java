import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class128 {

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "Lis;")
    public static class101 field2090 = null;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lqj;")
    public static class511 field2086 = new class511(14, -1);

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "Leda;")
    public static class116 field2094 = new class116(87, 12);

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "Lsca;")
    public static class225 field2096 = class192.method1359((byte) 62);

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "[[Lvj;")
    public static class204[][] field2093;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "[[[Z")
    public static boolean[][][] field2095;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Lnea;")
    public static final class538 method1010(int arg0, int arg1, int arg2) {
        field2087++;
        class538 var3 = new class538();
        var3.field7908 = -1;
        var3.field7918 = arg0 + arg1 + 5;
        var3.field7914 = arg2 + 1 + 5;
        var3.field7891 = -1;
        var3.field7893 = new int[var3.field7918][var3.field7914];
        var3.method3165(true);
        return var3;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lufa;B)V")
    public static final void method1011(class141 arg0, byte arg1) {
        field2092++;
        int var2 = arg0.field2413 - class148.field2508;
        int var3 = arg0.field2408 * 512 + arg0.method1108(117) * 256;
        int var4 = arg0.field2447 * 512 + (arg0.method1108(80) * 256);
        arg0.field3155 += (var3 - arg0.field3155) / var2;
        arg0.field3154 += (var4 - arg0.field3154) / var2;
        arg0.field2460 = 0;
        if (arg1 > -77) {
            return;
        }
        if (arg0.field2380 == 0) {
            arg0.method1097(1, 8192);
        }
        if (arg0.field2380 == 1) {
            arg0.method1097(1, 12288);
        }
        if (arg0.field2380 == 2) {
            arg0.method1097(1, 0);
        }
        if (arg0.field2380 == 3) {
            arg0.method1097(1, 4096);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IJ)V")
    public static final void method1012(int arg0, long arg1) {
        field2091++;
        int var3 = class386.field5659;
        if (arg0 != 1) {
            method1013(-38);
        }
        int var4 = class108.field1761;
        if (class606.field8728 != var3) {
            int var5 = var3 - class606.field8728;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class606.field8728 += var6;
        }
        if (!class525.field7713.field5977) {
            class636.field9031 += (float) arg1 * class609.field8756 / 40.0F * 8.0F;
            class473.field6790 += (float) arg1 * class677.field9647 / 40.0F * 8.0F;
        }
        if (class392.field5704 != var4) {
            int var7 = var4 - class392.field5704;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class392.field5704 += var8;
        }
        class689.method3882((byte) 86);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field2093 = null;
        field2086 = null;
        if (arg0 == 256) {
            field2095 = null;
            field2094 = null;
            field2090 = null;
            field2096 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lvo;III)Lll;")
    public static final class490 method1014(class345 arg0, int arg1, int arg2, int arg3) {
        field2088++;
        byte[] var4 = arg0.method2081(-124, arg2, arg3);
        if (arg1 != -1) {
            method1011(null, (byte) -117);
        }
        return var4 == null ? null : new class490(var4);
    }
}
