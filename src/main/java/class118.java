import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field2754 = -1;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lhe;")
    private static class54 field2759 = class6.method58("Type", false);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lhe;")
    public static class54 field2762 = field2759;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lhe;")
    public static class54 field2755 = class6.method58(" zuerst von Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lhe;")
    public static class54 field2766 = class6.method58("<col=ffff00>*V", false);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Z")
    public static boolean field2767 = true;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
    public static boolean field2768 = false;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lta;")
    public class133 field2761;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lgd;")
    public static class46 field2764;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[Lce;")
    public static class20[] field2753;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[Lhe;")
    public class54[] field2756;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[[[B")
    public static byte[][][] field2760;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method886(boolean arg0, byte arg1, Object arg2) {
        field2769++;
        int var3 = 108 % ((-arg1 - 32) / 42);
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return arg0 ? class88.method704(-24158, var4) : var4;
        } else if (arg2 instanceof class82) {
            class82 var5 = (class82) arg2;
            return var5.method626(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public static int method887(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field2753 = null;
        field2755 = null;
        field2762 = null;
        field2760 = null;
        field2766 = null;
        field2764 = null;
        int var1 = -34 % ((-arg0 - 35) / 52);
        field2759 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static final void method889(byte arg0) {
        field2757++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class67.field1641 - 1; var2++) {
                if (class157.field3574[var2] < 1000 && class157.field3574[var2 + 1] > 1000) {
                    var1 = false;
                    class54 var3 = class34.field842[var2];
                    class34.field842[var2] = class34.field842[var2 + 1];
                    class34.field842[var2 + 1] = var3;
                    class54 var4 = class67.field1618[var2];
                    class67.field1618[var2] = class67.field1618[var2 + 1];
                    class67.field1618[var2 + 1] = var4;
                    int var5 = class157.field3574[var2];
                    class157.field3574[var2] = class157.field3574[var2 + 1];
                    class157.field3574[var2 + 1] = var5;
                    int var6 = class80.field1976[var2];
                    class80.field1976[var2] = class80.field1976[var2 + 1];
                    class80.field1976[var2 + 1] = var6;
                    int var7 = class77.field1880[var2];
                    class77.field1880[var2] = class77.field1880[var2 + 1];
                    class77.field1880[var2 + 1] = var7;
                    int var8 = class7.field214[var2];
                    class7.field214[var2] = class7.field214[var2 + 1];
                    class7.field214[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -43) {
            field2759 = null;
        }
    }
}
