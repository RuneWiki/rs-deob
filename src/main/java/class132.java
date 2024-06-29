import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class132 extends class175 {

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field2301 = -1;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "Lij;")
    public static class50 field2310 = class78.method578(121, "mapdots");

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "Lij;")
    public static class50 field2309 = class78.method578(126, ")2");

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "Lkj;")
    public static class56 field2304 = new class56(8);

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "Le;")
    public static class86 field2311 = new class86();

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "J")
    public static long field2308;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "[[S")
    public static short[][] field2312;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2310 = null;
        field2309 = null;
        field2312 = null;
        field2304 = null;
        field2311 = null;
        if (arg0 != 0) {
            field2309 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIB)I")
    private final int method929(int arg0, int arg1, byte arg2) {
        if (arg2 != -41) {
            method930(115);
        }
        ++field2307;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)Lek;")
    public static final class169 method930(int arg0) {
        ++field2303;
        int var1 = class46.field836[0] * class164.field2805[0];
        if (arg0 != 22675) {
            method928(80);
        }
        byte[] var2 = class31.field628[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; ~var4 > ~var1; ++var4) {
            var3[var4] = class114.field1996[class51.method413(255, var2[var4])];
        }
        class169 var5 = new class169(class89.field1707, class116.field2024, class20.field421[0], class2.field27[0], class46.field836[0], class164.field2805[0], var3);
        class261.method1759(true);
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    public static final void method931(boolean arg0, int arg1) {
        ++field2305;
        if (arg0) {
            method928(1);
        }
        class151.field2622.method770(true, arg1);
        class84.field1597.method770(true, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwd;B)Lt;")
    public static final class175 method932(class217 arg0, byte arg1) {
        arg0.method1487(255);
        ++field2302;
        int var2 = arg0.method1487(arg1 + 176);
        class175 var3 = class44.method324(var2, 109);
        var3.field2935 = arg0.method1487(255);
        int var4 = arg0.method1487(255);
        if (arg1 != 79) {
            return null;
        } else {
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                int var6 = arg0.method1487(255);
                var3.method39(true, var6, arg0);
            }
            var3.method44(arg1 ^ 79);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            this.method929(-102, 124, (byte) -63);
        }
        ++field2300;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int var4 = class29.field616[arg0];
            for (int var5 = 0; ~var5 > ~class211.field3514; ++var5) {
                var3[var5] = this.method929(var4, class129.field2272[var5], (byte) -41) % 4096;
            }
        }
        return var3;
    }
}
