import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class324 extends class214 {

    @OriginalMember(owner = "client!qja", name = "G", descriptor = "B")
    public byte field4864 = 5;

    @OriginalMember(owner = "client!qja", name = "t", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!qja", name = "v", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!qja", name = "w", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!qja", name = "x", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!qja", name = "A", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!qja", name = "B", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!qja", name = "C", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!qja", name = "D", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!qja", name = "F", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!qja", name = "u", descriptor = "Lnba;")
    public static class312 field4852;

    @OriginalMember(owner = "client!qja", name = "E", descriptor = "Lrc;")
    public static class562 field4862;

    @OriginalMember(owner = "client!qja", name = "y", descriptor = "Z")
    public boolean field4856;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(BI)Lra;", line = 8)
    public static final class118 method2106(byte arg0, int arg1) {
        if (arg0 != 58) {
            field4862 = null;
        }
        field4859++;
        return arg1 >= 0 && arg1 < 100 ? class222.field3188[arg1] : null;
    }

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(B)V", line = 23)
    public static void method2107(byte arg0) {
        field4862 = null;
        field4852 = null;
        if (arg0 != 5) {
            method2107((byte) 112);
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIBI)V", line = 52)
    public static final void method2108(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class285.field4372 = arg0;
        class450.field6463 = arg1;
        field4863++;
        if (arg3 < -14) {
            class414.field5846 = arg4;
            class738.field10297 = arg2;
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZII)Z", line = 70)
    public static final boolean method2109(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            field4851++;
            return false;
        }
    }
}
