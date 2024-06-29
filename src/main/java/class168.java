import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class168 extends class197 {

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field2841 = 1024;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field2845 = 3072;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    private int field2853 = 2048;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Loh;")
    public static class258 field2842 = class153.method1046("Loaded world list data", 104);

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "[I")
    public static int[] field2850 = new int[1000];

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "Loh;")
    public static class258 field2852 = class153.method1046("Liste der Welten geladen", 98);

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Loh;")
    private static class258 field2848 = class153.method1046("Loaded update list", 89);

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Loh;")
    public static class258 field2840 = field2848;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "Z")
    public static boolean field2854 = false;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Z")
    public static boolean field2855 = false;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "[Lvi;")
    public static class129[] field2844;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 10)
    public class168() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I", line = 19)
    public final int[][] method101(int arg0, byte arg1) {
        field2846++;
        int var3 = -55 / ((arg1 - 1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var5 = this.method1322(0, arg0, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class190.field3362; var12++) {
                var8[var12] = this.field2841 + (var7[var12] * this.field2853 >> 12);
                var10[var12] = this.field2841 + (var6[var12] * this.field2853 >> 12);
                var11[var12] = (var9[var12] * this.field2853 >> 12) + this.field2841;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILgb;I)[Lkl;", line = 67)
    public static final class65[] method1112(int arg0, int arg1, class213 arg2, int arg3) {
        field2856++;
        return class162.method1086(arg3, arg2, arg0, arg1) ? class145.method994(122) : null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLme;)V", line = 79)
    public static final void method1113(byte arg0, class295 arg1) {
        class151.field2557 = 3;
        class16.method106(true, (byte) -89);
        class173.field3101 = true;
        class186.field3307 = 127;
        class250.field4312 = 2;
        class317.field5345 = 127;
        class4.field62 = true;
        class244.field4233 = 255;
        class259.field4501 = 0;
        class61.field1022 = 0;
        class57.field896 = true;
        field2847++;
        class90.field1587 = true;
        class146.field2477 = true;
        class99.field1758 = 0;
        class239.field4171 = 0;
        class197.field3463 = true;
        class45.field672 = true;
        class20.field239 = true;
        class119.field2110 = true;
        class242.field4196 = false;
        class50.field743 = true;
        class222 var2 = null;
        class58.field917 = 0;
        class271.field4697 = true;
        try {
            if (arg0 <= 125) {
                return;
            }
            class116 var3 = arg1.method2069(0, "runescape");
            while (var3.field2067 == 0) {
                class237.method1628((byte) -88, 1L);
            }
            if (var3.field2067 == 1) {
                var2 = (class222) var3.field2063;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1505(0)];
                while (var5.length > var4) {
                    int var6 = var2.method1500(var5, var4, false, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class224.method1509(new class235(var5), true);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1501(true);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 154)
    public final void method223(int arg0) {
        if (arg0 != 11135) {
            this.method98(28, (class235) null, -118);
        }
        this.field2853 = this.field2845 - this.field2841;
        field2849++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 175)
    public final int[] method96(int arg0, int arg1) {
        field2843++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -120, arg1);
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                var3[var5] = (var4[var5] * this.field2853 >> 12) + this.field2841;
            }
        }
        if (arg0 != -16221) {
            method1112(50, -105, (class213) null, 59);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILva;I)V", line = 206)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field2842 = (class258) null;
        }
        if (arg2 == 0) {
            this.field2841 = arg1.method1615(-124);
        } else if (arg2 == 1) {
            this.field2845 = arg1.method1615(-123);
        } else if (arg2 == 2) {
            this.field3462 = arg1.method1589(74) == 1;
        }
        field2851++;
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(B)V", line = 258)
    public static void method1114(byte arg0) {
        if (arg0 != -73) {
            field2848 = (class258) null;
        }
        field2840 = null;
        field2842 = null;
        field2848 = null;
        field2850 = null;
        field2852 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBIII)V", line = 299)
    public static final void method1115(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2839++;
        if (arg0 < arg2) {
            class19.method126(7, arg3, class154.field2638[arg4], arg0, arg2);
        } else {
            class19.method126(arg1 - 5, arg3, class154.field2638[arg4], arg2, arg0);
        }
        if (arg1 != 12) {
            method1115(-121, (byte) -73, 105, -43, 65);
        }
    }
}
