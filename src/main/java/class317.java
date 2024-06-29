import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class317 extends class634 {

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "J")
    public long field4383;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I", line = 6)
    public final int method333(int arg0) {
        if (arg0 != 25632) {
            this.field4381 = -72;
        }
        return this.field4384;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I", line = 17)
    public final int method332(byte arg0) {
        if (arg0 < 2) {
            this.method333(-12);
        }
        return this.field4381;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I", line = 28)
    public final int method334(boolean arg0) {
        if (!arg0) {
            this.field4383 = 108L;
        }
        return this.field4382;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I", line = 39)
    public final int method338(int arg0) {
        if (arg0 != -9993) {
            this.method338(92);
        }
        return this.field4385;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)J", line = 51)
    public final long method335(int arg0) {
        if (arg0 != 19807) {
            this.method332((byte) -10);
        }
        return this.field4383;
    }
}
