import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class12 {

    @OriginalMember(owner = "client!nd", name = "Cb", descriptor = "I")
    private int field2088 = 0;

    @OriginalMember(owner = "client!nd", name = "Wb", descriptor = "I")
    private int field2108 = 0;

    @OriginalMember(owner = "client!nd", name = "Kb", descriptor = "Z")
    public boolean field2096 = false;

    @OriginalMember(owner = "client!nd", name = "Pb", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!nd", name = "Ob", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!nd", name = "Hb", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!nd", name = "Fb", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!nd", name = "Vb", descriptor = "Lj;")
    private class57 field2107;

    @OriginalMember(owner = "client!nd", name = "yb", descriptor = "[I")
    public static int[] field2084 = new int[128];

    @OriginalMember(owner = "client!nd", name = "zb", descriptor = "Lpd;")
    public static class94 field2085 = class28.method249(83, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!nd", name = "xb", descriptor = "Lpd;")
    public static class94 field2083 = class28.method249(123, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!nd", name = "Lb", descriptor = "Lpd;")
    public static class94 field2097 = class28.method249(-62, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!nd", name = "Ib", descriptor = "Lpd;")
    public static class94 field2094 = class28.method249(-116, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!nd", name = "Qb", descriptor = "Lpd;")
    private static class94 field2102 = class28.method249(80, "Connection timed out)3");

    @OriginalMember(owner = "client!nd", name = "Nb", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!nd", name = "Gb", descriptor = "Lpd;")
    public static class94 field2092 = field2102;

    @OriginalMember(owner = "client!nd", name = "Tb", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!nd", name = "Eb", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!nd", name = "Xb", descriptor = "Lpd;")
    public static class94 field2109 = class28.method249(-106, "Icons redrawn");

    @OriginalMember(owner = "client!nd", name = "Yb", descriptor = "[I")
    public static int[] field2110 = new int[100];

    @OriginalMember(owner = "client!nd", name = "Ab", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nd", name = "Db", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!nd", name = "Mb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!nd", name = "Rb", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!nd", name = "Sb", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!nd", name = "Ub", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!nd", name = "Zb", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)Z", line = 5)
    public static final boolean method608(int arg0, boolean arg1) {
        field2089++;
        if (arg1) {
            method609(12);
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 18)
    public static void method609(int arg0) {
        if (arg0 != 128) {
            method609(-59);
        }
        field2092 = null;
        field2110 = null;
        field2109 = null;
        field2102 = null;
        field2084 = null;
        field2085 = null;
        field2094 = null;
        field2097 = null;
        field2083 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lia;", line = 48)
    public final class48 method77(int arg0) {
        field2104++;
        class86 var2 = class41.method309(13, this.field2100);
        if (arg0 != 1536) {
            method611(null, true, -15);
        }
        class48 var3;
        if (this.field2096) {
            var3 = var2.method627(-11590, -1);
        } else {
            var3 = var2.method627(-11590, this.field2108);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 75)
    public final void method610(boolean arg0, int arg1) {
        field2095++;
        if (this.field2096) {
            return;
        }
        this.field2088 += arg1;
        if (arg0) {
            this.method77(19);
        }
        while (this.field2107.field1420[this.field2108] < this.field2088) {
            this.field2088 -= this.field2107.field1420[this.field2108];
            this.field2108++;
            if (this.field2108 >= this.field2107.field1425.length) {
                this.field2096 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V", line = 245)
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2101 = arg3;
        this.field2087 = arg5 + arg6;
        this.field2100 = arg0;
        this.field2093 = arg1;
        this.field2082 = arg2;
        this.field2091 = arg4;
        int var8 = class41.method309(13, this.field2100).field2162;
        if (var8 == -1) {
            this.field2096 = true;
        } else {
            this.field2096 = false;
            this.field2107 = class70.method519(5, var8);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lo;ZI)V", line = 118)
    public static final void method611(class87 arg0, boolean arg1, int arg2) {
        field2106++;
        if (class86.field2186 != null) {
            try {
                class86.field2186.method636(1);
            } catch (Exception var8) {
            }
            class86.field2186 = null;
        }
        class86.field2186 = arg0;
        if (arg2 != 4) {
            field2099 = 119;
        }
        class30.method259(arg2 ^ 0xFFFFFF8E, arg1);
        class119.field2971 = null;
        class123.field3108.field3047 = 0;
        class117.field2936 = 0;
        class27.field708 = null;
        while (true) {
            class7 var3 = (class7) class89.field2278.method22(13389);
            if (var3 == null) {
                while (true) {
                    class7 var4 = (class7) class81.field2080.method22(13389);
                    if (var4 == null) {
                        if (class89.field2324 != 0) {
                            try {
                                class122 var5 = new class122(4);
                                var5.method916(-2, 4);
                                var5.method916(arg2 ^ 0xFFFFFFFA, class89.field2324);
                                var5.method944((byte) 38, 0);
                                class86.field2186.method639(var5.field3074, 1885, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    class86.field2186.method636(arg2 ^ 0x5);
                                } catch (Exception var6) {
                                }
                                class28.field814++;
                                class86.field2186 = null;
                            }
                        }
                        class38.field999 = 0;
                        class100.field2542 = class115.method856(true);
                        return;
                    }
                    class64.field1578.method230(false, var4);
                    class29.field821.method24(var4.field3345, var4, arg2 ^ 0xFFFFFFDA);
                    class26.field705--;
                    field2099++;
                }
            }
            class86.field2188.method24(var3.field3345, var3, -28);
            class98.field2486--;
            class37.field966++;
        }
    }
}
