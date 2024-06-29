import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class39 extends class139 {

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    private int field879 = 0;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field887 = -32768;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    private int field883 = 0;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Z")
    public boolean field880 = false;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lfa;")
    private class240 field884;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Loh;")
    public static class263 field875 = null;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[B")
    public static byte[] field877 = new byte[32896];

    @OriginalMember(owner = "client!r", name = "E", descriptor = "[I")
    public static int[] field894;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lue;")
    public static class86 field895;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public final int method106() {
        field886++;
        return this.field887;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
    public static final void method245(boolean arg0, int arg1) {
        field890++;
        if (arg1 != 19617) {
            method249((byte) 75);
        }
        byte var2 = 4;
        byte[][] var3 = class233.field4077;
        for (int var4 = 0; var4 < var2; var4++) {
            class61.method371((byte) 77);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class259.field4495[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class128.field2370.length; var13++) {
                                if (class128.field2370[var13] == var12 && var3[var13] != null) {
                                    class230.method1555(var3[var13], var8, var5 * 8, var4, (var10 & 0x7) * 8, arg0, (var11 & 0x7) * 8, 20235, var6 * 8, var9, class103.field1954);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
    public final void method246(int arg0, byte arg1) {
        field881++;
        if (this.field880) {
            return;
        }
        this.field883 += arg0;
        while (this.field884.field4219[this.field879] < this.field883) {
            this.field883 -= this.field884.field4219[this.field879];
            this.field879++;
            if (this.field879 >= this.field884.field4211.length) {
                this.field880 = true;
                break;
            }
        }
        if (arg1 != 60) {
            field875 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field878++;
        class76 var11 = this.method247((byte) 89);
        if (var11 != null) {
            var11.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field887 = var11.method106();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Lph;")
    private final class76 method247(byte arg0) {
        field882++;
        class46 var2 = class46.method296(-95, this.field889);
        if (arg0 != 89) {
            return null;
        }
        class76 var3;
        if (this.field880) {
            var3 = var2.method294(-1, true);
        } else {
            var3 = var2.method294(this.field879, true);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method248(int arg0) {
        field877 = null;
        field894 = null;
        if (arg0 != 0) {
            field875 = null;
        }
        field875 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static final void method249(byte arg0) {
        field874++;
        class164.field2974 = new class21[class24.field683.method574((byte) -122)][];
        if (arg0 < 36) {
            field875 = null;
        }
        class244.field4311 = new boolean[class24.field683.method574((byte) -122)];
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field888 = arg2;
        this.field893 = arg1;
        this.field892 = arg3;
        this.field891 = arg5 + arg6;
        this.field876 = arg4;
        this.field889 = arg0;
        int var8 = class46.method296(-98, this.field889).field987;
        if (var8 == -1) {
            this.field880 = true;
        } else {
            this.field880 = false;
            this.field884 = class186.method1226(12828, var8);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field877[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field894 = new int[] { -1, -1, 1, 1 };
    }
}
