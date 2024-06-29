import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class754 {

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
    private boolean field10495;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    private boolean field10489;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field10485;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field10487;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[Lvi;")
    public static class302[] field10491 = new class302[300];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lwt;")
    public static class522 field10496;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILol;)V")
    public static final void method4157(int arg0, class431 arg1) {
        for (int var2 = 0; var2 < class720.field10051; var2++) {
            int var3 = arg1.method2527((byte) -24);
            int var4 = arg1.method2565((byte) -101);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class142.field2319[var3] != null) {
                class142.field2319[var3].field2299 = var4;
            }
        }
        if (arg0 == -65536) {
            field10492++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
    public final boolean method4158(boolean arg0) {
        if (arg0) {
            field10494++;
            return this.field10495;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
    public final int method4159(int arg0) {
        if (arg0 != -13610) {
            method4161((byte) 19);
        }
        field10486++;
        return this.field10485;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public final int method4160(int arg0) {
        if (arg0 != 2323) {
            method4157(42, null);
        }
        field10488++;
        return this.field10487;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method4161(byte arg0) {
        if (arg0 > -65) {
            method4161((byte) 94);
        }
        field10491 = null;
        field10496 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z")
    public final boolean method4162(int arg0) {
        field10493++;
        return arg0 == -65536 ? this.field10489 : false;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ZIIZ)V")
    public class754(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field10495 = arg0;
        this.field10489 = arg3;
        this.field10485 = arg2;
        this.field10487 = arg1;
    }
}
