import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class167 implements class159 {

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lwfa;")
    public class196 field2293;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lfp;")
    private class323 field2288;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Z")
    public static boolean field2289 = false;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lpca;")
    public static class714 field2290 = new class714(4);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Loia;")
    public class88 field2287;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)V")
    public void method1056(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field2293.field2610.method12(class192.field2561, this.field2287.method656(), -89) + this.field2293.field2611;
            int var4 = this.field2293.field2605.method826(this.field2287.method670(), 0, class191.field2553) + this.field2293.field2607;
            this.field2287.method658(var3, var4);
        }
        field2292++;
        if (arg1 != -3340) {
            method1086((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method1086(byte arg0) {
        field2290 = null;
        if (arg0 != 74) {
            method1086((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        field2291++;
        if (arg0 != -32252) {
            this.field2287 = null;
        }
        return this.field2288.method2088(this.field2293.field2609, -120);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public final void method55(int arg0) {
        this.field2287 = class674.method3686(-20770, this.field2288, this.field2293.field2609);
        if (arg0 != 11133) {
            this.field2287 = null;
        }
        field2286++;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lfp;Lwfa;)V")
    public class167(class323 arg0, class196 arg1) {
        this.field2293 = arg1;
        this.field2288 = arg0;
    }
}
