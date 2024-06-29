import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class279 extends class259 {

    @OriginalMember(owner = "client!md", name = "P", descriptor = "[[I")
    public static int[][] field4400 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Ljava/lang/String;")
    public String field4399;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[[B")
    public static byte[][] field4392;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 8)
    public final void method1989(int arg0) {
        this.field4086 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1990((byte) 38)) {
            class351.field5591.method2395(16218, this);
        }
        field4393++;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)J", line = 19)
    public final long method1990(byte arg0) {
        field4390++;
        if (arg0 != 38) {
            method1994(true);
        }
        return Long.MAX_VALUE & this.field4086;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I", line = 31)
    public final int method1991(int arg0) {
        field4386++;
        if (arg0 != 24450) {
            this.method1996(true);
        }
        return (int) this.field2834;
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V", line = 44)
    public static final void method1992(int arg0) {
        field4389++;
        if (class203.field3088 != null || class147.field2341 != null || class361.field5711 > 0) {
            return;
        }
        int var1 = class251.field3982;
        if (class38.field437) {
            if (var1 != 1) {
                int var7 = class197.field3009;
                int var8 = class128.field1873;
                if ((class357.field5669 - 10) > var7 || class357.field5669 + class257.field4073 + 10 < var7 || var8 < class151.field2399 - 10 || class151.field2399 + class251.field3977 + 10 < var8) {
                    class38.field437 = false;
                    class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
                }
            }
            if (var1 == 1) {
                int var9 = class357.field5669;
                int var10 = class151.field2399;
                int var11 = class257.field4073;
                int var12 = class301.field4694;
                int var13 = class19.field223;
                int var14 = -1;
                for (int var15 = 0; var15 < class74.field924; var15++) {
                    if (class161.field2481) {
                        int var17 = (class74.field924 - var15 - 1) * 15 + var10 + 33;
                        if (var9 < var12 && (var9 + var11) > var12 && var17 - 13 < var13 && var13 < (var17 + 3)) {
                            var14 = var15;
                        }
                    } else {
                        int var16 = (class74.field924 - var15 - 1) * 15 + (var10 + 31);
                        if (var12 > var9 && var9 + var11 > var12 && var13 > (var16 - 13) && var16 + 3 > var13) {
                            var14 = var15;
                        }
                    }
                }
                if (var14 != -1) {
                    class207.method1448(var14, -105);
                }
                class38.field437 = false;
                class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
            }
        } else {
            if (var1 == 1 && class74.field924 > 0) {
                short var2 = class105.field1442[class74.field924 - 1];
                if (var2 == 26 || var2 == 12 || var2 == 38 || var2 == 23 || var2 == 47 || var2 == 35 || var2 == 34 || var2 == 31 || var2 == 51 || var2 == 16 || var2 == 50 || var2 == 1001) {
                    int var3 = class296.field4669[class74.field924 - 1];
                    int var4 = class125.field1771[class74.field924 - 1];
                    class323 var5 = class45.method277(-12866, var4);
                    class76 var6 = client.method2013(var5);
                    if (var6.method489((byte) 108) || var6.method487(0)) {
                        class65.field774 = 0;
                        class255.field4042 = false;
                        if (class203.field3088 != null) {
                            class107.method693(class203.field3088, 6);
                        }
                        class203.field3088 = class45.method277(-12866, var4);
                        class110.field1517 = class301.field4694;
                        class78.field1028 = var3;
                        class6.field75 = class19.field223;
                        class107.method693(class203.field3088, 6);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class52.field602 == 1 && class74.field924 > 2 || class89.method562(14, class74.field924 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class74.field924 > 0 || class302.field4708 == 1) {
                class92.method573(-1);
            }
            if (var1 == 1 && class74.field924 > 0 || class302.field4708 == 2) {
                class65.method393(90);
            }
        }
        if (arg0 != 23339) {
            method1994(false);
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V", line = 197)
    public static void method1993(int arg0) {
        field4392 = (byte[][]) null;
        if (arg0 > -100) {
            method1993(-35);
        }
        field4400 = (int[][]) null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 209)
    public static final void method1994(boolean arg0) {
        field4398++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class357.field5667 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        if (!arg0) {
            field4387 = -52;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)I", line = 241)
    public final int method1995(byte arg0) {
        field4391++;
        if (arg0 > -121) {
            this.method1996(false);
        }
        return (int) (this.field2834 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V", line = 252)
    public final void method1996(boolean arg0) {
        this.field4086 = Long.MIN_VALUE & this.field4086 | class9.method57(-14133) + 500L;
        class52.field609.method2395(16218, this);
        if (arg0) {
            field4395++;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V", line = 262)
    public class279(int arg0, int arg1) {
        this.field2834 = (long) arg0 << 32 | (long) arg1;
    }
}
