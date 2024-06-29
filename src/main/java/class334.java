import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class334 extends class71 {

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[[I")
    public static int[][] field4603 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!si", name = "q", descriptor = "J")
    public static long field4605 = 0L;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lbo;")
    public static class435 field4602;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BZILpg;Lpg;)I", line = 8)
    public static final int method2142(byte arg0, boolean arg1, int arg2, class437 arg3, class437 arg4) {
        field4604++;
        if (arg2 == 1) {
            int var5 = arg4.field2647;
            int var6 = arg3.field2647;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class401.method2522(arg3.method2745(true).field4596, 18397, class210.field2935, arg4.method2745(true).field4596);
        } else if (arg2 == 3) {
            if (arg4.field6147.equals("-")) {
                if (arg3.field6147.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field6147.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class401.method2522(arg3.field6147, arg0 + 18311, class210.field2935, arg4.field6147);
            }
        } else if (arg2 == 4) {
            if (arg4.method1244(arg0 - 78)) {
                return arg3.method1244(arg0 - 78) ? 0 : 1;
            } else if (arg3.method1244(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg4.method1250((byte) 17)) {
                return arg3.method1250((byte) 17) ? 0 : 1;
            } else if (arg3.method1250((byte) 17)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg4.method1243(3)) {
                return arg3.method1243(3) ? 0 : 1;
            } else if (arg3.method1243(3)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 7) {
            if (arg0 != 86) {
                field4605 = -90L;
            }
            if (arg2 != 8) {
                return arg4.field6149 - arg3.field6149;
            }
            int var7 = arg4.field6145;
            int var8 = arg3.field6145;
            if (arg1) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else if (arg4.method1247((byte) -56)) {
            return arg3.method1247((byte) -56) ? 0 : 1;
        } else if (arg3.method1247((byte) -56)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 115)
    public static void method2143(int arg0) {
        if (arg0 == 2) {
            field4602 = null;
            field4603 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lnq;ILuo;)V", line = 138)
    public static final void method2144(class268 arg0, int arg1, class345 arg2) {
        field4601++;
        if (class258.field3620) {
            return;
        }
        arg2.method114(0);
        class349.field4805 = arg2.method105(class238.method1614(arg0, class103.field1413), true);
        class349.field4805.method1501((class47.field661 - class349.field4805.method597()) / 2, (class214.field2993 - class349.field4805.method596()) / 2);
        class24.field415 = arg2.method105(class238.method1614(arg0, class299.field4159), true);
        class24.field415.method1501((class47.field661 - class24.field415.method597()) / 2, 18);
        class258.field3620 = true;
        if (arg1 > -97) {
            field4603 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I", line = 157)
    public static final int method2145(boolean arg0) {
        field4606++;
        class345 var1 = class64.field949;
        boolean var2 = arg0;
        if (class326.field4462 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class345.method2183(var3, -119, (class294) null, 0, (class152) null, 0);
        }
        long var4 = class385.method2442(-6631);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method121(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class385.method2442(-6631) - var4);
        var1.method2182(0, 0, 100, -16777216, -65, 100);
        if (var2) {
            var1.method2190(false);
        }
        return var7;
    }
}
