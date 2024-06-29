import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class class1 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Lsu;")
    public static class192 field3 = new class192();

    @OriginalMember(owner = "client!us", name = "j", descriptor = "[I")
    public static int[] field10 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Luea;I)V")
    public static final void method1(class286 arg0, int arg1) {
        field1++;
        class572 var2 = (class572) class231.field3288.method2061(-17305, (long) arg0.field6388);
        if (arg1 != 2) {
            return;
        }
        if (var2 == null) {
            class80.method637((byte) -95, arg0, 0, null, arg0.field6483[0], arg0.field520, null, arg0.field6477[0]);
        } else {
            var2.method3150(19486);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V")
    public abstract void method2(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static final void method3(int arg0) {
        field6++;
        if (class500.field6862 == class46.field682) {
            return;
        }
        if (arg0 != 8) {
            method5(-7, null);
        }
        try {
            class2.method11("tbrefresh", class258.field3685, 21190);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
    public static final void method4(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        field8++;
        method5(1, class322.field4757);
        class357.field5104++;
        class288.field4014.method740(arg2, true);
        class288.field4014.method705(true, arg0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILuc;)V")
    public static final void method5(int arg0, class27 arg1) {
        class288.field4014.method3727(arg1.method127(arg0 + 15632), (byte) 108);
        field5++;
        if (arg0 != 1) {
            method3(-47);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(III)V")
    public abstract void method6(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
    public static void method7(byte arg0) {
        field3 = null;
        int var1 = 9 / ((27 - arg0) / 53);
        field10 = null;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(III)V")
    public class1(int arg0, int arg1, int arg2) {
        this.field4 = arg1;
        this.field2 = arg2;
        this.field7 = arg0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)V")
    public abstract void method8(int arg0, int arg1, boolean arg2);
}
