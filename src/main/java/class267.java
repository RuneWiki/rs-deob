import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class267 {

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Ltk;")
    private class53 field4028 = new class53();

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private int field4015;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Ljl;")
    private class253 field4022;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4018 = -1;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4021 = "Close";

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
    public static int[] field4020;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method1773(byte arg0) {
        if (arg0 == -12) {
            field4021 = null;
            field4020 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
    public static final void method1774(boolean arg0, int arg1) {
        field4026++;
        if (class215.field3217 == arg0) {
            return;
        }
        class215.field3217 = arg0;
        class150.method911((byte) -128);
        if (arg1 != -1) {
            method1773((byte) -90);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method1775(int arg0) {
        this.field4028.method366((byte) 9);
        field4014++;
        this.field4022.method1669(arg0 ^ 0xBC0B45);
        if (arg0 != 27147) {
            method1776(-34, -79);
        }
        this.field4031 = this.field4015;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public static final void method1776(int arg0, int arg1) {
        field4024++;
        class146.field2133.method1780(arg1, true);
        if (arg0 > -105) {
            method1774(false, -128);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1777(long arg0, byte arg1) {
        class134 var4 = (class134) this.field4022.method1666(arg0, (byte) -117);
        if (arg1 != 112) {
            return null;
        }
        field4016++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method821(arg1 + 12);
        if (var5 == null) {
            var4.method538(85);
            var4.method4((byte) -55);
            this.field4031++;
            return null;
        }
        if (var4.method820(-91)) {
            class202 var6 = new class202(var5);
            this.field4022.method1663(var4.field1321, var6, -122);
            this.field4028.method363(var6, -105);
            var6.field15 = 0L;
            var4.method538(111);
            var4.method4((byte) -55);
        } else {
            this.field4028.method363(var4, -105);
            var4.field15 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static final void method1778(byte arg0) {
        field4017++;
        try {
            if (class282.field4211 == 1) {
                int var1 = class86.field1383.method271(15);
                if (var1 > 0 && class86.field1383.method252((byte) -45)) {
                    int var2 = var1 - class98.field1549;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class86.field1383.method263(var2, (byte) 114);
                    return;
                }
                class86.field1383.method264((byte) 37);
                class86.field1383.method248(1437570088);
                class259.field3943 = null;
                class141.field2074 = null;
                if (class110.field1705 == null) {
                    class282.field4211 = 0;
                } else {
                    class282.field4211 = 2;
                }
            }
            if (arg0 < 120) {
                field4021 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class86.field1383.method264((byte) 46);
            class259.field3943 = null;
            class141.field2074 = null;
            class110.field1705 = null;
            class282.field4211 = 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lrf;I)V")
    public static final void method1779(class289 arg0, int arg1) {
        field4030++;
        class289 var2 = class144.method878(arg0, -109);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class180.field2748;
            var4 = class77.field1245;
        } else {
            var3 = var2.field4444;
            var4 = var2.field4478;
        }
        class283.method1864(arg0, 106, false, var3, var4);
        class133.method817(arg1, var4, var3, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V")
    public final void method1780(int arg0, boolean arg1) {
        if (class152.field2194 != null) {
            for (class134 var3 = (class134) this.field4028.method367(62); var3 != null; var3 = (class134) this.field4028.method359(-57)) {
                if (var3.method820(-91)) {
                    if (var3.method821(1) == null) {
                        var3.method538(127);
                        var3.method4((byte) -55);
                        this.field4031++;
                    }
                } else if (++var3.field15 > (long) arg0) {
                    class134 var4 = class152.field2194.method129(var3, (byte) 113);
                    this.field4022.method1663(var3.field1321, var4, -128);
                    class64.method432(var3, 10, var4);
                    var3.method538(114);
                    var3.method4((byte) -55);
                }
            }
        }
        field4029++;
        if (!arg1) {
            field4025 = -88;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JZ)V")
    public final void method1781(long arg0, boolean arg1) {
        if (!arg1) {
            method1785((byte) -87, (String) null);
        }
        field4019++;
        class134 var4 = (class134) this.field4022.method1666(arg0, (byte) 120);
        if (var4 != null) {
            var4.method538(63);
            var4.method4((byte) -55);
            this.field4031++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public final void method1782(int arg0) {
        field4032++;
        for (class134 var2 = (class134) this.field4028.method367(arg0 ^ 0x33); var2 != null; var2 = (class134) this.field4028.method359(arg0 - 80)) {
            if (var2.method820(-91)) {
                var2.method538(arg0 ^ 0x5A);
                var2.method4((byte) -55);
                this.field4031++;
            }
        }
        if (arg0 != 0) {
            this.field4015 = -16;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)Lge;")
    public static final class72 method1783(byte arg0, int arg1) {
        class72 var2 = (class72) class57.field902.method1777((long) arg1, (byte) 112);
        field4033++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 69) {
            method1779((class289) null, -9);
        }
        byte[] var3 = class143.field2092.method1973(1, class128.method803(-333071897, arg1), class232.method1480(arg1, (byte) -110));
        class72 var4 = new class72();
        var4.field1142 = arg1;
        if (var3 != null) {
            var4.method488(0, new class248(var3));
        }
        var4.method490(-21800);
        class57.field902.method1784((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
    public class267(int arg0) {
        this.field4015 = arg0;
        this.field4031 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4022 = new class253(var2);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method1784(long arg0, Object arg1, int arg2) {
        this.method1781(arg0, true);
        field4023++;
        if (this.field4031 == 0) {
            class134 var5 = (class134) this.field4028.method368(0);
            var5.method538(76);
            var5.method4((byte) -55);
        } else {
            this.field4031--;
        }
        class202 var6 = new class202(arg1);
        this.field4022.method1663(arg0, var6, -80);
        this.field4028.method363(var6, -105);
        var6.field15 = (long) arg2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1785(byte arg0, String arg1) {
        field4027++;
        if (arg0 != 35) {
            field4021 = null;
        }
        return class162.method1002(arg1, true, 10, false);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)I")
    public final int method1786(byte arg0) {
        if (arg0 > -43) {
            field4018 = -73;
        }
        field4034++;
        int var2 = 0;
        for (class134 var3 = (class134) this.field4028.method367(117); var3 != null; var3 = (class134) this.field4028.method359(-58)) {
            if (!var3.method820(-91)) {
                var2++;
            }
        }
        return var2;
    }
}
