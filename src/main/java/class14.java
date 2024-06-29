import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class14 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "[I")
    public static int[] field219 = new int[13];

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lfc;")
    public static class235 field218 = new class235(74, 0);

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field222;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;ZI)Z", line = 5)
    public static final boolean method64(int arg0, String arg1, boolean arg2, int arg3) {
        if (arg3 > -111) {
            return false;
        }
        field220++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILjava/io/File;)[B", line = 89)
    public static final byte[] method67(int arg0, int arg1, File arg2) {
        field221++;
        if (arg1 != 87) {
            return null;
        }
        try {
            byte[] var3 = new byte[arg0];
            class231.method1462(0, arg2, var3, arg0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z", line = 107)
    public final boolean method68(boolean arg0) {
        if (!arg0) {
            field218 = null;
        }
        field223++;
        return this.method65((byte) 87) || this.method63((byte) -89) || this.method71(107);
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 118)
    public static void method69(byte arg0) {
        field219 = null;
        field222 = null;
        int var1 = 32 % ((arg0 - 62) / 53);
        field218 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public abstract void method62(int arg0);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Z")
    public abstract boolean method63(byte arg0);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)Z")
    public abstract boolean method65(byte arg0);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)I")
    public abstract int method66(int arg0);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)I")
    public abstract int method70(byte arg0);

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)Z")
    public abstract boolean method71(int arg0);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)Lqea;")
    public abstract class113 method72(int arg0);

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)V")
    public abstract void method73(byte arg0);
}
