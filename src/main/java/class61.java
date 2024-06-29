import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class61 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lal;")
    public class252 field879 = new class252();

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
    public static boolean field881 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Ltf;")
    public static class115 field890;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lgi;")
    public static class164 field880;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lgi;")
    public static class164 field889;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lal;")
    private class252 field891;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lal;Z)V")
    public final void method388(class252 arg0, boolean arg1) {
        field887++;
        if (arg0.field4142 != null) {
            arg0.method1708((byte) 90);
        }
        arg0.field4142 = this.field879.field4142;
        if (arg1) {
            this.method394((byte) 76);
        }
        arg0.field4140 = this.field879;
        arg0.field4142.field4140 = arg0;
        arg0.field4140.field4142 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Ljb;")
    public static final class291 method389(int arg0, int arg1, int arg2) {
        field885++;
        class291 var3 = (class291) class79.field1269.method371(arg2 ^ 0xFFFFFF80, (long) arg1 << 32 | (long) arg0);
        if (arg2 != 0) {
            field880 = null;
        }
        if (var3 == null) {
            var3 = new class291(arg1, arg0);
            class79.field1269.method368(var3.field2209, var3, -118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method390(byte arg0) {
        field880 = null;
        field889 = null;
        field890 = null;
        if (arg0 != 96) {
            method390((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lal;")
    public final class252 method391(byte arg0) {
        field888++;
        class252 var2 = this.field879.field4140;
        if (this.field879 == var2) {
            this.field891 = null;
            return null;
        } else {
            int var3 = 60 / ((arg0 + 24) / 62);
            this.field891 = var2.field4140;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method392(int arg0) {
        field877++;
        while (true) {
            class252 var2 = this.field879.field4140;
            if (this.field879 == var2) {
                this.field891 = null;
                if (arg0 == 0) {
                    return;
                } else {
                    field889 = null;
                    return;
                }
            }
            var2.method1708((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I")
    public final int method393(int arg0) {
        field886++;
        if (arg0 != 46) {
            this.method388((class252) null, false);
        }
        int var2 = 0;
        for (class252 var3 = this.field879.field4140; var3 != this.field879; var3 = var3.field4140) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Lal;")
    public final class252 method394(byte arg0) {
        field882++;
        class252 var2 = this.field891;
        if (this.field879 == var2) {
            this.field891 = null;
            return null;
        }
        this.field891 = var2.field4140;
        if (arg0 < 52) {
            this.field891 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
    public static final String method395(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field876++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 < arg2) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Lal;")
    public final class252 method396(int arg0) {
        if (arg0 != 0) {
            field889 = null;
        }
        field884++;
        class252 var2 = this.field879.field4140;
        if (this.field879 == var2) {
            return null;
        } else {
            var2.method1708((byte) 90);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class61() {
        this.field879.field4140 = this.field879;
        this.field879.field4142 = this.field879;
    }
}
