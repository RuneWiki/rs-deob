import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class293 {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[F")
    public float[] field4357 = new float[5000];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field4351 = 0;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public volatile int field4352 = 0;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public volatile int field4354 = 0;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field4358 = new Object[5000];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[B")
    public byte[] field4353 = new byte[5000];

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public int field4362 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    public static int[] field4355 = new int[14];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field4350 = new int[5];

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4361 = new String[100];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Z")
    public static boolean field4359 = false;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lg;")
    public static class470 field4360;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[[[Lqa;")
    public static class263[][][] field4356;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public abstract void method710(int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lqa;I)V")
    public abstract void method715(class263 arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public abstract void method716(int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public abstract void method708(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I")
    public static int method1843(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
    public abstract void method706(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLmi;F)V")
    public abstract void method709(int arg0, int arg1, boolean arg2, class443 arg3, float arg4);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILqa;)V")
    public abstract void method713(int arg0, class263 arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1844(byte arg0) {
        int var1 = 94 / ((arg0 - 24) / 49);
        field4350 = null;
        field4356 = null;
        field4360 = null;
        field4361 = null;
        field4355 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lqa;I)V")
    public abstract void method714(class263 arg0, int arg1);
}
