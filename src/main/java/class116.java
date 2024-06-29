import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class116 {

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1804 = new Hashtable();

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "[[I")
    public static int[][] field1809;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIBI)Z", line = 5)
    public static final boolean method1043(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1806++;
        if (!class185.field3114) {
            return false;
        } else if (arg5 < 5) {
            return false;
        } else if (class504.field7375 < 100) {
            return false;
        } else if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var12 = arg4; var12 <= arg3; var12++) {
                    if (class97.field1577[arg0][var9][var12] == (-class140.field2350)) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << class439.field6699) + 1;
            int var11 = (arg4 << class439.field6699) + 2;
            if (class332.method2247((arg3 + 1 - arg4) * class134.field2203, (arg2 + 1 - arg1) * class134.field2203, var10, var11, -13766, class587.field8346[arg0].method479(arg4, arg1, -126), arg6)) {
                class544.field7915++;
                return true;
            } else {
                return false;
            }
        } else if (class640.method3715(95, arg1, arg4, arg0)) {
            int var7 = arg1 << class439.field6699;
            int var8 = arg4 << class439.field6699;
            if (class332.method2247(class134.field2203, class134.field2203, var7, var8, -13766, class587.field8346[arg0].method479(arg4, arg1, -115), arg6)) {
                class544.field7915++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "toString", descriptor = "()Ljava/lang/String;", line = 73)
    public final String toString() {
        field1803++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 86)
    public static void method1044(byte arg0) {
        field1809 = null;
        field1804 = null;
        if (arg0 != -17) {
            method1044((byte) -16);
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(I)V", line = 97)
    public class116(int arg0) {
        this.field1808 = arg0;
    }
}
