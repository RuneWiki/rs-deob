import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class151 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Llm;")
    public static class150 field2094 = new class150(260);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2095 = new String[200];

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Ltd;")
    public static class225 field2099 = new class225(128);

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[S")
    public static short[] field2101 = new short[500];

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
    public static int[] field2102 = new int[14];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[[[B")
    public static byte[][][] field2097;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2102 = null;
        field2101 = null;
        field2099 = null;
        if (arg0 == 20131) {
            field2095 = null;
            field2094 = null;
            field2097 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BB)[B")
    public static final byte[] method955(byte[] arg0, byte arg1) {
        field2093++;
        if (arg1 != -80) {
            return null;
        }
        class215 var2 = new class215(arg0);
        int var3 = var2.method1374((byte) -60);
        int var4 = var2.method1383((byte) 75);
        if (var4 < 0 || class68.field962 != 0 && var4 > class68.field962) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1355(255, 0, var4, var5);
            return var5;
        } else {
            int var6 = var2.method1383((byte) 98);
            if (var6 < 0 || !(class68.field962 == 0 || var6 <= class68.field962)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class135.method848(var7, var6, arg0, var4, 9);
            } else {
                class47.field681.method117(var2, (byte) -80, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLam;I)V")
    public static final void method956(boolean arg0, class314 arg1, int arg2) {
        field2092++;
        if (!arg0) {
            return;
        }
        class309 var3 = (class309) class274.field4357.method1453(arg0, (long) arg2);
        if (var3 == null) {
            return;
        }
        if (var3.field4979 != null) {
            class116.field1671.method910(var3.field4979);
            var3.field4979 = null;
        }
        var3.method962(128);
    }
}
