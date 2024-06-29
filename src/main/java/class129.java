import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class129 extends class68 {

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Z")
    public static boolean field1822 = false;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "[I")
    public static int[] field1825 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lhc;")
    public static class235 field1823;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "[I")
    public static int[] field1828;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public static final void method881(int arg0, int arg1) {
        class181.field2534 = new int[arg1];
        class33.field502 = new int[arg1];
        class231.field3500 = new int[arg1];
        class222.field3333 = new int[arg1];
        ++field1821;
        class137.field1921 = new int[arg1];
        if (arg0 != -4415) {
            method884(32);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)I")
    public static final int method882(boolean arg0, int arg1) {
        if (!arg0) {
            return -48;
        } else {
            ++field1824;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lql;B)V")
    public static final void method883(class224 arg0, byte arg1) {
        if (arg1 >= -117) {
            field1825 = null;
        }
        for (int var2 = 0; ~class95.field1348 < ~var2; ++var2) {
            int var3 = arg0.method1461(true);
            int var4 = arg0.method1445(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class167.field2299[var3] != null) {
                class167.field2299[var3].field637 = var4;
            }
        }
        ++field1827;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
    public static void method884(int arg0) {
        field1828 = null;
        field1823 = null;
        field1825 = null;
        if (arg0 != -14782) {
            field1828 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method885(int arg0, Component arg1) {
        if (arg0 == -1) {
            Method var2 = class244.field3735;
            if (var2 != null) {
                try {
                    var2.invoke(arg1, Boolean.FALSE);
                } catch (Throwable var3) {
                }
            }
            ++field1826;
            arg1.addKeyListener(class287.field4533);
            arg1.addFocusListener(class287.field4533);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            return null;
        } else {
            int[] var3 = super.field917.method1920(arg0, true);
            ++field1829;
            if (super.field917.field4474) {
                class115.method779(var3, 0, class89.field1248, class127.field1794[arg0]);
            }
            return var3;
        }
    }
}
