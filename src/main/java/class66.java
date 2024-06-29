import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends InputStream {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
    private int[] field1582 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[B")
    private byte[] field1583 = new byte[65536];

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
    private int[] field1584 = new int[256];

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
    public boolean field1581;

    @OriginalMember(owner = "client!l", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        byte[] var1 = new byte[1];
        this.read(var1, 0, 1);
        return var1[0];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([B[I[BIII)V", line = 13)
    private static final void method519(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg5; var6++) {
            arg2[arg4++] = arg0[(arg1[var6] >> 8) + 32768];
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)B", line = 26)
    private final byte method520(int arg0) {
        int var2 = arg0 >> 8 & 0x80;
        if (var2 != 0) {
            arg0 = -arg0;
        }
        if (arg0 > 32635) {
            arg0 = 32635;
        }
        arg0 += 132;
        int var3 = this.field1582[arg0 >> 7 & 0xFF];
        int var4 = arg0 >> var3 + 3 & 0xF;
        return (byte) ~(var2 | var3 << 4 | var4);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 84)
    public class66() {
        for (int var1 = -32768; var1 < 32768; var1++) {
            this.field1583[var1 + 32768] = this.method520(var1);
        }
    }

    @OriginalMember(owner = "client!l", name = "read", descriptor = "([BII)I", line = 45)
    public final synchronized int read(byte[] arg0, int arg1, int arg2) {
        try {
            if (this.field1581) {
                return -1;
            } else if (arg2 > 256) {
                this.read(arg0, arg1, 256);
                this.read(arg0, arg1 + 256, arg2 - 256);
                return arg2;
            } else {
                class100.method802(this.field1584, arg2);
                for (int var4 = 0; var4 < arg2; var4++) {
                    int var5 = this.field1584[var4];
                    if ((var5 + 8388608 & 0xFF000000) != 0) {
                        this.field1584[var4] = var5 >> 31 ^ 0x7FFFFF;
                    }
                }
                method519(this.field1583, this.field1584, arg0, 0, arg1, arg2);
                return arg2;
            }
        } catch (Exception var7) {
            this.field1581 = true;
            class118.method932(var7, null, 1);
            return -1;
        }
    }
}
