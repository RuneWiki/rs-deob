import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public abstract class class78 {

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "[I")
    public static int[] field1199 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "[I")
    public static int[] field1195;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[[S")
    public static short[][] field1198;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V", line = 7)
    public static void method611(byte arg0) {
        field1195 = null;
        field1199 = null;
        field1198 = null;
        if (arg0 > -47) {
            method611((byte) 120);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)J")
    public abstract long method610(int arg0);
}
