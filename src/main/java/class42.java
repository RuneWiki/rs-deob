import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 {

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    private int field589 = 0;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "Ltj;")
    private class185 field588 = null;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    private int field592 = 0;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    private int field587 = 0;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "Ljaa;")
    private class576 field591;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "Ldk;")
    private class477 field593;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "[Lew;")
    private class460[] field596;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Lvba;")
    public class38 field584;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "[[Z")
    public static boolean[][] field597;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()V")
    public static final void method258() {
        class510.field6382 = 0;
        label212: for (int var0 = 0; var0 < class370.field4782; var0++) {
            class352 var1 = class290.field3670[var0];
            if (class197.field2322 != null) {
                for (int var2 = 0; var2 < class197.field2322.length; var2++) {
                    if (class197.field2322[var2] != -1000000 && (var1.field4541 <= class197.field2322[var2] || var1.field4558 <= class197.field2322[var2]) && (var1.field4553 <= class128.field1556[var2] || var1.field4561 <= class128.field1556[var2]) && (var1.field4553 >= class643.field8726[var2] || var1.field4561 >= class643.field8726[var2]) && (var1.field4552 <= class410.field5274[var2] || var1.field4551 <= class410.field5274[var2]) && (var1.field4552 >= class610.field8307[var2] || var1.field4551 >= class610.field8307[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4555 == 1) {
                int var3 = var1.field4556 + class664.field9021 - class662.field8971;
                if (var3 >= 0 && var3 <= class664.field9021 + class664.field9021) {
                    int var4 = var1.field4563 + class664.field9021 - class513.field6440;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class664.field9021 + class664.field9021) {
                        continue;
                    }
                    int var5 = var1.field4544 + class664.field9021 - class513.field6440;
                    if (var5 > class664.field9021 + class664.field9021) {
                        var5 = class664.field9021 + class664.field9021;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class82.field1060[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class424.field5373 - var1.field4553;
                        if (var7 > class266.field3361) {
                            var1.field4554 = 1;
                        } else {
                            if (var7 >= -class266.field3361) {
                                continue;
                            }
                            var1.field4554 = 2;
                            var7 = -var7;
                        }
                        var1.field4550 = (var1.field4552 - class370.field4786 << 8) / var7;
                        var1.field4557 = (var1.field4551 - class370.field4786 << 8) / var7;
                        var1.field4543 = (var1.field4541 - class303.field3847 << 8) / var7;
                        var1.field4549 = (var1.field4558 - class303.field3847 << 8) / var7;
                        class352.field4547[class510.field6382++] = var1;
                    }
                }
            } else if (var1.field4555 == 2) {
                int var8 = var1.field4563 + class664.field9021 - class513.field6440;
                if (var8 >= 0 && var8 <= class664.field9021 + class664.field9021) {
                    int var9 = var1.field4556 + class664.field9021 - class662.field8971;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class664.field9021 + class664.field9021) {
                        continue;
                    }
                    int var10 = var1.field4546 + class664.field9021 - class662.field8971;
                    if (var10 > class664.field9021 + class664.field9021) {
                        var10 = class664.field9021 + class664.field9021;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class82.field1060[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class370.field4786 - var1.field4552;
                        if (var12 > class266.field3361) {
                            var1.field4554 = 3;
                        } else {
                            if (var12 >= -class266.field3361) {
                                continue;
                            }
                            var1.field4554 = 4;
                            var12 = -var12;
                        }
                        var1.field4545 = (var1.field4553 - class424.field5373 << 8) / var12;
                        var1.field4548 = (var1.field4561 - class424.field5373 << 8) / var12;
                        var1.field4543 = (var1.field4541 - class303.field3847 << 8) / var12;
                        var1.field4549 = (var1.field4558 - class303.field3847 << 8) / var12;
                        class352.field4547[class510.field6382++] = var1;
                    }
                }
            } else if (var1.field4555 == 4) {
                int var13 = var1.field4541 - class303.field3847;
                if (var13 > class397.field5043) {
                    int var14 = var1.field4563 + class664.field9021 - class513.field6440;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class664.field9021 + class664.field9021) {
                        continue;
                    }
                    int var15 = var1.field4544 + class664.field9021 - class513.field6440;
                    if (var15 > class664.field9021 + class664.field9021) {
                        var15 = class664.field9021 + class664.field9021;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4556 + class664.field9021 - class662.field8971;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class664.field9021 + class664.field9021) {
                        continue;
                    }
                    int var17 = var1.field4546 + class664.field9021 - class662.field8971;
                    if (var17 > class664.field9021 + class664.field9021) {
                        var17 = class664.field9021 + class664.field9021;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class82.field1060[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4554 = 5;
                        var1.field4545 = (var1.field4553 - class424.field5373 << 8) / var13;
                        var1.field4548 = (var1.field4561 - class424.field5373 << 8) / var13;
                        var1.field4550 = (var1.field4552 - class370.field4786 << 8) / var13;
                        var1.field4557 = (var1.field4551 - class370.field4786 << 8) / var13;
                        class352.field4547[class510.field6382++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILtj;B)Z")
    public final boolean method259(int arg0, class185 arg1, byte arg2) {
        if (arg2 != 94) {
            return false;
        }
        field586++;
        if (this.field589 == 0) {
            return false;
        }
        if (this.field588 != arg1) {
            this.field596[Integer.MAX_VALUE & this.field589].method19(arg0, -112, arg1);
            this.field588 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Z")
    public final boolean method260(int arg0, int arg1) {
        field590++;
        return arg0 == Integer.MAX_VALUE ? this.field596[arg1].method16(-24566) : true;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZBIIZ)V")
    public final void method261(int arg0, boolean arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field594++;
        boolean var7 = arg5 & this.field591.method481();
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg0 = arg3;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg1) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (arg2 > -33) {
            return;
        }
        if (this.field589 != arg4) {
            if (this.field589 != 0) {
                this.field596[this.field589 & Integer.MAX_VALUE].method15(0);
            }
            if (arg4 != 0) {
                this.field596[Integer.MAX_VALUE & arg4].method13(arg1, -32460);
                this.field596[Integer.MAX_VALUE & arg4].method17((byte) 112, arg1);
                this.field596[arg4 & Integer.MAX_VALUE].method18(arg3, arg0, (byte) -127);
            }
            this.field592 = arg0;
            this.field588 = null;
            this.field587 = arg3;
            this.field589 = arg4;
        } else if (this.field589 != 0) {
            this.field596[this.field589 & Integer.MAX_VALUE].method17((byte) 124, arg1);
            if (this.field587 != arg3 || this.field592 != arg0) {
                this.field596[Integer.MAX_VALUE & this.field589].method18(arg3, arg0, (byte) -119);
                this.field592 = arg0;
                this.field587 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
    public static final boolean method262(int arg0) {
        field585++;
        if (arg0 >= -49) {
            method264(-122);
        }
        return class638.field8648 > 0;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method263(int arg0, int arg1, byte arg2) {
        field595++;
        if (arg2 != -13) {
            method262(98);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 != 8) {
            field597 = null;
        }
        field597 = null;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Ljaa;)V")
    public class42(class576 arg0) {
        this.field591 = arg0;
        this.field593 = new class477(arg0);
        this.field596 = new class460[10];
        this.field596[1] = new class274(arg0);
        this.field596[2] = new class25(arg0, this.field593);
        this.field596[4] = new class248(arg0, this.field593);
        this.field596[5] = new class11(arg0, this.field593);
        this.field596[6] = new class196(arg0);
        this.field596[7] = new class215(arg0);
        this.field596[3] = this.field584 = new class38(arg0);
        this.field596[8] = new class5(arg0, this.field593);
        this.field596[9] = new class668(arg0, this.field593);
        if (!this.field596[8].method16(-24566)) {
            this.field596[8] = this.field596[4];
        }
        if (!this.field596[9].method16(-24566)) {
            this.field596[9] = this.field596[8];
        }
    }
}
