import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class215 extends OutputStream {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
    public static boolean field3416 = false;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3417 = "Please remove ";

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[[[Lkc;")
    public static class286[][][] field3420;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public static final void method1544(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class80.field1158; var3++) {
            for (int var4 = 0; var4 < class106.field1537; var4++) {
                for (int var5 = 0; var5 < class232.field3724; var5++) {
                    class286 var6 = class220.field3525[var3][var4][var5];
                    if (var6 != null) {
                        class99 var7 = var6.field4526;
                        if (var7 != null && var7.field1466.method1304()) {
                            class121.method885(var7.field1466, var3, var4, var5, 1, 1);
                            if (var7.field1458 != null && var7.field1458.method1304()) {
                                class121.method885(var7.field1458, var3, var4, var5, 1, 1);
                                var7.field1466.method1298(var7.field1458, 0, 0, 0, false);
                                var7.field1458 = var7.field1458.method1287(arg0, arg1, arg2);
                            }
                            var7.field1466 = var7.field1466.method1287(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4541; var8++) {
                            class166 var10 = var6.field4530[var8];
                            if (var10 != null && var10.field2681.method1304()) {
                                class121.method885(var10.field2681, var3, var4, var5, var10.field2688 + 1 - var10.field2678, var10.field2692 - var10.field2684 + 1);
                                var10.field2681 = var10.field2681.method1287(arg0, arg1, arg2);
                            }
                        }
                        class159 var9 = var6.field4518;
                        if (var9 != null && var9.field2601.method1304()) {
                            class29.method210(var9.field2601, var3, var4, var5);
                            var9.field2601 = var9.field2601.method1287(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3415++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1545(String arg0, int arg1, String arg2, String arg3) {
        field3419++;
        int var4 = arg2.length();
        int var5 = arg3.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (~var8 != arg1) {
            int var9 = 0;
            while (true) {
                int var10 = arg2.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg2.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg2.substring(var12));
                return var11.toString();
            }
            var11.append(arg2.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method1546(int arg0) {
        client.field2578++;
        if (arg0 < -70) {
            field3414++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1547(int arg0) {
        if (arg0 < 89) {
            field3416 = true;
        }
        field3420 = null;
        field3417 = null;
    }
}
