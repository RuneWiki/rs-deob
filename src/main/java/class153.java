import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class153 extends class81 {

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Lpj;")
    private static class237 field2722 = class33.method353("slide:", 67);

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lpj;")
    public static class237 field2724 = class33.method353("Lade)3)3)3", 120);

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "S")
    public static short field2726 = 256;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Lpj;")
    public static class237 field2725 = field2722;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "S")
    public static short field2727 = 256;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lpj;")
    public static class237 field2728 = class33.method353("weiss:", 99);

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Lpj;")
    public static class237 field2733 = field2722;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lpj;")
    public static class237 field2719 = class33.method353("<)4col>", 127);

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "J")
    public long field2730;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Lgi;")
    public class153 field2731;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Lgi;")
    public class153 field2732;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lme;")
    public static class214 field2729;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    public static final void method1051(int arg0) {
        class213 var1 = class87.field1600;
        synchronized (class87.field1600) {
            class206.field3512 = class156.field2788;
            class146.field2609++;
            if (~class159.field2865 <= arg0) {
                while (class178.field3127 != class159.field2865) {
                    int var2 = class113.field1982[class178.field3127];
                    class178.field3127 = class178.field3127 + 1 & 0x7F;
                    if (var2 < 0) {
                        class119.field2083[~var2] = false;
                    } else {
                        class119.field2083[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class119.field2083[var3] = false;
                }
                class159.field2865 = class178.field3127;
            }
            class156.field2788 = class131.field2293;
        }
        field2720++;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field2733 = null;
        field2722 = null;
        if (arg0 != -24442) {
            return;
        }
        field2725 = null;
        field2724 = null;
        field2728 = null;
        field2729 = null;
        field2719 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public final void method1053(byte arg0) {
        field2723++;
        if (this.field2731 == null) {
            return;
        }
        this.field2731.field2732 = this.field2732;
        this.field2732.field2731 = this.field2731;
        if (arg0 < 21) {
            field2729 = null;
        }
        this.field2732 = null;
        this.field2731 = null;
    }
}
