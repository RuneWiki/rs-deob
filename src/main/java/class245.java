import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class245 extends class219 {

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    private int field4075 = 585;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "Lbd;")
    public static class162 field4068 = class17.method142(0, "scape main");

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Lbd;")
    public static class162 field4074 = null;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Lbd;")
    public static class162 field4069 = class17.method142(0, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field4080 = 0;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lbd;")
    public static class162 field4078 = class17.method142(0, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Z")
    public static boolean field4081 = false;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)V", line = 14)
    public static final void method1729(byte arg0) {
        field4077++;
        class270.field4514 = true;
        if (arg0 >= -44) {
            field4081 = false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 25)
    public static void method1730(int arg0) {
        field4068 = null;
        field4074 = null;
        int var1 = -117 / ((arg0 + 56) / 43);
        field4069 = null;
        field4078 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)[I", line = 38)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field4072++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1];
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                int var6 = class280.field4762[var5];
                if (var6 > this.field4075 && 4096 - this.field4075 > var6 && (2048 - this.field4075) < var4 && this.field4075 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4075);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field4075 && (this.field4075 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field4075;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4075);
                } else if (var4 < this.field4075 || 4096 - this.field4075 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4075;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4075);
                } else if (this.field4075 <= var6 && (4096 - this.field4075) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4075);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(B)V", line = 120)
    public static final void method1731(byte arg0) {
        field4076++;
        int var1 = 58 / ((48 - arg0) / 51);
        class153.field2717.method1533(true);
        class17.field281.method1533(true);
        class223.field3718.method1533(true);
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(B)V", line = 156)
    public static final void method1732(byte arg0) {
        if (arg0 != -74) {
            return;
        }
        field4079++;
        if (class87.field1556 == 0) {
            return;
        }
        try {
            if (++class219.field3657 > 2000) {
                if (class116.field2054 != null) {
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                }
                if (class139.field2488 >= 1) {
                    class92.field1624 = -5;
                    class87.field1556 = 0;
                    return;
                }
                if (class163.field2880 == class146.field2642) {
                    class146.field2642 = class243.field4033;
                } else {
                    class146.field2642 = class163.field2880;
                }
                class87.field1556 = 1;
                class219.field3657 = 0;
                class139.field2488++;
            }
            if (class87.field1556 == 1) {
                class71.field1132 = client.field1903.method237(class146.field2642, -6303, class250.field4179);
                class87.field1556 = 2;
            }
            if (class87.field1556 == 2) {
                if (class71.field1132.field2934 == 2) {
                    throw new IOException();
                }
                if (class71.field1132.field2934 != 1) {
                    return;
                }
                class116.field2054 = new class267((Socket) class71.field1132.field2933, client.field1903);
                class71.field1132 = null;
                class116.field2054.method1827(0, -87, class187.field3229.field1681, class187.field3229.field1653);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                int var1 = class116.field2054.method1832(arg0 ^ 0xFFFF9B51);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                if (var1 != 21) {
                    class92.field1624 = var1;
                    class87.field1556 = 0;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                }
                class87.field1556 = 3;
            }
            if (class87.field1556 == 3) {
                if (class116.field2054.method1826(104) < 1) {
                    return;
                }
                class119.field2164 = new class162[class116.field2054.method1832(arg0 ^ 0xFFFF9B51)];
                class87.field1556 = 4;
            }
            if (class87.field1556 == 4) {
                if (class116.field2054.method1826(85) < class119.field2164.length * 8) {
                    return;
                }
                class63.field975.field1653 = 0;
                class116.field2054.method1830(class119.field2164.length * 8, (byte) -71, class63.field975.field1681, 0);
                for (int var2 = 0; var2 < class119.field2164.length; var2++) {
                    class119.field2164[var2] = class317.method2178(class63.field975.method722(1285103432), (byte) -24);
                }
                class87.field1556 = 0;
                class92.field1624 = 21;
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
                return;
            }
        } catch (IOException var4) {
            if (class116.field2054 != null) {
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
            }
            if (class139.field2488 < 1) {
                class219.field3657 = 0;
                class87.field1556 = 1;
                if (class163.field2880 == class146.field2642) {
                    class146.field2642 = class243.field4033;
                } else {
                    class146.field2642 = class163.field2880;
                }
                class139.field2488++;
            } else {
                class87.field1556 = 0;
                class92.field1624 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Lbd;", line = 310)
    public static final class162 method1733(int arg0) {
        field4073++;
        class162 var1 = class89.field1588;
        if (class8.field88 != arg0) {
            var1 = class206.field3483;
        }
        class162 var2 = class244.field4053;
        if (class35.field590 != null) {
            var2 = class135.method1062(new class162[] { class306.field5150, class35.field590 }, true);
        }
        return class135.method1062(new class162[] { class6.field45, var1, class141.field2496, class156.method1212(10, class260.field4344), class220.field3662, class156.method1212(10, class262.field4377), var2, class202.field3428 }, true);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 337)
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILb;)V", line = 348)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field4070++;
        if (arg0 == 0) {
            this.field4075 = arg2.method761((byte) 108);
        }
        if (arg1 != 0) {
            field4074 = (class162) null;
        }
    }
}
