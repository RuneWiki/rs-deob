import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class122 extends class237 {

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "S")
    public static short field1731 = 32767;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lj;")
    public static class209 field1735 = new class209(64);

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
    public static final void method791(int arg0, byte arg1) {
        field1732++;
        if (!class85.field1050) {
            arg0 = -1;
        }
        if (class14.field179 == arg0) {
            return;
        }
        if (arg1 != -13) {
            field1731 = -41;
        }
        if (arg0 != -1) {
            class124 var2 = class235.method1666(true, arg0);
            class227 var3 = var2.method819(31858);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class194.field3107.method270(var3.field721, class221.field3551, new Point(var2.field1931, var2.field1921), var3.method1605(), var3.field717, arg1 ^ 0x68);
                class14.field179 = arg0;
            }
        }
        if (arg0 == -1 && class14.field179 != -1) {
            class194.field3107.method270(-1, class221.field3551, new Point(), (int[]) null, -1, -71);
            class14.field179 = -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;ZLpd;)I")
    public static final int method792(String arg0, boolean arg1, class96 arg2) {
        if (!arg1) {
            return 78;
        }
        field1737++;
        int var3 = arg2.field1228;
        byte[] var4 = class210.method1476(arg0, (byte) 2);
        arg2.method545(19544, var4.length);
        arg2.field1228 += class173.field2743.method628(arg2.field1228, arg2.field1218, var4.length, 0, var4, 8);
        return arg2.field1228 - var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1734++;
        if (arg5 != 523091273) {
            method791(-78, (byte) 36);
        }
        if (class210.method1477((byte) 110, arg1)) {
            class287.method1937(arg8, arg4, arg7, arg0, 39, arg2, class75.field937[arg1], arg6, -1, arg3);
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class21.field279[var9] = true;
            }
        } else {
            class21.field279[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class122() {
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method794(int arg0) {
        if (arg0 < 91) {
            method792((String) null, false, (class96) null);
        }
        field1735 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1736++;
        if (arg0 < 128 || arg7 < 128 || arg0 > 13056 || arg7 > 13056) {
            class165.field2633 = -1;
            class134.field2128 = -1;
            return;
        }
        int var8 = class166.method1148(class244.field4011, arg0, arg7, (byte) -126) - arg1;
        int var9 = var8 - class252.field4114;
        int var10 = class174.field2759[class242.field3986];
        int var11 = arg7 - class36.field465;
        int var12 = arg0 - class74.field932;
        int var13 = class174.field2753[class242.field3986];
        if (arg2 != 64) {
            return;
        }
        int var14 = class174.field2759[class23.field311];
        int var15 = class174.field2753[class23.field311];
        int var16 = var11 * var15 + var12 * var14 >> 16;
        int var17 = var11 * var14 - var12 * var15 >> 16;
        int var19 = var9 * var10 - (var13 * var17) >> 16;
        int var20 = var9 * var13 + var10 * var17 >> 16;
        if (var20 >= 50) {
            class134.field2128 = arg5 + ((var16 << 9) / var20);
            class165.field2633 = (var19 << 9) / var20 + arg4;
        } else {
            class134.field2128 = -1;
            class165.field2633 = -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        this.field1733 = arg0;
    }
}
