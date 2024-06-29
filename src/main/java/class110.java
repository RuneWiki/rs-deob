import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 extends InputStream {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[B")
    private byte[] field2651 = new byte[65536];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    private int[] field2652 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    private int[] field2654 = new int[256];

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
    public boolean field2653;

    @OriginalMember(owner = "client!sa", name = "read", descriptor = "()I", line = 4)
    public final int read() {
        byte[] var1 = new byte[1];
        this.read(var1, 0, 1);
        return var1[0];
    }

    @OriginalMember(owner = "client!sa", name = "read", descriptor = "([BII)I", line = 13)
    public final synchronized int read(byte[] arg0, int arg1, int arg2) {
        try {
            if (this.field2653) {
                return -1;
            } else if (arg2 > 256) {
                this.read(arg0, arg1, 256);
                this.read(arg0, arg1 + 256, arg2 - 256);
                return arg2;
            } else {
                class19.method183(this.field2654, arg2);
                for (int var4 = 0; var4 < arg2; var4++) {
                    int var5 = this.field2654[var4];
                    if ((var5 + 8388608 & 0xFF000000) != 0) {
                        this.field2654[var4] = var5 >> 31 ^ 0x7FFFFF;
                    }
                }
                method929(this.field2651, this.field2654, arg0, 0, arg1, arg2);
                return arg2;
            }
        } catch (Exception var7) {
            this.field2653 = true;
            class78.method675(var7, 64, null);
            return -1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 84)
    public class110() {
        for (int var1 = -32768; var1 < 32768; var1++) {
            this.field2651[var1 + 32768] = this.method930(var1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([B[I[BIII)V", line = 57)
    private static final void method929(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg5; var6++) {
            arg2[arg4++] = arg0[(arg1[var6] >> 8) + 32768];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)B", line = 70)
    private final byte method930(int arg0) {
        int var2 = arg0 >> 8 & 0x80;
        if (var2 != 0) {
            arg0 = -arg0;
        }
        if (arg0 > 32635) {
            arg0 = 32635;
        }
        arg0 += 132;
        int var3 = this.field2652[arg0 >> 7 & 0xFF];
        int var4 = arg0 >> var3 + 3 & 0xF;
        return (byte) ~(var2 | var3 << 4 | var4);
    }
}
