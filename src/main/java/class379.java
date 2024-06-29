import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class379 {

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "[[I")
    public static int[][] field5778 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public int field5785;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field5788;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Ldb;")
    public static class66 field5784;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public static final void method2346(int arg0) {
        if (arg0 != 2) {
            method2348(null, null, 64, null, (byte) 91);
        }
        field5786++;
        class497 var1 = null;
        try {
            class125 var2 = class419.field6254.method2813("2", (byte) -117);
            while (var2.field1791 == 0) {
                class106.method710(1L, (byte) 6);
            }
            if (var2.field1791 == 1) {
                var1 = (class497) var2.field1793;
                byte[] var3 = new byte[(int) var1.method2957(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2959(var4, var3.length - var4, (byte) 25, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class512.method3050(new class91(var3), arg0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2961((byte) -27);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)Z")
    public static final boolean method2347(int arg0, int arg1, int arg2) {
        field5779++;
        if (arg2 != -16) {
            method2347(-62, -34, -78);
        }
        return ((arg0 & 0x2000) != 0 | class172.method1208(arg0, arg1, -6118) | class42.method332((byte) -101, arg1, arg0)) & class453.method2729((byte) -112, arg1, arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lm;Ljava/awt/Canvas;ILhu;B)Lqa;")
    public static final class496 method2348(class373 arg0, Canvas arg1, int arg2, class469 arg3, byte arg4) {
        field5783++;
        if (arg4 < 125) {
            field5778 = null;
        }
        return new class161(arg2, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBLtl;)V")
    private final void method2349(int arg0, byte arg1, class91 arg2) {
        field5780++;
        if (arg0 == 1) {
            this.field5782 = arg2.method631(10494);
            this.field5785 = arg2.method618((byte) 100);
            this.field5788 = arg2.method618((byte) 100);
        }
        int var4 = 8 % ((55 - arg1) / 46);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static final void method2350(byte arg0) {
        field5781++;
        if (client.field935) {
            return;
        }
        if (class96.field1399.field5229) {
            class99.field1428 = ((int) class99.field1428 + 47 & 0xFFFFFFF0);
        } else {
            class128.field1809 += (12.0F - class128.field1809) / 2.0F;
        }
        if (arg0 != -48) {
            field5784 = null;
        }
        class314.field4804 = true;
        client.field935 = true;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLtl;)V")
    public final void method2351(byte arg0, class91 arg1) {
        int var3 = 103 / ((arg0 + 54) / 43);
        field5777++;
        while (true) {
            int var4 = arg1.method618((byte) 100);
            if (var4 == 0) {
                return;
            }
            this.method2349(var4, (byte) -10, arg1);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method2352(boolean arg0) {
        if (arg0) {
            field5778 = null;
        }
        field5784 = null;
        field5778 = null;
    }
}
