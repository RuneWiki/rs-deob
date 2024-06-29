import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class class208 {

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field2787 = new Object[5000];

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public volatile int field2785 = 0;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public int field2790 = 0;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public int field2786 = 0;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public volatile int field2789 = 0;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "[B")
    public byte[] field2788 = new byte[5000];

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "[I")
    public static int[] field2791 = new int[25];

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Lkca;")
    public static class73 field2792 = new class73(25, 7);

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "Lkca;")
    public static class73 field2794 = new class73(0, 2);

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Z")
    public static boolean field2795 = false;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 48)
    public static void method1324(byte arg0) {
        field2792 = null;
        field2791 = null;
        field2794 = null;
        if (arg0 != -77) {
            field2794 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLuaa;)V")
    public abstract void method736(boolean arg0, class99 arg1);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Luaa;Z)V")
    public abstract void method742(class99 arg0, boolean arg1);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
    public abstract void method739(boolean arg0);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)V")
    public abstract void method738(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
    public abstract void method741(int arg0, int arg1);

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(Z)V")
    public abstract void method734(boolean arg0);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ld;IBZ)V")
    public abstract void method735(class132 arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Luaa;B)V")
    public abstract void method740(class99 arg0, byte arg1);
}
