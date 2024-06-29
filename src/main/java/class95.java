import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class class95 extends class189 {

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "Lws;")
    public class241 field1866;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "Los;")
    public static class309 field1861 = new class309("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZBI)V")
    public static final void method852(boolean arg0, byte arg1, int arg2) {
        field1863++;
        class11 var3 = class271.method1714(arg2, 0, arg0);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 != -23) {
            method856(20, true, -35);
        }
        while (var4 < var3.field151.length) {
            var3.field151[var4] = -1;
            var3.field149[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method853(int arg0) {
        if (arg0 != 0) {
            method853(-36);
        }
        field1861 = null;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method854(int arg0);

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)Z")
    public abstract boolean method855(int arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V")
    public static final void method856(int arg0, boolean arg1, int arg2) {
        class405.field6102 = arg0;
        class68.field1382 = 3;
        field1868++;
        class320.method2053(class3.field69.field3826, -8983, class3.field69.field3818);
        if (arg1) {
            class414.method2546("", (byte) -116, "");
        } else {
            class439.method2618(110);
            class414.method2546(class397.field6030, (byte) -116, class236.field3643);
        }
        if (arg2 < 21) {
            field1865 = -58;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lws;I)V")
    public class95(class241 arg0, int arg1) {
        this.field1866 = arg0;
        this.field1860 = arg1;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
    public static final void method857(boolean arg0) {
        field1862++;
        class12.field165.method1614((byte) -24);
        if (arg0) {
            field1865 = 7;
        }
    }
}
