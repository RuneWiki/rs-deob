import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class260 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lsc;")
    public static class181 field4537 = class149.method967(255, "Weiter");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Laf;")
    public class208 field4534;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field4537 = null;
        if (arg0 != -1) {
            method1762(22);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method1763(byte arg0) {
        field4535++;
        if (arg0 != 8) {
            field4537 = null;
        }
        for (int var1 = 0; var1 < class258.field4512; var1++) {
            int var10002 = class94.field1512[var1]--;
            if (class94.field1512[var1] >= -10) {
                class103 var3 = class192.field3378[var1];
                if (var3 == null) {
                    var3 = class103.method695(class264.field4600, class111.field1824[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class94.field1512[var1] += var3.method693();
                    class192.field3378[var1] = var3;
                }
                if (class94.field1512[var1] < 0) {
                    int var10;
                    if (class93.field1471[var1] == 0) {
                        var10 = class173.field2911;
                    } else {
                        int var4 = (class93.field1471[var1] & 0xFF) * 128;
                        int var5 = class93.field1471[var1] >> 16 & 0xFF;
                        int var6 = (class93.field1471[var1] & 0xFF55) >> 8;
                        int var7 = var6 * 128 - (class258.field4507.field2681 - 64);
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 * 128 + 64 - class258.field4507.field2654;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var4) {
                            class94.field1512[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class55.field849 / var4;
                    }
                    if (var10 > 0) {
                        class150 var11 = var3.method692().method972(class247.field4315);
                        class154 var12 = class154.method1012(var11, 100, var10);
                        var12.method1018(class132.field2185[var1] - 1);
                        class90.field1420.method702(var12);
                    }
                    class94.field1512[var1] = -100;
                }
            } else {
                class258.field4512--;
                for (int var2 = var1; var2 < class258.field4512; var2++) {
                    class111.field1824[var2] = class111.field1824[var2 + 1];
                    class192.field3378[var2] = class192.field3378[var2 + 1];
                    class132.field2185[var2] = class132.field2185[var2 + 1];
                    class94.field1512[var2] = class94.field1512[var2 + 1];
                    class93.field1471[var2] = class93.field1471[var2 + 1];
                }
                var1--;
            }
        }
        if (class148.field2479 && !class141.method905(-7569)) {
            if (class94.field1502 != 0 && class152.field2527 != -1) {
                class121.method793(class152.field2527, false, 0, false, class94.field1502, class13.field266);
            }
            class148.field2479 = false;
        } else if (class94.field1502 != 0 && class152.field2527 != -1 && !class141.method905(-7569)) {
            class141.field2275.method541(204, arg0 + 43);
            class141.field2275.method1544(class152.field2527, arg0 - 3173);
            class152.field2527 = -1;
            class57.field862++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)Lsc;")
    public static final class181 method1764(String arg0, int arg1) {
        field4536++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
            if (arg1 != -10) {
                field4537 = null;
            }
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class181 var3 = new class181();
        var3.field3166 = var2;
        var3.field3155 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field3155++] = var2[var4];
            }
        }
        return var3;
    }
}
