import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class97 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field1541 = 16777215;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field1547 = 8;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field1554 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public boolean field1543;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[I")
    public static int[] field1546;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[Ldc;")
    public static class152[] field1539;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 12)
    public static final long method717(String arg0, int arg1) {
        field1555++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1 != 29565) {
            method721(-53, (byte) 15);
        }
        while (var5 < var2) {
            var3 = (var3 << 5) + ((long) arg0.charAt(var5)) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkh;III)V", line = 33)
    private final void method718(class166 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -6) {
            method719(-48, 14, -105, -70, -28, -42, 115, 66);
        }
        field1550++;
        if (arg2 == 1) {
            this.field1547 = arg0.method1151(-119);
        } else if (arg2 == 2) {
            this.field1543 = true;
        } else if (arg2 == 3) {
            this.field1552 = arg0.method1166(52);
            this.field1551 = arg0.method1166(52);
            this.field1545 = arg0.method1166(52);
        } else if (arg2 == 4) {
            this.field1544 = arg0.method1178(arg1 ^ 0xFFFFFFFA);
        } else if (arg2 == 5) {
            this.field1548 = arg0.method1151(-109);
        } else if (arg2 == 6) {
            this.field1541 = arg0.method1156((byte) 125);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIII)V", line = 81)
    public static final void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1540++;
        int var8 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg4);
        int var9 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg0);
        int var10 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg3);
        int var11 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg5);
        int var12 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg2 + arg4);
        int var13 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg0 - arg2);
        int var14 = 22 / ((arg1 - 42) / 43);
        for (int var15 = var8; var15 < var12; var15++) {
            class272.method1876(class34.field525[var15], var11, var10, arg6, (byte) -87);
        }
        for (int var16 = var9; var16 > var13; var16--) {
            class272.method1876(class34.field525[var16], var11, var10, arg6, (byte) -80);
        }
        int var17 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg2 + arg3);
        int var18 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg5 - arg2);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class34.field525[var19];
            class272.method1876(var20, var17, var10, arg6, (byte) -53);
            class272.method1876(var20, var18, var17, arg7, (byte) -85);
            class272.method1876(var20, var11, var18, arg6, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 133)
    public static void method720(int arg0) {
        if (arg0 < -111) {
            field1546 = null;
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Lbc;", line = 157)
    public static final class7 method721(int arg0, byte arg1) {
        field1542++;
        class7 var2 = (class7) class171.field2591.method443(arg1 - 15, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class101.field1588.method980(26, arg0, arg1 ^ 0x8);
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method61(false, new class166(var3));
        }
        if (arg1 != 13) {
            method719(124, -16, -88, -39, 117, 97, -4, 38);
        }
        class171.field2591.method439(var4, (long) arg0, (byte) 18);
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILkh;)V", line = 184)
    public final void method722(int arg0, int arg1, class166 arg2) {
        while (true) {
            int var4 = arg2.method1178(0);
            if (var4 == 0) {
                field1553++;
                if (arg0 != 16777215) {
                    this.field1548 = -82;
                }
                return;
            }
            this.method718(arg2, -6, var4, arg1);
        }
    }
}
