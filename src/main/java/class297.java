import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class297 implements Runnable {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "[Lon;")
    public volatile class151[] field4928 = new class151[2];

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Z")
    public volatile boolean field4922 = false;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
    public volatile boolean field4920 = false;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field4925 = 0;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field4923 = -1;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field4924 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Luo;")
    public class274 field4921;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
    public static boolean field4930;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2097(byte arg0) {
        if (arg0 != -29) {
            method2098(-95, 16, true, -103);
        }
        class195.field2992.method250(21066, 255);
        for (class167 var1 = (class167) class218.field3363.method27(116); var1 != null; var1 = (class167) class218.field3363.method34(8)) {
            if (var1.field2629 == 0) {
                class70.method489(true, var1, 122);
            }
        }
        if (class172.field2695 != null) {
            class218.method1472((byte) 123, class172.field2695);
            class172.field2695 = null;
        }
        field4929++;
        class86.field1233++;
    }

    @OriginalMember(owner = "client!sk", name = "run", descriptor = "()V", line = 37)
    public final void run() {
        this.field4920 = true;
        field4927++;
        try {
            while (!this.field4922) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class151 var2 = this.field4928[var1];
                    if (var2 != null) {
                        var2.method1091(1);
                    }
                }
                class177.method1246(10L, -32644);
                class89.method591(false, this.field4921, (Object) null);
            }
        } catch (Exception var7) {
            class326.method2328(var7, (String) null, true);
        } finally {
            this.field4920 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZI)V", line = 87)
    public static final void method2098(int arg0, int arg1, boolean arg2, int arg3) {
        field4926++;
        if (!arg2) {
            return;
        }
        if (arg1 == 1009) {
            class178.method1249(arg3, 10, false, arg0);
        } else if (arg1 == 1012) {
            class178.method1249(arg3, 11, false, arg0);
        } else if (arg1 == 1005) {
            class178.method1249(arg3, 12, !arg2, arg0);
        } else if (arg1 == 1008) {
            class178.method1249(arg3, 13, !arg2, arg0);
        } else if (arg1 == 1001) {
            class178.method1249(arg3, 14, false, arg0);
        }
    }
}
