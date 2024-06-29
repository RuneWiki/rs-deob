import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class202 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lu;")
    private class219 field3329 = new class219();

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Lfe;")
    private class97 field3338;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Lph;")
    public static class229 field3341 = class266.method1858("www)2wtqa", 0);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[[I")
    public static int[][] field3337;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 4)
    public final Object method1413(long arg0, boolean arg1) {
        field3340++;
        if (!arg1) {
            this.method1418((byte) -16, -67);
        }
        class254 var4 = (class254) this.field3338.method713(3365, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method15((byte) 82);
        if (var5 == null) {
            var4.method598(10);
            var4.method224(128);
            this.field3330++;
            return null;
        }
        if (var4.method16(10)) {
            class155 var6 = new class155(var5);
            this.field3338.method710(var6, (byte) 91, var4.field1325);
            this.field3329.method1532(125, var6);
            var6.field468 = 0L;
            var4.method598(120);
            var4.method224(128);
        } else {
            this.field3329.method1532(116, var4);
            var4.field468 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 50)
    public final void method1414(int arg0) {
        for (class254 var2 = (class254) this.field3329.method1529((byte) 0); var2 != null; var2 = (class254) this.field3329.method1533(3)) {
            if (var2.method16(10)) {
                var2.method598(121);
                var2.method224(128);
                this.field3330++;
            }
        }
        if (arg0 > 79) {
            field3331++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 74)
    public final void method1415(int arg0) {
        this.field3329.method1530(1);
        field3336++;
        if (arg0 != -18218) {
            this.method1419(-125L, -108, (Object) null);
        }
        this.field3338.method712(0);
        this.field3330 = this.field3332;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JB)V", line = 98)
    public final void method1416(long arg0, byte arg1) {
        if (arg1 != 101) {
            this.method1418((byte) 55, -112);
        }
        field3334++;
        class254 var4 = (class254) this.field3338.method713(3365, arg0);
        if (var4 != null) {
            var4.method598(70);
            var4.method224(arg1 ^ 0xE5);
            this.field3330++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 120)
    public static void method1417(byte arg0) {
        if (arg0 < 110) {
            field3337 = (int[][]) ((int[][]) null);
        }
        field3337 = (int[][]) null;
        field3341 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V", line = 131)
    public final void method1418(byte arg0, int arg1) {
        if (arg0 != -17) {
            return;
        }
        if (class54.field777 != null) {
            for (class254 var3 = (class254) this.field3329.method1529((byte) 0); var3 != null; var3 = (class254) this.field3329.method1533(3)) {
                if (var3.method16(arg0 ^ 0xFFFFFFE5)) {
                    if (var3.method15((byte) 76) == null) {
                        var3.method598(arg0 ^ 0xFFFFFFD9);
                        var3.method224(128);
                        this.field3330++;
                    }
                } else if ((++var3.field468) > ((long) arg1)) {
                    class254 var4 = class54.field777.method833(var3, true);
                    this.field3338.method710(var4, (byte) 84, var3.field1325);
                    class251.method1763(var3, var4, 0);
                    var3.method598(43);
                    var3.method224(arg0 ^ 0xFFFFFF6F);
                }
            }
        }
        field3342++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 189)
    public final void method1419(long arg0, int arg1, Object arg2) {
        field3333++;
        this.method1416(arg0, (byte) 101);
        if (this.field3330 == 0) {
            class254 var5 = (class254) this.field3329.method1536((byte) 116);
            var5.method598(73);
            var5.method224(arg1 - 5088);
        } else {
            this.field3330--;
        }
        if (arg1 != 5216) {
            field3341 = (class229) null;
        }
        class155 var6 = new class155(arg2);
        this.field3338.method710(var6, (byte) -41, arg0);
        this.field3329.method1532(118, var6);
        var6.field468 = 0L;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)I", line = 219)
    public final int method1420(int arg0) {
        field3335++;
        int var2 = arg0;
        for (class254 var3 = (class254) this.field3329.method1529((byte) 0); var3 != null; var3 = (class254) this.field3329.method1533(3)) {
            if (!var3.method16(arg0 ^ 0xA)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V", line = 252)
    public class202(int arg0) {
        this.field3330 = arg0;
        this.field3332 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3338 = new class97(var2);
    }
}
