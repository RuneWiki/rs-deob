import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class150 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lbn;")
    public static class9 field2071;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2079;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1081(int arg0) {
        field2080++;
        class153.field2126.method717((byte) 57);
        if (arg0 != 7) {
            method1086((byte) -37);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method1082(int arg0) {
        field2081++;
        if (arg0 != -1) {
            this.method1087((byte) 68);
        }
        return (this.field2082 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)V", line = 33)
    public static final void method1083(byte arg0, int arg1, int arg2) {
        field2076++;
        if (arg0 <= -15) {
            class143 var3 = class163.method1176((byte) 123, arg2, 12);
            var3.method1032((byte) 111);
            var3.field1965 = arg1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 48)
    public static void method1084(int arg0) {
        int var1 = -81 % ((arg0 - 71) / 40);
        field2071 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z", line = 58)
    public final boolean method1085(boolean arg0) {
        if (arg0) {
            this.field2074 = 47;
        }
        field2075++;
        return (this.field2082 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I", line = 72)
    public static final int method1086(byte arg0) {
        field2073++;
        if (arg0 != 102) {
            field2071 = (class9) null;
        }
        return class167.field2276 && class149.field2067[81] && class204.field2938 > 2 ? class135.field1868[class204.field2938 - 2] : class135.field1868[class204.field2938 - 1];
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z", line = 88)
    public final boolean method1087(byte arg0) {
        field2078++;
        if (arg0 == 97) {
            return (this.field2082 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 100)
    public static final String method1088(boolean arg0, long arg1) {
        field2077++;
        class185.field2554.setTime(new Date(arg1));
        int var3 = class185.field2554.get(7);
        if (!arg0) {
            method1083((byte) -30, -109, -28);
        }
        int var4 = class185.field2554.get(5);
        int var5 = class185.field2554.get(2);
        int var6 = class185.field2554.get(1);
        int var7 = class185.field2554.get(11);
        int var8 = class185.field2554.get(12);
        int var9 = class185.field2554.get(13);
        return class188.field2602[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class112.field1532[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIZZ)Lkm;", line = 130)
    public static final class133 method1089(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field2072++;
        class330 var5 = null;
        if (class302.field4495 != null) {
            var5 = new class330(arg2, class302.field4495, class272.field4077[arg2], 1000000);
        }
        class201.field2855[arg2] = class280.field4211.method1669(class163.field2248, var5, arg1 + 9072, arg2);
        if (arg3) {
            class201.field2855[arg2].method1871(-13395);
        }
        if (arg1 != -9067) {
            field2071 = (class9) null;
        }
        return new class133(class201.field2855[arg2], arg0, arg4);
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)Z", line = 152)
    public final boolean method1090(int arg0) {
        field2083++;
        if (arg0 < 3) {
            this.field2084 = 27;
        }
        return (this.field2082 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 165)
    public static final int method1091(int arg0, int arg1) {
        if (arg0 != -1058214713) {
            field2069 = -66;
        }
        field2070++;
        return arg1 >>> 7;
    }
}
