import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class160 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llc;ZLlc;)V", line = 5)
    public static final void method1059(class175 arg0, boolean arg1, class175 arg2) {
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        field2209++;
        class316.field4873 = arg2;
        class61.field748 = arg0;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        if (arg1) {
            field2208 = -45;
        }
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class316.field4873.method1197(-79, 34);
        class61.field756 = var4 + var6;
        class142.field1991 = var5 + var6;
        class133.field1821 = var3 + var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BC)C", line = 30)
    public static final char method1060(byte arg0, char arg1) {
        field2210++;
        if (arg0 != -48) {
            method1060((byte) 102, (char) 65504);
        }
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[B")
    public abstract byte[] method612(byte arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)V")
    public abstract void method611(int arg0, byte[] arg1);
}
