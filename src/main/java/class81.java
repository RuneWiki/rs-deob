import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 implements class284 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Z")
    public static boolean field1174 = false;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[J")
    public static long[] field1177 = new long[100];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lcc;")
    public static class216 field1171 = new class216(50);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Llc;")
    public static class86 field1173;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
    public final String method590(int arg0, int arg1, int[] arg2, long arg3) {
        field1176++;
        if (arg0 == 0) {
            class49 var6 = class93.method733(arg2[0], (byte) -47);
            return var6.method381((int) arg3, 82);
        } else if (arg0 == 1 || arg0 == 10) {
            class62 var7 = class254.method1800((int) arg3, 15017);
            return var7.field910;
        } else if (arg1 == 50) {
            return arg0 == 6 || arg0 == 7 || arg0 == 11 ? class93.method733(arg2[0], (byte) -47).method381((int) arg3, 82) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method591(int arg0) {
        field1177 = null;
        field1171 = null;
        field1173 = null;
        int var1 = -125 % ((-arg0 - 16) / 41);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
    public static final void method592(int arg0, boolean arg1) {
        if (arg1) {
            class201 var2 = class94.method738(-86, arg0, 8);
            var2.method1475(-743577184);
            field1178++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method593(byte arg0) {
        class50.field732.method563(-99);
        int var1 = class50.field732.method554(1, -90);
        field1179++;
        if (arg0 > -92) {
            field1173 = null;
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class50.field732.method554(2, -41);
        if (var2 == 0) {
            class188.field3045[class121.field1773++] = 2047;
        } else if (var2 == 1) {
            int var3 = class50.field732.method554(3, -47);
            class186.field2993.method924(1, true, var3);
            int var4 = class50.field732.method554(1, -48);
            if (var4 == 1) {
                class188.field3045[class121.field1773++] = 2047;
            }
        } else if (var2 == 2) {
            if (class50.field732.method554(1, -95) == 1) {
                int var5 = class50.field732.method554(3, -42);
                class186.field2993.method924(2, true, var5);
                int var6 = class50.field732.method554(3, -57);
                class186.field2993.method924(2, true, var6);
            } else {
                int var7 = class50.field732.method554(3, -93);
                class186.field2993.method924(0, true, var7);
            }
            int var8 = class50.field732.method554(1, -80);
            if (var8 == 1) {
                class188.field3045[class121.field1773++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class50.field732.method554(1, -45);
            if (var9 == 1) {
                class188.field3045[class121.field1773++] = 2047;
            }
            int var10 = class50.field732.method554(1, -53);
            class58.field826 = class50.field732.method554(2, -66);
            int var11 = class50.field732.method554(7, -72);
            int var12 = class50.field732.method554(7, -94);
            class186.field2993.method204(false, var12, var10 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lil;")
    public static final class165 method594(int arg0, int arg1) {
        class165 var2 = (class165) class286.field4534.method1553((long) arg0, (byte) -113);
        field1175++;
        if (var2 != null) {
            return var2;
        }
        class165 var3 = class24.method175(class39.field555, arg1 + 120, arg0, class222.field3553, false);
        if (var3 != null) {
            class286.field4534.method1551(var3, 0, (long) arg0);
        }
        if (arg1 != 3) {
            method595(-78, (String[]) null, (short[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method595(int arg0, String[] arg1, short[] arg2) {
        class110.method810(0, 0, arg2, arg1, arg1.length - 1);
        field1172++;
        if (arg0 != 14366) {
            method591(110);
        }
    }
}
