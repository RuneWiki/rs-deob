import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class748 {

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "Z")
    private boolean field10396 = false;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public int field10395 = 443;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public int field10389 = 43594;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Z")
    private boolean field10394 = true;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public int field10399;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field10401;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "Ljava/lang/String;")
    public String field10402;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "[Loia;")
    public static class88[] field10391;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V", line = 3)
    public static void method4155(byte arg0) {
        field10391 = null;
        if (arg0 != 14) {
            field10391 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 13)
    public static final void method4156(int arg0) {
        class377.field5286.method4023((byte) -125);
        if (arg0 == 0) {
            field10393++;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method4157(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            return false;
        }
        field10398++;
        if (class451.method2697(arg1, arg0, -75)) {
            return (arg1 & 0x9000) != 0 | class418.method2567(false, arg0, arg1) | class19.method118((byte) 9, arg0, arg1) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | class37.method211((byte) 33, arg0, arg1) | class465.method2776(arg1, (byte) -94, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)V", line = 47)
    public static final void method4158(int arg0, byte arg1) {
        if (arg1 < 45) {
            method4158(127, (byte) 77);
        }
        field10397++;
        class101 var2 = (class101) class400.field5666.method1180((byte) 26, (long) arg0);
        if (var2 != null) {
            var2.field1210.method1936(0);
            class436.method2642(true, var2.field1202, var2.field1211);
            var2.method1185(-32);
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(III)V", line = 68)
    public static final void method4159(int arg0, int arg1, int arg2) {
        field10401++;
        class592 var3 = class682.method3825(-652872096, 17, arg0);
        var3.method3351(0);
        var3.field8337 = arg2;
        if (arg1 != 36864) {
            method4157(-37, 113, 78);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lvc;B)Lgca;", line = 93)
    public final class249 method4160(class316 arg0, byte arg1) {
        if (arg1 > -60) {
            method4156(106);
        }
        field10392++;
        return arg0.method2042(this.field10402, this.field10394 ? this.field10395 : this.field10389, this.field10396, 22);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILhda;)Z", line = 114)
    public final boolean method4161(int arg0, class748 arg1) {
        field10388++;
        int var3 = -13 / ((arg0 + 32) / 59);
        if (arg1 == null) {
            return false;
        } else {
            return this.field10399 == arg1.field10399 && this.field10402.equals(arg1.field10402);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BI)Ltp;", line = 129)
    public static final class533 method4162(byte arg0, int arg1) {
        if (arg0 > -59) {
            return null;
        } else {
            field10390++;
            return arg1 >= 0 && arg1 < 100 ? class237.field3176[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V", line = 151)
    public final void method4163(int arg0) {
        field10400++;
        int var2 = 50 / ((13 - arg0) / 36);
        if (!this.field10394) {
            this.field10394 = true;
            this.field10396 = true;
        } else if (this.field10396) {
            this.field10396 = false;
        } else {
            this.field10394 = false;
        }
    }
}
