import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class109 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1411 = -2;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1419 = "Loaded interfaces";

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1422 = new String[100];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lib;")
    public static class98 field1416;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1412;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public static int[] field1420;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 5)
    public static final void method773(int arg0) {
        if (arg0 != -22773) {
            field1419 = (String) null;
        }
        class291.field4231.method2262(false);
        field1417++;
        class345.field5360.method2262(false);
        class224.field3231.method2262(false);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 17)
    public class109() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V", line = 35)
    public static final void method774(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1414++;
        if (arg1) {
            field1422 = (String[]) null;
        }
        if (arg2 >= arg0) {
            class96.method697((byte) 115, class331.field4902[arg4], arg3, arg0, arg2);
        } else {
            class96.method697((byte) 115, class331.field4902[arg4], arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 54)
    public static final void method775(byte arg0) {
        if (arg0 != -12) {
            field1419 = (String) null;
        }
        field1413++;
        for (class59 var1 = (class59) class254.field3705.method413(1253231568); var1 != null; var1 = (class59) class254.field3705.method419(arg0 + 112)) {
            class348 var2 = var1.field750;
            if (class56.field724 != var2.field5432 || class313.field4603 > var2.field5417) {
                var1.method179((byte) 51);
            } else if (var2.field5437 <= class313.field4603) {
                if (var2.field5426 > 0) {
                    class169 var3 = class251.field3688[var2.field5426 - 1];
                    if (var3 != null && var3.field4855 >= 0 && var3.field4855 < 13312 && var3.field4893 >= 0 && var3.field4893 < 13312) {
                        var2.method2416(-108, class271.method1847(var3.field4893, true, var3.field4855, var2.field5432) - var2.field5442, var3.field4855, class313.field4603, var3.field4893);
                    }
                }
                if (var2.field5426 < 0) {
                    int var4 = -var2.field5426 - 1;
                    class239 var5;
                    if (class103.field1333 == var4) {
                        var5 = class359.field5616;
                    } else {
                        var5 = class311.field4574[var4];
                    }
                    if (var5 != null && var5.field4855 >= 0 && var5.field4855 < 13312 && var5.field4893 >= 0 && var5.field4893 < 13312) {
                        var2.method2416(-60, class271.method1847(var5.field4893, true, var5.field4855, var2.field5432) - var2.field5442, var5.field4855, class313.field4603, var5.field4893);
                    }
                }
                var2.method2414(class186.field2551, 1);
                class192.method1392(class56.field724, (int) var2.field5449, (int) var2.field5454, (int) var2.field5435, 60, var2, var2.field5443, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V", line = 109)
    public static void method776(byte arg0) {
        field1420 = null;
        field1422 = null;
        if (arg0 >= 81) {
            field1416 = null;
            field1419 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILoj;)V", line = 122)
    public static final void method777(int arg0, class209 arg1) {
        if (arg0 >= -71) {
            method777(-17, (class209) null);
        }
        class279.field3976 = arg1;
        field1418++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lfd;B[B)V", line = 138)
    public final void method778(class299 arg0, byte arg1, byte[] arg2) {
        field1415++;
        if (arg0.field4350[arg0.field4351] != 31 || arg0.field4350[arg0.field4351 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1412 == null) {
            this.field1412 = new Inflater(true);
        }
        try {
            this.field1412.setInput(arg0.field4350, arg0.field4351 + 10, arg0.field4350.length - (arg0.field4351 + 18));
            this.field1412.inflate(arg2);
        } catch (Exception var6) {
            this.field1412.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1412.reset();
        int var5 = 36 % ((arg1 - 3) / 40);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V", line = 169)
    private class109(int arg0, int arg1, int arg2) {
    }
}
