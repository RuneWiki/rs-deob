import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class120 extends class107 {

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Ldf;")
    public class51 field1998;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[Z")
    public static boolean[] field1994 = new boolean[8];

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Z")
    public static boolean field2000 = true;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Ldf;")
    public static class51 field1999 = class46.method233("slr2)3ws?order=LPWM", 100);

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[[I")
    public static int[][] field1992;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method862(boolean arg0) {
        if (arg0) {
            field1992 = null;
            field1999 = null;
            field1994 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static final void method863(int arg0) {
        if (class44.field701 < 0) {
            class3.field16 = -1;
            class44.field701 = 0;
            class42.field678 = -1;
        }
        if (class5.field38 < class44.field701) {
            class3.field16 = -1;
            class42.field678 = -1;
            class44.field701 = class5.field38;
        }
        field1997++;
        if (class169.field2758 < 0) {
            class3.field16 = -1;
            class169.field2758 = 0;
            class42.field678 = -1;
        }
        if (arg0 < 60) {
            method863(28);
        }
        if (class85.field1433 < class169.field2758) {
            class3.field16 = -1;
            class169.field2758 = class85.field1433;
            class42.field678 = -1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ldf;)V")
    public class120(class51 arg0) {
        this.field1998 = arg0;
    }
}
