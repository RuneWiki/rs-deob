import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class166 {

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "B")
    private byte field2120;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "Lkg;")
    public static class179 field2116 = new class179(57, -1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "[[B")
    public static byte[][] field2121;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method1071(int arg0) {
        field2121 = null;
        field2116 = null;
        int var1 = -56 / ((36 - arg0) / 49);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lma;IIILhd;IJII)V")
    public static final void method1072(class10 arg0, int arg1, int arg2, int arg3, class523 arg4, int arg5, long arg6, int arg7, int arg8) {
        field2109++;
        int var10 = arg2 * arg2 + arg7 * arg7;
        if ((long) var10 > arg6) {
            return;
        }
        int var11 = Math.min(arg4.field7617 / 2, arg4.field7574 / 2);
        if (arg5 != 16383) {
            method1073(-94, -62, (byte) 118, -74);
        }
        if (var10 <= var11 * var11) {
            class284.method1678(arg1, (byte) 86, arg2, arg0, class510.field7366[arg3], arg8, arg7, arg4);
            return;
        }
        var11 -= 10;
        int var12;
        if (class142.field1835 == 4) {
            var12 = (int) class463.field6626 & 0x3FFF;
        } else {
            var12 = (int) class463.field6626 + class309.field3967 & 0x3FFF;
        }
        int var13 = class36.field443[var12];
        int var14 = class36.field478[var12];
        if (class142.field1835 != 4) {
            var13 = var13 * 256 / (class317.field4050 + 256);
            var14 = var14 * 256 / (class317.field4050 + 256);
        }
        int var15 = arg2 * var14 + arg7 * var13 >> 15;
        int var16 = arg7 * var14 - (arg2 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class532.field7820[arg3].method140((float) arg4.field7617 / 2.0F + (float) arg8 + (float) var19, (float) arg4.field7574 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBI)V")
    public static final void method1073(int arg0, int arg1, byte arg2, int arg3) {
        field2114++;
        if (arg2 != 104) {
            field2116 = null;
        }
        class153 var4 = class75.method656(11, 255, arg3);
        var4.method1003((byte) 124);
        var4.field1933 = arg0;
        var4.field1930 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)I")
    public final int method1074(boolean arg0) {
        field2108++;
        if (!arg0) {
            field2121 = null;
        }
        return this.field2120 & 0x7;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)I")
    public final int method1075(boolean arg0) {
        field2111++;
        if (arg0) {
            field2116 = null;
        }
        return (this.field2120 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIII)V")
    public static final void method1076(boolean arg0, int arg1, int arg2, int arg3) {
        field2115++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class94.field1140 = arg1;
        class8.field72 = arg0;
        if (arg2 == 2) {
            class441.field6316 = arg3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class166() {
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lfh;)V")
    public class166(class463 arg0) {
        this.field2120 = arg0.method2793(32767);
        this.field2112 = arg0.method2758((byte) 124);
        this.field2117 = arg0.method2727(-73);
        this.field2119 = arg0.method2727(-119);
        this.field2118 = arg0.method2727(-93);
        this.field2113 = arg0.method2727(-97);
    }
}
