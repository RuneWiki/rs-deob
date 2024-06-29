import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class230 {

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "B")
    public byte field3170;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Ljq;")
    public class230 field3166;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3162 = "Connected to update server";

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "[S")
    public static short[] field3155;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZI)V")
    public static final void method1494(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            return;
        }
        if (class227.field3128 != 0 && arg2 != 0 && class236.field3301 < 50 && arg1 != -1) {
            class195.field2704[class236.field3301] = arg1;
            class388.field5674[class236.field3301] = arg2;
            class329.field4850[class236.field3301] = arg4;
            class337.field4985[class236.field3301] = null;
            class163.field2224[class236.field3301] = 0;
            class129.field1683[class236.field3301] = arg0;
            class236.field3301++;
        }
        field3164++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method1495(int arg0) {
        field3155 = null;
        field3162 = null;
        if (arg0 <= 12) {
            method1494(111, 75, -21, false, 97);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIB)V")
    public class230(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3159 = arg3;
        this.field3170 = arg4;
        this.field3165 = arg2;
        this.field3154 = arg1;
        this.field3172 = arg0;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljq;I)V")
    public class230(class230 arg0, int arg1) {
        this.field3166 = arg0;
        this.field3165 = this.field3166.field3165 + arg1;
        this.field3170 = this.field3166.field3170;
        this.field3159 = this.field3166.field3159 + arg1;
        this.field3154 = this.field3166.field3154 + arg1;
        this.field3172 = this.field3166.field3172;
    }
}
