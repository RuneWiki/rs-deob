import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class655 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "J")
    private long field9111;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    private int field9107;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lhg;")
    public static class693 field9115 = new class693(81, -1);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3678(int arg0) {
        field9115 = null;
        if (arg0 >= -112) {
            field9115 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
    public final int method3679(byte arg0) {
        field9114++;
        return arg0 > -14 ? 47 : this.field9107;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lvt;")
    public final class307 method3680(int arg0, int arg1) {
        field9110++;
        if (arg0 != 81) {
            method3681(-127);
        }
        return class307.method1847(4, this.method3683(arg1, -4636));
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method3681(int arg0) {
        field9113++;
        if (class14.field273 != null) {
            class14.field273.method1089(15);
        }
        if (arg0 != 0) {
            method3681(-81);
        }
        if (class721.field10040 == null) {
            return;
        }
        while (true) {
            try {
                class721.field10040.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3682(String arg0, byte arg1) {
        System.exit(1);
        field9109++;
        if (arg1 > -123) {
            field9115 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
    private final int method3683(int arg0, int arg1) {
        if (arg1 == -4636) {
            field9108++;
            return (int) (this.field9111 >> class307.field4054 * arg0) & 0xF;
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lvt;)V")
    public class655(class307 arg0) {
        this.field9111 = arg0.field4047;
        this.field9107 = 1;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([Lvt;)V")
    public class655(class307[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3684((byte) -5, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLvt;)V")
    private final void method3684(byte arg0, class307 arg1) {
        this.field9111 |= (arg1.field4047 << class307.field4054 * this.field9107++);
        if (arg0 != -5) {
            field9115 = null;
        }
        field9112++;
    }
}
