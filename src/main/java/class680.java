import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class680 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field9658;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lcb;")
    public static class544 field9659;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 3)
    public static void method3842(int arg0) {
        if (arg0 != 10) {
            method3842(98);
        }
        field9659 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 13)
    public static final String method3843(byte arg0, long arg1) {
        class173.field2449.setTime(new Date(arg1));
        field9656++;
        int var3 = class173.field2449.get(7);
        int var4 = class173.field2449.get(5);
        int var5 = class173.field2449.get(2);
        int var6 = class173.field2449.get(1);
        int var7 = class173.field2449.get(11);
        int var8 = class173.field2449.get(12);
        int var9 = 5 / ((arg0 + 14) / 53);
        int var10 = class173.field2449.get(13);
        return class412.field5832[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class223.field3204[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;", line = 47)
    public final String toString() {
        field9657++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 59)
    public class680(String arg0, String arg1, String arg2, int arg3) {
        this.field9658 = arg3;
    }
}
