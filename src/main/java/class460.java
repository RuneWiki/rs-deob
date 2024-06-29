import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class460 {

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    private int field6432 = 0;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    private int field6435 = -1;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Lam;")
    private class455 field6440 = new class455();

    @OriginalMember(owner = "client!av", name = "s", descriptor = "Z")
    public boolean field6442 = false;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    private int field6426;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "[Llt;")
    private class486[] field6428;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "[[I")
    private int[][] field6430;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Leh;")
    public static class246 field6431 = new class246(30, -2);

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field6441 = 0;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "Leh;")
    public static class246 field6439 = new class246(106, 3);

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field6443 = 1;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "[Lo;")
    public static class24[] field6424;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public final void method2678(int arg0) {
        field6438++;
        if (arg0 >= -26) {
            return;
        }
        for (int var2 = 0; var2 < this.field6436; var2++) {
            this.field6430[var2] = null;
        }
        this.field6430 = null;
        this.field6428 = null;
        this.field6440.method2656(121);
        this.field6440 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static final void method2679(byte arg0) {
        field6429++;
        if (class110.field1501 || arg0 != 43) {
            return;
        }
        class264.field3877 = true;
        class110.field1501 = true;
        if (class4.field81.field1437) {
            class327.field4768 = ((int) class327.field4768 - 17 & 0xFFFFFFF0);
        } else {
            class325.field4750 += (-class325.field4750 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
    public static final void method2680(int arg0, int arg1, int arg2) {
        field6434++;
        if (arg1 <= 89) {
            method2679((byte) -3);
        }
        class45 var3 = class354.method2094(arg0, (byte) -26, 12);
        var3.method260(9188);
        var3.field504 = arg2;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method2681(int arg0, boolean arg1, int arg2) {
        field6425++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else {
            if (arg1) {
                field6441 = -120;
            }
            if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public static void method2682(int arg0) {
        field6424 = null;
        field6439 = null;
        field6431 = null;
        if (arg0 != -1) {
            method2680(-99, -15, -120);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)[I")
    public final int[] method2683(int arg0, int arg1) {
        field6427++;
        if (arg0 != -17) {
            method2680(96, 120, -55);
        }
        if (this.field6436 == this.field6426) {
            this.field6442 = this.field6428[arg1] == null;
            this.field6428[arg1] = class367.field5242;
            return this.field6430[arg1];
        } else if (this.field6436 == 1) {
            this.field6442 = this.field6435 != arg1;
            this.field6435 = arg1;
            return this.field6430[0];
        } else {
            class486 var3 = this.field6428[arg1];
            if (var3 == null) {
                this.field6442 = true;
                if (this.field6436 <= this.field6432) {
                    class486 var4 = (class486) this.field6440.method2662((byte) 124);
                    var3 = new class486(arg1, var4.field6782);
                    this.field6428[var4.field6780] = null;
                    var4.method2891(112);
                } else {
                    var3 = new class486(arg1, this.field6432);
                    this.field6432++;
                }
                this.field6428[arg1] = var3;
            } else {
                this.field6442 = false;
            }
            this.field6440.method2658(var3, false);
            return this.field6430[var3.field6782];
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILir;)I")
    public static final int method2684(int arg0, class22 arg1) {
        field6437++;
        int var2 = arg1.field272;
        if (arg0 >= -73) {
            field6439 = null;
        }
        class98 var3 = arg1.method1406((byte) 124);
        if (arg1.field3302) {
            var2 = arg1.field262;
        } else if (arg1.field3337 == var3.field1326 || arg1.field3337 == var3.field1282 || arg1.field3337 == var3.field1283 || arg1.field3337 == var3.field1296) {
            var2 = arg1.field266;
        } else if (arg1.field3337 == var3.field1299 || arg1.field3337 == var3.field1279 || arg1.field3337 == var3.field1308 || arg1.field3337 == var3.field1297) {
            var2 = arg1.field265;
        }
        return var2;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)[[I")
    public final int[][] method2685(byte arg0) {
        field6433++;
        if (this.field6436 != this.field6426) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 92) {
            method2680(103, 112, -98);
        }
        for (int var2 = 0; var2 < this.field6436; var2++) {
            this.field6428[var2] = class367.field5242;
        }
        return this.field6430;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(III)V")
    public class460(int arg0, int arg1, int arg2) {
        this.field6436 = arg0;
        this.field6426 = arg1;
        this.field6428 = new class486[this.field6426];
        this.field6430 = new int[this.field6436][arg2];
    }
}
