import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class235 extends class43 {

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3791;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "[B")
    private byte[] field3792;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 5)
    public final void method143(int arg0, int arg1) {
        class264.method1715();
        if (this.field3792 == null) {
            this.field3792 = new byte[this.field1347 * this.field1345 * 4];
            this.field3791 = ByteBuffer.wrap(this.field3792);
        }
        int var3 = 0;
        for (int var4 = this.field1345 - 1; var4 >= 0; var4--) {
            int var5 = this.field1347 * var4;
            for (int var6 = 0; var6 < this.field1347; var6++) {
                int var7 = this.field652[var5++];
                if (var7 == 0) {
                    this.field3792[var3++] = 0;
                    this.field3792[var3++] = 0;
                    this.field3792[var3++] = 0;
                    this.field3792[var3++] = 0;
                } else {
                    this.field3792[var3++] = (byte) (var7 >> 16);
                    this.field3792[var3++] = (byte) (var7 >> 8);
                    this.field3792[var3++] = (byte) var7;
                    this.field3792[var3++] = -1;
                }
            }
        }
        GL var8 = class264.field4313;
        var8.glRasterPos2i(this.field1340 + arg0, class264.field4290 - (this.field1334 + arg1) - this.field1345);
        var8.glDrawPixels(this.field1347, this.field1345, 6408, 5121, this.field3791);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)V", line = 55)
    public final void method139(int arg0, int arg1) {
        this.method143(arg0, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(II)V", line = 59)
    public class235(int arg0, int arg1) {
        super(arg0, arg1);
    }
}
