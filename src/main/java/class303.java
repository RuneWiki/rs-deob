import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class303 extends class381 {

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "Lpb;")
    public static class2 field4495 = new class2(7, 2);

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Lps;")
    public class5 field4498;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "Lps;")
    public class5 field4499;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Ljava/lang/String;")
    public String field4497;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "Z")
    public boolean field4505;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field4500;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1912(boolean arg0) {
        field4495 = null;
        if (arg0) {
            method1913();
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "()V", line = 28)
    public static final void method1913() {
        for (int var0 = class565.field8255; var0 < class555.field8157; var0++) {
            for (int var1 = 0; var1 < class91.field1390; var1++) {
                for (int var2 = 0; var2 < class575.field8372; var2++) {
                    class44 var3 = class603.field8695[var0][var1][var2];
                    if (var3 != null) {
                        class332 var4 = var3.field668;
                        class332 var5 = var3.field670;
                        if (var4 != null && var4.method309(true)) {
                            class276.method1641(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method309(true)) {
                                class276.method1641(var5, var0, var1, var2, 1, 1);
                                var5.method311(0, class503.field7110, 0, var4, false, 108, 0);
                                var5.method315((byte) 109);
                            }
                            var4.method315((byte) 127);
                        }
                        for (class361 var6 = var3.field667; var6 != null; var6 = var6.field5299) {
                            class293 var8 = var6.field5301;
                            if (var8 != null && var8.method309(true)) {
                                class276.method1641(var8, var0, var1, var2, var8.field4294 + 1 - var8.field4299, var8.field4305 - var8.field4300 + 1);
                                var8.method315((byte) 103);
                            }
                        }
                        class518 var7 = var3.field672;
                        if (var7 != null && var7.method309(true)) {
                            class272.method1623(var7, var0, var1, var2);
                            var7.method315((byte) 110);
                        }
                    }
                }
            }
        }
    }
}
