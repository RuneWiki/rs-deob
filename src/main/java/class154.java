import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class154 {

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Lfc;")
    private class174 field2226 = new class174(64);

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Lfc;")
    public class174 field2229 = new class174(50);

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "Lod;")
    public class356 field2231 = new class356(250);

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "Luc;")
    private class23 field2232 = new class23();

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "Lka;")
    private class334 field2233;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Loi;")
    private class53 field2219;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Loi;")
    public class53 field2211;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
    private boolean field2215;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2236;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2235;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
    public static int[] field2214 = new int[1000];

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lfc;")
    public static class174 field2220 = new class174(8);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public int field2234;

    static {
        new class530("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        new class530(" days.", " Tage.", " jours.", " dias.");
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 8)
    public final void method985(int arg0) {
        class174 var2 = this.field2226;
        synchronized (this.field2226) {
            this.field2226.method1095(arg0 ^ arg0);
        }
        field2227++;
        class174 var3 = this.field2229;
        synchronized (this.field2229) {
            this.field2229.method1095(0);
        }
        class356 var4 = this.field2231;
        synchronized (this.field2231) {
            this.field2231.method2104(15981);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lza;ZILza;IILla;IZIILjl;)Lo;", line = 29)
    public final class24 method986(class290 arg0, boolean arg1, int arg2, class290 arg3, int arg4, int arg5, class319 arg6, int arg7, boolean arg8, int arg9, int arg10, class181 arg11) {
        field2210++;
        class24 var13 = this.method992(arg7, arg9, arg0, arg4, arg2, -103, arg11, arg5);
        if (var13 != null) {
            return var13;
        }
        class395 var14 = this.method993(arg4, true);
        if (arg7 > 1 && var14.field5545 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg7 >= var14.field5568[var16] && var14.field5568[var16] != 0) {
                    var15 = var14.field5545[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method993(var15, true);
            }
        }
        int[] var17 = var14.method2294(arg7, arg1, arg9, arg3, arg2, arg5, arg6, -65, arg0, arg11);
        if (var17 == null) {
            return null;
        } else if (arg10 > -125) {
            return null;
        } else {
            class24 var18;
            if (arg8) {
                var18 = arg3.method344(var17, 0, 36, 36, 32);
            } else {
                var18 = arg0.method344(var17, 0, 36, 36, 32);
            }
            if (!arg8) {
                class23 var19 = new class23();
                var19.field291 = arg11 != null;
                var19.field300 = arg9;
                var19.field299 = arg0.field4237;
                var19.field296 = arg7;
                var19.field294 = arg4;
                var19.field293 = arg2;
                var19.field298 = arg5;
                this.field2231.method2108(var18, var19, (byte) 91);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 97)
    public final void method987(byte arg0) {
        if (arg0 <= 78) {
            return;
        }
        class356 var2 = this.field2231;
        synchronized (this.field2231) {
            this.field2231.method2099(-121);
        }
        field2228++;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 110)
    public final void method988(byte arg0) {
        if (arg0 != 27) {
            return;
        }
        class174 var2 = this.field2226;
        synchronized (this.field2226) {
            this.field2226.method1096((byte) 115);
        }
        field2225++;
        class174 var3 = this.field2229;
        synchronized (this.field2229) {
            this.field2229.method1096((byte) 126);
        }
        class356 var4 = this.field2231;
        synchronized (this.field2231) {
            this.field2231.method2099(arg0 + 78);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V", line = 132)
    public final void method989(int arg0, byte arg1) {
        if (arg1 != -35) {
            this.field2219 = null;
        }
        this.field2234 = arg0;
        field2216++;
        class174 var3 = this.field2229;
        synchronized (this.field2229) {
            this.field2229.method1096((byte) -14);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V", line = 147)
    public static final void method990(int arg0, int arg1) {
        if (arg0 >= -63) {
            return;
        }
        if (arg1 == 37) {
            class245.field3555 = 3.0F;
        } else if (arg1 == 50) {
            class245.field3555 = 4.0F;
        } else if (arg1 == 75) {
            class245.field3555 = 6.0F;
        } else if (arg1 == 100) {
            class245.field3555 = 8.0F;
        } else if (arg1 == 200) {
            class245.field3555 = 16.0F;
        }
        class409.field5787 = -1;
        field2230++;
        class409.field5787 = -1;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V", line = 187)
    public static void method991(int arg0) {
        if (arg0 != 10) {
            field2214 = null;
        }
        field2220 = null;
        field2214 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILza;IIILjl;I)Lo;", line = 198)
    public final class24 method992(int arg0, int arg1, class290 arg2, int arg3, int arg4, int arg5, class181 arg6, int arg7) {
        this.field2232.field298 = arg7;
        field2213++;
        this.field2232.field291 = arg6 != null;
        this.field2232.field294 = arg3;
        this.field2232.field293 = arg4;
        int var9 = 91 / ((-arg5 - 50) / 45);
        this.field2232.field296 = arg0;
        this.field2232.field300 = arg1;
        this.field2232.field299 = arg2.field4237;
        return (class24) this.field2231.method2110(true, this.field2232);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)Ljw;", line = 216)
    public final class395 method993(int arg0, boolean arg1) {
        field2224++;
        class174 var3 = this.field2226;
        class395 var4;
        synchronized (this.field2226) {
            var4 = (class395) this.field2226.method1088((long) arg0, (byte) -114);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field2219;
        byte[] var6;
        synchronized (this.field2219) {
            var6 = this.field2219.method426(class260.method1664(arg0, (byte) 87), (byte) 9, class399.method2314(arg0, 255));
            if (!arg1) {
                this.field2231 = null;
            }
        }
        class395 var7 = new class395();
        var7.field5615 = arg0;
        var7.field5595 = this;
        var7.field5594 = new String[] { null, null, class218.field3158.method3116(this.field2212, (byte) 106), null, null };
        var7.field5592 = new String[] { null, null, null, null, class126.field1703.method3116(this.field2212, (byte) 125) };
        if (var6 != null) {
            var7.method2284(new class403(var6), -124);
        }
        var7.method2291((byte) -93);
        if (var7.field5602 != -1) {
            var7.method2289(this.method993(var7.field5578, true), this.method993(var7.field5602, arg1), 1);
        }
        if (var7.field5600 != -1) {
            var7.method2292(this.method993(var7.field5600, arg1), this.method993(var7.field5577, arg1), 28);
        }
        if (!this.field2215 && var7.field5583) {
            var7.field5587 = class6.field107.method3116(this.field2212, (byte) 105);
            var7.field5540 = false;
            var7.field5569 = 0;
            var7.field5534 = null;
            var7.field5594 = this.field2236;
            var7.field5592 = this.field2235;
            if (var7.field5593 != null) {
                boolean var8 = false;
                for (class498 var9 = var7.field5593.method2414((byte) -127); var9 != null; var9 = var7.field5593.method2410((byte) 105)) {
                    class412 var10 = this.field2233.method1995(12, (int) var9.field7060);
                    if (var10.field5818) {
                        var9.method2891(107);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field5593 = null;
                }
            }
        }
        class174 var11 = this.field2226;
        synchronized (this.field2226) {
            this.field2226.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V", line = 297)
    public final void method994(int arg0, int arg1) {
        field2221++;
        class174 var3 = this.field2226;
        synchronized (this.field2226) {
            this.field2226.method1087(1, arg0);
        }
        class174 var4 = this.field2229;
        synchronized (this.field2229) {
            this.field2229.method1087(1, arg0);
        }
        class356 var5 = this.field2231;
        synchronized (this.field2231) {
            this.field2231.method2103(arg0, (byte) 127);
        }
        if (arg1 != -16964) {
            this.field2211 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lle;IZLka;Loi;Loi;)V", line = 422)
    public class154(class205 arg0, int arg1, boolean arg2, class334 arg3, class53 arg4, class53 arg5) {
        this.field2233 = arg3;
        this.field2212 = arg1;
        this.field2219 = arg4;
        this.field2211 = arg5;
        this.field2215 = arg2;
        if (this.field2219 == null) {
            this.field2223 = 0;
        } else {
            int var7 = this.field2219.method434(26154) - 1;
            this.field2223 = var7 * 256 + this.field2219.method435(var7, 0);
        }
        this.field2236 = new String[] { null, null, class218.field3158.method3116(this.field2212, (byte) 102), null, null };
        this.field2235 = new String[] { null, null, null, null, class126.field1703.method3116(this.field2212, (byte) 114) };
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z[BILjava/lang/String;)I", line = 324)
    public static final int method995(boolean arg0, byte[] arg1, int arg2, String arg3) {
        field2222++;
        int var4 = arg3.length();
        int var5 = arg2;
        if (!arg0) {
            method995(true, null, 114, null);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg3.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg1[var5++] = (byte) (class170.method1067(var7, 920632) >> 12);
                arg1[var5++] = (byte) class170.method1067(128, class239.method1507(63, var7 >> 6));
                arg1[var5++] = (byte) class170.method1067(128, class239.method1507(var7, 63));
            } else {
                arg1[var5++] = (byte) class170.method1067(var7 >> 6, 192);
                arg1[var5++] = (byte) class170.method1067(128, class239.method1507(var7, 63));
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZ)V", line = 377)
    public final void method996(byte arg0, boolean arg1) {
        if (arg0 >= -53) {
            return;
        }
        field2217++;
        if (arg1 != this.field2215) {
            this.field2215 = arg1;
            this.method988((byte) 27);
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V", line = 398)
    public final void method997(byte arg0) {
        field2218++;
        class174 var2 = this.field2229;
        synchronized (this.field2229) {
            this.field2229.method1096((byte) -115);
            if (arg0 != -95) {
                this.method994(43, -45);
            }
        }
    }
}
