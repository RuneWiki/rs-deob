import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class431 extends class140 {

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
    public boolean field5897 = false;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
    public boolean field5895 = false;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field5892;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field5893;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field5894;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lmu;")
    public static class195 field5896 = new class195(0, 0);

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Ljp;")
    public static class236 field5899 = new class236(20);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method2487(int arg0, byte arg1) {
        if (arg1 != 59) {
            method2488(38);
        }
        field5898++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 20)
    public static void method2488(int arg0) {
        field5899 = null;
        field5896 = null;
        int var1 = 109 / ((-arg0 - 62) / 59);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIZZ)V", line = 42)
    public class431(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5892 = arg0;
        this.field5893 = arg2;
        this.field5895 = arg4;
        this.field5897 = arg3;
        this.field5894 = arg1;
    }
}
