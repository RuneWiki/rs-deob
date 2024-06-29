import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class232 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public volatile int field2866 = 0;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public int field2862 = 0;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[F")
    public float[] field2863 = new float[5000];

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public int field2864 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public volatile int field2858 = 0;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field2869 = new Object[5000];

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[B")
    public byte[] field2870 = new byte[5000];

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "[I")
    public static int[] field2867 = new int[14];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lgq;")
    public static class436 field2861;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public abstract void method1323(byte arg0);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
    public abstract void method1324(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1325(String arg0, int arg1) {
        if (arg1 != 0) {
            method1334(-55, 111, -25, 105);
        }
        field2859++;
        return class44.method233(122, 10, true, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILdg;)V")
    public abstract void method1326(int arg0, class349 arg1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ldg;Z)V")
    public abstract void method1327(class349 arg0, boolean arg1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZBZI)V")
    public static final void method1328(int arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        class633.method3637(0, arg1, arg3, 112, arg0, arg4, class544.field7971.length - 1);
        if (arg2 < 126) {
            field2861 = null;
        }
        field2860++;
        class536.field7517 = null;
        class536.field7518 = 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public abstract void method1329(int arg0);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsa;IIZF)V")
    public abstract void method1330(class174 arg0, int arg1, int arg2, boolean arg3, float arg4);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ldg;B)V")
    public abstract void method1331(class349 arg0, byte arg1);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
    public static void method1332(byte arg0) {
        if (arg0 != -113) {
            field2867 = null;
        }
        field2867 = null;
        field2861 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public abstract void method1333(int arg0, int arg1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3) {
        field2857++;
        int var4 = arg0 << 3;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        int var7 = -5 / ((arg1 - 3) / 47);
        class558.field8223 = var4;
        class588.field8527 = var5;
        if (class617.field8931 == 2) {
            class263.field3390 = var6;
            class482.field6748 = var5;
            class168.field2055 = var4;
        }
        class443.method2596(-7325);
        class35.field278 = true;
    }
}
