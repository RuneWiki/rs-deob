import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class740 extends class291 {

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "[[B")
    private byte[][] field9971 = new byte[10][];

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lcea;")
    private class215 field9970 = new class215(null);

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lcea;")
    private class215 field9972 = new class215(null);

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lin;")
    private class91 field9963;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    private int field9968;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
    public static boolean field9961 = false;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lfh;")
    public static class652 field9967 = new class652("LIVE", 0);

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    private int field9966;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "[I")
    private int[] field9965;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V", line = 6)
    public final void method4064(byte arg0) {
        field9962++;
        if (this.field9965 == null || arg0 >= -27) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9965.length <= this.field9966 + var2) {
                return;
            }
            if (this.field9971[var2] == null && this.field9963.method873(-10499, this.field9965[this.field9966 + var2], 0)) {
                this.field9971[var2] = this.field9963.method863(-1860, this.field9965[this.field9966 + var2], 0);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V", line = 37)
    public static void method4065(int arg0) {
        if (arg0 <= 80) {
            method4066(-87, true, 104, 0);
        }
        field9967 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILin;I)V", line = 47)
    private class740(int arg0, class91 arg1, int arg2) {
        super(arg0);
        this.field9963 = arg1;
        this.field9968 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZII)V", line = 62)
    public static final void method4066(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 > -108) {
            field9961 = false;
        }
        if (class581.field7954.method1465((long) arg2, -6008) == null) {
            if (class479.field6679) {
                class7 var4 = new class7(arg2, new class740(4096, class499.field6973, arg2), arg0, arg1);
                var4.field47.method1903(-92, class233.field3385[class607.field8336]);
                class581.field7954.method1468((byte) 35, (long) arg2, var4);
            } else {
                class181.method1329(arg1, (byte) -90, arg2);
            }
        }
        field9964++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[B)I", line = 86)
    public final int method1910(byte arg0, byte[] arg1) throws IOException {
        field9969++;
        if (this.field9965 == null) {
            if (!this.field9963.method873(-10499, this.field9968, 0)) {
                return 0;
            }
            byte[] var3 = this.field9963.method863(-1860, this.field9968, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field9972.field3066 = var3;
            this.field9972.field3109 = 0;
            int var4 = var3.length >> 1;
            this.field9965 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9965[var5] = this.field9972.method1478(842397944);
            }
        }
        if (this.field9966 >= this.field9965.length) {
            return -1;
        }
        this.method4064((byte) -74);
        if (arg0 != 21) {
            this.field9971 = null;
        }
        this.field9972.field3066 = arg1;
        this.field9972.field3109 = 0;
        do {
            if (this.field9972.field3066.length <= this.field9972.field3109) {
                this.field9972.field3066 = null;
                return arg1.length;
            }
            if (this.field9970.field3066 == null) {
                if (this.field9971[0] == null) {
                    this.field9972.field3066 = null;
                    return this.field9972.field3109;
                }
                this.field9970.field3066 = this.field9971[0];
            }
            int var6 = this.field9972.field3066.length - this.field9972.field3109;
            int var7 = this.field9970.field3066.length - this.field9970.field3109;
            if (var6 < var7) {
                this.field9970.method1537(Integer.MAX_VALUE, this.field9972.field3109, var6, this.field9972.field3066);
                this.field9972.field3066 = null;
                return arg1.length;
            }
            this.field9972.method1528(var7, this.field9970.field3109, this.field9970.field3066, -58);
            this.field9970.field3109 = 0;
            this.field9970.field3066 = null;
            this.field9966++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field9971[var8] = this.field9971[var8 + 1];
            }
            this.field9971[9] = null;
        } while (this.field9966 < this.field9965.length);
        this.field9972.field3066 = null;
        return this.field9972.field3109;
    }
}
