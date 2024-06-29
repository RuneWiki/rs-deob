import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class362 {

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lak;")
    public static class351 field236 = new class351();

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "J")
    public long field235;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Lvl;")
    public class13 field238;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Lvl;")
    public class13 field241;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 3)
    public static void method114(int arg0) {
        if (arg0 != 0) {
            method114(-27);
        }
        field236 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 21)
    public final void method115(boolean arg0) {
        field242++;
        if (!arg0) {
            method116((byte) 50);
        }
        if (this.field238 != null) {
            this.field238.field241 = this.field241;
            this.field241.field238 = this.field238;
            this.field238 = null;
            this.field241 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 40)
    public static final void method116(byte arg0) {
        class219.field3167 = 0;
        field240++;
        if (arg0 != -114) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class627.field8638[var1] = null;
            class318.field4386[var1] = 1;
            class217.field3154[var1] = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z", line = 72)
    public final boolean method117(byte arg0) {
        field239++;
        if (this.field238 == null) {
            return false;
        } else {
            if (arg0 != 1) {
                this.method115(false);
            }
            return true;
        }
    }
}
