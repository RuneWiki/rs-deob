import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class293 {

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "[Lks;")
    public static class373[] field4036 = new class373[2048];

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Z")
    public static boolean field4042 = false;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "Lh;")
    public static class572 field4045 = new class572("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Lip;")
    public class607 field4040;

    static {
        new class572("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 10)
    public static void method1801(int arg0) {
        field4036 = null;
        field4045 = null;
        if (arg0 != 2) {
            field4045 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Lqm;", line = 21)
    public final synchronized class126 method1802(int arg0) {
        int var2 = 117 / ((arg0 + 70) / 36);
        field4044++;
        class126 var3 = (class126) this.field4040.field9019.method842(0, (long) this.field4043);
        if (var3 != null) {
            return var3;
        }
        class126 var4 = class126.method896(this.field4040.field9018, this.field4043, 0);
        if (var4 != null) {
            this.field4040.field9019.method835((byte) 118, (long) this.field4043, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 42)
    public static final void method1803(int arg0, int arg1) {
        field4034++;
        class221 var2 = class65.method413(3, arg0, (byte) -86);
        if (arg1 != -1807) {
            method1805(null, (byte) 114, null);
        }
        var2.method1432(arg1 + 1807);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLgw;)V", line = 55)
    public final void method1804(byte arg0, class148 arg1) {
        if (arg0 > -9) {
            this.method1804((byte) -8, null);
        }
        field4037++;
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                return;
            }
            this.method1806(arg1, (byte) 107, var3);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 84)
    public static final void method1805(String[] arg0, byte arg1, short[] arg2) {
        field4041++;
        class89.method668(1, arg2, arg0.length - 1, 0, arg0);
        int var3 = -49 / ((50 - arg1) / 61);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lgw;BI)V", line = 100)
    private final void method1806(class148 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4043 = arg0.method1045(true);
        } else if (arg2 == 2) {
            this.field4038 = arg0.method1032((byte) -33);
            this.field4039 = arg0.method1032((byte) -33);
        }
        if (arg1 < 101) {
            this.field4040 = null;
        }
        field4035++;
    }
}
