import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class43 {

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[I")
    private int[] field849 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Z")
    public boolean field851 = false;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Ldd;")
    public static class132 field838 = new class132();

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "[I")
    public static int[] field852 = new int[100];

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "J")
    public static volatile long field856 = 0L;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lc;")
    public static class105 field854 = new class105(16);

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lpk;")
    public static class99 field837;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[S")
    private short[] field839;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[S")
    private short[] field840;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[S")
    private short[] field844;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[S")
    private short[] field846;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[[[B")
    public static byte[][][] field855;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpk;I)Z")
    public static final boolean method324(class99 arg0, int arg1) {
        field836++;
        if (arg0.method723(class54.field1019, true)) {
            return true;
        } else {
            return arg1 != 2287;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lv;Z)V")
    public final void method325(class149 arg0, boolean arg1) {
        if (arg1) {
            this.field846 = null;
        }
        field850++;
        while (true) {
            int var3 = arg0.method1045((byte) -38);
            if (var3 == 0) {
                return;
            }
            this.method331(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z")
    public static final boolean method326(int arg0, int arg1) {
        if (arg0 != -71) {
            field837 = null;
        }
        field845++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lgl;")
    public final class210 method327(byte arg0) {
        field835++;
        if (arg0 != -80) {
            field838 = null;
        }
        class210[] var2 = new class210[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field849[var4] != -1) {
                var2[var3++] = class210.method1488(class107.field1901, this.field849[var4], 0);
            }
        }
        class210 var5 = new class210(var2, var3);
        if (this.field846 != null) {
            for (int var6 = 0; var6 < this.field846.length; var6++) {
                var5.method1485(this.field846[var6], this.field839[var6]);
            }
        }
        if (this.field844 != null) {
            for (int var7 = 0; var7 < this.field844.length; var7++) {
                var5.method1503(this.field844[var7], this.field840[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Z")
    public final boolean method328(int arg0) {
        field848++;
        boolean var2 = true;
        if (arg0 < 119) {
            field837 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field849[var3] != -1 && !class107.field1901.method732(0, this.field849[var3], -9523)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
    public final boolean method329(int arg0) {
        field841++;
        if (this.field853 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field853.length; var3++) {
            if (!class107.field1901.method732(0, this.field853[var3], arg0 ^ 0x61C3)) {
                var2 = false;
            }
        }
        if (arg0 != -17650) {
            field855 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Lgl;")
    public final class210 method330(int arg0) {
        field847++;
        if (this.field853 == null) {
            return null;
        }
        if (arg0 >= -50) {
            this.method329(114);
        }
        class210[] var2 = new class210[this.field853.length];
        for (int var3 = 0; var3 < this.field853.length; var3++) {
            var2[var3] = class210.method1488(class107.field1901, this.field853[var3], 0);
        }
        class210 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class210(var2, var2.length);
        }
        if (this.field846 != null) {
            for (int var5 = 0; var5 < this.field846.length; var5++) {
                var4.method1485(this.field846[var5], this.field839[var5]);
            }
        }
        if (this.field844 != null) {
            for (int var6 = 0; var6 < this.field844.length; var6++) {
                var4.method1503(this.field844[var6], this.field840[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILv;Z)V")
    private final void method331(int arg0, class149 arg1, boolean arg2) {
        field843++;
        if (!arg2) {
            this.field844 = null;
        }
        if (arg0 == 1) {
            this.field842 = arg1.method1045((byte) -54);
        } else if (arg0 == 2) {
            int var8 = arg1.method1045((byte) -28);
            this.field853 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field853[var9] = arg1.method1050(1272006568);
            }
        } else if (arg0 == 3) {
            this.field851 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1045((byte) -83);
            this.field846 = new short[var6];
            this.field839 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field846[var7] = (short) arg1.method1050(1272006568);
                this.field839[var7] = (short) arg1.method1050(1272006568);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1045((byte) -123);
            this.field844 = new short[var4];
            this.field840 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field844[var5] = (short) arg1.method1050(1272006568);
                this.field840[var5] = (short) arg1.method1050(1272006568);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field849[arg0 - 60] = arg1.method1050(1272006568);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method332(boolean arg0) {
        field855 = null;
        field854 = null;
        field837 = null;
        if (arg0) {
            method326(104, -38);
        }
        field838 = null;
        field852 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
    public static final void method333(byte arg0, int arg1) {
        if (arg0 <= -108) {
            class90 var2 = class221.method1575(9, arg1, 1651481952);
            var2.method651(-27655);
            field834++;
        }
    }
}
