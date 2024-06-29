import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class270 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[[[I")
    public static int[][][] field3722 = new int[2][][];

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    public static int[] field3728 = new int[13];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[[B")
    public static byte[][] field3727 = new byte[1000][];

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3730 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1612(byte arg0) {
        field3726++;
        int var1 = 48 % ((58 - arg0) / 55);
        class403.field5918 = 0;
        int var2 = class179.field2631.method2345(2);
        int var3 = class179.field2631.method2346((byte) 43);
        int var4 = class179.field2631.method2317(0);
        boolean var5 = class179.field2631.method2348(-2) == 1;
        class162.method1062((byte) -73, var4);
        int var6 = (class422.field6187 - class179.field2631.field5719) / 16;
        class110.field1649 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class110.field1649[var7][var11] = class179.field2631.method2361((byte) -56);
            }
        }
        class117.field1750 = new int[var6];
        class250.field3463 = new int[var6];
        class80.field1224 = new byte[var6][];
        class110.field1657 = new int[var6];
        class487.field7130 = new int[var6];
        class310.field4218 = new int[var6];
        class318.field4372 = null;
        class411.field6007 = null;
        class322.field4391 = new byte[var6][];
        class526.field7779 = new byte[var6][];
        class11.field165 = new byte[var6][];
        int var8 = 0;
        for (int var9 = (var2 - (class527.field7799 >> 4)) / 8; var9 <= ((var2 + (class527.field7799 >> 4)) / 8); var9++) {
            for (int var10 = (var3 - (class422.field6182 >> 4)) / 8; var10 <= ((class422.field6182 >> 4) + var3) / 8; var10++) {
                class310.field4218[var8] = (var9 << 8) + var10;
                class117.field1750[var8] = class297.field4079.method735(-69, "m" + var9 + "_" + var10);
                class487.field7130[var8] = class297.field4079.method735(-126, "l" + var9 + "_" + var10);
                class250.field3463[var8] = class297.field4079.method735(97, "um" + var9 + "_" + var10);
                class110.field1657[var8] = class297.field4079.method735(125, "ul" + var9 + "_" + var10);
                var8++;
            }
        }
        class484.method2848(false, var3, var2, (byte) 111, var5);
    }

    @OriginalMember(owner = "client!wj", name = "toString", descriptor = "()Ljava/lang/String;", line = 79)
    public final String toString() {
        field3723++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 87)
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3731++;
        for (int var5 = arg4; var5 < class9.field146; var5++) {
            Rectangle var6 = class521.field7729[var5];
            if (var6.x + var6.width > arg2 && arg1 + arg2 > var6.x && var6.y + var6.height > arg3 && var6.y < (arg0 + arg3)) {
                class463.field6801[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 109)
    public static void method1614(byte arg0) {
        if (arg0 != 13) {
            method1613(46, -47, -111, 111, 4);
        }
        field3722 = null;
        field3727 = null;
        field3728 = null;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)I", line = 131)
    public final int method1615(byte arg0) {
        field3729++;
        if (arg0 != 51) {
            this.method1615((byte) 44);
        }
        return this.field3725;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V", line = 148)
    public class270(int arg0, int arg1) {
        this.field3725 = arg0;
        this.field3724 = arg1;
    }
}
