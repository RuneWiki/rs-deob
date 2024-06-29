import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class214 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Z")
    public static boolean field3680 = false;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field3684 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[J")
    public static long[] field3687 = new long[500];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lff;")
    public static class3 field3685;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
    public static int[] field3688;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lmi;")
    public static class180[] field3681;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLgd;)V")
    public static final void method1484(boolean arg0, class123 arg1) {
        class269.field4682 = 3;
        field3682++;
        class109.method837(true, 14459);
        class176.field3061 = arg0;
        class22.field376 = 0;
        class89.field1478 = true;
        class82.field1392 = true;
        class143.field2541 = true;
        class237.field4073 = true;
        class206.field3535 = 0;
        class219.field3743 = true;
        class109.field2014 = true;
        class144.field2546 = 0;
        class248.field4292 = true;
        class22.field386 = true;
        class233.field3999 = 127;
        class94.field1550 = true;
        class128.field2334 = true;
        class234.field4018 = 0;
        class92.field1525 = 255;
        class5.field100 = 127;
        class148.field2620 = 2;
        class161.field2860 = true;
        class261 var2 = null;
        class256.field4461 = 0;
        try {
            class263 var3 = arg1.method953("runescape", 0);
            while (var3.field4605 == 0) {
                class226.method1543(1L, -738);
            }
            if (var3.field4605 == 1) {
                var2 = (class261) var3.field4604;
                byte[] var4 = new byte[(int) var2.method1803(-62)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1807(var4, var4.length - var5, var5, 82);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class200.method1403(19, new class239(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1804(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public static final void method1485(byte arg0, int arg1) {
        class220.field3763.method82((byte) -109, arg1);
        if (arg0 > 58) {
            field3679++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V")
    public static final void method1486(int arg0, boolean arg1) {
        if (arg1) {
            field3681 = null;
        }
        field3686++;
        class31.field491.method82((byte) -109, arg0);
        class91.field1504.method82((byte) -109, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1487(int arg0) {
        field3688 = null;
        field3681 = null;
        field3685 = null;
        if (arg0 != -1) {
            field3684 = 26;
        }
        field3687 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)V")
    public static final void method1488(byte arg0, int arg1) {
        field3683++;
        class43 var2 = class270.method1847(arg1, -10277, 8);
        var2.method339(true);
        if (arg0 > -53) {
            method1486(75, false);
        }
    }
}
