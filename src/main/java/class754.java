import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class754 extends class303 {

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "[[B")
    private byte[][] field10415 = new byte[10][];

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "Lso;")
    private class494 field10420 = new class494(null);

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "Lso;")
    private class494 field10424 = new class494(null);

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "Lwia;")
    private class791 field10414;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    private int field10423;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field10413 = 2;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "Lbu;")
    public static class21 field10422 = new class21(56, -2);

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    private int field10421;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "[I")
    private int[] field10418;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([BZ)I")
    public final int method1967(byte[] arg0, boolean arg1) throws IOException {
        field10416++;
        if (this.field10418 == null) {
            if (!this.field10414.method4359(this.field10423, 0, 0)) {
                return 0;
            }
            byte[] var3 = this.field10414.method4339(0, 0, this.field10423);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field10424.field7050 = var3;
            this.field10424.field7042 = 0;
            int var4 = var3.length >> 1;
            this.field10418 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10418[var5] = this.field10424.method2998(true);
            }
        }
        if (this.field10418.length <= this.field10421) {
            return -1;
        } else if (arg1) {
            return 28;
        } else {
            this.method4197((byte) 35);
            this.field10424.field7050 = arg0;
            this.field10424.field7042 = 0;
            do {
                if (this.field10424.field7050.length <= this.field10424.field7042) {
                    this.field10424.field7050 = null;
                    return arg0.length;
                }
                if (this.field10420.field7050 == null) {
                    if (this.field10415[0] == null) {
                        this.field10424.field7050 = null;
                        return this.field10424.field7042;
                    }
                    this.field10420.field7050 = this.field10415[0];
                }
                int var6 = this.field10424.field7050.length - this.field10424.field7042;
                int var7 = this.field10420.field7050.length - this.field10420.field7042;
                if (var7 > var6) {
                    this.field10420.method2958(true, this.field10424.field7050, this.field10424.field7042, var6);
                    this.field10424.field7050 = null;
                    return arg0.length;
                }
                this.field10424.method2936(9278, this.field10420.field7042, this.field10420.field7050, var7);
                this.field10421++;
                this.field10420.field7042 = 0;
                this.field10420.field7050 = null;
                for (int var8 = 0; var8 < 9; var8++) {
                    this.field10415[var8] = this.field10415[var8 + 1];
                }
                this.field10415[9] = null;
            } while (this.field10418.length > this.field10421);
            this.field10424.field7050 = null;
            return this.field10424.field7042;
        }
    }

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "(I)V")
    public static void method4195(int arg0) {
        field10422 = null;
        if (arg0 <= 35) {
            field10422 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method4196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10419++;
        if (arg8 >= 1 && arg1 >= 1 && class768.field10571 - 2 >= arg8 && class350.field4898 - 2 >= arg1) {
            int var9 = arg0;
            if (arg0 < 3 && class124.method941(4, arg1, arg8)) {
                var9 = arg0 + 1;
            }
            if (class21.field353.field10086.method1642(arg4 ^ 0x1C) == 0 && !class580.method3400(arg8, var9, arg1, class481.field6761, 74)) {
                return;
            }
            if (class767.field10562 == null) {
                return;
            }
            class442.field6036.method2369(class37.field491, arg0, arg1, arg5, arg8, class346.field4838[arg0], (byte) 7);
            if (arg6 >= 0) {
                int var10 = class21.field353.field10067.method3318(-108);
                class21.field353.method4080(true, class21.field353.field10067, 1);
                class442.field6036.method2366(arg7, arg3, class346.field4838[arg0], arg6, class37.field491, arg1, arg0, arg2, var9, arg8, arg4 ^ 0xFFFFFFFD);
                class21.field353.method4080(true, class21.field353.field10067, var10);
            }
        }
        if (arg4 != -2) {
            field10422 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILwia;I)V")
    public class754(int arg0, class791 arg1, int arg2) {
        super(arg0);
        this.field10414 = arg1;
        this.field10423 = arg2;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V")
    public final void method4197(byte arg0) {
        field10417++;
        if (this.field10418 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10 && (this.field10421 + var2) < this.field10418.length; var2++) {
            if (this.field10415[var2] == null && this.field10414.method4359(this.field10418[this.field10421 + var2], 0, 0)) {
                this.field10415[var2] = this.field10414.method4339(0, 0, this.field10418[this.field10421 + var2]);
            }
        }
        if (arg0 < 31) {
            this.method4197((byte) 39);
        }
    }
}
