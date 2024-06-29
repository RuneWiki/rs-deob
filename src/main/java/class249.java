import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class249 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3845 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[[Z")
    public static boolean[][] field3843;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lgk;", line = 5)
    public final class7 method1765(int arg0) {
        field3851++;
        class7 var2 = (class7) class78.field1186.method1830((long) this.field3848, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        class7 var3 = class35.method252(116, arg0, this.field3848, class116.field1892);
        if (var3 != null) {
            class78.field1186.method1831((long) this.field3848, var3, arg0 - 13897);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lpe;II)V", line = 25)
    public final void method1766(class101 arg0, int arg1, int arg2) {
        int var4 = -27 % ((arg1 - 58) / 47);
        while (true) {
            int var5 = arg0.method741(40);
            if (var5 == 0) {
                field3852++;
                return;
            }
            this.method1768(arg2, arg0, var5, -54);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 56)
    public static void method1767(byte arg0) {
        field3843 = (boolean[][]) null;
        if (arg0 != 40) {
            field3845 = -19;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILpe;II)V", line = 73)
    private final void method1768(int arg0, class101 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3848 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field3847 = arg1.method741(80);
            this.field3844 = arg1.method741(58);
        }
        field3842++;
        if (arg3 > -19) {
            method1769(-128, 3, -33, -24);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Lfc;", line = 96)
    public static final class224 method1769(int arg0, int arg1, int arg2, int arg3) {
        field3853++;
        class224 var4 = new class224();
        var4.field3601 = arg3;
        var4.field3596 = arg2;
        class268.field4148.method845(var4, (byte) 69, (long) arg1);
        class295.method2074(-14255, arg2);
        class292 var5 = class215.method1555((byte) -48, arg1);
        if (var5 != null) {
            class143.method1091(var5, (byte) 51);
        }
        if (class168.field2612 != null) {
            class143.method1091(class168.field2612, (byte) 102);
            class168.field2612 = null;
        }
        int var6 = class65.field1062;
        for (int var7 = arg0; var7 < var6; var7++) {
            if (class170.method1242(class12.field233[var7], -128)) {
                class36.method274((byte) -79, var7);
            }
        }
        if (class65.field1062 == 1) {
            class243.field3754 = false;
            class77.method567(class169.field2626, class76.field1168, class217.field3485, 0, class316.field4931);
        } else {
            class77.method567(class169.field2626, class76.field1168, class217.field3485, 0, class316.field4931);
            int var8 = class95.field1558.method1035(class77.field1175);
            for (int var9 = 0; var9 < class65.field1062; var9++) {
                int var10 = class95.field1558.method1035(class215.method1559(false, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class169.field2626 = class65.field1062 * 15 + (class77.field1176 ? 26 : 22);
            class217.field3485 = var8 + 8;
        }
        if (var5 != null) {
            class314.method2162(false, false, var5);
        }
        class8.method63(arg2, 2000000);
        if (class122.field1950 != -1) {
            class108.method824(1, (byte) -101, class122.field1950);
        }
        return var4;
    }
}
