import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class308 extends class77 {

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "Z")
    public boolean field4614 = true;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "[I")
    public static int[] field4605 = new int[2000];

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "[F")
    public static float[] field4604 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "[I")
    public int[] field4600;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
    private int[] field4611;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field4599;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "[[I")
    private int[][] field4615;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)I", line = 4)
    public final int method2161(int arg0, byte arg1) {
        if (arg1 != -19) {
            field4605 = (int[]) null;
        }
        field4617++;
        return this.field4611 == null || arg0 < 0 || this.field4611.length < arg0 ? -1 : this.field4611[arg0];
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)Ljava/lang/String;", line = 20)
    public final String method2162(byte arg0) {
        field4609++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4599 == null) {
            return "";
        } else if (arg0 < 21) {
            return (String) null;
        } else {
            var2.append(this.field4599[0]);
            for (int var3 = 1; var3 < this.field4599.length; var3++) {
                var2.append("...");
                var2.append(this.field4599[var3]);
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZ)I", line = 48)
    public final int method2163(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 102;
        }
        field4610++;
        if (this.field4611 == null || arg1 < 0 || this.field4611.length < arg1) {
            return -1;
        } else if (this.field4615[arg1] == null || arg0 < 0 || arg0 > this.field4615[arg1].length) {
            return -1;
        } else {
            return this.field4615[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILsb;I)V", line = 67)
    private final void method2164(int arg0, class190 arg1, int arg2) {
        field4616++;
        if (arg0 != -1) {
            field4605 = (int[]) null;
        }
        if (arg2 == 1) {
            this.field4599 = class304.method2141(arg1.method1329((byte) 59), '<', arg0 - 41);
        } else if (arg2 == 2) {
            int var8 = arg1.method1319(255);
            this.field4600 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4600[var9] = arg1.method1317((byte) 23);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1319(255);
            this.field4615 = new int[var4][];
            this.field4611 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1317((byte) 96);
                this.field4611[var5] = var6;
                this.field4615[var5] = new int[class128.field1868[var6]];
                for (int var7 = 0; var7 < class128.field1868[var6]; var7++) {
                    this.field4615[var5][var7] = arg1.method1317((byte) 9);
                }
            }
        } else if (arg2 == 4) {
            this.field4614 = false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)I", line = 132)
    public final int method2165(int arg0) {
        field4601++;
        if (this.field4611 == null) {
            return 0;
        } else {
            if (arg0 <= 62) {
                this.method2161(88, (byte) 62);
            }
            return this.field4611.length;
        }
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)V", line = 149)
    public static void method2166(int arg0) {
        field4605 = null;
        if (arg0 != 32768) {
            field4605 = (int[]) null;
        }
        field4604 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBILei;)V", line = 173)
    public static final void method2167(int arg0, int arg1, byte arg2, int arg3, class261 arg4) {
        field4603++;
        class349 var5 = (class349) class247.field3654.method93((byte) -112);
        int var6 = 6 / ((29 - arg2) / 53);
        while (var5 != null) {
            if (var5.field5387 == arg0 && arg1 * 128 == var5.field5386 && arg3 * 128 == var5.field5403 && var5.field5388.field3977 == arg4.field3977) {
                if (var5.field5405 != null) {
                    class179.field2576.method1397(var5.field5405);
                    var5.field5405 = null;
                }
                if (var5.field5397 != null) {
                    class179.field2576.method1397(var5.field5397);
                    var5.field5397 = null;
                }
                var5.method876(8);
                return;
            }
            var5 = (class349) class247.field3654.method97(-83);
        }
    }

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V", line = 214)
    public final void method2168(int arg0) {
        field4612++;
        if (arg0 == 16567 && this.field4600 != null) {
            for (int var2 = 0; var2 < this.field4600.length; var2++) {
                this.field4600[var2] = class81.method666(this.field4600[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([ILsb;Z)V", line = 235)
    public final void method2169(int[] arg0, class190 arg1, boolean arg2) {
        if (!arg2) {
            this.method2165(-128);
        }
        field4607++;
        if (this.field4611 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4611.length && arg0.length > var4; var4++) {
            int var5 = class127.field1857[this.method2161(var4, (byte) -19)];
            if (var5 > 0) {
                arg1.method1346((long) arg0[var4], var5, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLsb;)Ljava/lang/String;", line = 264)
    public final String method2170(byte arg0, class190 arg1) {
        if (arg0 != -68) {
            return (String) null;
        }
        field4608++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4611 != null) {
            for (int var4 = 0; var4 < this.field4611.length; var4++) {
                var3.append(this.field4599[var4]);
                var3.append(class255.method1873(this.field4615[var4], arg0 - 32053, arg1.method1357((byte) -74, class170.field2452[this.field4611[var4]]), this.field4611[var4]));
            }
        }
        var3.append(this.field4599[this.field4599.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lph;B)V", line = 296)
    public static final void method2171(class361 arg0, byte arg1) {
        class93.field1293 = arg0;
        field4606++;
        if (arg1 <= 118) {
            field4598 = 36;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILsb;)V", line = 310)
    public final void method2172(int arg0, class190 arg1) {
        if (arg0 != -15067) {
            this.method2161(-39, (byte) 11);
        }
        while (true) {
            int var3 = arg1.method1319(arg0 ^ 0xFFFFC5DA);
            if (var3 == 0) {
                field4613++;
                return;
            }
            this.method2164(arg0 ^ 0x3ADA, arg1, var3);
        }
    }
}
