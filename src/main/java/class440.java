import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class440 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
    public static final void method2656(byte arg0, int arg1) {
        class87.field1627 = arg1;
        class414.field6008 = 3;
        class42.field1080 = 100;
        if (arg0 >= 98) {
            field6340++;
            class362.field5373 = -1;
        }
    }
}
