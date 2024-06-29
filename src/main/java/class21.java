import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HZZJZIMV")
public class class21 extends class8 {

    @OriginalMember(owner = "client!HZZJZIMV", name = "g", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!HZZJZIMV", name = "e", descriptor = "LHZZJZIMV;")
    public class21 field767;

    @OriginalMember(owner = "client!HZZJZIMV", name = "f", descriptor = "LHZZJZIMV;")
    public class21 field768;

    @OriginalMember(owner = "client!HZZJZIMV", name = "b", descriptor = "()V")
    public void method213() {
        if (this.field768 != null) {
            this.field768.field767 = this.field767;
            this.field767.field768 = this.field768;
            this.field767 = null;
            this.field768 = null;
        }
    }
}
