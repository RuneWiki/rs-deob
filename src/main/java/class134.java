import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class134 extends class18 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
    public boolean field1932 = false;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field1937 = 0;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Z")
    private boolean field1935 = false;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lbr;")
    private class380 field1934 = new class380();

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    private int field1939 = 0;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lvr;")
    public class306 field1940 = new class306();

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
    private boolean field1942 = false;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    private int field1944 = 0;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lvo;")
    public class258 field1948 = new class258();

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[Lwr;")
    public class60[] field1931 = new class60[8192];

    @OriginalMember(owner = "client!li", name = "n", descriptor = "J")
    private long field1938;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "J")
    private long field1933;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[Z")
    private static boolean[] field1930 = new boolean[8];

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[Z")
    private static boolean[] field1936 = new boolean[8];

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public final void method862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1945 = arg0;
        this.field1943 = arg1;
        this.field1946 = arg2;
        this.field1941 = arg3;
        this.field1947 = arg4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    private final void method863() {
        this.field1935 = false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
    public final void method864() {
        this.field1948.field3603.method2575(-7870);
        for (class35 var1 = (class35) this.field1934.method2358((byte) 94); var1 != null; var1 = (class35) this.field1934.method2363(31844)) {
            var1.method263(this.field1933, 189);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
    public final void method865() {
        this.field1942 = true;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
    public final void method866() {
        this.field1932 = true;
        for (class180 var1 = (class180) this.field1940.method1970(64); var1 != null; var1 = (class180) this.field1940.method1960(24)) {
            if (var1.field2563.field4236 == 1) {
                var1.method560((byte) -108);
            }
        }
        this.field1931 = new class60[8192];
        this.field1937 = 0;
        this.field1934 = new class380();
        this.field1939 = 0;
        this.field1940 = new class306();
        this.field1944 = 0;
        this.method142(0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method867(class496 arg0, long arg1) {
        if (this.field1938 == this.field1933) {
            this.method863();
        } else {
            this.method872();
        }
        if (arg1 - this.field1938 > 750L) {
            this.method866();
            return false;
        }
        int var4 = (int) (arg1 - this.field1933);
        if (this.field1942) {
            for (class35 var5 = (class35) this.field1934.method2358((byte) 115); var5 != null; var5 = (class35) this.field1934.method2363(31844)) {
                for (int var6 = 0; var6 < var5.field574.field7081; var6++) {
                    var5.method264(!this.field1935, 1, arg1, arg0, -115);
                }
            }
            this.field1942 = false;
        }
        for (class35 var7 = (class35) this.field1934.method2358((byte) 100); var7 != null; var7 = (class35) this.field1934.method2363(31844)) {
            var7.method264(!this.field1935, var4, arg1, arg0, -119);
        }
        this.field1933 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
    public static void method868() {
        field1930 = null;
        field1936 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lqa;J[Le;[Lil;Z)V")
    public final void method869(class496 arg0, long arg1, class525[] arg2, class439[] arg3, boolean arg4) {
        if (!this.field1932) {
            this.method871(arg0, arg2, arg4);
            this.method873(arg3, arg4);
            this.field1938 = arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "()Lvo;")
    public final class258 method870() {
        return this.field1948;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lqa;[Le;Z)V")
    private final void method871(class496 arg0, class525[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1930[var4] = false;
        }
        label64: for (class35 var5 = (class35) this.field1934.method2358((byte) 86); var5 != null; var5 = (class35) this.field1934.method2363(31844)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field550 || arg1[var8].field7767 == var5.field550) {
                        field1930[var8] = true;
                        var5.method259((byte) -104);
                        var5.field572 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field554 == 0) {
                    var5.method142(0);
                    this.field1939--;
                } else {
                    var5.field572 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1939 != 8; var6++) {
            if (!field1930[var6]) {
                class35 var7 = new class35(arg0, arg1[var6], this, this.field1938);
                this.field1934.method2353(var7, -9798);
                this.field1939++;
                field1930[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "()V")
    public final void method872() {
        this.field1935 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([Lil;Z)V")
    private final void method873(class439[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1936[var3] = false;
        }
        label73: for (class180 var4 = (class180) this.field1940.method1970(64); var4 != null; var4 = (class180) this.field1940.method1960(24)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2564 || arg0[var7].field6534 == var4.field2564) {
                        field1936[var7] = true;
                        var4.method1293((byte) -106);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2785((byte) -120);
                this.field1944--;
                if (var4.method558(-28)) {
                    var4.method560((byte) -124);
                    class217.field3013--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1944 != 8; var5++) {
            if (!field1936[var5]) {
                class180 var6 = null;
                if (arg0[var5].method2656(-4549).field4236 == 1 && class217.field3013 < 32) {
                    var6 = new class180(arg0[var5], this);
                    class123.field1752.method1439((long) arg0[var5].field6546, (byte) 46, var6);
                    class217.field3013++;
                }
                if (var6 == null) {
                    var6 = new class180(arg0[var5], this);
                }
                this.field1940.method1958(var6, 0);
                this.field1944++;
                field1936[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(J)V")
    public final void method874(long arg0) {
        this.field1938 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
    public class134(int arg0) {
        class13.field215.method2353(this, -9798);
        this.field1938 = arg0;
        this.field1933 = arg0;
        this.field1942 = true;
    }
}
