import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class155 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lic;")
    public static class143 field2156 = new class143(64);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Llc;")
    public static class86 field2160 = new class86(64);

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2161 = -1;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method1030(byte arg0) {
        field2160 = null;
        field2156 = null;
        int var1 = 27 % ((12 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static final void method1031(byte arg0) {
        class181.field2533.method546(-90762264);
        if (arg0 <= -77) {
            field2155++;
            class296.field4663.method546(-90762264);
            class179.field2505.method546(-90762264);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg1 >= 0 && arg0 >= 0 && arg1 < 103 && arg0 < 103) {
            if (arg5 == 0) {
                class197 var8 = class43.method288(arg6, arg1, arg0);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2719 >>> 32);
                    if (arg2 == 2) {
                        var8.field2725 = new class123(var9, 2, arg4 + 4, arg6, arg1, arg0, arg3, false, var8.field2725);
                        var8.field2727 = new class123(var9, 2, arg4 + 1 & 0x3, arg6, arg1, arg0, arg3, false, var8.field2727);
                    } else {
                        var8.field2725 = new class123(var9, arg2, arg4, arg6, arg1, arg0, arg3, false, var8.field2725);
                    }
                }
            }
            if (arg5 == 1) {
                class228 var10 = class77.method497(arg6, arg1, arg0);
                if (var10 != null) {
                    int var11 = (int) (var10.field3453 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 == 4 || arg2 == 5) {
                        var10.field3459 = new class123(var11, 4, arg4, arg6, arg1, arg0, arg3, false, var10.field3459);
                    } else if (arg2 == 6) {
                        var10.field3459 = new class123(var11, 4, arg4 + 4, arg6, arg1, arg0, arg3, false, var10.field3459);
                    } else if (arg2 == 7) {
                        var10.field3459 = new class123(var11, 4, (arg4 + 2 & 0x3) + 4, arg6, arg1, arg0, arg3, false, var10.field3459);
                    } else if (arg2 == 8) {
                        var10.field3459 = new class123(var11, 4, arg4 + 4, arg6, arg1, arg0, arg3, false, var10.field3459);
                        var10.field3463 = new class123(var11, 4, (arg4 + 2 & 0x3) + 4, arg6, arg1, arg0, arg3, false, var10.field3463);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 11) {
                    arg2 = 10;
                }
                class198 var12 = class188.method1207(arg6, arg1, arg0);
                if (var12 != null) {
                    var12.field2752 = new class123(Integer.MAX_VALUE & (int) (var12.field2753 >>> 32), arg2, arg4, arg6, arg1, arg0, arg3, false, var12.field2752);
                }
            }
            if (arg5 == 3) {
                class23 var13 = class92.method604(arg6, arg1, arg0);
                if (var13 != null) {
                    var13.field328 = new class123(Integer.MAX_VALUE & (int) (var13.field322 >>> 32), 22, arg4, arg6, arg1, arg0, arg3, false, var13.field328);
                }
            }
        }
        field2154++;
        int var14 = 41 / ((-arg7 - 34) / 63);
    }
}
