import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class65 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[I")
    private int[] field1266;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Loc;")
    public static class151 field1263 = class137.method873(2, "m");

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Loc;")
    public static class151 field1261 = class137.method873(2, "cookieprefix");

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Loc;")
    public static class151 field1264 = class137.method873(2, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loc;I)I")
    public static final int method431(class151 arg0, int arg1) {
        if (arg1 != 1) {
            field1264 = null;
        }
        field1265++;
        return arg0.method988(arg1 - 2) + 1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public final int method432(int arg0, int arg1) {
        if (arg1 != 28587) {
            return 50;
        }
        field1259++;
        int var3 = (this.field1266.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1266[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1266[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field1264 = null;
        field1261 = null;
        field1263 = null;
        if (arg0 != 97) {
            method431(null, 27);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Loc;")
    public static final class151 method434(int arg0, int arg1, int arg2) {
        field1258++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class189.field3347;
        } else if (var3 < -6) {
            return class182.field3290;
        } else if (var3 < -3) {
            return class156.field2835;
        } else if (var3 < 0) {
            return class16.field390;
        } else if (var3 > 9) {
            return class220.field3820;
        } else if (var3 > 6) {
            return class23.field511;
        } else if (arg2 != 1) {
            return null;
        } else if (var3 > 3) {
            return class222.field3859;
        } else if (var3 > 0) {
            return class129.field2348;
        } else {
            return class215.field3763;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V")
    public class65(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1266 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1266[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1266[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1266[var5 + var5] = arg0[var4];
            this.field1266[var5 + var5 + 1] = var4++;
        }
    }
}
