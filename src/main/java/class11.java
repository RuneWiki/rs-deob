import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class11 {

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "B")
    public byte field159;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lkh;")
    public class11 field156;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lhj;")
    public static class338 field139 = new class338(5000);

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lrm;")
    public static class234 field149 = new class234(16);

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field154 = -1;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "S")
    public static short field158 = 320;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field160 = -1;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lmp;")
    public static class452 field133;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "[Lwa;")
    public static class364[] field163;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
    public static final int method104(byte arg0) {
        if (arg0 < 33) {
            method106((String) null, -120);
        }
        field148++;
        return ((class232.field3867 == 0 ? 0 : 1) << 21) + (class386.field5835 << 17) + ((class183.field2984 ? 1 : 0) << 10) + ((class234.field3903 ? 1 : 0) << 8) + ((class311.field4905 ? 1 : 0) << 6) + ((class216.field3514 ? 1 : 0) << 4) + ((class39.field497 ? 1 : 0) << 3) + (class394.field5905 & 0x7) + ((class341.field5267 ? 1 : 0) << 5) + (((class256.field4149 ? 1 : 0) << 9) + (((class299.field4755 & 0x3) << 11) - (-((class377.field5695 ? 1 : 0) << 13) - ((class220.field3627 ? 1 : 0) << 15) + -((class241.field3987 ? 1 : 0) << 16) + -((class349.field5410 ? 1 : 0) << 19))) + ((class145.field2283 == 0 ? 0 : 1) << 20) - (-((class213.field3427 == 0 ? 0 : 1) << 22) - (class7.method88(22800) << 23)) - -(class137.field2145 << 25)) + ((class395.field5923 ? 1 : 0) << 27) + (class452.field6579 << 28);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public static final void method105(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        if (var3 != null && var3.field3864 != null) {
            var3.field3864 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method106(String arg0, int arg1) {
        field152++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != -10496) {
            method107((byte) -102);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method107(byte arg0) {
        field149 = null;
        field133 = null;
        field139 = null;
        if (arg0 == -5) {
            field163 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
    public static final void method108(int arg0, byte arg1) {
        field147++;
        if (class178.method1225(108, arg0)) {
            class284.method1930(true, -1, class203.field3266[arg0]);
            if (arg1 != -87) {
                field149 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method109(int arg0) {
        if (arg0 != -13853) {
            method107((byte) 120);
        }
        field146++;
        if (!class449.field6546) {
            return;
        }
        class172 var1 = class201.method1393(class436.field6419, class73.field925, -121);
        if (var1 != null && var1.field2710 != null) {
            class150 var2 = new class150();
            var2.field2348 = var1;
            var2.field2352 = var1.field2710;
            class17.method135(var2);
        }
        class449.field6546 = false;
        class50.field617 = -1;
        class336.method2219((byte) 6, var1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IC)Z")
    public static final boolean method110(int arg0, char arg1) {
        field143++;
        if (arg0 != 23727) {
            method105(50, 88, -56);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIB)V")
    public class11(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field145 = arg3;
        this.field159 = arg4;
        this.field161 = arg0;
        this.field134 = arg2;
        this.field162 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lkh;I)V")
    public class11(class11 arg0, int arg1) {
        this.field156 = arg0;
        this.field145 = this.field156.field145 + arg1;
        this.field161 = this.field156.field161;
        this.field134 = this.field156.field134 + arg1;
        this.field162 = this.field156.field162 + arg1;
        this.field159 = this.field156.field159;
    }
}
