import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class103 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[[[I")
    public static int[][][] field1792;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method807(byte arg0) {
        field1788++;
        if (arg0 > -73) {
            method808(-30, -79);
        }
        class14.field161.method1420((byte) -54);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method808(int arg0, int arg1) {
        field1793++;
        if (arg1 != -14477) {
            field1791 = -121;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method809(byte arg0) {
        field1792 = null;
        if (arg0 != -73) {
            field1792 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class264.field4230 = arg3;
        class73.field1156 = arg4;
        field1790++;
        class273.field4418 = arg1;
        if (arg2 == -101) {
            class59.field859 = arg0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method811(int arg0, int arg1) {
        field1789++;
        if (~arg1 == arg0 && class31.field392 > 0) {
            byte[] var2 = class65.field984[--class31.field392];
            class65.field984[class31.field392] = null;
            return var2;
        } else if (arg1 == 5000 && class155.field2418 > 0) {
            byte[] var3 = class102.field1759[--class155.field2418];
            class102.field1759[class155.field2418] = null;
            return var3;
        } else if (arg1 == 30000 && class167.field2551 > 0) {
            byte[] var4 = class72.field1135[--class167.field2551];
            class72.field1135[class167.field2551] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
