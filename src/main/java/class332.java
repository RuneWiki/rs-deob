import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class332 {

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "J")
    public long field5299 = 0L;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field5298 = 0;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5296 = "Discard";

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field5308 = 0;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Lml;")
    public class152 field5305;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Lml;")
    public class152 field5307;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lje;")
    public static class84 field5297;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2349(int arg0) {
        for (class302 var1 = (class302) class232.field3798.method431(arg0 ^ arg0); var1 != null; var1 = (class302) class232.field3798.method439(-28512)) {
            if (var1.field4927) {
                var1.method2163(71);
            }
        }
        field5301++;
        for (class302 var2 = (class302) class46.field931.method431(arg0 - 29937); var2 != null; var2 = (class302) class46.field931.method439(-28512)) {
            if (var2.field4927) {
                var2.method2163(71);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZILek;)V", line = 45)
    public static final void method2350(int arg0, int arg1, int arg2, boolean arg3, int arg4, class206 arg5) {
        class144.field2426 = arg2;
        class181.field3110 = arg3;
        field5314++;
        if (arg0 < 66) {
            method2351(-124);
        }
        class316.field5136 = 10000;
        class352.field5619 = arg1;
        class359.field5720 = arg4;
        class257.field4202 = arg5;
        class222.field3671 = 1;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V", line = 67)
    public static void method2351(int arg0) {
        field5297 = null;
        if (arg0 != 0) {
            method2349(41);
        }
        field5296 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 98)
    public static final boolean method2352(int arg0, String arg1) {
        field5300++;
        if (arg0 >= -61) {
            field5295 = -46;
        }
        return class52.method453(arg1, 10, true, -6935);
    }
}
