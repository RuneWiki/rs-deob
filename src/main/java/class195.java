import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class195 extends RuntimeException {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3162;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/lang/String;")
    public String field3159;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lgi;")
    public static class164 field3157;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljh;")
    public static class307 field3156;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1360(int arg0, int arg1, int arg2, int arg3) {
        if (class163.method1117(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class169.method1198(var4 + 1, class166.field2746[arg0][arg1][arg2] + arg3, var5 + 1) && class169.method1198(var4 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class169.method1198(var4 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class169.method1198(var4 + 1, class166.field2746[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)J")
    public static final long method1361(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1787; var4++) {
            class90 var5 = var3.field1782[var4];
            if ((var5.field1402 >> 29 & 0x3L) == 2L && var5.field1405 == arg1 && var5.field1407 == arg2) {
                return var5.field1402;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1362(int arg0) {
        if (arg0 == 1) {
            field3156 = null;
            field3157 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class195(Throwable arg0, String arg1) {
        this.field3162 = arg0;
        this.field3159 = arg1;
    }
}
