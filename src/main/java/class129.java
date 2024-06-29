import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class129 extends class7 {

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    private int field2026 = -32768;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
    public static int[] field2016 = new int[256];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Z")
    public static volatile boolean field2013 = false;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Lak;")
    public static class172 field2023;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lbf;")
    public static class58 field2022;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[[B")
    public static byte[][] field2017;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[[[B")
    public static byte[][][] field2018;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[[[B")
    public static byte[][][] field2025;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)J", line = 4)
    public static final long method933(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3360; var4++) {
            class153 var5 = var3.field3343[var4];
            if ((var5.field2358 >> 29 & 0x3L) == 2L && var5.field2371 == arg1 && var5.field2366 == arg2) {
                return var5.field2358;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 35)
    public static void method934(int arg0) {
        field2025 = (byte[][][]) null;
        field2022 = null;
        if (arg0 != 3194) {
            field2015 = 23;
        }
        field2017 = (byte[][]) null;
        field2018 = (byte[][][]) null;
        field2023 = null;
        field2016 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 56)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        field2027++;
        class262 var13 = class285.method2054(this.field2020, 0).method2318((class106) null, 0, (class202) null, 0, this.field2021, -1, (byte) 39);
        if (var13 != null) {
            var13.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2026 = var13.method33();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V", line = 76)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2024++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Ljava/lang/String;", line = 90)
    public static final String method935(int arg0, int arg1) {
        field2028++;
        if (arg1 != 2017) {
            field2018 = (byte[][][]) ((byte[][][]) null);
        }
        return class157.field2458[arg0].length() <= 0 ? class168.field2777[arg0] : class168.field2777[arg0] + class343.field5332 + class157.field2458[arg0];
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 105)
    public final int method33() {
        field2019++;
        return this.field2026;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 122)
    public static final void method936(int arg0) {
        field2029++;
        if (arg0 > -44) {
            method935(-124, -6);
        }
        class33.field449.method707(0);
    }
}
