import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class746 extends class1 {

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field10388 = new String[100];

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "Lg;")
    public static class594 field10396 = new class594("LIVE", 0);

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "[I")
    public static int[] field10400 = new int[1];

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public int field10386;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public int field10390;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
    public int field10391;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public int field10395;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public int field10398;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public int field10399;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "Ld;")
    public static class268 field10393;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "Leaa;")
    public static class380 field10392;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "Lmr;")
    public static class613 field10394;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "Ljava/lang/String;")
    public String field10389;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 3)
    public static void method4148(int arg0) {
        field10396 = null;
        field10392 = null;
        field10388 = null;
        field10393 = null;
        field10394 = null;
        field10400 = null;
        if (arg0 != 0) {
            field10388 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIBI)V", line = 22)
    public static final void method4149(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field10397++;
        if (arg3 <= 88) {
            method4148(56);
        }
        for (int var5 = 0; var5 < class752.field10450; var5++) {
            Rectangle var6 = class391.field5453[var5];
            if (arg1 < (var6.x + var6.width) && (arg0 + arg1) > var6.x && arg4 < var6.y + var6.height && var6.y < arg2 + arg4) {
                class142.field1966[var5] = true;
            }
        }
        class217.method1422(arg0 + arg1, arg2 + arg4, -108, arg1, arg4);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lpaa;IB)V", line = 56)
    public static final void method4150(class712[] arg0, int arg1, byte arg2) {
        field10387++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class712 var4 = arg0[var3];
            if (var4 != null && var4.field10030 == arg1 && !client.method2685(var4)) {
                if (var4.field10039 == 0) {
                    method4150(arg0, var4.field9998, (byte) -103);
                    if (var4.field9981 != null) {
                        method4150(var4.field9981, var4.field9998, (byte) -103);
                    }
                    class14 var5 = (class14) class426.field5894.method1381(true, (long) var4.field9998);
                    if (var5 != null) {
                        class370.method2063(var5.field194, -1);
                    }
                }
                if (var4.field10039 == 6 && var4.field9943 != -1) {
                    class103 var6 = class274.field3684.method1881((byte) -80, var4.field9943);
                    if (var6 != null) {
                        var4.field9970 += class284.field3763;
                        int var7 = var4.field9947;
                        while (var4.field9970 > var6.field1493[var4.field9947]) {
                            var4.field9970 -= var6.field1493[var4.field9947];
                            var4.field9947++;
                            if (var6.field1472.length <= var4.field9947) {
                                var4.field9947 -= var6.field1487;
                                if (var4.field9947 < 0 || var6.field1472.length <= var4.field9947) {
                                    var4.field9947 = 0;
                                }
                            }
                            var4.field10040 = var4.field9947 + 1;
                            if (var6.field1472.length <= var4.field10040) {
                                var4.field10040 -= var6.field1487;
                                if (var4.field10040 < 0 || var6.field1472.length <= var4.field10040) {
                                    var4.field10040 = -1;
                                }
                            }
                            class116.method764(var4, -1176833464);
                        }
                        if (var4.field9947 != var7) {
                            class670.method3837(false, var4.field9947, var6);
                        }
                    }
                }
            }
        }
        if (arg2 != -103) {
            method4149(-50, -17, 38, (byte) 7, -76);
        }
    }
}
