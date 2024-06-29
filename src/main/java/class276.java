import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class276 extends class222 {

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    private int field4614;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    private int field4605;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    private int field4621;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lna;")
    public static class26 field4610 = class69.method505("Hierhin gehen", (byte) -122);

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lve;")
    public static class266 field4620;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[Lqf;")
    public static class148[] field4615;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V", line = 13)
    public final void method305(int arg0, boolean arg1, int arg2) {
        int var4 = this.field4611 * arg2 >> 12;
        field4622++;
        int var5 = this.field4621 * arg2 >> 12;
        int var6 = this.field4605 * arg0 >> 12;
        int var7 = this.field4616 * arg0 >> 12;
        int var8 = this.field4614 * arg2 >> 12;
        int var9 = this.field4609 * arg0 >> 12;
        int var10 = this.field4619 * arg2 >> 12;
        if (!arg1) {
            field4610 = (class26) null;
        }
        int var11 = this.field4606 * arg0 >> 12;
        class317.method2197(var5, var10, var9, var11, var7, var4, var8, var6, this.field3516, 0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1950(int arg0) {
        class1.method5(4096, 5);
        field4608++;
        class45.method345(5, (byte) 69);
        class293.method2058(5, true);
        class146.method967(2, 5);
        class319.method2217((byte) -62, 5);
        class85.method666(5, arg0 - 25956);
        class224.method1496(5, (byte) -118);
        class131.method887(5, arg0 ^ 0xFFFF99E6);
        class82.method634((byte) 14, 5);
        class66.method491(arg0 ^ arg0, 5);
        class84.method653(5, 0);
        class10.method69(arg0 - 27256, 5);
        class304.method2136(arg0 - 26090, 5);
        class304.method2137(5, 109);
        class174.method1192(5, 64);
        class39.method316(-13508, 50);
        class135.method912(-5, 5);
        class14.method107(104, 5);
        class46.field721.method1985(-125, 5);
        class295.field4913.method1985(arg0 ^ 0xFFFF99E2, 5);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(III)V", line = 73)
    public final void method303(int arg0, int arg1, int arg2) {
        field4613++;
        if (arg0 != 2) {
            field4620 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V", line = 83)
    public final void method307(int arg0, int arg1, int arg2) {
        field4612++;
        if (arg2 != 4898) {
            this.field4614 = -64;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 100)
    public class276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4616 = arg1;
        this.field4619 = arg6;
        this.field4614 = arg4;
        this.field4611 = arg0;
        this.field4606 = arg7;
        this.field4609 = arg5;
        this.field4605 = arg3;
        this.field4621 = arg2;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)[Lqf;", line = 124)
    public static final class148[] method1951(int arg0) {
        field4618++;
        if (arg0 != -26802) {
            return (class148[]) null;
        }
        class148[] var1 = new class148[class313.field5350];
        for (int var2 = 0; var2 < class313.field5350; var2++) {
            byte[] var3 = class205.field3203[var2];
            int var4 = class98.field1596[var2] * class141.field2149[var2];
            if (class268.field4431[var2]) {
                int[] var5 = new int[var4];
                byte[] var6 = class59.field961[var2];
                for (int var7 = 0; var7 < var4; var7++) {
                    var5[var7] = class240.method1652(class190.field2975[class4.method23(var3[var7], 255)], class4.method23(-16777216, var6[var7] << 24));
                }
                if (class255.field4184) {
                    var1[var2] = new class119(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var5);
                } else {
                    var1[var2] = new class253(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var5);
                }
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class190.field2975[class4.method23(var3[var9], 255)];
                }
                if (class255.field4184) {
                    var1[var2] = new class130(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var8);
                } else {
                    var1[var2] = new class256(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var8);
                }
            }
        }
        class160.method1088((byte) 106);
        return var1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 194)
    public static void method1952(byte arg0) {
        field4620 = null;
        if (arg0 != 100) {
            method1951(-79);
        }
        field4610 = null;
        field4615 = null;
    }
}
