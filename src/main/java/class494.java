import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class494 extends class433 {

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "[[B")
    private byte[][] field6956 = new byte[10][];

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "Ldt;")
    private class254 field6953 = new class254(null);

    @OriginalMember(owner = "client!vaa", name = "R", descriptor = "Ldt;")
    private class254 field6962 = new class254(null);

    @OriginalMember(owner = "client!vaa", name = "O", descriptor = "Luq;")
    private class172 field6959;

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
    private int field6955;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "Ljb;")
    public static class519 field6952 = new class519(57, -2);

    @OriginalMember(owner = "client!vaa", name = "M", descriptor = "Ljb;")
    public static class519 field6958 = new class519(0, 3);

    @OriginalMember(owner = "client!vaa", name = "S", descriptor = "I")
    public static int field6963 = 328;

    @OriginalMember(owner = "client!vaa", name = "U", descriptor = "I")
    public static int field6965 = 13156520;

    @OriginalMember(owner = "client!vaa", name = "W", descriptor = "I")
    public static int field6967 = 0;

    @OriginalMember(owner = "client!vaa", name = "V", descriptor = "[I")
    public static int[] field6966 = new int[14];

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!vaa", name = "P", descriptor = "I")
    private int field6960;

    @OriginalMember(owner = "client!vaa", name = "T", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!vaa", name = "Q", descriptor = "Lmo;")
    public static class779 field6961;

    @OriginalMember(owner = "client!vaa", name = "L", descriptor = "[I")
    private int[] field6957;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[B)I", line = 4)
    public final int method2600(int arg0, byte[] arg1) throws IOException {
        field6951++;
        if (this.field6957 == null) {
            if (!this.field6959.method1174(this.field6955, 0, arg0 + 1)) {
                return 0;
            }
            byte[] var3 = this.field6959.method1188(this.field6955, arg0 - 18047, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field6962.field3789 = var3;
            this.field6962.field3725 = 0;
            int var4 = var3.length >> 1;
            this.field6957 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6957[var5] = this.field6962.method1728((byte) 13);
            }
        }
        if (this.field6960 >= this.field6957.length) {
            return -1;
        }
        this.method2909(arg0 ^ 0xFFFFFFAE);
        this.field6962.field3725 = arg0;
        this.field6962.field3789 = arg1;
        do {
            if (this.field6962.field3725 >= this.field6962.field3789.length) {
                this.field6962.field3789 = null;
                return arg1.length;
            }
            if (this.field6953.field3789 == null) {
                if (this.field6956[0] == null) {
                    this.field6962.field3789 = null;
                    return this.field6962.field3725;
                }
                this.field6953.field3789 = this.field6956[0];
            }
            int var6 = this.field6962.field3789.length - this.field6962.field3725;
            int var7 = this.field6953.field3789.length - this.field6953.field3725;
            if (var7 > var6) {
                this.field6953.method1735(this.field6962.field3725, 125, this.field6962.field3789, var6);
                this.field6962.field3789 = null;
                return arg1.length;
            }
            this.field6962.method1716(this.field6953.field3789, var7, this.field6953.field3725, true);
            this.field6953.field3725 = 0;
            this.field6953.field3789 = null;
            this.field6960++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field6956[var8] = this.field6956[var8 + 1];
            }
            this.field6956[9] = null;
        } while (this.field6957.length > this.field6960);
        this.field6962.field3789 = null;
        return this.field6962.field3725;
    }

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "(B)V", line = 98)
    public static void method2908(byte arg0) {
        field6952 = null;
        field6966 = null;
        if (arg0 != 48) {
            method2908((byte) -51);
        }
        field6958 = null;
        field6961 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(ILuq;I)V", line = 115)
    public class494(int arg0, class172 arg1, int arg2) {
        super(arg0);
        this.field6959 = arg1;
        this.field6955 = arg2;
    }

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)V", line = 130)
    public final void method2909(int arg0) {
        field6954++;
        if (arg0 >= -13 || this.field6957 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6960 + var2 >= this.field6957.length) {
                return;
            }
            if (this.field6956[var2] == null && this.field6959.method1174(this.field6957[this.field6960 + var2], 0, 1)) {
                this.field6956[var2] = this.field6959.method1188(this.field6957[this.field6960 + var2], -18047, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILiga;Liga;)V", line = 165)
    public static final void method2910(int arg0, int arg1, int arg2, class481 arg3, class481 arg4) {
        class194 var5 = class782.method4289(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2527 = arg3;
        var5.field2523 = arg4;
        int var6 = class737.field10008 == class645.field8694 ? 1 : 0;
        if (!arg3.method769(-85)) {
            arg3.field2808 = class570.field7774[var6];
            class570.field7774[var6] = arg3;
        } else if (arg3.method777(-103)) {
            arg3.field2808 = class151.field2056[var6];
            class151.field2056[var6] = arg3;
        } else {
            arg3.field2808 = class737.field10005[var6];
            class737.field10005[var6] = arg3;
            class132.field1818 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method769(-88)) {
            if (arg4.method777(-122)) {
                arg4.field2808 = class151.field2056[var6];
                class151.field2056[var6] = arg4;
                return;
            }
            arg4.field2808 = class737.field10005[var6];
            class737.field10005[var6] = arg4;
            class132.field1818 = true;
            return;
        }
        arg4.field2808 = class570.field7774[var6];
        class570.field7774[var6] = arg4;
    }
}
