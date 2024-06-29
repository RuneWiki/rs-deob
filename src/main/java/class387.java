import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class387 extends class345 {

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field5834 = 0;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
    public boolean field5837 = false;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Z")
    private boolean field5838 = false;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lni;")
    private class521 field5833 = new class521();

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    private int field5841 = 0;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lfr;")
    public class497 field5840 = new class497();

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Z")
    private boolean field5846 = false;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field5842 = 0;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lpv;")
    public class46 field5843 = new class46();

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[Loh;")
    public class453[] field5832 = new class453[8192];

    @OriginalMember(owner = "client!li", name = "o", descriptor = "J")
    private long field5836;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "J")
    private long field5835;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[Z")
    private static boolean[] field5831 = new boolean[8];

    @OriginalMember(owner = "client!li", name = "r", descriptor = "[Z")
    private static boolean[] field5839 = new boolean[8];

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field5844;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field5845;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public int field5849;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([Ldh;Z)V", line = 5)
    private final void method2314(class254[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5839[var3] = false;
        }
        label73: for (class490 var4 = (class490) this.field5840.method2957(107); var4 != null; var4 = (class490) this.field5840.method2947(-95)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field7305 || arg0[var7].field3440 == var4.field7305) {
                        field5839[var7] = true;
                        var4.method2922(1445);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method876((byte) -96);
                this.field5842--;
                if (var4.method2438(true)) {
                    var4.method2440(-63);
                    class30.field428--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5842 != 8; var5++) {
            if (!field5839[var5]) {
                class490 var6 = null;
                if (arg0[var5].method1512(1024).field3262 == 1 && class30.field428 < 32) {
                    var6 = new class490(arg0[var5], this);
                    class206.field2995.method2824(-1, var6, (long) arg0[var5].field3441);
                    class30.field428++;
                }
                if (var6 == null) {
                    var6 = new class490(arg0[var5], this);
                }
                this.field5840.method2958(var6, (byte) 76);
                this.field5842++;
                field5839[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lya;J)Z", line = 90)
    public final boolean method2315(class11 arg0, long arg1) {
        if (this.field5836 == this.field5835) {
            this.method2317();
        } else {
            this.method2323();
        }
        if (arg1 - this.field5836 > 750L) {
            this.method2321();
            return false;
        }
        int var4 = (int) (arg1 - this.field5835);
        if (this.field5846) {
            for (class384 var5 = (class384) this.field5833.method3089(12); var5 != null; var5 = (class384) this.field5833.method3088((byte) -65)) {
                for (int var6 = 0; var6 < var5.field5786.field205; var6++) {
                    var5.method2303((byte) 90, arg1, !this.field5838, arg0, 1);
                }
            }
            this.field5846 = false;
        }
        for (class384 var7 = (class384) this.field5833.method3089(-86); var7 != null; var7 = (class384) this.field5833.method3088((byte) -65)) {
            var7.method2303((byte) -101, arg1, !this.field5838, arg0, var4);
        }
        this.field5835 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()Lpv;", line = 139)
    public final class46 method2316() {
        return this.field5843;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V", line = 143)
    private final void method2317() {
        this.field5838 = false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lya;J[Lng;[Ldh;Z)V", line = 147)
    public final void method2318(class11 arg0, long arg1, class165[] arg2, class254[] arg3, boolean arg4) {
        if (!this.field5837) {
            this.method2319(arg0, arg2, arg4);
            this.method2314(arg3, arg4);
            this.field5836 = arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lya;[Lng;Z)V", line = 159)
    private final void method2319(class11 arg0, class165[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5831[var4] = false;
        }
        label64: for (class384 var5 = (class384) this.field5833.method3089(94); var5 != null; var5 = (class384) this.field5833.method3088((byte) -65)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5760 || arg1[var8].field2453 == var5.field5760) {
                        field5831[var8] = true;
                        var5.method2306(-1485162504);
                        var5.field5784 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5763 == 0) {
                    var5.method2096((byte) 127);
                    this.field5841--;
                } else {
                    var5.field5784 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5841 != 8; var6++) {
            if (!field5831[var6]) {
                class384 var7 = new class384(arg0, arg1[var6], this, this.field5836);
                this.field5833.method3094(-2713, var7);
                this.field5841++;
                field5831[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()V", line = 231)
    public final void method2320() {
        this.field5846 = true;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V", line = 331)
    public class387(int arg0) {
        class534.field7857.method3094(-2713, this);
        this.field5836 = arg0;
        this.field5835 = arg0;
        this.field5846 = true;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()V", line = 238)
    public final void method2321() {
        this.field5837 = true;
        for (class490 var1 = (class490) this.field5840.method2957(113); var1 != null; var1 = (class490) this.field5840.method2947(74)) {
            if (var1.field7302.field3262 == 1) {
                var1.method2440(-112);
            }
        }
        this.field5832 = new class453[8192];
        this.field5834 = 0;
        this.field5833 = new class521();
        this.field5841 = 0;
        this.field5840 = new class497();
        this.field5842 = 0;
        this.method2096((byte) 123);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V", line = 261)
    public final void method2322() {
        this.field5843.field596.method787(-58);
        for (class384 var1 = (class384) this.field5833.method3089(96); var1 != null; var1 = (class384) this.field5833.method3088((byte) -65)) {
            var1.method2302(this.field5835, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "()V", line = 276)
    public final void method2323() {
        this.field5838 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V", line = 283)
    public final void method2324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5849 = arg0;
        this.field5848 = arg1;
        this.field5845 = arg2;
        this.field5847 = arg3;
        this.field5844 = arg4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(J)V", line = 290)
    public final void method2325(long arg0) {
        this.field5836 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "()V", line = 305)
    public static void method2326() {
        field5831 = null;
        field5839 = null;
    }
}
