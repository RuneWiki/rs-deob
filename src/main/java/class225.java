import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class225 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3387 = new String[100];

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lai;")
    public static class331 field3391 = class16.method101(-1);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
    public static int[] field3396 = new int[50];

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lrn;")
    public class308 field3394;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    public int[] field3388;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[I")
    public static int[] field3397;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[[B")
    public static byte[][] field3385;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 11)
    public static final int method1646(int arg0, String arg1) {
        if (arg0 >= -10) {
            method1646(-81, (String) null);
        }
        field3389++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1647(int arg0, int arg1) {
        if (class359.field5514 == arg1 && arg1 != 0) {
            class163 var2 = class85.field1204[arg1];
            var2.method286(class197.field2858);
        }
        field3392++;
        if (arg0 != 30750) {
            field3396 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 43)
    public static void method1648(int arg0) {
        if (arg0 != -1) {
            field3396 = (int[]) null;
        }
        field3385 = (byte[][]) null;
        field3396 = null;
        field3391 = null;
        field3387 = null;
        field3397 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V", line = 65)
    public static final void method1649(int arg0, int arg1) {
        class355.method2468(0);
        class88.method704((byte) 83);
        field3386++;
        if (arg1 != 100) {
            field3395 = 26;
        }
        int var2 = class262.method1946(arg0, 118).field188;
        if (var2 == 0) {
            return;
        }
        int var3 = class227.field3423[arg0];
        if (var2 == 6) {
            class149.field2171 = var3;
        }
        if (var2 == 9) {
            class344.field5332 = var3;
        }
        if (var2 == 5) {
            class257.field3851 = var3;
        }
    }
}
