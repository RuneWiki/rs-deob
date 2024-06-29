import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class117 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public int field1503 = 0;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[B")
    public byte[] field1501 = new byte[5000];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field1506 = new Object[5000];

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public volatile int field1505 = 0;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public int field1504 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public volatile int field1502 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[[B")
    public static byte[][] field1507;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 24)
    public static void method882(boolean arg0) {
        field1507 = null;
        if (!arg0) {
            field1507 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public abstract void method875(int arg0, int arg1);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V")
    public abstract void method876(int arg0, int arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public abstract void method877(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILgn;)V")
    public abstract void method878(int arg0, class530 arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZBLd;I)V")
    public abstract void method879(boolean arg0, byte arg1, class88 arg2, int arg3);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public abstract void method880(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lgn;I)V")
    public abstract void method881(class530 arg0, int arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lgn;Z)V")
    public abstract void method883(class530 arg0, boolean arg1);
}
