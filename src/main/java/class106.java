import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class106 extends class25 {

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "[[[I")
    public static int[][][] field1748 = new int[4][13][13];

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Ldf;")
    public static class51 field1747 = class46.method233(":chalreq:", 100);

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Ldf;")
    public static class51 field1742 = class46.method233("<col=c0ff00>", 100);

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lhc;")
    private class212 field1746;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
    public static int[] field1751;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
    public final int method757(int arg0, int arg1, int arg2) {
        field1749++;
        if (arg0 != -1) {
            return -22;
        } else if (this.field1746 == null) {
            return arg2;
        } else {
            class255 var4 = (class255) this.field1746.method1453((long) arg1, 1);
            return var4 == null ? arg2 : var4.field4454;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Llb;I)V")
    public final void method758(class121 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method897(113);
            if (var3 == 0) {
                field1745++;
                if (arg1 != -26293) {
                    this.method761(-118, (byte) 99, (class121) null);
                    return;
                }
                return;
            }
            this.method761(var3, (byte) 91, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ldf;II)Ldf;")
    public final class51 method759(class51 arg0, int arg1, int arg2) {
        field1744++;
        if (this.field1746 == null) {
            return arg0;
        } else {
            class120 var4 = (class120) this.field1746.method1453((long) arg1, arg2);
            return var4 == null ? arg0 : var4.field1998;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method760(byte arg0) {
        field1742 = null;
        field1747 = null;
        int var1 = -125 % ((-arg0 - 75) / 38);
        field1748 = null;
        field1751 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLlb;)V")
    private final void method761(int arg0, byte arg1, class121 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method897(125);
            if (this.field1746 == null) {
                int var5 = class184.method1302(var4, -12820);
                this.field1746 = new class212(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method897(125) == 1;
                int var8 = arg2.method891((byte) -109);
                class107 var9;
                if (var7) {
                    var9 = new class120(arg2.method903((byte) 108));
                } else {
                    var9 = new class255(arg2.method865((byte) 8));
                }
                this.field1746.method1447(-90, (long) var8, var9);
            }
        }
        field1750++;
        if (arg1 <= 73) {
            field1751 = null;
        }
    }
}
