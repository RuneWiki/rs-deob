import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class53 extends class235 {

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field905 = 0;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Loa;")
    private class276 field909 = new class276(16);

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    private int field916 = 0;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Lrg;")
    private class84 field913 = new class84();

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "J")
    private long field917 = 0L;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "Lob;")
    private class117 field889;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
    private boolean field912;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Lrg;")
    private class84 field914;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Z")
    private boolean field918;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lff;")
    private class269 field884;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lob;")
    private class117 field888;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lti;")
    private class155 field901;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "Lui;")
    private class44 field903;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Lne;")
    public static class137 field887 = new class137(64);

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Lda;")
    public static class275 field908 = class255.method1672(124, "Lade Liste der Welten");

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lda;")
    public static class275 field911 = class255.method1672(118, "Hierhin gehen");

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lda;")
    public static class275 field910 = class255.method1672(105, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lp;")
    private class125 field886;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Z")
    private boolean field915;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[B")
    private byte[] field902;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)V")
    public static final void method330(byte arg0, int arg1) {
        field898++;
        if (arg0 > 91) {
            class171.field2981.method988(arg1, -124);
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)I")
    public final int method331(byte arg0) {
        field899++;
        if (this.method336((byte) 0) == null) {
            return this.field903 == null ? 0 : this.field903.method260(true);
        } else if (arg0 == 6) {
            return 100;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)I")
    public final int method332(boolean arg0) {
        if (!arg0) {
            this.field888 = null;
        }
        field895++;
        return this.field905;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public final void method333(boolean arg0) {
        field897++;
        if (this.field914 == null || this.method336((byte) 0) == null) {
            return;
        }
        for (class103 var2 = this.field913.method550(-38); var2 != null; var2 = this.field913.method545(104)) {
            int var3 = (int) var2.field1707;
            if (var3 < 0 || var3 >= this.field886.field2249 || this.field886.field2225[var3] == 0) {
                var2.method741(3);
            } else {
                if (this.field902[var3] == 0) {
                    this.method334(108, 1, var3);
                }
                if (this.field902[var3] == -1) {
                    this.method334(83, 2, var3);
                }
                if (this.field902[var3] == 1) {
                    var2.method741(3);
                }
            }
        }
        if (arg0) {
            this.field914 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)Lui;")
    private final class44 method334(int arg0, int arg1, int arg2) {
        field885++;
        class44 var4 = (class44) this.field909.method1871(0, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field741 && var4.field748) {
            var4.method741(3);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field889 == null || this.field902[arg2] == -1) {
                    if (this.field884.method1777(true)) {
                        return null;
                    }
                    var4 = this.field884.method1765(arg2, (byte) 2, true, this.field894, 1);
                } else {
                    var4 = this.field901.method1097(arg2, this.field889, 89);
                }
            } else if (arg1 == 1) {
                if (this.field889 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field901.method1100(3, this.field889, arg2);
            } else if (arg1 == 2) {
                if (this.field889 == null) {
                    throw new RuntimeException();
                }
                if (this.field902[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field884.method1767(-119)) {
                    return null;
                }
                var4 = this.field884.method1765(arg2, (byte) 2, false, this.field894, 1);
            } else {
                throw new RuntimeException();
            }
            this.field909.method1867(true, (long) arg2, var4);
        }
        if (var4.field748) {
            return null;
        }
        int var5 = -25 % ((-arg0 - 57) / 33);
        byte[] var6 = var4.method264(4055);
        if (!var4 instanceof class52) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class276.field4809.reset();
                class276.field4809.update(var6, 0, var6.length - 2);
                int var7 = (int) class276.field4809.getValue();
                if (this.field886.field2243[arg2] != var7) {
                    throw new RuntimeException();
                }
                this.field884.field4687 = 0;
                this.field884.field4684 = 0;
            } catch (RuntimeException var13) {
                this.field884.method1772(0);
                var4.method741(3);
                if (var4.field741 && !this.field884.method1777(true)) {
                    class201 var8 = this.field884.method1765(arg2, (byte) 2, true, this.field894, 1);
                    this.field909.method1867(true, (long) arg2, var8);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field886.field2227[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field886.field2227[arg2];
            if (this.field889 != null) {
                this.field901.method1096(var6, -3, this.field889, arg2);
                if (this.field902[arg2] != 1) {
                    this.field905++;
                    this.field902[arg2] = 1;
                }
            }
            if (!var4.field741) {
                var4.method741(3);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class276.field4809.reset();
            class276.field4809.update(var6, 0, var6.length - 2);
            int var9 = (int) class276.field4809.getValue();
            if (this.field886.field2243[arg2] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field886.field2227[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field902[arg2] != 1) {
                this.field905++;
                this.field902[arg2] = 1;
            }
            if (!var4.field741) {
                var4.method741(3);
            }
            return var4;
        } catch (Exception var12) {
            this.field902[arg2] = -1;
            var4.method741(3);
            if (var4.field741 && !this.field884.method1777(true)) {
                class201 var11 = this.field884.method1765(arg2, (byte) 2, true, this.field894, 1);
                this.field909.method1867(true, (long) arg2, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method335(int arg0) {
        field911 = null;
        field908 = null;
        field887 = null;
        if (arg0 != 0) {
            method341(-57, (Component) null);
        }
        field910 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)Lp;")
    public final class125 method336(byte arg0) {
        field906++;
        if (arg0 != 0) {
            return null;
        } else if (this.field886 == null) {
            if (this.field903 == null) {
                if (this.field884.method1777(true)) {
                    return null;
                }
                this.field903 = this.field884.method1765(this.field894, (byte) 0, true, 255, 1);
            }
            if (this.field903.field748) {
                return null;
            }
            byte[] var2 = this.field903.method264(4055);
            if (this.field903 instanceof class52) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field886 = new class125(var2, this.field892);
                    if (this.field886.field2240 != this.field896) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field886 = null;
                    if (this.field884.method1777(true)) {
                        this.field903 = null;
                    } else {
                        this.field903 = this.field884.method1765(this.field894, (byte) 0, true, 255, 1);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field886 = new class125(var2, this.field892);
                } catch (RuntimeException var4) {
                    this.field884.method1772(arg0);
                    this.field886 = null;
                    if (this.field884.method1777(true)) {
                        this.field903 = null;
                    } else {
                        this.field903 = this.field884.method1765(this.field894, (byte) 0, true, 255, 1);
                    }
                    return null;
                }
                if (this.field888 != null) {
                    this.field901.method1096(var2, -3, this.field888, this.field894);
                }
            }
            if (this.field889 != null) {
                this.field902 = new byte[this.field886.field2249];
                this.field905 = 0;
            }
            this.field903 = null;
            return this.field886;
        } else {
            return this.field886;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)V")
    public final void method337(int arg0, byte arg1) {
        if (arg1 != 48) {
            this.method338(false);
        }
        field882++;
        if (this.field889 == null) {
            return;
        }
        for (class103 var3 = this.field913.method550(-103); var3 != null; var3 = this.field913.method545(104)) {
            if (((long) arg0) == var3.field1707) {
                return;
            }
        }
        class103 var4 = new class103();
        var4.field1707 = (long) arg0;
        this.field913.method547(104, var4);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V")
    public final void method338(boolean arg0) {
        field907++;
        if (this.field914 != null) {
            if (this.method336((byte) 0) == null) {
                return;
            }
            if (this.field912) {
                boolean var6 = true;
                for (class103 var7 = this.field914.method550(-108); var7 != null; var7 = this.field914.method545(104)) {
                    int var9 = (int) var7.field1707;
                    if (this.field902[var9] == 0) {
                        this.method334(45, 1, var9);
                    }
                    if (this.field902[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method741(3);
                    }
                }
                while (this.field916 < this.field886.field2225.length) {
                    if (this.field886.field2225[this.field916] == 0) {
                        this.field916++;
                    } else {
                        if (this.field901.field2708 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field902[this.field916] == 0) {
                            this.method334(-12, 1, this.field916);
                        }
                        if (this.field902[this.field916] == 0) {
                            var6 = false;
                            class103 var8 = new class103();
                            var8.field1707 = (long) this.field916;
                            this.field914.method547(104, var8);
                        }
                        this.field916++;
                    }
                }
                if (var6) {
                    this.field916 = 0;
                    this.field912 = false;
                }
            } else if (this.field915) {
                boolean var2 = true;
                for (class103 var3 = this.field914.method550(-35); var3 != null; var3 = this.field914.method545(104)) {
                    int var5 = (int) var3.field1707;
                    if (this.field902[var5] != 1) {
                        this.method334(-109, 2, var5);
                    }
                    if (this.field902[var5] == 1) {
                        var3.method741(3);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field886.field2225.length > this.field916) {
                    if (this.field886.field2225[this.field916] == 0) {
                        this.field916++;
                    } else {
                        if (this.field884.method1767(-81)) {
                            var2 = false;
                            break;
                        }
                        if (this.field902[this.field916] != 1) {
                            this.method334(42, 2, this.field916);
                        }
                        if (this.field902[this.field916] != 1) {
                            var2 = false;
                            class103 var4 = new class103();
                            var4.field1707 = (long) this.field916;
                            this.field914.method547(104, var4);
                        }
                        this.field916++;
                    }
                }
                if (var2) {
                    this.field916 = 0;
                    this.field915 = false;
                }
            } else {
                this.field914 = null;
            }
        }
        if (arg0) {
            field911 = null;
        }
        if (!this.field918 || class121.method888((byte) -119) < this.field917) {
            return;
        }
        for (class44 var10 = (class44) this.field909.method1864((byte) -109); var10 != null; var10 = (class44) this.field909.method1869(-1)) {
            if (!var10.field748) {
                if (var10.field743) {
                    if (!var10.field741) {
                        throw new RuntimeException();
                    }
                    var10.method741(3);
                } else {
                    var10.field743 = true;
                }
            }
        }
        this.field917 = class121.method888((byte) -119) + 1000L;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public final int method339(int arg0, int arg1) {
        field904++;
        if (arg1 < 87) {
            return -31;
        } else {
            class44 var3 = (class44) this.field909.method1871(0, (long) arg0);
            return var3 == null ? 0 : var3.method260(true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[B")
    public final byte[] method340(byte arg0, int arg1) {
        field881++;
        class44 var3 = this.method334(-124, 0, arg1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method264(4055);
        if (arg0 != -34) {
            this.field913 = null;
        }
        var3.method741(3);
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method341(int arg0, Component arg1) {
        arg1.addMouseListener(class108.field1869);
        field880++;
        arg1.addMouseMotionListener(class108.field1869);
        arg1.addFocusListener(class108.field1869);
        if (arg0 <= 83) {
            field911 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)I")
    public final int method342(int arg0) {
        if (arg0 != 0) {
            this.method342(126);
        }
        field890++;
        return this.field886 == null ? 0 : this.field886.field2242;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILfd;)V")
    public static final void method343(int arg0, class229 arg1) {
        field883++;
        int var2 = arg1.field3886;
        if (var2 == 324) {
            if (class142.field2502 == -1) {
                class142.field2502 = arg1.field3969;
                class14.field215 = arg1.field3908;
            }
            if (class269.field4675.field4063) {
                arg1.field3969 = class142.field2502;
            } else {
                arg1.field3969 = class14.field215;
            }
            return;
        }
        if (arg0 <= 116) {
            field908 = null;
        }
        if (var2 == 325) {
            if (class142.field2502 == -1) {
                class142.field2502 = arg1.field3969;
                class14.field215 = arg1.field3908;
            }
            if (class269.field4675.field4063) {
                arg1.field3969 = class14.field215;
            } else {
                arg1.field3969 = class142.field2502;
            }
        } else if (var2 == 327) {
            arg1.field3940 = 150;
            arg1.field3932 = (int) (Math.sin((double) class35.field576 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4023 = -1;
            arg1.field3902 = 5;
        } else if (var2 == 328) {
            if (class66.field1094.field1910 == null) {
                arg1.field4023 = 0;
            } else {
                arg1.field3940 = 150;
                arg1.field3932 = (int) (Math.sin((double) class35.field576 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3902 = 5;
                arg1.field4023 = ((int) class66.field1094.field1910.method1833(0) << 11) + 2047;
                arg1.field3867 = class66.field1094.field1788;
                arg1.field3863 = class66.field1094.field1746;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public final void method344(int arg0) {
        field900++;
        if (this.field889 != null) {
            this.field915 = true;
            if (arg0 == 64 && this.field914 == null) {
                this.field914 = new class84();
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)I")
    public final int method345(byte arg0) {
        field893++;
        if (this.field886 == null) {
            return 0;
        } else if (this.field912) {
            class103 var2 = this.field914.method550(-116);
            if (arg0 != 90) {
                this.method344(34);
            }
            return var2 == null ? 0 : (int) var2.field1707;
        } else {
            return this.field886.field2242;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(ILob;Lob;Lff;Lti;IIZ)V")
    public class53(int arg0, class117 arg1, class117 arg2, class269 arg3, class155 arg4, int arg5, int arg6, boolean arg7) {
        this.field894 = arg0;
        this.field889 = arg1;
        if (this.field889 == null) {
            this.field912 = false;
        } else {
            this.field912 = true;
            this.field914 = new class84();
        }
        this.field918 = arg7;
        this.field896 = arg6;
        this.field884 = arg3;
        this.field888 = arg2;
        this.field901 = arg4;
        this.field892 = arg5;
        if (this.field888 != null) {
            this.field903 = this.field901.method1097(this.field894, this.field888, -103);
        }
    }
}
