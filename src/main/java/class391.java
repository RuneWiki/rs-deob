import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class class391 extends class488 {

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "S")
    public short field4919;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "Lwp;")
    public static class453 field4926 = new class453(5, 4);

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "(B)V")
    public static final void method2097(byte arg0) {
        if (arg0 > 77) {
            ++field4921;
            class450 var1 = class199.field2526;
            synchronized (class199.field2526) {
                class199.field2526.method2412((byte) 60);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Z")
    public final boolean method787(int arg0) {
        if (arg0 != 4095) {
            method2101(1, -123);
        }
        ++field4920;
        return class354.field4511[(super.field6461 >> class52.field775) - class516.field7041 + class479.field6372][(super.field6464 >> class52.field775) + -class204.field2599 + class479.field6372];
    }

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)V")
    public static final void method2098(int arg0) {
        class236.field2951.method2406(arg0 + 18257);
        if (arg0 == 128) {
            ++field4923;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([Lgga;I)I")
    public final int method785(class332[] arg0, int arg1) {
        int var3 = -19 % ((arg1 - -87) / 32);
        ++field4918;
        return this.method2640((byte) 66, arg0, super.field6461 >> class52.field775, super.field6464 >> class52.field775);
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(IIIIII)V")
    public class391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4919 = (short) arg5;
        super.field6458 = arg1;
        super.field6461 = arg0;
        super.field6464 = arg2;
        super.field6470 = (byte) arg3;
        super.field6456 = (byte) arg4;
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(B)Z")
    public final boolean method786(byte arg0) {
        if (arg0 <= 111) {
            method2097((byte) -40);
        }
        ++field4922;
        return class455.method2433(super.field6456, super.field6461 >> class52.field775, -1, super.field6464 >> class52.field775);
    }

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "(B)V")
    public static void method2099(byte arg0) {
        field4926 = null;
        if (arg0 != -72) {
            method2098(115);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "(I)V")
    public static final void method2100(int arg0) {
        if (arg0 != -6899) {
            method2098(-53);
        }
        if (class86.field1212 == null) {
            class487 var1 = new class487();
            byte[] var2 = var1.method2638(0, 128, 128, 16);
            class86.field1212 = class57.method357(-137, var2, false);
        }
        ++field4924;
        if (class304.field3738 == null) {
            class582 var3 = new class582();
            byte[] var4 = var3.method3210(12743, 16, 128, 128);
            class304.field3738 = class57.method357(-137, var4, false);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)I")
    public static final int method2101(int arg0, int arg1) {
        if (arg1 != 128) {
            return 40;
        } else {
            ++field4925;
            int var7 = arg0 - 1;
            int var2 = var7 | var7 >>> 1;
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }
}
