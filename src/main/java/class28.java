import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lcc;")
    public static class209 field505 = class95.method669(106, "Particles: ");

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[I")
    public static int[] field495 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lcc;")
    public static class209 field508 = class95.method669(109, ")1");

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lcc;")
    public static class209 field510 = class95.method669(118, "k");

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lcc;")
    public static class209 field511 = class95.method669(112, "p12_full");

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field496 = 128;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field493 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Lcc;")
    private static class209 field517 = class95.method669(119, "wave:");

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Lcc;")
    public static class209 field518 = field517;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lcc;")
    public static class209 field515 = field517;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lla;")
    public static class95 field516 = new class95(4);

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field520 = 2;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lcc;")
    public static class209 field521 = class95.method669(94, "violet:");

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lvi;")
    public class190 field503;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
    public int[] field497;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field499;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    public int[] field500;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
    public int[] field509;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
    public int[] field512;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    public int[] field513;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
    public int[] field514;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[Lvi;")
    public class190[] field492;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[[I")
    public int[][] field494;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[[I")
    public int[][] field507;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method221(int arg0) {
        field518 = null;
        field510 = null;
        field493 = null;
        field505 = null;
        int var1 = -11 % ((60 - arg0) / 50);
        field515 = null;
        field495 = null;
        field499 = null;
        field508 = null;
        field511 = null;
        field517 = null;
        field521 = null;
        field516 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BB)V")
    private final void method222(byte[] arg0, byte arg1) {
        field501++;
        class106 var3 = new class106(class183.method1251(arg0, (byte) 78));
        int var4 = var3.method774((byte) 115);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 >= 6) {
            this.field506 = var3.method746((byte) -100);
        } else {
            this.field506 = 0;
        }
        int var6 = var3.method774((byte) 102);
        int var7 = -1;
        this.field498 = var3.method736(126);
        this.field513 = new int[this.field498];
        for (int var8 = 0; var8 < this.field498; var8++) {
            this.field513[var8] = var5 += var3.method736(125);
            if (var7 < this.field513[var8]) {
                var7 = this.field513[var8];
            }
        }
        this.field502 = var7 + 1;
        this.field509 = new int[this.field502];
        this.field497 = new int[this.field502];
        this.field507 = new int[this.field502][];
        this.field514 = new int[this.field502];
        this.field512 = new int[this.field502];
        if (var6 != 0) {
            this.field500 = new int[this.field502];
            for (int var9 = 0; var9 < this.field502; var9++) {
                this.field500[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field498; var10++) {
                this.field500[this.field513[var10]] = var3.method746((byte) -100);
            }
            this.field503 = new class190(this.field500);
        }
        for (int var11 = 0; var11 < this.field498; var11++) {
            this.field509[this.field513[var11]] = var3.method746((byte) -100);
        }
        for (int var12 = 0; var12 < this.field498; var12++) {
            this.field497[this.field513[var12]] = var3.method746((byte) -100);
        }
        for (int var13 = 0; var13 < this.field498; var13++) {
            this.field514[this.field513[var13]] = var3.method736(123);
        }
        int var14 = -7 % ((-arg1 - 53) / 32);
        for (int var15 = 0; var15 < this.field498; var15++) {
            int var22 = 0;
            int var23 = this.field513[var15];
            int var24 = this.field514[var23];
            this.field507[var23] = new int[var24];
            int var25 = -1;
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field507[var23][var26] = var22 += var3.method736(126);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field512[var23] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field507[var23] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field494 = new int[var7 + 1][];
        this.field492 = new class190[var7 + 1];
        for (int var16 = 0; var16 < this.field498; var16++) {
            int var17 = this.field513[var16];
            int var18 = this.field514[var17];
            this.field494[var17] = new int[this.field512[var17]];
            for (int var19 = 0; var19 < this.field512[var17]; var19++) {
                this.field494[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field507[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field507[var17][var20];
                }
                this.field494[var17][var21] = var3.method746((byte) -100);
            }
            this.field492[var17] = new class190(this.field494[var17]);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([BI)V")
    public class28(byte[] arg0, int arg1) {
        this.field504 = class277.method1878(arg0, arg0.length, true);
        if (this.field504 != arg1) {
            throw new RuntimeException();
        }
        this.method222(arg0, (byte) -91);
    }
}
