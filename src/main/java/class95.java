import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class95 {

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field1375 = 0;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field1374 = -1;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Z")
    public boolean field1383 = false;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    public int field1384 = 127;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public int field1376 = 128;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field1373 = 1190717;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public int field1386 = -1;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public int field1388 = 16;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public int field1385 = -1;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public int field1378 = 8;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Z")
    public boolean field1389 = true;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Z")
    public boolean field1382 = true;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field1387 = -1;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "Z")
    public static boolean field1394 = true;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Lpg;")
    public static class492 field1381 = new class492(109, 3);

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Lhs;")
    public class94 field1380;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 5)
    public static final void method660(int arg0) {
        field1392++;
        class33.field515.method937(0);
        class21.field321.method1580(-5735);
        class163.field2386.method1580(-5735);
        if (arg0 != 21365) {
            method660(-95);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILtl;I)V", line = 24)
    private final void method661(int arg0, class91 arg1, int arg2) {
        field1391++;
        int var4 = 73 % ((-arg2 - 24) / 54);
        if (arg0 == 1) {
            this.field1375 = class509.method3037(arg1.method641(32455), true);
        } else if (arg0 == 2) {
            this.field1385 = arg1.method618((byte) 100);
            return;
        } else if (arg0 == 3) {
            this.field1385 = arg1.method631(10494);
            if (this.field1385 == 65535) {
                this.field1385 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field1382 = false;
            return;
        } else if (arg0 == 7) {
            this.field1374 = class509.method3037(arg1.method641(32455), true);
            return;
        } else if (arg0 == 8) {
            this.field1380.field1366 = this.field1393;
            return;
        } else if (arg0 == 9) {
            this.field1376 = arg1.method631(10494) << 0;
            return;
        } else if (arg0 == 10) {
            this.field1389 = false;
            return;
        } else if (arg0 == 11) {
            this.field1378 = arg1.method618((byte) 100);
            return;
        } else if (arg0 == 12) {
            this.field1383 = true;
            return;
        } else if (arg0 == 13) {
            this.field1373 = arg1.method641(32455);
            return;
        } else {
            if (arg0 == 14) {
                this.field1388 = arg1.method618((byte) 100);
            } else if (arg0 == 15) {
                this.field1386 = arg1.method631(10494);
                if (this.field1386 == 65535) {
                    this.field1386 = -1;
                    return;
                }
                return;
            } else if (arg0 == 16) {
                this.field1384 = arg1.method618((byte) 100);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ltl;I)V", line = 128)
    public final void method662(class91 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field1390++;
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method661(var3, arg0, arg1 - 100);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 156)
    public final void method663(int arg0) {
        if (this.field1386 == -1) {
            this.field1386 = this.field1385;
        }
        field1377++;
        this.field1378 = this.field1393 | this.field1378 << 8;
        if (arg0 != -32202) {
            this.method663(-114);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 189)
    public static void method664(byte arg0) {
        if (arg0 <= 9) {
            field1394 = true;
        }
        field1381 = null;
    }
}
