import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class570 extends class474 {

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    private int field8074;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    private int field8075;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Lwh;")
    private class148 field8072;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    private int field8071;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    private int field8070;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    private int field8067;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    private int field8073;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "[I")
    public static int[] field8068 = new int[2048];

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "[I")
    public static int[] field8069 = new int[2];

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Lnc;")
    private class24 field8066;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Lnc;")
    public final class24 method2860(byte arg0) {
        field8076++;
        if (arg0 != 84) {
            method3305(55);
        }
        if (this.field8066 == null) {
            class277.field3938[3] = this.field8075;
            class277.field3938[4] = this.field8073;
            class277.field3938[0] = this.field8071;
            class277.field3938[2] = this.field8067;
            class151 var2 = this.field8072.field849;
            class277.field3938[5] = this.field8070;
            class277.field3938[1] = this.field8074;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1121(arg0 ^ 0xFFFF884D, class277.field3938[var5])) {
                    return null;
                }
                class293 var7 = var2.method1124((byte) 42, class277.field3938[var5]);
                int var8 = var7.field4174 ? 64 : 128;
                if (var7.field4180 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class208.field3050[var6] = var2.method1123((byte) 124, 1.0F, false, class277.field3938[var6], var4, var4);
            }
            this.field8066 = new class24(this.field8072, 6407, var4, var3, class208.field3050);
        }
        return this.field8066;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3305(int arg0) {
        field8069 = null;
        if (arg0 == 12157) {
            field8068 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lwh;IIIIII)V")
    public class570(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8074 = arg2;
        this.field8075 = arg4;
        this.field8072 = arg0;
        this.field8071 = arg1;
        this.field8070 = arg6;
        this.field8067 = arg3;
        this.field8073 = arg5;
    }
}
