import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class335 {

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "[I")
    public static int[] field4541 = new int[2];

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "Lvea;")
    public static class276 field4538 = new class276(15, 0, 1, 0);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "B")
    public byte field4518;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "B")
    public byte field4522;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "B")
    public byte field4525;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "B")
    public byte field4533;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "B")
    public byte field4534;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "B")
    public byte field4536;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "B")
    public byte field4542;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "Lda;")
    public static class61 field4532;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "S")
    public short field4535;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Z")
    public boolean field4519;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Z")
    public boolean field4521;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "Z")
    public boolean field4524;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "Z")
    public boolean field4526;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "Z")
    public boolean field4527;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "Z")
    public boolean field4528;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "Z")
    public boolean field4529;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "Z")
    public boolean field4537;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILbi;)I")
    public static final int method1992(int arg0, class481 arg1) {
        if (arg0 != 0) {
            return 89;
        }
        field4540++;
        int var2 = arg1.method2702((byte) -115, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2702((byte) -84, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2702((byte) -58, 8);
        } else {
            var3 = arg1.method2702((byte) -110, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        field4538 = null;
        if (arg0 >= -28) {
            field4541 = null;
        }
        field4541 = null;
        field4532 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)Z")
    public static final boolean method1994(int arg0, int arg1, int arg2) {
        field4530++;
        if (arg0 > -49) {
            method1992(-89, null);
        }
        return (class547.method3102(arg2, -1, arg1) | class125.method803(true, arg1, arg2) | class430.method2454(-99, arg2, arg1)) & class203.method1123(arg2, arg1, -122);
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
    public static final void method1995(int arg0) {
        for (int var1 = 0; var1 < class114.field1506.length; var1++) {
            for (int var2 = 0; var2 < class114.field1506[0].length; var2++) {
                for (int var3 = 0; var3 < class114.field1506[0][0].length; var3++) {
                    class114.field1506[var1][var2][var3] = 0;
                }
            }
        }
        field4531++;
        if (arg0 >= -123) {
            method1995(65);
        }
    }
}
