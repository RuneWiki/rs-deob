import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class650 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Leo;")
    public class310 field9153 = new class310();

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
    public boolean field9156 = false;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
    public static boolean field9155 = false;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lip;")
    public static class734 field9151;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method3719(int arg0) {
        while (true) {
            class167 var2 = (class167) this.field9153.method2029(13);
            if (var2 == null) {
                field9150++;
                if (arg0 != 0) {
                    this.field9153 = null;
                    return;
                }
                return;
            }
            var2.method592(2);
            class192.method1407(var2, 1949);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method3720(int arg0) {
        if (arg0 != 0) {
            field9155 = false;
        }
        field9151 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILhq;)V")
    public final void method3721(int arg0, class167 arg1) {
        field9149++;
        class547 var3 = arg1.field2428;
        boolean var4 = true;
        class660[] var5 = arg1.field2426;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field9279) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field9156) {
            for (class167 var7 = (class167) this.field9153.method2033(arg0); var7 != null; var7 = (class167) this.field9153.method2025((byte) -88)) {
                if (var7.field2428 == var3) {
                    var7.method592(2);
                    class192.method1407(var7, 1949);
                }
            }
        }
        for (class167 var8 = (class167) this.field9153.method2033(arg0); var8 != null; var8 = (class167) this.field9153.method2025((byte) -88)) {
            if (var3.field7722 >= var8.field2428.field7722) {
                class250.method1668(118, var8, arg1);
                return;
            }
        }
        this.field9153.method2026((byte) 51, arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public static final void method3722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class738.field10297 && arg3 <= class414.field5846) {
            int var5 = class387.method2374(1, arg0, class450.field6463, class285.field4372);
            int var6 = class387.method2374(arg4 + 1, arg2, class450.field6463, class285.field4372);
            class139.method972(arg3, var6, 109, var5, arg1);
        }
        field9152++;
        if (arg4 != 0) {
            field9151 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method3723(boolean arg0, byte arg1, Object arg2) {
        field9154++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class536.method3101(var3, 0) : var3;
        } else if (arg2 instanceof class581) {
            class581 var4 = (class581) arg2;
            return var4.method284(0);
        } else {
            if (arg1 < 53) {
                field9155 = false;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Z)V")
    public class650(boolean arg0) {
        this.field9156 = arg0;
    }
}
