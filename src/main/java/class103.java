import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class103 extends class251 {

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static volatile int field1884 = 0;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
    public static int[] field1888 = new int[128];

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lij;")
    public static class50 field1883 = class78.method578(127, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lda;I)V")
    public static final void method781(class22 arg0, int arg1) {
        field1890++;
        class28.field601 = class64.method498(0, 64, class134.field2336, arg0);
        class109.field1967 = class174.method1199(arg0, 22725, class191.field3158, 0);
        class250.field4337 = class55.method436((byte) -15, 0, class164.field2803, arg0);
        class55.method436((byte) -15, 0, class211.field3510, arg0);
        class87.field1679 = class55.method436((byte) -15, 0, class58.field1039, arg0);
        class220.field3671 = class55.method436((byte) -15, 0, class56.field1016, arg0);
        class119.field2112 = class207.method1395(arg0, class7.field86, 0, false);
        class228.field3836 = class207.method1395(arg0, class251.field4354, 0, false);
        class94.field1756 = class199.method1334(class177.field2961, arg0, false, 0);
        class99.field1832 = class207.method1395(arg0, class46.field848, 0, false);
        class14.field330 = class207.method1395(arg0, class8.field113, 0, false);
        class153.field2681 = class102.method779(0, -96, class175.field2940, arg0);
        class256.field4432 = class102.method779(0, -117, class123.field2160, arg0);
        class245.field4259.method1064(class256.field4432, (int[]) null);
        class36.field711.method1064(class256.field4432, (int[]) null);
        class57.field1029.method1064(class256.field4432, (int[]) null);
        class169 var2 = class183.method1244(arg0, (byte) -128, class46.field840, 0);
        var2.method1172();
        class96.field1792 = var2;
        class169[] var3 = class174.method1199(arg0, 22725, class96.field1805, 0);
        int var4 = 0;
        if (arg1 <= 92) {
            field1883 = null;
        }
        while (var3.length > var4) {
            var3[var4].method1172();
            var4++;
        }
        class125.field2187 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class109.field1967.length; var9++) {
            class109.field1967[var9].method1178(var5 + var7, var6 + var7, var7 + var8);
        }
        class28.field601[0].method511(var5 + var7, var6 - -var7, var7 + var8);
        class190.field3150 = class109.field1967;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
    public static final void method782(int arg0, boolean arg1) {
        if (arg1) {
            field1888 = null;
        }
        class99.field1821.method770(true, arg0);
        field1886++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method783(byte arg0) {
        if (arg0 == -26) {
            field1888 = null;
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILff;I)V")
    public static final void method784(int arg0, class237 arg1, int arg2) {
        field1885++;
        if (arg0 != 0) {
            return;
        }
        if (arg1.field4004 > class244.field4245) {
            class200.method1337(arg1, false);
        } else if (class244.field4245 > arg1.field4021) {
            class106.method796(arg1, 2048);
        } else {
            class243.method1646(arg0 ^ 0x80, arg1);
        }
        if (arg1.field3990 < 128 || arg1.field4027 < 128 || arg1.field3990 >= 13184 || arg1.field4027 >= 13184) {
            arg1.field4027 = arg1.field3980[0] * 128 + (arg1.field3976 * 64);
            arg1.field4004 = 0;
            arg1.field3990 = arg1.field3978[0] * 128 + arg1.field3976 * 64;
            arg1.field4021 = 0;
            arg1.field4002 = -1;
            arg1.field3966 = -1;
            arg1.method1608((byte) -115);
        }
        if (class239.field4067 == arg1 && (arg1.field3990 < 1536 || arg1.field4027 < 1536 || arg1.field3990 >= 11776 || arg1.field4027 >= 11776)) {
            arg1.field4004 = 0;
            arg1.field4002 = -1;
            arg1.field3966 = -1;
            arg1.field4027 = arg1.field3980[0] * 128 + arg1.field3976 * 64;
            arg1.field3990 = arg1.field3978[0] * 128 + (arg1.field3976 * 64);
            arg1.field4021 = 0;
            arg1.method1608((byte) -115);
        }
        class182.method1235(76, arg1);
        class33.method273(arg0 - 1, arg1);
    }
}
