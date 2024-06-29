import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class474 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "S")
    public short field6594;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public int field6604;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "S")
    public short field6597;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field6598;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
    public boolean field6602;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "S")
    public short field6603;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "B")
    public byte field6606;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "[I")
    public static int[] field6605 = new int[2];

    @OriginalMember(owner = "client!en", name = "n", descriptor = "[I")
    public static int[] field6607 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static final void method2731(int arg0) {
        field6599++;
        class552.method3091(class85.field1028, 12618);
        class392.field5252++;
        if (arg0 != 1) {
            return;
        }
        if (class452.field5965 && class606.field8447) {
            int var1 = class409.field5387.method1890(arg0 + 16777214);
            int var2 = class409.field5387.method1893((byte) 106);
            int var3 = var2 - class366.field4832;
            int var4 = var1 - class287.field3789;
            if (var4 < class664.field9452) {
                var4 = class664.field9452;
            }
            if (class460.field6026 > var3) {
                var3 = class460.field6026;
            }
            if ((class85.field1028.field5561 + var4) > (class664.field9452 + class342.field4584.field5561)) {
                var4 = class664.field9452 + class342.field4584.field5561 - class85.field1028.field5561;
            }
            if (class460.field6026 + class342.field4584.field5672 < var3 - -class85.field1028.field5672) {
                var3 = class460.field6026 + class342.field4584.field5672 - class85.field1028.field5672;
            }
            int var5 = var4 + class342.field4584.field5550 - class664.field9452;
            int var6 = var3 + class342.field4584.field5640 - class460.field6026;
            if (class409.field5387.method1889(16777215)) {
                if (class85.field1028.field5662 < class392.field5252) {
                    int var8 = var4 - class34.field486;
                    int var9 = var3 - class593.field8182;
                    if (var8 > class85.field1028.field5626 || -class85.field1028.field5626 > var8 || var9 > class85.field1028.field5626 || -class85.field1028.field5626 > var9) {
                        class371.field4945 = true;
                    }
                }
                if (class85.field1028.field5687 != null && class371.field4945) {
                    class274 var10 = new class274();
                    var10.field3652 = var5;
                    var10.field3651 = var6;
                    var10.field3644 = class85.field1028;
                    var10.field3639 = class85.field1028.field5687;
                    class656.method3743(var10);
                }
            } else {
                if (class371.field4945) {
                    class364.method2122((byte) 3);
                    if (class85.field1028.field5547 != null) {
                        class274 var7 = new class274();
                        var7.field3650 = class271.field3533;
                        var7.field3651 = var6;
                        var7.field3644 = class85.field1028;
                        var7.field3639 = class85.field1028.field5547;
                        var7.field3652 = var5;
                        class656.method3743(var7);
                    }
                    if (class271.field3533 != null && client.method3861(class85.field1028) != null) {
                        class159.method978(arg0 ^ 0x9, class85.field1028, class271.field3533);
                    }
                } else if ((class52.field665 == 1 || class274.method1650(0)) && class137.field1873 > 2) {
                    class502.method2849((byte) 82, class34.field486 + class287.field3789, class593.field8182 + class366.field4832);
                } else if (class398.method2276(-9772)) {
                    class502.method2849((byte) 82, class34.field486 + class287.field3789, class593.field8182 + class366.field4832);
                }
                class85.field1028 = null;
            }
        } else if (class392.field5252 > 1) {
            class85.field1028 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
    public static final int method2732(boolean arg0) {
        field6600++;
        return arg0 ? -74 : 19;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6594 = (short) arg4;
        this.field6604 = arg0;
        this.field6597 = (short) arg5;
        this.field6595 = arg3;
        this.field6601 = arg1;
        this.field6598 = arg11;
        this.field6602 = arg10;
        this.field6603 = (short) arg6;
        this.field6606 = (byte) arg8;
        this.field6596 = arg2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method2733(byte arg0) {
        field6607 = null;
        if (arg0 != 16) {
            method2731(-53);
        }
        field6605 = null;
    }
}
