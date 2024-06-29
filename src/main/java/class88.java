import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class88 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public int field1298 = 8;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field1297 = 16;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public int field1307 = -1;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field1309 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public int field1303 = 128;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field1300 = -1;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field1308 = 1190717;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Z")
    public boolean field1310 = true;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Z")
    public boolean field1305 = false;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Z")
    public boolean field1302 = true;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lhb;")
    public static class318 field1301 = new class318(64);

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[I")
    public static int[] field1311 = new int[1000];

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "Lhb;")
    public static class318 field1313 = new class318(64);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 12)
    public static void method606(int arg0) {
        field1311 = null;
        if (arg0 != 128) {
            method606(-101);
        }
        field1301 = null;
        field1313 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lre;II)V", line = 28)
    public final void method607(class263 arg0, int arg1, int arg2) {
        field1299++;
        if (arg1 <= 103) {
            this.field1302 = true;
        }
        while (true) {
            int var4 = arg0.method1787(false);
            if (var4 == 0) {
                return;
            }
            this.method608(arg0, var4, -52, arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lre;III)V", line = 63)
    private final void method608(class263 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field1309 = class97.method689(112, arg0.method1824(false));
        } else if (arg1 == 2) {
            this.field1300 = arg0.method1787(false);
        } else if (arg1 == 3) {
            this.field1300 = arg0.method1830((byte) -77);
            if (this.field1300 == 65535) {
                this.field1300 = -1;
            }
        } else if (arg1 == 5) {
            this.field1310 = false;
        } else if (arg1 == 7) {
            this.field1307 = class97.method689(102, arg0.method1824(false));
        } else if (arg1 == 8) {
            class298.field4551 = arg3;
        } else if (arg1 == 9) {
            this.field1303 = arg0.method1830((byte) -77);
        } else if (arg1 == 10) {
            this.field1302 = false;
        } else if (arg1 == 11) {
            this.field1298 = arg0.method1787(false);
        } else if (arg1 == 12) {
            this.field1305 = true;
        } else if (arg1 == 13) {
            this.field1308 = arg0.method1824(false);
        } else if (arg1 == 14) {
            this.field1297 = arg0.method1787(false);
        }
        int var5 = -5 / ((77 - arg2) / 47);
        field1312++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)V", line = 143)
    public static final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg2;
        if (arg3 < 67) {
            return;
        }
        field1296++;
        int var8 = arg5 - arg1;
        int var9 = arg4 - arg1;
        for (int var10 = arg2; var10 < var7; var10++) {
            class315.method2160(class40.field488[var10], arg6, arg4, arg0, 7);
        }
        int var11 = arg0 + arg1;
        for (int var12 = arg5; var12 > var8; var12--) {
            class315.method2160(class40.field488[var12], arg6, arg4, arg0, 7);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class40.field488[var13];
            class315.method2160(var14, arg6, var11, arg0, 7);
            class315.method2160(var14, arg6, arg4, var9, 7);
        }
    }
}
