import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class66 extends class662 {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[Lida;")
    public static class650[] field878 = new class650[300];

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 3)
    public static void method498(byte arg0) {
        field878 = null;
        if (arg0 != -118) {
            field878 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)Z", line = 14)
    public static final boolean method499(char arg0, int arg1) {
        field881++;
        int var2 = 51 % ((-arg1 - 3) / 59);
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 32)
    public static final void method500(int arg0, int arg1, int arg2) {
        if (arg0 != -14554) {
            return;
        }
        field879++;
        if (class737.field10321 == class702.field9902) {
            if (!class140.method867(0, 0, false, (byte) 50, 1, -2, arg2, 1, arg1)) {
                class140.method867(0, 0, false, (byte) 50, 1, -3, arg2, 1, arg1);
            }
        } else if (!class140.method867(0, 0, false, (byte) 50, 1, -3, arg2, 1, arg1)) {
            class140.method867(0, 0, false, (byte) 50, 1, -2, arg2, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[Lgaa;)V", line = 61)
    public static final void method502(int arg0, int arg1, class460[] arg2) {
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class460 var4 = arg2[var3];
            if (var4 != null && var4.field6528 == arg1 && !client.method698(var4)) {
                if (var4.field6483 == 0) {
                    method502(arg0, var4.field6524, arg2);
                    if (var4.field6567 != null) {
                        method502(1, var4.field6524, var4.field6567);
                    }
                    class157 var5 = (class157) class148.field1802.method3248((long) var4.field6524, 0);
                    if (var5 != null) {
                        class737.method4131(arg0 - 1, var5.field2028);
                    }
                }
                if (var4.field6483 == 6 && var4.field6477 != -1) {
                    class747 var6 = class646.field8903.method643(var4.field6477, -87);
                    if (var6 != null) {
                        var4.field6564 += class591.field8232;
                        int var7 = var4.field6498;
                        while (var4.field6564 > var6.field10453[var4.field6498]) {
                            var4.field6564 -= var6.field10453[var4.field6498];
                            var4.field6498++;
                            if (var4.field6498 >= var6.field10458.length) {
                                var4.field6498 -= var6.field10441;
                                if (var4.field6498 < 0 || var6.field10458.length <= var4.field6498) {
                                    var4.field6498 = 0;
                                }
                            }
                            var4.field6622 = var4.field6498 + 1;
                            if (var6.field10458.length <= var4.field6622) {
                                var4.field6622 -= var6.field10441;
                                if (var4.field6622 < 0 || var4.field6622 >= var6.field10458.length) {
                                    var4.field6622 = -1;
                                }
                            }
                            class663.method3591(arg0 + 16885, var4);
                        }
                        if (var4.field6498 != var7) {
                            class713.method3942((byte) 73, var4.field6498, var6);
                        }
                    }
                }
            }
        }
        field880++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)[B", line = 158)
    public static final byte[] method503(byte[] arg0, int arg1) {
        field883++;
        class179 var2 = new class179(arg0);
        int var3 = var2.method1094(255);
        int var4 = var2.method1095((byte) 122);
        if (arg1 < ~var4 || class248.field3163 != 0 && class248.field3163 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method1096(var4, 0, var8, 12050);
            return var8;
        } else {
            int var5 = var2.method1095((byte) 114);
            if (var5 < 0 || class248.field3163 != 0 && class248.field3163 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class535.method3048(var6, var5, arg0, var4, 9);
            } else {
                class534 var7 = class561.field7832;
                synchronized (class561.field7832) {
                    class561.field7832.method3037(var2, -1, var6);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZII)V", line = 213)
    public static final void method504(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 16872) {
            method502(70, 57, null);
        }
        field882++;
        if (class666.method3606(arg3 ^ 0xFFFFBE70, arg4)) {
            class21.method223(-1, arg0, arg1, class323.field4125[arg4], true, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lgv;")
    public abstract class45 method501(int arg0);
}
