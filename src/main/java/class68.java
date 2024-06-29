import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 extends InputStream {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[B")
    private byte[] field1700 = new byte[65536];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    private int[] field1698 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    private int[] field1701 = new int[256];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
    public boolean field1699;

    @OriginalMember(owner = "client!lb", name = "read", descriptor = "()I", line = 5)
    public final int read() {
        byte[] var1 = new byte[1];
        this.read(var1, 0, 1);
        return var1[0];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[I[BIII)V", line = 14)
    private static final void method648(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg5; var6++) {
            arg2[arg4++] = arg0[(arg1[var6] >> 8) + 32768];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)B", line = 28)
    private final byte method649(int arg0) {
        int var2 = arg0 >> 8 & 0x80;
        if (var2 != 0) {
            arg0 = -arg0;
        }
        if (arg0 > 32635) {
            arg0 = 32635;
        }
        arg0 += 132;
        int var3 = this.field1698[arg0 >> 7 & 0xFF];
        int var4 = arg0 >> var3 + 3 & 0xF;
        return (byte) ~(var2 | var3 << 4 | var4);
    }

    @OriginalMember(owner = "client!lb", name = "read", descriptor = "([BII)I", line = 42)
    public final synchronized int read(byte[] arg0, int arg1, int arg2) {
        try {
            if (this.field1699) {
                return -1;
            } else if (arg2 > 256) {
                this.read(arg0, arg1, 256);
                this.read(arg0, arg1 + 256, arg2 - 256);
                return arg2;
            } else {
                class14.method259(this.field1701, arg2);
                for (int var4 = 0; var4 < arg2; var4++) {
                    int var5 = this.field1701[var4];
                    if ((var5 + 8388608 & 0xFF000000) != 0) {
                        this.field1701[var4] = var5 >> 31 ^ 0x7FFFFF;
                    }
                }
                method648(this.field1700, this.field1701, arg0, 0, arg1, arg2);
                return arg2;
            }
        } catch (Exception var7) {
            this.field1699 = true;
            class11.method215(null, (byte) -125, var7);
            return -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 84)
    public class68() {
        for (int var1 = -32768; var1 < 32768; var1++) {
            this.field1700[var1 + 32768] = this.method649(var1);
        }
    }
}
