import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class360 {

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public int field5707 = class111.method1032(true);

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Ljava/lang/String;")
    public String field5703;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Ljava/lang/String;")
    public String field5706;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public int field5708;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/lang/String;")
    public String field5705;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Ljava/lang/String;")
    public String field5702;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Ljava/lang/String;")
    public String field5709;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field5710;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "[F")
    public static float[] field5714 = new float[4];

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Ldw;")
    public static class668 field5701;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method2407(int arg0, int arg1, int arg2) {
        if (arg0 < 126) {
            method2409(-54);
        }
        field5713++;
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 26)
    public final void method2408(String arg0, int arg1, String arg2, int arg3, String arg4, String arg5, int arg6, int arg7, String arg8) {
        this.field5707 = class111.method1032(true);
        if (arg6 < 109) {
            this.field5709 = null;
        }
        field5712++;
        this.field5710 = arg7;
        this.field5705 = arg8;
        this.field5704 = arg3;
        this.field5702 = arg2;
        this.field5709 = arg5;
        this.field5708 = class562.field8084;
        this.field5711 = arg1;
        this.field5706 = arg0;
        this.field5703 = arg4;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 52)
    public static void method2409(int arg0) {
        field5714 = null;
        field5701 = null;
        if (arg0 != 1408) {
            field5701 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 62)
    public class360(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5703 = arg2;
        this.field5706 = arg5;
        this.field5708 = class562.field8084;
        this.field5704 = arg6;
        this.field5711 = arg1;
        this.field5705 = arg4;
        this.field5702 = arg3;
        this.field5709 = arg7;
        this.field5710 = arg0;
    }
}
