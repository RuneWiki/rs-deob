import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ljava/lang/String;")
    public String field478;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Z")
    public static final boolean method254(int arg0) {
        if (arg0 < 73) {
            return true;
        }
        field476++;
        if (class167.field2656) {
            try {
                class160.method1116("showVideoAd", class105.field1684.field2620, (byte) -50);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method255(int arg0, int arg1, int arg2) {
        field480++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (arg0 != 8) {
                method258(8, 15, -8, -25, (byte) 84);
            }
            if (var3 > 9) {
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
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)I")
    public static final int method256(int arg0, int arg1, int arg2) {
        int var3 = class39.method346(true, arg0 - 1, arg2 + -1) + class39.method346(true, arg0 - 1, arg2 + 1) + class39.method346(true, arg0 - -1, arg2 + -1) + class39.method346(true, arg0 - -1, arg1 + arg2);
        field475++;
        int var4 = class39.method346(true, arg0, arg2 - 1) + class39.method346(true, arg0, arg2 + 1) - (-class39.method346(true, arg0 + -1, arg2) + -class39.method346(true, arg0 + 1, arg2));
        int var5 = class39.method346(true, arg0, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method257(int arg0) {
        class180.field2827.method472((byte) -63);
        int var1 = 78 % ((80 - arg0) / 35);
        field474++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class2.method28(arg3, arg1, arg3 + arg2, arg1 - -arg0);
        class2.method25(arg3, arg1, arg2, arg0, 0);
        field479++;
        if (class139.field2278 < 100) {
            return;
        }
        if (class255.field4046 == null || class255.field4046.field3873 != arg2 || class255.field4046.field3864 != arg0) {
            class37 var5 = new class37(arg2, arg0);
            class2.method15(var5.field723, arg2, arg0);
            class73.method518(0, arg2, arg0, class1.field17, 0, 0, 0, -117, class210.field3428);
            class255.field4046 = var5;
            class79.field1263.method1580(16043);
        }
        class255.field4046.method314(arg3, arg1);
        int var6 = arg3 + (class143.field2307 * arg2 / class1.field17);
        int var7 = class120.field1958 * arg2 / class1.field17;
        int var8 = arg1 + (class154.field2482 * arg0 / class210.field3428);
        int var9 = class19.field322 * arg0 / class210.field3428;
        int var10 = 16711680;
        if (class111.field1837 == 1) {
            var10 = 16777215;
        }
        class2.method23(var6, var8, var7, var9, var10, 128);
        class2.method24(var6, var8, var7, var9, var10);
        if (arg4 < 73 || class280.field4433 <= 0) {
            return;
        }
        int var11;
        if (class190.field3077 > 10) {
            var11 = 500 - (class190.field3077 * 25);
        } else {
            var11 = class190.field3077 * 25;
        }
        for (class195 var12 = (class195) class143.field2302.method843(-67); var12 != null; var12 = (class195) class143.field2302.method852((byte) 123)) {
            if (class63.field1030 == var12.field3117) {
                int var13 = var12.field3124 * arg2 / class1.field17 + arg3;
                int var14 = var12.field3114 * arg0 / class210.field3428 + arg1;
                class2.method23(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }
}
