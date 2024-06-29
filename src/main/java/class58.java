import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class58 extends class89 {

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[J")
    private long[] field1268 = new long[10];

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field1254 = 2;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[I")
    public static int[] field1259 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Lae;")
    public static class6 field1261 = class64.method474(116, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Lae;")
    public static class6 field1263 = class64.method474(124, "Icons redrawn");

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[I")
    public static int[] field1253 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field1257 = 256;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[Lae;")
    public static class6[] field1256 = new class6[100];

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lae;")
    public static class6 field1260 = class64.method474(119, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
    public static int[] field1262 = new int[128];

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lae;")
    public static class6 field1275 = class64.method474(115, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "J")
    private long field1272;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[I")
    public static int[] field1251;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[I")
    public static int[] field1271;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I", line = 5)
    public final int method432(int arg0, int arg1, int arg2) {
        field1270++;
        int var4 = this.field1273;
        int var5 = this.field1255;
        this.field1255 = 300;
        this.field1273 = 1;
        if (arg0 != 4) {
            this.method436(-54);
        }
        this.field1272 = class5.method22(118);
        if (this.field1268[this.field1258] == 0L) {
            this.field1255 = var5;
            this.field1273 = var4;
        } else if (this.field1272 > this.field1268[this.field1258]) {
            this.field1255 = (int) ((long) (arg2 * 2560) / (this.field1272 - this.field1268[this.field1258]));
        }
        if (this.field1255 < 25) {
            this.field1255 = 25;
        }
        if (this.field1255 > 256) {
            this.field1255 = 256;
            this.field1273 = (int) ((long) arg2 - (this.field1272 - this.field1268[this.field1258]) / 10L);
        }
        if (this.field1273 > arg2) {
            this.field1273 = arg2;
        }
        this.field1268[this.field1258] = this.field1272;
        this.field1258 = (this.field1258 + 1) % 10;
        if (this.field1273 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1268[var6] != 0L) {
                    this.field1268[var6] += this.field1273;
                }
            }
        }
        if (arg1 > this.field1273) {
            this.field1273 = arg1;
        }
        class82.method696(3, (long) this.field1273);
        int var7 = 0;
        while (this.field1265 < 256) {
            var7++;
            this.field1265 += this.field1255;
        }
        this.field1265 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;Lbf;BLae;)Lbb;", line = 84)
    public static final class9 method433(class6 arg0, class14 arg1, byte arg2, class6 arg3) {
        int var4 = -11 / ((-arg2 - 22) / 52);
        int var5 = arg1.method158(arg0, (byte) 30);
        field1269++;
        int var6 = arg1.method138(100, var5, arg3);
        return class105.method887(var6, 4038, var5, arg1);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 104)
    public static void method434(boolean arg0) {
        field1261 = null;
        field1253 = null;
        field1275 = null;
        field1263 = null;
        if (arg0) {
            return;
        }
        field1259 = null;
        field1262 = null;
        field1251 = null;
        field1271 = null;
        field1256 = null;
        field1260 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 128)
    public final void method435(byte arg0) {
        if (arg0 >= -20) {
            return;
        }
        field1264++;
        this.field1255 = 256;
        this.field1273 = 1;
        this.field1265 = 0;
        this.field1272 = class5.method22(71);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1268[var2] = this.field1272;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 152)
    public final void method436(int arg0) {
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field1268[var2] = 0L;
        }
        field1274++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lkd;III)V", line = 171)
    public static final void method437(class66 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field1744 == arg1 && arg1 != -1) {
            int var4 = class35.method314(arg1, (byte) 54).field2042;
            if (var4 == 1) {
                arg0.field1787 = arg3;
                arg0.field1771 = 0;
                arg0.field1740 = 0;
                arg0.field1793 = 0;
            }
            if (var4 == 2) {
                arg0.field1771 = 0;
            }
        } else if (arg1 == -1 || arg0.field1744 == -1 || class35.method314(arg1, (byte) 54).field2036 >= class35.method314(arg0.field1744, (byte) 54).field2036) {
            arg0.field1787 = arg3;
            arg0.field1725 = arg0.field1794;
            arg0.field1771 = 0;
            arg0.field1740 = 0;
            arg0.field1793 = 0;
            arg0.field1744 = arg1;
        }
        field1252++;
        if (arg2 >= -2) {
            field1250 = -72;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 280)
    public class58() {
        this.method435((byte) -112);
    }
}
