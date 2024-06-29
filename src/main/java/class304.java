import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class304 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[I")
    public int[] field4816;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field4819;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[I")
    public int[] field4822;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[B")
    public byte[] field4818;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lul;")
    public static class51 field4811 = new class51(16);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4824 = "K";

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4828 = "glow1:";

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[[Lbl;")
    public static class337[][] field4826;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 5)
    public final int method2093(int arg0, int arg1) {
        if (arg1 == 3) {
            field4815++;
            return this.field4818[arg0] & 0x3;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 15)
    public static final void method2094(boolean arg0) {
        if (arg0) {
            class279.field4430 = class78.field1258;
            class137.field2487 = class249.field4042;
            field4826 = class298.field4749;
        } else {
            class279.field4430 = class266.field4287;
            class137.field2487 = class255.field4110;
            field4826 = class124.field2147;
        }
        class42.field622 = class279.field4430.length;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Z", line = 36)
    public final boolean method2095(int arg0, int arg1) {
        field4817++;
        if (arg0 == 24454) {
            return (this.field4818[arg1] & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 49)
    public static void method2096(byte arg0) {
        field4824 = null;
        field4826 = (class337[][]) null;
        field4828 = null;
        field4811 = null;
        int var1 = 74 / ((69 - arg0) / 55);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Z", line = 66)
    public final boolean method2097(int arg0, int arg1) {
        field4823++;
        if (arg1 != 17368) {
            this.method2097(-20, -95);
        }
        return (this.field4818[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Z", line = 83)
    public final boolean method2098(int arg0, int arg1) {
        field4820++;
        if (arg1 != -30963) {
            field4812 = 11;
        }
        return (this.field4818[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V", line = 96)
    public class304(int arg0) {
        this.field4814 = arg0;
        this.field4816 = new int[this.field4814];
        this.field4819 = new String[this.field4814];
        this.field4822 = new int[this.field4814];
        this.field4818 = new byte[this.field4814];
    }
}
