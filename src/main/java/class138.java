import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Z")
    public boolean field2265 = true;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field2266 = new Object();

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public int[] field2271 = new int[500];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field2272 = 0;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
    public int[] field2274 = new int[500];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "S")
    public static short field2267 = 256;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2265) {
            Object var1 = this.field2266;
            synchronized (this.field2266) {
                if (this.field2272 < 500) {
                    this.field2274[this.field2272] = class241.field3898;
                    this.field2271[this.field2272] = class109.field1801;
                    this.field2272++;
                }
            }
            class43.method358(50L, false);
        }
        field2269++;
    }
}
