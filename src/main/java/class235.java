import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class235 extends class196 {

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V", line = 8)
    public final void method1611(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = this.field3535 << 3;
        field3526++;
        int var7 = this.field3527 << 3;
        int var8 = (arg0 << 4) + (var7 & 0xF);
        if (arg3 <= -10) {
            int var9 = (arg2 << 4) + (var6 & 0xF);
            this.method941(var6, var7, var9, var8, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 36)
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 - arg4 >= class157.field2357 && class184.field2761 >= arg3 + arg4 && class185.field2769 <= (arg2 - arg4) && class166.field2494 >= arg2 + arg4) {
            class116.method798(arg4, arg0, (byte) -109, arg3, arg2);
        } else {
            class155.method1105(arg2, -117, arg0, arg3, arg4);
        }
        field3529++;
        if (arg1 >= -77) {
            method1613((byte[]) null, -68);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BI)[B", line = 55)
    public static final byte[] method1613(byte[] arg0, int arg1) {
        if (arg1 != 354978147) {
            field3536 = 27;
        }
        int var2 = arg0.length;
        field3528++;
        byte[] var3 = new byte[var2];
        class85.method589(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIIII)V", line = 80)
    public static final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class184.field2761 = arg2;
        if (arg3 == 256) {
            class166.field2494 = arg4;
            field3530++;
            class157.field2357 = arg1;
            class185.field2769 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)Lqm;", line = 94)
    public static final class58 method1615(int arg0, int arg1) {
        field3531++;
        class58 var2 = (class58) class97.field1452.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field1944.method1441(class279.method1948(arg0, 65479), (byte) -44, class185.method1275(arg0, 2500));
        class58 var4 = new class58();
        var4.field725 = arg0;
        if (var3 != null) {
            var4.method383(-1, new class263(var3));
        }
        if (arg1 == 1128) {
            var4.method391(-42);
            class97.field1452.method2175((long) arg0, var4, 103);
            return var4;
        } else {
            return (class58) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public abstract void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public abstract void method925(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
    public abstract void method949(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public abstract void method942(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIII)V")
    public abstract void method946(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
    public abstract void method935(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)V")
    public abstract void method932(int arg0, int arg1);
}
