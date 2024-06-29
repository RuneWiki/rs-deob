import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class320 extends class392 {

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "[F")
    public static float[] field4553 = new float[4];

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Lmp;")
    public static class565 field4556 = new class565();

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "F")
    public static float field4546;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "F")
    public static float field4550;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Lgga;")
    public static class513 field4558;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILol;)Lwda;", line = 5)
    public static final class490 method1938(int arg0, class431 arg1) {
        ++field4555;
        String var2 = arg1.method2532((byte) -114);
        class565 var3 = class551.method3180(-1)[arg1.method2557(14929)];
        class345 var4 = class91.method777(true)[arg1.method2557(14929)];
        int var5 = arg1.method2528((byte) 89);
        int var6 = arg1.method2528((byte) 89);
        int var7 = arg1.method2557(14929);
        int var8 = arg1.method2557(14929);
        int var9 = arg1.method2557(14929);
        int var10 = arg1.method2565((byte) -121);
        int var11 = arg1.method2565((byte) -103);
        if (arg0 != 0) {
            field4553 = null;
        }
        int var12 = arg1.method2526(17);
        int var13 = arg1.method2526(17);
        int var14 = arg1.method2526(17);
        return new class490(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I", line = 44)
    public final int method290(int arg0, int arg1) {
        ++field4554;
        if (!class402.method2391(-2, super.field5454.field9482.method2338(17539))) {
            return 3;
        } else {
            if (arg1 >= -124) {
                field4558 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(ILw;)V", line = 59)
    public class320(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z", line = 62)
    public final boolean method1939(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field4552;
            return class402.method2391(-2, super.field5454.field9482.method2338(arg0 ^ 17539));
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lw;)V", line = 77)
    public class320(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)V", line = 80)
    public static final void method1940(int arg0, int arg1) {
        ++field4557;
        class371 var2 = class490.method2867((byte) -84, arg1, (long) arg0);
        var2.method2215(arg1 + -5);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V", line = 96)
    public final void method291(boolean arg0) {
        if (arg0) {
            this.method286((byte) -49, -24);
        }
        ++field4549;
        if (super.field5454.field9482.method2337((byte) 82) && !class402.method2391(-2, super.field5454.field9482.method2338(17539))) {
            super.field5452 = 0;
        }
        if (super.field5452 < 0 || ~super.field5452 < -2) {
            super.field5452 = this.method292(!arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V", line = 117)
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field4547;
        int var3 = -43 / ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)I", line = 127)
    public final int method1941(int arg0) {
        ++field4551;
        if (arg0 != 17539) {
            this.method292(false);
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I", line = 138)
    public final int method292(boolean arg0) {
        if (!arg0) {
            method1938(-114, (class431) null);
        }
        ++field4548;
        return 0;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V", line = 151)
    public static void method1942(int arg0) {
        field4553 = null;
        if (arg0 == 4159) {
            field4558 = null;
            field4556 = null;
        }
    }
}
