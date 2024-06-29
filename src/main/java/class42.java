import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 {

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "[[I")
    public static int[][] field759 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Lmq;")
    public static class472 field760 = new class472(128, 4);

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lpn;I)Z", line = 4)
    public static final boolean method461(class691 arg0, int arg1) {
        field758++;
        class232 var2 = class37.field703.method807(0, arg0.method1072(4378));
        if (var2.field3080 == -1) {
            return true;
        }
        class244 var3 = class308.field4085.method565(71, var2.field3080);
        if (arg1 >= -35) {
            field762 = 32;
        }
        return var3.field3340 == -1 ? true : var3.method1479(-28084);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 28)
    public static final String method462(String arg0, int arg1) {
        field761++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg1 != 1) {
            field762 = -98;
        }
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
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

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 80)
    public static void method463(boolean arg0) {
        field760 = null;
        if (!arg0) {
            field759 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZBLr;I)Lla;", line = 96)
    public static final class419 method464(boolean arg0, byte arg1, class165 arg2, int arg3) {
        field757++;
        class431 var4 = class15.method171(17775, arg2, arg3, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 <= 66) {
                field760 = null;
            }
            return var4.field6188;
        }
    }
}
