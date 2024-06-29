import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class118 extends class254 {

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lcf;")
    private class93 field2096 = class101.field1760;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "Lcf;")
    public static class93 field2105 = class147.method1066("hitbar_default", -48);

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "Lmb;")
    public static class160 field2095 = new class160();

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Lcf;")
    public static class93 field2112 = class147.method1066("::clientjs5drop", -48);

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Llj;")
    private class25 field2093;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Llj;")
    public class25 field2110;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method873(boolean arg0) {
        field2112 = null;
        if (!arg0) {
            field2105 = null;
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILhg;)Lwh;")
    public static final class193 method874(int arg0, int arg1, class177 arg2) {
        field2103++;
        if (class231.method1581((byte) 106, arg2, arg1)) {
            int var3 = -128 % ((55 - arg0) / 61);
            return class77.method535(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public static final void method875(int arg0) {
        field2097++;
        if (arg0 == 3700) {
            class9.field119.method300(arg0 - 3700);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)I")
    public final int method876(boolean arg0, int arg1) {
        field2106++;
        if (this.field2110 == null) {
            return this.field2100;
        } else {
            class236 var3 = (class236) this.field2110.method135((long) arg1, arg0);
            return var3 == null ? this.field2100 : var3.field4210;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
    private final void method877(byte arg0) {
        this.field2093 = new class25(this.field2110.method131(125));
        field2099++;
        int var2 = 11 % ((27 - arg0) / 54);
        for (class236 var3 = (class236) this.field2110.method132((byte) 103); var3 != null; var3 = (class236) this.field2110.method136(-114)) {
            class236 var4 = new class236((int) var3.field4006);
            this.field2093.method137((long) var3.field4210, var4, -1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    private final void method878(int arg0) {
        this.field2093 = new class25(this.field2110.method131(61));
        int var2 = -108 % ((arg0 + 47) / 56);
        for (class82 var3 = (class82) this.field2110.method132((byte) 103); var3 != null; var3 = (class82) this.field2110.method136(-95)) {
            class83 var4 = new class83(var3.field1507, (int) var3.field4006);
            this.field2093.method137(var3.field1507.method686(-111), var4, -1);
        }
        field2104++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILee;I)V")
    private final void method879(int arg0, class280 arg1, int arg2) {
        field2111++;
        if (arg0 <= 76) {
            method875(-83);
        }
        if (arg2 == 1) {
            this.field2094 = arg1.method1907(16832);
        } else if (arg2 == 2) {
            this.field2108 = arg1.method1907(16832);
        } else if (arg2 == 3) {
            this.field2096 = arg1.method1889((byte) -67);
        } else if (arg2 == 4) {
            this.field2100 = arg1.method1872(124);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1891(-120);
            this.field2110 = new class25(class152.method1094(-2085166256, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1872(93);
                class222 var7;
                if (arg2 == 5) {
                    var7 = new class82(arg1.method1889((byte) -67));
                } else {
                    var7 = new class236(arg1.method1872(127));
                }
                this.field2110.method137((long) var6, var7, -1);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Z")
    public final boolean method880(int arg0, int arg1) {
        field2109++;
        if (this.field2110 == null) {
            return false;
        }
        if (arg1 != 2) {
            this.method884((byte) -6, (class280) null);
        }
        if (this.field2093 == null) {
            this.method877((byte) -115);
        }
        class236 var3 = (class236) this.field2093.method135((long) arg0, true);
        return var3 != null;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)Lcf;")
    public final class93 method881(int arg0, int arg1) {
        int var3 = 36 / ((70 - arg1) / 56);
        field2098++;
        if (this.field2110 == null) {
            return this.field2096;
        } else {
            class82 var4 = (class82) this.field2110.method135((long) arg0, true);
            return var4 == null ? this.field2096 : var4.field1507;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIILtg;I)V")
    public static final void method882(byte arg0, int arg1, int arg2, class181 arg3, int arg4) {
        field2102++;
        if (class14.field170 < 3) {
            ((class158) class257.field4638).method567(arg2, arg4, arg3.field3270, arg3.field3252, class257.field4638.field2135 / 2, class257.field4638.field2127 / 2, class50.field825, 256, arg3.field3261, arg3.field3257);
        } else {
            class75.method526(arg2, arg4, 0, arg3.field3261, arg3.field3257);
        }
        class252.field4541[arg1] = true;
        if (arg0 >= -102) {
            field2112 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lcf;B)Z")
    public final boolean method883(class93 arg0, byte arg1) {
        if (arg1 > -105) {
            return true;
        }
        field2107++;
        if (this.field2110 == null) {
            return false;
        }
        if (this.field2093 == null) {
            this.method878(78);
        }
        for (class83 var3 = (class83) this.field2093.method135(arg0.method686(-126), true); var3 != null; var3 = (class83) this.field2093.method134(3090)) {
            if (var3.field1520.method667(arg0, (byte) -126)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLee;)V")
    public final void method884(byte arg0, class280 arg1) {
        if (arg0 != 36) {
            return;
        }
        field2101++;
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                return;
            }
            this.method879(91, arg1, var3);
        }
    }
}
