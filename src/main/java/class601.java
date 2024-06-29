import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class601 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    private int field8466 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    private int field8470 = -1;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lga;")
    private class420 field8478 = new class420();

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
    public boolean field8481 = false;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    private int field8467;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    private int field8471;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[[[I")
    private int[][][] field8472;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[Lcc;")
    private class760[] field8477;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field8476 = new int[16384];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
    public static int[] field8473 = new int[16384];

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field8479 = null;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field8480;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8476[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field8473[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3473(int arg0) {
        field8468++;
        if (arg0 >= 18) {
            class387 var1 = class583.field8255;
            synchronized (class583.field8255) {
                class583.field8255.method2364(1);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I", line = 17)
    public final int[][] method3474(int arg0, int arg1) {
        if (arg0 != 2132) {
            this.field8470 = -112;
        }
        field8475++;
        if (this.field8471 == this.field8467) {
            this.field8481 = this.field8477[arg1] == null;
            this.field8477[arg1] = class380.field5453;
            return this.field8472[arg1];
        } else if (this.field8467 == 1) {
            this.field8481 = this.field8470 != arg1;
            this.field8470 = arg1;
            return this.field8472[0];
        } else {
            class760 var3 = this.field8477[arg1];
            if (var3 == null) {
                this.field8481 = true;
                if (this.field8466 >= this.field8467) {
                    class760 var4 = (class760) this.field8478.method2509(false);
                    var3 = new class760(arg1, var4.field10480);
                    this.field8477[var4.field10481] = null;
                    var4.method3117((byte) 1);
                } else {
                    var3 = new class760(arg1, this.field8466);
                    this.field8466++;
                }
                this.field8477[arg1] = var3;
            } else {
                this.field8481 = false;
            }
            this.field8478.method2506(var3, (byte) -98);
            return this.field8472[var3.field10480];
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 90)
    public static void method3475(byte arg0) {
        if (arg0 > -2) {
            method3478(-103, -51, -120, -74, -85);
        }
        field8479 = null;
        field8473 = null;
        field8476 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)[[[I", line = 107)
    public final int[][][] method3476(byte arg0) {
        if (arg0 != -84) {
            method3478(-120, -45, 100, -102, -3);
        }
        field8469++;
        if (this.field8471 != this.field8467) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8467; var2++) {
            this.field8477[var2] = class380.field5453;
        }
        return this.field8472;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V", line = 219)
    public class601(int arg0, int arg1, int arg2) {
        this.field8467 = arg0;
        this.field8471 = arg1;
        this.field8472 = new int[this.field8467][3][arg2];
        this.field8477 = new class760[this.field8471];
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 165)
    public final void method3477(int arg0) {
        for (int var2 = 0; var2 < this.field8467; var2++) {
            this.field8472[var2][0] = null;
            this.field8472[var2][1] = null;
            this.field8472[var2][2] = null;
            this.field8472[var2] = null;
        }
        field8474++;
        if (arg0 < -17) {
            this.field8477 = null;
            this.field8472 = null;
            this.field8478.method2503(10);
            this.field8478 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V", line = 191)
    public static final void method3478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg0 <= 71) {
            return;
        }
        while (var5 < class351.field5115) {
            Rectangle var6 = class667.field9385[var5];
            if (var6.x + var6.width > arg2 && var6.x < arg2 + arg4 && arg3 < (var6.y + var6.height) && arg1 + arg3 > var6.y) {
                class89.field1151[var5] = true;
            }
            var5++;
        }
        field8480++;
        class651.method3726(arg3, 44, arg3 + arg1, arg2, arg2 + arg4);
    }
}
