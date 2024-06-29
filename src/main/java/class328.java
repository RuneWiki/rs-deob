import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class328 extends class261 {

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "J")
    public long field4981;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Ljava/lang/String;")
    public String field4970;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Ljava/lang/String;")
    public String field4977;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Z")
    public boolean field4978;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
    public boolean field4974;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[I")
    public static int[] field4975 = new int[100];

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILlt;)I")
    public static final int method2074(byte arg0, int arg1, class480 arg2) {
        field4980++;
        if (arg0 <= 70) {
            method2074((byte) -43, 20, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lph;IIZIII)V")
    public static final void method2075(class459 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class138.field2322 = arg0;
        if (arg4 != -1) {
            field4975 = null;
        }
        class224.field3507 = arg1;
        class309.field4690 = arg3;
        field4982++;
        class503.field7350 = arg6;
        class194.field3135 = arg5;
        class491.field7200 = 1;
        class4.field80 = class470.field6983.method655(false) / arg2;
        if (class4.field80 < 1) {
            class4.field80 = 1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method2076(int arg0) {
        field4975 = null;
        if (arg0 != 100) {
            method2076(-95);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class328(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4981 = arg5;
        this.field4972 = arg3;
        this.field4979 = arg7;
        this.field4970 = arg0;
        this.field4977 = arg1;
        this.field4978 = arg8;
        this.field4971 = arg2;
        this.field4976 = arg6;
        this.field4974 = arg9;
        this.field4973 = arg4;
    }
}
