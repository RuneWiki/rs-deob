import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class387 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field5552 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    public static boolean field5561 = false;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lbj;")
    public static class131 field5560 = new class131(30);

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
    public static int[] field5564 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    public static int[] field5566 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field5553;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field5559;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field5563;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field5565;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Luo;")
    public static class345 field5557;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[B")
    public byte[] field5555;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[B")
    public byte[] field5562;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Loa;")
    public static final class415 method2452(int arg0, int arg1) {
        field5554++;
        class415 var2 = (class415) class35.field544.method904(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field282.method1745(arg1, (byte) 50, 29);
        class415 var4 = new class415();
        if (var3 != null) {
            var4.method2600(arg1, new class11(var3), -12262);
        }
        if (arg0 != 27545) {
            field5564 = null;
        }
        class35.field544.method902((long) arg1, (byte) 112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IZ)Ljava/lang/String;")
    public static final String method2453(int[] arg0, boolean arg1) {
        field5567++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class29.field488;
        int var4 = 0;
        if (!arg1) {
            field5552 = -67;
        }
        while (arg0.length > var4) {
            class51 var5 = class79.method570(-31346, arg0[var4]);
            if (var5.field703 != -1) {
                class226 var6 = (class226) class5.field87.method904(!arg1, (long) var5.field703);
                if (var6 == null) {
                    class238 var7 = class238.method1606(class212.field2969, var5.field703, 0);
                    if (var7 != null) {
                        var6 = class64.field949.method105(var7, true);
                        class5.field87.method902((long) var5.field703, (byte) 112, var6);
                    }
                }
                if (var6 != null) {
                    class305.field4210[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    public static int method2454(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method2455(int arg0) {
        field5566 = null;
        field5564 = null;
        if (arg0 != 2) {
            method2453((int[]) null, false);
        }
        field5560 = null;
        field5557 = null;
    }
}
