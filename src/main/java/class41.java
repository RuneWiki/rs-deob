import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class41 extends class297 {

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "[Lma;")
    public static class5[] field616 = new class5[100];

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Lma;")
    public static class5 field620 = class12.method119("sl_flags", (byte) 115);

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Lwd;")
    public class108 field637;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Lni;")
    public static class202 field627;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lvi;")
    public static class211 field619;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Lda;")
    public class26 field626;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Ldi;")
    public class46 field617;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Lae;")
    public class97 field621;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[I")
    public static int[] field628;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V", line = 8)
    public static void method289(boolean arg0) {
        if (arg0) {
            return;
        }
        field628 = null;
        field627 = null;
        field616 = null;
        field619 = null;
        field620 = null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V", line = 37)
    public final void method290(byte arg0) {
        field625++;
        this.field626 = null;
        this.field637 = null;
        this.field617 = null;
        if (arg0 > -11) {
            this.field624 = -4;
        }
        this.field621 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLma;)Z", line = 56)
    public static final boolean method291(boolean arg0, class5 arg1) {
        field632++;
        try {
            int var2 = arg1.method58(0, 44);
            if (var2 == -1) {
                return false;
            }
            class5 var3 = arg1.method76(0, 0, var2);
            class5 var4 = arg1.method78(-24938, var2 + 1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            if (arg0) {
                return true;
            }
            var5.update(var3.method67(97));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method44(13661);
            class221 var8 = new class221(5000);
            var8.method1531(0, -74, var7.length, var7);
            var8.field3610 = 0;
            var8.method1514(class65.field1024, client.field1755, -3579);
            if (var8.field3617[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field3617[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var11) {
            return false;
        }
    }
}
