import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class253 extends class499 {

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Lcu;")
    public static class145 field3352 = new class145(73, 3);

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Ljs;")
    public static class216 field3359;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Ljava/lang/String;")
    public String field3353;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[S")
    public static short[] field3351;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 5)
    public static void method1521(int arg0) {
        field3359 = null;
        field3352 = null;
        if (arg0 != -28554) {
            field3359 = null;
        }
        field3351 = null;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V", line = 18)
    public final void method1522(int arg0) {
        ++field3354;
        super.field6896 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1524(arg0 ^ 95)) {
            class283.field3713.method783(this, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V", line = 32)
    public final void method1523(byte arg0) {
        ++field3361;
        if (arg0 >= -107) {
            this.method1526(57);
        }
        super.field6896 = class498.method2854(-118) - -500L | Long.MIN_VALUE & super.field6896;
        class320.field4189.method783(this, (byte) -72);
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)J", line = 52)
    public final long method1524(int arg0) {
        ++field3360;
        int var2 = -104 % ((15 - arg0) / 41);
        return Long.MAX_VALUE & super.field6896;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Loa;IZ)V", line = 64)
    public static final void method1525(String arg0, class489 arg1, int arg2, boolean arg3) {
        ++field3350;
        byte var4 = 4;
        int var5 = 6 - -var4;
        int var6 = var4 + 6;
        int var7 = client.field2732.method2451(250, true, (class529[]) null, arg0);
        int var8 = 13 * client.field2732.method2443(250, arg2 ^ -102, arg0, (class529[]) null);
        class370.field4984.method585(-var4 + var5, -var4 + var6, var4 + var7 + var4, var8 - (-var4 - var4), -16777216, 0);
        class370.field4984.method614(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var8 - -var4, -1, 0);
        arg1.method2818(-1, 0, (byte) -128, (class381) null, 1, var6, (class529[]) null, 0, var7, -1, var8, var5, 0, (int[]) null, arg2, arg0);
        class366.method2134(0, -var4 + var5, var4 + var4 + var7, var6 - var4, var4 + var4 + var8);
        if (arg3) {
            class370.field4984.method529();
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V", line = 93)
    public class253(int arg0, int arg1) {
        super.field622 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)I", line = 101)
    public final int method1526(int arg0) {
        if (arg0 >= -103) {
            this.method1527((byte) 72);
        }
        ++field3349;
        return (int) super.field622;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)I", line = 113)
    public final int method1527(byte arg0) {
        ++field3357;
        return arg0 >= -30 ? -28 : (int) (super.field622 >>> 32 & 255L);
    }
}
