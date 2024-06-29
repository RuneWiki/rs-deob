import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class72 extends class401 {

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "[I")
    public static int[] field957 = new int[4096];

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V", line = 5)
    public static final void method577(String arg0, int arg1, boolean arg2, String arg3) {
        field955++;
        class627.field8691 = arg3;
        class540.field7296 = arg2;
        if (arg1 > -56) {
            return;
        }
        class473.field6503 = arg0;
        if (!class540.field7296 && class76.field997 != 3 && class473.field6503.equals("") || class627.field8691.equals("")) {
            class31.method295(2, 3);
            return;
        }
        if (class76.field997 != 1) {
            class655.field9112 = 0;
            class676.field9655 = -1;
        }
        class700.field9933 = false;
        class31.method295(2, -3);
        class130.field1862 = 0;
        class521.field7090 = 1;
        class73.field982 = 0;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 37)
    public static void method578(int arg0) {
        field957 = null;
        if (arg0 != -1) {
            method577(null, -112, true, null);
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V", line = 47)
    public class72() {
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(I)V", line = 54)
    public class72(int arg0) {
        this.field956 = arg0;
    }
}
