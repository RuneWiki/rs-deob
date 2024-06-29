import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class335 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
    public static int[] field4078 = new int[32];

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Lwm;")
    public static class30 field4084;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Lq;")
    public static class700 field4079;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static final void method1931(int arg0) {
        class691.field8887 = arg0;
        for (int var1 = 0; var1 < class330.field4039; var1++) {
            for (int var2 = 0; var2 < class559.field7102; var2++) {
                if (class28.field252[arg0][var1][var2] == null) {
                    class28.field252[arg0][var1][var2] = new class766(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILha;)V")
    public static final void method1932(int arg0, class570 arg1) {
        class513 var2 = (class513) class196.field2717.method857(-87);
        if (arg0 != 0) {
            method1933((byte) 102);
        }
        while (var2 != null) {
            if (var2.field6548) {
                var2.method2845(arg1);
            }
            var2 = (class513) class196.field2717.method864(true);
        }
        field4086++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method1933(byte arg0) {
        field4084 = null;
        field4079 = null;
        field4078 = null;
        if (arg0 != 56) {
            field4079 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Luq;")
    public final class335 method1934(int arg0, int arg1) {
        field4082++;
        if (arg1 != -14990) {
            method1932(-102, null);
        }
        return new class335(this.field4087, arg0, this.field4083, this.field4080);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIII)V")
    public class335(int arg0, int arg1, int arg2, int arg3) {
        this.field4080 = arg3;
        this.field4083 = arg2;
        this.field4087 = arg0;
        this.field4081 = arg1;
    }
}
