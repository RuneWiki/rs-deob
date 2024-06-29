import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class144 extends class176 {

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "[B")
    public byte[] field2013;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "Z")
    public boolean field2011;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lfm;)Lcu;", line = 6)
    public final class144 method884(class81 arg0) {
        this.field2013 = arg0.method560(this.field2013, 0);
        this.field2012 = arg0.method558(320, this.field2012);
        if (this.field2015 == this.field2014) {
            this.field2014 = this.field2015 = arg0.method557(31183, this.field2014);
        } else {
            this.field2014 = arg0.method557(31183, this.field2014);
            this.field2015 = arg0.method557(31183, this.field2015);
            if (this.field2015 == this.field2014) {
                this.field2014--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class144(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2012 = arg0;
        this.field2013 = arg1;
        this.field2014 = arg2;
        this.field2015 = arg3;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class144(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2012 = arg0;
        this.field2013 = arg1;
        this.field2014 = arg2;
        this.field2015 = arg3;
        this.field2011 = arg4;
    }
}
