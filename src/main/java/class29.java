import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class29 extends class201 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "J")
    private long field490 = 0L;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
    private long field491 = 0L;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private int field494 = 1;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[J")
    private long[] field492 = new long[10];

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "J")
    private long field495 = 0L;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private int field493 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)J")
    private final long method235(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field495;
        this.field495 = var2;
        if (arg0 >= -113) {
            return 101L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field492[this.field493] = var4;
            if (this.field494 < 1) {
                this.field494++;
            }
            this.field493 = (this.field493 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field494; var8++) {
            var6 += this.field492[(this.field493 + 10 - var8) % 10];
        }
        return var6 / (long) this.field494;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)J")
    public final long method236(int arg0) {
        if (arg0 >= -123) {
            this.field492 = null;
        }
        return this.field491;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method237(byte arg0) {
        this.field495 = 0L;
        if (this.field490 > this.field491) {
            this.field491 += this.field490 - this.field491;
        }
        if (arg0 >= -121) {
            this.method237((byte) 25);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class29() {
        this.field490 = this.field491 = jagmisc.nanoTime();
        if (this.field491 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    public final int method238(int arg0, int arg1) {
        this.field491 += this.method235((byte) -120);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 <= 57) {
            this.field494 = 112;
        }
        if (this.field491 < this.field490) {
            class322.method1935(true, (this.field490 - this.field491) / 1000000L);
            this.field495 += this.field490 - this.field491;
            this.field491 += this.field490 - this.field491;
            this.field490 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field490 += var3;
        } while (var5 < 10 && this.field490 < this.field491);
        if (this.field490 < this.field491) {
            this.field490 = this.field491;
        }
        return var5;
    }
}
