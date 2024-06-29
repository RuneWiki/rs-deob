import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class class18 {

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "Lvt;")
    public static class344 field199 = new class344("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "Luv;")
    public static class3 field205 = new class3(50, -1);

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "Ljq;")
    public static class447 field208 = null;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    public static int field206 = -2;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "[I")
    public static int[] field207 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "F")
    public static float field202;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field209;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "[S")
    public static short[] field203;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method83(boolean arg0);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIIIZ)Z")
    public static final boolean method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field200++;
        int var9 = class147.field1899.field419[0];
        int var10 = class147.field1899.field417[0];
        if (var9 < arg6 || class139.field1760 <= var9 || var10 < 0 || class369.field5135 <= var10) {
            return false;
        } else if (arg0 >= 0 && arg0 < class139.field1760 && arg4 >= 0 && class369.field5135 > arg4) {
            int var11 = class543.method3009(arg3, class147.field1899.method104((byte) -92), var10, arg5, arg7, class588.field8511, arg8, arg4, arg1, -1, arg2, class15.field154[class147.field1899.field6358], var9, class307.field3934, arg0);
            if (var11 < 1) {
                return false;
            }
            class281.field3673 = class307.field3934[var11 - 1];
            class64.field868 = class588.field8511[var11 - 1];
            class457.field6527 = false;
            class232.method1468((byte) 118);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z[B)V")
    public abstract void method85(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 != 32) {
            method84(-117, -93, -80, 1, -9, -97, -11, -117, true);
        }
        field207 = null;
        field208 = null;
        field203 = null;
        field209 = null;
        field205 = null;
        field199 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)[B")
    public abstract byte[] method87(int arg0, int arg1, int arg2);
}
