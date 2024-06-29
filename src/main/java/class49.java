import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 {

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Ljp;")
    private class236 field766 = new class236(64);

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Ljp;")
    public class236 field769 = new class236(64);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lpc;")
    public class473 field758;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lpc;")
    private class473 field767;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
    public static float field762 = 1.0F;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljp;")
    public static class236 field757 = new class236(8);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbi;IIIII)V")
    public static final void method370(class334 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4383 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class203.field2818[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class360 var13 = class37.field586[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field4383; var14++) {
                            if (arg0.field4380[var14] == var13.field4867) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field4380[arg0.field4383++] = var13.field4867;
                        if (arg0.field4383 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field4383; var15 < 4; var15++) {
            arg0.field4380[var15] = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public final void method371(int arg0, int arg1) {
        class236 var3 = this.field766;
        synchronized (this.field766) {
            this.field766.method1461(-5, arg1);
        }
        field756++;
        class236 var4 = this.field769;
        synchronized (this.field769) {
            this.field769.method1461(-5, arg1);
            if (arg0 != 126) {
                field759 = 10;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lgq;")
    public final class355 method372(int arg0, int arg1) {
        field761++;
        class236 var3 = this.field766;
        class355 var4;
        synchronized (this.field766) {
            var4 = (class355) this.field766.method1456((long) arg1, 112);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field767.method2708(34, arg1, (byte) 54);
        class355 var6 = new class355();
        if (arg0 < 56) {
            return null;
        }
        var6.field4789 = this;
        if (var5 != null) {
            var6.method2077(-29697, new class379(var5));
        }
        class236 var7 = this.field766;
        synchronized (this.field766) {
            this.field766.method1462(var6, (long) arg1, -120);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method373(byte arg0) {
        field757 = null;
        if (arg0 != 41) {
            field759 = 42;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
    public final void method374(int arg0, int arg1, byte arg2) {
        field765++;
        this.field766 = new class236(arg0);
        this.field769 = new class236(arg1);
        if (arg2 <= 56) {
            this.method371(-46, -55);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public final void method375(int arg0) {
        if (arg0 != 126) {
            field759 = -39;
        }
        class236 var2 = this.field766;
        synchronized (this.field766) {
            this.field766.method1459(19088);
        }
        field760++;
        class236 var3 = this.field769;
        synchronized (this.field769) {
            this.field769.method1459(arg0 ^ 0x4AEE);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)I")
    public static final int method376(int arg0, int arg1, int arg2) {
        int var3 = 6 % ((17 - arg0) / 58);
        field768++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (arg2 & 0x7F) * arg1 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method377(boolean arg0) {
        field755++;
        class236 var2 = this.field766;
        synchronized (this.field766) {
            this.field766.method1458((byte) 88);
        }
        class236 var3 = this.field769;
        synchronized (this.field769) {
            this.field769.method1458((byte) 104);
        }
        if (!arg0) {
            field762 = 0.6654326F;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;)V")
    public class49(class234 arg0, int arg1, class473 arg2, class473 arg3) {
        this.field758 = arg3;
        this.field767 = arg2;
        this.field767.method2710(34, (byte) -122);
    }
}
