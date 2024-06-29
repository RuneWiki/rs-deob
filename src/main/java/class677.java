import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class677 {

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "[Lhn;")
    public static class718[] field9557 = new class718[14];

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public int field9558;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "[Lci;")
    public class447[] field9559;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public static final void method3829(byte arg0) {
        field9553++;
        if (class756.method4199(class611.field8839, 0) || class428.method2601(class611.field8839, (byte) -121)) {
            class128.method991(class260.field3810 >> 12, 4602, class685.field9660 >> 12, 5000);
        } else {
            int var1 = class468.field6748.field991[0] >> 3;
            int var2 = class468.field6748.field995[0] >> 3;
            if (var1 >= 0 && var1 < (class174.field2540 >> 3) && var2 >= 0 && class716.field9999 >> 3 > var2) {
                class128.method991(var2, 4602, var1, 5000);
            } else {
                class128.method991(class716.field9999 >> 4, 4602, class174.field2540 >> 4, 0);
            }
        }
        class700.method3934(false);
        class430.method2613(66);
        class623.method3607(false);
        if (arg0 >= -117) {
            field9552 = 8;
        }
        method3832((byte) 125);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lud;B)V")
    public final void method3830(class35 arg0, byte arg1) {
        this.field9558 = arg0.method239(-31);
        field9556++;
        this.field9555 = arg0.method253(-13900);
        this.field9559 = new class447[arg0.method273(255)];
        class551[] var3 = class316.method2035(16384);
        int var4 = -37 / ((-arg1 - 68) / 57);
        for (int var5 = 0; var5 < this.field9559.length; var5++) {
            this.field9559[var5] = this.method3833((byte) 106, var3[arg0.method273(255)], arg0);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FLse;IIFFFFIII)[B")
    public static final byte[] method3831(float arg0, class255 arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        if (arg10 == 2046) {
            field9554++;
            byte[] var11 = new byte[arg8 * arg9 * arg2];
            class544.method3218(var11, arg5, arg7, arg6, arg9, arg3, arg1, arg2, 0, arg0, arg4, true, arg8);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
    public static final void method3832(byte arg0) {
        field9560++;
        if (arg0 <= 117) {
            method3834(-128);
        }
        class532.field7530.method636(class360.field5051, class471.field6781.field6673.method2920(27669) == 1 ? class420.field5907 + 256 << 2 : -1, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLjw;Lud;)Lci;")
    private final class447 method3833(byte arg0, class551 arg1, class35 arg2) {
        field9551++;
        if (class630.field9039 == arg1) {
            return class731.method4074(arg2, (byte) 61);
        } else if (class438.field6122 == arg1) {
            return class73.method735(arg2, -11043);
        } else if (class676.field9502 == arg1) {
            return class698.method3920(-22767, arg2);
        } else if (class54.field1031 == arg1) {
            return class63.method679(arg2, false);
        } else if (class375.field5253 == arg1) {
            return class698.method3923(arg2, (byte) 46);
        } else {
            if (arg0 != 106) {
                this.field9558 = -40;
            }
            if (class601.field8731 == arg1) {
                return class523.method3099(255, arg2);
            } else if (class415.field5814 == arg1) {
                return class259.method1758(arg2, (byte) 104);
            } else if (class70.field1259 == arg1) {
                return class552.method3232((byte) 81, arg2);
            } else if (class519.field7368 == arg1) {
                return class25.method153((byte) -104, arg2);
            } else if (class459.field6630 == arg1) {
                return class335.method2139(3, arg2);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method3834(int arg0) {
        if (arg0 >= -65) {
            field9552 = -57;
        }
        field9557 = null;
    }
}
