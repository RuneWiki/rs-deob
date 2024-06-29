import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class228 implements Runnable {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[Lje;")
    public volatile class111[] field3959 = new class111[2];

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
    public volatile boolean field3967 = false;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Z")
    public volatile boolean field3960 = false;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lmh;")
    public static class62 field3961 = class201.method1405(true, "lila:");

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lgi;")
    public class285 field3962;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[Lwj;")
    public static class135[] field3963;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[[Z")
    public static boolean[][] field3966;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 4)
    public static void method1610(byte arg0) {
        field3966 = (boolean[][]) null;
        field3963 = null;
        field3961 = null;
        if (arg0 >= -38) {
            method1613(false, false, (class26) null, (class26) null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Llm;I)V", line = 18)
    public static final void method1611(class148 arg0, int arg1) {
        field3965++;
        long var2 = 0L;
        int var4 = arg1;
        if (arg0.field2344 == 0) {
            var2 = class150.method1080(arg0.field2330, arg0.field2341, arg0.field2342);
        }
        if (arg0.field2344 == 1) {
            var2 = class274.method1875(arg0.field2330, arg0.field2341, arg0.field2342);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field2344 == 2) {
            var2 = class240.method1682(arg0.field2330, arg0.field2341, arg0.field2342);
        }
        if (arg0.field2344 == 3) {
            var2 = class44.method290(arg0.field2330, arg0.field2341, arg0.field2342);
        }
        if (var2 != 0L) {
            var6 = (int) var2 >> 20 & 0x3;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field2332 = var4;
        arg0.field2346 = var6;
        arg0.field2340 = var5;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V", line = 78)
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class4.method17(class99.field1630, -16168, class81.field1348, arg0);
        field3969++;
        int var7 = -14 / ((arg4 + 17) / 46);
        int var8 = class4.method17(class99.field1630, -16168, class81.field1348, arg3);
        int var9 = class4.method17(class176.field2819, -16168, class52.field755, arg5);
        int var10 = class4.method17(class176.field2819, -16168, class52.field755, arg1);
        for (int var11 = var6; var11 <= var8; var11++) {
            class271.method1861(arg2, true, class282.field4817[var11], var10, var9);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZLhi;Lhi;)V", line = 104)
    public static final void method1613(boolean arg0, boolean arg1, class26 arg2, class26 arg3) {
        class192.field3216 = arg2;
        class105.field1724 = arg3;
        class274.field4640 = arg1;
        field3968++;
        if (arg0) {
            method1611((class148) null, 80);
        }
    }

    @OriginalMember(owner = "client!qi", name = "run", descriptor = "()V", line = 126)
    public final void run() {
        this.field3960 = true;
        try {
            while (!this.field3967) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class111 var2 = this.field3959[var1];
                    if (var2 != null) {
                        var2.method859(0);
                    }
                }
                class99.method792(-1, 10L);
                class102.method807(24777, (Object) null, this.field3962);
            }
        } catch (Exception var7) {
            class235.method1659(var7, (String) null, -28677);
        } finally {
            this.field3960 = false;
        }
        field3964++;
    }
}
