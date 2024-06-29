import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class666 {

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public int field9208 = -1;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field9212 = -1;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljw;")
    public static class581 field9213 = new class581(86, -1);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "[I")
    public int[] field9207;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZLjp;)V")
    private final void method3689(int arg0, boolean arg1, class376 arg2) {
        if (arg0 == 1) {
            this.field9212 = arg2.method2359(-1);
        } else if (arg0 == 2) {
            this.field9207 = new int[arg2.method2398(-1372747256)];
            for (int var4 = 0; var4 < this.field9207.length; var4++) {
                this.field9207[var4] = arg2.method2359(-1);
            }
        } else if (arg0 == 3) {
            this.field9208 = arg2.method2398(-1372747256);
        }
        if (arg1) {
            field9210++;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjp;)V")
    public final void method3690(byte arg0, class376 arg1) {
        field9209++;
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                if (arg0 <= 30) {
                    this.field9212 = 3;
                    return;
                } else {
                    return;
                }
            }
            this.method3689(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3691(int arg0) {
        if (arg0 >= -126) {
            field9213 = null;
        }
        field9213 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
    public static final void method3692(int arg0, String arg1, File arg2) {
        class587.field7824.put(arg1, arg2);
        if (arg0 != 0) {
            method3692(-116, null, null);
        }
        field9211++;
    }
}
