import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field578 = 0;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    private int field587 = -1;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lar;")
    private class47 field588 = new class47();

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Z")
    public boolean field591 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "[[I")
    private int[][] field590;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lhe;")
    private class30[] field579;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public static int[] field581 = new int[32];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
    public static boolean field584 = true;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V", line = 225)
    public class42(int arg0, int arg1, int arg2) {
        this.field583 = arg0;
        this.field589 = arg1;
        this.field590 = new int[this.field583][arg2];
        this.field579 = new class30[this.field589];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)Z", line = 13)
    public static final boolean method300(byte arg0, boolean arg1) {
        int var2 = 106 / ((26 - arg0) / 46);
        field586++;
        boolean var3 = class61.field807.method1717();
        if (arg1 == var3) {
            return true;
        }
        if (!arg1) {
            class61.field807.method1707();
        } else if (!class61.field807.method1726()) {
            arg1 = false;
        }
        if (var3 == arg1) {
            return false;
        } else {
            class324.field4753 = arg1;
            class253.method1547(23912, class76.field1085);
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[[I", line = 56)
    public final int[][] method301(int arg0) {
        field585++;
        if (this.field589 != this.field583) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field583; var2++) {
            this.field579[var2] = class148.field2032;
        }
        return this.field590;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 75)
    public final void method302(byte arg0) {
        for (int var2 = 0; var2 < this.field583; var2++) {
            this.field590[var2] = null;
        }
        field580++;
        this.field579 = null;
        this.field590 = null;
        this.field588.method335((byte) 100);
        this.field588 = null;
        if (arg0 != -97) {
            this.method301(-128);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 96)
    public static final void method303(int arg0) {
        if (class159.field2152 == null || class286.field4148 == null) {
            class286.field4148 = new int[256];
            class159.field2152 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class159.field2152[var1] = (int) (Math.sin(var2) * 4096.0D);
                class286.field4148[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field577++;
        if (arg0 != 7344) {
            field581 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 128)
    public static void method304(boolean arg0) {
        if (arg0) {
            field581 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I", line = 153)
    public final int[] method305(int arg0, byte arg1) {
        if (arg1 <= 62) {
            return null;
        }
        field582++;
        if (this.field589 == this.field583) {
            this.field591 = this.field579[arg0] == null;
            this.field579[arg0] = class148.field2032;
            return this.field590[arg0];
        } else if (this.field583 == 1) {
            this.field591 = this.field587 != arg0;
            this.field587 = arg0;
            return this.field590[0];
        } else {
            class30 var3 = this.field579[arg0];
            if (var3 == null) {
                this.field591 = true;
                if (this.field578 < this.field583) {
                    var3 = new class30(arg0, this.field578);
                    this.field578++;
                } else {
                    class30 var4 = (class30) this.field588.method333((byte) 97);
                    var3 = new class30(arg0, var4.field432);
                    this.field579[var4.field435] = null;
                    var4.method322(11);
                }
                this.field579[arg0] = var3;
            } else {
                this.field591 = false;
            }
            this.field588.method336((byte) 123, var3);
            return this.field590[var3.field432];
        }
    }
}
