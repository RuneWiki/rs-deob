import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class268 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
    private int[] field4464;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
    public static int[] field4463 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lhg;")
    public static class207 field4454;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLaj;)V")
    public static final void method1884(boolean arg0, class151 arg1) {
        if (!arg0) {
            field4461++;
            class245.field4118 = arg1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Lab;")
    public static final class249 method1885(boolean arg0) {
        class249 var1 = new class249(34);
        var1.method1780(11, 118);
        var1.method1780(class15.field304, 50);
        var1.method1780(class243.field4075 ? 1 : 0, 106);
        var1.method1780(class79.field1325 ? 1 : 0, 74);
        field4459++;
        if (!arg0) {
            field4463 = null;
        }
        var1.method1780(class162.field2636 ? 1 : 0, 79);
        var1.method1780(class145.field2388 ? 1 : 0, 107);
        var1.method1780(class259.field4357 ? 1 : 0, 88);
        var1.method1780(class54.field916 ? 1 : 0, 65);
        var1.method1780(class190.field3044 ? 1 : 0, 122);
        var1.method1780(class68.field1142 ? 1 : 0, 73);
        var1.method1780(class162.field2631, 89);
        var1.method1780(class197.field3201 ? 1 : 0, 114);
        var1.method1780(class113.field1934 ? 1 : 0, 123);
        var1.method1780(class141.field2337 ? 1 : 0, 65);
        var1.method1780(class97.field1560, 124);
        var1.method1780(class186.field2977 ? 1 : 0, 83);
        var1.method1780(class283.field4682, 67);
        var1.method1780(class289.field4767, 67);
        var1.method1780(class292.field4785, 115);
        var1.method1771(class175.field2827, (byte) 30);
        var1.method1771(class222.field3731, (byte) 30);
        var1.method1780(class139.method1035(), 76);
        var1.method1811(class72.field1257, (byte) 51);
        var1.method1780(class297.field4862, 123);
        var1.method1780(class173.field2789 ? 1 : 0, 120);
        var1.method1780(class46.field814 ? 1 : 0, 90);
        var1.method1780(class16.field328, 65);
        var1.method1780(class253.field4291 ? 1 : 0, 93);
        var1.method1780(class245.field4117 ? 1 : 0, 79);
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)[Lek;")
    public static final class250[] method1886(boolean arg0) {
        field4462++;
        if (!arg0) {
            return null;
        }
        class250[] var1 = new class250[class206.field3317];
        for (int var2 = 0; var2 < class206.field3317; var2++) {
            var1[var2] = new class230(class134.field2214, class253.field4293, class49.field842[var2], class73.field1283[var2], class297.field4859[var2], class43.field656[var2], class289.field4758[var2], class185.field2952);
        }
        class155.method1175(-70);
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method1887(byte arg0) {
        field4463 = null;
        int var1 = 31 / ((arg0 + 65) / 54);
        field4454 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public final int method1888(int arg0, int arg1) {
        field4460++;
        if (arg0 != -498643999) {
            return -49;
        }
        int var3 = (this.field4464.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4464[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4464[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLaj;)V")
    public static final void method1889(byte arg0, class151 arg1) {
        if (arg0 >= -110) {
            method1887((byte) 64);
        }
        class301.field4912 = arg1;
        field4458++;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([I)V")
    public class268(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4464 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4464[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4464[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4464[var5 + var5] = arg0[var4];
            this.field4464[var5 - (-var5 - 1)] = var4++;
        }
    }
}
