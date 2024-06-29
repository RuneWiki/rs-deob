import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public abstract class class748 extends class513 {

    @OriginalMember(owner = "client!eia", name = "r", descriptor = "Z")
    public boolean field10414;

    @OriginalMember(owner = "client!eia", name = "B", descriptor = "[Leia;")
    public class748[] field10424;

    @OriginalMember(owner = "client!eia", name = "u", descriptor = "[J")
    public static long[] field10417 = new long[100];

    @OriginalMember(owner = "client!eia", name = "D", descriptor = "Lqk;")
    public static class148 field10426 = new class148(106, -1);

    @OriginalMember(owner = "client!eia", name = "E", descriptor = "I")
    public static int field10427 = 0;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
    public int field10412;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!eia", name = "s", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!eia", name = "v", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!eia", name = "w", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!eia", name = "y", descriptor = "I")
    public static int field10421;

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "I")
    public static int field10422;

    @OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!eia", name = "C", descriptor = "I")
    public static int field10425;

    @OriginalMember(owner = "client!eia", name = "F", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!eia", name = "G", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!eia", name = "x", descriptor = "Lcga;")
    public class142 field10420;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "Lwq;")
    public class676 field10407;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 12)
    public static final void method4156(int arg0) {
        for (class480 var1 = (class480) class314.field4033.method667(true); var1 != null; var1 = (class480) class314.field4033.method662((byte) 10)) {
            if (var1.field6524 > 1) {
                var1.field6524 = 0;
                class105.field1528.method3199((byte) 78, var1, ((class6) var1.field6519.field1417.field3781).field48);
                var1.field6519.method661(false);
            }
        }
        field10422++;
        if (arg0 != 2) {
            return;
        }
        class367.field4714 = 0;
        class605.field8642 = 0;
        class478.field6510.method3122(0);
        class675.field9509.method1385((byte) -97);
        class314.field4033.method661(false);
        class712.method3995(11492, class378.field5264);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)V", line = 47)
    public void method793(int arg0, int arg1, int arg2) {
        field10425++;
        int var4 = ~this.field10412 == arg2 ? arg0 : this.field10412;
        if (this.field10414) {
            this.field10407 = new class676(var4, arg0, arg1);
        } else {
            this.field10420 = new class142(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IBI)[I", line = 67)
    public final int[] method4157(int arg0, byte arg1, int arg2) {
        int var4 = 86 % ((-arg1 - 28) / 40);
        field10423++;
        return this.field10424[arg0].field10414 ? this.field10424[arg0].method25(arg2, 255) : this.field10424[arg0].method445(arg2, 0)[0];
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V", line = 93)
    public void method23(byte arg0) {
        if (arg0 == 67) {
            field10415++;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(B)I", line = 105)
    public int method3362(byte arg0) {
        if (arg0 <= 109) {
            return 36;
        } else {
            field10421++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V", line = 116)
    public static void method4158(int arg0) {
        if (arg0 == 3) {
            field10426 = null;
            field10417 = null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(III)[[I", line = 140)
    public final int[][] method4159(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field10426 = null;
        }
        field10410++;
        if (this.field10424[arg0].field10414) {
            int[] var4 = this.field10424[arg0].method25(arg2, 255);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field10424[arg0].method445(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "(III)V", line = 172)
    public static final void method4160(int arg0, int arg1, int arg2) {
        field10409++;
        class118 var3 = class126.method814(true, arg1, arg0);
        var3.method771(arg0 - 30560);
        var3.field1636 = arg2;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IZLvj;)V", line = 185)
    public void method20(int arg0, boolean arg1, class26 arg2) {
        field10413++;
        if (arg1) {
            this.field10420 = null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[BIZ)Ljava/lang/String;", line = 200)
    public static final String method4161(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field10429++;
        char[] var4 = new char[arg2];
        if (!arg3) {
            field10417 = null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class647.field9172[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IZ)V", line = 241)
    public class748(int arg0, boolean arg1) {
        this.field10414 = arg1;
        this.field10424 = new class748[arg0];
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)[I", line = 262)
    public int[] method25(int arg0, int arg1) {
        if (arg1 == 255) {
            field10411++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(II)[[I", line = 275)
    public int[][] method445(int arg0, int arg1) {
        if (arg1 != 0) {
            method4158(-118);
        }
        field10416++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)V", line = 286)
    public void method792(boolean arg0) {
        if (arg0) {
            method4160(69, 77, -125);
        }
        if (this.field10414) {
            this.field10407.method3872(-127);
            this.field10407 = null;
        } else {
            this.field10420.method929(-113);
            this.field10420 = null;
        }
        field10419++;
    }

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "(I)I", line = 316)
    public int method795(int arg0) {
        int var2 = -26 / ((-arg0 - 73) / 38);
        field10418++;
        return -1;
    }
}
