import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class74 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Z")
    public static boolean field1290 = true;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
    public static int[] field1295 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[S")
    public static short[] field1294 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1291 = 0;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Loh;")
    public static class258 field1296 = class153.method1046("Stufe: ", 115);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[Z")
    public static boolean[] field1292 = new boolean[100];

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[Lkl;")
    public static class65[] field1298;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZII)V", line = 13)
    public static final void method546(boolean arg0, int arg1, int arg2) {
        field1297++;
        if (arg0) {
            field1294 = (short[]) null;
        }
        class140 var3 = class215.method1464(arg2, 8215);
        int var4 = var3.field2388;
        int var5 = var3.field2381;
        int var6 = var3.field2384;
        int var7 = class144.field2421[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class232.method1553(arg1 << var5 & var8 | class227.field3917[var4] & ~var8, 16711680, var4);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 50)
    public static void method547(int arg0) {
        field1292 = null;
        if (arg0 != 0) {
            method547(4);
        }
        field1298 = null;
        field1294 = null;
        field1296 = null;
        field1295 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)[B")
    public abstract byte[] method545(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BB)V")
    public abstract void method548(byte[] arg0, byte arg1);
}
