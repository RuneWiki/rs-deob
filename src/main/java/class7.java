import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class7 {

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lmq;")
    private class104 field128 = new class104(128);

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Lmq;")
    public class104 field138 = new class104(64);

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lfc;")
    private class343 field119;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "Lfc;")
    public class343 field137;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[[B")
    public static byte[][] field121 = new byte[250][];

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
    public static int[] field130 = new int[4096];

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Z")
    public static boolean field122 = false;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
    public static boolean field132 = false;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lbn;")
    public static class106 field125;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Lfn;")
    public static class52 field129;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 3)
    public final void method83(int arg0) {
        field123++;
        if (arg0 < 114) {
            this.field138 = null;
        }
        class104 var2 = this.field128;
        synchronized (this.field128) {
            this.field128.method656(98);
        }
        class104 var3 = this.field138;
        synchronized (this.field138) {
            this.field138.method656(115);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 26)
    public static final void method84(int arg0) {
        field127++;
        if (!class184.field2678) {
            return;
        }
        class363 var1 = class485.method2840(class58.field919, class99.field1406, (byte) 21);
        if (var1 != null && var1.field5099 != null) {
            class32 var2 = new class32();
            var2.field517 = var1;
            var2.field518 = var1.field5099;
            class212.method1331(var2);
        }
        class202.field2897 = -1;
        class299.field4106 = -1;
        class184.field2678 = false;
        if (var1 != null) {
            class356.method2141(-103, var1);
        }
        if (arg0 != 36) {
            method87(125, (class196) null);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)Lfr;", line = 58)
    public final class442 method85(int arg0, boolean arg1) {
        field118++;
        class104 var3 = this.field128;
        class442 var4;
        synchronized (this.field128) {
            var4 = (class442) this.field128.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field119.method2029(36, arg0, 0);
        class442 var6 = new class442();
        var6.field6106 = this;
        if (!arg1) {
            return null;
        }
        var6.field6081 = arg0;
        if (var5 != null) {
            var6.method2564(new class425(var5), 0);
        }
        var6.method2572(!arg1);
        class104 var7 = this.field128;
        synchronized (this.field128) {
            this.field128.method653(42, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V", line = 90)
    public final void method86(int arg0, int arg1) {
        field126++;
        class104 var3 = this.field128;
        synchronized (this.field128) {
            this.field128.method666(arg1, false);
        }
        class104 var4 = this.field138;
        synchronized (this.field138) {
            this.field138.method666(arg1, false);
            if (arg0 != 9060) {
                field125 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILld;)V", line = 107)
    public static final void method87(int arg0, class196 arg1) {
        if (arg0 >= -103) {
            field120 = -113;
        }
        field133++;
        for (class462 var2 = (class462) class366.field5213.method1544(-100); var2 != null; var2 = (class462) class366.field5213.method1546((byte) -42)) {
            if (var2.field6495 == arg1) {
                if (var2.field6507 != null) {
                    class386.field5445.method1313(var2.field6507);
                    var2.field6507 = null;
                }
                var2.method1182(28818);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 140)
    public final void method88(int arg0) {
        field134++;
        class104 var2 = this.field128;
        synchronized (this.field128) {
            this.field128.method654(false);
        }
        class104 var3 = this.field138;
        synchronized (this.field138) {
            this.field138.method654(false);
            if (arg0 <= 50) {
                field120 = -47;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V", line = 156)
    public static void method89(int arg0) {
        field121 = null;
        if (arg0 == -7207) {
            field129 = null;
            field130 = null;
            field125 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V", line = 173)
    public final void method90(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            this.field128 = null;
        }
        this.field128 = new class104(arg1);
        field131++;
        this.field138 = new class104(arg2);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lwk;B)Z", line = 201)
    public static final boolean method91(class278 arg0, byte arg1) {
        field135++;
        if (arg1 >= -79) {
            method91((class278) null, (byte) -31);
        }
        class475 var2 = class304.field4160.method2075(arg0.method211(true), false);
        if (var2.field6702 == -1) {
            return true;
        } else {
            class78 var3 = class425.field5861.method377((byte) 65, var2.field6702);
            return var3.field1175 == -1 ? true : var3.method535((byte) -43);
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;)V", line = 241)
    public class7(class328 arg0, int arg1, class343 arg2, class343 arg3) {
        this.field119 = arg2;
        this.field137 = arg3;
        this.field119.method2054(0, 36);
    }
}
