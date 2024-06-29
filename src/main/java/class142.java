import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class142 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Z")
    public static boolean field2080 = false;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Z")
    public static boolean field2088 = false;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static final void method870(byte arg0) {
        field2086++;
        if (arg0 > -73) {
            method872(2);
        }
        for (int var1 = 0; var1 < class118.field1781; var1++) {
            int var2 = class113.field1736[var1];
            class107 var3 = class96.field1521[var2];
            int var4 = class100.field1580.method1593((byte) 27);
            if ((var4 & 0x4) != 0) {
                var4 += class100.field1580.method1593((byte) 27) << 8;
            }
            class159.method981(var3, var4, var2, 0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Lmk;")
    public static final class105 method871(int arg0) {
        field2081++;
        if (arg0 > -110) {
            field2088 = true;
        }
        try {
            return (class105) Class.forName("jh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class74();
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static final void method872(int arg0) {
        field2087++;
        int var1 = -109 % ((arg0 - 26) / 40);
        class139.field2039.method1775(27147);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JI)V")
    public static final void method873(long arg0, int arg1) {
        field2082++;
        try {
            if (arg1 == 0) {
                Thread.sleep(arg0);
            }
        } catch (InterruptedException var3) {
        }
    }
}
