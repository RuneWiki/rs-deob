import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "La;")
    private static class1 field832 = class113.method934(-11538, "Loading sprites )2 ");

    @OriginalMember(owner = "client!f", name = "g", descriptor = "La;")
    public static class1 field834 = field832;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "La;")
    public static class1 field839 = class113.method934(-11538, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!f", name = "f", descriptor = "La;")
    private static class1 field833 = class113.method934(-11538, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!f", name = "j", descriptor = "La;")
    public static class1 field837 = field833;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lcb;")
    public static class15 field831 = new class15(128);

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "La;")
    public static class1 field847 = class113.method934(-11538, ":0");

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    public static int[] field848 = new int[256];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lwc;")
    public static class134 field844;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lwc;")
    public static class134 field845;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Ljava/awt/Font;")
    public static Font field843;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public static int[] field838;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lvc;IZ)V", line = 3)
    public static final void method382(class129 arg0, int arg1, boolean arg2) {
        field840++;
        if (class112.field2772 != null) {
            try {
                class112.field2772.method1018(-127);
            } catch (Exception var8) {
            }
            class112.field2772 = null;
        }
        class112.field2772 = arg0;
        class64.method620(arg2, 24041);
        class92.field2304.field268 = 0;
        class104.field2616 = null;
        class102.field2562 = 0;
        class36.field968 = null;
        while (true) {
            class104 var3 = (class104) class78.field1920.method499(false);
            if (var3 == null) {
                while (true) {
                    class104 var4 = (class104) class74.field1834.method499(false);
                    if (var4 == null) {
                        if (class14.field477 != 0) {
                            try {
                                class8 var5 = new class8(4);
                                var5.method142(4, (byte) -128);
                                var5.method142(class14.field477, (byte) -128);
                                var5.method151(0, -128);
                                class112.field2772.method1019(4, (byte) -19, 0, var5.field285);
                            } catch (IOException var7) {
                                try {
                                    class112.field2772.method1018(-123);
                                } catch (Exception var6) {
                                }
                                class112.field2772 = null;
                                class16.field526++;
                            }
                        }
                        if (arg1 < 102) {
                            method382(null, 92, true);
                        }
                        class45.field1191 = 0;
                        class92.field2274 = class103.method872(1);
                        return;
                    }
                    class37.field997.method616(true, var4);
                    class49.field1330.method500(var4, (byte) -121, var4.field2076);
                    class85.field2147--;
                    class48.field1262++;
                }
            }
            class103.field2599.method500(var3, (byte) 126, var3.field2076);
            field846--;
            class134.field3288++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I", line = 96)
    public static final int method383(boolean arg0) {
        if (!arg0) {
            field845 = null;
        }
        field829++;
        return class99.field2433++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)V", line = 108)
    public static final void method384(int arg0, long arg1) {
        field836++;
        if (arg1 == 0L) {
            return;
        }
        if (class85.field2149 >= 100) {
            class89.method761(arg0 ^ 0x603F, 0, class102.field2585, class132.field3237);
            return;
        }
        class1 var3 = class118.method972(arg0 ^ 0xFFFF9FFB, arg1).method36(-4305);
        for (int var4 = 0; var4 < class85.field2149; var4++) {
            if (class106.field2686[var4] == arg1) {
                class89.method761(114, 0, class116.method959(arg0 ^ 0xFFFF9FB5, new class1[] { var3, class134.field3298 }), class132.field3237);
                return;
            }
        }
        for (int var5 = 0; var5 < class59.field1495; var5++) {
            if (class117.field2932[var5] == arg1) {
                class89.method761(112, 0, class116.method959(-100, new class1[] { class89.field2175, var3, class128.field3141 }), class132.field3237);
                return;
            }
        }
        if (var3.method5(class104.field2624.field87, 122)) {
            return;
        }
        class119.field2957++;
        if (arg0 != 24686) {
            field844 = null;
        }
        class106.field2686[class85.field2149++] = arg1;
        class39.field1056 = true;
        class70.field1729.method416(arg0 - 13233, 251);
        class70.field1729.method158(arg1, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 170)
    public static final void method385(int arg0) {
        field841++;
        for (int var1 = arg0; var1 < class118.field2942; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class112.field2761[var1];
            }
            class2 var3 = class80.field2033[var2];
            if (var3 != null) {
                class24.method320(var3, 1, (byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 216)
    public static void method386(byte arg0) {
        field832 = null;
        field844 = null;
        field831 = null;
        if (arg0 < 75) {
            return;
        }
        field847 = null;
        field834 = null;
        field837 = null;
        field845 = null;
        field839 = null;
        field838 = null;
        field833 = null;
        field843 = null;
        field848 = null;
    }
}
