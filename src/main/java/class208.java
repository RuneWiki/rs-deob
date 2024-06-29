import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class208 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3115 = -1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3113 = 2;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "[[[I")
    public static int[][][] field3119;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static final void method1372(boolean arg0) {
        field3122++;
        if (class22.field369 != null) {
            class22.field369.method1718(-17492);
            class22.field369 = null;
        }
        class216.method1455((byte) 61);
        class109.method792();
        for (int var1 = 0; var1 < 4; var1++) {
            class243.field3763[var1].method615(2097152);
        }
        class218.method1467(false, -92);
        System.gc();
        class16.method116(arg0, 2);
        class175.field2558 = -1;
        class233.field3601 = false;
        class207.method1366(true, arg0);
        class90.field1367 = 0;
        class188.field2774 = 0;
        class176.field2578 = false;
        class16.field297 = 0;
        class121.field1806 = 0;
        for (int var2 = 0; var2 < class234.field3610.length; var2++) {
            class234.field3610[var2] = null;
        }
        class266.field4155 = 0;
        class207.field3093 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class166.field2438[var3] = null;
            class85.field1302[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class243.field3762[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class235.field3614[var5][var6][var7] = null;
                }
            }
        }
        class30.method210(arg0);
        class157.field2305 = 0;
        class139.method946(-1);
        class20.method140(true, (byte) -84);
        try {
            class238.method1634("loggedout", (byte) -122, class217.field3338.field505);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3119 = null;
        if (arg0 != 0) {
            field3123 = -19;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1374(int arg0, int[] arg1) {
        if (arg0 != 26524) {
            method1373(-70);
        }
        field3120++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class41.method338(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lri;")
    public static final class176 method1375(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3024;
    }
}
