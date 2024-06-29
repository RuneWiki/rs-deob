import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class109 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lvt;")
    private class343 field1806;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lrf;")
    public static class109 field1807 = new class109(0, 3, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lrf;")
    public static class109 field1813 = new class109(1, 3, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lrf;")
    public static class109 field1817 = new class109(2, 4, class343.field4922);

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lrf;")
    public static class109 field1818 = new class109(3, 1, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lrf;")
    public static class109 field1819 = new class109(4, 2, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lrf;")
    public static class109 field1820 = new class109(5, 3, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lrf;")
    private static class109 field1821 = new class109(6, 4, class343.field4926);

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field1822 = class211.method1380(16, (byte) 0);

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field1823;

    static {
        new class567("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field1825 = -1;
        field1824 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1814++;
        int var6 = arg2 - arg5;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class170.method1183(arg5, arg0, (byte) -123, arg2, arg4);
            }
        } else if (var6 == 0) {
            class57.method463(arg4, arg0, arg3, arg5, -1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg3;
                arg0 = arg5;
                arg5 = var9;
                arg3 = arg2;
                arg2 = var10;
            }
            if (arg3 < arg0) {
                int var11 = arg0;
                int var12 = arg5;
                arg0 = arg3;
                arg5 = arg2;
                arg3 = var11;
                arg2 = var12;
            }
            int var13 = arg5;
            int var14 = arg3 - arg0;
            int var15 = arg2 - arg5;
            if (arg1 != -17852) {
                field1822 = 102;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg5 < arg2 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg3; var19++) {
                    class495.field6944[var19][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg3; var18++) {
                    class495.field6944[var13][var18] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 122)
    public static void method915(boolean arg0) {
        field1807 = null;
        field1820 = null;
        field1818 = null;
        if (arg0) {
            method916(127);
        }
        field1813 = null;
        field1821 = null;
        field1817 = null;
        field1819 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lrf;", line = 138)
    public static final class109[] method916(int arg0) {
        field1808++;
        if (arg0 != 4) {
            method917(null, -66);
        }
        return new class109[] { field1807, field1813, field1817, field1818, field1819, field1820, field1821 };
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhn;I)V", line = 160)
    public static final void method917(class85 arg0, int arg1) {
        field1810++;
        boolean var2 = false;
        if (class310.field4553 == arg0.field1524 || arg0.field1514 == -1 || arg0.field1519 != 0) {
            var2 = true;
        } else {
            class439 var3 = class49.field739.method2297((byte) 112, arg0.field1514);
            if (var3.field6395 || (arg0.field1506 + 1) > var3.field6413[arg0.field1511]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1524 - arg0.field1527;
            int var5 = class310.field4553 - arg0.field1527;
            int var6 = arg0.field1480 * 128 + arg0.method781((byte) -120) * 64;
            int var7 = arg0.field1536 * 128 + (arg0.method781((byte) 103) * 64);
            int var8 = arg0.field1478 * 128 + arg0.method781((byte) 107) * 64;
            int var9 = arg0.field1498 * 128 + arg0.method781((byte) 36) * 64;
            arg0.field5109 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg0.field5108 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg0.field1575 = 0;
        int var10 = -111 / ((arg1 - 45) / 44);
        if (arg0.field1475 == 0) {
            arg0.method771(0, 8192, false);
        }
        if (arg0.field1475 == 1) {
            arg0.method771(0, 12288, false);
        }
        if (arg0.field1475 == 2) {
            arg0.method771(0, 0, false);
        }
        if (arg0.field1475 == 3) {
            arg0.method771(0, 4096, false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 224)
    public static final void method918(int arg0) {
        field1816++;
        if (class159.field2378 != null) {
            class578.field8241.method951(arg0 - 8790);
            class227.method1505();
            class429.method2555((byte) 119);
            class539.method3030((byte) -126);
            class260.method1651(true);
            class491.method2808((byte) -76);
            if (class580.field8259 != null) {
                class580.field8259.method1501((byte) 18);
            }
            class93.method823(-13);
            class414.method2504(-122);
            class115.method946(-31688);
            class382.method2327(false, (byte) 91);
            class144.method1058((byte) -118);
            for (int var1 = 0; var1 < 2048; var1++) {
                class400 var5 = class39.field536[var1];
                if (var5 != null) {
                    var5.field1573 = null;
                    for (int var6 = 0; var6 < var5.field1569.length; var6++) {
                        var5.field1569[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class313.field4570; var2++) {
                class170 var3 = class629.field8848[var2].field2623;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1569.length; var4++) {
                        var3.field1569[var4] = null;
                    }
                }
            }
            class373.field5401 = null;
            class81.field1444 = null;
            class159.field2378.method1163(6510);
            class159.field2378 = null;
        }
        if (arg0 != 0) {
            field1818 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IILvt;)V", line = 302)
    private class109(int arg0, int arg1, class343 arg2) {
        this.field1806 = arg2;
        this.field1815 = arg1;
        this.field1812 = arg0;
        this.field1809 = this.field1806.field4916 * this.field1815;
        if (this.field1812 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;", line = 317)
    public final String toString() {
        field1811++;
        throw new IllegalStateException();
    }
}
