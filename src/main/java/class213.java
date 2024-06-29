import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class213 {

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lum;")
    private class347 field3011;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lfe;")
    public static class384 field3010 = new class384(8);

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Lcg;")
    private class86 field3017;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lcg;", line = 9)
    public final class86 method1317(byte arg0) {
        if (arg0 >= -117) {
            this.method1317((byte) -103);
        }
        field3013++;
        class86 var2 = this.field3011.field5018.field1179;
        if (this.field3011.field5018 == var2) {
            this.field3017 = null;
            return null;
        } else {
            this.field3017 = var2.field1179;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1318(int arg0) {
        field3015++;
        if (arg0 == 0) {
            class8.field133.method1505((byte) -7);
            class378.field5658 = 1;
            class181.field2593 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 47)
    public static void method1319(int arg0) {
        field3010 = null;
        if (arg0 > -28) {
            field3012 = 21;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILum;)V", line = 67)
    public final void method1320(int arg0, class347 arg1) {
        this.field3011 = arg1;
        field3016++;
        if (arg0 > -1) {
            method1322(-85, -125, null);
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lcg;", line = 78)
    public final class86 method1321(int arg0) {
        field3018++;
        class86 var2 = this.field3017;
        if (this.field3011.field5018 == var2) {
            this.field3017 = null;
            return null;
        }
        this.field3017 = var2.field1179;
        if (arg0 != -7499) {
            this.method1317((byte) 81);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II[B)[B", line = 100)
    public static final byte[] method1322(int arg0, int arg1, byte[] arg2) {
        field3014++;
        byte[] var3 = new byte[arg1];
        class268.method1638(arg2, arg0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 110)
    public class213() {
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lum;)V", line = 112)
    public class213(class347 arg0) {
        this.field3011 = arg0;
    }
}
