import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class35 extends class183 {

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Ldj;")
    public static class44 field624 = class89.method650(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Ldj;")
    public static class44 field627 = class89.method650(255, "::autoshadow off");

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lnf;")
    public static class147 field619;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lvc;")
    public static class223 field623;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Ldj;")
    public class44 field626;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field620;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Ldj;")
    public class44[] field618;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[[II)V")
    public static final void method238(int arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        class163.field2815 = arg0;
        class66.field1205 = arg1;
        class21.field355 = arg2;
        class32.field567 = new class68[arg0][arg1][arg2];
        class170.field2972 = new int[arg0][arg1 + 1][arg2 + 1];
        class205.field3675 = arg3;
        class196.method1274();
        class59.field1108 = arg4;
        class162.field2809 = new boolean[class59.field1108 + class59.field1108 + 1][class59.field1108 + class59.field1108 + 1];
        class202.field3607 = new boolean[class59.field1108 + class59.field1108 + 2][class59.field1108 + class59.field1108 + 2];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)Ldj;")
    public static final class44 method239(int arg0, boolean arg1, int arg2) {
        int var3 = arg2 - arg0;
        field629++;
        if (var3 < -9) {
            return class224.field4183;
        } else if (var3 < -6) {
            return class101.field1853;
        } else if (var3 < -3) {
            return class215.field3922;
        } else if (var3 < 0) {
            return class10.field202;
        } else if (var3 > 9) {
            return class181.field3141;
        } else {
            if (!arg1) {
                field628 = -114;
            }
            if (var3 > 6) {
                return class235.field4377;
            } else if (var3 > 3) {
                return class90.field1703;
            } else if (var3 > 0) {
                return class58.field1092;
            } else {
                return class30.field536;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLve;)V")
    public static final void method240(byte arg0, class225 arg1) {
        if (arg0 <= -17) {
            field631++;
            class102.field1859 = arg1;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method241(byte arg0) {
        field620 = null;
        field619 = null;
        field627 = null;
        field623 = null;
        field624 = null;
        if (arg0 != -68) {
            field620 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method242(int arg0) {
        field630++;
        if (arg0 != -1) {
            field619 = null;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class179.field3071 - 1; var2++) {
                if (class108.field1990[var2] < 1000 && class108.field1990[var2 + 1] > 1000) {
                    class44 var3 = class73.field1380[var2];
                    class73.field1380[var2] = class73.field1380[var2 + 1];
                    var1 = false;
                    class73.field1380[var2 + 1] = var3;
                    class44 var4 = class30.field525[var2];
                    class30.field525[var2] = class30.field525[var2 + 1];
                    class30.field525[var2 + 1] = var4;
                    int var5 = class237.field4402[var2];
                    class237.field4402[var2] = class237.field4402[var2 + 1];
                    class237.field4402[var2 + 1] = var5;
                    int var6 = class20.field346[var2];
                    class20.field346[var2] = class20.field346[var2 + 1];
                    class20.field346[var2 + 1] = var6;
                    short var7 = class108.field1990[var2];
                    class108.field1990[var2] = class108.field1990[var2 + 1];
                    class108.field1990[var2 + 1] = var7;
                    long var8 = class223.field4126[var2];
                    class223.field4126[var2] = class223.field4126[var2 + 1];
                    class223.field4126[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldj;B)Z")
    public static final boolean method243(class44 arg0, byte arg1) {
        field625++;
        if (arg0 == null) {
            return false;
        } else if (arg1 < 15) {
            return true;
        } else {
            for (int var2 = 0; var2 < class37.field664; var2++) {
                if (arg0.method330(class157.field2733[var2], true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
