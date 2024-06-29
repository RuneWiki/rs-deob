import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class290 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field4387 = 8;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field4383 = 16777215;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static volatile int field4388 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lph;")
    public static class361 field4386;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Z")
    public boolean field4393;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lsb;BI)V", line = 6)
    public final void method2088(class190 arg0, byte arg1, int arg2) {
        if (arg1 >= -11) {
            this.field4393 = false;
        }
        while (true) {
            int var4 = arg0.method1319(255);
            if (var4 == 0) {
                field4389++;
                return;
            }
            this.method2089(arg0, var4, arg2, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lsb;IIB)V", line = 46)
    private final void method2089(class190 arg0, int arg1, int arg2, byte arg3) {
        if (arg1 == 1) {
            this.field4387 = arg0.method1317((byte) 73);
        } else if (arg1 == 2) {
            this.field4393 = true;
        } else if (arg1 == 3) {
            this.field4396 = arg0.method1347((byte) 61);
            this.field4391 = arg0.method1347((byte) 61);
            this.field4390 = arg0.method1347((byte) 61);
        } else if (arg1 == 4) {
            this.field4385 = arg0.method1319(255);
        } else if (arg1 == 5) {
            this.field4384 = arg0.method1317((byte) 36);
        } else if (arg1 == 6) {
            this.field4383 = arg0.method1312(73);
        }
        field4392++;
        if (arg3 <= 49) {
            this.field4390 = 36;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 98)
    public static void method2090(int arg0) {
        if (arg0 != -20211) {
            field4386 = (class361) null;
        }
        field4386 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 110)
    public static final void method2091(int arg0) {
        class4.field111 = null;
        if (arg0 != -5) {
            method2091(-29);
        }
        field4395++;
        class50.field741 = null;
        class186.field2671 = null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 123)
    public static final void method2092(int arg0) {
        class83.method676(class331.field5041, (byte) 103);
        field4397++;
        class32.field464++;
        if (class211.field3065 && class142.field2064) {
            int var1 = class56.field815;
            int var2 = class165.field2353;
            int var3 = var1 - class117.field1663;
            int var4 = var2 - class355.field5447;
            if (var3 < class275.field4163) {
                var3 = class275.field4163;
            }
            int var5 = class331.field5041.field5608;
            if (class275.field4163 + class51.field764.field5506 < class331.field5041.field5506 + var3) {
                var3 = class275.field4163 + class51.field764.field5506 - class331.field5041.field5506;
            }
            int var6 = var3 - class125.field1812;
            int var7 = var3 + class51.field764.field5496 - class275.field4163;
            if (var4 < class275.field4172) {
                var4 = class275.field4172;
            }
            if (class275.field4172 + class51.field764.field5560 < var4 - -class331.field5041.field5560) {
                var4 = class275.field4172 + class51.field764.field5560 - class331.field5041.field5560;
            }
            int var8 = var4 + class51.field764.field5641 - class275.field4172;
            int var9 = var4 - class119.field1681;
            if (class32.field464 > class331.field5041.field5551 && (var6 > var5 || -var5 > var6 || var9 > var5 || var9 < -var5)) {
                class175.field2515 = true;
            }
            if (class331.field5041.field5530 != null && class175.field2515) {
                class300 var10 = new class300();
                var10.field4494 = class331.field5041.field5530;
                var10.field4491 = class331.field5041;
                var10.field4488 = var7;
                var10.field4498 = var8;
                class48.method412(var10, arg0 ^ 0xFFFCDE56);
            }
            if (arg0 != -11498) {
                field4388 = 67;
            }
            if (class96.field1346 == 0) {
                if (class175.field2515) {
                    if (class331.field5041.field5594 != null) {
                        class300 var11 = new class300();
                        var11.field4499 = class17.field286;
                        var11.field4498 = var8;
                        var11.field4494 = class331.field5041.field5594;
                        var11.field4491 = class331.field5041;
                        var11.field4488 = var7;
                        class48.method412(var11, 200000);
                    }
                    if (class17.field286 != null && client.method348(class331.field5041) != null) {
                        class107.field1533.method1915(true, 235);
                        class107.field1533.method1366(class331.field5041.field5620, (byte) -96);
                        class213.field3072++;
                        class107.field1533.method1354(class331.field5041.field5521, (byte) 125);
                        class107.field1533.method1368(6029344, class17.field286.field5521);
                        class107.field1533.method1366(class17.field286.field5620, (byte) -78);
                    }
                } else if ((class257.field3851 == 1 || class277.method2028(-46, class264.field4043 - 1)) && class264.field4043 > 2) {
                    class164.method1160(arg0 + 11622);
                } else if (class264.field4043 > 0) {
                    class165.method1179(-1);
                }
                class331.field5041 = null;
            }
        } else if (class32.field464 > 1) {
            class331.field5041 = null;
        }
    }
}
