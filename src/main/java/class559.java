import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class559 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "[I")
    public static int[] field7949 = new int[8];

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
    public static int[] field7952 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "[I")
    public static int[] field7954 = new int[4096];

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Leq;")
    public static class209 field7950;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method3281(byte arg0) {
        field7950 = null;
        if (arg0 != 74) {
            field7954 = null;
        }
        field7952 = null;
        field7949 = null;
        field7954 = null;
    }

    @OriginalMember(owner = "client!pu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7951++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLvg;)I")
    public static final int method3282(byte arg0, class52 arg1) {
        field7953++;
        if (arg1.field878 == 0) {
            return 0;
        }
        if (arg1.field967 != -1) {
            class52 var2 = null;
            if (arg1.field967 < 32768) {
                class272 var3 = (class272) class758.field10539.method4203(true, (long) arg1.field967);
                if (var3 != null) {
                    var2 = var3.field3885;
                }
            } else if (arg1.field967 >= 32768) {
                var2 = class165.field2442[arg1.field967 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field644 - var2.field644;
                int var5 = arg1.field648 - var2.field648;
                if (var4 != 0 || var5 != 0) {
                    arg1.method474(-1, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 != 110) {
            method3282((byte) 116, null);
        }
        if ((arg1 instanceof class349)) {
            class349 var9 = (class349) arg1;
            if (var9.field4936 != -1 && (var9.field992 == 0 || var9.field989 > 0)) {
                var9.method474(-1, var9.field4936);
                var9.field4936 = -1;
            }
        } else if (arg1 instanceof class84) {
            class84 var6 = (class84) arg1;
            if (var6.field1531 != -1 && (var6.field992 == 0 || var6.field989 > 0)) {
                int var7 = var6.field644 - (var6.field1531 - class115.field1845 - class115.field1845) * 256;
                int var8 = var6.field648 - (var6.field1522 - class64.field1160 - class64.field1160) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method474(arg0 ^ 0xFFFFFF91, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field1531 = -1;
            }
        }
        return arg1.method477(arg0 ^ 0xFFFF8F93);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(II)V")
    public class559(int arg0, int arg1) {
    }
}
