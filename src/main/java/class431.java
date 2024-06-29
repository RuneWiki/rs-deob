import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class431 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[[I")
    public static int[][] field6137 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "[[Lvj;")
    public static class204[][] field6138;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
    public static void method2522(boolean arg0) {
        field6138 = null;
        field6137 = null;
        if (arg0) {
            field6138 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ltt;I)Ltt;")
    public abstract class475 method2523(class475 arg0, int arg1);
}
