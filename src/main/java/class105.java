import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class105 extends class338 {

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[B")
    public byte[] field1289;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1291 = 0;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Lwm;")
    public static class298 field1296;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "[Llg;")
    public static class20[] field1294;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "[[B")
    public static byte[][] field1293;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 6)
    public static void method560(int arg0) {
        field1293 = null;
        field1294 = null;
        if (arg0 == 0) {
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lfd;Lvm;IZI)V", line = 20)
    public static final void method561(class194 arg0, class322 arg1, int arg2, boolean arg3, int arg4) {
        if (arg0.field2492 == 2) {
            for (int var5 = arg4; var5 <= arg2; var5++) {
                int var6 = arg0.field2473[var5] - 1;
                if (var6 != -1) {
                    if (class171.field2155 == 1 && class6.field57 == var5 && class108.field1325 == arg0.field2502) {
                        boolean var7 = class281.method1657(arg1, 0, (class335) null, -10094, arg0.field2489[var5], arg0.field2466, 2, var6) == null;
                        if (var7) {
                            class359.field5068.method825(71, new class30(var6, arg0.field2489[var5], 2, 0, arg0.field2466, false));
                        }
                    } else {
                        boolean var8 = class281.method1657(arg1, -13623264, (class335) null, -10094, arg0.field2489[var5], arg0.field2466, 1, var6) == null;
                        if (var8) {
                            class359.field5068.method825(63, new class30(var6, arg0.field2489[var5], 1, -13623264, arg0.field2466, false));
                        }
                    }
                }
            }
        } else if (arg0.field2492 == 5) {
            boolean var9 = class281.method1657(arg1, arg0.field2590 | 0xFF000000, arg0.field2515 ? class427.field6264.field2017 : null, -10094, arg0.field2461, arg0.field2466, arg0.field2523, arg0.field2507) == null;
            if (var9) {
                class359.field5068.method825(-82, new class30(arg0.field2507, arg0.field2461, arg0.field2523, -16777216 | arg0.field2590, arg0.field2466, arg0.field2515));
            }
        }
        field1292++;
        if (!arg3) {
            method561((class194) null, (class322) null, -106, true, 92);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V", line = 83)
    public class105(byte[] arg0) {
        this.field1289 = arg0;
    }
}
