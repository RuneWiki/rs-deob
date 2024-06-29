import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class470 extends class388 {

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field6943 = new int[256];

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lgk;")
    public static class331 field6944 = new class331("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[Lpt;")
    public static class367[] field6948 = new class367[14];

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field6936;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field6938;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field6946;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Z")
    public boolean field6945;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 6)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        field6939++;
        if (arg3 != -99) {
            this.field6936 = -38;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method2844(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2846((byte) -107);
        }
        field6940++;
        return (arg2 & 0x70000) != 0 | class463.method2776(arg0, arg2, 2) || class148.method1070(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 36)
    public final void method29(int arg0) {
        int var2 = 114 % ((57 - arg0) / 44);
        field6947++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z", line = 50)
    public final boolean method32(byte arg0) {
        field6937++;
        if (arg0 <= 104) {
            method2847((byte) 34, -75, 22);
        }
        return false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V", line = 61)
    public static final void method2845(int arg0, byte arg1) {
        field6935++;
        class372.field5534 = 1;
        if (arg1 != 35) {
            field6944 = null;
        }
        class206.field2999 = arg0;
        class445.field6586 = -1;
        class498.field7403 = 0;
        class127.field1852 = null;
        field6941 = -1;
        class479.field7048 = false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 88)
    public static void method2846(byte arg0) {
        int var1 = -61 % ((arg0 + 78) / 42);
        field6944 = null;
        field6943 = null;
        field6948 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BII)Z", line = 99)
    public static final boolean method2847(byte arg0, int arg1, int arg2) {
        field6942++;
        if (arg0 < 85) {
            method2847((byte) -35, -23, -125);
        }
        return (arg2 & 0x180) != 0;
    }
}
