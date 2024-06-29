import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class class445 extends class209 {

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Z")
    public boolean field5598 = false;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "S")
    public short field5597;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public int field5590;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public int field5591;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lws;")
    public static class333 field5595 = new class333();

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V", line = 6)
    public static void method2439(int arg0) {
        field5595 = null;
        if (arg0 != 0) {
            field5595 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(CLjava/lang/String;I)I", line = 21)
    public static final int method2440(char arg0, String arg1, int arg2) {
        field5592++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = arg2; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 48)
    public static final String method2441(String arg0, String arg1, int arg2, String arg3) {
        field5594++;
        if (arg2 != -1) {
            method2439(-31);
        }
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, var4 + arg3.length())) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIZZ)V", line = 74)
    public class445(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field5596 = arg0;
        this.field5597 = (short) arg3;
        this.field5590 = arg1;
        this.field5598 = arg5;
        this.field5591 = arg2;
    }
}
