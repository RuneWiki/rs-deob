import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class537 extends class159 {

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
    public static int[] field7440 = new int[2048];

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field7446 = -2;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Z")
    public static boolean field7441 = false;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "Lef;")
    public static class513 field7443;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/io/File;II)[B", line = 5)
    public static final byte[] method3116(File arg0, int arg1, int arg2) {
        field7445++;
        try {
            byte[] var3 = new byte[arg1];
            class589.method3312(arg2 ^ arg2, var3, arg0, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V", line = 23)
    public class537(int arg0, int arg1) {
        this.field7439 = arg0;
        this.field7444 = arg1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method3117(int arg0, int arg1, int arg2, int arg3) {
        field7442++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class159.method1103(false, true, (byte) 115, var4);
        if (arg2 != -15913) {
            method3118(false);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 57)
    public static void method3118(boolean arg0) {
        field7440 = null;
        field7443 = null;
        if (!arg0) {
            field7440 = null;
        }
    }
}
