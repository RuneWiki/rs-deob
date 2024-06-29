import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class262 extends class112 {

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lre;")
    public static class266 field4157 = new class266();

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4159 = "glow3:";

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field4161 = -1;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lsb;")
    public static class124 field4160;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Lmj;")
    private class144 field4152;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILig;)Ljava/lang/String;")
    public static final String method1757(int arg0, int arg1, class136 arg2) {
        field4162++;
        try {
            if (arg0 != -24271) {
                method1763(-65, 119, -49, -15);
            }
            int var3 = arg2.method1004(122);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field2231 += class72.field1195.method1769(arg2.field2263, var3, (byte) 44, var4, 0, arg2.field2231);
            return class44.method382(var3, 0, var4, 255);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field4160 = null;
        field4157 = null;
        field4159 = null;
        if (arg0 < 6) {
            method1763(-71, 9, -87, -81);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLig;)V")
    public final void method1759(byte arg0, class136 arg1) {
        if (arg0 < 56) {
            return;
        }
        field4150++;
        while (true) {
            int var3 = arg1.method1012(4);
            if (var3 == 0) {
                return;
            }
            this.method1761(arg1, var3, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIII)I")
    public static final int method1760(int arg0, int arg1, int arg2, int arg3) {
        field4156++;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg1 & arg2 - 1;
        int var7 = arg1 / arg2;
        int var8 = class232.method1536(var7, var4, 1);
        int var9 = class232.method1536(var7, var4 + 1, arg3 ^ 0x1);
        if (arg3 != 0) {
            method1762(9);
        }
        int var10 = class232.method1536(var7 + 1, var4, 1);
        int var11 = class232.method1536(var7 + 1, var4 + 1, 1);
        int var12 = class209.method1396((byte) 58, var8, arg2, var5, var9);
        int var13 = class209.method1396((byte) 70, var10, arg2, var5, var11);
        return class209.method1396((byte) 116, var12, arg2, var6, var13);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lig;IB)V")
    private final void method1761(class136 arg0, int arg1, byte arg2) {
        if (arg2 != -110) {
            return;
        }
        if (arg1 == 249) {
            int var4 = arg0.method1012(4);
            if (this.field4152 == null) {
                int var5 = class14.method101(var4, -18851);
                this.field4152 = new class144(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1012(4) == 1;
                int var8 = arg0.method1009(arg2 ^ 0xFFFFFFFA);
                class146 var9;
                if (var7) {
                    var9 = new class85(arg0.method1010(arg2 ^ 0x37));
                } else {
                    var9 = new class186(arg0.method1022(83));
                }
                this.field4152.method1064(var9, (long) var8, (byte) -124);
            }
        }
        field4154++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method1762(int arg0) {
        field4155++;
        if (arg0 != -18203) {
            method1757(-53, 88, (class136) null);
        }
        class250.field3987.method1156(arg0 + 18083);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(IIII)V")
    public static final void method1763(int arg0, int arg1, int arg2, int arg3) {
        field4151++;
        if (arg1 == 0) {
            class61.field1039++;
            class87.field1405.method607(155, (byte) 78);
            class87.field1405.method966((byte) 107, 5);
        }
        if (arg1 == 1) {
            class87.field1405.method607(137, (byte) 88);
            class179.field2972++;
            class87.field1405.method966((byte) 94, 19);
        }
        class87.field1405.method999(-23518, class13.field184[82] ? 1 : 0);
        class87.field1405.method968((byte) 85, arg2 + class256.field4082);
        class87.field1405.method995(class170.field2787 + arg3, -22205);
        class146.field2404 = arg3;
        class71.field1191 = arg2;
        if (arg0 != -22686) {
            field4159 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
    public final int method1764(int arg0, int arg1, int arg2) {
        field4158++;
        if (this.field4152 == null) {
            return arg0;
        }
        if (arg1 != 29902) {
            method1763(108, 20, 92, 1);
        }
        class186 var4 = (class186) this.field4152.method1063((byte) -90, (long) arg2);
        return var4 == null ? arg0 : var4.field3051;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method1765(byte arg0, String arg1, int arg2) {
        field4153++;
        if (this.field4152 == null) {
            return arg1;
        }
        class85 var4 = (class85) this.field4152.method1063((byte) -15, (long) arg2);
        if (arg0 == -19) {
            return var4 == null ? arg1 : var4.field1395;
        } else {
            return null;
        }
    }
}
