import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 extends class8 {

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "[[B")
    public static byte[][] field3078 = new byte[250][];

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "[Lea;")
    public static class37[] field3080;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Lnc;")
    public static final class85 method1296(boolean arg0, int arg1) {
        ++field3070;
        class85 var2 = (class85) class102.field1670.method1832((long) arg1, (byte) 105);
        if (var2 != null) {
            return var2;
        } else {
            if (!arg0) {
                field3077 = 86;
            }
            byte[] var3 = class227.field3758.method1357(class148.method1015(false, arg1), class10.method75(arg1, -28620), -1);
            class85 var4 = new class85();
            if (var3 != null) {
                var4.method622(0, new class221(var3));
            }
            class102.field1670.method1831((long) arg1, var4, 128);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 37 / ((arg1 - -48) / 46);
        ++field3082;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class231.field3798 < ~var8; ++var8) {
                var5[var8] = this.field3073;
                var6[var8] = this.field3072;
                var7[var8] = this.field3071;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
    private class190(int arg0) {
        super(0, false);
        this.method1300(false, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
    public static final void method1297(int arg0, int arg1) {
        ++field3079;
        int var2 = -62 / ((arg1 - -85) / 38);
        class259 var3 = class213.method1464((byte) -127, arg0, 8);
        var3.method1772((byte) 117);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1298(int arg0) {
        if (arg0 == 1) {
            field3080 = null;
            field3078 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg2 == 0) {
            this.method1300(false, arg1.method1531(65280));
        }
        if (arg0 <= 62) {
            method1301(-109);
        }
        ++field3076;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class190() {
        this(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1299(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != 0) {
            field3077 = 10;
        }
        ++field3074;
        if (class228.method1606(-1, arg3)) {
            class259.method1765(arg0, arg4, arg1, -1, 65, class136.field2250[arg3]);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZI)V")
    private final void method1300(boolean arg0, int arg1) {
        this.field3071 = arg1 << 4 & 4080;
        if (arg0) {
            field3078 = null;
        }
        ++field3081;
        this.field3072 = 4080 & arg1 >> 4;
        this.field3073 = arg1 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Z")
    public static final boolean method1301(int arg0) {
        if (arg0 != 4080) {
            method1297(-74, 69);
        }
        ++field3075;
        try {
            return class266.method1794(-1);
        } catch (IOException var4) {
            class14.method112(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class121.field1973 + "," + class77.field1236 + "," + class76.field1229 + " - " + class115.field1912 + "," + (class50.field884 - -class167.field2655.field3340[0]) + "," + (class167.field2655.field3321[0] + class214.field3501) + " - ";
            for (int var3 = 0; var3 < class115.field1912 && ~var3 > -51; ++var3) {
                var2 = var2 + class67.field1103.field3653[var3] + ",";
            }
            class178.method1211(var2, -113, var5);
            class72.method514(arg0 + -3976);
            return true;
        }
    }
}
