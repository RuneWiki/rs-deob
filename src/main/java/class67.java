import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class67 extends class71 {

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lgd;")
    public static class206 field906 = new class206("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "Lmc;")
    public static class78 field909 = new class78(34, -1);

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "B")
    public byte field905;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lku;")
    public static class232 field913;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "Lbt;")
    public class32 field908;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field907;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIZ)V", line = 8)
    public static final void method442(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field902;
        if (arg5) {
            class280.method1583((byte) 123);
        }
        if (class94.field1398 != null && (~arg4 != -4 || class488.field6789.field6677 != arg1 || ~class488.field6789.field6693 != ~arg2)) {
            class233.method1305(class94.field1398, 90, class251.field3359);
            class94.field1398 = null;
        }
        if (arg4 == 3 && class94.field1398 == null) {
            class94.field1398 = class268.method1523(arg2, 17187, 0, class251.field3359, arg1, 0);
            if (class94.field1398 != null) {
                class488.field6789.field6693 = arg2;
                class488.field6789.field6677 = arg1;
                class488.field6789.method2417(126, class251.field3359);
            }
        }
        if (arg4 == 3 && class94.field1398 == null) {
            method442(false, -1, -1, arg3, class488.field6789.field6695, true);
        } else {
            Container var6;
            if (class94.field1398 != null) {
                class383.field5274 = arg1;
                class152.field2139 = arg2;
                var6 = class94.field1398;
            } else if (class492.field6883 != null) {
                Insets var7 = class492.field6883.getInsets();
                int var10001 = var7.right + var7.left;
                class383.field5274 = class492.field6883.getSize().width - var10001;
                class152.field2139 = class492.field6883.getSize().height + -var7.bottom + -var7.top;
                var6 = class492.field6883;
            } else {
                var6 = class251.field3359.field3209;
                class383.field5274 = var6.getSize().width;
                class152.field2139 = var6.getSize().height;
            }
            if (~arg4 != -2) {
                if (~class428.field5792 > -97 && ~class222.field2958 == -1) {
                    int var8 = ~class383.field5274 < -1025 ? 1024 : class383.field5274;
                    class424.field5738 = var8;
                    int var9 = ~class152.field2139 >= -769 ? class152.field2139 : 768;
                    class178.field2416 = (-var8 + class383.field5274) / 2;
                    class145.field2091 = 0;
                    class72.field986 = var9;
                } else {
                    class424.field5738 = class383.field5274;
                    class178.field2416 = 0;
                    class72.field986 = class152.field2139;
                    class145.field2091 = 0;
                }
            } else {
                class178.field2416 = (-class153.field2153 + class383.field5274) / 2;
                class424.field5738 = class153.field2153;
                class72.field986 = class431.field5877;
                class145.field2091 = 0;
            }
            if (class377.field5197 != class278.field3682) {
                boolean var10000;
                if (class424.field5738 < 1024 && class72.field986 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg5) {
                class28.field378.setSize(class424.field5738, class72.field986);
                if (class98.field1432 != null) {
                    class98.field1432.method1988();
                }
                if (class492.field6883 == var6) {
                    Insets var10 = class492.field6883.getInsets();
                    class28.field378.setLocation(class178.field2416 + var10.left, class145.field2091 + var10.top);
                } else {
                    class28.field378.setLocation(class178.field2416, class145.field2091);
                }
            } else {
                class107.method664(class222.field2958, (byte) 127);
            }
            if (arg4 >= 2) {
                class94.field1388 = true;
            } else {
                class94.field1388 = false;
            }
            if (class196.field2674 != -1) {
                class73.method479(false, true);
            }
            if (!arg0) {
                if (class280.field3743 != null && (~class18.field258 == -31 || class18.field258 == 25)) {
                    class369.method2281((byte) 118);
                }
                for (int var11 = 0; var11 < 100; ++var11) {
                    class102.field1468[var11] = true;
                }
                class251.field3346 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZBIZ)Lr;", line = 161)
    public static final class110 method443(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        ++field914;
        class213 var5 = null;
        if (class206.field2794 != null) {
            var5 = new class213(arg3, class206.field2794, class481.field6648[arg3], 1000000);
        }
        class80.field1074[arg3] = class194.field2625.method1792(arg3, class200.field2713, 0, var5);
        if (arg2 > -79) {
            field911 = 74;
        }
        if (arg1) {
            class80.field1074[arg3].method2515(0);
        }
        return new class110(class80.field1074[arg3], arg4, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 184)
    public static final void method444(int arg0, String arg1) {
        ++field912;
        if (class68.field928 != null) {
            if (arg0 == -20345) {
                ++class433.field5899;
                class491.method2861(class341.field4571, 1);
                class203.field2751.method228(class231.method1292((byte) 3, arg1), arg0 + 20377);
                class203.field2751.method208(arg1, arg0 + 20235);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V", line = 202)
    public static void method445(int arg0) {
        field913 = null;
        field906 = null;
        field909 = null;
        field907 = null;
        if (arg0 != 768) {
            method445(20);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnk;)Ljava/lang/String;", line = 215)
    public static final String method446(int arg0, class464 arg1) {
        ++field901;
        if (client.method1046(arg1).method1256((byte) -122) == 0) {
            return null;
        } else if (arg0 != -17504) {
            return null;
        } else if (arg1.field6327 != null && arg1.field6327.trim().length() != 0) {
            return arg1.field6327;
        } else {
            return class200.field2704 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)[B", line = 239)
    public final byte[] method447(byte arg0) {
        if (arg0 > -118) {
            return null;
        } else {
            ++field904;
            if (!super.field973 && this.field908.field456 >= this.field908.field472.length + -this.field905) {
                return this.field908.field472;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I", line = 258)
    public final int method448(int arg0) {
        if (arg0 != 64) {
            field911 = -44;
        }
        ++field910;
        return this.field908 == null ? 0 : this.field908.field456 * 100 / (this.field908.field472.length + -this.field905);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 274)
    public static final void method449(int arg0) {
        ++field900;
        if (!class437.field5931) {
            class77.method512(class109.field1637, (byte) 18);
            if (arg0 != 2) {
                field906 = null;
            }
            if (class308.field4077 != null) {
                class77.method512(class308.field4077, (byte) 18);
            }
            class437.field5931 = true;
        }
    }
}
