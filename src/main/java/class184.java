import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class184 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private int field3230 = -1;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    private int field3242 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lpk;")
    private class98 field3239 = new class98();

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Z")
    public boolean field3243 = false;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[Ldh;")
    private class118[] field3236;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[[I")
    private int[][] field3237;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
    public static int[] field3234 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
    public static boolean field3231 = false;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3233 = 2;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Leb;")
    public static class230 field3225 = class68.method589(0, "Loading world list data");

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Leb;")
    public static class230 field3240 = class68.method589(0, "http:)4)4");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lfh;")
    public static class129 field3228;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[[I")
    public final int[][] method1319(int arg0) {
        field3227++;
        if (this.field3238 != this.field3226) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3238; var2++) {
            this.field3236[var2] = class156.field2786;
        }
        return this.field3237;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3229++;
        int var8 = class106.method882(class15.field345, 1, class259.field4587, arg6);
        int var9 = class106.method882(class15.field345, 1, class259.field4587, arg0);
        int var10 = class106.method882(class78.field1404, 1, class42.field769, arg5);
        int var11 = class106.method882(class78.field1404, 1, class42.field769, arg4);
        if (arg7 != -11) {
            field3228 = null;
        }
        int var12 = class106.method882(class15.field345, 1, class259.field4587, arg6 + arg1);
        int var13 = class106.method882(class15.field345, arg7 + 12, class259.field4587, arg0 - arg1);
        for (int var14 = var8; var14 < var12; var14++) {
            class182.method1311(arg3, var11, true, class66.field1254[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class182.method1311(arg3, var11, true, class66.field1254[var15], var10);
        }
        int var16 = class106.method882(class78.field1404, arg7 ^ 0xFFFFFFF4, class42.field769, arg1 + arg5);
        int var17 = class106.method882(class78.field1404, arg7 ^ 0xFFFFFFF4, class42.field769, arg4 - arg1);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class66.field1254[var18];
            class182.method1311(arg3, var16, true, var19, var10);
            class182.method1311(arg2, var17, true, var19, var16);
            class182.method1311(arg3, var11, true, var19, var17);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1321(int arg0) {
        if (arg0 != -11276) {
            field3240 = null;
        }
        field3234 = null;
        field3240 = null;
        field3225 = null;
        field3228 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BILeb;II)V")
    public static final void method1322(byte arg0, int arg1, class230 arg2, int arg3, int arg4) {
        field3241++;
        class245 var5 = class7.method67(arg1, arg3, (byte) -69);
        if (var5 == null) {
            return;
        }
        if (var5.field4316 != null) {
            class75 var6 = new class75();
            var6.field1369 = arg2;
            var6.field1354 = var5;
            var6.field1358 = arg4;
            var6.field1364 = var5.field4316;
            class58.method495(var6, 150);
        }
        boolean var7 = true;
        if (var5.field4226 > 0) {
            var7 = class120.method947(false, var5);
        }
        int var8 = -125 % ((66 - arg0) / 59);
        if (!var7 || !class204.method1433(arg4 - 1, -3537, client.method1167(var5))) {
            return;
        }
        if (arg4 == 1) {
            class238.field4106++;
            class153.field2747.method978(-125, 203);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 2) {
            class80.field1455++;
            class153.field2747.method978(18, 150);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 3) {
            class153.field2747.method978(70, 23);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
            class273.field4811++;
        }
        if (arg4 == 4) {
            class210.field3670++;
            class153.field2747.method978(84, 71);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 5) {
            class153.field2747.method978(-128, 155);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
            class128.field2304++;
        }
        if (arg4 == 6) {
            class28.field514++;
            class153.field2747.method978(112, 160);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 7) {
            class153.field2747.method978(-125, 106);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
            class262.field4665++;
        }
        if (arg4 == 8) {
            class23.field445++;
            class153.field2747.method978(-125, 156);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 9) {
            class251.field4503++;
            class153.field2747.method978(-125, 162);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
        if (arg4 == 10) {
            class171.field3026++;
            class153.field2747.method978(12, 204);
            class153.field2747.method165(arg3, 1380186760);
            class153.field2747.method181(-20053, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I")
    public final int[] method1323(byte arg0, int arg1) {
        field3235++;
        int var3 = -37 / ((arg0 + 21) / 62);
        if (this.field3238 == this.field3226) {
            this.field3243 = this.field3236[arg1] == null;
            this.field3236[arg1] = class156.field2786;
            return this.field3237[arg1];
        } else if (this.field3238 == 1) {
            this.field3243 = this.field3230 != arg1;
            this.field3230 = arg1;
            return this.field3237[0];
        } else {
            class118 var4 = this.field3236[arg1];
            if (var4 == null) {
                this.field3243 = true;
                if (this.field3238 > this.field3242) {
                    var4 = new class118(arg1, this.field3242);
                    this.field3242++;
                } else {
                    class118 var5 = (class118) this.field3239.method832(false);
                    var4 = new class118(arg1, var5.field2111);
                    this.field3236[var5.field2107] = null;
                    var5.method518(116);
                }
                this.field3236[arg1] = var4;
            } else {
                this.field3243 = false;
            }
            this.field3239.method833(-1, var4);
            return this.field3237[var4.field2111];
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public final void method1324(int arg0) {
        if (arg0 < 100) {
            return;
        }
        for (int var2 = 0; var2 < this.field3238; var2++) {
            this.field3237[var2] = null;
        }
        this.field3237 = null;
        this.field3236 = null;
        field3232++;
        this.field3239.method837(-26215);
        this.field3239 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
    public class184(int arg0, int arg1, int arg2) {
        this.field3238 = arg0;
        this.field3226 = arg1;
        this.field3236 = new class118[this.field3226];
        this.field3237 = new int[this.field3238][arg2];
    }
}
