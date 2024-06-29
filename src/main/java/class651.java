import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class651 {

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    private int field8301 = 0;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    private int field8297 = -1;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lfca;")
    private class661 field8299 = new class661();

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Z")
    public boolean field8306 = false;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field8300;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private int field8294;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[[[I")
    private int[][][] field8295;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[Ljka;")
    private class159[] field8302;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    public static int[] field8304 = new int[32];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lrn;")
    public static class633 field8296 = new class633(86, 3);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field8307;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method3509(byte arg0) {
        field8303++;
        class151[] var1 = class719.field9450;
        synchronized (class719.field9450) {
            if (arg0 <= 34) {
                method3512(122);
            }
            for (int var2 = 0; var2 < class719.field9450.length; var2++) {
                class719.field9450[var2] = new class151();
                class318.field3970[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3510(byte arg0, int arg1) {
        if (arg0 != -51) {
            field8307 = null;
        }
        field8298++;
        if (this.field8300 == this.field8294) {
            this.field8306 = this.field8302[arg1] == null;
            this.field8302[arg1] = class610.field7708;
            return this.field8295[arg1];
        } else if (this.field8294 == 1) {
            this.field8306 = this.field8297 != arg1;
            this.field8297 = arg1;
            return this.field8295[0];
        } else {
            class159 var3 = this.field8302[arg1];
            if (var3 == null) {
                this.field8306 = true;
                if (this.field8294 > this.field8301) {
                    var3 = new class159(arg1, this.field8301);
                    this.field8301++;
                } else {
                    class159 var4 = (class159) this.field8299.method3604(-84);
                    var3 = new class159(arg1, var4.field2067);
                    this.field8302[var4.field2066] = null;
                    var4.method1946(-10364);
                }
                this.field8302[arg1] = var3;
            } else {
                this.field8306 = false;
            }
            this.field8299.method3598(var3, true);
            return this.field8295[var3.field2067];
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method3511(byte arg0) {
        field8305++;
        if (this.field8300 != this.field8294) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8294; var2++) {
            this.field8302[var2] = class610.field7708;
        }
        if (arg0 != -7) {
            this.method3513((byte) 13);
        }
        return this.field8295;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method3512(int arg0) {
        field8296 = null;
        field8307 = null;
        if (arg0 != 0) {
            field8304 = null;
        }
        field8304 = null;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    public final void method3513(byte arg0) {
        for (int var2 = 0; var2 < this.field8294; var2++) {
            this.field8295[var2][0] = null;
            this.field8295[var2][1] = null;
            this.field8295[var2][2] = null;
            this.field8295[var2] = null;
        }
        field8293++;
        this.field8302 = null;
        this.field8295 = null;
        this.field8299.method3594(-71);
        this.field8299 = null;
        int var3 = 21 / ((arg0 + 22) / 33);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(III)V")
    public class651(int arg0, int arg1, int arg2) {
        this.field8300 = arg1;
        this.field8294 = arg0;
        this.field8295 = new int[this.field8294][3][arg2];
        this.field8302 = new class159[this.field8300];
    }
}
