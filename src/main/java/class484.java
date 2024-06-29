import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class484 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    private int field7041 = -1;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field7045 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lvr;")
    private class306 field7043 = new class306();

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
    public boolean field7051 = false;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field7039;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    private int field7046;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[[I")
    private int[][] field7050;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[Lfa;")
    private class461[] field7047;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lpg;")
    public static class492 field7044 = new class492(26, -2);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field7049;

    static {
        new class375("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)[[I", line = 7)
    public final int[][] method2888(int arg0) {
        field7042++;
        if (this.field7046 != this.field7039) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = 49 % ((arg0 + 37) / 55);
        while (this.field7046 > var2) {
            this.field7047[var2] = class51.field689;
            var2++;
        }
        return this.field7050;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(III)V", line = 209)
    public class484(int arg0, int arg1, int arg2) {
        this.field7039 = arg1;
        this.field7046 = arg0;
        this.field7050 = new int[this.field7046][arg2];
        this.field7047 = new class461[this.field7039];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[FIIIFFIII)V", line = 32)
    public static final void method2889(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg4 - arg0;
        int var12 = arg1 - arg8;
        field7049++;
        int var13 = arg9 - arg10;
        float var14 = arg2[2] * (float) var11 + arg2[1] * (float) var13 + arg2[0] * (float) var12;
        float var15 = arg2[5] * (float) var11 + arg2[3] * (float) var12 + arg2[4] * (float) var13;
        float var16 = arg2[8] * (float) var11 + arg2[7] * (float) var13 + arg2[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg6 + 0.5F;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        int var21 = -80 % ((arg5 - 78) / 38);
        class428.field6370 = var18;
        class222.field3108 = var17;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 85)
    public final void method2890(int arg0) {
        field7048++;
        if (arg0 >= -46) {
            this.field7041 = -71;
        }
        for (int var2 = 0; var2 < this.field7046; var2++) {
            this.field7050[var2] = null;
        }
        this.field7050 = null;
        this.field7047 = null;
        this.field7043.method1959((byte) 113);
        this.field7043 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[I", line = 108)
    public final int[] method2891(int arg0, byte arg1) {
        if (arg1 < 74) {
            return null;
        }
        field7040++;
        if (this.field7046 == this.field7039) {
            this.field7051 = this.field7047[arg0] == null;
            this.field7047[arg0] = class51.field689;
            return this.field7050[arg0];
        } else if (this.field7046 == 1) {
            this.field7051 = this.field7041 != arg0;
            this.field7041 = arg0;
            return this.field7050[0];
        } else {
            class461 var3 = this.field7047[arg0];
            if (var3 == null) {
                this.field7051 = true;
                if (this.field7045 < this.field7046) {
                    var3 = new class461(arg0, this.field7045);
                    this.field7045++;
                } else {
                    class461 var4 = (class461) this.field7043.method1968(-31872);
                    var3 = new class461(arg0, var4.field6760);
                    this.field7047[var4.field6757] = null;
                    var4.method2785((byte) -120);
                }
                this.field7047[arg0] = var3;
            } else {
                this.field7051 = false;
            }
            this.field7043.method1961(var3, 26413);
            return this.field7050[var3.field6760];
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 183)
    public static void method2892(byte arg0) {
        int var1 = 58 % ((arg0 - 6) / 39);
        field7044 = null;
    }
}
