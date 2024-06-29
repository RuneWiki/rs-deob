import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class462 {

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public int field6814 = 0;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public volatile int field6813 = 0;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public int field6812 = 0;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field6817 = new Object[5000];

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public volatile int field6811 = 0;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "[F")
    public float[] field6818 = new float[5000];

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[B")
    public byte[] field6816 = new byte[5000];

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "F")
    public static float field6810 = 0.0F;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field6815 = 0;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lnn;")
    public static class151 field6809 = new class151("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
    public static int[] field6821 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldc;B)V")
    public abstract void method1472(class13 arg0, byte arg1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
    public static final int method2850(int arg0, int arg1) {
        return class246.field3684 == null ? 0 : class246.field3684[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
    public abstract void method1469(int arg0, byte arg1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public abstract void method1476(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public abstract void method1475(boolean arg0);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static void method2851(int arg0) {
        if (arg0 > 87) {
            field6821 = null;
            field6809 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
    public abstract void method1468(byte arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZZLs;F)V")
    public abstract void method1473(int arg0, boolean arg1, boolean arg2, class143 arg3, float arg4);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static final void method2852(byte arg0) {
        class253.method1561(5, (byte) 120);
        field6808++;
        class452.method2806((byte) 38, 5);
        class149.method926(6280, 5);
        class324.method1992(5, 49);
        class398.method2508(119, 5);
        class186.field2796.method1119((byte) -47, 5);
        class383.method2310((byte) -35, 5);
        class174.method1073(-10826, 5);
        class37.method214(5, 8);
        class394.method2497(-126, 5);
        class450.method2773((byte) -71, 5);
        class391.method2412(5, 37);
        if (arg0 < 94) {
            method2851(84);
        }
        class212.method1242(-17088, 5);
        class378.method2277(-2995, 5);
        class326.method2014(0, 5);
        class365.method2194((byte) 15, 5);
        class269.method1674(-28, 5);
        class465.method2867(25882, 5);
        class382.method2308(5, 0);
        class229.method1391(64, 5);
        class432.method2651((byte) 13, 50);
        class358.method2152(5, true);
        class371.method2231(119, 5);
        class245.field3665.method1481(3, 5);
        class458.field6784.method1481(3, 5);
        class296.field4486.method1481(3, 5);
        class294.field4479.method1481(3, 5);
        class384.field5614.method1481(3, 5);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldc;I)V")
    public abstract void method1465(class13 arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdc;)V")
    public abstract void method1471(int arg0, class13 arg1);
}
