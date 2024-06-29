import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class460 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lh;")
    public static class434 field6227 = new class434(99, -1);

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lmc;")
    public static class78 field6230 = new class78(4, 8);

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Lh;")
    public static class434 field6231 = new class434(25, 8);

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "Lh;")
    public static class434 field6233 = new class434(72, -2);

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field6234 = 2;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[Lrt;", line = 3)
    public static final class137[] method2700(int arg0) {
        field6232++;
        if (arg0 != 0) {
            method2702(30, (String) null);
        }
        return new class137[] { class208.field2812, class77.field1042, class1.field24 };
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 19)
    public static void method2701(byte arg0) {
        field6231 = null;
        field6227 = null;
        field6233 = null;
        field6230 = null;
        int var1 = 17 % ((5 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 42)
    public static final String method2702(int arg0, String arg1) {
        field6228++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var9 = arg1.charAt(var4);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 74 % ((arg0 - 39) / 54);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var5.append("<lt>");
            } else if (var8 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var8);
            }
        }
        return var5.toString();
    }
}
