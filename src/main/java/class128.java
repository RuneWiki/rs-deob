import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class128 {

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1507 = new String[] { method1121(method1120("\u0019@tm\u000bD")), method1121(method1120("\u0002Ty/")), method1121(method1120("\u0017\u000f;m5")), method1121(method1120("%Oc\"$\u0005E5\u0004\u0012%q5 '\u0001Qg&;\u001fDqc,\rUtb")), method1121(method1120("%Oc\"$\u0005E5\u0004\u0012%q5+-\rEp1i")), method1121(method1120("\u0019@tm\rD")), method1121(method1120("\u0000Hw")), method1121(method1120("\u0019@tm\tD")), method1121(method1120("\u0001@v")), method1121(method1120("BEl/!\u000e")), method1121(method1120("\u0000H{60")), method1121(method1120("BEy/")), method1121(method1120("\u001bH{")), method1121(method1120("BRz")), method1121(method1120("\u0019@tm\nD")), method1121(method1120("\u0019@tm\fD")) };

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lwia;")
    public static class790 field1504 = new class790(21, 7);

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1502;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Ldk;")
    public static final class536 method1114(boolean arg0) {
        try {
            field1506++;
            if (arg0) {
                return null;
            }
            class536 var1 = (class536) class60.field624.method4545((byte) -80);
            if (var1 == null) {
                return new class536();
            } else {
                class309.field4912--;
                return var1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1507[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
    public class128() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        try {
            if (arg0 != 4) {
                field1504 = null;
            }
            field1504 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1507[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BLib;I)V")
    public final void method1116(byte[] arg0, class163 arg1, int arg2) {
        try {
            field1501++;
            if (arg2 > 11) {
                if (arg1.field2209[arg1.field2201] != 31 || arg1.field2209[arg1.field2201 + 1] != -117) {
                    throw new RuntimeException(field1507[4]);
                }
                if (this.field1502 == null) {
                    this.field1502 = new Inflater(true);
                }
                try {
                    this.field1502.setInput(arg1.field2209, arg1.field2201 + 10, -10 - (arg1.field2201 + 8 - arg1.field2209.length));
                    this.field1502.inflate(arg0);
                } catch (Exception var5) {
                    this.field1502.reset();
                    throw new RuntimeException(field1507[3]);
                }
                this.field1502.reset();
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1507[0] + (arg0 == null ? field1507[1] : field1507[2]) + ',' + (arg1 == null ? field1507[1] : field1507[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method1117(boolean arg0, String arg1) {
        try {
            field1503++;
            if (class72.field785.startsWith(field1507[12])) {
                return arg1 + field1507[11];
            } else if (class72.field785.startsWith(field1507[10])) {
                return field1507[6] + arg1 + field1507[13];
            } else if (class72.field785.startsWith(field1507[8])) {
                return field1507[6] + arg1 + field1507[9];
            } else if (arg0) {
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1507[7] + arg0 + ',' + (arg1 == null ? field1507[1] : field1507[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1118(int arg0, byte[] arg1) {
        try {
            field1505++;
            class163 var3 = new class163(arg1);
            var3.field2201 = arg1.length - 4;
            int var4 = -44 % ((arg0 - 26) / 55);
            int var5 = var3.method1408(-34);
            byte[] var6 = new byte[var5];
            var3.field2201 = 0;
            this.method1116(var6, var3, 121);
            return var6;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1507[5] + arg0 + ',' + (arg1 == null ? field1507[1] : field1507[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "()V")
    public static final void method1119() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class108.field1259.length; var1++) {
                if (class108.field1259[var1].method4795()) {
                    class463.field6745[var1] = class108.field1259[var1].method4799();
                } else {
                    synchronized (class108.field1259[var1]) {
                        class108.field1259[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class108.field1259[class108.field1259.length - 1].method4797();
                class639.method4690(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class108.field1259.length - 1; var4++) {
                        if (!class108.field1259[var4].method4795()) {
                            synchronized (class108.field1259[var4]) {
                                class108.field1259[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class108.field1259.length - 2; var6++) {
                            class108.field1259[var6].method4797();
                        }
                        class639.method4690(2);
                        while (!class108.field1259[0].method4795()) {
                            synchronized (class108.field1259[0]) {
                                class108.field1259[0].notify();
                            }
                            try {
                                class151.method1269(false, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class108.field1259[0].method4797();
                        return;
                    }
                    try {
                        class151.method1269(false, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class151.method1269(false, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(III)V")
    private class128(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1120(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1121(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
