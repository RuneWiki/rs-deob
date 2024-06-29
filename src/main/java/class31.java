import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class31 {

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    private int field518 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[Lua;")
    public class73[] field514;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[I")
    public static int[] field504 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lli;")
    public static class185 field506 = null;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "J")
    private long field502;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lua;")
    private class73 field511;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "Lua;")
    private class73 field521;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Z")
    public static boolean field513;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "[Ldd;")
    public static class211[] field519;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[[I")
    public static int[][] field510;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static final void method187(boolean arg0) {
        field517++;
        class184.field3387.method86(0);
        class204.field3726.method86(0);
        class256.field4528.method86(0);
        if (arg0) {
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILpa;IZII)V")
    public static final void method188(int arg0, class2 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field520++;
        if (class185.field3453 >= 50 || arg1.field56 == null || arg4 >= arg1.field56.length || arg1.field56[arg4] == null) {
            return;
        }
        int var6 = arg1.field56[arg4][0];
        int var7 = var6 & 0xF;
        int var8 = var6 >> 8;
        int var9 = var6 >> 4 & 0x7;
        if (arg1.field56[arg4].length > 1) {
            int var10 = (int) ((double) arg1.field56[arg4].length * Math.random());
            if (var10 > 0) {
                var8 = arg1.field56[arg4][var10];
            }
        }
        if (var7 == 0) {
            if (arg3) {
                class37.method234((byte) -112, var9, var8, 0);
            }
        } else if (~class280.field4965 != arg0) {
            class46.field743[class185.field3453] = var8;
            class161.field3040[class185.field3453] = var9;
            class209.field3822[class185.field3453] = 0;
            class23.field385[class185.field3453] = null;
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg2 - 64) / 128;
            class174.field3180[class185.field3453] = (var11 << 16) + (var12 << 8) + var7;
            class185.field3453++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Lua;")
    public final class73 method189(int arg0) {
        field503++;
        if (this.field518 > 0 && this.field514[this.field518 - 1] != this.field521) {
            class73 var2 = this.field521;
            this.field521 = var2.field1269;
            return var2;
        }
        while (this.field508 > this.field518) {
            class73 var3 = this.field514[this.field518++].field1269;
            if (this.field514[this.field518 - 1] != var3) {
                this.field521 = var3.field1269;
                return var3;
            }
        }
        if (arg0 != 0) {
            this.field502 = 95L;
        }
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lua;BJ)V")
    public final void method190(class73 arg0, byte arg1, long arg2) {
        field516++;
        if (arg0.field1273 != null) {
            arg0.method476(-66);
        }
        class73 var5 = this.field514[(int) (arg2 & (long) (this.field508 - 1))];
        arg0.field1278 = arg2;
        arg0.field1273 = var5.field1273;
        arg0.field1269 = var5;
        arg0.field1273.field1269 = arg0;
        arg0.field1269.field1273 = arg0;
        if (arg1 >= -80) {
            field504 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
    public final int method191(int arg0) {
        int var2 = 0;
        field509++;
        for (int var3 = arg0; var3 < this.field508; var3++) {
            class73 var4 = this.field514[var3];
            for (class73 var5 = var4.field1269; var5 != var4; var5 = var5.field1269) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Lua;")
    public final class73 method192(int arg0) {
        field515++;
        this.field518 = 0;
        return arg0 < 97 ? null : this.method189(0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I")
    public final int method193(byte arg0) {
        field505++;
        if (arg0 != 38) {
            this.field521 = null;
        }
        return this.field508;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public final void method194(int arg0) {
        field501++;
        for (int var2 = 0; var2 < this.field508; var2++) {
            class73 var3 = this.field514[var2];
            while (true) {
                class73 var4 = var3.field1269;
                if (var3 == var4) {
                    break;
                }
                var4.method476(-102);
            }
        }
        if (arg0 != 1123) {
            this.method195(-104, -28L);
        }
        this.field521 = null;
        this.field511 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJ)Lua;")
    public final class73 method195(int arg0, long arg1) {
        field507++;
        this.field502 = arg1;
        class73 var4 = this.field514[(int) (arg1 & (long) (this.field508 - 1))];
        if (arg0 < 22) {
            this.method193((byte) 94);
        }
        for (this.field511 = var4.field1269; this.field511 != var4; this.field511 = this.field511.field1269) {
            if (this.field511.field1278 == arg1) {
                class73 var5 = this.field511;
                this.field511 = this.field511.field1269;
                return var5;
            }
        }
        this.field511 = null;
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
    public static void method196(boolean arg0) {
        field510 = null;
        field506 = null;
        field519 = null;
        if (arg0) {
            field513 = false;
        }
        field504 = null;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Lua;")
    public final class73 method197(int arg0) {
        int var2 = -46 % ((60 - arg0) / 46);
        field512++;
        if (this.field511 == null) {
            return null;
        }
        class73 var3 = this.field514[(int) ((long) (this.field508 - 1) & this.field502)];
        while (this.field511 != var3) {
            if (this.field511.field1278 == this.field502) {
                class73 var4 = this.field511;
                this.field511 = this.field511.field1269;
                return var4;
            }
            this.field511 = this.field511.field1269;
        }
        this.field511 = null;
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        this.field508 = arg0;
        this.field514 = new class73[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class73 var3 = this.field514[var2] = new class73();
            var3.field1269 = var3;
            var3.field1273 = var3;
        }
    }
}
