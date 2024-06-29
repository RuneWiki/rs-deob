import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class106 {

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Ljava/lang/String;")
    public String field1306;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "Lrv;")
    public static class120 field1308;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILha;ZIIIII)V")
    public static final void method716(int arg0, class66 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            field1308 = null;
        }
        field1307++;
        arg1.method488(arg0, arg7, arg3, arg4, 1, arg5);
        arg1.method488(arg0 + 1, arg7 - -1, arg6, 16, 1, arg5 - 2);
        arg1.method467(arg0 + 18, arg5 + -2, (byte) 117, arg4 - 19, arg6, arg7 + 1);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static void method717(boolean arg0) {
        if (arg0) {
            method716(74, null, false, 96, -123, -109, -72, -35);
        }
        field1308 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static final void method718(int arg0) {
        class387 var1 = class583.field8255;
        synchronized (class583.field8255) {
            class583.field8255.method2369(-1);
        }
        field1309++;
        if (arg0 != 1) {
            method719(94, 121, -4);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)V")
    public static final void method719(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class257.method1692(var3.field5432);
        class257.method1692(var3.field5444);
        if (var3.field5432 != null) {
            var3.field5432 = null;
        }
        if (var3.field5444 != null) {
            var3.field5444 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1310++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class106(String arg0, int arg1) {
        this.field1306 = arg0;
        this.field1305 = arg1;
    }
}
