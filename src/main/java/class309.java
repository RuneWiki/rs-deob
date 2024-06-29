import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class309 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ltn;")
    public static class109 field4193 = new class109(16);

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4197 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lfk;")
    public static class23 field4195;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lij;")
    public static class316 field4194;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lvg;ILvg;)V", line = 16)
    public static final void method1861(class108 arg0, int arg1, class108 arg2) {
        field4190++;
        class349.field4701++;
        class88.field1232.method1151(72, (byte) -116);
        class88.field1232.method2261(arg2.field1631, -176);
        class88.field1232.method2286(arg2.field1647, -65);
        class88.field1232.method2267(arg2.field1575, (byte) -103);
        class88.field1232.method2261(arg0.field1631, -176);
        class88.field1232.method2286(arg0.field1575, -65);
        int var3 = 3 % ((-arg1 - 63) / 43);
        class88.field1232.method2279((byte) -81, arg0.field1647);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 34)
    public static void method1863(int arg0) {
        if (arg0 < -93) {
            field4194 = null;
            field4193 = null;
            field4195 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILrg;)V", line = 48)
    public static final void method1864(int arg0, class366 arg1) {
        for (int var2 = arg0; var2 < class17.field231; var2++) {
            int var3 = arg1.method2251(arg0 - 94);
            int var4 = arg1.method2297(13352);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class72.field1045[var3] != null) {
                class72.field1045[var3].field1973 = var4;
            }
        }
        field4191++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 78)
    public static final void method1867(boolean arg0) {
        field4192++;
        class316.field4280 = class211.method1415(8, 2048, 35, arg0, 16, 0.4F, 8, 4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lij;I)V", line = 86)
    public static final void method1868(class316 arg0, int arg1) {
        class432.field6123 = arg0;
        if (arg1 != 35) {
            method1867(true);
        }
        field4196++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public abstract void method1856();

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([I)V")
    public abstract void method1857(int[] arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public abstract void method1858(int arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public abstract void method1859(int arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[I)V")
    public abstract void method1860(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public abstract void method1862(int arg0);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public abstract void method1865(int arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public abstract void method1866(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V")
    public abstract void method1869(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public abstract void method1870(int arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;)V")
    public abstract void method1871(class309 arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
