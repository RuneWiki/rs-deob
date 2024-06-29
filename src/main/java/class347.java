import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class347 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Lec;")
    public static class40 field4951 = new class40("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4955 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2099(byte arg0) {
        class358.field5165 = true;
        int var1 = -107 % ((-arg0 - 20) / 63);
        field4953++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLvt;)V", line = 14)
    public static final void method2100(byte arg0, class179 arg1) {
        field4950++;
        byte[] var2 = new byte[24];
        if (class287.field4307 != null) {
            try {
                class287.field4307.method1646(0, 0L);
                class287.field4307.method1649(true, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 <= -43) {
            arg1.method934((byte) 113, var2, 0, 24);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Loj;)V", line = 62)
    public static final void method2101(class280 arg0) {
        for (int var1 = class232.field3221; var1 < class346.field4937; var1++) {
            for (int var2 = 0; var2 < class176.field2122; var2++) {
                for (int var3 = 0; var3 < class225.field3116; var3++) {
                    class263 var4 = class293.field4356[var1][var2][var3];
                    if (var4 != null) {
                        class261 var5 = var4.field3783;
                        class261 var6 = var4.field3780;
                        if (var5 != null && var5.method33(1957)) {
                            class229.method1268(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method33(1957)) {
                                class229.method1268(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method23(0, 0, false, var5, 0, (byte) -65, arg0);
                                var6.method32(-2);
                            }
                            var5.method32(-2);
                        }
                        for (class248 var7 = var4.field3801; var7 != null; var7 = var7.field3490) {
                            class83 var9 = var7.field3487;
                            if (var9 != null && var9.method33(1957)) {
                                class229.method1268(arg0, var9, var1, var2, var3, var9.field1011 + 1 - var9.field999, var9.field997 - var9.field1004 + 1);
                                var9.method32(-2);
                            }
                        }
                        class60 var8 = var4.field3798;
                        if (var8 != null && var8.method33(1957)) {
                            class61.method315(arg0, var8, var1, var2, var3);
                            var8.method32(-2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 137)
    public static void method2102(int arg0) {
        if (arg0 >= 1) {
            field4951 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 148)
    public static final void method2103(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class141.field1696[var1] = false;
        }
        if (arg0 != -9721) {
            method2102(-57);
        }
        field4952++;
        class41.field501 = 0;
        class282.field4110 = 0;
        class358.field5167 = 1;
        class69.field855 = -1;
        class356.field5115 = -1;
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V", line = 183)
    public static final void method2104(int arg0) {
        class218.field3070.method1169(1076);
        field4954++;
        class481.field6801.method1169(1076);
        if (arg0 < -88) {
            class463.field6522.method1169(1076);
            class280.field4077.method1169(1076);
            class218.field3073.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)J")
    public abstract long method1960(int arg0);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public abstract void method1959(int arg0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
    public abstract int method1958(int arg0, int arg1);
}
