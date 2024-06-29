import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class449 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
    public static int[] field5944 = new int[2];

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[[Z")
    public static boolean[][] field5945;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 4)
    public static void method2529(int arg0) {
        field5944 = null;
        if (arg0 != 30836) {
            method2529(-92);
        }
        field5945 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILsl;)Lnc;", line = 22)
    public static final class24 method2530(int arg0, class461 arg1) {
        field5946++;
        String var2 = arg1.method2574(-1);
        class91 var3 = class94.method762(1)[arg1.method2600((byte) -127)];
        class599 var4 = class680.method3832(-17399)[arg1.method2600((byte) -123)];
        int var5 = arg1.method2577(2);
        int var6 = arg1.method2577(2);
        int var7 = arg1.method2600((byte) -124);
        int var8 = arg1.method2600((byte) -125);
        int var9 = arg1.method2600((byte) -125);
        if (arg0 <= 2) {
            return null;
        }
        int var10 = arg1.method2566(-2);
        int var11 = arg1.method2566(-2);
        int var12 = arg1.method2622(-539564808);
        int var13 = arg1.method2622(-539564808);
        int var14 = arg1.method2622(-539564808);
        return new class24(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
