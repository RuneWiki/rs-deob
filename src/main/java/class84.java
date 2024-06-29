import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 extends class273 {

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "[[B")
    public static byte[][] field1161 = new byte[1000][];

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Lqe;")
    public static class186 field1167;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method541(byte arg0) {
        field1173++;
        if (arg0 > -101) {
            return false;
        } else {
            return (this.field1171 & 0x4F6C4B85) >> 30 != 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 29)
    public static void method542(int arg0) {
        field1167 = null;
        field1161 = (byte[][]) null;
        int var1 = 69 % ((arg0 + 2) / 59);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z", line = 41)
    public final boolean method543(byte arg0) {
        if (arg0 == -68) {
            field1159++;
            return (this.field1171 & 0x27EE78) >> 21 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)Z", line = 54)
    public final boolean method544(int arg0) {
        field1174++;
        int var2 = -32 % ((arg0 - 16) / 56);
        return (this.field1171 & 0x611894) >> 22 != 0;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I", line = 73)
    public final int method545(int arg0) {
        if (arg0 >= -97) {
            return 4;
        } else {
            field1157++;
            return class34.method252(this.field1171, -2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)Z", line = 90)
    public final boolean method546(byte arg0) {
        field1169++;
        if (arg0 != 115) {
            field1167 = (class186) null;
        }
        return (this.field1171 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)Z", line = 102)
    public final boolean method547(int arg0) {
        field1160++;
        if (arg0 != 2616952) {
            this.method547(-61);
        }
        return (this.field1171 & 0x12EC785B) >> 28 != 0;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)I", line = 119)
    public final int method548(byte arg0) {
        field1168++;
        return arg0 == 41 ? this.field1171 >> 18 & 0x7 : 47;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V", line = 130)
    public class84(int arg0, int arg1) {
        this.field1170 = arg1;
        this.field1171 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lv;IIIII)V", line = 141)
    public static final void method549(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class17.field248 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class112.field1595) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class97.field1394 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class34 var14 = class287.field4857[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class65.field984[var11][var12 + 1][var13] + class65.field984[var11][var12][var13] + class65.field984[var11][var12][var13 + 1] + class65.field984[var11][var12 + 1][var13 + 1]) / 4 - (class65.field984[arg1][arg2 + 1][arg3] + class65.field984[arg1][arg2][arg3] + class65.field984[arg1][arg2][arg3 + 1] + class65.field984[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class294 var16 = var14.field573;
                                    if (var16 != null) {
                                        if (var16.field5026.method497()) {
                                            arg0.method494(var16.field5026, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field5028 != null && var16.field5028.method497()) {
                                            arg0.method494(var16.field5028, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field579; var17++) {
                                        class248 var18 = var14.field580[var17];
                                        if (var18 != null && var18.field4144.method497() && (var18.field4157 == var12 || var7 == var12) && (var18.field4151 == var13 || var9 == var13)) {
                                            int var19 = var18.field4153 + 1 - var18.field4157;
                                            int var20 = var18.field4150 + 1 - var18.field4151;
                                            arg0.method494(var18.field4144, (var18.field4157 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4151 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)Z", line = 237)
    public final boolean method550(int arg0) {
        field1175++;
        if (arg0 != 64) {
            this.method547(-35);
        }
        return (this.field1171 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILhi;)V", line = 249)
    public static final void method551(int arg0, class291 arg1) {
        field1172++;
        if (class156.field2474 != null) {
            try {
                class156.field2474.method2265(-2, 0L);
                class156.field2474.method2268(arg1.field4946, arg1.field4950, true, 24);
            } catch (Exception var3) {
            }
        }
        arg1.field4946 += arg0;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)Z", line = 271)
    public final boolean method552(int arg0) {
        int var2 = -17 % ((arg0 - 87) / 32);
        field1165++;
        return ((this.field1171 & 0x2377345E) >> 29) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z", line = 280)
    public final boolean method553(int arg0, byte arg1) {
        field1164++;
        if (arg1 > -110) {
            this.method545(28);
        }
        return (this.field1171 >> arg0 + 1 & 0x1) != 0;
    }
}
