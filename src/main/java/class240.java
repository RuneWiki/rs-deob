import java.io.FileOutputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class240 extends class510 {

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "[[B")
    private byte[][] field3584 = new byte[10][];

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lgga;")
    private class511 field3576 = new class511(null);

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Lgga;")
    private class511 field3586 = new class511(null);

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lae;")
    private class283 field3582;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    private int field3579;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Lqk;")
    public static class1 field3575 = new class1(27, 3);

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field3577;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "[I")
    private int[] field3581;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILae;I)V", line = 10)
    public class240(int arg0, class283 arg1, int arg2) {
        super(arg0);
        this.field3582 = arg1;
        this.field3579 = arg2;
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)V", line = 24)
    public static void method1617(int arg0) {
        field3575 = null;
        if (arg0 >= -67) {
            field3575 = null;
        }
        field3577 = null;
    }

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "(I)V", line = 35)
    public final void method1618(int arg0) {
        if (arg0 != -21502) {
            return;
        }
        field3580++;
        if (this.field3581 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3581.length <= (this.field3578 + var2)) {
                return;
            }
            if (this.field3584[var2] == null && this.field3582.method1862(84, 0, this.field3581[this.field3578 + var2])) {
                this.field3584[var2] = this.field3582.method1849(0, (byte) -98, this.field3581[this.field3578 + var2]);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lsh;Lae;Lae;Llp;Lae;B)Z", line = 69)
    public static final boolean method1619(class288 arg0, class283 arg1, class283 arg2, class82 arg3, class283 arg4, byte arg5) {
        if (arg5 >= -30) {
            method1619(null, null, null, null, null, (byte) -78);
        }
        class493.field6796 = arg3;
        class693.field9670 = arg2;
        class781.field10731 = arg1;
        field3583++;
        class531.field7315 = arg4;
        class744.field10271 = new int[16];
        class474.field6580 = arg0;
        for (int var6 = 0; var6 < 16; var6++) {
            class744.field10271[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BI)I", line = 97)
    public final int method1620(byte[] arg0, int arg1) throws IOException {
        field3585++;
        if (this.field3581 == null) {
            if (!this.field3582.method1862(68, 0, this.field3579)) {
                return 0;
            }
            byte[] var3 = this.field3582.method1849(0, (byte) 81, this.field3579);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field3586.field6962 = 0;
            this.field3586.field6979 = var3;
            int var4 = var3.length >> 1;
            this.field3581 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3581[var5] = this.field3586.method3002(-1);
            }
        }
        if (this.field3581.length <= this.field3578) {
            return -1;
        }
        this.method1618(-21502);
        this.field3586.field6962 = arg1;
        this.field3586.field6979 = arg0;
        do {
            if (this.field3586.field6962 >= this.field3586.field6979.length) {
                this.field3586.field6979 = null;
                return arg0.length;
            }
            if (this.field3576.field6979 == null) {
                if (this.field3584[0] == null) {
                    this.field3586.field6979 = null;
                    return this.field3586.field6962;
                }
                this.field3576.field6979 = this.field3584[0];
            }
            int var6 = this.field3586.field6979.length - this.field3586.field6962;
            int var7 = this.field3576.field6979.length - this.field3576.field6962;
            if (var7 > var6) {
                this.field3576.method3014(var6, this.field3586.field6979, 75212712, this.field3586.field6962);
                this.field3586.field6979 = null;
                return arg0.length;
            }
            this.field3586.method2997((byte) -61, this.field3576.field6979, this.field3576.field6962, var7);
            this.field3576.field6962 = 0;
            this.field3576.field6979 = null;
            this.field3578++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field3584[var8] = this.field3584[var8 + 1];
            }
            this.field3584[9] = null;
        } while (this.field3581.length > this.field3578);
        this.field3586.field6979 = null;
        return this.field3586.field6962;
    }
}
