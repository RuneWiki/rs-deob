import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class134 {

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "F")
    public float field2299 = 1.0F;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "F")
    public float field2303 = 1.0F;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "F")
    public float field2306 = 0.25F;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "F")
    public float field2296;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "F")
    public float field2312;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "F")
    public float field2308;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lne;")
    public class262 field2309;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2301 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILjava/lang/String;)V", line = 7)
    public static final void method942(int arg0, int arg1, String arg2) {
        field2307++;
        if (arg1 <= -13) {
            class199 var3 = class173.method1231(false, 2, arg0);
            var3.method1367((byte) 122);
            var3.field3344 = arg2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V", line = 181)
    public class134() {
        this.field2296 = 0.69921875F;
        this.field2300 = -60;
        this.field2294 = class259.field4243;
        this.field2295 = -50;
        this.field2311 = class259.field4239;
        this.field2312 = 1.1523438F;
        this.field2305 = -50;
        this.field2308 = 1.2F;
        this.field2310 = 0;
        if (class12.field381 != null) {
            this.field2309 = class262.method1841(class12.field381[0], class12.field381[1], class12.field381[2], class12.field381[3], class12.field381[4], class12.field381[5]);
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Loe;)V", line = 200)
    public class134(class146 arg0) {
        int var2 = arg0.method1005((byte) 122);
        if ((var2 & 0x1) == 0) {
            this.field2311 = class259.field4239;
        } else {
            this.field2311 = arg0.method1004(3);
        }
        if ((var2 & 0x2) == 0) {
            this.field2312 = 1.1523438F;
        } else {
            this.field2312 = (float) arg0.method989(120) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2296 = 0.69921875F;
        } else {
            this.field2296 = (float) arg0.method989(99) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2308 = 1.2F;
        } else {
            this.field2308 = (float) arg0.method989(112) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2295 = -50;
            this.field2305 = -50;
            this.field2300 = -60;
        } else {
            this.field2295 = arg0.method1050(3);
            this.field2300 = arg0.method1050(3);
            this.field2305 = arg0.method1050(3);
        }
        if ((var2 & 0x20) == 0) {
            this.field2294 = class259.field4243;
        } else {
            this.field2294 = arg0.method1004(3);
        }
        if ((var2 & 0x40) == 0) {
            this.field2310 = 0;
        } else {
            this.field2310 = arg0.method989(106);
        }
        if ((var2 & 0x80) != 0) {
            this.field2309 = class262.method1841(arg0.method989(114), arg0.method989(114), arg0.method989(80), arg0.method989(74), arg0.method989(94), arg0.method989(106));
        } else if (class12.field381 != null) {
            this.field2309 = class262.method1841(class12.field381[0], class12.field381[1], class12.field381[2], class12.field381[3], class12.field381[4], class12.field381[5]);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLoe;)V", line = 33)
    public final void method943(byte arg0, class146 arg1) {
        this.field2303 = (float) (arg1.method1005((byte) 122) * 8) / 255.0F;
        field2297++;
        this.field2306 = (float) (arg1.method1005((byte) 122) * 8) / 255.0F;
        this.field2299 = (float) (arg1.method1005((byte) 122) * 8) / 255.0F;
        if (arg0 <= 77) {
            method944(-37, 29);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Lkj;", line = 51)
    public static final class198 method944(int arg0, int arg1) {
        field2302++;
        if (arg0 != 1) {
            field2301 = (String[]) null;
        }
        class198 var2 = (class198) class280.field4575.method893((long) arg1, arg0 + 101);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field2173.method1404(class66.method525(-1, arg1), class15.method158(arg1, -26846), (byte) -109);
        class198 var4 = new class198();
        var4.field3321 = arg1;
        if (var3 != null) {
            var4.method1352(new class146(var3), arg0 ^ 0xFFFF8ECE);
        }
        class280.field4575.method888((long) arg1, var4, arg0 ^ 0xA);
        return var4;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 77)
    public static void method945(byte arg0) {
        if (arg0 < 83) {
            method944(-41, -37);
        }
        field2301 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V", line = 93)
    public static final void method946(int arg0, byte arg1) {
        field2298++;
        if (arg1 == 100) {
            class199 var2 = class173.method1231(false, 6, arg0);
            var2.method1358(arg1 - 101);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ltk;)V", line = 109)
    public static final void method947(class278 arg0) {
        for (int var1 = arg0.field4523; var1 <= arg0.field4525; var1++) {
            for (int var2 = arg0.field4530; var2 <= arg0.field4544; var2++) {
                class312 var3 = class353.field5644[arg0.field4532][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5078; var4++) {
                        if (var3.field5089[var4] == arg0) {
                            var3.field5078--;
                            for (int var5 = var4; var5 < var3.field5078; var5++) {
                                var3.field5089[var5] = var3.field5089[var5 + 1];
                                var3.field5101[var5] = var3.field5101[var5 + 1];
                            }
                            var3.field5089[var3.field5078] = null;
                            break;
                        }
                    }
                    var3.field5097 = 0;
                    for (int var6 = 0; var6 < var3.field5078; var6++) {
                        var3.field5097 |= var3.field5101[var6];
                    }
                }
            }
        }
    }
}
