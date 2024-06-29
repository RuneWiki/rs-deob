import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class178 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public static int[] field2960 = new int[14];

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field2961 = -1;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Z")
    public static boolean field2963 = false;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lak;")
    public static class172 field2962;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1334(int arg0) {
        field2967++;
        if (arg0 < 103) {
            field2965 = 42;
        }
        return class24.field327.method701(117);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Ljava/lang/String;", line = 18)
    public static final String method1335(int arg0, int arg1, int arg2) {
        field2959++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < arg1) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z", line = 61)
    public static final boolean method1336(int arg0) {
        if (arg0 >= -9) {
            field2963 = true;
        }
        field2964++;
        try {
            if (class286.field4586 == 2) {
                if (class146.field2272 == null) {
                    class146.field2272 = class162.method1145(class325.field5040, class67.field962, class274.field4416);
                    if (class146.field2272 == null) {
                        return false;
                    }
                }
                if (class14.field156 == null) {
                    class14.field156 = new class333(class246.field3878, class65.field941);
                }
                if (class211.field3459.method871(class14.field156, class146.field2272, 22050, class253.field4040, -59)) {
                    class211.field3459.method854((byte) -82);
                    class211.field3459.method852(-16257, class291.field4652);
                    class211.field3459.method856(class100.field1466, 114, class146.field2272);
                    class14.field156 = null;
                    class325.field5040 = null;
                    class286.field4586 = 0;
                    class146.field2272 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class211.field3459.method857(25544);
            class286.field4586 = 0;
            class14.field156 = null;
            class325.field5040 = null;
            class146.field2272 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V", line = 113)
    public static final void method1337(int arg0, int arg1, int arg2) {
        class116.field1768 = true;
        class83.field1171 = arg0;
        class15.field168 = arg1;
        class21.field305 = arg2;
        class291.field4650 = -1;
        class263.field4213 = -1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 125)
    public static void method1338(byte arg0) {
        if (arg0 >= 36) {
            field2962 = null;
            field2960 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIIIZZJZI)V", line = 136)
    public static final void method1339(String arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, long arg8, boolean arg9, int arg10) {
        field2966++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class44 var14 = new class44(128);
        var14.method257(-2, 10);
        var14.method287(0, (arg2 ? 2 : 0) | (arg9 ? 1 : 0) | (arg7 ? 4 : 0));
        var14.method255(arg6, arg8);
        var14.method283((byte) -51, var12[0]);
        var14.method231(23573, arg1);
        var14.method283((byte) -51, var12[1]);
        var14.method287(0, class44.field594);
        var14.method257(-2, arg10);
        var14.method257(-2, arg4);
        var14.method283((byte) -51, var12[2]);
        var14.method287(0, arg3);
        var14.method287(0, arg5);
        var14.method283((byte) -51, var12[3]);
        var14.method222((byte) 38, class151.field2330, class280.field4514);
        class44 var15 = new class44(350);
        var15.method231(23573, arg0);
        int var16 = 8 - (class77.method527((byte) -32, arg0) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method257(-2, (int) (Math.random() * 255.0D));
        }
        var15.method241(var12, -2);
        class194.field3175.field586 = 0;
        class194.field3175.method257(-2, 22);
        class194.field3175.method287(0, var14.field586 + var15.field586 + 2);
        class194.field3175.method287(0, 540);
        class194.field3175.method244(var14.field586, (byte) 112, var14.field573, 0);
        class194.field3175.method244(var15.field586, (byte) 114, var15.field573, 0);
        class31.field416 = -3;
        class149.field2318 = 1;
        class215.field3507 = 0;
        class25.field342 = 0;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(III)Lv;", line = 193)
    public static final class113 method1340(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null || var3.field3347 == null ? null : var3.field3347;
    }
}
