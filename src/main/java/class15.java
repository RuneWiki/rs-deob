import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 implements class64 {

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lom;")
    private class344 field749;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ljava/lang/String;")
    private String field746;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method374(int arg0, int arg1) {
        field744++;
        class19 var2 = class373.method2355(78, arg0, 7);
        var2.method438(arg1 + 805);
        if (arg1 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
    public static final boolean method375(int arg0, int arg1) {
        field743++;
        if (arg0 == -3) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method376(int arg0) {
        field748++;
        if (this.field749.method2232(1, this.field746)) {
            return 100;
        } else if (arg0 == 11878) {
            return this.field749.method2227(this.field746, 24383);
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public static final void method377(int arg0, int arg1, int arg2) {
        field745++;
        if (arg2 != 7) {
            return;
        }
        class9.field538++;
        class275 var3 = class185.method1355(0, class433.field6272, class395.field5772);
        var3.field4103.method714(true, arg0);
        var3.field4103.method746(0, arg1);
        class140.method1141(var3, arg2 + 19314);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lwa;")
    public final class569 method378(byte arg0) {
        if (arg0 == 112) {
            field747++;
            return class569.field8290;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lom;Ljava/lang/String;)V")
    public class15(class344 arg0, String arg1) {
        this.field749 = arg0;
        this.field746 = arg1;
    }
}
