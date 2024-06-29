import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class125 extends class177 {

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    private int field1970 = 4096;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field1974 = 12288;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    private int field1969 = 8192;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private int field1982 = 2048;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field1976 = 2048;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private int field1968 = 0;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Llb;")
    public static class211 field1967;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[I")
    public static int[] field1983;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V", line = 11)
    public static final void method949(int arg0, int arg1, int arg2) {
        class159.field2372.method59(251, (byte) 73);
        field1971++;
        class14.field153++;
        if (arg0 != -4993) {
            field1983 = (int[]) null;
        }
        class159.field2372.method259(-15195, arg1);
        class159.field2372.method263(arg2, (byte) 102);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 29)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 >= -52) {
            return (int[]) null;
        }
        field1978++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -23);
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1] - 2048;
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                int var6 = var4 + this.field1981;
                int var7 = class179.field2684[var5] - 2048;
                int var8 = this.field1982 + var7;
                int var9 = var6 < -2048 ? var6 + 4096 : var6;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = this.field1968 + var7;
                int var12 = var11 < -2048 ? var11 + 4096 : var11;
                int var13 = var8 >= -2048 ? var8 : var8 + 4096;
                int var14 = var13 <= 2048 ? var13 : var13 - 4096;
                int var15 = this.field1976 + var4;
                int var16 = var15 < -2048 ? var15 + 4096 : var15;
                int var17 = var12 > 2048 ? var12 - 4096 : var12;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method952((byte) -91, var10, var14) || this.method950(true, var18, var17) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)Z", line = 80)
    private final boolean method950(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method950(false, -114, 65);
        }
        field1979++;
        int var4 = (arg1 + arg2) * this.field1974 >> 12;
        int var5 = class156.field2345[(var4 * 255 & 0xFF150) >> 12];
        int var6 = (var5 << 12) / this.field1974;
        int var7 = (var6 << 12) / this.field1969;
        int var8 = this.field1970 * var7 >> 12;
        return var8 > (arg1 - arg2) && -var8 < arg1 - arg2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 98)
    public final void method465(int arg0) {
        field1975++;
        class308.method2137(-125);
        int var2 = -127 / ((-arg0 - 6) / 43);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 108)
    public static void method951(int arg0) {
        if (arg0 != 4096) {
            field1983 = (int[]) null;
        }
        field1983 = null;
        field1967 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 124)
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)Z", line = 128)
    private final boolean method952(byte arg0, int arg1, int arg2) {
        if (arg0 > -25) {
            return false;
        }
        field1984++;
        int var4 = (arg1 - arg2) * this.field1974 >> 12;
        int var5 = class156.field2345[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1974;
        int var7 = (var6 << 12) / this.field1969;
        int var8 = this.field1970 * var7 >> 12;
        return arg1 + arg2 < var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhb;II)V", line = 172)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field1977++;
        if (arg2 == 0) {
            this.field1982 = arg0.method300(arg1 - 1394173571);
        } else if (arg2 == 1) {
            this.field1981 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field1968 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field1976 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            this.field1974 = arg0.method300(-1394191632);
        } else if (arg2 == 5) {
            this.field1970 = arg0.method300(-1394191632);
        } else if (arg2 == 6) {
            this.field1969 = arg0.method300(-1394191632);
        }
        if (arg1 != -18061) {
            method949(37, -63, -42);
        }
    }
}
