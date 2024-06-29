import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class78 extends class4 {

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field1096 = -1;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "Lv;")
    public class241 field1095;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "[B")
    public byte[] field1100;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILii;Lar;I)V")
    public static final void method565(int arg0, int arg1, class405 arg2, class47 arg3, int arg4) {
        class56.field747.method335((byte) -35);
        ++field1101;
        if (!class69.field886) {
            for (class246 var5 = (class246) arg3.method332(arg4 ^ -2130853843); var5 != null; var5 = (class246) arg3.method343((byte) -96)) {
                class7 var6 = class99.method674(36, var5.field3323);
                if (class355.method2333(16037, var6)) {
                    boolean var7 = class253.method1548(arg1, var6, arg2, (byte) -128, var5, arg0);
                    if (var7) {
                        class86.method613(var5, -2692, var6, arg2);
                    }
                }
            }
            if (arg4 != 12685) {
                field1096 = 43;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)I")
    public final int method27(byte arg0) {
        if (arg0 != -29) {
            method566(true);
        }
        ++field1103;
        return super.field50 ? 0 : 100;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V")
    public static final void method566(boolean arg0) {
        if (arg0) {
            class213.field2852 = class99.field1387;
            class12.field205 = class191.field2557;
        } else {
            class213.field2852 = class92.field1299;
            class12.field205 = class265.field3846;
        }
        class180.field2380 = class213.field2852.length;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
    public static final void method567(int arg0, int arg1) {
        ++field1098;
        if (!class434.field6387) {
            arg1 = -1;
        }
        if (class75.field1066 != arg1) {
            if (arg1 != -1) {
                class230 var2 = class167.method1029(69609580, arg1);
                class441 var3 = var2.method1388((byte) -90);
                if (var3 != null) {
                    class76.field1085.method260(var3.method2769(), (byte) -125, var3.method2775(), var3.method2767(), new Point(var2.field3072, var2.field3081), class202.field2708);
                    class75.field1066 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg0 == arg1 && class75.field1066 != -1) {
                class76.field1085.method260(-1, (byte) -125, (int[]) null, -1, new Point(), class202.field2708);
                class75.field1066 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Llm;Z)V")
    public static final void method568(class347 arg0, boolean arg1) {
        ++field1099;
        class213.field2851 = arg0;
        if (!arg1) {
            field1096 = -127;
        }
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)I")
    public static final int method569(int arg0) {
        if (arg0 != -1) {
            field1096 = 98;
        }
        ++field1102;
        if (!class2.field26 && class212.field2844 > 0) {
            return class404.field6009 && class30.field437[81] && ~class212.field2844 < -3 ? ((class212) class321.field4726.field663.field641.field641).field2832 : ((class212) class321.field4726.field663.field641).field2832;
        } else {
            int var1 = class124.field1728;
            int var2 = class323.field4747;
            int var3 = class99.field1385;
            int var4 = class435.field6395;
            int var5 = class390.field5616;
            if (var1 > var3 && ~(var3 - -var5) < ~var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class212.field2844; ++var7) {
                    if (!class282.field4109) {
                        int var11 = (-var7 + class212.field2844 + -1) * 16 + var4 + 31;
                        if (var11 + -13 < var2 && ~var2 >= ~(var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class212.field2844 + -1 + -var7) * 16 + 33 + var4;
                        if (var12 + -13 < var2 && ~var2 >= ~(var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class179 var9 = new class179(class321.field4726);
                    for (class212 var10 = (class212) var9.method1092((byte) 54); var10 != null; var10 = (class212) var9.method1097((byte) -107)) {
                        if (~var6 == ~(var8++)) {
                            return var10.field2832;
                        }
                    }
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)[B")
    public final byte[] method25(int arg0) {
        ++field1093;
        if (arg0 != 25539) {
            field1096 = 61;
        }
        if (super.field50) {
            throw new RuntimeException();
        } else {
            return this.field1100;
        }
    }
}
