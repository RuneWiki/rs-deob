import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class472 extends class86 {

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    private int field6821;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    public int field6832;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "F")
    public float field6819;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
    public int field6831;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private int field6817;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    public int field6824;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Liu;")
    public static class390 field6814 = new class390(100, 12);

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    public static int field6827 = -1;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "[Lkt;")
    public static class103[] field6830 = new class103[14];

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "Lih;")
    public static class474 field6822;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2757(int arg0) {
        field6829++;
        class298.field4335.method237((byte) -127);
        for (int var1 = 0; var1 < 32; var1++) {
            class14.field213[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class278.field3966[var2] = 0L;
        }
        class91.field1246 = 0;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)F", line = 30)
    public final float method2758(int arg0) {
        field6816++;
        if (arg0 != -33) {
            this.method2760(101);
        }
        return this.field6819;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)I", line = 44)
    public final int method2759(int arg0) {
        field6815++;
        if (arg0 <= 113) {
            this.method2765(36);
        }
        return this.field6832;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I", line = 58)
    public final int method2760(int arg0) {
        field6820++;
        if (arg0 >= -15) {
            this.method2759(-111);
        }
        return this.field6831;
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)I", line = 69)
    public final int method2761(int arg0) {
        field6828++;
        return arg0 == 0 ? this.field6824 : -117;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)V", line = 81)
    public static final void method2762(byte arg0) {
        int var1 = 0;
        if (arg0 > -89) {
            method2757(-94);
        }
        while (var1 < class124.field1611) {
            class147 var2 = class415.field6150[var1];
            if (var2.field1908 == 2) {
                if (var2.field1907 == null) {
                    var2.field1915 = Integer.MIN_VALUE;
                } else {
                    class375.field5607.method643(var2.field1907);
                }
            }
            var1++;
        }
        field6833++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/Object;B[J)V", line = 114)
    public static final void method2763(Object[] arg0, byte arg1, long[] arg2) {
        field6823++;
        class423.method2525(0, arg2, arg2.length - 1, arg0, (byte) -15);
        if (arg1 != -127) {
            method2763(null, (byte) -90, null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I", line = 126)
    public final int method2764(boolean arg0) {
        if (arg0) {
            return -35;
        } else {
            field6818++;
            return this.field6817;
        }
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)I", line = 137)
    public final int method2765(int arg0) {
        field6813++;
        return arg0 == 0 ? this.field6821 : 14;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIF)V", line = 161)
    public class472(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6821 = arg4;
        this.field6832 = arg0;
        this.field6819 = arg5;
        this.field6831 = arg1;
        this.field6817 = arg3;
        this.field6824 = arg2;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(B)V", line = 179)
    public static void method2766(byte arg0) {
        if (arg0 >= -57) {
            method2763(null, (byte) -87, null);
        }
        field6814 = null;
        field6830 = null;
        field6822 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)V")
    public abstract void method1602(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FI)V")
    public abstract void method1601(float arg0, int arg1);
}
