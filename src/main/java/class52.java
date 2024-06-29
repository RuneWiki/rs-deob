import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[Ltd;")
    public volatile class74[] field831 = new class74[2];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Z")
    public volatile boolean field832 = false;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Z")
    public volatile boolean field823 = false;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "S")
    public static short field833 = 1;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lel;")
    public static class213 field826;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lvd;")
    public class4 field830;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method444(int arg0) {
        field826 = null;
        if (arg0 != 21) {
            method444(-112);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)I")
    public static final int method445(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field827++;
        int var5 = 65536 - class224.field3597[arg4 * 1024 / arg0] >> 1;
        if (arg3) {
            field833 = -92;
        }
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lub;I)V")
    public static final void method446(class92 arg0, int arg1) {
        class18.field251 = class37.method342(class257.field4102, arg0, false, 0);
        field828++;
        class3.field48 = class196.method1400(0, arg0, class64.field1019, (byte) 73);
        class63.field991 = class196.method1400(0, arg0, class252.field4035, (byte) 73);
        class235.field3718 = class196.method1400(0, arg0, class50.field816, (byte) 73);
        class180.field2819 = class196.method1400(0, arg0, class248.field3954, (byte) 73);
        class15.field198 = class196.method1400(0, arg0, class172.field2645, (byte) 73);
        class152.field2242 = class196.method1400(0, arg0, class125.field1881, (byte) 73);
        class36.field625 = class247.method1674(class46.field766, 0, arg0, (byte) -56);
        class162.field2433 = class194.method1380(arg0, 0, class294.field4568, (byte) 58);
        class69.field1096 = class194.method1380(arg0, 0, class55.field870, (byte) 37);
        class236.field3734 = class123.method925(0, -115, class26.field457, arg0);
        class54.field863 = class123.method925(0, -120, class115.field1766, arg0);
        class117.field1786.method1787(class54.field863, (int[]) null);
        class276.field4391.method1787(class54.field863, (int[]) null);
        class73.field1118.method1787(class54.field863, (int[]) null);
        class51 var2 = class179.method1272(arg1 + 70, arg0, class152.field2250, 0);
        var2.method436();
        class297.field4794 = var2;
        class51[] var3 = class37.method342(class247.field3931, arg0, false, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method436();
        }
        class176.field2723 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * (double) arg1) - 20;
        for (int var9 = 0; var9 < class18.field251.length; var9++) {
            class18.field251[var9].method427(var7 + var8, var5 + var8, var6 + var8);
        }
        class23.field387 = class18.field251;
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
    public final void run() {
        field829++;
        this.field823 = true;
        try {
            while (!this.field832) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class74 var2 = this.field831[var1];
                    if (var2 != null) {
                        var2.method580(false);
                    }
                }
                class122.method922(10L, (byte) -111);
                class107.method811(this.field830, (Object) null, -15021);
            }
        } catch (Exception var9) {
            class79.method624((String) null, var9, 0);
        } finally {
            Object var6 = null;
            this.field823 = false;
        }
    }
}
