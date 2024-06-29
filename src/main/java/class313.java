import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class313 extends class190 {

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field4281 = 0;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
    public boolean field4284 = false;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    private boolean field4282 = false;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lwd;")
    private class149 field4285 = new class149();

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field4286 = 0;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Laq;")
    public class90 field4287 = new class90();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    private int field4289 = 0;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Z")
    private boolean field4294 = false;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lmr;")
    public class77 field4291 = new class77();

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[Lhd;")
    public class443[] field4283 = new class443[8192];

    @OriginalMember(owner = "client!e", name = "j", descriptor = "J")
    private long field4278;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "J")
    private long field4280;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[Z")
    private static boolean[] field4277 = new boolean[8];

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[Z")
    private static boolean[] field4279 = new boolean[8];

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4288 = arg0;
        this.field4292 = arg1;
        this.field4293 = arg3;
        this.field4290 = arg4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V", line = 12)
    private final void method2016() {
        this.field4282 = false;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Lmr;", line = 16)
    public final class77 method2017() {
        return this.field4291;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Luo;[Lrf;Z)V", line = 23)
    private final void method2018(class345 arg0, class48[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4277[var4] = false;
        }
        label64: for (class106 var5 = (class106) this.field4285.method1005(-1); var5 != null; var5 = (class106) this.field4285.method1012((byte) -87)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1468 || arg1[var8].field679 == var5.field1468) {
                        field4277[var8] = true;
                        var5.method756(-1);
                        var5.field1442 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1445 == 0) {
                    var5.method1235((byte) -123);
                    this.field4286--;
                } else {
                    var5.field1442 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4286 != 8; var6++) {
            if (!field4277[var6]) {
                class106 var7 = new class106(arg0, arg1[var6], this, this.field4278);
                this.field4285.method1009(var7, false);
                this.field4286++;
                field4277[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V", line = 98)
    public final void method2019() {
        this.field4291.field1102.method1886(64);
        for (class106 var1 = (class106) this.field4285.method1005(-1); var1 != null; var1 = (class106) this.field4285.method1012((byte) 82)) {
            var1.method754(this.field4280, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 332)
    public class313(int arg0) {
        class21.field380.method1009(this, false);
        this.field4278 = (long) arg0;
        this.field4280 = (long) arg0;
        this.field4294 = true;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 115)
    public static void method2020() {
        field4277 = null;
        field4279 = null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()V", line = 119)
    public final void method2021() {
        this.field4284 = true;
        for (class9 var1 = (class9) this.field4287.method646(48); var1 != null; var1 = (class9) this.field4287.method641(false)) {
            if (var1.field169.field3804 == 1) {
                var1.method2783((byte) -122);
            }
        }
        this.field4283 = new class443[8192];
        this.field4281 = 0;
        this.field4285 = new class149();
        this.field4286 = 0;
        this.field4287 = new class90();
        this.field4289 = 0;
        this.method1235((byte) -128);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Lwg;Z)V", line = 144)
    private final void method2022(class245[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4279[var3] = false;
        }
        label73: for (class9 var4 = (class9) this.field4287.method646(48); var4 != null; var4 = (class9) this.field4287.method641(false)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field161 || arg0[var7].field3468 == var4.field161) {
                        field4279[var7] = true;
                        var4.method150(false);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2467((byte) 110);
                this.field4289--;
                if (var4.method2780(-74)) {
                    var4.method2783((byte) -122);
                    class187.field2559--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4289 != 8; var5++) {
            if (!field4279[var5]) {
                class9 var6 = null;
                if (class360.method2311(arg0[var5].field3463, 35).field3804 == 1 && class187.field2559 < 32) {
                    var6 = new class9(arg0[var5], this);
                    class278.field3895.method1014((long) arg0[var5].field3463, -112, var6);
                    class187.field2559++;
                }
                if (var6 == null) {
                    var6 = new class9(arg0[var5], this);
                }
                this.field4287.method643(var6, -54);
                this.field4289++;
                field4279[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Luo;J)Z", line = 230)
    public final boolean method2023(class345 arg0, long arg1) {
        if (this.field4280 == this.field4278) {
            this.method2016();
        } else {
            this.method2025();
        }
        if (arg1 - this.field4278 > 750L) {
            this.method2021();
            return false;
        }
        int var4 = (int) (arg1 - this.field4280);
        if (this.field4294) {
            for (class106 var5 = (class106) this.field4285.method1005(-1); var5 != null; var5 = (class106) this.field4285.method1012((byte) 76)) {
                for (int var6 = 0; var6 < var5.field1458.field1503; var6++) {
                    var5.method751(-2025367384, arg1, 1, !this.field4282, arg0);
                }
            }
            this.field4294 = false;
        }
        for (class106 var7 = (class106) this.field4285.method1005(-1); var7 != null; var7 = (class106) this.field4285.method1012((byte) -117)) {
            var7.method751(-2025367384, arg1, var4, !this.field4282, arg0);
        }
        this.field4280 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()V", line = 278)
    public final void method2024() {
        this.field4294 = true;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()V", line = 281)
    public final void method2025() {
        this.field4282 = true;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Luo;J[Lrf;[Lwg;Z)V", line = 284)
    public final void method2026(class345 arg0, long arg1, class48[] arg2, class245[] arg3, boolean arg4) {
        if (!this.field4284) {
            this.method2018(arg0, arg2, arg4);
            this.method2022(arg3, arg4);
            this.field4278 = arg1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(J)V", line = 307)
    public final void method2027(long arg0) {
        this.field4278 = arg0;
    }
}
