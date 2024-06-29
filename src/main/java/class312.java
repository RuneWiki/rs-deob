import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class312 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public volatile int field4262 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field4264 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[Ljava/lang/Object;")
    public Object[] field4266 = new Object[5000];

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field4265 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[B")
    public byte[] field4273 = new byte[5000];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[F")
    public float[] field4269 = new float[5000];

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public volatile int field4276 = 0;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[S")
    public static short[] field4272 = new short[256];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
    public static int[] field4270 = new int[14];

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public static int[] field4274 = new int[8];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "F")
    public static float field4267;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lnq;")
    public static class268 field4275;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Z")
    public static boolean field4271;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljd;Z)V")
    public abstract void method2006(class125 arg0, boolean arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjd;)V")
    public abstract void method2007(byte arg0, class125 arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FILij;ZI)V")
    public abstract void method2008(float arg0, int arg1, class242 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjd;)V")
    public abstract void method2009(int arg0, class125 arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
    public abstract void method2010(byte arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public abstract void method2011(int arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public abstract void method2012(boolean arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public abstract void method2013(int arg0);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method2014(int arg0) {
        field4274 = null;
        field4270 = null;
        if (arg0 != 8) {
            field4270 = null;
        }
        field4272 = null;
        field4275 = null;
    }
}
