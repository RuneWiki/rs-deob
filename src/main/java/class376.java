import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public abstract class class376 {

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "[B")
    public byte[] field5400 = new byte[5000];

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public int field5402 = 0;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "[F")
    public float[] field5403 = new float[5000];

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field5406 = new Object[5000];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public volatile int field5398 = 0;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public volatile int field5407 = 0;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public int field5405 = 0;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field5401 = 0;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lwr;I)V")
    public abstract void method47(class532 arg0, int arg1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lya;IZZF)V")
    public abstract void method41(class11 arg0, int arg1, boolean arg2, boolean arg3, float arg4);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILwr;)V")
    public abstract void method40(int arg0, class532 arg1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)V")
    public abstract void method39(byte arg0, int arg1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIII)V")
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 61) {
            method2249(-128, -100, 69, 36, 79, -69);
        }
        if (class76.field1075.field3651 != 0 && arg1 != 0 && class40.field602 < 50 && arg5 != -1) {
            class320.field4411[class40.field602++] = new class441((byte) 1, arg5, arg1, arg4, arg0, arg2);
        }
        field5404++;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
    public abstract void method48(int arg0, byte arg1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public abstract void method46(int arg0);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLwr;)V")
    public abstract void method51(byte arg0, class532 arg1);

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public abstract void method42(int arg0);
}
