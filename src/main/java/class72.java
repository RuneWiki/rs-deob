import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class72 extends class108 {

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lim;")
    public static class353 field990 = new class353(12, 2);

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
    public static int[] field1000 = new int[1];

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lbu;")
    public class137 field978;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "Ldg;")
    public class20 field991;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Lju;")
    public class213 field993;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "Lju;")
    public class213 field996;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Lrh;")
    public static class44 field995;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Ljc;")
    public class585 field986;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field1002;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
    public boolean field987;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[I")
    public int[] field982;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        field985++;
        if (arg0 != 30896) {
            this.field999 = 1;
        }
        int var2 = this.field999;
        if (this.field978 != null) {
            class137 var5 = this.field978.method722(class257.field3191, -1);
            if (var5 == null) {
                this.field975 = 0;
                this.field976 = 0;
                this.field994 = 0;
                this.field998 = 0;
                this.field982 = null;
                this.field999 = -1;
            } else {
                this.field976 = var5.field1754;
                this.field994 = var5.field1685;
                this.field999 = var5.field1713;
                this.field975 = var5.field1681 << 9;
                this.field982 = var5.field1684;
                this.field998 = var5.field1703;
            }
        } else if (this.field986 != null) {
            int var3 = class375.method2292(115, this.field986);
            if (var2 != var3) {
                this.field999 = var3;
                class626 var4 = this.field986.field8478;
                if (var4.field9085 != null) {
                    var4 = var4.method3607(false, class257.field3191);
                }
                if (var4 == null) {
                    this.field994 = this.field975 = 0;
                } else {
                    this.field994 = var4.field9054;
                    this.field975 = var4.field9055 << 9;
                }
            }
        } else if (this.field991 != null) {
            this.field999 = class105.method576((byte) 100, this.field991);
            this.field975 = this.field991.field265 << 9;
            this.field994 = this.field991.field279;
        }
        if (this.field999 != var2 && this.field993 != null) {
            class92.field1224.method250(this.field993);
            this.field993 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static final void method422(boolean arg0) {
        field997++;
        class241.method1497(-101);
        class124.method669(2, 22050, -53, class501.field6954.field7845);
        class288.field3759 = class486.method2742(class141.field1806, 22050, 0, -1, class31.field488);
        class288.field3759.method332((byte) -107, class641.field9317);
        class226.field2891 = class486.method2742(class141.field1806, 2048, 1, -1, class31.field488);
        if (!arg0) {
            method423(112, -58, -78);
        }
        class226.field2891.method332((byte) -108, class92.field1224);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
    public static final int method423(int arg0, int arg1, int arg2) {
        field984++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg0 != 8689) {
            method426(false);
        }
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BI)Z")
    public static final boolean method424(byte[] arg0, int arg1) {
        field977++;
        class551 var2 = new class551(arg0);
        if (arg1 != -23938) {
            return false;
        }
        int var3 = var2.method3045(-126);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3045(arg1 + 23812) == 1;
        if (var4) {
            class10.method46(var2, false);
        }
        class248.method1521(var2, -109);
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1000 = null;
        field1002 = null;
        field990 = null;
        field995 = null;
        if (arg0 > -5) {
            method423(-34, -58, -124);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)I")
    public static final int method426(boolean arg0) {
        field981++;
        if ((double) class614.field8837 == 3.0D) {
            return 37;
        } else if (!arg0) {
            return -87;
        } else if ((double) class614.field8837 == 4.0D) {
            return 50;
        } else if ((double) class614.field8837 == 6.0D) {
            return 75;
        } else if ((double) class614.field8837 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
