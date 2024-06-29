import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 extends class170 {

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Z")
    public static boolean field685 = false;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Lmh;")
    public static class128 field688 = class22.method156(124, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lmh;")
    private static class128 field693 = class22.method156(126, "Loading fonts )2 ");

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "Z")
    public static boolean field689 = true;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lmh;")
    public static class128 field698 = class22.method156(123, "::clientdrop");

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "Lmh;")
    public static class128 field695 = field693;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field696 = 0;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[[[B")
    public static byte[][][] field684;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 11)
    public class31() {
        this(0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Lmh;", line = 20)
    public static final class128 method223(int arg0, boolean arg1) {
        field690++;
        if (!arg1) {
            method223(23, false);
        }
        return class28.method177((byte) -90, new class128[] { class257.method1811(arg0 >> 24 & 0xFF, (byte) 21), class188.field3261, class257.method1811(arg0 >> 16 & 0xFF, (byte) 68), class188.field3261, class257.method1811((arg0 & 0xFF8E) >> 8, (byte) -125), class188.field3261, class257.method1811(arg0 & 0xFF, (byte) -126) });
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 30)
    public static final void method224(int arg0) {
        class255.field4392 = arg0;
        for (int var1 = 0; var1 < class297.field5067; var1++) {
            for (int var2 = 0; var2 < class155.field2670; var2++) {
                if (class182.field3184[arg0][var1][var2] == null) {
                    class182.field3184[arg0][var1][var2] = new class150(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)V", line = 56)
    public static void method225(byte arg0) {
        if (arg0 != -47) {
            field693 = (class128) null;
        }
        field695 = null;
        field693 = null;
        field688 = null;
        field698 = null;
        field684 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V", line = 78)
    public static final void method226(int arg0, int arg1, int arg2) {
        field694++;
        class229 var3 = class241.method1638(arg2, -50, arg0);
        var3.method1574(3199);
        var3.field3981 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V", line = 96)
    public static final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field691++;
        int var7 = arg2 + arg1;
        if (arg3 >= -13) {
            return;
        }
        int var8 = arg1 + arg5;
        int var9 = arg6 - arg1;
        for (int var10 = arg2; var10 < var7; var10++) {
            class314.method2138(arg4, true, arg0, class219.field3850[var10], arg5);
        }
        for (int var11 = arg6; var11 > var9; var11--) {
            class314.method2138(arg4, true, arg0, class219.field3850[var11], arg5);
        }
        int var12 = arg4 - arg1;
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class219.field3850[var13];
            class314.method2138(var8, true, arg0, var14, arg5);
            class314.method2138(arg4, true, arg0, var14, var12);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V", line = 139)
    private class31(int arg0) {
        super(0, false);
        this.method228(-122, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I", line = 153)
    public final int[][] method62(int arg0, int arg1) {
        field687++;
        int var3 = -12 / ((arg1 + 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                var7[var8] = this.field699;
                var5[var8] = this.field700;
                var6[var8] = this.field682;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILbg;B)V", line = 209)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.method228(-31, arg1.method1349((byte) 91));
        }
        field692++;
        if (arg2 != 13) {
            field696 = -35;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V", line = 230)
    private final void method228(int arg0, int arg1) {
        field686++;
        this.field700 = arg1 >> 4 & 0xFF0;
        if (arg0 < -21) {
            this.field699 = (arg1 & 0xFF0000) >> 12;
            this.field682 = arg1 & 0xFF << 4;
        }
    }
}
