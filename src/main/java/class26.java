import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class26 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Z")
    public static boolean field328 = true;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field331 = -1;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field329 = new CRC32();

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[[[I")
    public static int[][][] field324;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    public static final void method142(int arg0, int arg1) {
        field330++;
        class227 var2 = (class227) class1.field14.method1059(0, (long) arg1);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field3666.length; var3++) {
                var2.field3666[var3] = -1;
                var2.field3664[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class56[] var7 = client.field4852;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class56 var9 = var7[var8];
            if (var9 != null && var9.field942 == 2) {
                class1.method3(arg4, (var9.field934 - class108.field1732 << 7) + var9.field937, arg5 >> 1, var9.field936 * 2, 103, (var9.field931 - class276.field4438 << 7) + var9.field940, arg2, arg3 >> 1);
                if (class263.field4220 > -1 && class29.field360 % 20 < 10) {
                    class259.field4177[var9.field935].method1026(arg1 + class263.field4220 - 12, class23.field288 + -28 + arg0);
                }
            }
        }
        if (!arg6) {
            field328 = true;
        }
        field319++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILwd;Z)V")
    private final void method144(int arg0, class162 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field322 = arg1.method1142(-18970);
            this.field326 = arg1.method1133((byte) 53);
            this.field332 = arg1.method1133((byte) 53);
        }
        if (arg2) {
            this.field322 = -10;
        }
        field321++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field324 = null;
        if (arg0 == 2) {
            field329 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static final void method146(int arg0) {
        if (arg0 >= -78) {
            method148((class251) null, -12, -54);
        }
        class250.field3960 = null;
        class146.field2305 = null;
        class289.field4630 = null;
        class220.field3596 = null;
        field327++;
        class219.field3594 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwd;B)V")
    public final void method147(class162 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                field320++;
                if (arg1 < 82) {
                    field324 = null;
                    return;
                }
                return;
            }
            this.method144(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ldk;II)Lqi;")
    public static final class232 method148(class251 arg0, int arg1, int arg2) {
        if (arg2 <= 35) {
            field328 = false;
        }
        field318++;
        return class187.method1339(arg1, arg0, (byte) 60) ? class177.method1299(-19995) : null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Lrk;")
    public static final class205 method149(byte arg0, int arg1) {
        if (arg0 != 65) {
            field331 = -110;
        }
        class205 var2 = (class205) class84.field1390.method1261(0, (long) arg1);
        field323++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field104.method1680(arg1, 4, arg0 ^ 0xFFFFFFEE);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1430(arg1, (byte) 21, new class162(var3));
        }
        class84.field1390.method1264(arg0 - 66, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(BI)V")
    public static final void method150(byte arg0, int arg1) {
        field325++;
        if (arg0 != -53) {
            method142(-42, 95);
        }
        class175 var2 = class182.method1317(6, arg1, false);
        var2.method1278((byte) 124);
    }
}
