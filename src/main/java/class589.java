import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class589 {

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public int field8302 = 443;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public int field8310 = 43594;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "Z")
    private boolean field8307 = true;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "Z")
    private boolean field8300 = false;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "Ljn;")
    public static class134 field8305 = new class134(132, -1);

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "Ljn;")
    public static class134 field8311 = new class134(80, 28);

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "[I")
    public static int[] field8312 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "Ljava/lang/String;")
    public String field8299;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILuia;)Z", line = 4)
    public final boolean method3447(int arg0, class589 arg1) {
        field8298++;
        int var3 = 115 % ((81 - arg0) / 45);
        if (arg1 == null) {
            return false;
        } else {
            return this.field8306 == arg1.field8306 && this.field8299.equals(arg1.field8299);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBIII)V", line = 18)
    public static final void method3448(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 88 / ((-arg1 - 76) / 50);
        field8304++;
        class17 var6 = class245.method1634(1, (long) arg3 << 32 | (long) arg4, 19);
        var6.method66((byte) -108);
        var6.field104 = arg0;
        var6.field107 = arg2;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 37)
    public static void method3449(int arg0) {
        field8311 = null;
        field8305 = null;
        if (arg0 < -32) {
            field8312 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lvt;B)Lfe;", line = 59)
    public final class344 method3450(class768 arg0, byte arg1) {
        field8309++;
        if (arg1 >= -26) {
            this.method3450(null, (byte) -9);
        }
        return arg0.method4242(this.field8299, this.field8300, 1, this.field8307 ? this.field8302 : this.field8310);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBI)V", line = 82)
    public static final void method3451(int arg0, byte arg1, int arg2) {
        field8301++;
        class17 var3 = class245.method1634(arg1 ^ 0xFFFFFFA2, (long) arg0, 5);
        var3.method66((byte) 67);
        var3.field107 = arg2;
        if (arg1 != -93) {
            method3448(53, (byte) 99, 116, 54, -100);
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V", line = 101)
    public final void method3452(int arg0) {
        field8303++;
        if (arg0 >= -105) {
            method3448(-101, (byte) 41, 45, 48, -108);
        }
        if (!this.field8307) {
            this.field8307 = true;
            this.field8300 = true;
        } else if (this.field8300) {
            this.field8300 = false;
        } else {
            this.field8307 = false;
        }
    }
}
