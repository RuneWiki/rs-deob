import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class564 {

    @OriginalMember(owner = "client!via", name = "a", descriptor = "Z")
    private boolean field7965 = false;

    @OriginalMember(owner = "client!via", name = "g", descriptor = "Z")
    private boolean field7971 = true;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    public int field7969 = 443;

    @OriginalMember(owner = "client!via", name = "j", descriptor = "I")
    public int field7974 = 43594;

    @OriginalMember(owner = "client!via", name = "i", descriptor = "Ldaa;")
    public static class11 field7973 = new class11(0, 0);

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public int field7967;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!via", name = "h", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!via", name = "k", descriptor = "Ljava/lang/String;")
    public String field7975;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILfl;)Ljt;")
    public final class107 method3175(int arg0, class739 arg1) {
        int var3 = 56 / ((-arg0 - 28) / 39);
        field7970++;
        return arg1.method4131(this.field7975, false, this.field7971 ? this.field7969 : this.field7974, this.field7965);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
    public static void method3176(int arg0) {
        field7973 = null;
        if (arg0 != 43594) {
            method3177((byte) -4);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)Lrfa;")
    public static final class201 method3177(byte arg0) {
        field7966++;
        if (arg0 != 83) {
            field7973 = null;
        }
        try {
            return (class201) Class.forName("ifa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILvia;)Z")
    public final boolean method3178(int arg0, class564 arg1) {
        field7968++;
        if (arg0 < 103) {
            this.method3178(-66, null);
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field7967 == arg1.field7967 && this.field7975.equals(arg1.field7975);
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
    public final void method3179(int arg0) {
        field7972++;
        if (!this.field7971) {
            this.field7971 = true;
            this.field7965 = true;
        } else if (this.field7965) {
            this.field7965 = false;
        } else {
            this.field7971 = false;
        }
        if (arg0 != 0) {
            this.method3178(9, null);
        }
    }
}
