import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class242 extends class598 {

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "[B")
    public byte[] field2851;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "Z")
    public boolean field2854;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lwp;)Laia;")
    public final class242 method1462(class193 arg0) {
        this.field2851 = arg0.method1263(5871, this.field2851);
        this.field2852 = arg0.method1261(-15630, this.field2852);
        if (this.field2853 == this.field2850) {
            this.field2853 = this.field2850 = arg0.method1259(false, this.field2853);
        } else {
            this.field2853 = arg0.method1259(false, this.field2853);
            this.field2850 = arg0.method1259(false, this.field2850);
            if (this.field2853 == this.field2850) {
                this.field2853--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I[BII)V")
    public class242(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2852 = arg0;
        this.field2851 = arg1;
        this.field2853 = arg2;
        this.field2850 = arg3;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I[BIIZ)V")
    public class242(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2852 = arg0;
        this.field2851 = arg1;
        this.field2853 = arg2;
        this.field2850 = arg3;
        this.field2854 = arg4;
    }
}
