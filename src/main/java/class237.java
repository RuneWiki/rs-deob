import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class237 extends class1 {

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "I")
    public static int field4415 = 5063219;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "Loc;")
    public static class151 field4411 = class137.method873(2, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!wi", name = "pb", descriptor = "Loc;")
    public static class151 field4420 = class137.method873(2, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!wi", name = "lb", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!wi", name = "mb", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wi", name = "nb", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wi", name = "ob", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!wi", name = "qb", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!wi", name = "rb", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V")
    public static final void method1541(boolean arg0) {
        ++field4422;
        int var1 = -((int) ((double) class153.field2778.field4215 / class188.field3339)) + class110.field1943;
        int var2 = (int) ((double) class153.field2778.field4215 / class188.field3339) + class110.field1943;
        if (var1 < 0) {
            class138.field2508 = -1;
            class110.field1943 = (int) ((double) class153.field2778.field4215 / class188.field3339);
            class106.field1877 = -1;
        }
        if (!arg0) {
            method1545((byte) 3);
        }
        int var3 = class25.field541 - (int) ((double) class153.field2778.field4216 / class188.field3339);
        if (~var2 < ~class217.field3788) {
            class106.field1877 = -1;
            class110.field1943 = -((int) ((double) class153.field2778.field4215 / class188.field3339)) + class217.field3788;
            class138.field2508 = -1;
        }
        int var4 = class25.field541 - -((int) ((double) class153.field2778.field4216 / class188.field3339));
        if (~var3 > -1) {
            class25.field541 = (int) ((double) class153.field2778.field4216 / class188.field3339);
            class138.field2508 = -1;
            class106.field1877 = -1;
        }
        if (class27.field581 < var4) {
            class106.field1877 = -1;
            class25.field541 = class27.field581 - (int) ((double) class153.field2778.field4216 / class188.field3339);
            class138.field2508 = -1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)I")
    public static final int method1542(int arg0, int arg1) {
        if (arg1 != -1984272022) {
            field4420 = null;
        }
        ++field4413;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)I")
    public static final int method1543(int arg0, boolean arg1) {
        if (arg1) {
            field4415 = -88;
        }
        ++field4416;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field4414;
        if (arg0 != 0) {
            method1544((byte) -102);
        }
        if (~arg1 == -1) {
            super.field27 = ~arg2.method1475(255) == -2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        field4411 = null;
        field4420 = null;
        if (arg0 > -122) {
            field4420 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            field4420 = null;
        }
        ++field4421;
        int[] var3 = super.field21.method1182(arg1, arg0 + -31816);
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, -125, 0);
            for (int var5 = 0; var5 < class202.field3603; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(B)Z")
    public static final boolean method1545(byte arg0) {
        ++field4417;
        try {
            if (class218.field3799 == 2) {
                if (class16.field368 == null) {
                    class16.field368 = class86.method560(class68.field1331, class187.field3323, class45.field937);
                    if (class16.field368 == null) {
                        return false;
                    }
                }
                if (client.field700 == null) {
                    client.field700 = new class116(class56.field1134, class196.field3497);
                }
                if (class69.field1363.method802(client.field700, 64, 22050, class83.field1581, class16.field368)) {
                    class69.field1363.method809((byte) -127);
                    class69.field1363.method801(class227.field3967, true);
                    class69.field1363.method788(class16.field368, arg0 + -6966, class78.field1513);
                    class68.field1331 = null;
                    class218.field3799 = 0;
                    class16.field368 = null;
                    client.field700 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class69.field1363.method779((byte) -73);
            class68.field1331 = null;
            client.field700 = null;
            class16.field368 = null;
            class218.field3799 = 0;
        }
        return arg0 != 102;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4418;
        int[][] var3 = super.field13.method578(arg0, arg1 ^ 80);
        if (arg1 != -81) {
            return null;
        } else {
            if (super.field13.field1658) {
                int[][] var4 = this.method8(0, (byte) 106, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class202.field3603; ++var11) {
                    var7[var11] = -var5[var11] + 4096;
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = -var8[var11] + 4096;
                }
            }
            return var3;
        }
    }
}
