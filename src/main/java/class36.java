import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class36 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lq;")
    private class209 field411 = new class209();

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lri;")
    private class273 field425 = new class273();

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lkb;")
    private class80 field424;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Luf;")
    public static class168 field412 = class148.method1019(-1720, "blinken2:");

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field414 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[I")
    public static int[] field421 = new int[64];

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static volatile int field417 = 0;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Llj;", line = 15)
    public final class24 method182(int arg0) {
        if (arg0 != 9864) {
            this.method186(45);
        }
        field413++;
        return this.field424.method499((byte) -99);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Llj;", line = 37)
    public final class24 method183(int arg0) {
        if (arg0 == -32596) {
            field420++;
            return this.field424.method488(1);
        } else {
            return (class24) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IFZIIIIII)[[I", line = 63)
    public static final int[][] method184(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg7][arg4];
        class52 var10 = new class52();
        var10.field645 = arg2;
        field416++;
        var10.field642 = (int) (arg1 * 4096.0F);
        int var11 = -40 % ((-arg3 - 1) / 50);
        var10.field644 = arg8;
        var10.field647 = arg5;
        var10.field630 = arg0;
        var10.method80(false);
        class241.method1658(arg7, arg4, (byte) 11);
        for (int var12 = 0; var12 < arg7; var12++) {
            var10.method290(var9[var12], -108, var12);
        }
        return var9;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)Lq;", line = 108)
    public final class209 method185(int arg0, long arg1) {
        field415++;
        if (arg0 != -1) {
            field417 = -31;
        }
        class209 var4 = (class209) this.field424.method493(arg1, arg0 + 103);
        if (var4 != null) {
            this.field425.method1890(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 134)
    public final void method186(int arg0) {
        this.field425.method1883(5);
        field410++;
        if (arg0 != 30588) {
            this.field425 = (class273) null;
        }
        this.field424.method500(0);
        this.field411 = new class209();
        this.field423 = this.field422;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lq;JB)V", line = 149)
    public final void method187(class209 arg0, long arg1, byte arg2) {
        if (this.field423 == 0) {
            class209 var5 = this.field425.method1886(-20);
            var5.method124((byte) 61);
            var5.method1464((byte) 84);
            if (this.field411 == var5) {
                class209 var6 = this.field425.method1886(arg2 - 37);
                var6.method124((byte) 126);
                var6.method1464((byte) 84);
            }
        } else {
            this.field423--;
        }
        field419++;
        if (arg2 != 10) {
            this.field425 = (class273) null;
        }
        this.field424.method490(arg0, arg1, true);
        this.field425.method1890(arg0, false);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 180)
    public static void method188(int arg0) {
        int var1 = 29 / ((arg0 + 27) / 47);
        field412 = null;
        field421 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V", line = 211)
    public class36(int arg0) {
        this.field423 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field422 = arg0;
        this.field424 = new class80(var2);
    }
}
