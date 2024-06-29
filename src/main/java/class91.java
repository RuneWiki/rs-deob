import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class91 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lhc;")
    public static class368 field1273 = new class368("yellow:", "", "", "");

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    public static int[] field1279 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lij;")
    public static class316 field1278;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[[[B")
    public static byte[][][] field1276;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZI)V")
    public static final void method719(int arg0, int arg1, boolean arg2, int arg3) {
        field1268++;
        if (arg2) {
            field1279 = null;
        }
        class141 var4 = class389.field5423[arg0][arg1];
        class186.method1299((byte) 121, var4 == null ? class367.field5098 : var4, arg3);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public static final void method720(int arg0, byte arg1) {
        field1277++;
        if (arg0 == -1 || !class435.field6147[arg0]) {
            return;
        }
        int var2 = 102 % ((37 - arg1) / 60);
        class152.field2190.method1920(-98, arg0);
        if (class103.field1425[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class103.field1425[arg0].length; var4++) {
            if (class103.field1425[arg0][var4] != null) {
                if (class103.field1425[arg0][var4].field1666 == 2) {
                    var3 = false;
                } else {
                    class103.field1425[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class103.field1425[arg0] = null;
        }
        class435.field6147[arg0] = false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lij;I)V")
    public static final void method721(class316 arg0, int arg1) {
        class53.field684 = arg0;
        int var2 = -46 / ((31 - arg1) / 57);
        field1272++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
    public abstract void method362(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method722(byte arg0) {
        field1278 = null;
        field1276 = null;
        field1279 = null;
        field1273 = null;
        int var1 = 88 % ((arg0 + 5) / 59);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public abstract void method363(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
    public abstract void method367(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method723(int arg0) {
        if (arg0 >= -18) {
            field1278 = null;
        }
        field1269++;
        class353.field4750.method2522((byte) 28);
        class39.field519.method2522((byte) 56);
        class296.field4067.method2522((byte) 25);
        class372.field5158.method2522((byte) 105);
        class221.field3106.method2522((byte) 60);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(III)V")
    public class91(int arg0, int arg1, int arg2) {
        this.field1271 = arg2;
        this.field1275 = arg0;
        this.field1270 = arg1;
    }
}
