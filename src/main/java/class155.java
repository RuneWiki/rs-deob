import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class155 extends class165 {

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public int field2381 = 0;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "B")
    public static byte field2383;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Lqi;")
    public class234 field2386;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lfe;")
    public class272 field2375;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Lfe;")
    public class272 field2399;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lqm;")
    public class334 field2379;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lle;")
    public class97 field2384;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Z")
    public boolean field2391;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
    public int[] field2392;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 7)
    public final void method1108(int arg0) {
        field2380++;
        int var2 = this.field2398;
        if (this.field2384 != null) {
            class97 var3 = this.field2384.method656((byte) 7);
            if (var3 == null) {
                this.field2388 = 0;
                this.field2382 = 0;
                this.field2392 = null;
                this.field2397 = 0;
                this.field2396 = 0;
                this.field2398 = -1;
            } else {
                this.field2388 = var3.field1323;
                this.field2396 = var3.field1361;
                this.field2397 = var3.field1365 * 128;
                this.field2382 = var3.field1371;
                this.field2398 = var3.field1368;
                this.field2392 = var3.field1341;
            }
        } else if (this.field2386 != null) {
            int var4 = class214.method1536(arg0 - 2267, this.field2386);
            if (var2 != var4) {
                this.field2398 = var4;
                class256 var5 = this.field2386.field3752;
                if (var5.field4080 != null) {
                    var5 = var5.method1843(-1);
                }
                if (var5 == null) {
                    this.field2396 = this.field2397 = 0;
                } else {
                    this.field2397 = var5.field4113 * 128;
                    this.field2396 = var5.field4115;
                }
            }
        } else if (this.field2379 != null) {
            this.field2398 = class153.method1106(arg0 - 2269, this.field2379);
            this.field2396 = this.field2379.field5220;
            this.field2397 = this.field2379.field5226 * 128;
        }
        if (arg0 == 2267 && this.field2398 != var2 && this.field2375 != null) {
            class191.field3127.method118(this.field2375);
            this.field2375 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V", line = 90)
    public static final void method1109(String arg0, int arg1, String arg2, byte arg3) {
        if (arg3 != -47) {
            method1112(-80);
        }
        field2401++;
        class236.method1710(arg0, arg1, arg2, (String) null, -93, -1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V", line = 102)
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2377++;
        if (arg3 < arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class281.field4523[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class281.field4523[var6][arg1] = arg4;
            }
        }
        if (arg0 != 5) {
            field2383 = -85;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)Z", line = 142)
    public static final boolean method1111(byte arg0, int arg1, int arg2) {
        field2393++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class97 var3 = class69.method454(false, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return arg0 == -69 ? var3.method658(arg2, false) : true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 167)
    public static final void method1112(int arg0) {
        class236.field3784 = arg0;
        for (int var1 = 0; var1 < class45.field633; var1++) {
            for (int var2 = 0; var2 < class158.field2618; var2++) {
                if (class324.field5032[arg0][var1][var2] == null) {
                    class324.field5032[arg0][var1][var2] = new class204(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjj;)Lo;", line = 202)
    public static final class285 method1113(byte arg0, class44 arg1) {
        int var2 = 84 / ((24 - arg0) / 50);
        arg1.method286((byte) -92);
        field2385++;
        int var3 = arg1.method286((byte) -77);
        class285 var4 = class80.method547(89, var3);
        var4.field4579 = arg1.method286((byte) -123);
        int var5 = arg1.method286((byte) -111);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.method286((byte) -77);
            var4.method63(true, arg1, var7);
        }
        var4.method361(108);
        return var4;
    }
}
