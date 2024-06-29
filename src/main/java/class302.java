import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class302 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
    public static int[][] field4269 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[Lf;")
    public static class529[] field4268;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 16)
    public static void method1903(byte arg0) {
        field4269 = null;
        field4268 = null;
        if (arg0 >= -64) {
            field4269 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIILqa;)Lc;", line = 27)
    public static final class121 method1904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6) {
        field4270++;
        if (arg4 != -10912) {
            method1903((byte) -16);
        }
        long var7 = (long) arg5;
        class121 var9 = (class121) class29.field302.method1536(var7, 0);
        short var10 = 2055;
        if (var9 == null) {
            class521 var11 = class99.method612(class195.field2835, 0, arg5, (byte) 94);
            if (var11 == null) {
                return null;
            }
            if (var11.field7677 < 13) {
                var11.method3091(-2, 0);
            }
            var9 = arg6.method1118(var11, var10, class42.field638, 64, 768);
            class29.field302.method1542(var9, (byte) 112, var7);
        }
        class121 var12 = var9.method723((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method685(arg1);
        }
        if (arg3 != 0) {
            var12.method735(arg3);
        }
        if (arg2 != 0) {
            var12.method700(arg2);
        }
        if (arg0 != 0) {
            var12.method739(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V", line = 72)
    public class302(int arg0, int arg1, int arg2) {
        this.field4273 = arg1;
        this.field4267 = arg0;
        this.field4272 = arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)V")
    public abstract void method404(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public abstract void method405(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public abstract void method403(int arg0, int arg1, int arg2);
}
