import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class118 extends class176 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lqd;")
    public static class148 field2630 = new class148();

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Lgg;")
    public static class63 field2635 = class116.method911(43, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Lgg;")
    private static class63 field2636 = class116.method911(43, "Loaded wordpack");

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2637 = 0;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lgg;")
    public static class63 field2634 = field2636;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Lgg;")
    private static class63 field2640 = class116.method911(43, "Login");

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lgg;")
    public static class63 field2633 = field2640;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field2641 = new Random();

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Lgg;")
    public static class63 field2642 = class116.method911(43, "blinken2:");

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lgg;")
    public static class63 field2645 = class116.method911(43, "");

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Lgg;")
    public static class63 field2644 = class116.method911(43, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lka;III)V")
    public static final void method918(class92 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class199.field3979) {
            class96 var4 = class148.field3117[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2294 != null && var4.field2294.field953 instanceof class92) {
                class92 var5 = (class92) var4.field2294.field953;
                class92.method797(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class199.field3979) {
            class96 var6 = class148.field3117[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field2294 != null && var6.field2294.field953 instanceof class92) {
                class92 var7 = (class92) var6.field2294.field953;
                class92.method797(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class199.field3979 && arg3 < class13.field298) {
            class96 var8 = class148.field3117[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field2294 != null && var8.field2294.field953 instanceof class92) {
                class92 var9 = (class92) var8.field2294.field953;
                class92.method797(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 >= class199.field3979 || arg3 <= 0) {
            return;
        }
        class96 var10 = class148.field3117[arg1][arg2 + 1][arg3 - 1];
        if (var10 != null && var10.field2294 != null && var10.field2294.field953 instanceof class92) {
            class92 var11 = (class92) var10.field2294.field953;
            class92.method797(arg0, var11, 128, 0, -128, true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public static final void method919() {
        for (int var0 = 0; var0 < class90.field2116; var0++) {
            class98 var1 = class59.field1515[var0];
            class42.method380(var1);
            class59.field1515[var0] = null;
        }
        class90.field2116 = 0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2642 = null;
        field2641 = null;
        field2645 = null;
        field2630 = null;
        field2644 = null;
        field2634 = null;
        field2635 = null;
        field2636 = null;
        field2640 = null;
        if (arg0 == -21243) {
            field2633 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2629 = arg0;
        this.field2639 = arg1;
    }
}
