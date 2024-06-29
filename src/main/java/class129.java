import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class129 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lvj;")
    public static class373 field1586 = new class373(18, 3);

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1591 = -1;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 5)
    public static void method730(int arg0) {
        if (arg0 != -138105567) {
            field1590 = 44;
        }
        field1586 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)I", line = 15)
    public static final int method731(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1589++;
        if (arg1 != -27265) {
            return 118;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()V", line = 37)
    public static final void method732() {
        for (int var0 = 0; var0 < class639.field9193; var0++) {
            class598 var1 = class539.field7889[var0];
            class511.method2938(var1);
            class539.field7889[var0] = null;
        }
        class639.field9193 = 0;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lwt;", line = 50)
    public static final class258 method733(int arg0) {
        field1588++;
        if (class353.field4597 == null || class119.field1507 == null) {
            return null;
        }
        class258 var1 = (class258) class119.field1507.method3381(-16796);
        if (arg0 != 3) {
            method733(-102);
        }
        while (var1 != null) {
            class107 var2 = class353.field4587.method3245((byte) -119, var1.field3313);
            if (var2 != null && var2.field1319 && var2.method621(false, class353.field4594)) {
                return var1;
            }
            var1 = (class258) class119.field1507.method3381(-16796);
        }
        return null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 82)
    public static final void method734(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4496 != null) {
            var3.field4496 = null;
        }
        if (var3.field4497 != null) {
            var3.field4497 = null;
        }
    }
}
