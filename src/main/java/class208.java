import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class208 {

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public int field2701 = -1;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public static int[] field2705 = new int[200];

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    public static int[] field2706 = new int[1000];

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Loi;")
    public static class169 field2695 = new class169(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2698;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)I", line = 9)
    public static final int method1350(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        field2700++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -45 % ((arg2 - 11) / 50);
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 30)
    public static void method1351(byte arg0) {
        field2706 = null;
        field2695 = null;
        field2698 = null;
        if (arg0 >= 126) {
            field2705 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)I", line = 44)
    public static final int method1352(boolean arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field2702++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (!arg0) {
            field2705 = null;
        }
        return var6 & 0xFF;
    }
}
