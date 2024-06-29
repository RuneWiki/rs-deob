import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class190 extends class103 {

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "J")
    public long field3271;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Lda;")
    public static class275 field3275 = class255.method1672(96, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "[Lda;")
    public static class275[] field3273 = new class275[100];

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public static void method1254(int arg0) {
        field3273 = null;
        field3275 = null;
        if (arg0 <= 110) {
            field3276 = -108;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(J)V")
    public class190(long arg0) {
        this.field3271 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method1255(byte arg0) {
        field3274++;
        class90 var1 = class91.field1548;
        synchronized (class91.field1548) {
            class36.field591++;
            class160.field2808 = class129.field2268;
            if (arg0 >= -23) {
                field3275 = null;
            }
            if (class195.field3333 >= 0) {
                while (class195.field3333 != class146.field2549) {
                    int var2 = class137.field2414[class146.field2549];
                    class146.field2549 = class146.field2549 + 1 & 0x7F;
                    if (var2 < 0) {
                        class149.field2605[~var2] = false;
                    } else {
                        class149.field2605[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class149.field2605[var3] = false;
                }
                class195.field3333 = class146.field2549;
            }
            class129.field2268 = class33.field487;
        }
    }
}
