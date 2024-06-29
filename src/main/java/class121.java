import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class121 implements Runnable {

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "[Ldc;")
    public volatile class167[] field1693 = new class167[2];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Z")
    public volatile boolean field1687 = false;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
    public volatile boolean field1691 = false;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field1695 = 1407;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Z")
    public static boolean field1697;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Ldq;")
    public class14 field1690;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Lfn;")
    public static class52 field1698;

    static {
        new class112("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field1697 = false;
        field1696 = 0;
        new class112("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I", line = 3)
    public static final int method753(boolean arg0, int arg1, int arg2) {
        field1694++;
        if (arg2 == 1 || arg2 == 3) {
            return class162.field2333[arg1 & 0x3];
        } else {
            if (!arg0) {
                method753(true, -11, 48);
            }
            return class211.field2975[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!cq", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        this.field1691 = true;
        field1689++;
        try {
            while (!this.field1687) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class167 var2 = this.field1693[var1];
                    if (var2 != null) {
                        var2.method1034(-14480);
                    }
                }
                class258.method1603(-649, 10L);
                class145.method895(this.field1690, -96, (Object) null);
            }
        } catch (Exception var9) {
            class181.method1190((byte) -82, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field1691 = false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 54)
    public static void method754(int arg0) {
        field1698 = null;
        if (arg0 != 0) {
            field1695 = 72;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 65)
    public static final void method755(int arg0) {
        field1688++;
        int var1 = class163.field2345;
        int[] var2 = class482.field6800;
        for (int var3 = arg0; var3 < var1; var3++) {
            class23 var4 = class310.field4235[var2[var3]];
            if (var4 != null) {
                class308.method1863(false, var4.method206(0), var4);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZBII)V", line = 89)
    public static final void method756(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (class221.field3118 == 0) {
            class432.method2527(arg2 + 20780, false);
        } else {
            class283.field3890 = class221.field3118;
            class336.method2003(5, 0);
        }
        field1692++;
        class120.field1684 = arg1;
        if (arg2 != 29) {
            field1696 = 4;
        }
        class250.field3515 = arg3;
        class63.field968 = arg0;
        class379.method2259(arg4);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Lde;", line = 114)
    public static final class99 method757(int arg0) {
        field1686++;
        class99 var1 = (class99) class191.field2722.method2820(0);
        if (var1 == null) {
            if (arg0 != 20136) {
                method754(-13);
            }
            return new class99();
        } else {
            class299.field4116--;
            return var1;
        }
    }
}
