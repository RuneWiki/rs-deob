import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class246 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Ljc;")
    public static class305 field3233 = new class305("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3237 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Lqm;")
    public static class98 field3235;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)I")
    public static final int method1524(int arg0, int arg1) {
        return class516.field7502 == null ? 0 : class516.field7502[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        if (arg0 == 80) {
            field3235 = null;
            field3233 = null;
            field3237 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)I")
    public static final int method1526(byte arg0, int arg1) {
        field3234++;
        return arg0 >= -105 ? 90 : arg1 >>> 8;
    }
}
