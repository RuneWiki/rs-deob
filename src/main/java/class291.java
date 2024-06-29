import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class291 {

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Ljava/lang/String;")
    public String field3707;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "Ljava/lang/String;")
    public String field3709;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "J")
    public long field3706;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "Luw;")
    public static class208 field3714 = new class208(86, -1);

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1757(int arg0) {
        field3713++;
        if (arg0 != -4) {
            field3714 = null;
        }
        short var1 = 1024;
        short var2 = 3072;
        if (class653.field8360) {
            var2 = 4096;
            if (class575.field7308) {
                var1 = 2048;
            }
        }
        if (class297.field3762 < (float) var1) {
            class297.field3762 = var1;
        }
        if (class297.field3762 > (float) var2) {
            class297.field3762 = var2;
        }
        while (class698.field9250 >= 16384.0F) {
            class698.field9250 -= 16384.0F;
        }
        while (class698.field9250 < 0.0F) {
            class698.field9250 += 16384.0F;
        }
        int var3 = class599.field7622 >> 9;
        int var4 = class572.field7251 >> 9;
        int var5 = class512.method2831(class309.field3877, (byte) 73, class599.field7622, class572.field7251);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < (class240.field3280 - 4) && class276.field3602 - 4 > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class309.field3877;
                    if (var9 < 3 && class433.method2484(var8, 0, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class731.field9578.field7597 != null && class731.field9578.field7597[var9] != null) {
                        var10 = (class731.field9578.field7597[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class116.field1542 != null && class116.field1542[var9] != null) {
                        int var11 = var5 + var10 - class116.field1542[var9].method2060(var8, arg0 + -93, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class162.field2160 < var12) {
            class162.field2160 += (var12 - class162.field2160) / 24;
        } else if (var12 < class162.field2160) {
            class162.field2160 += (var12 - class162.field2160) / 80;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([I[ILjha;[IZ)V", line = 112)
    public static final void method1758(int[] arg0, int[] arg1, class33 arg2, int[] arg3, boolean arg4) {
        field3711++;
        if (!arg4) {
            return;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg2.field4752.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4752[var9] = null;
                    } else {
                        class11 var10 = class143.field1864.method4265(true, var6);
                        int var11 = var10.field102;
                        class129 var12 = arg2.field4752[var9];
                        if (var12 != null) {
                            if (var12.field1726 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field4752[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1722 = 1;
                                    var12.field1723 = 0;
                                    var12.field1728 = 0;
                                    var12.field1721 = var8;
                                    var12.field1727 = 0;
                                    if (!arg2.field4688) {
                                        class117.method699(0, var10, false, arg2);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1723 = 0;
                                }
                            } else if (var10.field92 >= class143.field1864.method4265(true, var12.field1726).field92) {
                                var12 = arg2.field4752[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class129 var13 = arg2.field4752[var9] = new class129();
                            var13.field1721 = var8;
                            var13.field1726 = var6;
                            var13.field1723 = 0;
                            var13.field1727 = 0;
                            var13.field1728 = 0;
                            var13.field1722 = 1;
                            if (!arg2.field4688) {
                                class117.method699(0, var10, false, arg2);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZIC)I", line = 212)
    public static final int method1759(boolean arg0, int arg1, char arg2) {
        field3708++;
        if (arg0) {
            return -87;
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V", line = 233)
    public static void method1760(int arg0) {
        field3714 = null;
        if (arg0 >= -31) {
            field3714 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 242)
    public class291(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3707 = arg1;
        this.field3709 = arg3;
        this.field3705 = arg2;
        this.field3712 = arg0;
        this.field3706 = arg4;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/String;ZBI)I", line = 256)
    public static final int method1761(String arg0, boolean arg1, byte arg2, int arg3) {
        field3710++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        if (arg2 < 6) {
            field3714 = null;
        }
        return var6;
    }
}
