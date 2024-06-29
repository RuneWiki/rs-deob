import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class187 extends class328 {

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    private int field2699 = 4096;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    private int field2704 = 0;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field2701 = -1;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "[[I")
    public static int[][] field2702 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field2703;

    static {
        new class567("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method4(int arg0, int arg1) {
        ++field2700;
        int var3 = -77 % ((arg1 - 48) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            for (int var6 = 0; ~class449.field6539 < ~var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = this.field2704 <= var7 && this.field2699 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1251(boolean arg0) {
        field2702 = null;
        if (arg0) {
            field2702 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 47)
    public class187() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IC)Z", line = 57)
    public static final boolean method1252(int arg0, char arg1) {
        ++field2698;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class173.method1190(arg1, 28202)) {
            return true;
        } else {
            int var2 = 94 / ((arg0 - -8) / 61);
            char[] var3 = class356.field5082;
            for (int var4 = 0; var3.length > var4; ++var4) {
                char var8 = var3[var4];
                if (arg1 == var8) {
                    return true;
                }
            }
            char[] var5 = class314.field4579;
            for (int var6 = 0; ~var5.length < ~var6; ++var6) {
                char var7 = var5[var6];
                if (arg1 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BILco;)V", line = 110)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 < 75) {
            method1251(true);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2699 = arg2.method1745(32132);
            }
        } else {
            this.field2704 = arg2.method1745(32132);
        }
        ++field2703;
    }
}
