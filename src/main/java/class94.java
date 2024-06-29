import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class94 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static volatile int field1444 = -1;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[[[B")
    public static byte[][][] field1445;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 8)
    public static final void method640(int arg0) {
        field1447++;
        if (class120.field1844) {
            return;
        }
        if (class298.field4569) {
            class123.field1922 = (float) ((int) class123.field1922 - 65 & 0xFFFFFF80);
        } else {
            class228.field3656 += (-class228.field3656 - 24.0F) / 2.0F;
        }
        class120.field1844 = true;
        class171.field2602 = true;
        if (arg0 != -128) {
            method640(47);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfe;IIIZ)V", line = 32)
    public void method641(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1446++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lfe;", line = 44)
    public class94 method642(int arg0, int arg1, int arg2) {
        field1442++;
        return this;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()Z", line = 58)
    public boolean method643() {
        field1443++;
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 67)
    public static void method644(int arg0) {
        if (arg0 == -1) {
            field1445 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIJILcj;)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()I")
    public abstract int method112();

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
    public abstract void method113(int arg0, int arg1, int arg2, int arg3, int arg4);
}
