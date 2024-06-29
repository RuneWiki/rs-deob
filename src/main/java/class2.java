import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class200 {

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Ldj;")
    private class44 field33 = class45.field863;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Ldj;")
    public static class44 field19 = class89.method650(255, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Ldj;")
    public static class44 field34 = class89.method650(255, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "Li;")
    public static class88 field24 = new class88();

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "Ldj;")
    private static class44 field35 = class89.method650(255, "Connection timed out)3");

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "Ldj;")
    public static class44 field36 = field35;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "J")
    public static long field37 = 0L;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Ll;")
    private class120 field16;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field30;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "[S")
    public static short[] field25;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILfj;I)V")
    private final void method8(int arg0, class66 arg1, int arg2) {
        if (arg2 != 6717) {
            this.method10(121, -26);
        }
        field26++;
        if (arg0 == 1) {
            this.field21 = arg1.method506(arg2 - 6462);
        } else if (arg0 == 2) {
            this.field31 = arg1.method506(255);
        } else if (arg0 == 3) {
            this.field33 = arg1.method496(true);
        } else if (arg0 == 4) {
            this.field27 = arg1.method528(true);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method500(50);
            this.field16 = new class120(class235.method1532(-119, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method528(true);
                class183 var7;
                if (arg0 == 5) {
                    var7 = new class169(arg1.method496(true));
                } else {
                    var7 = new class222(arg1.method528(true));
                }
                this.field16.method830(var7, (long) var6, arg2 ^ 0x1A3C);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLfj;)V")
    public final void method9(byte arg0, class66 arg1) {
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                field20++;
                if (arg0 < 58) {
                    method16(-17, -53, -72);
                    return;
                }
                return;
            }
            this.method8(var3, arg1, 6717);
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)I")
    public final int method10(int arg0, int arg1) {
        field23++;
        if (arg0 != 4547) {
            method14(34, (byte) 69);
        }
        if (this.field16 == null) {
            return this.field27;
        } else {
            class222 var3 = (class222) this.field16.method828((long) arg1, (byte) -40);
            return var3 == null ? this.field27 : var3.field4014;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lve;BI)[Lle;")
    public static final class125[] method11(class225 arg0, byte arg1, int arg2) {
        field18++;
        if (arg1 <= 83) {
            field35 = null;
        }
        return class156.method1026(255, arg2, arg0) ? class101.method750(0) : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
    public static final boolean method12(int arg0, int arg1, int arg2) {
        field32++;
        if (arg1 == -6) {
            return (arg2 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldj;ILdj;Lve;Lve;)Lgb;")
    public static final class69 method13(class44 arg0, int arg1, class44 arg2, class225 arg3, class225 arg4) {
        if (arg1 > -125) {
            method17(-87);
        }
        field17++;
        int var5 = arg4.method1463(arg2, -113);
        int var6 = arg4.method1461(var5, arg0, 0);
        return class207.method1352(21, arg4, arg3, var6, var5);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
    public static final int method14(int arg0, byte arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCE) >>> 2);
        if (arg1 >= -47) {
            field30 = null;
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        field29++;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static final void method15(byte arg0) {
        if (arg0 >= -86) {
            return;
        }
        field15++;
        while (true) {
            class190 var1 = class13.field245;
            class224 var2;
            synchronized (class13.field245) {
                var2 = (class224) class96.field1782.method1187((byte) 99);
            }
            if (var2 == null) {
                return;
            }
            var2.field4181.method961((int) var2.field3186, false, var2.field4177, 103, var2.field4179);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
    public static final void method16(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1298 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method17(int arg0) {
        field34 = null;
        field19 = null;
        field25 = null;
        field30 = null;
        field36 = null;
        field24 = null;
        field35 = null;
        if (arg0 != 2200) {
            method13(null, -15, null, null, null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Ldj;")
    public final class44 method18(boolean arg0, int arg1) {
        field28++;
        if (this.field16 == null) {
            return this.field33;
        }
        class169 var3 = (class169) this.field16.method828((long) arg1, (byte) -40);
        if (!arg0) {
            this.field21 = -39;
        }
        return var3 == null ? this.field33 : var3.field2923;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILvc;)Z")
    public static final boolean method19(int arg0, class223 arg1) {
        field22++;
        if (arg0 >= -38) {
            field30 = null;
        }
        if (arg1.field4033 == 205) {
            class53.field946 = 250;
            return true;
        } else {
            return false;
        }
    }
}
