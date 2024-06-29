import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class396 {

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public int field5920;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Z")
    public boolean field5913;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
    public boolean field5911;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[S")
    public short[] field5927;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field5924;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5910 = 1337;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lhn;")
    public static class509 field5926 = new class509(109, -1);

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Lak;")
    public static class234 field5930 = new class234("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    private int field5919;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    private int field5922;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    private int field5925;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lqp;")
    public class470 field5918;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I", line = 8)
    public static final int method2493(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        if (arg0 != 66) {
            return 73;
        }
        field5915++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 37)
    public static void method2494(byte arg0) {
        if (arg0 != -109) {
            field5910 = 104;
        }
        field5926 = null;
        field5930 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 51)
    public final void method2495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5919 = arg3;
        this.field5925 = arg2;
        this.field5922 = arg0;
        this.field5916 = arg4;
        if (arg1 != 0) {
            this.field5916 = 31;
        }
        field5921++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V", line = 66)
    public final void method2496(int arg0, boolean arg1, int arg2) {
        field5912++;
        if (arg0 != -32695) {
            method2497(32, -42, 107, -60, -41, 82);
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field5919 * arg2 / 50 + this.field5929 & 0x7FF;
            int var6 = this.field5916;
            if (var6 == 1) {
                var4 = (class281.field4278[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class446.field6543[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field5918.method791(1024, (float) ((this.field5922 * var4 >> 11) + this.field5925) / 2048.0F);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V", line = 147)
    public static final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 86) {
            field5910 = 6;
        }
        field5914++;
        if (class433.field6414 < arg1 || class404.field5987 > arg3) {
            return;
        }
        boolean var6;
        if (arg5 < class327.field4931) {
            var6 = false;
            arg5 = class327.field4931;
        } else if (arg5 > class184.field2777) {
            arg5 = class184.field2777;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg4 < class327.field4931) {
            arg4 = class327.field4931;
            var7 = false;
        } else if (class184.field2777 >= arg4) {
            var7 = true;
        } else {
            var7 = false;
            arg4 = class184.field2777;
        }
        if (class404.field5987 > arg1) {
            arg1 = class404.field5987;
        } else {
            class359.method2255((byte) -122, class416.field6200[arg1++], arg4, arg5, arg0);
        }
        if (class433.field6414 < arg3) {
            arg3 = class433.field6414;
        } else {
            class359.method2255((byte) -107, class416.field6200[arg3--], arg4, arg5, arg0);
        }
        if (var6 && var7) {
            for (int var8 = arg1; var8 <= arg3; var8++) {
                int[] var9 = class416.field6200[var8];
                var9[arg5] = var9[arg4] = arg0;
            }
        } else if (var6) {
            for (int var11 = arg1; var11 <= arg3; var11++) {
                class416.field6200[var11][arg5] = arg0;
            }
        } else if (var7) {
            for (int var10 = arg1; var10 <= arg3; var10++) {
                class416.field6200[var10][arg4] = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 252)
    private final void method2498(byte arg0) {
        int var2 = this.field5924;
        if (var2 == 2) {
            this.field5925 = 0;
            this.field5919 = 2048;
            this.field5916 = 1;
            this.field5922 = 2048;
        } else if (var2 == 3) {
            this.field5922 = 2048;
            this.field5916 = 1;
            this.field5925 = 0;
            this.field5919 = 4096;
        } else if (var2 == 4) {
            this.field5922 = 2048;
            this.field5916 = 4;
            this.field5925 = 0;
            this.field5919 = 2048;
        } else if (var2 == 5) {
            this.field5922 = 2048;
            this.field5919 = 8192;
            this.field5925 = 0;
            this.field5916 = 4;
        } else if (var2 == 12) {
            this.field5916 = 2;
            this.field5925 = 0;
            this.field5919 = 2048;
            this.field5922 = 2048;
        } else if (var2 == 13) {
            this.field5925 = 0;
            this.field5922 = 2048;
            this.field5919 = 8192;
            this.field5916 = 2;
        } else if (var2 == 10) {
            this.field5916 = 3;
            this.field5922 = 512;
            this.field5919 = 2048;
            this.field5925 = 1536;
        } else if (var2 == 11) {
            this.field5922 = 512;
            this.field5925 = 1536;
            this.field5919 = 4096;
            this.field5916 = 3;
        } else if (var2 == 6) {
            this.field5916 = 3;
            this.field5919 = 2048;
            this.field5925 = 1280;
            this.field5922 = 768;
        } else if (var2 == 7) {
            this.field5925 = 1280;
            this.field5922 = 768;
            this.field5919 = 4096;
            this.field5916 = 3;
        } else if (var2 == 8) {
            this.field5922 = 1024;
            this.field5919 = 2048;
            this.field5925 = 1024;
            this.field5916 = 3;
        } else if (var2 == 9) {
            this.field5919 = 4096;
            this.field5925 = 1024;
            this.field5916 = 3;
            this.field5922 = 1024;
        } else if (var2 == 14) {
            this.field5925 = 1280;
            this.field5919 = 2048;
            this.field5916 = 1;
            this.field5922 = 768;
        } else if (var2 == 15) {
            this.field5922 = 512;
            this.field5916 = 1;
            this.field5925 = 1536;
            this.field5919 = 4096;
        } else if (var2 == 16) {
            this.field5916 = 1;
            this.field5919 = 8192;
            this.field5922 = 256;
            this.field5925 = 1792;
        } else {
            this.field5922 = 2048;
            this.field5916 = 0;
            this.field5919 = 2048;
            this.field5925 = 0;
        }
        if (arg0 < -119) {
            field5917++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILya;)V", line = 446)
    private final void method2499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6) {
        field5931++;
        this.field5918 = arg6.method322(arg5, arg4, arg3, arg0, arg2, (float) arg1);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 460)
    protected class396() {
        if (class446.field6543 == null) {
            class167.method1120((byte) 57);
        }
        this.method2498((byte) -125);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lya;Lhp;I)V", line = 474)
    public class396(class38 arg0, class217 arg1, int arg2) {
        if (class446.field6543 == null) {
            class167.method1120((byte) 57);
        }
        this.field5920 = arg1.method1515((byte) 122);
        this.field5913 = (this.field5920 & 0x10) != 0;
        this.field5911 = (this.field5920 & 0x8) != 0;
        this.field5920 &= 0x7;
        int var4 = arg1.method1511(88) << arg2;
        int var5 = arg1.method1511(108) << arg2;
        int var6 = arg1.method1511(-64) << arg2;
        int var7 = arg1.method1515((byte) 126);
        int var8 = var7 * 2 + 1;
        this.field5927 = new short[var8];
        for (int var9 = 0; var9 < this.field5927.length; var9++) {
            short var13 = (short) arg1.method1511(-37);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field5927[var9] = (short) class264.method1763(var15, var14 << 8);
        }
        int var10 = (var7 << class163.field2415) + class5.field63;
        int var11 = class312.field4694 == null ? class390.field5846[class186.method1236(false, arg1.method1511(-116)) & 0xFFFF] : class312.field4694[arg1.method1511(-44)];
        int var12 = arg1.method1515((byte) 125);
        this.field5924 = var12 & 0x1F;
        this.field5929 = (var12 & 0xE0) << 3;
        if (this.field5924 != 31) {
            this.method2498((byte) -124);
        }
        this.method2499(var10, 1, var11, var5, var6, var4, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILjava/lang/String;)V", line = 534)
    public static final void method2500(int arg0, int arg1, String arg2) {
        field5923++;
        class211 var3 = class452.method2749(3, -126, arg1);
        var3.method1463(arg0 + 5);
        var3.field3445 = arg2;
        if (arg0 != -5) {
            method2494((byte) 24);
        }
    }
}
