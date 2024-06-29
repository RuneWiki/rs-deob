import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public int field55 = 0;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[[I")
    public int[][] field45 = new int[6][258];

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[[I")
    public int[][] field59 = new int[6][258];

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[Z")
    public boolean[] field47 = new boolean[16];

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[B")
    public byte[] field64 = new byte[18002];

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[B")
    public byte[] field57 = new byte[256];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    public int[] field43 = new int[6];

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "[[I")
    public int[][] field63 = new int[6][258];

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "[[B")
    public byte[][] field68 = new byte[6][258];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[I")
    public int[] field49 = new int[256];

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
    public int[] field58 = new int[257];

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    public int[] field74 = new int[16];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[B")
    public byte[] field53 = new byte[18002];

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[Z")
    public boolean[] field69 = new boolean[256];

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public int field62 = 0;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "[B")
    public byte[] field76 = new byte[4096];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field65 = -1;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "B")
    public byte field56;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[B")
    public byte[] field38;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "[B")
    public byte[] field70;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method11(int arg0) {
        class166 var1 = class44.field704;
        synchronized (class44.field704) {
            class219.field3302++;
            class267.field4025 = class230.field3467;
            if (arg0 != 3958) {
                return;
            }
            class91.field1438 = class133.field1948;
            class203.field3065 = class90.field1419;
            class246.field3676 = class92.field1455;
            class205.field3076 = class37.field508;
            class188.field2872 = class128.field1921;
            class79.field1279 = class25.field303;
            class92.field1455 = 0;
        }
        field42++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final void method12(boolean arg0) {
        field60++;
        if (!arg0) {
            class146.field2133.method1782(0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfl;I)V")
    public static final void method13(class248 arg0, int arg1) {
        byte[] var2 = new byte[24];
        if (arg1 != -25) {
            return;
        }
        field48++;
        if (class50.field811 != null) {
            try {
                int var3 = 0;
                class50.field811.method1187(0L, (byte) 103);
                class50.field811.method1182(0, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1601(var2, 24, 16, 0);
    }
}
