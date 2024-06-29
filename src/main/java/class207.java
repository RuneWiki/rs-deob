import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class207 extends class88 {

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "J")
    public long field3774;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lhj;")
    public static class69 field3769 = class181.method1318(":trade:", (byte) -120);

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field3773 = 10;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Lhj;")
    public static class69 field3779 = class181.method1318("::gc", (byte) -106);

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field3775 = 128;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lqb;")
    public static class56 field3770;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lnc;")
    public static class83 field3778;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        field3778 = null;
        if (arg0 < -42) {
            field3769 = null;
            field3770 = null;
            field3779 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public static final void method1502(int arg0) {
        field3771++;
        int var1 = class199.field3595.method305(8, 8);
        if (var1 < class98.field1856) {
            for (int var2 = var1; var2 < class98.field1856; var2++) {
                class108.field2071[class88.field1681++] = class38.field525[var2];
            }
        }
        if (class98.field1856 < var1) {
            throw new RuntimeException("gppov1");
        }
        class98.field1856 = 0;
        int var3 = -118 / ((arg0 + 7) / 41);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class38.field525[var4];
            class108 var6 = class35.field491[var5];
            int var7 = class199.field3595.method305(1, 8);
            if (var7 == 0) {
                class38.field525[class98.field1856++] = var5;
                var6.field4041 = class180.field3272;
            } else {
                int var8 = class199.field3595.method305(2, 8);
                if (var8 == 0) {
                    class38.field525[class98.field1856++] = var5;
                    var6.field4041 = class180.field3272;
                    class102.field1908[class156.field2917++] = var5;
                } else if (var8 == 1) {
                    class38.field525[class98.field1856++] = var5;
                    var6.field4041 = class180.field3272;
                    int var9 = class199.field3595.method305(3, 8);
                    var6.method1576(4, var9, false);
                    int var10 = class199.field3595.method305(1, 8);
                    if (var10 == 1) {
                        class102.field1908[class156.field2917++] = var5;
                    }
                } else if (var8 == 2) {
                    class38.field525[class98.field1856++] = var5;
                    var6.field4041 = class180.field3272;
                    int var11 = class199.field3595.method305(3, 8);
                    var6.method1576(4, var11, true);
                    int var12 = class199.field3595.method305(3, 8);
                    var6.method1576(4, var12, true);
                    int var13 = class199.field3595.method305(1, 8);
                    if (var13 == 1) {
                        class102.field1908[class156.field2917++] = var5;
                    }
                } else if (var8 == 3) {
                    class108.field2071[class88.field1681++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class207() {
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I")
    public static final int method1503(int arg0, byte arg1) {
        field3772++;
        return arg1 < 35 ? 71 : (arg0 & 0x1E56CA) >> 18;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
    public static final int method1504(int arg0, int arg1) {
        field3777++;
        if (arg0 <= 8) {
            return -85;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xE5) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(J)V")
    public class207(long arg0) {
        this.field3774 = arg0;
    }
}
