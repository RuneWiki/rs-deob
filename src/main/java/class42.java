import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class42 extends class243 {

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    private int field691 = -1;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "[Lnj;")
    public static class226[] field684 = new class226[2048];

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lub;")
    private static class227 field683 = class257.method1749("yellow:", 17263);

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "J")
    public static long field687 = 0L;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Lub;")
    public static class227 field694 = field683;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Lub;")
    public static class227 field696 = class257.method1749("Clientscript error in: ", 17263);

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "[I")
    public static int[] field692 = new int[2000];

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "Lub;")
    public static class227 field701 = field683;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Lbc;")
    public static class201 field688 = new class201(32);

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "Lii;")
    public static class183 field702;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "[I")
    private int[] field693;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, false);
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static void method225(int arg0) {
        field692 = null;
        field688 = null;
        field696 = null;
        field684 = null;
        field702 = null;
        if (arg0 == 2006939652) {
            field701 = null;
            field694 = null;
            field683 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field698;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771 && this.method226((byte) -117)) {
            int[] var4 = var3[0];
            int var5 = this.field695 * (~class193.field3280 != ~this.field690 ? this.field690 * arg1 / class193.field3280 : arg1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class212.field3586 == ~this.field695) {
                for (int var8 = 0; class212.field3586 > var8; ++var8) {
                    int var9 = this.field693[var5++];
                    var7[var8] = class76.method446(255, var9) << 4;
                    var6[var8] = class76.method446(var9, 65280) >> 4;
                    var4[var8] = class76.method446(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class212.field3586 > var10; ++var10) {
                    int var11 = this.field695 * var10 / class212.field3586;
                    int var12 = this.field693[var5 + var11];
                    var7[var10] = class76.method446(var12, 255) << 4;
                    var6[var10] = class76.method446(65280, var12) >> 4;
                    var4[var10] = class76.method446(4080, var12 >> 12);
                }
            }
        }
        if (arg0 != 230) {
            this.method228(-10);
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)Z")
    private final boolean method226(byte arg0) {
        ++field699;
        if (this.field693 != null) {
            return true;
        } else if (~this.field691 <= -1) {
            int var2 = class212.field3586;
            int var3 = class193.field3280;
            int var4 = !class225.field3837.method42(this.field691, (byte) 65) ? 128 : 64;
            this.field693 = class225.field3837.method39(111, this.field691);
            this.field695 = var4;
            this.field690 = var4;
            class245.method1636(var2, (byte) 7, var3);
            return this.field693 != null;
        } else {
            return arg0 != -117 ? false : false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method81((class226) null, false, 81);
        }
        ++field697;
        if (~arg2 == -1) {
            this.field691 = arg0.method1447(0);
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public final void method227(int arg0) {
        super.method227(arg0);
        this.field693 = null;
        if (arg0 != 256) {
            this.method226((byte) 50);
        }
        ++field700;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I")
    public final int method228(int arg0) {
        if (arg0 != -23565) {
            this.method81((class226) null, false, 54);
        }
        ++field686;
        return this.field691;
    }
}
