import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class694 {

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "Lnd;")
    public static class500 field325 = new class500();

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field326 = -1;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field327 = new String[100];

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "[[Lfaa;")
    public static class140[][] field321;

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method115(int arg0, int arg1, byte[] arg2) {
        field324++;
        byte[] var3 = new byte[arg1];
        class282.method1706(arg2, arg0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        if (arg0 <= 112) {
            field327 = null;
        }
        field323++;
        return class346.field4994;
    }

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
    public static void method116(int arg0) {
        if (arg0 != 7330) {
            field326 = 71;
        }
        field321 = null;
        field327 = null;
        field325 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lpj;I)V")
    public static final void method117(class132 arg0, int arg1) {
        class473.field6606 = arg0.method920(2, "hitmarks");
        field322++;
        class130.field1781 = arg0.method920(2, "hitbar_default");
        class77.field1067 = arg0.method920(2, "timerbar_default");
        class219.field3182 = arg0.method920(2, "headicons_pk");
        class399.field5547 = arg0.method920(2, "headicons_prayer");
        class71.field979 = arg0.method920(2, "hint_headicons");
        class387.field5432 = arg0.method920(arg1 + 3, "hint_mapmarkers");
        class572.field7711 = arg0.method920(2, "mapflag");
        class30.field364 = arg0.method920(2, "cross");
        class32.field383 = arg0.method920(arg1 ^ 0xFFFFFFFD, "mapdots");
        if (arg1 != -1) {
            method116(-100);
        }
        class583.field8127 = arg0.method920(2, "scrollbar");
        class16.field235 = arg0.method920(2, "name_icons");
        class138.field1941 = arg0.method920(2, "floorshadows");
        class428.field6015 = arg0.method920(2, "compass");
        class258.field3698 = arg0.method920(2, "otherlevel");
        class615.field8523 = arg0.method920(arg1 ^ 0xFFFFFFFD, "hint_mapedge");
    }
}
