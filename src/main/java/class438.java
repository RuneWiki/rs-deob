import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class438 extends class143 {

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "Z")
    public static boolean field6302 = false;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6297 = null;

    @OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
    public int field6296;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "I")
    public int field6304;

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!vfa", name = "M", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
    public int field6309;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "Ljda;")
    public class77 field6305;

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "Ljava/lang/String;")
    public String field6310;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "[I")
    public int[] field6300;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "[I")
    public int[] field6301;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "[Lmo;")
    public class482[] field6303;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field6299;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(B)V", line = 8)
    public static void method2563(byte arg0) {
        if (arg0 >= -6) {
            method2564(121, -88, -45, -48);
        }
        field6297 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)I", line = 28)
    public static final int method2564(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field6308++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            if (arg1 != 4095) {
                field6297 = null;
            }
            return 4095 - arg0;
        }
    }
}
