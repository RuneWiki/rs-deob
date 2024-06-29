import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class191 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "B")
    private byte field3178;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lmc;")
    public static class170 field3183 = new class170();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lcb;")
    public static class267 field3186;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field3184;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1440(byte arg0) {
        field3182++;
        class175.field2937 = null;
        if (arg0 > -82) {
            method1440((byte) 63);
        }
        class150.field2576 = null;
        class276.field4745 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 28)
    public static void method1441(byte arg0) {
        int var1 = 106 / ((arg0 + 93) / 32);
        field3183 = null;
        field3184 = null;
        field3186 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI[B)Lwa;", line = 47)
    public static final class75 method1442(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3181++;
        class75 var4 = new class75();
        var4.field1280 = 0;
        var4.field1296 = new byte[arg0];
        if (arg1 <= 18) {
            field3186 = (class267) null;
        }
        for (int var5 = arg2; var5 < (arg0 + arg2); var5++) {
            if (arg3[var5] != 0) {
                var4.field1296[var4.field1280++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I", line = 75)
    public final int method1443(byte arg0) {
        if (arg0 < 46) {
            field3183 = (class170) null;
        }
        field3185++;
        return (this.field3178 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I", line = 88)
    public final int method1444(int arg0) {
        field3174++;
        if (arg0 != 18133) {
            this.field3175 = -83;
        }
        return this.field3178 & 0x7;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 103)
    public class191() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lja;)V", line = 107)
    public class191(class60 arg0) {
        this.field3178 = arg0.method511(-123);
        this.field3177 = arg0.method485((byte) -2);
        this.field3180 = arg0.method505(255);
        this.field3175 = arg0.method505(255);
        this.field3176 = arg0.method505(255);
        this.field3179 = arg0.method505(255);
    }
}
