import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class131 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Loe;")
    public static class127 field2082 = new class127(70, 8);

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public static int[] field2089 = new int[8];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Llt;")
    public static class458 field2087;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B[Ltq;I)V", line = 5)
    public static final void method872(byte arg0, class427[] arg1, int arg2) {
        field2091++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class427 var4 = arg1[var3];
            if (var4 != null && var4.field6253 == arg2 && !client.method1190(var4)) {
                if (var4.field6197 == 0) {
                    method872((byte) 117, arg1, var4.field6157);
                    if (var4.field6193 != null) {
                        method872((byte) 112, var4.field6193, var4.field6157);
                    }
                    class394 var5 = (class394) class245.field3741.method2409(false, (long) var4.field6157);
                    if (var5 != null) {
                        class388.method2307(var5.field5750, (byte) -72);
                    }
                }
                if (var4.field6197 == 6 && var4.field6275 != -1) {
                    class87 var6 = class429.field6302.method106(-126, var4.field6275);
                    if (var6 != null) {
                        var4.field6290 += class115.field1951;
                        while (var6.field1526[var4.field6217] < var4.field6290) {
                            var4.field6290 -= var6.field1526[var4.field6217];
                            var4.field6217++;
                            if (var4.field6217 >= var6.field1512.length) {
                                var4.field6217 -= var6.field1511;
                                if (var4.field6217 < 0 || var6.field1512.length <= var4.field6217) {
                                    var4.field6217 = 0;
                                }
                            }
                            var4.field6235 = var4.field6217 + 1;
                            if (var4.field6235 >= var6.field1512.length) {
                                var4.field6235 -= var6.field1511;
                                if (var4.field6235 < 0 || var4.field6235 >= var6.field1512.length) {
                                    var4.field6235 = -1;
                                }
                            }
                            class288.method1754(var4, 0);
                        }
                    }
                }
            }
        }
        if (arg0 <= 69) {
            method873(false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)I", line = 94)
    public static final int method873(boolean arg0) {
        field2081++;
        class318 var1 = class345.field5116;
        boolean var2 = false;
        if (class30.field395 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class318.method1989(1, 0, 0, null, null, var3);
            var2 = true;
        }
        long var4 = class344.method2111((byte) -109);
        if (arg0) {
            method874((byte) 57);
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1922(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class344.method2111((byte) -97) - var4);
        var1.method1943(0, -16777216, 0, 100, 1, 100);
        if (var2) {
            var1.method1974(-25261);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;", line = 139)
    public final String toString() {
        field2084++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 148)
    public static void method874(byte arg0) {
        field2082 = null;
        field2087 = null;
        if (arg0 > -85) {
            field2087 = null;
        }
        field2089 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V", line = 160)
    public static final void method875(byte arg0, int arg1, int arg2) {
        field2088++;
        class64 var3 = class230.method1387(0, (byte) 40, 15);
        var3.method441((byte) 58);
        if (arg0 <= 95) {
            method873(false);
        }
        var3.field1051 = arg2;
        var3.field1059 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIII)V", line = 187)
    public class131(int arg0, int arg1, int arg2, int arg3) {
        this.field2086 = arg1;
        this.field2090 = arg3;
        this.field2083 = arg2;
        this.field2085 = arg0;
    }
}
