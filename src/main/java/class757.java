import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class757 extends class371 implements class204 {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    private int field10507;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field10503 = -1;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
    public static boolean field10501 = true;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ldia;I[BI)V", line = 3)
    public class757(class246 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field10507 = arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I", line = 11)
    public final int method1374(byte arg0) {
        if (arg0 > -41) {
            field10503 = -43;
        }
        ++field10502;
        return this.field10507;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLor;I)Ljava/lang/String;", line = 25)
    public static final String method4213(boolean arg0, class668 arg1, int arg2) {
        ++field10504;
        if (!client.method2022(arg1).method842(19061, arg2) && arg1.field9250 == null) {
            return null;
        } else {
            if (!arg0) {
                field10503 = 44;
            }
            if (arg1.field9256 != null && arg2 < arg1.field9256.length && arg1.field9256[arg2] != null && arg1.field9256[arg2].trim().length() != 0) {
                return arg1.field9256[arg2];
            } else {
                return class688.field9683 ? "Hidden-" + arg2 : null;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI[B)V", line = 51)
    public final void method1373(int arg0, boolean arg1, int arg2, byte[] arg3) {
        ++field10509;
        this.method2304(arg3, arg0);
        if (!arg1) {
            this.method1376(false);
        }
        this.field10507 = arg2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)J", line = 63)
    public final long method1375(int arg0) {
        ++field10505;
        if (arg0 != 23163) {
            this.method1375(10);
        }
        return super.field5374.getAddress();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I", line = 76)
    public final int method1376(boolean arg0) {
        if (arg0) {
            method4213(false, (class668) null, -101);
        }
        ++field10508;
        return 0;
    }
}
