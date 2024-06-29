import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class239 implements class113 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lum;")
    private class490 field3365;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Loi;")
    private class67 field3367;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lmga;")
    public static class666 field3366 = new class666(50);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lvd;")
    public static class36 field3369;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBLjava/lang/String;ILta;)I", line = 4)
    private final int method1478(int arg0, int arg1, byte arg2, String arg3, int arg4, class200 arg5) {
        if (arg2 > -7) {
            return -122;
        } else {
            field3359++;
            return arg5.method1301(this.field3367.field1015, 0, arg0 + arg1, (byte) 127, this.field3367.field1022 - arg1 * 2, 0, arg1 + arg4, arg3, 0, null, null, 0, this.field3367.field1014 - (arg1 * 2), this.field3367.field1025, 0, null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method912(boolean arg0, int arg1) {
        if (arg1 != -20667) {
            this.method911((byte) 35);
        }
        field3364++;
        class561 var3 = this.field3365.method2736(93, this.field3367.field1026);
        if (var3 == null) {
            return;
        }
        int var4 = this.field3367.field1023.method1358(0, this.field3367.field1014, class641.field8619) + this.field3367.field1020;
        int var5 = this.field3367.field1016.method3790(this.field3367.field1022, 111, class305.field4229) + this.field3367.field1018;
        if (this.field3367.field1027) {
            class10.field197.method423(var4, var5, this.field3367.field1014, this.field3367.field1022, this.field3367.field1021, 0);
        }
        int var6 = var5 + this.method1478(var5, 5, (byte) -59, var3.field7438, var4, class450.field6177) * 12;
        int var9 = var6 + 8;
        if (this.field3367.field1027) {
            class10.field197.method384(var4, var9, var4 + this.field3367.field1014 - 1, var9, this.field3367.field1021, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1478(var6, 5, (byte) -57, var3.field7437, var4, class450.field6177) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1478(var10, 5, (byte) -108, var3.field7439, var4, class450.field6177) * 12;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)[Lnga;", line = 59)
    public static final class480[] method1479(int arg0) {
        if (class370.field4997 == null) {
            class480[] var1 = class637.method3518(-8114, class688.field9669);
            class480[] var2 = new class480[var1.length];
            int var3 = 0;
            int var4 = class344.field4718.method1558((byte) 90, class571.field7587);
            label74: for (int var5 = 0; var5 < var1.length; var5++) {
                class480 var9 = var1[var5];
                if ((var9.field6401 <= 0 || var9.field6401 >= 24) && var9.field6403 >= 800 && var9.field6410 >= 600 && (var4 != 2 || var9.field6403 <= 800 && var9.field6410 <= 600) && (var4 != 1 || var9.field6403 <= 1024 && var9.field6410 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class480 var11 = var2[var10];
                        if (var9.field6403 == var11.field6403 && var9.field6410 == var11.field6410) {
                            if (var11.field6401 < var9.field6401) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class370.field4997 = new class480[var3];
            class83.method685(var2, 0, class370.field4997, 0, var3);
            int[] var6 = new int[class370.field4997.length];
            for (int var7 = 0; var7 < class370.field4997.length; var7++) {
                class480 var8 = class370.field4997[var7];
                var6[var7] = var8.field6410 * var8.field6403;
            }
            class38.method297(var6, -32153, class370.field4997);
        }
        if (arg0 > -123) {
            field3369 = null;
        }
        field3361++;
        return class370.field4997;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z", line = 148)
    public static final boolean method1480(int arg0, int arg1, int arg2) {
        field3362++;
        if (arg0 != 16723) {
            field3366 = null;
        }
        return class115.method914((byte) 106, arg1, arg2) || class173.method1172(-970, arg1, arg2);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 161)
    public static void method1481(byte arg0) {
        field3366 = null;
        if (arg0 <= 5) {
            field3366 = null;
        }
        field3369 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z", line = 176)
    public static final boolean method1482(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3366 = null;
        }
        field3368++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 187)
    public final void method911(byte arg0) {
        field3363++;
        if (arg0 != -13) {
            this.method913(-121);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lum;Loi;)V", line = 197)
    public class239(class490 arg0, class67 arg1) {
        this.field3365 = arg0;
        this.field3367 = arg1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z", line = 206)
    public final boolean method913(int arg0) {
        if (arg0 < 13) {
            method1481((byte) -103);
        }
        field3360++;
        return this.field3365.method2735(-99);
    }
}
