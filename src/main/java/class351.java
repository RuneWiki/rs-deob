import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class351 {

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Ldha;")
    private class84 field5150 = new class84();

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    private int field5153;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lee;")
    private class706 field5141;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "Lmga;")
    public static class739 field5147 = new class739(65, 2);

    @OriginalMember(owner = "client!js", name = "r", descriptor = "[[I")
    public static int[][] field5158 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "Lvr;")
    public static class147 field5154;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILit;)V")
    private final void method2207(int arg0, class674 arg1) {
        if (arg0 != 2) {
            this.field5145 = 99;
        }
        if (arg1 != null) {
            arg1.method792((byte) -125);
            arg1.method1811(28064);
            this.field5145 += arg1.field9470;
        }
        field5142++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public final void method2208(int arg0, int arg1) {
        field5155++;
        if (class273.field4058 != null) {
            for (class674 var3 = (class674) this.field5150.method697(0); var3 != null; var3 = (class674) this.field5150.method699(true)) {
                if (var3.method834(102)) {
                    if (var3.method835(true) == null) {
                        var3.method792((byte) -118);
                        var3.method1811(28064);
                        this.field5145 += var3.field9470;
                    }
                } else if ((++var3.field4141) > ((long) arg1)) {
                    class674 var4 = class273.field4058.method1119((byte) 42, var3);
                    this.field5141.method3962(var3.field1409, var4, -124);
                    class154.method1129(var3, false, var4);
                    var3.method792((byte) -96);
                    var3.method1811(28064);
                }
            }
        }
        if (arg0 >= -96) {
            this.method2215(-125, null);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        this.field5150.method700(114);
        field5148++;
        if (arg0 > 37) {
            this.field5141.method3959(0);
            this.field5145 = this.field5153;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILpj;Ljava/lang/Object;)V")
    private final void method2210(int arg0, int arg1, class157 arg2, Object arg3) {
        int var5 = 121 / ((arg0 - 70) / 47);
        field5149++;
        if (arg1 > this.field5153) {
            throw new IllegalStateException("s>cs");
        }
        this.method2215(8, arg2);
        this.field5145 -= arg1;
        while (this.field5145 < 0) {
            class674 var7 = (class674) this.field5150.method698(42);
            this.method2207(2, var7);
        }
        class110 var6 = new class110(arg2, arg3, arg1);
        this.field5141.method3962(arg2.method1155(false), var6, -110);
        this.field5150.method695(-128, var6);
        var6.field4141 = 0L;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILpj;)Ljava/lang/Object;")
    public final Object method2211(int arg0, class157 arg1) {
        field5156++;
        long var3 = arg1.method1155(false);
        class674 var5 = (class674) this.field5141.method3953(var3, 14);
        if (arg0 != 7) {
            this.field5153 = -32;
        }
        while (var5 != null) {
            if (var5.field9471.method1156(arg1, arg0 - 29334)) {
                Object var6 = var5.method835(true);
                if (var6 != null) {
                    if (var5.method834(arg0 ^ 0x7C)) {
                        class110 var7 = new class110(arg1, var6, var5.field9470);
                        this.field5141.method3962(var5.field1409, var7, -113);
                        this.field5150.method695(-82, var7);
                        var7.field4141 = 0L;
                        var5.method792((byte) -127);
                        var5.method1811(28064);
                    } else {
                        this.field5150.method695(-99, var5);
                        var5.field4141 = 0L;
                    }
                    return var6;
                }
                var5.method792((byte) -102);
                var5.method1811(28064);
                this.field5145 += var5.field9470;
            }
            var5 = (class674) this.field5141.method3958(-15797);
        }
        return null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)I")
    public final int method2212(int arg0) {
        if (arg0 != 7) {
            field5147 = null;
        }
        field5146++;
        return this.field5145;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;Lpj;B)V")
    public final void method2213(Object arg0, class157 arg1, byte arg2) {
        field5144++;
        this.method2210(-62, 1, arg1, arg0);
        if (arg2 > -119) {
            this.method2211(24, null);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public static void method2214(int arg0) {
        if (arg0 != 1) {
            method2214(99);
        }
        field5154 = null;
        field5147 = null;
        field5158 = null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(ILpj;)V")
    private final void method2215(int arg0, class157 arg1) {
        field5151++;
        long var3 = arg1.method1155(false);
        for (class674 var5 = (class674) this.field5141.method3953(var3, arg0 + 6); var5 != null; var5 = (class674) this.field5141.method3958(arg0 ^ 0xFFFFC243)) {
            if (var5.field9471.method1156(arg1, -29327)) {
                this.method2207(2, var5);
                break;
            }
        }
        if (arg0 != 8) {
            this.field5150 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public final void method2216(boolean arg0) {
        for (class674 var2 = (class674) this.field5150.method697(0); var2 != null; var2 = (class674) this.field5150.method699(true)) {
            if (var2.method834(125)) {
                var2.method792((byte) -92);
                var2.method1811(28064);
                this.field5145 += var2.field9470;
            }
        }
        if (arg0) {
            field5152++;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)I")
    public final int method2217(boolean arg0) {
        if (arg0) {
            this.method2215(27, null);
        }
        field5143++;
        return this.field5153;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
    public class351(int arg0) {
        this.field5145 = arg0;
        this.field5153 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5141 = new class706(var2);
    }
}
