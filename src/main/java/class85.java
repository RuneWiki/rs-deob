import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class85 extends class212 {

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "F")
    public static float field1536 = 1.0F;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "[Ljea;")
    public static class452[] field1530 = new class452[6];

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "Lmu;")
    public static class303 field1537 = new class303(32, 6);

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BII)Z")
    public static final boolean method815(byte arg0, int arg1, int arg2) {
        if (arg0 > -111) {
            method816((class390) null, (byte) -87);
        }
        ++field1542;
        return ~(arg1 & 540800) != -1;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            return 112;
        } else {
            ++field1532;
            return 127;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lkda;B)V")
    public static final void method816(class390 arg0, byte arg1) {
        ++field1541;
        int var2 = arg0.field5665 - class641.field8810;
        if (arg1 < 0) {
            int var3 = arg0.field5719 * 512 + 256 * arg0.method2457((byte) 73);
            int var4 = arg0.field5740 * 512 - -(arg0.method2457((byte) 114) * 256);
            arg0.field5752 = 0;
            arg0.field5933 += (-arg0.field5933 + var4) / var2;
            arg0.field5922 += (-arg0.field5922 + var3) / var2;
            if (arg0.field5657 == 0) {
                arg0.method2461((byte) 49, 8192);
            }
            if (arg0.field5657 == 1) {
                arg0.method2461((byte) 49, 12288);
            }
            if (arg0.field5657 == 2) {
                arg0.method2461((byte) 49, 0);
            }
            if (arg0.field5657 == 3) {
                arg0.method2461((byte) 49, 4096);
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            field1531 = 87;
        }
        if (super.field3006 < 0 && super.field3006 > 127) {
            super.field3006 = this.method422(20014);
        }
        ++field1533;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            method816((class390) null, (byte) 50);
        }
        ++field1540;
        return 1;
    }

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
    public static void method817(int arg0) {
        field1530 = null;
        field1537 = null;
        if (arg0 != -28594) {
            field1531 = -7;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(ILdh;)V")
    public class85(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIZLjava/lang/String;)I")
    public static final int method818(int arg0, int arg1, boolean arg2, String arg3) {
        ++field1534;
        if (arg1 >= 2 && arg1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            if (arg0 != -123) {
                method819(-93, 121, 38);
            }
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg2) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~arg1 >= ~var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 - -var11;
                if (var10 / arg1 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)Z")
    public static final boolean method819(int arg0, int arg1, int arg2) {
        if (arg1 < 41) {
            field1537 = null;
        }
        ++field1538;
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = 63 % ((arg0 - 82) / 35);
        ++field1535;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Ldh;)V")
    public class85(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "(I)I")
    public final int method820(int arg0) {
        if (arg0 != -32350) {
            method818(89, 103, false, (String) null);
        }
        ++field1539;
        return super.field3006;
    }
}
