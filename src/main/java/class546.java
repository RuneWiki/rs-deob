import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class546 {

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    private int field7606 = 0;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    private int field7610 = -1;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Lbv;")
    private class568 field7617 = new class568();

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Z")
    public boolean field7618 = false;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    private int field7614;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "[Luu;")
    private class514[] field7611;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "[[[I")
    private int[][][] field7615;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7603 = class330.method2080((byte) -105, 1600);

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field7616 = new String[100];

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "Lbe;")
    public static class189 field7613 = new class189();

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "F")
    public static float field7620;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "Lkr;")
    public static class329 field7607;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Lkr;")
    public static class329 field7612;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method3019(byte arg0) {
        field7604++;
        if (this.field7614 != this.field7609) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 > -51) {
            field7612 = null;
        }
        while (var2 < this.field7609) {
            this.field7611[var2] = class603.field8709;
            var2++;
        }
        return this.field7615;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
    public static void method3020(byte arg0) {
        if (arg0 != -10) {
            field7607 = null;
        }
        field7607 = null;
        field7616 = null;
        field7612 = null;
        field7613 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3021(byte arg0, int arg1) {
        if (arg0 != 89) {
            return null;
        }
        field7619++;
        if (this.field7614 == this.field7609) {
            this.field7618 = this.field7611[arg1] == null;
            this.field7611[arg1] = class603.field8709;
            return this.field7615[arg1];
        } else if (this.field7609 == 1) {
            this.field7618 = this.field7610 != arg1;
            this.field7610 = arg1;
            return this.field7615[0];
        } else {
            class514 var3 = this.field7611[arg1];
            if (var3 == null) {
                this.field7618 = true;
                if (this.field7609 > this.field7606) {
                    var3 = new class514(arg1, this.field7606);
                    this.field7606++;
                } else {
                    class514 var4 = (class514) this.field7617.method3185(8);
                    var3 = new class514(arg1, var4.field7148);
                    this.field7611[var4.field7146] = null;
                    var4.method589(-8880);
                }
                this.field7611[arg1] = var3;
            } else {
                this.field7618 = false;
            }
            this.field7617.method3187(var3, (byte) -128);
            return this.field7615[var3.field7148];
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
    public final void method3022(boolean arg0) {
        field7608++;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field7609; var2++) {
            this.field7615[var2][0] = null;
            this.field7615[var2][1] = null;
            this.field7615[var2][2] = null;
            this.field7615[var2] = null;
        }
        this.field7615 = null;
        this.field7611 = null;
        this.field7617.method3178(-8299);
        this.field7617 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIII)Ldc;")
    public static final class23 method3023(int arg0, int arg1, int arg2, int arg3) {
        field7605++;
        class563 var4 = class199.field2605[arg2][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        class23 var5 = null;
        int var6 = -1;
        class15 var7 = var4.field7894;
        if (arg0 > -85) {
            return null;
        }
        while (var7 != null) {
            class450 var8 = var7.field161;
            if (var8 instanceof class23) {
                class23 var9 = (class23) var8;
                int var10 = (var9.method104((byte) -92) - 1) * 256 + 252;
                int var11 = var9.field6362 - var10 >> 9;
                int var12 = var9.field6368 - var10 >> 9;
                int var13 = var9.field6362 + var10 >> 9;
                int var14 = var9.field6368 + var10 >> 9;
                if (var11 <= arg1 && arg3 >= var12 && arg1 <= var13 && arg3 <= var14) {
                    int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
            var7 = var7.field158;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(III)V")
    public class546(int arg0, int arg1, int arg2) {
        this.field7609 = arg0;
        this.field7614 = arg1;
        this.field7611 = new class514[this.field7614];
        this.field7615 = new int[this.field7609][3][arg2];
    }
}
