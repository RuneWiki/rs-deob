import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class178 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Loh;")
    public static class258 field3181 = class153.method1046("Lade Schrifts-=tze )2 ", 123);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Loh;")
    private static class258 field3178 = class153.method1046("Connection lost)3", 122);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Loh;")
    public static class258 field3184 = class153.method1046(" <col=ffff00>", 114);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Loh;")
    public static class258 field3182 = field3178;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[[[Llf;")
    public static class228[][][] field3180;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 7)
    public static void method1216(int arg0) {
        field3184 = null;
        field3182 = null;
        field3181 = null;
        field3180 = (class228[][][]) null;
        field3178 = null;
        if (arg0 < 27) {
            field3180 = (class228[][][]) ((class228[][][]) null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZ)V", line = 21)
    public static final void method1217(boolean arg0, boolean arg1) {
        field3190++;
        if (!arg0) {
            method1219(100, -36, -55, -113, -36);
        }
        if (class87.field1474 != arg1) {
            class87.field1474 = arg1;
            class290.method2042(false);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)I", line = 39)
    public static final int method1218(int arg0, byte arg1) {
        field3187++;
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        }
        int var2 = -104 % ((-arg1 - 64) / 52);
        if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3179++;
        class286 var5 = class48.method389(arg3, 10, 10738);
        var5.method2017(-63);
        var5.field4936 = arg4;
        var5.field4932 = arg2;
        var5.field4926 = arg0;
        if (arg1 != -14208) {
            method1221(-98, -74);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 88)
    public static final void method1220(int arg0) {
        field3188++;
        if (!class110.method807(720049666) && class272.field4704 != class265.field4626) {
            class201.method1334(class152.field2606.field975[0], class264.field4598, class272.field4704, class152.field2606.field959[0], false, -108, class165.field2797);
            return;
        }
        if (class50.field767 != class272.field4704) {
            class50.field767 = class272.field4704;
            class87.method623(9048, class272.field4704);
            class5.method28(26286);
        }
        if (arg0 < 107) {
            field3181 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I", line = 122)
    public static final int method1221(int arg0, int arg1) {
        field3185++;
        if (arg1 < 0) {
            return 0;
        }
        class238 var2 = (class238) class287.field4943.method986((long) arg1, 0);
        if (var2 == null) {
            return class105.method788(-66, arg1).field4381;
        }
        int var3 = 0;
        if (arg0 <= 70) {
            field3182 = (class258) null;
        }
        for (int var4 = 0; var4 < var2.field4153.length; var4++) {
            if (var2.field4153[var4] == -1) {
                var3++;
            }
        }
        return var3 + class105.method788(-71, arg1).field4381 - var2.field4153.length;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method1222(boolean arg0) {
        field3186++;
        if (class165.field2784 < 0) {
            class218.field3782 = -1;
            class299.field5122 = -1;
            class165.field2784 = 0;
        }
        if (class57.field907 < class165.field2784) {
            class218.field3782 = -1;
            class299.field5122 = -1;
            class165.field2784 = class57.field907;
        }
        if (class176.field3163 < 0) {
            class176.field3163 = 0;
            class299.field5122 = -1;
            class218.field3782 = -1;
        }
        if (arg0) {
            method1224(-99, 66, (byte) -46);
        }
        if (class225.field3870 < class176.field3163) {
            class176.field3163 = class225.field3870;
            class218.field3782 = -1;
            class299.field5122 = -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 202)
    public static final void method1223(byte arg0) {
        field3189++;
        class233.field4036.method1161(77);
        if (arg0 != 113) {
            field3181 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)Z", line = 217)
    public static final boolean method1224(int arg0, int arg1, byte arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class101 var3 = class123.method898(-935, arg1);
        if (arg2 < 107) {
            method1220(-87);
        }
        field3183++;
        return var3.method764(arg0, -117);
    }
}
