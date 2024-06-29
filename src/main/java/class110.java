import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class110 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lmq;")
    private class104 field1553 = new class104(16);

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lfc;")
    private class343 field1557;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
    public static int[] field1554 = new int[32];

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1558 = null;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 3)
    public static final void method681(byte arg0) {
        class194.field2757.method528(true);
        field1555++;
        class56.field902.method1311((byte) -125);
        if (class155.field2235 != null) {
            class155.field2235.method307(32269, class138.field1965);
        }
        class334.field4582.method892(55);
        class138.field1965.setBackground(Color.black);
        class136.field1929 = -1;
        int var1 = 44 % ((arg0 + 67) / 48);
        class194.field2757 = class459.method2714(1197694608, class138.field1965);
        class56.field902 = class349.method2092(true, class138.field1965, -1);
        if (class155.field2235 != null) {
            class155.field2235.method305(class138.field1965, 24346);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 25)
    public final void method682(int arg0) {
        class104 var2 = this.field1553;
        synchronized (this.field1553) {
            this.field1553.method656(103);
            int var3 = 38 / ((34 - arg0) / 49);
        }
        field1550++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 44)
    public final void method683(int arg0, int arg1) {
        if (arg1 > -107) {
            this.field1553 = null;
        }
        class104 var3 = this.field1553;
        synchronized (this.field1553) {
            this.field1553.method666(arg0, false);
        }
        field1559++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Lcm;", line = 59)
    public final class302 method684(boolean arg0, int arg1) {
        field1560++;
        class104 var3 = this.field1553;
        class302 var4;
        synchronized (this.field1553) {
            var4 = (class302) this.field1553.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1557.method2029(30, arg1, 0);
        class302 var6 = new class302();
        if (var5 != null) {
            var6.method1837(5, new class425(var5));
        }
        class104 var7 = this.field1553;
        synchronized (this.field1553) {
            this.field1553.method653(89, (long) arg1, var6);
            if (arg0) {
                field1554 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 89)
    public static void method685(boolean arg0) {
        field1558 = null;
        field1554 = null;
        if (arg0) {
            method681((byte) 117);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 100)
    public final void method686(int arg0) {
        field1551++;
        class104 var2 = this.field1553;
        synchronized (this.field1553) {
            this.field1553.method654(false);
        }
        if (arg0 != 30) {
            method681((byte) 18);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 118)
    public static final void method687(int arg0) {
        field1556++;
        class378.method2256((byte) -111);
        if (arg0 <= 96) {
            method681((byte) 124);
        }
        class166.field2446 = null;
        class231.field3256 = null;
        class222.field3134 = null;
        class2.field18 = null;
        class350.field4795 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BZ)V", line = 138)
    public static final void method688(byte arg0, boolean arg1) {
        if (arg0 == -30) {
            field1552++;
            class105.method668(true, class67.field987, arg1, class182.field2652, class371.field5248);
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 154)
    public class110(class328 arg0, int arg1, class343 arg2) {
        this.field1557 = arg2;
        this.field1557.method2054(0, 30);
    }
}
