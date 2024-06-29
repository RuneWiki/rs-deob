import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class411 extends class349 {

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Z")
    private boolean field5963 = false;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Z")
    public boolean field5959 = false;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5967 = 0;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lfi;")
    private class8 field5964 = new class8();

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    private int field5969 = 0;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lm;")
    public class242 field5968 = new class242();

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    private int field5976 = 0;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Z")
    private boolean field5974 = false;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lai;")
    public class305 field5973 = new class305();

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[Lhm;")
    public class196[] field5960 = new class196[8192];

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "J")
    private long field5962;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
    private long field5966;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[Z")
    private static boolean[] field5961 = new boolean[8];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[Z")
    private static boolean[] field5965 = new boolean[8];

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field5971;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 3)
    public final void method2596() {
        this.field5963 = true;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lai;", line = 10)
    public final class305 method2597() {
        return this.field5973;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method2598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5971 = arg0;
        this.field5970 = arg1;
        this.field5975 = arg3;
        this.field5972 = arg4;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V", line = 332)
    public class411(int arg0) {
        class309.field4576.method50(this, (byte) -92);
        this.field5962 = (long) arg0;
        this.field5966 = (long) arg0;
        this.field5974 = true;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()V", line = 26)
    private final void method2599() {
        this.field5963 = false;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()V", line = 32)
    public final void method2600() {
        this.field5974 = true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ltj;J[Ljq;[Lti;Z)V", line = 35)
    public final void method2601(class298 arg0, long arg1, class230[] arg2, class1[] arg3, boolean arg4) {
        if (!this.field5959) {
            this.method2602(arg0, arg2, arg4);
            this.method2608(arg3, arg4);
            this.field5962 = arg1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ltj;[Ljq;Z)V", line = 45)
    private final void method2602(class298 arg0, class230[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5961[var4] = false;
        }
        label64: for (class342 var5 = (class342) this.field5964.method54((byte) 18); var5 != null; var5 = (class342) this.field5964.method53((byte) 123)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5100 || arg1[var8].field3166 == var5.field5100) {
                        field5961[var8] = true;
                        var5.method2268(0);
                        var5.field5099 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5102 == 0) {
                    var5.method2308(-55);
                    this.field5969--;
                } else {
                    var5.field5099 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5969 != 8; var6++) {
            if (!field5961[var6]) {
                class342 var7 = new class342(arg0, arg1[var6], this, this.field5962);
                this.field5964.method50(var7, (byte) -118);
                this.field5969++;
                field5961[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V", line = 117)
    public static void method2603() {
        field5961 = null;
        field5965 = null;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()V", line = 121)
    public final void method2604() {
        this.field5959 = true;
        for (class296 var1 = (class296) this.field5968.method1575(0); var1 != null; var1 = (class296) this.field5968.method1573((byte) -128)) {
            if (var1.field4464.field69 == 1) {
                var1.method2764((byte) 119);
            }
        }
        this.field5960 = new class196[8192];
        this.field5967 = 0;
        this.field5964 = new class8();
        this.field5969 = 0;
        this.field5968 = new class242();
        this.field5976 = 0;
        this.method2308(-42);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ltj;J)Z", line = 142)
    public final boolean method2605(class298 arg0, long arg1) {
        if (this.field5966 == this.field5962) {
            this.method2599();
        } else {
            this.method2596();
        }
        if (arg1 - this.field5962 > 750L) {
            this.method2604();
            return false;
        }
        int var4 = (int) (arg1 - this.field5966);
        if (this.field5974) {
            for (class342 var5 = (class342) this.field5964.method54((byte) 18); var5 != null; var5 = (class342) this.field5964.method53((byte) 126)) {
                for (int var6 = 0; var6 < var5.field5089.field6044; var6++) {
                    var5.method2269(!this.field5963, arg1, 1, arg0, 64);
                }
            }
            this.field5974 = false;
        }
        for (class342 var7 = (class342) this.field5964.method54((byte) 18); var7 != null; var7 = (class342) this.field5964.method53((byte) 121)) {
            var7.method2269(!this.field5963, arg1, var4, arg0, 64);
        }
        this.field5966 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()V", line = 190)
    public final void method2606() {
        this.field5973.field4561.method2137(0);
        for (class342 var1 = (class342) this.field5964.method54((byte) 18); var1 != null; var1 = (class342) this.field5964.method53((byte) 122)) {
            var1.method2266(this.field5966, -120);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(J)V", line = 207)
    public final void method2607(long arg0) {
        this.field5962 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lti;Z)V", line = 212)
    private final void method2608(class1[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5965[var3] = false;
        }
        label73: for (class296 var4 = (class296) this.field5968.method1575(0); var4 != null; var4 = (class296) this.field5968.method1573((byte) -128)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4460 || arg0[var7].field11 == var4.field4460) {
                        field5965[var7] = true;
                        var4.method2007(0);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2632(true);
                this.field5976--;
                if (var4.method2767((byte) -128)) {
                    var4.method2764((byte) 119);
                    class229.field3153--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5976 != 8; var5++) {
            if (!field5965[var5]) {
                class296 var6 = null;
                if (class373.method2450(125, arg0[var5].field7).field69 == 1 && class229.field3153 < 32) {
                    var6 = new class296(arg0[var5], this);
                    class189.field2593.method1318(var6, -27, (long) arg0[var5].field7);
                    class229.field3153++;
                }
                if (var6 == null) {
                    var6 = new class296(arg0[var5], this);
                }
                this.field5968.method1560(-117, var6);
                this.field5976++;
                field5965[var5] = true;
            }
        }
    }
}
