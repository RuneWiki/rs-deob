import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class349 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field5199;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lu;")
    public class349 field5207;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lc;")
    public class517 field5200;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[[B")
    public static byte[][] field5211 = new byte[250][];

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field5203;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field5210;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[[[I")
    public static int[][][] field5201;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Ldv;", line = 3)
    public final class508 method2242(int arg0) {
        if (arg0 >= -42) {
            this.field5210 = 61;
        }
        field5212++;
        return class96.method806(false, this.field5199);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lu;", line = 20)
    public final class349 method2243(int arg0, int arg1) {
        if (arg1 < 32) {
            this.method2243(118, 8);
        }
        field5205++;
        return new class349(this.field5199, arg0);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 33)
    public static void method2244(int arg0) {
        if (arg0 == -18835) {
            field5201 = null;
            field5211 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V", line = 44)
    public static final void method2245(int arg0, int arg1) {
        if (arg0 == -6) {
            class326.field4937.method1631(arg1, (byte) -19);
            field5208++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Z", line = 59)
    public static final boolean method2246(byte arg0, int arg1) {
        int var2 = -126 % ((arg0 + 43) / 40);
        field5204++;
        if (arg1 == 60 || arg1 == 4 || arg1 == 5 || arg1 == 46 || arg1 == 59) {
            return true;
        } else {
            return arg1 == 9 || arg1 == 1007;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V", line = 81)
    public class349(int arg0, int arg1) {
        this.field5199 = arg0;
        this.field5209 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lu;I)V", line = 89)
    public class349(class349 arg0, int arg1) {
        this.field5207 = arg0;
        this.field5199 = this.field5207.field5199;
        this.field5209 = this.field5207.field5209 + arg1;
        this.field5200 = this.field5207.field5200;
    }
}
