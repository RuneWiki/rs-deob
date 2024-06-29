import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class262 extends class114 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "[I")
    public static int[] field4213 = new int[25];

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "[[Lim;")
    public static class178[][] field4214;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -124);
        if (arg1) {
            field4213 = null;
        }
        ++field4210;
        if (super.field1630.field710) {
            int var4 = class159.field2209[arg0];
            for (int var5 = 0; class145.field2009 > var5; ++var5) {
                var3[var5] = this.method1704(class99.field1434[var5], var4, (byte) -72) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1702(String arg0, int arg1) {
        if (arg1 >= -35) {
            return true;
        } else {
            ++field4212;
            return class232.method1527(10, -1, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)Lbg;")
    public static final class171 method1703(int arg0, int arg1) {
        if (arg1 != 4096) {
            method1703(-80, -80);
        }
        ++field4211;
        class171 var2 = (class171) class81.field1114.method950((long) arg0, (byte) -45);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class275.field4373.method2050(117, 3, arg0);
            class171 var4 = new class171();
            if (var3 != null) {
                var4.method1090(new class215(var3), (byte) -114);
            }
            class81.field1114.method942((long) arg0, (byte) 33, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
    private final int method1704(int arg0, int arg1, byte arg2) {
        ++field4215;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        int var6 = 72 % ((11 - arg2) / 35);
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
    public static void method1705(int arg0) {
        if (arg0 != -25858) {
            field4213 = null;
        }
        field4213 = null;
        field4214 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class262() {
        super(0, true);
    }
}
