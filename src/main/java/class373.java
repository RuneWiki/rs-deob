import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class373 {

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "Lvl;")
    private class13 field5301 = new class13();

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Lmn;")
    private class368 field5303 = new class368();

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    private int field5305;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    private int field5304;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Leq;")
    private class213 field5302;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "[Lll;")
    public static class366[] field5298 = new class366[75];

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "[I")
    public static int[] field5297 = new int[6];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "[[B")
    public static byte[][] field5296;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(JB)Lvl;")
    public final class13 method2364(long arg0, byte arg1) {
        if (arg1 > -25) {
            this.field5303 = null;
        }
        field5299++;
        class13 var4 = (class13) this.field5302.method1465(arg0, -6008);
        if (var4 != null) {
            this.field5303.method2338(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
    public final void method2365(boolean arg0) {
        field5293++;
        if (!arg0) {
            this.method2367(-121L, null, -1);
        }
        this.field5303.method2342(2110355138);
        this.field5302.method1466(0);
        this.field5301 = new class13();
        this.field5305 = this.field5304;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IJ)V")
    public final void method2366(int arg0, long arg1) {
        field5294++;
        class13 var4 = (class13) this.field5302.method1465(arg1, -6008);
        if (var4 != null) {
            var4.method2314((byte) 73);
            var4.method115(true);
            this.field5305++;
        }
        if (arg0 > -110) {
            this.method2366(36, -86L);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(JLvl;I)V")
    public final void method2367(long arg0, class13 arg1, int arg2) {
        field5295++;
        if (~this.field5305 == arg2) {
            class13 var5 = this.field5303.method2341(20);
            var5.method2314((byte) 113);
            var5.method115(true);
            if (this.field5301 == var5) {
                class13 var6 = this.field5303.method2341(20);
                var6.method2314((byte) 79);
                var6.method115(true);
            }
        } else {
            this.field5305--;
        }
        this.field5302.method1468((byte) 37, arg0, arg1);
        this.field5303.method2338(true, arg1);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method2368(byte arg0) {
        if (arg0 != -90) {
            method2368((byte) -74);
        }
        field5297 = null;
        field5298 = null;
        field5296 = null;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
    public class373(int arg0) {
        this.field5305 = arg0;
        this.field5304 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5302 = new class213(var2);
    }
}
