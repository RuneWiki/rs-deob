import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class49 extends class120 {

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "[Ljh;")
    public class284[] field643 = new class284[5];

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "[I")
    public int[] field645 = new int[5];

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public int field650 = 0;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Ldl;")
    public static class123 field625;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Ldl;")
    public static class123 field633;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lcg;")
    public static class166 field628;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Ldb;")
    public class17 field635;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Lhb;")
    public class215 field638;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lca;")
    public class264 field631;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lsj;")
    public class49 field636;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Lja;")
    public class59 field630;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Ltb;")
    public class69 field627;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Leh;")
    public class81 field632;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
    public boolean field629;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Z")
    public boolean field642;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Z")
    public boolean field649;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static final void method361(byte arg0) {
        for (class35 var1 = (class35) class2.field22.method671(0); var1 != null; var1 = (class35) class2.field22.method666(-123)) {
            int var2 = var1.field456;
            if (class74.method509(var2, 0)) {
                class214[] var3 = class104.field1608[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3360;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1750;
                    class214 var7 = class206.method1403((byte) 7, var6);
                    if (var7 != null) {
                        class55.method397(0, var7);
                    }
                }
            }
        }
        if (arg0 <= -9) {
            field648++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method362(byte arg0) {
        if (arg0 != -86) {
            method361((byte) -116);
        }
        field628 = null;
        field625 = null;
        field633 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(III)V")
    public class49(int arg0, int arg1, int arg2) {
        this.field640 = arg1;
        this.field647 = arg2;
        this.field644 = this.field634 = arg0;
    }
}
