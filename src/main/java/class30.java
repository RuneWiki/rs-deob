import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends class119 {

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "[I")
    private int[] field631 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public int field625 = -1;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Z")
    public boolean field638 = false;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Lv;")
    private static class146 field623 = class159.method1226((byte) -37, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Lv;")
    public static class146 field621 = class159.method1226((byte) -37, " (X");

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lv;")
    private static class146 field628 = class159.method1226((byte) -37, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lv;")
    public static class146 field619 = field623;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Lv;")
    public static class146 field633 = class159.method1226((byte) -37, "scrollen:");

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lv;")
    public static class146 field636 = field628;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[I")
    public static int[] field617;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "[I")
    private int[] field632;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "[S")
    private short[] field624;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "[S")
    private short[] field626;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "[S")
    private short[] field630;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "[S")
    private short[] field634;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILne;I)V")
    private final void method202(int arg0, class95 arg1, int arg2) {
        field622++;
        if (arg2 != 22691) {
            method205(-52, true);
        }
        if (arg0 == 1) {
            this.field625 = arg1.method790((byte) 73);
        } else if (arg0 == 2) {
            int var4 = arg1.method790((byte) 73);
            this.field632 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field632[var5] = arg1.method795(1);
            }
        } else if (arg0 == 3) {
            this.field638 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method790((byte) 73);
            this.field634 = new short[var8];
            this.field630 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field634[var9] = (short) arg1.method795(1);
                this.field630[var9] = (short) arg1.method795(class79.method609(arg2, 22690));
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method790((byte) 73);
            this.field626 = new short[var6];
            this.field624 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field626[var7] = (short) arg1.method795(1);
                this.field624[var7] = (short) arg1.method795(arg2 - 22690);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field631[arg0 - 60] = arg1.method795(1);
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILne;)V")
    public final void method203(int arg0, class95 arg1) {
        if (arg0 != -6) {
            method205(-100, true);
        }
        while (true) {
            int var3 = arg1.method790((byte) 73);
            if (var3 == 0) {
                field629++;
                return;
            }
            this.method202(var3, arg1, 22691);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Z")
    public final boolean method204(byte arg0) {
        field627++;
        boolean var2 = true;
        if (arg0 != -93) {
            return true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field631[var3] != -1 && !class66.field1492.method594(this.field631[var3], 1429, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public static final void method205(int arg0, boolean arg1) {
        field637++;
        if (class1.field8 == null) {
            return;
        }
        try {
            class95 var2 = new class95(4);
            var2.method791(false, arg1 ? 2 : 3);
            var2.method768((byte) 111, 0);
            class1.field8.method1078(arg0, 1, 4, var2.field2320);
        } catch (IOException var4) {
            try {
                class1.field8.method1071((byte) 98);
            } catch (Exception var3) {
            }
            class1.field8 = null;
            class101.field2459++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Z")
    public final boolean method206(byte arg0) {
        field635++;
        if (arg0 != -37) {
            return false;
        } else if (this.field632 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field632.length; var3++) {
                if (!class66.field1492.method594(this.field632[var3], 1429, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Lsd;")
    public final class129 method207(int arg0) {
        class129[] var2 = new class129[5];
        int var3 = 0;
        field618++;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field631[var4] != -1) {
                var2[var3++] = class129.method957(class66.field1492, this.field631[var4], 0);
            }
        }
        class129 var5 = new class129(var2, var3);
        if (this.field634 != null) {
            for (int var6 = 0; var6 < this.field634.length; var6++) {
                var5.method966(this.field634[var6], this.field630[var6]);
            }
        }
        if (this.field626 != null) {
            for (int var7 = 0; var7 < this.field626.length; var7++) {
                var5.method964(this.field626[var7], this.field624[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public static void method208(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field628 = null;
        field617 = null;
        field619 = null;
        field633 = null;
        field621 = null;
        field636 = null;
        field623 = null;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)Lsd;")
    public final class129 method209(int arg0) {
        if (arg0 != 32734) {
            return null;
        }
        field639++;
        if (this.field632 == null) {
            return null;
        }
        class129[] var2 = new class129[this.field632.length];
        for (int var3 = 0; var3 < this.field632.length; var3++) {
            var2[var3] = class129.method957(class66.field1492, this.field632[var3], 0);
        }
        class129 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class129(var2, var2.length);
        }
        if (this.field634 != null) {
            for (int var5 = 0; var5 < this.field634.length; var5++) {
                var4.method966(this.field634[var5], this.field630[var5]);
            }
        }
        if (this.field626 != null) {
            for (int var6 = 0; var6 < this.field626.length; var6++) {
                var4.method964(this.field626[var6], this.field624[var6]);
            }
        }
        return var4;
    }
}
