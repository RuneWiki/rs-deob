import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class198 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    public static int[] field3859 = new int[100];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ltg;")
    public static class184 field3861 = class135.method812(")4lang)4de", 3);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[I")
    public static int[] field3867 = new int[50];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lvb;")
    public static class197 field3863;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Z")
    public static boolean field3862;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILgh;II)V")
    public static final void method1274(int arg0, int arg1, class67 arg2, int arg3, int arg4) {
        field3866++;
        if (class46.field872 == arg2 || class133.field2404 >= 400) {
            return;
        }
        class184 var5;
        if (arg2.field1298 == 0) {
            var5 = class144.method884(0, new class184[] { arg2.field1299, class98.method617((byte) -75, arg2.field1282, class46.field872.field1282), client.field500, class157.field2812, class170.method1060(arg2.field1282, -113), class41.field782 });
        } else {
            var5 = class144.method884(0, new class184[] { arg2.field1299, client.field500, class72.field1354, class170.method1060(arg2.field1298, -115), class41.field782 });
        }
        if (class187.field3610 == 1) {
            class25.field456++;
            method1277(class7.field127, -114, class144.method884(0, new class184[] { class150.field2689, class19.field363, var5 }), arg4, (short) 37, arg3, (long) arg1);
        } else if (!class209.field4013) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class193.field3737[var6] != null) {
                    short var7 = 0;
                    if (class193.field3737[var6].method1150(class91.field1697, -122)) {
                        if (class46.field872.field1282 < arg2.field1282) {
                            var7 = 2000;
                        }
                        if (class46.field872.field1285 != 0 && arg2.field1285 != 0) {
                            if (class46.field872.field1285 == arg2.field1285) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class91.field1702[var6]) {
                        var7 = 2000;
                    }
                    class150.field2695++;
                    boolean var8 = false;
                    short var9 = class11.field204[var6];
                    short var10 = (short) (var7 + var9);
                    method1277(class193.field3737[var6], -107, class144.method884(0, new class184[] { class31.field534, var5 }), arg4, var10, arg3, (long) arg1);
                }
            }
        } else if ((class106.field1920 & 0x8) == 8) {
            method1277(class14.field270, -53, class144.method884(0, new class184[] { class84.field1553, class19.field363, var5 }), arg4, (short) 23, arg3, (long) arg1);
            class94.field1719++;
        }
        if (arg0 >= -88) {
            field3863 = null;
        }
        for (int var11 = 0; var11 < class133.field2404; var11++) {
            if (class54.field960[var11] == 42) {
                class174.field3298[var11] = class144.method884(0, new class184[] { class31.field534, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILtg;Lka;)I")
    public static final int method1275(int arg0, class184 arg1, class97 arg2) {
        int var3 = arg2.field1834;
        arg2.method606(arg1.field3555, 128);
        arg2.field1834 += class118.field2131.method857(arg2.field1809, arg1.field3555, arg1.field3527, 0, (byte) -92, arg2.field1834);
        if (arg0 != -18576) {
            field3863 = null;
        }
        field3865++;
        return arg2.field1834 - var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field3859 = null;
        field3867 = null;
        if (arg0 <= 17) {
            field3859 = null;
        }
        field3861 = null;
        field3863 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[B)V")
    public abstract void method909(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)[B")
    public abstract byte[] method908(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ltg;ILtg;ISIJ)V")
    public static final void method1277(class184 arg0, int arg1, class184 arg2, int arg3, short arg4, int arg5, long arg6) {
        field3860++;
        if (class170.field3244) {
            return;
        }
        if (class133.field2404 < 500) {
            class38.field719[class133.field2404] = arg0;
            class174.field3298[class133.field2404] = arg2;
            class54.field960[class133.field2404] = arg4;
            class72.field1345[class133.field2404] = arg6;
            class164.field2958[class133.field2404] = arg5;
            class25.field444[class133.field2404] = arg3;
            class133.field2404++;
        }
        if (arg1 >= -1) {
            field3859 = null;
        }
    }
}
