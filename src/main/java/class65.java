import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class65 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Llc;")
    public static class143 field1218 = class66.method374("huffman", -1);

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Llc;")
    public static class143 field1217 = class66.method374("(U4", -1);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1216 = -1;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lti;")
    public static class194 field1215;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    public static final int method368(byte arg0) {
        field1220++;
        if (arg0 != -24) {
            method368((byte) -78);
        }
        return ((class58.field1117 == 0 ? 0 : 1) << 22) + ((class88.field1594 ? 1 : 0) << 19) + ((class44.field896 ? 1 : 0) << 16) + ((class283.field4985 ? 1 : 0) << 15) + ((class116.field2070 ? 1 : 0) << 13) + ((class32.field551 & 0x3) << 11) + ((class240.field4333 ? 1 : 0) << 7) + ((class225.field4083 ? 1 : 0) << 5) + ((class206.field3764 ? 1 : 0) << 3) + (class182.field3257 & 0x7) + ((class285.field5009 ? 1 : 0) << 4) + ((class43.field847 ? 1 : 0) << 6) + (((class189.field3418 ? 1 : 0) << 8) - (-((class49.field966 ? 1 : 0) << 9) - ((class212.field3944 ? 1 : 0) << 10))) - (-((class240.field4332 == 0 ? 0 : 1) << 20) - ((class211.field3926 == 0 ? 0 : 1) << 21) + -(class125.method751() << 23));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        class67.field1280.method823(true);
        field1221++;
        if (arg0 != 27647) {
            method369(-6);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3) {
        class120 var4 = class7.field122[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class63 var5 = var4.field2124;
        if (var5 != null) {
            var5.field1193 = var5.field1193 * arg3 / 16;
            var5.field1183 = var5.field1183 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static void method371(int arg0) {
        field1218 = null;
        field1215 = null;
        if (arg0 != 1) {
            method369(88);
        }
        field1217 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method372(int arg0, int arg1) {
        field1219++;
        if (arg1 == 100 && class116.field2034 > 0) {
            byte[] var2 = class229.field4197[--class116.field2034];
            class229.field4197[class116.field2034] = null;
            return var2;
        } else if (arg1 == 5000 && class186.field3374 > 0) {
            byte[] var3 = class54.field1048[--class186.field3374];
            class54.field1048[class186.field3374] = null;
            return var3;
        } else if (arg1 == 30000 && class29.field458 > 0) {
            byte[] var4 = class167.field2990[--class29.field458];
            class167.field2990[class29.field458] = null;
            return var4;
        } else if (arg0 == -1) {
            return new byte[arg1];
        } else {
            return null;
        }
    }
}
