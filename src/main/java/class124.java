import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class124 {

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[I")
    public static int[] field1791 = new int[14];

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Lkg;")
    public static class275 field1792 = new class275(105, 7);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "Ld;")
    public static class153 field1793;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Z")
    public boolean field1785;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Lfba;")
    public static final class25 method942(int arg0, int arg1) {
        field1789++;
        if (arg0 != 10698) {
            return null;
        }
        class25 var2 = (class25) class321.field4145.method3079((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class629.field8673.method3153(arg1, 0, 0);
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method171(-116, new class461(var3), arg1);
        }
        class321.field4145.method3077((byte) -57, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILvl;)V")
    public static final void method943(int arg0, class13 arg1) {
        field1788++;
        int var2 = arg1.field238 - class463.field6224;
        if (arg0 < 102) {
            return;
        }
        int var3 = arg1.field185 * 512 + arg1.method82((byte) 49) * 256;
        int var4 = arg1.field154 * 512 + arg1.method82((byte) 49) * 256;
        arg1.field5801 += (var3 - arg1.field5801) / var2;
        arg1.field268 = 0;
        arg1.field5797 += (var4 - arg1.field5797) / var2;
        if (arg1.field164 == 0) {
            arg1.method90(8192, (byte) -18);
        }
        if (arg1.field164 == 1) {
            arg1.method90(12288, (byte) -18);
        }
        if (arg1.field164 == 2) {
            arg1.method90(0, (byte) -18);
        }
        if (arg1.field164 == 3) {
            arg1.method90(4096, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        if (arg0 == 12288) {
            field1793 = null;
            field1791 = null;
            field1792 = null;
        }
    }
}
