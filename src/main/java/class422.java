import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class422 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[B")
    public byte[] field6236 = new byte[5000];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field6237 = new Object[5000];

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field6238 = 0;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public volatile int field6242 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field6235 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public volatile int field6239 = 0;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[F")
    public float[] field6241 = new float[5000];

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[[[Lnt;")
    public static class148[][][] field6240;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 4)
    public static void method2588(byte arg0) {
        field6240 = null;
        if (arg0 < 116) {
            field6240 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public abstract void method1199(int arg0);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public abstract void method1203(int arg0);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public abstract void method1204(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lnt;B)V")
    public abstract void method1202(class148 arg0, byte arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public abstract void method1193(byte arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLnt;)V")
    public abstract void method1196(byte arg0, class148 arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZLta;FB)V")
    public abstract void method1197(int arg0, boolean arg1, class142 arg2, float arg3, byte arg4);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lnt;I)V")
    public abstract void method1201(class148 arg0, int arg1);
}
