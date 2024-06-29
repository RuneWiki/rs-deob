import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class86 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field1373 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    private int field1375 = -1;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lgk;")
    private class159 field1381 = new class159();

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
    public boolean field1384 = false;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[Lkk;")
    private class239[] field1370;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[[I")
    private int[][] field1371;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    public static boolean field1378 = false;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lhl;")
    public static class40 field1383;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
    public final int[] method561(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field1384 = false;
        }
        field1376++;
        if (this.field1382 == this.field1374) {
            this.field1384 = this.field1370[arg0] == null;
            this.field1370[arg0] = class53.field870;
            return this.field1371[arg0];
        } else if (this.field1374 == 1) {
            this.field1384 = this.field1375 != arg0;
            this.field1375 = arg0;
            return this.field1371[0];
        } else {
            class239 var3 = this.field1370[arg0];
            if (var3 == null) {
                this.field1384 = true;
                if (this.field1374 <= this.field1373) {
                    class239 var4 = (class239) this.field1381.method991(-117);
                    var3 = new class239(arg0, var4.field3592);
                    this.field1370[var4.field3597] = null;
                    var4.method538(arg1 ^ 0xFFFFFFC6);
                } else {
                    var3 = new class239(arg0, this.field1373);
                    this.field1373++;
                }
                this.field1370[arg0] = var3;
            } else {
                this.field1384 = false;
            }
            this.field1381.method982((byte) -96, var3);
            return this.field1371[var3.field3592];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method562(byte arg0) {
        field1383 = null;
        if (arg0 < 106) {
            field1383 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[[I")
    public final int[][] method563(byte arg0) {
        field1377++;
        if (this.field1382 != this.field1374) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -27) {
            this.field1373 = -119;
        }
        for (int var2 = 0; var2 < this.field1374; var2++) {
            this.field1370[var2] = class53.field870;
        }
        return this.field1371;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method564(int arg0) {
        if (arg0 != 22631) {
            this.field1374 = 82;
        }
        for (int var2 = 0; var2 < this.field1374; var2++) {
            this.field1371[var2] = null;
        }
        this.field1370 = null;
        this.field1371 = null;
        this.field1381.method986(-29720);
        this.field1381 = null;
        field1372++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)I")
    public static final int method565(int arg0, int arg1, int arg2, int arg3) {
        field1379++;
        if (arg3 != 8142) {
            return 22;
        } else if (arg1 < arg0) {
            return arg0;
        } else if (arg1 > arg2) {
            return arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method566(long arg0, int arg1) {
        field1385++;
        if (arg1 != -15715) {
            field1383 = null;
        }
        return class98.method632(arg1 ^ 0xFFFFC29D, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
    public class86(int arg0, int arg1, int arg2) {
        this.field1382 = arg1;
        this.field1370 = new class239[this.field1382];
        this.field1374 = arg0;
        this.field1371 = new int[this.field1374][arg2];
    }
}
