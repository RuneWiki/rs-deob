import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class447 implements class563 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Ljava/lang/String;")
    private String field5916;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
    public static boolean field5920 = false;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "J")
    public static long field5915;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Z")
    private boolean field5917;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2518(byte arg0) {
        if (arg0 > -9) {
            this.method184(18);
        }
        field5919++;
        return this.field5917;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I", line = 20)
    public final int method184(int arg0) {
        field5922++;
        int var2 = class207.method1317(6345, this.field5916);
        int var3 = 9 / ((arg0 - 47) / 54);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field5917 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I", line = 39)
    public static final int method2519(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            field5915 = 107L;
        }
        field5918++;
        return arg0 == 1 || arg0 == 3 ? class418.field5503[arg1 & 0x3] : class258.field3384[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 52)
    public class447(String arg0) {
        this.field5916 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lrba;", line = 63)
    public final class67 method179(int arg0) {
        field5921++;
        if (arg0 != -24832) {
            field5915 = 104L;
        }
        return class67.field823;
    }
}
