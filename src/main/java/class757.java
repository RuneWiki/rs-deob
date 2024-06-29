import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class757 implements class58 {

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lla;")
    private class422 field10544;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljr;")
    private class130 field10542;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field10540 = -1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[[I")
    public static int[][] field10535 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lit;")
    private class34 field10537;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
    public static boolean field10546;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method4213(byte arg0) {
        if (arg0 != 59) {
            method4213((byte) 44);
        }
        field10535 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        field10538++;
        this.field10537 = class451.method2768(this.field10544, -32, this.field10542.field2124);
        if (arg0 != -28886) {
            this.method576(-95);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V")
    public final void method575(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field10537 = null;
        }
        field10547++;
        if (!arg1) {
            return;
        }
        int var3 = class335.field4917 < class660.field9408 ? class660.field9408 : class335.field4917;
        int var4 = class412.field6066 > class614.field8651 ? class412.field6066 : class614.field8651;
        int var5 = this.field10537.method177();
        int var6 = this.field10537.method184();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var8 = var4 * var5 / var6;
            var9 = var4;
            var10 = 0;
            var7 = (var3 - var8) / 2;
        }
        this.field10537.method187(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
    public final boolean method574(byte arg0) {
        field10545++;
        if (arg0 < 96) {
            method4213((byte) 75);
        }
        return this.field10544.method2621(this.field10542.field2124, -28975);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4214(int arg0, String arg1) {
        field10539++;
        class540 var2 = class91.method771(false);
        var2.field7707.method1926(class511.field7437.field1540, arg0 + 65279);
        var2.field7707.method1939(0, 1134947720);
        int var3 = var2.field7707.field4534;
        var2.field7707.method1939(635, 1134947720);
        int[] var4 = class595.method3407(arg0 + arg0, var2);
        int var5 = var2.field7707.field4534;
        var2.field7707.method1931(117, arg1);
        var2.field7707.method1926(class467.field6804, 65280);
        var2.field7707.field4534 += 7;
        var2.field7707.method1940(var2.field7707.field4534, var5, -32265, var4);
        var2.field7707.method1973(false, var2.field7707.field4534 - var3);
        class756.method4211(var2, 108);
        class184.field3104 = 0;
        class594.field8336 = 1;
        class751.field10468 = -3;
        class551.field7854 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lla;Ljr;)V")
    public class757(class422 arg0, class130 arg1) {
        this.field10544 = arg0;
        this.field10542 = arg1;
    }
}
