import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class361 extends class161 {

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5507 = "Started 3d Library";

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field5517 = "white:";

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field5515 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field5518;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field5520;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
    public int[] field5514;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "[I")
    public int[] field5516;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "[I")
    public int[] field5519;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[Lvd;")
    public class26[] field5512;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[Lvd;")
    public class26[] field5521;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[[[B")
    public byte[][][] field5511;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 9)
    public static final void method2340(int arg0) {
        class191.field3116.method335((byte) 113);
        field5509++;
        if (arg0 != 9265) {
            method2341((byte) -46);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 20)
    public static final void method2341(byte arg0) {
        field5508++;
        if (class300.field4760 == 5) {
            class300.field4760 = 6;
            if (arg0 != -59) {
                field5507 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILap;IIII)Ljava/awt/Frame;", line = 48)
    public static final Frame method2342(int arg0, class279 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5510++;
        if (arg0 != -4490) {
            field5513 = 26;
        }
        if (!arg1.method1896(true)) {
            return null;
        }
        if (arg5 == 0) {
            class364[] var6 = class353.method2300(arg1, (byte) 114);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5540 == arg3 && var6[var8].field5544 == arg2 && (arg4 == 0 || var6[var8].field5539 == arg4) && (!var7 || var6[var8].field5545 > arg5)) {
                    arg5 = var6[var8].field5545;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class26 var9 = arg1.method1891(arg3, arg5, arg2, (byte) 22, arg4);
        while (var9.field304 == 0) {
            class84.method517((byte) 118, 10L);
        }
        Frame var10 = (Frame) var9.field305;
        if (var10 == null) {
            return null;
        } else if (var9.field304 == 2) {
            class303.method2036(77, arg1, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V", line = 122)
    public static void method2343(boolean arg0) {
        field5507 = null;
        if (!arg0) {
            field5507 = null;
        }
        field5517 = null;
    }
}
