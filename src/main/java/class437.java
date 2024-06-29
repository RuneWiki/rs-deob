import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class437 extends IOException {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Lwo;")
    public static class690 field6251 = new class690(51, 5);

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Ljk;")
    public static class585 field6253 = new class585(77, -1);

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 5)
    public static final String method2613(byte arg0, long arg1) {
        field6254++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 > -99) {
                field6251 = null;
            }
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class566.field8281[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 44)
    public class437(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V", line = 52)
    public static void method2614(boolean arg0) {
        if (arg0) {
            field6253 = null;
            field6251 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lun;B)Ldga;", line = 66)
    public static final class189 method2615(class389 arg0, byte arg1) {
        if (arg1 != -96) {
            field6253 = null;
        }
        field6252++;
        class189 var2 = new class189();
        var2.field2311 = arg0.method2260(-84);
        var2.field2302 = class188.field2292.method1869(var2.field2311, arg1 ^ 0x27);
        return var2;
    }
}
