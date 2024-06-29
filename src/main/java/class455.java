import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class455 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field6168;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
    public int[] field6169;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
    public int[] field6167;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lgd;")
    public static class206 field6166 = new class206("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field6170 = 0;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field6174 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field6173 = 2;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lh;")
    public static class434 field6171 = new class434(85, -2);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(CI)Z")
    public static final boolean method2672(char arg0, int arg1) {
        field6172++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        }
        int var2 = 99 / ((arg1 + 3) / 53);
        if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2673(int arg0, String arg1) {
        if (arg0 < 100) {
            field6170 = 28;
        }
        field6165++;
        return class405.method2448(true, 10, -93, arg1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Ltb;")
    public static final class251 method2674(byte arg0, int arg1) {
        field6175++;
        class251 var2 = (class251) class469.field6478.method2635((long) arg1, (byte) -80);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 58) {
            method2675((byte) -87);
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class99.field1449.method702((byte) 83, arg1, 1);
        } else {
            var3 = class223.field2965.method702((byte) -69, arg1 & 0x7FFF, 1);
        }
        class251 var4 = new class251();
        if (var3 != null) {
            var4.method1406((byte) 76, new class32(var3));
        }
        if (arg1 >= 32768) {
            var4.method1411((byte) -120);
        }
        class469.field6478.method2638((byte) 101, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
    public class455(int arg0) {
        this.field6168 = arg0;
        this.field6169 = new int[this.field6168];
        this.field6167 = new int[this.field6168];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method2675(byte arg0) {
        field6166 = null;
        if (arg0 >= 60) {
            field6171 = null;
        }
    }
}
