import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class49 extends class167 {

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public int field876 = 0;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public int field880 = 0;

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "Z")
    public boolean field892 = true;

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "I")
    public int field895 = 12800;

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "I")
    public int field893 = 12800;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "I")
    public int field896 = -1;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Le;")
    public class191 field883;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "Le;")
    public class191 field878;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "Lef;")
    public class175 field872;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "[I")
    public static int[] field875 = new int[1000];

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "Le;")
    private static class191 field874 = class54.method368("Loaded update list", 2047);

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[[I")
    public static int[][] field871 = new int[104][104];

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Z")
    public static boolean field867 = false;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "Le;")
    public static class191 field890 = class54.method368("Standort", 2047);

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "Le;")
    public static class191 field889 = field874;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "Le;")
    public static class191 field885 = class54.method368("scape main", 2047);

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "Le;")
    public static class191 field888 = class54.method368(")3runescape)3com", 2047);

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Le;")
    public static class191 field879 = class54.method368("Fallen lassen", 2047);

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Lqk;")
    public static class6 field869;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "Z")
    public static boolean field884;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method327(byte arg0) {
        field879 = null;
        field871 = null;
        field888 = null;
        field890 = null;
        field869 = null;
        field875 = null;
        field889 = null;
        if (arg0 == -23) {
            field885 = null;
            field874 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILw;Lw;)V")
    public static final void method328(int arg0, class104 arg1, class104 arg2) {
        field881++;
        if (arg2.field1724 != null) {
            arg2.method655(63);
        }
        arg2.field1724 = arg1.field1724;
        arg2.field1711 = arg1;
        arg2.field1724.field1711 = arg2;
        arg2.field1711.field1724 = arg2;
        if (arg0 != 12800) {
            method327((byte) 77);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIZ)Z")
    public final boolean method329(int arg0, int arg1, boolean arg2) {
        field877++;
        if (arg0 < this.field895 || arg0 > this.field876 || this.field893 > arg1 || arg1 > this.field880) {
            return false;
        }
        if (arg2) {
            this.method331(41);
        }
        for (class217 var4 = (class217) this.field872.method1173(115); var4 != null; var4 = (class217) this.field872.method1175(-1)) {
            if (var4.method1477(arg1, (byte) -92, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLeg;Le;)Le;")
    public static final class191 method330(byte arg0, class33 arg1, class191 arg2) {
        if (arg0 > -73) {
            field884 = false;
        }
        if (arg2.method1350(class230.field4131, 116) != -1) {
            label62: while (true) {
                int var3 = arg2.method1350(class250.field4440, 109);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1350(class89.field1450, 107);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1350(class253.field4474, 109);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1350(class242.field4326, 116);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1350(class260.field4587, 118);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1350(class263.field4650, 119);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class191 var9 = class26.field385;
                                                        if (class128.field2116 != null) {
                                                            var9 = class268.method1835(-30159, class128.field2116.field1358);
                                                            try {
                                                                if (class128.field2116.field1360 != null) {
                                                                    byte[] var10 = ((String) class128.field2116.field1360).getBytes("ISO-8859-1");
                                                                    var9 = class76.method491(var10.length, var10, 0, -1);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class228.method1629(new class191[] { arg2.method1330(0, 61, var8), var9, arg2.method1315(var8 + 4, (byte) 88) }, (byte) -122);
                                                    }
                                                }
                                                arg2 = class228.method1629(new class191[] { arg2.method1330(0, 103, var7), class115.method730((byte) 41, class111.method714(false, 4, arg1)), arg2.method1315(var7 + 2, (byte) 30) }, (byte) -126);
                                            }
                                        }
                                        arg2 = class228.method1629(new class191[] { arg2.method1330(0, -77, var6), class115.method730((byte) 41, class111.method714(false, 3, arg1)), arg2.method1315(var6 + 2, (byte) 54) }, (byte) -20);
                                    }
                                }
                                arg2 = class228.method1629(new class191[] { arg2.method1330(0, -70, var5), class115.method730((byte) 41, class111.method714(false, 2, arg1)), arg2.method1315(var5 + 2, (byte) 115) }, (byte) -73);
                            }
                        }
                        arg2 = class228.method1629(new class191[] { arg2.method1330(0, -120, var4), class115.method730((byte) 41, class111.method714(false, 1, arg1)), arg2.method1315(var4 + 2, (byte) 81) }, (byte) -24);
                    }
                }
                arg2 = class228.method1629(new class191[] { arg2.method1330(0, 84, var3), class115.method730((byte) 41, class111.method714(false, 0, arg1)), arg2.method1315(var3 + 2, (byte) 60) }, (byte) -5);
            }
        }
        field882++;
        return arg2;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public final void method331(int arg0) {
        if (arg0 > -121) {
            return;
        }
        this.field876 = 0;
        this.field893 = 12800;
        field873++;
        this.field895 = 12800;
        this.field880 = 0;
        for (class217 var2 = (class217) this.field872.method1173(70); var2 != null; var2 = (class217) this.field872.method1175(-1)) {
            if (var2.field3819 < this.field893) {
                this.field893 = var2.field3819;
            }
            if (this.field880 < var2.field3827) {
                this.field880 = var2.field3827;
            }
            if (var2.field3829 < this.field895) {
                this.field895 = var2.field3829;
            }
            if (this.field876 < var2.field3817) {
                this.field876 = var2.field3817;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)Lfk;")
    public static final class241 method332(int arg0) {
        field886++;
        int var1 = -57 / ((21 - arg0) / 48);
        class241 var2 = (class241) class200.field3577.method19(-1);
        if (var2 != null) {
            var2.method655(63);
            var2.method1124(0);
            return var2;
        }
        class241 var3;
        do {
            var3 = (class241) class252.field4471.method19(-1);
            if (var3 == null) {
                return null;
            }
            if (var3.method1690((byte) -127) > class27.method198((byte) -124)) {
                return null;
            }
            var3.method655(63);
            var3.method1124(0);
        } while ((var3.field2825 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILeg;)V")
    public static final void method333(int arg0, class33 arg1) {
        field891++;
        class33 var2 = class261.method1796(101, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class190.field3337;
            var4 = class200.field3584;
        } else {
            var3 = var2.field561;
            var4 = var2.field537;
        }
        if (arg0 > 29) {
            class52.method355(var3, false, arg1, var4, -73);
            class23.method170(var4, arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Le;Le;IIIZ)V")
    public class49(class191 arg0, class191 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field883 = arg0;
        this.field896 = arg4;
        this.field892 = arg5;
        this.field870 = arg2;
        this.field887 = arg3;
        this.field878 = arg1;
        this.field872 = new class175();
    }
}
