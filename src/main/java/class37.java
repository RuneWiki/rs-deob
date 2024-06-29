import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class37 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lkm;")
    public static class133 field422;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lrk;")
    public static class277 field426;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[[B")
    public static byte[][] field425;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLcg;)Luf;", line = 5)
    public static final class174 method208(byte arg0, class316 arg1) {
        int var2 = -41 % ((39 - arg0) / 62);
        field424++;
        return new class174(arg1.method2161(28984), arg1.method2161(28984), arg1.method2161(28984), arg1.method2161(28984), arg1.method2210((byte) -5), arg1.method2219(16448));
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 18)
    public static final void method209(int arg0) {
        field423++;
        if (class39.field442 != null) {
            class39.field442.method1577((byte) -105);
            class39.field442 = null;
        }
        class173.method1212((byte) -110);
        class61.method411();
        for (int var1 = 0; var1 < 4; var1++) {
            class312.field4714[var1].method532((byte) -111);
        }
        class176.method1219(-28376, false);
        System.gc();
        class256.method1745(2058, 2);
        class231.field3272 = -1;
        class31.field384 = false;
        class73.method547(true, (byte) 4);
        class237.field3368 = 0;
        class132.field1809 = 0;
        class45.field552 = false;
        class320.field4877 = 0;
        class296.field4394 = 0;
        if (arg0 > -99) {
            return;
        }
        for (int var2 = 0; var2 < class294.field4367.length; var2++) {
            class294.field4367[var2] = null;
        }
        class292.field4352 = 0;
        class338.field5084 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class169.field2306[var3] = null;
            class74.field1023[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class42.field484[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class246.field3544[var5][var6][var7] = null;
                }
            }
        }
        class151.method1094((byte) -35);
        class54.field735 = 0;
        class73.method542((byte) -128);
        class257.method1764(true, -14413);
        try {
            class325.method2277(-21230, class165.field2258.field1157, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 114)
    public static void method210(byte arg0) {
        field422 = null;
        field425 = (byte[][]) null;
        int var1 = -106 / ((arg0 + 34) / 45);
        field426 = null;
    }
}
