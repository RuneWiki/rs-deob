import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class394 extends class29 {

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public int field5566;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public int field5554;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field5555;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field5560;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[Z")
    public static boolean[] field5556 = new boolean[100];

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field5562 = 2;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
    public static int[] field5558 = new int[14];

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lul;")
    public static class343 field5565;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Ltq;")
    public static class376 field5559;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BI)[B", line = 6)
    public static final byte[] method2516(byte[] arg0, int arg1) {
        field5564++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -8955) {
            field5558 = null;
        }
        byte[] var2 = new byte[arg0.length];
        class316.method2075(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V", line = 27)
    public static final void method2517(int arg0) {
        field5557++;
        if (class433.field6226) {
            return;
        }
        class225.field3160 = true;
        if (class374.field5254) {
            class292.field4085 = (float) ((int) class292.field4085 + 47 & 0xFFFFFFF0);
        } else {
            class117.field1433 += (12.0F - class117.field1433) / 2.0F;
        }
        if (arg0 == 3114) {
            class433.field6226 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V", line = 58)
    public static void method2518(int arg0) {
        field5558 = null;
        field5556 = null;
        int var1 = 64 % ((88 - arg0) / 34);
        field5559 = null;
        field5565 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZI)V", line = 71)
    public static final void method2519(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = class334.field4729 * arg0 >> 8;
        field5561++;
        if (!arg2) {
            field5558 = null;
        }
        if (var4 != 0 && arg1 != -1) {
            class254.method1715(0, var4, false, 0, arg1, class105.field1253);
            class215.field3045 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIII)V", line = 100)
    public class394(int arg0, int arg1, int arg2, int arg3) {
        this.field5566 = arg2;
        this.field5554 = arg1;
        this.field5555 = arg0;
        this.field5560 = arg3;
    }
}
