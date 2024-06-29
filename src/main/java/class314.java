import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class314 extends class278 {

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    private int field4296 = 0;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field4306 = 1365;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field4305 = 0;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    private int field4307 = 20;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Ljm;")
    public static class485 field4297 = new class485(42, 3);

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Luf;")
    public static class310 field4304 = new class310(38, 9);

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "F")
    public static float field4303;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method208(int arg0, int arg1) {
        ++field4298;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            for (int var4 = 0; class507.field7456 > var4; ++var4) {
                int var5 = (class192.field2736[var4] << 12) / this.field4306 + this.field4296;
                int var6 = (class454.field6637[arg1] << 12) / this.field4306 + this.field4305;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && this.field4307 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - (var12 - var7);
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field4307 + -1) < ~var13 ? (var13 << 12) / this.field4307 : 0;
            }
        }
        if (arg0 != -9) {
            this.field4307 = -100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 61)
    public static final boolean method1775(byte arg0, String arg1) {
        ++field4300;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class223.field3106; ++var2) {
                if (arg1.equalsIgnoreCase(class52.field702[var2])) {
                    return true;
                }
            }
            if (arg1.equalsIgnoreCase(class75.field1089.field2693)) {
                return true;
            } else {
                if (arg0 <= 84) {
                    field4304 = null;
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llh;II)V", line = 90)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field4299;
        if (arg1 != -30446) {
            method1777(false);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field4305 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field4296 = arg0.method2062((byte) 14);
                }
            } else {
                this.field4307 = arg0.method2062((byte) 14);
            }
        } else {
            this.field4306 = arg0.method2062((byte) 14);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 148)
    public class314() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 152)
    public static final void method1776(byte arg0) {
        ++field4301;
        if (arg0 >= -118) {
            method1775((byte) 6, (String) null);
        }
        if (~class294.field3922 != 0) {
            class151.method957(class294.field3922, -1, 98, -1, false);
            class294.field3922 = -1;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V", line = 172)
    public static final void method1777(boolean arg0) {
        if (arg0) {
            ++field4302;
            class385.field5412 = null;
            class87.method610(class351.field4795, 0, 0, -1, 0, class177.field2513, class319.field4419, (byte) -65, 0);
            if (class385.field5412 != null) {
                class13.method110(0, class177.field2513, -1412584499, class351.field4795, class433.field6313, class385.field5412, class177.field2509.field3956, 0, -122, class499.field7347);
                class385.field5412 = null;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V", line = 191)
    public static void method1778(byte arg0) {
        if (arg0 == -15) {
            field4304 = null;
            field4297 = null;
        }
    }
}
