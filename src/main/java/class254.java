import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class254 extends class86 {

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "J")
    public long field4288;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Lj;")
    public static class269 field4294 = new class269();

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field4295 = 0;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lbe;")
    public static class283 field4297 = class153.method941(126, ":assist:");

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Lub;")
    public static class20 field4298;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lt;")
    public static class239 field4299;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "[[B")
    public static byte[][] field4296;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILbe;)V", line = 5)
    public static final void method1719(int arg0, int arg1, class283 arg2) {
        class72 var3 = class25.method174(arg1, (byte) -127, 3);
        field4287++;
        var3.method477(-109);
        if (arg0 == 3858) {
            var3.field1271 = arg2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Lgi;", line = 18)
    public static final class204 method1720(int arg0) {
        field4290++;
        int var1 = class202.field3451[0] * class201.field3440[0];
        byte[] var2 = class256.field4329[0];
        int var3 = 90 % ((47 - arg0) / 36);
        class204 var6;
        if (class126.field2080[0]) {
            byte[] var7 = class69.field1146[0];
            int[] var8 = new int[var1];
            for (int var9 = 0; var9 < var1; var9++) {
                var8[var9] = class53.method337(class296.field5018[class178.method1174(var2[var9], 255)], class178.method1174(-16777216, var7[var9] << 24));
            }
            var6 = new class233(class197.field3372, class193.field3301, class247.field4226[0], class232.field3933[0], class202.field3451[0], class201.field3440[0], var8);
        } else {
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class296.field5018[class178.method1174(var2[var5], 255)];
            }
            var6 = new class204(class197.field3372, class193.field3301, class247.field4226[0], class232.field3933[0], class202.field3451[0], class201.field3440[0], var4);
        }
        class88.method571(-4);
        return var6;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V", line = 64)
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4289++;
        if (class273.field4588 == 1) {
            class16.field188[class140.field2339 / 100].method711(class222.field3735 - 8, class90.field1527 + -8);
        }
        if (arg1 > -16) {
            method1721(24, 41, 17, -85, -45);
        }
        if (class273.field4588 == 2) {
            class16.field188[class140.field2339 / 100 + 4].method711(class222.field3735 - 8, class90.field1527 + -8);
        }
        class68.method430((byte) 92);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Ll;", line = 87)
    public static final class281 method1722(int arg0, int arg1) {
        field4292++;
        class281 var2 = (class281) class7.field73.method1629(-53, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 0) {
            byte[] var3 = class48.field660.method1107(class135.method841(arg1, true), class55.method360(arg1, 122), arg0 ^ 0x7C);
            class281 var4 = new class281();
            var4.field4693 = arg1;
            if (var3 != null) {
                var4.method1880(new class229(var3), -1);
            }
            var4.method1874((byte) -115);
            if (!class240.field4050 && var4.field4741) {
                var4.field4740 = null;
            }
            if (var4.field4756) {
                var4.field4742 = 0;
                var4.field4758 = false;
            }
            class7.field73.method1630(true, (long) arg1, var4);
            return var4;
        } else {
            return (class281) null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V", line = 126)
    public static void method1723(byte arg0) {
        field4294 = null;
        if (arg0 != 14) {
            field4298 = (class20) null;
        }
        field4296 = (byte[][]) null;
        field4299 = null;
        field4298 = null;
        field4297 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 147)
    public class254() {
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIIII)V", line = 152)
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class114.method742(30197, arg2 - arg4, class97.field1636[arg3], arg2 + arg4, arg0);
        field4291++;
        if (arg1 != 2) {
            return;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -1;
        int var8 = -arg4;
        while (var6 > var5) {
            var7 += 2;
            var5++;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                var8 -= var6 << 1;
                int[] var9 = class97.field1636[arg3 + var6];
                int[] var10 = class97.field1636[arg3 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class114.method742(30197, var12, var9, var11, arg0);
                class114.method742(arg1 + 30195, var12, var10, var11, arg0);
            }
            int var13 = arg2 - var6;
            int var14 = arg2 + var6;
            int[] var15 = class97.field1636[arg3 + var5];
            int[] var16 = class97.field1636[arg3 - var5];
            class114.method742(30197, var13, var15, var14, arg0);
            class114.method742(30197, var13, var16, var14, arg0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 211)
    public static final void method1725() {
        GL var0 = class167.field2806;
        var0.glDisableClientState(32886);
        class167.method1044(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class167.method1041();
        for (int var1 = 0; var1 < class220.field3710[0].length; var1++) {
            class100 var2 = class220.field3710[0][var1];
            if (var2.field1688 >= 0 && class139.field2315.method629(122, var2.field1688) == 4) {
                var0.glColor4fv(class215.method1420(32270, var2.field1716), 0);
                float var3 = 201.5F - (var2.field1689 ? 1.0F : 0.5F);
                var2.method662(class86.field1459, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class167.method1043();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class167.method1037();
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(J)V", line = 245)
    public class254(long arg0) {
        this.field4288 = arg0;
    }
}
