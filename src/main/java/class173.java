import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class173 extends class86 {

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public int field2359 = 0;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lum;")
    public static class347 field2360 = new class347();

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field2376 = 16777215;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lcu;")
    public class139 field2371;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lso;")
    public class313 field2354;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lar;")
    public class462 field2361;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lar;")
    public class462 field2366;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lhn;")
    public class486 field2358;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Z")
    public boolean field2377;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "[I")
    public int[] field2372;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "[Lom;")
    public static class241[] field2373;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBIII)I")
    public static final int method1089(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg2;
            arg2 = var7;
        }
        field2363++;
        int var8 = arg0 & 0x3;
        if (arg3 >= -123) {
            field2373 = null;
        }
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return 7 - (arg4 - (1 - arg2));
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1090(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2367++;
        int var2 = this.field2356;
        if (this.field2358 != null) {
            class486 var3 = this.field2358.method2834(class453.field6591, false);
            if (var3 == null) {
                this.field2355 = 0;
                this.field2365 = 0;
                this.field2375 = 0;
                this.field2356 = -1;
                this.field2370 = 0;
                this.field2372 = null;
            } else {
                this.field2372 = var3.field7073;
                this.field2356 = var3.field7062;
                this.field2370 = var3.field7092;
                this.field2375 = var3.field7061 << 7;
                this.field2355 = var3.field7110;
                this.field2365 = var3.field7033;
            }
        } else if (this.field2371 != null) {
            int var4 = class242.method1501(this.field2371, (byte) -67);
            if (var2 != var4) {
                this.field2356 = var4;
                class272 var5 = this.field2371.field1825;
                if (var5.field3797 != null) {
                    var5 = var5.method1656(class453.field6591, -46);
                }
                if (var5 == null) {
                    this.field2365 = this.field2375 = 0;
                } else {
                    this.field2375 = var5.field3857 << 7;
                    this.field2365 = var5.field3841;
                }
            }
        } else if (this.field2354 != null) {
            this.field2356 = class52.method387(this.field2354, 18);
            this.field2365 = this.field2354.field4597;
            this.field2375 = this.field2354.field4585 << 7;
        }
        if (this.field2356 != var2 && this.field2366 != null) {
            class375.field5607.method643(this.field2366);
            this.field2366 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public static void method1091(int arg0) {
        if (arg0 != 7) {
            field2376 = -107;
        }
        field2373 = null;
        field2360 = null;
    }
}
