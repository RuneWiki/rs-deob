import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class449 {

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "[I")
    public static int[] field6391;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field6395;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "[I")
    public static int[] field6396;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "[I")
    public static int[] field6393;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[I")
    public static int[] field6392;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
    public static int[] field6389;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "[I")
    public static int[] field6394;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "J")
    public long field6382;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Lrf;")
    public static class106 field6390;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lrs;")
    public class449 field6385;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lrs;")
    public class449 field6388;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2713(int arg0) {
        field6396 = null;
        if (arg0 != -21041) {
            method2713(63);
        }
        field6391 = null;
        field6394 = null;
        field6393 = null;
        field6395 = null;
        field6389 = null;
        field6392 = null;
        field6390 = null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public final void method2714(int arg0) {
        field6384++;
        if (this.field6388 == null) {
            return;
        }
        int var2 = -53 % ((arg0 + 4) / 43);
        this.field6388.field6385 = this.field6385;
        this.field6385.field6388 = this.field6388;
        this.field6385 = null;
        this.field6388 = null;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)Z")
    public final boolean method2715(int arg0) {
        if (arg0 >= -87) {
            field6390 = null;
        }
        field6383++;
        return this.field6388 != null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIB)V")
    public static final void method2716(int arg0, int arg1, int arg2, byte arg3) {
        field6387++;
        if (arg3 >= -45) {
            field6396 = null;
        }
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class353.method2176(true, -68, var4);
    }

    static {
        new class151("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field6397 = 50;
        field6391 = new int[field6397];
        field6395 = new String[field6397];
        field6396 = new int[field6397];
        field6393 = new int[field6397];
        field6392 = new int[field6397];
        field6389 = new int[field6397];
        field6394 = new int[field6397];
    }
}
