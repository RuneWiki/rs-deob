import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class295 extends class287 {

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4578 = "wishes to trade with you.";

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Ltn;")
    public static class38 field4577;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Z")
    public boolean field4574;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method2054(int arg0) {
        field4576++;
        if (arg0 != 1) {
            method2064(-56, -7);
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I", line = 16)
    public final int method2055(boolean arg0) {
        if (arg0) {
            return -50;
        } else {
            field4573++;
            return 1;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 28)
    public static void method2056(byte arg0) {
        if (arg0 != 125) {
            field4575 = -123;
        }
        field4578 = null;
        field4577 = null;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z", line = 45)
    public final boolean method2059(int arg0) {
        field4571++;
        if (arg0 != 1) {
            this.field4574 = true;
        }
        return this.field4574;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Z", line = 70)
    public final boolean method2063(int arg0) {
        if (arg0 != 0) {
            this.method2059(24);
        }
        field4581++;
        return false;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)La;", line = 87)
    public static final class281 method2064(int arg0, int arg1) {
        class281 var2 = (class281) class58.field825.method1351((long) arg1, 63);
        field4570++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 0) {
            byte[] var3 = class1.field11.method1813(class25.method240(arg1, true), class342.method2363(arg1, (byte) 90), true);
            class281 var4 = new class281();
            var4.field4322 = arg1;
            if (var3 != null) {
                var4.method1996(new class6(var3), arg0 + 106);
            }
            var4.method1993(51);
            class58.field825.method1347(var4, (long) arg1, (byte) -49);
            return var4;
        } else {
            return (class281) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()I", line = 116)
    public int method2066() {
        field4579++;
        return 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()Z")
    public abstract boolean method2057();

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()Z")
    public abstract boolean method2058();

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public abstract void method2060(int arg0);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()V")
    public abstract void method2061();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public abstract void method2062(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
    public abstract void method2065(int arg0, int arg1, int arg2, int arg3, int arg4);
}
