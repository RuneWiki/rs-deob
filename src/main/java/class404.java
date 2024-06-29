import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class404 extends class55 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[S")
    private static short[] field5711 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[S")
    private static short[] field5718 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[S")
    private static short[] field5721 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[[S")
    public static short[][] field5715 = new short[][] { field5721, field5711, field5718 };

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field5705;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public int field5712;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field5713;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lsba;")
    public class218 field5710;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lsba;")
    public class218 field5714;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Ljava/lang/String;")
    public String field5706;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Z")
    public boolean field5708;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field5709;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I", line = 14)
    public static final int method2336(boolean arg0) {
        field5717++;
        if (class392.field5553 == 1) {
            return class569.field8021;
        } else {
            if (arg0) {
                field5721 = null;
            }
            return class135.field1726;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 32)
    public static void method2337(int arg0) {
        field5721 = null;
        field5715 = null;
        field5711 = null;
        if (arg0 != 24301) {
            method2337(-117);
        }
        field5718 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z", line = 45)
    public static final boolean method2338(int arg0) {
        if (arg0 != 13299) {
            field5715 = null;
        }
        field5719++;
        try {
            if (class226.field2934 == 2) {
                if (class143.field1852 == null) {
                    class143.field1852 = class605.method3347(class476.field6580, class526.field7068, class122.field1593);
                    if (class143.field1852 == null) {
                        return false;
                    }
                }
                if (class321.field4313 == null) {
                    class321.field4313 = new class659(class413.field5837, class629.field8776);
                }
                class716 var1 = class68.field755;
                if (class520.field6997 != null) {
                    var1 = class520.field6997;
                }
                if (var1.method4021(class143.field1852, 22050, class321.field4313, class666.field9280, false)) {
                    class68.field755 = var1;
                    class68.field755.method4027((byte) 23);
                    if (class378.field5256 <= 0) {
                        class226.field2934 = 0;
                        class68.field755.method4035(class302.field4082, (byte) 124);
                        for (int var2 = 0; var2 < class266.field3526.length; var2++) {
                            class68.field755.method4032(-17, var2, class266.field3526[var2]);
                            class266.field3526[var2] = 255;
                        }
                    } else {
                        class226.field2934 = 3;
                        class68.field755.method4035(class302.field4082 < class378.field5256 ? class302.field4082 : class378.field5256, (byte) 33);
                        for (int var3 = 0; var3 < class266.field3526.length; var3++) {
                            class68.field755.method4032(-17, var3, class266.field3526[var3]);
                            class266.field3526[var3] = 255;
                        }
                    }
                    if (class520.field6997 == null) {
                        if (class494.field6734 > 0L) {
                            class68.field755.method4010(true, class669.field9309, class143.field1852, class494.field6734, -3);
                        } else {
                            class68.field755.method4001(class669.field9309, class143.field1852, (byte) -4);
                        }
                    }
                    if (class66.field737 != null) {
                        class66.field737.method498(arg0 - 13299, class68.field755);
                    }
                    class476.field6580 = null;
                    class321.field4313 = null;
                    class143.field1852 = null;
                    class494.field6734 = 0L;
                    class520.field6997 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class68.field755.method4033(98);
            class476.field6580 = null;
            class321.field4313 = null;
            class226.field2934 = 0;
            class143.field1852 = null;
            class520.field6997 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z", line = 147)
    public static final boolean method2339(int arg0, int arg1) {
        if (arg1 != 255) {
            field5711 = null;
        }
        field5720++;
        return arg0 == 49 || arg0 == 59 || arg0 == 1006 || arg0 == 21 || arg0 == 9;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIII)I", line = 166)
    public static final int method2340(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5716++;
        int var5 = 29 % ((arg1 - 20) / 38);
        int var6 = 65536 - class15.field115[arg3 * 8192 / arg0] >> 1;
        return ((65536 - var6) * arg2 >> 16) + (arg4 * var6 >> 16);
    }
}
