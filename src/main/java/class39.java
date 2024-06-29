import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class39 extends class214 {

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field665 = 1;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    private int field667 = 0;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lfl;")
    public static class345 field669 = new class345("WIP", 2);

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lll;")
    public static class248 field674 = new class248("WTWIP", 3);

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Lln;")
    public static class35 field664;

    // $FF: synthetic field
    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field675;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "[[Lms;")
    public static class363[][] field666;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjr;)V")
    public static final void method318(int arg0, class103 arg1) {
        ++field662;
        if (class455.field6293 != null) {
            class278 var2 = null;
            if (arg1.field1472 == 0) {
                var2 = (class278) class37.method309(arg1.field1471, arg1.field1465, arg1.field1470);
            }
            if (~arg1.field1472 == -2) {
                var2 = (class278) class245.method1528(arg1.field1471, arg1.field1465, arg1.field1470);
            }
            if (arg1.field1472 == 2) {
                var2 = (class278) class75.method518(arg1.field1471, arg1.field1465, arg1.field1470, field675 != null ? field675 : (field675 = method322("wk")));
            }
            if (arg1.field1472 == arg0) {
                var2 = (class278) class292.method1807(arg1.field1471, arg1.field1465, arg1.field1470);
            }
            if (var2 == null) {
                arg1.field1463 = -1;
                arg1.field1474 = 0;
                arg1.field1475 = 0;
            } else {
                arg1.field1463 = var2.method211(true);
                arg1.field1474 = var2.method219(-17942);
                arg1.field1475 = var2.method215(arg0 ^ -11521);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field672;
        if (arg0 != 123) {
            return null;
        } else {
            int[] var3 = super.field3024.method2585(arg1, 0);
            if (super.field3024.field6135) {
                int var4 = class56.field909[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class399.field5585; ++var6) {
                    int var7 = class436.field5989[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field667 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field665 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field665;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (this.field668 == 0) {
                        var12 = class406.field5629[255 & var12 >> 4] + 4096 >> 1;
                    } else if (this.field668 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public static final void method319(int arg0, int arg1) {
        ++field670;
        class104 var2 = class152.field2155;
        synchronized (class152.field2155) {
            class152.field2155.method666(arg1, false);
            if (arg0 != 2048) {
                field669 = null;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class39() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field661;
        if (arg1 >= -114) {
            method318(-103, (class103) null);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field665 = arg0.method2503(true);
                }
            } else {
                this.field668 = arg0.method2503(true);
            }
        } else {
            this.field667 = arg0.method2503(true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method320(String arg0, byte arg1) {
        ++field663;
        if (arg0 == null) {
            return -1;
        } else if (arg1 > -118) {
            return -31;
        } else {
            for (int var2 = 0; var2 < class205.field2934; ++var2) {
                if (arg0.equalsIgnoreCase(class321.field4403[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        if (arg0 == 27108) {
            class407.method2390((byte) -123);
            ++field673;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method321(byte arg0) {
        field666 = null;
        field664 = null;
        int var1 = 112 / ((arg0 - -32) / 48);
        field674 = null;
        field669 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method322(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
