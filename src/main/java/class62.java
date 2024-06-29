import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class62 extends class251 {

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Lke;")
    private class407 field1041;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 8)
    public final String method430(int arg0, byte arg1, String arg2) {
        field1037++;
        if (this.field1041 == null) {
            return arg2;
        }
        class65 var4 = (class65) this.field1041.method2409(false, (long) arg0);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg1 != 78) {
                this.method436((byte) 68, null);
            }
            return var4.field1073;
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)Z", line = 28)
    public static final boolean method431(int arg0) {
        field1044++;
        if (arg0 == 955) {
            return class322.field4842 == 0 ? class194.field3056.method651((byte) -107) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V", line = 46)
    public static final void method432(boolean arg0) {
        field1040++;
        if (!class306.field4636) {
            return;
        }
        class427 var1 = class59.method419(class142.field2311, 12782, class357.field5298);
        if (var1 != null && var1.field6198 != null) {
            class298 var2 = new class298();
            var2.field4517 = var1;
            var2.field4520 = var1.field6198;
            class94.method704(var2);
        }
        client.field3001 = -1;
        class306.field4636 = arg0;
        class262.field3967 = -1;
        if (var1 != null) {
            class288.method1754(var1, 0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lha;II)V", line = 77)
    private final void method433(class40 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method434((byte) 24);
        }
        if (arg1 == 249) {
            int var4 = arg0.method257((byte) 105);
            if (this.field1041 == null) {
                int var5 = class99.method749(var4, arg2 - 23865);
                this.field1041 = new class407(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method257((byte) 22) == 1;
                int var8 = arg0.method224(-2);
                class179 var9;
                if (var7) {
                    var9 = new class65(arg0.method239(true));
                } else {
                    var9 = new class361(arg0.method255((byte) 96));
                }
                this.field1041.method2413((long) var8, -1, var9);
            }
        }
        field1039++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Z", line = 122)
    public static final boolean method434(byte arg0) {
        if (arg0 <= 7) {
            return true;
        }
        field1042++;
        if (class112.field1907) {
            try {
                if ((Boolean) class209.method1278(5633, class7.field86.field3929, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqh;B)V", line = 142)
    public static final void method435(class47 arg0, byte arg1) {
        field1038++;
        if (arg1 != 18) {
            method434((byte) 24);
        }
        class286 var2 = (class286) class199.field3141.method2409(false, (long) arg0.field2197);
        if (var2 == null) {
            class72.method538(arg0, arg0.field2232[0], null, 0, arg0.field3217, arg0.field2239[0], true, null);
        } else {
            var2.method1743(25996);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLha;)V", line = 168)
    public final void method436(byte arg0, class40 arg1) {
        if (arg0 != 95) {
            return;
        }
        while (true) {
            int var3 = arg1.method257((byte) 47);
            if (var3 == 0) {
                field1043++;
                return;
            }
            this.method433(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I", line = 188)
    public final int method437(int arg0, int arg1, int arg2) {
        field1045++;
        if (this.field1041 == null) {
            return arg2;
        }
        class361 var4 = (class361) this.field1041.method2409(false, (long) arg1);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 < 61) {
                this.method430(37, (byte) -62, null);
            }
            return var4.field5334;
        }
    }
}
