import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class369 {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    private int field5306 = -1;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    private int field5310 = 0;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lrh;")
    private class59 field5305 = new class59();

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Z")
    public boolean field5314 = false;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[[[I")
    private int[][][] field5308;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[Ltba;")
    private class470[] field5303;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5301 = 0;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lgaa;")
    public static class511 field5312 = new class511();

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Luea;")
    public static class484 field5313 = new class484("runescape", 0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[[[J")
    public static long[][][] field5304;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2265(boolean arg0) {
        if (!arg0) {
            method2265(true);
        }
        field5313 = null;
        field5312 = null;
        field5304 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)[[[I", line = 16)
    public final int[][][] method2266(byte arg0) {
        field5307++;
        if (this.field5302 != this.field5300) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5300; var2++) {
            this.field5303[var2] = class296.field3967;
        }
        if (arg0 != 33) {
            method2267(67);
        }
        return this.field5308;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 37)
    public static final void method2267(int arg0) {
        class560 var1 = class445.field6125;
        synchronized (class445.field6125) {
            class445.field6125.method3142(false);
            if (arg0 != -11885) {
                method2265(false);
            }
        }
        field5309++;
        class560 var2 = class31.field301;
        synchronized (class31.field301) {
            class31.field301.method3142(false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[[I", line = 61)
    public final int[][] method2268(boolean arg0, int arg1) {
        field5311++;
        if (!arg0) {
            return null;
        } else if (this.field5302 == this.field5300) {
            this.field5314 = this.field5303[arg1] == null;
            this.field5303[arg1] = class296.field3967;
            return this.field5308[arg1];
        } else if (this.field5300 == 1) {
            this.field5314 = this.field5306 != arg1;
            this.field5306 = arg1;
            return this.field5308[0];
        } else {
            class470 var3 = this.field5303[arg1];
            if (var3 == null) {
                this.field5314 = true;
                if (this.field5310 < this.field5300) {
                    var3 = new class470(arg1, this.field5310);
                    this.field5310++;
                } else {
                    class470 var4 = (class470) this.field5305.method377((byte) 99);
                    var3 = new class470(arg1, var4.field6368);
                    this.field5303[var4.field6371] = null;
                    var4.method175(30604);
                }
                this.field5303[arg1] = var3;
            } else {
                this.field5314 = false;
            }
            this.field5305.method376(true, var3);
            return this.field5308[var3.field6368];
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V", line = 185)
    public class369(int arg0, int arg1, int arg2) {
        this.field5300 = arg0;
        this.field5302 = arg1;
        this.field5308 = new int[this.field5300][3][arg2];
        this.field5303 = new class470[this.field5302];
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 151)
    public final void method2269(int arg0) {
        field5299++;
        if (arg0 != -9195) {
            method2265(false);
        }
        for (int var2 = 0; var2 < this.field5300; var2++) {
            this.field5308[var2][0] = null;
            this.field5308[var2][1] = null;
            this.field5308[var2][2] = null;
            this.field5308[var2] = null;
        }
        this.field5303 = null;
        this.field5308 = null;
        this.field5305.method365(-1);
        this.field5305 = null;
    }
}
