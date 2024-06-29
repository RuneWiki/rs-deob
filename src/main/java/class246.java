import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class246 extends class98 {

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "[[[I")
    public static int[][][] field4273 = new int[4][13][13];

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "Lff;")
    public static class3 field4270;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static final void method1723(int arg0) {
        class195.field3358.method96(false);
        field4272++;
        class119.field2211.method96(false);
        class110.field2038.method96(false);
        if (arg0 != -26044) {
            method1726((byte) -105, 99, 27, (class3) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static void method1724(int arg0) {
        if (arg0 == 16) {
            field4270 = null;
            field4273 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public abstract void method1057(int arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
    public abstract void method1246(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIII)V")
    public final void method1725(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4265++;
        int var6 = this.field4269 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        if (arg1 >= -28) {
            this.field4269 = -126;
        }
        int var8 = this.field4268 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method1056(var6, var8, var7, var9, arg0, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    public abstract void method1049(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIILff;)Lrf;")
    public static final class30 method1726(byte arg0, int arg1, int arg2, class3 arg3) {
        field4267++;
        if (class224.method1530(arg1, arg2, (byte) 116, arg3)) {
            int var4 = -82 % ((33 - arg0) / 55);
            return class176.method1259(-21);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
    public abstract void method1048(int arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(III)V")
    public abstract void method1058(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1727(int arg0, boolean arg1) {
        field4275++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class79.field1346[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg1) {
                method1727(117, true);
            }
            return false;
        }
    }
}
