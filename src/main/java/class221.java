import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class221 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "J")
    public long field3978 = 0L;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field3989 = 10;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lqj;")
    public static class196 field3984 = class80.method502("M", -48);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field3987 = new Random();

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Z")
    public static boolean field3990 = false;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Z")
    public static boolean field3993 = false;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lpe;")
    public class258 field3979;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lpe;")
    public class258 field3992;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lbk;Lbk;BLbk;)V")
    public static final void method1505(class136 arg0, class136 arg1, byte arg2, class136 arg3) {
        class122.field1743 = arg0;
        class76.field1103 = arg3;
        class91.field1334 = arg1;
        if (arg2 < 112) {
            field3991 = -10;
        }
        field3980++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method1506(boolean arg0) {
        if (!arg0) {
            method1506(false);
        }
        field3987 = null;
        field3984 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    public static final void method1507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class23.field291 = arg0;
        class95.field1388 = arg3;
        field3981++;
        int var5 = -68 / ((arg2 - 6) / 60);
        class93.field1361 = arg4;
        class188.field3296 = arg1;
    }
}
