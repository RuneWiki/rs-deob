import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class326 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ler;")
    private class157 field5006 = new class157(64);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lns;")
    private class438 field4998;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lns;")
    private class438 field5007;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4999 = 500;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[Z")
    public static boolean[] field5002 = new boolean[100];

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field5003 = 0;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lse;")
    public static class4 field4997;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2107(int arg0) {
        field5001++;
        if (arg0 != -6) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class185.field2614[var1] = false;
        }
        class314.field4800 = 0;
        class362.field5619 = 0;
        class432.field6409 = 1;
        class11.field184 = -1;
        class479.field7007 = -1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method2108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -88) {
            return;
        }
        if (class396.field6021 <= arg0 && class443.field6591 >= arg0) {
            int var5 = class278.method1758(class158.field2302, class410.field6176, arg3, 81);
            int var6 = class278.method1758(class158.field2302, class410.field6176, arg2, 78);
            class346.method2207(var5, -126, var6, arg0, arg1);
        }
        field5005++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lap;I)V", line = 62)
    public static final void method2109(class337 arg0, int arg1) {
        if ((arg0 instanceof class194)) {
            class194 var3 = (class194) arg0;
            if (var3.field2768 != null) {
                class120.method772((byte) -92, class339.field5365.field2210 != var3.field2210, var3);
            }
        } else if (arg0 instanceof class322) {
            class322 var2 = (class322) arg0;
            class69.method478(var2, class339.field5365.field2210 != var2.field2210, arg1 ^ 0xFFFFFE85);
        }
        if (arg1 != 0) {
            field5002 = null;
        }
        field5004++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lac;", line = 103)
    public final class493 method2110(int arg0, int arg1) {
        field5000++;
        class493 var3 = (class493) this.field5006.method1013((long) arg0, (byte) -106);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field4998.method2650(arg0 & 0x7FFF, -29, 0);
        } else {
            var4 = this.field5007.method2650(arg0, -88, 0);
        }
        if (arg1 <= 125) {
            field4999 = -61;
        }
        class493 var5 = new class493();
        if (var4 != null) {
            var5.method2932(new class91(var4), 22);
        }
        if (arg0 >= 32768) {
            var5.method2928(32768);
        }
        this.field5006.method1012(-84, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ILns;Lns;)V", line = 154)
    public class326(int arg0, class438 arg1, class438 arg2) {
        this.field4998 = arg2;
        this.field5007 = arg1;
        if (this.field5007 != null) {
            this.field5007.method2645(1, 0);
        }
        if (this.field4998 != null) {
            this.field4998.method2645(1, 0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 144)
    public static void method2111(int arg0) {
        field5002 = null;
        if (arg0 != 500) {
            field4999 = 34;
        }
        field4997 = null;
    }
}
