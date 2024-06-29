import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class278 extends class187 {

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
    private int field4208;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    private int field4204;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "[I")
    public static int[] field4207 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public static int field4216 = -1;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    private int field4209;

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    private int field4211;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
    private int field4215;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "[B")
    private byte[] field4206;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)V", line = 5)
    public final void method1020(byte arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4214 = this.field4208 - (arg2 < 0 ? -arg2 : arg2);
            this.field4214 = this.field4214 * this.field4214 >> 12;
            this.field4215 = 4096;
            this.field4211 = this.field4214;
        } else {
            this.field4215 = this.field4214 * this.field4204 >> 12;
            this.field4214 = this.field4208 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field4215 < 0) {
                this.field4215 = 0;
            } else if (this.field4215 > 4096) {
                this.field4215 = 4096;
            }
            this.field4214 = this.field4214 * this.field4214 >> 12;
            this.field4214 = this.field4215 * this.field4214 >> 12;
            this.field4211 += this.field4214 * this.field4200 >> 12;
            this.field4200 = this.field4205 * this.field4200 >> 12;
        }
        field4212++;
        if (arg0 != 30) {
            this.field4214 = -66;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V", line = 41)
    public static final void method1737(int arg0, int arg1, int arg2) {
        if (arg0 >= -3) {
            method1737(-60, 40, 88);
        }
        field4201++;
        class506 var3 = class14.method185(-1304589728, arg1, 1);
        var3.method2992(0);
        var3.field7442 = arg2;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V", line = 55)
    public final void method1024(int arg0) {
        this.field4200 = this.field4205;
        field4210++;
        this.field4211 >>= 0x4;
        if (this.field4211 < 0) {
            this.field4211 = 0;
        } else if (this.field4211 > 255) {
            this.field4211 = 255;
        }
        this.method1240((byte) this.field4211, this.field4209++, arg0 + 5864);
        this.field4211 = 0;
        if (arg0 != -5861) {
            this.field4205 = -43;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILgo;)Ljava/lang/String;", line = 79)
    public static final String method1738(int arg0, int arg1, class310 arg2) {
        field4202++;
        if (!client.method3039(arg2).method2407((byte) -126, arg1) && arg2.field4790 == null) {
            return null;
        }
        if (arg0 < 11) {
            field4207 = null;
        }
        if (arg2.field4701 == null || arg2.field4701.length <= arg1 || arg2.field4701[arg1] == null || arg2.field4701[arg1].trim().length() == 0) {
            return class418.field6270 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field4701[arg1];
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIFFF)V", line = 103)
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4208 = (int) (arg6 * 4096.0F);
        this.field4204 = (int) (arg7 * 4096.0F);
        this.field4200 = this.field4205 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V", line = 113)
    public static void method1739(boolean arg0) {
        field4207 = null;
        if (!arg0) {
            method1737(8, 124, -38);
        }
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V", line = 128)
    public final void method1022(int arg0) {
        this.field4209 = 0;
        this.field4211 = 0;
        int var2 = 4 % ((71 - arg0) / 47);
        field4213++;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(BII)V", line = 150)
    public void method1240(byte arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.method1024(-118);
        }
        field4203++;
        this.field4206[arg1] = arg0;
    }
}
