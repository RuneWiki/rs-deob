import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class174 extends class183 {

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public int field2176 = 0;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
    private boolean field2178 = false;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "Z")
    public boolean field2184 = false;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lum;")
    private class184 field2179 = new class184();

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    private int field2185 = 0;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Lmk;")
    public class154 field2186 = new class154();

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "Z")
    private boolean field2191 = false;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
    private int field2192 = 0;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "Lhc;")
    public class366 field2189 = new class366();

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "[Lvd;")
    public class4[] field2180 = new class4[8192];

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "J")
    private long field2182;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "J")
    private long field2183;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "[Z")
    private static boolean[] field2177 = new boolean[8];

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "[Z")
    private static boolean[] field2181 = new boolean[8];

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(J)V")
    public final void method910(long arg0) {
        this.field2182 = arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()V")
    public static void method911() {
        field2181 = null;
        field2177 = null;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "()V")
    public final void method912() {
        this.field2191 = true;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([Loa;Z)V")
    private final void method913(class149[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2177[var3] = false;
        }
        label73: for (class414 var4 = (class414) this.field2186.method814((byte) 90); var4 != null; var4 = (class414) this.field2186.method827(-126)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5963 || arg0[var7].field1886 == var4.field5963) {
                        field2177[var7] = true;
                        var4.method2568(true);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1967(-1);
                this.field2192--;
                if (var4.method1010(6)) {
                    var4.method1009((byte) -22);
                    class203.field2716--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2192 != 8; var5++) {
            if (!field2177[var5]) {
                class414 var6 = null;
                if (class314.method1823(arg0[var5].field1884, 119).field3715 == 1 && class203.field2716 < 32) {
                    var6 = new class414(arg0[var5], this);
                    class47.field478.method2365(10, var6, (long) arg0[var5].field1884);
                    class203.field2716++;
                }
                if (var6 == null) {
                    var6 = new class414(arg0[var5], this);
                }
                this.field2186.method825(-62, var6);
                this.field2192++;
                field2177[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lvm;J[Lmd;[Loa;Z)V")
    public final void method914(class322 arg0, long arg1, class357[] arg2, class149[] arg3, boolean arg4) {
        if (!this.field2184) {
            this.method919(arg0, arg2, arg4);
            this.method913(arg3, arg4);
            this.field2182 = arg1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "()V")
    public final void method915() {
        this.field2184 = true;
        for (class414 var1 = (class414) this.field2186.method814((byte) 90); var1 != null; var1 = (class414) this.field2186.method827(57)) {
            if (var1.field5969.field3715 == 1) {
                var1.method1009((byte) 117);
            }
        }
        this.field2180 = new class4[8192];
        this.field2176 = 0;
        this.field2179 = new class184();
        this.field2185 = 0;
        this.field2186 = new class154();
        this.field2192 = 0;
        this.method982((byte) 86);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lvm;J)Z")
    public final boolean method916(class322 arg0, long arg1) {
        if (this.field2183 == this.field2182) {
            this.method922();
        } else {
            this.method920();
        }
        if (arg1 - this.field2182 > 750L) {
            this.method915();
            return false;
        }
        int var4 = (int) (arg1 - this.field2183);
        if (this.field2191) {
            for (class260 var5 = (class260) this.field2179.method986((byte) 101); var5 != null; var5 = (class260) this.field2179.method984((byte) 101)) {
                for (int var6 = 0; var6 < var5.field3565.field4951; var6++) {
                    var5.method1456((byte) -89, arg1, 1, !this.field2178, arg0);
                }
            }
            this.field2191 = false;
        }
        for (class260 var7 = (class260) this.field2179.method986((byte) 121); var7 != null; var7 = (class260) this.field2179.method984((byte) 82)) {
            var7.method1456((byte) 86, arg1, var4, !this.field2178, arg0);
        }
        this.field2183 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "()Lhc;")
    public final class366 method917() {
        return this.field2189;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)V")
    public final void method918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2187 = arg0;
        this.field2193 = arg1;
        this.field2190 = arg3;
        this.field2188 = arg4;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lvm;[Lmd;Z)V")
    private final void method919(class322 arg0, class357[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2181[var4] = false;
        }
        label64: for (class260 var5 = (class260) this.field2179.method986((byte) 121); var5 != null; var5 = (class260) this.field2179.method984((byte) 93)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3529 || arg1[var8].field5050 == var5.field3529) {
                        field2181[var8] = true;
                        var5.method1457((byte) -22);
                        var5.field3536 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3530 == 0) {
                    var5.method982((byte) 108);
                    this.field2185--;
                } else {
                    var5.field3536 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2185 != 8; var6++) {
            if (!field2181[var6]) {
                class260 var7 = new class260(arg0, arg1[var6], this, this.field2182);
                this.field2179.method992(var7, 124);
                this.field2185++;
                field2181[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "()V")
    public final void method920() {
        this.field2178 = true;
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "()V")
    public final void method921() {
        this.field2189.field5126.method879(false);
        for (class260 var1 = (class260) this.field2179.method986((byte) -28); var1 != null; var1 = (class260) this.field2179.method984((byte) 76)) {
            var1.method1453(-128, this.field2183);
        }
    }

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "()V")
    private final void method922() {
        this.field2178 = false;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
    public class174(int arg0) {
        class299.field4074.method992(this, -95);
        this.field2182 = (long) arg0;
        this.field2183 = (long) arg0;
        this.field2191 = true;
    }
}
