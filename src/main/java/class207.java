import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class207 extends class53 {

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field3503 = 0;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    private int field3506 = 10;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    private int field3507 = 2048;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "Lwa;")
    private static class75 field3501 = class66.method560("OFF", false);

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Lwa;")
    public static class75 field3500 = class66.method560(")2", false);

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Lwa;")
    public static class75 field3497 = class66.method560("", false);

    @OriginalMember(owner = "client!li", name = "V", descriptor = "Lwa;")
    public static class75 field3502 = class66.method560("leuchten1:", false);

    @OriginalMember(owner = "client!li", name = "db", descriptor = "Lwa;")
    public static class75 field3510 = field3501;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Lwa;")
    public static class75 field3499 = class66.method560("gr-Un:", false);

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Lcb;")
    public static class267 field3493;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "Lcb;")
    public static class267 field3511;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
    private int[] field3496;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "[I")
    private int[] field3513;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V", line = 5)
    private final void method1528(int arg0) {
        this.field3496 = new int[this.field3506 + arg0];
        field3512++;
        int var2 = 0;
        int var3 = 4096 / this.field3506;
        int var4 = this.field3507 * var3 >> 12;
        this.field3513 = new int[this.field3506 + 1];
        for (int var5 = 0; var5 < this.field3506; var5++) {
            this.field3513[var5] = var2;
            this.field3496[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3513[this.field3506] = 4096;
        this.field3496[this.field3506] = this.field3496[0] + 4096;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1529(boolean arg0) {
        field3511 = null;
        field3502 = null;
        field3500 = null;
        field3493 = null;
        field3510 = null;
        field3499 = null;
        field3497 = null;
        if (arg0) {
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILja;Z)V", line = 65)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field3494++;
        if (!arg2) {
            this.method56((byte) -110);
        }
        if (arg0 == 0) {
            this.field3506 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field3507 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field3503 = arg1.method501(0);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V", line = 109)
    public final void method56(byte arg0) {
        this.method1528(1);
        field3508++;
        if (arg0 != -79) {
            this.field3496 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 119)
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V", line = 147)
    public static final void method1530(int arg0) {
        class116.field1958.method1201(arg0 - 20107);
        field3495++;
        class282.field4855.method1201(-20111);
        if (arg0 != -4) {
            method1530(101);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)[I", line = 171)
    public final int[] method59(int arg0, int arg1) {
        field3505++;
        int[] var3 = this.field878.method1603(arg1, (byte) 117);
        if (arg0 != -15196) {
            field3510 = (class75) null;
        }
        if (this.field878.field3749) {
            int var4 = class50.field814[arg1];
            if (this.field3503 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3506; var12++) {
                    if (var4 >= this.field3513[var12] && this.field3513[var12 + 1] > var4) {
                        if (this.field3496[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class231.method1691(var3, 0, class269.field4644, var11);
            } else {
                for (int var5 = 0; var5 < class269.field4644; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class67.field1178[var5];
                    int var9 = this.field3503;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field3506; var10++) {
                        if (this.field3513[var10] <= var6 && this.field3513[var10 + 1] > var6) {
                            if (var6 < this.field3496[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }
}
