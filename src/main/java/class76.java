import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lgb;")
    private class45 field1937 = new class45();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lkd;")
    public static class73 field1930 = class126.method1070((byte) -66, "blinken1:");

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lkd;")
    public static class73 field1934 = class126.method1070((byte) -66, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lkd;")
    public static class73 field1935 = class126.method1070((byte) -66, "mapscene");

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    public static int[] field1946 = new int[500];

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lkd;")
    public static class73 field1943 = class126.method1070((byte) -66, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lie;")
    public static class61 field1944 = new class61();

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[Lkd;")
    public static class73[] field1952 = new class73[100];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
    public static boolean field1951 = true;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lkd;")
    public static class73 field1956 = class126.method1070((byte) -66, "backhmid2");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lkd;")
    public static class73 field1949 = class126.method1070((byte) -66, "<col=ffff00>*V");

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lkd;")
    private static class73 field1959 = class126.method1070((byte) -66, " is already on your friend list");

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lkd;")
    public static class73 field1957 = field1959;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lkd;")
    private static class73 field1948 = class126.method1070((byte) -66, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lkd;")
    public static class73 field1960 = field1948;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lkd;")
    public static class73 field1958 = field1948;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lpb;")
    public static class106 field1954;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lq;")
    public static class111 field1941;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lq;")
    public static class111 field1950;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[Lde;")
    public static class27[] field1955;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lgb;B)V")
    public final void method655(class45 arg0, byte arg1) {
        if (arg1 != 86) {
            field1948 = null;
        }
        if (arg0.field1181 != null) {
            arg0.method339(85);
        }
        arg0.field1181 = this.field1937;
        arg0.field1183 = this.field1937.field1183;
        arg0.field1181.field1183 = arg0;
        arg0.field1183.field1181 = arg0;
        field1932++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method656(int arg0) {
        field1947++;
        if (arg0 < class118.field3017) {
            class26.method207(-118);
        } else {
            class45.method337(40, (byte) -125);
            class105.field2622 = class31.field862;
            class31.field862 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lgb;")
    public final class45 method657(byte arg0) {
        field1931++;
        class45 var2 = this.field1937.field1183;
        if (this.field1937 == var2) {
            return null;
        } else {
            if (arg0 <= 69) {
                field1960 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field1957 = null;
        field1952 = null;
        field1955 = null;
        field1958 = null;
        field1950 = null;
        field1941 = null;
        field1944 = null;
        field1943 = null;
        int var1 = -112 / ((arg0 - 18) / 39);
        field1934 = null;
        field1954 = null;
        field1959 = null;
        field1960 = null;
        field1948 = null;
        field1935 = null;
        field1956 = null;
        field1930 = null;
        field1949 = null;
        field1946 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lgb;I)V")
    public final void method659(class45 arg0, int arg1) {
        if (arg0.field1181 != null) {
            arg0.method339(99);
        }
        arg0.field1181 = this.field1937.field1181;
        if (arg1 == 4) {
            field1938++;
            arg0.field1183 = this.field1937;
            arg0.field1181.field1183 = arg0;
            arg0.field1183.field1181 = arg0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lec;")
    public static final class32 method660(int arg0, int arg1) {
        field1933++;
        class32 var2 = (class32) class145.field3582.method538(arg0 + 10861, (long) arg1);
        if (arg0 != -10861) {
            method660(-65, 33);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field3754.method898((byte) -90, arg1, 5);
        class32 var4 = new class32();
        if (var3 != null) {
            var4.method256(new class114(var3), (byte) 103);
        }
        class145.field3582.method542(var4, -901, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lgb;")
    public final class45 method661(int arg0) {
        class45 var2 = this.field1937.field1183;
        field1945++;
        if (this.field1937 == var2) {
            return null;
        } else {
            var2.method339(96);
            int var3 = 7 % ((-arg0 - 9) / 62);
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;Lkd;ILkd;)Lpb;")
    public static final class106 method662(class111 arg0, class73 arg1, int arg2, class73 arg3) {
        field1936++;
        int var4 = arg0.method905(arg3, (byte) -72);
        int var5 = arg0.method902(arg2 ^ arg2, var4, arg1);
        return class153.method1223(arg0, (byte) 114, var5, var4);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class76() {
        this.field1937.field1183 = this.field1937;
        this.field1937.field1181 = this.field1937;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public static final void method663(int arg0) {
        field1940++;
        if (class80.field2025 == 0 || arg0 != -22982) {
            return;
        }
        int var1 = 0;
        if (class53.field1424 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (field1952[var2] != null) {
                int var3 = class110.field2702[var2];
                class73 var4 = class18.field530[var2];
                if (var4 != null && var4.method642(113, class131.field3284)) {
                    var4 = var4.method638(5, arg0 + 22920);
                }
                if (var4 != null && var4.method642(117, class42.field1122)) {
                    var4 = var4.method638(5, arg0 + 22866);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class25.field711 == 0 || class25.field711 == 1 && class115.method978(126, var4))) {
                    int var5 = 329 - var1 * 13;
                    if (class31.field869 > 4 && var5 - 10 < class3.field161 - 4 && class3.field161 - 4 <= var5 + 3) {
                        int var6 = class109.field2688.method357(class32.method258(-107, new class73[] { class133.field3357, class50.field1357, var4, field1952[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class31.field869 < var6 + 4) {
                            if (class64.field1691 >= 1) {
                                class80.method684(class32.method258(-124, new class73[] { client.field615, var4 }), false, 2008, class77.field1963, 0, 0, 0);
                                class64.field1677++;
                            }
                            class153.field3763++;
                            class45.field1190++;
                            class80.method684(class32.method258(-101, new class73[] { client.field615, var4 }), false, 2053, class18.field527, 0, 0, 0);
                            class80.method684(class32.method258(-58, new class73[] { client.field615, var4 }), false, 2049, class123.field3145, 0, 0, 0);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class25.field711 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }
}
