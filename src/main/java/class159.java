import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class159 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field2590 = 0;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lgg;")
    private class61 field2594;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2596 = "Discard";

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "J")
    public static long field2597 = 0L;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljg;")
    public static class271 field2593;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lwd;")
    private class69 field2588;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Lwd;")
    public final class69 method1095(int arg0) {
        field2595++;
        if (this.field2590 > 0 && this.field2594.field826[this.field2590 - 1] != this.field2588) {
            class69 var2 = this.field2588;
            this.field2588 = var2.field960;
            return var2;
        }
        while (this.field2590 < this.field2594.field832) {
            class69 var3 = this.field2594.field826[this.field2590++].field960;
            if (this.field2594.field826[this.field2590 - 1] != var3) {
                this.field2588 = var3.field960;
                return var3;
            }
        }
        return arg0 > -47 ? null : null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)[Lvl;")
    public static final class68[] method1096(int arg0) {
        field2592++;
        class68[] var1 = new class68[class154.field2484];
        if (arg0 < 38) {
            return null;
        }
        for (int var2 = 0; var2 < class154.field2484; var2++) {
            var1[var2] = new class68(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], class168.field2726[var2], class131.field2187);
        }
        class111.method804(0);
        return var1;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2593 = null;
        if (arg0 < 49) {
            method1099(70, -33, -63, 124, -43);
        }
        field2596 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Lwd;")
    public final class69 method1098(byte arg0) {
        this.field2590 = 0;
        int var2 = -40 % ((arg0 + 46) / 53);
        field2589++;
        return this.method1095(-92);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lgg;)V")
    public class159(class61 arg0) {
        this.field2594 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2591++;
        class83.field1148.field4195 = 0;
        class83.field1148.method1757(20, (byte) 106);
        class83.field1148.method1757(arg3, (byte) 118);
        class83.field1148.method1757(arg1, (byte) -127);
        class83.field1148.method1761(arg0, 4334);
        class83.field1148.method1761(arg4, arg2 + 4334);
        class62.field883 = arg2;
        class95.field1429 = 1;
        class102.field1539 = 0;
        class104.field1736 = -3;
    }
}
