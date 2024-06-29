import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class38 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[[[S")
    public static short[][][] field612;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 9)
    public static final void method293(byte arg0) {
        int var1 = -81 % ((arg0 + 57) / 49);
        field611++;
        class294.field4803.method1415(-18218);
        class208.field3419.method1415(-18218);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 27)
    public static void method294(int arg0) {
        if (arg0 <= 31) {
            method294(17);
        }
        field612 = (short[][][]) null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 67)
    public static final void method295(int arg0) {
        field609++;
        class296.method2006(class233.field3851, 127);
        class302.field5058++;
        if (class289.field4738 && class44.field679) {
            int var1 = class118.field1985;
            int var2 = var1 - class138.field2235;
            int var3 = class220.field3617;
            if (class107.field1815 > var2) {
                var2 = class107.field1815;
            }
            if ((class233.field3851.field4923 + var2) > (class107.field1815 + class126.field2098.field4923)) {
                var2 = class107.field1815 + class126.field2098.field4923 - class233.field3851.field4923;
            }
            int var4 = var3 - class105.field1790;
            int var5 = var2 + class126.field2098.field4937 - class107.field1815;
            int var6 = var2 - class239.field3950;
            int var7 = class233.field3851.field4989;
            if (var4 < class58.field817) {
                var4 = class58.field817;
            }
            if ((class58.field817 + class126.field2098.field4882) < (class233.field3851.field4882 + var4)) {
                var4 = class126.field2098.field4882 + class58.field817 - class233.field3851.field4882;
            }
            int var8 = var4 + class126.field2098.field4897 - class58.field817;
            int var9 = var4 - class76.field1277;
            if (class233.field3851.field4911 < class302.field5058 && (var7 < var6 || var6 < -var7 || var9 > var7 || -var7 > var9)) {
                class185.field2999 = true;
            }
            if (class233.field3851.field4887 != null && class185.field2999) {
                class157 var10 = new class157();
                var10.field2552 = class233.field3851.field4887;
                var10.field2551 = class233.field3851;
                var10.field2554 = var5;
                var10.field2553 = var8;
                class177.method1275(var10, -38);
            }
            if (~class273.field4575 == arg0) {
                if (class185.field2999) {
                    if (class233.field3851.field4971 != null) {
                        class157 var11 = new class157();
                        var11.field2554 = var5;
                        var11.field2551 = class233.field3851;
                        var11.field2553 = var8;
                        var11.field2552 = class233.field3851.field4971;
                        var11.field2547 = class29.field477;
                        class177.method1275(var11, -128);
                    }
                    if (class29.field477 != null && client.method2172(class233.field3851) != null) {
                        class222.field3650++;
                        class121.field2033.method37(63, 91);
                        class121.field2033.method1170(false, class233.field3851.field4987);
                        class121.field2033.method1155(-1640531527, class29.field477.field4987);
                        class121.field2033.method1168(class29.field477.field4948, (byte) -119);
                        class121.field2033.method1169((byte) -74, class233.field3851.field4948);
                    }
                } else if ((class256.field4270 == 1 || class24.method151(arg0 ^ 0x73, class314.field5337 - 1)) && class314.field5337 > 2) {
                    class181.method1288(false);
                } else if (class314.field5337 > 0) {
                    class30.method237((byte) -57);
                }
                class233.field3851 = null;
            }
        } else if (class302.field5058 > 1) {
            class233.field3851 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I", line = 187)
    public static final int method296(int arg0, int arg1, int arg2, int arg3) {
        field613++;
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var4 = 128 - arg2;
            int var5 = (arg1 & arg3) * var4 + ((arg0 & 0xFF00FF) * arg2) & 0xFF00FF00;
            int var6 = ((arg0 & -16711936) >>> 7) * arg2 + ((arg1 & -16711936) >>> 7) * var4 & 0xFF00FF00;
            return (var5 >> 7) + var6;
        }
    }
}
