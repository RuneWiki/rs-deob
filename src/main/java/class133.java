import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class133 extends class230 {

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    private int field1753;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ltn;")
    public static class60 field1751 = new class60(64, -1);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "F")
    public static float field1749;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1752;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V", line = 3)
    public final void method406(int arg0, int arg1, int arg2) {
        ++field1744;
        if (arg0 != 0) {
            method844((byte) -104);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 13)
    public static final void method843(byte arg0) {
        class174 var1 = class311.field4524;
        synchronized (class311.field4524) {
            class311.field4524.method1095(0);
        }
        ++field1745;
        class174 var2 = class66.field842;
        synchronized (class66.field842) {
            class66.field842.method1095(0);
            if (arg0 < 65) {
                field1752 = null;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V", line = 32)
    public static final void method844(byte arg0) {
        ++field1748;
        int[] var1 = new int[class344.field5000.field2223];
        int var2 = 0;
        if (arg0 == -52) {
            for (int var3 = 0; ~var3 > ~class344.field5000.field2223; ++var3) {
                class395 var5 = class344.field5000.method993(var3, true);
                if (var5.field5560 >= 0 || ~var5.field5548 <= -1) {
                    var1[var2++] = var3;
                }
            }
            class227.field3272 = new int[var2];
            for (int var4 = 0; var4 < var2; ++var4) {
                class227.field3272[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 68)
    public static void method845(int arg0) {
        field1751 = null;
        field1752 = null;
        if (arg0 <= 46) {
            method844((byte) 46);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 79)
    public final void method408(int arg0, int arg1, int arg2) {
        ++field1743;
        if (arg2 == 0) {
            int var4 = this.field1746 * arg1 >> 12;
            int var5 = this.field1750 * arg1 >> 12;
            int var6 = this.field1742 * arg0 >> 12;
            int var7 = this.field1753 * arg0 >> 12;
            class389.method2254(var5, var7, super.field3389, 23261, var6, var4);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V", line = 100)
    public final void method409(int arg0, int arg1, byte arg2) {
        ++field1747;
        if (arg2 != -85) {
            method844((byte) -22);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIII)V", line = 111)
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1753 = arg3;
        this.field1746 = arg0;
        this.field1742 = arg1;
        this.field1750 = arg2;
    }
}
