import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class752 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Z")
    public boolean field10445 = true;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field10450 = 0;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
    public static int[] field10447 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!np", name = "i", descriptor = "C")
    private char field10452;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public int field10448;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Ljava/lang/String;")
    public String field10449;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 10)
    public static void method4167(boolean arg0) {
        field10447 = null;
        if (arg0) {
            field10444 = 51;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lvj;B)V", line = 21)
    public final void method4168(class26 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                field10446++;
                if (arg1 > -74) {
                    this.method4169(12);
                    return;
                }
                return;
            }
            this.method4170((byte) -120, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z", line = 46)
    public final boolean method4169(int arg0) {
        if (arg0 <= 32) {
            field10447 = null;
        }
        field10453++;
        return this.field10452 == 's';
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLvj;I)V", line = 68)
    private final void method4170(byte arg0, class26 arg1, int arg2) {
        if (arg0 != -120) {
            return;
        }
        if (arg2 == 1) {
            this.field10452 = class503.method3005(true, arg1.method195(arg0 ^ 0xFFFFFF08));
        } else if (arg2 == 2) {
            this.field10448 = arg1.method189(255);
        } else if (arg2 == 4) {
            this.field10445 = false;
        } else if (arg2 == 5) {
            this.field10449 = arg1.method196((byte) -92);
        }
        field10451++;
    }
}
