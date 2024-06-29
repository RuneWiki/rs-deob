import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class172 extends class208 {

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lve;")
    public static class255 field2844 = class87.method607(53, "(Y");

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[Ldm;")
    public static class273[] field2847;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIBLt;)V", line = 11)
    public static final void method1224(int arg0, int arg1, byte arg2, class242 arg3) {
        if (arg3.field5166 == arg1 && arg1 != -1) {
            class271 var4 = class181.method1269(82, arg1);
            int var5 = var4.field4674;
            if (var5 == 1) {
                arg3.field5123 = 0;
                arg3.field5177 = 0;
                arg3.field5116 = arg0;
                arg3.field5135 = 0;
                class232.method1609(class276.field4742 == arg3, arg3.field5130, arg3.field5123, var4, arg3.field5173, arg2 ^ 0x6843);
            }
            if (var5 == 2) {
                arg3.field5135 = 0;
            }
        } else if (arg1 == -1 || arg3.field5166 == -1 || class181.method1269(arg2 ^ 0x53, arg1).field4651 >= class181.method1269(117, arg3.field5166).field4651) {
            arg3.field5123 = 0;
            arg3.field5177 = 0;
            arg3.field5135 = 0;
            arg3.field5124 = arg3.field5127;
            arg3.field5116 = arg0;
            arg3.field5166 = arg1;
            if (arg3.field5166 != -1) {
                class232.method1609(class276.field4742 == arg3, arg3.field5130, arg3.field5123, class181.method1269(arg2 + 91, arg3.field5166), arg3.field5173, 26694);
            }
        }
        if (arg2 != 5) {
            field2847 = (class273[]) null;
        }
        field2851++;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 64)
    public class172() {
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ltl;Lve;I)Lve;", line = 72)
    public static final class255 method1225(class197 arg0, class255 arg1, int arg2) {
        field2846++;
        if (arg1.method1790((byte) 102, class116.field1969) != -1) {
            label69: while (true) {
                int var3 = arg1.method1790((byte) -59, class192.field3087);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1790((byte) -127, class97.field1678);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1790((byte) 127, class75.field1238);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1790((byte) -122, class271.field4662);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1790((byte) -75, class245.field4124);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method1790((byte) 120, class280.field4794);
                                                        if (var8 == -1) {
                                                            break label69;
                                                        }
                                                        class255 var9 = class49.field728;
                                                        if (class152.field2575 != null) {
                                                            var9 = class275.method1928((byte) -18, class152.field2575.field2831);
                                                            try {
                                                                if (class152.field2575.field2832 != null) {
                                                                    byte[] var10 = ((String) class152.field2575.field2832).getBytes("ISO-8859-1");
                                                                    var9 = class33.method185(var10, var10.length, 0, false);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class3.method14(new class255[] { arg1.method1780(var8, -10449, 0), var9, arg1.method1786(var8 + 4, 9751) }, (byte) -110);
                                                    }
                                                }
                                                arg1 = class3.method14(new class255[] { arg1.method1780(var7, -10449, 0), class81.method556(class213.method1528(17, arg0, 4), 113), arg1.method1786(var7 + 2, 9751) }, (byte) -113);
                                            }
                                        }
                                        arg1 = class3.method14(new class255[] { arg1.method1780(var6, arg2 ^ 0xFFFFD72D, 0), class81.method556(class213.method1528(17, arg0, 3), -86), arg1.method1786(var6 + 2, arg2 ^ 0x2615) }, (byte) -127);
                                    }
                                }
                                arg1 = class3.method14(new class255[] { arg1.method1780(var5, -10449, 0), class81.method556(class213.method1528(17, arg0, 2), 71), arg1.method1786(var5 + 2, arg2 + 9749) }, (byte) -67);
                            }
                        }
                        arg1 = class3.method14(new class255[] { arg1.method1780(var4, -10449, 0), class81.method556(class213.method1528(17, arg0, 1), 36), arg1.method1786(var4 + 2, 9751) }, (byte) -75);
                    }
                }
                arg1 = class3.method14(new class255[] { arg1.method1780(var3, arg2 - 10451, 0), class81.method556(class213.method1528(arg2 ^ 0x13, arg0, 0), 70), arg1.method1786(var3 + 2, 9751) }, (byte) -113);
            }
        }
        if (arg2 != 2) {
            field2850 = 88;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 163)
    public class172(int arg0) {
        this.field2849 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lrg;I)V", line = 179)
    public static final void method1226(class88 arg0, int arg1) {
        field2843++;
        if (arg1 < -9) {
            class118.field1980 = arg0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 199)
    public static void method1227(int arg0) {
        field2847 = null;
        int var1 = 11 % ((-arg0) / 61);
        field2844 = null;
    }
}
