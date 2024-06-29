import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class335 {

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public int field4876 = 0;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public int field4873 = 127;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public int field4870 = 512;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public int field4874 = 8;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Z")
    public boolean field4867 = true;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Z")
    public boolean field4880 = false;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public int field4882 = -1;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field4881 = -1;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public int field4883 = 64;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "Z")
    public boolean field4884 = true;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public int field4878 = 1190717;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field4879 = -1;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Lsf;")
    public class397 field4869;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Lrn;")
    public static class603 field4872;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILgk;)V")
    private final void method2054(int arg0, int arg1, class540 arg2) {
        int var4 = 39 % ((arg1 - 29) / 56);
        field4868++;
        if (arg0 == 1) {
            this.field4876 = class338.method2090((byte) -82, arg2.method3154((byte) -105));
        } else if (arg0 == 2) {
            this.field4881 = arg2.method3115(29871);
        } else if (arg0 == 3) {
            this.field4881 = arg2.method3169(26488);
            if (this.field4881 == 65535) {
                this.field4881 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field4867 = false;
        } else if (arg0 == 7) {
            this.field4882 = class338.method2090((byte) -61, arg2.method3154((byte) -67));
            return;
        } else if (arg0 == 8) {
            this.field4869.field6003 = this.field4871;
            return;
        } else if (arg0 == 9) {
            this.field4870 = arg2.method3169(26488) << 2;
            return;
        } else if (arg0 == 10) {
            this.field4884 = false;
            return;
        } else if (arg0 == 11) {
            this.field4874 = arg2.method3115(29871);
            return;
        } else if (arg0 == 12) {
            this.field4880 = true;
            return;
        } else if (arg0 == 13) {
            this.field4878 = arg2.method3154((byte) -63);
            return;
        } else {
            if (arg0 == 14) {
                this.field4883 = arg2.method3115(29871) << 2;
            } else if (arg0 == 16) {
                this.field4873 = arg2.method3115(29871);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public final void method2055(byte arg0) {
        this.field4874 = this.field4874 << 8 | this.field4871;
        if (arg0 != 100) {
            this.method2055((byte) -98);
        }
        field4875++;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
    public static void method2056(byte arg0) {
        int var1 = -93 % ((arg0 - 47) / 53);
        field4872 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLgk;)V")
    public final void method2057(byte arg0, class540 arg1) {
        field4877++;
        if (arg0 > -56) {
            method2056((byte) -126);
        }
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method2054(var3, 117, arg1);
        }
    }
}
