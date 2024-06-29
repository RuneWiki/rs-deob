import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class232 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[F")
    public float[] field3077 = new float[5000];

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field3080 = new Object[5000];

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "[B")
    public byte[] field3079 = new byte[5000];

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public int field3076 = 0;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public int field3078 = 0;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public volatile int field3083 = 0;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public volatile int field3084 = 0;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
    public static int[] field3075 = new int[14];

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "[[I")
    public static int[][] field3081 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 20)
    public static void method1296(int arg0) {
        field3075 = null;
        int var1 = -20 / ((arg0 - 53) / 53);
        field3081 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lmr;I)V", line = 31)
    public static final void method1297(class86 arg0, int arg1) {
        if (arg0 instanceof class121) {
            class121 var2 = (class121) arg0;
            if (var2.field1780 != null) {
                class294.method1650(var2, class233.field3103.field6502 != var2.field6502, true);
            }
        } else if (arg0 instanceof class487) {
            class487 var3 = (class487) arg0;
            class216.method1229(class233.field3103.field6502 != var3.field6502, var3, -1);
        }
        field3082++;
        if (arg1 != 28567) {
            field3075 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ltf;ZFII)V")
    public abstract void method1109(class177 arg0, boolean arg1, float arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
    public abstract void method1108(int arg0, int arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lf;B)V")
    public abstract void method1105(class491 arg0, byte arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V")
    public abstract void method1106(byte arg0, int arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lf;I)V")
    public abstract void method1107(class491 arg0, int arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILf;)V")
    public abstract void method1103(int arg0, class491 arg1);

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public abstract void method1112(int arg0);

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public abstract void method1111(int arg0);
}
