import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class102 extends class368 {

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
    private int[] field1250 = new int[this.field5205];

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lbw;")
    public static class28 field1248 = new class28(0, -1);

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field1258 = -1;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field1259 = 1338;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lkha;")
    public static class687 field1255;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "[B")
    private byte[] field1253;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "[Lrq;")
    public static class451[] field1257;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public final void method681(int arg0) {
        this.field1256 = 0;
        ++field1254;
        this.field1246 = 0;
        if (arg0 >= -59) {
            this.field1256 = 80;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
    public void method682(int arg0, byte arg1, int arg2) {
        this.field1253[this.field1246++] = (byte) (class272.method1629(arg1 >> 1, 127) + 127);
        if (arg2 < 15) {
            method684(-106, -72);
        }
        ++field1251;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method683(int arg0) {
        this.field1256 = Math.abs(this.field1256);
        ++field1252;
        if (~this.field1256 <= -4097) {
            this.field1256 = 4095;
        }
        if (arg0 != -20419) {
            this.field1250 = null;
        }
        this.method682(this.field1246++, (byte) (this.field1256 >> 4), 50);
        this.field1256 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lgaa;")
    public static final class460 method684(int arg0, int arg1) {
        if (arg0 != 5025) {
            method686((byte) -99);
        }
        ++field1260;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 65535;
        if (class323.field4125[var2] == null || class323.field4125[var2][var3] == null) {
            boolean var4 = class666.method3606(-85, var2);
            if (!var4) {
                return null;
            }
        }
        return class323.field4125[var2][var3];
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
    public static final void method685(int arg0, int arg1) {
        if (arg1 != 132733924) {
            method684(104, -93);
        }
        class236.field3056 = 1000000000L / (long) arg0;
        ++field1249;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field1255 = null;
        field1257 = null;
        if (arg0 != -90) {
            method684(-92, 72);
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        ++field1247;
        if (arg2 == 0) {
            this.field1256 += this.field1250[arg1] * arg0 >> 12;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIF)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field5205 > var7; ++var7) {
            this.field1250[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
