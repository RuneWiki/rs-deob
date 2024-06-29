import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class557 {

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "J")
    private long field35 = -1L;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Ljava/lang/String;")
    private String field38 = null;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "F")
    public static float field34;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method29(int arg0, int arg1) {
        field37++;
        int var2 = 27 % ((-arg0 - 47) / 61);
        class408.field5772.method3101(false, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLdt;)V", line = 17)
    public final void method30(byte arg0, class254 arg1) {
        if (arg1.method1731((byte) 64) != 255) {
            arg1.field3725--;
            this.field35 = arg1.method1723(21795);
        }
        field33++;
        this.field38 = arg1.method1694(0);
        if (class72.field979) {
            System.out.println("memberhash:" + this.field35 + " membername:" + this.field38);
        }
        if (arg0 != 110) {
            method33(-5, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 39)
    public static final void method31(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class755.method4140(var3.field2529);
        class755.method4140(var3.field2531);
        if (var3.field2529 != null) {
            var3.field2529 = null;
        }
        if (var3.field2531 != null) {
            var3.field2531 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ltn;I)V", line = 54)
    public final void method32(class95 arg0, int arg1) {
        arg0.method752(this.field35, this.field38, arg1 + 330);
        if (arg1 == -29265) {
            field40++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lgm;", line = 76)
    public static final class134 method33(int arg0, byte arg1) {
        field39++;
        class134[] var2 = class546.method3147((byte) 98);
        if (arg1 != 94) {
            field34 = 0.074503176F;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class134 var4 = var2[var3];
            if (var4.field1828 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
