import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class41 {

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "Lfc;")
    private class174 field452 = new class174(64);

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Loi;")
    private class53 field453;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Loi;")
    private class53 field449;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lsq;IIIII)V", line = 9)
    public static final void method233(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1669 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class400.field5635[arg1][var6][var7];
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
                        class391 var13 = class74.field899[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field1669; var14++) {
                            if (arg0.field1662[var14] == var13.field5504) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field1662[arg0.field1669++] = var13.field5504;
                        if (arg0.field1669 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field1669; var15 < 4; var15++) {
            arg0.field1662[var15] = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)I", line = 74)
    public static final int method234(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field454++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg0) {
            return -76;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I", line = 109)
    public static final int method235(int arg0, int arg1) {
        if (arg0 == -30322) {
            field451++;
            return arg1 >>> 7;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZZ)Z", line = 121)
    public static boolean method236(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)Ldt;", line = 129)
    public final class162 method237(int arg0, byte arg1) {
        field448++;
        if (arg1 < 61) {
            this.field449 = null;
        }
        class162 var3 = (class162) this.field452.method1088((long) arg0, (byte) -18);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field453.method426(0, (byte) 9, arg0);
        } else {
            var4 = this.field449.method426(0, (byte) 9, arg0 & 0x7FFF);
        }
        class162 var5 = new class162();
        if (var4 != null) {
            var5.method1034(false, new class403(var4));
        }
        if (arg0 >= 32768) {
            var5.method1029(4376);
        }
        this.field452.method1097(19627, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(ILoi;Loi;)V", line = 166)
    public class41(int arg0, class53 arg1, class53 arg2) {
        this.field453 = arg1;
        this.field449 = arg2;
        if (this.field453 != null) {
            this.field453.method435(0, 0);
        }
        if (this.field449 != null) {
            this.field449.method435(0, 0);
        }
    }
}
