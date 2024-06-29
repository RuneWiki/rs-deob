import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class696 {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field9640 = 765;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field9643 = 1;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field9641;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[B)[B")
    public final byte[] method3846(int arg0, byte[] arg1) {
        field9645++;
        class572 var3 = new class572(arg1);
        var3.field7313 = arg1.length - 4;
        int var4 = var3.method3070(-24973);
        byte[] var5 = new byte[var4];
        var3.field7313 = arg0;
        this.method3849(var3, var5, (byte) -29);
        return var5;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class696() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V")
    public static final void method3847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -20721) {
            method3850(null, (byte) 121);
        }
        for (int var6 = arg0; var6 <= arg4; var6++) {
            class390.method2223(arg2, arg3, class30.field364[var6], (byte) -68, arg5);
        }
        field9639++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwv;II)V")
    public static final void method3848(class32 arg0, int arg1, int arg2) {
        field9646++;
        if (arg2 != 0) {
            field9642 = -125;
        }
        if (arg0.field448 == null) {
            return;
        }
        int var3 = arg0.field448[arg1 + 1];
        if (arg0.field447 == var3) {
            return;
        }
        arg0.field478 = 0;
        arg0.field407 = 0;
        arg0.field466 = 1;
        arg0.field447 = var3;
        arg0.field489 = 0;
        arg0.field506 = arg0.field503;
        if (arg0.field447 != -1) {
            class526.method2841(arg2 ^ 0xEDC9D4A9, arg0.field8010, class11.field110.method1141(arg0.field447, (byte) -86), class67.field815 == arg0, arg0.field8018, arg0.field478, arg0.field8011);
            return;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lji;[BB)V")
    public final void method3849(class572 arg0, byte[] arg1, byte arg2) {
        field9647++;
        if (arg0.field7318[arg0.field7313] != 31 || arg0.field7318[arg0.field7313 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field9641 == null) {
            this.field9641 = new Inflater(true);
        }
        try {
            if (arg2 != -29) {
                field9642 = 68;
            }
            this.field9641.setInput(arg0.field7318, arg0.field7313 + 10, -8 - (arg0.field7313 - -10) + arg0.field7318.length);
            this.field9641.inflate(arg1);
        } catch (Exception var4) {
            this.field9641.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field9641.reset();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3850(String arg0, byte arg1) {
        class122.field1487 = arg0;
        field9648++;
        if (class95.field1241 == null) {
            return;
        }
        if (arg1 != 85) {
            field9642 = 47;
        }
        try {
            String var2 = class95.field1241.getParameter("cookieprefix");
            String var3 = class95.field1241.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class424.method2342(class321.method1854(arg1 - 137) + 94608000000L, 21130) + "; Max-Age=" + 94608000L;
            }
            class104.method742(class95.field1241, (byte) -102, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(III)V")
    private class696(int arg0, int arg1, int arg2) {
    }
}
