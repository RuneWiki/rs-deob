import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class270 extends class186 {

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private int field4328;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    private int field4317;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)V")
    public final void method293(int arg0, int arg1, byte arg2) {
        int var4 = 120 % ((90 - arg2) / 34);
        ++field4325;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
    public final void method292(int arg0, int arg1, int arg2) {
        int var4 = this.field4323 * arg2 >> 12;
        int var5 = this.field4322 * arg1 >> 12;
        ++field4318;
        int var6 = this.field4328 * arg2 >> 12;
        int var7 = this.field4324 * arg1 >> 12;
        int var8 = this.field4320 * arg2 >> 12;
        int var9 = this.field4319 * arg1 >> 12;
        if (arg0 != -6) {
            this.method293(21, 35, (byte) -15);
        }
        int var10 = this.field4327 * arg2 >> 12;
        int var11 = this.field4317 * arg1 >> 12;
        class44.method251(var4, (byte) 127, var7, var5, var6, var9, var11, var10, super.field2970, var8);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lml;")
    public static final class148 method1816(int arg0) {
        ++field4326;
        if (arg0 != 1123005260) {
            method1816(-4);
        }
        return class238.field3928;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4319 = arg5;
        this.field4328 = arg2;
        this.field4320 = arg4;
        this.field4317 = arg7;
        this.field4327 = arg6;
        this.field4324 = arg3;
        this.field4323 = arg0;
        this.field4322 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)V")
    public final void method291(byte arg0, int arg1, int arg2) {
        ++field4321;
        if (arg0 > -45) {
            this.method292(-113, 60, -95);
        }
    }
}
