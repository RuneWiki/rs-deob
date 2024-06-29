import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 extends InputStream {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    private int[] field377 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[B")
    private byte[] field375 = new byte[65536];

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    private int[] field378 = new int[256];

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Z")
    public boolean field376;

    @OriginalMember(owner = "client!da", name = "read", descriptor = "()I", line = 4)
    public final int read() {
        byte[] var1 = new byte[1];
        this.read(var1, 0, 1);
        return var1[0];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([B[I[BIII)V", line = 11)
    private static final void method165(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg5; var6++) {
            arg2[arg4++] = arg0[(arg1[var6] >> 8) + 32768];
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)B", line = 26)
    private final byte method166(int arg0) {
        int var2 = arg0 >> 8 & 0x80;
        if (var2 != 0) {
            arg0 = -arg0;
        }
        if (arg0 > 32635) {
            arg0 = 32635;
        }
        arg0 += 132;
        int var3 = this.field377[arg0 >> 7 & 0xFF];
        int var4 = arg0 >> var3 + 3 & 0xF;
        return (byte) ~(var2 | var3 << 4 | var4);
    }

    @OriginalMember(owner = "client!da", name = "read", descriptor = "([BII)I", line = 40)
    public final synchronized int read(byte[] arg0, int arg1, int arg2) {
        try {
            if (this.field376) {
                return -1;
            } else if (arg2 > 256) {
                this.read(arg0, arg1, 256);
                this.read(arg0, arg1 + 256, arg2 - 256);
                return arg2;
            } else {
                class128.method996(this.field378, arg2);
                for (int var4 = 0; var4 < arg2; var4++) {
                    int var5 = this.field378[var4];
                    if ((var5 + 8388608 & 0xFF000000) != 0) {
                        this.field378[var4] = var5 >> 31 ^ 0x7FFFFF;
                    }
                }
                method165(this.field375, this.field378, arg0, 0, arg1, arg2);
                return arg2;
            }
        } catch (Exception var7) {
            this.field376 = true;
            class45.method392((byte) 25, null, var7);
            return -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 84)
    public class20() {
        for (int var1 = -32768; var1 < 32768; var1++) {
            this.field375[var1 + 32768] = this.method166(var1);
        }
    }
}
