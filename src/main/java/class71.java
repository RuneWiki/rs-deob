import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class71 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lij;")
    public static class50 field1364 = class78.method578(127, "(Y");

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lij;")
    public static class50 field1369 = class78.method578(122, " <col=ffff00>");

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lij;")
    public static class50 field1363 = class78.method578(127, "Art");

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "S")
    public static short field1371 = 205;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[Lgi;")
    public static class187[] field1370 = new class187[2048];

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lwi;")
    public static class21 field1365;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lda;")
    public static class22 field1367;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method535(boolean arg0, int arg1) {
        if (arg0) {
            method538((byte) -21);
        }
        field1366++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
    public abstract int method536(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method537(byte arg0, Component arg1);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static final void method538(byte arg0) {
        field1368++;
        int var1 = -19 % ((-arg0 - 35) / 42);
        class235.field3929.method763(0);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1364 = null;
        field1369 = null;
        if (arg0 != 872189087) {
            method535(false, -101);
        }
        field1370 = null;
        field1365 = null;
        field1367 = null;
        field1363 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method540(Component arg0, int arg1);
}
