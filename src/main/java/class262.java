import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class262 {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    public static int[] field4051 = new int[32];

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4055 = "Loading world list data";

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[Lrg;")
    public static class70[] field4049 = new class70[29];

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Ljf;")
    public static class227 field4050 = new class227(512);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILum;)V", line = 10)
    public static final void method1741(int arg0, class82 arg1) {
        if (arg0 > -44) {
            field4050 = (class227) null;
        }
        class229 var2 = (class229) class175.field2681.method1558(class108.method723(arg1.field1218, -28), false);
        field4047++;
        if (var2 == null) {
            return;
        }
        if (var2.field3690 != null) {
            class74.field1102.method221(var2.field3690);
            var2.field3690 = null;
        }
        var2.method1284(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 49)
    public static final boolean method1742(String arg0, String arg1, byte arg2) {
        int var3 = arg1.length();
        field4046++;
        int var4 = arg0.length();
        int var5 = -14 % ((11 - arg2) / 63);
        if (var4 > var3) {
            return false;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg1.charAt(var6);
            char var8 = arg0.charAt(var6);
            if (var7 != var8 && Character.toLowerCase(var7) != Character.toLowerCase(var8) && Character.toUpperCase(var7) != Character.toUpperCase(var8)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 88)
    public static final void method1743(byte arg0) {
        class89.field1362.method443(127);
        class278.field4286 = 1;
        int var1 = -74 % ((arg0 - 8) / 41);
        field4052++;
        class85.field1289 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 102)
    public static void method1744(byte arg0) {
        if (arg0 != 26) {
            method1743((byte) -46);
        }
        field4051 = null;
        field4055 = null;
        field4050 = null;
        field4049 = null;
    }
}
