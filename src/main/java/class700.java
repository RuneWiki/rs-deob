import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class700 {

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field9920;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lvh;")
    public static class125 field9921 = new class125(77, 8);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9919;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[[Lis;")
    public static class101[][] field9917;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lhc;", line = 3)
    public static final class284 method3937(int arg0, int arg1) {
        if (arg1 != 2048) {
            method3939(1);
        }
        field9915++;
        return arg0 >= 0 && arg0 < 100 ? class131.field2134[arg0] : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 19)
    public static void method3938(byte arg0) {
        int var1 = 70 / ((arg0 - 26) / 37);
        field9921 = null;
        field9919 = null;
        field9917 = null;
    }

    @OriginalMember(owner = "client!kd", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field9916++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 45)
    public static final void method3939(int arg0) {
        if (arg0 >= -113) {
            field9917 = null;
        }
        field9922++;
        class643.field9134 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class565.field8277[var1] = null;
            class569.field8317[var1] = 1;
            class340.field4725[var1] = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)Z", line = 69)
    public static final boolean method3940(int arg0, int arg1, byte arg2) {
        field9914++;
        if (arg2 != -37) {
            method3939(4);
        }
        return class337.method2002(-83, arg1, arg0) || class293.method1791(arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V", line = 81)
    public class700(int arg0) {
        this.field9920 = arg0;
    }
}
