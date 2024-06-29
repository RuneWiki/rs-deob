import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public abstract class class84 extends class107 {

    @OriginalMember(owner = "client!aka", name = "C", descriptor = "Z")
    public volatile boolean field930 = true;

    @OriginalMember(owner = "client!aka", name = "y", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "Ljd;")
    public static class241 field927;

    @OriginalMember(owner = "client!aka", name = "A", descriptor = "Z")
    public boolean field928;

    @OriginalMember(owner = "client!aka", name = "B", descriptor = "Z")
    public boolean field929;

    @OriginalMember(owner = "client!aka", name = "e", descriptor = "(B)[B")
    public abstract byte[] method638(byte arg0);

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(Z)V")
    public static void method639(boolean arg0) {
        if (!arg0) {
            field927 = null;
        }
        field927 = null;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V")
    public static final void method640(int arg0) {
        if (class37.field491 != null) {
            if (class195.field2997) {
                class337.method2142((byte) -80);
            }
            class510.field7211.method2451((byte) 127);
            class622.method3585();
            class515.method3108(21704);
            class74.method586((byte) -64);
            class404.method2486(arg0 ^ 0x6F);
            class189.method1322(arg0 - 113);
            if (class416.field5698 != null) {
                class416.field5698.method3125((byte) -128);
            }
            class124.method937((byte) 89);
            class449.method2678(0);
            class401.method2470((byte) 53);
            class309.method1990((byte) -16);
            class92.method681((byte) -88, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class702 var5 = class767.field10560[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field4673.length; var6++) {
                        var5.field4673[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class36.field483; var2++) {
                class665 var3 = class164.field2601[var2].field3181;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4673.length; var4++) {
                        var3.field4673[var4] = null;
                    }
                }
            }
            class500.field7104 = null;
            class494.field7044 = null;
            class37.field491.method533(97);
            class37.field491 = null;
        }
        if (arg0 == 0) {
            field926++;
        }
    }

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "(B)I")
    public abstract int method641(byte arg0);
}
