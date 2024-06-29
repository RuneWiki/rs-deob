import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class277 {

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "J")
    public long field4482;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Ler;")
    private class92 field4481;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "[I")
    public static int[] field4480 = new int[1];

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "[I")
    public static int[] field4484 = new int[32];

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I", line = 8)
    public static final int method1980(byte arg0) {
        field4486++;
        return arg0 < 81 ? -59 : class529.field7715;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 29)
    public static final void method1981(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field4479++;
        if (arg2 != -23301) {
            field4484 = null;
        }
        class665 var5 = class626.method3656(28613, arg1, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field9408 != null) {
            class438 var6 = new class438();
            var6.field6672 = arg3;
            var6.field6677 = var5;
            var6.field6684 = var5.field9408;
            var6.field6682 = arg4;
            class142.method1201(var6);
        }
        if (class682.field9564 != 10 || !client.method1955(var5).method742(arg4 - 1, -77)) {
            return;
        }
        if (arg4 == 1) {
            class209.field3490++;
            class165 var7 = class271.method1917(class420.field6424, (byte) -121, class87.field1064);
            class111.method1031(true, var5.field9354, var7, arg1, arg0);
            class642.method3726(-684096285, var7);
        }
        if (arg4 == 2) {
            class43.field601++;
            class165 var8 = class271.method1917(class420.field6424, (byte) -92, class599.field8537);
            class111.method1031(true, var5.field9354, var8, arg1, arg0);
            class642.method3726(arg2 - 684072984, var8);
        }
        if (arg4 == 3) {
            client.field4437++;
            class165 var9 = class271.method1917(class420.field6424, (byte) -40, class46.field629);
            class111.method1031(true, var5.field9354, var9, arg1, arg0);
            class642.method3726(arg2 ^ 0x28C62018, var9);
        }
        if (arg4 == 4) {
            class183.field3079++;
            class165 var10 = class271.method1917(class420.field6424, (byte) -40, class597.field8467);
            class111.method1031(true, var5.field9354, var10, arg1, arg0);
            class642.method3726(-684096285, var10);
        }
        if (arg4 == 5) {
            class385.field5983++;
            class165 var11 = class271.method1917(class420.field6424, (byte) -124, class518.field7501);
            class111.method1031(true, var5.field9354, var11, arg1, arg0);
            class642.method3726(-684096285, var11);
        }
        if (arg4 == 6) {
            class361.field5720++;
            class165 var12 = class271.method1917(class420.field6424, (byte) -96, class38.field523);
            class111.method1031(true, var5.field9354, var12, arg1, arg0);
            class642.method3726(arg2 ^ 0x28C62018, var12);
        }
        if (arg4 == 7) {
            class203.field3277++;
            class165 var13 = class271.method1917(class420.field6424, (byte) -40, class138.field2334);
            class111.method1031(true, var5.field9354, var13, arg1, arg0);
            class642.method3726(-684096285, var13);
        }
        if (arg4 == 8) {
            class668.field9452++;
            class165 var14 = class271.method1917(class420.field6424, (byte) -102, class475.field7030);
            class111.method1031(true, var5.field9354, var14, arg1, arg0);
            class642.method3726(arg2 ^ 0x28C62018, var14);
        }
        if (arg4 == 9) {
            class184.field3100++;
            class165 var15 = class271.method1917(class420.field6424, (byte) -48, class54.field713);
            class111.method1031(true, var5.field9354, var15, arg1, arg0);
            class642.method3726(-684096285, var15);
        }
        if (arg4 == 10) {
            class405.field6245++;
            class165 var16 = class271.method1917(class420.field6424, (byte) -89, class106.field1725);
            class111.method1031(true, var5.field9354, var16, arg1, arg0);
            class642.method3726(-684096285, var16);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ler;J[Ljf;)V", line = 160)
    public class277(class92 arg0, long arg1, class199[] arg2) {
        this.field4482 = arg1;
        this.field4481 = arg0;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V", line = 171)
    public static void method1982(boolean arg0) {
        field4484 = null;
        if (!arg0) {
            method1982(false);
        }
        field4480 = null;
    }

    @OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V", line = 182)
    protected final void finalize() throws Throwable {
        this.field4481.method883(113, this.field4482);
        field4483++;
        super.finalize();
    }
}
