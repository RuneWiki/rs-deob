import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class90 extends class11 {

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    private int field1417 = -1;

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!dg", name = "pb", descriptor = "Z")
    private volatile boolean field1426 = false;

    @OriginalMember(owner = "client!dg", name = "tb", descriptor = "Llg;")
    private class195 field1430;

    @OriginalMember(owner = "client!dg", name = "xb", descriptor = "Llg;")
    private class195 field1434;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!dg", name = "sb", descriptor = "Lsc;")
    public static class181 field1429 = class149.method967(255, "::fpson");

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!dg", name = "Cb", descriptor = "Lsc;")
    private static class181 field1439 = class149.method967(255, "Starting 3d library");

    @OriginalMember(owner = "client!dg", name = "Ab", descriptor = "I")
    public static int field1437 = 0;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lsc;")
    public static class181 field1416 = field1439;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!dg", name = "qb", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!dg", name = "ub", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!dg", name = "vb", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!dg", name = "wb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!dg", name = "Db", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "Lec;")
    public static class104 field1420;

    @OriginalMember(owner = "client!dg", name = "Bb", descriptor = "Lch;")
    public static class51 field1438;

    @OriginalMember(owner = "client!dg", name = "yb", descriptor = "Ldg;")
    public static class90 field1435;

    @OriginalMember(owner = "client!dg", name = "zb", descriptor = "[Z")
    private volatile boolean[] field1436;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V")
    public final void method593(int arg0, byte arg1, int arg2) {
        ++field1421;
        this.field1428 = arg2;
        this.field1432 = arg0;
        if (arg1 <= 16) {
            this.field1414 = 22;
        }
        if (this.field1430 != null) {
            class224.method1480(this.field1430, this, this.field1414, (byte) -7);
        } else {
            class66.method471(127, true, this.field1414, this.field1432, 255, this, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method594(boolean arg0) {
        if (arg0) {
            method594(false);
        }
        field1439 = null;
        field1438 = null;
        field1429 = null;
        field1420 = null;
        field1416 = null;
        field1435 = null;
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(II)V")
    public final void method119(int arg0, int arg1) {
        ++field1440;
        if (this.method108(arg1, (byte) 104)) {
            if (this.field1434 != null && this.field1436 != null && this.field1436[arg1]) {
                class224.method1480(this.field1434, this, arg1, (byte) -7);
            } else {
                class66.method471(arg0 + -25965, true, arg1, super.field234[arg1], this.field1414, this, (byte) 2);
            }
            if (arg0 != 26072) {
                this.method596(-113, (byte[]) null, false, 68, true);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)I")
    public final int method595(int arg0) {
        ++field1415;
        if (this.field1426) {
            return 100;
        } else if (super.field209 != null) {
            return 99;
        } else if (arg0 != 29455) {
            return 90;
        } else {
            int var2 = class179.method1190(this.field1414, -554, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public final void method99(int arg0, int arg1) {
        ++field1433;
        if (arg0 <= -88) {
            if (this.method108(arg1, (byte) 95)) {
                class186.method1296(arg1, 0, this.field1414);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[BZIZ)V")
    public final void method596(int arg0, byte[] arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg3 < 29) {
            this.field1428 = 75;
        }
        ++field1419;
        if (arg4) {
            if (this.field1426) {
                throw new RuntimeException();
            } else {
                if (this.field1430 != null) {
                    class211.method1402(this.field1430, arg1, this.field1414, -11937);
                }
                this.method116(arg1, (byte) 60);
                this.method598((byte) 50);
            }
        } else {
            arg1[arg1.length + -2] = (byte) (super.field212[arg0] >> 8);
            arg1[arg1.length + -1] = (byte) super.field212[arg0];
            if (this.field1434 != null) {
                class211.method1402(this.field1434, arg1, arg0, -11937);
                this.field1436[arg0] = true;
            }
            if (arg2) {
                super.field209[arg0] = class184.method1261(arg1, false, -1);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Llg;IIZ[B)V")
    public final void method597(class195 arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field1425;
        if (this.field1430 != arg0) {
            if (!arg3 && this.field1417 == arg2) {
                this.field1426 = true;
            }
            if (arg4 == null || arg4.length <= 2) {
                this.field1436[arg2] = false;
                if (this.field1424 || arg3) {
                    class66.method471(113, arg3, arg2, super.field234[arg2], this.field1414, this, (byte) 2);
                }
                return;
            }
            class250.field4344.reset();
            class250.field4344.update(arg4, 0, arg4.length - 2);
            int var6 = (int) class250.field4344.getValue();
            int var7 = ((255 & arg4[arg4.length + -2]) << 8) + (arg4[arg4.length + -1] & 255);
            if (super.field234[arg2] != var6 || ~super.field212[arg2] != ~var7) {
                this.field1436[arg2] = false;
                if (this.field1424 || arg3) {
                    class66.method471(105, arg3, arg2, super.field234[arg2], this.field1414, this, (byte) 2);
                }
                return;
            }
            this.field1436[arg2] = true;
            if (arg3) {
                super.field209[arg2] = class184.method1261(arg4, false, arg1 + -256);
            }
        } else {
            if (this.field1426) {
                throw new RuntimeException();
            }
            if (arg4 == null) {
                class66.method471(111, true, this.field1414, this.field1432, 255, this, (byte) 0);
                return;
            }
            class250.field4344.reset();
            class250.field4344.update(arg4, 0, arg4.length);
            int var8 = (int) class250.field4344.getValue();
            if (~this.field1432 != ~var8) {
                class66.method471(113, true, this.field1414, this.field1432, 255, this, (byte) 0);
                return;
            }
            class230 var9;
            try {
                var9 = new class230(class18.method170(arg4, true));
            } catch (RuntimeException var12) {
                class66.method471(100, true, this.field1414, this.field1432, 255, this, (byte) 0);
                return;
            }
            int var10 = var9.method1516((byte) 82);
            if (var10 != 5 && ~var10 != -7) {
                class66.method471(arg1 ^ 147, true, this.field1414, this.field1432, 255, this, (byte) 0);
                return;
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method1529(arg1 ^ -32275);
            }
            if (this.field1428 != var11) {
                class66.method471(105, true, this.field1414, this.field1432, 255, this, (byte) 0);
                return;
            }
            this.method116(arg4, (byte) 77);
            this.method598((byte) 50);
        }
        if (arg1 != 255) {
            field1420 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Llg;Llg;IZZZ)V")
    public class90(class195 arg0, class195 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1430 = arg1;
        this.field1434 = arg0;
        this.field1414 = arg2;
        this.field1424 = arg5;
        class94.method619(this, this.field1414, false);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    private final void method598(byte arg0) {
        ++field1431;
        this.field1436 = new boolean[super.field209.length];
        for (int var2 = 0; var2 < this.field1436.length; ++var2) {
            this.field1436[var2] = false;
        }
        if (this.field1434 == null) {
            this.field1426 = true;
        } else {
            this.field1417 = -1;
            if (arg0 != 50) {
                this.method598((byte) -17);
            }
            for (int var3 = 0; ~var3 > ~this.field1436.length; ++var3) {
                if (super.field243[var3] > 0) {
                    class244.method1650(var3, this, this.field1434, arg0 ^ -5996);
                    this.field1417 = var3;
                }
            }
            if (~this.field1417 == 0) {
                this.field1426 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public final int method92(int arg0, int arg1) {
        ++field1418;
        if (!this.method108(arg1, (byte) 88)) {
            return 0;
        } else if (super.field209[arg1] != null) {
            return 100;
        } else if (arg0 != -6078) {
            return -80;
        } else {
            return this.field1436[arg1] ? 100 : class179.method1190(arg1, arg0 ^ 5524, this.field1414);
        }
    }
}
