import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends InputStream {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[B")
    private byte[] field447 = new byte[65536];

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    private int[] field448 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    private int[] field449 = new int[256];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Z")
    public boolean field446;

    @OriginalMember(owner = "client!da", name = "read", descriptor = "()I")
    public final int read() {
        byte[] var1 = new byte[1];
        this.read(var1, 0, 1);
        return var1[0];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)B")
    private final byte method164(int arg0) {
        int var2 = arg0 >> 8 & 0x80;
        if (var2 != 0) {
            arg0 = -arg0;
        }
        if (arg0 > 32635) {
            arg0 = 32635;
        }
        arg0 += 132;
        int var3 = this.field448[arg0 >> 7 & 0xFF];
        int var4 = arg0 >> var3 + 3 & 0xF;
        return (byte) ~(var2 | var3 << 4 | var4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([B[I[BIII)V")
    private static final void method165(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg5; var6++) {
            arg2[arg4++] = arg0[(arg1[var6] >> 8) + 32768];
        }
    }

    @OriginalMember(owner = "client!da", name = "read", descriptor = "([BII)I")
    public final synchronized int read(byte[] arg0, int arg1, int arg2) {
        try {
            if (this.field446) {
                return -1;
            } else if (arg2 > 256) {
                this.read(arg0, arg1, 256);
                this.read(arg0, arg1 + 256, arg2 - 256);
                return arg2;
            } else {
                class31.method228(this.field449, arg2);
                for (int var4 = 0; var4 < arg2; var4++) {
                    int var5 = this.field449[var4];
                    if ((var5 + 8388608 & 0xFF000000) != 0) {
                        this.field449[var4] = var5 >> 31 ^ 0x7FFFFF;
                    }
                }
                method165(this.field447, this.field449, arg0, 0, arg1, arg2);
                return arg2;
            }
        } catch (Exception var7) {
            this.field446 = true;
            class121.method943((byte) -112, var7, null);
            return -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class23() {
        for (int var1 = -32768; var1 < 32768; var1++) {
            this.field447[var1 + 32768] = this.method164(var1);
        }
    }
}
