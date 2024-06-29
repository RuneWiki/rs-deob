import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class318 extends class446 {

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Z")
    public boolean field4349 = true;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field4336 = -60;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
    public static int[] field4341 = new int[5];

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[I")
    public int[] field4338;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "[I")
    private int[] field4344;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field4340;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[[I")
    private int[][] field4343;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Ljava/lang/String;", line = 4)
    public final String method2053(int arg0) {
        field4345++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4340 == null) {
            return "";
        }
        var2.append(this.field4340[arg0]);
        for (int var3 = 1; var3 < this.field4340.length; var3++) {
            var2.append("...");
            var2.append(this.field4340[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V", line = 32)
    public static void method2054(byte arg0) {
        if (arg0 != 8) {
            method2063(-72, (class268) null);
        }
        field4341 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLkh;I)V", line = 42)
    private final void method2055(byte arg0, class11 arg1, int arg2) {
        field4346++;
        if (arg0 != 64) {
            method2059((byte) -89);
        }
        if (arg2 == 1) {
            this.field4340 = class46.method408((byte) 68, '<', arg1.method171(arg0 ^ 0xFFFFDB8F));
        } else if (arg2 == 2) {
            int var8 = arg1.method172((byte) 52);
            this.field4338 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4338[var9] = arg1.method174(255);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method172((byte) 52);
            this.field4343 = new int[var4][];
            this.field4344 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method174(arg0 ^ 0xBF);
                this.field4344[var5] = var6;
                this.field4343[var5] = new int[class310.field4249[var6]];
                for (int var7 = 0; var7 < class310.field4249[var6]; var7++) {
                    this.field4343[var5][var7] = arg1.method174(255);
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field4349 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILkh;)Ljava/lang/String;", line = 108)
    public final String method2056(int arg0, class11 arg1) {
        int var3 = -101 % ((arg0 + 43) / 41);
        field4339++;
        StringBuffer var4 = new StringBuffer(80);
        if (this.field4344 != null) {
            for (int var5 = 0; var5 < this.field4344.length; var5++) {
                var4.append(this.field4340[var5]);
                var4.append(class191.method1241(this.field4344[var5], this.field4343[var5], arg1.method153((byte) -128, class239.field3411[this.field4344[var5]]), -8797));
            }
        }
        var4.append(this.field4340[this.field4340.length - 1]);
        return var4.toString();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(ILkh;)V", line = 137)
    public final void method2057(int arg0, class11 arg1) {
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                field4335++;
                if (arg0 != 1) {
                    method2054((byte) -10);
                    return;
                }
                return;
            }
            this.method2055((byte) 64, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I", line = 167)
    public final int method2058(int arg0, int arg1) {
        field4337++;
        if (this.field4344 == null || arg1 < 0 || arg1 > this.field4344.length) {
            return -1;
        } else {
            if (arg0 != -1) {
                this.method2057(42, (class11) null);
            }
            return this.field4344[arg1];
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V", line = 182)
    public static final void method2059(byte arg0) {
        field4351++;
        class90.field1260 = 0;
        class121.field1699.method644(false);
        class121.field1699.method643(class167.field2304, -64);
        if (arg0 >= -22) {
            method2054((byte) -61);
        }
        class90.field1260++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I", line = 197)
    public final int method2060(int arg0, byte arg1, int arg2) {
        field4342++;
        if (this.field4344 == null || arg0 < 0 || arg0 > this.field4344.length) {
            return -1;
        } else if (arg1 >= -73) {
            return 25;
        } else if (this.field4343[arg0] == null || arg2 < 0 || this.field4343[arg0].length < arg2) {
            return -1;
        } else {
            return this.field4343[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I", line = 215)
    public final int method2061(int arg0) {
        field4347++;
        int var2 = -5 % ((-arg0 - 3) / 58);
        return this.field4344 == null ? 0 : this.field4344.length;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lkh;[II)V", line = 234)
    public final void method2062(class11 arg0, int[] arg1, int arg2) {
        field4350++;
        if (this.field4344 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field4344.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class99.field1371[this.method2058(~arg2, var4)];
            if (var5 > 0) {
                arg0.method200(-1, var5, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILnq;)V", line = 273)
    public static final void method2063(int arg0, class268 arg1) {
        int var2 = -69 % ((arg0 - 4) / 59);
        field4334++;
        class231.field3342 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 288)
    public final void method2064(int arg0) {
        if (this.field4338 != null) {
            for (int var2 = 0; var2 < this.field4338.length; var2++) {
                this.field4338[var2] = class393.method2487(this.field4338[var2], 32768);
            }
        }
        if (arg0 != 5) {
            this.field4349 = false;
        }
        field4348++;
    }
}
