import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class307 implements class310 {

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lhl;")
    private class375 field4550 = new class375(128);

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "[I")
    public int[] field4552 = new int[class429.field6177.field878];

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[I")
    private int[] field4544 = new int[class429.field6177.field878];

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Z")
    public static boolean field4546 = false;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field4556;

    static {
        new class44("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 6)
    public final void method1953(byte arg0) {
        if (arg0 >= -119) {
            this.field4544 = null;
        }
        for (int var2 = 0; var2 < class429.field6177.field878; var2++) {
            class21 var3 = class429.field6177.method431(var2, (byte) -70);
            if (var3 != null && var3.field225 == 0) {
                this.field4544[var2] = 0;
                this.field4552[var2] = 0;
            }
        }
        field4553++;
        this.field4550 = new class375(128);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BZ)I", line = 35)
    public final int method1954(byte arg0, boolean arg1) {
        if (arg0 < 92) {
            return -118;
        }
        field4551++;
        long var3 = class165.method1188((byte) 26);
        for (class315 var5 = arg1 ? (class315) this.field4550.method2285(87) : (class315) this.field4550.method2283((byte) 11); var5 != null; var5 = (class315) this.field4550.method2283((byte) 11)) {
            if ((var5.field4687 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field4687 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field863;
                    this.field4552[var6] = this.field4544[var6];
                    var5.method421(22071);
                    return var6;
                }
                var5.method421(22071);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)Z", line = 74)
    public static final boolean method1955(int arg0, byte arg1) {
        field4549++;
        int var2 = 126 % ((52 - arg1) / 45);
        return arg0 == 2 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V", line = 84)
    public final void method1956(int arg0, int arg1, int arg2) {
        field4554++;
        class339 var4 = class6.field36.method2152((byte) -118, arg0);
        int var5 = var4.field5015;
        int var6 = var4.field5021;
        int var7 = var4.field5019;
        if (arg1 >= -117) {
            return;
        }
        int var8 = class70.field1151[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1960(arg2 << var6 & var9 | ~var9 & this.field4544[var5], (byte) -12, var5);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBI)V", line = 114)
    public final void method1957(int arg0, byte arg1, int arg2) {
        this.field4552[arg0] = arg2;
        field4547++;
        class315 var4 = (class315) this.field4550.method2284(true, (long) arg0);
        if (arg1 != -36) {
            return;
        }
        if (var4 == null) {
            class315 var5 = new class315(class165.method1188((byte) 26) + 500L);
            this.field4550.method2292((long) arg0, var5, (byte) -127);
        } else {
            var4.field4687 = class165.method1188((byte) 26) + 500L;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)I", line = 139)
    public final int method1958(int arg0, int arg1) {
        field4555++;
        class339 var3 = class6.field36.method2152((byte) -120, arg0);
        if (arg1 != 0) {
            this.method1958(12, -41);
        }
        int var4 = var3.field5015;
        int var5 = var3.field5021;
        int var6 = var3.field5019;
        int var7 = class70.field1151[var6 - var5];
        return this.field4552[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)V", line = 160)
    public final void method1959(int arg0, int arg1, int arg2) {
        field4556++;
        class339 var4 = class6.field36.method2152((byte) -120, arg0);
        int var5 = var4.field5015;
        int var6 = var4.field5021;
        int var7 = var4.field5019;
        if (arg1 != 12674) {
            this.method1960(125, (byte) -93, -8);
        }
        int var8 = class70.field1151[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1957(var5, (byte) -36, ~var9 & this.field4552[var5] | var9 & arg2 << var6);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IBI)V", line = 191)
    public final void method1960(int arg0, byte arg1, int arg2) {
        field4548++;
        this.field4544[arg2] = arg0;
        if (arg1 != -12) {
            return;
        }
        class315 var4 = (class315) this.field4550.method2284(true, (long) arg2);
        if (var4 == null) {
            class315 var5 = new class315(4611686018427387905L);
            this.field4550.method2292((long) arg2, var5, (byte) -127);
        } else if (var4.field4687 != 4611686018427387905L) {
            var4.field4687 = class165.method1188((byte) 26) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)I", line = 229)
    public final int method1961(int arg0, int arg1) {
        field4545++;
        return arg0 == -6019 ? this.field4552[arg1] : -78;
    }
}
