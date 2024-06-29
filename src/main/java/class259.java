import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class259 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Llh;")
    private class55 field3774 = new class55();

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3762 = "white:";

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field3770 = false;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3775 = "slide:";

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3761 = "Loading world list data";

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Llh;")
    private class55 field3777;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Ldi;")
    public static class99 field3779;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
    public static final boolean method1654(int arg0) {
        field3763++;
        if (arg0 <= 32) {
            method1654(-127);
        }
        if (class270.field3939) {
            try {
                class208.method1328(-24232, class115.field1592.field664, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JBZ)V")
    public static final void method1655(long arg0, byte arg1, boolean arg2) {
        field3769++;
        if (arg0 == 0L) {
            return;
        }
        if (class185.field2675 >= 100) {
            class225.method1455(class152.field2204, 120, "", 0);
            return;
        }
        String var4 = class110.method686(arg0, true);
        for (int var5 = 0; var5 < class185.field2675; var5++) {
            if (class209.field2945[var5] == arg0) {
                class225.method1455(var4 + class247.field3587, 29, "", 0);
                return;
            }
        }
        for (int var6 = 0; var6 < class144.field2064; var6++) {
            if (class267.field3844[var6] == arg0) {
                class225.method1455(class98.field1313 + var4 + class123.field1766, 108, "", 0);
                return;
            }
        }
        if (var4.equals(class177.field2507.field3466)) {
            class225.method1455(class188.field2700, -33, "", 0);
            return;
        }
        if (arg1 < 30) {
            method1655(-92L, (byte) 46, false);
        }
        class209.field2945[class185.field2675] = arg0;
        class267.field3899++;
        class199.field2835[class185.field2675] = class52.method311(-31248, arg0);
        class260.field3781[class185.field2675++] = arg2;
        class79.field934 = class176.field2500;
        class94.field1259.method592(131, false);
        class94.field1259.method1379(-80, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Llh;B)V")
    public final void method1656(class55 arg0, byte arg1) {
        field3764++;
        if (arg1 > -53) {
            return;
        }
        if (arg0.field642 != null) {
            arg0.method336(22047);
        }
        arg0.field647 = this.field3774;
        arg0.field642 = this.field3774.field642;
        arg0.field642.field647 = arg0;
        arg0.field647.field642 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Llh;")
    public final class55 method1657(byte arg0) {
        class55 var2 = this.field3774.field647;
        field3772++;
        if (this.field3774 == var2) {
            this.field3777 = null;
            return null;
        }
        this.field3777 = var2.field647;
        if (arg0 != 122) {
            this.method1664((byte) 2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Llh;")
    public final class55 method1658(int arg0) {
        field3760++;
        class55 var2 = this.field3777;
        if (arg0 != -30630) {
            field3762 = null;
        }
        if (this.field3774 == var2) {
            this.field3777 = null;
            return null;
        } else {
            this.field3777 = var2.field647;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZI)Ljava/lang/String;")
    public static final String method1659(byte arg0, boolean arg1, int arg2) {
        if (arg0 != 36) {
            field3761 = null;
        }
        field3771++;
        return arg1 && arg2 >= 0 ? class269.method1724(10, arg2, (byte) -119, arg1) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public static void method1660(int arg0) {
        if (arg0 != 0) {
            method1662(-11, -3);
        }
        field3775 = null;
        field3761 = null;
        field3762 = null;
        field3779 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public final void method1661(boolean arg0) {
        if (arg0) {
            method1660(87);
        }
        while (true) {
            class55 var2 = this.field3774.field647;
            if (this.field3774 == var2) {
                field3766++;
                this.field3777 = null;
                return;
            }
            var2.method336(22047);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lwh;")
    public static final class235 method1662(int arg0, int arg1) {
        field3778++;
        class235 var2 = (class235) class9.field118.method1567((long) arg0, 8);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class115.field1587.method1861(arg0, 0, arg1 ^ 0x1);
        } else {
            var3 = class100.field1352.method1861(arg0 & 0x7FFF, 0, arg1 ^ 0x1);
        }
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1533(new class216(var3), 0);
        }
        if (arg0 >= 32768) {
            var4.method1538(-126);
        }
        if (arg1 != 0) {
            field3762 = null;
        }
        class9.field118.method1568((byte) -93, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)I")
    public final int method1663(int arg0) {
        field3768++;
        int var2 = arg0;
        for (class55 var3 = this.field3774.field647; var3 != this.field3774; var3 = var3.field647) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Llh;")
    public final class55 method1664(byte arg0) {
        field3773++;
        int var2 = 81 / ((arg0 - 8) / 40);
        class55 var3 = this.field3774.field647;
        if (this.field3774 == var3) {
            return null;
        } else {
            var3.method336(22047);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class259() {
        this.field3774.field642 = this.field3774;
        this.field3774.field647 = this.field3774;
    }
}
