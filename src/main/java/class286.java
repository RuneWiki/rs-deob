import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class286 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[F")
    public static float[] field3994 = new float[2];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[Z")
    public static boolean[] field3995 = new boolean[100];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Ltca;")
    public static class174 field3996;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3991;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)[B", line = 4)
    public final byte[] method1870(int arg0, byte[] arg1) {
        field3993++;
        class215 var3 = new class215(arg1);
        var3.field3109 = arg1.length - 4;
        int var4 = var3.method1507(-86);
        var3.field3109 = 0;
        if (arg0 != 9) {
            field3994 = null;
        }
        byte[] var5 = new byte[var4];
        this.method1874(var5, 29123, var3);
        return var5;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1871(byte arg0) {
        if (arg0 != 3) {
            method1873(-39, null);
        }
        field3997++;
        if (class214.field3036 == 9) {
            class215.method1527(2, 5);
        } else if (class214.field3036 == 5 || class214.field3036 == 6) {
            class215.method1527(2, 3);
            return;
        } else if (class214.field3036 == 12) {
            class215.method1527(2, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 52)
    public static void method1872(byte arg0) {
        if (arg0 != -97) {
            field3994 = null;
        }
        field3996 = null;
        field3995 = null;
        field3994 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[[[Les;)V", line = 72)
    public static final void method1873(int arg0, class384[][][] arg1) {
        field3989++;
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class384[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class384 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5573 instanceof class258) {
                            ((class258) var6.field5573).method582(-12031);
                        }
                        if (var6.field5566 instanceof class258) {
                            ((class258) var6.field5566).method582(-12031);
                        }
                        if (var6.field5578 instanceof class258) {
                            ((class258) var6.field5578).method582(-12031);
                        }
                        if (var6.field5577 instanceof class258) {
                            ((class258) var6.field5577).method582(-12031);
                        }
                        if (var6.field5574 instanceof class258) {
                            ((class258) var6.field5574).method582(-12031);
                        }
                        for (class474 var7 = var6.field5567; var7 != null; var7 = var7.field6621) {
                            class494 var8 = var7.field6623;
                            if (var8 instanceof class258) {
                                ((class258) var8).method582(arg0 ^ 0xFFFFD101);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 145)
    public class286() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BILcea;)V", line = 151)
    public final void method1874(byte[] arg0, int arg1, class215 arg2) {
        if (arg1 != 29123) {
            method1873(-91, null);
        }
        field3992++;
        if (arg2.field3066[arg2.field3109] != 31 || arg2.field3066[arg2.field3109 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3991 == null) {
            this.field3991 = new Inflater(true);
        }
        try {
            this.field3991.setInput(arg2.field3066, arg2.field3109 + 10, -8 - (arg2.field3109 + 10 - arg2.field3066.length));
            this.field3991.inflate(arg0);
        } catch (Exception var4) {
            this.field3991.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3991.reset();
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V", line = 182)
    private class286(int arg0, int arg1, int arg2) {
    }
}
