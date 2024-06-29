import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 extends class304 {

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "[I")
    private final int[] field1924 = new int[this.field5272];

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Lhe;")
    public static class94 field1928 = new class94(20);

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Lsf;")
    public static class108 field1930 = class140.method973(255, "sch-Utteln:");

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "Lsf;")
    public static class108 field1929 = class140.method973(255, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[B")
    private byte[] field1921;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5272; var7++) {
            this.field1924[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 27)
    public static void method796(byte arg0) {
        if (arg0 > -91) {
            method797((class262) null, (byte) 55, (class262) null, (class262) null, (class262) null);
        }
        field1928 = null;
        field1929 = null;
        field1930 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V", line = 48)
    public final void method607(int arg0, int arg1, byte arg2) {
        this.field1923 += this.field1924[arg1] * arg0 >> 12;
        int var4 = -23 % ((25 - arg2) / 61);
        field1919++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lik;BLik;Lik;Lik;)V", line = 64)
    public static final void method797(class262 arg0, byte arg1, class262 arg2, class262 arg3, class262 arg4) {
        if (arg1 >= -15) {
            return;
        }
        class171.field3102 = arg2;
        class20.field296 = arg4;
        field1918++;
        class130.field2224 = arg3;
        class34.field469 = arg0;
        class320.field5485 = new class98[class171.field3102.method1879(0)][];
        class180.field3278 = new boolean[class171.field3102.method1879(0)];
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)V", line = 81)
    public void method798(int arg0, byte arg1) {
        this.field1921[this.field1927++] = (byte) (class162.method1118(127, arg1 >> 1) + 127);
        field1922++;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 89)
    public final void method603(int arg0) {
        this.field1927 = 0;
        if (arg0 == 6841) {
            field1925++;
            this.field1923 = 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 112)
    public final void method604(int arg0) {
        field1920++;
        if (arg0 != 6) {
            field1930 = (class108) null;
        }
        this.field1923 = Math.abs(this.field1923);
        if (this.field1923 >= 4096) {
            this.field1923 = 4095;
        }
        this.method798(this.field1927++, (byte) (this.field1923 >> 4));
        this.field1923 = 0;
    }
}
