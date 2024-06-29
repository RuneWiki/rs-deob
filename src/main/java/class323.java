import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class323 {

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "[[I")
    public int[][] field4621 = new int[6][258];

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "[B")
    public byte[] field4633 = new byte[18002];

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "[Z")
    public boolean[] field4611 = new boolean[16];

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "[I")
    public int[] field4629 = new int[6];

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public int field4613 = 0;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    public int field4639 = 0;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "[B")
    public byte[] field4640 = new byte[4096];

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "[I")
    public int[] field4630 = new int[257];

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "[Z")
    public boolean[] field4642 = new boolean[256];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
    public int[] field4614 = new int[256];

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "[I")
    public int[] field4631 = new int[16];

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "[[I")
    public int[][] field4638 = new int[6][258];

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[B")
    public byte[] field4615 = new byte[18002];

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "[[I")
    public int[][] field4634 = new int[6][258];

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "[[B")
    public byte[][] field4637 = new byte[6][258];

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "[B")
    public byte[] field4646 = new byte[256];

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "[I")
    public static int[] field4625 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "B")
    public byte field4647;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "Lhb;")
    public static class345 field4643;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[B")
    public byte[] field4618;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "[B")
    public byte[] field4648;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
    public static int[] field4623;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method1996(int arg0) {
        if (arg0 != 14230) {
            field4623 = null;
        }
        field4623 = null;
        field4625 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
    public static final void method1997(boolean arg0) {
        field4644++;
        class416.method2687((byte) 73);
        class390.field5849 = null;
        class416.field6195 = null;
        class273.field4010 = null;
        class300.field4316 = null;
        if (arg0) {
            class24.field417 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1998(int arg0, String arg1) {
        field4628++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0 != 63) {
            method1998(75, (String) null);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class284.method1805(var6, false);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILro;Lnr;)V")
    public static final void method1999(int arg0, class249 arg1, class437 arg2) {
        if (arg0 != 6) {
            method1998(108, (String) null);
        }
        field4626++;
        class419.method2697(0, 0, arg2, arg0 + 121, arg1);
    }
}
