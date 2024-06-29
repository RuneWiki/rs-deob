import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class343 extends class42 {

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lbo;")
    public class511 field4532;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4533 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lcu;")
    public static class145 field4534 = new class145(55, 7);

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "Z")
    public boolean field4535;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method1989(int arg0) {
        field4527++;
        if (arg0 != 16777215) {
            this.method1989(-122);
        }
        return this.field4535;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I", line = 22)
    public final int method1990(int arg0) {
        field4531++;
        if (arg0 != -16674) {
            this.method648(2, -106);
        }
        return 1;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V", line = 39)
    public static void method1991(int arg0) {
        field4534 = null;
        field4533 = null;
        if (arg0 < 66) {
            field4534 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)Z", line = 55)
    public final boolean method1992(int arg0) {
        field4528++;
        int var2 = -97 % ((arg0 - 51) / 34);
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIZI)V", line = 68)
    public static final void method1993(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field4530++;
        class149.method1029(arg4, class391.field5303.length - 1, arg3, 0, arg2 + 6756, arg1, arg0);
        class224.field3018 = null;
        if (arg2 != -6754) {
            method1991(-26);
        }
        class420.field5752 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)I", line = 81)
    public int method643(boolean arg0) {
        if (!arg0) {
            this.method643(false);
        }
        field4529++;
        return 0;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lbo;)V", line = 93)
    public class343(class511 arg0) {
        this.field4532 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Z")
    public abstract boolean method649(byte arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
    public abstract void method647(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public abstract void method648(int arg0, int arg1);

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public abstract void method651(int arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILwr;Lwr;I)V")
    public abstract void method646(int arg0, class316 arg1, class316 arg2, int arg3);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)Z")
    public abstract boolean method645(int arg0);
}
