import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class37 extends class217 {

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lnc;")
    private final class125 field638;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "Lvb;")
    public final class44 field639;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Llc;")
    public static class143 field634 = null;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Llc;")
    public static class143 field642 = class66.method374(" de votre liste d(Wamis)3", -1);

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "Llc;")
    public static class143 field650 = class66.method374("loginscreen", -1);

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Llc;")
    public static class143 field654 = class66.method374(" s(West d-Bconnect-B)3", -1);

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "Llc;")
    private static class143 field655 = class66.method374("Loaded textures", -1);

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "Llc;")
    public static class143 field652 = class66.method374("<col=00ff80>", -1);

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "Llc;")
    public static class143 field657 = field655;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[I")
    public static int[] field636;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method243(byte arg0) {
        if (arg0 > -16) {
            return;
        }
        field654 = null;
        field634 = null;
        field636 = null;
        field642 = null;
        field657 = null;
        field650 = null;
        field652 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
    public final void method244(int arg0, int arg1, int arg2, int arg3) {
        this.field651 = arg2;
        this.field641 = arg1;
        if (arg0 != 24003) {
            this.field641 = 23;
        }
        this.field637 = arg3;
        field647++;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lvb;Lnc;)V")
    public class37(class44 arg0, class125 arg1) {
        this.field638 = arg1;
        this.field639 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lgf;Lgf;BLgf;Lgf;)V")
    public static final void method245(class7 arg0, class7 arg1, byte arg2, class7 arg3, class7 arg4) {
        class51.field1006 = arg1;
        class263.field4705 = arg4;
        class7.field127 = arg3;
        field658++;
        class40.field686 = arg0;
        class223.field4045 = new class43[class263.field4705.method32((byte) -13)][];
        int var5 = 117 % ((arg2 - 74) / 34);
        class254.field4559 = new boolean[class263.field4705.method32((byte) -36)];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIZI)Llc;")
    public static final class143 method246(byte arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != 43) {
            return null;
        }
        field643++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg3 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg3 /= arg1;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class143 var9 = new class143();
        var9.field2548 = var6;
        var9.field2503 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([S[Llc;B)V")
    public static final void method247(short[] arg0, class143[] arg1, byte arg2) {
        class113.method678(arg1.length - 1, 0, arg1, arg0, 2);
        if (arg2 > 45) {
            field646++;
        }
    }
}
