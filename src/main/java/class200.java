import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class200 implements class162 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    private int field3877 = 50;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field3887 = 128;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljg;")
    private class89 field3872;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ljg;")
    private class89 field3876;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lnb;")
    private class120 field3885;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lkb;")
    public static class93 field3875 = class76.method390("bevor Sie den Vorgang wiederholen)3", 0);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lkb;")
    public static class93 field3881 = class76.method390("blinken3:", 0);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lkb;")
    public static class93 field3879 = class76.method390("<col=ffb000>", 0);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
    public static int[] field3873 = new int[32];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)Lhb;")
    private final class67 method1308(int arg0, int arg1) {
        if (arg0 != 128) {
            method1311(-32, 31, -35);
        }
        field3889++;
        class67 var3 = (class67) this.field3885.method680((long) arg1, (byte) 104);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3872.method461(0, (byte) 112, arg1);
        if (var4 == null) {
            return class51.method266(arg0 ^ 0xFFFFFF10);
        } else {
            class158 var5 = new class158(var4);
            class67 var6 = new class67(var5);
            this.field3885.method678(true, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V")
    public final void method1309(int arg0, int arg1) {
        field3874++;
        for (class67 var3 = (class67) this.field3885.method681((byte) -124); var3 != null; var3 = (class67) this.field3885.method683((byte) 118)) {
            if (var3.field1228) {
                var3.method351((byte) -99, arg1);
                var3.field1228 = false;
            }
        }
        int var4 = -34 / ((arg0 - 16) / 34);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
    public final boolean method1105(int arg0, int arg1) {
        if (arg0 != -25072) {
            this.method1310(false);
        }
        field3891++;
        return this.method1308(128, arg1).field1229;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)[I")
    public final int[] method1104(boolean arg0, int arg1) {
        field3892++;
        class158 var3 = new class158(this.field3872.method461(0, (byte) 77, arg1));
        class67 var4 = new class67(var3);
        return arg0 ? var4.method359(0, this.field3876, this, this.field3887) : null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public final void method1310(boolean arg0) {
        if (!arg0) {
            this.field3877 = -37;
        }
        this.field3885 = new class120(this.field3877);
        field3890++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIF)[I")
    public final int[] method1102(int arg0, int arg1, float arg2) {
        if (arg1 == -7568) {
            field3884++;
            class67 var4 = this.method1308(128, arg0);
            var4.field1228 = true;
            return var4.method355(this.field3876, (byte) 62, arg2, this, this.field3887);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public static final void method1311(int arg0, int arg1, int arg2) {
        field3878++;
        if (class100.field1841 < 2 && class144.field2800 == 0 && !class103.field1905) {
            return;
        }
        class93 var3;
        if (class144.field2800 == 1 && class100.field1841 < 2) {
            var3 = class203.method1321(new class93[] { class154.field3029, class95.field1759, class108.field1957, class104.field1915 }, -113);
        } else if (class103.field1905 && class100.field1841 < 2) {
            var3 = class203.method1321(new class93[] { class207.field4040, class95.field1759, class122.field2270, class104.field1915 }, -17);
        } else {
            var3 = class203.method1320(113, class100.field1841 - 1);
        }
        if (class100.field1841 > 2) {
            var3 = class203.method1321(new class93[] { var3, class195.field3819, class67.method357((byte) -98, class100.field1841 - 2), class131.field2488 }, -23);
        }
        if (arg0 < 64) {
            method1313(-125, 114);
        }
        int var4 = class68.field1250.method995(var3, arg1 + 4, arg2 + 15, 16777215, 0, class124.field2311, class21.field335);
        class77.method392(arg1 + 4, arg2, 15, var4 + class68.field1250.method1005(var3), 0);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)I")
    public final int method1103(byte arg0, int arg1) {
        if (arg0 <= 73) {
            this.method1100((byte) -72, -107);
        }
        field3880++;
        return this.method1308(128, arg1).field1225;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z")
    public final boolean method1101(int arg0, boolean arg1) {
        field3871++;
        if (arg1) {
            return this.field3887 == 64 || this.method1308(128, arg0).field1222 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
    public static void method1312(boolean arg0) {
        if (arg0) {
            method1312(true);
        }
        field3873 = null;
        field3881 = null;
        field3875 = null;
        field3879 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
    public final boolean method1100(byte arg0, int arg1) {
        field3882++;
        if (arg0 != 125) {
            this.method1101(56, true);
        }
        return this.method1308(128, arg1).field1220;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
    public final boolean method1106(int arg0, int arg1) {
        if (arg0 <= 42) {
            this.method1106(4, 64);
        }
        field3886++;
        return this.method1308(128, arg1).method354(this, this.field3876, 15);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)Lve;")
    public static final class195 method1313(int arg0, int arg1) {
        field3883++;
        class195 var2 = (class195) class8.field125.method680((long) arg0, (byte) 115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1318.method461(arg1, (byte) 78, arg0);
        class195 var4 = new class195();
        var4.field3808 = arg0;
        if (var3 != null) {
            var4.method1252(new class158(var3), 0);
        }
        var4.method1248(95);
        class8.field125.method678(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljg;Ljg;II)V")
    public class200(class89 arg0, class89 arg1, int arg2, int arg3) {
        this.field3887 = arg3;
        this.field3872 = arg0;
        this.field3876 = arg1;
        this.field3877 = arg2;
        this.field3885 = new class120(this.field3877);
    }
}
