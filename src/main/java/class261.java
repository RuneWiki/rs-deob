import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class261 extends class320 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public int field4218 = 0;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Z")
    public static boolean field4227 = false;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lqe;")
    public class205 field4231;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Lu;")
    public class278 field4234;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lbh;")
    public class299 field4215;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Lbh;")
    public class299 field4229;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lcg;")
    public static class49 field4222;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "Lie;")
    public class97 field4232;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
    public boolean field4216;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
    public int[] field4238;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lrl;", line = 5)
    public static final class213 method1801(int arg0, int arg1) {
        class213 var2 = (class213) class259.field4198.method467(true, (long) arg0);
        field4226++;
        if (arg1 != 10812) {
            method1804(25, -96);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class224.field3749.method441(false, class57.method517(arg0, 532943050), class253.method1760(arg0, (byte) -122));
        class213 var4 = new class213();
        if (var3 != null) {
            var4.method1578(new class336(var3), 0);
        }
        class259.field4198.method465(var4, (long) arg0, (byte) 82);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 29)
    public final void method1802(int arg0) {
        field4236++;
        if (arg0 != 128) {
            field4222 = (class49) null;
        }
        int var2 = this.field4223;
        if (this.field4232 != null) {
            class97 var3 = this.field4232.method833(false);
            if (var3 == null) {
                this.field4239 = 0;
                this.field4224 = 0;
                this.field4223 = -1;
                this.field4235 = 0;
                this.field4221 = 0;
                this.field4238 = null;
            } else {
                this.field4235 = var3.field1567;
                this.field4223 = var3.field1557;
                this.field4238 = var3.field1507;
                this.field4224 = var3.field1577;
                this.field4239 = var3.field1541 * 128;
                this.field4221 = var3.field1547;
            }
        } else if (this.field4234 != null) {
            int var4 = class28.method257(arg0 ^ 0x5701, this.field4234);
            if (var2 != var4) {
                this.field4223 = var4;
                class12 var5 = this.field4234.field4413;
                if (var5.field179 != null) {
                    var5 = var5.method122(arg0 ^ 0xD7);
                }
                if (var5 == null) {
                    this.field4235 = this.field4239 = 0;
                } else {
                    this.field4235 = var5.field185;
                    this.field4239 = var5.field173 * 128;
                }
            }
        } else if (this.field4231 != null) {
            this.field4223 = class143.method1157(14845, this.field4231);
            this.field4239 = this.field4231.field3483 * 128;
            this.field4235 = this.field4231.field3505;
        }
        if (this.field4223 != var2 && this.field4229 != null) {
            class1.field9.method1839(this.field4229);
            this.field4229 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)Ljava/lang/String;", line = 120)
    public static final String method1803(int arg0, int arg1) {
        field4214++;
        if (arg1 >= 100000) {
            if (arg0 != 1000000) {
                field4227 = true;
            }
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class304.field4824 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class202.field3441 + "</col>";
        } else {
            return "<col=ffff00>" + arg1 + "</col>";
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V", line = 145)
    public static final void method1804(int arg0, int arg1) {
        field4233++;
        class347.field5536 = arg1 / arg0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILuk;JZ)V", line = 152)
    public static final void method1805(int arg0, int arg1, int arg2, int arg3, class104 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class330 var8 = new class330();
        var8.field5257 = arg4;
        var8.field5259 = arg1 * 128 + 64;
        var8.field5262 = arg2 * 128 + 64;
        var8.field5254 = arg3;
        var8.field5260 = arg5;
        var8.field5258 = arg6;
        if (class279.field4430[arg0][arg1][arg2] == null) {
            class279.field4430[arg0][arg1][arg2] = new class257(arg0, arg1, arg2);
        }
        class279.field4430[arg0][arg1][arg2].field4140 = var8;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 194)
    public static void method1806(int arg0) {
        field4222 = null;
        if (arg0 != -10000001) {
            field4222 = (class49) null;
        }
    }
}
