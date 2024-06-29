import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class287 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[F")
    public static float[] field4142 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lvp;")
    public static class123 field4139 = new class123(55, 8);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public abstract void method1031(int arg0);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;Lhh;B)Lfi;")
    public static final class388 method1792(boolean arg0, String arg1, class84 arg2, byte arg3) {
        if (arg3 >= -70) {
            method1794(21);
        }
        field4141++;
        int var4 = arg2.method677(-1, arg1);
        if (var4 == -1) {
            return new class388(0);
        }
        int[] var5 = arg2.method675((byte) 67, var4);
        class388 var6 = new class388(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field5748 > var7) {
                class303 var9 = new class303(arg2.method683(var4, var5[var8++], 5));
                int var10 = var9.method1870(-1945262512);
                int var11 = var9.method1868(0);
                int var12 = var9.method1918((byte) -55);
                if (!arg0 && var12 == 1) {
                    var6.field5748--;
                } else {
                    var6.field5749[var7] = var10;
                    var6.field5750[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
    public static final int method1793(int arg0, int arg1) {
        field4140++;
        int var2 = -75 / ((52 - arg0) / 36);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4142 = null;
        field4139 = null;
        if (arg0 != -1) {
            field4142 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)J")
    public abstract long method1028(int arg0);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
    public abstract int method1029(int arg0, int arg1);
}
