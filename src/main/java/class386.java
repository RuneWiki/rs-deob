import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class386 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lwf;")
    private class117 field5308 = new class117(64);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lkda;")
    private class328 field5304;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lfp;")
    public static class271 field5312 = new class271(2);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5313 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII)I", line = 5)
    public static final int method2296(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field5309++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg1 <= 11) {
            return -78;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V", line = 27)
    public final void method2297(boolean arg0, int arg1) {
        field5303++;
        class117 var3 = this.field5308;
        synchronized (this.field5308) {
            if (arg0) {
                field5313 = -76;
            }
            this.field5308.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 41)
    public final void method2298(int arg0) {
        class117 var2 = this.field5308;
        synchronized (this.field5308) {
            this.field5308.method837(arg0 ^ 0x15F9);
        }
        field5311++;
        if (arg0 != 5511) {
            this.field5304 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 55)
    public static void method2299(boolean arg0) {
        if (!arg0) {
            field5312 = null;
        }
        field5312 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 72)
    public final void method2300(byte arg0) {
        if (arg0 <= 96) {
            this.method2298(-101);
        }
        field5310++;
        class117 var2 = this.field5308;
        synchronized (this.field5308) {
            this.field5308.method846(0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lai;IIII)V", line = 85)
    public static final void method2301(class515 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5305++;
        if (arg4 != -654509970) {
            return;
        }
        long var5 = (long) (arg2 << 28 | arg1 << 14 | arg3);
        class85 var7 = (class85) class45.field544.method2799(var5, true);
        if (var7 == null) {
            class85 var8 = new class85();
            class45.field544.method2797(arg4 + 654505736, var8, var5);
            var8.field1212.method131(arg0, 0);
            return;
        }
        class540 var9 = class150.field2242.method3606((byte) 7, arg0.field7347);
        int var10 = var9.field8088;
        if (var9.field8055 == 1) {
            var10 = (arg0.field7344 + 1) * var10;
        }
        for (class515 var11 = (class515) var7.field1212.method124((byte) 42); var11 != null; var11 = (class515) var7.field1212.method120(68)) {
            class540 var12 = class150.field2242.method3606((byte) -99, var11.field7347);
            int var13 = var12.field8088;
            if (var12.field8055 == 1) {
                var13 = (var11.field7344 + 1) * var13;
            }
            if (var10 > var13) {
                class232.method1490(var11, arg0, 35);
                return;
            }
        }
        var7.field1212.method131(arg0, 0);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lbt;ILkda;)V", line = 143)
    public class386(class39 arg0, int arg1, class328 arg2) {
        this.field5304 = arg2;
        if (this.field5304 == null) {
            this.field5307 = 0;
        } else {
            this.field5307 = this.field5304.method1975(56, 16);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lfea;", line = 162)
    public final class123 method2302(int arg0, int arg1) {
        field5306++;
        if (arg0 != 3) {
            return null;
        }
        class117 var3 = this.field5308;
        class123 var4;
        synchronized (this.field5308) {
            var4 = (class123) this.field5308.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field5304;
        byte[] var6;
        synchronized (this.field5304) {
            var6 = this.field5304.method1966(arg1, 16, true);
        }
        class123 var7 = new class123();
        if (var6 != null) {
            var7.method874(new class148(var6), 65);
        }
        class117 var8 = this.field5308;
        synchronized (this.field5308) {
            this.field5308.method835((byte) 120, (long) arg1, var7);
            return var7;
        }
    }
}
