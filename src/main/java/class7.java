import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class7 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Z")
    public boolean field88;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lhk;")
    public static class153 field91 = new class153(15, 0, 1, 0);

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field94 = 0;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field98 = 1;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lwba;")
    public class601 field89;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lwba;")
    public class601 field95;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field92;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
    public boolean field90;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        int var2 = 108 % ((arg0 - 30) / 35);
        field96++;
        return this.field90 && !this.field88;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public final void method50(int arg0) {
        field97++;
        if (arg0 != 0) {
            method51((byte) -37);
        }
        if (this.field89 != null) {
            this.field89.method32(16479);
        }
        this.field90 = false;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static void method51(byte arg0) {
        field92 = null;
        int var1 = 105 / ((-arg0 - 35) / 50);
        field91 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lgga;B)V")
    public static final void method52(class513 arg0, byte arg1) {
        field93++;
        class561.field7772 = arg0.method3016(90, "hitmarks");
        class406.field5590 = arg0.method3016(121, "hitbar_default");
        class229.field3331 = arg0.method3016(114, "timerbar_default");
        class616.field8743 = arg0.method3016(83, "headicons_pk");
        class759.field10512 = arg0.method3016(88, "headicons_prayer");
        if (arg1 <= 102) {
            field94 = 120;
        }
        class663.field9340 = arg0.method3016(84, "hint_headicons");
        class707.field9902 = arg0.method3016(96, "hint_mapmarkers");
        class55.field874 = arg0.method3016(127, "mapflag");
        class458.field6263 = arg0.method3016(85, "cross");
        class216.field3152 = arg0.method3016(96, "mapdots");
        class737.field10232 = arg0.method3016(104, "scrollbar");
        class107.field1530 = arg0.method3016(92, "name_icons");
        class324.field4601 = arg0.method3016(123, "floorshadows");
        class81.field1204 = arg0.method3016(81, "compass");
        class58.field896 = arg0.method3016(110, "otherlevel");
        class27.field286 = arg0.method3016(82, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Z)V")
    public class7(boolean arg0) {
        this.field88 = arg0;
    }
}
