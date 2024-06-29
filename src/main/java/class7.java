import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class7 extends class256 {

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "Lce;")
    public static class345 field89 = new class345(128);

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "Ldp;")
    public static class174 field98;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Z")
    public boolean field96;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLri;)V", line = 3)
    public static final void method46(byte arg0, class98 arg1) {
        field97++;
        int var2 = -125 / ((arg0 - 32) / 55);
        for (class324 var3 = (class324) class30.field441.method157((byte) -125); var3 != null; var3 = (class324) class30.field441.method145(-102)) {
            if (var3.field4672 == arg1) {
                if (var3.field4690 != null) {
                    class220.field3275.method511(var3.field4690);
                    var3.field4690 = null;
                }
                var3.method251(122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 45)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        field92++;
        if (arg1 == 47) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 59)
    public static final void method48(int arg0) {
        class234.field3392 = 0;
        field87++;
        class161.field2434 = -1;
        class390.field5656 = -1;
        class11.field136 = -1;
        if (arg0 >= -90) {
            field99 = -13;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ldp;I)V", line = 73)
    public static final void method49(class174 arg0, int arg1) {
        class292.field4338 = arg0;
        field94++;
        class257.field3723 = class292.field4338.method1333(0, 4);
        if (arg1 != 1) {
            field99 = 16;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIILpe;)V", line = 85)
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class390 arg6) {
        field85++;
        if (arg2 != -20504) {
            method51(83, (byte) -34, 47, -55);
        }
        class425.method2665(arg4, 0, arg0, arg3, arg6.field6519, 4227, arg5, arg6.field6520, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBII)I", line = 97)
    public static final int method51(int arg0, byte arg1, int arg2, int arg3) {
        field88++;
        int var4 = arg2 / arg0;
        int var5 = arg2 & arg0 - 1;
        int var6 = arg3 / arg0;
        int var7 = arg0 - 1 & arg3;
        int var8 = class399.method2543(var6, var4, -5386);
        int var9 = class399.method2543(var6, var4 + 1, -5386);
        int var10 = class399.method2543(var6 + 1, var4, -5386);
        if (arg1 != -52) {
            field98 = null;
        }
        int var11 = class399.method2543(var6 + 1, var4 + 1, arg1 ^ 0x153A);
        int var12 = class172.method1313(arg0, var9, 107, var5, var8);
        int var13 = class172.method1313(arg0, var11, 107, var5, var10);
        return class172.method1313(arg0, var13, 101, var7, var12);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V", line = 129)
    public static void method52(boolean arg0) {
        field89 = null;
        if (!arg0) {
            field98 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)Z", line = 149)
    public final boolean method53(byte arg0) {
        field93++;
        return arg0 < 58 ? false : false;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V", line = 163)
    public final void method54(int arg0) {
        field91++;
        if (arg0 != 0) {
            method50(-10, -90, -31, 84, 17, 7, (class390) null);
        }
        throw new IllegalStateException();
    }
}
