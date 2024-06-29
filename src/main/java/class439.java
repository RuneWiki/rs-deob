import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class439 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[Ljava/lang/Object;")
    public Object[] field6031 = new Object[5000];

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[F")
    public float[] field6038 = new float[5000];

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[B")
    public byte[] field6040 = new byte[5000];

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field6034 = 0;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field6036 = 0;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public volatile int field6037 = 0;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public volatile int field6039 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
    public static int[] field6041 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method2683(byte arg0) {
        field6041 = null;
        if (arg0 != 16) {
            method2684(false, 83, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLip;FZI)V")
    public abstract void method283(boolean arg0, class279 arg1, float arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILsq;)V")
    public abstract void method282(int arg0, class316 arg1);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public abstract void method286(byte arg0);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLsq;)V")
    public abstract void method291(byte arg0, class316 arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public abstract void method297(int arg0);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public abstract void method294(int arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public abstract void method298(int arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lsq;I)V")
    public abstract void method295(class316 arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method2684(boolean arg0, int arg1, byte[] arg2) {
        field6033++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class65.field783) {
            try {
                class412 var3 = (class412) Class.forName("dl").getDeclaredConstructor().newInstance();
                var3.method500(4787, arg2);
                return var3;
            } catch (Throwable var4) {
                class65.field783 = true;
            }
        }
        if (arg1 >= -9) {
            field6041 = null;
        }
        return arg0 ? class304.method1928((byte) -9, arg2) : arg2;
    }
}
