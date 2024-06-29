import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class429 {

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "I")
    public int field5981 = 128;

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "I")
    public int field5982 = 128;

    @OriginalMember(owner = "client!eka", name = "p", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!eka", name = "n", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
    public static int field5988 = 0;

    @OriginalMember(owner = "client!eka", name = "h", descriptor = "Ljn;")
    public static class134 field5985 = new class134(73, 0);

    @OriginalMember(owner = "client!eka", name = "o", descriptor = "[S")
    public static short[] field5992 = new short[256];

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
    public int field5984;

    @OriginalMember(owner = "client!eka", name = "i", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!eka", name = "j", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
    public static void method2579(boolean arg0) {
        if (arg0) {
            field5985 = null;
        }
        field5992 = null;
        field5985 = null;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Leka;B)V")
    public final void method2580(class429 arg0, byte arg1) {
        this.field5982 = arg0.field5982;
        this.field5991 = arg0.field5991;
        this.field5980 = arg0.field5980;
        this.field5981 = arg0.field5981;
        if (arg1 == -3) {
            this.field5993 = arg0.field5993;
            this.field5989 = arg0.field5989;
            field5979++;
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)Leka;")
    public final class429 method2581(byte arg0) {
        field5986++;
        if (arg0 >= -118) {
            method2579(false);
        }
        return new class429(this.field5993, this.field5982, this.field5981, this.field5980, this.field5989, this.field5991);
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
    public class429(int arg0) {
        this.field5993 = arg0;
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(IIIIII)V")
    private class429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5982 = arg1;
        this.field5993 = arg0;
        this.field5991 = arg5;
        this.field5989 = arg4;
        this.field5981 = arg2;
        this.field5980 = arg3;
    }
}
