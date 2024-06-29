import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class751 extends class205 {

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
    public static int field10468 = -2;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "Lln;")
    public static class472 field10464 = new class472(12, 0, 1, 0);

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "Lcc;")
    public static class576 field10473;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "Ljava/lang/String;")
    public String field10462;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "[C")
    public char[] field10467;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "[C")
    public char[] field10471;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "[I")
    public int[] field10459;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "[I")
    public int[] field10469;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lofa;B)V")
    public final void method4182(class301 arg0, byte arg1) {
        if (arg1 != 127) {
            return;
        }
        field10466++;
        while (true) {
            int var3 = arg0.method1987(-56);
            if (var3 == 0) {
                return;
            }
            this.method4189(var3, arg0, 57);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public final void method4183(byte arg0) {
        field10461++;
        if (arg0 != -99) {
            this.field10459 = null;
        }
        if (this.field10459 != null) {
            for (int var2 = 0; var2 < this.field10459.length; var2++) {
                this.field10459[var2] = class112.method903(this.field10459[var2], 32768);
            }
        }
        if (this.field10469 != null) {
            for (int var3 = 0; var3 < this.field10469.length; var3++) {
                this.field10469[var3] = class112.method903(this.field10469[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public static void method4184(int arg0) {
        field10464 = null;
        field10473 = null;
        int var1 = 121 % ((36 - arg0) / 42);
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
    public static final void method4185(int arg0) {
        class757.field10543 = 0;
        class40.field713 = class382.field5732;
        field10465++;
        class478.field6940 = new class328[500];
        class573.field8132 = new class328[500];
        class158.field2452 = new int[class386.field5782][class42.field727 + 1][class54.field870 + 1];
        class258.field4045 = new class328[1000];
        class304.field4624 = 0;
        class666.field9463 = new class328[2000];
        class644.field9188 = 0;
        class377.field5676 = class382.field5732;
        class118.field1810 = false;
        class19.field199 = 0;
        int var1 = 51 % ((arg0 + 24) / 46);
        if ((class478.field6933 instanceof class406)) {
            class432.field6336 = false;
        } else {
            class432.field6336 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BC)I")
    public final int method4186(byte arg0, char arg1) {
        field10460++;
        if (this.field10469 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = 88 / ((arg0 - 3) / 63);
        while (this.field10469.length > var3) {
            if (this.field10467[var3] == arg1) {
                return this.field10469[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(CB)I")
    public final int method4187(char arg0, byte arg1) {
        field10472++;
        if (this.field10459 == null) {
            return -1;
        }
        if (arg1 != -73) {
            this.method4182(null, (byte) 73);
        }
        for (int var3 = 0; var3 < this.field10459.length; var3++) {
            if (this.field10471[var3] == arg0) {
                return this.field10459[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
    public static final void method4188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10463++;
        int var5 = class230.field3710;
        int var6 = class542.field7735;
        if (class250.field3989) {
            var5 += class499.method3028(0);
            var6 += class545.method3197(arg1 - 119);
        }
        if (class230.field3707 == 1) {
            class34 var7 = class683.field9660[class405.field6000 / 100];
            var7.method182(var5 - 8, var6 + -8);
            class438.method2696(var6 - 8, var6 - (-var7.method184() + 8), var7.method177() + var5 - 8, (byte) 87, var5 - 8);
        }
        if (class230.field3707 == 2) {
            class34 var8 = class683.field9660[class405.field6000 / 100 + 4];
            var8.method182(var5 - 8, var6 + -8);
            class438.method2696(var6 - 8, var8.method184() + var6 + -8, var5 + var8.method177() - 8, (byte) 126, var5 - 8);
        }
        if (arg1 != -8) {
            method4188(116, 22, 68, 15, 72);
        }
        class549.method3209((byte) -123);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILofa;I)V")
    private final void method4189(int arg0, class301 arg1, int arg2) {
        field10470++;
        if (arg0 == 1) {
            this.field10462 = arg1.method1958(-3438);
        } else if (arg0 == 2) {
            int var4 = arg1.method1987(-5);
            this.field10467 = new char[var4];
            this.field10469 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10469[var5] = arg1.method1989((byte) -110);
                byte var6 = arg1.method1984(4);
                this.field10467[var5] = var6 == 0 ? 0 : class232.method1610(-21630, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1987(-41);
            this.field10471 = new char[var7];
            this.field10459 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field10459[var8] = arg1.method1989((byte) -89);
                byte var9 = arg1.method1984(4);
                this.field10471[var8] = var9 == 0 ? 0 : class232.method1610(-21630, var9);
            }
        }
        if (arg2 <= 15) {
            this.method4189(82, null, 77);
        }
    }
}
