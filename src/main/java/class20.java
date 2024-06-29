import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class20 extends class591 {

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Lei;")
    public class506 field382;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Lvg;")
    public static class622 field379 = new class622(57, 2);

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field384 = 16777215;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "Lmh;")
    public static class139 field385 = new class139(0, 1);

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "[[Ldj;")
    public static class453[][] field383;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIB)I")
    public static final int method135(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        if (arg3 != -21) {
            field383 = null;
        }
        field380++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static void method136(int arg0) {
        if (arg0 != 1) {
            field379 = null;
        }
        field385 = null;
        field383 = null;
        field379 = null;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Luca;II[B)V")
    public class20(class287 arg0, int arg1, int arg2, byte[] arg3) {
        this.field382 = class134.method952(false, true, 6406, 6406, arg2, arg1, arg0, arg3);
        this.field382.method1424(10242, false, false);
    }
}
