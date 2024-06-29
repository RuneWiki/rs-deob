import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class241 extends class31 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Luc;")
    public static class11 field4183 = new class11(64);

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Lmb;")
    private static class96 field4188 = class243.method1708(" is already on your friend list)3", (byte) 96);

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lmb;")
    public static class96 field4186 = field4188;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4184 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static volatile int field4189 = -1;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Luc;")
    public static class11 field4190 = new class11(100);

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lo;")
    public static class12 field4185;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "[I")
    public static int[] field4187;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[[B")
    public static byte[][] field4182;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[[B")
    public static byte[][] field4191;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field4185 = null;
        field4188 = null;
        field4191 = null;
        field4184 = null;
        if (arg0 != 0) {
            method1698(-20, (class96) null, false);
        }
        field4190 = null;
        field4186 = null;
        field4183 = null;
        field4182 = null;
        field4187 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILmb;Z)V")
    public static final void method1698(int arg0, class96 arg1, boolean arg2) {
        field4180++;
        if (arg0 != 8215) {
            method1698(-29, (class96) null, false);
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class244.field4235.method118(arg1, 250);
        int var7 = class244.field4235.method122(arg1, 250) * 13;
        class84.method598(var5 - var3, -var3 + var4, var3 + var3 + var6, var3 + var7 + var3, 0);
        class84.method607(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class244.field4235.method121(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class52.method399(true, var3 + var7 + var3, var6 - -var3 + var3, var5 - var3, -var3 + var4);
        if (!arg2) {
            class130.method987(var6, var7, var5, true, var4);
            return;
        }
        try {
            Graphics var8 = class3.field28.getGraphics();
            class85.field1442.method66((byte) 109, 0, 0, var8);
        } catch (Exception var9) {
            class3.field28.repaint();
        }
    }
}
