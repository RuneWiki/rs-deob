import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class126 extends class204 {

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "[B")
    public byte[] field2018;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
    public boolean field2016;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lpm;)Lhh;")
    public final class126 method867(class7 arg0) {
        this.field2018 = arg0.method67(104, this.field2018);
        this.field2019 = arg0.method76(0, this.field2019);
        if (this.field2017 == this.field2015) {
            this.field2017 = this.field2015 = arg0.method74(this.field2017, (byte) -103);
        } else {
            this.field2017 = arg0.method74(this.field2017, (byte) -103);
            this.field2015 = arg0.method74(this.field2015, (byte) -103);
            if (this.field2017 == this.field2015) {
                this.field2017--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BII)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2019 = arg0;
        this.field2018 = arg1;
        this.field2017 = arg2;
        this.field2015 = arg3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class126(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2019 = arg0;
        this.field2018 = arg1;
        this.field2017 = arg2;
        this.field2015 = arg3;
        this.field2016 = arg4;
    }
}
