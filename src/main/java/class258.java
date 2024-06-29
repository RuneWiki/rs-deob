import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class258 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[Lv;")
    public static class80[] field4079 = new class80[14];

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4081 = 0;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field4087 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lim;B)V", line = 11)
    public static final void method1825(class192 arg0, byte arg1) {
        label88: while (true) {
            if (arg0.field3129 < arg0.field3128.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1399(-1172389784) == 1) {
                    var3 = arg0.method1399(-1172389784);
                    var4 = arg0.method1399(arg1 - 1172389876);
                    var2 = true;
                }
                int var5 = arg0.method1399(arg1 - 1172389876);
                int var6 = arg0.method1399(-1172389784);
                int var7 = var5 * 64 - class287.field4528;
                int var8 = -(var6 * 64) - (1 - class161.field2636 - class331.field5158);
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class240.field3815 && var8 < class331.field5158) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label88;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1377(true);
                                if (var13 != 0) {
                                    if (class16.field210[var9][var10] == null) {
                                        class16.field210[var9][var10] = new byte[4096];
                                    }
                                    class16.field210[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1377(true);
                                    if (class325.field5074[var9][var10] == null) {
                                        class325.field5074[var9][var10] = new byte[4096];
                                    }
                                    class325.field5074[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var15 = 0;
                while (true) {
                    if (var15 >= (var2 ? 64 : 4096)) {
                        continue label88;
                    }
                    byte var16 = arg0.method1377(true);
                    if (var16 != 0) {
                        arg0.field3129++;
                    }
                    var15++;
                }
            }
            if (arg1 != 92) {
                method1828(':', (String) null, (byte) 77);
            }
            field4085++;
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 116)
    public static void method1826(int arg0) {
        field4079 = null;
        if (arg0 != 64) {
            field4081 = -52;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 127)
    public static final void method1827(byte arg0) {
        class22.field329.method1615(41);
        if (arg0 < 17) {
            field4079 = (class80[]) null;
        }
        field4078++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(CLjava/lang/String;B)I", line = 144)
    public static final int method1828(char arg0, String arg1, byte arg2) {
        field4083++;
        int var3 = arg1.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var4++;
            }
        }
        if (arg2 > -3) {
            field4087 = -17;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 172)
    public static final void method1829(int arg0, int arg1, int arg2) {
        field4082++;
        class341 var3 = class234.method1680(arg1, arg0 + 1);
        int var4 = var3.field5318;
        int var5 = var3.field5306;
        int var6 = class86.field1308[var4 - var5];
        int var7 = var3.field5308;
        if (arg0 < ~arg2 || var6 < arg2) {
            arg2 = 0;
        }
        int var8 = var6 << var5;
        class74.method473(0, var7, var8 & arg2 << var5 | class17.field235[var7] & ~var8);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 196)
    public static final void method1830(boolean arg0) {
        field4080++;
        if (arg0) {
            method1827((byte) -108);
        }
        class276.field4371.method1615(79);
        class338.field5249.method1615(34);
        class218.field3503.method1615(33);
    }
}
