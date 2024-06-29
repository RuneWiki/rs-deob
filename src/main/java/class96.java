import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class96 implements Runnable {

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "[Lhv;")
    public volatile class359[] field1335 = new class359[2];

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
    public volatile boolean field1329 = false;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
    public volatile boolean field1333 = false;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Luf;")
    public static class310 field1330 = new class310(60, 0);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lkj;")
    public class397 field1331;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)Z", line = 6)
    public static final boolean method651(byte arg0, boolean arg1) {
        field1332++;
        if (arg0 != 116) {
            field1330 = null;
        }
        boolean var2 = class418.field6109.method474();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class418.field6109.method508();
        } else if (!class418.field6109.method487()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class437.field6374.field4278 = arg1;
            class437.field6374.method557(class282.field3804, (byte) -80);
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 52)
    public static void method652(byte arg0) {
        field1330 = null;
        if (arg0 != -83) {
            method654(null, (char) 65508, true);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILlh;)V", line = 66)
    public static final void method653(int arg0, class365 arg1) {
        field1328++;
        byte[] var2 = new byte[24];
        if (class31.field454 != null) {
            try {
                class31.field454.method1650((byte) 83, 0L);
                class31.field454.method1644((byte) -96, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2079(24, var2, 86, arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;", line = 109)
    public static final String[] method654(String arg0, char arg1, boolean arg2) {
        field1336++;
        int var3 = class311.method1764(arg0, arg1, 0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg2) {
            field1330 = null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "run", descriptor = "()V", line = 145)
    public final void run() {
        field1334++;
        this.field1333 = true;
        try {
            while (!this.field1329) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class359 var2 = this.field1335[var1];
                    if (var2 != null) {
                        var2.method1986(true);
                    }
                }
                class496.method2931((byte) 127, 10L);
                class325.method1822(null, this.field1331, 50);
            }
        } catch (Exception var9) {
            class162.method1000((byte) 19, var9, null);
        } finally {
            Object var6 = null;
            this.field1333 = false;
        }
    }
}
