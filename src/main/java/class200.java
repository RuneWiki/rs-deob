import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class200 extends class59 {

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    private int field3968 = 0;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    private int field3976 = 4096;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "[I")
    public static int[] field3961 = new int[5];

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lsd;")
    private static class166 field3964 = class135.method935("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
    public static int[] field3970 = new int[500];

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lsd;")
    public static class166 field3969 = field3964;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lsd;")
    public static class166 field3972 = class135.method935("gelb:", 0);

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lsd;")
    public static class166 field3967 = class135.method935("Zu viele Verbindungen von Ihrer Adresse)3", 0);

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static volatile int field3975 = -1;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "[I")
    public static int[] field3974 = new int[50];

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ltb;I)V")
    public static final void method1318(class173 arg0, int arg1) {
        if (arg0.field3301 != null) {
            arg0.field3301.field4038 = 0;
        }
        arg0.field3303 = false;
        int var2 = 108 / ((43 - arg1) / 46);
        for (class173 var3 = arg0.method312(); var3 != null; var3 = arg0.method304()) {
            method1318(var3, -57);
        }
        ++field3973;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static void method1319(int arg0) {
        if (arg0 != 28264) {
            field3969 = null;
        }
        field3970 = null;
        field3972 = null;
        field3967 = null;
        field3969 = null;
        field3974 = null;
        field3964 = null;
        field3961 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLaa;I)V")
    public static final void method1320(boolean arg0, class2 arg1, int arg2) {
        ++field3971;
        if (class156.field2997 != null) {
            try {
                class156.field2997.method12((byte) 9);
            } catch (Exception var8) {
            }
            class156.field2997 = null;
        }
        class156.field2997 = arg1;
        class49.method378((byte) -122, arg0);
        class22.field383.field1000 = 0;
        class60.field1237 = null;
        if (arg2 == -7266) {
            class145.field2837 = null;
            class179.field3389 = 0;
            while (true) {
                class89 var3 = (class89) class178.field3370.method221(0);
                if (var3 == null) {
                    while (true) {
                        class89 var4 = (class89) class45.field808.method221(arg2 ^ -7266);
                        if (var4 == null) {
                            if (class128.field2514 != 0) {
                                try {
                                    class53 var5 = new class53(4);
                                    var5.method429(4, (byte) 106);
                                    var5.method429(class128.field2514, (byte) 91);
                                    var5.method407((byte) -118, 0);
                                    class156.field2997.method15(4, 0, (byte) -91, var5.field988);
                                } catch (IOException var7) {
                                    try {
                                        class156.field2997.method12((byte) 33);
                                    } catch (Exception var6) {
                                    }
                                    class156.field2997 = null;
                                    ++class58.field1193;
                                }
                            }
                            class41.field727 = 0;
                            class19.field330 = class100.method748((byte) 35);
                            return;
                        }
                        class136.field2656.method781(arg2 ^ 27127, var4);
                        class89.field1748.method216(var4, arg2 ^ -11756, var4.field2541);
                        ++class34.field629;
                        --class120.field2357;
                    }
                }
                class6.field124.method216(var3, 12682, var3.field2541);
                ++class184.field3518;
                --class137.field2677;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class200() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field3976 = arg0.method405(2);
            }
        } else {
            this.field3968 = arg0.method405(2);
        }
        if (arg1 < 18) {
            this.field3976 = 12;
        }
        ++field3962;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILud;)V")
    public static final void method1321(int arg0, int arg1, class184 arg2) {
        ++field3965;
        if (class49.field910 >= arg2.field3475) {
            if (class49.field910 > arg2.field3479) {
                class42.method289(arg0 + -3, arg2);
            } else {
                class70.method565(arg2, false);
            }
        } else {
            class141.method964(true, arg2);
        }
        if (arg0 > arg2.field3526 || arg2.field3513 < 128 || arg2.field3526 >= 13184 || ~arg2.field3513 <= -13185) {
            arg2.field3501 = -1;
            arg2.field3513 = arg2.field3521[0] * 128 + arg2.field3490 * 64;
            arg2.field3475 = 0;
            arg2.field3543 = -1;
            arg2.field3526 = arg2.field3554[0] * 128 + arg2.field3490 * 64;
            arg2.field3479 = 0;
            arg2.method1244((byte) 51);
        }
        if (class41.field728 == arg2 && (~arg2.field3526 > -1537 || ~arg2.field3513 > -1537 || ~arg2.field3526 <= -11777 || arg2.field3513 >= 11776)) {
            arg2.field3526 = arg2.field3554[0] * 128 - -(arg2.field3490 * 64);
            arg2.field3501 = -1;
            arg2.field3543 = -1;
            arg2.field3513 = arg2.field3521[0] * 128 + arg2.field3490 * 64;
            arg2.field3475 = 0;
            arg2.field3479 = 0;
            arg2.method1244((byte) 51);
        }
        class119.method862(13959, arg2);
        class121.method874(3532, arg2);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field3966;
        if (arg1 >= -124) {
            this.method36(66, (byte) 111);
        }
        int[] var3 = super.field1219.method721(arg0, -125);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0, 0);
            for (int var5 = 0; ~var5 > ~class98.field1879; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3968 && this.field3976 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
