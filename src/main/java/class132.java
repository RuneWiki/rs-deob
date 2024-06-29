import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class132 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public int field2059 = -1;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field2069 = -1;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2062 = -1;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2060 = new Rectangle[100];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "J")
    public static long field2057 = 0L;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[I")
    public static int[] field2063 = new int[250];

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[J")
    public static long[] field2072 = new long[100];

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lmo;")
    public static class447 field2058;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[I")
    public static int[] field2064;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
    public static int[] field2066;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[I")
    public int[] field2070;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)C")
    public static final char method965(int arg0, char arg1) {
        field2068++;
        if (arg1 == 'µ' || arg1 == 'ƒ') {
            return arg1;
        } else {
            if (arg0 != 22413) {
                method969((class149) null, false);
            }
            return Character.toTitleCase(arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public static void method966(boolean arg0) {
        field2058 = null;
        field2063 = null;
        field2072 = null;
        field2060 = null;
        field2066 = null;
        if (arg0) {
            field2064 = null;
        }
        field2064 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljg;IBI)V")
    private final void method967(class186 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 50) {
            field2063 = null;
        }
        if (arg3 == 1) {
            this.field2069 = arg0.method1272((byte) -100);
        } else if (arg3 == 2) {
            this.field2070 = new int[arg0.method1322(false)];
            for (int var5 = 0; var5 < this.field2070.length; var5++) {
                this.field2070[var5] = arg0.method1272((byte) -70);
            }
        } else if (arg3 == 3) {
            this.field2059 = arg0.method1322(false);
        }
        field2065++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjg;I)V")
    public final void method968(int arg0, class186 arg1, int arg2) {
        field2067++;
        int var4 = 70 / ((arg0 - 25) / 61);
        while (true) {
            int var5 = arg1.method1322(false);
            if (var5 == 0) {
                return;
            }
            this.method967(arg1, arg2, (byte) 50, var5);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lup;Z)Z")
    public static final boolean method969(class149 arg0, boolean arg1) {
        field2061++;
        class127 var2 = class137.method1003(arg0.method197(true), -30796);
        if (var2.field2011 == -1) {
            return true;
        }
        class138 var3 = class94.method551(6635, var2.field2011);
        if (arg1) {
            field2060 = null;
        }
        return var3.field2158 == -1 ? true : var3.method1012(15493);
    }
}
