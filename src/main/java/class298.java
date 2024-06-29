import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class298 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    private int[] field4166 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
    public boolean field4167 = false;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field4176 = -1;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Ltq;")
    public static class376 field4178;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
    private int[] field4173;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[S")
    private short[] field4168;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[S")
    private short[] field4169;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[S")
    private short[] field4170;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[S")
    private short[] field4179;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIII)V")
    public static final void method1964(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -48001) {
            method1966(true);
        }
        field4162++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class313.field4484 = arg3;
        class138.field1719 = arg2;
        class217.field3062 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lsd;")
    public static final class50 method1965(int arg0, byte arg1) {
        field4172++;
        class50 var2 = (class50) class72.field867.method1625((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field787.method2431((byte) 88, 33, arg0);
        class50 var4 = new class50();
        if (arg1 <= 94) {
            method1965(82, (byte) -61);
        }
        if (var3 != null) {
            var4.method290(arg0, -28076, new class236(var3));
        }
        class72.field867.method1622((byte) 13, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public static void method1966(boolean arg0) {
        field4178 = null;
        if (!arg0) {
            method1966(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILdg;I)V")
    private final void method1967(int arg0, class236 arg1, int arg2) {
        if (arg2 != -42) {
            return;
        }
        if (arg0 == 1) {
            this.field4176 = arg1.method1574(arg2 ^ 0x58);
        } else if (arg0 == 2) {
            int var8 = arg1.method1574(-65);
            this.field4173 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4173[var9] = arg1.method1617((byte) 48);
            }
        } else if (arg0 == 3) {
            this.field4167 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1574(-114);
            this.field4170 = new short[var6];
            this.field4169 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4170[var7] = (short) arg1.method1617((byte) 48);
                this.field4169[var7] = (short) arg1.method1617((byte) 48);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1574(-30);
            this.field4168 = new short[var4];
            this.field4179 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4168[var5] = (short) arg1.method1617((byte) 48);
                this.field4179[var5] = (short) arg1.method1617((byte) 48);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4166[arg0 - 60] = arg1.method1617((byte) 48);
        }
        field4175++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
    public final boolean method1968(int arg0) {
        field4163++;
        if (this.field4173 == null) {
            return true;
        }
        boolean var2 = true;
        class376 var3 = class129.field1571;
        synchronized (class129.field1571) {
            for (int var4 = arg0; var4 < this.field4173.length; var4++) {
                if (!class129.field1571.method2426(false, this.field4173[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Ltr;")
    public final class160 method1969(byte arg0) {
        if (arg0 != -12) {
            this.field4179 = null;
        }
        field4181++;
        class160[] var2 = new class160[5];
        int var3 = 0;
        class376 var4 = class129.field1571;
        synchronized (class129.field1571) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field4166[var5] != -1) {
                    var2[var3++] = class248.method1690(class129.field1571, true, 0, this.field4166[var5]);
                }
            }
        }
        class160 var6 = new class160(var2, var3);
        if (this.field4170 != null) {
            for (int var7 = 0; var7 < this.field4170.length; var7++) {
                var6.method1031(this.field4170[var7], 0, this.field4169[var7]);
            }
        }
        if (this.field4168 != null) {
            for (int var8 = 0; var8 < this.field4168.length; var8++) {
                var6.method1027((byte) 57, this.field4179[var8], this.field4168[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZIII)I")
    public static final int method1970(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4180++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0) {
            field4171 = 39;
        }
        if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Ltr;")
    public final class160 method1971(byte arg0) {
        field4177++;
        if (this.field4173 == null) {
            return null;
        } else if (arg0 == -3) {
            class160[] var2 = new class160[this.field4173.length];
            class376 var3 = class129.field1571;
            synchronized (class129.field1571) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field4173.length) {
                        break;
                    }
                    var2[var4] = class248.method1690(class129.field1571, true, 0, this.field4173[var4]);
                    var4++;
                }
            }
            class160 var5;
            if (var2.length == 1) {
                var5 = var2[0];
            } else {
                var5 = new class160(var2, var2.length);
            }
            if (var5 == null) {
                return null;
            }
            if (this.field4170 != null) {
                for (int var6 = 0; var6 < this.field4170.length; var6++) {
                    var5.method1031(this.field4170[var6], arg0 + 3, this.field4169[var6]);
                }
            }
            if (this.field4168 != null) {
                for (int var7 = 0; var7 < this.field4168.length; var7++) {
                    var5.method1027((byte) 80, this.field4179[var7], this.field4168[var7]);
                }
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ldg;B)V")
    public final void method1972(class236 arg0, byte arg1) {
        field4174++;
        if (arg1 > -19) {
            this.field4167 = true;
        }
        while (true) {
            int var3 = arg0.method1574(-108);
            if (var3 == 0) {
                return;
            }
            this.method1967(var3, arg0, -42);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
    public final boolean method1973(int arg0) {
        field4164++;
        if (arg0 != -1) {
            field4178 = null;
        }
        boolean var2 = true;
        class376 var3 = class129.field1571;
        synchronized (class129.field1571) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4166[var4] != -1 && !class129.field1571.method2426(false, this.field4166[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
