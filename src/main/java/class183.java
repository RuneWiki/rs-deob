import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class183 {

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2332 = "Loaded interfaces";

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field2334 = -1;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field2336 = new Random();

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Ljq;")
    public class183 field2327;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Ljq;")
    public class183 field2333;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Lam;")
    public static class286 field2329;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lam;")
    public static class286 field2331;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method980(byte arg0, String arg1) {
        field2330++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 > -31) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2336 = null;
        field2329 = null;
        field2331 = null;
        if (arg0 == 6546) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public final void method982(byte arg0) {
        field2328++;
        if (this.field2333 == null) {
            return;
        }
        this.field2333.field2327 = this.field2327;
        this.field2327.field2333 = this.field2333;
        this.field2327 = null;
        if (arg0 < 69) {
            method980((byte) -105, (String) null);
        }
        this.field2333 = null;
    }
}
