import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class166 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    private int field2783 = -1;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    private int field2787 = 0;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "Lor;")
    private class594 field2796 = new class594();

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Z")
    public boolean field2799 = false;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    private int field2785;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "[[[I")
    private int[][][] field2795;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "[Ldf;")
    private class368[] field2792;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field2784 = 0;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field2794;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
    public static final void method1339(int arg0, boolean arg1) {
        field2798++;
        for (class119 var2 = (class119) class675.field9520.method3465((byte) -51); var2 != null; var2 = (class119) class675.field9520.method3469(0)) {
            if (var2.field1911 != null) {
                class505.field7381.method1985(var2.field1911);
                var2.field1911 = null;
            }
            if (var2.field1917 != null) {
                class505.field7381.method1985(var2.field1917);
                var2.field1917 = null;
            }
            var2.method707((byte) -46);
        }
        if (arg1) {
            for (class119 var3 = (class119) class235.field3738.method3465((byte) 118); var3 != null; var3 = (class119) class235.field3738.method3469(arg0 - 14940)) {
                if (var3.field1911 != null) {
                    class505.field7381.method1985(var3.field1911);
                    var3.field1911 = null;
                }
                var3.method707((byte) -17);
            }
            for (class119 var4 = (class119) class415.field6359.method1556(88); var4 != null; var4 = (class119) class415.field6359.method1559(119)) {
                if (var4.field1911 != null) {
                    class505.field7381.method1985(var4.field1911);
                    var4.field1911 = null;
                }
                var4.method707((byte) -79);
            }
        }
        if (arg0 != 14940) {
            field2786 = 55;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public final void method1340(byte arg0) {
        field2790++;
        for (int var2 = 0; var2 < this.field2793; var2++) {
            this.field2795[var2][0] = null;
            this.field2795[var2][1] = null;
            this.field2795[var2][2] = null;
            this.field2795[var2] = null;
        }
        this.field2792 = null;
        if (arg0 == 58) {
            this.field2795 = null;
            this.field2796.method3474(22090);
            this.field2796 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        if (arg0 != -72) {
            field2794 = null;
        }
        field2794 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lda;IIII)Lll;")
    public static final class334 method1342(class55 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2791++;
        if (arg0 == null) {
            return null;
        } else {
            if (arg4 != 30640) {
                method1339(-1, false);
            }
            return new class334(arg2, arg3, arg1, arg0.method646(), arg0.method645(), arg0.method622(), arg0.method623(), arg0.method604(), arg0.method611(), arg0.method642());
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)[[[I")
    public final int[][][] method1343(byte arg0) {
        field2797++;
        if (this.field2793 != this.field2785) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2793; var2++) {
            this.field2792[var2] = class236.field3754;
        }
        if (arg0 <= 94) {
            method1344(91, 92, (byte) -81, null);
        }
        return this.field2795;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBLri;)Lba;")
    public static final class354 method1344(int arg0, int arg1, byte arg2, class97 arg3) {
        field2789++;
        class6 var4 = new class6(arg3.method926(arg0, -128, arg1));
        class354 var5 = new class354(arg1, var4.method42((byte) -35), var4.method42((byte) -75), var4.method72(-81), var4.method72(-25), var4.method70(-9059) == 1, var4.method70(-9059), var4.method70(-9059));
        if (arg2 < 89) {
            method1344(-28, 125, (byte) -123, null);
        }
        int var6 = var4.method70(-9059);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field5650.method3463((byte) -87, new class584(var4.method70(-9059), var4.method67(12021), var4.method67(12021), var4.method67(12021), var4.method67(12021), var4.method67(12021), var4.method67(12021), var4.method67(12021), var4.method67(12021)));
        }
        var5.method2378((byte) 126);
        return var5;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[[I")
    public final int[][] method1345(int arg0, int arg1) {
        field2788++;
        if (arg1 != 0) {
            this.field2785 = -76;
        }
        if (this.field2793 == this.field2785) {
            this.field2799 = this.field2792[arg0] == null;
            this.field2792[arg0] = class236.field3754;
            return this.field2795[arg0];
        } else if (this.field2793 == 1) {
            this.field2799 = this.field2783 != arg0;
            this.field2783 = arg0;
            return this.field2795[0];
        } else {
            class368 var3 = this.field2792[arg0];
            if (var3 == null) {
                this.field2799 = true;
                if (this.field2787 >= this.field2793) {
                    class368 var4 = (class368) this.field2796.method3470(0);
                    var3 = new class368(arg0, var4.field5761);
                    this.field2792[var4.field5764] = null;
                    var4.method707((byte) -47);
                } else {
                    var3 = new class368(arg0, this.field2787);
                    this.field2787++;
                }
                this.field2792[arg0] = var3;
            } else {
                this.field2799 = false;
            }
            this.field2796.method3466(var3, (byte) -23);
            return this.field2795[var3.field5761];
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(III)V")
    public class166(int arg0, int arg1, int arg2) {
        this.field2793 = arg0;
        this.field2785 = arg1;
        this.field2795 = new int[this.field2793][3][arg2];
        this.field2792 = new class368[this.field2785];
    }
}
