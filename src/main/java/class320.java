import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class320 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field4981 = 0;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public int field4987 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Z")
    public boolean field4989 = false;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    public static int[] field4985 = new int[128];

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Led;")
    public class296 field4982;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4984;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[[I")
    public static int[][] field4990;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)[Lob;", line = 6)
    public static final class292[] method2188(int arg0) {
        class292[] var1 = new class292[class173.field2566];
        field4986++;
        for (int var2 = arg0; var2 < class173.field2566; var2++) {
            if (class36.field534) {
                var1[var2] = new class186(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], class274.field4162[var2], class57.field843);
            } else {
                var1[var2] = new class70(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], class274.field4162[var2], class57.field843);
            }
        }
        class265.method1835(10);
        return var1;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 36)
    public static void method2189(int arg0) {
        field4990 = (int[][]) null;
        field4985 = null;
        if (arg0 != -1) {
            method2190((String) null, 57, (String) null, (String) null, -52, true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZ)V", line = 76)
    public static final void method2190(String arg0, int arg1, String arg2, String arg3, int arg4, boolean arg5) {
        field4988++;
        int var6 = 99;
        if (arg5) {
            return;
        }
        while (var6 > 0) {
            class112.field1767[var6] = class112.field1767[var6 - 1];
            class324.field5056[var6] = class324.field5056[var6 - 1];
            class21.field233[var6] = class21.field233[var6 - 1];
            class173.field2559[var6] = class173.field2559[var6 - 1];
            class176.field2632[var6] = class176.field2632[var6 - 1];
            var6--;
        }
        class112.field1767[0] = arg4;
        class227.field3517 = class319.field4980;
        class176.field2632[0] = arg1;
        class324.field5056[0] = arg3;
        class21.field233[0] = arg2;
        class112.field1771++;
        class173.field2559[0] = arg0;
    }
}
