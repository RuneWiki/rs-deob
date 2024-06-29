import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends RuntimeException {

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Ljava/lang/String;")
    public String field25;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Ljava/lang/Throwable;")
    public Throwable field21;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lmc;")
    public static class75 field1 = class30.method234(true, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lmc;")
    private static class75 field11 = class30.method234(true, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lmc;")
    public static class75 field8 = field11;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lmc;")
    private static class75 field5 = class30.method234(true, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lmc;")
    public static class75 field6 = class30.method234(true, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lmc;")
    private static class75 field10 = class30.method234(true, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lmc;")
    public static class75 field17 = field10;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lmc;")
    public static class75 field4 = field11;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lmc;")
    private static class75 field22 = class30.method234(true, "Remove");

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lmc;")
    public static class75 field23 = field5;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lmc;")
    private static class75 field9 = class30.method234(true, "Off");

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lmc;")
    public static class75 field15 = field22;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lmc;")
    public static class75 field24 = class30.method234(true, "Fehler beim Laden Ihres Charakter)2Profils");

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lmc;")
    public static class75 field20 = field9;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lmc;")
    public static class75 field13 = field11;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lmc;")
    public static class75 field29 = class30.method234(true, "Empf-=nger:");

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    public static int[] field28 = new int[500];

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lja;")
    public static class55 field3;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBI[B)V", line = 11)
    public static final void method1(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        field7++;
        if (class37.field887 == null) {
            return;
        }
        if (class91.field2233 >= 0) {
            class37.field887.method141((byte) 105);
            class31.field697 = 0;
            class91.field2233 = -1;
            class55.field1390 = null;
            class74.field1848 = 20;
        }
        if (arg3 != null) {
            if (class74.field1848 > 0) {
                class37.field887.method140(arg2, (byte) 104);
                class74.field1848 = 0;
            }
            class91.field2233 = arg2;
            class37.field887.method137(13701, arg3, arg2, arg0);
        }
        if (arg1 > -54) {
            method2(-35);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 74)
    public static void method2(int arg0) {
        field13 = null;
        field8 = null;
        field4 = null;
        field6 = null;
        field1 = null;
        field24 = null;
        field5 = null;
        field22 = null;
        field23 = null;
        field28 = null;
        field15 = null;
        field17 = null;
        field29 = null;
        if (arg0 != 17315) {
            return;
        }
        field11 = null;
        field10 = null;
        field3 = null;
        field20 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 126)
    public static final void method3(int arg0, int arg1, int arg2, int arg3) {
        field19++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class101.field2599 = -1;
            class56.field1423 = -1;
            return;
        }
        int var4 = class126.method1000(arg1, class99.field2510, false, arg0) - arg3;
        int var5 = class93.field2345[class111.field2809];
        int var6 = class93.field2354[class37.field889];
        int var7 = class93.field2345[class37.field889];
        int var8 = var4 - class12.field235;
        int var9 = arg1 - class44.field1057;
        int var10 = arg0 - class84.field2082;
        if (arg2 != 27299) {
            field10 = null;
        }
        int var11 = class93.field2354[class111.field2809];
        int var12 = var5 * var9 + var10 * var11 >> 16;
        int var13 = var9 * var11 - var5 * var10 >> 16;
        int var15 = var6 * var8 - var7 * var13 >> 16;
        int var16 = var6 * var13 + var7 * var8 >> 16;
        if (var16 >= 50) {
            class56.field1423 = (var12 << 9) / var16 + 256;
            class101.field2599 = (var15 << 9) / var16 + 167;
        } else {
            class101.field2599 = -1;
            class56.field1423 = -1;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 175)
    public static final void method4(int arg0) {
        if (arg0 > -107) {
            method1(true, (byte) 103, 52, null);
        }
        field26++;
        for (int var1 = -1; var1 < class34.field783; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class84.field2081[var1];
            }
            class122 var3 = class40.field957[var2];
            if (var3 != null) {
                class15.method97(1, (byte) -107, var3);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 232)
    public class1(Throwable arg0, String arg1) {
        this.field25 = arg1;
        this.field21 = arg0;
    }
}
