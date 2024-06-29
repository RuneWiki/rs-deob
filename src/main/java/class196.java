import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class196 extends class119 {

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lai;")
    public static class10 field3707 = class44.method278("<br>(X", -40);

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lai;")
    public static class10 field3711 = class44.method278("Ein kostenloses Spielkonto erstellen)3", 103);

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field3714 = 0;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lvf;")
    public class196 field3710;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lvf;")
    public class196 field3713;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "[I")
    public static int[] field3709;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLc;Lc;)V")
    public static final void method1246(byte arg0, class21 arg1, class21 arg2) {
        field3715++;
        class84.field1462 = arg1;
        if (arg0 < 103) {
            field3711 = null;
        }
        class56.field996 = arg2;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public final void method1247(int arg0) {
        field3708++;
        if (this.field3713 == null) {
            return;
        }
        this.field3713.field3710 = this.field3710;
        this.field3710.field3713 = this.field3713;
        this.field3710 = null;
        if (arg0 != 0) {
            method1249(-40);
        }
        this.field3713 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method1248(byte arg0) {
        field3712++;
        if (arg0 != 89) {
            method1248((byte) -106);
        }
        for (class118 var1 = (class118) class165.field3162.method212((byte) 50); var1 != null; var1 = (class118) class165.field3162.method215((byte) 34)) {
            int var2 = var1.field2272;
            if (class42.method270(var2, (byte) -64)) {
                class200[] var3 = class205.field3990[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3927;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field2291;
                    class200 var7 = class66.method432(var6, false);
                    if (var7 != null) {
                        class168.method1116(var7, -124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field3707 = null;
        if (arg0 != 0) {
            field3711 = null;
        }
        field3709 = null;
        field3711 = null;
    }
}
