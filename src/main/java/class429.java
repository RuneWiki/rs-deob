import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class429 extends class226 {

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "B")
    public byte field6026 = 5;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field6020 = -1;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public int field6023;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public int field6024;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
    public int field6028;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public int field6031;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "Z")
    public boolean field6029;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIII)V")
    public static final void method2431(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class139.field1946 = arg4;
        class604.field8398 = arg2;
        if (arg0 == 48) {
            class391.field5475 = arg3;
            field6030++;
            class538.field7300 = arg1;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class375[] var7 = class652.field9219;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class375 var9 = var7[var8];
            if (var9 != null && var9.field5317 == 2) {
                class285.method1713(arg5, var9.field5322, 113, arg1 >> 1, var9.field5309, var9.field5320 * 2, arg4, arg6 >> 1, var9.field5310);
                if (class399.field5548[0] > -1 && class239.field3440 % 20 < 10) {
                    class36.field452[var9.field5316].method2660(class399.field5548[0] + arg2 - 12, class399.field5548[1] + arg0 + -28);
                }
            }
        }
        if (arg3 != -12) {
            method2432(71, -89, -57, -69, 70, 69, -92);
        }
        field6027++;
    }
}
