import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class236 extends class626 {

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "Z")
    public boolean field3349;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "Lcfa;")
    public class167 field3348;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "Lkr;")
    public static class743 field3340;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "Z")
    public boolean field3344;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "Z")
    public boolean field3346;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "Z")
    private boolean field3350;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
    public static final void method1603(byte arg0) {
        field3342++;
        int var1 = 50 % ((-arg0 - 19) / 44);
        for (class236 var2 = (class236) class160.field2387.method4209(false); var2 != null; var2 = (class236) class160.field2387.method4207(9356)) {
            if (var2.field3348.method3310(65)) {
                class272.method1799(-123, var2.field3343);
            } else {
                var2.field3348.method1241(false);
                try {
                    var2.field3348.method3302((byte) -12);
                } catch (Exception var6) {
                    class621.method3591("TV: " + var2.field3343, var6, (byte) -104);
                    class272.method1799(-106, var2.field3343);
                }
                if (!var2.field3350 && !var2.field3344) {
                    class3 var4 = var2.field3348.method3311(31615);
                    if (var4 != null) {
                        class493 var5 = var4.method12(true);
                        if (var5 != null) {
                            var5.method2966((byte) 22, var2.field3347);
                            class484.field6848.method4053(var5);
                            var2.field3350 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V")
    public static void method1604(byte arg0) {
        field3340 = null;
        if (arg0 < 5) {
            field3345 = -8;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILcfa;IZ)V")
    public class236(int arg0, class167 arg1, int arg2, boolean arg3) {
        this.field3347 = arg2;
        this.field3343 = arg0;
        this.field3349 = arg3;
        this.field3348 = arg1;
    }
}
