import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class378 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[I")
    public int[] field5384 = new int[100];

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[I")
    public int[] field5390 = new int[3];

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "[Lcp;")
    public class430[] field5392 = new class430[100];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[Lpm;")
    public class347[] field5391 = new class347[8];

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Lre;")
    public static class357 field5393 = new class357();

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Z")
    public static boolean field5394 = false;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field5386;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field5389;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 10)
    public static void method2468(int arg0) {
        if (arg0 == 2) {
            field5393 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 22)
    public static final String method2469(long arg0, int arg1) {
        class97.field1435.setTime(new Date(arg0));
        field5388++;
        int var3 = class97.field1435.get(7);
        int var4 = class97.field1435.get(5);
        int var5 = class97.field1435.get(2);
        int var6 = class97.field1435.get(1);
        if (arg1 != 10) {
            field5394 = false;
        }
        int var7 = class97.field1435.get(11);
        int var8 = class97.field1435.get(12);
        int var9 = class97.field1435.get(13);
        return class156.field2214[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class199.field2747[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 48)
    public static final void method2470(byte arg0) {
        field5387++;
        if (arg0 < -124 && class351.field4889 != 3) {
            class393.field5755 = -1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 63)
    public static final void method2471(int arg0) {
        field5385++;
        if (!class309.field4235) {
            return;
        }
        class383 var1 = class315.method2010(class339.field4745, class236.field3214, -27590);
        if (var1 != null && var1.field5531 != null) {
            class410 var2 = new class410();
            var2.field5961 = var1.field5531;
            var2.field5946 = var1;
            class111.method738(var2);
        }
        class247.field3422 = -1;
        if (arg0 <= 29) {
            method2468(-99);
        }
        class309.field4235 = false;
        class86.method596(14459, var1);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 95)
    public static final String method2472(String arg0, byte arg1) {
        field5383++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != 106) {
            method2470((byte) -27);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
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
}
