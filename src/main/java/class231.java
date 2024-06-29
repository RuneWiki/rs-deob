import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class231 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[Lul;")
    public static class201[] field3620 = new class201[4];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[B")
    public static byte[] field3616;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method1598(boolean arg0, byte[] arg1, int arg2) {
        field3617++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > arg2 && !class11.field214) {
            try {
                class68 var3 = (class68) Class.forName("ig").getDeclaredConstructor().newInstance();
                var3.method85(arg1, (byte) -99);
                return var3;
            } catch (Throwable var4) {
                class11.field214 = true;
            }
        }
        return arg0 ? class202.method1412(arg1, 105) : arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        field3620 = null;
        if (arg0 == 20191) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
    public static final int method1600(int arg0, byte arg1) {
        if (arg1 >= -94) {
            field3618 = -91;
        }
        field3621++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)I")
    public static final int method1601(int arg0, byte arg1, int arg2) {
        field3614++;
        if (arg1 > -37) {
            field3618 = -73;
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1602(char arg0, String arg1, int arg2) {
        field3615++;
        if (arg2 != -17735) {
            method1601(69, (byte) -76, 111);
        }
        int var3 = class18.method135(-2184, arg0, arg1);
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg0; var8++) {
            }
            var5[var4++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var5[var3] = arg1.substring(var6);
        return var5;
    }
}
