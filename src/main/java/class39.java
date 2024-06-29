import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 extends class133 {

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[B")
    public byte[] field492;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Z")
    public boolean field491;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lai;)Luc;")
    public final class39 method260(class90 arg0) {
        this.field492 = arg0.method583(this.field492, (byte) 124);
        this.field489 = arg0.method582(this.field489, 114);
        if (this.field493 == this.field490) {
            this.field490 = this.field493 = arg0.method580(721512226, this.field490);
        } else {
            this.field490 = arg0.method580(721512226, this.field490);
            this.field493 = arg0.method580(721512226, this.field493);
            if (this.field493 == this.field490) {
                this.field490--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[BII)V")
    public class39(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field489 = arg0;
        this.field492 = arg1;
        this.field490 = arg2;
        this.field493 = arg3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class39(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field489 = arg0;
        this.field492 = arg1;
        this.field490 = arg2;
        this.field493 = arg3;
        this.field491 = arg4;
    }
}
