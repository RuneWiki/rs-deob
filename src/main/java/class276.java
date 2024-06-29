import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class276 extends class170 {

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    private int field4846 = 1024;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    private int field4851 = 2048;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    private int field4852 = 3072;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "[[I")
    public static int[][] field4839 = new int[104][104];

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Lqk;")
    public static class207 field4843 = class24.method212(255, "gelb:");

    @OriginalMember(owner = "client!g", name = "db", descriptor = "[[[Ldd;")
    public static class132[][][] field4844 = new class132[4][104][104];

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Lqk;")
    public static class207 field4849 = class24.method212(255, "<img=0>");

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Lqk;")
    private static class207 field4854 = class24.method212(255, "Loaded textures");

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Lqk;")
    public static class207 field4855 = class24.method212(255, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "Lqk;")
    public static class207 field4840 = field4854;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "Lqk;")
    public static class207 field4838 = class24.method212(255, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
    public static final void method1878(int arg0) {
        class252.field4534.method1382(31346);
        if (arg0 != 1024) {
            field4839 = null;
        }
        ++field4856;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field2998 = ~arg0.method1045((byte) -68) == -2;
                }
            } else {
                this.field4852 = arg0.method1050(1272006568);
            }
        } else {
            this.field4846 = arg0.method1050(arg1 ^ 1272009053);
        }
        ++field4837;
        if (arg1 != 5877) {
            field4848 = 89;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)V")
    public static void method1879(boolean arg0) {
        field4844 = null;
        field4839 = null;
        field4840 = null;
        field4855 = null;
        field4854 = null;
        if (arg0) {
            field4843 = null;
        }
        field4849 = null;
        field4838 = null;
        field4843 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Ldh;")
    public static final class119 method1880(int arg0, byte arg1) {
        ++field4847;
        class119 var2 = (class119) class51.field978.method758(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != -47) {
                field4848 = -106;
            }
            byte[] var3 = class207.field3681.method705(11, arg0, arg1 + 46);
            class119 var4 = new class119();
            if (var3 != null) {
                var4.method849(new class149(var3), 13289);
            }
            class51.field978.method759((long) arg0, 2, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (arg1) {
            this.method50(27);
        }
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, -83, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class88.field1595 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field4851 >> 12) + this.field4846;
                var9[var11] = this.field4846 - -(var7[var11] * this.field4851 >> 12);
                var10[var11] = this.field4846 - -(var6[var11] * this.field4851 >> 12);
            }
        }
        ++field4841;
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field4851 = -this.field4846 + this.field4852;
        ++field4853;
        if (arg0 <= 14) {
            field4838 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        int[] var3 = super.field3001.method1538(arg0 ^ -92, arg1);
        if (arg0 != -30) {
            method1879(false);
        }
        ++field4845;
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, -29);
            for (int var5 = 0; var5 < class88.field1595; ++var5) {
                var3[var5] = this.field4846 - -(var4[var5] * this.field4851 >> 12);
            }
        }
        return var3;
    }
}
