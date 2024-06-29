import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class170 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public volatile int field2239 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[B")
    public byte[] field2238 = new byte[5000];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public volatile int field2237 = 0;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[F")
    public float[] field2242 = new float[5000];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field2240 = 0;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field2246 = 0;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field2249 = new Object[5000];

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2243 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
    public static boolean field2245 = false;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "F")
    public static float field2244 = 0.0F;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lqa;")
    public static class243 field2248;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 16)
    public static void method1053(int arg0) {
        field2248 = null;
        field2243 = null;
        if (arg0 <= 58) {
            field2247 = -48;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lpm;B)V")
    public abstract void method265(class10 arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
    public abstract void method273(int arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
    public abstract void method274(int arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgm;FZIB)V")
    public abstract void method269(class337 arg0, float arg1, boolean arg2, int arg3, byte arg4);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILpm;)V")
    public abstract void method270(int arg0, class10 arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLpm;)V")
    public abstract void method264(byte arg0, class10 arg1);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public abstract void method268(int arg0);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public abstract void method271(int arg0);
}
