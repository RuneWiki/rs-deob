import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class9 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field104 = "Loading world list data";

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "B")
    public byte field109;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "B")
    public byte field110;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "B")
    public byte field111;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "B")
    public byte field113;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lfh;")
    public static class140 field103;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "S")
    public short field114;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Z")
    public boolean field102;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Z")
    public boolean field106;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Z")
    public boolean field107;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Z")
    public boolean field115;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
    public boolean field116;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[[[B")
    public static byte[][][] field100;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[B")
    public static byte[][][] field101;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 10)
    public static void method60(byte arg0) {
        field100 = (byte[][][]) null;
        if (arg0 != -104) {
            method63((byte) -78, 69, 12, (Component) null);
        }
        field104 = null;
        field101 = (byte[][][]) null;
        field103 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[Lub;", line = 23)
    public static final class181[] method61(byte arg0) {
        if (class5.field59 == null) {
            class181[] var1 = class249.method1747(14, class157.field2216);
            class181[] var2 = new class181[var1.length];
            int var3 = 0;
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class181 var5 = var1[var4];
                if ((var5.field2477 <= 0 || var5.field2477 >= 24) && var5.field2474 >= 800 && var5.field2473 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class181 var7 = var2[var6];
                        if (var5.field2474 == var7.field2474 && var5.field2473 == var7.field2473) {
                            if (var7.field2477 < var5.field2477) {
                                var2[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class5.field59 = new class181[var3];
            class87.method628(var2, 0, class5.field59, 0, var3);
            int[] var8 = new int[class5.field59.length];
            for (int var9 = 0; var9 < class5.field59.length; var9++) {
                class181 var10 = class5.field59[var9];
                var8[var9] = var10.field2474 * var10.field2473;
            }
            class59.method444(var8, (byte) 119, class5.field59);
        }
        if (arg0 >= -29) {
            method62(47, -82, -101);
        }
        field98++;
        return class5.field59;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J", line = 107)
    public static final long method62(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        return var3 == null || var3.field1552 == null ? 0L : var3.field1552.field3302;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIILjava/awt/Component;)Lob;", line = 131)
    public static final class160 method63(byte arg0, int arg1, int arg2, Component arg3) {
        field112++;
        try {
            if (arg0 >= -95) {
                return (class160) null;
            } else {
                Class var4 = Class.forName("fk");
                class160 var5 = (class160) var4.getDeclaredConstructor().newInstance();
                var5.method325(arg3, arg2, arg1, (byte) 0);
                return var5;
            }
        } catch (Throwable var8) {
            class45 var7 = new class45();
            var7.method325(arg3, arg2, arg1, (byte) 0);
            return var7;
        }
    }
}
