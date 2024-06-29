import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class270 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field4310 = 3;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field4304 = 50;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "[I")
    public static int[] field4312 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4306 = new String[field4304];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public static int[] field4309 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[I")
    public static int[] field4314 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[I")
    public static int[] field4303 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
    public static int[] field4305 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    public static int[] field4308 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field4313 = new int[field4304];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[B")
    public abstract byte[] method538(int arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lnj;BIIIII)Z")
    public static final boolean method1764(class240 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4311++;
        class242 var7 = class292.method1962(arg0.field3771, 19423);
        if (var7.field3794 == -1) {
            return true;
        } else if (arg1 <= 60) {
            return false;
        } else {
            int var8;
            if (arg0.field3768) {
                int var9 = arg0.field3703 + arg3;
                var8 = var9 & 0x3;
            } else {
                var8 = 0;
            }
            class74 var10 = var7.method1592(var8, 0, arg0.field3770);
            if (var10 == null) {
                return false;
            }
            int var11 = arg0.field3713;
            int var12 = var10.field4559;
            int var13 = arg0.field3760;
            if ((var8 & 0x1) == 1) {
                var13 = arg0.field3713;
                var11 = arg0.field3760;
            }
            int var14 = var10.field4551;
            if (var7.field3796) {
                var12 = var11 * 4;
                var14 = var13 * 4;
            }
            if (var7.field3801 == 0) {
                var10.method481((arg4 * 4) + 48, (-arg2 + 104 - var13) * 4 + 48, var12, var14);
            } else {
                var10.method488(arg4 * 4 + 48, (104 - arg2 + -var13) * 4 + 48, var12, var14, var7.field3801);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)I")
    public abstract int method530(byte arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method1765(int arg0, int arg1, int arg2) {
        class2.field1 = new class150(arg2);
        field4307++;
        class145.field1998 = new class150(arg1);
        int var3 = 76 / ((arg0 - 64) / 38);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1766(byte arg0) {
        field4305 = null;
        field4306 = null;
        field4314 = null;
        field4303 = null;
        field4312 = null;
        field4309 = null;
        field4313 = null;
        field4308 = null;
        int var1 = -110 / ((-arg0 - 77) / 42);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Ln;")
    public abstract class232 method536(int arg0);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    public abstract void method541(int arg0, int arg1);
}
