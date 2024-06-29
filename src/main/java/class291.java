import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class291 extends class466 {

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "J")
    public long field4149;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)J", line = 4)
    public final long method1096(int arg0) {
        if (arg0 != 0) {
            this.field4149 = 99L;
        }
        field4150++;
        return this.field4149;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)I", line = 19)
    public final int method1100(int arg0) {
        field4160++;
        int var2 = 92 / ((arg0 + 70) / 55);
        return this.field4153;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I", line = 29)
    public final int method1097(int arg0) {
        if (arg0 != 19702) {
            this.field4159 = -54;
        }
        field4151++;
        return this.field4154;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILkk;)[Lwm;", line = 41)
    public static final class565[] method1802(int arg0, class192 arg1) {
        field4158++;
        if (!arg1.method1302(31625)) {
            return new class565[0];
        }
        class198 var2 = arg1.method1300(true);
        while (var2.field2987 == 0) {
            class226.method1447((byte) -124, 10L);
        }
        if (var2.field2987 == 2) {
            return new class565[0];
        }
        int[] var3 = (int[]) var2.field2986;
        class565[] var4 = new class565[var3.length >> 2];
        if (arg0 != -342433470) {
            return null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class565 var6 = new class565();
            var4[var5] = var6;
            var6.field7432 = var3[var5 << 2];
            var6.field7431 = var3[(var5 << 2) + 1];
            var6.field7438 = var3[(var5 << 2) + 2];
            var6.field7430 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I", line = 85)
    public final int method1099(byte arg0) {
        field4148++;
        int var2 = 42 % ((61 - arg0) / 59);
        return this.field4152;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V", line = 95)
    public static final void method1803(int arg0, int arg1) {
        field4156++;
        class393.field5487 = arg1;
        if (arg0 != -194034494) {
            method1804(false, -91, 62, 39, 86, false, 62);
        }
        class490.field6652.method561((byte) -78);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIIIIZI)V", line = 107)
    public static final void method1804(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg5 ? class411.field5711.field3894.method2432(true) : class411.field5711.field3887.method2432(!arg0)) != 0 && arg2 != 0 && class501.field6728 < 50 && arg3 != -1) {
            class503.field6751[class501.field6728++] = new class121((byte) (arg5 ? 3 : 2), arg3, arg2, arg6, arg1, 0, arg4, null);
        }
        field4157++;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)V", line = 125)
    public static final void method1805(byte arg0) {
        class756.field10510.method1989(true);
        int var1 = 86 % ((-arg0 - 53) / 49);
        field4161++;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)I", line = 138)
    public final int method1098(int arg0) {
        if (arg0 != -15204) {
            this.field4153 = 81;
        }
        field4155++;
        return this.field4159;
    }
}
