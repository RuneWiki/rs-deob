import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class466 {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Luaa;")
    private class395 field6722 = new class395(256);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Ln;")
    private class472 field6720;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lnd;")
    private class632 field6721;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6714 = 0;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lfd;")
    public static class143 field6716 = new class143();

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        int var1 = -51 % ((arg0 - 19) / 35);
        field6716 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method2711(int arg0) {
        this.field6722.method2397(arg0, (byte) -99);
        field6717++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public final void method2712(int arg0) {
        if (arg0 != 7) {
            field6716 = null;
        }
        field6715++;
        this.field6722.method2406(8);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Ldea;")
    public final class405 method2713(int arg0, int arg1) {
        field6718++;
        Object var3 = this.field6722.method2407(false, (long) arg1);
        if (var3 != null) {
            return (class405) var3;
        } else if (this.field6720.method2389(-85, arg1)) {
            class576 var4 = this.field6720.method2387((byte) 127, arg1);
            int var5 = var4.field8205 ? 64 : this.field6721.field9127;
            class405 var7;
            if (var4.field8221 && this.field6721.method157()) {
                float[] var6 = this.field6720.method2392(0.7F, var5, arg1, arg0 + 2995, false, var5);
                var7 = this.field6721.method3591(var4.field8201 != 0, var5, class85.field1472, (byte) 110, var5, var6);
            } else {
                int[] var8 = var4.field8217 ? this.field6720.method2385(0.7F, var5, false, arg1, true, var5) : this.field6720.method2388(var5, var5, true, arg1, 0.7F, (byte) -64);
                var7 = this.field6721.method3587(var4.field8201 != 0, var5, var8, var5, (byte) -57);
            }
            if (arg0 == 0) {
                var7.method1535(var4.field8207, var4.field8218, 122);
                this.field6722.method2408(var7, (long) arg1, arg0 ^ 0xFFFFFF84);
                return var7;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
    public static final int method2714(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field6723++;
        if (arg2 != -23183) {
            return -103;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lnd;Ln;)V")
    public class466(class632 arg0, class472 arg1) {
        this.field6720 = arg1;
        this.field6721 = arg0;
    }
}
