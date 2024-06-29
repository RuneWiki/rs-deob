import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class246 extends class235 {

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "Z")
    public static boolean field3433 = false;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "F")
    public static float field3429;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "Lsf;")
    private class143 field3432;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "[Lqa;")
    public static class243[] field3425;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Z", line = 9)
    public static final boolean method1512(int arg0) {
        field3426++;
        class259 var1 = (class259) class373.field5574.field6108.field5898;
        if (var1 == null || class373.field5574.field6108 == var1) {
            return false;
        }
        if (var1.field3777 >= 2000) {
            var1.field3777 -= 2000;
        }
        if (arg0 < 97) {
            return true;
        } else {
            return var1.field3777 == 1006;
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(Z)V", line = 35)
    public static final void method1513(boolean arg0) {
        field3435++;
        if (class31.field525) {
            return;
        }
        class31.field525 = true;
        if (class329.field4714) {
            class155.field2027 = (float) ((int) class155.field2027 + 47 & 0xFFFFFFF0);
        } else {
            class128.field1700 += (12.0F - class128.field1700) / 2.0F;
        }
        class91.field1263 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lil;B)V", line = 60)
    public final void method1514(class265 arg0, byte arg1) {
        if (arg1 > -95) {
            field3430 = -79;
        }
        while (true) {
            int var3 = arg0.method1697(-54);
            if (var3 == 0) {
                field3427++;
                return;
            }
            this.method1515((byte) -103, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLil;I)V", line = 83)
    private final void method1515(byte arg0, class265 arg1, int arg2) {
        field3428++;
        if (arg2 == 249) {
            int var4 = arg1.method1697(-126);
            if (this.field3432 == null) {
                int var5 = class8.method64(1388313616, var4);
                this.field3432 = new class143(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1697(87) == 1;
                int var8 = arg1.method1691(false);
                class393 var9;
                if (var7) {
                    var9 = new class442(arg1.method1712(false));
                } else {
                    var9 = new class231(arg1.method1666(-2));
                }
                this.field3432.method956(false, (long) var8, var9);
            }
        }
        if (arg0 >= -66) {
            this.method1519(61, -115, (String) null);
        }
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)V", line = 128)
    public static final void method1516(byte arg0) {
        class199.method1251(25, (byte) 78);
        field3437++;
        if (arg0 == -21) {
            class333.method2212(false);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBI)I", line = 155)
    public final int method1517(int arg0, byte arg1, int arg2) {
        int var4 = -88 % ((arg1 + 47) / 36);
        field3423++;
        if (this.field3432 == null) {
            return arg0;
        } else {
            class231 var5 = (class231) this.field3432.method954(57, (long) arg2);
            return var5 == null ? arg0 : var5.field3258;
        }
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V", line = 177)
    public static void method1518(byte arg0) {
        field3425 = null;
        if (arg0 >= -123) {
            field3425 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 187)
    public final String method1519(int arg0, int arg1, String arg2) {
        field3434++;
        if (this.field3432 == null) {
            return arg2;
        }
        if (arg1 != 0) {
            this.method1519(52, 89, (String) null);
        }
        class442 var4 = (class442) this.field3432.method954(63, (long) arg0);
        return var4 == null ? arg2 : var4.field6451;
    }
}
