import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class324 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
    public static int[] field4432;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(JB)V")
    public static final void method2043(long arg0, byte arg1) {
        if (arg1 != 32) {
            method2044(false);
        }
        field4431++;
        int var3 = class307.field4211.field6197 + class429.field6167;
        int var4 = class140.field1982 + class307.field4211.field6192;
        if ((class290.field4007 - var3) < -500 || class290.field4007 - var3 > 500 || class123.field1729 - var4 < -500 || (class123.field1729 - var4) > 500) {
            class290.field4007 = var3;
            class123.field1729 = var4;
        }
        if (class290.field4007 != var3) {
            int var5 = var3 - class290.field4007;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class290.field4007 += var6;
        }
        if (!class188.field2609) {
            class140.field2007 += (float) arg0 * class10.field143 / 6.0F;
            class6.field98 += (float) arg0 * class220.field2891 / 6.0F;
        }
        if (class123.field1729 != var4) {
            int var7 = var4 - class123.field1729;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class123.field1729 += var8;
        }
        class311.method1968((byte) 30);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method2044(boolean arg0) {
        if (!arg0) {
            method2044(false);
        }
        field4432 = null;
    }
}
