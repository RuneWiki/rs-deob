import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class351 {

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
    public boolean field4874 = false;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    public static int[] field4870 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field4866 = new int[32];

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lwc;")
    public static class46 field4877 = new class46();

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lii;")
    public class358 field4871;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILbt;)V")
    public final void method2170(int arg0, class32 arg1) {
        field4869++;
        if (arg0 >= -12) {
            return;
        }
        while (true) {
            int var3 = arg1.method201((byte) -108);
            if (var3 == 0) {
                return;
            }
            this.method2173(var3, arg1, -4);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method2171(byte arg0) {
        field4877 = null;
        if (arg0 < 108) {
            method2171((byte) 82);
        }
        field4870 = null;
        field4866 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
    public final boolean method2172(boolean arg0) {
        field4868++;
        if (!arg0) {
            this.method2173(72, (class32) null, 119);
        }
        return this.field4871.field4946.method700((byte) -44, this.field4873);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILbt;I)V")
    private final void method2173(int arg0, class32 arg1, int arg2) {
        field4867++;
        if (arg0 == 1) {
            this.field4873 = arg1.method215((byte) 92);
        } else if (arg0 == 2) {
            this.field4875 = arg1.method219(-120);
        } else if (arg0 == 3) {
            this.field4874 = true;
        } else if (arg0 == 4) {
            this.field4873 = -1;
        }
        if (arg2 != -4) {
            method2171((byte) -102);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
    public static final boolean method2174(int arg0) {
        field4872++;
        class395 var1 = (class395) class450.field6121.field1573.field6048;
        if (var1 == null || class450.field6121.field1573 == var1) {
            return false;
        }
        if (var1.field5469 >= 2000) {
            var1.field5469 -= 2000;
        }
        if (var1.field5469 == 1011) {
            return true;
        } else {
            if (arg0 != -1) {
                method2171((byte) 99);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZILwm;)Ljd;")
    public final class139 method2175(boolean arg0, boolean arg1, int arg2, class364 arg3) {
        field4876++;
        long var5 = (long) (this.field4873 | arg2 << 16 | (arg0 ? 262144 : 0) | arg3.field4999 << 19);
        class139 var7 = (class139) this.field4871.field4958.method493((byte) 19, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field4871.field4946.method700((byte) -24, this.field4873)) {
            class325 var8 = class325.method1817(this.field4871.field4946, this.field4873, 0);
            if (var8 != null) {
                var8.field4335 = var8.field4336 = var8.field4332 = var8.field4329 = 0;
                if (arg0) {
                    var8.method1822();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1810();
                }
            }
            class139 var10 = arg3.method2050(var8, true);
            if (arg1) {
                return null;
            } else {
                if (var10 != null) {
                    this.field4871.field4958.method505(var5, var10, 122);
                }
                return var10;
            }
        } else {
            return null;
        }
    }
}
