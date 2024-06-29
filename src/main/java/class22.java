import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class22 {

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[B")
    public byte[] field286 = new byte[5000];

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public volatile int field288 = 0;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field289 = 0;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "[F")
    public float[] field291 = new float[5000];

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field287 = 0;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public volatile int field292 = 0;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field290 = new Object[5000];

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Liu;")
    public static class390 field293 = new class390(88, 4);

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "Lfd;")
    public static class350 field294;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Log;IIFZ)V")
    public abstract void method148(class441 arg0, int arg1, int arg2, float arg3, boolean arg4);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLhg;)V")
    public abstract void method149(byte arg0, class468 arg1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lhg;I)V")
    public abstract void method150(class468 arg0, int arg1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static void method151(int arg0) {
        field293 = null;
        if (arg0 == 5000) {
            field294 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;I)Lot;")
    public static final class399 method152(Component arg0, int arg1) {
        field285++;
        return arg1 == 0 ? new class312(arg0) : null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public abstract void method153(int arg0, int arg1);

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
    public abstract void method154(int arg0, int arg1);

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(BLhg;)V")
    public abstract void method155(byte arg0, class468 arg1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public abstract void method156(byte arg0);

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public abstract void method157(int arg0);
}
