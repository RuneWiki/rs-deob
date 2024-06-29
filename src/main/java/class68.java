import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class68 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lmi;")
    private class259 field1296 = new class259();

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lla;")
    public static class95 field1300 = new class95(64);

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lcc;")
    public static class209 field1306 = class95.method669(98, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lcc;")
    public static class209 field1308 = class95.method669(123, "::tele ");

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
    public static boolean field1309 = false;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lcc;")
    public static class209 field1310 = class95.method669(109, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lcc;")
    private static class209 field1305 = class95.method669(99, " from your friend list first)3");

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    public static boolean field1304 = false;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lcc;")
    public static class209 field1307 = field1305;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lmi;")
    private class259 field1312;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lsj;I)V")
    public static final void method498(class49 arg0, int arg1) {
        field1302++;
        if (arg1 != 2) {
            method498((class49) null, 64);
        }
        class63.field1236 = arg0;
        class113.field2275 = class63.field1236.method360(16, arg1 - 2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static final void method499(byte arg0) {
        field1294++;
        try {
            if (arg0 > 4 && class244.field4428 == 1) {
                int var1 = class44.field873.method155(1764106088);
                if (var1 > 0 && class44.field873.method149(122)) {
                    int var2 = var1 - class61.field1220;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class44.field873.method141(var2, -1);
                } else {
                    class44.field873.method150(-123);
                    class44.field873.method151((byte) -117);
                    class172.field3146 = null;
                    class207.field3699 = null;
                    if (class65.field1264 == null) {
                        class244.field4428 = 0;
                    } else {
                        class244.field4428 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class44.field873.method150(-122);
            class207.field3699 = null;
            class172.field3146 = null;
            class244.field4428 = 0;
            class65.field1264 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lmi;")
    public final class259 method500(int arg0) {
        if (arg0 != 31480) {
            return null;
        }
        field1301++;
        class259 var2 = this.field1296.field4674;
        if (this.field1296 == var2) {
            return null;
        } else {
            var2.method1796(arg0 - 31531);
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lmi;Z)V")
    public final void method501(class259 arg0, boolean arg1) {
        if (arg0.field4668 != null) {
            arg0.method1796(-47);
        }
        arg0.field4674 = this.field1296;
        if (!arg1) {
            this.field1296 = null;
        }
        arg0.field4668 = this.field1296.field4668;
        arg0.field4668.field4674 = arg0;
        arg0.field4674.field4668 = arg0;
        field1298++;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
    public final int method502(int arg0) {
        field1299++;
        int var2 = 0;
        if (arg0 != 28150) {
            this.method501((class259) null, true);
        }
        for (class259 var3 = this.field1296.field4674; var3 != this.field1296; var3 = var3.field4674) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lmi;")
    public final class259 method503(int arg0) {
        class259 var2 = this.field1296.field4674;
        field1311++;
        if (arg0 != 19852) {
            method499((byte) 103);
        }
        if (this.field1296 == var2) {
            this.field1312 = null;
            return null;
        } else {
            this.field1312 = var2.field4674;
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Lmi;")
    public final class259 method504(int arg0) {
        field1297++;
        if (arg0 != 64) {
            return null;
        }
        class259 var2 = this.field1312;
        if (this.field1296 == var2) {
            this.field1312 = null;
            return null;
        } else {
            this.field1312 = var2.field4674;
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method505(byte arg0) {
        field1306 = null;
        field1310 = null;
        field1307 = null;
        field1300 = null;
        if (arg0 > -118) {
            method499((byte) 52);
        }
        field1308 = null;
        field1305 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public final void method506(byte arg0) {
        if (arg0 != -92) {
            return;
        }
        while (true) {
            class259 var2 = this.field1296.field4674;
            if (this.field1296 == var2) {
                this.field1312 = null;
                field1303++;
                return;
            }
            var2.method1796(-76);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class68() {
        this.field1296.field4674 = this.field1296;
        this.field1296.field4668 = this.field1296;
    }
}
