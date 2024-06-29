import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class117 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lid;")
    public static class226 field1987 = new class226();

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[I")
    public static int[] field1994 = new int[1000];

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1989;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Leg;")
    public static final class37 method834(int arg0, int arg1) {
        class37 var2 = class163.method1096(arg0, (byte) -35);
        int var3 = var2.method222((byte) 125) - 3;
        if (arg1 < 16) {
            method837((byte) -114);
        }
        while (var3 > 0) {
            var2 = class156.method1061((byte) 84, new class37[] { var2.method247(0, var3, 0), class264.field4647, var2.method263(var3, false) });
            var3 -= 3;
        }
        field1993++;
        if (var2.method222((byte) 92) > 9) {
            return class156.method1061((byte) 71, new class37[] { class214.field3708, var2.method247(0, var2.method222((byte) -103) - 8, 0), class267.field4682, class200.field3398, var2, class167.field2782 });
        } else if (var2.method222((byte) -32) > 6) {
            return class156.method1061((byte) -97, new class37[] { class21.field269, var2.method247(0, var2.method222((byte) -71) - 4, 0), class59.field957, class200.field3398, var2, class167.field2782 });
        } else {
            return class156.method1061((byte) 49, new class37[] { class56.field862, var2, class177.field2962 });
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method835(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class274.field4815; var3++) {
            for (int var4 = 0; var4 < class175.field2936; var4++) {
                for (int var5 = 0; var5 < class160.field2675; var5++) {
                    class111 var6 = class286.field5048[var3][var4][var5];
                    if (var6 != null) {
                        class79 var7 = var6.field1868;
                        if (var7 != null && var7.field1221.method464()) {
                            class74.method496(var7.field1221, var3, var4, var5, 1, 1);
                            if (var7.field1235 != null && var7.field1235.method464()) {
                                class74.method496(var7.field1235, var3, var4, var5, 1, 1);
                                var7.field1221.method468(var7.field1235, 0, 0, 0, false);
                                var7.field1235 = var7.field1235.method467(arg0, arg1, arg2);
                            }
                            var7.field1221 = var7.field1221.method467(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1880; var8++) {
                            class27 var10 = var6.field1858[var8];
                            if (var10 != null && var10.field400.method464()) {
                                class74.method496(var10.field400, var3, var4, var5, var10.field387 + 1 - var10.field402, var10.field399 - var10.field397 + 1);
                                var10.field400 = var10.field400.method467(arg0, arg1, arg2);
                            }
                        }
                        class239 var9 = var6.field1876;
                        if (var9 != null && var9.field4251.method464()) {
                            class124.method892(var9.field4251, var3, var4, var5);
                            var9.field4251 = var9.field4251.method467(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BLva;)V")
    public final void method836(int arg0, byte[] arg1, class187 arg2) {
        if (arg0 != 1) {
            method835(66, 13, -48);
        }
        field1988++;
        if (arg2.field3175[arg2.field3169] != 31 || arg2.field3175[arg2.field3169 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1989 == null) {
            this.field1989 = new Inflater(true);
        }
        try {
            this.field1989.setInput(arg2.field3175, arg2.field3169 + 10, arg2.field3175.length + -arg2.field3169 - 10 + -8);
            this.field1989.inflate(arg1);
        } catch (Exception var4) {
            this.field1989.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1989.reset();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method837(byte arg0) {
        field1987 = null;
        if (arg0 != 45) {
            field1995 = -106;
        }
        field1994 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public static final void method838(int arg0, int arg1) {
        if (arg0 == 10) {
            field1991++;
            class274 var2 = class166.method1116(8, arg1, true);
            var2.method1840(10000);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class117() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V")
    private class117(int arg0, int arg1, int arg2) {
    }
}
