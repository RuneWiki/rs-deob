import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class675 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    private int field9214;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field9221 = 0;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!dr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9223++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ)V")
    public static final void method3741(int arg0, boolean arg1) {
        field9220++;
        if (arg1) {
            method3744((byte) 76);
        }
        class243 var2 = class546.method2926(arg0, 12, true);
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static final void method3742(int arg0) {
        if (arg0 <= 79) {
            field9219 = -20;
        }
        if (class290.field3671 >= 0) {
            long var1 = class321.method1854(-30);
            class290.field3671 = (int) ((long) class290.field3671 - (var1 - class122.field1485));
            if (class290.field3671 <= 0) {
                class618.field8379 = class203.field2362.field3601;
                class109.field1359 = class203.field2362.field3596;
                class290.field3671 = -1;
                class195.field2301 = class203.field2362.field3597;
                class667.field9052 = class203.field2362.field3598;
                class383.field4926 = class203.field2362.field3594;
                class447.field5614 = class203.field2362.field3592;
                class16.field161 = class203.field2362.field3591;
                class293.field3730 = class203.field2362.field3603;
                class17.field180 = class203.field2362.field3604;
                class226.field2919 = class203.field2362.field3607;
            } else {
                int var3 = (class290.field3671 << 8) / class213.field2502;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class383.field4926 = ((class364.field4661 & 0xFF00) * var3 + (class203.field2362.field3594 & 0xFF00) * var4 & 0xFF0000) + ((class364.field4661 & 0xFF00FF) * var3 + (class203.field2362.field3594 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class109.field1359 = (class203.field2362.field3596 - class371.field4789) * var6 + class371.field4789;
                class195.field2301 = (class203.field2362.field3597 - class33.field518) * var6 + class33.field518;
                class226.field2919 = (class203.field2362.field3607 - class437.field5503) * var6 + class437.field5503;
                class16.field161 = ((class93.field1188 & 0xFF00) * var3 + (class203.field2362.field3591 & 0xFF00) * var4 & 0xFF0000) + ((class93.field1188 & 0xFF00FF) * var3 + (class203.field2362.field3591 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class447.field5614 = (class203.field2362.field3592 - class132.field1599) * var6 + class132.field1599;
                class17.field180 = (class203.field2362.field3604 - class398.field5056) * var6 + class398.field5056;
                class293.field3730 = (class203.field2362.field3603 - class345.field4391) * var6 + class345.field4391;
                class618.field8379 = class427.field5398 * var3 + (class203.field2362.field3601 * var4) >> 8;
                if (class337.field4165 != class203.field2362.field3598) {
                    class667.field9052 = class71.field919.method351(class337.field4165, class203.field2362.field3598, var6, class667.field9052);
                }
            }
            class122.field1485 = var1;
        }
        field9218++;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static final void method3743(int arg0) {
        if (arg0 != 1937021704) {
            field9219 = -83;
        }
        field9222++;
        class83.field1067 = 0;
        class389.field4997 = 0;
        class243.field3140 = 0;
        class38.field569 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static final void method3744(byte arg0) {
        field9215++;
        if (arg0 != 74) {
            method3742(-110);
        }
        if (class470.field5804 == 7) {
            class349.method2010(false, true);
        } else {
            class215.field2513 = class335.field4139;
            class335.field4139 = null;
            class78.method609(10503, 13);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(II)V")
    public class675(int arg0, int arg1) {
        this.field9217 = arg1;
        this.field9214 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)I")
    public final int method3745(int arg0) {
        int var2 = -72 / ((54 - arg0) / 57);
        field9216++;
        return this.field9214;
    }
}
