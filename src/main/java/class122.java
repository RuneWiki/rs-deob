import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class122 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "B")
    private byte field2206;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ld;")
    public static class32 field2202;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ldj;")
    public static class39 field2215;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 7)
    public static final void method984(int arg0, int arg1) {
        field2209++;
        if (arg1 != 2047) {
            field2215 = (class39) null;
        }
        if (class262.field4380 == arg0) {
            return;
        }
        if (class262.field4380 == 0) {
            class205.method1521(arg1 + 16500);
        }
        if (arg0 == 40) {
            class270.method1847((byte) -16);
        }
        if (arg0 != 40 && class1.field1 != null) {
            class1.field1.method1829((byte) 4);
            class1.field1 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class63.field984 = 0;
            class80.field1400 = 0;
            class32.field529 = 0;
            class259.field4321 = 1;
            class105.field1914 = 1;
            class235.method1676((byte) 101);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 5) {
            class251.method1755(71, class35.field577);
        } else {
            class184.method1395(104);
        }
        boolean var3 = class262.field4380 == 5 || class262.field4380 == 10 || class262.field4380 == 28;
        if (var3 != var2) {
            if (var2) {
                class163.field2887 = class53.field837;
                if (class135.field2413 == 0) {
                    class78.method593(true, 2);
                } else {
                    class209.method1537(class53.field837, 0, false, 35, 255, 2, class178.field3047);
                }
                class55.field863.method1706(-19181, false);
            } else {
                class78.method593(true, 2);
                class55.field863.method1706(-19181, true);
            }
        }
        if (class117.field2159 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class117.method942();
        }
        class262.field4380 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I", line = 87)
    public final int method985(boolean arg0) {
        field2214++;
        if (arg0) {
            return (this.field2206 & 0x8) == 8 ? 1 : 0;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 110)
    public static void method986(byte arg0) {
        field2202 = null;
        field2215 = null;
        int var1 = 20 % ((arg0 - 64) / 62);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I", line = 123)
    public static final int method987(int arg0) {
        if (arg0 != 16) {
            method986((byte) 102);
        }
        field2216++;
        return 16;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[BBIIII[Lqd;IZI)V", line = 140)
    public static final void method988(int arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class179[] arg7, int arg8, boolean arg9, int arg10) {
        if (arg2 != 37) {
            method989(-81);
        }
        field2208++;
        byte var11;
        if (arg9) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg9) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg10 + var12) > 0 && (arg10 + var12) < 103 && arg5 + var13 > 0 && (arg5 + var13) < 103) {
                        arg7[arg0].field3061[arg10 + var12][arg5 + var13] = class92.method695(arg7[arg0].field3061[arg10 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class94 var14 = new class94(arg1);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg8 == var15 && arg3 <= var16 && var16 < arg3 + 8 && arg4 <= var17 && (arg4 + 8) > var17) {
                        class139.method1083(arg5 + class81.method619(var16 & 0x7, (byte) 109, var17 & 0x7, arg6), var14, arg10 + class98.method785(arg6, (byte) 30, var16 & 0x7, var17 & 0x7), 0, -2, arg6, arg0, 0, arg9);
                    } else {
                        class139.method1083(-1, var14, -1, 0, arg2 - 39, 0, 0, 0, arg9);
                    }
                }
            }
        }
        if (!class117.field2159 || arg9) {
            return;
        }
        class160 var18 = null;
        while (true) {
            while (var14.field1653 < var14.field1681.length) {
                int var19 = var14.method756(915905888);
                if (var19 == 0) {
                    var18 = new class160(var14);
                } else if (var19 == 1) {
                    int var20 = var14.method756(915905888);
                    if (var20 > 0) {
                        for (int var21 = 0; var21 < var20; var21++) {
                            class196 var22 = new class196(var14);
                            int var23 = var22.field3334 >> 7;
                            int var24 = var22.field3335 >> 7;
                            if (var22.field3337 == arg8 && arg3 <= var23 && var23 < arg3 + 8 && var24 >= arg4 && var24 < arg4 + 8) {
                                int var25 = client.method865(arg6, var22.field3335 & 0x3FF, arg2 ^ 0x4C, var22.field3334 & 0x3FF) + (arg10 << 7);
                                int var26 = class224.method1625(37, var22.field3335 & 0x3FF, var22.field3334 & 0x3FF, arg6) + (arg5 << 7);
                                var22.field3335 = var26;
                                int var27 = var22.field3335 >> 7;
                                var22.field3334 = var25;
                                int var28 = var22.field3334 >> 7;
                                if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                                    var22.field3352 = class206.field3473[var22.field3337][var28][var27] - var22.field3352;
                                    class221.method1598(var22);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var18 == null) {
                var18 = new class160();
            }
            class96.field1758[arg10 >> 3][arg5 >> 3] = var18;
            break;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 285)
    public static final void method989(int arg0) {
        field2203++;
        int var1 = 99 / ((arg0 - 69) / 52);
        for (int var2 = -1; var2 < class171.field2966; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class123.field2233[var2];
            }
            class39 var4 = class270.field4520[var3];
            if (var4 != null && var4.field5052 > 0) {
                var4.field5052--;
                if (var4.field5052 == 0) {
                    var4.field5070 = null;
                }
            }
        }
        for (int var5 = 0; var5 < class31.field520; var5++) {
            int var6 = class278.field4674[var5];
            class60 var7 = class204.field3446[var6];
            if (var7 != null && var7.field5052 > 0) {
                var7.field5052--;
                if (var7.field5052 == 0) {
                    var7.field5070 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I", line = 343)
    public final int method990(byte arg0) {
        int var2 = -54 % ((-arg0 - 71) / 39);
        field2204++;
        return this.field2206 & 0x7;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lob;I)Z", line = 354)
    public static final boolean method991(class78 arg0, int arg1) {
        field2207++;
        if (arg0.field1297 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < arg0.field1297.length; var2++) {
            int var3 = class129.method1035(var2, arg0, (byte) -107);
            int var4 = arg0.field1256[var2];
            if (arg0.field1297[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1297[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1297[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 404)
    public class122() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lb;)V", line = 411)
    public class122(class94 arg0) {
        this.field2206 = arg0.method719((byte) -42);
        this.field2212 = arg0.method761((byte) 108);
        this.field2213 = arg0.method747(false);
        this.field2210 = arg0.method747(false);
        this.field2205 = arg0.method747(false);
        this.field2201 = arg0.method747(false);
    }
}
