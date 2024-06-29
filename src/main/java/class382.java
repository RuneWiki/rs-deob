import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class382 extends class656 implements class638 {

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "C")
    public char field5310;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "J")
    public long field5312;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Lwu;")
    public static class376 field5304;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)C")
    public final char method2248(byte arg0) {
        if (arg0 > -40) {
            return (char) 65447;
        } else {
            field5315++;
            return this.field5310;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)J")
    public final long method2249(int arg0) {
        if (arg0 == 30000) {
            field5309++;
            return this.field5312;
        } else {
            return 20L;
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)I")
    public final int method2250(int arg0) {
        if (arg0 == -18458) {
            field5303++;
            return this.field5313;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILha;BZ)Lda;")
    public static final class60 method2251(int arg0, class59 arg1, byte arg2, boolean arg3) {
        field5311++;
        class507 var4 = class639.method3495(-111, arg1, arg3, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg2 != 58) {
                field5304 = null;
            }
            return var4.field6774;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 119 % ((-arg7 - 78) / 33);
        field5302++;
        if (arg1 == arg3) {
            class571.method3144(arg0, arg2, (byte) -126, arg5, arg1, arg4, arg6);
        } else if (arg5 - arg1 >= class261.field3632 && arg1 + arg5 <= class209.field3090 && (arg2 - arg3) >= class380.field5289 && class431.field5944 >= (arg2 + arg3)) {
            class33.method279(arg1, arg3, arg0, arg4, arg6, arg5, arg2, -8930);
        } else {
            class226.method1444(arg6, arg2, arg0, arg1, arg4, arg5, -5411, arg3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
    public final int method2253(int arg0) {
        field5308++;
        return arg0 == -24548 ? this.field5307 : -20;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)I")
    public final int method2254(int arg0) {
        field5305++;
        return arg0 == -22313 ? this.field5314 : 30;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
    public static void method2255(int arg0) {
        field5304 = null;
        if (arg0 != -30831) {
            method2251(102, null, (byte) -127, true);
        }
    }
}
