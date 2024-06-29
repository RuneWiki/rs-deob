import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class301 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public volatile int field4341 = 0;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public int field4340 = 0;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field4350 = new Object[5000];

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[F")
    public float[] field4342 = new float[5000];

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[B")
    public byte[] field4343 = new byte[5000];

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public volatile int field4345 = 0;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public int field4351 = 0;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4344 = new String[200];

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "[Z")
    public static boolean[] field4347 = new boolean[100];

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "[I")
    public static int[] field4348 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "J")
    public static long field4353 = 0L;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Lgp;")
    public static class561 field4349;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public abstract void method855(int arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
    public static final boolean method1879(int arg0, int arg1, int arg2) {
        field4354++;
        if (arg2 == -7643) {
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public abstract void method849(byte arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lbr;B)V")
    public abstract void method850(class184 arg0, byte arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1880(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4346++;
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class371.field5368 - class58.field824) * var8 / 100 + class58.field824;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class285.field4154[var11] * -var10 >> 15;
            var15 = class285.field4152[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class285.field4154[var12] * var15 >> 15;
            var15 = class285.field4152[var12] * var15 >> 15;
        }
        class265.field3862 = arg3;
        class394.field5910 = 0;
        class216.field3274 = arg0 - var15;
        class448.field6535 = arg4 - var14;
        if (!arg2) {
            method1881((byte) -60);
        }
        class217.field3284 = arg7;
        class545.field7584 = arg5 - var13;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLsa;FII)V")
    public abstract void method848(boolean arg0, class542 arg1, float arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
    public abstract void method846(byte arg0, int arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
    public abstract void method853(int arg0, byte arg1);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    public static void method1881(byte arg0) {
        field4349 = null;
        field4347 = null;
        int var1 = -69 % ((3 - arg0) / 32);
        field4348 = null;
        field4344 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILbr;)V")
    public abstract void method852(int arg0, class184 arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLbr;)V")
    public abstract void method854(boolean arg0, class184 arg1);
}
