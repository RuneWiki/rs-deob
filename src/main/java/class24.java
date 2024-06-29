import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class24 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field355 = 16777215;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public int field365 = 8;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Z")
    public boolean field364;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILfh;I)V", line = 17)
    private final void method210(int arg0, int arg1, class313 arg2, int arg3) {
        int var5 = -101 / ((12 - arg0) / 60);
        field361++;
        if (arg3 == 1) {
            this.field365 = arg2.method2250(-1613178296);
        } else if (arg3 == 2) {
            this.field364 = true;
        } else if (arg3 == 3) {
            this.field363 = arg2.method2214(0);
            this.field359 = arg2.method2214(0);
            this.field356 = arg2.method2214(0);
        } else if (arg3 == 4) {
            this.field354 = arg2.method2224(-123);
        } else if (arg3 == 5) {
            this.field362 = arg2.method2250(-1613178296);
        } else if (arg3 == 6) {
            this.field355 = arg2.method2249(-41);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILnm;I)[Loh;", line = 72)
    public static final class187[] method211(int arg0, int arg1, class221 arg2, int arg3) {
        field357++;
        if (arg3 > -102) {
            return (class187[]) null;
        } else if (class334.method2361(arg0, arg2, 16836, arg1)) {
            return class79.method536(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILfh;I)V", line = 94)
    public final void method212(int arg0, class313 arg1, int arg2) {
        field358++;
        while (true) {
            int var4 = arg1.method2224(-122);
            if (var4 == 0) {
                int var5 = 44 % ((40 - arg0) / 59);
                return;
            }
            this.method210(103, arg2, arg1, var4);
        }
    }
}
