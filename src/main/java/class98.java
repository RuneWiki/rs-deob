import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class98 extends class11 {

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "Lno;")
    private class658 field1485;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "J")
    private long field1486;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "Lcu;")
    public static class206 field1483 = new class206(17, 3);

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "Lhi;")
    public static class193 field1488 = new class193(2);

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
    public static int field1489 = 1407;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Laea;")
    public static class47 field1476;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "Lrg;")
    public static class601 field1479;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 4)
    public static void method753(int arg0) {
        if (arg0 != 2) {
            method754((byte) 114, -93);
        }
        field1483 = null;
        field1476 = null;
        field1488 = null;
        field1479 = null;
    }

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        field1480++;
        this.method757(22698);
        super.finalize();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Llj;", line = 28)
    public static final class570 method754(byte arg0, int arg1) {
        field1477++;
        if (arg0 != -5) {
            field1479 = null;
        }
        class570[] var2 = class216.method1380((byte) 95);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field7570 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)J", line = 53)
    public final long method755(int arg0) {
        if (arg0 == 17) {
            field1484++;
            return this.field1486;
        } else {
            return -76L;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V", line = 65)
    public static final void method756(boolean arg0) {
        field1478++;
        class10.field201++;
        class402 var1 = class390.method2252(class457.field6206, -109, class262.field3644);
        var1.field5354.method1980(-345277664, 0);
        if (arg0) {
            method753(67);
        }
        class36.method278(0, var1);
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V", line = 80)
    private final void method757(int arg0) {
        if (this.field1486 > 0L) {
            this.field1485.field9133.releasePbuffer(this.field1486);
            this.field1486 = 0L;
        }
        field1487++;
        if (arg0 != 22698) {
            method754((byte) 22, -106);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILeh;I)V", line = 97)
    public static final void method758(int arg0, class335 arg1, int arg2) {
        if (class221.field3134 != null) {
            try {
                class221.field3134.method3302(0L, (byte) -51);
                class221.field3134.method3306(24, arg0, arg1.field4600, -25944);
            } catch (Exception var3) {
            }
        }
        field1482++;
        if (arg2 != 2) {
            field1483 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lno;II)V", line = 121)
    public class98(class658 arg0, int arg1, int arg2) {
        this.field1485 = arg0;
        this.field1481 = arg1 * arg2;
        this.field1486 = this.field1485.field9133.createPbuffer(arg1, arg2);
    }
}
