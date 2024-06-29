import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class93 extends class255 {

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
    public static int[] field1295 = new int[32];

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lph;")
    public static class361 field1292;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Lph;")
    public static class361 field1293;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(III)V", line = 5)
    public final void method703(int arg0, int arg1, int arg2) {
        field1300++;
        if (arg2 != 27159) {
            this.method703(-106, 85, -95);
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(III)Z", line = 18)
    public static final boolean method726(int arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            arg2 = 10;
        }
        class261 var3 = class30.method212(0, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        field1305++;
        return var3.method1924(arg2, -50);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V", line = 37)
    public static void method727(byte arg0) {
        field1295 = null;
        field1293 = null;
        field1292 = null;
        if (arg0 > -29) {
            method730(15);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V", line = 60)
    public final void method701(int arg0, int arg1, byte arg2) {
        int var4 = -17 % ((arg2 - 1) / 57);
        field1290++;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 69)
    public static final void method728(int arg0) {
        field1301++;
        if (class126.field1834) {
            return;
        }
        class126.field1834 = true;
        if (class274.field4156) {
            class36.field535 = (float) ((int) class36.field535 - 65 & 0xFFFFFF80);
        } else {
            class257.field3844 += (-24.0F - class257.field3844) / 2.0F;
        }
        if (arg0 == 57) {
            class71.field1010 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(III)I", line = 96)
    public static final int method729(int arg0, int arg1, int arg2) {
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        field1294++;
        int var5 = -126 % ((-arg0 - 37) / 60);
        int var6 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var6 & 0x7F8F5BE) >> 19;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 111)
    public final void method699(int arg0, int arg1, int arg2) {
        field1297++;
        int var4 = this.field1304 * arg2 >> 12;
        int var5 = this.field1303 * arg2 >> 12;
        int var6 = this.field1296 * arg1 >> 12;
        int var7 = this.field1291 * arg1 >> 12;
        class306.method2154(var5, var7, var4, var6, this.field3809, (byte) 115);
        if (arg0 != 16900) {
            method730(126);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 136)
    public static final void method730(int arg0) {
        if (arg0 > 73) {
            field1298++;
            class200.field2941.method458((byte) 120);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIII)V", line = 146)
    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1296 = arg1;
        this.field1304 = arg0;
        this.field1303 = arg2;
        this.field1291 = arg3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BIIII)V", line = 160)
    public static final void method731(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class362.field5742 = -1;
        field1302++;
        class299.field4473 = -1;
        float var5 = (float) class105.field1503 / (float) class105.field1499;
        int var6 = arg2;
        if (arg0 != -33) {
            method727((byte) 81);
        }
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg4 - var7) / 2;
        int var9 = arg1 - (arg2 - var6) / 2;
        class147.field2114 = class105.field1499 * var9 / var6;
        class124.field1810 = class105.field1503 * var8 / var7;
        class259.method1905(arg0 ^ 0x57);
    }
}
