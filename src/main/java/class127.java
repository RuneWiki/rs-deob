import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class127 {

    @OriginalMember(owner = "client!op", name = "h", descriptor = "S")
    public short field2166;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "S")
    public short field2161;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public boolean field2170;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "B")
    public byte field2160;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "S")
    public short field2164;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "B")
    public byte field2167;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Los;")
    public static class309 field2173;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2175;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lwp;")
    public static class121 field2171;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lph;")
    public static class459 field2169;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lri;")
    public static class75 field2174;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILgh;Lgh;)V")
    public static final void method999(int arg0, class388 arg1, class388 arg2) {
        class177.field2864++;
        field2168++;
        class459.method2765(class458.field6801, (byte) 87);
        class335.field5062.method1862((byte) -115, arg2.field5700);
        if (arg0 != 127) {
            return;
        }
        class335.field5062.method1853(arg1.field5777, 6);
        class335.field5062.method1865(arg1.field5688, 812856296);
        class335.field5062.method1875((byte) -122, arg2.field5777);
        class335.field5062.method1829(arg1.field5700, (byte) -123);
        class335.field5062.method1875((byte) -100, arg2.field5688);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)S")
    public static final short method1000(int arg0, byte arg1) {
        field2163++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x381) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return arg1 > -26 ? -126 : (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3) {
        field2165++;
        String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & arg1) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class230.method1518(var4, true, false, -30805);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIII)Lop;")
    public final class127 method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2162++;
        if (arg2 != -14740) {
            field2172 = -57;
        }
        return new class127(arg4, arg3, arg0, arg1, this.field2164, this.field2161, this.field2166, this.field2160, this.field2167, this.field2170);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2169 = null;
        field2175 = null;
        if (arg0 != 0) {
            field2171 = null;
        }
        field2171 = null;
        field2173 = null;
        field2174 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field2166 = (short) arg6;
        this.field2159 = arg0;
        this.field2161 = (short) arg5;
        this.field2170 = arg9;
        this.field2160 = (byte) arg7;
        this.field2164 = (short) arg4;
        this.field2167 = (byte) arg8;
    }

    static {
        new class309(" days.", " Tage.", " jours.", " dias.");
        field2172 = -1;
        field2173 = new class309("wave:", "welle:", "ondulation:", "onda:");
        field2175 = new String[100];
    }
}
