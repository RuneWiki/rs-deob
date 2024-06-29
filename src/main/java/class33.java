import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class33 extends class64 {

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lpm;")
    public static class349 field416 = new class349("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 3)
    public final void method173(int arg0, int arg1, int arg2) {
        ++field420;
        int var4 = this.field414 * arg2 >> 12;
        int var5 = this.field417 * arg2 >> 12;
        int var6 = this.field418 * arg1 >> 12;
        if (arg0 == 200) {
            int var7 = this.field419 * arg1 >> 12;
            class246.method1717(arg0 + -199, var6, var4, var7, var5, super.field876, super.field883, super.field878);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 22)
    public static void method182(byte arg0) {
        field416 = null;
        if (arg0 >= -47) {
            method182((byte) 95);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIII)V", line = 35)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field419 = arg3;
        this.field414 = arg0;
        this.field417 = arg2;
        this.field418 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)V", line = 49)
    public final void method169(int arg0, int arg1, int arg2) {
        ++field413;
        int var4 = this.field414 * arg0 >> 12;
        if (arg2 > -102) {
            this.field418 = 27;
        }
        int var5 = this.field417 * arg0 >> 12;
        int var6 = this.field418 * arg1 >> 12;
        int var7 = this.field419 * arg1 >> 12;
        class381.method2430(var5, var7, var4, -85, var6, super.field876);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 71)
    public final void method168(int arg0, int arg1, int arg2) {
        ++field415;
        int var4 = this.field414 * arg2 >> 12;
        int var5 = this.field417 * arg2 >> 12;
        int var6 = this.field418 * arg1 >> 12;
        int var7 = 115 % ((-30 - arg0) / 46);
        int var8 = this.field419 * arg1 >> 12;
        class62.method398(super.field878, var8, var4, -15537, var6, var5, super.field883);
    }
}
