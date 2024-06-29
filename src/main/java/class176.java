import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class176 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lne;")
    public static class235 field2833 = new class235(64);

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[Lwm;")
    public static class152[] field2838 = new class152[200];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
    public static boolean field2836 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lah;")
    public static class205 field2837;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 6)
    public static void method1173(int arg0) {
        field2833 = null;
        field2838 = null;
        field2837 = null;
        int var1 = 56 / ((-arg0 - 59) / 40);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1174(int arg0) {
        if (arg0 != 0) {
            field2841 = 39;
        }
        if (class236.field3866 != null) {
            class253 var1 = class236.field3866;
            synchronized (class236.field3866) {
                class236.field3866 = null;
            }
        }
        field2835++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 43)
    public static final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class112.field1595 * 128) {
            arg0 = class112.field1595 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class97.field1394 * 128) {
            arg2 = class97.field1394 * 128 - 1;
        }
        class74.field1075 = class181.field2884[arg3];
        class25.field430 = class181.field2886[arg3];
        class184.field2924 = class181.field2884[arg4];
        class219.field3559 = class181.field2886[arg4];
        class27.field460 = arg0;
        class3.field54 = arg1;
        class239.field3916 = arg2;
        class84.field1162 = arg0 / 128;
        class202.field3259 = arg2 / 128;
        class195.field3130 = class84.field1162 - class245.field4087;
        if (class195.field3130 < 0) {
            class195.field3130 = 0;
        }
        class237.field3878 = class202.field3259 - class245.field4087;
        if (class237.field3878 < 0) {
            class237.field3878 = 0;
        }
        class134.field2068 = class84.field1162 + class245.field4087;
        if (class134.field2068 > class112.field1595) {
            class134.field2068 = class112.field1595;
        }
        class314.field5445 = class245.field4087 + class202.field3259;
        if (class314.field5445 > class97.field1394) {
            class314.field5445 = class97.field1394;
        }
        short var15;
        if (class217.field3516) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class245.field4087 + class245.field4087 + 2; var16++) {
            for (int var17 = 0; var17 < class245.field4087 + class245.field4087 + 2; var17++) {
                int var18 = (var16 - class245.field4087 << 7) - (class27.field460 & 0x7F);
                int var19 = (var17 - class245.field4087 << 7) - (class239.field3916 & 0x7F);
                int var20 = class84.field1162 + var16 - class245.field4087;
                int var21 = class202.field3259 + var17 - class245.field4087;
                if (var20 >= 0 && var21 >= 0 && var20 < class112.field1595 && var21 < class97.field1394) {
                    int var22;
                    if (class231.field3779 == null) {
                        var22 = class123.field1728[0][var20][var21] + 128 - class3.field54;
                    } else {
                        var22 = class231.field3779[0][var20][var21] + 128 - class3.field54;
                    }
                    int var23 = class123.field1728[3][var20][var21] - class3.field54 - 1000;
                    class289.field4895[var16][var17] = class80.method531(var18, var23, var22, var19, var15);
                } else {
                    class289.field4895[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class245.field4087 + class245.field4087 + 1; var24++) {
            for (int var25 = 0; var25 < class245.field4087 + class245.field4087 + 1; var25++) {
                class142.field2188[var24][var25] = class289.field4895[var24][var25] || class289.field4895[var24 + 1][var25] || class289.field4895[var24][var25 + 1] || class289.field4895[var24 + 1][var25 + 1];
            }
        }
        class230.field3749 = arg6;
        class140.field2134 = arg7;
        class205.field3349 = arg8;
        class310.field5300 = arg9;
        client.field4360 = arg10;
        class149.method940();
        if (class194.field3102 != null) {
            class159.method1062(true);
            class224.method1545(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class217.field3516) {
                class28.field481 = false;
                class89.method587(0, 0, -42);
                class14.method92((float[]) null);
                class24.method199();
            }
            class159.method1062(false);
        }
        class224.method1545(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
