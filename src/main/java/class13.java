import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 extends class73 {

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[[B")
    public static byte[][] field228 = new byte[1000][];

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lli;")
    public static class185 field229 = class245.method1649("Veuillez patienter )2 tentative de r-Btablissement)3", -44);

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lli;")
    public static class185 field236 = class245.method1649("cross", -35);

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lkc;")
    public static class29 field227;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field225;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "[[[I")
    public static int[][][] field230;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method106(int arg0) {
        field230 = null;
        field234 = null;
        field228 = null;
        if (arg0 != -9580) {
            method107(119);
        }
        field225 = null;
        field227 = null;
        field229 = null;
        field236 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class13() {
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static final void method107(int arg0) {
        class256.field4531 = 0;
        class191.field3542 = 0;
        class127.field2283 = 0;
        class217.field3976 = 0;
        class189.field3527 = -1;
        class280.field4950 = -1;
        class256.field4551 = arg0;
        class84.field1660 = -1;
        class112.field2027 = false;
        class12.field212 = -1;
        class182.field3349.field2155 = 0;
        class142.field2669.field2155 = 0;
        field231++;
        class166.field3104 = 0;
        for (int var1 = 0; var1 < class93.field1774.length; var1++) {
            if (class93.field1774[var1] != null) {
                class93.field1774[var1].field2665 = -1;
            }
        }
        for (int var2 = 0; var2 < class87.field1712.length; var2++) {
            if (class87.field1712[var2] != null) {
                class87.field1712[var2].field2665 = -1;
            }
        }
        class228.method1575(arg0 ^ 0xFF);
        class211.field3848 = 1;
        class276.method1892((byte) -120, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class44.field700[var3] = true;
        }
        class52.method350(105);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    public class13(int arg0) {
        this.field226 = arg0;
    }
}
