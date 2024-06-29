import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class25 implements class262 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 17)
    public final String method228(int arg0, int arg1, int[] arg2, long arg3) {
        if (arg0 > -99) {
            return (String) null;
        }
        field425++;
        if (arg1 == 0) {
            class168 var7 = class188.method1359(arg2[0], 0);
            return var7.method1259((int) arg3, true);
        } else if (arg1 == 1 || arg1 == 10) {
            class135 var6 = class188.method1361(true, (int) arg3);
            return var6.field2200;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class188.method1359(arg2[0], 0).method1259((int) arg3, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 51)
    public static final int method229(int arg0, int arg1) {
        field420++;
        return arg1 == -1 ? arg0 >>> 8 : 56;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 64)
    public static final void method230(byte arg0) {
        if (arg0 <= -78) {
            class195.field3013.method2282((byte) -126);
            field427++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 76)
    public static final void method231(int arg0) {
        if (arg0 != 28413) {
            return;
        }
        field421++;
        for (class32 var1 = (class32) class242.field3627.method268(-1); var1 != null; var1 = (class32) class242.field3627.method278(arg0 ^ 0x6EFC)) {
            class288 var2 = var1.field493;
            if (class75.field1153 != var2.field4509 || class307.field4869 > var2.field4520) {
                var1.method489(false);
            } else if (class307.field4869 >= var2.field4525) {
                if (var2.field4543 > 0) {
                    class86 var3 = class197.field3029[var2.field4543 - 1];
                    if (var3 != null && var3.field4671 >= 0 && var3.field4671 < 13312 && var3.field4672 >= 0 && var3.field4672 < 13312) {
                        var2.method2029(class307.field4869, var3.field4671, var3.field4672, (byte) -127, class170.method1265(var3.field4671, var3.field4672, var2.field4509, 1) - var2.field4505);
                    }
                }
                if (var2.field4543 < 0) {
                    int var4 = -var2.field4543 - 1;
                    class92 var5;
                    if (class75.field1146 == var4) {
                        var5 = class345.field5363;
                    } else {
                        var5 = class74.field1140[var4];
                    }
                    if (var5 != null && var5.field4671 >= 0 && var5.field4671 < 13312 && var5.field4672 >= 0 && var5.field4672 < 13312) {
                        var2.method2029(class307.field4869, var5.field4671, var5.field4672, (byte) -123, class170.method1265(var5.field4671, var5.field4672, var2.field4509, arg0 - 28412) - var2.field4505);
                    }
                }
                var2.method2026(class137.field2241, (byte) 102);
                class149.method1132(class75.field1153, (int) var2.field4512, (int) var2.field4529, (int) var2.field4521, 60, var2, var2.field4537, -1L, false);
            }
        }
    }
}
