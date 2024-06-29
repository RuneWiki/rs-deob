import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class229 extends class354 {

    @OriginalMember(owner = "client!sja", name = "T", descriptor = "[I")
    public static int[] field3092 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!sja", name = "H", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!sja", name = "R", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!sja", name = "S", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!sja", name = "Q", descriptor = "Lit;")
    public static class37 field3089;

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field3089 = null;
        field3092 = null;
        if (arg0 != 11) {
            field3092 = null;
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(BLqf;)Ljava/lang/String;")
    public static final String method1473(byte arg0, class403 arg1) {
        if (arg0 <= 85) {
            method1472(-45);
        }
        ++field3091;
        return arg1.field5366 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "([[[Lmf;I)V")
    public static final void method1474(class766[][][] arg0, int arg1) {
        ++field3090;
        if (arg1 != 7) {
            field3089 = null;
        }
        for (int var2 = 0; var2 < arg0.length; ++var2) {
            class766[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class766 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field10426 instanceof class274) {
                            ((class274) var6.field10426).method1012((byte) 122);
                        }
                        if (var6.field10432 instanceof class274) {
                            ((class274) var6.field10432).method1012((byte) 125);
                        }
                        if (var6.field10430 instanceof class274) {
                            ((class274) var6.field10430).method1012((byte) 125);
                        }
                        if (var6.field10433 instanceof class274) {
                            ((class274) var6.field10433).method1012((byte) 121);
                        }
                        if (var6.field10423 instanceof class274) {
                            ((class274) var6.field10423).method1012((byte) 120);
                        }
                        for (class569 var7 = var6.field10431; var7 != null; var7 = var7.field7189) {
                            class620 var8 = var7.field7193;
                            if (var8 instanceof class274) {
                                ((class274) var8).method1012((byte) 120);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            this.method638(111, 84);
        }
        ++field3088;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306 && this.method2037((byte) -92)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field4319 * super.field4319;
            for (int var8 = 0; class418.field5518 > var8; ++var8) {
                int var9 = super.field4320[var8 % super.field4321 + var7];
                var6[var8] = class249.method1625(var9 << 4, 4080);
                var5[var8] = class249.method1625(4080, var9 >> 4);
                var4[var8] = class249.method1625(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    static {
        new BitSet(65536);
    }
}
