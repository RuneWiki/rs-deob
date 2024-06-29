import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 extends class656 {

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    private int field842 = 0;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lcb;")
    public static class544 field839;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
    public final void method374(boolean arg0, byte arg1) {
        ++field840;
        if (arg1 != -105) {
            field839 = null;
        }
        int var3 = super.field9254.field5542.method2164(class785.field10790, 0, super.field9246.method781()) + super.field9254.field5546;
        int var4 = super.field9254.field5540.method1378((byte) 91, class264.field3734, super.field9246.method792()) + super.field9254.field5544;
        super.field9246.method799((float) (var3 + super.field9246.method781() / 2), (float) (var4 + super.field9246.method792() / 2), 4096, this.field842);
        this.field842 += ((class555) super.field9254).field7900;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
    public static final int method375(int arg0, int arg1, int arg2) {
        if (~arg0 < ~arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        ++field843;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg1 != 60 ? 33 : arg2;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lcb;Lde;)V")
    public class62(class544 arg0, class555 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static void method376(byte arg0) {
        field839 = null;
        if (arg0 < 58) {
            field839 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method377(int arg0, String arg1) {
        ++field841;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg0 != 32732) {
            return null;
        } else {
            for (int var6 = 0; ~var2 < ~var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (var7 != '<') {
                    if (var7 == '>') {
                        var5.append("<gt>");
                    } else {
                        var5.append(var7);
                    }
                } else {
                    var5.append("<lt>");
                }
            }
            return var5.toString();
        }
    }
}
