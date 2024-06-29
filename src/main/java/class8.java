import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class8 implements Runnable {

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Lpc;")
    public volatile class111[] field98 = new class111[2];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
    public volatile boolean field97 = false;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Z")
    public volatile boolean field103 = false;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field96 = new int[500];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lhl;")
    public static class139 field93 = new class139(64);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
    public static int[] field102 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lgf;")
    public class26 field100;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method67(int arg0) {
        field102 = null;
        if (arg0 >= -95) {
            method69(-85, 18, -21, 62, 41);
        }
        field93 = null;
        field96 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BS)Z")
    public static final boolean method68(byte arg0, short arg1) {
        field94++;
        if (arg1 == 59 || arg1 == 40 || arg1 == 2 || arg1 == 10 || arg1 == 26 || arg1 == 21 || arg1 == 20 || arg1 == 57) {
            return true;
        }
        if (arg0 != -42) {
            method67(-56);
        }
        if (arg1 == 8 || arg1 == 42 || arg1 == 1006 || arg1 == 1003) {
            return true;
        } else if (arg1 == 13 || arg1 == 6 || arg1 == 35 || arg1 == 36 || arg1 == 50) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 11 || arg1 == 29 || arg1 == 1 || arg1 == 30 || arg1 == 15;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field99++;
        for (class269 var5 = (class269) class249.field3864.method1894((byte) -90); var5 != null; var5 = (class269) class249.field3864.method1886(-74)) {
            class148.method1004(arg1, var5, arg2, arg3, (byte) 122, arg4);
        }
        if (arg0 != 1) {
            return;
        }
        for (class269 var6 = (class269) class256.field3947.method1894((byte) -90); var6 != null; var6 = (class269) class256.field3947.method1886(-28)) {
            class110 var11 = var6.field4208.method165((byte) 81);
            byte var12 = 1;
            if (var6.field4208.field399 == var11.field1651) {
                var12 = 0;
            } else if (var6.field4208.field399 == var11.field1636 || var6.field4208.field399 == var11.field1634 || var6.field4208.field399 == var11.field1642 || var6.field4208.field399 == var11.field1646) {
                var12 = 2;
            } else if (var6.field4208.field399 == var11.field1650 || var6.field4208.field399 == var11.field1658 || var6.field4208.field399 == var11.field1670 || var6.field4208.field399 == var11.field1652) {
                var12 = 3;
            }
            if (var6.field4185 != var12) {
                int var13 = class51.method385(var6.field4208, 122);
                if (var6.field4189 != var13) {
                    if (var6.field4198 != null) {
                        class108.field1581.method908(var6.field4198);
                        var6.field4198 = null;
                    }
                    var6.field4189 = var13;
                }
                var6.field4185 = var12;
            }
            var6.field4197 = var6.field4208.field425;
            var6.field4194 = var6.field4208.field425 + var6.field4208.method168(-83) * 64;
            var6.field4204 = var6.field4208.field455;
            var6.field4182 = var6.field4208.field455 + var6.field4208.method168(-80) * 64;
            class148.method1004(arg1, var6, arg2, arg3, (byte) 122, arg4);
        }
        for (class269 var7 = (class269) class251.field3887.method315((byte) -126); var7 != null; var7 = (class269) class251.field3887.method310(-103)) {
            class110 var8 = var7.field4184.method165((byte) 66);
            byte var9 = 1;
            if (var7.field4184.field399 == var8.field1651) {
                var9 = 0;
            } else if (var7.field4184.field399 == var8.field1636 || var7.field4184.field399 == var8.field1634 || var7.field4184.field399 == var8.field1642 || var7.field4184.field399 == var8.field1646) {
                var9 = 2;
            } else if (var7.field4184.field399 == var8.field1650 || var7.field4184.field399 == var8.field1658 || var7.field4184.field399 == var8.field1670 || var7.field4184.field399 == var8.field1652) {
                var9 = 3;
            }
            if (var7.field4185 != var9) {
                int var10 = class124.method873(var7.field4184, arg0 ^ 0x7FE);
                if (var7.field4189 != var10) {
                    if (var7.field4198 != null) {
                        class108.field1581.method908(var7.field4198);
                        var7.field4198 = null;
                    }
                    var7.field4189 = var10;
                }
                var7.field4185 = var9;
            }
            var7.field4197 = var7.field4184.field425;
            var7.field4194 = var7.field4184.field425 + (var7.field4184.method168(-83) * 64);
            var7.field4204 = var7.field4184.field455;
            var7.field4182 = var7.field4184.field455 + var7.field4184.method168(-108) * 64;
            class148.method1004(arg1, var7, arg2, arg3, (byte) 122, arg4);
        }
    }

    @OriginalMember(owner = "client!cg", name = "run", descriptor = "()V")
    public final void run() {
        field95++;
        this.field103 = true;
        try {
            while (!this.field97) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class111 var2 = this.field98[var1];
                    if (var2 != null) {
                        var2.method810(36);
                    }
                }
                client.method323(10L, -113);
                class107.method779((byte) 68, (Object) null, this.field100);
            }
        } catch (Exception var9) {
            class121.method860((byte) 71, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field103 = false;
        }
    }
}
