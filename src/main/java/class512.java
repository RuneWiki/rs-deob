import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class512 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[Lrd;")
    public class344[] field7484 = new class344[8];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public int[] field7483 = new int[3];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[Laa;")
    public class76[] field7489 = new class76[100];

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
    public int[] field7490 = new int[100];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[J")
    public static long[] field7485 = new long[100];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field7487;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field7486;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method3049(int arg0) {
        if (arg0 <= 50) {
            field7485 = null;
        }
        field7485 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lwn;")
    public static final class177 method3050(int arg0, int arg1) {
        field7488++;
        if (arg1 == 0) {
            if ((double) class362.field5340 == 3.0D) {
                return class139.field2094;
            }
            if ((double) class362.field5340 == 4.0D) {
                return class503.field7312;
            }
            if ((double) class362.field5340 == 6.0D) {
                return class507.field7377;
            }
            if ((double) class362.field5340 >= 8.0D) {
                return class271.field4282;
            }
        } else if (arg1 == 1) {
            if ((double) class362.field5340 == 3.0D) {
                return class507.field7377;
            }
            if ((double) class362.field5340 == 4.0D) {
                return class271.field4282;
            }
            if ((double) class362.field5340 == 6.0D) {
                return class27.field300;
            }
            if ((double) class362.field5340 >= 8.0D) {
                return class305.field4670;
            }
        } else if (arg1 == 2) {
            if ((double) class362.field5340 == 3.0D) {
                return class27.field300;
            }
            if ((double) class362.field5340 == 4.0D) {
                return class305.field4670;
            }
            if ((double) class362.field5340 == 6.0D) {
                return class360.field5312;
            }
            if ((double) class362.field5340 >= 8.0D) {
                return class80.field1322;
            }
        }
        if (arg0 != 13968) {
            field7485 = null;
        }
        return null;
    }
}
