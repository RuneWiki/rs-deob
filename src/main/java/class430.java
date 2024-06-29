import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class430 extends class45 {

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field6311;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Z")
    public boolean field6323;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field6318;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field6321 = 0;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lqn;")
    public static class196 field6324 = class124.method790(-28861);

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "[C")
    public static char[] field6328 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field6329 = 0;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[Lcq;")
    public static class67[] field6330;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method2720(int arg0, byte arg1) {
        field6316++;
        int var2 = 7 / ((arg1 + 2) / 49);
        class189 var3 = class125.field1762;
        synchronized (class125.field1762) {
            class125.field1762.method1141(256);
            class125.field1762 = new class189(arg0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 26)
    public static final Object method2721(boolean arg0, int arg1, byte[] arg2) {
        field6319++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > arg1 && !class352.field5100) {
            try {
                class377 var3 = (class377) Class.forName("ek").getDeclaredConstructor().newInstance();
                var3.method1821(arg1 - 136, arg2);
                return var3;
            } catch (Throwable var4) {
                class352.field5100 = true;
            }
        }
        return arg0 ? class93.method653(arg2, 0) : arg2;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2722(byte arg0) {
        class225.field2964 = 0;
        field6317++;
        class51.field684 = 0;
        class347.method2287(21627);
        class182.method1108(-4);
        class165.method1019(4);
        class300.method2052((byte) 61);
        for (int var1 = 0; var1 < class51.field684; var1++) {
            int var3 = class227.field2979[var1];
            if (class28.field418 != class206.field2777[var3].field4342) {
                if (class206.field2777[var3].field351 > 0) {
                    class338.method2216((byte) 104, class206.field2777[var3]);
                }
                class206.field2777[var3] = null;
            }
        }
        if (class300.field4398 != class156.field2120.field3029) {
            throw new RuntimeException("gpp1 pos:" + class156.field2120.field3029 + " psize:" + class300.field4398);
        }
        for (int var2 = 0; var2 < class65.field861; var2++) {
            if (class206.field2777[class229.field3071[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class65.field861);
            }
        }
        if (arg0 != -65) {
            field6321 = -60;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 115)
    public static void method2723(int arg0) {
        if (arg0 >= 58) {
            field6328 = null;
            field6330 = null;
            field6324 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIBII)V", line = 128)
    public static final void method2724(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class90.field1276 = arg0;
        field6314++;
        if (arg4 < 26) {
            field6321 = -95;
        }
        class338.field4873 = arg3;
        class411.field6071 = arg6;
        class115.field1605 = arg2;
        class374.field5446 = arg5;
        if (arg1 && class338.field4873 >= 100) {
            class179.field2371 = class115.field1605 * 128 + 64;
            class400.field5971 = class411.field6071 * 128 + 64;
            class201.field2667 = class52.method359((byte) -116, class179.field2371, class400.field5971, class227.field2981) - class374.field5446;
        }
        class346.field4979 = 2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 153)
    public static final String method2725(String arg0, byte arg1) {
        field6325++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (arg1 >= -31) {
            field6313 = 36;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILlm;)V", line = 202)
    public static final void method2726(int arg0, class347 arg1) {
        field6327++;
        class448.field6567 = arg1;
        if (arg0 != 31124) {
            method2723(52);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BB)[B", line = 226)
    public static final byte[] method2727(byte[] arg0, byte arg1) {
        field6315++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 >= -50) {
            field6322 = 43;
        }
        byte[] var2 = new byte[arg0.length];
        class60.method421(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIZ)V", line = 242)
    public class430(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6312 = arg0;
        this.field6311 = arg2;
        this.field6320 = arg3;
        this.field6326 = arg1;
        this.field6323 = arg5;
        this.field6318 = arg4;
    }
}
