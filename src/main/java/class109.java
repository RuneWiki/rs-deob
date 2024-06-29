import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class109 extends class550 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lnj;")
    public static class487 field1379 = new class487("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Z")
    public static boolean field1382 = false;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[I")
    public static int[] field1384 = new int[2];

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IBI)V", line = 5)
    public final void method646(int arg0, byte arg1, int arg2) {
        ++field1377;
        int var4 = this.field1387 * arg0 >> 12;
        int var5 = this.field1386 * arg0 >> 12;
        int var6 = this.field1380 * arg2 >> 12;
        int var7 = this.field1388 * arg2 >> 12;
        class31.method141(var6, var7, super.field8199, var4, (byte) 102, var5);
        int var8 = 26 / ((62 - arg1) / 38);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIII)V", line = 23)
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1380 = arg1;
        this.field1387 = arg0;
        this.field1386 = arg2;
        this.field1388 = arg3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)V", line = 36)
    public final void method647(boolean arg0, int arg1, int arg2) {
        ++field1378;
        int var4 = this.field1387 * arg1 >> 12;
        int var5 = this.field1386 * arg1 >> 12;
        if (!arg0) {
            int var6 = this.field1380 * arg2 >> 12;
            int var7 = this.field1388 * arg2 >> 12;
            class578.method3380(var6, super.field8195, super.field8200, var4, var5, var7, 30313);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V", line = 59)
    public final void method648(int arg0, byte arg1, int arg2) {
        ++field1381;
        int var4 = this.field1387 * arg0 >> 12;
        int var5 = this.field1386 * arg0 >> 12;
        if (arg1 >= -25) {
            this.method647(true, 100, 41);
        }
        int var6 = this.field1380 * arg2 >> 12;
        int var7 = this.field1388 * arg2 >> 12;
        class479.method2906(var4, var5, super.field8199, super.field8200, true, var6, var7, super.field8195);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 82)
    public static final void method649(int arg0, int arg1) {
        class322.field4782 = 2;
        if (arg1 != 35) {
            method649(46, 106);
        }
        ++field1385;
        class621.field9066 = arg0;
        long var2 = 0L;
        if (class36.field420 == null) {
            class313.method1932(35, false);
        } else {
            class428 var4 = new class428(class483.method2929(138, class288.method1790(false, class36.field420)));
            long var5 = var4.method2609((byte) -103);
            class565.field8372 = var4.method2609((byte) -103);
            class18.method87(arg1 ^ 30214, true, class368.method2245(var5, 20296), "");
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 114)
    public static void method650(int arg0) {
        if (arg0 != 2) {
            field1379 = null;
        }
        field1384 = null;
        field1379 = null;
    }
}
