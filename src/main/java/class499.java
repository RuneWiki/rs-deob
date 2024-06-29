import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class499 extends class401 {

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "J")
    public long field6787;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
    public boolean field6784;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
    public boolean field6776;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field6775;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/lang/String;")
    public String field6786;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field6780;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/lang/String;")
    public String field6778;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lla;")
    public static class417 field6781;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
    public static boolean field6777;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 7)
    public static void method2798(int arg0) {
        if (arg0 <= 124) {
            field6777 = false;
        }
        field6781 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method2799(int arg0, int arg1, int arg2) {
        field6785++;
        if (arg1 != 29429) {
            field6781 = null;
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 37)
    public class499(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field6783 = arg7;
        this.field6787 = arg5;
        this.field6784 = arg9;
        this.field6776 = arg8;
        this.field6779 = arg4;
        this.field6775 = arg6;
        this.field6786 = arg1;
        this.field6780 = arg3;
        this.field6778 = arg0;
        this.field6782 = arg2;
    }
}
