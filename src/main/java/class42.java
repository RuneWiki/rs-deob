import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class42 {

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
    private int[] field508;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "[I")
    public static int[] field510 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lsd;")
    public static class74 field504 = new class74(28, 3);

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field511 = 0;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[B")
    public static byte[] field513 = new byte[2048];

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Lkd;")
    public static class355 field512;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public final int method210(int arg0, int arg1) {
        field505++;
        if (arg1 != 0) {
            return -109;
        }
        int var3 = (this.field508.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field508[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field508[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)[Lss;")
    public static final class140[] method211(int arg0) {
        if (arg0 == 0) {
            field509++;
            return new class140[] { class259.field3734, class357.field5134, class22.field303, class67.field840, class41.field496, class409.field5798, class340.field4884, class239.field3297, class210.field2920, class409.field5797, class193.field2649, class418.field6015, class108.field1303, class2.field15, class406.field5768 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)[Ldb;")
    public static final class29[] method212(int arg0) {
        if (arg0 >= -23) {
            field511 = 50;
        }
        field507++;
        return new class29[] { class414.field5904, class258.field3733, class157.field1872, class451.field6387, class142.field1725 };
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
    public static void method213(int arg0) {
        field512 = null;
        field510 = null;
        field504 = null;
        if (arg0 != 1) {
            method213(1);
        }
        field513 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field508 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field508[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field508[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field508[var5 + var5] = arg0[var4];
            this.field508[var5 + var5 + 1] = var4++;
        }
    }

    static {
        new class40("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
