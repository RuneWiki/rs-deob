import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class57 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field801 = 0;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field805 = -1;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lo;")
    private class227 field800 = new class227();

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Z")
    public boolean field811 = false;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[Lpd;")
    private class205[] field808;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[[I")
    private int[][] field797;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
    public static int[] field799 = new int[99];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lph;")
    public static class229 field803 = class266.method1858("Votre liste noire est pleine (X100 noms maximum(Y)3", 0);

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[I")
    public static int[] field809 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "S")
    public static short field813;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/util/Calendar;")
    public static Calendar field810;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 11)
    public final void method382(int arg0) {
        field798++;
        for (int var2 = arg0; var2 < this.field802; var2++) {
            this.field797[var2] = null;
        }
        this.field797 = (int[][]) null;
        this.field808 = null;
        this.field800.method1573((byte) -48);
        this.field800 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[I", line = 31)
    public final int[] method383(int arg0, int arg1) {
        field804++;
        if (arg0 != 3583) {
            this.field796 = -6;
        }
        if (this.field802 == this.field796) {
            this.field811 = this.field808[arg1] == null;
            this.field808[arg1] = class113.field1916;
            return this.field797[arg1];
        } else if (this.field802 == 1) {
            this.field811 = this.field805 != arg1;
            this.field805 = arg1;
            return this.field797[0];
        } else {
            class205 var3 = this.field808[arg1];
            if (var3 == null) {
                this.field811 = true;
                if (this.field801 >= this.field802) {
                    class205 var4 = (class205) this.field800.method1575(arg0 ^ 0xFFFFF20C);
                    var3 = new class205(arg1, var4.field3389);
                    this.field808[var4.field3385] = null;
                    var4.method598(125);
                } else {
                    var3 = new class205(arg1, this.field801);
                    this.field801++;
                }
                this.field808[arg1] = var3;
            } else {
                this.field811 = false;
            }
            this.field800.method1578(arg0 ^ 0xDFF, var3);
            return this.field797[var3.field3389];
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field799[var1] = var0 / 4;
        }
        field813 = 32767;
        field810 = Calendar.getInstance();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 117)
    public static void method384(boolean arg0) {
        field810 = null;
        field803 = null;
        field809 = null;
        field799 = null;
        if (arg0) {
            method385(-41, (byte) 49, 84);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBI)V", line = 134)
    public static final void method385(int arg0, byte arg1, int arg2) {
        class281 var3 = class135.method957(0, arg0, 5);
        field807++;
        var3.method1932(0);
        if (arg1 < -18) {
            var3.field4660 = arg2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(III)V", line = 214)
    public class57(int arg0, int arg1, int arg2) {
        this.field802 = arg0;
        this.field796 = arg1;
        this.field808 = new class205[this.field796];
        this.field797 = new int[this.field802][arg2];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)[[I", line = 157)
    public final int[][] method386(byte arg0) {
        if (arg0 != -28) {
            return (int[][]) ((int[][]) null);
        }
        field795++;
        if (this.field802 != this.field796) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field802; var2++) {
            this.field808[var2] = class113.field1916;
        }
        return this.field797;
    }
}
