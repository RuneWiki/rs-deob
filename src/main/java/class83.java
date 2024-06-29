import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
    public static boolean field1385 = false;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1384 = 0;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "S")
    public static short field1387 = 256;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ldk;")
    public static class251 field1380;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ldk;")
    public static class251 field1382;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lne;")
    public class83 field1378;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lne;")
    public class83 field1383;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[[[I")
    public static int[][][] field1379;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method572(byte arg0) {
        field1379 = null;
        field1380 = null;
        field1382 = null;
        if (arg0 != 119) {
            method572((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
    public static final void method573(int arg0, int arg1, byte arg2) {
        class26 var3 = class67.method470(0, arg0);
        field1388++;
        if (arg2 != 22) {
            return;
        }
        int var4 = var3.field322;
        int var5 = var3.field332;
        int var6 = var3.field326;
        int var7 = class10.field101[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class209.method1455(false, var4, ~var8 & class301.field4817[var4] | arg1 << var6 & var8);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method574(int arg0) {
        field1386++;
        if (this.field1383 == null) {
            return;
        }
        this.field1383.field1378 = this.field1378;
        this.field1378.field1383 = this.field1383;
        if (arg0 >= -60) {
            method572((byte) -81);
        }
        this.field1378 = null;
        this.field1383 = null;
    }
}
