import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public abstract class class429 {

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "Lmj;")
    public class114 field5939;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[Lrn;")
    public static class677[] field5942 = new class677[37];

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "Lmca;")
    public static class41 field5944 = new class41("stellardawn", 1);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 4)
    public void method1098(int arg0) {
        if (arg0 != 0) {
            this.method47((byte) -66);
        }
        field5935++;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZILkja;)V", line = 24)
    public static final void method2508(boolean arg0, int arg1, class373 arg2) {
        field5943++;
        class728.field10157 = false;
        if (!arg0) {
            field5942 = null;
        }
        class518.field7114 = 0;
        class350.method2123(2, arg2);
        class415.method2440(arg2, false);
        if (class728.field10157) {
            System.out.println("---endgpp---");
        }
        if (arg2.field5983 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field5983 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V", line = 47)
    public void method1099(int arg0) {
        field5934++;
        if (arg0 != 37) {
            field5944 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V", line = 57)
    public void method1097(int arg0) {
        field5938++;
        if (arg0 > -41) {
            this.method45(null, false, -113);
        }
    }

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)V", line = 69)
    public void method1095(int arg0) {
        if (arg0 < 22) {
            field5942 = null;
        }
        field5936++;
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)V", line = 79)
    public void method1096(int arg0) {
        if (arg0 != 37) {
            field5942 = null;
        }
        field5941++;
    }

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)V", line = 94)
    public void method1101(int arg0) {
        field5933++;
        if (arg0 != 1) {
            this.field5939 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "(I)V", line = 104)
    public static void method2509(int arg0) {
        field5942 = null;
        field5944 = null;
        if (arg0 != -6640) {
            field5942 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lmj;)V", line = 115)
    public class429(class114 arg0) {
        this.field5939 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
    public abstract void method46(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Z")
    public abstract boolean method48(byte arg0);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZZ)V")
    public abstract void method44(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Len;ZI)V")
    public abstract void method45(class408 arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V")
    public abstract void method43(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)V")
    public abstract void method47(byte arg0);
}
