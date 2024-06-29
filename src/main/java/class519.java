import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class519 {

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "S")
    public short field7689;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "B")
    public byte field7687;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "S")
    public short field7685;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "B")
    public byte field7683;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "S")
    public short field7691;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field7695;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
    public boolean field7686;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lcu;")
    public static class145 field7692;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "[I")
    public static int[] field7697;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)I")
    public static final int method3057(byte arg0) {
        if (arg0 == -28) {
            field7694++;
            return 16;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)Lkn;")
    public final class519 method3058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            this.field7683 = 21;
        }
        field7693++;
        return new class519(arg2, arg0, arg3, arg1, this.field7689, this.field7685, this.field7691, this.field7687, this.field7683, this.field7686);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        if (arg0 != -87) {
            field7696 = -70;
        }
        field7697 = null;
        field7692 = null;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V")
    public static final void method3060(byte arg0) {
        field7690++;
        int var1 = 122 / ((-arg0 - 59) / 51);
        class164 var2 = null;
        try {
            class446 var3 = class389.field5281.method1366(16, "2");
            while (var3.field6100 == 0) {
                class94.method674(1L, 1);
            }
            if (var3.field6100 == 1) {
                var2 = (class164) var3.field6104;
                class379 var4 = new class379((class151.field2147 * 6) + 3);
                var4.method2200(7, 1);
                var4.method2246(class151.field2147, (byte) -108);
                for (int var5 = 0; var5 < class98.field1478.length; var5++) {
                    if (class131.field1900[var5]) {
                        var4.method2246(var5, (byte) -88);
                        var4.method2214(72, class98.field1478[var5]);
                    }
                }
                var2.method1108((byte) -60, 0, var4.field5152, var4.field5173);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method1109((byte) -63);
            }
        } catch (Exception var6) {
        }
        class21.field386 = class498.method2854(-116);
        class269.field3538 = false;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILmd;)Lqk;")
    public static final class14 method3061(int arg0, class379 arg1) {
        arg1.method2238(arg0 + 255);
        field7684++;
        int var2 = arg1.method2238(255);
        class14 var3 = class65.method446(var2, -20);
        var3.field267 = arg1.method2238(255);
        int var4 = arg1.method2238(255);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method2238(255);
            var3.method147(var6, (byte) 42, arg1);
        }
        var3.method142((byte) 108);
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7689 = (short) arg4;
        this.field7687 = (byte) arg7;
        this.field7685 = (short) arg5;
        this.field7683 = (byte) arg8;
        this.field7691 = (short) arg6;
        this.field7695 = arg0;
        this.field7686 = arg9;
    }

    static {
        new class304("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field7692 = new class145(33, 11);
        field7697 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    }
}
