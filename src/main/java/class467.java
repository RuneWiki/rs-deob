import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class467 extends class36 {

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lea;")
    public static class474 field6932;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field6925;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field6930;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "J")
    public static long field6934;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Ljava/lang/String;")
    public String field6933;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public final void method2851(boolean arg0) {
        ++field6937;
        if (!arg0) {
            this.method2851(true);
        }
        super.field401 |= Long.MIN_VALUE;
        if (this.method2856(-44) == 0L) {
            class493.field7174.method1646(-96, this);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method2852(int arg0) {
        ++field6927;
        super.field401 = super.field401 & Long.MIN_VALUE | class84.method550((byte) -92) + 500L;
        class158.field1948.method1646(-110, this);
        if (arg0 != 0) {
            this.field6926 = -104;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
    public static void method2853(boolean arg0) {
        field6932 = null;
        if (arg0) {
            method2854(-69);
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Lmh;")
    public static final class548 method2854(int arg0) {
        ++field6936;
        try {
            return new class241();
        } catch (Throwable var2) {
            if (arg0 >= -29) {
                field6928 = -125;
            }
            try {
                return (class548) Class.forName("fs").newInstance();
            } catch (Throwable var1) {
                return new class373();
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)I")
    public final int method2855(int arg0) {
        ++field6931;
        return arg0 != -18737 ? -69 : (int) super.field4676;
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)J")
    public final long method2856(int arg0) {
        ++field6929;
        if (arg0 > -35) {
            this.method2851(true);
        }
        return super.field401 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
    public final int method2857(byte arg0) {
        ++field6935;
        if (arg0 != 23) {
            this.field6933 = null;
        }
        return (int) (super.field4676 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II)V")
    public class467(int arg0, int arg1) {
        super.field4676 = (long) arg0 << 32 | (long) arg1;
    }

    static {
        new class474("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6928 = 0;
        field6932 = new class474("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
    }
}
