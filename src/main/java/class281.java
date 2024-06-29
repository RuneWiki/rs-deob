import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class281 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    private int field4076;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public int field4079;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Z")
    public static boolean field4082 = false;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Z")
    public static boolean field4080;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "[[Z")
    public static boolean[][] field4084;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BIII)Z", line = 3)
    public final boolean method1821(byte arg0, int arg1, int arg2, int arg3) {
        field4077++;
        if (this.field4081 > arg3 || arg3 > this.field4085) {
            return false;
        } else if (arg1 < this.field4083 || arg1 > this.field4078) {
            return false;
        } else if (this.field4079 <= arg2 && this.field4087 >= arg2) {
            int var5 = arg3 - this.field4076;
            int var6 = arg2 - this.field4073;
            int var7 = -96 % ((arg0 + 72) / 51);
            return this.field4086 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILvn;)I", line = 36)
    public static final int method1822(int arg0, class330 arg1) {
        field4075++;
        if (arg1.field4619 == 0) {
            return 0;
        }
        if (arg1.field4584 != -1) {
            class330 var2 = null;
            if (arg1.field4584 < 32768) {
                class205 var3 = (class205) class645.field9014.method2242((long) arg1.field4584, -1);
                if (var3 != null) {
                    var2 = var3.field3181;
                }
            } else if (arg1.field4584 >= 32768) {
                var2 = class767.field10560[arg1.field4584 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field5742 - var2.field5742;
                int var5 = arg1.field5746 - var2.field5746;
                if (var4 != 0 || var5 != 0) {
                    arg1.method2099((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -109);
                }
            }
        }
        if (arg0 != 19594) {
            field4084 = null;
        }
        if (arg1 instanceof class702) {
            class702 var6 = (class702) arg1;
            if (var6.field9761 != -1 && (var6.field4668 == 0 || var6.field4676 > 0)) {
                var6.method2099(var6.field9761, arg0 - 19722);
                var6.field9761 = -1;
            }
        } else if (arg1 instanceof class665) {
            class665 var7 = (class665) arg1;
            if (var7.field9255 != -1 && (var7.field4668 == 0 || var7.field4676 > 0)) {
                int var8 = var7.field5742 - ((var7.field9255 - class124.field1922 - class124.field1922) * 256);
                int var9 = var7.field5746 - ((var7.field9261 - class88.field999 - class88.field999) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method2099((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, -124);
                }
                var7.field9255 = -1;
            }
        }
        return arg1.method2097(arg0 - 19595);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIZIIIIII)V", line = 119)
    public final void method1823(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4076 = arg7;
        field4088++;
        this.field4073 = arg5;
        this.field4086 = arg9 * arg9;
        this.field4074 = arg6;
        this.field4078 = this.field4074 + arg10;
        this.field4081 = this.field4076 + arg0;
        this.field4083 = this.field4074 + arg3;
        this.field4085 = this.field4076 + arg2;
        this.field4079 = this.field4073 + arg8;
        if (arg4) {
            field4082 = false;
        }
        this.field4087 = this.field4073 + arg1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 143)
    public static void method1824(int arg0) {
        field4084 = null;
        int var1 = 38 / ((arg0 + 4) / 57);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 161)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4074 = arg1;
        this.field4086 = arg3 * arg3;
        this.field4073 = arg2;
        this.field4076 = arg0;
        this.field4081 = this.field4076 + arg4;
        this.field4083 = this.field4074 + arg6;
        this.field4087 = this.field4073 + arg9;
        this.field4079 = this.field4073 + arg8;
        this.field4078 = this.field4074 + arg7;
        this.field4085 = this.field4076 + arg5;
    }
}
