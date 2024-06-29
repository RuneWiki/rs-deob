import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class54 extends class5 {

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "J")
    public long field758;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Ljava/lang/String;")
    public String field752;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "Ljava/lang/String;")
    public String field763;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Z")
    public boolean field759;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Z")
    public boolean field755;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Lla;")
    public static class319 field757 = new class319(16, 5);

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(CII)I")
    public static final int method395(char arg0, int arg1, int arg2) {
        if (arg2 != 11560) {
            field756 = -102;
        }
        field761++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static void method396(int arg0) {
        field757 = null;
        if (arg0 <= 110) {
            field756 = 11;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class54(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field758 = arg5;
        this.field752 = arg1;
        this.field763 = arg0;
        this.field754 = arg7;
        this.field762 = arg6;
        this.field759 = arg8;
        this.field755 = arg9;
        this.field764 = arg3;
        this.field753 = arg4;
        this.field760 = arg2;
    }
}
