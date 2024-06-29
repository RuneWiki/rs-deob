import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class775 extends class101 {

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
    public static int[] field10668 = new int[1];

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
    public static int[] field10669 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
    public static int[] field10670 = new int[1000];

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field10667;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field10671;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method4296(int arg0) {
        if (arg0 <= 6) {
            field10668 = null;
        }
        field10669 = null;
        field10670 = null;
        field10668 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method4297(String arg0, int arg1) {
        field10671++;
        class267 var2 = class731.method4058(93);
        var2.field3938.method2380(65280, class628.field8796.field4282);
        var2.field3938.method2415(false, 0);
        int var3 = var2.field3938.field5459;
        var2.field3938.method2415(false, 649);
        int[] var4 = class283.method1815((byte) 27, var2);
        int var5 = var2.field3938.field5459;
        if (arg1 != 28690) {
            method4296(-73);
        }
        var2.field3938.method2349(54, arg0);
        var2.field3938.method2380(65280, class38.field589);
        var2.field3938.field5459 += 7;
        var2.field3938.method2353(-141, var2.field3938.field5459, var5, var4);
        var2.field3938.method2395(var2.field3938.field5459 - var3, 0);
        class617.method3392(var2, true);
        class418.field5997 = 0;
        class268.field3949 = 1;
        class378.field5531 = 0;
        class275.field4090 = -3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lsja;)V")
    public static final void method4298(class11 arg0) {
        class201.field2670 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjp;)V")
    public abstract void method2934(int arg0, class376 arg1);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLhka;)V")
    public abstract void method2935(byte arg0, class56 arg1);
}
