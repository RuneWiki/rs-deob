import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class44 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field871;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!bd", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field872++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILqa;)V", line = 21)
    public static final void method425(int arg0, class167 arg1) {
        arg1.method345(0, 0, class50.field927, 350);
        if (arg0 != -19371) {
            method427(-122, -92, 90, false, -100, -29, -30);
        }
        field873++;
        arg1.method215(0, 0, class50.field927, 350, class501.field7241 << 24 | 0x332277, 1);
        int var2 = 350 / class14.field156;
        if (class490.field7070 > 0) {
            int var3 = 346 - class14.field156 - 4;
            int var4 = var2 * var3 / (class490.field7070 + var2 - 1);
            int var5 = 4;
            if (class490.field7070 > 1) {
                var5 += (class490.field7070 - class345.field5085 - 1) * (var3 - var4) / (class490.field7070 - 1);
            }
            arg1.method215(class50.field927 - 16, var5, 12, var4, class501.field7241 << 24 | 0x332277, 2);
            for (int var6 = class345.field5085; (class345.field5085 + var2) > var6 && var6 < class490.field7070; var6++) {
                String[] var7 = class446.method2630(-1, class290.field4298[var6], '\b');
                int var8 = (class50.field927 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method345(var10, 0, var8 + var10 - 8, 350);
                    class406.field5775.method1743(var7[var9], var10, -16777216, 350 - class218.field3334.field1863 - (class431.field6196 - -2) - (-class345.field5085 + var6) * class14.field156, -1, (byte) 109);
                }
            }
        }
        arg1.method345(0, 0, class50.field927, 350);
        arg1.method1191(350 - class431.field6196, -1, arg0 ^ 0x4B55, 0, class50.field927);
        class270.field4072.method1743("--> " + class504.field7294, 10, -16777216, 350 - class425.field6028.field1863 - 1, -1, (byte) -16);
        int var11 = -1;
        if (class24.field349 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method1199(350 - class425.field6028.field1863 - 11, var11, class425.field6028.method875("--> " + class504.field7294.substring(0, class528.field7712), (byte) 5) + 10, 17136, 12);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Ljava/lang/String;", line = 124)
    public final String method426(int arg0, int arg1) {
        field874++;
        if (arg1 < 36) {
            this.field871 = null;
        }
        return this.field871[arg0];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZIII)V", line = 145)
    public static final void method427(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class520.field7591 = arg0;
        if (arg4 != -1) {
            return;
        }
        class530.field7811 = arg1;
        class19.field208 = arg2;
        field870++;
        class306.field4542 = arg5;
        class370.field5338 = arg6;
        if (arg3 && class19.field208 >= 100) {
            class315.field4688 = class530.field7811 * 128 + 64;
            class397.field5649 = class370.field5338 * 128 + 64;
            class62.field1086 = class224.method1515(class315.field4688, class397.field5649, class123.field1944, -631749433) - class306.field4542;
        }
        class294.field4381 = 2;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 199)
    public class44(String arg0, String arg1, String arg2, String arg3) {
        this.field871 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
