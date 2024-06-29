import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class389 extends class333 implements class159 {

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Z")
    public static boolean field5269 = true;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "C")
    public char field5265;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "J")
    public long field5271;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "[Lsf;")
    public static class603[] field5262;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
    public final int method864(byte arg0) {
        if (arg0 > -22) {
            this.method866(-40);
        }
        field5261++;
        return this.field5259;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        field5263++;
        return arg0 == 4186 ? this.field5266 : -121;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
    public static final void method2215(int arg0, boolean arg1) {
        if (arg0 != 8) {
            method2216((byte) -108);
        }
        if (arg1) {
            if (class209.field2466 != -1) {
                class22.method100((byte) 93, class209.field2466);
            }
            for (class633 var2 = (class633) class14.field117.method3674(125); var2 != null; var2 = (class633) class14.field117.method3672(-1)) {
                if (!var2.method1925(14325)) {
                    var2 = (class633) class14.field117.method3674(24);
                    if (var2 == null) {
                        break;
                    }
                }
                class604.method3377((byte) 125, var2, false, true);
            }
            class209.field2466 = -1;
            class14.field117 = new class661(8);
            class505.method2899(77);
            class209.field2466 = class213.field2598;
            class175.method1067(false, 2620);
            class64.method346(8);
            class281.method1637(class209.field2466);
        }
        field5260++;
        class79.field803 = "";
        class465.field6648 = "";
        class637.field8960 = false;
        class578.method3270((byte) 17);
        class178.field1992 = -1;
        class125.method716((byte) 115, class176.field1966);
        class362.field4859 = new class236();
        class362.field4859.field5176 = class140.field1550 * 512 / 2;
        class362.field4859.field5179 = class142.field1574 * 512 / 2;
        class362.field4859.field9517[0] = class142.field1574 / 2;
        class689.field9698 = 0;
        class516.field7360 = 0;
        class362.field4859.field9513[0] = class140.field1550 / 2;
        if (class538.field7572 == 2) {
            class516.field7360 = class518.field7375 << 9;
            class689.field9698 = class20.field161 << 9;
        } else {
            class349.method2072(-9319);
        }
        class173.method1055(1678);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
    public final int method866(int arg0) {
        field5270++;
        int var2 = -68 / ((arg0 - 51) / 60);
        return this.field5267;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        field5262 = null;
        int var1 = 21 / ((arg0 + 32) / 61);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)J")
    public final long method867(byte arg0) {
        field5264++;
        int var2 = -44 / ((-arg0 - 64) / 34);
        return this.field5271;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)C")
    public final char method868(int arg0) {
        field5268++;
        if (arg0 != 10943) {
            field5262 = null;
        }
        return this.field5265;
    }
}
