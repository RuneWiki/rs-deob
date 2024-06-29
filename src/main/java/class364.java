import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class364 extends class54 {

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field5235;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
    public static int[] field5234 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field5230 = 0;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lcp;")
    public static class470 field5236 = new class470(32);

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Lku;")
    public static class232 field5246 = new class232(4);

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 == -1) {
            field5232++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(JI)V")
    public static final void method2248(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 32) {
            field5234 = null;
        }
        field5242++;
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)V")
    public static void method2249(int arg0) {
        field5246 = null;
        if (arg0 == 0) {
            field5234 = null;
            field5236 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = 90 / ((arg4 - 20) / 38);
        field5245++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
    public static final void method2250(int arg0) {
        field5229++;
        if (class276.field4034 >= 0) {
            long var1 = class433.method2562(-2039);
            class276.field4034 = (int) ((long) class276.field4034 - (var1 - class324.field4678));
            if (class276.field4034 > 0) {
                int var3 = (class276.field4034 << 8) / class348.field5044;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class93.field1182 = ((class313.field4419 & 0xFF00FF) * var3 + ((class328.field4747.field6219 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class313.field4419 & 0xFF00) * var3 + (class328.field4747.field6219 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class51.field703 = (class328.field4747.field6218 - class199.field2909) * var6 + class199.field2909;
                class453.field6392 = (class328.field4747.field6211 - class185.field2747) * var6 + class185.field2747;
                class490.field6914 = (class328.field4747.field6210 - class95.field1222) * var6 + class95.field1222;
                class112.field1420 = (class328.field4747.field6225 - class323.field4665) * var6 + class323.field4665;
                class368.field5322 = ((class190.field2829 & 0xFF00FF) * var3 + ((class328.field4747.field6209 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class190.field2829 & 0xFF00) * var3 + (class328.field4747.field6209 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class442.field6127 = (class328.field4747.field6212 - class66.field847) * var6 + class66.field847;
                class260.field3804 = class80.field985 * var3 + class328.field4747.field6215 * var4 >> 8;
                class149.field2234 = (class328.field4747.field6208 - class480.field6736) * var6 + class480.field6736;
                if (class453.field6391 != class328.field4747.field6213) {
                    class207.field3170 = class135.field1783.method634(class453.field6391, class328.field4747.field6213, var6, class207.field3170);
                }
            } else {
                class93.field1182 = class328.field4747.field6219;
                class490.field6914 = class328.field4747.field6210;
                class453.field6392 = class328.field4747.field6211;
                class276.field4034 = -1;
                class442.field6127 = class328.field4747.field6212;
                class260.field3804 = class328.field4747.field6215;
                class149.field2234 = class328.field4747.field6208;
                class112.field1420 = class328.field4747.field6225;
                class207.field3170 = class328.field4747.field6213;
                class368.field5322 = class328.field4747.field6209;
                class51.field703 = class328.field4747.field6218;
            }
            class324.field4678 = var1;
        }
        if (arg0 != 1513438280) {
            method2251(44, 106, -33);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
    public static final void method2251(int arg0, int arg1, int arg2) {
        field5231++;
        class489 var3 = class116.method731(-625541408, 15, 0);
        var3.method2863(arg1 + 151);
        var3.field6892 = arg2;
        var3.field6895 = arg0;
        if (arg1 != 104) {
            field5230 = -86;
        }
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        field5239++;
        if (arg0 > -105) {
            method2249(-125);
        }
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIII)V")
    public class364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5235 = arg5;
        this.field5237 = arg1;
        this.field5241 = arg6;
        this.field5243 = arg2;
        this.field5244 = arg0;
        this.field5233 = arg3;
        this.field5240 = arg4;
    }

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)I")
    public abstract int method105(int arg0);
}
