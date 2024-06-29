import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class85 {

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1197 = " from your friend list first.";

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[Ltk;")
    public static class46[] field1199 = new class46[4];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "J")
    public long field1195;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lh;")
    public class111 field1202;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
    public static int[] field1201;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[Lfk;")
    public static class163[] field1204;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 19)
    public static void method692(byte arg0) {
        field1201 = null;
        field1197 = null;
        field1204 = null;
        if (arg0 != -100) {
            method693(12, -50, 102);
        }
        field1199 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)J", line = 36)
    public static final long method693(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2407; var4++) {
            class180 var5 = var3.field2406[var4];
            if ((var5.field2585 >> 29 & 0x3L) == 2L && var5.field2590 == arg1 && var5.field2580 == arg2) {
                return var5.field2585;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z", line = 62)
    public static final boolean method694(int arg0) {
        if (arg0 != -19773) {
            field1199 = (class46[]) null;
        }
        field1203++;
        if (class158.field2272) {
            try {
                class114.method858("showVideoAd", (byte) -67, class54.field787.field878);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }
}
