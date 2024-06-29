import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class114 {

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "[I")
    private int[] field1546 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Lgn;")
    public class504 field1552;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
    private int[] field1539;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[S")
    private short[] field1538;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[S")
    private short[] field1542;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "[S")
    private short[] field1548;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "[S")
    private short[] field1550;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lld;")
    public final class117 method763(int arg0) {
        field1551++;
        class117[] var2 = new class117[5];
        int var3 = 0;
        class53 var4 = this.field1552.field7464;
        synchronized (this.field1552.field7464) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field1546[var5] != -1) {
                    var2[var3++] = class488.method2813(this.field1552.field7464, 0, this.field1546[var5], -1);
                }
                var5++;
            }
        }
        if (arg0 != -14) {
            method764(true, 63);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1605 < 13) {
                var2[var6].method789(0, 0);
            }
        }
        class117 var7 = new class117(var2, var3);
        if (this.field1550 != null) {
            for (int var8 = 0; var8 < this.field1550.length; var8++) {
                var7.method785(false, this.field1548[var8], this.field1550[var8]);
            }
        }
        if (this.field1542 != null) {
            for (int var9 = 0; var9 < this.field1542.length; var9++) {
                var7.method794(26656, this.field1538[var9], this.field1542[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)I")
    public static final int method764(boolean arg0, int arg1) {
        if (arg0) {
            field1543++;
            return arg1 >>> 8;
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)Lld;")
    public final class117 method765(byte arg0) {
        field1549++;
        if (this.field1539 == null) {
            return null;
        }
        class117[] var2 = new class117[this.field1539.length];
        class53 var3 = this.field1552.field7464;
        synchronized (this.field1552.field7464) {
            if (arg0 != 38) {
                method764(true, 47);
            }
            int var4 = 0;
            while (true) {
                if (this.field1539.length <= var4) {
                    break;
                }
                var2[var4] = class488.method2813(this.field1552.field7464, 0, this.field1539[var4], -1);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field1539.length; var5++) {
            if (var2[var5].field1605 < 13) {
                var2[var5].method789(0, 0);
            }
        }
        class117 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class117(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1550 != null) {
            for (int var7 = 0; var7 < this.field1550.length; var7++) {
                var6.method785(false, this.field1548[var7], this.field1550[var7]);
            }
        }
        if (this.field1542 != null) {
            for (int var8 = 0; var8 < this.field1542.length; var8++) {
                var6.method794(26656, this.field1538[var8], this.field1542[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method766(byte arg0, String arg1, String arg2, int arg3) {
        field1547++;
        class32.field370 = 2;
        if (arg0 == -71) {
            class170.field2476 = arg3;
            class146.method914(arg2, arg0 ^ 0xFFFFFFB9, arg1);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)Z")
    public final boolean method767(byte arg0) {
        field1544++;
        if (this.field1539 == null) {
            return true;
        }
        boolean var2 = true;
        class53 var3 = this.field1552.field7464;
        synchronized (this.field1552.field7464) {
            for (int var4 = 0; var4 < this.field1539.length; var4++) {
                if (!this.field1552.field7464.method448(0, this.field1539[var4], 90)) {
                    var2 = false;
                }
            }
            if (arg0 != 40) {
                this.field1550 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lwm;BI)V")
    private final void method768(class403 arg0, byte arg1, int arg2) {
        field1540++;
        if (arg2 == 1) {
            arg0.method2357((byte) 117);
        } else if (arg2 == 2) {
            int var4 = arg0.method2357((byte) 114);
            this.field1539 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1539[var5] = arg0.method2338(0);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method2357((byte) 123);
                this.field1550 = new short[var6];
                this.field1548 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1550[var7] = (short) arg0.method2338(0);
                    this.field1548[var7] = (short) arg0.method2338(0);
                }
            } else if (arg2 == 41) {
                int var8 = arg0.method2357((byte) 110);
                this.field1538 = new short[var8];
                this.field1542 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1542[var9] = (short) arg0.method2338(0);
                    this.field1538[var9] = (short) arg0.method2338(0);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field1546[arg2 - 60] = arg0.method2338(0);
            }
        }
        if (arg1 > -85) {
            method764(false, -105);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILwm;)V")
    public final void method769(int arg0, class403 arg1) {
        field1545++;
        while (true) {
            int var3 = arg1.method2357((byte) 107);
            if (var3 == 0) {
                if (arg0 > -80) {
                    this.field1552 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method768(arg1, (byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)Z")
    public final boolean method770(byte arg0) {
        field1541++;
        boolean var2 = true;
        class53 var3 = this.field1552.field7464;
        synchronized (this.field1552.field7464) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field1546[var4] != -1 && !this.field1552.field7464.method448(0, this.field1546[var4], 120)) {
                    var2 = false;
                }
            }
            if (arg0 >= -46) {
                this.field1548 = null;
            }
            return var2;
        }
    }
}
