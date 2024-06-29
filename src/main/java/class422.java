import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class422 extends class207 {

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Z")
    public boolean field6065 = false;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Z")
    private boolean field6059 = true;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[Z")
    public static boolean[] field6068 = new boolean[5];

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljb;")
    public static class519 field6060 = new class519(41, 6);

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lnq;")
    public static class485 field6071 = new class485(true);

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 8)
    public final void method37(int arg0) {
        int var2 = -40 % ((-58 - arg0) / 48);
        if (!super.field2668.method2249((byte) 116).method2151((byte) -6)) {
            super.field2669 = 0;
        }
        ++field6066;
        if (super.field2669 < 0 || super.field2669 > 5) {
            super.field2669 = this.method36(-56);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lika;)V", line = 23)
    public static final void method2538(class447 arg0) {
        if (class563.field7717 < 65535) {
            class127 var1 = arg0.field6422;
            class82.field1135[class563.field7717] = arg0;
            class489.field6818[class563.field7717] = false;
            ++class563.field7717;
            int var2 = arg0.field6434;
            if (arg0.field6428) {
                var2 = 0;
            }
            int var3 = arg0.field6434;
            if (arg0.field6421) {
                var3 = class504.field7090 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method901((byte) -115) - var1.method903((byte) -110) + class281.field4067 >> class478.field6717;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method901((byte) -115) + var1.method903((byte) -118) - class281.field4067 >> class478.field6717;
                if (var7 >= class247.field3229) {
                    var7 = class247.field3229 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field6432[var5++];
                    int var10 = (var1.method899(true) - var1.method903((byte) -127) + class281.field4067 >> class478.field6717) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class196.field2540) {
                        var11 = class196.field2540 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class160.field2148[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class160.field2148[var4][var12][var8] = var13 | (long) class563.field7717;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class160.field2148[var4][var12][var8] = var13 | (long) class563.field7717 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class160.field2148[var4][var12][var8] = var13 | (long) class563.field7717 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class160.field2148[var4][var12][var8] = var13 | (long) class563.field7717 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 116)
    public static void method2539(int arg0) {
        field6071 = null;
        if (arg0 <= 119) {
            field6070 = 91;
        }
        field6060 = null;
        field6068 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V", line = 129)
    public final void method2540(int arg0, boolean arg1) {
        this.field6059 = arg1;
        if (arg0 == 0) {
            ++field6072;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I", line = 141)
    public final int method2541(int arg0) {
        ++field6064;
        if (arg0 != 43) {
            this.field6059 = false;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z", line = 153)
    public static final boolean method2542(int arg0, int arg1) {
        ++field6062;
        if (class408.field5782[arg1]) {
            return true;
        } else if (!class82.field1139.method1158(arg1, (byte) 64)) {
            return false;
        } else {
            int var2 = 22 / ((arg0 - -35) / 44);
            int var3 = class82.field1139.method1175(arg1, (byte) 104);
            if (var3 == 0) {
                class408.field5782[arg1] = true;
                return true;
            } else {
                if (class419.field6032[arg1] == null) {
                    class419.field6032[arg1] = new class347[var3];
                }
                for (int var4 = 0; ~var4 > ~var3; ++var4) {
                    if (class419.field6032[arg1][var4] == null) {
                        byte[] var5 = class82.field1139.method1188(arg1, -18047, var4);
                        if (var5 != null) {
                            class347 var6 = class419.field6032[arg1][var4] = new class347();
                            var6.field5003 = (arg1 << 16) + var4;
                            if (~var5[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var6.method2220(118, new class254(var5));
                        }
                    }
                }
                class408.field5782[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 209)
    public static final void method2543(int arg0) {
        class560.field7678.method2722(-84);
        ++field6069;
        if (arg0 != -4) {
            method2543(118);
        }
        int var1 = class560.field7678.method2721(8, 1);
        if (var1 < class178.field2352) {
            for (int var2 = var1; class178.field2352 > var2; ++var2) {
                class270.field3943[class628.field8508++] = class245.field3206[var2];
            }
        }
        if (var1 > class178.field2352) {
            throw new RuntimeException("gnpov1");
        } else {
            class178.field2352 = 0;
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class245.field3206[var3];
                class22 var5 = ((class316) class176.field2326.method1248(95, (long) var4)).field4455;
                int var6 = class560.field7678.method2721(1, 1);
                if (var6 == 0) {
                    class245.field3206[class178.field2352++] = var4;
                    var5.field6141 = class336.field4733;
                } else {
                    int var7 = class560.field7678.method2721(2, 1);
                    if (~var7 == -1) {
                        class245.field3206[class178.field2352++] = var4;
                        var5.field6141 = class336.field4733;
                        class318.field4517[class770.field10602++] = var4;
                    } else if (~var7 == -2) {
                        class245.field3206[class178.field2352++] = var4;
                        var5.field6141 = class336.field4733;
                        int var8 = class560.field7678.method2721(3, 1);
                        var5.method118(var8, (byte) -100, 1);
                        int var9 = class560.field7678.method2721(1, 1);
                        if (~var9 == -2) {
                            class318.field4517[class770.field10602++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class245.field3206[class178.field2352++] = var4;
                        var5.field6141 = class336.field4733;
                        if (~class560.field7678.method2721(1, 1) == -2) {
                            int var10 = class560.field7678.method2721(3, 1);
                            var5.method118(var10, (byte) -100, 2);
                            int var11 = class560.field7678.method2721(3, 1);
                            var5.method118(var11, (byte) -100, 2);
                        } else {
                            int var12 = class560.field7678.method2721(3, arg0 ^ -3);
                            var5.method118(var12, (byte) -100, 0);
                        }
                        int var13 = class560.field7678.method2721(1, 1);
                        if (~var13 == -2) {
                            class318.field4517[class770.field10602++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class270.field3943[class628.field8508++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)I", line = 322)
    public final int method39(int arg0, byte arg1) {
        ++field6058;
        if (arg1 != 69) {
            method2542(19, 48);
        }
        if (!super.field2668.method2249((byte) 118).method2151((byte) -6)) {
            return 3;
        } else {
            return ~arg0 == -4 && !class689.method3776("jagdx", -1) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILrd;)V", line = 340)
    public class422(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I", line = 343)
    public final int method36(int arg0) {
        ++field6063;
        if (arg0 >= -14) {
            return -109;
        } else {
            this.field6065 = true;
            return !super.field2668.method2249((byte) 116).method2151((byte) -6) ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lrd;)V", line = 363)
    public class422(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)Z", line = 371)
    public final boolean method2544(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field6067;
            return this.field6059;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V", line = 383)
    public final void method41(int arg0, byte arg1) {
        if (arg1 >= -7) {
            field6071 = null;
        }
        super.field2669 = arg0;
        ++field6061;
        this.field6065 = false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z", line = 406)
    public final boolean method2545(byte arg0) {
        if (arg0 != 8) {
            method2542(-100, -88);
        }
        ++field6057;
        return super.field2668.method2249((byte) 120).method2151((byte) -6);
    }
}
