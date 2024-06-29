import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class486 extends class75 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "J")
    private long field6864 = 0L;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "J")
    private long field6865 = 0L;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    private int field6867 = 0;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "J")
    private long field6868 = 0L;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[J")
    private long[] field6869 = new long[10];

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    private int field6866 = 1;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J", line = 3)
    private final long method2789(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6868;
        this.field6868 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6869[this.field6867] = var4;
            this.field6867 = (this.field6867 + 1) % 10;
            if (this.field6866 < 1) {
                this.field6866++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6866; var8++) {
            var6 += this.field6869[(this.field6867 - (var8 - 10)) % 10];
        }
        if (arg0 <= 58) {
            this.field6864 = -65L;
        }
        return var6 / (long) this.field6866;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZJ)I", line = 37)
    public final int method716(boolean arg0, long arg1) {
        if (!arg0) {
            return 13;
        } else if (this.field6865 > this.field6864) {
            this.field6868 += this.field6865 - this.field6864;
            this.field6864 += this.field6865 - this.field6864;
            this.field6865 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field6865 += arg1;
            } while (var4 < 10 && this.field6864 > this.field6865);
            if (this.field6864 > this.field6865) {
                this.field6865 = this.field6864;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 69)
    public final void method720(boolean arg0) {
        if (arg0) {
            this.field6868 = 0L;
            if (this.field6864 < this.field6865) {
                this.field6864 += this.field6865 - this.field6864;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)J", line = 83)
    public final long method721(int arg0) {
        if (arg0 != 2259880) {
            this.field6869 = null;
        }
        return this.field6864;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 117)
    public class486() {
        this.field6865 = this.field6864 = jagmisc.nanoTime();
        if (this.field6864 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)J", line = 101)
    public final long method722(int arg0) {
        this.field6864 += this.method2789((byte) 98);
        if (this.field6865 > this.field6864) {
            return (this.field6865 - this.field6864) / 1000000L;
        } else {
            if (arg0 <= 7) {
                this.field6867 = -6;
            }
            return 0L;
        }
    }
}
