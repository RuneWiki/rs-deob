import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class142 extends class160 {

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    private int field2159 = 0;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    private int field2164 = 4096;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "F")
    public static float field2160 = 128.0F;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field2165 = -1;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2157;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2164 = arg0.method645(11596);
            }
        } else {
            this.field2159 = arg0.method645(11596);
        }
        if (arg1 <= 11) {
            method957(64);
        }
        ++field2163;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILhc;)[Lch;")
    public static final class290[] method954(int arg0, int arg1, class235 arg2) {
        ++field2161;
        if (!class277.method1867(-1, arg0, arg2)) {
            return null;
        } else {
            if (arg1 != 0) {
                method954(6, -16, (class235) null);
            }
            return class109.method780((byte) -63);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIIII)V")
    public static final void method955(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class219.method1470(class90.field1568, arg4, -1, class266.field4247);
        int var7 = -93 % ((13 - arg1) / 52);
        ++field2169;
        int var8 = class219.method1470(class90.field1568, arg5, -1, class266.field4247);
        int var9 = class219.method1470(class223.field3423, arg3, -1, class148.field2338);
        int var10 = class219.method1470(class223.field3423, arg2, -1, class148.field2338);
        for (int var11 = var6; ~var8 <= ~var11; ++var11) {
            class166.method1124(true, class154.field2406[var11], var10, arg0, var9);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIB)V")
    public static final void method956(int arg0, int arg1, byte arg2) {
        ++field2158;
        class41 var3 = class221.method1492((byte) -42, arg1, 7);
        var3.method301(8792);
        if (arg2 <= 15) {
            method957(26);
        }
        var3.field584 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2157 = null;
        if (arg0 != 6489) {
            method954(67, 113, (class235) null);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class142() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static final void method958(boolean arg0) {
        ++field2167;
        class204.field3185.method1898((byte) -111);
        class149.field2354.method1898((byte) 83);
        if (arg0) {
            field2157 = null;
        }
        class266.field4246.method1898((byte) 49);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            method956(-99, -53, (byte) -60);
        }
        ++field2162;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0, (byte) 94);
            for (int var5 = 0; ~class240.field3896 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2159 && ~this.field2164 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
