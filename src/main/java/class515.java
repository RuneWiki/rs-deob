import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class515 extends class379 {

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field7255;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "F")
    public float field7263;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public int field7268;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    private int field7262;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    private int field7257;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Lhj;")
    public static class596 field7260 = new class596(31, 0);

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V", line = 11)
    public static void method3082(boolean arg0) {
        if (!arg0) {
            field7256 = 79;
        }
        field7260 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)F", line = 23)
    public final float method3083(int arg0) {
        field7266++;
        if (arg0 < 114) {
            this.method544((byte) -23, 7, -111, -1);
        }
        return this.field7263;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I", line = 34)
    public final int method3084(int arg0) {
        field7261++;
        if (arg0 != 0) {
            this.method3088(54);
        }
        return this.field7259;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)I", line = 51)
    public final int method3085(boolean arg0) {
        field7258++;
        if (!arg0) {
            this.method3084(-29);
        }
        return this.field7268;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)I", line = 63)
    public final int method3086(byte arg0) {
        if (arg0 >= -84) {
            this.method545(58, -0.4616927F);
        }
        field7264++;
        return this.field7255;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljv;ZI)V", line = 82)
    public static final void method3087(class88 arg0, boolean arg1, int arg2) {
        field7265++;
        if (arg0.field1184) {
            if (arg0.field1171 < 0 || class123.method954(arg0.field1171, arg2 + 30117, arg0.field1169)) {
                if (arg1) {
                    class322.method1924(arg0.field1179, -124, null, arg0.field1182, arg0.field1175, arg0.field1176);
                } else {
                    class429.method2549(arg0.field1177, arg0.field1171, arg0.field1176, arg2 ^ 0x74A5, arg0.field1179, -1, arg0.field1175, arg0.field1169, arg0.field1182);
                }
                arg0.method2219(13630);
            }
        } else if (arg0.field1170 && arg0.field1176 >= 1 && arg0.field1179 >= 1 && class596.field8090 - 2 >= arg0.field1176 && arg0.field1179 <= (class107.field1350 - 2) && (arg0.field1178 < 0 || class123.method954(arg0.field1178, arg2 + 30117, arg0.field1172))) {
            if (arg1) {
                class322.method1924(arg0.field1179, -125, arg0.field1180, arg0.field1182, arg0.field1175, arg0.field1176);
            } else {
                class429.method2549(arg0.field1173, arg0.field1178, arg0.field1176, -2, arg0.field1179, -1, arg0.field1175, arg0.field1172, arg0.field1182);
            }
            arg0.field1170 = false;
            if (!arg1 && arg0.field1178 == arg0.field1171 && arg0.field1171 == -1) {
                arg0.method2219(arg2 ^ 0xFFFFBE65);
            } else if (!arg1 && arg0.field1178 == arg0.field1171 && arg0.field1177 == arg0.field1173 && arg0.field1172 == arg0.field1169) {
                arg0.method2219(arg2 + 43491);
            }
        }
        if (arg2 != -29861) {
            method3082(false);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)I", line = 133)
    public final int method3088(int arg0) {
        field7267++;
        return arg0 == 21915 ? this.field7257 : -47;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)I", line = 144)
    public final int method3089(int arg0) {
        if (arg0 != 25215) {
            field7256 = 84;
        }
        field7254++;
        return this.field7262;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIF)V", line = 154)
    public class515(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7255 = arg1;
        this.field7263 = arg5;
        this.field7268 = arg2;
        this.field7262 = arg4;
        this.field7259 = arg0;
        this.field7257 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IF)V")
    public abstract void method545(int arg0, float arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BIII)V")
    public abstract void method544(byte arg0, int arg1, int arg2, int arg3);
}
