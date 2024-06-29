import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class212 {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "B")
    public byte field2732;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field2723 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lcd;")
    public class207 field2722;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Ljc;")
    public class305 field2729;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lsi;")
    public class393 field2720;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lpu;")
    public class396 field2725;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IILug;[II)Leo;")
    public static final class195 method1312(int arg0, int[] arg1, int arg2, class395 arg3, int[] arg4, int arg5) {
        if (arg5 > -127) {
            return null;
        }
        field2726++;
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg0 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class195(arg3, arg0, arg2, var6);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1313(int arg0) {
        int var1 = 91 % ((-arg0 - 9) / 56);
        field2723 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILjava/lang/Class;)Lvn;")
    public static final class205 method1314(int arg0, int arg1, int arg2, Class arg3) {
        class490 var4 = class125.field1664[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class376 var5 = var4.field7127; var5 != null; var5 = var5.field4952) {
            class205 var6 = var5.field4953;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2673 == arg1 && var6.field2671 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(BIIIII)V")
    public class212(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2728 = arg2;
        this.field2724 = arg4;
        this.field2732 = arg0;
        this.field2730 = arg5;
        this.field2727 = arg3;
        this.field2721 = arg1;
    }
}
