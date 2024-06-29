import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class73 extends class198 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "[I")
    public static int[] field849 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lrb;")
    public static class352 field844 = new class352(9, 0, 4, 1);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field858 = 1;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "F")
    public static float field859;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 4)
    public final void method165(byte arg0) {
        field847++;
        if (arg0 == -33) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Z", line = 20)
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            method431(84, -106, 13);
        }
        field852++;
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 32)
    public static void method430(int arg0) {
        field844 = null;
        if (arg0 != 0) {
            field848 = -47;
        }
        field849 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILqa;IIZLse;I)V", line = 43)
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 != -4) {
            this.method251(-27);
        }
        field846++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)I", line = 58)
    public static final int method431(int arg0, int arg1, int arg2) {
        field855++;
        if (class117.field1528 == -1) {
            return 1;
        }
        if (class239.field3499 != arg1) {
            class447.method2712(10, arg1);
            if (class239.field3499 != arg1) {
                return -1;
            }
        }
        try {
            if (arg2 != -12693) {
                field858 = 97;
            }
            Dimension var3 = class110.field1401.getSize();
            class162.method946((byte) 99, class259.field3800, true, class194.field2923.method2953(3181, class77.field889));
            class114 var4 = class559.method3271(80, 0, class117.field1528, class57.field700);
            long var5 = class450.method2719((byte) -40);
            class379.field5558.method985();
            class385.field5628.method613(0, class605.field8913, 0);
            class379.field5558.method999(class385.field5628);
            class379.field5558.method1016(var3.width / 2, var3.height / 2, 512, 512);
            class379.field5558.method987(1.0F);
            class379.field5558.method1008(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class520 var7 = class379.field5558.method954(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class379.field5558.method321(0);
                class379.field5558.method322();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class237.field3470.method613((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class177.field2692), 0, (var10 + 1) * class177.field2692);
                        var8++;
                        var7.method1965(class237.field3470, null, 0);
                        if (((long) arg0) <= (class450.method2719((byte) -77) - var5)) {
                            break label45;
                        }
                    }
                }
            }
            class379.field5558.method313();
            long var12 = (long) (var8 * 1000) / (class450.method2719((byte) 118) - var5);
            class379.field5558.method321(0);
            class379.field5558.method322();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIII)V", line = 158)
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field845 = arg5;
        this.field853 = arg6;
        this.field851 = arg1;
        this.field854 = arg3;
        this.field857 = arg4;
        this.field856 = arg0;
        this.field850 = arg2;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)I")
    public abstract int method251(int arg0);
}
