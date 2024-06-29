import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class455 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public int field6437 = -1;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public int field6445 = -1;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Z")
    public static boolean field6438 = false;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "[I")
    public static int[] field6444 = new int[13];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
    public int[] field6441;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "[I")
    public static int[] field6446;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILge;)V")
    public final void method2634(int arg0, class551 arg1) {
        field6442++;
        while (true) {
            int var3 = arg1.method3045(-128);
            if (var3 == 0) {
                if (arg0 >= -94) {
                    method2637('V', (byte) 105, null);
                    return;
                } else {
                    return;
                }
            }
            this.method2638(arg1, var3, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static void method2635(boolean arg0) {
        field6446 = null;
        field6444 = null;
        if (!arg0) {
            method2636(6);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static final void method2636(int arg0) {
        field6440++;
        class58 var1 = class60.field834;
        synchronized (class60.field834) {
            class60.field834.method315(arg0);
        }
        class58 var2 = class358.field5001;
        synchronized (class358.field5001) {
            class358.field5001.method315(arg0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2637(char arg0, byte arg1, String arg2) {
        int var3 = -49 / ((arg1 - 1) / 54);
        field6439++;
        int var4 = class95.method529(arg2, arg0, (byte) 97);
        String[] var5 = new String[var4 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var4; var8++) {
            int var9;
            for (var9 = var7; arg0 != arg2.charAt(var9); var9++) {
            }
            var5[var6++] = arg2.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var4] = arg2.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lge;IB)V")
    private final void method2638(class551 arg0, int arg1, byte arg2) {
        if (arg2 != -62) {
            this.field6441 = null;
        }
        field6443++;
        if (arg1 == 1) {
            this.field6445 = arg0.method3090(-97);
        } else if (arg1 == 2) {
            this.field6441 = new int[arg0.method3045(arg2 ^ 0x41)];
            for (int var4 = 0; var4 < this.field6441.length; var4++) {
                this.field6441[var4] = arg0.method3090(-96);
            }
        } else if (arg1 == 3) {
            this.field6437 = arg0.method3045(-125);
            return;
        }
    }
}
