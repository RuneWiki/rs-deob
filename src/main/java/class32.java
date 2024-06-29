import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class32 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[B")
    public byte[] field362 = new byte[5000];

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field364 = 0;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field372 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Ljava/lang/Object;")
    public Object[] field365 = new Object[5000];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public volatile int field363 = 0;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[F")
    public float[] field373 = new float[5000];

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public volatile int field369 = 0;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field366 = 2;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field371 = 13156520;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method199(int arg0, int arg1) {
        field367++;
        class20 var2 = class369.method2351((byte) 80, arg0, arg1);
        var2.method148(arg0 ^ 0xFFFFD1EA);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILak;)V")
    public abstract void method200(int arg0, class193 arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public abstract void method201(int arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZII)Lce;")
    public static final class167 method202(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field368++;
        if (arg0 != -336) {
            field366 = -95;
        }
        class167 var5 = new class167();
        var5.field2332 = arg3;
        var5.field2338 = arg1;
        class22.field280.method1886(var5, (long) arg4, 1);
        class89.method495(arg3, 120);
        class184 var6 = class282.method1863(arg4, -25835);
        if (var6 != null) {
            class186.method1277(var6, (byte) -116);
        }
        if (class59.field709 != null) {
            class186.method1277(class59.field709, (byte) 77);
            class59.field709 = null;
        }
        class156.method936((byte) -121);
        if (var6 != null) {
            class384.method2466(!arg2, var6, (byte) -90);
        }
        if (!arg2) {
            class201.method1331(arg3);
        }
        if (!arg2 && class248.field3548 != -1) {
            class94.method524(1, 0, class248.field3548);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lak;Z)V")
    public abstract void method203(class193 arg0, boolean arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZFBLgh;)V")
    public abstract void method204(int arg0, boolean arg1, float arg2, byte arg3, class327 arg4);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILak;)V")
    public abstract void method205(int arg0, class193 arg1);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public abstract void method206(int arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public abstract void method207(int arg0);

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)V")
    public abstract void method208(int arg0, int arg1);
}
