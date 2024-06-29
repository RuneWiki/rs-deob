import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class107 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    public static int[] field1818 = new int[14];

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1821 = " more options";

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
    public static final void method823(int arg0, byte arg1) {
        field1825++;
        class279 var2 = class111.method844(arg0, 9, -1780180960);
        var2.method1934((byte) -114);
        if (arg1 != 76) {
            field1818 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static final void method824(byte arg0) {
        if (arg0 >= -120) {
            field1826 = 53;
        }
        if (class79.field1275 == 2) {
            if (class211.field3113 == class121.field1991 && class57.field842 == class299.field4833) {
                class79.field1275 = 0;
                if (class225.field3307 && class82.field1326[81] && class147.field2360 > 2) {
                    class7.method41((byte) -29, class147.field2360 - 2);
                } else {
                    class7.method41((byte) -29, class147.field2360 - 1);
                }
            }
        } else if (class17.field187 == class121.field1991 && class299.field4833 == class13.field153) {
            class79.field1275 = 0;
            if (class225.field3307 && class82.field1326[81] && class147.field2360 > 2) {
                class7.method41((byte) -29, class147.field2360 - 2);
            } else {
                class7.method41((byte) -29, class147.field2360 - 1);
            }
        } else {
            class79.field1275 = 2;
            class57.field842 = class13.field153;
            class211.field3113 = class17.field187;
        }
        field1820++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field1818 = null;
        int var1 = -63 % ((arg0 - 17) / 45);
        field1821 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLmh;Z)V")
    public static final void method826(byte arg0, class263 arg1, boolean arg2) {
        if (arg0 < 61) {
            field1826 = -13;
        }
        int var3 = arg1.field4171 == 0 ? arg1.field4215 : arg1.field4171;
        field1824++;
        int var4 = arg1.field4207 == 0 ? arg1.field4046 : arg1.field4207;
        class186.method1329(arg1.field4083, 0, class134.field2195[arg1.field4083 >> 16], var4, var3, arg2);
        if (arg1.field4143 != null) {
            class186.method1329(arg1.field4083, 0, arg1.field4143, var4, var3, arg2);
        }
        class133 var5 = (class133) class251.field3793.method1073(-1, (long) arg1.field4083);
        if (var5 != null) {
            class81.method608(false, var3, arg2, var5.field2187, var4);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)I")
    public static final int method827(byte arg0, int arg1, int arg2) {
        if (arg0 != -4) {
            field1821 = null;
        }
        int var3 = class254.method1747(arg1 - 1, arg2 + -1, arg0 - 2147483645) + (class254.method1747(arg1 + 1, arg2 + -1, Integer.MAX_VALUE) + class254.method1747(arg1 - 1, arg2 + 1, Integer.MAX_VALUE)) + class254.method1747(arg1 + 1, arg2 - -1, Integer.MAX_VALUE);
        field1819++;
        int var4 = class254.method1747(arg1 - 1, arg2, arg0 - 2147483645) + class254.method1747(arg1 + 1, arg2, Integer.MAX_VALUE) + class254.method1747(arg1, arg2 + -1, arg0 + -2147483645) + class254.method1747(arg1, arg2 + 1, Integer.MAX_VALUE);
        int var5 = class254.method1747(arg1, arg2, Integer.MAX_VALUE);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method828(int arg0) {
        if (arg0 != -26080) {
            field1821 = null;
        }
        for (class133 var1 = (class133) class251.field3793.method1071(-126); var1 != null; var1 = (class133) class251.field3793.method1069(arg0 + 25957)) {
            int var2 = var1.field2187;
            if (class309.method2092(91923, var2)) {
                boolean var3 = true;
                class263[] var4 = class134.field2195[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4167;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4008;
                    class263 var7 = class144.method1078(var6, 8534);
                    if (var7 != null) {
                        class63.method476(var7, arg0 ^ 0xFFFFAD39);
                    }
                }
            }
        }
        field1823++;
    }
}
