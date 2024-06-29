import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class376 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field4590 = 16777215;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field4597 = 8;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lwv;")
    public static class246 field4589;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public boolean field4592;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field4595;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 3)
    public static void method2151(int arg0) {
        field4589 = null;
        if (arg0 < -96) {
            field4595 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLmc;)V", line = 26)
    public final void method2152(boolean arg0, class234 arg1) {
        if (!arg0) {
            return;
        }
        field4598++;
        while (true) {
            int var3 = arg1.method1509(arg0);
            if (var3 == 0) {
                return;
            }
            this.method2153(arg1, var3, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmc;IB)V", line = 54)
    private final void method2153(class234 arg0, int arg1, byte arg2) {
        field4599++;
        if (arg2 <= 14) {
            this.field4596 = -123;
        }
        if (arg1 == 1) {
            this.field4597 = arg0.method1553((byte) -114);
        } else if (arg1 == 2) {
            this.field4592 = true;
        } else if (arg1 == 3) {
            this.field4588 = arg0.method1542(27067);
            this.field4601 = arg0.method1542(27067);
            this.field4594 = arg0.method1542(27067);
        } else if (arg1 == 4) {
            this.field4596 = arg0.method1509(true);
        } else if (arg1 == 5) {
            this.field4593 = arg0.method1553((byte) -118);
        } else if (arg1 == 6) {
            this.field4590 = arg0.method1500((byte) -106);
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lhd;Z)Z", line = 109)
    public static final boolean method2154(class620 arg0, boolean arg1) {
        boolean var2 = class735.field9973 == class116.field1542;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method2186(621526601);
        if (arg0.field7852 < 0 || arg0.field7844 < 0 || arg0.field7849 >= class330.field4039 || arg0.field7850 >= class559.field7102) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field7852; var7 <= arg0.field7849; var7++) {
            for (int var11 = arg0.field7844; var11 <= arg0.field7850; var11++) {
                class766 var12 = class196.method1355(arg0.field2895, var7, var11);
                if (var12 != null) {
                    class569 var13 = class52.method328((byte) -36, arg0);
                    class569 var14 = var12.field10431;
                    if (var14 == null) {
                        var12.field10431 = var13;
                    } else {
                        while (var14.field7189 != null) {
                            var14 = var14.field7189;
                        }
                        var14.field7189 = var13;
                    }
                    if (var2 && (class656.field8465[var7][var11] & 0xFF000000) != 0) {
                        var3 = class656.field8465[var7][var11];
                        var4 = class490.field6303[var7][var11];
                        var5 = class329.field4032[var7][var11];
                    }
                    if (!arg1 && var12.field10426 != null && var12.field10426.field5504 > var6) {
                        var6 = var12.field10426.field5504;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field7852; var8 <= arg0.field7849; var8++) {
                for (int var9 = arg0.field7844; var9 <= arg0.field7850; var9++) {
                    if ((class656.field8465[var8][var9] & 0xFF000000) == 0) {
                        class656.field8465[var8][var9] = var3;
                        class490.field6303[var8][var9] = var4;
                        class329.field4032[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class757.field10327[class100.field1332++] = arg0;
        } else {
            int var10 = class735.field9973 == class116.field1542 ? 1 : 0;
            if (!arg0.method743((byte) -78)) {
                arg0.field2890 = class640.field8187[var10];
                class640.field8187[var10] = arg0;
            } else if (arg0.method738(true)) {
                arg0.field2890 = class336.field4089[var10];
                class336.field4089[var10] = arg0;
            } else {
                arg0.field2890 = class177.field2327[var10];
                class177.field2327[var10] = arg0;
                class689.field8852 = true;
            }
        }
        if (arg1) {
            arg0.field2892 -= var6;
        }
        return true;
    }
}
