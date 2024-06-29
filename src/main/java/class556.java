import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class556 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field8072 = 128;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public int field8083 = 128;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field8070;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public int field8076;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field8077;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Lhr;")
    public static class57 field8079 = new class57(9, 2);

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field8081 = 0;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field8082;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Lfs;", line = 4)
    public final class556 method3336(int arg0) {
        field8075++;
        return arg0 == 14049 ? new class556(this.field8070, this.field8072, this.field8083, this.field8074, this.field8077, this.field8076) : null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lfs;I)V", line = 18)
    public final void method3337(class556 arg0, int arg1) {
        this.field8070 = arg0.field8070;
        this.field8083 = arg0.field8083;
        if (arg1 != 128) {
            this.field8070 = 36;
        }
        this.field8072 = arg0.field8072;
        this.field8076 = arg0.field8076;
        this.field8077 = arg0.field8077;
        this.field8074 = arg0.field8074;
        field8073++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 35)
    public static final void method3338(byte arg0, String arg1, int arg2) {
        class133.field1844++;
        field8071++;
        class88 var3 = class448.method2741((byte) 115, class206.field3099, class583.field8319);
        var3.field1260.method2881(class231.method1605((byte) 44, arg1) + 1, (byte) 112);
        var3.field1260.method2902(arg1, false);
        var3.field1260.method2881(arg2, (byte) 111);
        class523.method3183(var3, (byte) 31);
        if (arg0 != 20) {
            field8079 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 54)
    public static void method3339(byte arg0) {
        if (arg0 != -111) {
            method3340(100, null);
        }
        field8082 = null;
        field8079 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[B)V", line = 69)
    public static final void method3340(int arg0, byte[] arg1) {
        field8078++;
        if (arg0 != 2) {
            method3338((byte) 34, null, 51);
        }
        class479 var2 = new class479(arg1);
        while (true) {
            int var3 = var2.method2886(true);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class177.field2470 = var2.method2882(-1);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V", line = 113)
    public class556(int arg0) {
        this.field8070 = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIII)V", line = 121)
    private class556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8076 = arg5;
        this.field8077 = arg4;
        this.field8072 = arg1;
        this.field8074 = arg3;
        this.field8070 = arg0;
        this.field8083 = arg2;
    }
}
