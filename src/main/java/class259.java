import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class259 extends class235 {

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field4610 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field4608 = -1;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field4623 = 0;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Z")
    public boolean field4624 = false;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    private int field4617 = -32768;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    private int field4621;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Lri;")
    private class65 field4611;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Lqk;")
    public static class207 field4618 = class24.method212(255, "sch-Utteln:");

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Lqk;")
    public static class207 field4615 = class24.method212(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "Le;")
    private class64 field4626;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Lba;")
    private final class166 method1802(int arg0) {
        if (arg0 >= -60) {
            this.method1804(-109, 0);
        }
        field4627++;
        class234 var2 = class165.method1192(this.field4621, -101);
        class166 var3;
        if (this.field4624) {
            var3 = var2.method1673(-1, 66, -1, 0);
        } else {
            var3 = var2.method1673(this.field4610, -88, this.field4608, this.field4623);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field4614++;
        class166 var13 = this.method1802(-83);
        if (var13 != null) {
            var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4626);
            this.field4617 = var13.method80();
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Lqk;")
    public static final class207 method1803(int arg0) {
        if (arg0 <= 49) {
            field4618 = null;
        }
        class207 var1 = class188.field3314;
        if (class164.field2903 != 0) {
            var1 = class279.field4888;
        }
        field4625++;
        class207 var2 = class100.field1800;
        if (class121.field2093 != null) {
            var2 = class105.method757(false, new class207[] { class28.field574, class121.field2093 });
        }
        return class105.method757(false, new class207[] { class58.field1065, var1, class132.field2287, class262.method1815(class272.field4795, (byte) -105), class30.field615, class262.method1815(class156.field2737, (byte) -118), var2, class15.field237 });
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
    public final int method80() {
        field4616++;
        return this.field4617;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public final void method1804(int arg0, int arg1) {
        field4628++;
        if (arg0 != 0 || this.field4624) {
            return;
        }
        this.field4623 += arg1;
        while (this.field4611.field1150[this.field4610] < this.field4623) {
            this.field4623 -= this.field4611.field1150[this.field4610];
            this.field4610++;
            if (this.field4611.field1180.length <= this.field4610) {
                this.field4624 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4629++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4618 = null;
        field4615 = null;
        int var1 = -25 / ((50 - arg0) / 53);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIII)V")
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4619 = arg6 + arg5;
        this.field4620 = arg1;
        this.field4609 = arg2;
        this.field4612 = arg3;
        this.field4621 = arg0;
        this.field4622 = arg4;
        int var8 = class165.method1192(this.field4621, -128).field4332;
        if (var8 == -1) {
            this.field4624 = true;
        } else {
            this.field4624 = false;
            this.field4611 = class16.method101((byte) 61, var8);
        }
    }
}
