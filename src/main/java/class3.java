import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lob;")
    private static class141 field30 = class175.method1195(40, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lob;")
    public static class141 field33 = class175.method1195(40, "(U(Y");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lob;")
    public static class141 field29 = class175.method1195(40, "Fallen lassen");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Lob;")
    public static class141[] field35 = new class141[1000];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lob;")
    public static class141 field38 = field30;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lob;")
    private static class141 field36 = class175.method1195(40, "Unexpected server response)3");

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lob;")
    public static class141 field34 = field36;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method17(byte arg0) {
        field29 = null;
        field38 = null;
        field35 = null;
        field30 = null;
        field36 = null;
        int var1 = -49 / ((arg0 + 76) / 40);
        field34 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public final int method18(int arg0, int arg1) {
        field37++;
        if (arg1 > -49) {
            method19(-99);
        }
        int var3 = (this.field39.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field39[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field39[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I")
    public static final int method19(int arg0) {
        if (arg0 > -55) {
            method19(75);
        }
        field32++;
        return class138.field2656;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
    public class3(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field39 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field39[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field39[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field39[var5 + var5] = arg0[var4];
            this.field39[var5 + var5 + 1] = var4++;
        }
    }
}
