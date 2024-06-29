import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class219 {

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Ljava/lang/String;")
    public String field48;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Lhf;")
    public class413 field46;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    public static int field53 = -1;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "[I")
    public static int[] field52;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)I", line = 7)
    public static final int method25(int arg0, String arg1) {
        if (arg0 != 0) {
            field52 = null;
        }
        field55++;
        return class350.method2209(true, 10, arg1, arg0 - 123);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lnba;I)Z", line = 18)
    public final boolean method26(class312 arg0, int arg1) {
        field50++;
        if (arg1 != -11680) {
            return true;
        }
        int var3 = this.method27((byte) 35);
        arg0.method1512(false);
        this.field49--;
        if (this.field49 != 0) {
            return this.method27((byte) 35) != var3;
        }
        this.method3117((byte) 19);
        this.method1512(false);
        class27.field394--;
        class648.field9117.method2362(this, 0, arg0.field4635);
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I", line = 44)
    public final int method27(byte arg0) {
        field51++;
        if (arg0 != 35) {
            this.field48 = null;
        }
        return this.field46.field5842.field3126 == this.field46.field5842 ? -1 : ((class312) this.field46.field5842.field3126).field4640;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 59)
    public class4(String arg0) {
        this.field48 = arg0;
        this.field46 = new class413();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lnba;Z)Z", line = 68)
    public final boolean method28(class312 arg0, boolean arg1) {
        field45++;
        boolean var3 = arg1;
        arg0.method1512(false);
        for (class312 var4 = (class312) this.field46.method2480(381); var4 != null; var4 = (class312) this.field46.method2476((byte) 18)) {
            if (class307.method2018(101, var4.field4640, arg0.field4640)) {
                class586.method3398(arg0, (byte) -126, var4);
                this.field49++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field46.method2475(arg0, -19680);
        this.field49++;
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 97)
    public static void method29(int arg0) {
        field52 = null;
        if (arg0 != 10) {
            method29(27);
        }
    }
}
