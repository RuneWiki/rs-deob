import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class294 {

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[S")
    public short[] field4762;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[B")
    public byte[] field4767;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[Lok;")
    public class41[] field4754;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[S")
    public short[] field4759;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    public int[] field4768;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    public static int[] field4751 = new int[256];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4749 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4755 = 1;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lok;")
    public static class41 field4764 = class137.method956("Benutzeroberfl-=che geladen)3", 45);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lok;")
    public static class41 field4752 = class137.method956("(U3", 45);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lok;")
    public static class41 field4765 = class137.method956("mapflag", 45);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lok;")
    public static class41 field4757 = class137.method956("Benutzen", 45);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "F")
    public static float field4750;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lmh;")
    public static class65 field4763;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I", line = 6)
    public final int method2032(int arg0, int arg1) {
        if (arg1 == -14180) {
            field4766++;
            return this.field4767[arg0] & 0x3;
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILlb;)Lhe;", line = 33)
    public static final class104 method2033(int arg0, class112 arg1) {
        if (arg0 >= -2) {
            field4752 = (class41) null;
        }
        field4758++;
        return new class104(arg1.method771(-79), arg1.method771(-121), arg1.method771(-95), arg1.method771(-68), arg1.method757(11997), arg1.method757(11997), arg1.method792(2));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2034(boolean arg0) {
        field4752 = null;
        field4757 = null;
        field4765 = null;
        if (arg0) {
            field4749 = -22;
        }
        field4763 = null;
        field4751 = null;
        field4764 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V", line = 69)
    public static final void method2035(int arg0, int arg1) {
        field4756++;
        if (class32.method223(arg1, 255)) {
            class278.method1965(0, class273.field4446[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)Z", line = 85)
    public final boolean method2036(int arg0, int arg1) {
        if (arg0 != 0) {
            method2033(33, (class112) null);
        }
        field4753++;
        return (this.field4767[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lok;", line = 96)
    public static final class41 method2037(byte arg0, long arg1) {
        field4761++;
        class164.field2602.setTime(new Date(arg1));
        int var3 = class164.field2602.get(7);
        if (arg0 < 44) {
            field4755 = 36;
        }
        int var4 = class164.field2602.get(5);
        int var5 = class164.field2602.get(2);
        int var6 = class164.field2602.get(1);
        int var7 = class164.field2602.get(11);
        int var8 = class164.field2602.get(12);
        int var9 = class164.field2602.get(13);
        return class187.method1346(new class41[] { class185.field3020[var3 - 1], class204.field3302, class1.method4(var4 / 10, (byte) 118), class1.method4(var4 % 10, (byte) 39), class164.field2594, class85.field1236[var5], class164.field2594, class1.method4(var6, (byte) 109), class274.field4493, class1.method4(var7 / 10, (byte) 120), class1.method4(var7 % 10, (byte) 53), class288.field4675, class1.method4(var8 / 10, (byte) 25), class1.method4(var8 % 10, (byte) 30), class288.field4675, class1.method4(var9 / 10, (byte) 8), class1.method4(var9 % 10, (byte) 100), class119.field1742 }, 0);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V", line = 147)
    public class294(int arg0) {
        this.field4760 = arg0;
        this.field4762 = new short[this.field4760];
        this.field4767 = new byte[this.field4760];
        this.field4754 = new class41[this.field4760];
        this.field4759 = new short[this.field4760];
        this.field4768 = new int[this.field4760];
    }
}
