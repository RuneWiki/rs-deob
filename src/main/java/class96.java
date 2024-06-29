import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class96 implements class169 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Lvn;")
    public class186 field1422;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Lmf;")
    public class409 field1425;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Ljava/lang/String;")
    public String field1424;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
    public static boolean field1414 = false;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Ldc;")
    public static class303 field1410 = new class303(2, 4, 4, 0);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 3)
    public static void method724(int arg0) {
        if (arg0 != 0) {
            method725(false);
        }
        field1410 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method725(boolean arg0) {
        field1418++;
        class400.field5784 = 0;
        if (!arg0) {
            class150.field2533.method3896(3);
            class150.field2533.method3904(class436.field6281, 0);
            class400.field5784++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lkq;", line = 48)
    public final class696 method726(int arg0) {
        field1420++;
        if (arg0 != -17) {
            this.field1425 = null;
        }
        return class329.field4557;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Lvn;Lmf;IIIIIIIIII)V", line = 61)
    public class96(String arg0, class186 arg1, class409 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field1412 = arg6;
        this.field1426 = arg11;
        this.field1419 = arg12;
        this.field1423 = arg9;
        this.field1417 = arg4;
        this.field1413 = arg10;
        this.field1422 = arg1;
        this.field1421 = arg7;
        this.field1416 = arg8;
        this.field1411 = arg5;
        this.field1425 = arg2;
        this.field1415 = arg3;
        this.field1424 = arg0;
    }
}
