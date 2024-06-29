import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class495 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public boolean field6872 = true;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "C")
    private char field6870;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field6873;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/String;")
    public String field6875;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILmd;I)V")
    private final void method2842(int arg0, class379 arg1, int arg2) {
        field6869++;
        if (arg0 == arg2) {
            this.field6870 = class237.method1471(arg2 + 5727, arg1.method2194(-1));
        } else if (arg0 == 2) {
            this.field6873 = arg1.method2232((byte) 125);
        } else if (arg0 == 4) {
            this.field6872 = false;
        } else if (arg0 == 5) {
            this.field6875 = arg1.method2218(-16);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method2843(byte arg0) {
        field6868++;
        class93.field1409.method1458((byte) 109);
        class347.field4676.method1458((byte) 126);
        class431.field5899.method1458((byte) 95);
        class138.field1986.method1458((byte) -115);
        if (arg0 == 42) {
            class370.field4981.method1458((byte) 78);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lmd;B)V")
    public final void method2844(class379 arg0, byte arg1) {
        field6877++;
        if (arg1 != 41) {
            this.field6872 = false;
        }
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                return;
            }
            this.method2842(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Z")
    public final boolean method2845(byte arg0) {
        field6874++;
        if (arg0 >= -56) {
            return false;
        } else {
            return this.field6870 == 's';
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
    public static final void method2846(byte arg0, int arg1, int arg2) {
        field6871++;
        class18 var3 = new class18(16);
        class289 var4 = (class289) class436.field5982.method181((byte) -70);
        if (arg0 != -83) {
            method2843((byte) 49);
        }
        while (var4 != null) {
            var4.method300(false);
            int var5 = (int) (var4.field622 >> 28);
            int var6 = (int) (var4.field622 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field622 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && var7 < class12.field251 && class289.field3782 > var6) {
                var3.method173((long) (var6 << 14 | var5 << 28 | var7), var4, (byte) 109);
            }
            var4 = (class289) class436.field5982.method179(1);
        }
        class436.field5982 = var3;
    }
}
