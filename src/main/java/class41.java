import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class41 extends class134 {

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(II)I", line = 5)
    public final int method57(int arg0, int arg1) {
        ++field414;
        if (super.field1712.method2282((byte) 119)) {
            return 3;
        } else {
            if (arg1 != 29053) {
                field420 = 101;
            }
            if (super.field1712.method2277((byte) 104) == class257.field3338) {
                if (arg0 == 0) {
                    if (~super.field1712.field5512.method813((byte) 124) == -2) {
                        return 2;
                    }
                    if (~super.field1712.field5521.method3358((byte) 124) == -2) {
                        return 2;
                    }
                    if (~super.field1712.field5534.method1058((byte) 125) < -1) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 40)
    public static final String method247(int arg0, int[] arg1) {
        ++field416;
        StringBuffer var2 = new StringBuffer();
        int var3 = class194.field2321;
        for (int var4 = arg0; ~arg1.length < ~var4; ++var4) {
            class264 var5 = class461.field6378.method2224(arg1[var4], -11180);
            if (~var5.field3454 != 0) {
                class680 var6 = (class680) class317.field4276.method1571(-126, (long) var5.field3454);
                if (var6 == null) {
                    class204 var7 = class204.method1129(class97.field1282, var5.field3454, 0);
                    if (var7 != null) {
                        var6 = class21.field142.method366(var7, true);
                        class317.field4276.method1574((long) var5.field3454, var6, (byte) -80);
                    }
                }
                if (var6 != null) {
                    class587.field8211[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lkda;)V", line = 90)
    public class41(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 96)
    public static final Object method248(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 2) {
            field420 = 82;
        }
        ++field418;
        if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class407.field5745) {
                try {
                    class198 var3 = (class198) Class.forName("uw").newInstance();
                    var3.method1097((byte) -101, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class407.field5745 = true;
                }
            }
            return arg2 ? class468.method2634(arg1, 0) : arg1;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 128)
    public final void method60(byte arg0) {
        if (arg0 <= 118) {
            this.method57(69, 53);
        }
        ++field422;
        if (super.field1712.method2277((byte) 104) != class257.field3338) {
            super.field1708 = 1;
        } else if (super.field1712.method2282((byte) 106)) {
            super.field1708 = 0;
        }
        if (super.field1708 != 0 && super.field1708 != 1) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I", line = 149)
    public final int method249(byte arg0) {
        if (arg0 <= 119) {
            return 124;
        } else {
            ++field417;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)Z", line = 160)
    public static final boolean method250(int arg0, byte arg1, int arg2) {
        ++field421;
        if (arg1 != -123) {
            method250(11, (byte) -48, 84);
        }
        return class430.method2454(-91, arg0, arg2) | (458752 & arg2) != 0 || class335.method1994(-120, arg2, arg0);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V", line = 174)
    public final void method55(int arg0, int arg1) {
        ++field415;
        super.field1708 = arg1;
        int var3 = 31 / ((-26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I", line = 184)
    public final int method58(int arg0) {
        ++field419;
        if (arg0 != 0) {
            this.method249((byte) 4);
        }
        return 1;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)Z", line = 195)
    public final boolean method251(int arg0) {
        ++field413;
        if (super.field1712.method2282((byte) 112)) {
            return false;
        } else {
            if (arg0 != -1) {
                field420 = -25;
            }
            return super.field1712.method2277((byte) 104) == class257.field3338;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILkda;)V", line = 215)
    public class41(int arg0, class391 arg1) {
        super(arg0, arg1);
    }
}
