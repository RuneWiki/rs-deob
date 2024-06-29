import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class177 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    private int field2356 = 0;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    private int field2363 = -1;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Ltm;")
    private class412 field2360 = new class412();

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Z")
    public boolean field2369 = false;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    private int field2355;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[Laca;")
    private class758[] field2354;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[[[I")
    private int[][][] field2361;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lmga;")
    public static class739 field2357 = new class739(75, 2);

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "J")
    public static long field2372 = 0L;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "J")
    public static long field2365 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Laj;")
    public static class333 field2367;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lwr;")
    public static class485 field2370;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[Lvr;")
    public static class147[] field2364;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public static final void method1246(int arg0, int arg1, int arg2) {
        class659.field9115++;
        if (arg0 != 1442) {
            field2370 = null;
        }
        field2359++;
        class267 var3 = class545.method3099((byte) 113, class269.field3966, class108.field1486);
        var3.field3938.method2361(-863995992, arg1);
        var3.field3938.method2362((byte) -127, arg2);
        class617.method3392(var3, true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field2370 = null;
        field2367 = null;
        field2364 = null;
        if (arg0 != 75) {
            field2357 = null;
        }
        field2357 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1248(int arg0) {
        class190.method1312(17381);
        field2368++;
        if (arg0 != 0) {
            method1247((byte) -109);
        }
        class230.method1508((byte) -50);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method1249(byte arg0) {
        field2373++;
        if (arg0 > -114) {
            this.field2360 = null;
        }
        if (this.field2366 != this.field2355) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2366; var2++) {
            this.field2354[var2] = class356.field5217;
        }
        return this.field2361;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method1250(int arg0) {
        field2358++;
        int var2 = 0;
        if (arg0 != 2) {
            this.method1249((byte) 63);
        }
        while (this.field2366 > var2) {
            this.field2361[var2][0] = null;
            this.field2361[var2][1] = null;
            this.field2361[var2][2] = null;
            this.field2361[var2] = null;
            var2++;
        }
        this.field2354 = null;
        this.field2361 = null;
        this.field2360.method2549(-124);
        this.field2360 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1251(byte arg0, int arg1) {
        field2371++;
        if (arg0 < 37) {
            return null;
        } else if (this.field2366 == this.field2355) {
            this.field2369 = this.field2354[arg1] == null;
            this.field2354[arg1] = class356.field5217;
            return this.field2361[arg1];
        } else if (this.field2366 == 1) {
            this.field2369 = this.field2363 != arg1;
            this.field2363 = arg1;
            return this.field2361[0];
        } else {
            class758 var3 = this.field2354[arg1];
            if (var3 == null) {
                this.field2369 = true;
                if (this.field2356 >= this.field2366) {
                    class758 var4 = (class758) this.field2360.method2541(-108);
                    var3 = new class758(arg1, var4.field10513);
                    this.field2354[var4.field10516] = null;
                    var4.method792((byte) -89);
                } else {
                    var3 = new class758(arg1, this.field2356);
                    this.field2356++;
                }
                this.field2354[arg1] = var3;
            } else {
                this.field2369 = false;
            }
            this.field2360.method2550(0, var3);
            return this.field2361[var3.field10513];
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(III)V")
    public class177(int arg0, int arg1, int arg2) {
        this.field2366 = arg0;
        this.field2355 = arg1;
        this.field2354 = new class758[this.field2355];
        this.field2361 = new int[this.field2366][3][arg2];
    }
}
